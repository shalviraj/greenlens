package p005b.p096l.p232f.p241d0.p245g;

/* renamed from: b.l.f.d0.g.b */
public final class C4571b {

    /* renamed from: a */
    public final byte[] f8552a;

    /* renamed from: b */
    public int f8553b = 0;

    public C4571b(int i) {
        this.f8552a = new byte[i];
    }

    /* renamed from: a */
    public void mo16238a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f8553b;
            this.f8553b = i3 + 1;
            this.f8552a[i3] = z ? (byte) 1 : 0;
        }
    }
}
