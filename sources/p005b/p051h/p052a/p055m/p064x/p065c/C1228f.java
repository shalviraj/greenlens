package p005b.p051h.p052a.p055m.p064x.p065c;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.m.x.c.f */
public abstract class C1228f implements C0983t<Bitmap> {
    @NonNull
    /* renamed from: a */
    public final C1115w<Bitmap> mo10828a(@NonNull Context context, @NonNull C1115w<Bitmap> wVar, int i, int i2) {
        if (C1380j.m1477j(i, i2)) {
            C1025d dVar = C0929c.m652b(context).f839g;
            Bitmap bitmap = wVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo10373c(dVar, bitmap, i, i2);
            return bitmap.equals(c) ? wVar : C1227e.m1168c(c, dVar);
        }
        throw new IllegalArgumentException(C0843a.m447h("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }

    /* renamed from: c */
    public abstract Bitmap mo10373c(@NonNull C1025d dVar, @NonNull Bitmap bitmap, int i, int i2);
}
