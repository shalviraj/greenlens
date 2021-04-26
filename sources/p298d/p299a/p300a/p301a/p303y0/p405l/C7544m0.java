package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.m0 */
public final class C7544m0 {
    /* renamed from: a */
    public static final C7481g1 m13699a(C7481g1 g1Var, boolean z) {
        C6888i.m12438e(g1Var, "<this>");
        C7553o h0 = C7553o.m13710h0(g1Var, z);
        if (h0 != null) {
            return h0;
        }
        C7489j0 c = m13701c(g1Var);
        return c == null ? g1Var.mo23545Z(false) : c;
    }

    /* renamed from: b */
    public static /* synthetic */ C7481g1 m13700b(C7481g1 g1Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m13699a(g1Var, z);
    }

    /* renamed from: c */
    public static final C7489j0 m13701c(C7452c0 c0Var) {
        C7443a0 a0Var;
        C7567t0 V = c0Var.mo24887V();
        C7443a0 a0Var2 = V instanceof C7443a0 ? (C7443a0) V : null;
        if (a0Var2 == null) {
            return null;
        }
        LinkedHashSet<C7452c0> linkedHashSet = a0Var2.f14859b;
        ArrayList arrayList = new ArrayList(C5266a.m9892V(linkedHashSet, 10));
        boolean z = false;
        for (C7452c0 next : linkedHashSet) {
            if (C7460d1.m13441g(next)) {
                next = m13700b(next.mo25056Y(), false, 1);
                z = true;
            }
            arrayList.add(next);
        }
        if (!z) {
            a0Var = null;
        } else {
            C7452c0 c0Var2 = a0Var2.f14858a;
            if (c0Var2 == null) {
                c0Var2 = null;
            } else if (C7460d1.m13441g(c0Var2)) {
                c0Var2 = m13700b(c0Var2.mo25056Y(), false, 1);
            }
            C6888i.m12438e(arrayList, "typesToIntersect");
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            a0Var = new C7443a0(linkedHashSet2);
            a0Var.f14858a = c0Var2;
        }
        if (a0Var == null) {
            return null;
        }
        return a0Var.mo25041b();
    }

    /* renamed from: d */
    public static final C7489j0 m13702d(C7489j0 j0Var, boolean z) {
        C6888i.m12438e(j0Var, "<this>");
        C7553o h0 = C7553o.m13710h0(j0Var, z);
        if (h0 != null) {
            return h0;
        }
        C7489j0 c = m13701c(j0Var);
        return c == null ? j0Var.mo23545Z(false) : c;
    }

    /* renamed from: e */
    public static final C7489j0 m13703e(C7489j0 j0Var, C7489j0 j0Var2) {
        C6888i.m12438e(j0Var, "<this>");
        C6888i.m12438e(j0Var2, "abbreviatedType");
        return C5266a.m10046v2(j0Var) ? j0Var : new C7442a(j0Var, j0Var2);
    }
}
