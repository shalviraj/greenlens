package p005b.p096l.p232f.p237c0.p238c0.p239f.p240d;

import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.c0.f.d.s */
public final class C4525s {

    /* renamed from: a */
    public final C4657a f8438a;

    /* renamed from: b */
    public final C4518m f8439b = new C4518m();

    /* renamed from: c */
    public final StringBuilder f8440c = new StringBuilder();

    public C4525s(C4657a aVar) {
        this.f8438a = aVar;
    }

    /* renamed from: d */
    public static int m8308d(C4657a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo16323f(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: a */
    public String mo16196a(StringBuilder sb, int i) {
        String str = null;
        while (true) {
            C4521o b = mo16197b(i, str);
            String a = C4524r.m8305a(b.f8427b);
            if (a != null) {
                sb.append(a);
            }
            String valueOf = b.f8429d ? String.valueOf(b.f8428c) : null;
            int i2 = b.f8432a;
            if (i == i2) {
                return sb.toString();
            }
            i = i2;
            str = valueOf;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (r5 >= 63) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017b, code lost:
        if (r5 >= 253) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x00f3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0257 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0368 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ec A[LOOP:1: B:10:0x0035->B:50:0x00ec, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0182  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4521o mo16197b(int r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.StringBuilder r2 = r0.f8440c
            r3 = 0
            r2.setLength(r3)
            if (r1 == 0) goto L_0x0011
            java.lang.StringBuilder r2 = r0.f8440c
            r2.append(r1)
        L_0x0011:
            b.l.f.c0.c0.f.d.m r1 = r0.f8439b
            r2 = r17
            r1.f8420a = r2
            b.l.f.c0.c0.f.d.m$a r1 = p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4518m.C4519a.NUMERIC
            b.l.f.c0.c0.f.d.m$a r2 = p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4518m.C4519a.ISO_IEC_646
            b.l.f.c0.c0.f.d.m$a r4 = p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4518m.C4519a.ALPHA
        L_0x001d:
            b.l.f.c0.c0.f.d.m r5 = r0.f8439b
            int r6 = r5.f8420a
            b.l.f.c0.c0.f.d.m$a r5 = r5.f8421b
            if (r5 != r4) goto L_0x0027
            r8 = 1
            goto L_0x0028
        L_0x0027:
            r8 = r3
        L_0x0028:
            r9 = 15
            r10 = 16
            r12 = 32
            r13 = 63
            r3 = 36
            r14 = 5
            if (r8 == 0) goto L_0x0130
        L_0x0035:
            b.l.f.c0.c0.f.d.m r5 = r0.f8439b
            int r5 = r5.f8420a
            int r8 = r5 + 5
            b.l.f.y.a r15 = r0.f8438a
            int r7 = r15.f8786h
            r11 = 6
            if (r8 <= r7) goto L_0x0043
            goto L_0x005f
        L_0x0043:
            int r7 = m8308d(r15, r5, r14)
            if (r7 < r14) goto L_0x004c
            if (r7 >= r10) goto L_0x004c
            goto L_0x005d
        L_0x004c:
            int r7 = r5 + 6
            b.l.f.y.a r8 = r0.f8438a
            int r15 = r8.f8786h
            if (r7 <= r15) goto L_0x0055
            goto L_0x005f
        L_0x0055:
            int r5 = m8308d(r8, r5, r11)
            if (r5 < r10) goto L_0x005f
            if (r5 >= r13) goto L_0x005f
        L_0x005d:
            r5 = 1
            goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            if (r5 == 0) goto L_0x00f3
            b.l.f.c0.c0.f.d.m r5 = r0.f8439b
            int r5 = r5.f8420a
            b.l.f.y.a r7 = r0.f8438a
            int r7 = m8308d(r7, r5, r14)
            if (r7 != r9) goto L_0x0076
            b.l.f.c0.c0.f.d.n r7 = new b.l.f.c0.c0.f.d.n
            int r5 = r5 + 5
            r7.<init>(r5, r3)
            goto L_0x0086
        L_0x0076:
            if (r7 < r14) goto L_0x0089
            if (r7 >= r9) goto L_0x0089
            b.l.f.c0.c0.f.d.n r8 = new b.l.f.c0.c0.f.d.n
            int r5 = r5 + 5
            int r7 = r7 + 48
            int r7 = r7 - r14
            char r7 = (char) r7
            r8.<init>(r5, r7)
            r7 = r8
        L_0x0086:
            r8 = 58
            goto L_0x00ca
        L_0x0089:
            b.l.f.y.a r7 = r0.f8438a
            int r7 = m8308d(r7, r5, r11)
            r8 = 58
            if (r7 < r12) goto L_0x00a1
            if (r7 >= r8) goto L_0x00a1
            b.l.f.c0.c0.f.d.n r11 = new b.l.f.c0.c0.f.d.n
            int r5 = r5 + 6
            int r7 = r7 + 33
            char r7 = (char) r7
            r11.<init>(r5, r7)
        L_0x009f:
            r7 = r11
            goto L_0x00ca
        L_0x00a1:
            switch(r7) {
                case 58: goto L_0x00c0;
                case 59: goto L_0x00bd;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00b7;
                case 62: goto L_0x00b4;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r3 = "Decoding invalid alphanumeric value: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2)
            throw r1
        L_0x00b4:
            r7 = 47
            goto L_0x00c2
        L_0x00b7:
            r7 = 46
            goto L_0x00c2
        L_0x00ba:
            r7 = 45
            goto L_0x00c2
        L_0x00bd:
            r7 = 44
            goto L_0x00c2
        L_0x00c0:
            r7 = 42
        L_0x00c2:
            b.l.f.c0.c0.f.d.n r11 = new b.l.f.c0.c0.f.d.n
            int r5 = r5 + 6
            r11.<init>(r5, r7)
            goto L_0x009f
        L_0x00ca:
            b.l.f.c0.c0.f.d.m r5 = r0.f8439b
            int r11 = r7.f8432a
            r5.f8420a = r11
            char r5 = r7.f8426b
            if (r5 != r3) goto L_0x00d6
            r7 = 1
            goto L_0x00d7
        L_0x00d6:
            r7 = 0
        L_0x00d7:
            if (r7 == 0) goto L_0x00ec
            b.l.f.c0.c0.f.d.o r3 = new b.l.f.c0.c0.f.d.o
            java.lang.StringBuilder r5 = r0.f8440c
            java.lang.String r5 = r5.toString()
            r3.<init>(r11, r5)
            b.l.f.c0.c0.f.d.l r5 = new b.l.f.c0.c0.f.d.l
            r7 = 1
            r5.<init>(r3, r7)
            goto L_0x0292
        L_0x00ec:
            java.lang.StringBuilder r7 = r0.f8440c
            r7.append(r5)
            goto L_0x0035
        L_0x00f3:
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            int r3 = r3.f8420a
            boolean r3 = r0.mo16199e(r3)
            if (r3 == 0) goto L_0x0108
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            r5 = 3
            r3.mo16195a(r5)
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            r3.f8421b = r1
            goto L_0x0127
        L_0x0108:
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            int r3 = r3.f8420a
            boolean r3 = r0.mo16200f(r3)
            if (r3 == 0) goto L_0x0127
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            int r5 = r3.f8420a
            int r5 = r5 + r14
            b.l.f.y.a r7 = r0.f8438a
            int r7 = r7.f8786h
            if (r5 >= r7) goto L_0x0121
            r3.mo16195a(r14)
            goto L_0x0123
        L_0x0121:
            r3.f8420a = r7
        L_0x0123:
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            r3.f8421b = r2
        L_0x0127:
            b.l.f.c0.c0.f.d.l r5 = new b.l.f.c0.c0.f.d.l
            r3 = 0
            r7 = 0
            r5.<init>(r3, r7)
            goto L_0x0292
        L_0x0130:
            r8 = 58
            if (r5 != r2) goto L_0x0136
            r5 = 1
            goto L_0x0137
        L_0x0136:
            r5 = 0
        L_0x0137:
            r7 = 7
            if (r5 == 0) goto L_0x0298
        L_0x013a:
            b.l.f.c0.c0.f.d.m r5 = r0.f8439b
            int r5 = r5.f8420a
            int r11 = r5 + 5
            b.l.f.y.a r15 = r0.f8438a
            int r8 = r15.f8786h
            r12 = 116(0x74, float:1.63E-43)
            r13 = 64
            r3 = 8
            if (r11 <= r8) goto L_0x014d
            goto L_0x017f
        L_0x014d:
            int r8 = m8308d(r15, r5, r14)
            if (r8 < r14) goto L_0x0156
            if (r8 >= r10) goto L_0x0156
            goto L_0x017d
        L_0x0156:
            int r8 = r5 + 7
            b.l.f.y.a r11 = r0.f8438a
            int r15 = r11.f8786h
            if (r8 <= r15) goto L_0x015f
            goto L_0x017f
        L_0x015f:
            int r8 = m8308d(r11, r5, r7)
            if (r8 < r13) goto L_0x0168
            if (r8 >= r12) goto L_0x0168
            goto L_0x017d
        L_0x0168:
            int r8 = r5 + 8
            b.l.f.y.a r11 = r0.f8438a
            int r15 = r11.f8786h
            if (r8 <= r15) goto L_0x0171
            goto L_0x017f
        L_0x0171:
            int r5 = m8308d(r11, r5, r3)
            r8 = 232(0xe8, float:3.25E-43)
            if (r5 < r8) goto L_0x017f
            r8 = 253(0xfd, float:3.55E-43)
            if (r5 >= r8) goto L_0x017f
        L_0x017d:
            r5 = 1
            goto L_0x0180
        L_0x017f:
            r5 = 0
        L_0x0180:
            if (r5 == 0) goto L_0x0257
            b.l.f.c0.c0.f.d.m r5 = r0.f8439b
            int r5 = r5.f8420a
            b.l.f.y.a r8 = r0.f8438a
            int r8 = m8308d(r8, r5, r14)
            if (r8 != r9) goto L_0x0199
            b.l.f.c0.c0.f.d.n r3 = new b.l.f.c0.c0.f.d.n
            int r5 = r5 + 5
            r8 = 36
            r3.<init>(r5, r8)
            goto L_0x0226
        L_0x0199:
            if (r8 < r14) goto L_0x01aa
            if (r8 >= r9) goto L_0x01aa
            b.l.f.c0.c0.f.d.n r3 = new b.l.f.c0.c0.f.d.n
            int r5 = r5 + 5
            int r8 = r8 + 48
            int r8 = r8 - r14
            char r8 = (char) r8
            r3.<init>(r5, r8)
            goto L_0x0226
        L_0x01aa:
            b.l.f.y.a r8 = r0.f8438a
            int r8 = m8308d(r8, r5, r7)
            r11 = 90
            if (r8 < r13) goto L_0x01c2
            if (r8 >= r11) goto L_0x01c2
            b.l.f.c0.c0.f.d.n r3 = new b.l.f.c0.c0.f.d.n
            int r5 = r5 + 7
            int r8 = r8 + 1
            char r8 = (char) r8
            r3.<init>(r5, r8)
            goto L_0x0226
        L_0x01c2:
            if (r8 < r11) goto L_0x01d2
            if (r8 >= r12) goto L_0x01d2
            b.l.f.c0.c0.f.d.n r3 = new b.l.f.c0.c0.f.d.n
            int r5 = r5 + 7
            int r8 = r8 + 7
            char r8 = (char) r8
            r3.<init>(r5, r8)
            goto L_0x0226
        L_0x01d2:
            b.l.f.y.a r8 = r0.f8438a
            int r3 = m8308d(r8, r5, r3)
            switch(r3) {
                case 232: goto L_0x021c;
                case 233: goto L_0x0219;
                case 234: goto L_0x0216;
                case 235: goto L_0x0213;
                case 236: goto L_0x0210;
                case 237: goto L_0x020d;
                case 238: goto L_0x020a;
                case 239: goto L_0x0207;
                case 240: goto L_0x0204;
                case 241: goto L_0x0201;
                case 242: goto L_0x01fe;
                case 243: goto L_0x01fb;
                case 244: goto L_0x01f8;
                case 245: goto L_0x01f5;
                case 246: goto L_0x01f2;
                case 247: goto L_0x01ef;
                case 248: goto L_0x01ec;
                case 249: goto L_0x01e9;
                case 250: goto L_0x01e6;
                case 251: goto L_0x01e3;
                case 252: goto L_0x01e0;
                default: goto L_0x01db;
            }
        L_0x01db:
            b.l.f.h r1 = p005b.p096l.p232f.C4614h.m8506a()
            throw r1
        L_0x01e0:
            r3 = 32
            goto L_0x021e
        L_0x01e3:
            r3 = 95
            goto L_0x021e
        L_0x01e6:
            r3 = 63
            goto L_0x021e
        L_0x01e9:
            r3 = 62
            goto L_0x021e
        L_0x01ec:
            r3 = 61
            goto L_0x021e
        L_0x01ef:
            r3 = 60
            goto L_0x021e
        L_0x01f2:
            r3 = 59
            goto L_0x021e
        L_0x01f5:
            r3 = 58
            goto L_0x021e
        L_0x01f8:
            r3 = 47
            goto L_0x021e
        L_0x01fb:
            r3 = 46
            goto L_0x021e
        L_0x01fe:
            r3 = 45
            goto L_0x021e
        L_0x0201:
            r3 = 44
            goto L_0x021e
        L_0x0204:
            r3 = 43
            goto L_0x021e
        L_0x0207:
            r3 = 42
            goto L_0x021e
        L_0x020a:
            r3 = 41
            goto L_0x021e
        L_0x020d:
            r3 = 40
            goto L_0x021e
        L_0x0210:
            r3 = 39
            goto L_0x021e
        L_0x0213:
            r3 = 38
            goto L_0x021e
        L_0x0216:
            r3 = 37
            goto L_0x021e
        L_0x0219:
            r3 = 34
            goto L_0x021e
        L_0x021c:
            r3 = 33
        L_0x021e:
            b.l.f.c0.c0.f.d.n r8 = new b.l.f.c0.c0.f.d.n
            int r5 = r5 + 8
            r8.<init>(r5, r3)
            r3 = r8
        L_0x0226:
            b.l.f.c0.c0.f.d.m r5 = r0.f8439b
            int r8 = r3.f8432a
            r5.f8420a = r8
            char r3 = r3.f8426b
            r5 = 36
            if (r3 != r5) goto L_0x0234
            r11 = 1
            goto L_0x0235
        L_0x0234:
            r11 = 0
        L_0x0235:
            if (r11 == 0) goto L_0x0249
            b.l.f.c0.c0.f.d.o r3 = new b.l.f.c0.c0.f.d.o
            java.lang.StringBuilder r5 = r0.f8440c
            java.lang.String r5 = r5.toString()
            r3.<init>(r8, r5)
            b.l.f.c0.c0.f.d.l r5 = new b.l.f.c0.c0.f.d.l
            r7 = 1
            r5.<init>(r3, r7)
            goto L_0x0292
        L_0x0249:
            java.lang.StringBuilder r8 = r0.f8440c
            r8.append(r3)
            r3 = r5
            r8 = 58
            r12 = 32
            r13 = 63
            goto L_0x013a
        L_0x0257:
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            int r3 = r3.f8420a
            boolean r3 = r0.mo16199e(r3)
            if (r3 == 0) goto L_0x026c
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            r5 = 3
            r3.mo16195a(r5)
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            r3.f8421b = r1
            goto L_0x028b
        L_0x026c:
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            int r3 = r3.f8420a
            boolean r3 = r0.mo16200f(r3)
            if (r3 == 0) goto L_0x028b
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            int r5 = r3.f8420a
            int r5 = r5 + r14
            b.l.f.y.a r7 = r0.f8438a
            int r7 = r7.f8786h
            if (r5 >= r7) goto L_0x0285
            r3.mo16195a(r14)
            goto L_0x0287
        L_0x0285:
            r3.f8420a = r7
        L_0x0287:
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            r3.f8421b = r4
        L_0x028b:
            b.l.f.c0.c0.f.d.l r5 = new b.l.f.c0.c0.f.d.l
            r3 = 0
            r7 = 0
            r5.<init>(r3, r7)
        L_0x0292:
            boolean r3 = r5.f8419b
            r7 = 0
            r8 = 1
            goto L_0x03a0
        L_0x0298:
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            int r3 = r3.f8420a
            int r5 = r3 + 7
            b.l.f.y.a r8 = r0.f8438a
            int r8 = r8.f8786h
            if (r5 <= r8) goto L_0x02ab
            int r3 = r3 + 4
            if (r3 > r8) goto L_0x02a9
            goto L_0x02b8
        L_0x02a9:
            r3 = 0
            goto L_0x02c3
        L_0x02ab:
            r5 = r3
        L_0x02ac:
            int r8 = r3 + 3
            if (r5 >= r8) goto L_0x02bd
            b.l.f.y.a r8 = r0.f8438a
            boolean r8 = r8.mo16323f(r5)
            if (r8 == 0) goto L_0x02ba
        L_0x02b8:
            r3 = 1
            goto L_0x02c3
        L_0x02ba:
            int r5 = r5 + 1
            goto L_0x02ac
        L_0x02bd:
            b.l.f.y.a r3 = r0.f8438a
            boolean r3 = r3.mo16323f(r8)
        L_0x02c3:
            r5 = 4
            if (r3 == 0) goto L_0x0368
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            int r3 = r3.f8420a
            int r8 = r3 + 7
            b.l.f.y.a r9 = r0.f8438a
            int r10 = r9.f8786h
            r11 = 10
            if (r8 <= r10) goto L_0x02f1
            int r3 = m8308d(r9, r3, r5)
            if (r3 != 0) goto L_0x02e4
            b.l.f.c0.c0.f.d.p r3 = new b.l.f.c0.c0.f.d.p
            b.l.f.y.a r5 = r0.f8438a
            int r5 = r5.f8786h
            r3.<init>(r5, r11, r11)
            goto L_0x0301
        L_0x02e4:
            b.l.f.c0.c0.f.d.p r5 = new b.l.f.c0.c0.f.d.p
            b.l.f.y.a r8 = r0.f8438a
            int r8 = r8.f8786h
            int r3 = r3 + -1
            r5.<init>(r8, r3, r11)
            r3 = r5
            goto L_0x0301
        L_0x02f1:
            int r3 = m8308d(r9, r3, r7)
            int r3 = r3 + -8
            int r5 = r3 / 11
            int r3 = r3 % 11
            b.l.f.c0.c0.f.d.p r9 = new b.l.f.c0.c0.f.d.p
            r9.<init>(r8, r5, r3)
            r3 = r9
        L_0x0301:
            b.l.f.c0.c0.f.d.m r5 = r0.f8439b
            int r8 = r3.f8432a
            r5.f8420a = r8
            int r5 = r3.f8430b
            if (r5 != r11) goto L_0x030d
            r9 = 1
            goto L_0x030e
        L_0x030d:
            r9 = 0
        L_0x030e:
            if (r9 == 0) goto L_0x033b
            int r5 = r3.f8431c
            if (r5 != r11) goto L_0x0316
            r5 = 1
            goto L_0x0317
        L_0x0316:
            r5 = 0
        L_0x0317:
            if (r5 == 0) goto L_0x0325
            b.l.f.c0.c0.f.d.o r3 = new b.l.f.c0.c0.f.d.o
            java.lang.StringBuilder r5 = r0.f8440c
            java.lang.String r5 = r5.toString()
            r3.<init>(r8, r5)
            goto L_0x0333
        L_0x0325:
            b.l.f.c0.c0.f.d.o r5 = new b.l.f.c0.c0.f.d.o
            java.lang.StringBuilder r7 = r0.f8440c
            java.lang.String r7 = r7.toString()
            int r3 = r3.f8431c
            r5.<init>(r8, r7, r3)
            r3 = r5
        L_0x0333:
            b.l.f.c0.c0.f.d.l r5 = new b.l.f.c0.c0.f.d.l
            r7 = 1
            r5.<init>(r3, r7)
            r8 = r7
            goto L_0x035e
        L_0x033b:
            java.lang.StringBuilder r8 = r0.f8440c
            r8.append(r5)
            int r3 = r3.f8431c
            if (r3 != r11) goto L_0x0346
            r5 = 1
            goto L_0x0347
        L_0x0346:
            r5 = 0
        L_0x0347:
            if (r5 == 0) goto L_0x0360
            b.l.f.c0.c0.f.d.o r3 = new b.l.f.c0.c0.f.d.o
            b.l.f.c0.c0.f.d.m r5 = r0.f8439b
            int r5 = r5.f8420a
            java.lang.StringBuilder r7 = r0.f8440c
            java.lang.String r7 = r7.toString()
            r3.<init>(r5, r7)
            b.l.f.c0.c0.f.d.l r5 = new b.l.f.c0.c0.f.d.l
            r8 = 1
            r5.<init>(r3, r8)
        L_0x035e:
            r7 = 0
            goto L_0x039e
        L_0x0360:
            r8 = 1
            java.lang.StringBuilder r5 = r0.f8440c
            r5.append(r3)
            goto L_0x0298
        L_0x0368:
            r8 = 1
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            int r3 = r3.f8420a
            int r7 = r3 + 1
            b.l.f.y.a r9 = r0.f8438a
            int r9 = r9.f8786h
            if (r7 <= r9) goto L_0x0376
            goto L_0x0387
        L_0x0376:
            r7 = 0
        L_0x0377:
            if (r7 >= r5) goto L_0x038c
            int r9 = r7 + r3
            b.l.f.y.a r10 = r0.f8438a
            int r11 = r10.f8786h
            if (r9 >= r11) goto L_0x038c
            boolean r9 = r10.mo16323f(r9)
            if (r9 == 0) goto L_0x0389
        L_0x0387:
            r7 = 0
            goto L_0x038d
        L_0x0389:
            int r7 = r7 + 1
            goto L_0x0377
        L_0x038c:
            r7 = r8
        L_0x038d:
            if (r7 == 0) goto L_0x0396
            b.l.f.c0.c0.f.d.m r3 = r0.f8439b
            r3.f8421b = r4
            r3.mo16195a(r5)
        L_0x0396:
            b.l.f.c0.c0.f.d.l r3 = new b.l.f.c0.c0.f.d.l
            r5 = 0
            r7 = 0
            r3.<init>(r5, r7)
            r5 = r3
        L_0x039e:
            boolean r3 = r5.f8419b
        L_0x03a0:
            b.l.f.c0.c0.f.d.m r9 = r0.f8439b
            int r9 = r9.f8420a
            if (r6 == r9) goto L_0x03a7
            goto L_0x03a8
        L_0x03a7:
            r8 = r7
        L_0x03a8:
            if (r8 != 0) goto L_0x03ac
            if (r3 == 0) goto L_0x03ae
        L_0x03ac:
            if (r3 == 0) goto L_0x03d0
        L_0x03ae:
            b.l.f.c0.c0.f.d.o r1 = r5.f8418a
            if (r1 == 0) goto L_0x03c4
            boolean r2 = r1.f8429d
            if (r2 == 0) goto L_0x03c4
            b.l.f.c0.c0.f.d.o r2 = new b.l.f.c0.c0.f.d.o
            java.lang.StringBuilder r3 = r0.f8440c
            java.lang.String r3 = r3.toString()
            int r1 = r1.f8428c
            r2.<init>(r9, r3, r1)
            return r2
        L_0x03c4:
            b.l.f.c0.c0.f.d.o r1 = new b.l.f.c0.c0.f.d.o
            java.lang.StringBuilder r2 = r0.f8440c
            java.lang.String r2 = r2.toString()
            r1.<init>(r9, r2)
            return r1
        L_0x03d0:
            r3 = r7
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4525s.mo16197b(int, java.lang.String):b.l.f.c0.c0.f.d.o");
    }

    /* renamed from: c */
    public int mo16198c(int i, int i2) {
        return m8308d(this.f8438a, i, i2);
    }

    /* renamed from: e */
    public final boolean mo16199e(int i) {
        int i2 = i + 3;
        if (i2 > this.f8438a.f8786h) {
            return false;
        }
        while (i < i2) {
            if (this.f8438a.mo16323f(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo16200f(int i) {
        if (i + 1 > this.f8438a.f8786h) {
            return false;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = i2 + i;
            C4657a aVar = this.f8438a;
            if (i3 >= aVar.f8786h) {
                return true;
            }
            if (i2 == 2) {
                if (!aVar.mo16323f(i + 2)) {
                    return false;
                }
            } else if (aVar.mo16323f(i3)) {
                return false;
            }
        }
        return true;
    }
}
