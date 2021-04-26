package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.ua */
public abstract class C2521ua implements C2233ib {

    /* renamed from: c */
    public static final int[] f4340c = m4256i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    public int[] f4341a;

    /* renamed from: b */
    public final int f4342b;

    public C2521ua(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f4341a = m4256i(bArr);
            this.f4342b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: f */
    public static void m4253f(int[] iArr, int[] iArr2) {
        int[] iArr3 = f4340c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* renamed from: g */
    public static void m4254g(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m4255h(iArr2, 0, 4, 8, 12);
            m4255h(iArr2, 1, 5, 9, 13);
            m4255h(iArr2, 2, 6, 10, 14);
            m4255h(iArr2, 3, 7, 11, 15);
            m4255h(iArr2, 0, 5, 10, 15);
            m4255h(iArr2, 1, 6, 11, 12);
            m4255h(iArr2, 2, 7, 8, 13);
            m4255h(iArr2, 3, 4, 9, 14);
        }
    }

    /* renamed from: h */
    public static void m4255h(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> -16) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> -12) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> -8) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> -7) | (i15 << 7);
    }

    /* renamed from: i */
    public static int[] m4256i(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* renamed from: a */
    public final byte[] mo12713a(byte[] bArr) {
        return mo13028d(ByteBuffer.wrap(bArr));
    }

    /* renamed from: b */
    public abstract int[] mo12972b(int[] iArr, int i);

    /* renamed from: c */
    public abstract int mo12973c();

    /* renamed from: d */
    public final byte[] mo13028d(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= mo12973c()) {
            byte[] bArr = new byte[mo12973c()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            int remaining = byteBuffer.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer e = mo13029e(bArr, this.f4342b + i2);
                if (i2 == i - 1) {
                    C1960d.m2780b2(allocate, byteBuffer, e, remaining % 64);
                } else {
                    C1960d.m2780b2(allocate, byteBuffer, e, 64);
                }
            }
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: e */
    public final ByteBuffer mo13029e(byte[] bArr, int i) {
        int[] b = mo12972b(m4256i(bArr), i);
        int[] iArr = (int[]) b.clone();
        m4254g(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }
}
