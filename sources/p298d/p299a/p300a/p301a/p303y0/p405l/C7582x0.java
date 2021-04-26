package p298d.p299a.p300a.p301a.p303y0.p405l;

/* renamed from: d.a.a.a.y0.l.x0 */
public abstract class C7582x0 implements C7580w0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7580w0)) {
            return false;
        }
        C7580w0 w0Var = (C7580w0) obj;
        return mo25163c() == w0Var.mo25163c() && mo25162b() == w0Var.mo25162b() && mo25161a().equals(w0Var.mo25161a());
    }

    public int hashCode() {
        int hashCode = mo25162b().hashCode() * 31;
        if (C7460d1.m13450p(mo25161a())) {
            return hashCode + 19;
        }
        return hashCode + (mo25163c() ? 17 : mo25161a().hashCode());
    }

    public String toString() {
        if (mo25163c()) {
            return "*";
        }
        if (mo25162b() == C7484h1.INVARIANT) {
            return mo25161a().toString();
        }
        return mo25162b() + " " + mo25161a();
    }
}
