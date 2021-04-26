package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.v2 */
public final class C2537v2 {

    /* renamed from: a */
    public static final Logger f4360a = Logger.getLogger(C2537v2.class.getName());

    /* renamed from: b */
    public static final ConcurrentMap<String, C2513u2> f4361b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final ConcurrentMap<String, C2489t2> f4362c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentMap<String, Boolean> f4363d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentMap<Class<?>, C2369o2<?, ?>> f4364e = new ConcurrentHashMap();

    static {
        new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static synchronized <KeyProtoT extends C2072c0> void m4279a(C2099d2<KeyProtoT> d2Var, boolean z) {
        synchronized (C2537v2.class) {
            String a = d2Var.mo12366a();
            m4286h(a, d2Var.getClass(), true);
            ConcurrentMap<String, C2513u2> concurrentMap = f4361b;
            if (!concurrentMap.containsKey(a)) {
                concurrentMap.put(a, new C2441r2(d2Var));
                f4362c.put(a, new C2489t2(d2Var));
            }
            f4363d.put(a, Boolean.TRUE);
        }
    }

    /* renamed from: b */
    public static synchronized <B, P> void m4280b(C2369o2<B, P> o2Var) {
        synchronized (C2537v2.class) {
            Class<P> b = o2Var.mo12364b();
            ConcurrentMap<Class<?>, C2369o2<?, ?>> concurrentMap = f4364e;
            if (concurrentMap.containsKey(b)) {
                C2369o2 o2Var2 = (C2369o2) concurrentMap.get(b);
                if (!o2Var.getClass().equals(o2Var2.getClass())) {
                    Logger logger = f4360a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(b);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 56);
                    sb.append("Attempted overwrite of a registered SetWrapper for type ");
                    sb.append(valueOf);
                    logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{b.getName(), o2Var2.getClass().getName(), o2Var.getClass().getName()}));
                }
            }
            concurrentMap.put(b, o2Var);
        }
    }

    /* renamed from: c */
    public static synchronized C2081c9 m4281c(C2181g9 g9Var) {
        C2081c9 c;
        synchronized (C2537v2.class) {
            C2608y1<?> b = m4285g(g9Var.mo12674s()).mo12962b();
            if (((Boolean) f4363d.get(g9Var.mo12674s())).booleanValue()) {
                c = ((C2632z1) b).mo13131c(g9Var.mo12675t());
            } else {
                String valueOf = String.valueOf(g9Var.mo12674s());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return c;
    }

    /* renamed from: d */
    public static synchronized C2072c0 m4282d(C2181g9 g9Var) {
        C2072c0 b;
        synchronized (C2537v2.class) {
            C2608y1<?> b2 = m4285g(g9Var.mo12674s()).mo12962b();
            if (((Boolean) f4363d.get(g9Var.mo12674s())).booleanValue()) {
                b = ((C2632z1) b2).mo13130b(g9Var.mo12675t());
            } else {
                String valueOf = String.valueOf(g9Var.mo12674s());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return b;
    }

    /* renamed from: e */
    public static <P> P m4283e(String str, C2072c0 c0Var, Class<P> cls) {
        C2632z1 z1Var = (C2632z1) m4287i(str, cls);
        String name = z1Var.f4519a.f3704a.getName();
        String concat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (z1Var.f4519a.f3704a.isInstance(c0Var)) {
            return z1Var.mo13132d(c0Var);
        }
        throw new GeneralSecurityException(concat);
    }

    /* renamed from: f */
    public static <P> P m4284f(String str, byte[] bArr, Class<P> cls) {
        C2317lm lmVar = C2317lm.f4051h;
        return m4288j(str, C2317lm.m3705I(bArr, 0, bArr.length), cls);
    }

    /* renamed from: g */
    public static synchronized C2513u2 m4285g(String str) {
        C2513u2 u2Var;
        synchronized (C2537v2.class) {
            ConcurrentMap<String, C2513u2> concurrentMap = f4361b;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            u2Var = (C2513u2) concurrentMap.get(str);
        }
        return u2Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m4286h(java.lang.String r6, java.lang.Class<?> r7, boolean r8) {
        /*
            java.lang.Class<b.l.a.c.e.e.v2> r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2537v2.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, b.l.a.c.e.e.u2> r1 = f4361b     // Catch:{ all -> 0x0089 }
            boolean r2 = r1.containsKey(r6)     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0089 }
            b.l.a.c.e.e.u2 r1 = (p005b.p096l.p097a.p113c.p131e.p136e.C2513u2) r1     // Catch:{ all -> 0x0089 }
            java.lang.Class r2 = r1.mo12963c()     // Catch:{ all -> 0x0089 }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x005f
            java.util.logging.Logger r8 = f4360a     // Catch:{ all -> 0x0089 }
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            int r4 = r6.length()     // Catch:{ all -> 0x0089 }
            if (r4 == 0) goto L_0x002e
            java.lang.String r3 = r3.concat(r6)     // Catch:{ all -> 0x0089 }
            goto L_0x0034
        L_0x002e:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0089 }
            r4.<init>(r3)     // Catch:{ all -> 0x0089 }
            r3 = r4
        L_0x0034:
            java.lang.String r4 = "com.google.crypto.tink.Registry"
            java.lang.String r5 = "ensureKeyManagerInsertable"
            r8.logp(r2, r4, r5, r3)     // Catch:{ all -> 0x0089 }
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0089 }
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0089 }
            r3 = 0
            r2[r3] = r6     // Catch:{ all -> 0x0089 }
            r6 = 1
            java.lang.Class r1 = r1.mo12963c()     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0089 }
            r2[r6] = r1     // Catch:{ all -> 0x0089 }
            r6 = 2
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x0089 }
            r2[r6] = r7     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r6 = java.lang.String.format(r6, r2)     // Catch:{ all -> 0x0089 }
            r8.<init>(r6)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x005f:
            if (r8 == 0) goto L_0x0087
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r7 = f4363d     // Catch:{ all -> 0x0089 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0089 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0089 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0089 }
            if (r7 != 0) goto L_0x0087
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0089 }
            java.lang.String r8 = "New keys are already disallowed for key type "
            int r1 = r6.length()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x007e
            java.lang.String r6 = r8.concat(r6)     // Catch:{ all -> 0x0089 }
            goto L_0x0083
        L_0x007e:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0089 }
            r6.<init>(r8)     // Catch:{ all -> 0x0089 }
        L_0x0083:
            r7.<init>(r6)     // Catch:{ all -> 0x0089 }
            throw r7     // Catch:{ all -> 0x0089 }
        L_0x0087:
            monitor-exit(r0)
            return
        L_0x0089:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2537v2.m4286h(java.lang.String, java.lang.Class, boolean):void");
    }

    /* renamed from: i */
    public static <P> C2608y1<P> m4287i(String str, Class<P> cls) {
        C2513u2 g = m4285g(str);
        if (cls == null) {
            return g.mo12962b();
        }
        if (g.mo12964d().contains(cls)) {
            return g.mo12966f(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(g.mo12963c());
        Set<Class<?>> d = g.mo12964d();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : d) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(C0843a.m441b(name.length(), 77, valueOf.length(), String.valueOf(sb2).length()));
        C0843a.m431G(sb3, "Primitive type ", name, " not supported by key manager of type ", valueOf);
        throw new GeneralSecurityException(C0843a.m455p(sb3, ", supported primitives: ", sb2));
    }

    /* renamed from: j */
    public static <P> P m4288j(String str, C2317lm lmVar, Class<P> cls) {
        return ((C2632z1) m4287i(str, cls)).mo13129a(lmVar);
    }
}
