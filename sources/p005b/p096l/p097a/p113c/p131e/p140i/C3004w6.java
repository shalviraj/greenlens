package p005b.p096l.p097a.p113c.p131e.p140i;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: b.l.a.c.e.i.w6 */
public final class C3004w6 {

    /* renamed from: c */
    public static final C3004w6 f5106c = new C3004w6();

    /* renamed from: a */
    public final C2714a7 f5107a = new C2822i6();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C3043z6<?>> f5108b = new ConcurrentHashMap();

    /* renamed from: a */
    public final <T> C3043z6<T> mo13896a(Class<T> cls) {
        C2861l6 l6Var;
        C2740c5<?> c5Var;
        C2875m7<?, ?> m7Var;
        C2769e6 e6Var;
        C2965t6 t6Var;
        C2861l6 l6Var2;
        C2875m7<?, ?> m7Var2;
        C2769e6 e6Var2;
        C2965t6 t6Var2;
        C2952s6 s6Var;
        Class<?> cls2;
        Charset charset = C2990v5.f5088a;
        Objects.requireNonNull(cls, "messageType");
        C3043z6<T> z6Var = (C3043z6) this.f5108b.get(cls);
        if (z6Var == null) {
            C2822i6 i6Var = (C2822i6) this.f5107a;
            Objects.requireNonNull(i6Var);
            Class<C2899o5> cls3 = C2899o5.class;
            Class<?> cls4 = C2728b7.f4645a;
            if (cls3.isAssignableFrom(cls) || (cls2 = C2728b7.f4645a) == null || cls2.isAssignableFrom(cls)) {
                C2887n6 b = i6Var.f4840a.mo13347b(cls);
                boolean a = b.mo13455a();
                boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                if (a) {
                    if (isAssignableFrom) {
                        C2875m7<?, ?> m7Var3 = C2728b7.f4648d;
                        C2740c5<?> c5Var2 = C2768e5.f4697a;
                        s6Var = new C2952s6(m7Var3, C2768e5.f4697a, b.mo13456b());
                    } else {
                        C2875m7<?, ?> m7Var4 = C2728b7.f4646b;
                        C2740c5<?> c5Var3 = C2768e5.f4698b;
                        if (c5Var3 != null) {
                            s6Var = new C2952s6(m7Var4, c5Var3, b.mo13456b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    z6Var = s6Var;
                } else {
                    boolean z = false;
                    C2740c5<?> c5Var4 = null;
                    if (isAssignableFrom) {
                        if (b.mo13457c() == 1) {
                            z = true;
                        }
                        if (z) {
                            t6Var2 = C2978u6.f5070b;
                            e6Var2 = C2769e6.f4700b;
                            m7Var2 = C2728b7.f4648d;
                            C2740c5<?> c5Var5 = C2768e5.f4697a;
                            c5Var4 = C2768e5.f4697a;
                        } else {
                            t6Var2 = C2978u6.f5070b;
                            e6Var2 = C2769e6.f4700b;
                            m7Var2 = C2728b7.f4648d;
                        }
                        l6Var2 = C2874m6.f4895b;
                    } else {
                        if (b.mo13457c() == 1) {
                            z = true;
                        }
                        if (z) {
                            C2965t6 t6Var3 = C2978u6.f5069a;
                            C2769e6 e6Var3 = C2769e6.f4699a;
                            C2875m7<?, ?> m7Var5 = C2728b7.f4646b;
                            C2740c5<?> c5Var6 = C2768e5.f4698b;
                            if (c5Var6 != null) {
                                l6Var = C2874m6.f4894a;
                                c5Var = c5Var6;
                                t6Var = t6Var3;
                                m7Var = m7Var5;
                                e6Var = e6Var3;
                                z6Var = C2939r6.m5139B(b, t6Var, e6Var, m7Var, c5Var, l6Var);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            t6Var2 = C2978u6.f5069a;
                            e6Var2 = C2769e6.f4699a;
                            m7Var2 = C2728b7.f4647c;
                            l6Var2 = C2874m6.f4894a;
                        }
                    }
                    l6Var = l6Var2;
                    c5Var = c5Var4;
                    e6Var = e6Var2;
                    m7Var = m7Var2;
                    t6Var = t6Var2;
                    z6Var = C2939r6.m5139B(b, t6Var, e6Var, m7Var, c5Var, l6Var);
                }
                C3043z6<T> putIfAbsent = this.f5108b.putIfAbsent(cls, z6Var);
                return putIfAbsent == null ? z6Var : putIfAbsent;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }
}
