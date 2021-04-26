package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;

/* renamed from: b.h.a.m.x.c.q */
public class C1252q extends C1228f {

    /* renamed from: b */
    public static final byte[] f1543b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(C0974m.f1018a);

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f1543b);
    }

    /* renamed from: c */
    public Bitmap mo10373c(@NonNull C1025d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        return C1265z.m1263b(dVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C1252q;
    }

    public int hashCode() {
        return 1572326941;
    }
}
