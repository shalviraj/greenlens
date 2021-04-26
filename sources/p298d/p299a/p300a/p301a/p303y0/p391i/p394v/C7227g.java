package p298d.p299a.p300a.p301a.p303y0.p391i.p394v;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.v.g */
public abstract class C7227g<T> {

    /* renamed from: a */
    public final T f14459a;

    public C7227g(T t) {
        this.f14459a = t;
    }

    /* renamed from: a */
    public abstract C7452c0 mo24893a(C6021a0 a0Var);

    /* renamed from: b */
    public T mo24898b() {
        return this.f14459a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            Object b = mo24898b();
            Object obj2 = null;
            C7227g gVar = obj instanceof C7227g ? (C7227g) obj : null;
            if (gVar != null) {
                obj2 = gVar.mo24898b();
            }
            return C6888i.m12434a(b, obj2);
        }
    }

    public int hashCode() {
        Object b = mo24898b();
        if (b == null) {
            return 0;
        }
        return b.hashCode();
    }

    public String toString() {
        return String.valueOf(mo24898b());
    }
}
