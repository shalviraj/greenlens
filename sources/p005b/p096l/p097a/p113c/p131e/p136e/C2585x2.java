package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: b.l.a.c.e.e.x2 */
public final class C2585x2 {

    /* renamed from: a */
    public static final String f4425a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b */
    public static final String f4426b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated

    /* renamed from: c */
    public static final C2157fa f4427c = C2157fa.m3366s();

    static {
        new C2100d3();
        new C2346n3();
        new C2418q3();
        new C2274k3();
        new C2562w3();
        new C2026a4();
        new C2490t3();
        new C2101d4();
        try {
            m4367a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m4367a() {
        boolean z;
        C2537v2.m4280b(new C2025a3());
        C2348n5.m3800a();
        C2537v2.m4279a(new C2100d3(), true);
        C2537v2.m4279a(new C2346n3(), true);
        C2537v2.m4279a(new C2274k3(), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            z = false;
        }
        if (z) {
            C2537v2.m4279a(new C2418q3(), true);
        }
        C2537v2.m4279a(new C2490t3(), true);
        C2537v2.m4279a(new C2562w3(), true);
        C2537v2.m4279a(new C2026a4(), true);
        C2537v2.m4279a(new C2101d4(), true);
    }
}
