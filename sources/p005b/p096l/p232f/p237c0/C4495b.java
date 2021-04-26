package p005b.p096l.p232f.p237c0;

/* renamed from: b.l.f.c0.b */
public final class C4495b extends C4542s {

    /* renamed from: b */
    public static final char[] f8371b;

    /* renamed from: c */
    public static final char[] f8372c = {'T', 'N', '*', 'E'};

    /* renamed from: d */
    public static final char[] f8373d = {'/', ':', '+', '.'};

    /* renamed from: e */
    public static final char f8374e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f8371b = cArr;
        f8374e = cArr[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean[] mo16166d(java.lang.String r11) {
        /*
            r10 = this;
            int r0 = r11.length()
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 >= r3) goto L_0x000f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x0061
        L_0x000f:
            char r0 = r11.charAt(r2)
            char r0 = java.lang.Character.toUpperCase(r0)
            int r3 = r11.length()
            int r3 = r3 - r1
            char r3 = r11.charAt(r3)
            char r3 = java.lang.Character.toUpperCase(r3)
            char[] r4 = f8371b
            boolean r5 = p005b.p096l.p232f.p237c0.C4493a.m8252i(r4, r0)
            boolean r4 = p005b.p096l.p232f.p237c0.C4493a.m8252i(r4, r3)
            char[] r6 = f8372c
            boolean r0 = p005b.p096l.p232f.p237c0.C4493a.m8252i(r6, r0)
            boolean r3 = p005b.p096l.p232f.p237c0.C4493a.m8252i(r6, r3)
            java.lang.String r6 = "Invalid start/end guards: "
            if (r5 == 0) goto L_0x0049
            if (r4 == 0) goto L_0x003f
            goto L_0x0070
        L_0x003f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        L_0x0049:
            if (r0 == 0) goto L_0x0058
            if (r3 == 0) goto L_0x004e
            goto L_0x0070
        L_0x004e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        L_0x0058:
            if (r4 != 0) goto L_0x0142
            if (r3 != 0) goto L_0x0142
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0061:
            char r3 = f8374e
            r0.append(r3)
            r0.append(r11)
            r0.append(r3)
            java.lang.String r11 = r0.toString()
        L_0x0070:
            r0 = 20
            r3 = r1
        L_0x0073:
            int r4 = r11.length()
            int r4 = r4 - r1
            if (r3 >= r4) goto L_0x00c6
            char r4 = r11.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L_0x00c1
            char r4 = r11.charAt(r3)
            r5 = 45
            if (r4 == r5) goto L_0x00c1
            char r4 = r11.charAt(r3)
            r5 = 36
            if (r4 != r5) goto L_0x0095
            goto L_0x00c1
        L_0x0095:
            char[] r4 = f8373d
            char r5 = r11.charAt(r3)
            boolean r4 = p005b.p096l.p232f.p237c0.C4493a.m8252i(r4, r5)
            if (r4 == 0) goto L_0x00a4
            int r0 = r0 + 10
            goto L_0x00c3
        L_0x00a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot encode : '"
            r1.<init>(r2)
            char r11 = r11.charAt(r3)
            r1.append(r11)
            r11 = 39
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L_0x00c1:
            int r0 = r0 + 9
        L_0x00c3:
            int r3 = r3 + 1
            goto L_0x0073
        L_0x00c6:
            int r3 = r11.length()
            int r3 = r3 - r1
            int r3 = r3 + r0
            boolean[] r0 = new boolean[r3]
            r3 = r2
            r4 = r3
        L_0x00d0:
            int r5 = r11.length()
            if (r3 >= r5) goto L_0x0141
            char r5 = r11.charAt(r3)
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r3 == 0) goto L_0x00e7
            int r6 = r11.length()
            int r6 = r6 - r1
            if (r3 != r6) goto L_0x0103
        L_0x00e7:
            r6 = 42
            if (r5 == r6) goto L_0x0101
            r6 = 69
            if (r5 == r6) goto L_0x00fe
            r6 = 78
            if (r5 == r6) goto L_0x00fb
            r6 = 84
            if (r5 == r6) goto L_0x00f8
            goto L_0x0103
        L_0x00f8:
            r5 = 65
            goto L_0x0103
        L_0x00fb:
            r5 = 66
            goto L_0x0103
        L_0x00fe:
            r5 = 68
            goto L_0x0103
        L_0x0101:
            r5 = 67
        L_0x0103:
            r6 = r2
        L_0x0104:
            char[] r7 = p005b.p096l.p232f.p237c0.C4493a.f8362d
            int r8 = r7.length
            if (r6 >= r8) goto L_0x0115
            char r7 = r7[r6]
            if (r5 != r7) goto L_0x0112
            int[] r5 = p005b.p096l.p232f.p237c0.C4493a.f8363e
            r5 = r5[r6]
            goto L_0x0116
        L_0x0112:
            int r6 = r6 + 1
            goto L_0x0104
        L_0x0115:
            r5 = r2
        L_0x0116:
            r7 = r1
            r6 = r2
            r8 = r6
        L_0x0119:
            r9 = 7
            if (r6 >= r9) goto L_0x0133
            r0[r4] = r7
            int r4 = r4 + 1
            int r9 = 6 - r6
            int r9 = r5 >> r9
            r9 = r9 & r1
            if (r9 == 0) goto L_0x012d
            if (r8 != r1) goto L_0x012a
            goto L_0x012d
        L_0x012a:
            int r8 = r8 + 1
            goto L_0x0119
        L_0x012d:
            r7 = r7 ^ 1
            int r6 = r6 + 1
            r8 = r2
            goto L_0x0119
        L_0x0133:
            int r5 = r11.length()
            int r5 = r5 - r1
            if (r3 >= r5) goto L_0x013e
            r0[r4] = r2
            int r4 = r4 + 1
        L_0x013e:
            int r3 = r3 + 1
            goto L_0x00d0
        L_0x0141:
            return r0
        L_0x0142:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p237c0.C4495b.mo16166d(java.lang.String):boolean[]");
    }
}
