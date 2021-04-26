package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;

/* renamed from: b.l.a.c.e.e.s4 */
public final class C2467s4 {
    static {
        new C2443r4();
        new C2395p4();
        C2157fa.m3366s();
        C2157fa.m3366s();
        C2157fa.m3366s();
        try {
            m4119a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m4119a() {
        Class<?> e;
        C2537v2.m4280b(new C2515u4());
        C2537v2.m4280b(new C2563w4());
        C2585x2.m4367a();
        C2395p4 p4Var = new C2395p4();
        C2443r4 r4Var = new C2443r4();
        synchronized (C2537v2.class) {
            C2537v2.m4286h("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", p4Var.getClass(), true);
            C2537v2.m4286h("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", r4Var.getClass(), false);
            ConcurrentMap<String, C2513u2> concurrentMap = C2537v2.f4361b;
            if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (e = ((C2513u2) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).mo12965e()) != null) {
                if (!e.equals(r4Var.getClass())) {
                    C2537v2.f4360a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{p4Var.getClass().getName(), e.getName(), r4Var.getClass().getName()}));
                }
            }
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || ((C2513u2) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).mo12965e() == null) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new C2465s2(p4Var, r4Var));
                C2537v2.f4362c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new C2489t2(p4Var));
            }
            ConcurrentMap<String, Boolean> concurrentMap2 = C2537v2.f4363d;
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new C2441r2(r4Var));
            }
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
        }
    }
}
