package p005b.p051h.p052a.p055m.p058v.p059c0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.m.v.c0.j */
public class C1034j implements C1025d {

    /* renamed from: j */
    public static final Bitmap.Config f1104j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final C1037k f1105a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f1106b;

    /* renamed from: c */
    public final C1035a f1107c;

    /* renamed from: d */
    public long f1108d;

    /* renamed from: e */
    public long f1109e;

    /* renamed from: f */
    public int f1110f;

    /* renamed from: g */
    public int f1111g;

    /* renamed from: h */
    public int f1112h;

    /* renamed from: i */
    public int f1113i;

    /* renamed from: b.h.a.m.v.c0.j$a */
    public interface C1035a {
    }

    /* renamed from: b.h.a.m.v.c0.j$b */
    public static final class C1036b implements C1035a {
    }

    public C1034j(long j) {
        C1039m mVar = new C1039m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f1108d = j;
        this.f1105a = mVar;
        this.f1106b = unmodifiableSet;
        this.f1107c = new C1036b();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo10892a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            mo10915i(0);
        } else if (i >= 20 || i == 15) {
            mo10915i(this.f1108d / 2);
        }
    }

    /* renamed from: b */
    public void mo10893b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        mo10915i(0);
    }

    @NonNull
    /* renamed from: c */
    public Bitmap mo10894c(int i, int i2, Bitmap.Config config) {
        Bitmap h = mo10914h(i, i2, config);
        if (h != null) {
            return h;
        }
        if (config == null) {
            config = f1104j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @NonNull
    /* renamed from: d */
    public Bitmap mo10895d(int i, int i2, Bitmap.Config config) {
        Bitmap h = mo10914h(i, i2, config);
        if (h != null) {
            h.eraseColor(0);
            return h;
        }
        if (config == null) {
            config = f1104j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: e */
    public synchronized void mo10896e(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        Objects.requireNonNull((C1039m) this.f1105a);
                        if (((long) C1380j.m1471d(bitmap)) <= this.f1108d) {
                            if (this.f1106b.contains(bitmap.getConfig())) {
                                Objects.requireNonNull((C1039m) this.f1105a);
                                int d = C1380j.m1471d(bitmap);
                                ((C1039m) this.f1105a).mo10920f(bitmap);
                                Objects.requireNonNull((C1036b) this.f1107c);
                                this.f1112h++;
                                this.f1109e += (long) d;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    Log.v("LruBitmapPool", "Put bitmap in pool=" + ((C1039m) this.f1105a).mo10919e(bitmap));
                                }
                                mo10912f();
                                mo10915i(this.f1108d);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((C1039m) this.f1105a).mo10919e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f1106b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: f */
    public final void mo10912f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            mo10913g();
        }
    }

    /* renamed from: g */
    public final void mo10913g() {
        StringBuilder u = C0843a.m460u("Hits=");
        u.append(this.f1110f);
        u.append(", misses=");
        u.append(this.f1111g);
        u.append(", puts=");
        u.append(this.f1112h);
        u.append(", evictions=");
        u.append(this.f1113i);
        u.append(", currentSize=");
        u.append(this.f1109e);
        u.append(", maxSize=");
        u.append(this.f1108d);
        u.append("\nStrategy=");
        u.append(this.f1105a);
        Log.v("LruBitmapPool", u.toString());
    }

    @Nullable
    /* renamed from: h */
    public final synchronized Bitmap mo10914h(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap b;
        if (Build.VERSION.SDK_INT >= 26) {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        }
        b = ((C1039m) this.f1105a).mo10917b(i, i2, config != null ? config : f1104j);
        if (b == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                Objects.requireNonNull((C1039m) this.f1105a);
                sb.append(C1039m.m881c(C1380j.m1470c(i, i2, config), config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f1111g++;
        } else {
            this.f1110f++;
            long j = this.f1109e;
            Objects.requireNonNull((C1039m) this.f1105a);
            this.f1109e = j - ((long) C1380j.m1471d(b));
            Objects.requireNonNull((C1036b) this.f1107c);
            b.setHasAlpha(true);
            b.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            Objects.requireNonNull((C1039m) this.f1105a);
            sb2.append(C1039m.m881c(C1380j.m1470c(i, i2, config), config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        mo10912f();
        return b;
    }

    /* renamed from: i */
    public final synchronized void mo10915i(long j) {
        while (this.f1109e > j) {
            C1039m mVar = (C1039m) this.f1105a;
            Bitmap c = mVar.f1120b.mo10899c();
            if (c != null) {
                mVar.mo10916a(Integer.valueOf(C1380j.m1471d(c)), c);
            }
            if (c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    mo10913g();
                }
                this.f1109e = 0;
                return;
            }
            Objects.requireNonNull((C1036b) this.f1107c);
            long j2 = this.f1109e;
            Objects.requireNonNull((C1039m) this.f1105a);
            this.f1109e = j2 - ((long) C1380j.m1471d(c));
            this.f1113i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((C1039m) this.f1105a).mo10919e(c));
            }
            mo10912f();
            c.recycle();
        }
    }
}
