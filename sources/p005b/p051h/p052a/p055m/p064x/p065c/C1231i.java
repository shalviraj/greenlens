package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;

/* renamed from: b.h.a.m.x.c.i */
public class C1231i extends C1228f {

    /* renamed from: b */
    public static final byte[] f1510b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(C0974m.f1018a);

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f1510b);
    }

    /* renamed from: c */
    public Bitmap mo10373c(@NonNull C1025d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        Paint paint = C1265z.f1573a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap d = dVar.mo10895d(i, i2, C1265z.m1264c(bitmap));
        d.setHasAlpha(bitmap.hasAlpha());
        C1265z.m1262a(bitmap, d, matrix);
        return d;
    }

    public boolean equals(Object obj) {
        return obj instanceof C1231i;
    }

    public int hashCode() {
        return -599754482;
    }
}
