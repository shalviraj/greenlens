package p298d.p299a.p300a.p301a.p303y0.p304b;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.b.o0 */
public final class C6215o0<T extends C7277h> {

    /* renamed from: e */
    public static final C6215o0 f12231e = null;

    /* renamed from: f */
    public static final /* synthetic */ C6736l<Object>[] f12232f = {C6902w.m12462c(new C6896q(C6902w.m12460a(C6215o0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: a */
    public final C6046e f12233a;

    /* renamed from: b */
    public final C6862l<C7495e, T> f12234b;

    /* renamed from: c */
    public final C7495e f12235c;

    /* renamed from: d */
    public final C7437i f12236d;

    /* renamed from: d.a.a.a.y0.b.o0$a */
    public static final class C6216a extends C6890k implements C6851a<T> {

        /* renamed from: g */
        public final /* synthetic */ C6215o0<T> f12237g;

        /* renamed from: h */
        public final /* synthetic */ C7495e f12238h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6216a(C6215o0<T> o0Var, C7495e eVar) {
            super(0);
            this.f12237g = o0Var;
            this.f12238h = eVar;
        }

        public Object invoke() {
            return (C7277h) this.f12237g.f12234b.invoke(this.f12238h);
        }
    }

    public C6215o0(C6046e eVar, C7441m mVar, C6862l lVar, C7495e eVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f12233a = eVar;
        this.f12234b = lVar;
        this.f12235c = eVar2;
        this.f12236d = mVar.mo25018a(new C6218p0(this));
    }

    /* renamed from: a */
    public static final <T extends C7277h> C6215o0<T> m11184a(C6046e eVar, C7441m mVar, C7495e eVar2, C6862l<? super C7495e, ? extends T> lVar) {
        C6888i.m12438e(eVar, "classDescriptor");
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(eVar2, "kotlinTypeRefinerForOwnerModule");
        C6888i.m12438e(lVar, "scopeFactory");
        return new C6215o0(eVar, mVar, lVar, eVar2, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final T mo23425b(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        if (!eVar.mo25131c(C7255a.m13138k(this.f12233a))) {
            return (C7277h) C5266a.m9884T1(this.f12236d, f12232f[0]);
        }
        C7567t0 typeConstructor = this.f12233a.getTypeConstructor();
        C6888i.m12437d(typeConstructor, "classDescriptor.typeConstructor");
        if (!eVar.mo25132d(typeConstructor)) {
            return (C7277h) C5266a.m9884T1(this.f12236d, f12232f[0]);
        }
        return eVar.mo25130b(this.f12233a, new C6216a(this, eVar));
    }
}
