package p005b.p096l.p232f.p237c0.p238c0;

import p005b.p096l.p232f.C4625s;

/* renamed from: b.l.f.c0.c0.c */
public final class C4500c {

    /* renamed from: a */
    public final int f8384a;

    /* renamed from: b */
    public final int[] f8385b;

    /* renamed from: c */
    public final C4625s[] f8386c;

    public C4500c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f8384a = i;
        this.f8385b = iArr;
        float f = (float) i4;
        this.f8386c = new C4625s[]{new C4625s((float) i2, f), new C4625s((float) i3, f)};
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4500c) && this.f8384a == ((C4500c) obj).f8384a;
    }

    public int hashCode() {
        return this.f8384a;
    }
}
