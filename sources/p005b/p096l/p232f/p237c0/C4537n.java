package p005b.p096l.p232f.p237c0;

import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.n */
public final class C4537n extends C4541r {

    /* renamed from: b */
    public static final int[] f8460b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    public static final int[] f8461c = {1, 1, 1, 1};

    /* renamed from: d */
    public static final int[][] f8462d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    public static final int[][] f8463e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    public int f8464a = -1;

    /* renamed from: i */
    public static int m8339i(int[] iArr) {
        int length = f8463e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = C4541r.m8349f(iArr, f8463e[i2], 0.5f);
            if (f2 < f) {
                i = i2;
                f = f2;
            } else if (f2 == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: j */
    public static int[] m8340j(C4657a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i2 = aVar.f8786h;
        int i3 = i;
        boolean z = false;
        int i4 = 0;
        while (i < i2) {
            if (aVar.mo16323f(i) != z) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else if (C4541r.m8349f(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i3, i};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = i4 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i4 = i5;
                }
                iArr2[i4] = 1;
                z = !z;
            }
            i++;
        }
        throw C4619m.f8685i;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r6 = m8340j(r2, r7, f8462d[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0038 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p232f.C4623q mo16159d(int r19, p005b.p096l.p232f.p258y.C4657a r20, java.util.Map<p005b.p096l.p232f.C4577e, ?> r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            r0 = r21
            int r3 = r2.f8786h
            r4 = 0
            int r5 = r2.mo16324g(r4)
            if (r5 == r3) goto L_0x00ff
            int[] r3 = f8461c
            int[] r3 = m8340j(r2, r5, r3)
            r5 = 1
            r6 = r3[r5]
            r7 = r3[r4]
            int r6 = r6 - r7
            int r6 = r6 / 4
            r1.f8464a = r6
            r6 = r3[r4]
            r1.mo16203k(r2, r6)
            r20.mo16329k()
            int r6 = r2.f8786h     // Catch:{ all -> 0x00fa }
            int r7 = r2.mo16324g(r4)     // Catch:{ all -> 0x00fa }
            if (r7 == r6) goto L_0x00f7
            int[][] r6 = f8462d     // Catch:{ m -> 0x0038 }
            r6 = r6[r4]     // Catch:{ m -> 0x0038 }
            int[] r6 = m8340j(r2, r7, r6)     // Catch:{ m -> 0x0038 }
            goto L_0x0040
        L_0x0038:
            int[][] r6 = f8462d     // Catch:{ all -> 0x00fa }
            r6 = r6[r5]     // Catch:{ all -> 0x00fa }
            int[] r6 = m8340j(r2, r7, r6)     // Catch:{ all -> 0x00fa }
        L_0x0040:
            r7 = r6[r4]     // Catch:{ all -> 0x00fa }
            r1.mo16203k(r2, r7)     // Catch:{ all -> 0x00fa }
            r7 = r6[r4]     // Catch:{ all -> 0x00fa }
            int r8 = r2.f8786h     // Catch:{ all -> 0x00fa }
            r9 = r6[r5]     // Catch:{ all -> 0x00fa }
            int r9 = r8 - r9
            r6[r4] = r9     // Catch:{ all -> 0x00fa }
            int r8 = r8 - r7
            r6[r5] = r8     // Catch:{ all -> 0x00fa }
            r20.mo16329k()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 20
            r7.<init>(r8)
            r8 = r3[r5]
            r9 = r6[r4]
            r10 = 10
            int[] r11 = new int[r10]
            r12 = 5
            int[] r13 = new int[r12]
            int[] r14 = new int[r12]
        L_0x0069:
            if (r8 >= r9) goto L_0x009e
            p005b.p096l.p232f.p237c0.C4541r.m8350g(r2, r8, r11)
            r15 = r4
        L_0x006f:
            if (r15 >= r12) goto L_0x0080
            int r16 = r15 * 2
            r17 = r11[r16]
            r13[r15] = r17
            int r16 = r16 + 1
            r16 = r11[r16]
            r14[r15] = r16
            int r15 = r15 + 1
            goto L_0x006f
        L_0x0080:
            int r15 = m8339i(r13)
            int r15 = r15 + 48
            char r15 = (char) r15
            r7.append(r15)
            int r15 = m8339i(r14)
            int r15 = r15 + 48
            char r15 = (char) r15
            r7.append(r15)
            r15 = r4
        L_0x0095:
            if (r15 >= r10) goto L_0x0069
            r16 = r11[r15]
            int r8 = r8 + r16
            int r15 = r15 + 1
            goto L_0x0095
        L_0x009e:
            java.lang.String r2 = r7.toString()
            r7 = 0
            if (r0 == 0) goto L_0x00ae
            b.l.f.e r8 = p005b.p096l.p232f.C4577e.ALLOWED_LENGTHS
            java.lang.Object r0 = r0.get(r8)
            int[] r0 = (int[]) r0
            goto L_0x00af
        L_0x00ae:
            r0 = r7
        L_0x00af:
            if (r0 != 0) goto L_0x00b3
            int[] r0 = f8460b
        L_0x00b3:
            int r8 = r2.length()
            int r9 = r0.length
            r10 = r4
            r11 = r10
        L_0x00ba:
            if (r10 >= r9) goto L_0x00c8
            r12 = r0[r10]
            if (r8 != r12) goto L_0x00c2
            r0 = r5
            goto L_0x00c9
        L_0x00c2:
            if (r12 <= r11) goto L_0x00c5
            r11 = r12
        L_0x00c5:
            int r10 = r10 + 1
            goto L_0x00ba
        L_0x00c8:
            r0 = r4
        L_0x00c9:
            if (r0 != 0) goto L_0x00ce
            if (r8 <= r11) goto L_0x00ce
            r0 = r5
        L_0x00ce:
            if (r0 == 0) goto L_0x00f2
            b.l.f.q r0 = new b.l.f.q
            r8 = 2
            b.l.f.s[] r8 = new p005b.p096l.p232f.C4625s[r8]
            b.l.f.s r9 = new b.l.f.s
            r3 = r3[r5]
            float r3 = (float) r3
            r10 = r19
            float r10 = (float) r10
            r9.<init>(r3, r10)
            r8[r4] = r9
            b.l.f.s r3 = new b.l.f.s
            r4 = r6[r4]
            float r4 = (float) r4
            r3.<init>(r4, r10)
            r8[r5] = r3
            b.l.f.a r3 = p005b.p096l.p232f.C4484a.ITF
            r0.<init>(r2, r7, r8, r3)
            return r0
        L_0x00f2:
            b.l.f.h r0 = p005b.p096l.p232f.C4614h.m8506a()
            throw r0
        L_0x00f7:
            b.l.f.m r0 = p005b.p096l.p232f.C4619m.f8685i     // Catch:{ all -> 0x00fa }
            throw r0     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r0 = move-exception
            r20.mo16329k()
            throw r0
        L_0x00ff:
            b.l.f.m r0 = p005b.p096l.p232f.C4619m.f8685i
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p237c0.C4537n.mo16159d(int, b.l.f.y.a, java.util.Map):b.l.f.q");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16203k(p005b.p096l.p232f.p258y.C4657a r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f8464a
            int r0 = r0 * 10
            if (r0 >= r4) goto L_0x0007
            goto L_0x0008
        L_0x0007:
            r0 = r4
        L_0x0008:
            int r4 = r4 + -1
            if (r0 <= 0) goto L_0x0017
            if (r4 < 0) goto L_0x0017
            boolean r1 = r3.mo16323f(r4)
            if (r1 != 0) goto L_0x0017
            int r0 = r0 + -1
            goto L_0x0008
        L_0x0017:
            if (r0 != 0) goto L_0x001a
            return
        L_0x001a:
            b.l.f.m r3 = p005b.p096l.p232f.C4619m.f8685i
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p237c0.C4537n.mo16203k(b.l.f.y.a, int):void");
    }
}
