package p298d.p299a.p300a.p301a.p303y0.p400j.p401b;

import java.util.ArrayList;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6025b0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6611b;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6625d;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6636g;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6643i;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6654n;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6667q;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6677s;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6684u;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7095h;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7227g;
import p298d.p299a.p300a.p301a.p303y0.p400j.C7299a;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7407x;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.j.b.d */
public final class C7311d implements C7305c<C6055c, C7227g<?>> {

    /* renamed from: a */
    public final C7299a f14574a;

    /* renamed from: b */
    public final C7313e f14575b;

    public C7311d(C6021a0 a0Var, C6025b0 b0Var, C7299a aVar) {
        C6888i.m12438e(a0Var, "module");
        C6888i.m12438e(b0Var, "notFoundClasses");
        C6888i.m12438e(aVar, "protocol");
        this.f14574a = aVar;
        this.f14575b = new C7313e(a0Var, b0Var);
    }

    /* renamed from: a */
    public List<C6055c> mo23601a(C6677s sVar, C6705c cVar) {
        C6888i.m12438e(sVar, "proto");
        C6888i.m12438e(cVar, "nameResolver");
        Iterable<C6611b> iterable = (List) sVar.mo24681l(this.f14574a.f14552l);
        if (iterable == null) {
            iterable = C6798p.f13713g;
        }
        ArrayList arrayList = new ArrayList(C5266a.m9892V(iterable, 10));
        for (C6611b a : iterable) {
            arrayList.add(this.f14575b.mo24941a(a, cVar));
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<C6055c> mo23602b(C7407x xVar, C6654n nVar) {
        C6888i.m12438e(xVar, "container");
        C6888i.m12438e(nVar, "proto");
        return C6798p.f13713g;
    }

    /* renamed from: c */
    public List<C6055c> mo23603c(C7407x xVar, C7117p pVar, C7303b bVar) {
        C6888i.m12438e(xVar, "container");
        C6888i.m12438e(pVar, "proto");
        C6888i.m12438e(bVar, "kind");
        return C6798p.f13713g;
    }

    /* renamed from: d */
    public List<C6055c> mo23604d(C7407x xVar, C7117p pVar, C7303b bVar, int i, C6684u uVar) {
        C6888i.m12438e(xVar, "container");
        C6888i.m12438e(pVar, "callableProto");
        C6888i.m12438e(bVar, "kind");
        C6888i.m12438e(uVar, "proto");
        Iterable<C6611b> iterable = (List) uVar.mo24681l(this.f14574a.f14550j);
        if (iterable == null) {
            iterable = C6798p.f13713g;
        }
        ArrayList arrayList = new ArrayList(C5266a.m9892V(iterable, 10));
        for (C6611b a : iterable) {
            arrayList.add(this.f14575b.mo24941a(a, xVar.f14811a));
        }
        return arrayList;
    }

    /* renamed from: e */
    public List<C6055c> mo23605e(C7407x xVar, C6654n nVar) {
        C6888i.m12438e(xVar, "container");
        C6888i.m12438e(nVar, "proto");
        return C6798p.f13713g;
    }

    /* renamed from: f */
    public List<C6055c> mo23606f(C7407x.C7408a aVar) {
        C6888i.m12438e(aVar, "container");
        Iterable<C6611b> iterable = (List) aVar.f14814d.mo24681l(this.f14574a.f14543c);
        if (iterable == null) {
            iterable = C6798p.f13713g;
        }
        ArrayList arrayList = new ArrayList(C5266a.m9892V(iterable, 10));
        for (C6611b a : iterable) {
            arrayList.add(this.f14575b.mo24941a(a, aVar.f14811a));
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<C6055c> mo23607g(C6667q qVar, C6705c cVar) {
        C6888i.m12438e(qVar, "proto");
        C6888i.m12438e(cVar, "nameResolver");
        Iterable<C6611b> iterable = (List) qVar.mo24681l(this.f14574a.f14551k);
        if (iterable == null) {
            iterable = C6798p.f13713g;
        }
        ArrayList arrayList = new ArrayList(C5266a.m9892V(iterable, 10));
        for (C6611b a : iterable) {
            arrayList.add(this.f14575b.mo24941a(a, cVar));
        }
        return arrayList;
    }

    /* renamed from: h */
    public List<C6055c> mo23608h(C7407x xVar, C7117p pVar, C7303b bVar) {
        C7095h.C7102f fVar;
        C7095h.C7099d dVar;
        C6888i.m12438e(xVar, "container");
        C6888i.m12438e(pVar, "proto");
        C6888i.m12438e(bVar, "kind");
        if (pVar instanceof C6625d) {
            dVar = (C6625d) pVar;
            fVar = this.f14574a.f14542b;
        } else if (pVar instanceof C6643i) {
            dVar = (C6643i) pVar;
            fVar = this.f14574a.f14544d;
        } else if (pVar instanceof C6654n) {
            int ordinal = bVar.ordinal();
            if (ordinal == 1) {
                dVar = (C6654n) pVar;
                fVar = this.f14574a.f14545e;
            } else if (ordinal == 2) {
                dVar = (C6654n) pVar;
                fVar = this.f14574a.f14546f;
            } else if (ordinal == 3) {
                dVar = (C6654n) pVar;
                fVar = this.f14574a.f14547g;
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        } else {
            throw new IllegalStateException(C6888i.m12444k("Unknown message: ", pVar).toString());
        }
        Iterable<C6611b> iterable = (List) dVar.mo24681l(fVar);
        if (iterable == null) {
            iterable = C6798p.f13713g;
        }
        ArrayList arrayList = new ArrayList(C5266a.m9892V(iterable, 10));
        for (C6611b a : iterable) {
            arrayList.add(this.f14575b.mo24941a(a, xVar.f14811a));
        }
        return arrayList;
    }

    /* renamed from: i */
    public Object mo23609i(C7407x xVar, C6654n nVar, C7452c0 c0Var) {
        C6888i.m12438e(xVar, "container");
        C6888i.m12438e(nVar, "proto");
        C6888i.m12438e(c0Var, "expectedType");
        C6611b.C6613b.C6616c cVar = (C6611b.C6613b.C6616c) C5266a.m10009p1(nVar, this.f14574a.f14549i);
        if (cVar == null) {
            return null;
        }
        return this.f14575b.mo24943c(c0Var, cVar, xVar.f14811a);
    }

    /* renamed from: j */
    public List<C6055c> mo23610j(C7407x xVar, C6636g gVar) {
        C6888i.m12438e(xVar, "container");
        C6888i.m12438e(gVar, "proto");
        Iterable<C6611b> iterable = (List) gVar.mo24681l(this.f14574a.f14548h);
        if (iterable == null) {
            iterable = C6798p.f13713g;
        }
        ArrayList arrayList = new ArrayList(C5266a.m9892V(iterable, 10));
        for (C6611b a : iterable) {
            arrayList.add(this.f14575b.mo24941a(a, xVar.f14811a));
        }
        return arrayList;
    }
}
