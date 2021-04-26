package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.ta */
public final class C2497ta extends C2521ua {
    public C2497ta(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: b */
    public final int[] mo12972b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            C2521ua.m4253f(iArr2, this.f4341a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }

    /* renamed from: c */
    public final int mo12973c() {
        return 12;
    }
}
