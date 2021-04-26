package p005b.p096l.p097a.p113c.p131e.p136e;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import sun.misc.Unsafe;

/* renamed from: b.l.a.c.e.e.e0 */
public final class C2122e0<T> implements C2319m0<T> {

    /* renamed from: p */
    public static final int[] f3797p = new int[0];

    /* renamed from: q */
    public static final Unsafe f3798q = C2272k1.m3633o();

    /* renamed from: a */
    public final int[] f3799a;

    /* renamed from: b */
    public final Object[] f3800b;

    /* renamed from: c */
    public final int f3801c;

    /* renamed from: d */
    public final int f3802d;

    /* renamed from: e */
    public final C2072c0 f3803e;

    /* renamed from: f */
    public final boolean f3804f;

    /* renamed from: g */
    public final boolean f3805g;

    /* renamed from: h */
    public final boolean f3806h;

    /* renamed from: i */
    public final int[] f3807i;

    /* renamed from: j */
    public final int f3808j;

    /* renamed from: k */
    public final int f3809k;

    /* renamed from: l */
    public final C2414q f3810l;

    /* renamed from: m */
    public final C2023a1<?, ?> f3811m;

    /* renamed from: n */
    public final C2629ym<?> f3812n;

    /* renamed from: o */
    public final C2582x f3813o;

    public C2122e0(int[] iArr, Object[] objArr, int i, int i2, C2072c0 c0Var, boolean z, int[] iArr2, int i3, int i4, C2172g0 g0Var, C2414q qVar, C2023a1 a1Var, C2629ym ymVar, C2582x xVar) {
        this.f3799a = iArr;
        this.f3800b = objArr;
        this.f3801c = i;
        this.f3802d = i2;
        this.f3805g = c0Var instanceof C2071c;
        this.f3806h = z;
        this.f3804f = ymVar != null && ymVar.mo13121a(c0Var);
        this.f3807i = iArr2;
        this.f3808j = i3;
        this.f3809k = i4;
        this.f3810l = qVar;
        this.f3811m = a1Var;
        this.f3812n = ymVar;
        this.f3803e = c0Var;
        this.f3813o = xVar;
    }

    /* renamed from: C */
    public static final void m3237C(int i, Object obj, C2533um umVar) {
        if (obj instanceof String) {
            umVar.f4358a.mo12940p(i, (String) obj);
            return;
        }
        umVar.f4358a.mo12941q(i, (C2317lm) obj);
    }

    /* renamed from: D */
    public static C2048b1 m3238D(Object obj) {
        C2071c cVar = (C2071c) obj;
        C2048b1 b1Var = cVar.zzc;
        if (b1Var != C2048b1.f3616f) {
            return b1Var;
        }
        C2048b1 a = C2048b1.m3040a();
        cVar.zzc = a;
        return a;
    }

    /* renamed from: F */
    public static <T> C2122e0 m3239F(C2022a0 a0Var, C2172g0 g0Var, C2414q qVar, C2023a1 a1Var, C2629ym ymVar, C2582x xVar) {
        if (a0Var instanceof C2295l0) {
            return m3240G((C2295l0) a0Var, g0Var, qVar, a1Var, ymVar, xVar);
        }
        C2607y0 y0Var = (C2607y0) a0Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0395  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> p005b.p096l.p097a.p113c.p131e.p136e.C2122e0<T> m3240G(p005b.p096l.p097a.p113c.p131e.p136e.C2295l0 r35, p005b.p096l.p097a.p113c.p131e.p136e.C2172g0 r36, p005b.p096l.p097a.p113c.p131e.p136e.C2414q r37, p005b.p096l.p097a.p113c.p131e.p136e.C2023a1<?, ?> r38, p005b.p096l.p097a.p113c.p131e.p136e.C2629ym<?> r39, p005b.p096l.p097a.p113c.p131e.p136e.C2582x r40) {
        /*
            r0 = r35
            int r1 = r0.f4036d
            r2 = 1
            r1 = r1 & r2
            r3 = 2
            if (r1 != r2) goto L_0x000b
            r1 = r2
            goto L_0x000c
        L_0x000b:
            r1 = r3
        L_0x000c:
            r4 = 0
            if (r1 != r3) goto L_0x0011
            r11 = r2
            goto L_0x0012
        L_0x0011:
            r11 = r4
        L_0x0012:
            java.lang.String r1 = r0.f4034b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x002c
            r5 = r2
        L_0x0022:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x002d
            r5 = r7
            goto L_0x0022
        L_0x002c:
            r7 = r2
        L_0x002d:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x004c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0039:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0049
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0039
        L_0x0049:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x004c:
            if (r7 != 0) goto L_0x0059
            int[] r7 = f3797p
            r9 = r4
            r10 = r9
            r12 = r10
            r14 = r12
            r15 = r14
            r13 = r7
            r7 = r15
            goto L_0x016a
        L_0x0059:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0078
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0065:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0075
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0065
        L_0x0075:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x0078:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0097
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0084:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0094
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0084
        L_0x0094:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x0097:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00b6
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a3:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a3
        L_0x00b3:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00b6:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00d5
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c2:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d2
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c2
        L_0x00d2:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00d5:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f4
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e1:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f1
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e1
        L_0x00f1:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f4:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x0115
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0100:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0111
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0100
        L_0x0111:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0115:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0138
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0121:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0133
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0121
        L_0x0133:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0138:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x015d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x0146:
            int r18 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0158
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r18
            goto L_0x0146
        L_0x0158:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r18
        L_0x015d:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int[] r4 = new int[r4]
            int r14 = r5 + r5
            int r14 = r14 + r7
            r7 = r13
            r13 = r4
            r4 = r5
            r5 = r16
        L_0x016a:
            sun.misc.Unsafe r8 = f3798q
            java.lang.Object[] r2 = r0.f4035c
            b.l.a.c.e.e.c0 r6 = r0.f4033a
            java.lang.Class r6 = r6.getClass()
            r20 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 + r12
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r7
            r23 = r15
            r7 = r20
            r24 = r21
            r20 = 0
            r22 = 0
        L_0x0189:
            if (r7 >= r3) goto L_0x03e8
            int r25 = r7 + 1
            char r7 = r1.charAt(r7)
            r26 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x01bd
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r25
            r25 = 13
        L_0x019e:
            int r27 = r3 + 1
            char r3 = r1.charAt(r3)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01b7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r25
            r7 = r7 | r3
            int r25 = r25 + 13
            r3 = r27
            r15 = r28
            goto L_0x019e
        L_0x01b7:
            int r3 = r3 << r25
            r7 = r7 | r3
            r3 = r27
            goto L_0x01c1
        L_0x01bd:
            r28 = r15
            r3 = r25
        L_0x01c1:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01f3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01d4:
            int r27 = r15 + 1
            char r15 = r1.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01ed
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r3 = r3 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01d4
        L_0x01ed:
            int r10 = r15 << r25
            r3 = r3 | r10
            r15 = r27
            goto L_0x01f7
        L_0x01f3:
            r29 = r10
            r15 = r25
        L_0x01f7:
            r10 = r3 & 255(0xff, float:3.57E-43)
            r25 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0205
            int r9 = r22 + 1
            r13[r22] = r20
            r22 = r9
        L_0x0205:
            r9 = 51
            if (r10 < r9) goto L_0x02b2
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r27 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x023d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
            r34 = r27
            r27 = r15
            r15 = r34
        L_0x0220:
            int r33 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r9) goto L_0x0236
            r9 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r27 = r27 | r9
            int r32 = r32 + 13
            r15 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0220
        L_0x0236:
            int r9 = r15 << r32
            r15 = r27 | r9
            r9 = r33
            goto L_0x023f
        L_0x023d:
            r9 = r27
        L_0x023f:
            r27 = r9
            int r9 = r10 + -51
            r0 = 9
            if (r9 == r0) goto L_0x0260
            r0 = 17
            if (r9 != r0) goto L_0x024c
            goto L_0x0260
        L_0x024c:
            r0 = 12
            if (r9 != r0) goto L_0x026e
            if (r11 != 0) goto L_0x026e
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
            goto L_0x026d
        L_0x0260:
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
        L_0x026d:
            r14 = r9
        L_0x026e:
            int r15 = r15 + r15
            r0 = r2[r15]
            boolean r9 = r0 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0278
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x0280
        L_0x0278:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = m3241H(r6, r0)
            r2[r15] = r0
        L_0x0280:
            r9 = r4
            r32 = r5
            long r4 = r8.objectFieldOffset(r0)
            int r0 = (int) r4
            int r15 = r15 + 1
            r4 = r2[r15]
            boolean r5 = r4 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x0293
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L_0x029b
        L_0x0293:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = m3241H(r6, r4)
            r2[r15] = r4
        L_0x029b:
            long r4 = r8.objectFieldOffset(r4)
            int r4 = (int) r4
            r19 = r1
            r30 = r4
            r31 = r14
            r15 = r27
            r18 = 1
            r4 = r0
            r14 = r6
            r0 = 55296(0xd800, float:7.7486E-41)
            r6 = 0
            goto L_0x03ae
        L_0x02b2:
            r9 = r4
            r32 = r5
            int r0 = r14 + 1
            r4 = r2[r14]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = m3241H(r6, r4)
            r5 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0327
            r14 = 17
            if (r10 != r14) goto L_0x02ca
            goto L_0x0327
        L_0x02ca:
            r14 = 27
            if (r10 == r14) goto L_0x0316
            if (r10 != r5) goto L_0x02d1
            goto L_0x0316
        L_0x02d1:
            r14 = 12
            if (r10 == r14) goto L_0x0306
            r14 = 30
            if (r10 == r14) goto L_0x0306
            r14 = 44
            if (r10 != r14) goto L_0x02de
            goto L_0x0306
        L_0x02de:
            r14 = 50
            if (r10 != r14) goto L_0x0303
            int r14 = r23 + 1
            r13[r23] = r20
            int r23 = r20 / 3
            int r23 = r23 + r23
            int r27 = r0 + 1
            r0 = r2[r0]
            r12[r23] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02ff
            int r0 = r27 + 1
            int r23 = r23 + 1
            r27 = r2[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0303
        L_0x02ff:
            r23 = r14
            r0 = r27
        L_0x0303:
            r18 = 1
            goto L_0x0334
        L_0x0306:
            if (r11 != 0) goto L_0x0303
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            r18 = 1
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
            goto L_0x0323
        L_0x0316:
            r18 = 1
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
        L_0x0323:
            r14 = r6
            r0 = r27
            goto L_0x0335
        L_0x0327:
            r18 = 1
            int r14 = r20 / 3
            int r14 = r14 + r14
            int r14 = r14 + 1
            java.lang.Class r27 = r4.getType()
            r12[r14] = r27
        L_0x0334:
            r14 = r6
        L_0x0335:
            long r5 = r8.objectFieldOffset(r4)
            int r4 = (int) r5
            r5 = r3 & 4096(0x1000, float:5.74E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            if (r5 != r6) goto L_0x0395
            r5 = 17
            if (r10 > r5) goto L_0x0395
            int r5 = r15 + 1
            char r6 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x0369
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0353:
            int r30 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r15) goto L_0x0365
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r19
            r6 = r6 | r5
            int r19 = r19 + 13
            r5 = r30
            goto L_0x0353
        L_0x0365:
            int r5 = r5 << r19
            r6 = r6 | r5
            goto L_0x036b
        L_0x0369:
            r30 = r5
        L_0x036b:
            int r5 = r9 + r9
            int r19 = r6 / 32
            int r19 = r19 + r5
            r5 = r2[r19]
            boolean r15 = r5 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x037a
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L_0x0382
        L_0x037a:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = m3241H(r14, r5)
            r2[r19] = r5
        L_0x0382:
            r31 = r0
            r19 = r1
            long r0 = r8.objectFieldOffset(r5)
            int r0 = (int) r0
            int r6 = r6 % 32
            r15 = r30
            r30 = r0
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03a0
        L_0x0395:
            r31 = r0
            r19 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r6 = 0
            r30 = 1048575(0xfffff, float:1.469367E-39)
        L_0x03a0:
            r1 = 18
            if (r10 < r1) goto L_0x03ae
            r1 = 49
            if (r10 > r1) goto L_0x03ae
            int r1 = r24 + 1
            r13[r24] = r4
            r24 = r1
        L_0x03ae:
            int r1 = r20 + 1
            r32[r20] = r7
            int r5 = r1 + 1
            r7 = r3 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x03bb
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03bc
        L_0x03bb:
            r7 = 0
        L_0x03bc:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03c3
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c4
        L_0x03c3:
            r3 = 0
        L_0x03c4:
            r3 = r3 | r7
            int r7 = r10 << 20
            r3 = r3 | r7
            r3 = r3 | r4
            r32[r1] = r3
            int r20 = r5 + 1
            int r1 = r6 << 20
            r1 = r1 | r30
            r32[r5] = r1
            r0 = r35
            r4 = r9
            r6 = r14
            r7 = r15
            r1 = r19
            r9 = r25
            r3 = r26
            r15 = r28
            r10 = r29
            r14 = r31
            r5 = r32
            goto L_0x0189
        L_0x03e8:
            r32 = r5
            r25 = r9
            r29 = r10
            r28 = r15
            b.l.a.c.e.e.e0 r0 = new b.l.a.c.e.e.e0
            r1 = r35
            b.l.a.c.e.e.c0 r10 = r1.f4033a
            r1 = r32
            r5 = r0
            r6 = r1
            r7 = r12
            r8 = r25
            r9 = r29
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.m3240G(b.l.a.c.e.e.l0, b.l.a.c.e.e.g0, b.l.a.c.e.e.q, b.l.a.c.e.e.a1, b.l.a.c.e.e.ym, b.l.a.c.e.e.x):b.l.a.c.e.e.e0");
    }

    /* renamed from: H */
    public static Field m3241H(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(C0843a.m441b(String.valueOf(str).length(), 40, name.length(), String.valueOf(arrays).length()));
            C0843a.m431G(sb, "Field ", str, " for ", name);
            throw new RuntimeException(C0843a.m455p(sb, " not found. Known fields are ", arrays));
        }
    }

    /* renamed from: o */
    public static <T> double m3242o(T t, long j) {
        return ((Double) C2272k1.m3631m(t, j)).doubleValue();
    }

    /* renamed from: p */
    public static <T> float m3243p(T t, long j) {
        return ((Float) C2272k1.m3631m(t, j)).floatValue();
    }

    /* renamed from: q */
    public static <T> int m3244q(T t, long j) {
        return ((Integer) C2272k1.m3631m(t, j)).intValue();
    }

    /* renamed from: r */
    public static <T> long m3245r(T t, long j) {
        return ((Long) C2272k1.m3631m(t, j)).longValue();
    }

    /* renamed from: s */
    public static <T> boolean m3246s(T t, long j) {
        return ((Boolean) C2272k1.m3631m(t, j)).booleanValue();
    }

    /* renamed from: A */
    public final int mo12540A(int i, int i2) {
        int length = (this.f3799a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f3799a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0463, code lost:
        r8 = r8 + 3;
        r6 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019f, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3886h(r11, r6, r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a9, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3891m(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b9, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3888j(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c9, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3893o(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d9, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3894p(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e9, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3890l(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12541B(T r17, p005b.p096l.p097a.p113c.p131e.p136e.C2533um r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f3804f
            r4 = 0
            if (r3 != 0) goto L_0x0474
            int[] r3 = r0.f3799a
            int r3 = r3.length
            sun.misc.Unsafe r5 = f3798q
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r6
            r8 = 0
            r10 = 0
        L_0x0016:
            if (r8 >= r3) goto L_0x046a
            int r11 = r0.mo12566m(r8)
            int[] r12 = r0.f3799a
            r13 = r12[r8]
            int r14 = r11 >>> 20
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 17
            r7 = 1
            if (r14 > r15) goto L_0x003c
            int r15 = r8 + 2
            r12 = r12[r15]
            r15 = r12 & r6
            if (r15 == r9) goto L_0x0037
            long r9 = (long) r15
            int r10 = r5.getInt(r1, r9)
            r9 = r15
        L_0x0037:
            int r12 = r12 >>> 20
            int r12 = r7 << r12
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            r11 = r11 & r6
            long r6 = (long) r11
            switch(r14) {
                case 0: goto L_0x0457;
                case 1: goto L_0x044a;
                case 2: goto L_0x043b;
                case 3: goto L_0x042c;
                case 4: goto L_0x041d;
                case 5: goto L_0x040e;
                case 6: goto L_0x03ff;
                case 7: goto L_0x03f0;
                case 8: goto L_0x03e2;
                case 9: goto L_0x03d0;
                case 10: goto L_0x03be;
                case 11: goto L_0x03ae;
                case 12: goto L_0x039e;
                case 13: goto L_0x038e;
                case 14: goto L_0x037e;
                case 15: goto L_0x0370;
                case 16: goto L_0x0362;
                case 17: goto L_0x0350;
                case 18: goto L_0x0340;
                case 19: goto L_0x0330;
                case 20: goto L_0x0320;
                case 21: goto L_0x0310;
                case 22: goto L_0x0300;
                case 23: goto L_0x02f0;
                case 24: goto L_0x02e0;
                case 25: goto L_0x02d0;
                case 26: goto L_0x02c2;
                case 27: goto L_0x02b0;
                case 28: goto L_0x02a2;
                case 29: goto L_0x0298;
                case 30: goto L_0x0291;
                case 31: goto L_0x028a;
                case 32: goto L_0x0283;
                case 33: goto L_0x027c;
                case 34: goto L_0x026f;
                case 35: goto L_0x0260;
                case 36: goto L_0x0251;
                case 37: goto L_0x0242;
                case 38: goto L_0x0233;
                case 39: goto L_0x0224;
                case 40: goto L_0x0214;
                case 41: goto L_0x0204;
                case 42: goto L_0x01f4;
                case 43: goto L_0x01e4;
                case 44: goto L_0x01d4;
                case 45: goto L_0x01c4;
                case 46: goto L_0x01b4;
                case 47: goto L_0x01a4;
                case 48: goto L_0x0194;
                case 49: goto L_0x0181;
                case 50: goto L_0x0172;
                case 51: goto L_0x0163;
                case 52: goto L_0x0154;
                case 53: goto L_0x0143;
                case 54: goto L_0x0132;
                case 55: goto L_0x0121;
                case 56: goto L_0x0110;
                case 57: goto L_0x00ff;
                case 58: goto L_0x00ee;
                case 59: goto L_0x00df;
                case 60: goto L_0x00cc;
                case 61: goto L_0x00b9;
                case 62: goto L_0x00a8;
                case 63: goto L_0x0097;
                case 64: goto L_0x0086;
                case 65: goto L_0x0075;
                case 66: goto L_0x0066;
                case 67: goto L_0x0057;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x029f
        L_0x0044:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.e.m0 r7 = r0.mo12550P(r8)
            r2.mo13043f(r13, r6, r7)
            goto L_0x029f
        L_0x0057:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = m3245r(r1, r6)
            r2.mo13041d(r13, r6)
            goto L_0x029f
        L_0x0066:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m3244q(r1, r6)
            r2.mo13040c(r13, r6)
            goto L_0x029f
        L_0x0075:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = m3245r(r1, r6)
            b.l.a.c.e.e.tm r11 = r2.f4358a
            r11.mo12938n(r13, r6)
            goto L_0x029f
        L_0x0086:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m3244q(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12936l(r13, r6)
            goto L_0x029f
        L_0x0097:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m3244q(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12934j(r13, r6)
            goto L_0x029f
        L_0x00a8:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m3244q(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12935k(r13, r6)
            goto L_0x029f
        L_0x00b9:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.e.lm r6 = (p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) r6
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12941q(r13, r6)
            goto L_0x029f
        L_0x00cc:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.e.m0 r7 = r0.mo12550P(r8)
            r2.mo13042e(r13, r6, r7)
            goto L_0x029f
        L_0x00df:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            m3237C(r13, r6, r2)
            goto L_0x029f
        L_0x00ee:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            boolean r6 = m3246s(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12939o(r13, r6)
            goto L_0x029f
        L_0x00ff:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m3244q(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12936l(r13, r6)
            goto L_0x029f
        L_0x0110:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = m3245r(r1, r6)
            b.l.a.c.e.e.tm r11 = r2.f4358a
            r11.mo12938n(r13, r6)
            goto L_0x029f
        L_0x0121:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m3244q(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12934j(r13, r6)
            goto L_0x029f
        L_0x0132:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = m3245r(r1, r6)
            b.l.a.c.e.e.tm r11 = r2.f4358a
            r11.mo12937m(r13, r6)
            goto L_0x029f
        L_0x0143:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = m3245r(r1, r6)
            b.l.a.c.e.e.tm r11 = r2.f4358a
            r11.mo12937m(r13, r6)
            goto L_0x029f
        L_0x0154:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            float r6 = m3243p(r1, r6)
            r2.mo13038a(r13, r6)
            goto L_0x029f
        L_0x0163:
            boolean r11 = r0.mo12572x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            double r6 = m3242o(r1, r6)
            r2.mo13039b(r13, r6)
            goto L_0x029f
        L_0x0172:
            java.lang.Object r6 = r5.getObject(r1, r6)
            if (r6 != 0) goto L_0x017a
            goto L_0x029f
        L_0x017a:
            java.lang.Object r1 = r0.mo12551Q(r8)
            b.l.a.c.e.e.v r1 = (p005b.p096l.p097a.p113c.p131e.p136e.C2534v) r1
            throw r4
        L_0x0181:
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.e.e.m0 r7 = r0.mo12550P(r8)
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3899u(r11, r6, r2, r7)
            goto L_0x029f
        L_0x0194:
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 1
        L_0x019f:
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3886h(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01a4:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
        L_0x01a9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3891m(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01b4:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
        L_0x01b9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3888j(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01c4:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
        L_0x01c9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3893o(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01d4:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
        L_0x01d9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3894p(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01e4:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
        L_0x01e9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3890l(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01f4:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3895q(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0204:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3892n(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0214:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3887i(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0224:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3889k(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0233:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3885g(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0242:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3884f(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0251:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3883e(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0260:
            r12 = 1
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3882d(r11, r6, r2, r12)
            goto L_0x029f
        L_0x026f:
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 0
            goto L_0x019f
        L_0x027c:
            r12 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            goto L_0x01a9
        L_0x0283:
            r12 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            goto L_0x01b9
        L_0x028a:
            r12 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            goto L_0x01c9
        L_0x0291:
            r12 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            goto L_0x01d9
        L_0x0298:
            r12 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            goto L_0x01e9
        L_0x029f:
            r14 = 0
            goto L_0x0463
        L_0x02a2:
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3897s(r11, r6, r2)
            goto L_0x029f
        L_0x02b0:
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.e.e.m0 r7 = r0.mo12550P(r8)
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3898t(r11, r6, r2, r7)
            goto L_0x029f
        L_0x02c2:
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3896r(r11, r6, r2)
            goto L_0x029f
        L_0x02d0:
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3895q(r11, r6, r2, r14)
            goto L_0x0463
        L_0x02e0:
            r14 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3892n(r11, r6, r2, r14)
            goto L_0x0463
        L_0x02f0:
            r14 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3887i(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0300:
            r14 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3889k(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0310:
            r14 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3885g(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0320:
            r14 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3884f(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0330:
            r14 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3883e(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0340:
            r14 = 0
            int[] r11 = r0.f3799a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3882d(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0350:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.e.m0 r7 = r0.mo12550P(r8)
            r2.mo13043f(r13, r6, r7)
            goto L_0x0463
        L_0x0362:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            r2.mo13041d(r13, r6)
            goto L_0x0463
        L_0x0370:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            r2.mo13040c(r13, r6)
            goto L_0x0463
        L_0x037e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.e.e.tm r11 = r2.f4358a
            r11.mo12938n(r13, r6)
            goto L_0x0463
        L_0x038e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12936l(r13, r6)
            goto L_0x0463
        L_0x039e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12934j(r13, r6)
            goto L_0x0463
        L_0x03ae:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12935k(r13, r6)
            goto L_0x0463
        L_0x03be:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.e.lm r6 = (p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) r6
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12941q(r13, r6)
            goto L_0x0463
        L_0x03d0:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.e.m0 r7 = r0.mo12550P(r8)
            r2.mo13042e(r13, r6, r7)
            goto L_0x0463
        L_0x03e2:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            m3237C(r13, r6, r2)
            goto L_0x0463
        L_0x03f0:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            boolean r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3627i(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12939o(r13, r6)
            goto L_0x0463
        L_0x03ff:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12936l(r13, r6)
            goto L_0x0463
        L_0x040e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.e.e.tm r11 = r2.f4358a
            r11.mo12938n(r13, r6)
            goto L_0x0463
        L_0x041d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.e.e.tm r7 = r2.f4358a
            r7.mo12934j(r13, r6)
            goto L_0x0463
        L_0x042c:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.e.e.tm r11 = r2.f4358a
            r11.mo12937m(r13, r6)
            goto L_0x0463
        L_0x043b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.e.e.tm r11 = r2.f4358a
            r11.mo12937m(r13, r6)
            goto L_0x0463
        L_0x044a:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            float r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3628j(r1, r6)
            r2.mo13038a(r13, r6)
            goto L_0x0463
        L_0x0457:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            double r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3629k(r1, r6)
            r2.mo13039b(r13, r6)
        L_0x0463:
            int r8 = r8 + 3
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0016
        L_0x046a:
            b.l.a.c.e.e.a1<?, ?> r3 = r0.f3811m
            java.lang.Object r1 = r3.mo12354j(r1)
            r3.mo12362r(r1, r2)
            return
        L_0x0474:
            b.l.a.c.e.e.ym<?> r2 = r0.f3812n
            r2.mo13122b(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12541B(java.lang.Object, b.l.a.c.e.e.um):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0294, code lost:
        r7 = r7 | r8;
        r0 = r4;
        r23 = r6;
        r12 = r10;
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x029f, code lost:
        r23 = r6;
        r27 = r9;
        r8 = r5;
        r17 = r18;
        r2 = r13;
        r14 = null;
        r6 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0122, code lost:
        r9.putInt(r14, r25, r3);
        r5 = r0;
        r19 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012f, code lost:
        r10 = r0;
        r13 = r4;
        r19 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0133, code lost:
        r18 = 65535;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0191, code lost:
        r4 = r11.f3839c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0193, code lost:
        r9.putObject(r14, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ce, code lost:
        r7 = r7 | r8;
        r1 = r34;
        r4 = r0;
        r0 = r3;
        r3 = r5;
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fc, code lost:
        r10 = r0;
        r13 = r4;
        r19 = r6;
        r18 = 65535;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0203, code lost:
        r5 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0236, code lost:
        r9.putLong(r30, r2, r21);
        r7 = r7 | r8;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0244, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0264, code lost:
        r7 = r7 | r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0265, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0266, code lost:
        r12 = r5;
        r23 = r6;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v5, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0413  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12542E(T r30, byte[] r31, int r32, int r33, int r34, p005b.p096l.p097a.p113c.p131e.p136e.C2144em r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r35
            sun.misc.Unsafe r9 = f3798q
            r16 = 0
            r0 = r32
            r1 = r34
            r3 = r16
            r4 = r3
            r7 = r4
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x043a
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2871y1(r0, r12, r4, r11)
            int r4 = r11.f3837a
            r28 = r4
            r4 = r0
            r0 = r28
        L_0x002d:
            int r8 = r0 >>> 3
            r10 = r0 & 7
            r5 = 3
            if (r8 <= r2) goto L_0x0044
            int r3 = r3 / r5
            int r2 = r15.f3801c
            if (r8 < r2) goto L_0x0042
            int r2 = r15.f3802d
            if (r8 > r2) goto L_0x0042
            int r2 = r15.mo12540A(r8, r3)
            goto L_0x0048
        L_0x0042:
            r2 = -1
            goto L_0x0048
        L_0x0044:
            int r2 = r15.mo12574z(r8)
        L_0x0048:
            r3 = -1
            if (r2 != r3) goto L_0x005b
            r32 = r0
            r17 = r3
            r19 = r6
            r26 = r7
            r20 = r8
            r27 = r9
            r2 = r16
            goto L_0x036b
        L_0x005b:
            int[] r1 = r15.f3799a
            int r18 = r2 + 1
            r5 = r1[r18]
            int r3 = r5 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r20 = r8
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r5 & r17
            r21 = r4
            r22 = r5
            long r4 = (long) r8
            r8 = 17
            if (r3 > r8) goto L_0x02b0
            int r8 = r2 + 2
            r1 = r1[r8]
            int r8 = r1 >>> 20
            r13 = 1
            int r8 = r13 << r8
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r13
            r25 = r4
            if (r1 == r6) goto L_0x0092
            if (r6 == r13) goto L_0x008c
            long r4 = (long) r6
            r9.putInt(r14, r4, r7)
        L_0x008c:
            long r4 = (long) r1
            int r7 = r9.getInt(r14, r4)
            r6 = r1
        L_0x0092:
            r1 = 5
            switch(r3) {
                case 0: goto L_0x026b;
                case 1: goto L_0x0247;
                case 2: goto L_0x021e;
                case 3: goto L_0x021e;
                case 4: goto L_0x0206;
                case 5: goto L_0x01d8;
                case 6: goto L_0x01ba;
                case 7: goto L_0x0197;
                case 8: goto L_0x0178;
                case 9: goto L_0x0152;
                case 10: goto L_0x0138;
                case 11: goto L_0x0206;
                case 12: goto L_0x00f3;
                case 13: goto L_0x01ba;
                case 14: goto L_0x01d8;
                case 15: goto L_0x00e4;
                case 16: goto L_0x00c3;
                default: goto L_0x0096;
            }
        L_0x0096:
            r5 = r0
            r19 = r6
            r13 = r21
            r0 = 3
            r18 = -1
            r6 = r2
            r1 = r25
            if (r10 != r0) goto L_0x029f
            b.l.a.c.e.e.m0 r0 = r15.mo12550P(r6)
            int r3 = r20 << 3
            r4 = r3 | 4
            r21 = r1
            r1 = r31
            r2 = r13
            r3 = r33
            r12 = r21
            r10 = r5
            r5 = r35
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2856u2(r0, r1, r2, r3, r4, r5)
            r0 = r7 & r8
            if (r0 != 0) goto L_0x0287
            java.lang.Object r0 = r11.f3839c
            goto L_0x0291
        L_0x00c3:
            if (r10 != 0) goto L_0x00de
            r4 = r21
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r12, r4, r11)
            long r3 = r11.f3838b
            long r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3840o(r3)
            r10 = r1
            r21 = r3
            r19 = r6
            r18 = -1
            r4 = r0
            r6 = r2
            r2 = r25
            goto L_0x0236
        L_0x00de:
            r10 = r0
            r19 = r6
            r13 = r21
            goto L_0x0133
        L_0x00e4:
            r4 = r21
            if (r10 != 0) goto L_0x012f
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r12, r4, r11)
            int r3 = r11.f3837a
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3839n(r3)
            goto L_0x0122
        L_0x00f3:
            r4 = r21
            if (r10 != 0) goto L_0x012f
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r12, r4, r11)
            int r3 = r11.f3837a
            b.l.a.c.e.e.f r4 = r15.mo12552R(r2)
            if (r4 == 0) goto L_0x0120
            boolean r4 = r4.mo12624a()
            if (r4 == 0) goto L_0x010a
            goto L_0x0120
        L_0x010a:
            b.l.a.c.e.e.b1 r4 = m3238D(r30)
            long r13 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r4.mo12418c(r0, r3)
            r14 = r30
            r5 = r0
            r19 = r6
            r18 = -1
            r6 = r2
            goto L_0x0265
        L_0x0120:
            r14 = r30
        L_0x0122:
            r4 = r25
            r9.putInt(r14, r4, r3)
            r5 = r0
            r19 = r6
            r18 = -1
            r6 = r2
            goto L_0x0264
        L_0x012f:
            r10 = r0
            r13 = r4
            r19 = r6
        L_0x0133:
            r18 = -1
            r6 = r2
            goto L_0x0203
        L_0x0138:
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 2
            if (r10 != r3) goto L_0x01fc
            int r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2840q2(r12, r4, r11)
            java.lang.Object r4 = r11.f3839c
            r9.putObject(r14, r1, r4)
            r1 = r3
            r19 = r6
            r18 = -1
            r6 = r5
            r5 = r0
            goto L_0x0264
        L_0x0152:
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 2
            if (r10 != r3) goto L_0x0174
            b.l.a.c.e.e.m0 r3 = r15.mo12550P(r5)
            r13 = r33
            int r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2848s2(r3, r12, r4, r13, r11)
            r4 = r7 & r8
            if (r4 != 0) goto L_0x0169
            goto L_0x0191
        L_0x0169:
            java.lang.Object r4 = r9.getObject(r14, r1)
            java.lang.Object r10 = r11.f3839c
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3461c(r4, r10)
            goto L_0x0193
        L_0x0174:
            r13 = r33
            goto L_0x01fc
        L_0x0178:
            r13 = r33
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 2
            if (r10 != r3) goto L_0x01fc
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r22 & r3
            if (r3 != 0) goto L_0x018d
            int r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2820l2(r12, r4, r11)
            goto L_0x0191
        L_0x018d:
            int r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2828n2(r12, r4, r11)
        L_0x0191:
            java.lang.Object r4 = r11.f3839c
        L_0x0193:
            r9.putObject(r14, r1, r4)
            goto L_0x01ce
        L_0x0197:
            r13 = r33
            r5 = r2
            r4 = r21
            r1 = r25
            if (r10 != 0) goto L_0x01fc
            int r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r12, r4, r11)
            r32 = r3
            long r3 = r11.f3838b
            r21 = 0
            int r3 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r3 == 0) goto L_0x01b0
            r3 = 1
            goto L_0x01b2
        L_0x01b0:
            r3 = r16
        L_0x01b2:
            b.l.a.c.e.e.j1 r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r4.mo12696c(r14, r1, r3)
            r3 = r32
            goto L_0x01ce
        L_0x01ba:
            r13 = r33
            r3 = r1
            r5 = r2
            r4 = r21
            r1 = r25
            if (r10 != r3) goto L_0x01fc
            int r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r12, r4)
            r9.putInt(r14, r1, r3)
            int r4 = r4 + 4
            r3 = r4
        L_0x01ce:
            r7 = r7 | r8
            r1 = r34
            r4 = r0
            r0 = r3
            r3 = r5
            r2 = r20
            goto L_0x001a
        L_0x01d8:
            r13 = r33
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 1
            if (r10 != r3) goto L_0x01fc
            long r21 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r12, r4)
            r10 = r0
            r0 = r9
            r2 = r1
            r1 = r30
            r18 = -1
            r13 = r4
            r19 = r6
            r6 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r4 = r13 + 8
            r1 = r4
            r5 = r10
            goto L_0x0264
        L_0x01fc:
            r10 = r0
            r13 = r4
            r19 = r6
            r18 = -1
            r6 = r5
        L_0x0203:
            r5 = r10
            goto L_0x029f
        L_0x0206:
            r4 = r0
            r19 = r6
            r13 = r21
            r18 = -1
            r6 = r2
            r2 = r25
            if (r10 != 0) goto L_0x0244
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r12, r13, r11)
            int r1 = r11.f3837a
            r9.putInt(r14, r2, r1)
            r1 = r0
            r5 = r4
            goto L_0x0264
        L_0x021e:
            r4 = r0
            r19 = r6
            r13 = r21
            r18 = -1
            r6 = r2
            r2 = r25
            if (r10 != 0) goto L_0x0244
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r12, r13, r11)
            r32 = r1
            long r0 = r11.f3838b
            r10 = r32
            r21 = r0
        L_0x0236:
            r0 = r9
            r1 = r30
            r13 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            r0 = r7 | r8
            r7 = r0
            r5 = r13
            goto L_0x0266
        L_0x0244:
            r5 = r4
            goto L_0x029f
        L_0x0247:
            r5 = r0
            r3 = r1
            r19 = r6
            r13 = r21
            r18 = -1
            r6 = r2
            r1 = r25
            if (r10 != r3) goto L_0x029f
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            b.l.a.c.e.e.j1 r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r3.mo12698e(r14, r1, r0)
            int r4 = r13 + 4
            r1 = r4
        L_0x0264:
            r7 = r7 | r8
        L_0x0265:
            r10 = r1
        L_0x0266:
            r12 = r5
            r23 = r6
            goto L_0x02f2
        L_0x026b:
            r5 = r0
            r19 = r6
            r13 = r21
            r0 = 1
            r18 = -1
            r6 = r2
            r1 = r25
            if (r10 != r0) goto L_0x029f
            long r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r12, r13)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3630l(r14, r1, r3)
            int r4 = r13 + 8
            r10 = r5
            goto L_0x0294
        L_0x0287:
            java.lang.Object r0 = r9.getObject(r14, r12)
            java.lang.Object r1 = r11.f3839c
            java.lang.Object r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3461c(r0, r1)
        L_0x0291:
            r9.putObject(r14, r12, r0)
        L_0x0294:
            r0 = r7 | r8
            r7 = r0
            r0 = r4
            r23 = r6
            r12 = r10
            r6 = r19
            goto L_0x02f5
        L_0x029f:
            r10 = r5
            r21 = r13
            r23 = r6
            r27 = r9
            r8 = r10
            r17 = r18
            r2 = r21
            r14 = 0
            r6 = r34
            goto L_0x03c2
        L_0x02b0:
            r12 = r4
            r8 = r6
            r18 = -1
            r5 = r0
            r6 = r2
            r0 = 2
            r1 = 27
            if (r3 != r1) goto L_0x0312
            if (r10 != r0) goto L_0x0302
            java.lang.Object r0 = r9.getObject(r14, r12)
            b.l.a.c.e.e.g r0 = (p005b.p096l.p097a.p113c.p131e.p136e.C2171g) r0
            boolean r1 = r0.mo12473a()
            if (r1 != 0) goto L_0x02da
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02d2
            r1 = 10
            goto L_0x02d3
        L_0x02d2:
            int r1 = r1 + r1
        L_0x02d3:
            b.l.a.c.e.e.g r0 = r0.mo12494h(r1)
            r9.putObject(r14, r12, r0)
        L_0x02da:
            r10 = r0
            b.l.a.c.e.e.m0 r0 = r15.mo12550P(r6)
            r1 = r5
            r2 = r31
            r3 = r21
            r4 = r33
            r12 = r5
            r5 = r10
            r23 = r6
            r19 = r8
            r6 = r35
            int r10 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2694A2(r0, r1, r2, r3, r4, r5, r6)
        L_0x02f2:
            r6 = r19
            r0 = r10
        L_0x02f5:
            r13 = r33
            r1 = r34
            r4 = r12
            r2 = r20
            r3 = r23
            r12 = r31
            goto L_0x001a
        L_0x0302:
            r23 = r6
            r19 = r8
            r32 = r5
            r26 = r7
            r27 = r9
            r17 = r18
            r15 = r21
            goto L_0x0366
        L_0x0312:
            r23 = r6
            r19 = r8
            r8 = r5
            r1 = 49
            if (r3 > r1) goto L_0x0350
            r5 = r22
            long r5 = (long) r5
            r0 = r29
            r1 = r30
            r2 = r31
            r4 = r3
            r3 = r21
            r22 = r4
            r4 = r33
            r24 = r5
            r6 = 0
            r5 = r8
            r15 = r6
            r6 = r20
            r26 = r7
            r7 = r10
            r32 = r8
            r10 = r20
            r8 = r23
            r27 = r9
            r17 = r18
            r9 = r24
            r11 = r22
            r15 = r21
            r14 = r35
            int r4 = r0.mo12547M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r4 == r15) goto L_0x0367
            r0 = r4
            goto L_0x03a1
        L_0x0350:
            r26 = r7
            r32 = r8
            r27 = r9
            r17 = r18
            r15 = r21
            r5 = r22
            r22 = r3
            r1 = 50
            r9 = r22
            if (r9 != r1) goto L_0x0386
            if (r10 == r0) goto L_0x0375
        L_0x0366:
            r4 = r15
        L_0x0367:
            r1 = r34
            r2 = r23
        L_0x036b:
            r8 = r32
            r6 = r1
            r23 = r2
            r2 = r4
            r7 = r26
            r14 = 0
            goto L_0x03c2
        L_0x0375:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r23
            r6 = r12
            r0.mo12548N(r1, r2, r3, r4, r5, r6)
            r14 = 0
            throw r14
        L_0x0386:
            r14 = 0
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r8 = r5
            r5 = r32
            r6 = r20
            r7 = r10
            r10 = r12
            r12 = r23
            r13 = r35
            int r0 = r0.mo12549O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03bb
        L_0x03a1:
            r15 = r29
            r14 = r30
            r12 = r31
            r4 = r32
            r13 = r33
            r1 = r34
            r11 = r35
            r6 = r19
            r2 = r20
            r3 = r23
            r7 = r26
            r9 = r27
            goto L_0x001a
        L_0x03bb:
            r8 = r32
            r6 = r34
            r2 = r0
            r7 = r26
        L_0x03c2:
            if (r8 != r6) goto L_0x03d2
            if (r6 == 0) goto L_0x03d2
            r9 = r29
            r12 = r30
            r0 = r2
            r1 = r6
            r4 = r8
            r3 = r14
            r6 = r19
            goto L_0x0443
        L_0x03d2:
            r9 = r29
            r3 = r14
            boolean r0 = r9.f3804f
            if (r0 == 0) goto L_0x0413
            r10 = r35
            b.l.a.c.e.e.xm r0 = r10.f3840d
            b.l.a.c.e.e.xm r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2605xm.m4408a()
            if (r0 == r1) goto L_0x0410
            b.l.a.c.e.e.c0 r0 = r9.f3803e
            b.l.a.c.e.e.xm r1 = r10.f3840d
            java.util.Map<b.l.a.c.e.e.wm, b.l.a.c.e.e.in<?, ?>> r1 = r1.f4471a
            b.l.a.c.e.e.wm r4 = new b.l.a.c.e.e.wm
            r11 = r20
            r4.<init>(r0, r11)
            java.lang.Object r0 = r1.get(r4)
            b.l.a.c.e.e.in r0 = (p005b.p096l.p097a.p113c.p131e.p136e.C2245in) r0
            if (r0 != 0) goto L_0x040a
            b.l.a.c.e.e.b1 r4 = m3238D(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2702C2(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L_0x0428
        L_0x040a:
            r12 = r30
            r0 = r12
            b.l.a.c.e.e.hn r0 = (p005b.p096l.p097a.p113c.p131e.p136e.C2220hn) r0
            throw r3
        L_0x0410:
            r12 = r30
            goto L_0x0417
        L_0x0413:
            r12 = r30
            r10 = r35
        L_0x0417:
            r11 = r20
            b.l.a.c.e.e.b1 r4 = m3238D(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2702C2(r0, r1, r2, r3, r4, r5)
        L_0x0428:
            r13 = r33
            r1 = r6
            r4 = r8
            r15 = r9
            r2 = r11
            r14 = r12
            r6 = r19
            r3 = r23
            r9 = r27
            r12 = r31
            r11 = r10
            goto L_0x001a
        L_0x043a:
            r19 = r6
            r26 = r7
            r27 = r9
            r12 = r14
            r9 = r15
            r3 = 0
        L_0x0443:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x044e
            long r5 = (long) r6
            r2 = r27
            r2.putInt(r12, r5, r7)
        L_0x044e:
            int r2 = r9.f3808j
        L_0x0450:
            int r5 = r9.f3809k
            if (r2 >= r5) goto L_0x045e
            int[] r5 = r9.f3807i
            r5 = r5[r2]
            r9.mo12564k(r12, r5, r3)
            int r2 = r2 + 1
            goto L_0x0450
        L_0x045e:
            r2 = r33
            if (r1 != 0) goto L_0x046a
            if (r0 != r2) goto L_0x0465
            goto L_0x046e
        L_0x0465:
            b.l.a.c.e.e.j r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3529f()
            throw r0
        L_0x046a:
            if (r0 > r2) goto L_0x046f
            if (r4 != r1) goto L_0x046f
        L_0x046e:
            return r0
        L_0x046f:
            b.l.a.c.e.e.j r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3529f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12542E(java.lang.Object, byte[], int, int, int, b.l.a.c.e.e.em):int");
    }

    /* renamed from: I */
    public final void mo12543I(T t, T t2, int i) {
        long j = (long) (this.f3799a[i + 1] & 1048575);
        if (mo12570v(t2, i)) {
            Object m = C2272k1.m3631m(t, j);
            Object m2 = C2272k1.m3631m(t2, j);
            if (m != null && m2 != null) {
                C2272k1.f3995e.mo12732p(t, j, C2196h.m3461c(m, m2));
                mo12571w(t, i);
            } else if (m2 != null) {
                C2272k1.f3995e.mo12732p(t, j, m2);
                mo12571w(t, i);
            }
        }
    }

    /* renamed from: J */
    public final void mo12544J(T t, T t2, int i) {
        int[] iArr = this.f3799a;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j = (long) (i2 & 1048575);
        if (mo12572x(t2, i3, i)) {
            Object m = mo12572x(t, i3, i) ? C2272k1.m3631m(t, j) : null;
            Object m2 = C2272k1.m3631m(t2, j);
            if (m != null && m2 != null) {
                C2272k1.f3995e.mo12732p(t, j, C2196h.m3461c(m, m2));
                mo12573y(t, i3, i);
            } else if (m2 != null) {
                C2272k1.f3995e.mo12732p(t, j, m2);
                mo12573y(t, i3, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0325, code lost:
        r1 = r1 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x035c, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0389, code lost:
        r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8 << 3);
        r1 = ((p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) r1).mo12755l();
        r4 = ((p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1) + r1) + r6) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03b6, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03c6, code lost:
        r1 = r0.getInt(r15, r12);
        r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8 << 3);
        r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4210z(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03d4, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03df, code lost:
        r6 = r0.getLong(r15, r12);
        r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8 << 3);
        r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4204c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03ed, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03f3, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03f9, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0400, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0406, code lost:
        r1 = r1 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0409, code lost:
        r3 = r3 + 3;
        r1 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e1, code lost:
        r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8 << 3);
        r1 = ((p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) r1).mo12755l();
        r7 = (p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1) + r1) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0125, code lost:
        r1 = m3244q(r15, r12);
        r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8 << 3);
        r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4210z(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0142, code lost:
        r6 = m3245r(r15, r12);
        r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8 << 3);
        r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4204c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0166, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0248, code lost:
        r7 = (p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1) + p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4209y(r8)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0252, code lost:
        r4 = r4 + r7;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12545K(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f3798q
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x000c:
            int[] r6 = r14.f3799a
            int r6 = r6.length
            if (r3 >= r6) goto L_0x0410
            int r6 = r14.mo12566m(r3)
            int[] r7 = r14.f3799a
            r8 = r7[r3]
            int r9 = r6 >>> 20
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0036
            int r10 = r3 + 2
            r7 = r7[r10]
            r10 = r7 & r1
            int r7 = r7 >>> 20
            int r7 = r11 << r7
            if (r10 == r2) goto L_0x0037
            long r12 = (long) r10
            int r2 = r0.getInt(r15, r12)
            r5 = r2
            r2 = r10
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            r1 = r1 & r6
            long r12 = (long) r1
            r1 = 63
            switch(r9) {
                case 0: goto L_0x03fc;
                case 1: goto L_0x03ef;
                case 2: goto L_0x03db;
                case 3: goto L_0x03d6;
                case 4: goto L_0x03c2;
                case 5: goto L_0x03bd;
                case 6: goto L_0x03b8;
                case 7: goto L_0x03ac;
                case 8: goto L_0x037d;
                case 9: goto L_0x036b;
                case 10: goto L_0x0362;
                case 11: goto L_0x034e;
                case 12: goto L_0x0348;
                case 13: goto L_0x0342;
                case 14: goto L_0x033c;
                case 15: goto L_0x0328;
                case 16: goto L_0x030f;
                case 17: goto L_0x02fb;
                case 18: goto L_0x02ef;
                case 19: goto L_0x02e3;
                case 20: goto L_0x02d7;
                case 21: goto L_0x02ca;
                case 22: goto L_0x02bd;
                case 23: goto L_0x02ef;
                case 24: goto L_0x02e3;
                case 25: goto L_0x02b1;
                case 26: goto L_0x02a5;
                case 27: goto L_0x0295;
                case 28: goto L_0x0289;
                case 29: goto L_0x027c;
                case 30: goto L_0x026f;
                case 31: goto L_0x02e3;
                case 32: goto L_0x02ef;
                case 33: goto L_0x0262;
                case 34: goto L_0x0255;
                case 35: goto L_0x023c;
                case 36: goto L_0x022f;
                case 37: goto L_0x0222;
                case 38: goto L_0x0215;
                case 39: goto L_0x0208;
                case 40: goto L_0x01fb;
                case 41: goto L_0x01ee;
                case 42: goto L_0x01df;
                case 43: goto L_0x01d1;
                case 44: goto L_0x01c3;
                case 45: goto L_0x01b5;
                case 46: goto L_0x01a7;
                case 47: goto L_0x0199;
                case 48: goto L_0x018b;
                case 49: goto L_0x017b;
                case 50: goto L_0x016e;
                case 51: goto L_0x0160;
                case 52: goto L_0x0152;
                case 53: goto L_0x013c;
                case 54: goto L_0x0135;
                case 55: goto L_0x011f;
                case 56: goto L_0x0118;
                case 57: goto L_0x0111;
                case 58: goto L_0x0103;
                case 59: goto L_0x00d3;
                case 60: goto L_0x00bf;
                case 61: goto L_0x00b4;
                case 62: goto L_0x009e;
                case 63: goto L_0x0096;
                case 64: goto L_0x008e;
                case 65: goto L_0x0086;
                case 66: goto L_0x0070;
                case 67: goto L_0x0056;
                case 68: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0409
        L_0x0040:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.e.e.c0 r1 = (p005b.p096l.p097a.p113c.p131e.p136e.C2072c0) r1
            b.l.a.c.e.e.m0 r6 = r14.mo12550P(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4208h(r8, r1, r6)
            goto L_0x0408
        L_0x0056:
            boolean r6 = r14.mo12572x(r15, r8, r3)
            if (r6 == 0) goto L_0x0409
            long r6 = m3245r(r15, r12)
            int r8 = r8 << 3
            int r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4204c(r6)
            goto L_0x0325
        L_0x0070:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            int r1 = m3244q(r15, r12)
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            goto L_0x00ae
        L_0x0086:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0166
        L_0x008e:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0158
        L_0x0096:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0125
        L_0x009e:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            int r1 = m3244q(r15, r12)
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r6)
        L_0x00ae:
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
            goto L_0x03d4
        L_0x00b4:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto L_0x00e1
        L_0x00bf:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.e.e.m0 r6 = r14.mo12550P(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3875Q(r8, r1, r6)
            goto L_0x0408
        L_0x00d3:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2317lm
            if (r6 == 0) goto L_0x00f5
        L_0x00e1:
            b.l.a.c.e.e.lm r1 = (p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) r1
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r6)
            int r1 = r1.mo12755l()
            int r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x0252
        L_0x00f5:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r6)
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4205d(r1)
            goto L_0x03d4
        L_0x0103:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
            goto L_0x03b6
        L_0x0111:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0158
        L_0x0118:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0166
        L_0x011f:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0125:
            int r1 = m3244q(r15, r12)
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r6)
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4210z(r1)
            goto L_0x03d4
        L_0x0135:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0142
        L_0x013c:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0142:
            long r6 = m3245r(r15, r12)
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4204c(r6)
            goto L_0x03ed
        L_0x0152:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0158:
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
            goto L_0x03f9
        L_0x0160:
            boolean r1 = r14.mo12572x(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0166:
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
            goto L_0x0406
        L_0x016e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.mo12551Q(r3)
            p005b.p096l.p097a.p113c.p131e.p136e.C2582x.m4363a(r8, r1, r6)
            goto L_0x0409
        L_0x017b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            b.l.a.c.e.e.m0 r6 = r14.mo12550P(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3878T(r8, r1, r6)
            goto L_0x0408
        L_0x018b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3859A(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0199:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3867I(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01a7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3871M(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01b5:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3869K(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01c3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3861C(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01d1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3865G(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01df:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            java.lang.Class<?> r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.f4133a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01ee:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3869K(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01fb:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3871M(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0208:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3863E(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0215:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3903y(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0222:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3901w(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x022f:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3869K(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x023c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3871M(r1)
            if (r1 <= 0) goto L_0x0409
        L_0x0248:
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4209y(r8)
            int r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
            int r7 = r7 + r6
            int r7 = r7 + r1
        L_0x0252:
            int r4 = r4 + r7
            goto L_0x0409
        L_0x0255:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3860B(r8, r1, r6)
            goto L_0x0408
        L_0x0262:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3868J(r8, r6, r1)
            goto L_0x0408
        L_0x026f:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3862D(r8, r6, r1)
            goto L_0x0408
        L_0x027c:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3866H(r8, r6, r1)
            goto L_0x0408
        L_0x0289:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3877S(r8, r1)
            goto L_0x0408
        L_0x0295:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            b.l.a.c.e.e.m0 r6 = r14.mo12550P(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3876R(r8, r1, r6)
            goto L_0x0408
        L_0x02a5:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3874P(r8, r1)
            goto L_0x0408
        L_0x02b1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3873O(r8, r1)
            goto L_0x0408
        L_0x02bd:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3864F(r8, r1, r6)
            goto L_0x0408
        L_0x02ca:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3904z(r8, r6, r1)
            goto L_0x0408
        L_0x02d7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3902x(r8, r1)
            goto L_0x0408
        L_0x02e3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3870L(r8, r1)
            goto L_0x0408
        L_0x02ef:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3872N(r8, r1)
            goto L_0x0408
        L_0x02fb:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.e.e.c0 r1 = (p005b.p096l.p097a.p113c.p131e.p136e.C2072c0) r1
            b.l.a.c.e.e.m0 r6 = r14.mo12550P(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4208h(r8, r1, r6)
            goto L_0x0408
        L_0x030f:
            r6 = r7 & r5
            if (r6 == 0) goto L_0x0409
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4204c(r6)
        L_0x0325:
            int r1 = r1 + r8
            goto L_0x0408
        L_0x0328:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            goto L_0x035c
        L_0x033c:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x0400
        L_0x0342:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x03f3
        L_0x0348:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x03c6
        L_0x034e:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r6)
        L_0x035c:
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
            goto L_0x03d4
        L_0x0362:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto L_0x0389
        L_0x036b:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.e.e.m0 r6 = r14.mo12550P(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3875Q(r8, r1, r6)
            goto L_0x0408
        L_0x037d:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2317lm
            if (r6 == 0) goto L_0x039f
        L_0x0389:
            b.l.a.c.e.e.lm r1 = (p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) r1
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r6)
            int r1 = r1.mo12755l()
            int r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            int r7 = r7 + r4
            r4 = r7
            goto L_0x0409
        L_0x039f:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r6)
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4205d(r1)
            goto L_0x03d4
        L_0x03ac:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
        L_0x03b6:
            int r1 = r1 + r11
            goto L_0x0408
        L_0x03b8:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x03f3
        L_0x03bd:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x0400
        L_0x03c2:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
        L_0x03c6:
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r6)
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4210z(r1)
        L_0x03d4:
            int r1 = r1 + r6
            goto L_0x0408
        L_0x03d6:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x03df
        L_0x03db:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
        L_0x03df:
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4204c(r6)
        L_0x03ed:
            int r1 = r1 + r6
            goto L_0x0408
        L_0x03ef:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
        L_0x03f3:
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
        L_0x03f9:
            int r1 = r1 + 4
            goto L_0x0408
        L_0x03fc:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
        L_0x0400:
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r1)
        L_0x0406:
            int r1 = r1 + 8
        L_0x0408:
            int r4 = r4 + r1
        L_0x0409:
            int r3 = r3 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x0410:
            b.l.a.c.e.e.a1<?, ?> r0 = r14.f3811m
            java.lang.Object r1 = r0.mo12354j(r15)
            int r0 = r0.mo12361q(r1)
            int r0 = r0 + r4
            boolean r1 = r14.f3804f
            if (r1 != 0) goto L_0x0420
            return r0
        L_0x0420:
            b.l.a.c.e.e.ym<?> r0 = r14.f3812n
            r0.mo13122b(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12545K(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0282, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4204c((r5 >> 63) ^ (r5 + r5)) + p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x029e, code lost:
        r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r7 << 3);
        r4 = (r4 >> 31) ^ (r4 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02cc, code lost:
        r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02d2, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02de, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e9, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3875Q(r7, p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8), mo12550P(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0303, code lost:
        if ((r4 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) != false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0305, code lost:
        r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r7 << 3);
        r4 = ((p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) r4).mo12755l();
        r6 = (p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r4) + r4) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0317, code lost:
        r3 = r3 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x031a, code lost:
        r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r7 << 3);
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4205d((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x032d, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r7 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034a, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x034e, code lost:
        r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r7 << 3);
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4210z(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0358, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0367, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x036b, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4204c(r4) + p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x037d, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r7 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x038c, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r7 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0394, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0395, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        if ((r4 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) != false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b3, code lost:
        r4 = m3244q(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        r4 = m3245r(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r6 = (p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r4) + p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4209y(r7)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0268, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4208h(r7, (p005b.p096l.p097a.p113c.p131e.p136e.C2072c0) p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8), mo12550P(r2));
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12546L(T r11) {
        /*
            r10 = this;
            sun.misc.Unsafe r0 = f3798q
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r10.f3799a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0399
            int r4 = r10.mo12566m(r2)
            int r5 = r4 >>> 20
            r5 = r5 & 255(0xff, float:3.57E-43)
            int[] r6 = r10.f3799a
            r7 = r6[r2]
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r8
            long r8 = (long) r4
            b.l.a.c.e.e.dn r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2120dn.DOUBLE_LIST_PACKED
            int r4 = r4.f3796g
            if (r5 < r4) goto L_0x002b
            b.l.a.c.e.e.dn r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2120dn.SINT64_LIST_PACKED
            int r4 = r4.f3796g
            if (r5 > r4) goto L_0x002b
            int r4 = r2 + 2
            r4 = r6[r4]
        L_0x002b:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0386;
                case 1: goto L_0x0377;
                case 2: goto L_0x0361;
                case 3: goto L_0x035a;
                case 4: goto L_0x0344;
                case 5: goto L_0x033d;
                case 6: goto L_0x0336;
                case 7: goto L_0x0327;
                case 8: goto L_0x02f7;
                case 9: goto L_0x02e3;
                case 10: goto L_0x02d8;
                case 11: goto L_0x02c2;
                case 12: goto L_0x02ba;
                case 13: goto L_0x02b2;
                case 14: goto L_0x02aa;
                case 15: goto L_0x0294;
                case 16: goto L_0x0278;
                case 17: goto L_0x0262;
                case 18: goto L_0x0256;
                case 19: goto L_0x024a;
                case 20: goto L_0x023e;
                case 21: goto L_0x0232;
                case 22: goto L_0x0226;
                case 23: goto L_0x0256;
                case 24: goto L_0x024a;
                case 25: goto L_0x021a;
                case 26: goto L_0x020e;
                case 27: goto L_0x01fe;
                case 28: goto L_0x01f2;
                case 29: goto L_0x01e6;
                case 30: goto L_0x01da;
                case 31: goto L_0x024a;
                case 32: goto L_0x0256;
                case 33: goto L_0x01ce;
                case 34: goto L_0x01c2;
                case 35: goto L_0x01aa;
                case 36: goto L_0x019d;
                case 37: goto L_0x0190;
                case 38: goto L_0x0183;
                case 39: goto L_0x0176;
                case 40: goto L_0x0169;
                case 41: goto L_0x015c;
                case 42: goto L_0x014d;
                case 43: goto L_0x013f;
                case 44: goto L_0x0131;
                case 45: goto L_0x0123;
                case 46: goto L_0x0115;
                case 47: goto L_0x0107;
                case 48: goto L_0x00f9;
                case 49: goto L_0x00e9;
                case 50: goto L_0x00dc;
                case 51: goto L_0x00d4;
                case 52: goto L_0x00cc;
                case 53: goto L_0x00c0;
                case 54: goto L_0x00b9;
                case 55: goto L_0x00ad;
                case 56: goto L_0x00a5;
                case 57: goto L_0x009d;
                case 58: goto L_0x0095;
                case 59: goto L_0x0085;
                case 60: goto L_0x007d;
                case 61: goto L_0x0075;
                case 62: goto L_0x0069;
                case 63: goto L_0x0062;
                case 64: goto L_0x005a;
                case 65: goto L_0x0052;
                case 66: goto L_0x0046;
                case 67: goto L_0x003a;
                case 68: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0395
        L_0x0032:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x0268
        L_0x003a:
            boolean r5 = r10.mo12572x(r11, r7, r2)
            if (r5 == 0) goto L_0x0395
            long r5 = m3245r(r11, r8)
            goto L_0x0282
        L_0x0046:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = m3244q(r11, r8)
            goto L_0x029e
        L_0x0052:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x005a:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x0062:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x00b3
        L_0x0069:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = m3244q(r11, r8)
            goto L_0x02cc
        L_0x0075:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x02de
        L_0x007d:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x02e9
        L_0x0085:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            boolean r5 = r4 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2317lm
            if (r5 == 0) goto L_0x031a
            goto L_0x0305
        L_0x0095:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x032d
        L_0x009d:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x00a5:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x00ad:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
        L_0x00b3:
            int r4 = m3244q(r11, r8)
            goto L_0x034e
        L_0x00b9:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x00c6
        L_0x00c0:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
        L_0x00c6:
            long r4 = m3245r(r11, r8)
            goto L_0x036b
        L_0x00cc:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x00d4:
            boolean r4 = r10.mo12572x(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x00dc:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.lang.Object r5 = r10.mo12551Q(r2)
            p005b.p096l.p097a.p113c.p131e.p136e.C2582x.m4363a(r7, r4, r5)
            goto L_0x0395
        L_0x00e9:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.e.e.m0 r5 = r10.mo12550P(r2)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3878T(r7, r4, r5)
            goto L_0x0394
        L_0x00f9:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3859A(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0107:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3867I(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0115:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3871M(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0123:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3869K(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0131:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3861C(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x013f:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3865G(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x014d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<?> r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.f4133a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x015c:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3869K(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0169:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3871M(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0176:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3863E(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0183:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3903y(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0190:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3901w(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x019d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3869K(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x01aa:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3871M(r4)
            if (r4 <= 0) goto L_0x0395
        L_0x01b6:
            int r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4209y(r7)
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r4)
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x0317
        L_0x01c2:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3860B(r7, r4, r1)
            goto L_0x0394
        L_0x01ce:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3868J(r7, r4, r1)
            goto L_0x0394
        L_0x01da:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3862D(r7, r4, r1)
            goto L_0x0394
        L_0x01e6:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3866H(r7, r4, r1)
            goto L_0x0394
        L_0x01f2:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3877S(r7, r4)
            goto L_0x0394
        L_0x01fe:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.e.e.m0 r5 = r10.mo12550P(r2)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3876R(r7, r4, r5)
            goto L_0x0394
        L_0x020e:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3874P(r7, r4)
            goto L_0x0394
        L_0x021a:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3873O(r7, r4)
            goto L_0x0394
        L_0x0226:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3864F(r7, r4, r1)
            goto L_0x0394
        L_0x0232:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3904z(r7, r4, r1)
            goto L_0x0394
        L_0x023e:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3902x(r7, r4)
            goto L_0x0394
        L_0x024a:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3870L(r7, r4)
            goto L_0x0394
        L_0x0256:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3872N(r7, r4)
            goto L_0x0394
        L_0x0262:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x0268:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            b.l.a.c.e.e.c0 r4 = (p005b.p096l.p097a.p113c.p131e.p136e.C2072c0) r4
            b.l.a.c.e.e.m0 r5 = r10.mo12550P(r2)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4208h(r7, r4, r5)
            goto L_0x0394
        L_0x0278:
            boolean r5 = r10.mo12570v(r11, r2)
            if (r5 == 0) goto L_0x0395
            long r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r11, r8)
        L_0x0282:
            int r7 = r7 << 3
            int r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r7)
            long r8 = r5 + r5
            long r4 = r5 >> r4
            long r4 = r4 ^ r8
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4204c(r4)
            int r4 = r4 + r7
            goto L_0x0394
        L_0x0294:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r11, r8)
        L_0x029e:
            int r5 = r7 << 3
            int r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L_0x02d2
        L_0x02aa:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x02b2:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x02ba:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x034a
        L_0x02c2:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r11, r8)
        L_0x02cc:
            int r5 = r7 << 3
            int r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r5)
        L_0x02d2:
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r4)
            goto L_0x0358
        L_0x02d8:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x02de:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            goto L_0x0305
        L_0x02e3:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x02e9:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            b.l.a.c.e.e.m0 r5 = r10.mo12550P(r2)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3875Q(r7, r4, r5)
            goto L_0x0394
        L_0x02f7:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r8)
            boolean r5 = r4 instanceof p005b.p096l.p097a.p113c.p131e.p136e.C2317lm
            if (r5 == 0) goto L_0x031a
        L_0x0305:
            b.l.a.c.e.e.lm r4 = (p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) r4
            int r5 = r7 << 3
            int r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r5)
            int r4 = r4.mo12755l()
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r4)
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x0317:
            int r3 = r3 + r6
            goto L_0x0395
        L_0x031a:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r7 << 3
            int r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4205d(r4)
            goto L_0x0358
        L_0x0327:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x032d:
            int r4 = r7 << 3
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r4)
            int r4 = r4 + 1
            goto L_0x0394
        L_0x0336:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x033d:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x0344:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x034a:
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r11, r8)
        L_0x034e:
            int r5 = r7 << 3
            int r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4210z(r4)
        L_0x0358:
            int r4 = r4 + r5
            goto L_0x0394
        L_0x035a:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x0367
        L_0x0361:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x0367:
            long r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r11, r8)
        L_0x036b:
            int r6 = r7 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r6)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4204c(r4)
            int r4 = r4 + r6
            goto L_0x0394
        L_0x0377:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x037d:
            int r4 = r7 << 3
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r4)
            int r4 = r4 + 4
            goto L_0x0394
        L_0x0386:
            boolean r4 = r10.mo12570v(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x038c:
            int r4 = r7 << 3
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2509tm.m4203b(r4)
            int r4 = r4 + 8
        L_0x0394:
            int r3 = r3 + r4
        L_0x0395:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0399:
            b.l.a.c.e.e.a1<?, ?> r0 = r10.f3811m
            java.lang.Object r11 = r0.mo12354j(r11)
            int r11 = r0.mo12361q(r11)
            int r11 = r11 + r3
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12546L(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0256, code lost:
        if (r7.f3838b != 0) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0259, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x025a, code lost:
        r12.mo12655e(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025d, code lost:
        if (r4 >= r5) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x025f, code lost:
        r6 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0265, code lost:
        if (r2 == r7.f3837a) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0268, code lost:
        r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0270, code lost:
        if (r7.f3838b == 0) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0272, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0274, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011c, code lost:
        if (r4 == 0) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011f, code lost:
        r12.add(p005b.p096l.p097a.p113c.p131e.p136e.C2317lm.m3705I(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0127, code lost:
        if (r1 >= r5) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0129, code lost:
        r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012f, code lost:
        if (r2 == r7.f3837a) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0132, code lost:
        r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7);
        r4 = r7.f3837a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0138, code lost:
        if (r4 < 0) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013c, code lost:
        if (r4 > (r3.length - r1)) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013e, code lost:
        if (r4 != 0) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0140, code lost:
        r12.add(p005b.p096l.p097a.p113c.p131e.p136e.C2317lm.f4051h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014a, code lost:
        throw p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014f, code lost:
        throw p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3525b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0150, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019b  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12547M(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, p005b.p096l.p097a.p113c.p131e.p136e.C2144em r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f3798q
            java.lang.Object r12 = r11.getObject(r1, r9)
            b.l.a.c.e.e.g r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2171g) r12
            boolean r13 = r12.mo12473a()
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 + r13
        L_0x002c:
            b.l.a.c.e.e.g r12 = r12.mo12494h(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 2
            r11 = 1
            r13 = 0
            switch(r27) {
                case 18: goto L_0x0391;
                case 19: goto L_0x0348;
                case 20: goto L_0x0310;
                case 21: goto L_0x0310;
                case 22: goto L_0x02f5;
                case 23: goto L_0x02b6;
                case 24: goto L_0x0275;
                case 25: goto L_0x0221;
                case 26: goto L_0x0176;
                case 27: goto L_0x015b;
                case 28: goto L_0x010e;
                case 29: goto L_0x02f5;
                case 30: goto L_0x00d8;
                case 31: goto L_0x0275;
                case 32: goto L_0x02b6;
                case 33: goto L_0x0098;
                case 34: goto L_0x0058;
                case 35: goto L_0x0391;
                case 36: goto L_0x0348;
                case 37: goto L_0x0310;
                case 38: goto L_0x0310;
                case 39: goto L_0x02f5;
                case 40: goto L_0x02b6;
                case 41: goto L_0x0275;
                case 42: goto L_0x0221;
                case 43: goto L_0x02f5;
                case 44: goto L_0x00d8;
                case 45: goto L_0x0275;
                case 46: goto L_0x02b6;
                case 47: goto L_0x0098;
                case 48: goto L_0x0058;
                default: goto L_0x003b;
            }
        L_0x003b:
            r1 = 3
            if (r6 != r1) goto L_0x03f9
            b.l.a.c.e.e.m0 r1 = r0.mo12550P(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2856u2(r22, r23, r24, r25, r26, r27)
            goto L_0x03d7
        L_0x0058:
            if (r6 != r10) goto L_0x007c
            b.l.a.c.e.e.r r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2438r) r12
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r2 = r7.f3837a
            int r2 = r2 + r1
        L_0x0063:
            if (r1 >= r2) goto L_0x0073
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r3, r1, r7)
            long r4 = r7.f3838b
            long r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3840o(r4)
            r12.mo12954l(r4)
            goto L_0x0063
        L_0x0073:
            if (r1 != r2) goto L_0x0077
            goto L_0x03fa
        L_0x0077:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a()
            throw r1
        L_0x007c:
            if (r6 != 0) goto L_0x03f9
            b.l.a.c.e.e.r r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2438r) r12
        L_0x0080:
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r3, r4, r7)
            long r8 = r7.f3838b
            long r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3840o(r8)
            r12.mo12954l(r8)
            if (r1 >= r5) goto L_0x0097
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r1, r7)
            int r6 = r7.f3837a
            if (r2 == r6) goto L_0x0080
        L_0x0097:
            return r1
        L_0x0098:
            if (r6 != r10) goto L_0x00bc
            b.l.a.c.e.e.d r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2096d) r12
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r2 = r7.f3837a
            int r2 = r2 + r1
        L_0x00a3:
            if (r1 >= r2) goto L_0x00b3
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r1, r7)
            int r4 = r7.f3837a
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3839n(r4)
            r12.mo12496l(r4)
            goto L_0x00a3
        L_0x00b3:
            if (r1 != r2) goto L_0x00b7
            goto L_0x03fa
        L_0x00b7:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a()
            throw r1
        L_0x00bc:
            if (r6 != 0) goto L_0x03f9
            b.l.a.c.e.e.d r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2096d) r12
        L_0x00c0:
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r4 = r7.f3837a
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3839n(r4)
            r12.mo12496l(r4)
            if (r1 >= r5) goto L_0x00d7
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r1, r7)
            int r6 = r7.f3837a
            if (r2 == r6) goto L_0x00c0
        L_0x00d7:
            return r1
        L_0x00d8:
            if (r6 != r10) goto L_0x00df
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2872y2(r3, r4, r12, r7)
            goto L_0x00f0
        L_0x00df:
            if (r6 != 0) goto L_0x03f9
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r12
            r7 = r30
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2864w2(r2, r3, r4, r5, r6, r7)
        L_0x00f0:
            b.l.a.c.e.e.c r1 = (p005b.p096l.p097a.p113c.p131e.p136e.C2071c) r1
            b.l.a.c.e.e.b1 r3 = r1.zzc
            b.l.a.c.e.e.b1 r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2048b1.f3616f
            if (r3 != r4) goto L_0x00f9
            r3 = 0
        L_0x00f9:
            b.l.a.c.e.e.f r4 = r0.mo12552R(r8)
            b.l.a.c.e.e.a1<?, ?> r5 = r0.f3811m
            r6 = r22
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3880b(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x0109
            goto L_0x0242
        L_0x0109:
            b.l.a.c.e.e.b1 r3 = (p005b.p096l.p097a.p113c.p131e.p136e.C2048b1) r3
            r1.zzc = r3
            return r2
        L_0x010e:
            if (r6 != r10) goto L_0x03f9
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r4 = r7.f3837a
            if (r4 < 0) goto L_0x0156
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0151
            if (r4 != 0) goto L_0x011f
            goto L_0x0140
        L_0x011f:
            b.l.a.c.e.e.lm r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2317lm.m3705I(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0127:
            if (r1 >= r5) goto L_0x0150
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r1, r7)
            int r6 = r7.f3837a
            if (r2 == r6) goto L_0x0132
            goto L_0x0150
        L_0x0132:
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r4 = r7.f3837a
            if (r4 < 0) goto L_0x014b
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0146
            if (r4 != 0) goto L_0x011f
        L_0x0140:
            b.l.a.c.e.e.lm r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2317lm.f4051h
            r12.add(r4)
            goto L_0x0127
        L_0x0146:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a()
            throw r1
        L_0x014b:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3525b()
            throw r1
        L_0x0150:
            return r1
        L_0x0151:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a()
            throw r1
        L_0x0156:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3525b()
            throw r1
        L_0x015b:
            if (r6 == r10) goto L_0x015f
            goto L_0x03f9
        L_0x015f:
            b.l.a.c.e.e.m0 r1 = r0.mo12550P(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r12
            r28 = r30
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2694A2(r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x0176:
            if (r6 != r10) goto L_0x03f9
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01c3
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r4 = r7.f3837a
            if (r4 < 0) goto L_0x01be
            if (r4 != 0) goto L_0x018e
            goto L_0x01ad
        L_0x018e:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.f3910a
            r8.<init>(r3, r1, r4, r9)
        L_0x0195:
            r12.add(r8)
            int r1 = r1 + r4
        L_0x0199:
            if (r1 >= r5) goto L_0x03fa
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r1, r7)
            int r8 = r7.f3837a
            if (r2 != r8) goto L_0x03fa
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r4 = r7.f3837a
            if (r4 < 0) goto L_0x01b9
            if (r4 != 0) goto L_0x01b1
        L_0x01ad:
            r12.add(r6)
            goto L_0x0199
        L_0x01b1:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.f3910a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x0195
        L_0x01b9:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3525b()
            throw r1
        L_0x01be:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3525b()
            throw r1
        L_0x01c3:
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r4 = r7.f3837a
            if (r4 < 0) goto L_0x021c
            if (r4 != 0) goto L_0x01cf
        L_0x01cd:
            r8 = r1
            goto L_0x01f6
        L_0x01cf:
            int r8 = r1 + r4
            boolean r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2344n1.m3788a(r3, r1, r8)
            if (r9 == 0) goto L_0x0217
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.f3910a
            r9.<init>(r3, r1, r4, r10)
        L_0x01de:
            r12.add(r9)
        L_0x01e1:
            if (r8 >= r5) goto L_0x0214
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r8, r7)
            int r4 = r7.f3837a
            if (r2 != r4) goto L_0x0214
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r1, r7)
            int r4 = r7.f3837a
            if (r4 < 0) goto L_0x020f
            if (r4 != 0) goto L_0x01fa
            goto L_0x01cd
        L_0x01f6:
            r12.add(r6)
            goto L_0x01e1
        L_0x01fa:
            int r8 = r1 + r4
            boolean r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2344n1.m3788a(r3, r1, r8)
            if (r9 == 0) goto L_0x020a
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.f3910a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01de
        L_0x020a:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3530g()
            throw r1
        L_0x020f:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3525b()
            throw r1
        L_0x0214:
            r1 = r8
            goto L_0x03fa
        L_0x0217:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3530g()
            throw r1
        L_0x021c:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3525b()
            throw r1
        L_0x0221:
            r1 = 0
            if (r6 != r10) goto L_0x024a
            b.l.a.c.e.e.fm r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2169fm) r12
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r4 = r7.f3837a
            int r4 = r4 + r2
        L_0x022d:
            if (r2 >= r4) goto L_0x0240
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r3, r2, r7)
            long r5 = r7.f3838b
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x023b
            r5 = r11
            goto L_0x023c
        L_0x023b:
            r5 = r1
        L_0x023c:
            r12.mo12655e(r5)
            goto L_0x022d
        L_0x0240:
            if (r2 != r4) goto L_0x0245
        L_0x0242:
            r1 = r2
            goto L_0x03fa
        L_0x0245:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a()
            throw r1
        L_0x024a:
            if (r6 != 0) goto L_0x03f9
            b.l.a.c.e.e.fm r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2169fm) r12
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r3, r4, r7)
            long r8 = r7.f3838b
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0259
            goto L_0x0272
        L_0x0259:
            r6 = r1
        L_0x025a:
            r12.mo12655e(r6)
            if (r4 >= r5) goto L_0x0274
            int r6 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r8 = r7.f3837a
            if (r2 == r8) goto L_0x0268
            goto L_0x0274
        L_0x0268:
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r3, r6, r7)
            long r8 = r7.f3838b
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0259
        L_0x0272:
            r6 = r11
            goto L_0x025a
        L_0x0274:
            return r4
        L_0x0275:
            if (r6 != r10) goto L_0x0295
            b.l.a.c.e.e.d r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2096d) r12
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r2 = r7.f3837a
            int r2 = r2 + r1
        L_0x0280:
            if (r1 >= r2) goto L_0x028c
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r3, r1)
            r12.mo12496l(r4)
            int r1 = r1 + 4
            goto L_0x0280
        L_0x028c:
            if (r1 != r2) goto L_0x0290
            goto L_0x03fa
        L_0x0290:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a()
            throw r1
        L_0x0295:
            if (r6 != r9) goto L_0x03f9
            b.l.a.c.e.e.d r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2096d) r12
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r18, r19)
        L_0x029d:
            r12.mo12496l(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x02b5
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r6 = r7.f3837a
            if (r2 == r6) goto L_0x02ad
            goto L_0x02b5
        L_0x02ad:
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r3, r1)
            r15 = r4
            r4 = r1
            r1 = r15
            goto L_0x029d
        L_0x02b5:
            return r4
        L_0x02b6:
            if (r6 != r10) goto L_0x02d6
            b.l.a.c.e.e.r r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2438r) r12
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r2 = r7.f3837a
            int r2 = r2 + r1
        L_0x02c1:
            if (r1 >= r2) goto L_0x02cd
            long r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r3, r1)
            r12.mo12954l(r4)
            int r1 = r1 + 8
            goto L_0x02c1
        L_0x02cd:
            if (r1 != r2) goto L_0x02d1
            goto L_0x03fa
        L_0x02d1:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a()
            throw r1
        L_0x02d6:
            if (r6 != r11) goto L_0x03f9
            b.l.a.c.e.e.r r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2438r) r12
            long r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r18, r19)
        L_0x02de:
            r12.mo12954l(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x02f4
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r6 = r7.f3837a
            if (r2 == r6) goto L_0x02ee
            goto L_0x02f4
        L_0x02ee:
            long r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r3, r1)
            r4 = r1
            goto L_0x02de
        L_0x02f4:
            return r4
        L_0x02f5:
            if (r6 != r10) goto L_0x02fd
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2872y2(r3, r4, r12, r7)
            goto L_0x03fa
        L_0x02fd:
            if (r6 == 0) goto L_0x0301
            goto L_0x03f9
        L_0x0301:
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r12
            r26 = r30
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2864w2(r21, r22, r23, r24, r25, r26)
            return r1
        L_0x0310:
            if (r6 != r10) goto L_0x0330
            b.l.a.c.e.e.r r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2438r) r12
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r2 = r7.f3837a
            int r2 = r2 + r1
        L_0x031b:
            if (r1 >= r2) goto L_0x0327
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r3, r1, r7)
            long r4 = r7.f3838b
            r12.mo12954l(r4)
            goto L_0x031b
        L_0x0327:
            if (r1 != r2) goto L_0x032b
            goto L_0x03fa
        L_0x032b:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a()
            throw r1
        L_0x0330:
            if (r6 != 0) goto L_0x03f9
            b.l.a.c.e.e.r r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2438r) r12
        L_0x0334:
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r3, r4, r7)
            long r8 = r7.f3838b
            r12.mo12954l(r8)
            if (r1 >= r5) goto L_0x0347
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r1, r7)
            int r6 = r7.f3837a
            if (r2 == r6) goto L_0x0334
        L_0x0347:
            return r1
        L_0x0348:
            if (r6 != r10) goto L_0x036c
            b.l.a.c.e.e.en r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2145en) r12
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r2 = r7.f3837a
            int r2 = r2 + r1
        L_0x0353:
            if (r1 >= r2) goto L_0x0363
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo12616e(r4)
            int r1 = r1 + 4
            goto L_0x0353
        L_0x0363:
            if (r1 != r2) goto L_0x0367
            goto L_0x03fa
        L_0x0367:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a()
            throw r1
        L_0x036c:
            if (r6 != r9) goto L_0x03f9
            b.l.a.c.e.e.en r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2145en) r12
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r18, r19)
        L_0x0374:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo12616e(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x0390
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r6 = r7.f3837a
            if (r2 == r6) goto L_0x0388
            goto L_0x0390
        L_0x0388:
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r3, r1)
            r15 = r4
            r4 = r1
            r1 = r15
            goto L_0x0374
        L_0x0390:
            return r4
        L_0x0391:
            if (r6 != r10) goto L_0x03b4
            b.l.a.c.e.e.vm r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2557vm) r12
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r2 = r7.f3837a
            int r2 = r2 + r1
        L_0x039c:
            if (r1 >= r2) goto L_0x03ac
            long r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo13062e(r4)
            int r1 = r1 + 8
            goto L_0x039c
        L_0x03ac:
            if (r1 != r2) goto L_0x03af
            goto L_0x03fa
        L_0x03af:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a()
            throw r1
        L_0x03b4:
            if (r6 != r11) goto L_0x03f9
            b.l.a.c.e.e.vm r12 = (p005b.p096l.p097a.p113c.p131e.p136e.C2557vm) r12
            long r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r18, r19)
        L_0x03bc:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo13062e(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x03d6
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r6 = r7.f3837a
            if (r2 == r6) goto L_0x03d0
            goto L_0x03d6
        L_0x03d0:
            long r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r3, r1)
            r4 = r1
            goto L_0x03bc
        L_0x03d6:
            return r4
        L_0x03d7:
            java.lang.Object r8 = r7.f3839c
            r12.add(r8)
            if (r4 >= r5) goto L_0x03f8
            int r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r7)
            int r9 = r7.f3837a
            if (r2 == r9) goto L_0x03e7
            goto L_0x03f8
        L_0x03e7:
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2856u2(r22, r23, r24, r25, r26, r27)
            goto L_0x03d7
        L_0x03f8:
            return r4
        L_0x03f9:
            r1 = r4
        L_0x03fa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12547M(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, b.l.a.c.e.e.em):int");
    }

    /* renamed from: N */
    public final <K, V> int mo12548N(Object obj, byte[] bArr, int i, int i2, int i3, long j) {
        Unsafe unsafe = f3798q;
        Object Q = mo12551Q(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((C2558w) object).f4384g) {
            C2558w a = C2558w.f4383h.mo13070a();
            C2582x.m4364b(a, object);
            unsafe.putObject(obj, j, a);
        }
        C2534v vVar = (C2534v) Q;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c7, code lost:
        if (r15 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3461c(r15, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015e, code lost:
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0164, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r15 == null) goto L_0x00db;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12549O(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p005b.p096l.p097a.p113c.p131e.p136e.C2144em r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f3798q
            int[] r7 = r0.f3799a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 2
            r15 = 5
            switch(r25) {
                case 51: goto L_0x017d;
                case 52: goto L_0x0165;
                case 53: goto L_0x0151;
                case 54: goto L_0x0151;
                case 55: goto L_0x0143;
                case 56: goto L_0x012e;
                case 57: goto L_0x0119;
                case 58: goto L_0x0103;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00ad;
                case 61: goto L_0x00a1;
                case 62: goto L_0x0143;
                case 63: goto L_0x0072;
                case 64: goto L_0x0119;
                case 65: goto L_0x012e;
                case 66: goto L_0x0062;
                case 67: goto L_0x0052;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0196
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0196
            b.l.a.c.e.e.m0 r5 = r0.mo12550P(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2856u2(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f3839c
            if (r15 != 0) goto L_0x00ca
            goto L_0x00db
        L_0x0052:
            if (r5 == 0) goto L_0x0056
            goto L_0x0196
        L_0x0056:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r3, r4, r11)
            long r3 = r11.f3838b
            long r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3840o(r3)
            goto L_0x015a
        L_0x0062:
            if (r5 == 0) goto L_0x0066
            goto L_0x0196
        L_0x0066:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r11)
            int r3 = r11.f3837a
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3839n(r3)
            goto L_0x014c
        L_0x0072:
            if (r5 != 0) goto L_0x0196
            int r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r11)
            int r4 = r11.f3837a
            b.l.a.c.e.e.f r5 = r0.mo12552R(r6)
            if (r5 == 0) goto L_0x0094
            boolean r5 = r5.mo12624a()
            if (r5 == 0) goto L_0x0087
            goto L_0x0094
        L_0x0087:
            b.l.a.c.e.e.b1 r1 = m3238D(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo12418c(r2, r4)
            goto L_0x009e
        L_0x0094:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x009e:
            r2 = r3
            goto L_0x0197
        L_0x00a1:
            if (r5 == r7) goto L_0x00a5
            goto L_0x0196
        L_0x00a5:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2840q2(r3, r4, r11)
            java.lang.Object r3 = r11.f3839c
            goto L_0x015e
        L_0x00ad:
            if (r5 != r7) goto L_0x0196
            b.l.a.c.e.e.m0 r2 = r0.mo12550P(r6)
            r5 = r20
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2848s2(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c4
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00c5
        L_0x00c4:
            r15 = 0
        L_0x00c5:
            java.lang.Object r3 = r11.f3839c
            if (r15 != 0) goto L_0x00ca
            goto L_0x00db
        L_0x00ca:
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3461c(r15, r3)
            goto L_0x00db
        L_0x00cf:
            if (r5 != r7) goto L_0x0196
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r11)
            int r4 = r11.f3837a
            if (r4 != 0) goto L_0x00df
            java.lang.String r3 = ""
        L_0x00db:
            r12.putObject(r1, r9, r3)
            goto L_0x00fe
        L_0x00df:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f3
            int r5 = r2 + r4
            boolean r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2344n1.m3788a(r3, r2, r5)
            if (r5 == 0) goto L_0x00ee
            goto L_0x00f3
        L_0x00ee:
            b.l.a.c.e.e.j r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3530g()
            throw r1
        L_0x00f3:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.f3910a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x00fe:
            r12.putInt(r1, r13, r8)
            goto L_0x0197
        L_0x0103:
            if (r5 != 0) goto L_0x0196
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r3, r4, r11)
            long r3 = r11.f3838b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0113
            r15 = 1
            goto L_0x0114
        L_0x0113:
            r15 = 0
        L_0x0114:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x015e
        L_0x0119:
            if (r5 == r15) goto L_0x011d
            goto L_0x0196
        L_0x011d:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x012e:
            r2 = 1
            if (r5 == r2) goto L_0x0132
            goto L_0x0196
        L_0x0132:
            long r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0143:
            if (r5 == 0) goto L_0x0146
            goto L_0x0196
        L_0x0146:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r3, r4, r11)
            int r3 = r11.f3837a
        L_0x014c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x015e
        L_0x0151:
            if (r5 == 0) goto L_0x0154
            goto L_0x0196
        L_0x0154:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r3, r4, r11)
            long r3 = r11.f3838b
        L_0x015a:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x015e:
            r12.putObject(r1, r9, r3)
            r12.putInt(r1, r13, r8)
            return r2
        L_0x0165:
            if (r5 == r15) goto L_0x0168
            goto L_0x0196
        L_0x0168:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x017d:
            r2 = 1
            if (r5 == r2) goto L_0x0181
            goto L_0x0196
        L_0x0181:
            long r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0196:
            r2 = r4
        L_0x0197:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12549O(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, b.l.a.c.e.e.em):int");
    }

    /* renamed from: P */
    public final C2319m0 mo12550P(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f3800b;
        C2319m0 m0Var = (C2319m0) objArr[i3];
        if (m0Var != null) {
            return m0Var;
        }
        C2319m0 a = C2247j0.f3951c.mo12723a((Class) objArr[i3 + 1]);
        this.f3800b[i3] = a;
        return a;
    }

    /* renamed from: Q */
    public final Object mo12551Q(int i) {
        int i2 = i / 3;
        return this.f3800b[i2 + i2];
    }

    /* renamed from: R */
    public final C2146f mo12552R(int i) {
        int i2 = i / 3;
        return (C2146f) this.f3800b[i2 + i2 + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d8, code lost:
        if (r0 != r15) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0326, code lost:
        if (r0 != r15) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0328, code lost:
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012d, code lost:
        r1 = r11.f3839c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0153, code lost:
        r6.putObject(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ad, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c0, code lost:
        r1 = r11.f3837a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c2, code lost:
        r6.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c5, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021a, code lost:
        r7 = r7 | r23;
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x021f, code lost:
        r23 = r10;
        r0 = r17;
        r29 = r19;
        r19 = r6;
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022a, code lost:
        r2 = r5;
        r28 = r6;
        r6 = r19;
        r19 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12553S(T r32, byte[] r33, int r34, int r35, p005b.p096l.p097a.p113c.p131e.p136e.C2144em r36) {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            sun.misc.Unsafe r9 = f3798q
            r10 = -1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
            r0 = r34
            r6 = r8
            r1 = r10
            r2 = r16
            r7 = r2
        L_0x0019:
            if (r0 >= r13) goto L_0x035c
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2871y1(r0, r12, r3, r11)
            int r3 = r11.f3837a
            r4 = r0
            r17 = r3
            goto L_0x002e
        L_0x002b:
            r17 = r0
            r4 = r3
        L_0x002e:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0045
            int r2 = r2 / 3
            int r0 = r15.f3801c
            if (r5 < r0) goto L_0x0043
            int r0 = r15.f3802d
            if (r5 > r0) goto L_0x0043
            int r0 = r15.mo12540A(r5, r2)
            goto L_0x0049
        L_0x0043:
            r2 = r10
            goto L_0x004a
        L_0x0045:
            int r0 = r15.mo12574z(r5)
        L_0x0049:
            r2 = r0
        L_0x004a:
            if (r2 != r10) goto L_0x0057
            r2 = r4
            r20 = r5
            r28 = r9
            r19 = r10
            r10 = r16
            goto L_0x0336
        L_0x0057:
            int[] r0 = r15.f3799a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r10 = r1 >>> 20
            r10 = r10 & 255(0xff, float:3.57E-43)
            r34 = r5
            r5 = r1 & r8
            r19 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0233
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r6) goto L_0x0095
            if (r6 == r5) goto L_0x0088
            long r1 = (long) r6
            r6 = r19
            r6.putInt(r14, r1, r7)
            goto L_0x008a
        L_0x0088:
            r6 = r19
        L_0x008a:
            if (r0 == r5) goto L_0x0092
            long r1 = (long) r0
            int r1 = r6.getInt(r14, r1)
            r7 = r1
        L_0x0092:
            r2 = r6
            r6 = r0
            goto L_0x0097
        L_0x0095:
            r2 = r19
        L_0x0097:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x0200;
                case 1: goto L_0x01e4;
                case 2: goto L_0x01c7;
                case 3: goto L_0x01c7;
                case 4: goto L_0x01b0;
                case 5: goto L_0x018f;
                case 6: goto L_0x0179;
                case 7: goto L_0x0158;
                case 8: goto L_0x0137;
                case 9: goto L_0x0113;
                case 10: goto L_0x0102;
                case 11: goto L_0x01b0;
                case 12: goto L_0x00f1;
                case 13: goto L_0x0179;
                case 14: goto L_0x018f;
                case 15: goto L_0x00da;
                case 16: goto L_0x00a6;
                default: goto L_0x009b;
            }
        L_0x009b:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            goto L_0x01ad
        L_0x00a6:
            if (r3 != 0) goto L_0x00cd
            int r10 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r12, r4, r11)
            long r0 = r11.f3838b
            long r21 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3840o(r0)
            r0 = r2
            r1 = r32
            r19 = r6
            r4 = r20
            r6 = r2
            r2 = r8
            r20 = r34
            r8 = r4
            r25 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r0 = r7 | r23
            r7 = r0
            r17 = r10
            r10 = r8
            goto L_0x021f
        L_0x00cd:
            r25 = r5
            r19 = r6
            r8 = r20
            r20 = r34
            r6 = r2
            r5 = r4
            r10 = r8
            goto L_0x022a
        L_0x00da:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r12, r4, r11)
            int r1 = r11.f3837a
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3839n(r1)
            goto L_0x01c2
        L_0x00f1:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r12, r4, r11)
            goto L_0x01c0
        L_0x0102:
            r25 = r5
            r19 = r6
            r10 = r20
            r0 = 2
            r20 = r34
            r6 = r2
            if (r3 != r0) goto L_0x01ad
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2840q2(r12, r4, r11)
            goto L_0x012d
        L_0x0113:
            r25 = r5
            r19 = r6
            r10 = r20
            r0 = 2
            r20 = r34
            r6 = r2
            if (r3 != r0) goto L_0x01ad
            b.l.a.c.e.e.m0 r0 = r15.mo12550P(r10)
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2848s2(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r6.getObject(r14, r8)
            if (r1 != 0) goto L_0x0130
        L_0x012d:
            java.lang.Object r1 = r11.f3839c
            goto L_0x0153
        L_0x0130:
            java.lang.Object r2 = r11.f3839c
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3461c(r1, r2)
            goto L_0x0153
        L_0x0137:
            r25 = r5
            r19 = r6
            r10 = r20
            r0 = 2
            r20 = r34
            r6 = r2
            if (r3 != r0) goto L_0x01ad
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x014e
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2820l2(r12, r4, r11)
            goto L_0x012d
        L_0x014e:
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2828n2(r12, r4, r11)
            goto L_0x012d
        L_0x0153:
            r6.putObject(r14, r8, r1)
            goto L_0x01c5
        L_0x0158:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r12, r4, r11)
            long r1 = r11.f3838b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0171
            r1 = 1
            goto L_0x0173
        L_0x0171:
            r1 = r16
        L_0x0173:
            b.l.a.c.e.e.j1 r2 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r2.mo12696c(r14, r8, r1)
            goto L_0x01c5
        L_0x0179:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            if (r3 != r0) goto L_0x01ad
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r12, r4)
            r6.putInt(r14, r8, r0)
            int r4 = r4 + 4
            goto L_0x021a
        L_0x018f:
            r25 = r5
            r19 = r6
            r10 = r20
            r0 = 1
            r20 = r34
            r6 = r2
            if (r3 != r0) goto L_0x01ad
            long r21 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r12, r4)
            r0 = r6
            r1 = r32
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r4 = r8 + 8
            goto L_0x021a
        L_0x01ad:
            r5 = r4
            goto L_0x022a
        L_0x01b0:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            r5 = r4
            if (r3 != 0) goto L_0x022a
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2759V0(r12, r5, r11)
        L_0x01c0:
            int r1 = r11.f3837a
        L_0x01c2:
            r6.putInt(r14, r8, r1)
        L_0x01c5:
            r4 = r0
            goto L_0x021a
        L_0x01c7:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            r5 = r4
            if (r3 != 0) goto L_0x022a
            int r17 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2745Q1(r12, r5, r11)
            long r4 = r11.f3838b
            r0 = r6
            r1 = r32
            r2 = r8
            r0.putLong(r1, r2, r4)
            r0 = r7 | r23
            r7 = r0
            goto L_0x021f
        L_0x01e4:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            r5 = r4
            if (r3 != r0) goto L_0x022a
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2766X1(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            b.l.a.c.e.e.j1 r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r1.mo12698e(r14, r8, r0)
            int r4 = r5 + 4
            goto L_0x021a
        L_0x0200:
            r25 = r5
            r19 = r6
            r10 = r20
            r0 = 1
            r20 = r34
            r6 = r2
            r5 = r4
            if (r3 != r0) goto L_0x022a
            long r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2796f2(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3630l(r14, r8, r0)
            int r4 = r5 + 8
        L_0x021a:
            r0 = r7 | r23
            r7 = r0
            r17 = r4
        L_0x021f:
            r23 = r10
            r0 = r17
            r29 = r19
            r19 = r6
            r6 = r29
            goto L_0x027e
        L_0x022a:
            r2 = r5
            r28 = r6
            r6 = r19
            r19 = -1
            goto L_0x0336
        L_0x0233:
            r20 = r34
            r5 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r29 = r19
            r19 = r6
            r6 = r29
            r0 = 27
            if (r10 != r0) goto L_0x0296
            r0 = 2
            if (r3 != r0) goto L_0x0289
            java.lang.Object r0 = r6.getObject(r14, r8)
            b.l.a.c.e.e.g r0 = (p005b.p096l.p097a.p113c.p131e.p136e.C2171g) r0
            boolean r1 = r0.mo12473a()
            if (r1 != 0) goto L_0x0264
            int r1 = r0.size()
            if (r1 != 0) goto L_0x025c
            r1 = 10
            goto L_0x025d
        L_0x025c:
            int r1 = r1 + r1
        L_0x025d:
            b.l.a.c.e.e.g r0 = r0.mo12494h(r1)
            r6.putObject(r14, r8, r0)
        L_0x0264:
            r8 = r0
            b.l.a.c.e.e.m0 r0 = r15.mo12550P(r4)
            r1 = r17
            r2 = r33
            r3 = r5
            r23 = r4
            r4 = r35
            r5 = r8
            r8 = r19
            r19 = r6
            r6 = r36
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2694A2(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x027e:
            r9 = r19
            r1 = r20
            r2 = r23
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x0289:
            r23 = r4
            r15 = r5
            r28 = r6
            r27 = r7
            r26 = r19
            r19 = -1
            goto L_0x02fa
        L_0x0296:
            r23 = r4
            r29 = r19
            r19 = r6
            r6 = r29
            r0 = 49
            if (r10 > r0) goto L_0x02de
            r1 = r21
            long r1 = (long) r1
            r0 = r31
            r21 = r1
            r1 = r32
            r2 = r33
            r4 = r3
            r3 = r5
            r34 = r4
            r4 = r35
            r15 = r5
            r5 = r17
            r26 = r6
            r6 = r20
            r27 = r7
            r7 = r34
            r29 = r8
            r9 = r25
            r24 = r29
            r8 = r23
            r18 = r10
            r28 = r19
            r19 = -1
            r9 = r21
            r11 = r18
            r12 = r24
            r14 = r36
            int r0 = r0.mo12547M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02db
            goto L_0x0328
        L_0x02db:
            r4 = r0
            goto L_0x032f
        L_0x02de:
            r34 = r3
            r15 = r5
            r26 = r6
            r27 = r7
            r24 = r8
            r18 = r10
            r28 = r19
            r1 = r21
            r19 = -1
            r0 = 50
            r9 = r18
            r7 = r34
            if (r9 != r0) goto L_0x030e
            r0 = 2
            if (r7 == r0) goto L_0x02fc
        L_0x02fa:
            r4 = r15
            goto L_0x032f
        L_0x02fc:
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r23
            r6 = r24
            r0.mo12548N(r1, r2, r3, r4, r5, r6)
            r0 = 0
            throw r0
        L_0x030e:
            r0 = r31
            r8 = r1
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r17
            r6 = r20
            r10 = r24
            r12 = r23
            r13 = r36
            int r0 = r0.mo12549O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02db
        L_0x0328:
            r2 = r23
            r6 = r26
            r7 = r27
            goto L_0x0347
        L_0x032f:
            r2 = r4
            r10 = r23
            r6 = r26
            r7 = r27
        L_0x0336:
            b.l.a.c.e.e.b1 r4 = m3238D(r32)
            r0 = r17
            r1 = r33
            r3 = r35
            r5 = r36
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2702C2(r0, r1, r2, r3, r4, r5)
            r2 = r10
        L_0x0347:
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r10 = r19
            r1 = r20
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x035c:
            r27 = r7
            r1 = r8
            r28 = r9
            if (r6 == r1) goto L_0x036d
            long r1 = (long) r6
            r3 = r32
            r7 = r27
            r4 = r28
            r4.putInt(r3, r1, r7)
        L_0x036d:
            r1 = r35
            if (r0 != r1) goto L_0x0372
            return r0
        L_0x0372:
            b.l.a.c.e.e.j r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3529f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12553S(java.lang.Object, byte[], int, int, b.l.a.c.e.e.em):int");
    }

    /* renamed from: a */
    public final T mo12554a() {
        return ((C2071c) this.f3803e).mo12376h(4, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final void mo12555b(T t) {
        int i;
        int i2 = this.f3808j;
        while (true) {
            i = this.f3809k;
            if (i2 >= i) {
                break;
            }
            long m = (long) (mo12566m(this.f3807i[i2]) & 1048575);
            Object m2 = C2272k1.m3631m(t, m);
            if (m2 != null) {
                ((C2558w) m2).f4384g = false;
                C2272k1.f3995e.mo12732p(t, m, m2);
            }
            i2++;
        }
        int length = this.f3807i.length;
        while (i < length) {
            this.f3810l.mo12862b(t, (long) this.f3807i[i]);
            i++;
        }
        this.f3811m.mo12357m(t);
        if (this.f3804f) {
            this.f3812n.mo13124d(t);
        }
    }

    /* renamed from: c */
    public final int mo12556c(T t) {
        return this.f3806h ? mo12546L(t) : mo12545K(t);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e.mo12732p(r7, r2, p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r8, r2));
        mo12573y(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e.mo12732p(r7, r2, p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e.mo12728l(r7, r2, p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3626h(r7, r2, p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        mo12571w(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        r0 = r0 + 3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12557d(T r7, T r8) {
        /*
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f3799a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x010a
            int r1 = r6.mo12566m(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f3799a
            r4 = r4[r0]
            int r1 = r1 >>> 20
            r1 = r1 & 255(0xff, float:3.57E-43)
            switch(r1) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00e6;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00ba;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00a3;
                case 8: goto L_0x0093;
                case 9: goto L_0x008e;
                case 10: goto L_0x0087;
                case 11: goto L_0x0080;
                case 12: goto L_0x0079;
                case 13: goto L_0x0072;
                case 14: goto L_0x006a;
                case 15: goto L_0x0063;
                case 16: goto L_0x005b;
                case 17: goto L_0x008e;
                case 18: goto L_0x0054;
                case 19: goto L_0x0054;
                case 20: goto L_0x0054;
                case 21: goto L_0x0054;
                case 22: goto L_0x0054;
                case 23: goto L_0x0054;
                case 24: goto L_0x0054;
                case 25: goto L_0x0054;
                case 26: goto L_0x0054;
                case 27: goto L_0x0054;
                case 28: goto L_0x0054;
                case 29: goto L_0x0054;
                case 30: goto L_0x0054;
                case 31: goto L_0x0054;
                case 32: goto L_0x0054;
                case 33: goto L_0x0054;
                case 34: goto L_0x0054;
                case 35: goto L_0x0054;
                case 36: goto L_0x0054;
                case 37: goto L_0x0054;
                case 38: goto L_0x0054;
                case 39: goto L_0x0054;
                case 40: goto L_0x0054;
                case 41: goto L_0x0054;
                case 42: goto L_0x0054;
                case 43: goto L_0x0054;
                case 44: goto L_0x0054;
                case 45: goto L_0x0054;
                case 46: goto L_0x0054;
                case 47: goto L_0x0054;
                case 48: goto L_0x0054;
                case 49: goto L_0x0054;
                case 50: goto L_0x003f;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0106
        L_0x001f:
            boolean r1 = r6.mo12572x(r8, r4, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x0031
        L_0x0026:
            r6.mo12544J(r7, r8, r0)
            goto L_0x0106
        L_0x002b:
            boolean r1 = r6.mo12572x(r8, r4, r0)
            if (r1 == 0) goto L_0x0106
        L_0x0031:
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r8, r2)
            b.l.a.c.e.e.j1 r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r5.mo12732p(r7, r2, r1)
            r6.mo12573y(r7, r4, r0)
            goto L_0x0106
        L_0x003f:
            java.lang.Class<?> r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.f4133a
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r7, r2)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r8, r2)
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2582x.m4364b(r1, r4)
            b.l.a.c.e.e.j1 r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r4.mo12732p(r7, r2, r1)
            goto L_0x0106
        L_0x0054:
            b.l.a.c.e.e.q r1 = r6.f3810l
            r1.mo12863c(r7, r8, r2)
            goto L_0x0106
        L_0x005b:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x0063:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x006a:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x0072:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0079:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0080:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0087:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x0099
        L_0x008e:
            r6.mo12543I(r7, r8, r0)
            goto L_0x0106
        L_0x0093:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x0099:
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r8, r2)
            b.l.a.c.e.e.j1 r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r4.mo12732p(r7, r2, r1)
            goto L_0x0103
        L_0x00a3:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            boolean r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3627i(r8, r2)
            b.l.a.c.e.e.j1 r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r4.mo12696c(r7, r2, r1)
            goto L_0x0103
        L_0x00b3:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x00ba:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x00c1:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x00c7:
            int r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r8, r2)
            b.l.a.c.e.e.j1 r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r4.mo12728l(r7, r2, r1)
            goto L_0x0103
        L_0x00d1:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x00d8:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x00de:
            long r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r8, r2)
            p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3626h(r7, r2, r4)
            goto L_0x0103
        L_0x00e6:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            float r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3628j(r8, r2)
            b.l.a.c.e.e.j1 r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e
            r4.mo12698e(r7, r2, r1)
            goto L_0x0103
        L_0x00f6:
            boolean r1 = r6.mo12570v(r8, r0)
            if (r1 == 0) goto L_0x0106
            double r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3629k(r8, r2)
            p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3630l(r7, r2, r4)
        L_0x0103:
            r6.mo12571w(r7, r0)
        L_0x0106:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x010a:
            b.l.a.c.e.e.a1<?, ?> r0 = r6.f3811m
            java.lang.Class<?> r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.f4133a
            java.lang.Object r1 = r0.mo12354j(r7)
            java.lang.Object r2 = r0.mo12354j(r8)
            java.lang.Object r1 = r0.mo12359o(r1, r2)
            r0.mo12353i(r7, r1)
            boolean r7 = r6.f3804f
            if (r7 != 0) goto L_0x0122
            return
        L_0x0122:
            b.l.a.c.e.e.ym<?> r7 = r6.f3812n
            r7.mo13122b(r8)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12557d(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r2 * 53;
        r3 = m3244q(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r2 = r2 * 53;
        r3 = m3245r(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r2 = r2 * 53;
        r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3460b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011b, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3459a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12558e(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f3799a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0129
            int r3 = r8.mo12566m(r1)
            int[] r4 = r8.f3799a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0115;
                case 1: goto L_0x010a;
                case 2: goto L_0x0103;
                case 3: goto L_0x0103;
                case 4: goto L_0x00fc;
                case 5: goto L_0x0103;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00fc;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00fc;
                case 14: goto L_0x0103;
                case 15: goto L_0x00fc;
                case 16: goto L_0x0103;
                case 17: goto L_0x00c4;
                case 18: goto L_0x00cb;
                case 19: goto L_0x00cb;
                case 20: goto L_0x00cb;
                case 21: goto L_0x00cb;
                case 22: goto L_0x00cb;
                case 23: goto L_0x00cb;
                case 24: goto L_0x00cb;
                case 25: goto L_0x00cb;
                case 26: goto L_0x00cb;
                case 27: goto L_0x00cb;
                case 28: goto L_0x00cb;
                case 29: goto L_0x00cb;
                case 30: goto L_0x00cb;
                case 31: goto L_0x00cb;
                case 32: goto L_0x00cb;
                case 33: goto L_0x00cb;
                case 34: goto L_0x00cb;
                case 35: goto L_0x00cb;
                case 36: goto L_0x00cb;
                case 37: goto L_0x00cb;
                case 38: goto L_0x00cb;
                case 39: goto L_0x00cb;
                case 40: goto L_0x00cb;
                case 41: goto L_0x00cb;
                case 42: goto L_0x00cb;
                case 43: goto L_0x00cb;
                case 44: goto L_0x00cb;
                case 45: goto L_0x00cb;
                case 46: goto L_0x00cb;
                case 47: goto L_0x00cb;
                case 48: goto L_0x00cb;
                case 49: goto L_0x00cb;
                case 50: goto L_0x00cb;
                case 51: goto L_0x00b7;
                case 52: goto L_0x00aa;
                case 53: goto L_0x009c;
                case 54: goto L_0x0095;
                case 55: goto L_0x0087;
                case 56: goto L_0x0080;
                case 57: goto L_0x0079;
                case 58: goto L_0x006b;
                case 59: goto L_0x0063;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0125
        L_0x001f:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x0027:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x002f:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0036:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x003e:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0045:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x004c:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0053:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x005b:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x0063:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00e4
        L_0x006b:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            boolean r3 = m3246s(r9, r5)
            goto L_0x00f7
        L_0x0079:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0080:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x0087:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
        L_0x008d:
            int r2 = r2 * 53
            int r3 = m3244q(r9, r5)
            goto L_0x0123
        L_0x0095:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x009c:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
        L_0x00a2:
            int r2 = r2 * 53
            long r3 = m3245r(r9, r5)
            goto L_0x011f
        L_0x00aa:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            float r3 = m3243p(r9, r5)
            goto L_0x0110
        L_0x00b7:
            boolean r3 = r8.mo12572x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            double r3 = m3242o(r9, r5)
            goto L_0x011b
        L_0x00c4:
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5)
            if (r3 == 0) goto L_0x00e0
            goto L_0x00dc
        L_0x00cb:
            int r2 = r2 * 53
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00d6:
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5)
            if (r3 == 0) goto L_0x00e0
        L_0x00dc:
            int r7 = r3.hashCode()
        L_0x00e0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0125
        L_0x00e4:
            int r2 = r2 * 53
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00f1:
            int r2 = r2 * 53
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3627i(r9, r5)
        L_0x00f7:
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3460b(r3)
            goto L_0x0123
        L_0x00fc:
            int r2 = r2 * 53
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r9, r5)
            goto L_0x0123
        L_0x0103:
            int r2 = r2 * 53
            long r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r9, r5)
            goto L_0x011f
        L_0x010a:
            int r2 = r2 * 53
            float r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3628j(r9, r5)
        L_0x0110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0123
        L_0x0115:
            int r2 = r2 * 53
            double r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3629k(r9, r5)
        L_0x011b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x011f:
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3459a(r3)
        L_0x0123:
            int r3 = r3 + r2
            r2 = r3
        L_0x0125:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0129:
            int r2 = r2 * 53
            b.l.a.c.e.e.a1<?, ?> r0 = r8.f3811m
            java.lang.Object r0 = r0.mo12354j(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f3804f
            if (r1 != 0) goto L_0x013b
            return r0
        L_0x013b:
            b.l.a.c.e.e.ym<?> r0 = r8.f3812n
            r0.mo13122b(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12558e(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12559f(T r9, T r10) {
        /*
            r8 = this;
            int[] r0 = r8.f3799a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.mo12566m(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            switch(r3) {
                case 0: goto L_0x019a;
                case 1: goto L_0x0181;
                case 2: goto L_0x016e;
                case 3: goto L_0x015b;
                case 4: goto L_0x014a;
                case 5: goto L_0x0136;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x001a;
                case 55: goto L_0x001a;
                case 56: goto L_0x001a;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x001a;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x01b6
        L_0x001a:
            int r3 = r8.mo12567n(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r9, r3)
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3879a(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3879a(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3879a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r9, r5)
            long r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r9, r5)
            long r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3879a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3879a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3879a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3627i(r9, r5)
            boolean r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3627i(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r9, r5)
            long r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r9, r5)
            long r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r9, r5)
            long r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3628j(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3628j(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.mo12568t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3629k(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3629k(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            b.l.a.c.e.e.a1<?, ?> r0 = r8.f3811m
            java.lang.Object r0 = r0.mo12354j(r9)
            b.l.a.c.e.e.a1<?, ?> r2 = r8.f3811m
            java.lang.Object r2 = r2.mo12354j(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r8.f3804f
            if (r0 != 0) goto L_0x01d3
            r9 = 1
            return r9
        L_0x01d3:
            b.l.a.c.e.e.ym<?> r0 = r8.f3812n
            r0.mo13122b(r9)
            b.l.a.c.e.e.ym<?> r9 = r8.f3812n
            r9.mo13122b(r10)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12559f(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0306, code lost:
        r0.mo12898o(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x030f, code lost:
        r0.mo12897n(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0318, code lost:
        r0.mo12896m(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0321, code lost:
        r0.mo12895l(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0333, code lost:
        r14 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3880b(r4, r6, mo12552R(r5), r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x033d, code lost:
        r0.mo12893j(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x038c, code lost:
        r0.mo12888e(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0395, code lost:
        r0.mo12887d(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x039e, code lost:
        r0.mo12886c(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03a7, code lost:
        r0.mo12885b(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03b0, code lost:
        r0.mo12883G(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03b9, code lost:
        r0.mo12884a(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03c2, code lost:
        r0.mo12882F(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03cb, code lost:
        r0.mo12881E(r4.mo12861a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03fe, code lost:
        r8.mo12732p(r2, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0413, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3626h(r2, r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x042a, code lost:
        r8.mo12728l(r2, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0462, code lost:
        r14 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3881c(r4, r7, r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04a2, code lost:
        p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e.mo12732p(r2, r6, p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3461c(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0538, code lost:
        mo12571w(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        r11.mo12345a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x055d, code lost:
        if (r14 == null) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x055f, code lost:
        r14 = r11.mo12355k(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0568, code lost:
        if (r11.mo12358n(r14, r0) == false) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x056a, code lost:
        r0 = r1.f3808j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x056e, code lost:
        if (r0 < r1.f3809k) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0570, code lost:
        mo12564k(r2, r1.f3807i[r0], r14);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x057a, code lost:
        if (r14 != null) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x057c, code lost:
        r11.mo12356l(r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0209, code lost:
        mo12573y(r2, r4, r5);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:199:0x055a */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12560g(T r17, p005b.p096l.p097a.p113c.p131e.p136e.C2389om r18, p005b.p096l.p097a.p113c.p131e.p136e.C2605xm r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r18
            r10 = r19
            java.util.Objects.requireNonNull(r19)
            b.l.a.c.e.e.a1<?, ?> r11 = r1.f3811m
            b.l.a.c.e.e.ym<?> r12 = r1.f3812n
            r3 = 0
            r14 = 0
        L_0x0011:
            int r4 = r18.mo12903v()     // Catch:{ all -> 0x00ad }
            int r5 = r1.mo12574z(r4)     // Catch:{ all -> 0x00ad }
            if (r5 >= 0) goto L_0x0080
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L_0x0036
            int r0 = r1.f3808j
        L_0x0022:
            int r3 = r1.f3809k
            if (r0 >= r3) goto L_0x0030
            int[] r3 = r1.f3807i
            r3 = r3[r0]
            r1.mo12564k(r2, r3, r14)
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0030:
            if (r14 == 0) goto L_0x057f
            r11.mo12356l(r2, r14)
            return
        L_0x0036:
            boolean r5 = r1.f3804f     // Catch:{ all -> 0x00ad }
            if (r5 != 0) goto L_0x003c
            r5 = 0
            goto L_0x0043
        L_0x003c:
            b.l.a.c.e.e.c0 r5 = r1.f3803e     // Catch:{ all -> 0x00ad }
            java.lang.Object r4 = r12.mo13126f(r10, r5, r4)     // Catch:{ all -> 0x00ad }
            r5 = r4
        L_0x0043:
            if (r5 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x004b
            b.l.a.c.e.e.cn r3 = r12.mo13123c(r2)     // Catch:{ all -> 0x00ad }
        L_0x004b:
            r15 = r3
            r3 = r12
            r4 = r18
            r6 = r19
            r7 = r15
            r8 = r14
            r9 = r11
            java.lang.Object r14 = r3.mo13125e(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ad }
            r3 = r15
            goto L_0x0011
        L_0x005a:
            r11.mo12345a(r0)     // Catch:{ all -> 0x00ad }
            if (r14 != 0) goto L_0x0064
            java.lang.Object r4 = r11.mo12355k(r2)     // Catch:{ all -> 0x00ad }
            r14 = r4
        L_0x0064:
            boolean r4 = r11.mo12358n(r14, r0)     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f3808j
        L_0x006c:
            int r3 = r1.f3809k
            if (r0 >= r3) goto L_0x007a
            int[] r3 = r1.f3807i
            r3 = r3[r0]
            r1.mo12564k(r2, r3, r14)
            int r0 = r0 + 1
            goto L_0x006c
        L_0x007a:
            if (r14 == 0) goto L_0x057f
            r11.mo12356l(r2, r14)
            return
        L_0x0080:
            int r6 = r1.mo12566m(r5)     // Catch:{ all -> 0x00ad }
            int r7 = r6 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 3
            r15 = 1
            r13 = 0
            switch(r7) {
                case 0: goto L_0x0525;
                case 1: goto L_0x050e;
                case 2: goto L_0x0505;
                case 3: goto L_0x04f7;
                case 4: goto L_0x04e7;
                case 5: goto L_0x04de;
                case 6: goto L_0x04d3;
                case 7: goto L_0x04c1;
                case 8: goto L_0x04bc;
                case 9: goto L_0x0487;
                case 10: goto L_0x047c;
                case 11: goto L_0x0472;
                case 12: goto L_0x044c;
                case 13: goto L_0x043c;
                case 14: goto L_0x042f;
                case 15: goto L_0x0418;
                case 16: goto L_0x0403;
                case 17: goto L_0x03d0;
                case 18: goto L_0x03c7;
                case 19: goto L_0x03be;
                case 20: goto L_0x03b5;
                case 21: goto L_0x03ac;
                case 22: goto L_0x03a3;
                case 23: goto L_0x039a;
                case 24: goto L_0x0391;
                case 25: goto L_0x0388;
                case 26: goto L_0x0362;
                case 27: goto L_0x0350;
                case 28: goto L_0x0342;
                case 29: goto L_0x0339;
                case 30: goto L_0x0326;
                case 31: goto L_0x031d;
                case 32: goto L_0x0314;
                case 33: goto L_0x030b;
                case 34: goto L_0x0302;
                case 35: goto L_0x02f7;
                case 36: goto L_0x02ec;
                case 37: goto L_0x02e1;
                case 38: goto L_0x02d6;
                case 39: goto L_0x02cb;
                case 40: goto L_0x02c0;
                case 41: goto L_0x02b5;
                case 42: goto L_0x02aa;
                case 43: goto L_0x029f;
                case 44: goto L_0x028d;
                case 45: goto L_0x0281;
                case 46: goto L_0x0275;
                case 47: goto L_0x0269;
                case 48: goto L_0x025d;
                case 49: goto L_0x024a;
                case 50: goto L_0x020e;
                case 51: goto L_0x01f2;
                case 52: goto L_0x01da;
                case 53: goto L_0x01cc;
                case 54: goto L_0x01b9;
                case 55: goto L_0x01a6;
                case 56: goto L_0x0198;
                case 57: goto L_0x018a;
                case 58: goto L_0x0177;
                case 59: goto L_0x0172;
                case 60: goto L_0x013b;
                case 61: goto L_0x0131;
                case 62: goto L_0x0123;
                case 63: goto L_0x0101;
                case 64: goto L_0x00ee;
                case 65: goto L_0x00dc;
                case 66: goto L_0x00c6;
                case 67: goto L_0x00b0;
                case 68: goto L_0x0099;
                default: goto L_0x0091;
            }
        L_0x0091:
            if (r14 != 0) goto L_0x053e
            java.lang.Object r4 = r11.mo12351g()     // Catch:{ i -> 0x055a }
            goto L_0x053d
        L_0x0099:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.m0 r8 = r1.mo12550P(r5)     // Catch:{ i -> 0x055a }
            r0.mo12899p(r9)     // Catch:{ i -> 0x055a }
            java.lang.Object r8 = r0.mo12901r(r8, r10)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
        L_0x00a8:
            r9.mo12732p(r2, r6, r8)     // Catch:{ i -> 0x055a }
            goto L_0x0209
        L_0x00ad:
            r0 = move-exception
            goto L_0x0580
        L_0x00b0:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r8 = r0.f4176a     // Catch:{ i -> 0x055a }
            long r8 = r8.mo12852f()     // Catch:{ i -> 0x055a }
            long r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3840o(r8)     // Catch:{ i -> 0x055a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x00c6:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r8 = r0.f4176a     // Catch:{ i -> 0x055a }
            int r8 = r8.mo12851e()     // Catch:{ i -> 0x055a }
            int r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3839n(r8)     // Catch:{ i -> 0x055a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x00dc:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            r0.mo12899p(r15)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r8 = r0.f4176a     // Catch:{ i -> 0x055a }
            long r8 = r8.mo12855i()     // Catch:{ i -> 0x055a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x00ee:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            r8 = 5
            r0.mo12899p(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r8 = r0.f4176a     // Catch:{ i -> 0x055a }
            int r8 = r8.mo12854h()     // Catch:{ i -> 0x055a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x0101:
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r7 = r0.f4176a     // Catch:{ i -> 0x055a }
            int r7 = r7.mo12851e()     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.f r9 = r1.mo12552R(r5)     // Catch:{ i -> 0x055a }
            if (r9 == 0) goto L_0x0116
            boolean r9 = r9.mo12624a()     // Catch:{ i -> 0x055a }
            if (r9 == 0) goto L_0x0462
        L_0x0116:
            r6 = r6 & r8
            long r8 = (long) r6     // Catch:{ i -> 0x055a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            r7.mo12732p(r2, r8, r6)     // Catch:{ i -> 0x055a }
            goto L_0x0209
        L_0x0123:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            int r8 = r18.mo12880D()     // Catch:{ i -> 0x055a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x0131:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.lm r8 = r18.mo12879C()     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x013b:
            boolean r7 = r1.mo12572x(r2, r4, r5)     // Catch:{ i -> 0x055a }
            r6 = r6 & r8
            if (r7 == 0) goto L_0x015b
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            java.lang.Object r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r2, r6)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.m0 r9 = r1.mo12550P(r5)     // Catch:{ i -> 0x055a }
            r13 = 2
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            java.lang.Object r9 = r0.mo12900q(r9, r10)     // Catch:{ i -> 0x055a }
            java.lang.Object r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3461c(r8, r9)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x015b:
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.m0 r8 = r1.mo12550P(r5)     // Catch:{ i -> 0x055a }
            r9 = 2
            r0.mo12899p(r9)     // Catch:{ i -> 0x055a }
            java.lang.Object r8 = r0.mo12900q(r8, r10)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            r9.mo12732p(r2, r6, r8)     // Catch:{ i -> 0x055a }
            r1.mo12571w(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x0209
        L_0x0172:
            r1.mo12565l(r2, r6, r0)     // Catch:{ i -> 0x055a }
            goto L_0x0209
        L_0x0177:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r8 = r0.f4176a     // Catch:{ i -> 0x055a }
            boolean r8 = r8.mo12850d()     // Catch:{ i -> 0x055a }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x018a:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            int r8 = r18.mo12907z()     // Catch:{ i -> 0x055a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x0198:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            long r8 = r18.mo12906y()     // Catch:{ i -> 0x055a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x01a6:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r8 = r0.f4176a     // Catch:{ i -> 0x055a }
            int r8 = r8.mo12851e()     // Catch:{ i -> 0x055a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x01b9:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r8 = r0.f4176a     // Catch:{ i -> 0x055a }
            long r8 = r8.mo12852f()     // Catch:{ i -> 0x055a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x01cc:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            long r8 = r18.mo12905x()     // Catch:{ i -> 0x055a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x01da:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            r8 = 5
            r0.mo12899p(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r8 = r0.f4176a     // Catch:{ i -> 0x055a }
            int r8 = r8.mo12854h()     // Catch:{ i -> 0x055a }
            float r8 = java.lang.Float.intBitsToFloat(r8)     // Catch:{ i -> 0x055a }
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x01f2:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ i -> 0x055a }
            r0.mo12899p(r15)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r8 = r0.f4176a     // Catch:{ i -> 0x055a }
            long r8 = r8.mo12855i()     // Catch:{ i -> 0x055a }
            double r8 = java.lang.Double.longBitsToDouble(r8)     // Catch:{ i -> 0x055a }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r9 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x00a8
        L_0x0209:
            r1.mo12573y(r2, r4, r5)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x020e:
            java.lang.Object r4 = r1.mo12551Q(r5)     // Catch:{ i -> 0x055a }
            int r5 = r1.mo12566m(r5)     // Catch:{ i -> 0x055a }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r2, r5)     // Catch:{ i -> 0x055a }
            if (r7 == 0) goto L_0x0236
            r8 = r7
            b.l.a.c.e.e.w r8 = (p005b.p096l.p097a.p113c.p131e.p136e.C2558w) r8     // Catch:{ i -> 0x055a }
            boolean r8 = r8.f4384g     // Catch:{ i -> 0x055a }
            r8 = r8 ^ r15
            if (r8 == 0) goto L_0x0241
            b.l.a.c.e.e.w r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2558w.f4383h     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.w r8 = r8.mo13070a()     // Catch:{ i -> 0x055a }
            p005b.p096l.p097a.p113c.p131e.p136e.C2582x.m4364b(r8, r7)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            r7.mo12732p(r2, r5, r8)     // Catch:{ i -> 0x055a }
            r7 = r8
            goto L_0x0241
        L_0x0236:
            b.l.a.c.e.e.w r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2558w.f4383h     // Catch:{ i -> 0x0247 }
            b.l.a.c.e.e.w r7 = r7.mo13070a()     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x0247 }
            r8.mo12732p(r2, r5, r7)     // Catch:{ i -> 0x0247 }
        L_0x0241:
            b.l.a.c.e.e.w r7 = (p005b.p096l.p097a.p113c.p131e.p136e.C2558w) r7     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.v r4 = (p005b.p096l.p097a.p113c.p131e.p136e.C2534v) r4     // Catch:{ i -> 0x055a }
            r7 = 0
            throw r7     // Catch:{ i -> 0x055a }
        L_0x0247:
            r7 = 0
            goto L_0x055a
        L_0x024a:
            r7 = 0
            r4 = r6 & r8
            long r8 = (long) r4     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.m0 r4 = r1.mo12550P(r5)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.q r5 = r1.f3810l     // Catch:{ i -> 0x055a }
            java.util.List r5 = r5.mo12861a(r2, r8)     // Catch:{ i -> 0x055a }
            r0.mo12891h(r5, r4, r10)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x025d:
            r7 = 0
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x0260:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x0306
        L_0x0269:
            r7 = 0
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x026c:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x030f
        L_0x0275:
            r7 = 0
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x0278:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x0318
        L_0x0281:
            r7 = 0
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x0284:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x0321
        L_0x028d:
            r7 = 0
            b.l.a.c.e.e.q r9 = r1.f3810l     // Catch:{ i -> 0x055a }
            r6 = r6 & r8
            long r7 = (long) r6     // Catch:{ i -> 0x055a }
            java.util.List r6 = r9.mo12861a(r2, r7)     // Catch:{ i -> 0x055a }
            r0.mo12894k(r6)     // Catch:{ i -> 0x055a }
        L_0x0299:
            b.l.a.c.e.e.f r5 = r1.mo12552R(r5)     // Catch:{ i -> 0x055a }
            goto L_0x0333
        L_0x029f:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x02a1:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x033d
        L_0x02aa:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x02ac:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x038c
        L_0x02b5:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x02b7:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x0395
        L_0x02c0:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x02c2:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x039e
        L_0x02cb:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x02cd:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x03a7
        L_0x02d6:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x02d8:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x03b0
        L_0x02e1:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x02e3:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x03b9
        L_0x02ec:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x02ee:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x03c2
        L_0x02f7:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
        L_0x02f9:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x03cb
        L_0x0302:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x0260
        L_0x0306:
            r0.mo12898o(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x030b:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x026c
        L_0x030f:
            r0.mo12897n(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x0314:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x0278
        L_0x0318:
            r0.mo12896m(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x031d:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x0284
        L_0x0321:
            r0.mo12895l(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x0326:
            b.l.a.c.e.e.q r7 = r1.f3810l     // Catch:{ i -> 0x055a }
            r6 = r6 & r8
            long r8 = (long) r6     // Catch:{ i -> 0x055a }
            java.util.List r6 = r7.mo12861a(r2, r8)     // Catch:{ i -> 0x055a }
            r0.mo12894k(r6)     // Catch:{ i -> 0x055a }
            goto L_0x0299
        L_0x0333:
            java.lang.Object r14 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3880b(r4, r6, r5, r14, r11)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x0339:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x02a1
        L_0x033d:
            r0.mo12893j(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x0342:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            r0.mo12892i(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x0350:
            b.l.a.c.e.e.m0 r4 = r1.mo12550P(r5)     // Catch:{ i -> 0x055a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.q r7 = r1.f3810l     // Catch:{ i -> 0x055a }
            java.util.List r5 = r7.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            r0.mo12890g(r5, r4, r10)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x0362:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0369
            r4 = r15
            goto L_0x036a
        L_0x0369:
            r4 = r13
        L_0x036a:
            if (r4 == 0) goto L_0x037a
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            r0.mo12889f(r4, r15)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x037a:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ i -> 0x055a }
            java.util.List r4 = r4.mo12861a(r2, r5)     // Catch:{ i -> 0x055a }
            r0.mo12889f(r4, r13)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x0388:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x02ac
        L_0x038c:
            r0.mo12888e(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x0391:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x02b7
        L_0x0395:
            r0.mo12887d(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x039a:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x02c2
        L_0x039e:
            r0.mo12886c(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x03a3:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x02cd
        L_0x03a7:
            r0.mo12885b(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x03ac:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x02d8
        L_0x03b0:
            r0.mo12883G(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x03b5:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x02e3
        L_0x03b9:
            r0.mo12884a(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x03be:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x02ee
        L_0x03c2:
            r0.mo12882F(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x03c7:
            b.l.a.c.e.e.q r4 = r1.f3810l     // Catch:{ i -> 0x055a }
            goto L_0x02f9
        L_0x03cb:
            r0.mo12881E(r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x03d0:
            boolean r4 = r1.mo12570v(r2, r5)     // Catch:{ i -> 0x055a }
            if (r4 == 0) goto L_0x03ee
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r2, r6)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.m0 r5 = r1.mo12550P(r5)     // Catch:{ i -> 0x055a }
            r0.mo12899p(r9)     // Catch:{ i -> 0x055a }
            java.lang.Object r5 = r0.mo12901r(r5, r10)     // Catch:{ i -> 0x055a }
        L_0x03e8:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2196h.m3461c(r4, r5)     // Catch:{ i -> 0x055a }
            goto L_0x04a2
        L_0x03ee:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.m0 r4 = r1.mo12550P(r5)     // Catch:{ i -> 0x055a }
            r0.mo12899p(r9)     // Catch:{ i -> 0x055a }
            java.lang.Object r4 = r0.mo12901r(r4, r10)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
        L_0x03fe:
            r8.mo12732p(r2, r6, r4)     // Catch:{ i -> 0x055a }
            goto L_0x0538
        L_0x0403:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r4 = r0.f4176a     // Catch:{ i -> 0x055a }
            long r8 = r4.mo12852f()     // Catch:{ i -> 0x055a }
            long r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3840o(r8)     // Catch:{ i -> 0x055a }
        L_0x0413:
            p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3626h(r2, r6, r8)     // Catch:{ i -> 0x055a }
            goto L_0x0538
        L_0x0418:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r4 = r0.f4176a     // Catch:{ i -> 0x055a }
            int r4 = r4.mo12851e()     // Catch:{ i -> 0x055a }
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.m3839n(r4)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
        L_0x042a:
            r8.mo12728l(r2, r6, r4)     // Catch:{ i -> 0x055a }
            goto L_0x0538
        L_0x042f:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            r0.mo12899p(r15)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r4 = r0.f4176a     // Catch:{ i -> 0x055a }
            long r8 = r4.mo12855i()     // Catch:{ i -> 0x055a }
            goto L_0x0413
        L_0x043c:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            r4 = 5
            r0.mo12899p(r4)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r4 = r0.f4176a     // Catch:{ i -> 0x055a }
            int r4 = r4.mo12854h()     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x042a
        L_0x044c:
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r7 = r0.f4176a     // Catch:{ i -> 0x055a }
            int r7 = r7.mo12851e()     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.f r9 = r1.mo12552R(r5)     // Catch:{ i -> 0x055a }
            if (r9 == 0) goto L_0x0468
            boolean r9 = r9.mo12624a()     // Catch:{ i -> 0x055a }
            if (r9 == 0) goto L_0x0462
            goto L_0x0468
        L_0x0462:
            java.lang.Object r14 = p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3881c(r4, r7, r14, r11)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x0468:
            r4 = r6 & r8
            long r8 = (long) r4     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            r4.mo12728l(r2, r8, r7)     // Catch:{ i -> 0x055a }
            goto L_0x0538
        L_0x0472:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            int r4 = r18.mo12880D()     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x042a
        L_0x047c:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.lm r4 = r18.mo12879C()     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x03fe
        L_0x0487:
            boolean r4 = r1.mo12570v(r2, r5)     // Catch:{ i -> 0x055a }
            if (r4 == 0) goto L_0x04a9
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r2, r6)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.m0 r5 = r1.mo12550P(r5)     // Catch:{ i -> 0x055a }
            r8 = 2
            r0.mo12899p(r8)     // Catch:{ i -> 0x055a }
            java.lang.Object r5 = r0.mo12900q(r5, r10)     // Catch:{ i -> 0x055a }
            goto L_0x03e8
        L_0x04a2:
            b.l.a.c.e.e.j1 r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            r5.mo12732p(r2, r6, r4)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x04a9:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.m0 r4 = r1.mo12550P(r5)     // Catch:{ i -> 0x055a }
            r8 = 2
            r0.mo12899p(r8)     // Catch:{ i -> 0x055a }
            java.lang.Object r4 = r0.mo12900q(r4, r10)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x03fe
        L_0x04bc:
            r1.mo12565l(r2, r6, r0)     // Catch:{ i -> 0x055a }
            goto L_0x0538
        L_0x04c1:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r4 = r0.f4176a     // Catch:{ i -> 0x055a }
            boolean r4 = r4.mo12850d()     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            r8.mo12696c(r2, r6, r4)     // Catch:{ i -> 0x055a }
            goto L_0x0538
        L_0x04d3:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            int r4 = r18.mo12907z()     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x042a
        L_0x04de:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            long r8 = r18.mo12906y()     // Catch:{ i -> 0x055a }
            goto L_0x0413
        L_0x04e7:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r4 = r0.f4176a     // Catch:{ i -> 0x055a }
            int r4 = r4.mo12851e()     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            goto L_0x042a
        L_0x04f7:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            r0.mo12899p(r13)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r4 = r0.f4176a     // Catch:{ i -> 0x055a }
            long r8 = r4.mo12852f()     // Catch:{ i -> 0x055a }
            goto L_0x0413
        L_0x0505:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            long r8 = r18.mo12905x()     // Catch:{ i -> 0x055a }
            goto L_0x0413
        L_0x050e:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            r4 = 5
            r0.mo12899p(r4)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r4 = r0.f4176a     // Catch:{ i -> 0x055a }
            int r4 = r4.mo12854h()     // Catch:{ i -> 0x055a }
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.j1 r8 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.f3995e     // Catch:{ i -> 0x055a }
            r8.mo12698e(r2, r6, r4)     // Catch:{ i -> 0x055a }
            goto L_0x0538
        L_0x0525:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ i -> 0x055a }
            r0.mo12899p(r15)     // Catch:{ i -> 0x055a }
            b.l.a.c.e.e.nm r4 = r0.f4176a     // Catch:{ i -> 0x055a }
            long r8 = r4.mo12855i()     // Catch:{ i -> 0x055a }
            double r8 = java.lang.Double.longBitsToDouble(r8)     // Catch:{ i -> 0x055a }
            p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3630l(r2, r6, r8)     // Catch:{ i -> 0x055a }
        L_0x0538:
            r1.mo12571w(r2, r5)     // Catch:{ i -> 0x055a }
            goto L_0x0011
        L_0x053d:
            r14 = r4
        L_0x053e:
            boolean r4 = r11.mo12358n(r14, r0)     // Catch:{ i -> 0x055a }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f3808j
        L_0x0546:
            int r3 = r1.f3809k
            if (r0 >= r3) goto L_0x0554
            int[] r3 = r1.f3807i
            r3 = r3[r0]
            r1.mo12564k(r2, r3, r14)
            int r0 = r0 + 1
            goto L_0x0546
        L_0x0554:
            if (r14 == 0) goto L_0x057f
            r11.mo12356l(r2, r14)
            return
        L_0x055a:
            r11.mo12345a(r0)     // Catch:{ all -> 0x00ad }
            if (r14 != 0) goto L_0x0564
            java.lang.Object r4 = r11.mo12355k(r2)     // Catch:{ all -> 0x00ad }
            r14 = r4
        L_0x0564:
            boolean r4 = r11.mo12358n(r14, r0)     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f3808j
        L_0x056c:
            int r3 = r1.f3809k
            if (r0 >= r3) goto L_0x057a
            int[] r3 = r1.f3807i
            r3 = r3[r0]
            r1.mo12564k(r2, r3, r14)
            int r0 = r0 + 1
            goto L_0x056c
        L_0x057a:
            if (r14 == 0) goto L_0x057f
            r11.mo12356l(r2, r14)
        L_0x057f:
            return
        L_0x0580:
            int r3 = r1.f3808j
        L_0x0582:
            int r4 = r1.f3809k
            if (r3 >= r4) goto L_0x0590
            int[] r4 = r1.f3807i
            r4 = r4[r3]
            r1.mo12564k(r2, r4, r14)
            int r3 = r3 + 1
            goto L_0x0582
        L_0x0590:
            if (r14 == 0) goto L_0x0595
            r11.mo12356l(r2, r14)
        L_0x0595:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12560g(java.lang.Object, b.l.a.c.e.e.om, b.l.a.c.e.e.xm):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0323, code lost:
        r12.mo13041d(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0334, code lost:
        r12.mo13040c(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0345, code lost:
        r12.f4358a.mo12938n(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0358, code lost:
        r12.f4358a.mo12936l(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x036b, code lost:
        r12.f4358a.mo12934j(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x037e, code lost:
        r12.f4358a.mo12935k(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x038b, code lost:
        r12.f4358a.mo12941q(r6, (p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, (long) (r4 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a0, code lost:
        r12.mo13042e(r6, p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, (long) (r4 & 1048575)), mo12550P(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b5, code lost:
        m3237C(r6, p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, (long) (r4 & 1048575)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03cc, code lost:
        r12.f4358a.mo12939o(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03df, code lost:
        r12.f4358a.mo12936l(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03f1, code lost:
        r12.f4358a.mo12938n(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0403, code lost:
        r12.f4358a.mo12934j(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0415, code lost:
        r12.f4358a.mo12937m(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0427, code lost:
        r12.f4358a.mo12937m(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0439, code lost:
        r12.mo13038a(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0449, code lost:
        r12.mo13039b(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0308, code lost:
        r12.mo13043f(r6, p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, (long) (r4 & 1048575)), mo12550P(r3));
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12561h(T r11, p005b.p096l.p097a.p113c.p131e.p136e.C2533um r12) {
        /*
            r10 = this;
            boolean r0 = r10.f3806h
            if (r0 == 0) goto L_0x0460
            boolean r0 = r10.f3804f
            r1 = 0
            if (r0 != 0) goto L_0x045a
            int[] r0 = r10.f3799a
            int r0 = r0.length
            r2 = 0
            r3 = r2
        L_0x000e:
            if (r3 >= r0) goto L_0x0450
            int r4 = r10.mo12566m(r3)
            int[] r5 = r10.f3799a
            r6 = r5[r3]
            int r7 = r4 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            r9 = 1048575(0xfffff, float:1.469367E-39)
            switch(r7) {
                case 0: goto L_0x043d;
                case 1: goto L_0x042d;
                case 2: goto L_0x041b;
                case 3: goto L_0x0409;
                case 4: goto L_0x03f7;
                case 5: goto L_0x03e5;
                case 6: goto L_0x03d3;
                case 7: goto L_0x03c0;
                case 8: goto L_0x03af;
                case 9: goto L_0x039a;
                case 10: goto L_0x0385;
                case 11: goto L_0x0372;
                case 12: goto L_0x035f;
                case 13: goto L_0x034c;
                case 14: goto L_0x0339;
                case 15: goto L_0x0328;
                case 16: goto L_0x0317;
                case 17: goto L_0x0302;
                case 18: goto L_0x02f3;
                case 19: goto L_0x02e4;
                case 20: goto L_0x02d5;
                case 21: goto L_0x02c6;
                case 22: goto L_0x02b7;
                case 23: goto L_0x02a8;
                case 24: goto L_0x0299;
                case 25: goto L_0x028a;
                case 26: goto L_0x027b;
                case 27: goto L_0x0268;
                case 28: goto L_0x0259;
                case 29: goto L_0x024a;
                case 30: goto L_0x023b;
                case 31: goto L_0x022c;
                case 32: goto L_0x021d;
                case 33: goto L_0x020e;
                case 34: goto L_0x01ff;
                case 35: goto L_0x01f0;
                case 36: goto L_0x01e1;
                case 37: goto L_0x01d2;
                case 38: goto L_0x01c3;
                case 39: goto L_0x01b4;
                case 40: goto L_0x01a5;
                case 41: goto L_0x0196;
                case 42: goto L_0x0187;
                case 43: goto L_0x0178;
                case 44: goto L_0x0169;
                case 45: goto L_0x015a;
                case 46: goto L_0x014b;
                case 47: goto L_0x013c;
                case 48: goto L_0x012d;
                case 49: goto L_0x011a;
                case 50: goto L_0x0109;
                case 51: goto L_0x00fb;
                case 52: goto L_0x00ed;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d1;
                case 55: goto L_0x00c3;
                case 56: goto L_0x00b5;
                case 57: goto L_0x00a7;
                case 58: goto L_0x0099;
                case 59: goto L_0x0091;
                case 60: goto L_0x0089;
                case 61: goto L_0x0081;
                case 62: goto L_0x0073;
                case 63: goto L_0x0065;
                case 64: goto L_0x0057;
                case 65: goto L_0x0049;
                case 66: goto L_0x003b;
                case 67: goto L_0x002d;
                case 68: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x044c
        L_0x0025:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x0308
        L_0x002d:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m3245r(r11, r4)
            goto L_0x0323
        L_0x003b:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m3244q(r11, r4)
            goto L_0x0334
        L_0x0049:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m3245r(r11, r4)
            goto L_0x0345
        L_0x0057:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m3244q(r11, r4)
            goto L_0x0358
        L_0x0065:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m3244q(r11, r4)
            goto L_0x036b
        L_0x0073:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m3244q(r11, r4)
            goto L_0x037e
        L_0x0081:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x038b
        L_0x0089:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x03a0
        L_0x0091:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x03b5
        L_0x0099:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = m3246s(r11, r4)
            goto L_0x03cc
        L_0x00a7:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m3244q(r11, r4)
            goto L_0x03df
        L_0x00b5:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m3245r(r11, r4)
            goto L_0x03f1
        L_0x00c3:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m3244q(r11, r4)
            goto L_0x0403
        L_0x00d1:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m3245r(r11, r4)
            goto L_0x0415
        L_0x00df:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m3245r(r11, r4)
            goto L_0x0427
        L_0x00ed:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = m3243p(r11, r4)
            goto L_0x0439
        L_0x00fb:
            boolean r5 = r10.mo12572x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = m3242o(r11, r4)
            goto L_0x0449
        L_0x0109:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r4)
            if (r4 != 0) goto L_0x0113
            goto L_0x044c
        L_0x0113:
            java.lang.Object r11 = r10.mo12551Q(r3)
            b.l.a.c.e.e.v r11 = (p005b.p096l.p097a.p113c.p131e.p136e.C2534v) r11
            throw r1
        L_0x011a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.e.e.m0 r6 = r10.mo12550P(r3)
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3899u(r5, r4, r12, r6)
            goto L_0x044c
        L_0x012d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3886h(r5, r4, r12, r8)
            goto L_0x044c
        L_0x013c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3891m(r5, r4, r12, r8)
            goto L_0x044c
        L_0x014b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3888j(r5, r4, r12, r8)
            goto L_0x044c
        L_0x015a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3893o(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0169:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3894p(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0178:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3890l(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0187:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3895q(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0196:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3892n(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01a5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3887i(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01b4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3889k(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01c3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3885g(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01d2:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3884f(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01e1:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3883e(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01f0:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3882d(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01ff:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3886h(r5, r4, r12, r2)
            goto L_0x044c
        L_0x020e:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3891m(r5, r4, r12, r2)
            goto L_0x044c
        L_0x021d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3888j(r5, r4, r12, r2)
            goto L_0x044c
        L_0x022c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3893o(r5, r4, r12, r2)
            goto L_0x044c
        L_0x023b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3894p(r5, r4, r12, r2)
            goto L_0x044c
        L_0x024a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3890l(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0259:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3897s(r5, r4, r12)
            goto L_0x044c
        L_0x0268:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.e.e.m0 r6 = r10.mo12550P(r3)
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3898t(r5, r4, r12, r6)
            goto L_0x044c
        L_0x027b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3896r(r5, r4, r12)
            goto L_0x044c
        L_0x028a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3895q(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0299:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3892n(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02a8:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3887i(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02b7:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3889k(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02c6:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3885g(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02d5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3884f(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02e4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3883e(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02f3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p136e.C2367o0.m3882d(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0302:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x0308:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r4)
            b.l.a.c.e.e.m0 r5 = r10.mo12550P(r3)
            r12.mo13043f(r6, r4, r5)
            goto L_0x044c
        L_0x0317:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r11, r4)
        L_0x0323:
            r12.mo13041d(r6, r4)
            goto L_0x044c
        L_0x0328:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r11, r4)
        L_0x0334:
            r12.mo13040c(r6, r4)
            goto L_0x044c
        L_0x0339:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r11, r4)
        L_0x0345:
            b.l.a.c.e.e.tm r7 = r12.f4358a
            r7.mo12938n(r6, r4)
            goto L_0x044c
        L_0x034c:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r11, r4)
        L_0x0358:
            b.l.a.c.e.e.tm r5 = r12.f4358a
            r5.mo12936l(r6, r4)
            goto L_0x044c
        L_0x035f:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r11, r4)
        L_0x036b:
            b.l.a.c.e.e.tm r5 = r12.f4358a
            r5.mo12934j(r6, r4)
            goto L_0x044c
        L_0x0372:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r11, r4)
        L_0x037e:
            b.l.a.c.e.e.tm r5 = r12.f4358a
            r5.mo12935k(r6, r4)
            goto L_0x044c
        L_0x0385:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x038b:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r4)
            b.l.a.c.e.e.lm r4 = (p005b.p096l.p097a.p113c.p131e.p136e.C2317lm) r4
            b.l.a.c.e.e.tm r5 = r12.f4358a
            r5.mo12941q(r6, r4)
            goto L_0x044c
        L_0x039a:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x03a0:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r4)
            b.l.a.c.e.e.m0 r5 = r10.mo12550P(r3)
            r12.mo13042e(r6, r4, r5)
            goto L_0x044c
        L_0x03af:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x03b5:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3631m(r11, r4)
            m3237C(r6, r4, r12)
            goto L_0x044c
        L_0x03c0:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3627i(r11, r4)
        L_0x03cc:
            b.l.a.c.e.e.tm r5 = r12.f4358a
            r5.mo12939o(r6, r4)
            goto L_0x044c
        L_0x03d3:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r11, r4)
        L_0x03df:
            b.l.a.c.e.e.tm r5 = r12.f4358a
            r5.mo12936l(r6, r4)
            goto L_0x044c
        L_0x03e5:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r11, r4)
        L_0x03f1:
            b.l.a.c.e.e.tm r7 = r12.f4358a
            r7.mo12938n(r6, r4)
            goto L_0x044c
        L_0x03f7:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3624f(r11, r4)
        L_0x0403:
            b.l.a.c.e.e.tm r5 = r12.f4358a
            r5.mo12934j(r6, r4)
            goto L_0x044c
        L_0x0409:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r11, r4)
        L_0x0415:
            b.l.a.c.e.e.tm r7 = r12.f4358a
            r7.mo12937m(r6, r4)
            goto L_0x044c
        L_0x041b:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3625g(r11, r4)
        L_0x0427:
            b.l.a.c.e.e.tm r7 = r12.f4358a
            r7.mo12937m(r6, r4)
            goto L_0x044c
        L_0x042d:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3628j(r11, r4)
        L_0x0439:
            r12.mo13038a(r6, r4)
            goto L_0x044c
        L_0x043d:
            boolean r5 = r10.mo12570v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = p005b.p096l.p097a.p113c.p131e.p136e.C2272k1.m3629k(r11, r4)
        L_0x0449:
            r12.mo13039b(r6, r4)
        L_0x044c:
            int r3 = r3 + 3
            goto L_0x000e
        L_0x0450:
            b.l.a.c.e.e.a1<?, ?> r0 = r10.f3811m
            java.lang.Object r11 = r0.mo12354j(r11)
            r0.mo12362r(r11, r12)
            return
        L_0x045a:
            b.l.a.c.e.e.ym<?> r12 = r10.f3812n
            r12.mo13122b(r11)
            throw r1
        L_0x0460:
            r10.mo12541B(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2122e0.mo12561h(java.lang.Object, b.l.a.c.e.e.um):void");
    }

    /* renamed from: i */
    public final boolean mo12562i(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.f3808j) {
            int i6 = this.f3807i[i4];
            int i7 = this.f3799a[i6];
            int m = mo12566m(i6);
            int i8 = this.f3799a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = f3798q.getInt(t2, (long) i9);
                }
                i = i3;
                i2 = i9;
            } else {
                i2 = i5;
                i = i3;
            }
            if ((268435456 & m) != 0 && !mo12569u(t, i6, i2, i, i10)) {
                return false;
            }
            int i11 = (m >>> 20) & 255;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (mo12572x(t2, i7, i6) && !mo12550P(i6).mo12562i(C2272k1.m3631m(t2, (long) (m & 1048575)))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 == 50 && !((C2558w) C2272k1.m3631m(t2, (long) (m & 1048575))).isEmpty()) {
                            C2534v vVar = (C2534v) mo12551Q(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C2272k1.m3631m(t2, (long) (m & 1048575));
                if (!list.isEmpty()) {
                    C2319m0 P = mo12550P(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!P.mo12562i(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (mo12569u(t, i6, i2, i, i10) && !mo12550P(i6).mo12562i(C2272k1.m3631m(t2, (long) (m & 1048575)))) {
                return false;
            }
            i4++;
            i5 = i2;
            i3 = i;
        }
        if (!this.f3804f) {
            return true;
        }
        this.f3812n.mo13122b(t2);
        throw null;
    }

    /* renamed from: j */
    public final void mo12563j(T t, byte[] bArr, int i, int i2, C2144em emVar) {
        if (this.f3806h) {
            mo12553S(t, bArr, i, i2, emVar);
        } else {
            mo12542E(t, bArr, i, i2, 0, emVar);
        }
    }

    /* renamed from: k */
    public final <UT, UB> Object mo12564k(Object obj, int i, Object obj2) {
        int[] iArr = this.f3799a;
        int i2 = iArr[i];
        Object m = C2272k1.m3631m(obj, (long) (iArr[i + 1] & 1048575));
        if (m == null || mo12552R(i) == null) {
            return obj2;
        }
        C2558w wVar = (C2558w) m;
        C2534v vVar = (C2534v) mo12551Q(i);
        throw null;
    }

    /* renamed from: l */
    public final void mo12565l(Object obj, int i, C2389om omVar) {
        long j;
        Object C;
        if ((536870912 & i) != 0) {
            j = (long) (i & 1048575);
            C = omVar.mo12878B();
        } else {
            int i2 = i & 1048575;
            if (this.f3805g) {
                j = (long) i2;
                C = omVar.mo12877A();
            } else {
                j = (long) i2;
                C = omVar.mo12879C();
            }
        }
        C2272k1.f3995e.mo12732p(obj, j, C);
    }

    /* renamed from: m */
    public final int mo12566m(int i) {
        return this.f3799a[i + 1];
    }

    /* renamed from: n */
    public final int mo12567n(int i) {
        return this.f3799a[i + 2];
    }

    /* renamed from: t */
    public final boolean mo12568t(T t, T t2, int i) {
        return mo12570v(t, i) == mo12570v(t2, i);
    }

    /* renamed from: u */
    public final boolean mo12569u(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? mo12570v(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: v */
    public final boolean mo12570v(T t, int i) {
        int[] iArr = this.f3799a;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j != 1048575) {
            return (C2272k1.m3624f(t, j) & (1 << (i2 >>> 20))) != 0;
        }
        int i3 = iArr[i + 1];
        long j2 = (long) (i3 & 1048575);
        switch ((i3 >>> 20) & 255) {
            case 0:
                return C2272k1.m3629k(t, j2) != ShadowDrawableWrapper.COS_45;
            case 1:
                return C2272k1.m3628j(t, j2) != 0.0f;
            case 2:
                return C2272k1.m3625g(t, j2) != 0;
            case 3:
                return C2272k1.m3625g(t, j2) != 0;
            case 4:
                return C2272k1.m3624f(t, j2) != 0;
            case 5:
                return C2272k1.m3625g(t, j2) != 0;
            case 6:
                return C2272k1.m3624f(t, j2) != 0;
            case 7:
                return C2272k1.m3627i(t, j2);
            case 8:
                Object m = C2272k1.m3631m(t, j2);
                if (m instanceof String) {
                    return !((String) m).isEmpty();
                }
                if (m instanceof C2317lm) {
                    return !C2317lm.f4051h.equals(m);
                }
                throw new IllegalArgumentException();
            case 9:
                return C2272k1.m3631m(t, j2) != null;
            case 10:
                return !C2317lm.f4051h.equals(C2272k1.m3631m(t, j2));
            case 11:
                return C2272k1.m3624f(t, j2) != 0;
            case 12:
                return C2272k1.m3624f(t, j2) != 0;
            case 13:
                return C2272k1.m3624f(t, j2) != 0;
            case 14:
                return C2272k1.m3625g(t, j2) != 0;
            case 15:
                return C2272k1.m3624f(t, j2) != 0;
            case 16:
                return C2272k1.m3625g(t, j2) != 0;
            case 17:
                return C2272k1.m3631m(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: w */
    public final void mo12571w(T t, int i) {
        int i2 = this.f3799a[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            C2272k1.f3995e.mo12728l(t, j, (1 << (i2 >>> 20)) | C2272k1.m3624f(t, j));
        }
    }

    /* renamed from: x */
    public final boolean mo12572x(T t, int i, int i2) {
        return C2272k1.m3624f(t, (long) (this.f3799a[i2 + 2] & 1048575)) == i;
    }

    /* renamed from: y */
    public final void mo12573y(T t, int i, int i2) {
        C2272k1.f3995e.mo12728l(t, (long) (this.f3799a[i2 + 2] & 1048575), i);
    }

    /* renamed from: z */
    public final int mo12574z(int i) {
        if (i < this.f3801c || i > this.f3802d) {
            return -1;
        }
        return mo12540A(i, 0);
    }
}
