package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;

/* renamed from: b.h.a.m.x.c.j */
public class C1232j extends C1228f {

    /* renamed from: b */
    public static final byte[] f1511b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(C0974m.f1018a);

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f1511b);
    }

    /* renamed from: c */
    public Bitmap mo10373c(@NonNull C1025d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        Paint paint = C1265z.f1573a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return C1265z.m1263b(dVar, bitmap, i, i2);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof C1232j;
    }

    public int hashCode() {
        return -670243078;
    }
}
