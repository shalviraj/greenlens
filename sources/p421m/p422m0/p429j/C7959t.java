package p421m.p422m0.p429j;

import p298d.p344x.p346c.C6888i;

/* renamed from: m.m0.j.t */
public final class C7959t {

    /* renamed from: a */
    public int f15981a;

    /* renamed from: b */
    public final int[] f15982b = new int[10];

    /* renamed from: a */
    public final int mo25749a() {
        if ((this.f15981a & 128) != 0) {
            return this.f15982b[7];
        }
        return 65535;
    }

    /* renamed from: b */
    public final void mo25750b(C7959t tVar) {
        C6888i.m12438e(tVar, "other");
        for (int i = 0; i < 10; i++) {
            boolean z = true;
            if (((1 << i) & tVar.f15981a) == 0) {
                z = false;
            }
            if (z) {
                mo25751c(i, tVar.f15982b[i]);
            }
        }
    }

    /* renamed from: c */
    public final C7959t mo25751c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f15982b;
            if (i < iArr.length) {
                this.f15981a = (1 << i) | this.f15981a;
                iArr[i] = i2;
            }
        }
        return this;
    }
}
