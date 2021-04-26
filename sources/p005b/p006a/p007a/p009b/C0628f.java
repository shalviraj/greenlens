package p005b.p006a.p007a.p009b;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;
import p005b.p051h.p052a.p055m.p064x.p065c.C1228f;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.a.a.b.f */
public final class C0628f extends C1228f {

    /* renamed from: d */
    public static final byte[] f289d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(C0974m.f1018a);

    /* renamed from: e */
    public static final Set<String> f290e;

    /* renamed from: f */
    public static final Lock f291f;

    /* renamed from: b */
    public float f292b;

    /* renamed from: c */
    public float[] f293c;

    /* renamed from: b.a.a.b.f$a */
    public static final class C0629a implements Lock {
        public void lock() {
        }

        public void lockInterruptibly() {
        }

        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, @NonNull TimeUnit timeUnit) {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f290e = hashSet;
        f291f = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new C0629a();
    }

    public C0628f(float f) {
        C0823f.m366e(f > 0.0f, "commonRadius must be greater than 0.");
        this.f292b = f;
    }

    public C0628f(float[] fArr) {
        this.f293c = fArr;
    }

    /* renamed from: d */
    public static Bitmap m93d(@NonNull C1025d dVar, @NonNull Bitmap bitmap) {
        Bitmap.Config e = m94e(bitmap);
        if (e.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d = dVar.mo10895d(bitmap.getWidth(), bitmap.getHeight(), e);
        new Canvas(d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d;
    }

    /* renamed from: e */
    public static Bitmap.Config m94e(@NonNull Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        float f;
        ByteBuffer byteBuffer;
        messageDigest.update(f289d);
        if (this.f293c != null) {
            byteBuffer = ByteBuffer.allocate(4);
            f = this.f293c[0];
        } else {
            byteBuffer = ByteBuffer.allocate(4);
            f = this.f292b;
        }
        messageDigest.update(byteBuffer.putFloat(f).array());
    }

    /* renamed from: c */
    public Bitmap mo10373c(@NonNull C1025d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2;
        float[] fArr = this.f293c;
        if (fArr != null) {
            Bitmap.Config e = m94e(bitmap);
            Bitmap d = m93d(dVar, bitmap);
            bitmap2 = dVar.mo10895d(d.getWidth(), d.getHeight(), e);
            bitmap2.setHasAlpha(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(d, tileMode, tileMode);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight());
            Lock lock = f291f;
            lock.lock();
            try {
                Canvas canvas = new Canvas(bitmap2);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                Path path = new Path();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
                canvas.setBitmap((Bitmap) null);
                lock.unlock();
                if (!d.equals(bitmap)) {
                    dVar.mo10896e(d);
                }
            } catch (Throwable th) {
                f291f.unlock();
                throw th;
            }
        } else {
            float f = this.f292b;
            C0823f.m366e(f > 0.0f, "roundingRadius must be greater than 0.");
            Bitmap.Config e2 = m94e(bitmap);
            Bitmap d2 = m93d(dVar, bitmap);
            bitmap2 = dVar.mo10895d(d2.getWidth(), d2.getHeight(), e2);
            bitmap2.setHasAlpha(true);
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(d2, tileMode2, tileMode2);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setShader(bitmapShader2);
            RectF rectF2 = new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight());
            Lock lock2 = f291f;
            lock2.lock();
            try {
                Canvas canvas2 = new Canvas(bitmap2);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas2.drawRoundRect(rectF2, f, f, paint2);
                canvas2.setBitmap((Bitmap) null);
                lock2.unlock();
                if (!d2.equals(bitmap)) {
                    dVar.mo10896e(d2);
                }
            } catch (Throwable th2) {
                f291f.unlock();
                throw th2;
            }
        }
        return bitmap2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0628f)) {
            return false;
        }
        C0628f fVar = (C0628f) obj;
        float[] fArr = this.f293c;
        if (fArr != null) {
            if (fArr != fVar.f293c) {
                return false;
            }
        } else if (this.f292b != fVar.f292b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        float[] fArr = this.f293c;
        return (C1380j.m1473f(fArr != null ? fArr[0] : this.f292b) * 31) - 569625254;
    }
}
