package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p320m;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p005b.p291q.p292a.C5266a;
import p298d.C6766h;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6302k;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7584y0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7586z0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.h0.m.h */
public final class C6404h extends C7586z0 {

    /* renamed from: b */
    public static final C6404h f12623b = new C6404h();

    /* renamed from: c */
    public static final C6397a f12624c;

    /* renamed from: d */
    public static final C6397a f12625d;

    /* renamed from: d.a.a.a.y0.d.a.h0.m.h$a */
    public static final class C6405a extends C6890k implements C6862l<C7495e, C7489j0> {

        /* renamed from: g */
        public final /* synthetic */ C6046e f12626g;

        /* renamed from: h */
        public final /* synthetic */ C6404h f12627h;

        /* renamed from: i */
        public final /* synthetic */ C7489j0 f12628i;

        /* renamed from: j */
        public final /* synthetic */ C6397a f12629j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6405a(C6046e eVar, C6404h hVar, C7489j0 j0Var, C6397a aVar) {
            super(1);
            this.f12626g = eVar;
            this.f12627h = hVar;
            this.f12628i = j0Var;
            this.f12629j = aVar;
        }

        public Object invoke(Object obj) {
            C6046e a;
            C7495e eVar = (C7495e) obj;
            C6888i.m12438e(eVar, "kotlinTypeRefiner");
            C6046e eVar2 = this.f12626g;
            if (!(eVar2 instanceof C6046e)) {
                eVar2 = null;
            }
            C6713a g = eVar2 == null ? null : C7255a.m13134g(eVar2);
            if (g == null || (a = eVar.mo25129a(g)) == null || C6888i.m12434a(a, this.f12626g)) {
                return null;
            }
            return (C7489j0) this.f12627h.mo23542i(this.f12628i, a, this.f12629j).f13681g;
        }
    }

    static {
        C6302k kVar = C6302k.COMMON;
        f12624c = C6403g.m11424c(kVar, false, (C6248w0) null, 3).mo23531a(C6398b.FLEXIBLE_LOWER_BOUND);
        f12625d = C6403g.m11424c(kVar, false, (C6248w0) null, 3).mo23531a(C6398b.FLEXIBLE_UPPER_BOUND);
    }

    /* renamed from: e */
    public C7580w0 mo23539e(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "key");
        return new C7584y0(mo23543j(c0Var));
    }

    /* renamed from: f */
    public boolean mo23540f() {
        return false;
    }

    /* renamed from: h */
    public final C7580w0 mo23541h(C6248w0 w0Var, C6397a aVar, C7452c0 c0Var) {
        C7484h1 h1Var = C7484h1.INVARIANT;
        C6888i.m12438e(w0Var, "parameter");
        C6888i.m12438e(aVar, "attr");
        C6888i.m12438e(c0Var, "erasedUpperBound");
        int ordinal = aVar.f12608b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (!w0Var.mo23137j().f14917h) {
                return new C7584y0(h1Var, C7255a.m13133f(w0Var).getNothingType());
            }
            List<C6248w0> parameters = c0Var.mo24887V().getParameters();
            C6888i.m12437d(parameters, "erasedUpperBound.constructor.parameters");
            return parameters.isEmpty() ^ true ? new C7584y0(C7484h1.OUT_VARIANCE, c0Var) : C6403g.m11423b(w0Var, aVar);
        } else if (ordinal == 2) {
            return new C7584y0(h1Var, c0Var);
        } else {
            throw new C6766h();
        }
    }

    /* renamed from: i */
    public final C6768j<C7489j0, Boolean> mo23542i(C7489j0 j0Var, C6046e eVar, C6397a aVar) {
        if (j0Var.mo24887V().getParameters().isEmpty()) {
            return new C6768j<>(j0Var, Boolean.FALSE);
        }
        if (KotlinBuiltIns.isArray(j0Var)) {
            C7580w0 w0Var = j0Var.mo24886U().get(0);
            C7484h1 b = w0Var.mo25162b();
            C7452c0 a = w0Var.mo25161a();
            C6888i.m12437d(a, "componentTypeProjection.type");
            List Y2 = C5266a.m9910Y2(new C7584y0(b, mo23543j(a)));
            C7455d0 d0Var = C7455d0.f14869a;
            return new C6768j<>(C7455d0.m13432g(j0Var.getAnnotations(), j0Var.mo24887V(), Y2, j0Var.mo23566W(), (C7495e) null, 16), Boolean.FALSE);
        } else if (C5266a.m10046v2(j0Var)) {
            C7489j0 d = C7570v.m13783d(C6888i.m12444k("Raw error type: ", j0Var.mo24887V()));
            C6888i.m12437d(d, "createErrorType(\"Raw error type: ${type.constructor}\")");
            return new C6768j<>(d, Boolean.FALSE);
        } else {
            C7277h memberScope = eVar.getMemberScope(this);
            C6888i.m12437d(memberScope, "declaration.getMemberScope(RawSubstitution)");
            C7455d0 d0Var2 = C7455d0.f14869a;
            C6060h annotations = j0Var.getAnnotations();
            C7567t0 typeConstructor = eVar.getTypeConstructor();
            C6888i.m12437d(typeConstructor, "declaration.typeConstructor");
            List<C6248w0> parameters = eVar.getTypeConstructor().getParameters();
            C6888i.m12437d(parameters, "declaration.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C5266a.m9892V(parameters, 10));
            for (C6248w0 w0Var2 : parameters) {
                C6888i.m12437d(w0Var2, "parameter");
                C6714b bVar = C6403g.f12622a;
                arrayList.add(mo23541h(w0Var2, aVar, C6403g.m11422a(w0Var2, (C6248w0) null, new C6402f(w0Var2))));
            }
            return new C6768j<>(C7455d0.m13434i(annotations, typeConstructor, arrayList, j0Var.mo23566W(), memberScope, new C6405a(eVar, this, j0Var, aVar)), Boolean.TRUE);
        }
    }

    /* renamed from: j */
    public final C7452c0 mo23543j(C7452c0 c0Var) {
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        if (declarationDescriptor instanceof C6248w0) {
            C6248w0 w0Var = (C6248w0) declarationDescriptor;
            C6714b bVar = C6403g.f12622a;
            return mo23543j(C6403g.m11422a(w0Var, (C6248w0) null, new C6402f(w0Var)));
        } else if (declarationDescriptor instanceof C6046e) {
            C6083h declarationDescriptor2 = C5266a.m9847M4(c0Var).mo24887V().getDeclarationDescriptor();
            if (declarationDescriptor2 instanceof C6046e) {
                C6768j<C7489j0, Boolean> i = mo23542i(C5266a.m9933c3(c0Var), (C6046e) declarationDescriptor, f12624c);
                C7489j0 j0Var = (C7489j0) i.f13681g;
                boolean booleanValue = ((Boolean) i.f13682h).booleanValue();
                C6768j<C7489j0, Boolean> i2 = mo23542i(C5266a.m9847M4(c0Var), (C6046e) declarationDescriptor2, f12625d);
                C7489j0 j0Var2 = (C7489j0) i2.f13681g;
                boolean booleanValue2 = ((Boolean) i2.f13682h).booleanValue();
                if (booleanValue || booleanValue2) {
                    return new C6406i(j0Var, j0Var2);
                }
                C7455d0 d0Var = C7455d0.f14869a;
                return C7455d0.m13428c(j0Var, j0Var2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + declarationDescriptor2 + "\" while for lower it's \"" + declarationDescriptor + '\"').toString());
        } else {
            throw new IllegalStateException(C6888i.m12444k("Unexpected declaration kind: ", declarationDescriptor).toString());
        }
    }
}
