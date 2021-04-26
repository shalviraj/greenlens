package p005b.p096l.p232f.p237c0;

import java.util.Map;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4613g;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.c0.d */
public final class C4526d extends C4542s {

    /* renamed from: b.l.f.c0.d$a */
    public enum C4527a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r6 = r6.charAt(r7);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p096l.p232f.p237c0.C4526d.C4527a m8314f(java.lang.CharSequence r6, int r7) {
        /*
            b.l.f.c0.d$a r0 = p005b.p096l.p232f.p237c0.C4526d.C4527a.ONE_DIGIT
            b.l.f.c0.d$a r1 = p005b.p096l.p232f.p237c0.C4526d.C4527a.UNCODABLE
            int r2 = r6.length()
            if (r7 < r2) goto L_0x000b
            return r1
        L_0x000b:
            char r3 = r6.charAt(r7)
            r4 = 241(0xf1, float:3.38E-43)
            if (r3 != r4) goto L_0x0016
            b.l.f.c0.d$a r6 = p005b.p096l.p232f.p237c0.C4526d.C4527a.FNC_1
            return r6
        L_0x0016:
            r4 = 48
            if (r3 < r4) goto L_0x0031
            r5 = 57
            if (r3 <= r5) goto L_0x001f
            goto L_0x0031
        L_0x001f:
            int r7 = r7 + 1
            if (r7 < r2) goto L_0x0024
            return r0
        L_0x0024:
            char r6 = r6.charAt(r7)
            if (r6 < r4) goto L_0x0030
            if (r6 <= r5) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            b.l.f.c0.d$a r6 = p005b.p096l.p232f.p237c0.C4526d.C4527a.TWO_DIGITS
            return r6
        L_0x0030:
            return r0
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p237c0.C4526d.m8314f(java.lang.CharSequence, int):b.l.f.c0.d$a");
    }

    /* renamed from: a */
    public C4658b mo16167a(String str, C4484a aVar, int i, int i2, Map<C4613g, ?> map) {
        if (aVar == C4484a.CODE_128) {
            return super.mo16167a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r7 == 101) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r4 <= 244) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (m8314f(r0, r5 + 3) == r11) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009d, code lost:
        if (r12 == r10) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a8, code lost:
        if (r13 == r11) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e4, code lost:
        r9 = r15;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0036 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean[] mo16166d(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            int r1 = r17.length()
            if (r1 <= 0) goto L_0x014f
            r2 = 80
            if (r1 > r2) goto L_0x014f
            r3 = 0
        L_0x000d:
            if (r3 >= r1) goto L_0x002d
            char r4 = r0.charAt(r3)
            switch(r4) {
                case 241: goto L_0x001a;
                case 242: goto L_0x001a;
                case 243: goto L_0x001a;
                case 244: goto L_0x001a;
                default: goto L_0x0016;
            }
        L_0x0016:
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 > r5) goto L_0x001d
        L_0x001a:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x001d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "Bad character in input: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x002d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
        L_0x0036:
            if (r5 >= r1) goto L_0x0108
            b.l.f.c0.d$a r10 = p005b.p096l.p232f.p237c0.C4526d.C4527a.ONE_DIGIT
            b.l.f.c0.d$a r11 = p005b.p096l.p232f.p237c0.C4526d.C4527a.TWO_DIGITS
            b.l.f.c0.d$a r12 = p005b.p096l.p232f.p237c0.C4526d.C4527a.FNC_1
            b.l.f.c0.d$a r13 = m8314f(r0, r5)
            r14 = 32
            r15 = 100
            r2 = 101(0x65, float:1.42E-43)
            r9 = 96
            if (r13 != r10) goto L_0x004f
            if (r7 != r2) goto L_0x00ab
            goto L_0x0070
        L_0x004f:
            b.l.f.c0.d$a r4 = p005b.p096l.p232f.p237c0.C4526d.C4527a.UNCODABLE
            if (r13 != r4) goto L_0x006c
            int r4 = r17.length()
            if (r5 >= r4) goto L_0x00ab
            char r4 = r0.charAt(r5)
            if (r4 < r14) goto L_0x0070
            if (r7 != r2) goto L_0x00ab
            if (r4 < r9) goto L_0x0070
            r10 = 241(0xf1, float:3.38E-43)
            if (r4 < r10) goto L_0x00ab
            r10 = 244(0xf4, float:3.42E-43)
            if (r4 > r10) goto L_0x00ab
            goto L_0x0070
        L_0x006c:
            if (r7 != r2) goto L_0x0072
            if (r13 != r12) goto L_0x0072
        L_0x0070:
            r14 = r2
            goto L_0x00ac
        L_0x0072:
            r14 = 99
            if (r7 != r14) goto L_0x0077
            goto L_0x00ac
        L_0x0077:
            if (r7 != r15) goto L_0x00a0
            if (r13 != r12) goto L_0x007c
            goto L_0x00ab
        L_0x007c:
            int r13 = r5 + 2
            b.l.f.c0.d$a r13 = m8314f(r0, r13)
            if (r13 == r4) goto L_0x00ab
            if (r13 != r10) goto L_0x0087
            goto L_0x00ab
        L_0x0087:
            if (r13 != r12) goto L_0x0092
            int r4 = r5 + 3
            b.l.f.c0.d$a r4 = m8314f(r0, r4)
            if (r4 != r11) goto L_0x00ab
            goto L_0x00ac
        L_0x0092:
            int r4 = r5 + 4
        L_0x0094:
            b.l.f.c0.d$a r12 = m8314f(r0, r4)
            if (r12 != r11) goto L_0x009d
            int r4 = r4 + 2
            goto L_0x0094
        L_0x009d:
            if (r12 != r10) goto L_0x00ac
            goto L_0x00ab
        L_0x00a0:
            if (r13 != r12) goto L_0x00a8
            int r4 = r5 + 1
            b.l.f.c0.d$a r13 = m8314f(r0, r4)
        L_0x00a8:
            if (r13 != r11) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r14 = r15
        L_0x00ac:
            if (r14 != r7) goto L_0x00e8
            char r4 = r0.charAt(r5)
            switch(r4) {
                case 241: goto L_0x00bf;
                case 242: goto L_0x00bc;
                case 243: goto L_0x00ba;
                case 244: goto L_0x00b6;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            goto L_0x00c2
        L_0x00b6:
            if (r7 != r2) goto L_0x00e4
            r15 = r2
            goto L_0x00e4
        L_0x00ba:
            r2 = 1
            goto L_0x00e6
        L_0x00bc:
            r15 = 97
            goto L_0x00e4
        L_0x00bf:
            r15 = 102(0x66, float:1.43E-43)
            goto L_0x00e4
        L_0x00c2:
            if (r7 == r15) goto L_0x00de
            if (r7 == r2) goto L_0x00d3
            int r2 = r5 + 2
            java.lang.String r2 = r0.substring(r5, r2)
            int r15 = java.lang.Integer.parseInt(r2)
            int r5 = r5 + 1
            goto L_0x00e4
        L_0x00d3:
            char r2 = r0.charAt(r5)
            int r15 = r2 + -32
            if (r15 >= 0) goto L_0x00e4
            int r15 = r15 + 96
            goto L_0x00e4
        L_0x00de:
            char r2 = r0.charAt(r5)
            int r15 = r2 + -32
        L_0x00e4:
            r9 = r15
            goto L_0x00ba
        L_0x00e6:
            int r5 = r5 + r2
            goto L_0x00f9
        L_0x00e8:
            if (r7 != 0) goto L_0x00f7
            if (r14 == r15) goto L_0x00f4
            if (r14 == r2) goto L_0x00f1
            r9 = 105(0x69, float:1.47E-43)
            goto L_0x00f8
        L_0x00f1:
            r9 = 103(0x67, float:1.44E-43)
            goto L_0x00f8
        L_0x00f4:
            r9 = 104(0x68, float:1.46E-43)
            goto L_0x00f8
        L_0x00f7:
            r9 = r14
        L_0x00f8:
            r7 = r14
        L_0x00f9:
            int[][] r2 = p005b.p096l.p232f.p237c0.C4497c.f8375a
            r2 = r2[r9]
            r3.add(r2)
            int r9 = r9 * r8
            int r6 = r6 + r9
            if (r5 == 0) goto L_0x0036
            int r8 = r8 + 1
            goto L_0x0036
        L_0x0108:
            r2 = 103(0x67, float:1.44E-43)
            int r6 = r6 % r2
            int[][] r0 = p005b.p096l.p232f.p237c0.C4497c.f8375a
            r1 = r0[r6]
            r3.add(r1)
            r1 = 106(0x6a, float:1.49E-43)
            r0 = r0[r1]
            r3.add(r0)
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x011e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0134
            java.lang.Object r2 = r0.next()
            int[] r2 = (int[]) r2
            int r4 = r2.length
            r5 = 0
        L_0x012c:
            if (r5 >= r4) goto L_0x011e
            r6 = r2[r5]
            int r1 = r1 + r6
            int r5 = r5 + 1
            goto L_0x012c
        L_0x0134:
            boolean[] r0 = new boolean[r1]
            java.util.Iterator r1 = r3.iterator()
            r2 = 0
        L_0x013b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x014e
            java.lang.Object r3 = r1.next()
            int[] r3 = (int[]) r3
            r4 = 1
            int r3 = p005b.p096l.p232f.p237c0.C4542s.m8357b(r0, r2, r3, r4)
            int r2 = r2 + r3
            goto L_0x013b
        L_0x014e:
            return r0
        L_0x014f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Contents length should be between 1 and 80 characters, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p237c0.C4526d.mo16166d(java.lang.String):boolean[]");
    }
}
