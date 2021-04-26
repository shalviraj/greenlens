package p005b.p096l.p097a.p151d.p152a.p154b;

/* renamed from: b.l.a.d.a.b.o0 */
public final /* synthetic */ class C3527o0 implements C3548u0 {

    /* renamed from: a */
    public final C3551v0 f6500a;

    /* renamed from: b */
    public final int f6501b;

    /* renamed from: c */
    public final /* synthetic */ int f6502c = 0;

    public C3527o0(C3551v0 v0Var, int i) {
        this.f6500a = v0Var;
        this.f6501b = i;
    }

    public C3527o0(C3551v0 v0Var, int i, byte[] bArr) {
        this.f6500a = v0Var;
        this.f6501b = i;
    }

    /* renamed from: a */
    public final Object mo14793a() {
        if (this.f6502c != 0) {
            this.f6500a.mo14844c(this.f6501b).f6554c.f6541c = 5;
            return null;
        }
        C3551v0 v0Var = this.f6500a;
        int i = this.f6501b;
        C3542s0 c = v0Var.mo14844c(i);
        if (C3484d1.m6659e(c.f6554c.f6541c)) {
            C3544t tVar = v0Var.f6582a;
            C3539r0 r0Var = c.f6554c;
            String str = r0Var.f6539a;
            int i2 = c.f6553b;
            long j = r0Var.f6540b;
            if (tVar.mo14818e(str, i2, j).exists()) {
                C3544t.m6741h(tVar.mo14818e(str, i2, j));
            }
            C3539r0 r0Var2 = c.f6554c;
            int i3 = r0Var2.f6541c;
            if (i3 == 5 || i3 == 6) {
                C3544t tVar2 = v0Var.f6582a;
                String str2 = r0Var2.f6539a;
                int i4 = c.f6553b;
                long j2 = r0Var2.f6540b;
                if (tVar2.mo14823k(str2, i4, j2).exists()) {
                    C3544t.m6741h(tVar2.mo14823k(str2, i4, j2));
                }
            }
            return null;
        }
        throw new C3495g0(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }
}
