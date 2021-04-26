package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: b.l.a.c.e.e.z2 */
public final class C2633z2 implements C2464s1 {

    /* renamed from: a */
    public final C2345n2<C2464s1> f4521a;

    public /* synthetic */ C2633z2(C2345n2 n2Var) {
        this.f4521a = n2Var;
    }

    /* renamed from: a */
    public final byte[] mo12385a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    /* renamed from: b */
    public final byte[] mo12386b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (C2297l2 l2Var : this.f4521a.mo12823a(copyOfRange)) {
                try {
                    return ((C2464s1) l2Var.f4037a).mo12386b(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    Logger logger = C2025a3.f3575a;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(e.toString());
                    logger.logp(level, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", valueOf.length() != 0 ? "ciphertext prefix matches a key, but cannot decrypt: ".concat(valueOf) : new String("ciphertext prefix matches a key, but cannot decrypt: "));
                }
            }
        }
        for (C2297l2 l2Var2 : this.f4521a.mo12823a(C2512u1.f4338a)) {
            try {
                return ((C2464s1) l2Var2.f4037a).mo12386b(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
