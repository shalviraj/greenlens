package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Arrays;

/* renamed from: b.l.a.c.e.e.rb */
public final class C2450rb extends C2521ua {
    public C2450rb(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: b */
    public final int[] mo12972b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = new int[16];
            C2521ua.m4253f(iArr3, this.f4341a);
            iArr3[12] = iArr[0];
            iArr3[13] = iArr[1];
            iArr3[14] = iArr[2];
            iArr3[15] = iArr[3];
            C2521ua.m4254g(iArr3);
            iArr3[4] = iArr3[12];
            iArr3[5] = iArr3[13];
            iArr3[6] = iArr3[14];
            iArr3[7] = iArr3[15];
            C2521ua.m4253f(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }

    /* renamed from: c */
    public final int mo12973c() {
        return 24;
    }
}
