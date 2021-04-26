package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.jb */
public final class C2258jb implements C2420q5 {

    /* renamed from: a */
    public final SecretKey f3956a;

    /* renamed from: b */
    public final byte[] f3957b;

    /* renamed from: c */
    public final byte[] f3958c;

    public C2258jb(byte[] bArr) {
        C2426qb.m4029a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f3956a = secretKeySpec;
        Cipher a = C2058bb.f3637e.mo12428a("AES/ECB/NoPadding");
        a.init(1, secretKeySpec);
        byte[] u1 = C1960d.m2855u1(a.doFinal(new byte[16]));
        this.f3957b = u1;
        this.f3958c = C1960d.m2855u1(u1);
    }

    /* renamed from: a */
    public final byte[] mo12741a(byte[] bArr, int i) {
        if (i <= 16) {
            Cipher a = C2058bb.f3637e.mo12428a("AES/ECB/NoPadding");
            a.init(1, this.f3956a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            byte[] V1 = max * 16 == length ? C1960d.m2760V1(bArr, (max - 1) * 16, this.f3957b, 0, 16) : C1960d.m2808i2(C1960d.m2733M1(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f3958c);
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = a.doFinal(C1960d.m2760V1(bArr2, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(a.doFinal(C1960d.m2808i2(V1, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
