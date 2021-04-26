package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.f4 */
public final class C2151f4 implements C2464s1 {

    /* renamed from: b */
    public static final ThreadLocal<Cipher> f3851b = new C2126e4();

    /* renamed from: a */
    public final SecretKey f3852a;

    public C2151f4(byte[] bArr) {
        C2426qb.m4029a(bArr.length);
        this.f3852a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo12385a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    /* renamed from: b */
    public final byte[] mo12386b(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (bArr.length >= 28) {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            } catch (ClassNotFoundException unused) {
                if (C1960d.m2843r1()) {
                    algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal<Cipher> threadLocal = f3851b;
            threadLocal.get().init(2, this.f3852a, algorithmParameterSpec);
            if (bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
