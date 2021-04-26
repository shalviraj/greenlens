package p005b.p096l.p097a.p113c.p131e.p140i;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import sun.misc.Unsafe;

/* renamed from: b.l.a.c.e.i.r6 */
public final class C2939r6<T> implements C3043z6<T> {

    /* renamed from: o */
    public static final int[] f4979o = new int[0];

    /* renamed from: p */
    public static final Unsafe f4980p = C3005w7.m5538n();

    /* renamed from: a */
    public final int[] f4981a;

    /* renamed from: b */
    public final Object[] f4982b;

    /* renamed from: c */
    public final int f4983c;

    /* renamed from: d */
    public final int f4984d;

    /* renamed from: e */
    public final C2913p6 f4985e;

    /* renamed from: f */
    public final boolean f4986f;

    /* renamed from: g */
    public final boolean f4987g;

    /* renamed from: h */
    public final int[] f4988h;

    /* renamed from: i */
    public final int f4989i;

    /* renamed from: j */
    public final int f4990j;

    /* renamed from: k */
    public final C2769e6 f4991k;

    /* renamed from: l */
    public final C2875m7<?, ?> f4992l;

    /* renamed from: m */
    public final C2740c5<?> f4993m;

    /* renamed from: n */
    public final C2861l6 f4994n;

    public C2939r6(int[] iArr, Object[] objArr, int i, int i2, C2913p6 p6Var, boolean z, int[] iArr2, int i3, int i4, C2965t6 t6Var, C2769e6 e6Var, C2875m7 m7Var, C2740c5 c5Var, C2861l6 l6Var) {
        this.f4981a = iArr;
        this.f4982b = objArr;
        this.f4983c = i;
        this.f4984d = i2;
        this.f4987g = z;
        this.f4986f = c5Var != null && c5Var.mo13263a(p6Var);
        this.f4988h = iArr2;
        this.f4989i = i3;
        this.f4990j = i4;
        this.f4991k = e6Var;
        this.f4992l = m7Var;
        this.f4993m = c5Var;
        this.f4985e = p6Var;
        this.f4994n = l6Var;
    }

    /* renamed from: B */
    public static <T> C2939r6 m5139B(C2887n6 n6Var, C2965t6 t6Var, C2769e6 e6Var, C2875m7 m7Var, C2740c5 c5Var, C2861l6 l6Var) {
        if (n6Var instanceof C3030y6) {
            return m5140C((C3030y6) n6Var, t6Var, e6Var, m7Var, c5Var, l6Var);
        }
        C2849k7 k7Var = (C2849k7) n6Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0395  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> p005b.p096l.p097a.p113c.p131e.p140i.C2939r6<T> m5140C(p005b.p096l.p097a.p113c.p131e.p140i.C3030y6 r35, p005b.p096l.p097a.p113c.p131e.p140i.C2965t6 r36, p005b.p096l.p097a.p113c.p131e.p140i.C2769e6 r37, p005b.p096l.p097a.p113c.p131e.p140i.C2875m7<?, ?> r38, p005b.p096l.p097a.p113c.p131e.p140i.C2740c5<?> r39, p005b.p096l.p097a.p113c.p131e.p140i.C2861l6 r40) {
        /*
            r0 = r35
            int r1 = r0.f5173d
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
            java.lang.String r1 = r0.f5171b
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
            int[] r7 = f4979o
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
            sun.misc.Unsafe r8 = f4980p
            java.lang.Object[] r2 = r0.f5172c
            b.l.a.c.e.i.p6 r6 = r0.f5170a
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
            java.lang.reflect.Field r0 = m5141D(r6, r0)
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
            java.lang.reflect.Field r4 = m5141D(r6, r4)
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
            java.lang.reflect.Field r4 = m5141D(r6, r4)
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
            java.lang.reflect.Field r5 = m5141D(r14, r5)
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
            b.l.a.c.e.i.r6 r0 = new b.l.a.c.e.i.r6
            r1 = r35
            b.l.a.c.e.i.p6 r10 = r1.f5170a
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
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.m5140C(b.l.a.c.e.i.y6, b.l.a.c.e.i.t6, b.l.a.c.e.i.e6, b.l.a.c.e.i.m7, b.l.a.c.e.i.c5, b.l.a.c.e.i.l6):b.l.a.c.e.i.r6");
    }

    /* renamed from: D */
    public static Field m5141D(Class<?> cls, String str) {
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

    /* renamed from: l */
    public static <T> double m5142l(T t, long j) {
        return ((Double) C3005w7.m5537m(t, j)).doubleValue();
    }

    /* renamed from: m */
    public static <T> float m5143m(T t, long j) {
        return ((Float) C3005w7.m5537m(t, j)).floatValue();
    }

    /* renamed from: n */
    public static <T> int m5144n(T t, long j) {
        return ((Integer) C3005w7.m5537m(t, j)).intValue();
    }

    /* renamed from: o */
    public static <T> long m5145o(T t, long j) {
        return ((Long) C3005w7.m5537m(t, j)).longValue();
    }

    /* renamed from: p */
    public static <T> boolean m5146p(T t, long j) {
        return ((Boolean) C3005w7.m5537m(t, j)).booleanValue();
    }

    /* renamed from: y */
    public static final void m5147y(int i, Object obj, C3015x4 x4Var) {
        if (obj instanceof String) {
            x4Var.f5136a.mo13777k(i, (String) obj);
            return;
        }
        x4Var.f5136a.mo13778l(i, (C2937r4) obj);
    }

    /* renamed from: z */
    public static C2888n7 m5148z(Object obj) {
        C2899o5 o5Var = (C2899o5) obj;
        C2888n7 n7Var = o5Var.zzc;
        if (n7Var != C2888n7.f4905f) {
            return n7Var;
        }
        C2888n7 a = C2888n7.m4996a();
        o5Var.zzc = a;
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c0, code lost:
        r12 = r36;
        r16 = r5;
        r3 = r7;
        r2 = r22;
        r5 = r35;
        r7 = r1;
        r1 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ce, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02e5, code lost:
        r5 = r35;
        r12 = r0;
        r0 = r8;
        r8 = r6;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ed, code lost:
        r18 = r35;
        r2 = r3;
        r9 = r6;
        r27 = r7;
        r30 = r11;
        r7 = r12;
        r6 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0398, code lost:
        if (r0 != r15) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03e5, code lost:
        if (r0 != r15) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03e7, code lost:
        r15 = r32;
        r14 = r33;
        r4 = r34;
        r6 = r36;
        r12 = r6;
        r1 = r37;
        r13 = r38;
        r5 = r18;
        r2 = r22;
        r16 = r25;
        r7 = r26;
        r3 = r27;
        r11 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0153, code lost:
        r11.putInt(r14, r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016b, code lost:
        r1 = r13.f4868c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0195, code lost:
        r11.putObject(r14, r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0198, code lost:
        r8 = r0;
        r0 = r12 | r25;
        r1 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0206, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0230, code lost:
        r6 = r2;
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x024e, code lost:
        r1 = r12 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x026c, code lost:
        r0.putLong(r1, r9, r17);
        r0 = r12 | r25;
        r1 = r6;
        r4 = r4;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x027b, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x027c, code lost:
        r6 = r10;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v7, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13615A(T r33, byte[] r34, int r35, int r36, int r37, p005b.p096l.p097a.p113c.p131e.p140i.C2846k4 r38) {
        /*
            r32 = this;
            r15 = r32
            r14 = r33
            r12 = r36
            r13 = r38
            sun.misc.Unsafe r11 = f4980p
            r4 = r34
            r0 = r35
            r1 = r37
            r6 = r12
            r2 = -1
            r3 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
            r16 = 0
        L_0x0019:
            r17 = 0
            if (r0 >= r6) goto L_0x0480
            int r9 = r0 + 1
            byte r0 = r4[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2875z1(r0, r4, r9, r13)
            int r9 = r13.f4866a
            r31 = r9
            r9 = r0
            r0 = r31
        L_0x002e:
            int r10 = r0 >>> 3
            r8 = r0 & 7
            r35 = r0
            r0 = 3
            if (r10 <= r2) goto L_0x0049
            int r3 = r3 / r0
            int r2 = r15.f4983c
            if (r10 < r2) goto L_0x0045
            int r2 = r15.f4984d
            if (r10 > r2) goto L_0x0045
            int r2 = r15.mo13644w(r10, r3)
            goto L_0x0046
        L_0x0045:
            r2 = -1
        L_0x0046:
            r3 = r2
            r2 = 0
            goto L_0x0059
        L_0x0049:
            int r2 = r15.f4983c
            if (r10 < r2) goto L_0x0057
            int r2 = r15.f4984d
            if (r10 > r2) goto L_0x0057
            r2 = 0
            int r3 = r15.mo13644w(r10, r2)
            goto L_0x0059
        L_0x0057:
            r2 = 0
            r3 = -1
        L_0x0059:
            r12 = -1
            if (r3 != r12) goto L_0x006e
            r6 = r1
            r20 = r2
            r27 = r20
            r18 = r5
            r2 = r9
            r22 = r10
            r30 = r11
            r19 = r12
            r9 = r35
            goto L_0x0409
        L_0x006e:
            int[] r1 = r15.f4981a
            int r16 = r3 + 1
            r12 = r1[r16]
            int r2 = r12 >>> 20
            r2 = r2 & 255(0xff, float:3.57E-43)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r12 & r16
            r16 = r9
            r22 = r10
            long r9 = (long) r0
            r0 = 17
            r23 = r12
            if (r2 > r0) goto L_0x02fc
            int r0 = r3 + 2
            r0 = r1[r0]
            int r1 = r0 >>> 20
            r12 = 1
            int r25 = r12 << r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            if (r0 == r5) goto L_0x00a5
            if (r5 == r1) goto L_0x009d
            long r12 = (long) r5
            r11.putInt(r14, r12, r7)
        L_0x009d:
            long r12 = (long) r0
            int r7 = r11.getInt(r14, r12)
            r12 = r7
            r7 = r0
            goto L_0x00a7
        L_0x00a5:
            r12 = r7
            r7 = r5
        L_0x00a7:
            r0 = 5
            switch(r2) {
                case 0: goto L_0x02a0;
                case 1: goto L_0x027f;
                case 2: goto L_0x0252;
                case 3: goto L_0x0252;
                case 4: goto L_0x0236;
                case 5: goto L_0x0208;
                case 6: goto L_0x01ee;
                case 7: goto L_0x01c5;
                case 8: goto L_0x01a0;
                case 9: goto L_0x016e;
                case 10: goto L_0x0157;
                case 11: goto L_0x0236;
                case 12: goto L_0x0120;
                case 13: goto L_0x01ee;
                case 14: goto L_0x0208;
                case 15: goto L_0x0106;
                case 16: goto L_0x00d7;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r5 = r35
            r13 = r38
            r35 = r7
            r0 = 3
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = r1
            if (r8 != r0) goto L_0x02ce
            b.l.a.c.e.i.z6 r0 = r15.mo13623L(r7)
            int r1 = r22 << 3
            r4 = r1 | 4
            r1 = r34
            r2 = r3
            r3 = r36
            r6 = r5
            r5 = r38
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2860v2(r0, r1, r2, r3, r4, r5)
            r1 = r12 & r25
            if (r1 != 0) goto L_0x02d0
            java.lang.Object r1 = r13.f4868c
            goto L_0x02da
        L_0x00d7:
            if (r8 != 0) goto L_0x00f6
            r13 = r38
            r5 = r16
            int r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r4, r5, r13)
            long r1 = r13.f4867b
            long r17 = p005b.p096l.p097a.p113c.p131e.p140i.C2950s4.m5212b(r1)
            r5 = r35
            r0 = r11
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r33
            r35 = r7
            r20 = 0
            r7 = r3
            goto L_0x026c
        L_0x00f6:
            r10 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r20 = 0
            r16 = r1
            r7 = r3
            r3 = r5
            goto L_0x027c
        L_0x0106:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != 0) goto L_0x0230
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r4, r5, r13)
            int r1 = r13.f4866a
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2950s4.m5211a(r1)
            goto L_0x0153
        L_0x0120:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != 0) goto L_0x0230
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r4, r5, r13)
            int r1 = r13.f4866a
            b.l.a.c.e.i.r5 r3 = r15.mo13625N(r7)
            if (r3 == 0) goto L_0x0153
            boolean r3 = r3.mo13360a(r1)
            if (r3 == 0) goto L_0x0142
            goto L_0x0153
        L_0x0142:
            b.l.a.c.e.i.n7 r3 = m5148z(r33)
            long r8 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r3.mo13520c(r2, r1)
            r5 = r35
            r8 = r2
            goto L_0x0345
        L_0x0153:
            r11.putInt(r14, r9, r1)
            goto L_0x0198
        L_0x0157:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != r0) goto L_0x0230
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2844r2(r4, r5, r13)
        L_0x016b:
            java.lang.Object r1 = r13.f4868c
            goto L_0x0195
        L_0x016e:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != r0) goto L_0x0230
            b.l.a.c.e.i.z6 r0 = r15.mo13623L(r7)
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2852t2(r0, r4, r5, r6, r13)
            r1 = r12 & r25
            if (r1 != 0) goto L_0x018b
            goto L_0x016b
        L_0x018b:
            java.lang.Object r1 = r11.getObject(r14, r9)
            java.lang.Object r3 = r13.f4868c
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.m5406c(r1, r3)
        L_0x0195:
            r11.putObject(r14, r9, r1)
        L_0x0198:
            r1 = r12 | r25
            r8 = r0
            r0 = r1
            r1 = r6
            r6 = r2
            goto L_0x02e5
        L_0x01a0:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != r0) goto L_0x0230
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x01bb
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2824m2(r4, r5, r13)
            goto L_0x01bf
        L_0x01bb:
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2832o2(r4, r5, r13)
        L_0x01bf:
            java.lang.Object r1 = r13.f4868c
            r11.putObject(r14, r9, r1)
            goto L_0x0206
        L_0x01c5:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != 0) goto L_0x0230
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r4, r5, r13)
            r3 = r0
            long r0 = r13.f4867b
            r23 = 0
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x01e3
            r0 = 1
            goto L_0x01e5
        L_0x01e3:
            r0 = r20
        L_0x01e5:
            b.l.a.c.e.i.v7 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r1.mo13750c(r14, r9, r0)
            r5 = r2
            r0 = r3
            goto L_0x024e
        L_0x01ee:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != r0) goto L_0x0230
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r4, r5)
            r11.putInt(r14, r9, r0)
            int r0 = r5 + 4
        L_0x0206:
            r5 = r2
            goto L_0x024e
        L_0x0208:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 1
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != r0) goto L_0x0230
            long r17 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r4, r5)
            r0 = r11
            r1 = r33
            r8 = r2
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r10 + 8
            r1 = r12 | r25
            r5 = r8
            r4 = r9
            goto L_0x02c0
        L_0x0230:
            r8 = r2
            r10 = r5
            r6 = r8
            r3 = r10
            goto L_0x02ed
        L_0x0236:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = r1
            if (r8 != 0) goto L_0x027b
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r4, r3, r13)
            int r1 = r13.f4866a
            r11.putInt(r14, r9, r1)
        L_0x024e:
            r1 = r12 | r25
            goto L_0x02c0
        L_0x0252:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = r1
            if (r8 != 0) goto L_0x027b
            int r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r4, r3, r13)
            long r2 = r13.f4867b
            r0 = r11
            r1 = r33
            r17 = r2
        L_0x026c:
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r0 = r12 | r25
            r1 = r6
            r4 = r9
            r6 = r10
            goto L_0x02e5
        L_0x027b:
            r10 = r5
        L_0x027c:
            r6 = r10
            goto L_0x02ed
        L_0x027f:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = r1
            r1 = r4
            if (r8 != r0) goto L_0x02ce
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r1, r3)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            b.l.a.c.e.i.v7 r2 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r2.mo13752e(r14, r9, r0)
            int r0 = r3 + 4
            r4 = r1
            goto L_0x024e
        L_0x02a0:
            r5 = r35
            r13 = r38
            r35 = r7
            r0 = 1
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = r1
            r1 = r4
            if (r8 != r0) goto L_0x02ce
            long r17 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r1, r3)
            r4 = r1
            double r0 = java.lang.Double.longBitsToDouble(r17)
            p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5536l(r14, r9, r0)
            int r0 = r3 + 8
            goto L_0x024e
        L_0x02c0:
            r12 = r36
            r16 = r5
            r3 = r7
            r2 = r22
            r5 = r35
            r7 = r1
            r1 = r37
            goto L_0x0019
        L_0x02ce:
            r6 = r5
            goto L_0x02ed
        L_0x02d0:
            java.lang.Object r1 = r11.getObject(r14, r9)
            java.lang.Object r2 = r13.f4868c
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.m5406c(r1, r2)
        L_0x02da:
            r11.putObject(r14, r9, r1)
            r1 = r12 | r25
            r4 = r34
            r8 = r0
            r0 = r1
            r1 = r36
        L_0x02e5:
            r5 = r35
            r12 = r0
            r0 = r8
            r8 = r6
            r6 = r1
            goto L_0x0345
        L_0x02ed:
            r18 = r35
            r2 = r3
            r9 = r6
            r27 = r7
            r30 = r11
            r7 = r12
            r19 = -1
            r6 = r37
            goto L_0x0409
        L_0x02fc:
            r6 = r35
            r12 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r2 != r0) goto L_0x0360
            r0 = 2
            if (r8 != r0) goto L_0x0351
            java.lang.Object r0 = r11.getObject(r14, r9)
            b.l.a.c.e.i.u5 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2977u5) r0
            boolean r1 = r0.mo13385a()
            if (r1 != 0) goto L_0x032b
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0323
            r1 = 10
            goto L_0x0324
        L_0x0323:
            int r1 = r1 + r1
        L_0x0324:
            b.l.a.c.e.i.u5 r0 = r0.mo13230h(r1)
            r11.putObject(r14, r9, r0)
        L_0x032b:
            r8 = r0
            b.l.a.c.e.i.z6 r0 = r15.mo13623L(r7)
            r1 = r6
            r2 = r34
            r4 = r36
            r18 = r5
            r5 = r8
            r8 = r6
            r6 = r38
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2698B2(r0, r1, r2, r3, r4, r5, r6)
            r4 = r34
            r6 = r36
            r5 = r18
        L_0x0345:
            r1 = r37
            r3 = r7
            r16 = r8
            r7 = r12
            r2 = r22
            r12 = r36
            goto L_0x0019
        L_0x0351:
            r18 = r5
            r15 = r3
            r25 = r6
            r27 = r7
            r30 = r11
            r26 = r12
            r19 = -1
            goto L_0x03b8
        L_0x0360:
            r18 = r5
            r0 = 49
            if (r2 > r0) goto L_0x039e
            r5 = r23
            long r4 = (long) r5
            r0 = r32
            r1 = r33
            r35 = r2
            r2 = r34
            r21 = r3
            r23 = r4
            r4 = r36
            r5 = r6
            r25 = r6
            r6 = r22
            r27 = r7
            r26 = r12
            r7 = r8
            r8 = r27
            r28 = r9
            r12 = r21
            r19 = -1
            r9 = r23
            r30 = r11
            r11 = r35
            r15 = r12
            r12 = r28
            r14 = r38
            int r0 = r0.mo13620I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x039b
            goto L_0x03e7
        L_0x039b:
            r9 = r0
            goto L_0x0402
        L_0x039e:
            r35 = r2
            r15 = r3
            r25 = r6
            r27 = r7
            r28 = r9
            r30 = r11
            r26 = r12
            r5 = r23
            r19 = -1
            r0 = 50
            r9 = r35
            if (r9 != r0) goto L_0x03cb
            r0 = 2
            if (r8 == r0) goto L_0x03ba
        L_0x03b8:
            r9 = r15
            goto L_0x0402
        L_0x03ba:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r5 = r27
            r6 = r28
            r0.mo13621J(r1, r2, r3, r4, r5, r6)
            throw r17
        L_0x03cb:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r10 = r5
            r5 = r25
            r6 = r22
            r7 = r8
            r8 = r10
            r10 = r28
            r12 = r27
            r13 = r38
            int r0 = r0.mo13622K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x039b
        L_0x03e7:
            r15 = r32
            r14 = r33
            r4 = r34
            r6 = r36
            r12 = r6
            r1 = r37
            r13 = r38
            r5 = r18
            r2 = r22
            r16 = r25
            r7 = r26
            r3 = r27
            r11 = r30
            goto L_0x0019
        L_0x0402:
            r6 = r37
            r2 = r9
            r9 = r25
            r7 = r26
        L_0x0409:
            if (r9 != r6) goto L_0x0417
            if (r6 == 0) goto L_0x0417
            r8 = r32
            r12 = r33
            r0 = r2
            r1 = r6
            r5 = r18
            goto L_0x048a
        L_0x0417:
            r8 = r32
            boolean r0 = r8.f4986f
            if (r0 == 0) goto L_0x0457
            r10 = r38
            b.l.a.c.e.i.b5 r0 = r10.f4869d
            b.l.a.c.e.i.b5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2726b5.m4589a()
            if (r0 == r1) goto L_0x0454
            b.l.a.c.e.i.p6 r0 = r8.f4985e
            b.l.a.c.e.i.b5 r1 = r10.f4869d
            java.util.Map<b.l.a.c.e.i.a5, b.l.a.c.e.i.n5<?, ?>> r1 = r1.f4644a
            b.l.a.c.e.i.a5 r3 = new b.l.a.c.e.i.a5
            r11 = r22
            r3.<init>(r0, r11)
            java.lang.Object r0 = r1.get(r3)
            b.l.a.c.e.i.n5 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2886n5) r0
            if (r0 != 0) goto L_0x044e
            b.l.a.c.e.i.n7 r4 = m5148z(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2706D2(r0, r1, r2, r3, r4, r5)
            r12 = r33
            goto L_0x046c
        L_0x044e:
            r12 = r33
            r0 = r12
            b.l.a.c.e.i.m5 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2873m5) r0
            throw r17
        L_0x0454:
            r12 = r33
            goto L_0x045b
        L_0x0457:
            r12 = r33
            r10 = r38
        L_0x045b:
            r11 = r22
            b.l.a.c.e.i.n7 r4 = m5148z(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2706D2(r0, r1, r2, r3, r4, r5)
        L_0x046c:
            r4 = r34
            r1 = r6
            r15 = r8
            r16 = r9
            r13 = r10
            r2 = r11
            r14 = r12
            r5 = r18
            r3 = r27
            r11 = r30
            r6 = r36
            r12 = r6
            goto L_0x0019
        L_0x0480:
            r18 = r5
            r26 = r7
            r30 = r11
            r12 = r14
            r8 = r15
            r9 = r16
        L_0x048a:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x0495
            long r3 = (long) r5
            r5 = r30
            r5.putInt(r12, r3, r7)
        L_0x0495:
            int r3 = r8.f4989i
        L_0x0497:
            int r4 = r8.f4990j
            if (r3 >= r4) goto L_0x04c2
            int[] r4 = r8.f4988h
            r4 = r4[r3]
            int[] r5 = r8.f4981a
            r5 = r5[r4]
            int r5 = r8.mo13636j(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r12, r5)
            if (r5 != 0) goto L_0x04b0
            goto L_0x04b6
        L_0x04b0:
            b.l.a.c.e.i.r5 r6 = r8.mo13625N(r4)
            if (r6 != 0) goto L_0x04b9
        L_0x04b6:
            int r3 = r3 + 1
            goto L_0x0497
        L_0x04b9:
            b.l.a.c.e.i.k6 r5 = (p005b.p096l.p097a.p113c.p131e.p140i.C2848k6) r5
            java.lang.Object r0 = r8.mo13624M(r4)
            b.l.a.c.e.i.j6 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2835j6) r0
            throw r17
        L_0x04c2:
            r2 = r36
            if (r1 != 0) goto L_0x04ce
            if (r0 != r2) goto L_0x04c9
            goto L_0x04d2
        L_0x04c9:
            b.l.a.c.e.i.x5 r0 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5684c()
            throw r0
        L_0x04ce:
            if (r0 > r2) goto L_0x04d3
            if (r9 != r1) goto L_0x04d3
        L_0x04d2:
            return r0
        L_0x04d3:
            b.l.a.c.e.i.x5 r0 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5684c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.mo13615A(java.lang.Object, byte[], int, int, int, b.l.a.c.e.i.k4):int");
    }

    /* renamed from: E */
    public final void mo13616E(T t, T t2, int i) {
        long j = (long) (this.f4981a[i + 1] & 1048575);
        if (mo13640s(t2, i)) {
            Object m = C3005w7.m5537m(t, j);
            Object m2 = C3005w7.m5537m(t2, j);
            if (m != null && m2 != null) {
                C3005w7.f5113e.mo13804p(t, j, C2990v5.m5406c(m, m2));
                mo13641t(t, i);
            } else if (m2 != null) {
                C3005w7.f5113e.mo13804p(t, j, m2);
                mo13641t(t, i);
            }
        }
    }

    /* renamed from: F */
    public final void mo13617F(T t, T t2, int i) {
        int[] iArr = this.f4981a;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j = (long) (i2 & 1048575);
        if (mo13642u(t2, i3, i)) {
            Object m = mo13642u(t, i3, i) ? C3005w7.m5537m(t, j) : null;
            Object m2 = C3005w7.m5537m(t2, j);
            if (m != null && m2 != null) {
                C3005w7.f5113e.mo13804p(t, j, C2990v5.m5406c(m, m2));
                mo13643v(t, i3, i);
            } else if (m2 != null) {
                C3005w7.f5113e.mo13804p(t, j, m2);
                mo13643v(t, i3, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0325, code lost:
        r1 = r1 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x035c, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0389, code lost:
        r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8 << 3);
        r1 = ((p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) r1).mo13567l();
        r4 = ((p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1) + r1) + r6) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03b6, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03c6, code lost:
        r1 = r0.getInt(r15, r12);
        r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8 << 3);
        r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5505t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03d4, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03df, code lost:
        r6 = r0.getLong(r15, r12);
        r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8 << 3);
        r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5507v(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03ed, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03f3, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03f9, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0400, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0406, code lost:
        r1 = r1 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0409, code lost:
        r3 = r3 + 3;
        r1 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e1, code lost:
        r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8 << 3);
        r1 = ((p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) r1).mo13567l();
        r7 = (p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1) + r1) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0125, code lost:
        r1 = m5144n(r15, r12);
        r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8 << 3);
        r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5505t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0142, code lost:
        r6 = m5145o(r15, r12);
        r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8 << 3);
        r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5507v(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0166, code lost:
        r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0248, code lost:
        r7 = (p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1) + p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5504s(r8)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0252, code lost:
        r4 = r4 + r7;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13618G(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f4980p
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x000c:
            int[] r6 = r14.f4981a
            int r6 = r6.length
            if (r3 >= r6) goto L_0x0410
            int r6 = r14.mo13636j(r3)
            int[] r7 = r14.f4981a
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
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.e.i.p6 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2913p6) r1
            b.l.a.c.e.i.z6 r6 = r14.mo13623L(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5503c(r8, r1, r6)
            goto L_0x0408
        L_0x0056:
            boolean r6 = r14.mo13642u(r15, r8, r3)
            if (r6 == 0) goto L_0x0409
            long r6 = m5145o(r15, r12)
            int r8 = r8 << 3
            int r8 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5507v(r6)
            goto L_0x0325
        L_0x0070:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            int r1 = m5144n(r15, r12)
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            goto L_0x00ae
        L_0x0086:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0166
        L_0x008e:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0158
        L_0x0096:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0125
        L_0x009e:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            int r1 = m5144n(r15, r12)
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r6)
        L_0x00ae:
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
            goto L_0x03d4
        L_0x00b4:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto L_0x00e1
        L_0x00bf:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.e.i.z6 r6 = r14.mo13623L(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4608O(r8, r1, r6)
            goto L_0x0408
        L_0x00d3:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2937r4
            if (r6 == 0) goto L_0x00f5
        L_0x00e1:
            b.l.a.c.e.i.r4 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) r1
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r6)
            int r1 = r1.mo13567l()
            int r7 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x0252
        L_0x00f5:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r6)
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5508w(r1)
            goto L_0x03d4
        L_0x0103:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
            goto L_0x03b6
        L_0x0111:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0158
        L_0x0118:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0166
        L_0x011f:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0125:
            int r1 = m5144n(r15, r12)
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r6)
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5505t(r1)
            goto L_0x03d4
        L_0x0135:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0142
        L_0x013c:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0142:
            long r6 = m5145o(r15, r12)
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5507v(r6)
            goto L_0x03ed
        L_0x0152:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0158:
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
            goto L_0x03f9
        L_0x0160:
            boolean r1 = r14.mo13642u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0166:
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
            goto L_0x0406
        L_0x016e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.mo13624M(r3)
            p005b.p096l.p097a.p113c.p131e.p140i.C2861l6.m4939a(r8, r1, r6)
            goto L_0x0409
        L_0x017b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            b.l.a.c.e.i.z6 r6 = r14.mo13623L(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4611R(r8, r1, r6)
            goto L_0x0408
        L_0x018b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4636y(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0199:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4600G(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01a7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4604K(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01b5:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4602I(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01c3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4594A(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01d1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4598E(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01df:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            java.lang.Class<?> r6 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.f4645a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01ee:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4602I(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01fb:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4604K(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0208:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4596C(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0215:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4634w(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0222:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4632u(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x022f:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4602I(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x023c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4604K(r1)
            if (r1 <= 0) goto L_0x0409
        L_0x0248:
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5504s(r8)
            int r7 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
            int r7 = r7 + r6
            int r7 = r7 + r1
        L_0x0252:
            int r4 = r4 + r7
            goto L_0x0409
        L_0x0255:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4637z(r8, r1, r6)
            goto L_0x0408
        L_0x0262:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4601H(r8, r6, r1)
            goto L_0x0408
        L_0x026f:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4595B(r8, r6, r1)
            goto L_0x0408
        L_0x027c:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4599F(r8, r6, r1)
            goto L_0x0408
        L_0x0289:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4610Q(r8, r1)
            goto L_0x0408
        L_0x0295:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            b.l.a.c.e.i.z6 r6 = r14.mo13623L(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4609P(r8, r1, r6)
            goto L_0x0408
        L_0x02a5:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4607N(r8, r1)
            goto L_0x0408
        L_0x02b1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4606M(r8, r1)
            goto L_0x0408
        L_0x02bd:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4597D(r8, r1, r6)
            goto L_0x0408
        L_0x02ca:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4635x(r8, r6, r1)
            goto L_0x0408
        L_0x02d7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4633v(r8, r1)
            goto L_0x0408
        L_0x02e3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4603J(r8, r1)
            goto L_0x0408
        L_0x02ef:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4605L(r8, r1)
            goto L_0x0408
        L_0x02fb:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.e.i.p6 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2913p6) r1
            b.l.a.c.e.i.z6 r6 = r14.mo13623L(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5503c(r8, r1, r6)
            goto L_0x0408
        L_0x030f:
            r6 = r7 & r5
            if (r6 == 0) goto L_0x0409
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5507v(r6)
        L_0x0325:
            int r1 = r1 + r8
            goto L_0x0408
        L_0x0328:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r6)
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
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r6)
        L_0x035c:
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
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
            b.l.a.c.e.i.z6 r6 = r14.mo13623L(r3)
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4608O(r8, r1, r6)
            goto L_0x0408
        L_0x037d:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2937r4
            if (r6 == 0) goto L_0x039f
        L_0x0389:
            b.l.a.c.e.i.r4 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) r1
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r6)
            int r1 = r1.mo13567l()
            int r7 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            int r7 = r7 + r4
            r4 = r7
            goto L_0x0409
        L_0x039f:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r6)
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5508w(r1)
            goto L_0x03d4
        L_0x03ac:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
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
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r6)
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5505t(r1)
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
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5507v(r6)
        L_0x03ed:
            int r1 = r1 + r6
            goto L_0x0408
        L_0x03ef:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
        L_0x03f3:
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
        L_0x03f9:
            int r1 = r1 + 4
            goto L_0x0408
        L_0x03fc:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
        L_0x0400:
            int r1 = r8 << 3
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r1)
        L_0x0406:
            int r1 = r1 + 8
        L_0x0408:
            int r4 = r4 + r1
        L_0x0409:
            int r3 = r3 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x0410:
            b.l.a.c.e.i.m7<?, ?> r0 = r14.f4992l
            java.lang.Object r1 = r0.mo13494d(r15)
            int r0 = r0.mo13498h(r1)
            int r0 = r0 + r4
            boolean r1 = r14.f4986f
            if (r1 != 0) goto L_0x0420
            return r0
        L_0x0420:
            b.l.a.c.e.i.c5<?> r0 = r14.f4993m
            r0.mo13264b(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.mo13618G(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0282, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5507v((r5 >> 63) ^ (r5 + r5)) + p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x029e, code lost:
        r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r7 << 3);
        r4 = (r4 >> 31) ^ (r4 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02cc, code lost:
        r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02d2, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02de, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e9, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4608O(r7, p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8), mo13623L(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0303, code lost:
        if ((r4 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) != false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0305, code lost:
        r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r7 << 3);
        r4 = ((p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) r4).mo13567l();
        r6 = (p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r4) + r4) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0317, code lost:
        r3 = r3 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x031a, code lost:
        r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r7 << 3);
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5508w((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x032d, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r7 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034a, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x034e, code lost:
        r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r7 << 3);
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5505t(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0358, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0367, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x036b, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5507v(r4) + p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x037d, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r7 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x038c, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r7 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0394, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0395, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        if ((r4 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) != false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b3, code lost:
        r4 = m5144n(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        r4 = m5145o(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r6 = (p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r4) + p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5504s(r7)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0268, code lost:
        r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5503c(r7, (p005b.p096l.p097a.p113c.p131e.p140i.C2913p6) p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8), mo13623L(r2));
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13619H(T r11) {
        /*
            r10 = this;
            sun.misc.Unsafe r0 = f4980p
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r10.f4981a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0399
            int r4 = r10.mo13636j(r2)
            int r5 = r4 >>> 20
            r5 = r5 & 255(0xff, float:3.57E-43)
            int[] r6 = r10.f4981a
            r7 = r6[r2]
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r8
            long r8 = (long) r4
            b.l.a.c.e.i.h5 r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2808h5.DOUBLE_LIST_PACKED
            int r4 = r4.f4814g
            if (r5 < r4) goto L_0x002b
            b.l.a.c.e.i.h5 r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2808h5.SINT64_LIST_PACKED
            int r4 = r4.f4814g
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
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x0268
        L_0x003a:
            boolean r5 = r10.mo13642u(r11, r7, r2)
            if (r5 == 0) goto L_0x0395
            long r5 = m5145o(r11, r8)
            goto L_0x0282
        L_0x0046:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = m5144n(r11, r8)
            goto L_0x029e
        L_0x0052:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x005a:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x0062:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x00b3
        L_0x0069:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = m5144n(r11, r8)
            goto L_0x02cc
        L_0x0075:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x02de
        L_0x007d:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x02e9
        L_0x0085:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            boolean r5 = r4 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2937r4
            if (r5 == 0) goto L_0x031a
            goto L_0x0305
        L_0x0095:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x032d
        L_0x009d:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x00a5:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x00ad:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
        L_0x00b3:
            int r4 = m5144n(r11, r8)
            goto L_0x034e
        L_0x00b9:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x00c6
        L_0x00c0:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
        L_0x00c6:
            long r4 = m5145o(r11, r8)
            goto L_0x036b
        L_0x00cc:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x00d4:
            boolean r4 = r10.mo13642u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x00dc:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.lang.Object r5 = r10.mo13624M(r2)
            p005b.p096l.p097a.p113c.p131e.p140i.C2861l6.m4939a(r7, r4, r5)
            goto L_0x0395
        L_0x00e9:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.e.i.z6 r5 = r10.mo13623L(r2)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4611R(r7, r4, r5)
            goto L_0x0394
        L_0x00f9:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4636y(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0107:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4600G(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0115:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4604K(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0123:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4602I(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0131:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4594A(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x013f:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4598E(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x014d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<?> r5 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.f4645a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x015c:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4602I(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0169:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4604K(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0176:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4596C(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0183:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4634w(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0190:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4632u(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x019d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4602I(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x01aa:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4604K(r4)
            if (r4 <= 0) goto L_0x0395
        L_0x01b6:
            int r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5504s(r7)
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r4)
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x0317
        L_0x01c2:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4637z(r7, r4, r1)
            goto L_0x0394
        L_0x01ce:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4601H(r7, r4, r1)
            goto L_0x0394
        L_0x01da:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4595B(r7, r4, r1)
            goto L_0x0394
        L_0x01e6:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4599F(r7, r4, r1)
            goto L_0x0394
        L_0x01f2:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4610Q(r7, r4)
            goto L_0x0394
        L_0x01fe:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.e.i.z6 r5 = r10.mo13623L(r2)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4609P(r7, r4, r5)
            goto L_0x0394
        L_0x020e:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4607N(r7, r4)
            goto L_0x0394
        L_0x021a:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4606M(r7, r4)
            goto L_0x0394
        L_0x0226:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4597D(r7, r4, r1)
            goto L_0x0394
        L_0x0232:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4635x(r7, r4, r1)
            goto L_0x0394
        L_0x023e:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4633v(r7, r4)
            goto L_0x0394
        L_0x024a:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4603J(r7, r4)
            goto L_0x0394
        L_0x0256:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4605L(r7, r4)
            goto L_0x0394
        L_0x0262:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x0268:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            b.l.a.c.e.i.p6 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2913p6) r4
            b.l.a.c.e.i.z6 r5 = r10.mo13623L(r2)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5503c(r7, r4, r5)
            goto L_0x0394
        L_0x0278:
            boolean r5 = r10.mo13640s(r11, r2)
            if (r5 == 0) goto L_0x0395
            long r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r11, r8)
        L_0x0282:
            int r7 = r7 << 3
            int r7 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r7)
            long r8 = r5 + r5
            long r4 = r5 >> r4
            long r4 = r4 ^ r8
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5507v(r4)
            int r4 = r4 + r7
            goto L_0x0394
        L_0x0294:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r11, r8)
        L_0x029e:
            int r5 = r7 << 3
            int r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L_0x02d2
        L_0x02aa:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x02b2:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x02ba:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x034a
        L_0x02c2:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r11, r8)
        L_0x02cc:
            int r5 = r7 << 3
            int r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r5)
        L_0x02d2:
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r4)
            goto L_0x0358
        L_0x02d8:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x02de:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            goto L_0x0305
        L_0x02e3:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x02e9:
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            b.l.a.c.e.i.z6 r5 = r10.mo13623L(r2)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4608O(r7, r4, r5)
            goto L_0x0394
        L_0x02f7:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r8)
            boolean r5 = r4 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2937r4
            if (r5 == 0) goto L_0x031a
        L_0x0305:
            b.l.a.c.e.i.r4 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) r4
            int r5 = r7 << 3
            int r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r5)
            int r4 = r4.mo13567l()
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r4)
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x0317:
            int r3 = r3 + r6
            goto L_0x0395
        L_0x031a:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r7 << 3
            int r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5508w(r4)
            goto L_0x0358
        L_0x0327:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x032d:
            int r4 = r7 << 3
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r4)
            int r4 = r4 + 1
            goto L_0x0394
        L_0x0336:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x033d:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x0344:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x034a:
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r11, r8)
        L_0x034e:
            int r5 = r7 << 3
            int r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5505t(r4)
        L_0x0358:
            int r4 = r4 + r5
            goto L_0x0394
        L_0x035a:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x0367
        L_0x0361:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x0367:
            long r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r11, r8)
        L_0x036b:
            int r6 = r7 << 3
            int r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r6)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5507v(r4)
            int r4 = r4 + r6
            goto L_0x0394
        L_0x0377:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x037d:
            int r4 = r7 << 3
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r4)
            int r4 = r4 + 4
            goto L_0x0394
        L_0x0386:
            boolean r4 = r10.mo13640s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x038c:
            int r4 = r7 << 3
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3002w4.m5506u(r4)
            int r4 = r4 + 8
        L_0x0394:
            int r3 = r3 + r4
        L_0x0395:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0399:
            b.l.a.c.e.i.m7<?, ?> r0 = r10.f4992l
            java.lang.Object r11 = r0.mo13494d(r11)
            int r11 = r0.mo13498h(r11)
            int r11 = r11 + r3
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.mo13619H(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02be, code lost:
        if (r7.f4867b != 0) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02c1, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02c2, code lost:
        r13.mo13474e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02c5, code lost:
        if (r1 >= r5) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02c7, code lost:
        r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02cd, code lost:
        if (r2 == r7.f4866a) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02d0, code lost:
        r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02d8, code lost:
        if (r7.f4867b == 0) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02da, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02dc, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0186, code lost:
        if (r4 == 0) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0189, code lost:
        r13.add(p005b.p096l.p097a.p113c.p131e.p140i.C2937r4.m5128F(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0191, code lost:
        if (r1 >= r5) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0193, code lost:
        r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0199, code lost:
        if (r2 == r7.f4866a) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019c, code lost:
        r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7);
        r4 = r7.f4866a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a2, code lost:
        if (r4 < 0) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a6, code lost:
        if (r4 > (r3.length - r1)) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a8, code lost:
        if (r4 != 0) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01aa, code lost:
        r13.add(p005b.p096l.p097a.p113c.p131e.p140i.C2937r4.f4977h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b4, code lost:
        throw p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b9, code lost:
        throw p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5683b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ba, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x024d  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13620I(T r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, long r29, p005b.p096l.p097a.p113c.p131e.p140i.C2846k4 r31) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r2 = r22
            r8 = r23
            r6 = r24
            r9 = r25
            r10 = r29
            r7 = r31
            sun.misc.Unsafe r12 = f4980p
            java.lang.Object r13 = r12.getObject(r1, r10)
            b.l.a.c.e.i.u5 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2977u5) r13
            boolean r14 = r13.mo13385a()
            if (r14 != 0) goto L_0x0035
            int r14 = r13.size()
            if (r14 != 0) goto L_0x002d
            r14 = 10
            goto L_0x002e
        L_0x002d:
            int r14 = r14 + r14
        L_0x002e:
            b.l.a.c.e.i.u5 r13 = r13.mo13230h(r14)
            r12.putObject(r1, r10, r13)
        L_0x0035:
            r10 = 5
            r11 = 2
            r14 = 0
            r12 = 1
            switch(r28) {
                case 18: goto L_0x03fd;
                case 19: goto L_0x03b2;
                case 20: goto L_0x037a;
                case 21: goto L_0x037a;
                case 22: goto L_0x035f;
                case 23: goto L_0x0320;
                case 24: goto L_0x02dd;
                case 25: goto L_0x028b;
                case 26: goto L_0x01e0;
                case 27: goto L_0x01c5;
                case 28: goto L_0x0178;
                case 29: goto L_0x035f;
                case 30: goto L_0x00da;
                case 31: goto L_0x02dd;
                case 32: goto L_0x0320;
                case 33: goto L_0x009a;
                case 34: goto L_0x005a;
                case 35: goto L_0x03fd;
                case 36: goto L_0x03b2;
                case 37: goto L_0x037a;
                case 38: goto L_0x037a;
                case 39: goto L_0x035f;
                case 40: goto L_0x0320;
                case 41: goto L_0x02dd;
                case 42: goto L_0x028b;
                case 43: goto L_0x035f;
                case 44: goto L_0x00da;
                case 45: goto L_0x02dd;
                case 46: goto L_0x0320;
                case 47: goto L_0x009a;
                case 48: goto L_0x005a;
                default: goto L_0x003d;
            }
        L_0x003d:
            r1 = 3
            if (r6 != r1) goto L_0x0465
            b.l.a.c.e.i.z6 r1 = r0.mo13623L(r9)
            r6 = r2 & -8
            r6 = r6 | 4
            r23 = r1
            r24 = r19
            r25 = r20
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2860v2(r23, r24, r25, r26, r27, r28)
            goto L_0x0443
        L_0x005a:
            if (r6 != r11) goto L_0x007e
            b.l.a.c.e.i.f6 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2783f6) r13
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r2 = r7.f4866a
            int r2 = r2 + r1
        L_0x0065:
            if (r1 >= r2) goto L_0x0075
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r3, r1, r7)
            long r4 = r7.f4867b
            long r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2950s4.m5212b(r4)
            r13.mo13329n(r4)
            goto L_0x0065
        L_0x0075:
            if (r1 != r2) goto L_0x0079
            goto L_0x0466
        L_0x0079:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a()
            throw r1
        L_0x007e:
            if (r6 != 0) goto L_0x0465
            b.l.a.c.e.i.f6 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2783f6) r13
        L_0x0082:
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r3, r4, r7)
            long r8 = r7.f4867b
            long r8 = p005b.p096l.p097a.p113c.p131e.p140i.C2950s4.m5212b(r8)
            r13.mo13329n(r8)
            if (r1 >= r5) goto L_0x0099
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r1, r7)
            int r6 = r7.f4866a
            if (r2 == r6) goto L_0x0082
        L_0x0099:
            return r1
        L_0x009a:
            if (r6 != r11) goto L_0x00be
            b.l.a.c.e.i.p5 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2912p5) r13
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r2 = r7.f4866a
            int r2 = r2 + r1
        L_0x00a5:
            if (r1 >= r2) goto L_0x00b5
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r1, r7)
            int r4 = r7.f4866a
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2950s4.m5211a(r4)
            r13.mo13574n(r4)
            goto L_0x00a5
        L_0x00b5:
            if (r1 != r2) goto L_0x00b9
            goto L_0x0466
        L_0x00b9:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a()
            throw r1
        L_0x00be:
            if (r6 != 0) goto L_0x0465
            b.l.a.c.e.i.p5 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2912p5) r13
        L_0x00c2:
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r4 = r7.f4866a
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2950s4.m5211a(r4)
            r13.mo13574n(r4)
            if (r1 >= r5) goto L_0x00d9
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r1, r7)
            int r6 = r7.f4866a
            if (r2 == r6) goto L_0x00c2
        L_0x00d9:
            return r1
        L_0x00da:
            if (r6 != r11) goto L_0x00e1
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2876z2(r3, r4, r13, r7)
            goto L_0x00f2
        L_0x00e1:
            if (r6 != 0) goto L_0x0465
            r2 = r22
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r13
            r7 = r31
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2868x2(r2, r3, r4, r5, r6, r7)
        L_0x00f2:
            b.l.a.c.e.i.o5 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2899o5) r1
            b.l.a.c.e.i.n7 r3 = r1.zzc
            b.l.a.c.e.i.n7 r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2888n7.f4905f
            if (r3 != r4) goto L_0x00fb
            r3 = 0
        L_0x00fb:
            b.l.a.c.e.i.r5 r4 = r0.mo13625N(r9)
            b.l.a.c.e.i.m7<?, ?> r5 = r0.f4992l
            java.lang.Class<?> r6 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.f4645a
            if (r4 != 0) goto L_0x0106
            goto L_0x016e
        L_0x0106:
            boolean r6 = r13 instanceof java.util.RandomAccess
            if (r6 == 0) goto L_0x0146
            int r6 = r13.size()
            r7 = 0
            r12 = 0
        L_0x0110:
            if (r12 >= r6) goto L_0x013b
            java.lang.Object r9 = r13.get(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r10 = r4.mo13360a(r9)
            if (r10 == 0) goto L_0x012e
            if (r12 == r7) goto L_0x012b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13.set(r7, r9)
        L_0x012b:
            int r7 = r7 + 1
            goto L_0x0138
        L_0x012e:
            if (r3 != 0) goto L_0x0134
            java.lang.Object r3 = r5.mo13492b()
        L_0x0134:
            long r9 = (long) r9
            r5.mo13491a(r3, r8, r9)
        L_0x0138:
            int r12 = r12 + 1
            goto L_0x0110
        L_0x013b:
            if (r7 != r6) goto L_0x013e
            goto L_0x016e
        L_0x013e:
            java.util.List r4 = r13.subList(r7, r6)
            r4.clear()
            goto L_0x016e
        L_0x0146:
            java.util.Iterator r6 = r13.iterator()
        L_0x014a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x016e
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r9 = r4.mo13360a(r7)
            if (r9 != 0) goto L_0x014a
            if (r3 != 0) goto L_0x0166
            java.lang.Object r3 = r5.mo13492b()
        L_0x0166:
            long r9 = (long) r7
            r5.mo13491a(r3, r8, r9)
            r6.remove()
            goto L_0x014a
        L_0x016e:
            if (r3 != 0) goto L_0x0173
            r1 = r2
            goto L_0x0466
        L_0x0173:
            b.l.a.c.e.i.n7 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2888n7) r3
            r1.zzc = r3
            return r2
        L_0x0178:
            if (r6 != r11) goto L_0x0465
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r4 = r7.f4866a
            if (r4 < 0) goto L_0x01c0
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01bb
            if (r4 != 0) goto L_0x0189
            goto L_0x01aa
        L_0x0189:
            b.l.a.c.e.i.r4 r6 = p005b.p096l.p097a.p113c.p131e.p140i.C2937r4.m5128F(r3, r1, r4)
            r13.add(r6)
            int r1 = r1 + r4
        L_0x0191:
            if (r1 >= r5) goto L_0x01ba
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r1, r7)
            int r6 = r7.f4866a
            if (r2 == r6) goto L_0x019c
            goto L_0x01ba
        L_0x019c:
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r4 = r7.f4866a
            if (r4 < 0) goto L_0x01b5
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01b0
            if (r4 != 0) goto L_0x0189
        L_0x01aa:
            b.l.a.c.e.i.r4 r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2937r4.f4977h
            r13.add(r4)
            goto L_0x0191
        L_0x01b0:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a()
            throw r1
        L_0x01b5:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5683b()
            throw r1
        L_0x01ba:
            return r1
        L_0x01bb:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a()
            throw r1
        L_0x01c0:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5683b()
            throw r1
        L_0x01c5:
            if (r6 == r11) goto L_0x01c9
            goto L_0x0465
        L_0x01c9:
            b.l.a.c.e.i.z6 r1 = r0.mo13623L(r9)
            r23 = r1
            r24 = r22
            r25 = r19
            r26 = r20
            r27 = r21
            r28 = r13
            r29 = r31
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2698B2(r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x01e0:
            if (r6 != r11) goto L_0x0465
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r26 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x022d
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r4 = r7.f4866a
            if (r4 < 0) goto L_0x0228
            if (r4 != 0) goto L_0x01f8
            goto L_0x0217
        L_0x01f8:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.f5088a
            r8.<init>(r3, r1, r4, r9)
        L_0x01ff:
            r13.add(r8)
            int r1 = r1 + r4
        L_0x0203:
            if (r1 >= r5) goto L_0x0466
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r1, r7)
            int r8 = r7.f4866a
            if (r2 != r8) goto L_0x0466
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r4 = r7.f4866a
            if (r4 < 0) goto L_0x0223
            if (r4 != 0) goto L_0x021b
        L_0x0217:
            r13.add(r6)
            goto L_0x0203
        L_0x021b:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.f5088a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x01ff
        L_0x0223:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5683b()
            throw r1
        L_0x0228:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5683b()
            throw r1
        L_0x022d:
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r4 = r7.f4866a
            if (r4 < 0) goto L_0x0286
            if (r4 != 0) goto L_0x0239
        L_0x0237:
            r8 = r1
            goto L_0x0260
        L_0x0239:
            int r8 = r1 + r4
            boolean r9 = p005b.p096l.p097a.p113c.p131e.p140i.C3044z7.m5738a(r3, r1, r8)
            if (r9 == 0) goto L_0x0281
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.f5088a
            r9.<init>(r3, r1, r4, r10)
        L_0x0248:
            r13.add(r9)
        L_0x024b:
            if (r8 >= r5) goto L_0x027e
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r8, r7)
            int r4 = r7.f4866a
            if (r2 != r4) goto L_0x027e
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r1, r7)
            int r4 = r7.f4866a
            if (r4 < 0) goto L_0x0279
            if (r4 != 0) goto L_0x0264
            goto L_0x0237
        L_0x0260:
            r13.add(r6)
            goto L_0x024b
        L_0x0264:
            int r8 = r1 + r4
            boolean r9 = p005b.p096l.p097a.p113c.p131e.p140i.C3044z7.m5738a(r3, r1, r8)
            if (r9 == 0) goto L_0x0274
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.f5088a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x0248
        L_0x0274:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5685d()
            throw r1
        L_0x0279:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5683b()
            throw r1
        L_0x027e:
            r1 = r8
            goto L_0x0466
        L_0x0281:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5685d()
            throw r1
        L_0x0286:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5683b()
            throw r1
        L_0x028b:
            if (r6 != r11) goto L_0x02b2
            b.l.a.c.e.i.l4 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2859l4) r13
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r2 = r7.f4866a
            int r2 = r2 + r1
        L_0x0296:
            if (r1 >= r2) goto L_0x02a9
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r3, r1, r7)
            long r4 = r7.f4867b
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x02a4
            r4 = r12
            goto L_0x02a5
        L_0x02a4:
            r4 = 0
        L_0x02a5:
            r13.mo13474e(r4)
            goto L_0x0296
        L_0x02a9:
            if (r1 != r2) goto L_0x02ad
            goto L_0x0466
        L_0x02ad:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a()
            throw r1
        L_0x02b2:
            if (r6 != 0) goto L_0x0465
            b.l.a.c.e.i.l4 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2859l4) r13
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r3, r4, r7)
            long r8 = r7.f4867b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x02c1
            goto L_0x02da
        L_0x02c1:
            r4 = 0
        L_0x02c2:
            r13.mo13474e(r4)
            if (r1 >= r5) goto L_0x02dc
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r1, r7)
            int r6 = r7.f4866a
            if (r2 == r6) goto L_0x02d0
            goto L_0x02dc
        L_0x02d0:
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r3, r4, r7)
            long r8 = r7.f4867b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x02c1
        L_0x02da:
            r4 = r12
            goto L_0x02c2
        L_0x02dc:
            return r1
        L_0x02dd:
            if (r6 != r11) goto L_0x02fd
            b.l.a.c.e.i.p5 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2912p5) r13
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r2 = r7.f4866a
            int r2 = r2 + r1
        L_0x02e8:
            if (r1 >= r2) goto L_0x02f4
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r3, r1)
            r13.mo13574n(r4)
            int r1 = r1 + 4
            goto L_0x02e8
        L_0x02f4:
            if (r1 != r2) goto L_0x02f8
            goto L_0x0466
        L_0x02f8:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a()
            throw r1
        L_0x02fd:
            if (r6 != r10) goto L_0x0465
            b.l.a.c.e.i.p5 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2912p5) r13
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r19, r20)
        L_0x0305:
            r13.mo13574n(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x031f
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r6 = r7.f4866a
            if (r2 == r6) goto L_0x0315
            goto L_0x031f
        L_0x0315:
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r3, r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x0305
        L_0x031f:
            return r4
        L_0x0320:
            if (r6 != r11) goto L_0x0340
            b.l.a.c.e.i.f6 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2783f6) r13
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r2 = r7.f4866a
            int r2 = r2 + r1
        L_0x032b:
            if (r1 >= r2) goto L_0x0337
            long r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r3, r1)
            r13.mo13329n(r4)
            int r1 = r1 + 8
            goto L_0x032b
        L_0x0337:
            if (r1 != r2) goto L_0x033b
            goto L_0x0466
        L_0x033b:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a()
            throw r1
        L_0x0340:
            if (r6 != r12) goto L_0x0465
            b.l.a.c.e.i.f6 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2783f6) r13
            long r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r19, r20)
        L_0x0348:
            r13.mo13329n(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x035e
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r6 = r7.f4866a
            if (r2 == r6) goto L_0x0358
            goto L_0x035e
        L_0x0358:
            long r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r3, r1)
            r4 = r1
            goto L_0x0348
        L_0x035e:
            return r4
        L_0x035f:
            if (r6 != r11) goto L_0x0367
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2876z2(r3, r4, r13, r7)
            goto L_0x0466
        L_0x0367:
            if (r6 == 0) goto L_0x036b
            goto L_0x0465
        L_0x036b:
            r23 = r19
            r24 = r20
            r25 = r21
            r26 = r13
            r27 = r31
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2868x2(r22, r23, r24, r25, r26, r27)
            return r1
        L_0x037a:
            if (r6 != r11) goto L_0x039a
            b.l.a.c.e.i.f6 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2783f6) r13
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r2 = r7.f4866a
            int r2 = r2 + r1
        L_0x0385:
            if (r1 >= r2) goto L_0x0391
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r3, r1, r7)
            long r4 = r7.f4867b
            r13.mo13329n(r4)
            goto L_0x0385
        L_0x0391:
            if (r1 != r2) goto L_0x0395
            goto L_0x0466
        L_0x0395:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a()
            throw r1
        L_0x039a:
            if (r6 != 0) goto L_0x0465
            b.l.a.c.e.i.f6 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2783f6) r13
        L_0x039e:
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r3, r4, r7)
            long r8 = r7.f4867b
            r13.mo13329n(r8)
            if (r1 >= r5) goto L_0x03b1
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r1, r7)
            int r6 = r7.f4866a
            if (r2 == r6) goto L_0x039e
        L_0x03b1:
            return r1
        L_0x03b2:
            if (r6 != r11) goto L_0x03d6
            b.l.a.c.e.i.i5 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2821i5) r13
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r2 = r7.f4866a
            int r2 = r2 + r1
        L_0x03bd:
            if (r1 >= r2) goto L_0x03cd
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.mo13393e(r4)
            int r1 = r1 + 4
            goto L_0x03bd
        L_0x03cd:
            if (r1 != r2) goto L_0x03d1
            goto L_0x0466
        L_0x03d1:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a()
            throw r1
        L_0x03d6:
            if (r6 != r10) goto L_0x0465
            b.l.a.c.e.i.i5 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2821i5) r13
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r19, r20)
        L_0x03de:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.mo13393e(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x03fc
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r6 = r7.f4866a
            if (r2 == r6) goto L_0x03f2
            goto L_0x03fc
        L_0x03f2:
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r3, r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x03de
        L_0x03fc:
            return r4
        L_0x03fd:
            if (r6 != r11) goto L_0x0420
            b.l.a.c.e.i.z4 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C3041z4) r13
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r2 = r7.f4866a
            int r2 = r2 + r1
        L_0x0408:
            if (r1 >= r2) goto L_0x0418
            long r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r13.mo13996e(r4)
            int r1 = r1 + 8
            goto L_0x0408
        L_0x0418:
            if (r1 != r2) goto L_0x041b
            goto L_0x0466
        L_0x041b:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a()
            throw r1
        L_0x0420:
            if (r6 != r12) goto L_0x0465
            b.l.a.c.e.i.z4 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C3041z4) r13
            long r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r19, r20)
        L_0x0428:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.mo13996e(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x0442
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r6 = r7.f4866a
            if (r2 == r6) goto L_0x043c
            goto L_0x0442
        L_0x043c:
            long r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r3, r1)
            r4 = r1
            goto L_0x0428
        L_0x0442:
            return r4
        L_0x0443:
            java.lang.Object r8 = r7.f4868c
            r13.add(r8)
            if (r4 >= r5) goto L_0x0464
            int r8 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r7)
            int r9 = r7.f4866a
            if (r2 == r9) goto L_0x0453
            goto L_0x0464
        L_0x0453:
            r23 = r1
            r24 = r19
            r25 = r8
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2860v2(r23, r24, r25, r26, r27, r28)
            goto L_0x0443
        L_0x0464:
            return r4
        L_0x0465:
            r1 = r4
        L_0x0466:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.mo13620I(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, b.l.a.c.e.i.k4):int");
    }

    /* renamed from: J */
    public final <K, V> int mo13621J(Object obj, byte[] bArr, int i, int i2, int i3, long j) {
        Unsafe unsafe = f4980p;
        Object M = mo13624M(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((C2848k6) object).f4872g) {
            C2848k6 k6Var = C2848k6.f4871h;
            C2848k6 k6Var2 = k6Var.isEmpty() ? new C2848k6() : new C2848k6(k6Var);
            C2861l6.m4940b(k6Var2, object);
            unsafe.putObject(obj, j, k6Var2);
        }
        C2835j6 j6Var = (C2835j6) M;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c7, code lost:
        if (r15 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.m5406c(r15, r3);
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
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13622K(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p005b.p096l.p097a.p113c.p131e.p140i.C2846k4 r29) {
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
            sun.misc.Unsafe r12 = f4980p
            int[] r7 = r0.f4981a
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
            b.l.a.c.e.i.z6 r5 = r0.mo13623L(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2860v2(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f4868c
            if (r15 != 0) goto L_0x00ca
            goto L_0x00db
        L_0x0052:
            if (r5 == 0) goto L_0x0056
            goto L_0x0196
        L_0x0056:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r3, r4, r11)
            long r3 = r11.f4867b
            long r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2950s4.m5212b(r3)
            goto L_0x015a
        L_0x0062:
            if (r5 == 0) goto L_0x0066
            goto L_0x0196
        L_0x0066:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r11)
            int r3 = r11.f4866a
            int r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2950s4.m5211a(r3)
            goto L_0x014c
        L_0x0072:
            if (r5 != 0) goto L_0x0196
            int r3 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r11)
            int r4 = r11.f4866a
            b.l.a.c.e.i.r5 r5 = r0.mo13625N(r6)
            if (r5 == 0) goto L_0x0094
            boolean r5 = r5.mo13360a(r4)
            if (r5 == 0) goto L_0x0087
            goto L_0x0094
        L_0x0087:
            b.l.a.c.e.i.n7 r1 = m5148z(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo13520c(r2, r4)
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
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2844r2(r3, r4, r11)
            java.lang.Object r3 = r11.f4868c
            goto L_0x015e
        L_0x00ad:
            if (r5 != r7) goto L_0x0196
            b.l.a.c.e.i.z6 r2 = r0.mo13623L(r6)
            r5 = r20
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2852t2(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c4
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00c5
        L_0x00c4:
            r15 = 0
        L_0x00c5:
            java.lang.Object r3 = r11.f4868c
            if (r15 != 0) goto L_0x00ca
            goto L_0x00db
        L_0x00ca:
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.m5406c(r15, r3)
            goto L_0x00db
        L_0x00cf:
            if (r5 != r7) goto L_0x0196
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r11)
            int r4 = r11.f4866a
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
            boolean r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3044z7.m5738a(r3, r2, r5)
            if (r5 == 0) goto L_0x00ee
            goto L_0x00f3
        L_0x00ee:
            b.l.a.c.e.i.x5 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5685d()
            throw r1
        L_0x00f3:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.f5088a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x00fe:
            r12.putInt(r1, r13, r8)
            goto L_0x0197
        L_0x0103:
            if (r5 != 0) goto L_0x0196
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r3, r4, r11)
            long r3 = r11.f4867b
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
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r18, r19)
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
            long r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0143:
            if (r5 == 0) goto L_0x0146
            goto L_0x0196
        L_0x0146:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r3, r4, r11)
            int r3 = r11.f4866a
        L_0x014c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x015e
        L_0x0151:
            if (r5 == 0) goto L_0x0154
            goto L_0x0196
        L_0x0154:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r3, r4, r11)
            long r3 = r11.f4867b
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
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r18, r19)
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
            long r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r18, r19)
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
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.mo13622K(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, b.l.a.c.e.i.k4):int");
    }

    /* renamed from: L */
    public final C3043z6 mo13623L(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f4982b;
        C3043z6 z6Var = (C3043z6) objArr[i3];
        if (z6Var != null) {
            return z6Var;
        }
        C3043z6 a = C3004w6.f5106c.mo13896a((Class) objArr[i3 + 1]);
        this.f4982b[i3] = a;
        return a;
    }

    /* renamed from: M */
    public final Object mo13624M(int i) {
        int i2 = i / 3;
        return this.f4982b[i2 + i2];
    }

    /* renamed from: N */
    public final C2938r5 mo13625N(int i) {
        int i2 = i / 3;
        return (C2938r5) this.f4982b[i2 + i2 + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ed, code lost:
        if (r0 != r3) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x033b, code lost:
        if (r0 != r14) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x033d, code lost:
        r5 = r15;
        r6 = r21;
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        r0 = r23 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        r9.putInt(r14, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        r5 = r6;
        r22 = r13;
        r6 = r0;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0131, code lost:
        r1 = r11.f4868c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013b, code lost:
        r10 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015a, code lost:
        r9.putObject(r14, r7, r1);
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0160, code lost:
        r29 = r13;
        r13 = r4;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019b, code lost:
        r1 = r23 | r22;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01bf, code lost:
        r13 = r4;
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0214, code lost:
        r13 = r0;
        r0 = r23 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0218, code lost:
        r1 = r0;
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021b, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0237, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0238, code lost:
        r5 = r6;
        r13 = r10;
        r7 = r21;
        r8 = 0;
        r10 = -1;
        r6 = r1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0243, code lost:
        r2 = r3;
        r8 = r4;
        r15 = r6;
        r27 = r9;
        r6 = r23;
        r18 = 0;
        r28 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13626O(T r31, byte[] r32, int r33, int r34, p005b.p096l.p097a.p113c.p131e.p140i.C2846k4 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f4980p
            r10 = -1
            r8 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r5 = r7
            r2 = r8
            r6 = r2
            r1 = r10
        L_0x0017:
            if (r0 >= r13) goto L_0x0371
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2875z1(r0, r12, r3, r11)
            int r3 = r11.f4866a
            r4 = r0
            r16 = r3
            goto L_0x002c
        L_0x0029:
            r16 = r0
            r4 = r3
        L_0x002c:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            if (r3 <= r1) goto L_0x0041
            int r2 = r2 / 3
            int r1 = r15.f4983c
            if (r3 < r1) goto L_0x004f
            int r1 = r15.f4984d
            if (r3 > r1) goto L_0x004f
            int r1 = r15.mo13644w(r3, r2)
            goto L_0x004d
        L_0x0041:
            int r1 = r15.f4983c
            if (r3 < r1) goto L_0x004f
            int r1 = r15.f4984d
            if (r3 > r1) goto L_0x004f
            int r1 = r15.mo13644w(r3, r8)
        L_0x004d:
            r2 = r1
            goto L_0x0050
        L_0x004f:
            r2 = r10
        L_0x0050:
            if (r2 != r10) goto L_0x005e
            r19 = r3
            r2 = r4
            r15 = r5
            r18 = r8
            r27 = r9
            r28 = r10
            goto L_0x0348
        L_0x005e:
            int[] r1 = r15.f4981a
            int r17 = r2 + 1
            r8 = r1[r17]
            int r10 = r8 >>> 20
            r10 = r10 & 255(0xff, float:3.57E-43)
            r33 = r3
            r3 = r8 & r7
            r20 = r8
            long r7 = (long) r3
            r3 = 17
            if (r10 > r3) goto L_0x0250
            int r3 = r2 + 2
            r1 = r1[r3]
            int r3 = r1 >>> 20
            r13 = 1
            int r22 = r13 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            r19 = r4
            if (r1 == r5) goto L_0x0099
            if (r5 == r3) goto L_0x008d
            long r3 = (long) r5
            r9.putInt(r14, r3, r6)
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x008d:
            if (r1 == r3) goto L_0x0095
            long r4 = (long) r1
            int r4 = r9.getInt(r14, r4)
            r6 = r4
        L_0x0095:
            r23 = r6
            r6 = r1
            goto L_0x009c
        L_0x0099:
            r23 = r6
            r6 = r5
        L_0x009c:
            r1 = 5
            switch(r10) {
                case 0: goto L_0x021d;
                case 1: goto L_0x01fa;
                case 2: goto L_0x01d9;
                case 3: goto L_0x01d9;
                case 4: goto L_0x01c4;
                case 5: goto L_0x01a0;
                case 6: goto L_0x0186;
                case 7: goto L_0x0167;
                case 8: goto L_0x013e;
                case 9: goto L_0x0117;
                case 10: goto L_0x00fb;
                case 11: goto L_0x01c4;
                case 12: goto L_0x00e8;
                case 13: goto L_0x0186;
                case 14: goto L_0x01a0;
                case 15: goto L_0x00d4;
                case 16: goto L_0x00ab;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            r10 = r34
            r4 = r2
            r21 = r3
            r3 = r19
            r19 = r33
            goto L_0x0243
        L_0x00ab:
            if (r0 != 0) goto L_0x00c8
            r4 = r19
            int r10 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r12, r4, r11)
            long r0 = r11.f4867b
            long r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2950s4.m5212b(r0)
            r0 = r9
            r1 = r31
            r19 = r33
            r13 = r2
            r21 = r3
            r2 = r7
            r0.putLong(r1, r2, r4)
        L_0x00c5:
            r0 = r23 | r22
            goto L_0x0110
        L_0x00c8:
            r21 = r3
            r4 = r19
            r19 = r33
            r10 = r34
            r3 = r4
            r4 = r2
            goto L_0x0243
        L_0x00d4:
            r13 = r2
            r21 = r3
            r4 = r19
            r19 = r33
            if (r0 != 0) goto L_0x013b
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r12, r4, r11)
            int r1 = r11.f4866a
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2950s4.m5211a(r1)
            goto L_0x00f7
        L_0x00e8:
            r13 = r2
            r21 = r3
            r4 = r19
            r19 = r33
            if (r0 != 0) goto L_0x013b
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r12, r4, r11)
            int r1 = r11.f4866a
        L_0x00f7:
            r9.putInt(r14, r7, r1)
            goto L_0x010e
        L_0x00fb:
            r13 = r2
            r21 = r3
            r4 = r19
            r1 = 2
            r19 = r33
            if (r0 != r1) goto L_0x013b
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2844r2(r12, r4, r11)
            java.lang.Object r1 = r11.f4868c
            r9.putObject(r14, r7, r1)
        L_0x010e:
            r10 = r0
            goto L_0x00c5
        L_0x0110:
            r5 = r6
            r22 = r13
            r6 = r0
            r0 = r10
            goto L_0x0293
        L_0x0117:
            r13 = r2
            r21 = r3
            r4 = r19
            r1 = 2
            r19 = r33
            if (r0 != r1) goto L_0x013b
            b.l.a.c.e.i.z6 r0 = r15.mo13623L(r13)
            r10 = r34
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2852t2(r0, r12, r4, r10, r11)
            java.lang.Object r1 = r9.getObject(r14, r7)
            if (r1 != 0) goto L_0x0134
        L_0x0131:
            java.lang.Object r1 = r11.f4868c
            goto L_0x015a
        L_0x0134:
            java.lang.Object r2 = r11.f4868c
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.m5406c(r1, r2)
            goto L_0x015a
        L_0x013b:
            r10 = r34
            goto L_0x0160
        L_0x013e:
            r10 = r34
            r13 = r2
            r21 = r3
            r4 = r19
            r1 = 2
            r19 = r33
            if (r0 != r1) goto L_0x0160
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x0155
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2824m2(r12, r4, r11)
            goto L_0x0131
        L_0x0155:
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2832o2(r12, r4, r11)
            goto L_0x0131
        L_0x015a:
            r9.putObject(r14, r7, r1)
            r4 = r13
            goto L_0x0214
        L_0x0160:
            r29 = r13
            r13 = r4
            r4 = r29
            goto L_0x021b
        L_0x0167:
            r10 = r34
            r5 = r2
            r21 = r3
            r4 = r19
            r19 = r33
            if (r0 != 0) goto L_0x01bf
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r12, r4, r11)
            long r1 = r11.f4867b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x017f
            goto L_0x0180
        L_0x017f:
            r13 = 0
        L_0x0180:
            b.l.a.c.e.i.v7 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r1.mo13750c(r14, r7, r13)
            goto L_0x019b
        L_0x0186:
            r10 = r34
            r5 = r2
            r21 = r3
            r4 = r19
            r19 = r33
            if (r0 != r1) goto L_0x01bf
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r12, r4)
            r9.putInt(r14, r7, r0)
            int r4 = r4 + 4
            r0 = r4
        L_0x019b:
            r1 = r23 | r22
            r2 = r5
            goto L_0x0238
        L_0x01a0:
            r10 = r34
            r5 = r2
            r21 = r3
            r4 = r19
            r19 = r33
            if (r0 != r13) goto L_0x01bf
            long r24 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r12, r4)
            r0 = r9
            r1 = r31
            r2 = r7
            r13 = r4
            r7 = r5
            r4 = r24
            r0.putLong(r1, r2, r4)
            int r0 = r13 + 8
            r4 = r7
            goto L_0x0214
        L_0x01bf:
            r13 = r4
            r7 = r5
            r4 = r7
            goto L_0x021b
        L_0x01c4:
            r10 = r34
            r4 = r2
            r21 = r3
            r13 = r19
            r19 = r33
            if (r0 != 0) goto L_0x021b
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2762W0(r12, r13, r11)
            int r1 = r11.f4866a
            r9.putInt(r14, r7, r1)
            goto L_0x0214
        L_0x01d9:
            r10 = r34
            r4 = r2
            r21 = r3
            r13 = r19
            r19 = r33
            if (r0 != 0) goto L_0x021b
            int r13 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2748R1(r12, r13, r11)
            long r2 = r11.f4867b
            r0 = r9
            r1 = r31
            r24 = r2
            r2 = r7
            r7 = r4
            r4 = r24
            r0.putLong(r1, r2, r4)
            r0 = r23 | r22
            r4 = r7
            goto L_0x0218
        L_0x01fa:
            r10 = r34
            r4 = r2
            r21 = r3
            r13 = r19
            r19 = r33
            if (r0 != r1) goto L_0x021b
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2788d2(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            b.l.a.c.e.i.v7 r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r1.mo13752e(r14, r7, r0)
            int r0 = r13 + 4
        L_0x0214:
            r1 = r23 | r22
            r13 = r0
            r0 = r1
        L_0x0218:
            r1 = r0
            r0 = r13
            goto L_0x0237
        L_0x021b:
            r3 = r13
            goto L_0x0243
        L_0x021d:
            r10 = r34
            r4 = r2
            r21 = r3
            r3 = r19
            r19 = r33
            if (r0 != r13) goto L_0x0243
            long r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2812j2(r12, r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5536l(r14, r7, r0)
            int r0 = r3 + 8
            r1 = r23 | r22
        L_0x0237:
            r2 = r4
        L_0x0238:
            r5 = r6
            r13 = r10
            r7 = r21
            r8 = 0
            r10 = -1
            r6 = r1
            r1 = r19
            goto L_0x0017
        L_0x0243:
            r2 = r3
            r8 = r4
            r15 = r6
            r27 = r9
            r6 = r23
            r18 = 0
            r28 = -1
            goto L_0x0348
        L_0x0250:
            r19 = r33
            r3 = r4
            r1 = 2
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r2 = 27
            if (r10 != r2) goto L_0x02ad
            if (r0 != r1) goto L_0x029f
            java.lang.Object r0 = r9.getObject(r14, r7)
            b.l.a.c.e.i.u5 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2977u5) r0
            boolean r1 = r0.mo13385a()
            if (r1 != 0) goto L_0x027b
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0273
            r1 = 10
            goto L_0x0274
        L_0x0273:
            int r1 = r1 + r1
        L_0x0274:
            b.l.a.c.e.i.u5 r0 = r0.mo13230h(r1)
            r9.putObject(r14, r7, r0)
        L_0x027b:
            r7 = r0
            b.l.a.c.e.i.z6 r0 = r15.mo13623L(r4)
            r1 = r16
            r2 = r32
            r22 = r4
            r4 = r34
            r13 = r5
            r5 = r7
            r7 = r6
            r6 = r35
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2698B2(r0, r1, r2, r3, r4, r5, r6)
            r6 = r7
            r5 = r13
        L_0x0293:
            r13 = r34
            r1 = r19
            r7 = r21
            r2 = r22
            r8 = 0
            r10 = -1
            goto L_0x0017
        L_0x029f:
            r22 = r4
            r14 = r3
            r15 = r5
            r21 = r6
            r27 = r9
            r18 = 0
            r28 = -1
            goto L_0x030f
        L_0x02ad:
            r22 = r4
            r13 = r5
            r2 = 49
            if (r10 > r2) goto L_0x02f3
            r5 = r20
            long r4 = (long) r5
            r2 = r0
            r0 = r30
            r1 = r31
            r33 = r2
            r2 = r32
            r20 = r3
            r23 = r4
            r4 = r34
            r5 = r16
            r15 = r6
            r6 = r19
            r25 = r7
            r8 = r21
            r7 = r33
            r21 = r15
            r18 = 0
            r15 = r8
            r8 = r22
            r27 = r9
            r17 = r10
            r28 = -1
            r9 = r23
            r11 = r17
            r15 = r13
            r12 = r25
            r14 = r35
            int r0 = r0.mo13620I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r20
            if (r0 == r14) goto L_0x02f0
            goto L_0x033d
        L_0x02f0:
            r4 = r0
            goto L_0x0343
        L_0x02f3:
            r33 = r0
            r14 = r3
            r21 = r6
            r25 = r7
            r27 = r9
            r17 = r10
            r15 = r13
            r5 = r20
            r18 = 0
            r28 = -1
            r0 = 50
            r9 = r17
            r7 = r33
            if (r9 != r0) goto L_0x0323
            if (r7 == r1) goto L_0x0311
        L_0x030f:
            r4 = r14
            goto L_0x0343
        L_0x0311:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r22
            r6 = r25
            r0.mo13621J(r1, r2, r3, r4, r5, r6)
            r0 = 0
            throw r0
        L_0x0323:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r8 = r5
            r5 = r16
            r6 = r19
            r10 = r25
            r12 = r22
            r13 = r35
            int r0 = r0.mo13622K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02f0
        L_0x033d:
            r5 = r15
            r6 = r21
            r2 = r22
            goto L_0x035a
        L_0x0343:
            r2 = r4
            r6 = r21
            r8 = r22
        L_0x0348:
            b.l.a.c.e.i.n7 r4 = m5148z(r31)
            r0 = r16
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2706D2(r0, r1, r2, r3, r4, r5)
            r2 = r8
            r5 = r15
        L_0x035a:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r8 = r18
            r1 = r19
            r9 = r27
            r10 = r28
            r7 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0017
        L_0x0371:
            r15 = r5
            r21 = r6
            r1 = r7
            r27 = r9
            if (r15 == r1) goto L_0x0383
            long r1 = (long) r15
            r3 = r31
            r6 = r21
            r4 = r27
            r4.putInt(r3, r1, r6)
        L_0x0383:
            r1 = r34
            if (r0 != r1) goto L_0x0388
            return r0
        L_0x0388:
            b.l.a.c.e.i.x5 r0 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5684c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.mo13626O(java.lang.Object, byte[], int, int, b.l.a.c.e.i.k4):int");
    }

    /* renamed from: a */
    public final T mo13627a() {
        return ((C2899o5) this.f4985e).mo13245r(4, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final boolean mo13628b(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.f4989i) {
            int i6 = this.f4988h[i4];
            int i7 = this.f4981a[i6];
            int j = mo13636j(i6);
            int i8 = this.f4981a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = f4980p.getInt(t2, (long) i9);
                }
                i = i3;
                i2 = i9;
            } else {
                i2 = i5;
                i = i3;
            }
            if ((268435456 & j) != 0 && !mo13639r(t, i6, i2, i, i10)) {
                return false;
            }
            int i11 = (j >>> 20) & 255;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (mo13642u(t2, i7, i6) && !mo13623L(i6).mo13628b(C3005w7.m5537m(t2, (long) (j & 1048575)))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 == 50 && !((C2848k6) C3005w7.m5537m(t2, (long) (j & 1048575))).isEmpty()) {
                            C2835j6 j6Var = (C2835j6) mo13624M(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C3005w7.m5537m(t2, (long) (j & 1048575));
                if (!list.isEmpty()) {
                    C3043z6 L = mo13623L(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!L.mo13628b(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (mo13639r(t, i6, i2, i, i10) && !mo13623L(i6).mo13628b(C3005w7.m5537m(t2, (long) (j & 1048575)))) {
                return false;
            }
            i4++;
            i5 = i2;
            i3 = i;
        }
        if (!this.f4986f) {
            return true;
        }
        this.f4993m.mo13264b(t2);
        throw null;
    }

    /* renamed from: c */
    public final int mo13629c(T t) {
        return this.f4987g ? mo13619H(t) : mo13618G(t);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e.mo13804p(r7, r2, p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r8, r2));
        mo13643v(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e.mo13804p(r7, r2, p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e.mo13800l(r7, r2, p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5532h(r7, r2, p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        mo13641t(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        r0 = r0 + 3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13630d(T r7, T r8) {
        /*
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f4981a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x010a
            int r1 = r6.mo13636j(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f4981a
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
            boolean r1 = r6.mo13642u(r8, r4, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x0031
        L_0x0026:
            r6.mo13617F(r7, r8, r0)
            goto L_0x0106
        L_0x002b:
            boolean r1 = r6.mo13642u(r8, r4, r0)
            if (r1 == 0) goto L_0x0106
        L_0x0031:
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r8, r2)
            b.l.a.c.e.i.v7 r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r5.mo13804p(r7, r2, r1)
            r6.mo13643v(r7, r4, r0)
            goto L_0x0106
        L_0x003f:
            java.lang.Class<?> r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.f4645a
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r7, r2)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r8, r2)
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2861l6.m4940b(r1, r4)
            b.l.a.c.e.i.v7 r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r4.mo13804p(r7, r2, r1)
            goto L_0x0106
        L_0x0054:
            b.l.a.c.e.i.e6 r1 = r6.f4991k
            r1.mo13267b(r7, r8, r2)
            goto L_0x0106
        L_0x005b:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x0063:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x006a:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x0072:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0079:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0080:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0087:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x0099
        L_0x008e:
            r6.mo13616E(r7, r8, r0)
            goto L_0x0106
        L_0x0093:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x0099:
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r8, r2)
            b.l.a.c.e.i.v7 r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r4.mo13804p(r7, r2, r1)
            goto L_0x0103
        L_0x00a3:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            boolean r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5533i(r8, r2)
            b.l.a.c.e.i.v7 r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r4.mo13750c(r7, r2, r1)
            goto L_0x0103
        L_0x00b3:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x00ba:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x00c1:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x00c7:
            int r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r8, r2)
            b.l.a.c.e.i.v7 r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r4.mo13800l(r7, r2, r1)
            goto L_0x0103
        L_0x00d1:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x00d8:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x00de:
            long r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r8, r2)
            p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5532h(r7, r2, r4)
            goto L_0x0103
        L_0x00e6:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            float r1 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5534j(r8, r2)
            b.l.a.c.e.i.v7 r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.f5113e
            r4.mo13752e(r7, r2, r1)
            goto L_0x0103
        L_0x00f6:
            boolean r1 = r6.mo13640s(r8, r0)
            if (r1 == 0) goto L_0x0106
            double r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5535k(r8, r2)
            p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5536l(r7, r2, r4)
        L_0x0103:
            r6.mo13641t(r7, r0)
        L_0x0106:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x010a:
            b.l.a.c.e.i.m7<?, ?> r0 = r6.f4992l
            java.lang.Class<?> r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.f4645a
            java.lang.Object r1 = r0.mo13494d(r7)
            java.lang.Object r2 = r0.mo13494d(r8)
            java.lang.Object r1 = r0.mo13496f(r1, r2)
            r0.mo13493c(r7, r1)
            boolean r7 = r6.f4986f
            if (r7 != 0) goto L_0x0122
            return
        L_0x0122:
            b.l.a.c.e.i.c5<?> r7 = r6.f4993m
            r7.mo13264b(r8)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.mo13630d(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r2 * 53;
        r3 = m5144n(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r2 = r2 * 53;
        r3 = m5145o(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r2 = r2 * 53;
        r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5).hashCode();
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
        r3 = ((java.lang.String) p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.m5405b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011b, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.m5404a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13631e(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f4981a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0129
            int r3 = r8.mo13636j(r1)
            int[] r4 = r8.f4981a
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
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x0027:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x002f:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0036:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x003e:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0045:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x004c:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0053:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x005b:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x0063:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00e4
        L_0x006b:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            boolean r3 = m5146p(r9, r5)
            goto L_0x00f7
        L_0x0079:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0080:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x0087:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
        L_0x008d:
            int r2 = r2 * 53
            int r3 = m5144n(r9, r5)
            goto L_0x0123
        L_0x0095:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x009c:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
        L_0x00a2:
            int r2 = r2 * 53
            long r3 = m5145o(r9, r5)
            goto L_0x011f
        L_0x00aa:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            float r3 = m5143m(r9, r5)
            goto L_0x0110
        L_0x00b7:
            boolean r3 = r8.mo13642u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            double r3 = m5142l(r9, r5)
            goto L_0x011b
        L_0x00c4:
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5)
            if (r3 == 0) goto L_0x00e0
            goto L_0x00dc
        L_0x00cb:
            int r2 = r2 * 53
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00d6:
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5)
            if (r3 == 0) goto L_0x00e0
        L_0x00dc:
            int r7 = r3.hashCode()
        L_0x00e0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0125
        L_0x00e4:
            int r2 = r2 * 53
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00f1:
            int r2 = r2 * 53
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5533i(r9, r5)
        L_0x00f7:
            int r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.m5405b(r3)
            goto L_0x0123
        L_0x00fc:
            int r2 = r2 * 53
            int r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r9, r5)
            goto L_0x0123
        L_0x0103:
            int r2 = r2 * 53
            long r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r9, r5)
            goto L_0x011f
        L_0x010a:
            int r2 = r2 * 53
            float r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5534j(r9, r5)
        L_0x0110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0123
        L_0x0115:
            int r2 = r2 * 53
            double r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5535k(r9, r5)
        L_0x011b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x011f:
            int r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.m5404a(r3)
        L_0x0123:
            int r3 = r3 + r2
            r2 = r3
        L_0x0125:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0129:
            int r2 = r2 * 53
            b.l.a.c.e.i.m7<?, ?> r0 = r8.f4992l
            java.lang.Object r0 = r0.mo13494d(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f4986f
            if (r1 != 0) goto L_0x013b
            return r0
        L_0x013b:
            b.l.a.c.e.i.c5<?> r0 = r8.f4993m
            r0.mo13264b(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.mo13631e(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13632f(T r9, T r10) {
        /*
            r8 = this;
            int[] r0 = r8.f4981a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.mo13636j(r2)
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
            int r3 = r8.mo13637k(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r9, r3)
            int r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4612a(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4612a(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4612a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r9, r5)
            long r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r9, r5)
            long r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4612a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4612a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r9, r5)
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r10, r5)
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4612a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5533i(r9, r5)
            boolean r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5533i(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r9, r5)
            long r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r9, r5)
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r9, r5)
            long r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r9, r5)
            long r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5534j(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5534j(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.mo13638q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5535k(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5535k(r10, r5)
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
            b.l.a.c.e.i.m7<?, ?> r0 = r8.f4992l
            java.lang.Object r0 = r0.mo13494d(r9)
            b.l.a.c.e.i.m7<?, ?> r2 = r8.f4992l
            java.lang.Object r2 = r2.mo13494d(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r8.f4986f
            if (r0 != 0) goto L_0x01d3
            r9 = 1
            return r9
        L_0x01d3:
            b.l.a.c.e.i.c5<?> r0 = r8.f4993m
            r0.mo13264b(r9)
            b.l.a.c.e.i.c5<?> r9 = r8.f4993m
            r9.mo13264b(r10)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.mo13632f(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: g */
    public final void mo13633g(T t) {
        int i;
        int i2 = this.f4989i;
        while (true) {
            i = this.f4990j;
            if (i2 >= i) {
                break;
            }
            long j = (long) (mo13636j(this.f4988h[i2]) & 1048575);
            Object m = C3005w7.m5537m(t, j);
            if (m != null) {
                ((C2848k6) m).f4872g = false;
                C3005w7.f5113e.mo13804p(t, j, m);
            }
            i2++;
        }
        int length = this.f4988h.length;
        while (i < length) {
            this.f4991k.mo13266a(t, (long) this.f4988h[i]);
            i++;
        }
        this.f4992l.mo13495e(t);
        if (this.f4986f) {
            this.f4993m.mo13265c(t);
        }
    }

    /* renamed from: h */
    public final void mo13634h(T t, byte[] bArr, int i, int i2, C2846k4 k4Var) {
        if (this.f4987g) {
            mo13626O(t, bArr, i, i2, k4Var);
        } else {
            mo13615A(t, bArr, i, i2, 0, k4Var);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0323, code lost:
        r12.mo13969d(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0334, code lost:
        r12.mo13968c(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0345, code lost:
        r12.f5136a.mo13775i(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0358, code lost:
        r12.f5136a.mo13773g(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x036b, code lost:
        r12.f5136a.mo13771e(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x037e, code lost:
        r12.f5136a.mo13772f(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x038b, code lost:
        r12.f5136a.mo13778l(r6, (p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, (long) (r4 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a0, code lost:
        r12.mo13970e(r6, p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, (long) (r4 & 1048575)), mo13623L(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b5, code lost:
        m5147y(r6, p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, (long) (r4 & 1048575)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03cc, code lost:
        r12.f5136a.mo13776j(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03df, code lost:
        r12.f5136a.mo13773g(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03f1, code lost:
        r12.f5136a.mo13775i(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0403, code lost:
        r12.f5136a.mo13771e(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0415, code lost:
        r12.f5136a.mo13774h(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0427, code lost:
        r12.f5136a.mo13774h(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0439, code lost:
        r12.mo13966a(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0449, code lost:
        r12.mo13967b(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0308, code lost:
        r12.mo13971f(r6, p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, (long) (r4 & 1048575)), mo13623L(r3));
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13635i(T r11, p005b.p096l.p097a.p113c.p131e.p140i.C3015x4 r12) {
        /*
            r10 = this;
            boolean r0 = r10.f4987g
            if (r0 == 0) goto L_0x0460
            boolean r0 = r10.f4986f
            r1 = 0
            if (r0 != 0) goto L_0x045a
            int[] r0 = r10.f4981a
            int r0 = r0.length
            r2 = 0
            r3 = r2
        L_0x000e:
            if (r3 >= r0) goto L_0x0450
            int r4 = r10.mo13636j(r3)
            int[] r5 = r10.f4981a
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
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x0308
        L_0x002d:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m5145o(r11, r4)
            goto L_0x0323
        L_0x003b:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m5144n(r11, r4)
            goto L_0x0334
        L_0x0049:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m5145o(r11, r4)
            goto L_0x0345
        L_0x0057:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m5144n(r11, r4)
            goto L_0x0358
        L_0x0065:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m5144n(r11, r4)
            goto L_0x036b
        L_0x0073:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m5144n(r11, r4)
            goto L_0x037e
        L_0x0081:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x038b
        L_0x0089:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x03a0
        L_0x0091:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x03b5
        L_0x0099:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = m5146p(r11, r4)
            goto L_0x03cc
        L_0x00a7:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m5144n(r11, r4)
            goto L_0x03df
        L_0x00b5:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m5145o(r11, r4)
            goto L_0x03f1
        L_0x00c3:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = m5144n(r11, r4)
            goto L_0x0403
        L_0x00d1:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m5145o(r11, r4)
            goto L_0x0415
        L_0x00df:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = m5145o(r11, r4)
            goto L_0x0427
        L_0x00ed:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = m5143m(r11, r4)
            goto L_0x0439
        L_0x00fb:
            boolean r5 = r10.mo13642u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = m5142l(r11, r4)
            goto L_0x0449
        L_0x0109:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r4)
            if (r4 != 0) goto L_0x0113
            goto L_0x044c
        L_0x0113:
            java.lang.Object r11 = r10.mo13624M(r3)
            b.l.a.c.e.i.j6 r11 = (p005b.p096l.p097a.p113c.p131e.p140i.C2835j6) r11
            throw r1
        L_0x011a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.e.i.z6 r6 = r10.mo13623L(r3)
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4630s(r5, r4, r12, r6)
            goto L_0x044c
        L_0x012d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4617f(r5, r4, r12, r8)
            goto L_0x044c
        L_0x013c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4622k(r5, r4, r12, r8)
            goto L_0x044c
        L_0x014b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4619h(r5, r4, r12, r8)
            goto L_0x044c
        L_0x015a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4624m(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0169:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4625n(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0178:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4621j(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0187:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4626o(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0196:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4623l(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01a5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4618g(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01b4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4620i(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01c3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4616e(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01d2:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4615d(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01e1:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4614c(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01f0:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4613b(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01ff:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4617f(r5, r4, r12, r2)
            goto L_0x044c
        L_0x020e:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4622k(r5, r4, r12, r2)
            goto L_0x044c
        L_0x021d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4619h(r5, r4, r12, r2)
            goto L_0x044c
        L_0x022c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4624m(r5, r4, r12, r2)
            goto L_0x044c
        L_0x023b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4625n(r5, r4, r12, r2)
            goto L_0x044c
        L_0x024a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4621j(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0259:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4628q(r5, r4, r12)
            goto L_0x044c
        L_0x0268:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.e.i.z6 r6 = r10.mo13623L(r3)
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4629r(r5, r4, r12, r6)
            goto L_0x044c
        L_0x027b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4627p(r5, r4, r12)
            goto L_0x044c
        L_0x028a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4626o(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0299:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4623l(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02a8:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4618g(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02b7:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4620i(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02c6:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4616e(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02d5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4615d(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02e4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4614c(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02f3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4613b(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0302:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x0308:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r4)
            b.l.a.c.e.i.z6 r5 = r10.mo13623L(r3)
            r12.mo13971f(r6, r4, r5)
            goto L_0x044c
        L_0x0317:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r11, r4)
        L_0x0323:
            r12.mo13969d(r6, r4)
            goto L_0x044c
        L_0x0328:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r11, r4)
        L_0x0334:
            r12.mo13968c(r6, r4)
            goto L_0x044c
        L_0x0339:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r11, r4)
        L_0x0345:
            b.l.a.c.e.i.w4 r7 = r12.f5136a
            r7.mo13775i(r6, r4)
            goto L_0x044c
        L_0x034c:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r11, r4)
        L_0x0358:
            b.l.a.c.e.i.w4 r5 = r12.f5136a
            r5.mo13773g(r6, r4)
            goto L_0x044c
        L_0x035f:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r11, r4)
        L_0x036b:
            b.l.a.c.e.i.w4 r5 = r12.f5136a
            r5.mo13771e(r6, r4)
            goto L_0x044c
        L_0x0372:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r11, r4)
        L_0x037e:
            b.l.a.c.e.i.w4 r5 = r12.f5136a
            r5.mo13772f(r6, r4)
            goto L_0x044c
        L_0x0385:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x038b:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r4)
            b.l.a.c.e.i.r4 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) r4
            b.l.a.c.e.i.w4 r5 = r12.f5136a
            r5.mo13778l(r6, r4)
            goto L_0x044c
        L_0x039a:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x03a0:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r4)
            b.l.a.c.e.i.z6 r5 = r10.mo13623L(r3)
            r12.mo13970e(r6, r4, r5)
            goto L_0x044c
        L_0x03af:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x03b5:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5537m(r11, r4)
            m5147y(r6, r4, r12)
            goto L_0x044c
        L_0x03c0:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5533i(r11, r4)
        L_0x03cc:
            b.l.a.c.e.i.w4 r5 = r12.f5136a
            r5.mo13776j(r6, r4)
            goto L_0x044c
        L_0x03d3:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r11, r4)
        L_0x03df:
            b.l.a.c.e.i.w4 r5 = r12.f5136a
            r5.mo13773g(r6, r4)
            goto L_0x044c
        L_0x03e5:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r11, r4)
        L_0x03f1:
            b.l.a.c.e.i.w4 r7 = r12.f5136a
            r7.mo13775i(r6, r4)
            goto L_0x044c
        L_0x03f7:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5530f(r11, r4)
        L_0x0403:
            b.l.a.c.e.i.w4 r5 = r12.f5136a
            r5.mo13771e(r6, r4)
            goto L_0x044c
        L_0x0409:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r11, r4)
        L_0x0415:
            b.l.a.c.e.i.w4 r7 = r12.f5136a
            r7.mo13774h(r6, r4)
            goto L_0x044c
        L_0x041b:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5531g(r11, r4)
        L_0x0427:
            b.l.a.c.e.i.w4 r7 = r12.f5136a
            r7.mo13774h(r6, r4)
            goto L_0x044c
        L_0x042d:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5534j(r11, r4)
        L_0x0439:
            r12.mo13966a(r6, r4)
            goto L_0x044c
        L_0x043d:
            boolean r5 = r10.mo13640s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5535k(r11, r4)
        L_0x0449:
            r12.mo13967b(r6, r4)
        L_0x044c:
            int r3 = r3 + 3
            goto L_0x000e
        L_0x0450:
            b.l.a.c.e.i.m7<?, ?> r0 = r10.f4992l
            java.lang.Object r11 = r0.mo13494d(r11)
            r0.mo13499i(r11, r12)
            return
        L_0x045a:
            b.l.a.c.e.i.c5<?> r12 = r10.f4993m
            r12.mo13264b(r11)
            throw r1
        L_0x0460:
            r10.mo13645x(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.mo13635i(java.lang.Object, b.l.a.c.e.i.x4):void");
    }

    /* renamed from: j */
    public final int mo13636j(int i) {
        return this.f4981a[i + 1];
    }

    /* renamed from: k */
    public final int mo13637k(int i) {
        return this.f4981a[i + 2];
    }

    /* renamed from: q */
    public final boolean mo13638q(T t, T t2, int i) {
        return mo13640s(t, i) == mo13640s(t2, i);
    }

    /* renamed from: r */
    public final boolean mo13639r(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? mo13640s(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: s */
    public final boolean mo13640s(T t, int i) {
        int[] iArr = this.f4981a;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j != 1048575) {
            return (C3005w7.m5530f(t, j) & (1 << (i2 >>> 20))) != 0;
        }
        int i3 = iArr[i + 1];
        long j2 = (long) (i3 & 1048575);
        switch ((i3 >>> 20) & 255) {
            case 0:
                return C3005w7.m5535k(t, j2) != ShadowDrawableWrapper.COS_45;
            case 1:
                return C3005w7.m5534j(t, j2) != 0.0f;
            case 2:
                return C3005w7.m5531g(t, j2) != 0;
            case 3:
                return C3005w7.m5531g(t, j2) != 0;
            case 4:
                return C3005w7.m5530f(t, j2) != 0;
            case 5:
                return C3005w7.m5531g(t, j2) != 0;
            case 6:
                return C3005w7.m5530f(t, j2) != 0;
            case 7:
                return C3005w7.m5533i(t, j2);
            case 8:
                Object m = C3005w7.m5537m(t, j2);
                if (m instanceof String) {
                    return !((String) m).isEmpty();
                }
                if (m instanceof C2937r4) {
                    return !C2937r4.f4977h.equals(m);
                }
                throw new IllegalArgumentException();
            case 9:
                return C3005w7.m5537m(t, j2) != null;
            case 10:
                return !C2937r4.f4977h.equals(C3005w7.m5537m(t, j2));
            case 11:
                return C3005w7.m5530f(t, j2) != 0;
            case 12:
                return C3005w7.m5530f(t, j2) != 0;
            case 13:
                return C3005w7.m5530f(t, j2) != 0;
            case 14:
                return C3005w7.m5531g(t, j2) != 0;
            case 15:
                return C3005w7.m5530f(t, j2) != 0;
            case 16:
                return C3005w7.m5531g(t, j2) != 0;
            case 17:
                return C3005w7.m5537m(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: t */
    public final void mo13641t(T t, int i) {
        int i2 = this.f4981a[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            C3005w7.f5113e.mo13800l(t, j, (1 << (i2 >>> 20)) | C3005w7.m5530f(t, j));
        }
    }

    /* renamed from: u */
    public final boolean mo13642u(T t, int i, int i2) {
        return C3005w7.m5530f(t, (long) (this.f4981a[i2 + 2] & 1048575)) == i;
    }

    /* renamed from: v */
    public final void mo13643v(T t, int i, int i2) {
        C3005w7.f5113e.mo13800l(t, (long) (this.f4981a[i2 + 2] & 1048575), i);
    }

    /* renamed from: w */
    public final int mo13644w(int i, int i2) {
        int length = (this.f4981a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f4981a[i4];
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
        p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4617f(r11, r6, r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a9, code lost:
        p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4622k(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b9, code lost:
        p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4619h(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c9, code lost:
        p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4624m(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d9, code lost:
        p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4625n(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e9, code lost:
        p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4621j(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13645x(T r17, p005b.p096l.p097a.p113c.p131e.p140i.C3015x4 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f4986f
            r4 = 0
            if (r3 != 0) goto L_0x0474
            int[] r3 = r0.f4981a
            int r3 = r3.length
            sun.misc.Unsafe r5 = f4980p
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r6
            r8 = 0
            r10 = 0
        L_0x0016:
            if (r8 >= r3) goto L_0x046a
            int r11 = r0.mo13636j(r8)
            int[] r12 = r0.f4981a
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
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.i.z6 r7 = r0.mo13623L(r8)
            r2.mo13971f(r13, r6, r7)
            goto L_0x029f
        L_0x0057:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = m5145o(r1, r6)
            r2.mo13969d(r13, r6)
            goto L_0x029f
        L_0x0066:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m5144n(r1, r6)
            r2.mo13968c(r13, r6)
            goto L_0x029f
        L_0x0075:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = m5145o(r1, r6)
            b.l.a.c.e.i.w4 r11 = r2.f5136a
            r11.mo13775i(r13, r6)
            goto L_0x029f
        L_0x0086:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m5144n(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13773g(r13, r6)
            goto L_0x029f
        L_0x0097:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m5144n(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13771e(r13, r6)
            goto L_0x029f
        L_0x00a8:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m5144n(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13772f(r13, r6)
            goto L_0x029f
        L_0x00b9:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.i.r4 r6 = (p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) r6
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13778l(r13, r6)
            goto L_0x029f
        L_0x00cc:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.i.z6 r7 = r0.mo13623L(r8)
            r2.mo13970e(r13, r6, r7)
            goto L_0x029f
        L_0x00df:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            m5147y(r13, r6, r2)
            goto L_0x029f
        L_0x00ee:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            boolean r6 = m5146p(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13776j(r13, r6)
            goto L_0x029f
        L_0x00ff:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m5144n(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13773g(r13, r6)
            goto L_0x029f
        L_0x0110:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = m5145o(r1, r6)
            b.l.a.c.e.i.w4 r11 = r2.f5136a
            r11.mo13775i(r13, r6)
            goto L_0x029f
        L_0x0121:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = m5144n(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13771e(r13, r6)
            goto L_0x029f
        L_0x0132:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = m5145o(r1, r6)
            b.l.a.c.e.i.w4 r11 = r2.f5136a
            r11.mo13774h(r13, r6)
            goto L_0x029f
        L_0x0143:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = m5145o(r1, r6)
            b.l.a.c.e.i.w4 r11 = r2.f5136a
            r11.mo13774h(r13, r6)
            goto L_0x029f
        L_0x0154:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            float r6 = m5143m(r1, r6)
            r2.mo13966a(r13, r6)
            goto L_0x029f
        L_0x0163:
            boolean r11 = r0.mo13642u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            double r6 = m5142l(r1, r6)
            r2.mo13967b(r13, r6)
            goto L_0x029f
        L_0x0172:
            java.lang.Object r6 = r5.getObject(r1, r6)
            if (r6 != 0) goto L_0x017a
            goto L_0x029f
        L_0x017a:
            java.lang.Object r1 = r0.mo13624M(r8)
            b.l.a.c.e.i.j6 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2835j6) r1
            throw r4
        L_0x0181:
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.e.i.z6 r7 = r0.mo13623L(r8)
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4630s(r11, r6, r2, r7)
            goto L_0x029f
        L_0x0194:
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 1
        L_0x019f:
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4617f(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01a4:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
        L_0x01a9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4622k(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01b4:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
        L_0x01b9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4619h(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01c4:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
        L_0x01c9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4624m(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01d4:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
        L_0x01d9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4625n(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01e4:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
        L_0x01e9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4621j(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01f4:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4626o(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0204:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4623l(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0214:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4618g(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0224:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4620i(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0233:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4616e(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0242:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4615d(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0251:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4614c(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0260:
            r12 = 1
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4613b(r11, r6, r2, r12)
            goto L_0x029f
        L_0x026f:
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 0
            goto L_0x019f
        L_0x027c:
            r12 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            goto L_0x01a9
        L_0x0283:
            r12 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            goto L_0x01b9
        L_0x028a:
            r12 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            goto L_0x01c9
        L_0x0291:
            r12 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            goto L_0x01d9
        L_0x0298:
            r12 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            goto L_0x01e9
        L_0x029f:
            r14 = 0
            goto L_0x0463
        L_0x02a2:
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4628q(r11, r6, r2)
            goto L_0x029f
        L_0x02b0:
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.e.i.z6 r7 = r0.mo13623L(r8)
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4629r(r11, r6, r2, r7)
            goto L_0x029f
        L_0x02c2:
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4627p(r11, r6, r2)
            goto L_0x029f
        L_0x02d0:
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4626o(r11, r6, r2, r14)
            goto L_0x0463
        L_0x02e0:
            r14 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4623l(r11, r6, r2, r14)
            goto L_0x0463
        L_0x02f0:
            r14 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4618g(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0300:
            r14 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4620i(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0310:
            r14 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4616e(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0320:
            r14 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4615d(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0330:
            r14 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4614c(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0340:
            r14 = 0
            int[] r11 = r0.f4981a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            p005b.p096l.p097a.p113c.p131e.p140i.C2728b7.m4613b(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0350:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.i.z6 r7 = r0.mo13623L(r8)
            r2.mo13971f(r13, r6, r7)
            goto L_0x0463
        L_0x0362:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            r2.mo13969d(r13, r6)
            goto L_0x0463
        L_0x0370:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            r2.mo13968c(r13, r6)
            goto L_0x0463
        L_0x037e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.e.i.w4 r11 = r2.f5136a
            r11.mo13775i(r13, r6)
            goto L_0x0463
        L_0x038e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13773g(r13, r6)
            goto L_0x0463
        L_0x039e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13771e(r13, r6)
            goto L_0x0463
        L_0x03ae:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13772f(r13, r6)
            goto L_0x0463
        L_0x03be:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.i.r4 r6 = (p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) r6
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13778l(r13, r6)
            goto L_0x0463
        L_0x03d0:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.e.i.z6 r7 = r0.mo13623L(r8)
            r2.mo13970e(r13, r6, r7)
            goto L_0x0463
        L_0x03e2:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            m5147y(r13, r6, r2)
            goto L_0x0463
        L_0x03f0:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            boolean r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5533i(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13776j(r13, r6)
            goto L_0x0463
        L_0x03ff:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13773g(r13, r6)
            goto L_0x0463
        L_0x040e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.e.i.w4 r11 = r2.f5136a
            r11.mo13775i(r13, r6)
            goto L_0x0463
        L_0x041d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.e.i.w4 r7 = r2.f5136a
            r7.mo13771e(r13, r6)
            goto L_0x0463
        L_0x042c:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.e.i.w4 r11 = r2.f5136a
            r11.mo13774h(r13, r6)
            goto L_0x0463
        L_0x043b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.e.i.w4 r11 = r2.f5136a
            r11.mo13774h(r13, r6)
            goto L_0x0463
        L_0x044a:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            float r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5534j(r1, r6)
            r2.mo13966a(r13, r6)
            goto L_0x0463
        L_0x0457:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            double r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3005w7.m5535k(r1, r6)
            r2.mo13967b(r13, r6)
        L_0x0463:
            int r8 = r8 + 3
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0016
        L_0x046a:
            b.l.a.c.e.i.m7<?, ?> r3 = r0.f4992l
            java.lang.Object r1 = r3.mo13494d(r1)
            r3.mo13499i(r1, r2)
            return
        L_0x0474:
            b.l.a.c.e.i.c5<?> r2 = r0.f4993m
            r2.mo13264b(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2939r6.mo13645x(java.lang.Object, b.l.a.c.e.i.x4):void");
    }
}
