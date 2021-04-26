package p298d.p299a.p300a.p301a.p303y0.p400j.p401b;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6621c;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6700b;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6707e;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.j.b.x */
public abstract class C7407x {

    /* renamed from: a */
    public final C6705c f14811a;

    /* renamed from: b */
    public final C6707e f14812b;

    /* renamed from: c */
    public final C6234r0 f14813c;

    /* renamed from: d.a.a.a.y0.j.b.x$a */
    public static final class C7408a extends C7407x {

        /* renamed from: d */
        public final C6621c f14814d;

        /* renamed from: e */
        public final C7408a f14815e;

        /* renamed from: f */
        public final C6713a f14816f;

        /* renamed from: g */
        public final C6621c.C6624c f14817g;

        /* renamed from: h */
        public final boolean f14818h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7408a(C6621c cVar, C6705c cVar2, C6707e eVar, C6234r0 r0Var, C7408a aVar) {
            super(cVar2, eVar, r0Var, (DefaultConstructorMarker) null);
            C6888i.m12438e(cVar, "classProto");
            C6888i.m12438e(cVar2, "nameResolver");
            C6888i.m12438e(eVar, "typeTable");
            this.f14814d = cVar;
            this.f14815e = aVar;
            this.f14816f = C5266a.m9973j1(cVar2, cVar.f13091k);
            C6621c.C6624c d = C6700b.f13569e.mo23840d(cVar.f13090j);
            this.f14817g = d == null ? C6621c.C6624c.CLASS : d;
            this.f14818h = C0843a.m434J(C6700b.f13570f, cVar.f13090j, "IS_INNER.get(classProto.flags)");
        }

        /* renamed from: a */
        public C6714b mo25013a() {
            C6714b b = this.f14816f.mo23851b();
            C6888i.m12437d(b, "classId.asSingleFqName()");
            return b;
        }
    }

    /* renamed from: d.a.a.a.y0.j.b.x$b */
    public static final class C7409b extends C7407x {

        /* renamed from: d */
        public final C6714b f14819d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7409b(C6714b bVar, C6705c cVar, C6707e eVar, C6234r0 r0Var) {
            super(cVar, eVar, r0Var, (DefaultConstructorMarker) null);
            C6888i.m12438e(bVar, "fqName");
            C6888i.m12438e(cVar, "nameResolver");
            C6888i.m12438e(eVar, "typeTable");
            this.f14819d = bVar;
        }

        /* renamed from: a */
        public C6714b mo25013a() {
            return this.f14819d;
        }
    }

    public C7407x(C6705c cVar, C6707e eVar, C6234r0 r0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this.f14811a = cVar;
        this.f14812b = eVar;
        this.f14813c = r0Var;
    }

    /* renamed from: a */
    public abstract C6714b mo25013a();

    public String toString() {
        return getClass().getSimpleName() + ": " + mo25013a();
    }
}
