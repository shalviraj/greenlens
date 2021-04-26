package p005b.p280p.p285b.p286a0.p287j;

/* renamed from: b.p.b.a0.j.t */
public final class C5177t {

    /* renamed from: a */
    public int f10120a;

    /* renamed from: b */
    public int f10121b;

    /* renamed from: c */
    public int f10122c;

    /* renamed from: d */
    public final int[] f10123d = new int[10];

    /* renamed from: a */
    public int mo17062a(int i) {
        boolean z = true;
        int i2 = 1 << i;
        int i3 = (this.f10122c & i2) != 0 ? 2 : 0;
        if ((i2 & this.f10121b) == 0) {
            z = false;
        }
        return z ? i3 | 1 : i3;
    }

    /* renamed from: b */
    public int mo17063b(int i) {
        return (this.f10120a & 128) != 0 ? this.f10123d[7] : i;
    }

    /* renamed from: c */
    public boolean mo17064c(int i) {
        return ((1 << i) & this.f10120a) != 0;
    }

    /* renamed from: d */
    public C5177t mo17065d(int i, int i2, int i3) {
        int[] iArr = this.f10123d;
        if (i >= iArr.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f10120a |= i4;
        this.f10121b = (i2 & 1) != 0 ? this.f10121b | i4 : this.f10121b & (~i4);
        this.f10122c = (i2 & 2) != 0 ? this.f10122c | i4 : this.f10122c & (~i4);
        iArr[i] = i3;
        return this;
    }
}
