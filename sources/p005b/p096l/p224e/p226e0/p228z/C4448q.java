package p005b.p096l.p224e.p226e0.p228z;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.p230f0.C4455a;

/* renamed from: b.l.e.e0.z.q */
public class C4448q implements C4334c0 {

    /* renamed from: g */
    public final /* synthetic */ Class f8236g;

    /* renamed from: h */
    public final /* synthetic */ C4332b0 f8237h;

    public C4448q(Class cls, C4332b0 b0Var) {
        this.f8236g = cls;
        this.f8237h = b0Var;
    }

    /* renamed from: a */
    public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
        if (aVar.f8249a == this.f8236g) {
            return this.f8237h;
        }
        return null;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Factory[type=");
        u.append(this.f8236g.getName());
        u.append(",adapter=");
        u.append(this.f8237h);
        u.append("]");
        return u.toString();
    }
}
