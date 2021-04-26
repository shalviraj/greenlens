package p005b.p096l.p232f.p250w;

import p005b.p096l.p232f.C4627u;

/* renamed from: b.l.f.w.c */
public final class C4631c implements C4627u {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p232f.p258y.C4658b mo16167a(java.lang.String r19, p005b.p096l.p232f.C4484a r20, int r21, int r22, java.util.Map<p005b.p096l.p232f.C4613g, ?> r23) {
        /*
            r18 = this;
            r0 = r23
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = 0
            r3 = 33
            if (r0 == 0) goto L_0x0046
            b.l.f.g r4 = p005b.p096l.p232f.C4613g.CHARACTER_SET
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto L_0x001d
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
        L_0x001d:
            b.l.f.g r4 = p005b.p096l.p232f.C4613g.ERROR_CORRECTION
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto L_0x0031
            java.lang.Object r3 = r0.get(r4)
            java.lang.String r3 = r3.toString()
            int r3 = java.lang.Integer.parseInt(r3)
        L_0x0031:
            b.l.f.g r4 = p005b.p096l.p232f.C4613g.AZTEC_LAYERS
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto L_0x0046
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            b.l.f.a r4 = p005b.p096l.p232f.C4484a.AZTEC
            r5 = r20
            if (r5 != r4) goto L_0x0450
            r4 = r19
            byte[] r1 = r4.getBytes(r1)
            b.l.f.w.f.d r4 = new b.l.f.w.f.d
            r4.<init>(r1)
            b.l.f.w.f.f r1 = p005b.p096l.p232f.p250w.p253f.C4641f.f8745e
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r5 = r2
        L_0x005f:
            byte[] r6 = r4.f8742a
            int r7 = r6.length
            r8 = 32
            r9 = 10
            r10 = 3
            r11 = 4
            r12 = 2
            r13 = 1
            if (r5 >= r7) goto L_0x016f
            int r7 = r5 + 1
            int r14 = r6.length
            if (r7 >= r14) goto L_0x0074
            byte r14 = r6[r7]
            goto L_0x0075
        L_0x0074:
            r14 = r2
        L_0x0075:
            byte r6 = r6[r5]
            r15 = 13
            if (r6 == r15) goto L_0x0094
            r9 = 44
            if (r6 == r9) goto L_0x0090
            r9 = 46
            if (r6 == r9) goto L_0x008c
            r9 = 58
            if (r6 == r9) goto L_0x0088
            goto L_0x0098
        L_0x0088:
            if (r14 != r8) goto L_0x0098
            r6 = 5
            goto L_0x0099
        L_0x008c:
            if (r14 != r8) goto L_0x0098
            r6 = r10
            goto L_0x0099
        L_0x0090:
            if (r14 != r8) goto L_0x0098
            r6 = r11
            goto L_0x0099
        L_0x0094:
            if (r14 != r9) goto L_0x0098
            r6 = r12
            goto L_0x0099
        L_0x0098:
            r6 = r2
        L_0x0099:
            if (r6 <= 0) goto L_0x00ee
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a4:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x00e7
            java.lang.Object r9 = r1.next()
            b.l.f.w.f.f r9 = (p005b.p096l.p232f.p250w.p253f.C4641f) r9
            b.l.f.w.f.f r14 = r9.mo16303c(r5)
            b.l.f.w.f.f r15 = r14.mo16305e(r11, r6)
            r8.add(r15)
            int r15 = r9.f8746a
            if (r15 == r11) goto L_0x00c6
            b.l.f.w.f.f r15 = r14.mo16306f(r11, r6)
            r8.add(r15)
        L_0x00c6:
            if (r6 == r10) goto L_0x00ca
            if (r6 != r11) goto L_0x00d7
        L_0x00ca:
            int r15 = 16 - r6
            b.l.f.w.f.f r14 = r14.mo16305e(r12, r15)
            b.l.f.w.f.f r14 = r14.mo16305e(r12, r13)
            r8.add(r14)
        L_0x00d7:
            int r14 = r9.f8748c
            if (r14 <= 0) goto L_0x00a4
            b.l.f.w.f.f r9 = r9.mo16302a(r5)
            b.l.f.w.f.f r9 = r9.mo16302a(r7)
            r8.add(r9)
            goto L_0x00a4
        L_0x00e7:
            java.util.Collection r1 = p005b.p096l.p232f.p250w.p253f.C4639d.m8551a(r8)
            r5 = r7
            goto L_0x016c
        L_0x00ee:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f7:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0168
            java.lang.Object r7 = r1.next()
            b.l.f.w.f.f r7 = (p005b.p096l.p232f.p250w.p253f.C4641f) r7
            byte[] r8 = r4.f8742a
            byte r8 = r8[r5]
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r8 = (char) r8
            int[][] r9 = p005b.p096l.p232f.p250w.p253f.C4639d.f8740d
            int r10 = r7.f8746a
            r9 = r9[r10]
            r9 = r9[r8]
            if (r9 <= 0) goto L_0x0116
            r9 = r13
            goto L_0x0117
        L_0x0116:
            r9 = r2
        L_0x0117:
            r10 = 0
            r14 = r2
        L_0x0119:
            if (r14 > r11) goto L_0x0150
            int[][] r11 = p005b.p096l.p232f.p250w.p253f.C4639d.f8740d
            r11 = r11[r14]
            r11 = r11[r8]
            if (r11 <= 0) goto L_0x014b
            if (r10 != 0) goto L_0x0129
            b.l.f.w.f.f r10 = r7.mo16303c(r5)
        L_0x0129:
            if (r9 == 0) goto L_0x0131
            int r15 = r7.f8746a
            if (r14 == r15) goto L_0x0131
            if (r14 != r12) goto L_0x0138
        L_0x0131:
            b.l.f.w.f.f r12 = r10.mo16305e(r14, r11)
            r6.add(r12)
        L_0x0138:
            if (r9 != 0) goto L_0x014b
            int[][] r12 = p005b.p096l.p232f.p250w.p253f.C4639d.f8741e
            int r15 = r7.f8746a
            r12 = r12[r15]
            r12 = r12[r14]
            if (r12 < 0) goto L_0x014b
            b.l.f.w.f.f r11 = r10.mo16306f(r14, r11)
            r6.add(r11)
        L_0x014b:
            int r14 = r14 + 1
            r11 = 4
            r12 = 2
            goto L_0x0119
        L_0x0150:
            int r9 = r7.f8748c
            if (r9 > 0) goto L_0x015e
            int[][] r9 = p005b.p096l.p232f.p250w.p253f.C4639d.f8740d
            int r10 = r7.f8746a
            r9 = r9[r10]
            r8 = r9[r8]
            if (r8 != 0) goto L_0x0165
        L_0x015e:
            b.l.f.w.f.f r7 = r7.mo16302a(r5)
            r6.add(r7)
        L_0x0165:
            r11 = 4
            r12 = 2
            goto L_0x00f7
        L_0x0168:
            java.util.Collection r1 = p005b.p096l.p232f.p250w.p253f.C4639d.m8551a(r6)
        L_0x016c:
            int r5 = r5 + r13
            goto L_0x005f
        L_0x016f:
            b.l.f.w.f.c r5 = new b.l.f.w.f.c
            r5.<init>(r4)
            java.lang.Object r1 = java.util.Collections.min(r1, r5)
            b.l.f.w.f.f r1 = (p005b.p096l.p232f.p250w.p253f.C4641f) r1
            byte[] r4 = r4.f8742a
            java.util.Objects.requireNonNull(r1)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            int r6 = r4.length
            b.l.f.w.f.f r1 = r1.mo16303c(r6)
            b.l.f.w.f.g r1 = r1.f8747b
        L_0x018b:
            if (r1 == 0) goto L_0x0193
            r5.addFirst(r1)
            b.l.f.w.f.g r1 = r1.f8751a
            goto L_0x018b
        L_0x0193:
            b.l.f.y.a r1 = new b.l.f.y.a
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x019c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01ac
            java.lang.Object r6 = r5.next()
            b.l.f.w.f.g r6 = (p005b.p096l.p232f.p250w.p253f.C4642g) r6
            r6.mo16298a(r1, r4)
            goto L_0x019c
        L_0x01ac:
            int r4 = r1.f8786h
            r5 = 100
            r6 = 11
            int r3 = p005b.p035e.p036a.p037a.C0843a.m432H(r3, r4, r5, r6)
            int r4 = r4 + r3
            if (r0 == 0) goto L_0x020d
            if (r0 >= 0) goto L_0x01bd
            r4 = r13
            goto L_0x01be
        L_0x01bd:
            r4 = r2
        L_0x01be:
            int r5 = java.lang.Math.abs(r0)
            if (r4 == 0) goto L_0x01c5
            r8 = 4
        L_0x01c5:
            if (r5 > r8) goto L_0x01f9
            if (r4 == 0) goto L_0x01cc
            r0 = 88
            goto L_0x01ce
        L_0x01cc:
            r0 = 112(0x70, float:1.57E-43)
        L_0x01ce:
            int r2 = r5 << 4
            int r0 = r0 + r2
            int r0 = r0 * r5
            int[] r2 = p005b.p096l.p232f.p250w.p253f.C4637b.f8737a
            r2 = r2[r5]
            int r7 = r0 % r2
            int r7 = r0 - r7
            b.l.f.y.a r1 = p005b.p096l.p232f.p250w.p253f.C4637b.m8550c(r1, r2)
            int r8 = r1.f8786h
            int r3 = r3 + r8
            java.lang.String r9 = "Data to large for user specified layer"
            if (r3 > r7) goto L_0x01f3
            if (r4 == 0) goto L_0x0255
            int r3 = r2 << 6
            if (r8 > r3) goto L_0x01ed
            goto L_0x0255
        L_0x01ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x01f3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x01f9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "Illegal value %s for layers"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x020d:
            r0 = 0
            r5 = r2
            r7 = r5
        L_0x0210:
            if (r2 > r8) goto L_0x0448
            if (r2 > r10) goto L_0x0215
            r5 = r13
        L_0x0215:
            if (r5 == 0) goto L_0x021a
            int r8 = r2 + 1
            goto L_0x021b
        L_0x021a:
            r8 = r2
        L_0x021b:
            if (r5 == 0) goto L_0x0220
            r9 = 88
            goto L_0x0222
        L_0x0220:
            r9 = 112(0x70, float:1.57E-43)
        L_0x0222:
            int r11 = r8 << 4
            int r9 = r9 + r11
            int r9 = r9 * r8
            if (r4 > r9) goto L_0x043b
            if (r0 == 0) goto L_0x0230
            int[] r11 = p005b.p096l.p232f.p250w.p253f.C4637b.f8737a
            r11 = r11[r8]
            if (r7 == r11) goto L_0x023d
        L_0x0230:
            int[] r0 = p005b.p096l.p232f.p250w.p253f.C4637b.f8737a
            r0 = r0[r8]
            b.l.f.y.a r7 = p005b.p096l.p232f.p250w.p253f.C4637b.m8550c(r1, r0)
            r17 = r7
            r7 = r0
            r0 = r17
        L_0x023d:
            int r11 = r9 % r7
            int r11 = r9 - r11
            if (r5 == 0) goto L_0x0249
            int r12 = r0.f8786h
            int r14 = r7 << 6
            if (r12 > r14) goto L_0x043b
        L_0x0249:
            int r12 = r0.f8786h
            int r12 = r12 + r3
            if (r12 <= r11) goto L_0x0250
            goto L_0x043b
        L_0x0250:
            r1 = r0
            r4 = r5
            r2 = r7
            r5 = r8
            r0 = r9
        L_0x0255:
            b.l.f.y.a r0 = p005b.p096l.p232f.p250w.p253f.C4637b.m8549b(r1, r0, r2)
            int r1 = r1.f8786h
            int r1 = r1 / r2
            b.l.f.y.a r2 = new b.l.f.y.a
            r2.<init>()
            int r3 = r5 + -1
            if (r4 == 0) goto L_0x0272
            r7 = 2
            r2.mo16319c(r3, r7)
            int r1 = r1 + -1
            r3 = 6
            r2.mo16319c(r1, r3)
            r1 = 28
            goto L_0x027d
        L_0x0272:
            r7 = 5
            r2.mo16319c(r3, r7)
            int r1 = r1 + -1
            r2.mo16319c(r1, r6)
            r1 = 40
        L_0x027d:
            r3 = 4
            b.l.f.y.a r1 = p005b.p096l.p232f.p250w.p253f.C4637b.m8549b(r2, r1, r3)
            if (r4 == 0) goto L_0x0285
            goto L_0x0287
        L_0x0285:
            r6 = 14
        L_0x0287:
            int r2 = r5 << 2
            int r6 = r6 + r2
            int[] r2 = new int[r6]
            if (r4 == 0) goto L_0x0298
            r3 = 0
        L_0x028f:
            if (r3 >= r6) goto L_0x0296
            r2[r3] = r3
            int r3 = r3 + 1
            goto L_0x028f
        L_0x0296:
            r8 = r6
            goto L_0x02bd
        L_0x0298:
            int r3 = r6 + 1
            int r7 = r6 / 2
            int r8 = r7 + -1
            int r8 = r8 / 15
            int r8 = r8 * 2
            int r8 = r8 + r3
            int r3 = r8 / 2
            r9 = 0
        L_0x02a6:
            if (r9 >= r7) goto L_0x02bd
            int r10 = r9 / 15
            int r10 = r10 + r9
            int r11 = r7 - r9
            int r11 = r11 - r13
            int r12 = r3 - r10
            int r12 = r12 + -1
            r2[r11] = r12
            int r11 = r7 + r9
            int r10 = r10 + r3
            int r10 = r10 + r13
            r2[r11] = r10
            int r9 = r9 + 1
            goto L_0x02a6
        L_0x02bd:
            b.l.f.y.b r3 = new b.l.f.y.b
            r3.<init>(r8, r8)
            r7 = 0
            r9 = 0
        L_0x02c4:
            if (r7 >= r5) goto L_0x034c
            int r10 = r5 - r7
            int r10 = r10 << 2
            if (r4 == 0) goto L_0x02cf
            r11 = 9
            goto L_0x02d1
        L_0x02cf:
            r11 = 12
        L_0x02d1:
            int r10 = r10 + r11
            r11 = 0
        L_0x02d3:
            if (r11 >= r10) goto L_0x0345
            int r12 = r11 << 1
            r13 = 0
        L_0x02d8:
            r14 = 2
            if (r13 >= r14) goto L_0x0342
            int r14 = r9 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo16323f(r14)
            if (r14 == 0) goto L_0x02f0
            int r14 = r7 << 1
            int r15 = r14 + r13
            r15 = r2[r15]
            int r14 = r14 + r11
            r14 = r2[r14]
            r3.mo16339g(r15, r14)
        L_0x02f0:
            int r14 = r10 << 1
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo16323f(r14)
            if (r14 == 0) goto L_0x030c
            int r14 = r7 << 1
            int r15 = r14 + r11
            r15 = r2[r15]
            int r16 = r6 + -1
            int r16 = r16 - r14
            int r16 = r16 - r13
            r14 = r2[r16]
            r3.mo16339g(r15, r14)
        L_0x030c:
            int r14 = r10 << 2
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo16323f(r14)
            if (r14 == 0) goto L_0x0326
            int r14 = r6 + -1
            int r15 = r7 << 1
            int r14 = r14 - r15
            int r15 = r14 - r13
            r15 = r2[r15]
            int r14 = r14 - r11
            r14 = r2[r14]
            r3.mo16339g(r15, r14)
        L_0x0326:
            int r14 = r10 * 6
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo16323f(r14)
            if (r14 == 0) goto L_0x033f
            int r14 = r6 + -1
            int r15 = r7 << 1
            int r14 = r14 - r15
            int r14 = r14 - r11
            r14 = r2[r14]
            int r15 = r15 + r13
            r15 = r2[r15]
            r3.mo16339g(r14, r15)
        L_0x033f:
            int r13 = r13 + 1
            goto L_0x02d8
        L_0x0342:
            int r11 = r11 + 1
            goto L_0x02d3
        L_0x0345:
            int r10 = r10 << 3
            int r9 = r9 + r10
            int r7 = r7 + 1
            goto L_0x02c4
        L_0x034c:
            int r0 = r8 / 2
            r2 = 7
            r5 = 0
            if (r4 == 0) goto L_0x038c
        L_0x0352:
            if (r5 >= r2) goto L_0x03cb
            int r7 = r0 + -3
            int r7 = r7 + r5
            boolean r9 = r1.mo16323f(r5)
            if (r9 == 0) goto L_0x0362
            int r9 = r0 + -5
            r3.mo16339g(r7, r9)
        L_0x0362:
            int r9 = r5 + 7
            boolean r9 = r1.mo16323f(r9)
            if (r9 == 0) goto L_0x036f
            int r9 = r0 + 5
            r3.mo16339g(r9, r7)
        L_0x036f:
            int r9 = 20 - r5
            boolean r9 = r1.mo16323f(r9)
            if (r9 == 0) goto L_0x037c
            int r9 = r0 + 5
            r3.mo16339g(r7, r9)
        L_0x037c:
            int r9 = 27 - r5
            boolean r9 = r1.mo16323f(r9)
            if (r9 == 0) goto L_0x0389
            int r9 = r0 + -5
            r3.mo16339g(r9, r7)
        L_0x0389:
            int r5 = r5 + 1
            goto L_0x0352
        L_0x038c:
            r7 = 10
        L_0x038e:
            if (r5 >= r7) goto L_0x03cb
            int r9 = r0 + -5
            int r9 = r9 + r5
            int r10 = r5 / 5
            int r10 = r10 + r9
            boolean r9 = r1.mo16323f(r5)
            if (r9 == 0) goto L_0x03a1
            int r9 = r0 + -7
            r3.mo16339g(r10, r9)
        L_0x03a1:
            int r9 = r5 + 10
            boolean r9 = r1.mo16323f(r9)
            if (r9 == 0) goto L_0x03ae
            int r9 = r0 + 7
            r3.mo16339g(r9, r10)
        L_0x03ae:
            int r9 = 29 - r5
            boolean r9 = r1.mo16323f(r9)
            if (r9 == 0) goto L_0x03bb
            int r9 = r0 + 7
            r3.mo16339g(r10, r9)
        L_0x03bb:
            int r9 = 39 - r5
            boolean r9 = r1.mo16323f(r9)
            if (r9 == 0) goto L_0x03c8
            int r9 = r0 + -7
            r3.mo16339g(r9, r10)
        L_0x03c8:
            int r5 = r5 + 1
            goto L_0x038e
        L_0x03cb:
            if (r4 == 0) goto L_0x03d2
            r1 = 5
            p005b.p096l.p232f.p250w.p253f.C4637b.m8548a(r3, r0, r1)
            goto L_0x03f9
        L_0x03d2:
            p005b.p096l.p232f.p250w.p253f.C4637b.m8548a(r3, r0, r2)
            r1 = 0
            r2 = 0
        L_0x03d7:
            int r4 = r6 / 2
            int r4 = r4 + -1
            if (r1 >= r4) goto L_0x03f9
            r4 = r0 & 1
        L_0x03df:
            if (r4 >= r8) goto L_0x03f4
            int r5 = r0 - r2
            r3.mo16339g(r5, r4)
            int r7 = r0 + r2
            r3.mo16339g(r7, r4)
            r3.mo16339g(r4, r5)
            r3.mo16339g(r4, r7)
            int r4 = r4 + 2
            goto L_0x03df
        L_0x03f4:
            int r1 = r1 + 15
            int r2 = r2 + 16
            goto L_0x03d7
        L_0x03f9:
            int r0 = r3.f8787g
            int r1 = r3.f8788h
            r5 = r21
            int r2 = java.lang.Math.max(r5, r0)
            r8 = r22
            int r4 = java.lang.Math.max(r8, r1)
            int r5 = r2 / r0
            int r6 = r4 / r1
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r0 * r5
            int r6 = r2 - r6
            int r6 = r6 / 2
            int r7 = r1 * r5
            int r7 = r4 - r7
            int r7 = r7 / 2
            b.l.f.y.b r8 = new b.l.f.y.b
            r8.<init>(r2, r4)
            r2 = 0
        L_0x0423:
            if (r2 >= r1) goto L_0x043a
            r4 = 0
            r9 = r6
        L_0x0427:
            if (r4 >= r0) goto L_0x0436
            boolean r10 = r3.mo16333b(r4, r2)
            if (r10 == 0) goto L_0x0432
            r8.mo16340h(r9, r7, r5, r5)
        L_0x0432:
            int r4 = r4 + 1
            int r9 = r9 + r5
            goto L_0x0427
        L_0x0436:
            int r2 = r2 + 1
            int r7 = r7 + r5
            goto L_0x0423
        L_0x043a:
            return r8
        L_0x043b:
            r5 = r21
            r8 = r22
            int r2 = r2 + 1
            r9 = 0
            r11 = 32
            r5 = r9
            r8 = r11
            goto L_0x0210
        L_0x0448:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Data too large for an Aztec code"
            r0.<init>(r1)
            throw r0
        L_0x0450:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r20)
            java.lang.String r2 = "Can only encode AZTEC, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p250w.C4631c.mo16167a(java.lang.String, b.l.f.a, int, int, java.util.Map):b.l.f.y.b");
    }
}
