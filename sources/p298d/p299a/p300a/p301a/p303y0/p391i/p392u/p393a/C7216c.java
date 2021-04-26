package p298d.p299a.p300a.p301a.p303y0.p391i.p392u.p393a;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7500i;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.u.a.c */
public final class C7216c implements C7215b {

    /* renamed from: a */
    public final C7580w0 f14452a;

    /* renamed from: b */
    public C7500i f14453b;

    public C7216c(C7580w0 w0Var) {
        C6888i.m12438e(w0Var, "projection");
        this.f14452a = w0Var;
        C7484h1 b = w0Var.mo25162b();
        C7484h1 h1Var = C7484h1.INVARIANT;
    }

    /* renamed from: a */
    public C7580w0 mo24890a() {
        return this.f14452a;
    }

    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = this.f14452a.mo25161a().mo24887V().getBuiltIns();
        C6888i.m12437d(builtIns, "projection.type.constructor.builtIns");
        return builtIns;
    }

    public /* bridge */ /* synthetic */ C6083h getDeclarationDescriptor() {
        return null;
    }

    public List<C6248w0> getParameters() {
        return C6798p.f13713g;
    }

    public Collection<C7452c0> getSupertypes() {
        Object a = this.f14452a.mo25162b() == C7484h1.OUT_VARIANCE ? this.f14452a.mo25161a() : getBuiltIns().getNullableAnyType();
        C6888i.m12437d(a, "if (projection.projectionKind == Variance.OUT_VARIANCE)\n            projection.type\n        else\n            builtIns.nullableAnyType");
        return C5266a.m9910Y2(a);
    }

    public boolean isDenotable() {
        return false;
    }

    public C7567t0 refine(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        C7580w0 refine = this.f14452a.refine(eVar);
        C6888i.m12437d(refine, "projection.refine(kotlinTypeRefiner)");
        return new C7216c(refine);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("CapturedTypeConstructor(");
        u.append(this.f14452a);
        u.append(')');
        return u.toString();
    }
}
