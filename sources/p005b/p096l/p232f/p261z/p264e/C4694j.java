package p005b.p096l.p232f.p261z.p264e;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import p005b.p096l.p232f.C4612f;

/* renamed from: b.l.f.z.e.j */
public class C4694j {

    /* renamed from: i */
    public static C4694j[] f8931i = {new C4694j(false, 3, 5, 8, 8, 1), new C4694j(false, 5, 7, 10, 10, 1), new C4694j(true, 5, 7, 16, 6, 1), new C4694j(false, 8, 10, 12, 12, 1), new C4694j(true, 10, 11, 14, 6, 2), new C4694j(false, 12, 12, 14, 14, 1), new C4694j(true, 16, 14, 24, 10, 1), new C4694j(false, 18, 14, 16, 16, 1), new C4694j(false, 22, 18, 18, 18, 1), new C4694j(true, 22, 18, 16, 10, 2), new C4694j(false, 30, 20, 20, 20, 1), new C4694j(true, 32, 24, 16, 14, 2), new C4694j(false, 36, 24, 22, 22, 1), new C4694j(false, 44, 28, 24, 24, 1), new C4694j(true, 49, 28, 22, 14, 2), new C4694j(false, 62, 36, 14, 14, 4), new C4694j(false, 86, 42, 16, 16, 4), new C4694j(false, 114, 48, 18, 18, 4), new C4694j(false, 144, 56, 20, 20, 4), new C4694j(false, 174, 68, 22, 22, 4), new C4694j(false, 204, 84, 24, 24, 4, 102, 42), new C4694j(false, 280, 112, 14, 14, 16, 140, 56), new C4694j(false, 368, 144, 16, 16, 16, 92, 36), new C4694j(false, 456, 192, 18, 18, 16, 114, 48), new C4694j(false, 576, 224, 20, 20, 16, 144, 56), new C4694j(false, 696, 272, 22, 22, 16, 174, 68), new C4694j(false, 816, 336, 24, 24, 16, 136, 56), new C4694j(false, 1050, 408, 18, 18, 36, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 68), new C4694j(false, 1304, 496, 20, 20, 36, 163, 62), new C4688d()};

    /* renamed from: a */
    public final boolean f8932a;

    /* renamed from: b */
    public final int f8933b;

    /* renamed from: c */
    public final int f8934c;

    /* renamed from: d */
    public final int f8935d;

    /* renamed from: e */
    public final int f8936e;

    /* renamed from: f */
    public final int f8937f;

    /* renamed from: g */
    public final int f8938g;

    /* renamed from: h */
    public final int f8939h;

    public C4694j(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    public C4694j(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f8932a = z;
        this.f8933b = i;
        this.f8934c = i2;
        this.f8935d = i3;
        this.f8936e = i4;
        this.f8937f = i5;
        this.f8938g = i6;
        this.f8939h = i7;
    }

    /* renamed from: i */
    public static C4694j m8644i(int i, C4695k kVar, C4612f fVar, C4612f fVar2, boolean z) {
        for (C4694j jVar : f8931i) {
            if ((kVar != C4695k.FORCE_SQUARE || !jVar.f8932a) && ((kVar != C4695k.FORCE_RECTANGLE || jVar.f8932a) && ((fVar == null || (jVar.mo16392g() >= 0 && jVar.mo16391f() >= 0)) && ((fVar2 == null || (jVar.mo16392g() <= 0 && jVar.mo16391f() <= 0)) && i <= jVar.f8933b)))) {
                return jVar;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public int mo16376a(int i) {
        return this.f8938g;
    }

    /* renamed from: b */
    public final int mo16388b() {
        int i = this.f8937f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: c */
    public int mo16377c() {
        return this.f8933b / this.f8938g;
    }

    /* renamed from: d */
    public final int mo16389d() {
        return mo16393h() * this.f8936e;
    }

    /* renamed from: e */
    public final int mo16390e() {
        return mo16388b() * this.f8935d;
    }

    /* renamed from: f */
    public final int mo16391f() {
        return mo16389d() + (mo16393h() << 1);
    }

    /* renamed from: g */
    public final int mo16392g() {
        return mo16390e() + (mo16388b() << 1);
    }

    /* renamed from: h */
    public final int mo16393h() {
        int i = this.f8937f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8932a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f8935d);
        sb.append('x');
        sb.append(this.f8936e);
        sb.append(", symbol size ");
        sb.append(mo16392g());
        sb.append('x');
        sb.append(mo16391f());
        sb.append(", symbol data size ");
        sb.append(mo16390e());
        sb.append('x');
        sb.append(mo16389d());
        sb.append(", codewords ");
        sb.append(this.f8933b);
        sb.append('+');
        sb.append(this.f8934c);
        return sb.toString();
    }
}
