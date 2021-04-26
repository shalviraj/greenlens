package p376j.p378b.p383c;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* renamed from: j.b.c.h */
public final class C7029h {

    /* renamed from: a */
    public static final char[] f14091a;

    static {
        char[] cArr = new char[512];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | 256] = "0123456789abcdef".charAt(i & 15);
        }
        f14091a = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < 16; i2++) {
            bArr["0123456789abcdef".charAt(i2)] = (byte) i2;
        }
    }

    /* renamed from: a */
    public static void m12633a(byte b, char[] cArr, int i) {
        byte b2 = b & ExifInterface.MARKER;
        char[] cArr2 = f14091a;
        cArr[i] = cArr2[b2];
        cArr[i + 1] = cArr2[b2 | 256];
    }

    /* renamed from: b */
    public static void m12634b(long j, char[] cArr, int i) {
        m12633a((byte) ((int) ((j >> 56) & 255)), cArr, i);
        m12633a((byte) ((int) ((j >> 48) & 255)), cArr, i + 2);
        m12633a((byte) ((int) ((j >> 40) & 255)), cArr, i + 4);
        m12633a((byte) ((int) ((j >> 32) & 255)), cArr, i + 6);
        m12633a((byte) ((int) ((j >> 24) & 255)), cArr, i + 8);
        m12633a((byte) ((int) ((j >> 16) & 255)), cArr, i + 10);
        m12633a((byte) ((int) ((j >> 8) & 255)), cArr, i + 12);
        m12633a((byte) ((int) (j & 255)), cArr, i + 14);
    }
}
