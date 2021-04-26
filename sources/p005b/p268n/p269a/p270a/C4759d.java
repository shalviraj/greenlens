package p005b.p268n.p269a.p270a;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p080i.p081a.C1422f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: b.n.a.a.d */
public final class C4759d implements C1115w<C1422f> {

    /* renamed from: g */
    public final C1422f f9109g;

    /* renamed from: h */
    public final int f9110h;

    /* renamed from: i */
    public final int f9111i;

    /* renamed from: j */
    public final int f9112j;

    public C4759d(@NonNull C1422f fVar, @IntRange(from = 1) int i, @IntRange(from = 1) int i2, @IntRange(from = 0) int i3) {
        C1960d.m2734N(fVar);
        this.f9109g = fVar;
        this.f9110h = i;
        this.f9111i = i2;
        this.f9112j = i3;
    }

    /* renamed from: a */
    public int mo11004a() {
        return this.f9112j;
    }

    @NonNull
    /* renamed from: b */
    public Class<C1422f> mo11005b() {
        return C1422f.class;
    }

    @NonNull
    public Object get() {
        return this.f9109g;
    }

    public void recycle() {
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("SvgResource{width=");
        u.append(this.f9110h);
        u.append(", height=");
        u.append(this.f9111i);
        u.append(", size=");
        u.append(this.f9112j);
        u.append('}');
        return u.toString();
    }
}
