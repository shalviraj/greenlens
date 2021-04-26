package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p131e.p136e.C2072c0;

/* renamed from: b.l.a.c.e.e.d2 */
public abstract class C2099d2<KeyProtoT extends C2072c0> {

    /* renamed from: a */
    public final Class<KeyProtoT> f3704a;

    /* renamed from: b */
    public final Map<Class<?>, C2074c2<?, KeyProtoT>> f3705b;

    /* renamed from: c */
    public final Class<?> f3706c;

    @SafeVarargs
    public C2099d2(Class<KeyProtoT> cls, C2074c2<?, KeyProtoT>... c2VarArr) {
        this.f3704a = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            C2074c2<?, KeyProtoT> c2Var = c2VarArr[i];
            if (hashMap.containsKey(c2Var.f3656a)) {
                String valueOf = String.valueOf(c2Var.f3656a.getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            } else {
                hashMap.put(c2Var.f3656a, c2Var);
                i++;
            }
        }
        this.f3706c = c2VarArr[0].f3656a;
        this.f3705b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public abstract String mo12366a();

    /* renamed from: b */
    public abstract C2056b9 mo12367b();

    /* renamed from: c */
    public abstract KeyProtoT mo12368c(C2317lm lmVar);

    /* renamed from: d */
    public abstract void mo12369d(KeyProtoT keyprotot);

    /* renamed from: e */
    public final <P> P mo12511e(KeyProtoT keyprotot, Class<P> cls) {
        C2074c2 c2Var = this.f3705b.get(cls);
        if (c2Var != null) {
            return c2Var.mo12425a(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException(C0843a.m456q(new StringBuilder(String.valueOf(canonicalName).length() + 41), "Requested primitive class ", canonicalName, " not supported."));
    }

    /* renamed from: f */
    public final Set<Class<?>> mo12512f() {
        return this.f3705b.keySet();
    }

    /* renamed from: g */
    public C2049b2<?, KeyProtoT> mo12370g() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
