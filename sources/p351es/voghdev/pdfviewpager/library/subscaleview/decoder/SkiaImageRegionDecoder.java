package p351es.voghdev.pdfviewpager.library.subscaleview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;
import p364h.p365a.p366a.p367a.p370e.p371g.C6992d;

/* renamed from: es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaImageRegionDecoder */
public class SkiaImageRegionDecoder implements C6992d {

    /* renamed from: a */
    public BitmapRegionDecoder f13930a;

    /* renamed from: b */
    public final ReadWriteLock f13931b = new ReentrantReadWriteLock(true);

    /* renamed from: c */
    public final Bitmap.Config f13932c;

    @Keep
    public SkiaImageRegionDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        this.f13932c = preferredBitmapConfig == null ? Bitmap.Config.RGB_565 : preferredBitmapConfig;
    }

    /* renamed from: a */
    public synchronized boolean mo24299a() {
        BitmapRegionDecoder bitmapRegionDecoder;
        bitmapRegionDecoder = this.f13930a;
        return bitmapRegionDecoder != null && !bitmapRegionDecoder.isRecycled();
    }

    @NonNull
    /* renamed from: b */
    public Bitmap mo24300b(@NonNull Rect rect, int i) {
        mo24302d().lock();
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.f13930a;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i;
            options.inPreferredConfig = this.f13932c;
            Bitmap decodeRegion = this.f13930a.decodeRegion(rect, options);
            if (decodeRegion != null) {
                return decodeRegion;
            }
            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
        } finally {
            mo24302d().unlock();
        }
    }

    @NonNull
    /* renamed from: c */
    public Point mo24301c(Context context, @NonNull Uri uri) {
        BitmapRegionDecoder bitmapRegionDecoder;
        InputStream inputStream;
        int i;
        String uri2 = uri.toString();
        if (uri2.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size != 2 || !pathSegments.get(0).equals("drawable")) {
                if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                    }
                }
                i = 0;
            } else {
                i = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            }
            inputStream = context.getResources().openRawResource(i);
        } else if (uri2.startsWith("file:///android_asset/")) {
            inputStream = context.getAssets().open(uri2.substring(22), 1);
        } else if (uri2.startsWith("file://")) {
            bitmapRegionDecoder = BitmapRegionDecoder.newInstance(uri2.substring(7), false);
            this.f13930a = bitmapRegionDecoder;
            return new Point(this.f13930a.getWidth(), this.f13930a.getHeight());
        } else {
            InputStream inputStream2 = null;
            try {
                inputStream2 = context.getContentResolver().openInputStream(uri);
                this.f13930a = BitmapRegionDecoder.newInstance(inputStream2, false);
                return new Point(this.f13930a.getWidth(), this.f13930a.getHeight());
            } finally {
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        bitmapRegionDecoder = BitmapRegionDecoder.newInstance(inputStream, false);
        this.f13930a = bitmapRegionDecoder;
        return new Point(this.f13930a.getWidth(), this.f13930a.getHeight());
    }

    /* renamed from: d */
    public final Lock mo24302d() {
        return this.f13931b.readLock();
    }

    public synchronized void recycle() {
        this.f13931b.writeLock().lock();
        try {
            this.f13930a.recycle();
            this.f13930a = null;
        } finally {
            this.f13931b.writeLock().unlock();
        }
    }
}
