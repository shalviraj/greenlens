package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.exifinterface.media.ExifInterface;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: b.l.a.c.e.e.pa */
public final class C2401pa implements C2464s1 {

    /* renamed from: e */
    public static final ThreadLocal<Cipher> f4193e = new C2353na();

    /* renamed from: f */
    public static final ThreadLocal<Cipher> f4194f = new C2377oa();

    /* renamed from: a */
    public final byte[] f4195a;

    /* renamed from: b */
    public final byte[] f4196b;

    /* renamed from: c */
    public final SecretKeySpec f4197c;

    /* renamed from: d */
    public final int f4198d;

    public C2401pa(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.f4198d = i;
            C2426qb.m4029a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f4197c = secretKeySpec;
            Cipher cipher = f4193e.get();
            cipher.init(1, secretKeySpec);
            byte[] d = m3998d(cipher.doFinal(new byte[16]));
            this.f4195a = d;
            this.f4196b = m3998d(d);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    /* renamed from: c */
    public static byte[] m3997c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: d */
    public static byte[] m3998d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & ExifInterface.MARKER) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    /* renamed from: a */
    public final byte[] mo12385a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    /* renamed from: b */
    public final byte[] mo12386b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = (length - this.f4198d) - 16;
        if (i >= 0) {
            Cipher cipher = f4193e.get();
            cipher.init(1, this.f4197c);
            Cipher cipher2 = cipher;
            byte[] e = mo12912e(cipher2, 0, bArr, 0, this.f4198d);
            byte[] e2 = mo12912e(cipher2, 1, bArr2, 0, bArr2.length);
            byte[] e3 = mo12912e(cipher, 2, bArr, this.f4198d, i);
            int i2 = length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[i2 + i3] ^ e2[i3]) ^ e[i3]) ^ e3[i3]));
            }
            if (b == 0) {
                Cipher cipher3 = f4194f.get();
                cipher3.init(1, this.f4197c, new IvParameterSpec(e));
                return cipher3.doFinal(bArr, this.f4198d, i);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: e */
    public final byte[] mo12912e(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m3997c(bArr3, this.f4195a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m3997c(copyOfRange, this.f4195a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f4196b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m3997c(doFinal, bArr2));
    }
}
