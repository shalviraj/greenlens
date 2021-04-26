package p005b.p096l.p224e.p226e0.p228z;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.p226e0.C4345a;
import p005b.p096l.p224e.p226e0.C4357g;
import p005b.p096l.p224e.p226e0.C4380t;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4459b;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.b */
public final class C4388b implements C4334c0 {

    /* renamed from: g */
    public final C4357g f8118g;

    /* renamed from: b.l.e.e0.z.b$a */
    public static final class C4389a<E> extends C4332b0<Collection<E>> {

        /* renamed from: a */
        public final C4332b0<E> f8119a;

        /* renamed from: b */
        public final C4380t<? extends Collection<E>> f8120b;

        public C4389a(C4465k kVar, Type type, C4332b0<E> b0Var, C4380t<? extends Collection<E>> tVar) {
            this.f8119a = new C4413n(kVar, b0Var, type);
            this.f8120b = tVar;
        }

        /* renamed from: a */
        public Object mo10755a(C4457a aVar) {
            if (aVar.mo16060w0() == C4459b.NULL) {
                aVar.mo16057s0();
                return null;
            }
            Collection collection = (Collection) this.f8120b.mo15987a();
            aVar.mo16050d();
            while (aVar.mo16048Z()) {
                collection.add(this.f8119a.mo10755a(aVar));
            }
            aVar.mo16045H();
            return collection;
        }

        /* renamed from: b */
        public void mo10756b(C4460c cVar, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                cVar.mo16066Z();
                return;
            }
            cVar.mo16068e();
            for (Object b : collection) {
                this.f8119a.mo10756b(cVar, b);
            }
            cVar.mo16063H();
        }
    }

    public C4388b(C4357g gVar) {
        this.f8118g = gVar;
    }

    /* renamed from: a */
    public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
        Type type = aVar.f8250b;
        Class<? super T> cls = aVar.f8249a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type f = C4345a.m7966f(type, cls, Collection.class);
        if (f instanceof WildcardType) {
            f = ((WildcardType) f).getUpperBounds()[0];
        }
        Class cls2 = f instanceof ParameterizedType ? ((ParameterizedType) f).getActualTypeArguments()[0] : Object.class;
        return new C4389a(kVar, cls2, kVar.mo16119e(new C4455a(cls2)), this.f8118g.mo15988a(aVar));
    }
}
