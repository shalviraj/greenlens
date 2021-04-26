package p005b.p082j.p083a.p084a.p087q;

/* renamed from: b.j.a.a.q.d */
public final class C1539d {

    /* renamed from: a */
    public static final C1539d f2460a = new C1539d();

    static {
        C1535a.f2441a.clone();
        C1535a.f2442b.clone();
    }

    /* renamed from: a */
    public static void m1853a(int i) {
        throw new IllegalArgumentException(C1545j.m1870d(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012d, code lost:
        if (r7 != null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0133, code lost:
        return java.util.Arrays.copyOfRange(r2, 0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0134, code lost:
        r7.f2613j = r6;
        r15 = r7.f2611h + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0139, code lost:
        if (r15 != 0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013e, code lost:
        r0 = new byte[r15];
        r1 = r7.f2610g.iterator();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014b, code lost:
        if (r1.hasNext() == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014d, code lost:
        r3 = (byte[]) r1.next();
        r5 = r3.length;
        java.lang.System.arraycopy(r3, 0, r0, r2, r5);
        r2 = r2 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0159, code lost:
        java.lang.System.arraycopy(r7.f2612i, 0, r0, r2, r7.f2613j);
        r2 = r2 + r7.f2613j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0163, code lost:
        if (r2 != r15) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016b, code lost:
        if (r7.f2610g.isEmpty() != false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016d, code lost:
        r7.f2611h = 0;
        r7.f2613j = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0177, code lost:
        if (r7.f2610g.isEmpty() != false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0179, code lost:
        r7.f2610g.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018f, code lost:
        throw new java.lang.RuntimeException(p005b.p035e.p036a.p037a.C0843a.m447h("Internal error: total len assumed to be ", r15, ", copied ", r2, " bytes"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return p005b.p082j.p083a.p084a.p090t.C1561c.f2609k;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0121 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo11542b(java.lang.String r15) {
        /*
            r14 = this;
            int r0 = r15.length()
            r1 = 200(0xc8, float:2.8E-43)
            byte[] r2 = new byte[r1]
            r3 = 0
            r4 = 0
            r7 = r3
            r5 = r4
            r6 = r5
        L_0x000d:
            if (r5 >= r0) goto L_0x012d
            int r8 = r5 + 1
            char r5 = r15.charAt(r5)
        L_0x0015:
            r9 = 127(0x7f, float:1.78E-43)
            if (r5 > r9) goto L_0x0040
            if (r6 < r1) goto L_0x002c
            if (r7 != 0) goto L_0x0022
            b.j.a.a.t.c r7 = new b.j.a.a.t.c
            r7.<init>(r2, r6)
        L_0x0022:
            r7.mo11687d()
            byte[] r1 = r7.f2612i
            int r2 = r1.length
            r6 = r4
            r13 = r2
            r2 = r1
            r1 = r13
        L_0x002c:
            int r9 = r6 + 1
            byte r5 = (byte) r5
            r2[r6] = r5
            if (r8 < r0) goto L_0x0036
            r6 = r9
            goto L_0x012d
        L_0x0036:
            int r5 = r8 + 1
            char r6 = r15.charAt(r8)
            r8 = r5
            r5 = r6
            r6 = r9
            goto L_0x0015
        L_0x0040:
            if (r7 != 0) goto L_0x0047
            b.j.a.a.t.c r7 = new b.j.a.a.t.c
            r7.<init>(r2, r6)
        L_0x0047:
            if (r6 < r1) goto L_0x0050
            r7.mo11687d()
            byte[] r2 = r7.f2612i
            int r1 = r2.length
            r6 = r4
        L_0x0050:
            r9 = 2048(0x800, float:2.87E-42)
            if (r5 >= r9) goto L_0x005f
            int r9 = r6 + 1
            int r10 = r5 >> 6
            r10 = r10 | 192(0xc0, float:2.69E-43)
            byte r10 = (byte) r10
            r2[r6] = r10
            goto L_0x0112
        L_0x005f:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r9) goto L_0x00f4
            r10 = 57343(0xdfff, float:8.0355E-41)
            if (r5 <= r10) goto L_0x006b
            goto L_0x00f4
        L_0x006b:
            r11 = 56319(0xdbff, float:7.892E-41)
            if (r5 > r11) goto L_0x00f0
            if (r8 >= r0) goto L_0x00ec
            int r11 = r8 + 1
            char r8 = r15.charAt(r8)
            r12 = 56320(0xdc00, float:7.8921E-41)
            if (r8 < r12) goto L_0x00c4
            if (r8 > r10) goto L_0x00c4
            r10 = 65536(0x10000, float:9.18355E-41)
            int r5 = r5 - r9
            int r5 = r5 << 10
            int r5 = r5 + r10
            int r8 = r8 - r12
            int r5 = r5 + r8
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r5 > r8) goto L_0x00c0
            int r8 = r6 + 1
            int r9 = r5 >> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            if (r8 < r1) goto L_0x009e
            r7.mo11687d()
            byte[] r2 = r7.f2612i
            int r1 = r2.length
            r8 = r4
        L_0x009e:
            int r6 = r8 + 1
            int r9 = r5 >> 12
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r8] = r9
            if (r6 < r1) goto L_0x00b2
            r7.mo11687d()
            byte[] r2 = r7.f2612i
            int r1 = r2.length
            r6 = r4
        L_0x00b2:
            int r8 = r6 + 1
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            r6 = r5
            r5 = r11
            goto L_0x0115
        L_0x00c0:
            m1853a(r5)
            throw r3
        L_0x00c4:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Broken surrogate pair: first char 0x"
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            java.lang.String r1 = java.lang.Integer.toHexString(r5)
            r0.append(r1)
            java.lang.String r1 = ", second 0x"
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r8)
            r0.append(r1)
            java.lang.String r1 = "; illegal combination"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x00ec:
            m1853a(r5)
            throw r3
        L_0x00f0:
            m1853a(r5)
            throw r3
        L_0x00f4:
            int r9 = r6 + 1
            int r10 = r5 >> 12
            r10 = r10 | 224(0xe0, float:3.14E-43)
            byte r10 = (byte) r10
            r2[r6] = r10
            if (r9 < r1) goto L_0x0106
            r7.mo11687d()
            byte[] r2 = r7.f2612i
            int r1 = r2.length
            r9 = r4
        L_0x0106:
            int r6 = r9 + 1
            int r10 = r5 >> 6
            r10 = r10 & 63
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            r2[r9] = r10
            r9 = r6
        L_0x0112:
            r6 = r5
            r5 = r8
            r8 = r9
        L_0x0115:
            if (r8 < r1) goto L_0x0121
            r7.mo11687d()
            byte[] r1 = r7.f2612i
            int r2 = r1.length
            r8 = r4
            r13 = r2
            r2 = r1
            r1 = r13
        L_0x0121:
            int r9 = r8 + 1
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r2[r8] = r6
            r6 = r9
            goto L_0x000d
        L_0x012d:
            if (r7 != 0) goto L_0x0134
            byte[] r15 = java.util.Arrays.copyOfRange(r2, r4, r6)
            return r15
        L_0x0134:
            r7.f2613j = r6
            int r15 = r7.f2611h
            int r15 = r15 + r6
            if (r15 != 0) goto L_0x013e
            byte[] r15 = p005b.p082j.p083a.p084a.p090t.C1561c.f2609k
            goto L_0x017f
        L_0x013e:
            byte[] r0 = new byte[r15]
            java.util.LinkedList<byte[]> r1 = r7.f2610g
            java.util.Iterator r1 = r1.iterator()
            r2 = r4
        L_0x0147:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0159
            java.lang.Object r3 = r1.next()
            byte[] r3 = (byte[]) r3
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r4, r0, r2, r5)
            int r2 = r2 + r5
            goto L_0x0147
        L_0x0159:
            byte[] r1 = r7.f2612i
            int r3 = r7.f2613j
            java.lang.System.arraycopy(r1, r4, r0, r2, r3)
            int r1 = r7.f2613j
            int r2 = r2 + r1
            if (r2 != r15) goto L_0x0180
            java.util.LinkedList<byte[]> r15 = r7.f2610g
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x017e
            r7.f2611h = r4
            r7.f2613j = r4
            java.util.LinkedList<byte[]> r15 = r7.f2610g
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x017e
            java.util.LinkedList<byte[]> r15 = r7.f2610g
            r15.clear()
        L_0x017e:
            r15 = r0
        L_0x017f:
            return r15
        L_0x0180:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error: total len assumed to be "
            java.lang.String r3 = ", copied "
            java.lang.String r4 = " bytes"
            java.lang.String r15 = p005b.p035e.p036a.p037a.C0843a.m447h(r1, r15, r3, r2, r4)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p087q.C1539d.mo11542b(java.lang.String):byte[]");
    }
}
