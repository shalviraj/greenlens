package p298d.p299a.p300a.p301a.p303y0.p405l.p406j1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p391i.p392u.p393a.C7215b;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.l.j1.i */
public final class C7500i implements C7215b {

    /* renamed from: a */
    public final C7580w0 f14936a;

    /* renamed from: b */
    public C6851a<? extends List<? extends C7481g1>> f14937b;

    /* renamed from: c */
    public final C7500i f14938c;

    /* renamed from: d */
    public final C6248w0 f14939d;

    /* renamed from: e */
    public final C6764f f14940e;

    /* renamed from: d.a.a.a.y0.l.j1.i$a */
    public static final class C7501a extends C6890k implements C6851a<List<? extends C7481g1>> {

        /* renamed from: g */
        public final /* synthetic */ C7500i f14941g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7501a(C7500i iVar) {
            super(0);
            this.f14941g = iVar;
        }

        public Object invoke() {
            C6851a<? extends List<? extends C7481g1>> aVar = this.f14941g.f14937b;
            if (aVar == null) {
                return null;
            }
            return (List) aVar.invoke();
        }
    }

    /* renamed from: d.a.a.a.y0.l.j1.i$b */
    public static final class C7502b extends C6890k implements C6851a<List<? extends C7481g1>> {

        /* renamed from: g */
        public final /* synthetic */ C7500i f14942g;

        /* renamed from: h */
        public final /* synthetic */ C7495e f14943h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7502b(C7500i iVar, C7495e eVar) {
            super(0);
            this.f14942g = iVar;
            this.f14943h = eVar;
        }

        public Object invoke() {
            Iterable<C7481g1> iterable = (List) this.f14942g.f14940e.getValue();
            if (iterable == null) {
                iterable = C6798p.f13713g;
            }
            C7495e eVar = this.f14943h;
            ArrayList arrayList = new ArrayList(C5266a.m9892V(iterable, 10));
            for (C7481g1 a0 : iterable) {
                arrayList.add(a0.mo23546a0(eVar));
            }
            return arrayList;
        }
    }

    public C7500i(C7580w0 w0Var, C6851a<? extends List<? extends C7481g1>> aVar, C7500i iVar, C6248w0 w0Var2) {
        C6888i.m12438e(w0Var, "projection");
        this.f14936a = w0Var;
        this.f14937b = aVar;
        this.f14938c = iVar;
        this.f14939d = w0Var2;
        this.f14940e = C5266a.m9885T2(C6765g.PUBLICATION, new C7501a(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7500i(C7580w0 w0Var, C6851a aVar, C7500i iVar, C6248w0 w0Var2, int i) {
        this(w0Var, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : iVar, (i & 8) != 0 ? null : w0Var2);
    }

    /* renamed from: a */
    public C7580w0 mo24890a() {
        return this.f14936a;
    }

    /* renamed from: b */
    public C7500i refine(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        C7580w0 refine = this.f14936a.refine(eVar);
        C6888i.m12437d(refine, "projection.refine(kotlinTypeRefiner)");
        C7502b bVar = this.f14937b == null ? null : new C7502b(this, eVar);
        C7500i iVar = this.f14938c;
        if (iVar == null) {
            iVar = this;
        }
        return new C7500i(refine, bVar, iVar, this.f14939d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C6888i.m12434a(C7500i.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C7500i iVar = (C7500i) obj;
        C7500i iVar2 = this.f14938c;
        if (iVar2 == null) {
            iVar2 = this;
        }
        C7500i iVar3 = iVar.f14938c;
        if (iVar3 != null) {
            iVar = iVar3;
        }
        return iVar2 == iVar;
    }

    public KotlinBuiltIns getBuiltIns() {
        C7452c0 a = this.f14936a.mo25161a();
        C6888i.m12437d(a, "projection.type");
        return C5266a.m9955g1(a);
    }

    public C6083h getDeclarationDescriptor() {
        return null;
    }

    public List<C6248w0> getParameters() {
        return C6798p.f13713g;
    }

    public Collection getSupertypes() {
        List list = (List) this.f14940e.getValue();
        return list == null ? C6798p.f13713g : list;
    }

    public int hashCode() {
        C7500i iVar = this.f14938c;
        return iVar == null ? super.hashCode() : iVar.hashCode();
    }

    public boolean isDenotable() {
        return false;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("CapturedType(");
        u.append(this.f14936a);
        u.append(')');
        return u.toString();
    }
}
