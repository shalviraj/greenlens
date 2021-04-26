package p005b.p096l.p232f.p246e0.p248d;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p005b.p096l.p232f.C4626t;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.e0.d.e */
public class C4604e {

    /* renamed from: f */
    public static final C4606b f8646f = new C4606b((C4605a) null);

    /* renamed from: a */
    public final C4658b f8647a;

    /* renamed from: b */
    public final List<C4603d> f8648b = new ArrayList();

    /* renamed from: c */
    public boolean f8649c;

    /* renamed from: d */
    public final int[] f8650d = new int[5];

    /* renamed from: e */
    public final C4626t f8651e;

    /* renamed from: b.l.f.e0.d.e$b */
    public static final class C4606b implements Serializable, Comparator<C4603d> {
        public C4606b(C4605a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            return Float.compare(((C4603d) obj).f8644c, ((C4603d) obj2).f8644c);
        }
    }

    public C4604e(C4658b bVar, C4626t tVar) {
        this.f8647a = bVar;
        this.f8651e = tVar;
    }

    /* renamed from: a */
    public static float m8485a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: c */
    public static boolean m8486c(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: h */
    public static double m8487h(C4603d dVar, C4603d dVar2) {
        double d = (double) (dVar.f8708a - dVar2.f8708a);
        double d2 = (double) (dVar.f8709b - dVar2.f8709b);
        return (d2 * d2) + (d * d);
    }

    /* renamed from: b */
    public final void mo16260b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* renamed from: d */
    public final int[] mo16261d() {
        mo16260b(this.f8650d);
        return this.f8650d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x033f A[LOOP:19: B:179:0x02dd->B:193:0x033f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x031e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ea  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16262e(int[] r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            r5 = r1[r4]
            int r3 = r3 + r5
            r5 = 2
            r6 = r1[r5]
            int r3 = r3 + r6
            r6 = 3
            r7 = r1[r6]
            int r3 = r3 + r7
            r7 = 4
            r8 = r1[r7]
            int r3 = r3 + r8
            r8 = r20
            float r8 = m8485a(r1, r8)
            int r8 = (int) r8
            r9 = r1[r5]
            b.l.f.y.b r10 = r0.f8647a
            int r11 = r10.f8788h
            int[] r12 = r17.mo16261d()
            r13 = r19
        L_0x002a:
            if (r13 < 0) goto L_0x003a
            boolean r14 = r10.mo16333b(r8, r13)
            if (r14 == 0) goto L_0x003a
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + -1
            goto L_0x002a
        L_0x003a:
            r15 = 5
            if (r13 >= 0) goto L_0x003f
            goto L_0x00e2
        L_0x003f:
            if (r13 < 0) goto L_0x0053
            boolean r16 = r10.mo16333b(r8, r13)
            if (r16 != 0) goto L_0x0053
            r14 = r12[r4]
            if (r14 > r9) goto L_0x0053
            r14 = r12[r4]
            int r14 = r14 + r4
            r12[r4] = r14
            int r13 = r13 + -1
            goto L_0x003f
        L_0x0053:
            if (r13 < 0) goto L_0x00e2
            r14 = r12[r4]
            if (r14 <= r9) goto L_0x005b
            goto L_0x00e2
        L_0x005b:
            if (r13 < 0) goto L_0x006f
            boolean r14 = r10.mo16333b(r8, r13)
            if (r14 == 0) goto L_0x006f
            r14 = r12[r2]
            if (r14 > r9) goto L_0x006f
            r14 = r12[r2]
            int r14 = r14 + r4
            r12[r2] = r14
            int r13 = r13 + -1
            goto L_0x005b
        L_0x006f:
            r13 = r12[r2]
            if (r13 <= r9) goto L_0x0075
            goto L_0x00e2
        L_0x0075:
            int r13 = r19 + 1
        L_0x0077:
            if (r13 >= r11) goto L_0x0087
            boolean r14 = r10.mo16333b(r8, r13)
            if (r14 == 0) goto L_0x0087
            r14 = r12[r5]
            int r14 = r14 + r4
            r12[r5] = r14
            int r13 = r13 + 1
            goto L_0x0077
        L_0x0087:
            if (r13 != r11) goto L_0x008a
            goto L_0x00e2
        L_0x008a:
            if (r13 >= r11) goto L_0x009e
            boolean r14 = r10.mo16333b(r8, r13)
            if (r14 != 0) goto L_0x009e
            r14 = r12[r6]
            if (r14 >= r9) goto L_0x009e
            r14 = r12[r6]
            int r14 = r14 + r4
            r12[r6] = r14
            int r13 = r13 + 1
            goto L_0x008a
        L_0x009e:
            if (r13 == r11) goto L_0x00e2
            r14 = r12[r6]
            if (r14 < r9) goto L_0x00a5
            goto L_0x00e2
        L_0x00a5:
            if (r13 >= r11) goto L_0x00b9
            boolean r14 = r10.mo16333b(r8, r13)
            if (r14 == 0) goto L_0x00b9
            r14 = r12[r7]
            if (r14 >= r9) goto L_0x00b9
            r14 = r12[r7]
            int r14 = r14 + r4
            r12[r7] = r14
            int r13 = r13 + 1
            goto L_0x00a5
        L_0x00b9:
            r10 = r12[r7]
            if (r10 < r9) goto L_0x00be
            goto L_0x00e2
        L_0x00be:
            r9 = r12[r2]
            r10 = r12[r4]
            int r9 = r9 + r10
            r10 = r12[r5]
            int r9 = r9 + r10
            r10 = r12[r6]
            int r9 = r9 + r10
            r10 = r12[r7]
            int r9 = r9 + r10
            int r9 = r9 - r3
            int r9 = java.lang.Math.abs(r9)
            int r9 = r9 * r15
            int r10 = r3 * 2
            if (r9 < r10) goto L_0x00d7
            goto L_0x00e2
        L_0x00d7:
            boolean r9 = m8486c(r12)
            if (r9 == 0) goto L_0x00e2
            float r9 = m8485a(r12, r13)
            goto L_0x00e4
        L_0x00e2:
            r9 = 2143289344(0x7fc00000, float:NaN)
        L_0x00e4:
            boolean r10 = java.lang.Float.isNaN(r9)
            if (r10 != 0) goto L_0x0357
            int r10 = (int) r9
            r1 = r1[r5]
            b.l.f.y.b r11 = r0.f8647a
            int r12 = r11.f8787g
            int[] r13 = r17.mo16261d()
            r14 = r8
        L_0x00f6:
            if (r14 < 0) goto L_0x0107
            boolean r16 = r11.mo16333b(r14, r10)
            if (r16 == 0) goto L_0x0107
            r16 = r13[r5]
            int r16 = r16 + 1
            r13[r5] = r16
            int r14 = r14 + -1
            goto L_0x00f6
        L_0x0107:
            if (r14 >= 0) goto L_0x010b
            goto L_0x01ad
        L_0x010b:
            if (r14 < 0) goto L_0x0120
            boolean r16 = r11.mo16333b(r14, r10)
            if (r16 != 0) goto L_0x0120
            r15 = r13[r4]
            if (r15 > r1) goto L_0x0120
            r15 = r13[r4]
            int r15 = r15 + r4
            r13[r4] = r15
            int r14 = r14 + -1
            r15 = 5
            goto L_0x010b
        L_0x0120:
            if (r14 < 0) goto L_0x01ad
            r15 = r13[r4]
            if (r15 <= r1) goto L_0x0128
            goto L_0x01ad
        L_0x0128:
            if (r14 < 0) goto L_0x013c
            boolean r15 = r11.mo16333b(r14, r10)
            if (r15 == 0) goto L_0x013c
            r15 = r13[r2]
            if (r15 > r1) goto L_0x013c
            r15 = r13[r2]
            int r15 = r15 + r4
            r13[r2] = r15
            int r14 = r14 + -1
            goto L_0x0128
        L_0x013c:
            r14 = r13[r2]
            if (r14 <= r1) goto L_0x0142
            goto L_0x01ad
        L_0x0142:
            int r8 = r8 + r4
        L_0x0143:
            if (r8 >= r12) goto L_0x0153
            boolean r14 = r11.mo16333b(r8, r10)
            if (r14 == 0) goto L_0x0153
            r14 = r13[r5]
            int r14 = r14 + r4
            r13[r5] = r14
            int r8 = r8 + 1
            goto L_0x0143
        L_0x0153:
            if (r8 != r12) goto L_0x0156
            goto L_0x01ad
        L_0x0156:
            if (r8 >= r12) goto L_0x016a
            boolean r14 = r11.mo16333b(r8, r10)
            if (r14 != 0) goto L_0x016a
            r14 = r13[r6]
            if (r14 >= r1) goto L_0x016a
            r14 = r13[r6]
            int r14 = r14 + r4
            r13[r6] = r14
            int r8 = r8 + 1
            goto L_0x0156
        L_0x016a:
            if (r8 == r12) goto L_0x01ad
            r14 = r13[r6]
            if (r14 < r1) goto L_0x0171
            goto L_0x01ad
        L_0x0171:
            if (r8 >= r12) goto L_0x0185
            boolean r14 = r11.mo16333b(r8, r10)
            if (r14 == 0) goto L_0x0185
            r14 = r13[r7]
            if (r14 >= r1) goto L_0x0185
            r14 = r13[r7]
            int r14 = r14 + r4
            r13[r7] = r14
            int r8 = r8 + 1
            goto L_0x0171
        L_0x0185:
            r11 = r13[r7]
            if (r11 < r1) goto L_0x018a
            goto L_0x01ad
        L_0x018a:
            r1 = r13[r2]
            r11 = r13[r4]
            int r1 = r1 + r11
            r11 = r13[r5]
            int r1 = r1 + r11
            r11 = r13[r6]
            int r1 = r1 + r11
            r11 = r13[r7]
            int r1 = r1 + r11
            int r1 = r1 - r3
            int r1 = java.lang.Math.abs(r1)
            r11 = 5
            int r1 = r1 * r11
            if (r1 < r3) goto L_0x01a2
            goto L_0x01ad
        L_0x01a2:
            boolean r1 = m8486c(r13)
            if (r1 == 0) goto L_0x01ad
            float r14 = m8485a(r13, r8)
            goto L_0x01af
        L_0x01ad:
            r14 = 2143289344(0x7fc00000, float:NaN)
        L_0x01af:
            boolean r1 = java.lang.Float.isNaN(r14)
            if (r1 != 0) goto L_0x0357
            int r1 = (int) r14
            int[] r8 = r17.mo16261d()
            r11 = r2
        L_0x01bb:
            if (r10 < r11) goto L_0x01d3
            if (r1 < r11) goto L_0x01d3
            b.l.f.y.b r12 = r0.f8647a
            int r13 = r1 - r11
            int r15 = r10 - r11
            boolean r12 = r12.mo16333b(r13, r15)
            if (r12 == 0) goto L_0x01d3
            r12 = r8[r5]
            int r12 = r12 + r4
            r8[r5] = r12
            int r11 = r11 + 1
            goto L_0x01bb
        L_0x01d3:
            r12 = r8[r5]
            if (r12 != 0) goto L_0x01d8
            goto L_0x0211
        L_0x01d8:
            if (r10 < r11) goto L_0x01f0
            if (r1 < r11) goto L_0x01f0
            b.l.f.y.b r12 = r0.f8647a
            int r15 = r1 - r11
            int r13 = r10 - r11
            boolean r12 = r12.mo16333b(r15, r13)
            if (r12 != 0) goto L_0x01f0
            r12 = r8[r4]
            int r12 = r12 + r4
            r8[r4] = r12
            int r11 = r11 + 1
            goto L_0x01d8
        L_0x01f0:
            r12 = r8[r4]
            if (r12 != 0) goto L_0x01f5
            goto L_0x0211
        L_0x01f5:
            if (r10 < r11) goto L_0x020d
            if (r1 < r11) goto L_0x020d
            b.l.f.y.b r12 = r0.f8647a
            int r13 = r1 - r11
            int r15 = r10 - r11
            boolean r12 = r12.mo16333b(r13, r15)
            if (r12 == 0) goto L_0x020d
            r12 = r8[r2]
            int r12 = r12 + r4
            r8[r2] = r12
            int r11 = r11 + 1
            goto L_0x01f5
        L_0x020d:
            r11 = r8[r2]
            if (r11 != 0) goto L_0x0214
        L_0x0211:
            r7 = r2
            goto L_0x02d6
        L_0x0214:
            b.l.f.y.b r11 = r0.f8647a
            int r12 = r11.f8788h
            int r11 = r11.f8787g
            r13 = r4
        L_0x021b:
            int r15 = r10 + r13
            if (r15 >= r12) goto L_0x0235
            int r2 = r1 + r13
            if (r2 >= r11) goto L_0x0235
            b.l.f.y.b r7 = r0.f8647a
            boolean r2 = r7.mo16333b(r2, r15)
            if (r2 == 0) goto L_0x0235
            r2 = r8[r5]
            int r2 = r2 + r4
            r8[r5] = r2
            int r13 = r13 + 1
            r2 = 0
            r7 = 4
            goto L_0x021b
        L_0x0235:
            int r2 = r10 + r13
            if (r2 >= r12) goto L_0x024d
            int r7 = r1 + r13
            if (r7 >= r11) goto L_0x024d
            b.l.f.y.b r15 = r0.f8647a
            boolean r2 = r15.mo16333b(r7, r2)
            if (r2 != 0) goto L_0x024d
            r2 = r8[r6]
            int r2 = r2 + r4
            r8[r6] = r2
            int r13 = r13 + 1
            goto L_0x0235
        L_0x024d:
            r2 = r8[r6]
            if (r2 != 0) goto L_0x0253
            goto L_0x02d5
        L_0x0253:
            int r2 = r10 + r13
            if (r2 >= r12) goto L_0x026c
            int r7 = r1 + r13
            if (r7 >= r11) goto L_0x026c
            b.l.f.y.b r15 = r0.f8647a
            boolean r2 = r15.mo16333b(r7, r2)
            if (r2 == 0) goto L_0x026c
            r2 = 4
            r7 = r8[r2]
            int r7 = r7 + r4
            r8[r2] = r7
            int r13 = r13 + 1
            goto L_0x0253
        L_0x026c:
            r2 = 4
            r1 = r8[r2]
            if (r1 != 0) goto L_0x0272
            goto L_0x02d5
        L_0x0272:
            r1 = 0
            r2 = 0
            r7 = 5
        L_0x0275:
            if (r1 >= r7) goto L_0x0280
            r10 = r8[r1]
            if (r10 != 0) goto L_0x027c
            goto L_0x02d5
        L_0x027c:
            int r2 = r2 + r10
            int r1 = r1 + 1
            goto L_0x0275
        L_0x0280:
            r1 = 7
            if (r2 >= r1) goto L_0x0284
            goto L_0x02d5
        L_0x0284:
            float r1 = (float) r2
            r2 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r2
            r2 = 1068146622(0x3faa9fbe, float:1.333)
            float r2 = r1 / r2
            r7 = 0
            r10 = r8[r7]
            float r7 = (float) r10
            float r7 = r1 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x02d5
            r7 = r8[r4]
            float r7 = (float) r7
            float r7 = r1 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x02d5
            r7 = 1077936128(0x40400000, float:3.0)
            float r10 = r1 * r7
            r5 = r8[r5]
            float r5 = (float) r5
            float r10 = r10 - r5
            float r5 = java.lang.Math.abs(r10)
            float r7 = r7 * r2
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x02d5
            r5 = r8[r6]
            float r5 = (float) r5
            float r5 = r1 - r5
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x02d5
            r5 = 4
            r5 = r8[r5]
            float r5 = (float) r5
            float r1 = r1 - r5
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x02d5
            r7 = r4
            goto L_0x02d6
        L_0x02d5:
            r7 = 0
        L_0x02d6:
            if (r7 == 0) goto L_0x0357
            float r1 = (float) r3
            r2 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r2
            r7 = 0
        L_0x02dd:
            java.util.List<b.l.f.e0.d.d> r2 = r0.f8648b
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x0342
            java.util.List<b.l.f.e0.d.d> r2 = r0.f8648b
            java.lang.Object r2 = r2.get(r7)
            b.l.f.e0.d.d r2 = (p005b.p096l.p232f.p246e0.p248d.C4603d) r2
            float r3 = r2.f8709b
            float r3 = r9 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x031b
            float r3 = r2.f8708a
            float r3 = r14 - r3
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x031b
            float r3 = r2.f8644c
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0319
            float r5 = r2.f8644c
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x031b
        L_0x0319:
            r3 = r4
            goto L_0x031c
        L_0x031b:
            r3 = 0
        L_0x031c:
            if (r3 == 0) goto L_0x033f
            java.util.List<b.l.f.e0.d.d> r3 = r0.f8648b
            int r5 = r2.f8645d
            int r6 = r5 + 1
            float r5 = (float) r5
            float r8 = r2.f8708a
            float r8 = r8 * r5
            float r8 = r8 + r14
            float r10 = (float) r6
            float r8 = r8 / r10
            float r11 = r2.f8709b
            float r11 = r11 * r5
            float r11 = r11 + r9
            float r11 = r11 / r10
            float r2 = r2.f8644c
            float r5 = r5 * r2
            float r5 = r5 + r1
            float r5 = r5 / r10
            b.l.f.e0.d.d r2 = new b.l.f.e0.d.d
            r2.<init>(r8, r11, r5, r6)
            r3.set(r7, r2)
            r2 = r4
            goto L_0x0343
        L_0x033f:
            int r7 = r7 + 1
            goto L_0x02dd
        L_0x0342:
            r2 = 0
        L_0x0343:
            if (r2 != 0) goto L_0x0356
            b.l.f.e0.d.d r2 = new b.l.f.e0.d.d
            r2.<init>(r14, r9, r1)
            java.util.List<b.l.f.e0.d.d> r1 = r0.f8648b
            r1.add(r2)
            b.l.f.t r1 = r0.f8651e
            if (r1 == 0) goto L_0x0356
            r1.mo16288a(r2)
        L_0x0356:
            return r4
        L_0x0357:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p246e0.p248d.C4604e.mo16262e(int[], int, int):boolean");
    }

    /* renamed from: f */
    public final boolean mo16263f() {
        int size = this.f8648b.size();
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        for (C4603d next : this.f8648b) {
            if (next.f8645d >= 2) {
                i++;
                f2 += next.f8644c;
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C4603d dVar : this.f8648b) {
            f += Math.abs(dVar.f8644c - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo16264g(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
