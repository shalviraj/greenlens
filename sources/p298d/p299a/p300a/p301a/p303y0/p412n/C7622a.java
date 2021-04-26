package p298d.p299a.p300a.p301a.p303y0.p412n;

import p298d.p344x.p345b.C6862l;

/* renamed from: d.a.a.a.y0.n.a */
public final class C7622a extends C7623b<N, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ C6862l f15109a;

    /* renamed from: b */
    public final /* synthetic */ boolean[] f15110b;

    public C7622a(C6862l lVar, boolean[] zArr) {
        this.f15109a = lVar;
        this.f15110b = zArr;
    }

    public boolean beforeChildren(N n) {
        if (((Boolean) this.f15109a.invoke(n)).booleanValue()) {
            this.f15110b[0] = true;
        }
        return !this.f15110b[0];
    }

    public Object result() {
        return Boolean.valueOf(this.f15110b[0]);
    }
}
