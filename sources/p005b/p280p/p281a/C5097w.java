package p005b.p280p.p281a;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5075l;

/* renamed from: b.p.a.w */
public final class C5097w<K, V> extends C5075l<Map<K, V>> {

    /* renamed from: c */
    public static final C5075l.C5076a f9865c = new C5098a();

    /* renamed from: a */
    public final C5075l<K> f9866a;

    /* renamed from: b */
    public final C5075l<V> f9867b;

    /* renamed from: b.p.a.w$a */
    public class C5098a implements C5075l.C5076a {
        /* renamed from: a */
        public C5075l<?> mo16807a(Type type, Set<? extends Annotation> set, C5099x xVar) {
            Class<?> j;
            Type[] typeArr;
            if (!set.isEmpty() || (j = C4805c3.m8811j(type)) != Map.class) {
                return null;
            }
            Class<Object> cls = Object.class;
            Class<String> cls2 = String.class;
            if (type == Properties.class) {
                typeArr = new Type[]{cls2, cls2};
            } else {
                Type k = C4805c3.m8812k(type, j, Map.class);
                typeArr = k instanceof ParameterizedType ? ((ParameterizedType) k).getActualTypeArguments() : new Type[]{cls, cls};
            }
            return new C5097w(xVar, typeArr[0], typeArr[1]).mo16831c();
        }
    }

    public C5097w(C5099x xVar, Type type, Type type2) {
        this.f9866a = xVar.mo16930b(type);
        this.f9867b = xVar.mo16930b(type2);
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C5088v vVar = new C5088v();
        qVar.mo16840e();
        while (qVar.mo16835N()) {
            C5084r rVar = (C5084r) qVar;
            if (rVar.mo16835N()) {
                rVar.f9825p = rVar.mo16860w0();
                rVar.f9822m = 11;
            }
            K a = this.f9866a.mo16804a(qVar);
            V a2 = this.f9867b.mo16804a(qVar);
            Object put = vVar.put(a, a2);
            if (put != null) {
                throw new C5078n("Map key '" + a + "' has multiple values at path " + qVar.mo16834H() + ": " + put + " and " + a2);
            }
        }
        qVar.mo16849z();
        return vVar;
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        uVar.mo16869e();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() != null) {
                int Z = uVar.mo16885Z();
                if (Z == 5 || Z == 3) {
                    uVar.f9835k = true;
                    this.f9866a.mo16805e(uVar, entry.getKey());
                    this.f9867b.mo16805e(uVar, entry.getValue());
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            } else {
                StringBuilder u = C0843a.m460u("Map key is null at ");
                u.append(uVar.mo16884N());
                throw new C5078n(u.toString());
            }
        }
        uVar.mo16864H();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("JsonAdapter(");
        u.append(this.f9866a);
        u.append("=");
        u.append(this.f9867b);
        u.append(")");
        return u.toString();
    }
}
