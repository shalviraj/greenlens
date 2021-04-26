package p005b.p082j.p083a.p084a.p087q;

import java.util.Arrays;

/* renamed from: b.j.a.a.q.a */
public final class C1535a {

    /* renamed from: a */
    public static final char[] f2441a;

    /* renamed from: b */
    public static final byte[] f2442b;

    /* renamed from: c */
    public static final int[] f2443c;

    /* renamed from: d */
    public static final int[] f2444d;

    /* renamed from: e */
    public static final int[] f2445e;

    /* renamed from: f */
    public static final int[] f2446f;

    /* renamed from: g */
    public static final int[] f2447g;

    /* renamed from: h */
    public static final int[] f2448h;

    /* renamed from: i */
    public static final int[] f2449i;

    /* renamed from: b.j.a.a.q.a$a */
    public static class C1536a {

        /* renamed from: b */
        public static final C1536a f2450b = new C1536a();

        /* renamed from: a */
        public int[][] f2451a = new int[128][];
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f2441a = charArray;
        int length = charArray.length;
        f2442b = new byte[length];
        for (int i = 0; i < length; i++) {
            f2442b[i] = (byte) f2441a[i];
        }
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f2443c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i3 = 128; i3 < 256; i3++) {
            iArr2[i3] = (i3 & 224) == 192 ? 2 : (i3 & 240) == 224 ? 3 : (i3 & 248) == 240 ? 4 : -1;
        }
        f2444d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i4 = 33; i4 < 256; i4++) {
            if (Character.isJavaIdentifierPart((char) i4)) {
                iArr3[i4] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f2445e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f2446f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f2444d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f2447g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        int[] iArr8 = new int[128];
        for (int i5 = 0; i5 < 32; i5++) {
            iArr8[i5] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f2448h = iArr8;
        int[] iArr9 = new int[256];
        f2449i = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i6 = 0; i6 < 10; i6++) {
            f2449i[i6 + 48] = i6;
        }
        for (int i7 = 0; i7 < 6; i7++) {
            int[] iArr10 = f2449i;
            int i8 = i7 + 10;
            iArr10[i7 + 97] = i8;
            iArr10[i7 + 65] = i8;
        }
    }

    /* renamed from: a */
    public static int[] m1848a(int i) {
        if (i == 34) {
            return f2448h;
        }
        C1536a aVar = C1536a.f2450b;
        int[] iArr = aVar.f2451a[i];
        if (iArr == null) {
            iArr = Arrays.copyOf(f2448h, 128);
            if (iArr[i] == 0) {
                iArr[i] = -1;
            }
            aVar.f2451a[i] = iArr;
        }
        return iArr;
    }
}
