package p005b.p096l.p224e.p226e0;

import java.util.Collections;
import java.util.List;
import p005b.p096l.p224e.C4331b;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.o */
public final class C4367o implements C4334c0, Cloneable {

    /* renamed from: i */
    public static final C4367o f8076i = new C4367o();

    /* renamed from: g */
    public List<C4331b> f8077g = Collections.emptyList();

    /* renamed from: h */
    public List<C4331b> f8078h = Collections.emptyList();

    /* renamed from: b.l.e.e0.o$a */
    public class C4368a extends C4332b0<T> {

        /* renamed from: a */
        public C4332b0<T> f8079a;

        /* renamed from: b */
        public final /* synthetic */ boolean f8080b;

        /* renamed from: c */
        public final /* synthetic */ boolean f8081c;

        /* renamed from: d */
        public final /* synthetic */ C4465k f8082d;

        /* renamed from: e */
        public final /* synthetic */ C4455a f8083e;

        public C4368a(boolean z, boolean z2, C4465k kVar, C4455a aVar) {
            this.f8080b = z;
            this.f8081c = z2;
            this.f8082d = kVar;
            this.f8083e = aVar;
        }

        /* renamed from: a */
        public T mo10755a(C4457a aVar) {
            if (this.f8080b) {
                aVar.mo16040B0();
                return null;
            }
            C4332b0<T> b0Var = this.f8079a;
            if (b0Var == null) {
                b0Var = this.f8082d.mo16121g(C4367o.this, this.f8083e);
                this.f8079a = b0Var;
            }
            return b0Var.mo10755a(aVar);
        }

        /* renamed from: b */
        public void mo10756b(C4460c cVar, T t) {
            if (this.f8081c) {
                cVar.mo16066Z();
                return;
            }
            C4332b0<T> b0Var = this.f8079a;
            if (b0Var == null) {
                b0Var = this.f8082d.mo16121g(C4367o.this, this.f8083e);
                this.f8079a = b0Var;
            }
            b0Var.mo10756b(cVar, t);
        }
    }

    /* renamed from: a */
    public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
        Class<? super T> cls = aVar.f8249a;
        boolean c = mo15991c(cls);
        boolean z = c || mo15990b(cls, true);
        boolean z2 = c || mo15990b(cls, false);
        if (z || z2) {
            return new C4368a(z2, z, kVar, aVar);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo15990b(Class<?> cls, boolean z) {
        for (C4331b a : z ? this.f8077g : this.f8078h) {
            if (a.mo15964a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo15991c(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public Object clone() {
        try {
            return (C4367o) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
