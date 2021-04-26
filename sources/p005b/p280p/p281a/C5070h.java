package p005b.p280p.p281a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5075l;

/* renamed from: b.p.a.h */
public abstract class C5070h<C extends Collection<T>, T> extends C5075l<C> {

    /* renamed from: b */
    public static final C5075l.C5076a f9796b = new C5071a();

    /* renamed from: a */
    public final C5075l<T> f9797a;

    /* renamed from: b.p.a.h$a */
    public class C5071a implements C5075l.C5076a {
        /* renamed from: a */
        public C5075l<?> mo16807a(Type type, Set<? extends Annotation> set, C5099x xVar) {
            C5075l iVar;
            Class<?> j = C4805c3.m8811j(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (j == List.class || j == Collection.class) {
                iVar = new C5072i(xVar.mo16930b(C4805c3.m8804c(type, Collection.class)));
            } else if (j != Set.class) {
                return null;
            } else {
                iVar = new C5073j(xVar.mo16930b(C4805c3.m8804c(type, Collection.class)));
            }
            return iVar.mo16831c();
        }
    }

    public C5070h(C5075l lVar, C5071a aVar) {
        this.f9797a = lVar;
    }

    /* renamed from: f */
    public C mo16804a(C5081q qVar) {
        C g = mo16826g();
        qVar.mo16839d();
        while (qVar.mo16835N()) {
            g.add(this.f9797a.mo16804a(qVar));
        }
        qVar.mo16847q();
        return g;
    }

    /* renamed from: g */
    public abstract C mo16826g();

    /* renamed from: h */
    public void mo16805e(C5087u uVar, C c) {
        uVar.mo16868d();
        for (Object e : c) {
            this.f9797a.mo16805e(uVar, e);
        }
        uVar.mo16880z();
    }

    public String toString() {
        return this.f9797a + ".collection()";
    }
}
