package p005b.p096l.p232f.p241d0.p242e;

/* renamed from: b.l.f.d0.e.d */
public final class C4558d {

    /* renamed from: a */
    public final int f8512a;

    /* renamed from: b */
    public final int f8513b;

    /* renamed from: c */
    public final int f8514c;

    /* renamed from: d */
    public final int f8515d;

    /* renamed from: e */
    public int f8516e = -1;

    public C4558d(int i, int i2, int i3, int i4) {
        this.f8512a = i;
        this.f8513b = i2;
        this.f8514c = i3;
        this.f8515d = i4;
    }

    /* renamed from: a */
    public boolean mo16211a() {
        int i = this.f8516e;
        return i != -1 && this.f8514c == (i % 3) * 3;
    }

    /* renamed from: b */
    public void mo16212b() {
        this.f8516e = (this.f8514c / 3) + ((this.f8515d / 30) * 3);
    }

    public String toString() {
        return this.f8516e + "|" + this.f8515d;
    }
}
