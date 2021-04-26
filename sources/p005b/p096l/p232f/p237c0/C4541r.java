package p005b.p096l.p232f.p237c0;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p005b.p096l.p232f.C4492c;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4616j;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4621o;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.C4624r;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p258y.C4657a;
import p005b.p096l.p232f.p258y.C4664h;

/* renamed from: b.l.f.c0.r */
public abstract class C4541r implements C4621o {
    /* renamed from: f */
    public static float m8349f(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* renamed from: g */
    public static void m8350g(C4657a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i3 = aVar.f8786h;
        if (i < i3) {
            boolean z = !aVar.mo16323f(i);
            while (i < i3) {
                if (aVar.mo16323f(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != i3) {
                throw C4619m.f8685i;
            }
            return;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: h */
    public static void m8351h(C4657a aVar, int i, int[] iArr) {
        int length = iArr.length;
        boolean f = aVar.mo16323f(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo16323f(i) != f) {
                length--;
                f = !f;
            }
        }
        if (length < 0) {
            m8350g(aVar, i + 1, iArr);
            return;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: a */
    public C4623q mo16152a(C4492c cVar, Map<C4577e, ?> map) {
        C4624r rVar = C4624r.ORIENTATION;
        try {
            return mo16204e(cVar, map);
        } catch (C4619m e) {
            if (!(map != null && map.containsKey(C4577e.TRY_HARDER)) || !cVar.f8360a.f8354a.mo16276d()) {
                throw e;
            }
            C4616j e2 = cVar.f8360a.f8354a.mo16277e();
            Objects.requireNonNull((C4664h) cVar.f8360a);
            C4492c cVar2 = new C4492c(new C4664h(e2));
            C4623q e3 = mo16204e(cVar2, map);
            Map<C4624r, Object> map2 = e3.f8695e;
            int i = 270;
            if (map2 != null && map2.containsKey(rVar)) {
                i = (((Integer) map2.get(rVar)).intValue() + 270) % 360;
            }
            e3.mo16283b(rVar, Integer.valueOf(i));
            C4625s[] sVarArr = e3.f8693c;
            if (sVarArr != null) {
                int i2 = cVar2.f8360a.f8354a.f8681b;
                for (int i3 = 0; i3 < sVarArr.length; i3++) {
                    sVarArr[i3] = new C4625s((((float) i2) - sVarArr[i3].f8709b) - 1.0f, sVarArr[i3].f8708a);
                }
            }
            return e3;
        }
    }

    /* renamed from: b */
    public C4623q mo16153b(C4492c cVar) {
        return mo16152a(cVar, (Map<C4577e, ?>) null);
    }

    /* renamed from: c */
    public void mo16154c() {
    }

    /* renamed from: d */
    public abstract C4623q mo16159d(int i, C4657a aVar, Map<C4577e, ?> map);

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007c A[Catch:{ p -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00bf A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p232f.C4623q mo16204e(p005b.p096l.p232f.C4492c r20, java.util.Map<p005b.p096l.p232f.C4577e, ?> r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            b.l.f.b r2 = r0.f8360a
            b.l.f.j r2 = r2.f8354a
            int r3 = r2.f8680a
            int r2 = r2.f8681b
            b.l.f.y.a r4 = new b.l.f.y.a
            r4.<init>(r3)
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x001f
            b.l.f.e r7 = p005b.p096l.p232f.C4577e.TRY_HARDER
            boolean r7 = r1.containsKey(r7)
            if (r7 == 0) goto L_0x001f
            r7 = r5
            goto L_0x0020
        L_0x001f:
            r7 = r6
        L_0x0020:
            if (r7 == 0) goto L_0x0025
            r8 = 8
            goto L_0x0026
        L_0x0025:
            r8 = 5
        L_0x0026:
            int r8 = r2 >> r8
            int r8 = java.lang.Math.max(r5, r8)
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = 15
        L_0x0032:
            int r9 = r2 / 2
            r10 = r6
        L_0x0035:
            if (r10 >= r7) goto L_0x00dc
            int r11 = r10 + 1
            int r12 = r11 / 2
            r10 = r10 & 1
            if (r10 != 0) goto L_0x0041
            r10 = r5
            goto L_0x0042
        L_0x0041:
            r10 = r6
        L_0x0042:
            if (r10 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            int r12 = -r12
        L_0x0046:
            int r12 = r12 * r8
            int r12 = r12 + r9
            if (r12 < 0) goto L_0x00dc
            if (r12 >= r2) goto L_0x00dc
            b.l.f.y.a r4 = r0.mo16157b(r12, r4)     // Catch:{ m -> 0x00cf }
            r10 = r6
        L_0x0051:
            r13 = 2
            if (r10 >= r13) goto L_0x00cf
            if (r10 != r5) goto L_0x0074
            r4.mo16329k()
            if (r1 == 0) goto L_0x0074
            b.l.f.e r13 = p005b.p096l.p232f.C4577e.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r1.containsKey(r13)
            if (r14 == 0) goto L_0x0074
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<b.l.f.e> r15 = p005b.p096l.p232f.C4577e.class
            r14.<init>(r15)
            r14.putAll(r1)
            r14.remove(r13)
            r13 = r19
            r1 = r14
            goto L_0x0076
        L_0x0074:
            r13 = r19
        L_0x0076:
            b.l.f.q r14 = r13.mo16159d(r12, r4, r1)     // Catch:{ p -> 0x00c0 }
            if (r10 != r5) goto L_0x00bf
            b.l.f.r r15 = p005b.p096l.p232f.C4624r.ORIENTATION     // Catch:{ p -> 0x00c0 }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ p -> 0x00b9 }
            r14.mo16283b(r15, r5)     // Catch:{ p -> 0x00b9 }
            b.l.f.s[] r5 = r14.f8693c     // Catch:{ p -> 0x00b9 }
            if (r5 == 0) goto L_0x00bf
            b.l.f.s r15 = new b.l.f.s     // Catch:{ p -> 0x00b9 }
            float r0 = (float) r3
            r16 = r1
            r1 = r5[r6]     // Catch:{ p -> 0x00bb }
            float r1 = r1.f8708a     // Catch:{ p -> 0x00bb }
            float r1 = r0 - r1
            r17 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r17
            r18 = r2
            r2 = r5[r6]     // Catch:{ p -> 0x00bd }
            float r2 = r2.f8709b     // Catch:{ p -> 0x00bd }
            r15.<init>(r1, r2)     // Catch:{ p -> 0x00bd }
            r5[r6] = r15     // Catch:{ p -> 0x00bd }
            b.l.f.s r1 = new b.l.f.s     // Catch:{ p -> 0x00bd }
            r2 = 1
            r15 = r5[r2]     // Catch:{ p -> 0x00c5 }
            float r15 = r15.f8708a     // Catch:{ p -> 0x00c5 }
            float r0 = r0 - r15
            float r0 = r0 - r17
            r15 = r5[r2]     // Catch:{ p -> 0x00c5 }
            float r15 = r15.f8709b     // Catch:{ p -> 0x00c5 }
            r1.<init>(r0, r15)     // Catch:{ p -> 0x00c5 }
            r5[r2] = r1     // Catch:{ p -> 0x00c5 }
            goto L_0x00bf
        L_0x00b9:
            r16 = r1
        L_0x00bb:
            r18 = r2
        L_0x00bd:
            r2 = 1
            goto L_0x00c5
        L_0x00bf:
            return r14
        L_0x00c0:
            r16 = r1
            r18 = r2
            r2 = r5
        L_0x00c5:
            int r10 = r10 + 1
            r0 = r20
            r5 = r2
            r1 = r16
            r2 = r18
            goto L_0x0051
        L_0x00cf:
            r13 = r19
            r18 = r2
            r2 = r5
            r0 = r20
            r5 = r2
            r10 = r11
            r2 = r18
            goto L_0x0035
        L_0x00dc:
            r13 = r19
            b.l.f.m r0 = p005b.p096l.p232f.C4619m.f8685i
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p237c0.C4541r.mo16204e(b.l.f.c, java.util.Map):b.l.f.q");
    }
}
