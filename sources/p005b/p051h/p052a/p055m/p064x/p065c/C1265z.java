package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;

/* renamed from: b.h.a.m.x.c.z */
public final class C1265z {

    /* renamed from: a */
    public static final Paint f1573a = new Paint(6);

    /* renamed from: b */
    public static final Paint f1574b;

    /* renamed from: c */
    public static final Set<String> f1575c;

    /* renamed from: d */
    public static final Lock f1576d;

    /* renamed from: b.h.a.m.x.c.z$a */
    public static final class C1266a implements Lock {
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
        new Paint(7);
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f1575c = hashSet;
        f1576d = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new C1266a();
        Paint paint = new Paint(7);
        f1574b = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m1262a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        Lock lock = f1576d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f1573a);
            canvas.setBitmap((Bitmap) null);
            lock.unlock();
        } catch (Throwable th) {
            f1576d.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m1263b(@NonNull C1025d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap d = dVar.mo10895d((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m1264c(bitmap));
        d.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + d.getWidth() + "x" + d.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m1262a(bitmap, d, matrix);
        return d;
    }

    @NonNull
    /* renamed from: c */
    public static Bitmap.Config m1264c(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }
}
