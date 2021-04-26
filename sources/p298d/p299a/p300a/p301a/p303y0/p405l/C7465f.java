package p298d.p299a.p300a.p301a.p303y0.p405l;

import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7491b;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7538l;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7540n;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7644m;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.f */
public abstract class C7465f implements C7540n {

    /* renamed from: a */
    public int f14890a;

    /* renamed from: b */
    public boolean f14891b;

    /* renamed from: c */
    public ArrayDeque<C7535i> f14892c;

    /* renamed from: d */
    public Set<C7535i> f14893d;

    /* renamed from: d.a.a.a.y0.l.f$a */
    public static abstract class C7466a {

        /* renamed from: d.a.a.a.y0.l.f$a$a */
        public static abstract class C7467a extends C7466a {
            public C7467a() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: d.a.a.a.y0.l.f$a$b */
        public static final class C7468b extends C7466a {

            /* renamed from: a */
            public static final C7468b f14894a = new C7468b();

            public C7468b() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public C7535i mo25087a(C7465f fVar, C7534h hVar) {
                C6888i.m12438e(fVar, BasePayload.CONTEXT_KEY);
                C6888i.m12438e(hVar, "type");
                return C5266a.m9927b3(fVar, hVar);
            }
        }

        /* renamed from: d.a.a.a.y0.l.f$a$c */
        public static final class C7469c extends C7466a {

            /* renamed from: a */
            public static final C7469c f14895a = new C7469c();

            public C7469c() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public C7535i mo25087a(C7465f fVar, C7534h hVar) {
                C6888i.m12438e(fVar, BasePayload.CONTEXT_KEY);
                C6888i.m12438e(hVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* renamed from: d.a.a.a.y0.l.f$a$d */
        public static final class C7470d extends C7466a {

            /* renamed from: a */
            public static final C7470d f14896a = new C7470d();

            public C7470d() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public C7535i mo25087a(C7465f fVar, C7534h hVar) {
                C6888i.m12438e(fVar, BasePayload.CONTEXT_KEY);
                C6888i.m12438e(hVar, "type");
                return C5266a.m9841L4(fVar, hVar);
            }
        }

        public C7466a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public abstract C7535i mo25087a(C7465f fVar, C7534h hVar);
    }

    /* renamed from: A */
    public final void mo25072A() {
        ArrayDeque<C7535i> arrayDeque = this.f14892c;
        C6888i.m12436c(arrayDeque);
        arrayDeque.clear();
        Set<C7535i> set = this.f14893d;
        C6888i.m12436c(set);
        set.clear();
        this.f14891b = false;
    }

    /* renamed from: B */
    public boolean mo25073B(C7534h hVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(hVar, "receiver");
        C7491b bVar = (C7491b) this;
        return C5266a.m9779B2(bVar, C5266a.m9927b3(this, hVar)) != C5266a.m9779B2(bVar, C5266a.m9841L4(this, hVar));
    }

    /* renamed from: C */
    public final void mo25074C() {
        this.f14891b = true;
        if (this.f14892c == null) {
            this.f14892c = new ArrayDeque<>(4);
        }
        if (this.f14893d == null) {
            this.f14893d = C7644m.C7646b.m13874a();
        }
    }

    /* renamed from: D */
    public boolean mo25075D(C7535i iVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(iVar, "receiver");
        C7491b bVar = (C7491b) this;
        return bVar.mo25103Q(bVar.mo25112c(iVar));
    }

    /* renamed from: E */
    public boolean mo25076E(C7534h hVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(hVar, "receiver");
        C7491b bVar = (C7491b) this;
        C7535i a = bVar.mo25110a(hVar);
        return (a == null ? null : bVar.mo25121s(a)) != null;
    }

    /* renamed from: F */
    public abstract boolean mo25077F();

    /* renamed from: G */
    public boolean mo25078G(C7535i iVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(iVar, "receiver");
        C7491b bVar = (C7491b) this;
        return bVar.mo25105S(bVar.mo25112c(iVar));
    }

    /* renamed from: H */
    public abstract boolean mo25079H();

    /* renamed from: I */
    public abstract C7534h mo25080I(C7534h hVar);

    /* renamed from: J */
    public abstract C7534h mo25081J(C7534h hVar);

    /* renamed from: K */
    public abstract C7466a mo25082K(C7535i iVar);

    /* renamed from: k */
    public C7535i mo25083k(C7534h hVar) {
        return C5266a.m9927b3(this, hVar);
    }

    /* renamed from: l */
    public C7538l mo25084l(C7534h hVar) {
        return C5266a.m9829J4(this, hVar);
    }

    /* renamed from: n */
    public boolean mo25085n(C7534h hVar) {
        return C5266a.m9785C2(this, hVar);
    }

    /* renamed from: z */
    public Boolean mo25086z(C7534h hVar, C7534h hVar2) {
        C6888i.m12438e(hVar, "subType");
        C6888i.m12438e(hVar2, "superType");
        return null;
    }
}
