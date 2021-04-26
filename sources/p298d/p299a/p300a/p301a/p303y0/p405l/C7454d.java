package p298d.p299a.p300a.p301a.p303y0.p405l;

import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7532f;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7537k;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7540n;

/* renamed from: d.a.a.a.y0.l.d */
public final class C7454d {
    /* renamed from: a */
    public static final boolean m13424a(C7540n nVar, C7535i iVar, C7535i iVar2) {
        int b;
        if (nVar.mo25111b(iVar) == nVar.mo25111b(iVar2) && nVar.mo25113d(iVar) == nVar.mo25113d(iVar2)) {
            if ((nVar.mo25121s(iVar) == null) == (nVar.mo25121s(iVar2) == null) && nVar.mo25124v(nVar.mo25112c(iVar), nVar.mo25112c(iVar2))) {
                if (!nVar.mo25122t(iVar, iVar2) && (b = nVar.mo25111b(iVar)) > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        C7537k j = nVar.mo25116j(iVar, i);
                        C7537k j2 = nVar.mo25116j(iVar2, i);
                        if (nVar.mo25119q(j) != nVar.mo25119q(j2)) {
                            return false;
                        }
                        if (!nVar.mo25119q(j) && (nVar.mo25117m(j) != nVar.mo25117m(j2) || !m13425b(nVar, nVar.mo25123u(j), nVar.mo25123u(j2)))) {
                            return false;
                        }
                        if (i2 >= b) {
                            break;
                        }
                        i = i2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m13425b(C7540n nVar, C7534h hVar, C7534h hVar2) {
        if (hVar == hVar2) {
            return true;
        }
        C7535i a = nVar.mo25110a(hVar);
        C7535i a2 = nVar.mo25110a(hVar2);
        if (a != null && a2 != null) {
            return m13424a(nVar, a, a2);
        }
        C7532f r = nVar.mo25120r(hVar);
        C7532f r2 = nVar.mo25120r(hVar2);
        if (r == null || r2 == null) {
            return false;
        }
        return m13424a(nVar, nVar.mo25125x(r), nVar.mo25125x(r2)) && m13424a(nVar, nVar.mo25115i(r), nVar.mo25115i(r2));
    }
}
