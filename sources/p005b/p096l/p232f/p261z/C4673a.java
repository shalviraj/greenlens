package p005b.p096l.p232f.p261z;

import java.util.Map;
import p005b.p096l.p232f.C4492c;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4621o;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p261z.p262c.C4679d;

/* renamed from: b.l.f.z.a */
public final class C4673a implements C4621o {

    /* renamed from: b */
    public static final C4625s[] f8879b = new C4625s[0];

    /* renamed from: a */
    public final C4679d f8880a = new C4679d();

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0183, code lost:
        if ((r1.mo16370d(r10, r14) + r1.mo16370d(r11, r14)) > (r1.mo16370d(r10, r2) + r1.mo16370d(r11, r2))) goto L_0x0185;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p232f.C4623q mo16152a(p005b.p096l.p232f.C4492c r34, java.util.Map<p005b.p096l.p232f.C4577e, ?> r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r35
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0087
            b.l.f.e r4 = p005b.p096l.p232f.C4577e.PURE_BARCODE
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0087
            b.l.f.y.b r1 = r34.mo16156a()
            int[] r4 = r1.mo16338f()
            int[] r5 = r1.mo16334c()
            if (r4 == 0) goto L_0x0084
            if (r5 == 0) goto L_0x0084
            int r6 = r1.f8787g
            r7 = r4[r2]
            r8 = r4[r3]
        L_0x0026:
            if (r7 >= r6) goto L_0x0031
            boolean r9 = r1.mo16333b(r7, r8)
            if (r9 == 0) goto L_0x0031
            int r7 = r7 + 1
            goto L_0x0026
        L_0x0031:
            if (r7 == r6) goto L_0x0081
            r6 = r4[r2]
            int r7 = r7 - r6
            if (r7 == 0) goto L_0x007e
            r6 = r4[r3]
            r8 = r5[r3]
            r4 = r4[r2]
            r5 = r5[r2]
            int r5 = r5 - r4
            int r5 = r5 + r3
            int r5 = r5 / r7
            int r8 = r8 - r6
            int r8 = r8 + r3
            int r8 = r8 / r7
            if (r5 <= 0) goto L_0x007b
            if (r8 <= 0) goto L_0x007b
            int r3 = r7 / 2
            int r6 = r6 + r3
            int r4 = r4 + r3
            b.l.f.y.b r3 = new b.l.f.y.b
            r3.<init>(r5, r8)
            r9 = r2
        L_0x0054:
            if (r9 >= r8) goto L_0x006e
            int r10 = r9 * r7
            int r10 = r10 + r6
            r11 = r2
        L_0x005a:
            if (r11 >= r5) goto L_0x006b
            int r12 = r11 * r7
            int r12 = r12 + r4
            boolean r12 = r1.mo16333b(r12, r10)
            if (r12 == 0) goto L_0x0068
            r3.mo16339g(r11, r9)
        L_0x0068:
            int r11 = r11 + 1
            goto L_0x005a
        L_0x006b:
            int r9 = r9 + 1
            goto L_0x0054
        L_0x006e:
            b.l.f.z.c.d r1 = r0.f8880a
            b.l.f.y.e r1 = r1.mo16367a(r3)
            b.l.f.s[] r2 = f8879b
            r32 = r2
            r2 = r0
            goto L_0x02a6
        L_0x007b:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x007e:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x0081:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x0084:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x0087:
            b.l.f.z.d.a r1 = new b.l.f.z.d.a
            b.l.f.y.b r4 = r34.mo16156a()
            r1.<init>(r4)
            b.l.f.y.k.a r4 = r1.f8913b
            b.l.f.s[] r4 = r4.mo16348b()
            r5 = r4[r2]
            r6 = r4[r3]
            r7 = 3
            r8 = r4[r7]
            r9 = 2
            r4 = r4[r9]
            int r10 = r1.mo16370d(r5, r6)
            int r11 = r1.mo16370d(r6, r8)
            int r12 = r1.mo16370d(r8, r4)
            int r13 = r1.mo16370d(r4, r5)
            r14 = 4
            b.l.f.s[] r15 = new p005b.p096l.p232f.C4625s[r14]
            r15[r2] = r4
            r15[r3] = r5
            r15[r9] = r6
            r15[r7] = r8
            if (r10 <= r11) goto L_0x00c6
            r15[r2] = r5
            r15[r3] = r6
            r15[r9] = r8
            r15[r7] = r4
            r10 = r11
        L_0x00c6:
            if (r10 <= r12) goto L_0x00d1
            r15[r2] = r6
            r15[r3] = r8
            r15[r9] = r4
            r15[r7] = r5
            goto L_0x00d2
        L_0x00d1:
            r12 = r10
        L_0x00d2:
            if (r12 <= r13) goto L_0x00dc
            r15[r2] = r8
            r15[r3] = r4
            r15[r9] = r5
            r15[r7] = r6
        L_0x00dc:
            r4 = r15[r2]
            r5 = r15[r3]
            r6 = r15[r9]
            r8 = r15[r7]
            int r10 = r1.mo16370d(r4, r8)
            int r10 = r10 + r3
            int r10 = r10 << r9
            b.l.f.s r11 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r5, r6, r10)
            b.l.f.s r10 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r6, r5, r10)
            int r11 = r1.mo16370d(r11, r4)
            int r10 = r1.mo16370d(r10, r8)
            if (r11 >= r10) goto L_0x0105
            r15[r2] = r4
            r15[r3] = r5
            r15[r9] = r6
            r15[r7] = r8
            goto L_0x010d
        L_0x0105:
            r15[r2] = r5
            r15[r3] = r6
            r15[r9] = r8
            r15[r7] = r4
        L_0x010d:
            r4 = r15[r2]
            r5 = r15[r3]
            r6 = r15[r9]
            r8 = r15[r7]
            int r10 = r1.mo16370d(r4, r8)
            int r11 = r1.mo16370d(r5, r8)
            int r11 = r11 + r3
            int r11 = r11 << r9
            b.l.f.s r11 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r4, r5, r11)
            int r10 = r10 + r3
            int r10 = r10 << r9
            b.l.f.s r10 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r6, r5, r10)
            int r12 = r1.mo16370d(r11, r8)
            int r13 = r1.mo16370d(r10, r8)
            b.l.f.s r14 = new b.l.f.s
            float r9 = r8.f8708a
            float r2 = r6.f8708a
            float r7 = r5.f8708a
            float r2 = r2 - r7
            int r12 = r12 + r3
            float r12 = (float) r12
            float r2 = r2 / r12
            float r2 = r2 + r9
            float r8 = r8.f8709b
            float r6 = r6.f8709b
            float r5 = r5.f8709b
            float r6 = r6 - r5
            float r6 = r6 / r12
            float r6 = r6 + r8
            r14.<init>(r2, r6)
            b.l.f.s r2 = new b.l.f.s
            float r6 = r4.f8708a
            float r6 = r6 - r7
            int r13 = r13 + r3
            float r7 = (float) r13
            float r6 = r6 / r7
            float r6 = r6 + r9
            float r4 = r4.f8709b
            float r4 = r4 - r5
            float r4 = r4 / r7
            float r4 = r4 + r8
            r2.<init>(r6, r4)
            boolean r4 = r1.mo16369a(r14)
            if (r4 != 0) goto L_0x016a
            boolean r4 = r1.mo16369a(r2)
            if (r4 == 0) goto L_0x0168
            goto L_0x0187
        L_0x0168:
            r14 = 0
            goto L_0x0185
        L_0x016a:
            boolean r4 = r1.mo16369a(r2)
            if (r4 != 0) goto L_0x0171
            goto L_0x0185
        L_0x0171:
            int r4 = r1.mo16370d(r11, r14)
            int r5 = r1.mo16370d(r10, r14)
            int r5 = r5 + r4
            int r4 = r1.mo16370d(r11, r2)
            int r6 = r1.mo16370d(r10, r2)
            int r6 = r6 + r4
            if (r5 <= r6) goto L_0x0187
        L_0x0185:
            r2 = 3
            goto L_0x0189
        L_0x0187:
            r14 = r2
            goto L_0x0185
        L_0x0189:
            r15[r2] = r14
            r4 = r15[r2]
            if (r4 == 0) goto L_0x02c6
            r4 = 0
            r5 = r15[r4]
            r4 = r15[r3]
            r6 = 2
            r7 = r15[r6]
            r8 = r15[r2]
            int r2 = r1.mo16370d(r5, r8)
            int r2 = r2 + r3
            int r9 = r1.mo16370d(r7, r8)
            int r9 = r9 + r3
            int r9 = r9 << r6
            b.l.f.s r9 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r5, r4, r9)
            int r2 = r2 << r6
            b.l.f.s r2 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r7, r4, r2)
            int r6 = r1.mo16370d(r9, r8)
            int r6 = r6 + r3
            int r2 = r1.mo16370d(r2, r8)
            int r2 = r2 + r3
            r9 = r6 & 1
            if (r9 != r3) goto L_0x01bd
            int r6 = r6 + 1
        L_0x01bd:
            r9 = r2 & 1
            if (r9 != r3) goto L_0x01c3
            int r2 = r2 + 1
        L_0x01c3:
            float r9 = r5.f8708a
            float r10 = r4.f8708a
            float r9 = r9 + r10
            float r10 = r7.f8708a
            float r9 = r9 + r10
            float r10 = r8.f8708a
            float r9 = r9 + r10
            r10 = 1082130432(0x40800000, float:4.0)
            float r9 = r9 / r10
            float r11 = r5.f8709b
            float r12 = r4.f8709b
            float r11 = r11 + r12
            float r12 = r7.f8709b
            float r11 = r11 + r12
            float r12 = r8.f8709b
            float r11 = r11 + r12
            float r11 = r11 / r10
            b.l.f.s r5 = p005b.p096l.p232f.p261z.p263d.C4684a.m8616b(r5, r9, r11)
            b.l.f.s r4 = p005b.p096l.p232f.p261z.p263d.C4684a.m8616b(r4, r9, r11)
            b.l.f.s r7 = p005b.p096l.p232f.p261z.p263d.C4684a.m8616b(r7, r9, r11)
            b.l.f.s r8 = p005b.p096l.p232f.p261z.p263d.C4684a.m8616b(r8, r9, r11)
            r9 = 2
            int r2 = r2 << r9
            b.l.f.s r10 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r5, r4, r2)
            int r6 = r6 << r9
            b.l.f.s r10 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r10, r8, r6)
            b.l.f.s r11 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r4, r5, r2)
            b.l.f.s r11 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r11, r7, r6)
            b.l.f.s r12 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r7, r8, r2)
            b.l.f.s r4 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r12, r4, r6)
            b.l.f.s r2 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r8, r7, r2)
            b.l.f.s r2 = p005b.p096l.p232f.p261z.p263d.C4684a.m8617c(r2, r5, r6)
            r5 = 4
            b.l.f.s[] r6 = new p005b.p096l.p232f.C4625s[r5]
            r5 = 0
            r6[r5] = r10
            r6[r3] = r11
            r6[r9] = r4
            r4 = 3
            r6[r4] = r2
            r2 = r6[r5]
            r5 = r6[r3]
            r7 = r6[r9]
            r6 = r6[r4]
            int r4 = r1.mo16370d(r2, r6)
            int r4 = r4 + r3
            int r8 = r1.mo16370d(r7, r6)
            int r8 = r8 + r3
            r9 = r4 & 1
            if (r9 != r3) goto L_0x0235
            int r4 = r4 + 1
        L_0x0235:
            r9 = r8 & 1
            if (r9 != r3) goto L_0x023b
            int r8 = r8 + 1
        L_0x023b:
            int r9 = r4 * 4
            int r10 = r8 * 7
            if (r9 >= r10) goto L_0x024c
            int r9 = r8 * 4
            int r10 = r4 * 7
            if (r9 >= r10) goto L_0x024c
            int r4 = java.lang.Math.max(r4, r8)
            r8 = r4
        L_0x024c:
            b.l.f.y.b r1 = r1.f8912a
            b.l.f.y.f r9 = p005b.p096l.p232f.p258y.C4662f.f8834a
            r16 = 1056964608(0x3f000000, float:0.5)
            r17 = 1056964608(0x3f000000, float:0.5)
            float r10 = (float) r4
            r11 = 1056964608(0x3f000000, float:0.5)
            float r20 = r10 - r11
            r19 = 1056964608(0x3f000000, float:0.5)
            float r10 = (float) r8
            float r23 = r10 - r11
            float r10 = r2.f8708a
            float r11 = r2.f8709b
            float r12 = r6.f8708a
            float r13 = r6.f8709b
            float r14 = r7.f8708a
            float r15 = r7.f8709b
            float r3 = r5.f8708a
            float r0 = r5.f8709b
            r22 = 1056964608(0x3f000000, float:0.5)
            r18 = r20
            r21 = r23
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r14
            r29 = r15
            r30 = r3
            r31 = r0
            b.l.f.y.i r0 = p005b.p096l.p232f.p258y.C4665i.m8589a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            b.l.f.y.b r0 = r9.mo16345a(r1, r4, r8, r0)
            r1 = 4
            b.l.f.s[] r1 = new p005b.p096l.p232f.C4625s[r1]
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r5
            r2 = 2
            r1[r2] = r7
            r2 = 3
            r1[r2] = r6
            r2 = r33
            b.l.f.z.c.d r3 = r2.f8880a
            b.l.f.y.e r0 = r3.mo16367a(r0)
            r32 = r1
            r1 = r0
        L_0x02a6:
            r0 = r32
            b.l.f.q r3 = new b.l.f.q
            java.lang.String r4 = r1.f8828c
            byte[] r5 = r1.f8826a
            b.l.f.a r6 = p005b.p096l.p232f.C4484a.DATA_MATRIX
            r3.<init>(r4, r5, r0, r6)
            java.util.List<byte[]> r0 = r1.f8829d
            if (r0 == 0) goto L_0x02bc
            b.l.f.r r4 = p005b.p096l.p232f.C4624r.BYTE_SEGMENTS
            r3.mo16283b(r4, r0)
        L_0x02bc:
            java.lang.String r0 = r1.f8830e
            if (r0 == 0) goto L_0x02c5
            b.l.f.r r1 = p005b.p096l.p232f.C4624r.ERROR_CORRECTION_LEVEL
            r3.mo16283b(r1, r0)
        L_0x02c5:
            return r3
        L_0x02c6:
            r2 = r0
            b.l.f.m r0 = p005b.p096l.p232f.C4619m.f8685i
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p261z.C4673a.mo16152a(b.l.f.c, java.util.Map):b.l.f.q");
    }

    /* renamed from: b */
    public C4623q mo16153b(C4492c cVar) {
        return mo16152a(cVar, (Map<C4577e, ?>) null);
    }

    /* renamed from: c */
    public void mo16154c() {
    }
}
