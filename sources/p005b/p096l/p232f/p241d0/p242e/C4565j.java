package p005b.p096l.p232f.p241d0.p242e;

import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p241d0.C4551a;
import p005b.p096l.p232f.p241d0.p242e.p243k.C4566a;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.d0.e.j */
public final class C4565j {

    /* renamed from: a */
    public static final C4566a f8535a = new C4566a();

    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p096l.p232f.p241d0.p242e.C4557c m8408a(p005b.p096l.p232f.p241d0.p242e.C4563h r15) {
        /*
            r0 = 0
            if (r15 != 0) goto L_0x0004
            return r0
        L_0x0004:
            b.l.f.d0.e.a r1 = r15.mo16219c()
            r2 = 0
            r3 = -1
            r4 = 1
            if (r1 != 0) goto L_0x0010
            r5 = r0
            goto L_0x0079
        L_0x0010:
            b.l.f.d0.e.c r5 = r15.f8531a
            boolean r6 = r15.f8533c
            if (r6 == 0) goto L_0x0019
            b.l.f.s r7 = r5.f8504b
            goto L_0x001b
        L_0x0019:
            b.l.f.s r7 = r5.f8506d
        L_0x001b:
            if (r6 == 0) goto L_0x0020
            b.l.f.s r5 = r5.f8505c
            goto L_0x0022
        L_0x0020:
            b.l.f.s r5 = r5.f8507e
        L_0x0022:
            float r6 = r7.f8709b
            int r6 = (int) r6
            int r6 = r15.mo16217b(r6)
            float r5 = r5.f8709b
            int r5 = (int) r5
            int r5 = r15.mo16217b(r5)
            b.l.f.d0.e.d[] r7 = r15.f8532b
            r9 = r2
            r8 = r3
            r10 = r4
        L_0x0035:
            if (r6 >= r5) goto L_0x005f
            r11 = r7[r6]
            if (r11 == 0) goto L_0x005c
            r11 = r7[r6]
            r11.mo16212b()
            int r12 = r11.f8516e
            int r13 = r12 - r8
            if (r13 != 0) goto L_0x0049
            int r9 = r9 + 1
            goto L_0x005c
        L_0x0049:
            if (r13 != r4) goto L_0x0053
            int r10 = java.lang.Math.max(r10, r9)
            int r8 = r11.f8516e
            r9 = r4
            goto L_0x005c
        L_0x0053:
            int r11 = r1.f8501e
            if (r12 < r11) goto L_0x005a
            r7[r6] = r0
            goto L_0x005c
        L_0x005a:
            r9 = r4
            r8 = r12
        L_0x005c:
            int r6 = r6 + 1
            goto L_0x0035
        L_0x005f:
            int r1 = r1.f8501e
            int[] r5 = new int[r1]
            b.l.f.d0.e.d[] r6 = r15.f8532b
            int r7 = r6.length
            r8 = r2
        L_0x0067:
            if (r8 >= r7) goto L_0x0079
            r9 = r6[r8]
            if (r9 == 0) goto L_0x0076
            int r9 = r9.f8516e
            if (r9 >= r1) goto L_0x0076
            r10 = r5[r9]
            int r10 = r10 + r4
            r5[r9] = r10
        L_0x0076:
            int r8 = r8 + 1
            goto L_0x0067
        L_0x0079:
            if (r5 != 0) goto L_0x007c
            return r0
        L_0x007c:
            int r0 = r5.length
            r1 = r2
            r6 = r3
        L_0x007f:
            if (r1 >= r0) goto L_0x008a
            r7 = r5[r1]
            int r6 = java.lang.Math.max(r6, r7)
            int r1 = r1 + 1
            goto L_0x007f
        L_0x008a:
            int r0 = r5.length
            r1 = r2
            r7 = r1
        L_0x008d:
            if (r1 >= r0) goto L_0x0099
            r8 = r5[r1]
            int r9 = r6 - r8
            int r7 = r7 + r9
            if (r8 > 0) goto L_0x0099
            int r1 = r1 + 1
            goto L_0x008d
        L_0x0099:
            b.l.f.d0.e.d[] r0 = r15.f8532b
            r1 = r2
        L_0x009c:
            if (r7 <= 0) goto L_0x00a7
            r8 = r0[r1]
            if (r8 != 0) goto L_0x00a7
            int r7 = r7 + -1
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00a7:
            int r1 = r5.length
            int r1 = r1 - r4
            r8 = r2
        L_0x00aa:
            if (r1 < 0) goto L_0x00b8
            r9 = r5[r1]
            int r9 = r6 - r9
            int r8 = r8 + r9
            r9 = r5[r1]
            if (r9 > 0) goto L_0x00b8
            int r1 = r1 + -1
            goto L_0x00aa
        L_0x00b8:
            int r1 = r0.length
            int r1 = r1 - r4
        L_0x00ba:
            if (r8 <= 0) goto L_0x00c5
            r4 = r0[r1]
            if (r4 != 0) goto L_0x00c5
            int r8 = r8 + -1
            int r1 = r1 + -1
            goto L_0x00ba
        L_0x00c5:
            b.l.f.d0.e.c r0 = r15.f8531a
            boolean r15 = r15.f8533c
            b.l.f.s r1 = r0.f8504b
            b.l.f.s r4 = r0.f8505c
            b.l.f.s r5 = r0.f8506d
            b.l.f.s r6 = r0.f8507e
            if (r7 <= 0) goto L_0x00ef
            if (r15 == 0) goto L_0x00d7
            r9 = r1
            goto L_0x00d8
        L_0x00d7:
            r9 = r5
        L_0x00d8:
            float r10 = r9.f8709b
            int r10 = (int) r10
            int r10 = r10 - r7
            if (r10 >= 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r2 = r10
        L_0x00e0:
            b.l.f.s r7 = new b.l.f.s
            float r9 = r9.f8708a
            float r2 = (float) r2
            r7.<init>(r9, r2)
            if (r15 == 0) goto L_0x00ec
            r1 = r7
            goto L_0x00ef
        L_0x00ec:
            r11 = r1
            r13 = r7
            goto L_0x00f1
        L_0x00ef:
            r11 = r1
            r13 = r5
        L_0x00f1:
            if (r8 <= 0) goto L_0x0113
            if (r15 == 0) goto L_0x00f7
            r1 = r4
            goto L_0x00f8
        L_0x00f7:
            r1 = r6
        L_0x00f8:
            float r2 = r1.f8709b
            int r2 = (int) r2
            int r2 = r2 + r8
            b.l.f.y.b r5 = r0.f8503a
            int r5 = r5.f8788h
            if (r2 < r5) goto L_0x0104
            int r2 = r5 + -1
        L_0x0104:
            b.l.f.s r3 = new b.l.f.s
            float r1 = r1.f8708a
            float r2 = (float) r2
            r3.<init>(r1, r2)
            if (r15 == 0) goto L_0x0110
            r4 = r3
            goto L_0x0113
        L_0x0110:
            r14 = r3
            r12 = r4
            goto L_0x0115
        L_0x0113:
            r12 = r4
            r14 = r6
        L_0x0115:
            b.l.f.d0.e.c r15 = new b.l.f.d0.e.c
            b.l.f.y.b r10 = r0.f8503a
            r9 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p241d0.p242e.C4565j.m8408a(b.l.f.d0.e.h):b.l.f.d0.e.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c4, code lost:
        r6 = p005b.p096l.p232f.p241d0.p242e.C4559e.m8400b(r0, r6 + 1, r11);
        java.lang.Long.parseLong(r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d7, code lost:
        r6 = p005b.p096l.p232f.p241d0.p242e.C4559e.m8400b(r0, r6 + 1, r11);
        java.lang.Integer.parseInt(r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ea, code lost:
        r6 = p005b.p096l.p232f.p241d0.p242e.C4559e.m8401c(r0, r6 + 1, r11);
        r11.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0335, code lost:
        r9 = new java.io.ByteArrayOutputStream();
        r14 = 900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0345, code lost:
        if (r6 == 901) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0349, code lost:
        if (r6 == 924) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x034c, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x034d, code lost:
        r19 = 0;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0354, code lost:
        if (r7 >= r0[0]) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0356, code lost:
        if (r6 != false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0358, code lost:
        r11 = r7 + 1;
        r7 = r0[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x035c, code lost:
        if (r7 >= 900) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x035e, code lost:
        r10 = r10 + 1;
        r19 = (r19 * r14) + ((long) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0366, code lost:
        if (r7 == 928) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0368, code lost:
        switch(r7) {
            case 900: goto L_0x0370;
            case 901: goto L_0x0370;
            case 902: goto L_0x0370;
            default: goto L_0x036b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x036b, code lost:
        switch(r7) {
            case 922: goto L_0x0370;
            case 923: goto L_0x0370;
            case 924: goto L_0x0370;
            default: goto L_0x036e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x036e, code lost:
        r7 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0370, code lost:
        r7 = r11 - 1;
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0376, code lost:
        if ((r10 % 5) != 0) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0378, code lost:
        if (r10 <= 0) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x037a, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x037b, code lost:
        if (r10 >= 6) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x037d, code lost:
        r9.write((byte) ((int) (r19 >> ((5 - r10) * 8))));
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x038b, code lost:
        r14 = 900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x038f, code lost:
        r14 = 900;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0392, code lost:
        r6 = r7;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0396, code lost:
        r6 = new int[6];
        r10 = r7 + 1;
        r7 = r0[r7];
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x039d, code lost:
        r14 = r11;
        r19 = 0;
        r15 = 0;
        r11 = r10;
        r10 = r7;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a6, code lost:
        if (r11 >= r0[r15]) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a8, code lost:
        if (r14 != false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03aa, code lost:
        r8 = r7 + 1;
        r6[r7] = r10;
        r23 = r14;
        r19 = (r19 * 900) + ((long) r10);
        r10 = r11 + 1;
        r7 = r0[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03bb, code lost:
        if (r7 == 928) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03bd, code lost:
        switch(r7) {
            case 900: goto L_0x03e8;
            case 901: goto L_0x03e8;
            case 902: goto L_0x03e8;
            default: goto L_0x03c0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c0, code lost:
        switch(r7) {
            case 922: goto L_0x03e8;
            case 923: goto L_0x03e8;
            case 924: goto L_0x03e8;
            default: goto L_0x03c3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03c5, code lost:
        if ((r8 % 5) != 0) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c7, code lost:
        if (r8 <= 0) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03c9, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03cb, code lost:
        if (r8 >= 6) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03cd, code lost:
        r9.write((byte) ((int) (r19 >> ((5 - r8) * 8))));
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03db, code lost:
        r11 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03e0, code lost:
        r11 = r10;
        r14 = r23;
        r15 = 0;
        r10 = r7;
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03e8, code lost:
        r11 = r10 - 1;
        r10 = r7;
        r7 = r8;
        r14 = true;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03f0, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03f3, code lost:
        if (r11 != r0[0]) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f7, code lost:
        if (r10 >= 900) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f9, code lost:
        r12 = r7 + 1;
        r6[r7] = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03fe, code lost:
        r12 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03ff, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0400, code lost:
        if (r7 >= r12) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0402, code lost:
        r9.write((byte) r6[r7]);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x040b, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x040c, code lost:
        r3.append(new java.lang.String(r9.toByteArray(), r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x041e, code lost:
        r6 = p005b.p096l.p232f.p241d0.p242e.C4559e.m8401c(r0, r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0249, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0182  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p096l.p232f.p258y.C4661e m8409b(int[] r25, int r26, int[] r27) {
        /*
            r0 = r25
            r1 = r27
            int r2 = r0.length
            if (r2 == 0) goto L_0x046c
            int r2 = r26 + 1
            r3 = 1
            int r2 = r3 << r2
            if (r1 == 0) goto L_0x0015
            int r4 = r1.length
            int r5 = r2 / 2
            int r5 = r5 + 3
            if (r4 > r5) goto L_0x0467
        L_0x0015:
            if (r2 < 0) goto L_0x0467
            r4 = 512(0x200, float:7.175E-43)
            if (r2 > r4) goto L_0x0467
            b.l.f.d0.e.k.a r4 = f8535a
            b.l.f.d0.e.k.c r5 = new b.l.f.d0.e.k.c
            b.l.f.d0.e.k.b r6 = r4.f8536a
            r5.<init>(r6, r0)
            int[] r6 = new int[r2]
            r7 = 0
            r8 = r2
            r9 = r7
        L_0x0029:
            if (r8 <= 0) goto L_0x003f
            b.l.f.d0.e.k.b r10 = r4.f8536a
            int[] r10 = r10.f8538a
            r10 = r10[r8]
            int r10 = r5.mo16227b(r10)
            int r11 = r2 - r8
            r6[r11] = r10
            if (r10 == 0) goto L_0x003c
            r9 = r3
        L_0x003c:
            int r8 = r8 + -1
            goto L_0x0029
        L_0x003f:
            r5 = 2
            if (r9 != 0) goto L_0x0044
            goto L_0x0200
        L_0x0044:
            b.l.f.d0.e.k.b r8 = r4.f8536a
            b.l.f.d0.e.k.c r8 = r8.f8541d
            if (r1 == 0) goto L_0x006f
            int r9 = r1.length
            r10 = r7
        L_0x004c:
            if (r10 >= r9) goto L_0x006f
            r11 = r1[r10]
            b.l.f.d0.e.k.b r12 = r4.f8536a
            int r13 = r0.length
            int r13 = r13 - r3
            int r13 = r13 - r11
            int[] r11 = r12.f8538a
            r11 = r11[r13]
            b.l.f.d0.e.k.c r13 = new b.l.f.d0.e.k.c
            int[] r14 = new int[r5]
            int r11 = r12.mo16225e(r7, r11)
            r14[r7] = r11
            r14[r3] = r3
            r13.<init>(r12, r14)
            b.l.f.d0.e.k.c r8 = r8.mo16232g(r13)
            int r10 = r10 + 1
            goto L_0x004c
        L_0x006f:
            b.l.f.d0.e.k.c r8 = new b.l.f.d0.e.k.c
            b.l.f.d0.e.k.b r9 = r4.f8536a
            r8.<init>(r9, r6)
            b.l.f.d0.e.k.b r6 = r4.f8536a
            b.l.f.d0.e.k.c r6 = r6.mo16222b(r2, r3)
            int r9 = r6.mo16229d()
            int r10 = r8.mo16229d()
            if (r9 >= r10) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            r24 = r8
            r8 = r6
            r6 = r24
        L_0x008c:
            b.l.f.d0.e.k.b r9 = r4.f8536a
            b.l.f.d0.e.k.c r10 = r9.f8540c
            b.l.f.d0.e.k.c r9 = r9.f8541d
        L_0x0092:
            r24 = r8
            r8 = r6
            r6 = r24
            int r11 = r8.mo16229d()
            int r12 = r2 / 2
            if (r11 < r12) goto L_0x0139
            boolean r11 = r8.mo16230e()
            if (r11 != 0) goto L_0x0134
            b.l.f.d0.e.k.b r11 = r4.f8536a
            b.l.f.d0.e.k.c r11 = r11.f8540c
            int r12 = r8.mo16229d()
            int r12 = r8.mo16228c(r12)
            b.l.f.d0.e.k.b r13 = r4.f8536a
            int r12 = r13.mo16223c(r12)
        L_0x00b7:
            int r13 = r6.mo16229d()
            int r14 = r8.mo16229d()
            if (r13 < r14) goto L_0x0121
            boolean r13 = r6.mo16230e()
            if (r13 != 0) goto L_0x0121
            int r13 = r6.mo16229d()
            int r14 = r8.mo16229d()
            int r13 = r13 - r14
            b.l.f.d0.e.k.b r14 = r4.f8536a
            int r15 = r6.mo16229d()
            int r15 = r6.mo16228c(r15)
            int r14 = r14.mo16224d(r15, r12)
            b.l.f.d0.e.k.b r15 = r4.f8536a
            b.l.f.d0.e.k.c r15 = r15.mo16222b(r13, r14)
            b.l.f.d0.e.k.c r11 = r11.mo16226a(r15)
            if (r13 < 0) goto L_0x011b
            if (r14 != 0) goto L_0x00f1
            b.l.f.d0.e.k.b r13 = r8.f8542a
            b.l.f.d0.e.k.c r13 = r13.f8540c
            goto L_0x0113
        L_0x00f1:
            int[] r15 = r8.f8543b
            int r15 = r15.length
            int r13 = r13 + r15
            int[] r13 = new int[r13]
            r3 = r7
        L_0x00f8:
            if (r3 >= r15) goto L_0x010b
            b.l.f.d0.e.k.b r5 = r8.f8542a
            int[] r7 = r8.f8543b
            r7 = r7[r3]
            int r5 = r5.mo16224d(r7, r14)
            r13[r3] = r5
            int r3 = r3 + 1
            r5 = 2
            r7 = 0
            goto L_0x00f8
        L_0x010b:
            b.l.f.d0.e.k.c r3 = new b.l.f.d0.e.k.c
            b.l.f.d0.e.k.b r5 = r8.f8542a
            r3.<init>(r5, r13)
            r13 = r3
        L_0x0113:
            b.l.f.d0.e.k.c r6 = r6.mo16234i(r13)
            r3 = 1
            r5 = 2
            r7 = 0
            goto L_0x00b7
        L_0x011b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0121:
            b.l.f.d0.e.k.c r3 = r11.mo16232g(r9)
            b.l.f.d0.e.k.c r3 = r3.mo16234i(r10)
            b.l.f.d0.e.k.c r3 = r3.mo16233h()
            r10 = r9
            r5 = 2
            r7 = 0
            r9 = r3
            r3 = 1
            goto L_0x0092
        L_0x0134:
            b.l.f.d r0 = p005b.p096l.p232f.C4550d.m8384a()
            throw r0
        L_0x0139:
            r3 = r7
            int r5 = r9.mo16228c(r3)
            if (r5 == 0) goto L_0x0462
            b.l.f.d0.e.k.b r6 = r4.f8536a
            int r5 = r6.mo16223c(r5)
            b.l.f.d0.e.k.c r6 = r9.mo16231f(r5)
            b.l.f.d0.e.k.c r5 = r8.mo16231f(r5)
            r7 = 2
            b.l.f.d0.e.k.c[] r8 = new p005b.p096l.p232f.p241d0.p242e.p243k.C4568c[r7]
            r8[r3] = r6
            r6 = 1
            r8[r6] = r5
            r5 = r8[r3]
            r3 = r8[r6]
            int r6 = r5.mo16229d()
            int[] r7 = new int[r6]
            r8 = 1
            r9 = 0
        L_0x0162:
            b.l.f.d0.e.k.b r10 = r4.f8536a
            java.util.Objects.requireNonNull(r10)
            r10 = 929(0x3a1, float:1.302E-42)
            if (r8 >= r10) goto L_0x0180
            if (r9 >= r6) goto L_0x0180
            int r10 = r5.mo16227b(r8)
            if (r10 != 0) goto L_0x017d
            b.l.f.d0.e.k.b r10 = r4.f8536a
            int r10 = r10.mo16223c(r8)
            r7[r9] = r10
            int r9 = r9 + 1
        L_0x017d:
            int r8 = r8 + 1
            goto L_0x0162
        L_0x0180:
            if (r9 != r6) goto L_0x045d
            int r8 = r5.mo16229d()
            int[] r9 = new int[r8]
            r10 = 1
        L_0x0189:
            if (r10 > r8) goto L_0x019c
            int r11 = r8 - r10
            b.l.f.d0.e.k.b r12 = r4.f8536a
            int r13 = r5.mo16228c(r10)
            int r12 = r12.mo16224d(r10, r13)
            r9[r11] = r12
            int r10 = r10 + 1
            goto L_0x0189
        L_0x019c:
            b.l.f.d0.e.k.c r5 = new b.l.f.d0.e.k.c
            b.l.f.d0.e.k.b r8 = r4.f8536a
            r5.<init>(r8, r9)
            int[] r8 = new int[r6]
            r9 = 0
        L_0x01a6:
            if (r9 >= r6) goto L_0x01d0
            b.l.f.d0.e.k.b r10 = r4.f8536a
            r11 = r7[r9]
            int r10 = r10.mo16223c(r11)
            b.l.f.d0.e.k.b r11 = r4.f8536a
            int r12 = r3.mo16227b(r10)
            r13 = 0
            int r11 = r11.mo16225e(r13, r12)
            b.l.f.d0.e.k.b r12 = r4.f8536a
            int r10 = r5.mo16227b(r10)
            int r10 = r12.mo16223c(r10)
            b.l.f.d0.e.k.b r12 = r4.f8536a
            int r10 = r12.mo16224d(r11, r10)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x01a6
        L_0x01d0:
            r3 = 0
        L_0x01d1:
            if (r3 >= r6) goto L_0x0200
            int r5 = r0.length
            r9 = 1
            int r5 = r5 - r9
            b.l.f.d0.e.k.b r9 = r4.f8536a
            r10 = r7[r3]
            java.util.Objects.requireNonNull(r9)
            if (r10 == 0) goto L_0x01fa
            int[] r9 = r9.f8539b
            r9 = r9[r10]
            int r5 = r5 - r9
            if (r5 < 0) goto L_0x01f5
            b.l.f.d0.e.k.b r9 = r4.f8536a
            r10 = r0[r5]
            r11 = r8[r3]
            int r9 = r9.mo16225e(r10, r11)
            r0[r5] = r9
            int r3 = r3 + 1
            goto L_0x01d1
        L_0x01f5:
            b.l.f.d r0 = p005b.p096l.p232f.C4550d.m8384a()
            throw r0
        L_0x01fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0200:
            int r3 = r0.length
            r4 = 4
            if (r3 < r4) goto L_0x0458
            r3 = 0
            r4 = r0[r3]
            int r5 = r0.length
            if (r4 > r5) goto L_0x0453
            if (r4 != 0) goto L_0x0219
            int r4 = r0.length
            if (r2 >= r4) goto L_0x0214
            int r4 = r0.length
            int r4 = r4 - r2
            r0[r3] = r4
            goto L_0x0219
        L_0x0214:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x0219:
            java.lang.String r2 = java.lang.String.valueOf(r26)
            char[] r3 = p005b.p096l.p232f.p241d0.p242e.C4559e.f8517a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r0.length
            r5 = 1
            int r4 = r4 << r5
            r3.<init>(r4)
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.ISO_8859_1
            r6 = r0[r5]
            b.l.f.d0.c r5 = new b.l.f.d0.c
            r5.<init>()
            r7 = 2
            r8 = 0
        L_0x0232:
            r9 = r0[r8]
            if (r7 >= r9) goto L_0x043a
            r8 = 913(0x391, float:1.28E-42)
            if (r6 == r8) goto L_0x0423
            switch(r6) {
                case 900: goto L_0x0250;
                case 901: goto L_0x024c;
                case 902: goto L_0x0245;
                default: goto L_0x023d;
            }
        L_0x023d:
            switch(r6) {
                case 922: goto L_0x0419;
                case 923: goto L_0x0419;
                case 924: goto L_0x024c;
                case 925: goto L_0x032f;
                case 926: goto L_0x0329;
                case 927: goto L_0x0315;
                case 928: goto L_0x0253;
                default: goto L_0x0240;
            }
        L_0x0240:
            r8 = 0
            int r7 = r7 + -1
            goto L_0x041e
        L_0x0245:
            int r6 = p005b.p096l.p232f.p241d0.p242e.C4559e.m8400b(r0, r7, r3)
        L_0x0249:
            r8 = 0
            goto L_0x042c
        L_0x024c:
            r8 = 2
            r11 = 1
            goto L_0x0335
        L_0x0250:
            r8 = 0
            goto L_0x041e
        L_0x0253:
            int r6 = r7 + 2
            r8 = 0
            r9 = r0[r8]
            if (r6 > r9) goto L_0x0310
            r8 = 2
            int[] r6 = new int[r8]
            r9 = 0
        L_0x025e:
            if (r9 >= r8) goto L_0x0269
            r10 = r0[r7]
            r6[r9] = r10
            int r9 = r9 + 1
            int r7 = r7 + 1
            goto L_0x025e
        L_0x0269:
            java.lang.String r6 = p005b.p096l.p232f.p241d0.p242e.C4559e.m8399a(r6, r8)
            java.lang.Integer.parseInt(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = p005b.p096l.p232f.p241d0.p242e.C4559e.m8401c(r0, r7, r6)
            r6.toString()
            r6 = r0[r7]
            r9 = 923(0x39b, float:1.293E-42)
            r10 = -1
            if (r6 != r9) goto L_0x028c
            int r6 = r7 + 1
            r11 = 0
            r24 = r7
            r7 = r6
            r6 = r24
            goto L_0x028f
        L_0x028c:
            r6 = r7
            r7 = r10
        L_0x028e:
            r11 = 0
        L_0x028f:
            r12 = r0[r11]
            if (r6 >= r12) goto L_0x02ff
            r11 = r0[r6]
            r12 = 922(0x39a, float:1.292E-42)
            if (r11 == r12) goto L_0x02f9
            if (r11 != r9) goto L_0x02f4
            int r6 = r6 + 1
            r11 = r0[r6]
            switch(r11) {
                case 0: goto L_0x02e5;
                case 1: goto L_0x02d2;
                case 2: goto L_0x02bf;
                case 3: goto L_0x02b9;
                case 4: goto L_0x02b3;
                case 5: goto L_0x02ad;
                case 6: goto L_0x02a7;
                default: goto L_0x02a2;
            }
        L_0x02a2:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x02a7:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            goto L_0x02d7
        L_0x02ad:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            goto L_0x02c4
        L_0x02b3:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            goto L_0x02ea
        L_0x02b9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            goto L_0x02ea
        L_0x02bf:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L_0x02c4:
            int r6 = r6 + 1
            int r6 = p005b.p096l.p232f.p241d0.p242e.C4559e.m8400b(r0, r6, r11)
            java.lang.String r11 = r11.toString()
            java.lang.Long.parseLong(r11)
            goto L_0x028e
        L_0x02d2:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L_0x02d7:
            int r6 = r6 + 1
            int r6 = p005b.p096l.p232f.p241d0.p242e.C4559e.m8400b(r0, r6, r11)
            java.lang.String r11 = r11.toString()
            java.lang.Integer.parseInt(r11)
            goto L_0x028e
        L_0x02e5:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L_0x02ea:
            int r6 = r6 + 1
            int r6 = p005b.p096l.p232f.p241d0.p242e.C4559e.m8401c(r0, r6, r11)
            r11.toString()
            goto L_0x028e
        L_0x02f4:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x02f9:
            int r6 = r6 + 1
            r11 = 1
            r5.f8496a = r11
            goto L_0x028e
        L_0x02ff:
            r11 = 1
            if (r7 == r10) goto L_0x0249
            int r9 = r6 - r7
            boolean r10 = r5.f8496a
            if (r10 == 0) goto L_0x030a
            int r9 = r9 + -1
        L_0x030a:
            int r9 = r9 + r7
            java.util.Arrays.copyOfRange(r0, r7, r9)
            goto L_0x0249
        L_0x0310:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x0315:
            r8 = 2
            r11 = 1
            int r6 = r7 + 1
            r4 = r0[r7]
            b.l.f.y.d r4 = p005b.p096l.p232f.p258y.C4660d.m8585d(r4)
            java.lang.String r4 = r4.name()
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            goto L_0x0249
        L_0x0329:
            r8 = 2
            r11 = 1
            int r6 = r7 + 2
            goto L_0x0249
        L_0x032f:
            r8 = 2
            r11 = 1
            int r6 = r7 + 1
            goto L_0x0249
        L_0x0335:
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            r10 = 901(0x385, float:1.263E-42)
            r12 = 928(0x3a0, float:1.3E-42)
            r13 = 6
            r14 = 900(0x384, double:4.447E-321)
            r16 = 0
            r8 = 900(0x384, float:1.261E-42)
            if (r6 == r10) goto L_0x0396
            r10 = 924(0x39c, float:1.295E-42)
            if (r6 == r10) goto L_0x034c
            goto L_0x0392
        L_0x034c:
            r6 = 0
        L_0x034d:
            r19 = r16
            r10 = 0
        L_0x0350:
            r18 = 0
            r11 = r0[r18]
            if (r7 >= r11) goto L_0x0392
            if (r6 != 0) goto L_0x0392
            int r11 = r7 + 1
            r7 = r0[r7]
            if (r7 >= r8) goto L_0x0366
            int r10 = r10 + 1
            long r19 = r19 * r14
            long r14 = (long) r7
            long r19 = r19 + r14
            goto L_0x036e
        L_0x0366:
            if (r7 == r12) goto L_0x0370
            switch(r7) {
                case 900: goto L_0x0370;
                case 901: goto L_0x0370;
                case 902: goto L_0x0370;
                default: goto L_0x036b;
            }
        L_0x036b:
            switch(r7) {
                case 922: goto L_0x0370;
                case 923: goto L_0x0370;
                case 924: goto L_0x0370;
                default: goto L_0x036e;
            }
        L_0x036e:
            r7 = r11
            goto L_0x0374
        L_0x0370:
            int r11 = r11 + -1
            r7 = r11
            r6 = 1
        L_0x0374:
            int r11 = r10 % 5
            if (r11 != 0) goto L_0x038f
            if (r10 <= 0) goto L_0x038f
            r10 = 0
        L_0x037b:
            if (r10 >= r13) goto L_0x038b
            int r11 = 5 - r10
            int r11 = r11 * 8
            long r14 = r19 >> r11
            int r11 = (int) r14
            byte r11 = (byte) r11
            r9.write(r11)
            int r10 = r10 + 1
            goto L_0x037b
        L_0x038b:
            r11 = 1
            r14 = 900(0x384, double:4.447E-321)
            goto L_0x034d
        L_0x038f:
            r14 = 900(0x384, double:4.447E-321)
            goto L_0x0350
        L_0x0392:
            r6 = r7
            r8 = 0
            goto L_0x040c
        L_0x0396:
            int[] r6 = new int[r13]
            int r10 = r7 + 1
            r7 = r0[r7]
            r11 = 0
        L_0x039d:
            r14 = r11
            r19 = r16
            r15 = 0
            r11 = r10
            r10 = r7
            r7 = 0
        L_0x03a4:
            r8 = r0[r15]
            if (r11 >= r8) goto L_0x03f0
            if (r14 != 0) goto L_0x03f0
            int r8 = r7 + 1
            r6[r7] = r10
            r21 = 900(0x384, double:4.447E-321)
            long r19 = r19 * r21
            r23 = r14
            long r13 = (long) r10
            long r19 = r19 + r13
            int r10 = r11 + 1
            r7 = r0[r11]
            if (r7 == r12) goto L_0x03e8
            switch(r7) {
                case 900: goto L_0x03e8;
                case 901: goto L_0x03e8;
                case 902: goto L_0x03e8;
                default: goto L_0x03c0;
            }
        L_0x03c0:
            switch(r7) {
                case 922: goto L_0x03e8;
                case 923: goto L_0x03e8;
                case 924: goto L_0x03e8;
                default: goto L_0x03c3;
            }
        L_0x03c3:
            int r11 = r8 % 5
            if (r11 != 0) goto L_0x03e0
            if (r8 <= 0) goto L_0x03e0
            r8 = 0
            r13 = 6
        L_0x03cb:
            if (r8 >= r13) goto L_0x03db
            int r11 = 5 - r8
            int r11 = r11 * 8
            long r14 = r19 >> r11
            int r11 = (int) r14
            byte r11 = (byte) r11
            r9.write(r11)
            int r8 = r8 + 1
            goto L_0x03cb
        L_0x03db:
            r11 = r23
            r8 = 900(0x384, float:1.261E-42)
            goto L_0x039d
        L_0x03e0:
            r13 = 6
            r11 = r10
            r14 = r23
            r15 = 0
            r10 = r7
            r7 = r8
            goto L_0x03a4
        L_0x03e8:
            r13 = 6
            int r11 = r10 + -1
            r10 = r7
            r7 = r8
            r14 = 1
            r15 = 0
            goto L_0x03a4
        L_0x03f0:
            r8 = 0
            r12 = r0[r8]
            if (r11 != r12) goto L_0x03fe
            r12 = 900(0x384, float:1.261E-42)
            if (r10 >= r12) goto L_0x03fe
            int r12 = r7 + 1
            r6[r7] = r10
            goto L_0x03ff
        L_0x03fe:
            r12 = r7
        L_0x03ff:
            r7 = r8
        L_0x0400:
            if (r7 >= r12) goto L_0x040b
            r10 = r6[r7]
            byte r10 = (byte) r10
            r9.write(r10)
            int r7 = r7 + 1
            goto L_0x0400
        L_0x040b:
            r6 = r11
        L_0x040c:
            java.lang.String r7 = new java.lang.String
            byte[] r9 = r9.toByteArray()
            r7.<init>(r9, r4)
            r3.append(r7)
            goto L_0x042c
        L_0x0419:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x041e:
            int r6 = p005b.p096l.p232f.p241d0.p242e.C4559e.m8401c(r0, r7, r3)
            goto L_0x042c
        L_0x0423:
            r8 = 0
            int r6 = r7 + 1
            r7 = r0[r7]
            char r7 = (char) r7
            r3.append(r7)
        L_0x042c:
            int r7 = r0.length
            if (r6 >= r7) goto L_0x0435
            int r7 = r6 + 1
            r6 = r0[r6]
            goto L_0x0232
        L_0x0435:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x043a:
            int r0 = r3.length()
            if (r0 == 0) goto L_0x044e
            b.l.f.y.e r0 = new b.l.f.y.e
            java.lang.String r3 = r3.toString()
            r4 = 0
            r0.<init>(r4, r3, r4, r2)
            r0.f8831f = r5
            int r1 = r1.length
            return r0
        L_0x044e:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x0453:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x0458:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x045d:
            b.l.f.d r0 = p005b.p096l.p232f.C4550d.m8384a()
            throw r0
        L_0x0462:
            b.l.f.d r0 = p005b.p096l.p232f.C4550d.m8384a()
            throw r0
        L_0x0467:
            b.l.f.d r0 = p005b.p096l.p232f.C4550d.m8384a()
            throw r0
        L_0x046c:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p241d0.p242e.C4565j.m8409b(int[], int, int[]):b.l.f.y.e");
    }

    /* renamed from: c */
    public static C4558d m8410c(C4658b bVar, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        C4658b bVar2 = bVar;
        int i8 = i;
        int i9 = i2;
        int i10 = i4;
        int i11 = z ? -1 : 1;
        boolean z2 = z;
        int i12 = i3;
        int i13 = 0;
        loop0:
        while (true) {
            if (i13 >= 2) {
                break;
            }
            while (true) {
                if (!z2) {
                    if (i12 >= i9) {
                        continue;
                        break;
                    }
                } else if (i12 < i8) {
                    continue;
                    break;
                }
                if (z2 != bVar2.mo16333b(i12, i10)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i12) > 2) {
                    i12 = i3;
                    break loop0;
                } else {
                    i12 += i11;
                }
            }
            i11 = -i11;
            z2 = !z2;
            i13++;
        }
        int[] iArr = new int[8];
        int i14 = z ? 1 : -1;
        boolean z3 = z;
        int i15 = 0;
        int i16 = i12;
        while (true) {
            if (!z) {
                if (i16 < i8) {
                    break;
                }
            } else if (i16 >= i9) {
                break;
            }
            if (i15 >= 8) {
                break;
            } else if (bVar2.mo16333b(i16, i10) == z3) {
                iArr[i15] = iArr[i15] + 1;
                i16 += i14;
            } else {
                i15++;
                z3 = !z3;
            }
        }
        if (i15 != 8) {
            if (z) {
                i8 = i9;
            }
            if (!(i16 == i8 && i15 == 7)) {
                iArr = null;
            }
        }
        if (iArr == null) {
            return null;
        }
        int N0 = C1960d.m2735N0(iArr);
        if (z) {
            i7 = i12 + N0;
        } else {
            for (int i17 = 0; i17 < iArr.length / 2; i17++) {
                int i18 = iArr[i17];
                iArr[i17] = iArr[(iArr.length - 1) - i17];
                iArr[(iArr.length - 1) - i17] = i18;
            }
            int i19 = i12;
            i12 -= N0;
            i7 = i19;
        }
        if (!(i5 + -2 <= N0 && N0 <= i6 + 2)) {
            return null;
        }
        float[][] fArr = C4564i.f8534a;
        float N02 = (float) C1960d.m2735N0(iArr);
        int[] iArr2 = new int[8];
        int i20 = 0;
        int i21 = 0;
        for (int i22 = 0; i22 < 17; i22++) {
            if (((float) (iArr[i20] + i21)) <= ((((float) i22) * N02) / 17.0f) + (N02 / 34.0f)) {
                i21 += iArr[i20];
                i20++;
            }
            iArr2[i20] = iArr2[i20] + 1;
        }
        long j = 0;
        for (int i23 = 0; i23 < 8; i23++) {
            for (int i24 = 0; i24 < iArr2[i23]; i24++) {
                j = (j << 1) | ((long) (i23 % 2 == 0 ? 1 : 0));
            }
        }
        int i25 = (int) j;
        if (C4551a.m8385a(i25) == -1) {
            i25 = -1;
        }
        if (i25 == -1) {
            int N03 = C1960d.m2735N0(iArr);
            float[] fArr2 = new float[8];
            if (N03 > 1) {
                for (int i26 = 0; i26 < 8; i26++) {
                    fArr2[i26] = ((float) iArr[i26]) / ((float) N03);
                }
            }
            float f = Float.MAX_VALUE;
            i25 = -1;
            int i27 = 0;
            while (true) {
                float[][] fArr3 = C4564i.f8534a;
                if (i27 >= fArr3.length) {
                    break;
                }
                float f2 = 0.0f;
                float[] fArr4 = fArr3[i27];
                for (int i28 = 0; i28 < 8; i28++) {
                    float f3 = fArr4[i28] - fArr2[i28];
                    f2 += f3 * f3;
                    if (f2 >= f) {
                        break;
                    }
                }
                if (f2 < f) {
                    i25 = C4551a.f8493b[i27];
                    f = f2;
                }
                i27++;
            }
        }
        int a = C4551a.m8385a(i25);
        if (a == -1) {
            return null;
        }
        int[] iArr3 = new int[8];
        int i29 = 0;
        int i30 = 7;
        while (true) {
            int i31 = i25 & 1;
            if (i31 != i29) {
                i30--;
                if (i30 < 0) {
                    return new C4558d(i12, i7, ((((iArr3[0] - iArr3[2]) + iArr3[4]) - iArr3[6]) + 9) % 9, a);
                }
                i29 = i31;
            }
            iArr3[i30] = iArr3[i30] + 1;
            i25 >>= 1;
        }
    }

    /* renamed from: d */
    public static C4563h m8411d(C4658b bVar, C4557c cVar, C4625s sVar, boolean z, int i, int i2) {
        int i3;
        C4557c cVar2 = cVar;
        C4625s sVar2 = sVar;
        boolean z2 = z;
        C4563h hVar = new C4563h(cVar2, z2);
        int i4 = 0;
        while (i4 < 2) {
            int i5 = i4 == 0 ? 1 : -1;
            int i6 = (int) sVar2.f8708a;
            int i7 = (int) sVar2.f8709b;
            while (i7 <= cVar2.f8511i && i7 >= cVar2.f8510h) {
                C4558d c = m8410c(bVar, 0, bVar.f8787g, z, i6, i7, i, i2);
                if (c != null) {
                    hVar.f8532b[i7 - hVar.f8531a.f8510h] = c;
                    if (z2) {
                        i3 = c.f8512a;
                    } else {
                        i3 = c.f8513b;
                    }
                    i6 = i3;
                }
                i7 += i5;
            }
            i4++;
        }
        return hVar;
    }

    /* renamed from: e */
    public static boolean m8412e(C4561f fVar, int i) {
        return i >= 0 && i <= fVar.f8530d + 1;
    }
}
