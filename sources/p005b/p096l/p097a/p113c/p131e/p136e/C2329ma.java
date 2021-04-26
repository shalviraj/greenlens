package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: b.l.a.c.e.e.ma */
public final class C2329ma implements C2233ib {

    /* renamed from: d */
    public static final ThreadLocal<Cipher> f4057d = new C2305la();

    /* renamed from: a */
    public final SecretKeySpec f4058a;

    /* renamed from: b */
    public final int f4059b;

    /* renamed from: c */
    public final int f4060c;

    public C2329ma(byte[] bArr, int i) {
        C2426qb.m4029a(bArr.length);
        this.f4058a = new SecretKeySpec(bArr, "AES");
        int blockSize = f4057d.get().getBlockSize();
        this.f4060c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f4059b = i;
    }

    /* renamed from: a */
    public final byte[] mo12713a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f4059b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.f4059b;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            Cipher cipher = f4057d.get();
            byte[] bArr4 = new byte[this.f4060c];
            System.arraycopy(bArr2, 0, bArr4, 0, this.f4059b);
            cipher.init(2, this.f4058a, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i2, i3, bArr3, 0) == i3) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
