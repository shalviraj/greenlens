package p005b.p096l.p232f.p246e0.p247c;

import java.io.UnsupportedEncodingException;
import p005b.p096l.p232f.C4614h;
import p005b.p096l.p232f.p258y.C4659c;

/* renamed from: b.l.f.e0.c.d */
public final class C4591d {

    /* renamed from: a */
    public static final char[] f8596a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: a */
    public static void m8462a(C4659c cVar, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (cVar.mo16343a() >= 11) {
                int b = cVar.mo16344b(11);
                sb.append(m8467f(b / 45));
                sb.append(m8467f(b % 45));
                i -= 2;
            } else {
                throw C4614h.m8506a();
            }
        }
        if (i == 1) {
            if (cVar.mo16343a() >= 6) {
                sb.append(m8467f(cVar.mo16344b(6)));
            } else {
                throw C4614h.m8506a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x013f, code lost:
        if (r1 == 2) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0143, code lost:
        if ((r17 * 10) >= r0) goto L_0x014d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8463b(p005b.p096l.p232f.p258y.C4659c r21, java.lang.StringBuilder r22, int r23, p005b.p096l.p232f.p258y.C4660d r24, java.util.Collection<byte[]> r25, java.util.Map<p005b.p096l.p232f.C4577e, ?> r26) {
        /*
            r0 = r23
            r1 = r26
            int r2 = r0 << 3
            int r3 = r21.mo16343a()
            if (r2 > r3) goto L_0x0175
            byte[] r2 = new byte[r0]
            r3 = 0
            r4 = r3
        L_0x0010:
            if (r4 >= r0) goto L_0x0020
            r5 = 8
            r6 = r21
            int r5 = r6.mo16344b(r5)
            byte r5 = (byte) r5
            r2[r4] = r5
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0020:
            if (r24 != 0) goto L_0x0158
            java.lang.String r4 = p005b.p096l.p232f.p258y.C4666j.f8850a
            if (r1 == 0) goto L_0x003a
            b.l.f.e r4 = p005b.p096l.p232f.C4577e.CHARACTER_SET
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L_0x003a
            java.lang.Object r0 = r1.get(r4)
            java.lang.String r0 = r0.toString()
            r20 = r2
            goto L_0x015e
        L_0x003a:
            r1 = 2
            r4 = 3
            r5 = 1
            if (r0 <= r4) goto L_0x0053
            byte r6 = r2[r3]
            r7 = -17
            if (r6 != r7) goto L_0x0053
            byte r6 = r2[r5]
            r7 = -69
            if (r6 != r7) goto L_0x0053
            byte r6 = r2[r1]
            r7 = -65
            if (r6 != r7) goto L_0x0053
            r6 = r5
            goto L_0x0054
        L_0x0053:
            r6 = r3
        L_0x0054:
            r1 = r3
            r9 = r1
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r17 = r15
            r18 = r17
            r19 = r18
            r7 = r5
            r8 = r7
        L_0x0064:
            if (r9 >= r0) goto L_0x0113
            if (r5 != 0) goto L_0x006c
            if (r7 != 0) goto L_0x006c
            if (r8 == 0) goto L_0x0113
        L_0x006c:
            byte r4 = r2[r9]
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r8 == 0) goto L_0x00a0
            r20 = r2
            r2 = r4 & 128(0x80, float:1.794E-43)
            if (r10 <= 0) goto L_0x007d
            if (r2 == 0) goto L_0x009e
            int r10 = r10 + -1
            goto L_0x00a2
        L_0x007d:
            if (r2 == 0) goto L_0x00a2
            r2 = r4 & 64
            if (r2 == 0) goto L_0x009e
            int r10 = r10 + 1
            r2 = r4 & 32
            if (r2 != 0) goto L_0x008c
            int r12 = r12 + 1
            goto L_0x00a2
        L_0x008c:
            int r10 = r10 + 1
            r2 = r4 & 16
            if (r2 != 0) goto L_0x0095
            int r13 = r13 + 1
            goto L_0x00a2
        L_0x0095:
            int r10 = r10 + 1
            r2 = r4 & 8
            if (r2 != 0) goto L_0x009e
            int r14 = r14 + 1
            goto L_0x00a2
        L_0x009e:
            r8 = 0
            goto L_0x00a2
        L_0x00a0:
            r20 = r2
        L_0x00a2:
            r2 = 127(0x7f, float:1.78E-43)
            if (r5 == 0) goto L_0x00c0
            if (r4 <= r2) goto L_0x00ae
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 >= r2) goto L_0x00ae
            r5 = 0
            goto L_0x00c0
        L_0x00ae:
            r2 = 159(0x9f, float:2.23E-43)
            if (r4 <= r2) goto L_0x00c0
            r2 = 192(0xc0, float:2.69E-43)
            if (r4 < r2) goto L_0x00be
            r2 = 215(0xd7, float:3.01E-43)
            if (r4 == r2) goto L_0x00be
            r2 = 247(0xf7, float:3.46E-43)
            if (r4 != r2) goto L_0x00c0
        L_0x00be:
            int r17 = r17 + 1
        L_0x00c0:
            if (r7 == 0) goto L_0x010c
            if (r11 <= 0) goto L_0x00d4
            r2 = 64
            if (r4 < r2) goto L_0x010b
            r2 = 127(0x7f, float:1.78E-43)
            if (r4 == r2) goto L_0x010b
            r2 = 252(0xfc, float:3.53E-43)
            if (r4 <= r2) goto L_0x00d1
            goto L_0x010b
        L_0x00d1:
            int r11 = r11 + -1
            goto L_0x010c
        L_0x00d4:
            r2 = 128(0x80, float:1.794E-43)
            if (r4 == r2) goto L_0x010b
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 == r2) goto L_0x010b
            r2 = 239(0xef, float:3.35E-43)
            if (r4 <= r2) goto L_0x00e1
            goto L_0x010b
        L_0x00e1:
            r2 = 160(0xa0, float:2.24E-43)
            if (r4 <= r2) goto L_0x00f5
            r2 = 224(0xe0, float:3.14E-43)
            if (r4 >= r2) goto L_0x00f5
            int r1 = r1 + 1
            int r2 = r19 + 1
            if (r2 <= r15) goto L_0x00f0
            r15 = r2
        L_0x00f0:
            r19 = r2
            r18 = 0
            goto L_0x010c
        L_0x00f5:
            r2 = 127(0x7f, float:1.78E-43)
            if (r4 <= r2) goto L_0x0106
            int r11 = r11 + 1
            int r2 = r18 + 1
            if (r2 <= r3) goto L_0x0103
            r3 = r2
            r18 = r3
            goto L_0x0108
        L_0x0103:
            r18 = r2
            goto L_0x0108
        L_0x0106:
            r18 = 0
        L_0x0108:
            r19 = 0
            goto L_0x010c
        L_0x010b:
            r7 = 0
        L_0x010c:
            int r9 = r9 + 1
            r2 = r20
            r4 = 3
            goto L_0x0064
        L_0x0113:
            r20 = r2
            if (r8 == 0) goto L_0x011a
            if (r10 <= 0) goto L_0x011a
            r8 = 0
        L_0x011a:
            if (r7 == 0) goto L_0x0121
            if (r11 <= 0) goto L_0x0121
            r16 = 0
            goto L_0x0123
        L_0x0121:
            r16 = r7
        L_0x0123:
            if (r8 == 0) goto L_0x012c
            if (r6 != 0) goto L_0x0152
            int r12 = r12 + r13
            int r12 = r12 + r14
            if (r12 <= 0) goto L_0x012c
            goto L_0x0152
        L_0x012c:
            if (r16 == 0) goto L_0x0138
            boolean r2 = p005b.p096l.p232f.p258y.C4666j.f8851b
            if (r2 != 0) goto L_0x014d
            r2 = 3
            if (r15 >= r2) goto L_0x014d
            if (r3 < r2) goto L_0x0138
            goto L_0x014d
        L_0x0138:
            if (r5 == 0) goto L_0x0146
            if (r16 == 0) goto L_0x0146
            r2 = 2
            if (r15 != r2) goto L_0x0141
            if (r1 == r2) goto L_0x014d
        L_0x0141:
            int r1 = r17 * 10
            if (r1 < r0) goto L_0x0148
            goto L_0x014d
        L_0x0146:
            if (r5 == 0) goto L_0x014b
        L_0x0148:
            java.lang.String r0 = "ISO8859_1"
            goto L_0x015e
        L_0x014b:
            if (r16 == 0) goto L_0x0150
        L_0x014d:
            java.lang.String r0 = "SJIS"
            goto L_0x015e
        L_0x0150:
            if (r8 == 0) goto L_0x0155
        L_0x0152:
            java.lang.String r0 = "UTF8"
            goto L_0x015e
        L_0x0155:
            java.lang.String r0 = p005b.p096l.p232f.p258y.C4666j.f8850a
            goto L_0x015e
        L_0x0158:
            r20 = r2
            java.lang.String r0 = r24.name()
        L_0x015e:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r2 = r20
            r1.<init>(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r0 = r22
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0170 }
            r0 = r25
            r0.add(r2)
            return
        L_0x0170:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x0175:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p246e0.p247c.C4591d.m8463b(b.l.f.y.c, java.lang.StringBuilder, int, b.l.f.y.d, java.util.Collection, java.util.Map):void");
    }

    /* renamed from: c */
    public static void m8464c(C4659c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo16343a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int b = cVar.mo16344b(13);
                int i3 = (b % 96) | ((b / 96) << 8);
                int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw C4614h.m8506a();
            }
        } else {
            throw C4614h.m8506a();
        }
    }

    /* renamed from: d */
    public static void m8465d(C4659c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo16343a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int b = cVar.mo16344b(13);
                int i3 = (b % 192) | ((b / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw C4614h.m8506a();
            }
        } else {
            throw C4614h.m8506a();
        }
    }

    /* renamed from: e */
    public static void m8466e(C4659c cVar, StringBuilder sb, int i) {
        while (i >= 3) {
            if (cVar.mo16343a() >= 10) {
                int b = cVar.mo16344b(10);
                if (b < 1000) {
                    sb.append(m8467f(b / 100));
                    sb.append(m8467f((b / 10) % 10));
                    sb.append(m8467f(b % 10));
                    i -= 3;
                } else {
                    throw C4614h.m8506a();
                }
            } else {
                throw C4614h.m8506a();
            }
        }
        if (i == 2) {
            if (cVar.mo16343a() >= 7) {
                int b2 = cVar.mo16344b(7);
                if (b2 < 100) {
                    sb.append(m8467f(b2 / 10));
                    sb.append(m8467f(b2 % 10));
                    return;
                }
                throw C4614h.m8506a();
            }
            throw C4614h.m8506a();
        } else if (i != 1) {
        } else {
            if (cVar.mo16343a() >= 4) {
                int b3 = cVar.mo16344b(4);
                if (b3 < 10) {
                    sb.append(m8467f(b3));
                    return;
                }
                throw C4614h.m8506a();
            }
            throw C4614h.m8506a();
        }
    }

    /* renamed from: f */
    public static char m8467f(int i) {
        char[] cArr = f8596a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C4614h.m8506a();
    }
}
