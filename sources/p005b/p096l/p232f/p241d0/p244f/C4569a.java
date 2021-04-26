package p005b.p096l.p232f.p241d0.p244f;

import java.util.Arrays;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.d0.f.a */
public final class C4569a {

    /* renamed from: a */
    public static final int[] f8544a = {0, 4, 1, 5};

    /* renamed from: b */
    public static final int[] f8545b = {6, 2, 7, 3};

    /* renamed from: c */
    public static final int[] f8546c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    public static final int[] f8547d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r12 == 0) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        r1 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        if (r1.hasNext() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        r2 = (p005b.p096l.p232f.C4625s[]) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r2[1] == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r10 = (int) java.lang.Math.max((float) r10, r2[1].f8709b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r2[3] == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        r10 = java.lang.Math.max(r10, (int) r2[3].f8709b);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<p005b.p096l.p232f.C4625s[]> m8427a(boolean r17, p005b.p096l.p232f.p258y.C4658b r18) {
        /*
            r6 = r18
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 1
            r9 = 0
            r10 = r9
            r11 = r10
        L_0x000b:
            r12 = r11
        L_0x000c:
            int r13 = r6.f8788h
            if (r10 >= r13) goto L_0x00bb
            int r14 = r6.f8787g
            r0 = 8
            b.l.f.s[] r15 = new p005b.p096l.p232f.C4625s[r0]
            int[] r5 = f8546c
            r0 = r18
            r1 = r13
            r2 = r14
            r3 = r10
            r4 = r11
            b.l.f.s[] r0 = m8429c(r0, r1, r2, r3, r4, r5)
            int[] r1 = f8544a
            r2 = r9
        L_0x0025:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0031
            r3 = r1[r2]
            r4 = r0[r2]
            r15[r3] = r4
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0031:
            r16 = 4
            r0 = r15[r16]
            if (r0 == 0) goto L_0x0044
            r0 = r15[r16]
            float r0 = r0.f8708a
            int r0 = (int) r0
            r1 = r15[r16]
            float r1 = r1.f8709b
            int r1 = (int) r1
            r4 = r0
            r3 = r1
            goto L_0x0046
        L_0x0044:
            r3 = r10
            r4 = r11
        L_0x0046:
            int[] r5 = f8547d
            r0 = r18
            r1 = r13
            r2 = r14
            b.l.f.s[] r0 = m8429c(r0, r1, r2, r3, r4, r5)
            int[] r1 = f8545b
            r2 = r9
        L_0x0053:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x005f
            r3 = r1[r2]
            r4 = r0[r2]
            r15[r3] = r4
            int r2 = r2 + 1
            goto L_0x0053
        L_0x005f:
            r0 = r15[r9]
            if (r0 != 0) goto L_0x009c
            r0 = 3
            r1 = r15[r0]
            if (r1 != 0) goto L_0x009c
            if (r12 == 0) goto L_0x00bb
            java.util.Iterator r1 = r7.iterator()
        L_0x006e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r1.next()
            b.l.f.s[] r2 = (p005b.p096l.p232f.C4625s[]) r2
            r3 = r2[r8]
            if (r3 == 0) goto L_0x0088
            float r3 = (float) r10
            r4 = r2[r8]
            float r4 = r4.f8709b
            float r3 = java.lang.Math.max(r3, r4)
            int r10 = (int) r3
        L_0x0088:
            r3 = r2[r0]
            if (r3 == 0) goto L_0x006e
            r2 = r2[r0]
            float r2 = r2.f8709b
            int r2 = (int) r2
            int r2 = java.lang.Math.max(r10, r2)
            r10 = r2
            goto L_0x006e
        L_0x0097:
            int r10 = r10 + 5
            r11 = r9
            goto L_0x000b
        L_0x009c:
            r7.add(r15)
            if (r17 == 0) goto L_0x00bb
            r0 = 2
            r1 = r15[r0]
            if (r1 == 0) goto L_0x00ae
            r1 = r15[r0]
            float r1 = r1.f8708a
            int r11 = (int) r1
            r0 = r15[r0]
            goto L_0x00b5
        L_0x00ae:
            r0 = r15[r16]
            float r0 = r0.f8708a
            int r11 = (int) r0
            r0 = r15[r16]
        L_0x00b5:
            float r0 = r0.f8709b
            int r10 = (int) r0
            r12 = r8
            goto L_0x000c
        L_0x00bb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p241d0.p244f.C4569a.m8427a(boolean, b.l.f.y.b):java.util.List");
    }

    /* renamed from: b */
    public static int[] m8428b(C4658b bVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bVar.mo16333b(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (bVar.mo16333b(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else if (m8430d(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6 = i8;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m8430d(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: c */
    public static C4625s[] m8429c(C4658b bVar, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        C4625s[] sVarArr = new C4625s[4];
        int[] iArr2 = new int[iArr.length];
        int i9 = i3;
        while (true) {
            if (i9 >= i8) {
                z = false;
                break;
            }
            int[] b = m8428b(bVar, i4, i9, i2, false, iArr, iArr2);
            if (b != null) {
                int i10 = i9;
                int[] iArr3 = b;
                int i11 = i10;
                while (true) {
                    if (i11 <= 0) {
                        i7 = i11;
                        break;
                    }
                    int i12 = i11 - 1;
                    int[] b2 = m8428b(bVar, i4, i12, i2, false, iArr, iArr2);
                    if (b2 == null) {
                        i7 = i12 + 1;
                        break;
                    }
                    iArr3 = b2;
                    i11 = i12;
                }
                float f = (float) i7;
                sVarArr[0] = new C4625s((float) iArr3[0], f);
                sVarArr[1] = new C4625s((float) iArr3[1], f);
                z = true;
                i9 = i7;
            } else {
                i9 += 5;
            }
        }
        int i13 = i9 + 1;
        if (z) {
            int[] iArr4 = {(int) sVarArr[0].f8708a, (int) sVarArr[1].f8708a};
            int i14 = i13;
            int i15 = 0;
            while (true) {
                if (i14 >= i8) {
                    i5 = i15;
                    i6 = i14;
                    break;
                }
                i5 = i15;
                i6 = i14;
                int[] b3 = m8428b(bVar, iArr4[0], i14, i2, false, iArr, iArr2);
                if (b3 == null || Math.abs(iArr4[0] - b3[0]) >= 5 || Math.abs(iArr4[1] - b3[1]) >= 5) {
                    if (i5 > 25) {
                        break;
                    }
                    i15 = i5 + 1;
                } else {
                    iArr4 = b3;
                    i15 = 0;
                }
                i14 = i6 + 1;
            }
            i13 = i6 - (i5 + 1);
            float f2 = (float) i13;
            sVarArr[2] = new C4625s((float) iArr4[0], f2);
            sVarArr[3] = new C4625s((float) iArr4[1], f2);
        }
        if (i13 - i9 < 10) {
            Arrays.fill(sVarArr, (Object) null);
        }
        return sVarArr;
    }

    /* renamed from: d */
    public static float m8430d(int[] iArr, int[] iArr2, float f) {
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
}
