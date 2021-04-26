package p298d.p299a.p300a.p301a.p303y0.p391i.p394v;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7584y0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.i.v.o */
public final class C7237o implements C7567t0 {

    /* renamed from: a */
    public final long f14465a;

    /* renamed from: b */
    public final C6021a0 f14466b;

    /* renamed from: c */
    public final Set<C7452c0> f14467c;

    /* renamed from: d */
    public final C7489j0 f14468d = C7455d0.m13429d(C6060h.C6061a.f11922b, this, false);

    /* renamed from: e */
    public final C6764f f14469e = C5266a.m9890U2(new C7238a(this));

    /* renamed from: d.a.a.a.y0.i.v.o$a */
    public static final class C7238a extends C6890k implements C6851a<List<C7489j0>> {

        /* renamed from: g */
        public final /* synthetic */ C7237o f14470g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7238a(C7237o oVar) {
            super(0);
            this.f14470g = oVar;
        }

        public Object invoke() {
            boolean z = true;
            C7489j0 defaultType = this.f14470g.getBuiltIns().getComparable().getDefaultType();
            C6888i.m12437d(defaultType, "builtIns.comparable.defaultType");
            List E = C6790h.m12318E(C5266a.m9774A3(defaultType, C5266a.m9910Y2(new C7584y0(C7484h1.IN_VARIANCE, this.f14470g.f14468d)), (C6060h) null, 2));
            C7237o oVar = this.f14470g;
            C6021a0 a0Var = oVar.f14466b;
            C6888i.m12438e(a0Var, "<this>");
            List A = C6790h.m12314A(a0Var.getBuiltIns().getIntType(), a0Var.getBuiltIns().getLongType(), a0Var.getBuiltIns().getByteType(), a0Var.getBuiltIns().getShortType());
            if (!A.isEmpty()) {
                Iterator it = A.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!(!oVar.f14467c.contains((C7452c0) it.next()))) {
                        z = false;
                        break;
                    }
                }
            }
            if (!z) {
                E.add(this.f14470g.getBuiltIns().getNumberType());
            }
            return E;
        }
    }

    public C7237o(long j, C6021a0 a0Var, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        C7455d0 d0Var = C7455d0.f14869a;
        Objects.requireNonNull(C6060h.f11920d);
        this.f14465a = j;
        this.f14466b = a0Var;
        this.f14467c = set;
    }

    /* renamed from: b */
    public final boolean mo24901b(C7567t0 t0Var) {
        C6888i.m12438e(t0Var, "constructor");
        Set<C7452c0> set = this.f14467c;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (C7452c0 V : set) {
                if (C6888i.m12434a(V.mo24887V(), t0Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public KotlinBuiltIns getBuiltIns() {
        return this.f14466b.getBuiltIns();
    }

    public C6083h getDeclarationDescriptor() {
        return null;
    }

    public List<C6248w0> getParameters() {
        return C6798p.f13713g;
    }

    public Collection<C7452c0> getSupertypes() {
        return (List) this.f14469e.getValue();
    }

    public boolean isDenotable() {
        return false;
    }

    public C7567t0 refine(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        return this;
    }

    public String toString() {
        StringBuilder t = C0843a.m459t('[');
        t.append(C6790h.m12369w(this.f14467c, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C7239p.f14471g, 30));
        t.append(']');
        return C6888i.m12444k("IntegerLiteralType", t.toString());
    }
}
