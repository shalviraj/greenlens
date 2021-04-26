package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: b.l.a.c.e.e.j0 */
public final class C2247j0 {

    /* renamed from: c */
    public static final C2247j0 f3951c = new C2247j0();

    /* renamed from: a */
    public final C2343n0 f3952a = new C2510u();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C2319m0<?>> f3953b = new ConcurrentHashMap();

    /* renamed from: a */
    public final <T> C2319m0<T> mo12723a(Class<T> cls) {
        C2582x xVar;
        C2629ym<?> ymVar;
        C2023a1<?, ?> a1Var;
        C2414q qVar;
        C2172g0 g0Var;
        C2582x xVar2;
        C2023a1<?, ?> a1Var2;
        C2414q qVar2;
        C2172g0 g0Var2;
        C2147f0 f0Var;
        Class<?> cls2;
        Charset charset = C2196h.f3910a;
        Objects.requireNonNull(cls, "messageType");
        C2319m0<T> m0Var = (C2319m0) this.f3953b.get(cls);
        if (m0Var == null) {
            C2510u uVar = (C2510u) this.f3952a;
            Objects.requireNonNull(uVar);
            Class<C2071c> cls3 = C2071c.class;
            Class<?> cls4 = C2367o0.f4133a;
            if (cls3.isAssignableFrom(cls) || (cls2 = C2367o0.f4133a) == null || cls2.isAssignableFrom(cls)) {
                C2022a0 b = uVar.f4333a.mo12416b(cls);
                boolean a = b.mo12342a();
                boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                if (a) {
                    if (isAssignableFrom) {
                        C2023a1<?, ?> a1Var3 = C2367o0.f4136d;
                        C2629ym<?> ymVar2 = C2045an.f3613a;
                        f0Var = new C2147f0(a1Var3, C2045an.f3613a, b.mo12343b());
                    } else {
                        C2023a1<?, ?> a1Var4 = C2367o0.f4134b;
                        C2629ym<?> ymVar3 = C2045an.f3614b;
                        if (ymVar3 != null) {
                            f0Var = new C2147f0(a1Var4, ymVar3, b.mo12343b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    m0Var = f0Var;
                } else {
                    boolean z = false;
                    C2629ym<?> ymVar4 = null;
                    if (isAssignableFrom) {
                        if (b.mo12344c() == 1) {
                            z = true;
                        }
                        if (z) {
                            g0Var2 = C2197h0.f3913b;
                            qVar2 = C2414q.f4227b;
                            a1Var2 = C2367o0.f4136d;
                            C2629ym<?> ymVar5 = C2045an.f3613a;
                            ymVar4 = C2045an.f3613a;
                        } else {
                            g0Var2 = C2197h0.f3913b;
                            qVar2 = C2414q.f4227b;
                            a1Var2 = C2367o0.f4136d;
                        }
                        xVar2 = C2606y.f4473b;
                    } else {
                        if (b.mo12344c() == 1) {
                            z = true;
                        }
                        if (z) {
                            C2172g0 g0Var3 = C2197h0.f3912a;
                            C2414q qVar3 = C2414q.f4226a;
                            C2023a1<?, ?> a1Var5 = C2367o0.f4134b;
                            C2629ym<?> ymVar6 = C2045an.f3614b;
                            if (ymVar6 != null) {
                                xVar = C2606y.f4472a;
                                ymVar = ymVar6;
                                g0Var = g0Var3;
                                a1Var = a1Var5;
                                qVar = qVar3;
                                m0Var = C2122e0.m3239F(b, g0Var, qVar, a1Var, ymVar, xVar);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            g0Var2 = C2197h0.f3912a;
                            qVar2 = C2414q.f4226a;
                            a1Var2 = C2367o0.f4135c;
                            xVar2 = C2606y.f4472a;
                        }
                    }
                    xVar = xVar2;
                    ymVar = ymVar4;
                    qVar = qVar2;
                    a1Var = a1Var2;
                    g0Var = g0Var2;
                    m0Var = C2122e0.m3239F(b, g0Var, qVar, a1Var, ymVar, xVar);
                }
                C2319m0<T> putIfAbsent = this.f3953b.putIfAbsent(cls, m0Var);
                return putIfAbsent == null ? m0Var : putIfAbsent;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }
}
