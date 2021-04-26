package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.sa */
public final class C2473sa implements C2536v1 {

    /* renamed from: c */
    public static final Collection<Integer> f4277c = Arrays.asList(new Integer[]{64});

    /* renamed from: d */
    public static final byte[] f4278d = new byte[16];

    /* renamed from: a */
    public final C2258jb f4279a;

    /* renamed from: b */
    public final byte[] f4280b;

    public C2473sa(byte[] bArr) {
        Collection<Integer> collection = f4277c;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.f4280b = Arrays.copyOfRange(bArr, i, length);
            this.f4279a = new C2258jb(copyOfRange);
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("invalid key size: ");
        sb.append(length);
        sb.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(sb.toString());
    }

    /* renamed from: a */
    public final byte[] mo12785a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length >= 16) {
            Cipher a = C2058bb.f3637e.mo12428a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr4 = (byte[]) copyOfRange.clone();
            bArr4[8] = (byte) (bArr4[8] & Byte.MAX_VALUE);
            bArr4[12] = (byte) (bArr4[12] & Byte.MAX_VALUE);
            a.init(2, new SecretKeySpec(this.f4280b, "AES"), new IvParameterSpec(bArr4));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = a.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && C1960d.m2843r1()) {
                doFinal = new byte[0];
            }
            byte[][] bArr5 = {bArr2, doFinal};
            byte[] a2 = this.f4279a.mo12741a(f4278d, 16);
            for (char c = 0; c <= 0; c = 1) {
                byte[] bArr6 = bArr5[0];
                if (bArr6 == null) {
                    bArr6 = new byte[0];
                }
                a2 = C1960d.m2808i2(C1960d.m2855u1(a2), this.f4279a.mo12741a(bArr6, 16));
            }
            byte[] bArr7 = bArr5[1];
            int length2 = bArr7.length;
            if (length2 >= 16) {
                int length3 = a2.length;
                if (length2 >= length3) {
                    int i = length2 - length3;
                    bArr3 = Arrays.copyOf(bArr7, length2);
                    for (int i2 = 0; i2 < a2.length; i2++) {
                        int i3 = i + i2;
                        bArr3[i3] = (byte) (bArr3[i3] ^ a2[i2]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                bArr3 = C1960d.m2808i2(C1960d.m2733M1(bArr7), C1960d.m2855u1(a2));
            }
            if (C1960d.m2851t1(copyOfRange, this.f4279a.mo12741a(bArr3, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
