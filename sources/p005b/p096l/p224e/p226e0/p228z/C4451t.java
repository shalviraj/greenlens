package p005b.p096l.p224e.p226e0.p228z;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.C4480y;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.t */
public class C4451t implements C4334c0 {

    /* renamed from: g */
    public final /* synthetic */ Class f8244g;

    /* renamed from: h */
    public final /* synthetic */ C4332b0 f8245h;

    /* renamed from: b.l.e.e0.z.t$a */
    public class C4452a extends C4332b0<T1> {

        /* renamed from: a */
        public final /* synthetic */ Class f8246a;

        public C4452a(Class cls) {
            this.f8246a = cls;
        }

        /* renamed from: a */
        public T1 mo10755a(C4457a aVar) {
            T1 a = C4451t.this.f8245h.mo10755a(aVar);
            if (a == null || this.f8246a.isInstance(a)) {
                return a;
            }
            StringBuilder u = C0843a.m460u("Expected a ");
            u.append(this.f8246a.getName());
            u.append(" but was ");
            u.append(a.getClass().getName());
            throw new C4480y(u.toString());
        }

        /* renamed from: b */
        public void mo10756b(C4460c cVar, T1 t1) {
            C4451t.this.f8245h.mo10756b(cVar, t1);
        }
    }

    public C4451t(Class cls, C4332b0 b0Var) {
        this.f8244g = cls;
        this.f8245h = b0Var;
    }

    /* renamed from: a */
    public <T2> C4332b0<T2> mo10754a(C4465k kVar, C4455a<T2> aVar) {
        Class<? super T> cls = aVar.f8249a;
        if (!this.f8244g.isAssignableFrom(cls)) {
            return null;
        }
        return new C4452a(cls);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Factory[typeHierarchy=");
        u.append(this.f8244g.getName());
        u.append(",adapter=");
        u.append(this.f8245h);
        u.append("]");
        return u.toString();
    }
}
