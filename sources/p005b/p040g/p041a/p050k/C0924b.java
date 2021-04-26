package p005b.p040g.p041a.p050k;

import java.lang.reflect.Field;
import p005b.p096l.p224e.C4330a0;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.C4476u;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.g.a.k.b */
public class C0924b implements C4334c0 {

    /* renamed from: b.g.a.k.b$a */
    public class C0925a extends C4332b0<T> {

        /* renamed from: a */
        public final /* synthetic */ C4332b0 f834a;

        public C0925a(C0924b bVar, C4332b0 b0Var) {
            this.f834a = b0Var;
        }

        /* renamed from: a */
        public T mo10755a(C4457a aVar) {
            T a = this.f834a.mo10755a(aVar);
            for (Field field : a.getClass().getDeclaredFields()) {
                if (field.getAnnotation(C0923a.class) != null) {
                    try {
                        field.setAccessible(true);
                        if (field.get(a) == null) {
                            throw new C4476u(String.format("Missing required attribute %s", new Object[]{field.getName()}));
                        }
                    } catch (IllegalAccessException unused) {
                        throw new C4476u(String.format("Missing required attribute %s", new Object[]{field.getName()}));
                    }
                }
            }
            return a;
        }

        /* renamed from: b */
        public void mo10756b(C4460c cVar, T t) {
            this.f834a.mo10756b(cVar, t);
        }
    }

    /* renamed from: a */
    public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
        return new C4330a0(new C0925a(this, kVar.mo16121g(this, aVar)));
    }
}
