package p298d.p299a.p300a.p301a.p303y0.p391i.p398z;

import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.i.z.g */
public final class C7275g extends C7263a {

    /* renamed from: b */
    public final C7437i<C7277h> f14515b;

    /* renamed from: d.a.a.a.y0.i.z.g$a */
    public static final class C7276a extends C6890k implements C6851a<C7277h> {

        /* renamed from: g */
        public final /* synthetic */ C6851a<C7277h> f14516g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7276a(C6851a<? extends C7277h> aVar) {
            super(0);
            this.f14516g = aVar;
        }

        public Object invoke() {
            C7277h invoke = this.f14516g.invoke();
            return invoke instanceof C7263a ? ((C7263a) invoke).mo24911a() : invoke;
        }
    }

    public C7275g(C7441m mVar, C6851a<? extends C7277h> aVar) {
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(aVar, "getScope");
        this.f14515b = mVar.mo25018a(new C7276a(aVar));
    }

    /* renamed from: b */
    public C7277h mo24912b() {
        return (C7277h) this.f14515b.invoke();
    }
}
