package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.ArrayDeque;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7465f;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7491b;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7538l;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.c */
public final class C7451c {
    /* renamed from: a */
    public static final boolean m13412a(C7465f fVar, C7535i iVar, C7465f.C7466a aVar) {
        C6888i.m12438e(fVar, "<this>");
        C6888i.m12438e(iVar, "type");
        C6888i.m12438e(aVar, "supertypesPolicy");
        if (!((fVar.mo25075D(iVar) && !C5266a.m9779B2((C7491b) fVar, iVar)) || fVar.mo25076E(iVar))) {
            fVar.mo25074C();
            ArrayDeque<C7535i> arrayDeque = fVar.f14892c;
            C6888i.m12436c(arrayDeque);
            Set<C7535i> set = fVar.f14893d;
            C6888i.m12436c(set);
            arrayDeque.push(iVar);
            while (!arrayDeque.isEmpty()) {
                if (set.size() <= 1000) {
                    C7535i pop = arrayDeque.pop();
                    C6888i.m12437d(pop, "current");
                    if (set.add(pop)) {
                        C7491b bVar = (C7491b) fVar;
                        C7465f.C7466a aVar2 = C5266a.m9779B2(bVar, pop) ? C7465f.C7466a.C7469c.f14895a : aVar;
                        if (!(!C6888i.m12434a(aVar2, C7465f.C7466a.C7469c.f14895a))) {
                            aVar2 = null;
                        }
                        if (aVar2 == null) {
                            continue;
                        } else {
                            for (C7534h a : bVar.mo25109W(C5266a.m9823I4(bVar, pop))) {
                                C7535i a2 = aVar2.mo25087a(fVar, a);
                                if ((fVar.mo25075D(a2) && !C5266a.m9779B2(bVar, a2)) || fVar.mo25076E(a2)) {
                                    fVar.mo25072A();
                                } else {
                                    arrayDeque.add(a2);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    StringBuilder A = C0843a.m425A("Too many supertypes for type: ", iVar, ". Supertypes = ");
                    A.append(C6790h.m12369w(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6862l) null, 63));
                    throw new IllegalStateException(A.toString().toString());
                }
            }
            fVar.mo25072A();
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m13413b(C7465f fVar, C7535i iVar, C7538l lVar) {
        C6888i.m12438e(fVar, "this");
        C6888i.m12438e(iVar, "receiver");
        C7491b bVar = (C7491b) fVar;
        if (C5266a.m9791D2(bVar, C5266a.m9829J4(fVar, iVar)) && !C5266a.m9797E2(bVar, iVar)) {
            return true;
        }
        if (C5266a.m9779B2(bVar, iVar)) {
            return false;
        }
        if (fVar.mo25079H()) {
            bVar.mo25107U(iVar);
        }
        return bVar.mo25124v(C5266a.m9823I4(bVar, iVar), lVar);
    }
}
