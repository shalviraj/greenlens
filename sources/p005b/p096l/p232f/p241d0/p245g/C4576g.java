package p005b.p096l.p232f.p241d0.p245g;

import androidx.exifinterface.media.ExifInterface;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: b.l.f.d0.g.g */
public final class C4576g {

    /* renamed from: a */
    public static final byte[] f8561a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, ExifInterface.START_CODE, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    public static final byte[] f8562b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, ExifInterface.START_CODE, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c */
    public static final byte[] f8563c;

    /* renamed from: d */
    public static final byte[] f8564d = new byte[128];

    /* renamed from: e */
    public static final Charset f8565e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        f8563c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f8561a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f8563c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f8564d, (byte) -1);
        while (true) {
            byte[] bArr3 = f8562b;
            if (i < bArr3.length) {
                byte b2 = bArr3[i];
                if (b2 > 0) {
                    f8564d[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m8436a(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        sb.append((i2 == 1 && i3 == 0) ? 913 : i2 % 6 == 0 ? (char) 924 : 901);
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & ExifInterface.MARKER));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & ExifInterface.MARKER));
            i4++;
        }
    }

    /* renamed from: b */
    public static void m8437b(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            int length = sb2.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r10 == ' ') goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d8 A[EDGE_INSN: B:73:0x00d8->B:58:0x00d8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0011 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8438c(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = r20
            r8 = r6
        L_0x0011:
            int r9 = r17 + r8
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            if (r7 == 0) goto L_0x00a1
            if (r7 == r5) goto L_0x007c
            r11 = -1
            if (r7 == r4) goto L_0x003b
            byte[] r9 = f8564d
            byte r12 = r9[r10]
            if (r12 == r11) goto L_0x0030
            r11 = r5
            goto L_0x0031
        L_0x0030:
            r11 = r6
        L_0x0031:
            if (r11 == 0) goto L_0x0037
            byte r9 = r9[r10]
            goto L_0x00d0
        L_0x0037:
            r3.append(r15)
            goto L_0x0050
        L_0x003b:
            boolean r12 = m8442g(r10)
            if (r12 == 0) goto L_0x0047
            byte[] r9 = f8563c
            byte r9 = r9[r10]
            goto L_0x00d0
        L_0x0047:
            boolean r12 = m8440e(r10)
            if (r12 == 0) goto L_0x0052
            r3.append(r13)
        L_0x0050:
            r7 = r6
            goto L_0x0011
        L_0x0052:
            boolean r12 = m8439d(r10)
            if (r12 == 0) goto L_0x005a
            goto L_0x00b7
        L_0x005a:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x0074
            char r9 = r0.charAt(r9)
            byte[] r12 = f8564d
            byte r9 = r12[r9]
            if (r9 == r11) goto L_0x006a
            r9 = r5
            goto L_0x006b
        L_0x006a:
            r9 = r6
        L_0x006b:
            if (r9 == 0) goto L_0x0074
            r7 = 3
            r9 = 25
            r3.append(r9)
            goto L_0x0011
        L_0x0074:
            r3.append(r15)
            byte[] r9 = f8564d
            byte r9 = r9[r10]
            goto L_0x00d0
        L_0x007c:
            boolean r9 = m8439d(r10)
            if (r9 == 0) goto L_0x0088
            if (r10 != r12) goto L_0x0085
            goto L_0x00a9
        L_0x0085:
            int r10 = r10 + -97
            goto L_0x00af
        L_0x0088:
            boolean r9 = m8440e(r10)
            if (r9 == 0) goto L_0x0092
            r3.append(r14)
            goto L_0x00ad
        L_0x0092:
            boolean r9 = m8442g(r10)
            if (r9 == 0) goto L_0x0099
            goto L_0x00c3
        L_0x0099:
            r3.append(r15)
            byte[] r9 = f8564d
            byte r9 = r9[r10]
            goto L_0x00d0
        L_0x00a1:
            boolean r9 = m8440e(r10)
            if (r9 == 0) goto L_0x00b1
            if (r10 != r12) goto L_0x00ad
        L_0x00a9:
            r3.append(r11)
            goto L_0x00d4
        L_0x00ad:
            int r10 = r10 + -65
        L_0x00af:
            char r9 = (char) r10
            goto L_0x00d1
        L_0x00b1:
            boolean r9 = m8439d(r10)
            if (r9 == 0) goto L_0x00bd
        L_0x00b7:
            r3.append(r14)
            r7 = r5
            goto L_0x0011
        L_0x00bd:
            boolean r9 = m8442g(r10)
            if (r9 == 0) goto L_0x00c9
        L_0x00c3:
            r3.append(r13)
            r7 = r4
            goto L_0x0011
        L_0x00c9:
            r3.append(r15)
            byte[] r9 = f8564d
            byte r9 = r9[r10]
        L_0x00d0:
            char r9 = (char) r9
        L_0x00d1:
            r3.append(r9)
        L_0x00d4:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0011
            int r0 = r3.length()
            r1 = r6
            r8 = r1
        L_0x00de:
            if (r1 >= r0) goto L_0x00fc
            int r9 = r1 % 2
            if (r9 == 0) goto L_0x00e6
            r9 = r5
            goto L_0x00e7
        L_0x00e6:
            r9 = r6
        L_0x00e7:
            if (r9 == 0) goto L_0x00f5
            int r8 = r8 * 30
            char r9 = r3.charAt(r1)
            int r9 = r9 + r8
            char r8 = (char) r9
            r2.append(r8)
            goto L_0x00f9
        L_0x00f5:
            char r8 = r3.charAt(r1)
        L_0x00f9:
            int r1 = r1 + 1
            goto L_0x00de
        L_0x00fc:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x0106
            int r8 = r8 * 30
            int r8 = r8 + r15
            char r0 = (char) r8
            r2.append(r0)
        L_0x0106:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p241d0.p245g.C4576g.m8438c(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: d */
    public static boolean m8439d(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m8440e(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m8441f(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: g */
    public static boolean m8442g(char c) {
        return f8563c[c] != -1;
    }
}
