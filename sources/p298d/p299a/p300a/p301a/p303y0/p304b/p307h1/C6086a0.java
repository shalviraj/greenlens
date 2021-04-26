package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6035d0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6073g0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6210m;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6247w;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6254z;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7435g;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7497f;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7507m;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p334t.C6799q;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.h1.a0 */
public final class C6086a0 extends C6120m implements C6021a0 {

    /* renamed from: g */
    public final C7441m f11989g;

    /* renamed from: h */
    public final KotlinBuiltIns f11990h;

    /* renamed from: i */
    public final Map<C6254z<?>, Object> f11991i;

    /* renamed from: j */
    public C6148w f11992j;

    /* renamed from: k */
    public C6035d0 f11993k;

    /* renamed from: l */
    public boolean f11994l;

    /* renamed from: m */
    public final C7435g<C6714b, C6073g0> f11995m;

    /* renamed from: n */
    public final C6764f f11996n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6086a0(C6717d dVar, C7441m mVar, KotlinBuiltIns kotlinBuiltIns, Map map, C6717d dVar2, int i) {
        super(C6060h.C6061a.f11922b, dVar);
        C6799q qVar = (i & 16) != 0 ? C6799q.f13714g : null;
        C6888i.m12438e(dVar, "moduleName");
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(kotlinBuiltIns, "builtIns");
        C6888i.m12438e(qVar, "capabilities");
        Objects.requireNonNull(C6060h.f11920d);
        this.f11989g = mVar;
        this.f11990h = kotlinBuiltIns;
        if (dVar.f13624h) {
            Map<C6254z<?>, Object> c0 = C6790h.m12345c0(qVar);
            this.f11991i = c0;
            c0.put(C7497f.f14928a, new C7507m(null));
            this.f11994l = true;
            this.f11995m = mVar.mo25025h(new C6151z(this));
            this.f11996n = C5266a.m9890U2(new C6150y(this));
            return;
        }
        throw new IllegalArgumentException(C6888i.m12444k("Module name must be special: ", dVar));
    }

    /* renamed from: C */
    public List<C6021a0> mo23087C() {
        C6148w wVar = this.f11992j;
        if (wVar != null) {
            return wVar.mo23317c();
        }
        StringBuilder u = C0843a.m460u("Dependencies of module ");
        u.append(mo23194z());
        u.append(" were not set");
        throw new AssertionError(u.toString());
    }

    /* renamed from: D */
    public final void mo23192D(C6086a0... a0VarArr) {
        C6888i.m12438e(a0VarArr, "descriptors");
        List y4 = C5266a.m10066y4(a0VarArr);
        C6888i.m12438e(y4, "descriptors");
        C6800r rVar = C6800r.f13715g;
        C6888i.m12438e(y4, "descriptors");
        C6888i.m12438e(rVar, "friends");
        C6149x xVar = new C6149x(y4, rVar, C6798p.f13713g, rVar);
        C6888i.m12438e(xVar, "dependencies");
        this.f11992j = xVar;
    }

    /* renamed from: G */
    public C6073g0 mo23088G(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        mo23193x();
        return (C6073g0) ((C7417e.C7431m) this.f11995m).invoke(bVar);
    }

    /* renamed from: R */
    public <T> T mo23089R(C6254z<T> zVar) {
        C6888i.m12438e(zVar, "capability");
        return this.f11991i.get(zVar);
    }

    public <R, D> R accept(C6210m<R, D> mVar, D d) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(mVar, "visitor");
        return mVar.mo22986g(this, d);
    }

    public KotlinBuiltIns getBuiltIns() {
        return this.f11990h;
    }

    public C6206k getContainingDeclaration() {
        C6888i.m12438e(this, "this");
        return null;
    }

    public Collection<C6714b> getSubPackagesOf(C6714b bVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(lVar, "nameFilter");
        mo23193x();
        mo23193x();
        return ((C6116l) this.f11996n.getValue()).getSubPackagesOf(bVar, lVar);
    }

    /* renamed from: k */
    public boolean mo23092k(C6021a0 a0Var) {
        C6888i.m12438e(a0Var, "targetModule");
        if (C6888i.m12434a(this, a0Var)) {
            return true;
        }
        C6148w wVar = this.f11992j;
        C6888i.m12436c(wVar);
        return C6790h.m12348e(wVar.mo23315a(), a0Var) || mo23087C().contains(a0Var) || a0Var.mo23087C().contains(this);
    }

    /* renamed from: x */
    public void mo23193x() {
        if (!this.f11994l) {
            throw new C6247w(C6888i.m12444k("Accessing invalid module descriptor ", this));
        }
    }

    /* renamed from: z */
    public final String mo23194z() {
        String str = getName().f13623g;
        C6888i.m12437d(str, "name.toString()");
        return str;
    }
}
