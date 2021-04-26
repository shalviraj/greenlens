package p435n;

import p298d.p344x.p346c.C6888i;

/* renamed from: n.k */
public abstract class C8048k implements C8030a0 {

    /* renamed from: g */
    public final C8030a0 f16151g;

    public C8048k(C8030a0 a0Var) {
        C6888i.m12438e(a0Var, "delegate");
        this.f16151g = a0Var;
    }

    /* renamed from: T */
    public long mo17031T(C8040e eVar, long j) {
        C6888i.m12438e(eVar, "sink");
        return this.f16151g.mo17031T(eVar, j);
    }

    public void close() {
        this.f16151g.close();
    }

    /* renamed from: f */
    public C8034b0 mo17035f() {
        return this.f16151g.mo17035f();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f16151g + ')';
    }
}
