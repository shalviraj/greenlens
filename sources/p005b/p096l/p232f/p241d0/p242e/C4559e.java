package p005b.p096l.p232f.p241d0.p242e;

import java.math.BigInteger;
import p005b.p096l.p232f.C4614h;

/* renamed from: b.l.f.d0.e.e */
public final class C4559e {

    /* renamed from: a */
    public static final char[] f8517a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    public static final char[] f8518b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    public static final BigInteger[] f8519c;

    /* renamed from: b.l.f.d0.e.e$a */
    public enum C4560a {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f8519c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f8519c;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static String m8399a(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f8519c[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C4614h.m8506a();
    }

    /* renamed from: b */
    public static int m8400b(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else {
                if (!(i4 == 900 || i4 == 901 || i4 == 928)) {
                    switch (i4) {
                        case 922:
                        case 923:
                        case 924:
                            break;
                    }
                }
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb.append(m8399a(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        if (r1 != 900) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0140, code lost:
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0142, code lost:
        r14 = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0157 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8401c(int[] r16, int r17, java.lang.StringBuilder r18) {
        /*
            r0 = r18
            r1 = 0
            r2 = r16[r1]
            int r2 = r2 - r17
            r3 = 1
            int r2 = r2 << r3
            int[] r2 = new int[r2]
            r4 = r16[r1]
            int r4 = r4 - r17
            int r4 = r4 << r3
            int[] r4 = new int[r4]
            r5 = r17
            r6 = r1
            r7 = r6
        L_0x0016:
            r8 = r16[r1]
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            if (r5 >= r8) goto L_0x0056
            if (r6 != 0) goto L_0x0056
            int r8 = r5 + 1
            r5 = r16[r5]
            if (r5 >= r10) goto L_0x0033
            int r9 = r5 / 30
            r2[r7] = r9
            int r9 = r7 + 1
            int r5 = r5 % 30
            r2[r9] = r5
            int r7 = r7 + 2
            goto L_0x0045
        L_0x0033:
            if (r5 == r9) goto L_0x004b
            r9 = 928(0x3a0, float:1.3E-42)
            if (r5 == r9) goto L_0x0047
            switch(r5) {
                case 900: goto L_0x0040;
                case 901: goto L_0x0047;
                case 902: goto L_0x0047;
                default: goto L_0x003c;
            }
        L_0x003c:
            switch(r5) {
                case 922: goto L_0x0047;
                case 923: goto L_0x0047;
                case 924: goto L_0x0047;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0045
        L_0x0040:
            int r5 = r7 + 1
            r2[r7] = r10
            r7 = r5
        L_0x0045:
            r5 = r8
            goto L_0x0016
        L_0x0047:
            int r5 = r8 + -1
            r6 = r3
            goto L_0x0016
        L_0x004b:
            r2[r7] = r9
            int r5 = r8 + 1
            r8 = r16[r8]
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x0016
        L_0x0056:
            b.l.f.d0.e.e$a r6 = p005b.p096l.p232f.p241d0.p242e.C4559e.C4560a.MIXED
            b.l.f.d0.e.e$a r8 = p005b.p096l.p232f.p241d0.p242e.C4559e.C4560a.LOWER
            b.l.f.d0.e.e$a r11 = p005b.p096l.p232f.p241d0.p242e.C4559e.C4560a.PUNCT_SHIFT
            b.l.f.d0.e.e$a r12 = p005b.p096l.p232f.p241d0.p242e.C4559e.C4560a.ALPHA
            r13 = r1
            r14 = r12
            r15 = r14
        L_0x0061:
            if (r13 >= r7) goto L_0x015e
            r1 = r2[r13]
            int r9 = r14.ordinal()
            if (r9 == 0) goto L_0x0124
            if (r9 == r3) goto L_0x00ed
            r3 = 2
            if (r9 == r3) goto L_0x00cc
            r3 = 3
            r10 = 29
            if (r9 == r3) goto L_0x00ae
            r3 = 4
            if (r9 == r3) goto L_0x0098
            r3 = 5
            if (r9 == r3) goto L_0x007d
            goto L_0x0118
        L_0x007d:
            if (r1 >= r10) goto L_0x0084
            char[] r3 = f8517a
            char r1 = r3[r1]
            goto L_0x009f
        L_0x0084:
            if (r1 == r10) goto L_0x00c8
            r3 = 900(0x384, float:1.261E-42)
            if (r1 == r3) goto L_0x014e
            r3 = 913(0x391, float:1.28E-42)
            if (r1 == r3) goto L_0x008f
            goto L_0x0095
        L_0x008f:
            r1 = r4[r13]
            char r1 = (char) r1
            r0.append(r1)
        L_0x0095:
            r3 = 900(0x384, float:1.261E-42)
            goto L_0x00a8
        L_0x0098:
            r3 = 26
            if (r1 >= r3) goto L_0x00a2
            int r1 = r1 + 65
            char r1 = (char) r1
        L_0x009f:
            r14 = r15
            goto L_0x012b
        L_0x00a2:
            if (r1 == r3) goto L_0x00ab
            r3 = 900(0x384, float:1.261E-42)
            if (r1 == r3) goto L_0x014e
        L_0x00a8:
            r14 = r15
            goto L_0x0118
        L_0x00ab:
            r14 = r15
            goto L_0x0113
        L_0x00ae:
            r3 = 900(0x384, float:1.261E-42)
            if (r1 >= r10) goto L_0x00b8
            char[] r9 = f8517a
            char r1 = r9[r1]
            goto L_0x012b
        L_0x00b8:
            if (r1 == r10) goto L_0x00c8
            if (r1 == r3) goto L_0x00c8
            r3 = 913(0x391, float:1.28E-42)
            if (r1 == r3) goto L_0x00c5
            r9 = r3
            r3 = 900(0x384, float:1.261E-42)
            goto L_0x0151
        L_0x00c5:
            r1 = r4[r13]
            goto L_0x011f
        L_0x00c8:
            r3 = 900(0x384, float:1.261E-42)
            goto L_0x014e
        L_0x00cc:
            r3 = 25
            if (r1 >= r3) goto L_0x00d5
            char[] r3 = f8518b
            char r1 = r3[r1]
            goto L_0x012b
        L_0x00d5:
            r3 = 900(0x384, float:1.261E-42)
            if (r1 == r3) goto L_0x014e
            r3 = 913(0x391, float:1.28E-42)
            if (r1 == r3) goto L_0x00ea
            switch(r1) {
                case 25: goto L_0x00e7;
                case 26: goto L_0x0113;
                case 27: goto L_0x00e1;
                case 28: goto L_0x00c8;
                case 29: goto L_0x0100;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            goto L_0x0118
        L_0x00e1:
            r3 = 900(0x384, float:1.261E-42)
            r9 = 913(0x391, float:1.28E-42)
            goto L_0x0142
        L_0x00e7:
            b.l.f.d0.e.e$a r14 = p005b.p096l.p232f.p241d0.p242e.C4559e.C4560a.PUNCT
            goto L_0x0118
        L_0x00ea:
            r1 = r4[r13]
            goto L_0x011f
        L_0x00ed:
            r3 = 26
            if (r1 >= r3) goto L_0x00f4
            int r1 = r1 + 97
            goto L_0x012a
        L_0x00f4:
            r3 = 900(0x384, float:1.261E-42)
            if (r1 == r3) goto L_0x014e
            r3 = 913(0x391, float:1.28E-42)
            if (r1 == r3) goto L_0x011d
            switch(r1) {
                case 26: goto L_0x0113;
                case 27: goto L_0x010a;
                case 28: goto L_0x0105;
                case 29: goto L_0x0100;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            goto L_0x0118
        L_0x0100:
            r3 = 900(0x384, float:1.261E-42)
            r9 = 913(0x391, float:1.28E-42)
            goto L_0x013c
        L_0x0105:
            r3 = 900(0x384, float:1.261E-42)
            r9 = 913(0x391, float:1.28E-42)
            goto L_0x0140
        L_0x010a:
            b.l.f.d0.e.e$a r1 = p005b.p096l.p232f.p241d0.p242e.C4559e.C4560a.ALPHA_SHIFT
            r15 = r14
            r3 = 900(0x384, float:1.261E-42)
            r9 = 913(0x391, float:1.28E-42)
            r14 = r1
            goto L_0x0151
        L_0x0113:
            r3 = 900(0x384, float:1.261E-42)
            r9 = 913(0x391, float:1.28E-42)
            goto L_0x0144
        L_0x0118:
            r3 = 900(0x384, float:1.261E-42)
            r9 = 913(0x391, float:1.28E-42)
            goto L_0x0151
        L_0x011d:
            r1 = r4[r13]
        L_0x011f:
            r3 = 900(0x384, float:1.261E-42)
            r9 = 913(0x391, float:1.28E-42)
            goto L_0x0149
        L_0x0124:
            r3 = 26
            if (r1 >= r3) goto L_0x0130
            int r1 = r1 + 65
        L_0x012a:
            char r1 = (char) r1
        L_0x012b:
            r3 = 900(0x384, float:1.261E-42)
            r9 = 913(0x391, float:1.28E-42)
            goto L_0x0152
        L_0x0130:
            r3 = 900(0x384, float:1.261E-42)
            if (r1 == r3) goto L_0x014e
            r9 = 913(0x391, float:1.28E-42)
            if (r1 == r9) goto L_0x0147
            switch(r1) {
                case 26: goto L_0x0144;
                case 27: goto L_0x0142;
                case 28: goto L_0x0140;
                case 29: goto L_0x013c;
                default: goto L_0x013b;
            }
        L_0x013b:
            goto L_0x0151
        L_0x013c:
            r15 = r14
            r1 = 0
            r14 = r11
            goto L_0x0152
        L_0x0140:
            r14 = r6
            goto L_0x0151
        L_0x0142:
            r14 = r8
            goto L_0x0151
        L_0x0144:
            r1 = 32
            goto L_0x0152
        L_0x0147:
            r1 = r4[r13]
        L_0x0149:
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0151
        L_0x014e:
            r9 = 913(0x391, float:1.28E-42)
            r14 = r12
        L_0x0151:
            r1 = 0
        L_0x0152:
            if (r1 == 0) goto L_0x0157
            r0.append(r1)
        L_0x0157:
            int r13 = r13 + 1
            r10 = r3
            r1 = 0
            r3 = 1
            goto L_0x0061
        L_0x015e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p241d0.p242e.C4559e.m8401c(int[], int, java.lang.StringBuilder):int");
    }
}
