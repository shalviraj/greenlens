package p005b.p268n.p269a.p270a.p271e;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p080i.p081a.C1422f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p268n.p269a.p270a.C4759d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: b.n.a.a.e.h */
public abstract class C4767h<T> implements C0981r<T, C1422f> {
    /* renamed from: c */
    public static int[] m8743c(@NonNull C1422f fVar, int i, int i2) {
        int[] iArr = {i, i2};
        if (i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE) {
            iArr[0] = Math.round(fVar.mo11298d());
            iArr[1] = Math.round(fVar.mo11297c());
        } else if (i == Integer.MIN_VALUE) {
            iArr[0] = Math.round(fVar.mo11295a() * ((float) i2));
        } else if (i2 == Integer.MIN_VALUE) {
            iArr[1] = Math.round(((float) i) / fVar.mo11295a());
        }
        return iArr;
    }

    @Nullable
    /* renamed from: a */
    public C1115w<C1422f> mo10836a(@NonNull T t, int i, int i2, @NonNull C0979p pVar) {
        try {
            int d = mo16485d(t);
            C1422f e = mo16486e(t, i, i2, pVar);
            C1960d.m2734N(e);
            int[] c = m8743c(e, i, i2);
            return new C4759d(e, c[0], c[1], d);
        } catch (C4768i e2) {
            throw new IOException("Cannot load SVG", e2);
        }
    }

    /* renamed from: b */
    public boolean mo10837b(@NonNull T t, @NonNull C0979p pVar) {
        return true;
    }

    @IntRange(from = 0)
    /* renamed from: d */
    public abstract int mo16485d(@NonNull T t);

    /* renamed from: e */
    public abstract C1422f mo16486e(@NonNull T t, int i, int i2, @NonNull C0979p pVar);
}
