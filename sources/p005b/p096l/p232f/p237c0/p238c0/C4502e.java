package p005b.p096l.p232f.p237c0.p238c0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.C4626t;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.c0.e */
public final class C4502e extends C4498a {

    /* renamed from: i */
    public static final int[] f8389i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    public static final int[] f8390j = {4, 20, 48, 81};

    /* renamed from: k */
    public static final int[] f8391k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    public static final int[] f8392l = {0, 336, 1036, 1516};

    /* renamed from: m */
    public static final int[] f8393m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    public static final int[] f8394n = {2, 4, 6, 8};

    /* renamed from: o */
    public static final int[][] f8395o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    public final List<C4501d> f8396g = new ArrayList();

    /* renamed from: h */
    public final List<C4501d> f8397h = new ArrayList();

    /* renamed from: m */
    public static void m8269m(Collection<C4501d> collection, C4501d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator<C4501d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4501d next = it.next();
                if (next.f8382a == dVar.f8382a) {
                    next.f8388d++;
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* renamed from: c */
    public void mo16154c() {
        this.f8396g.clear();
        this.f8397h.clear();
    }

    /* renamed from: d */
    public C4623q mo16159d(int i, C4657a aVar, Map<C4577e, ?> map) {
        m8269m(this.f8396g, mo16174o(aVar, false, i, map));
        aVar.mo16329k();
        m8269m(this.f8397h, mo16174o(aVar, true, i, map));
        aVar.mo16329k();
        for (C4501d next : this.f8396g) {
            if (next.f8388d > 1) {
                for (C4501d next2 : this.f8397h) {
                    if (next2.f8388d > 1) {
                        int i2 = ((next2.f8383b * 16) + next.f8383b) % 79;
                        int i3 = (next.f8387c.f8384a * 9) + next2.f8387c.f8384a;
                        if (i3 > 72) {
                            i3--;
                        }
                        if (i3 > 8) {
                            i3--;
                        }
                        if (i2 == i3) {
                            String valueOf = String.valueOf((((long) next.f8382a) * 4537077) + ((long) next2.f8382a));
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(valueOf);
                            int i4 = 0;
                            for (int i5 = 0; i5 < 13; i5++) {
                                int charAt = sb.charAt(i5) - '0';
                                if ((i5 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i4 += charAt;
                            }
                            int i6 = 10 - (i4 % 10);
                            if (i6 == 10) {
                                i6 = 0;
                            }
                            sb.append(i6);
                            C4625s[] sVarArr = next.f8387c.f8386c;
                            C4625s[] sVarArr2 = next2.f8387c.f8386c;
                            return new C4623q(sb.toString(), (byte[]) null, new C4625s[]{sVarArr[0], sVarArr[1], sVarArr2[0], sVarArr2[1]}, C4484a.RSS_14);
                        }
                    }
                }
                continue;
            }
        }
        throw C4619m.f8685i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
        if (r4 < 4) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r4 < 4) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r15 = false;
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        r14 = false;
        r15 = false;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p232f.p237c0.p238c0.C4499b mo16173n(p005b.p096l.p232f.p258y.C4657a r18, p005b.p096l.p232f.p237c0.p238c0.C4500c r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int[] r4 = r0.f8377b
            r5 = 0
            r6 = r5
        L_0x000c:
            int r7 = r4.length
            if (r6 >= r7) goto L_0x0014
            r4[r6] = r5
            int r6 = r6 + 1
            goto L_0x000c
        L_0x0014:
            r6 = 1
            if (r3 == 0) goto L_0x001f
            int[] r2 = r2.f8385b
            r2 = r2[r5]
            p005b.p096l.p232f.p237c0.C4541r.m8351h(r1, r2, r4)
            goto L_0x0039
        L_0x001f:
            int[] r2 = r2.f8385b
            r2 = r2[r6]
            int r2 = r2 + r6
            p005b.p096l.p232f.p237c0.C4541r.m8350g(r1, r2, r4)
            int r1 = r4.length
            int r1 = r1 - r6
            r2 = r5
        L_0x002a:
            if (r2 >= r1) goto L_0x0039
            r7 = r4[r2]
            r8 = r4[r1]
            r4[r2] = r8
            r4[r1] = r7
            int r2 = r2 + 1
            int r1 = r1 + -1
            goto L_0x002a
        L_0x0039:
            if (r3 == 0) goto L_0x003e
            r1 = 16
            goto L_0x0040
        L_0x003e:
            r1 = 15
        L_0x0040:
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2735N0(r4)
            float r2 = (float) r2
            float r7 = (float) r1
            float r2 = r2 / r7
            int[] r7 = r0.f8380e
            int[] r8 = r0.f8381f
            float[] r9 = r0.f8378c
            float[] r10 = r0.f8379d
            r11 = r5
        L_0x0050:
            int r12 = r4.length
            if (r11 >= r12) goto L_0x007a
            r12 = r4[r11]
            float r12 = (float) r12
            float r12 = r12 / r2
            r13 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r12
            int r13 = (int) r13
            r14 = 8
            if (r13 > 0) goto L_0x0061
            r13 = r6
            goto L_0x0064
        L_0x0061:
            if (r13 <= r14) goto L_0x0064
            r13 = r14
        L_0x0064:
            int r14 = r11 / 2
            r15 = r11 & 1
            if (r15 != 0) goto L_0x0071
            r7[r14] = r13
            float r13 = (float) r13
            float r12 = r12 - r13
            r9[r14] = r12
            goto L_0x0077
        L_0x0071:
            r8[r14] = r13
            float r13 = (float) r13
            float r12 = r12 - r13
            r10[r14] = r12
        L_0x0077:
            int r11 = r11 + 1
            goto L_0x0050
        L_0x007a:
            int[] r2 = r0.f8380e
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2735N0(r2)
            int[] r4 = r0.f8381f
            int r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2735N0(r4)
            r9 = 12
            r10 = 4
            r11 = 10
            if (r3 == 0) goto L_0x009e
            if (r2 <= r9) goto L_0x0092
            r13 = r5
            r12 = r6
            goto L_0x0098
        L_0x0092:
            r12 = r5
            if (r2 >= r10) goto L_0x0097
            r13 = r6
            goto L_0x0098
        L_0x0097:
            r13 = r12
        L_0x0098:
            if (r4 <= r9) goto L_0x009b
            goto L_0x00af
        L_0x009b:
            if (r4 >= r10) goto L_0x00b7
            goto L_0x00b4
        L_0x009e:
            r12 = 11
            if (r2 <= r12) goto L_0x00a5
            r13 = r5
            r12 = r6
            goto L_0x00ad
        L_0x00a5:
            r12 = 5
            if (r2 >= r12) goto L_0x00ab
            r12 = r5
            r13 = r6
            goto L_0x00ad
        L_0x00ab:
            r12 = r5
            r13 = r12
        L_0x00ad:
            if (r4 <= r11) goto L_0x00b2
        L_0x00af:
            r14 = r5
            r15 = r6
            goto L_0x00b9
        L_0x00b2:
            if (r4 >= r10) goto L_0x00b7
        L_0x00b4:
            r15 = r5
            r14 = r6
            goto L_0x00b9
        L_0x00b7:
            r14 = r5
            r15 = r14
        L_0x00b9:
            int r16 = r2 + r4
            int r1 = r16 - r1
            r11 = r2 & 1
            if (r11 != r3) goto L_0x00c3
            r11 = r6
            goto L_0x00c4
        L_0x00c3:
            r11 = r5
        L_0x00c4:
            r5 = r4 & 1
            if (r5 != r6) goto L_0x00ca
            r5 = r6
            goto L_0x00cb
        L_0x00ca:
            r5 = 0
        L_0x00cb:
            r10 = -1
            if (r1 == r10) goto L_0x00fa
            if (r1 == 0) goto L_0x00e5
            if (r1 != r6) goto L_0x00e2
            if (r11 == 0) goto L_0x00db
            if (r5 != 0) goto L_0x00d8
            r12 = r6
            goto L_0x0106
        L_0x00d8:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x00db:
            if (r5 == 0) goto L_0x00df
            r15 = r6
            goto L_0x0106
        L_0x00df:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x00e2:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x00e5:
            if (r11 == 0) goto L_0x00f4
            if (r5 == 0) goto L_0x00f1
            if (r2 >= r4) goto L_0x00ee
            r13 = r6
            r15 = r13
            goto L_0x0106
        L_0x00ee:
            r12 = r6
            r14 = r12
            goto L_0x0106
        L_0x00f1:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x00f4:
            if (r5 != 0) goto L_0x00f7
            goto L_0x0106
        L_0x00f7:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x00fa:
            if (r11 == 0) goto L_0x0103
            if (r5 != 0) goto L_0x0100
            r13 = r6
            goto L_0x0106
        L_0x0100:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x0103:
            if (r5 == 0) goto L_0x01be
            r14 = r6
        L_0x0106:
            if (r13 == 0) goto L_0x0115
            if (r12 != 0) goto L_0x0112
            int[] r1 = r0.f8380e
            float[] r2 = r0.f8378c
            p005b.p096l.p232f.p237c0.p238c0.C4498a.m8266j(r1, r2)
            goto L_0x0115
        L_0x0112:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x0115:
            if (r12 == 0) goto L_0x011e
            int[] r1 = r0.f8380e
            float[] r2 = r0.f8378c
            p005b.p096l.p232f.p237c0.p238c0.C4498a.m8265i(r1, r2)
        L_0x011e:
            if (r14 == 0) goto L_0x012d
            if (r15 != 0) goto L_0x012a
            int[] r1 = r0.f8381f
            float[] r2 = r0.f8378c
            p005b.p096l.p232f.p237c0.p238c0.C4498a.m8266j(r1, r2)
            goto L_0x012d
        L_0x012a:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x012d:
            if (r15 == 0) goto L_0x0136
            int[] r1 = r0.f8381f
            float[] r2 = r0.f8379d
            p005b.p096l.p232f.p237c0.p238c0.C4498a.m8265i(r1, r2)
        L_0x0136:
            int r1 = r7.length
            int r1 = r1 - r6
            r2 = 0
            r4 = 0
        L_0x013a:
            if (r1 < 0) goto L_0x0147
            int r2 = r2 * 9
            r5 = r7[r1]
            int r2 = r2 + r5
            r5 = r7[r1]
            int r4 = r4 + r5
            int r1 = r1 + -1
            goto L_0x013a
        L_0x0147:
            int r1 = r8.length
            int r1 = r1 - r6
            r5 = 0
            r10 = 0
        L_0x014b:
            if (r1 < 0) goto L_0x0158
            int r5 = r5 * 9
            r11 = r8[r1]
            int r5 = r5 + r11
            r11 = r8[r1]
            int r10 = r10 + r11
            int r1 = r1 + -1
            goto L_0x014b
        L_0x0158:
            int r5 = r5 * 3
            int r5 = r5 + r2
            if (r3 == 0) goto L_0x018c
            r1 = r4 & 1
            if (r1 != 0) goto L_0x0189
            if (r4 > r9) goto L_0x0189
            r1 = 4
            if (r4 < r1) goto L_0x0189
            int r9 = r9 - r4
            int r9 = r9 / 2
            int[] r1 = f8393m
            r1 = r1[r9]
            int r2 = 9 - r1
            r3 = 0
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2758V(r7, r1, r3)
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2758V(r8, r2, r6)
            int[] r3 = f8389i
            r3 = r3[r9]
            int[] r4 = f8391k
            r4 = r4[r9]
            b.l.f.c0.c0.b r6 = new b.l.f.c0.c0.b
            int r1 = r1 * r3
            int r1 = r1 + r2
            int r1 = r1 + r4
            r6.<init>(r1, r5)
            return r6
        L_0x0189:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x018c:
            r1 = r10 & 1
            if (r1 != 0) goto L_0x01bb
            r1 = 10
            if (r10 > r1) goto L_0x01bb
            r2 = 4
            if (r10 < r2) goto L_0x01bb
            int r11 = 10 - r10
            int r11 = r11 / 2
            int[] r1 = f8394n
            r1 = r1[r11]
            int r2 = 9 - r1
            int r1 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2758V(r7, r1, r6)
            r3 = 0
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2758V(r8, r2, r3)
            int[] r3 = f8390j
            r3 = r3[r11]
            int[] r4 = f8392l
            r4 = r4[r11]
            b.l.f.c0.c0.b r6 = new b.l.f.c0.c0.b
            int r2 = r2 * r3
            int r2 = r2 + r1
            int r2 = r2 + r4
            r6.<init>(r2, r5)
            return r6
        L_0x01bb:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        L_0x01be:
            b.l.f.m r1 = p005b.p096l.p232f.C4619m.f8685i
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p232f.p237c0.p238c0.C4502e.mo16173n(b.l.f.y.a, b.l.f.c0.c0.c, boolean):b.l.f.c0.c0.b");
    }

    /* renamed from: o */
    public final C4501d mo16174o(C4657a aVar, boolean z, int i, Map<C4577e, ?> map) {
        try {
            int[] p = mo16175p(aVar, z);
            C4500c q = mo16176q(aVar, i, z, p);
            C4626t tVar = map == null ? null : (C4626t) map.get(C4577e.NEED_RESULT_POINT_CALLBACK);
            if (tVar != null) {
                float f = ((float) (p[0] + p[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.f8786h - 1)) - f;
                }
                tVar.mo16288a(new C4625s(f, (float) i));
            }
            C4499b n = mo16173n(aVar, q, true);
            C4499b n2 = mo16173n(aVar, q, false);
            return new C4501d((n.f8382a * 1597) + n2.f8382a, (n2.f8383b * 4) + n.f8383b, q);
        } catch (C4619m unused) {
            return null;
        }
    }

    /* renamed from: p */
    public final int[] mo16175p(C4657a aVar, boolean z) {
        int[] iArr = this.f8376a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i = aVar.f8786h;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < i) {
            z2 = !aVar.mo16323f(i2);
            if (z == z2) {
                break;
            }
            i2++;
        }
        int i3 = 0;
        int i4 = i2;
        while (i2 < i) {
            if (aVar.mo16323f(i2) != z2) {
                iArr[i3] = iArr[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else if (C4498a.m8267k(iArr)) {
                    return new int[]{i4, i2};
                } else {
                    i4 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i3--;
                }
                iArr[i3] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: q */
    public final C4500c mo16176q(C4657a aVar, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean f = aVar.mo16323f(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && f != aVar.mo16323f(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] iArr2 = this.f8376a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = iArr[0] - i5;
        int l = C4498a.m8268l(iArr2, f8395o);
        int i6 = iArr[1];
        if (z) {
            int i7 = aVar.f8786h;
            i2 = (i7 - 1) - i6;
            i3 = (i7 - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new C4500c(l, new int[]{i5, iArr[1]}, i3, i2, i);
    }
}
