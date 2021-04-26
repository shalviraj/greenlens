package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: b.l.a.c.e.e.l4 */
public final class C2299l4 implements C2536v1 {

    /* renamed from: a */
    public final C2345n2<C2536v1> f4041a;

    public C2299l4(C2345n2<C2536v1> n2Var) {
        this.f4041a = n2Var;
    }

    /* renamed from: a */
    public final byte[] mo12785a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (C2297l2 l2Var : this.f4041a.mo12823a(copyOfRange)) {
                try {
                    return ((C2536v1) l2Var.f4037a).mo12785a(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    Logger logger = C2323m4.f4056a;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(e.toString());
                    logger.logp(level, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", valueOf.length() != 0 ? "ciphertext prefix matches a key, but cannot decrypt: ".concat(valueOf) : new String("ciphertext prefix matches a key, but cannot decrypt: "));
                }
            }
        }
        for (C2297l2 l2Var2 : this.f4041a.mo12823a(C2512u1.f4338a)) {
            try {
                return ((C2536v1) l2Var2.f4037a).mo12785a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
