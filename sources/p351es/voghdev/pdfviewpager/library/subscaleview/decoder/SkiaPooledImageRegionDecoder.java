package p351es.voghdev.pdfviewpager.library.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;
import p364h.p365a.p366a.p367a.p370e.p371g.C6992d;
import p364h.p365a.p366a.p367a.p370e.p371g.C6993e;

/* renamed from: es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder */
public class SkiaPooledImageRegionDecoder implements C6992d {

    /* renamed from: i */
    public static boolean f13933i = false;

    /* renamed from: a */
    public C6925a f13934a = new C6925a((C6993e) null);

    /* renamed from: b */
    public final ReadWriteLock f13935b = new ReentrantReadWriteLock(true);

    /* renamed from: c */
    public final Bitmap.Config f13936c;

    /* renamed from: d */
    public Context f13937d;

    /* renamed from: e */
    public Uri f13938e;

    /* renamed from: f */
    public long f13939f = RecyclerView.FOREVER_NS;

    /* renamed from: g */
    public final Point f13940g = new Point(0, 0);

    /* renamed from: h */
    public final AtomicBoolean f13941h = new AtomicBoolean(false);

    /* renamed from: es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder$a */
    public static class C6925a {

        /* renamed from: a */
        public final Semaphore f13942a = new Semaphore(0, true);

        /* renamed from: b */
        public final Map<BitmapRegionDecoder, Boolean> f13943b = new ConcurrentHashMap();

        public C6925a(C6993e eVar) {
        }

        /* renamed from: a */
        public static void m12531a(C6925a aVar, BitmapRegionDecoder bitmapRegionDecoder) {
            boolean z;
            synchronized (aVar) {
                Iterator<Map.Entry<BitmapRegionDecoder, Boolean>> it = aVar.f13943b.entrySet().iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry next = it.next();
                    if (bitmapRegionDecoder == next.getKey()) {
                        if (((Boolean) next.getValue()).booleanValue()) {
                            next.setValue(Boolean.FALSE);
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                aVar.f13942a.release();
            }
        }

        /* renamed from: b */
        public final BitmapRegionDecoder mo24306b() {
            BitmapRegionDecoder bitmapRegionDecoder;
            this.f13942a.acquireUninterruptibly();
            synchronized (this) {
                Iterator<Map.Entry<BitmapRegionDecoder, Boolean>> it = this.f13943b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bitmapRegionDecoder = null;
                        break;
                    }
                    Map.Entry next = it.next();
                    if (!((Boolean) next.getValue()).booleanValue()) {
                        next.setValue(Boolean.TRUE);
                        bitmapRegionDecoder = (BitmapRegionDecoder) next.getKey();
                        break;
                    }
                }
            }
            return bitmapRegionDecoder;
        }
    }

    @Keep
    public SkiaPooledImageRegionDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        this.f13936c = preferredBitmapConfig == null ? Bitmap.Config.RGB_565 : preferredBitmapConfig;
    }

    @Keep
    public static void setDebug(boolean z) {
        f13933i = z;
    }

    /* renamed from: a */
    public synchronized boolean mo24299a() {
        boolean z;
        boolean isEmpty;
        C6925a aVar = this.f13934a;
        if (aVar != null) {
            synchronized (aVar) {
                isEmpty = aVar.f13943b.isEmpty();
            }
            if (!isEmpty) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @NonNull
    /* renamed from: b */
    public Bitmap mo24300b(@NonNull Rect rect, int i) {
        BitmapRegionDecoder b;
        mo24304d("Decode region " + rect + " on thread " + Thread.currentThread().getName());
        if ((rect.width() < this.f13940g.x || rect.height() < this.f13940g.y) && this.f13941h.compareAndSet(false, true) && this.f13939f < RecyclerView.FOREVER_NS) {
            mo24304d("Starting lazy init of additional decoders");
            new C6993e(this).start();
        }
        this.f13935b.readLock().lock();
        try {
            C6925a aVar = this.f13934a;
            if (aVar != null) {
                b = aVar.mo24306b();
                if (b != null) {
                    if (!b.isRecycled()) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = i;
                        options.inPreferredConfig = this.f13936c;
                        Bitmap decodeRegion = b.decodeRegion(rect, options);
                        if (decodeRegion != null) {
                            C6925a.m12531a(this.f13934a, b);
                            this.f13935b.readLock().unlock();
                            return decodeRegion;
                        }
                        throw new RuntimeException("null bitmap - image format may not be supported");
                    }
                }
                if (b != null) {
                    C6925a.m12531a(this.f13934a, b);
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        } catch (Throwable th) {
            this.f13935b.readLock().unlock();
            throw th;
        }
    }

    @NonNull
    /* renamed from: c */
    public Point mo24301c(Context context, @NonNull Uri uri) {
        this.f13937d = context;
        this.f13938e = uri;
        mo24305e();
        return this.f13940g;
    }

    /* renamed from: d */
    public final void mo24304d(String str) {
        if (f13933i) {
            Log.d("SkiaPooledImageRegionDecoder", str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013e, code lost:
        r10.f13935b.writeLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0147, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0121 A[Catch:{ all -> 0x013d }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24305e() {
        /*
            r10 = this;
            android.net.Uri r0 = r10.f13938e
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "android.resource://"
            boolean r1 = r0.startsWith(r1)
            r2 = 1
            r3 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L_0x0093
            android.net.Uri r0 = r10.f13938e
            java.lang.String r0 = r0.getAuthority()
            android.content.Context r1 = r10.f13937d
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x002e
            android.content.Context r1 = r10.f13937d
            android.content.res.Resources r1 = r1.getResources()
            goto L_0x0038
        L_0x002e:
            android.content.Context r1 = r10.f13937d
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.res.Resources r1 = r1.getResourcesForApplication(r0)
        L_0x0038:
            android.net.Uri r6 = r10.f13938e
            java.util.List r6 = r6.getPathSegments()
            int r7 = r6.size()
            r8 = 2
            if (r7 != r8) goto L_0x0060
            java.lang.Object r8 = r6.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "drawable"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0060
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = "drawable"
            int r0 = r1.getIdentifier(r2, r6, r0)
            goto L_0x007a
        L_0x0060:
            if (r7 != r2) goto L_0x0079
            java.lang.Object r0 = r6.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isDigitsOnly(r0)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r6.get(r3)     // Catch:{ NumberFormatException -> 0x0079 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x0079 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0079 }
            goto L_0x007a
        L_0x0079:
            r0 = r3
        L_0x007a:
            android.content.Context r1 = r10.f13937d     // Catch:{ Exception -> 0x0088 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x0088 }
            android.content.res.AssetFileDescriptor r1 = r1.openRawResourceFd(r0)     // Catch:{ Exception -> 0x0088 }
            long r4 = r1.getLength()     // Catch:{ Exception -> 0x0088 }
        L_0x0088:
            android.content.Context r1 = r10.f13937d
            android.content.res.Resources r1 = r1.getResources()
            java.io.InputStream r0 = r1.openRawResource(r0)
            goto L_0x00b9
        L_0x0093:
            java.lang.String r1 = "file:///android_asset/"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x00be
            r1 = 22
            java.lang.String r0 = r0.substring(r1)
            android.content.Context r1 = r10.f13937d     // Catch:{ Exception -> 0x00af }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ Exception -> 0x00af }
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r0)     // Catch:{ Exception -> 0x00af }
            long r4 = r1.getLength()     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            android.content.Context r1 = r10.f13937d
            android.content.res.AssetManager r1 = r1.getAssets()
            java.io.InputStream r0 = r1.open(r0, r2)
        L_0x00b9:
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r0, r3)
            goto L_0x0105
        L_0x00be:
            java.lang.String r1 = "file://"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x00e0
            r1 = 7
            java.lang.String r1 = r0.substring(r1)
            android.graphics.BitmapRegionDecoder r1 = android.graphics.BitmapRegionDecoder.newInstance(r1, r3)
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00de }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00de }
            boolean r0 = r2.exists()     // Catch:{ Exception -> 0x00de }
            if (r0 == 0) goto L_0x00de
            long r4 = r2.length()     // Catch:{ Exception -> 0x00de }
        L_0x00de:
            r0 = r1
            goto L_0x0105
        L_0x00e0:
            r0 = 0
            android.content.Context r1 = r10.f13937d     // Catch:{ all -> 0x0148 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x0148 }
            android.net.Uri r2 = r10.f13938e     // Catch:{ all -> 0x0148 }
            java.io.InputStream r0 = r1.openInputStream(r2)     // Catch:{ all -> 0x0148 }
            android.graphics.BitmapRegionDecoder r2 = android.graphics.BitmapRegionDecoder.newInstance(r0, r3)     // Catch:{ all -> 0x0148 }
            android.net.Uri r3 = r10.f13938e     // Catch:{ Exception -> 0x00ff }
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r1 = r1.openAssetFileDescriptor(r3, r6)     // Catch:{ Exception -> 0x00ff }
            if (r1 == 0) goto L_0x00ff
            long r4 = r1.getLength()     // Catch:{ Exception -> 0x00ff }
        L_0x00ff:
            if (r0 == 0) goto L_0x0104
            r0.close()     // Catch:{ Exception -> 0x0104 }
        L_0x0104:
            r0 = r2
        L_0x0105:
            r10.f13939f = r4
            android.graphics.Point r1 = r10.f13940g
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r1.set(r2, r3)
            java.util.concurrent.locks.ReadWriteLock r1 = r10.f13935b
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder$a r1 = r10.f13934a     // Catch:{ all -> 0x013d }
            if (r1 == 0) goto L_0x0133
            monitor-enter(r1)     // Catch:{ all -> 0x013d }
            java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean> r2 = r1.f13943b     // Catch:{ all -> 0x0130 }
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0130 }
            r2.put(r0, r3)     // Catch:{ all -> 0x0130 }
            java.util.concurrent.Semaphore r0 = r1.f13942a     // Catch:{ all -> 0x0130 }
            r0.release()     // Catch:{ all -> 0x0130 }
            monitor-exit(r1)     // Catch:{ all -> 0x013d }
            goto L_0x0133
        L_0x0130:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x0133:
            java.util.concurrent.locks.ReadWriteLock r0 = r10.f13935b
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return
        L_0x013d:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r10.f13935b
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
        L_0x0148:
            r1 = move-exception
            if (r0 == 0) goto L_0x014e
            r0.close()     // Catch:{ Exception -> 0x014e }
        L_0x014e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p351es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder.mo24305e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f13935b.writeLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void recycle() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.locks.ReadWriteLock r0 = r3.f13935b     // Catch:{ all -> 0x0046 }
            java.util.concurrent.locks.Lock r0 = r0.writeLock()     // Catch:{ all -> 0x0046 }
            r0.lock()     // Catch:{ all -> 0x0046 }
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder$a r0 = r3.f13934a     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0030
            monitor-enter(r0)     // Catch:{ all -> 0x003b }
        L_0x000f:
            java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean> r1 = r0.f13943b     // Catch:{ all -> 0x002d }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0024
            android.graphics.BitmapRegionDecoder r1 = r0.mo24306b()     // Catch:{ all -> 0x002d }
            r1.recycle()     // Catch:{ all -> 0x002d }
            java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean> r2 = r0.f13943b     // Catch:{ all -> 0x002d }
            r2.remove(r1)     // Catch:{ all -> 0x002d }
            goto L_0x000f
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            r0 = 0
            r3.f13934a = r0     // Catch:{ all -> 0x003b }
            r3.f13937d = r0     // Catch:{ all -> 0x003b }
            r3.f13938e = r0     // Catch:{ all -> 0x003b }
            goto L_0x0030
        L_0x002d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r1     // Catch:{ all -> 0x003b }
        L_0x0030:
            java.util.concurrent.locks.ReadWriteLock r0 = r3.f13935b     // Catch:{ all -> 0x0046 }
            java.util.concurrent.locks.Lock r0 = r0.writeLock()     // Catch:{ all -> 0x0046 }
            r0.unlock()     // Catch:{ all -> 0x0046 }
            monitor-exit(r3)
            return
        L_0x003b:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r3.f13935b     // Catch:{ all -> 0x0046 }
            java.util.concurrent.locks.Lock r1 = r1.writeLock()     // Catch:{ all -> 0x0046 }
            r1.unlock()     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p351es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder.recycle():void");
    }
}
