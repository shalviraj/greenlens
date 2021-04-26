package p005b.p082j.p083a.p084a.p088r;

import androidx.exifinterface.media.ExifInterface;
import androidx.media.AudioAttributesCompat;
import java.io.IOException;
import java.io.InputStream;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p082j.p083a.p084a.C1519e;
import p005b.p082j.p083a.p084a.C1520f;
import p005b.p082j.p083a.p084a.C1521g;
import p005b.p082j.p083a.p084a.C1525j;
import p005b.p082j.p083a.p084a.C1526k;
import p005b.p082j.p083a.p084a.p085o.C1531b;
import p005b.p082j.p083a.p084a.p085o.C1532c;
import p005b.p082j.p083a.p084a.p087q.C1535a;
import p005b.p082j.p083a.p084a.p087q.C1537b;
import p005b.p082j.p083a.p084a.p089s.C1554a;
import p005b.p082j.p083a.p084a.p090t.C1568h;

/* renamed from: b.j.a.a.r.h */
public class C1553h extends C1531b {

    /* renamed from: T */
    public static final int f2543T = C1521g.C1522a.ALLOW_TRAILING_COMMA.f2382h;

    /* renamed from: U */
    public static final int f2544U = C1521g.C1522a.ALLOW_NUMERIC_LEADING_ZEROS.f2382h;

    /* renamed from: V */
    public static final int f2545V = C1521g.C1522a.ALLOW_NON_NUMERIC_NUMBERS.f2382h;

    /* renamed from: W */
    public static final int f2546W = C1521g.C1522a.ALLOW_MISSING_VALUES.f2382h;

    /* renamed from: X */
    public static final int f2547X = C1521g.C1522a.ALLOW_SINGLE_QUOTES.f2382h;

    /* renamed from: Y */
    public static final int f2548Y = C1521g.C1522a.ALLOW_UNQUOTED_FIELD_NAMES.f2382h;

    /* renamed from: Z */
    public static final int f2549Z = C1521g.C1522a.ALLOW_COMMENTS.f2382h;

    /* renamed from: a0 */
    public static final int f2550a0 = C1521g.C1522a.ALLOW_YAML_COMMENTS.f2382h;

    /* renamed from: b0 */
    public static final int[] f2551b0 = C1535a.f2444d;

    /* renamed from: c0 */
    public static final int[] f2552c0 = C1535a.f2443c;

    /* renamed from: L */
    public final C1554a f2553L;

    /* renamed from: M */
    public int[] f2554M = new int[16];

    /* renamed from: N */
    public boolean f2555N;

    /* renamed from: O */
    public int f2556O;

    /* renamed from: P */
    public int f2557P;

    /* renamed from: Q */
    public InputStream f2558Q;

    /* renamed from: R */
    public byte[] f2559R;

    /* renamed from: S */
    public boolean f2560S;

    public C1553h(C1537b bVar, int i, InputStream inputStream, C1526k kVar, C1554a aVar, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(bVar, i);
        this.f2558Q = inputStream;
        this.f2553L = aVar;
        this.f2559R = bArr;
        this.f2424t = i2;
        this.f2425u = i3;
        this.f2428x = i2 - i4;
        this.f2426v = (long) ((-i2) + i4);
        this.f2560S = z;
    }

    /* renamed from: j1 */
    public static final int m1947j1(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    /* renamed from: A1 */
    public final void mo11613A1() {
        if (this.f2424t >= this.f2425u) {
            mo11642d1();
        }
        byte[] bArr = this.f2559R;
        int i = this.f2424t;
        int i2 = i + 1;
        this.f2424t = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= this.f2425u) {
                mo11642d1();
            }
            byte[] bArr2 = this.f2559R;
            int i3 = this.f2424t;
            int i4 = i3 + 1;
            this.f2424t = i4;
            byte b2 = bArr2[i3];
            if ((b2 & 192) == 128) {
                if (i4 >= this.f2425u) {
                    mo11642d1();
                }
                byte[] bArr3 = this.f2559R;
                int i5 = this.f2424t;
                int i6 = i5 + 1;
                this.f2424t = i6;
                byte b3 = bArr3[i5];
                if ((b3 & 192) != 128) {
                    mo11655r1(b3 & ExifInterface.MARKER, i6);
                    throw null;
                }
                return;
            }
            mo11655r1(b2 & ExifInterface.MARKER, i4);
            throw null;
        }
        mo11655r1(b & ExifInterface.MARKER, i2);
        throw null;
    }

    /* renamed from: B1 */
    public final int mo11614B1() {
        byte b;
        while (true) {
            if (this.f2424t < this.f2425u || mo11641c1()) {
                byte[] bArr = this.f2559R;
                int i = this.f2424t;
                int i2 = i + 1;
                this.f2424t = i2;
                b = bArr[i] & ExifInterface.MARKER;
                if (b > 32) {
                    if (b == 47) {
                        mo11660w1();
                    } else if (b != 35 || !mo11616D1()) {
                        return b;
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.f2427w++;
                    this.f2428x = i2;
                } else if (b == 13) {
                    mo11658u1();
                } else if (b != 9) {
                    mo11537z0(b);
                    throw null;
                }
            } else {
                StringBuilder u = C0843a.m460u("Unexpected end-of-input within/between ");
                u.append(this.f2411A.mo11507e());
                u.append(" entries");
                throw new C1520f(this, u.toString());
            }
        }
        return b;
    }

    /* renamed from: C1 */
    public final int mo11615C1() {
        byte b;
        while (true) {
            if (this.f2424t < this.f2425u || mo11641c1()) {
                byte[] bArr = this.f2559R;
                int i = this.f2424t;
                int i2 = i + 1;
                this.f2424t = i2;
                b = bArr[i] & ExifInterface.MARKER;
                if (b > 32) {
                    if (b == 47) {
                        mo11660w1();
                    } else if (b != 35 || !mo11616D1()) {
                        return b;
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.f2427w++;
                    this.f2428x = i2;
                } else if (b == 13) {
                    mo11658u1();
                } else if (b != 9) {
                    mo11537z0(b);
                    throw null;
                }
            } else {
                mo11522p0();
                return -1;
            }
        }
        return b;
    }

    /* renamed from: D1 */
    public final boolean mo11616D1() {
        if ((this.f2365g & f2550a0) == 0) {
            return false;
        }
        mo11661x1();
        return true;
    }

    /* renamed from: E1 */
    public final void mo11617E1() {
        this.f2429y = this.f2427w;
        this.f2430z = this.f2424t - this.f2428x;
    }

    /* renamed from: F0 */
    public void mo11511F0() {
        if (this.f2558Q != null) {
            if (this.f2422r.f2454c || mo11496h0(C1521g.C1522a.AUTO_CLOSE_SOURCE)) {
                this.f2558Q.close();
            }
            this.f2558Q = null;
        }
    }

    /* renamed from: F1 */
    public final int mo11618F1() {
        if (this.f2424t >= this.f2425u && !mo11641c1()) {
            return 48;
        }
        byte[] bArr = this.f2559R;
        int i = this.f2424t;
        byte b = bArr[i] & ExifInterface.MARKER;
        if (b < 48 || b > 57) {
            return 48;
        }
        if ((this.f2365g & f2544U) != 0) {
            this.f2424t = i + 1;
            if (b == 48) {
                do {
                    if (this.f2424t >= this.f2425u && !mo11641c1()) {
                        break;
                    }
                    byte[] bArr2 = this.f2559R;
                    int i2 = this.f2424t;
                    b = bArr2[i2] & ExifInterface.MARKER;
                    if (b < 48 || b > 57) {
                        return 48;
                    }
                    this.f2424t = i2 + 1;
                } while (b == 48);
            }
            return b;
        }
        throw new C1520f(this, C0843a.m451l("Invalid numeric value: ", "Leading zeroes not allowed"));
    }

    /* renamed from: G1 */
    public final void mo11619G1(int i) {
        int i2 = this.f2424t + 1;
        this.f2424t = i2;
        if (i == 9) {
            return;
        }
        if (i == 10) {
            this.f2427w++;
            this.f2428x = i2;
        } else if (i == 13) {
            mo11658u1();
        } else if (i != 32) {
            mo11535x0(i, "Expected space separating root-level values");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7  */
    /* renamed from: H1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo11620H1(int[] r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r2 << 2
            r5 = 4
            int r4 = r4 - r5
            int r4 = r4 + r3
            r7 = 3
            if (r3 >= r5) goto L_0x001c
            int r8 = r2 + -1
            r9 = r1[r8]
            int r10 = 4 - r3
            int r10 = r10 << r7
            int r10 = r9 << r10
            r1[r8] = r10
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            b.j.a.a.t.h r8 = r0.f2413C
            char[] r8 = r8.mo11702g()
            r10 = 0
            r11 = 0
        L_0x0025:
            if (r10 >= r4) goto L_0x00fe
            int r12 = r10 >> 2
            r12 = r1[r12]
            r13 = r10 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r12 = r12 >> r13
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r10 = r10 + 1
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x00eb
            r13 = r12 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            r6 = 1
            if (r13 != r14) goto L_0x0044
            r12 = r12 & 31
            r13 = r6
            goto L_0x0057
        L_0x0044:
            r13 = r12 & 240(0xf0, float:3.36E-43)
            r14 = 224(0xe0, float:3.14E-43)
            if (r13 != r14) goto L_0x004e
            r12 = r12 & 15
            r13 = 2
            goto L_0x0057
        L_0x004e:
            r13 = r12 & 248(0xf8, float:3.48E-43)
            r14 = 240(0xf0, float:3.36E-43)
            if (r13 != r14) goto L_0x00e6
            r12 = r12 & 7
            r13 = r7
        L_0x0057:
            int r14 = r10 + r13
            if (r14 > r4) goto L_0x00dd
            int r14 = r10 >> 2
            r14 = r1[r14]
            r16 = r10 & 3
            int r16 = 3 - r16
            int r16 = r16 << 3
            int r14 = r14 >> r16
            int r10 = r10 + 1
            r15 = r14 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r15 != r5) goto L_0x00d8
            int r12 = r12 << 6
            r14 = r14 & 63
            r12 = r12 | r14
            if (r13 <= r6) goto L_0x00b4
            int r6 = r10 >> 2
            r6 = r1[r6]
            r14 = r10 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r6 = r6 >> r14
            int r10 = r10 + 1
            r14 = r6 & 192(0xc0, float:2.69E-43)
            if (r14 != r5) goto L_0x00af
            int r12 = r12 << 6
            r6 = r6 & 63
            r6 = r6 | r12
            r12 = 2
            if (r13 <= r12) goto L_0x00ac
            int r12 = r10 >> 2
            r12 = r1[r12]
            r14 = r10 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r12 = r12 >> r14
            int r10 = r10 + 1
            r14 = r12 & 192(0xc0, float:2.69E-43)
            if (r14 != r5) goto L_0x00a5
            int r5 = r6 << 6
            r6 = r12 & 63
            r5 = r5 | r6
            r12 = r5
            goto L_0x00b4
        L_0x00a5:
            r1 = r12 & 255(0xff, float:3.57E-43)
            r0.mo11654q1(r1)
            r5 = 0
            throw r5
        L_0x00ac:
            r5 = r12
            r12 = r6
            goto L_0x00b5
        L_0x00af:
            r5 = 0
            r0.mo11654q1(r6)
            throw r5
        L_0x00b4:
            r5 = 2
        L_0x00b5:
            if (r13 <= r5) goto L_0x00eb
            r5 = 65536(0x10000, float:9.18355E-41)
            int r12 = r12 - r5
            int r5 = r8.length
            if (r11 < r5) goto L_0x00c4
            b.j.a.a.t.h r5 = r0.f2413C
            char[] r5 = r5.mo11704i()
            r8 = r5
        L_0x00c4:
            int r5 = r11 + 1
            r6 = 55296(0xd800, float:7.7486E-41)
            int r13 = r12 >> 10
            int r13 = r13 + r6
            char r6 = (char) r13
            r8[r11] = r6
            r6 = 56320(0xdc00, float:7.8921E-41)
            r11 = r12 & 1023(0x3ff, float:1.434E-42)
            r12 = r11 | r6
            r11 = r5
            goto L_0x00eb
        L_0x00d8:
            r0.mo11654q1(r14)
            r1 = 0
            throw r1
        L_0x00dd:
            r1 = 0
            b.j.a.a.j r2 = p005b.p082j.p083a.p084a.C1525j.FIELD_NAME
            java.lang.String r3 = " in field name"
            r0.mo11533v0(r3, r2)
            throw r1
        L_0x00e6:
            r1 = 0
            r0.mo11653p1(r12)
            throw r1
        L_0x00eb:
            int r5 = r8.length
            if (r11 < r5) goto L_0x00f5
            b.j.a.a.t.h r5 = r0.f2413C
            char[] r5 = r5.mo11704i()
            r8 = r5
        L_0x00f5:
            int r5 = r11 + 1
            char r6 = (char) r12
            r8[r11] = r6
            r11 = r5
            r5 = 4
            goto L_0x0025
        L_0x00fe:
            java.lang.String r4 = new java.lang.String
            r5 = 0
            r4.<init>(r8, r5, r11)
            r5 = 4
            if (r3 >= r5) goto L_0x010b
            int r3 = r2 + -1
            r1[r3] = r9
        L_0x010b:
            b.j.a.a.s.a r3 = r0.f2553L
            java.lang.String r1 = r3.mo11669g(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p088r.C1553h.mo11620H1(int[], int, int):java.lang.String");
    }

    /* renamed from: I1 */
    public final String mo11621I1(int i, int i2) {
        int j1 = m1947j1(i, i2);
        String k = this.f2553L.mo11673k(j1);
        if (k != null) {
            return k;
        }
        int[] iArr = this.f2554M;
        iArr[0] = j1;
        return mo11620H1(iArr, 1, i2);
    }

    /* renamed from: J0 */
    public void mo11515J0() {
        byte[] bArr;
        super.mo11515J0();
        C1554a aVar = this.f2553L;
        C1554a aVar2 = aVar.f2561a;
        if (aVar2 != null && (!aVar.f2575o)) {
            C1554a.C1555a aVar3 = new C1554a.C1555a(aVar);
            int i = aVar3.f2577b;
            C1554a.C1555a aVar4 = aVar2.f2562b.get();
            if (i != aVar4.f2577b) {
                if (i > 6000) {
                    aVar3 = C1554a.C1555a.m2019a(64);
                }
                aVar2.f2562b.compareAndSet(aVar4, aVar3);
            }
            aVar.f2575o = true;
        }
        if (this.f2560S && (bArr = this.f2559R) != null) {
            this.f2559R = C1532c.f2431i;
            this.f2422r.mo11540c(bArr);
        }
    }

    /* renamed from: J1 */
    public final String mo11622J1(int i, int i2, int i3) {
        int j1 = m1947j1(i2, i3);
        String l = this.f2553L.mo11674l(i, j1);
        if (l != null) {
            return l;
        }
        int[] iArr = this.f2554M;
        iArr[0] = i;
        iArr[1] = j1;
        return mo11620H1(iArr, 2, i3);
    }

    /* renamed from: K1 */
    public final String mo11623K1(int i, int i2, int i3, int i4) {
        int j1 = m1947j1(i3, i4);
        String m = this.f2553L.mo11675m(i, i2, j1);
        if (m != null) {
            return m;
        }
        int[] iArr = this.f2554M;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = m1947j1(j1, i4);
        return mo11620H1(iArr, 3, i4);
    }

    /* renamed from: L1 */
    public final String mo11624L1(int[] iArr, int i, int i2, int i3) {
        if (i >= iArr.length) {
            iArr = C1531b.m1809O0(iArr, iArr.length);
            this.f2554M = iArr;
        }
        int i4 = i + 1;
        iArr[i] = m1947j1(i2, i3);
        String n = this.f2553L.mo11676n(iArr, i4);
        return n == null ? mo11620H1(iArr, i4, i3) : n;
    }

    /* renamed from: M1 */
    public final int mo11625M1() {
        if (this.f2424t >= this.f2425u) {
            mo11642d1();
        }
        byte[] bArr = this.f2559R;
        int i = this.f2424t;
        this.f2424t = i + 1;
        return bArr[i] & ExifInterface.MARKER;
    }

    /* renamed from: N1 */
    public final String mo11626N1(int[] iArr, int i, int i2, int i3, int i4) {
        int[] iArr2 = f2552c0;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    if (r10 > 0) {
                        if (i >= iArr.length) {
                            iArr = C1531b.m1809O0(iArr, iArr.length);
                            this.f2554M = iArr;
                        }
                        iArr[i] = m1947j1(r8, r10);
                        i++;
                    }
                    String n = this.f2553L.mo11676n(iArr, i);
                    return n == null ? mo11620H1(iArr, i, r10) : n;
                }
                if (i3 != 92) {
                    mo11517L0(i3, "name");
                } else {
                    i3 = mo11634V0();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (r10 >= 4) {
                        if (i >= iArr.length) {
                            iArr = C1531b.m1809O0(iArr, iArr.length);
                            this.f2554M = iArr;
                        }
                        iArr[i] = r8;
                        i++;
                        r8 = 0;
                        r10 = 0;
                    }
                    int i6 = r8 << 8;
                    if (i3 < 2048) {
                        r8 = i6 | (i3 >> 6) | 192;
                        r10++;
                    } else {
                        int i7 = i6 | (i3 >> 12) | 224;
                        int i8 = r10 + 1;
                        if (i8 >= 4) {
                            if (i >= iArr.length) {
                                iArr = C1531b.m1809O0(iArr, iArr.length);
                                this.f2554M = iArr;
                            }
                            iArr[i] = i7;
                            i++;
                            i8 = 0;
                        } else {
                            i5 = i7;
                        }
                        r8 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        r10 = i8 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i4 = r10 + 1;
                i2 = (r8 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = C1531b.m1809O0(iArr, iArr.length);
                    this.f2554M = iArr;
                }
                iArr[i] = r8;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.f2424t < this.f2425u || mo11641c1()) {
                byte[] bArr = this.f2559R;
                int i9 = this.f2424t;
                this.f2424t = i9 + 1;
                i3 = bArr[i9] & ExifInterface.MARKER;
            } else {
                mo11533v0(" in field name", C1525j.FIELD_NAME);
                throw null;
            }
        }
    }

    /* renamed from: O1 */
    public final String mo11627O1(int i, int i2, int i3) {
        return mo11626N1(this.f2554M, 0, i, i2, i3);
    }

    /* renamed from: P1 */
    public final String mo11628P1(int i, int i2, int i3, int i4) {
        int[] iArr = this.f2554M;
        iArr[0] = i;
        return mo11626N1(iArr, 1, i2, i3, i4);
    }

    /* renamed from: Q1 */
    public final String mo11629Q1(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f2554M;
        iArr[0] = i;
        iArr[1] = i2;
        return mo11626N1(iArr, 2, i3, i4, i5);
    }

    /* renamed from: R0 */
    public final void mo11630R0(String str, int i, int i2) {
        if (Character.isJavaIdentifierPart((char) mo11633U0(i2))) {
            mo11656s1(str.substring(0, i));
            throw null;
        }
    }

    /* renamed from: S0 */
    public final void mo11631S0() {
        mo11617E1();
        if (this.f2411A.mo11504b()) {
            this.f2411A = this.f2411A.mo11570f();
        } else {
            mo11516K0(93, '}');
            throw null;
        }
    }

    /* renamed from: T0 */
    public final void mo11632T0() {
        mo11617E1();
        if (this.f2411A.mo11505c()) {
            this.f2411A = this.f2411A.mo11570f();
        } else {
            mo11516K0(125, ']');
            throw null;
        }
    }

    /* renamed from: U0 */
    public int mo11633U0(int i) {
        int i2;
        char c;
        int i3 = i & 255;
        if (i3 <= 127) {
            return i3;
        }
        if ((i3 & 224) == 192) {
            i2 = i3 & 31;
            c = 1;
        } else if ((i3 & 240) == 224) {
            i2 = i3 & 15;
            c = 2;
        } else if ((i3 & 248) == 240) {
            i2 = i3 & 7;
            c = 3;
        } else {
            mo11653p1(i3 & 255);
            throw null;
        }
        int M1 = mo11625M1();
        if ((M1 & 192) == 128) {
            int i4 = (i2 << 6) | (M1 & 63);
            if (c <= 1) {
                return i4;
            }
            int M12 = mo11625M1();
            if ((M12 & 192) == 128) {
                int i5 = (i4 << 6) | (M12 & 63);
                if (c <= 2) {
                    return i5;
                }
                int M13 = mo11625M1();
                if ((M13 & 192) == 128) {
                    return (i5 << 6) | (M13 & 63);
                }
                mo11654q1(M13 & 255);
                throw null;
            }
            mo11654q1(M12 & 255);
            throw null;
        }
        mo11654q1(M1 & 255);
        throw null;
    }

    /* renamed from: V0 */
    public char mo11634V0() {
        if (this.f2424t < this.f2425u || mo11641c1()) {
            byte[] bArr = this.f2559R;
            int i = this.f2424t;
            this.f2424t = i + 1;
            byte b = bArr[i];
            if (b == 34 || b == 47 || b == 92) {
                return (char) b;
            }
            if (b == 98) {
                return 8;
            }
            if (b == 102) {
                return 12;
            }
            if (b == 110) {
                return 10;
            }
            if (b == 114) {
                return 13;
            }
            if (b == 116) {
                return 9;
            }
            if (b != 117) {
                char U0 = (char) mo11633U0(b);
                mo11513H0(U0);
                return U0;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < 4) {
                if (this.f2424t < this.f2425u || mo11641c1()) {
                    byte[] bArr2 = this.f2559R;
                    int i4 = this.f2424t;
                    this.f2424t = i4 + 1;
                    byte b2 = bArr2[i4];
                    int[] iArr = C1535a.f2449i;
                    byte b3 = b2 & ExifInterface.MARKER;
                    int i5 = iArr[b3];
                    if (i5 >= 0) {
                        i3 = (i3 << 4) | i5;
                        i2++;
                    } else {
                        mo11535x0(b3, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                } else {
                    mo11533v0(" in character escape sequence", C1525j.VALUE_STRING);
                    throw null;
                }
            }
            return (char) i3;
        }
        mo11533v0(" in character escape sequence", C1525j.VALUE_STRING);
        throw null;
    }

    /* renamed from: W0 */
    public final int mo11635W0(int i) {
        if (this.f2424t >= this.f2425u) {
            mo11642d1();
        }
        byte[] bArr = this.f2559R;
        int i2 = this.f2424t;
        int i3 = i2 + 1;
        this.f2424t = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            return ((i & 31) << 6) | (b & 63);
        }
        mo11655r1(b & ExifInterface.MARKER, i3);
        throw null;
    }

    /* renamed from: X0 */
    public final int mo11636X0(int i) {
        if (this.f2424t >= this.f2425u) {
            mo11642d1();
        }
        int i2 = i & 15;
        byte[] bArr = this.f2559R;
        int i3 = this.f2424t;
        int i4 = i3 + 1;
        this.f2424t = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            byte b2 = (i2 << 6) | (b & 63);
            if (i4 >= this.f2425u) {
                mo11642d1();
            }
            byte[] bArr2 = this.f2559R;
            int i5 = this.f2424t;
            int i6 = i5 + 1;
            this.f2424t = i6;
            byte b3 = bArr2[i5];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            mo11655r1(b3 & ExifInterface.MARKER, i6);
            throw null;
        }
        mo11655r1(b & ExifInterface.MARKER, i4);
        throw null;
    }

    /* renamed from: Y0 */
    public final int mo11637Y0(int i) {
        int i2 = i & 15;
        byte[] bArr = this.f2559R;
        int i3 = this.f2424t;
        int i4 = i3 + 1;
        this.f2424t = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            byte b2 = (i2 << 6) | (b & 63);
            int i5 = i4 + 1;
            this.f2424t = i5;
            byte b3 = bArr[i4];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            mo11655r1(b3 & ExifInterface.MARKER, i5);
            throw null;
        }
        mo11655r1(b & ExifInterface.MARKER, i4);
        throw null;
    }

    /* renamed from: Z0 */
    public final int mo11638Z0(int i) {
        if (this.f2424t >= this.f2425u) {
            mo11642d1();
        }
        byte[] bArr = this.f2559R;
        int i2 = this.f2424t;
        int i3 = i2 + 1;
        this.f2424t = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            byte b2 = ((i & 7) << 6) | (b & 63);
            if (i3 >= this.f2425u) {
                mo11642d1();
            }
            byte[] bArr2 = this.f2559R;
            int i4 = this.f2424t;
            int i5 = i4 + 1;
            this.f2424t = i5;
            byte b3 = bArr2[i4];
            if ((b3 & 192) == 128) {
                byte b4 = (b2 << 6) | (b3 & 63);
                if (i5 >= this.f2425u) {
                    mo11642d1();
                }
                byte[] bArr3 = this.f2559R;
                int i6 = this.f2424t;
                int i7 = i6 + 1;
                this.f2424t = i7;
                byte b5 = bArr3[i6];
                if ((b5 & 192) == 128) {
                    return ((b4 << 6) | (b5 & 63)) - 65536;
                }
                mo11655r1(b5 & ExifInterface.MARKER, i7);
                throw null;
            }
            mo11655r1(b3 & ExifInterface.MARKER, i5);
            throw null;
        }
        mo11655r1(b & ExifInterface.MARKER, i3);
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r4v0 ?, r4v1 ?, r4v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: a1 */
    public p005b.p082j.p083a.p084a.C1525j mo11639a1(
/*
Method generation error in method: b.j.a.a.r.h.a1(int, boolean):b.j.a.a.j, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r13 != 44) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r12.f2411A.mo11504b() == false) goto L_0x0152;
     */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p082j.p083a.p084a.C1525j mo11640b1(int r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 39
            r2 = 0
            r3 = 1
            if (r13 == r1) goto L_0x009a
            r1 = 73
            if (r13 == r1) goto L_0x007f
            r1 = 78
            if (r13 == r1) goto L_0x0064
            r1 = 93
            if (r13 == r1) goto L_0x0045
            r1 = 125(0x7d, float:1.75E-43)
            if (r13 == r1) goto L_0x005e
            r1 = 43
            if (r13 == r1) goto L_0x0021
            r0 = 44
            if (r13 == r0) goto L_0x004f
            goto L_0x0152
        L_0x0021:
            int r13 = r12.f2424t
            int r1 = r12.f2425u
            if (r13 < r1) goto L_0x0034
            boolean r13 = r12.mo11641c1()
            if (r13 == 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            b.j.a.a.j r13 = p005b.p082j.p083a.p084a.C1525j.VALUE_NUMBER_INT
            r12.mo11534w0(r13)
            throw r2
        L_0x0034:
            byte[] r13 = r12.f2559R
            int r1 = r12.f2424t
            int r2 = r1 + 1
            r12.f2424t = r2
            byte r13 = r13[r1]
            r13 = r13 & 255(0xff, float:3.57E-43)
            b.j.a.a.j r13 = r12.mo11639a1(r13, r0)
            return r13
        L_0x0045:
            b.j.a.a.r.d r0 = r12.f2411A
            boolean r0 = r0.mo11504b()
            if (r0 != 0) goto L_0x004f
            goto L_0x0152
        L_0x004f:
            int r0 = r12.f2365g
            int r1 = f2546W
            r0 = r0 & r1
            if (r0 == 0) goto L_0x005e
            int r13 = r12.f2424t
            int r13 = r13 - r3
            r12.f2424t = r13
            b.j.a.a.j r13 = p005b.p082j.p083a.p084a.C1525j.VALUE_NULL
            return r13
        L_0x005e:
            java.lang.String r0 = "expected a value"
            r12.mo11535x0(r13, r0)
            throw r2
        L_0x0064:
            java.lang.String r13 = "NaN"
            r12.mo11645g1(r13, r3)
            int r0 = r12.f2365g
            int r1 = f2545V
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0077
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            b.j.a.a.j r13 = r12.mo11520P0(r13, r0)
            return r13
        L_0x0077:
            b.j.a.a.f r13 = new b.j.a.a.f
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r13.<init>(r12, r0)
            throw r13
        L_0x007f:
            java.lang.String r13 = "Infinity"
            r12.mo11645g1(r13, r3)
            int r0 = r12.f2365g
            int r1 = f2545V
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0092
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            b.j.a.a.j r13 = r12.mo11520P0(r13, r0)
            return r13
        L_0x0092:
            b.j.a.a.f r13 = new b.j.a.a.f
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r13.<init>(r12, r0)
            throw r13
        L_0x009a:
            int r4 = r12.f2365g
            int r5 = f2547X
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0152
            b.j.a.a.t.h r13 = r12.f2413C
            char[] r13 = r13.mo11702g()
            int[] r4 = f2551b0
            byte[] r5 = r12.f2559R
            r6 = r0
        L_0x00ac:
            int r7 = r12.f2424t
            int r8 = r12.f2425u
            if (r7 < r8) goto L_0x00b5
            r12.mo11642d1()
        L_0x00b5:
            int r7 = r13.length
            if (r6 < r7) goto L_0x00bf
            b.j.a.a.t.h r13 = r12.f2413C
            char[] r13 = r13.mo11705j()
            r6 = r0
        L_0x00bf:
            int r7 = r12.f2425u
            int r8 = r12.f2424t
            int r9 = r13.length
            int r9 = r9 - r6
            int r9 = r9 + r8
            if (r9 >= r7) goto L_0x00c9
            r7 = r9
        L_0x00c9:
            int r8 = r12.f2424t
            if (r8 >= r7) goto L_0x00ac
            int r9 = r8 + 1
            r12.f2424t = r9
            byte r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 == r1) goto L_0x00e3
            r10 = r4[r8]
            if (r10 == 0) goto L_0x00dc
            goto L_0x00e3
        L_0x00dc:
            int r9 = r6 + 1
            char r8 = (char) r8
            r13[r6] = r8
            r6 = r9
            goto L_0x00c9
        L_0x00e3:
            if (r8 != r1) goto L_0x00ec
            b.j.a.a.t.h r13 = r12.f2413C
            r13.f2637i = r6
            b.j.a.a.j r13 = p005b.p082j.p083a.p084a.C1525j.VALUE_STRING
            return r13
        L_0x00ec:
            r7 = r4[r8]
            if (r7 == r3) goto L_0x013c
            r10 = 2
            if (r7 == r10) goto L_0x0137
            r11 = 3
            if (r7 == r11) goto L_0x0128
            r9 = 4
            if (r7 == r9) goto L_0x0106
            r13 = 32
            if (r8 >= r13) goto L_0x0102
            java.lang.String r13 = "string value"
            r12.mo11517L0(r8, r13)
        L_0x0102:
            r12.mo11652o1(r8)
            throw r2
        L_0x0106:
            int r7 = r12.mo11638Z0(r8)
            int r8 = r6 + 1
            r9 = 55296(0xd800, float:7.7486E-41)
            int r10 = r7 >> 10
            r9 = r9 | r10
            char r9 = (char) r9
            r13[r6] = r9
            int r6 = r13.length
            if (r8 < r6) goto L_0x0120
            b.j.a.a.t.h r13 = r12.f2413C
            char[] r13 = r13.mo11705j()
            r6 = r0
            goto L_0x0121
        L_0x0120:
            r6 = r8
        L_0x0121:
            r8 = 56320(0xdc00, float:7.8921E-41)
            r7 = r7 & 1023(0x3ff, float:1.434E-42)
            r7 = r7 | r8
            goto L_0x0140
        L_0x0128:
            int r7 = r12.f2425u
            int r7 = r7 - r9
            if (r7 < r10) goto L_0x0132
            int r7 = r12.mo11637Y0(r8)
            goto L_0x0140
        L_0x0132:
            int r7 = r12.mo11636X0(r8)
            goto L_0x0140
        L_0x0137:
            int r7 = r12.mo11635W0(r8)
            goto L_0x0140
        L_0x013c:
            char r7 = r12.mo11634V0()
        L_0x0140:
            int r8 = r13.length
            if (r6 < r8) goto L_0x014a
            b.j.a.a.t.h r13 = r12.f2413C
            char[] r13 = r13.mo11705j()
            r6 = r0
        L_0x014a:
            int r8 = r6 + 1
            char r7 = (char) r7
            r13[r6] = r7
            r6 = r8
            goto L_0x00ac
        L_0x0152:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r13)
            if (r0 == 0) goto L_0x016e
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            char r13 = (char) r13
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = r12.mo11518M0()
            r12.mo11657t1(r13, r0)
            throw r2
        L_0x016e:
            java.lang.String r0 = "expected a valid value "
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            java.lang.String r1 = r12.mo11518M0()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.mo11535x0(r13, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p088r.C1553h.mo11640b1(int):b.j.a.a.j");
    }

    /* renamed from: c1 */
    public final boolean mo11641c1() {
        byte[] bArr;
        int length;
        int i = this.f2425u;
        InputStream inputStream = this.f2558Q;
        if (inputStream == null || (length = bArr.length) == 0) {
            return false;
        }
        int read = inputStream.read((bArr = this.f2559R), 0, length);
        if (read > 0) {
            this.f2424t = 0;
            this.f2425u = read;
            this.f2426v += (long) read;
            this.f2428x -= read;
            this.f2557P -= i;
            return true;
        }
        mo11511F0();
        if (read == 0) {
            throw new IOException(C0843a.m453n(C0843a.m460u("InputStream.read() returned 0 characters when trying to read "), this.f2559R.length, " bytes"));
        }
        return false;
    }

    /* renamed from: d1 */
    public void mo11642d1() {
        if (!mo11641c1()) {
            mo11532u0();
            throw null;
        }
    }

    /* renamed from: e */
    public C1519e mo11494e() {
        return new C1519e(mo11512G0(), this.f2426v + ((long) this.f2424t), -1, this.f2427w, (this.f2424t - this.f2428x) + 1);
    }

    /* renamed from: e1 */
    public final void mo11643e1() {
        byte b;
        int i = this.f2424t;
        if (i + 4 < this.f2425u) {
            byte[] bArr = this.f2559R;
            int i2 = i + 1;
            if (bArr[i] == 97) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 115) {
                        int i5 = i4 + 1;
                        if (bArr[i4] == 101 && ((b = bArr[i5] & ExifInterface.MARKER) < 48 || b == 93 || b == 125)) {
                            this.f2424t = i5;
                            return;
                        }
                    }
                }
            }
        }
        mo11646h1("false", 1);
    }

    /* renamed from: f0 */
    public String mo11495f0() {
        int i;
        C1525j jVar = this.f2440h;
        if (jVar == C1525j.VALUE_STRING) {
            if (this.f2555N) {
                this.f2555N = false;
                int i2 = this.f2424t;
                if (i2 >= this.f2425u) {
                    mo11642d1();
                    i2 = this.f2424t;
                }
                char[] g = this.f2413C.mo11702g();
                int[] iArr = f2551b0;
                int min = Math.min(this.f2425u, g.length + i2);
                byte[] bArr = this.f2559R;
                int i3 = 0;
                while (true) {
                    if (i2 >= min) {
                        break;
                    }
                    byte b = bArr[i2] & ExifInterface.MARKER;
                    if (iArr[b] == 0) {
                        i2++;
                        g[i] = (char) b;
                        i3 = i + 1;
                    } else if (b == 34) {
                        this.f2424t = i2 + 1;
                        C1568h hVar = this.f2413C;
                        hVar.f2637i = i;
                        if (hVar.f2635g > 0) {
                            return hVar.mo11701f();
                        }
                        String str = i == 0 ? "" : new String(hVar.f2636h, 0, i);
                        hVar.f2638j = str;
                        return str;
                    }
                }
                this.f2424t = i2;
                int[] iArr2 = f2551b0;
                byte[] bArr2 = this.f2559R;
                while (true) {
                    int i4 = this.f2424t;
                    if (i4 >= this.f2425u) {
                        mo11642d1();
                        i4 = this.f2424t;
                    }
                    if (i >= g.length) {
                        g = this.f2413C.mo11705j();
                        i = 0;
                    }
                    int min2 = Math.min(this.f2425u, (g.length - i) + i4);
                    while (true) {
                        if (i4 >= min2) {
                            this.f2424t = i4;
                            break;
                        }
                        int i5 = i4 + 1;
                        int i6 = bArr2[i4] & ExifInterface.MARKER;
                        if (iArr2[i6] != 0) {
                            this.f2424t = i5;
                            if (i6 == 34) {
                                C1568h hVar2 = this.f2413C;
                                hVar2.f2637i = i;
                                return hVar2.mo11701f();
                            }
                            int i7 = iArr2[i6];
                            if (i7 == 1) {
                                i6 = mo11634V0();
                            } else if (i7 == 2) {
                                i6 = mo11635W0(i6);
                            } else if (i7 == 3) {
                                i6 = this.f2425u - i5 >= 2 ? mo11637Y0(i6) : mo11636X0(i6);
                            } else if (i7 == 4) {
                                int Z0 = mo11638Z0(i6);
                                int i8 = i + 1;
                                g[i] = (char) (55296 | (Z0 >> 10));
                                if (i8 >= g.length) {
                                    g = this.f2413C.mo11705j();
                                    i = 0;
                                } else {
                                    i = i8;
                                }
                                i6 = (Z0 & AudioAttributesCompat.FLAG_ALL) | 56320;
                            } else if (i6 < 32) {
                                mo11517L0(i6, "string value");
                            } else {
                                mo11652o1(i6);
                                throw null;
                            }
                            if (i >= g.length) {
                                g = this.f2413C.mo11705j();
                                i = 0;
                            }
                            g[i] = (char) i6;
                            i++;
                        } else {
                            g[i] = (char) i6;
                            i4 = i5;
                            i++;
                        }
                    }
                }
            } else {
                return this.f2413C.mo11701f();
            }
        } else if (jVar == null) {
            return null;
        } else {
            int i9 = jVar.f2403j;
            if (i9 == 5) {
                return this.f2411A.f2506f;
            }
            if (i9 == 6 || i9 == 7 || i9 == 8) {
                return this.f2413C.mo11701f();
            }
            return jVar.f2400g;
        }
    }

    /* renamed from: f1 */
    public final void mo11644f1() {
        byte b;
        int i = this.f2424t;
        if (i + 3 < this.f2425u) {
            byte[] bArr = this.f2559R;
            int i2 = i + 1;
            if (bArr[i] == 117) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 108 && ((b = bArr[i4] & ExifInterface.MARKER) < 48 || b == 93 || b == 125)) {
                        this.f2424t = i4;
                        return;
                    }
                }
            }
        }
        mo11646h1("null", 1);
    }

    /* renamed from: g1 */
    public final void mo11645g1(String str, int i) {
        int length = str.length();
        if (this.f2424t + length >= this.f2425u) {
            mo11646h1(str, i);
            return;
        }
        while (this.f2559R[this.f2424t] == str.charAt(i)) {
            int i2 = this.f2424t + 1;
            this.f2424t = i2;
            i++;
            if (i >= length) {
                byte b = this.f2559R[i2] & ExifInterface.MARKER;
                if (b >= 48 && b != 93 && b != 125) {
                    mo11630R0(str, i, b);
                    return;
                }
                return;
            }
        }
        mo11656s1(str.substring(0, i));
        throw null;
    }

    /* renamed from: h1 */
    public final void mo11646h1(String str, int i) {
        int i2;
        byte b;
        int length = str.length();
        do {
            if ((this.f2424t < this.f2425u || mo11641c1()) && this.f2559R[this.f2424t] == str.charAt(i)) {
                i2 = this.f2424t + 1;
                this.f2424t = i2;
                i++;
            } else {
                mo11656s1(str.substring(0, i));
                throw null;
            }
        } while (i < length);
        if ((i2 < this.f2425u || mo11641c1()) && (b = this.f2559R[this.f2424t] & ExifInterface.MARKER) >= 48 && b != 93 && b != 125) {
            mo11630R0(str, i, b);
        }
    }

    /* renamed from: i1 */
    public final void mo11647i1() {
        byte b;
        int i = this.f2424t;
        if (i + 3 < this.f2425u) {
            byte[] bArr = this.f2559R;
            int i2 = i + 1;
            if (bArr[i] == 114) {
                int i3 = i2 + 1;
                if (bArr[i2] == 117) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 101 && ((b = bArr[i4] & ExifInterface.MARKER) < 48 || b == 93 || b == 125)) {
                        this.f2424t = i4;
                        return;
                    }
                }
            }
        }
        mo11646h1("true", 1);
    }

    /* renamed from: k1 */
    public final C1525j mo11648k1(char[] cArr, int i, int i2, boolean z, int i3) {
        boolean z2;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.f2413C.mo11705j();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            int i4 = 0;
            while (true) {
                if (this.f2424t >= this.f2425u && !mo11641c1()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.f2559R;
                int i5 = this.f2424t;
                this.f2424t = i5 + 1;
                i2 = bArr[i5] & ExifInterface.MARKER;
                if (i2 < 48 || i2 > 57) {
                    z2 = false;
                } else {
                    i4++;
                    if (i >= cArr.length) {
                        cArr = this.f2413C.mo11705j();
                        i = 0;
                    }
                    cArr[i] = (char) i2;
                    i++;
                }
            }
            z2 = false;
            if (i4 == 0) {
                mo11527E0(i2, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            z2 = false;
        }
        if (r12 == 101 || r12 == 69) {
            if (i >= cArr.length) {
                cArr = this.f2413C.mo11705j();
                i = 0;
            }
            int i6 = i + 1;
            cArr[i] = (char) r12;
            if (this.f2424t >= this.f2425u) {
                mo11642d1();
            }
            byte[] bArr2 = this.f2559R;
            int i7 = this.f2424t;
            this.f2424t = i7 + 1;
            byte b = bArr2[i7] & ExifInterface.MARKER;
            if (b == 45 || b == 43) {
                if (i6 >= cArr.length) {
                    cArr = this.f2413C.mo11705j();
                    i6 = 0;
                }
                int i8 = i6 + 1;
                cArr[i6] = (char) b;
                if (this.f2424t >= this.f2425u) {
                    mo11642d1();
                }
                byte[] bArr3 = this.f2559R;
                int i9 = this.f2424t;
                this.f2424t = i9 + 1;
                b = bArr3[i9] & ExifInterface.MARKER;
                i6 = i8;
            }
            r12 = b;
            int i10 = 0;
            while (true) {
                if (r12 < 48 || r12 > 57) {
                    break;
                }
                i10++;
                if (i6 >= cArr.length) {
                    cArr = this.f2413C.mo11705j();
                    i6 = 0;
                }
                int i11 = i6 + 1;
                cArr[i6] = (char) r12;
                if (this.f2424t >= this.f2425u && !mo11641c1()) {
                    z2 = true;
                    i6 = i11;
                    break;
                }
                byte[] bArr4 = this.f2559R;
                int i12 = this.f2424t;
                this.f2424t = i12 + 1;
                r12 = bArr4[i12] & ExifInterface.MARKER;
                i6 = i11;
            }
            if (i10 != 0) {
                i = i6;
            } else {
                mo11527E0(r12, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this.f2424t--;
            if (this.f2411A.mo11506d()) {
                mo11619G1(r12);
            }
        }
        this.f2413C.f2637i = i;
        this.f2420J = z;
        this.f2421K = i3;
        this.f2414D = 0;
        return C1525j.VALUE_NUMBER_FLOAT;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v103, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v104, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v70, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v71, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v73, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v184, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v76, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v77, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v60, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v200, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v201, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0190, code lost:
        r7 = r2.mo11614B1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x047d, code lost:
        if (r7 == 34) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0674, code lost:
        if (r4 == 35) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0688, code lost:
        if (r3 == 35) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x068f, code lost:
        if (r4 == 9) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x06a5, code lost:
        if (r4 == 35) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x06bb, code lost:
        if (r3 == 35) goto L_0x06c2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x06dc  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x011e A[EDGE_INSN: B:453:0x011e->B:73:0x011e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ed  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p082j.p083a.p084a.C1525j mo11497l0() {
        /*
            r20 = this;
            r0 = r20
            b.j.a.a.j r1 = r0.f2440h
            b.j.a.a.j r2 = p005b.p082j.p083a.p084a.C1525j.FIELD_NAME
            r3 = 0
            if (r1 != r2) goto L_0x002f
            b.j.a.a.j r1 = r0.f2412B
            r0.f2412B = r3
            b.j.a.a.j r2 = p005b.p082j.p083a.p084a.C1525j.START_ARRAY
            if (r1 != r2) goto L_0x001c
            b.j.a.a.r.d r2 = r0.f2411A
            int r3 = r0.f2429y
            int r4 = r0.f2430z
            b.j.a.a.r.d r2 = r2.mo11571g(r3, r4)
            goto L_0x002a
        L_0x001c:
            b.j.a.a.j r2 = p005b.p082j.p083a.p084a.C1525j.START_OBJECT
            if (r1 != r2) goto L_0x002c
            b.j.a.a.r.d r2 = r0.f2411A
            int r3 = r0.f2429y
            int r4 = r0.f2430z
            b.j.a.a.r.d r2 = r2.mo11572h(r3, r4)
        L_0x002a:
            r0.f2411A = r2
        L_0x002c:
            r0.f2440h = r1
            return r1
        L_0x002f:
            r1 = 0
            r0.f2414D = r1
            boolean r2 = r0.f2555N
            r4 = 34
            r5 = 32
            r6 = 2
            r7 = 3
            r8 = 4
            r9 = 1
            if (r2 == 0) goto L_0x008d
            r0.f2555N = r1
            int[] r1 = f2551b0
            byte[] r2 = r0.f2559R
        L_0x0044:
            int r10 = r0.f2424t
            int r11 = r0.f2425u
            if (r10 < r11) goto L_0x0051
            r20.mo11642d1()
            int r10 = r0.f2424t
            int r11 = r0.f2425u
        L_0x0051:
            if (r10 >= r11) goto L_0x008a
            int r12 = r10 + 1
            byte r10 = r2[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r13 = r1[r10]
            if (r13 == 0) goto L_0x0088
            r0.f2424t = r12
            if (r10 != r4) goto L_0x0062
            goto L_0x008d
        L_0x0062:
            r11 = r1[r10]
            if (r11 == r9) goto L_0x0084
            if (r11 == r6) goto L_0x0080
            if (r11 == r7) goto L_0x007c
            if (r11 == r8) goto L_0x0078
            if (r10 >= r5) goto L_0x0074
            java.lang.String r11 = "string value"
            r0.mo11517L0(r10, r11)
            goto L_0x0044
        L_0x0074:
            r0.mo11652o1(r10)
            throw r3
        L_0x0078:
            r20.mo11613A1()
            goto L_0x0044
        L_0x007c:
            r20.mo11663z1()
            goto L_0x0044
        L_0x0080:
            r20.mo11662y1()
            goto L_0x0044
        L_0x0084:
            r20.mo11634V0()
            goto L_0x0044
        L_0x0088:
            r10 = r12
            goto L_0x0051
        L_0x008a:
            r0.f2424t = r10
            goto L_0x0044
        L_0x008d:
            int r1 = r0.f2424t
            int r2 = r0.f2425u
            r4 = 35
            r6 = 47
            r7 = -1
            r8 = 10
            r10 = 13
            r11 = 9
            if (r1 < r2) goto L_0x00ac
            boolean r1 = r20.mo11641c1()
            if (r1 != 0) goto L_0x00ac
            r20.mo11522p0()
            r2 = r0
            r12 = r2
            r1 = r7
            goto L_0x0127
        L_0x00ac:
            byte[] r1 = r0.f2559R
            int r2 = r0.f2424t
            int r12 = r2 + 1
            r0.f2424t = r12
            byte r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 <= r5) goto L_0x00cb
            if (r1 == r6) goto L_0x00c3
            if (r1 != r4) goto L_0x00bf
            goto L_0x00c3
        L_0x00bf:
            r2 = r0
            r12 = r2
            goto L_0x0122
        L_0x00c3:
            int r12 = r12 + r7
            r0.f2424t = r12
            r1 = r0
            r2 = r1
            r12 = r2
            goto L_0x011e
        L_0x00cb:
            if (r1 == r5) goto L_0x00e4
            if (r1 != r8) goto L_0x00d7
            int r1 = r0.f2427w
            int r1 = r1 + r9
            r0.f2427w = r1
            r0.f2428x = r12
            goto L_0x00e4
        L_0x00d7:
            if (r1 != r10) goto L_0x00dd
            r1 = r0
            r2 = r1
            r12 = r2
            goto L_0x0113
        L_0x00dd:
            if (r1 != r11) goto L_0x00e0
            goto L_0x00e4
        L_0x00e0:
            r0.mo11537z0(r1)
            throw r3
        L_0x00e4:
            r1 = r0
            r2 = r1
            r12 = r2
        L_0x00e7:
            int r13 = r1.f2424t
            int r14 = r1.f2425u
            if (r13 >= r14) goto L_0x011e
            byte[] r14 = r1.f2559R
            int r15 = r13 + 1
            r1.f2424t = r15
            byte r13 = r14[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            if (r13 <= r5) goto L_0x0105
            if (r13 == r6) goto L_0x0101
            if (r13 != r4) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r1 = r7
            r7 = r13
            goto L_0x0127
        L_0x0101:
            int r15 = r15 + r7
            r1.f2424t = r15
            goto L_0x011e
        L_0x0105:
            if (r13 == r5) goto L_0x00e7
            if (r13 != r8) goto L_0x0111
            int r13 = r1.f2427w
            int r13 = r13 + r9
            r1.f2427w = r13
            r1.f2428x = r15
            goto L_0x00e7
        L_0x0111:
            if (r13 != r10) goto L_0x0117
        L_0x0113:
            r1.mo11658u1()
            goto L_0x00e7
        L_0x0117:
            if (r13 != r11) goto L_0x011a
            goto L_0x00e7
        L_0x011a:
            r1.mo11537z0(r13)
            throw r3
        L_0x011e:
            int r1 = r1.mo11615C1()
        L_0x0122:
            r19 = r7
            r7 = r1
            r1 = r19
        L_0x0127:
            if (r7 >= 0) goto L_0x012f
            r2.close()
            r12.f2440h = r3
            return r3
        L_0x012f:
            r13 = 93
            if (r7 != r13) goto L_0x013b
            r2.mo11631S0()
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.END_ARRAY
            r12.f2440h = r1
            return r1
        L_0x013b:
            r14 = 125(0x7d, float:1.75E-43)
            if (r7 != r14) goto L_0x0147
            r2.mo11632T0()
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.END_OBJECT
            r12.f2440h = r1
            return r1
        L_0x0147:
            b.j.a.a.r.d r14 = r12.f2411A
            int r15 = r14.f2385b
            int r15 = r15 + r9
            r14.f2385b = r15
            int r14 = r14.f2384a
            if (r14 == 0) goto L_0x0156
            if (r15 <= 0) goto L_0x0156
            r14 = r9
            goto L_0x0157
        L_0x0156:
            r14 = 0
        L_0x0157:
            if (r14 == 0) goto L_0x01ce
            r14 = 44
            if (r7 != r14) goto L_0x01b2
        L_0x015d:
            int r7 = r12.f2424t
            int r14 = r12.f2425u
            if (r7 >= r14) goto L_0x0190
            byte[] r14 = r12.f2559R
            int r15 = r7 + 1
            r12.f2424t = r15
            byte r7 = r14[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 <= r5) goto L_0x0177
            if (r7 == r6) goto L_0x0173
            if (r7 != r4) goto L_0x0195
        L_0x0173:
            int r15 = r15 + r1
            r12.f2424t = r15
            goto L_0x0190
        L_0x0177:
            if (r7 == r5) goto L_0x015d
            if (r7 != r8) goto L_0x0183
            int r7 = r12.f2427w
            int r7 = r7 + r9
            r12.f2427w = r7
            r12.f2428x = r15
            goto L_0x015d
        L_0x0183:
            if (r7 != r10) goto L_0x0189
            r2.mo11658u1()
            goto L_0x015d
        L_0x0189:
            if (r7 != r11) goto L_0x018c
            goto L_0x015d
        L_0x018c:
            r12.mo11537z0(r7)
            throw r3
        L_0x0190:
            int r1 = r2.mo11614B1()
            r7 = r1
        L_0x0195:
            int r1 = r12.f2365g
            int r4 = f2543T
            r1 = r1 & r4
            if (r1 == 0) goto L_0x01ce
            r1 = 125(0x7d, float:1.75E-43)
            if (r7 == r13) goto L_0x01a2
            if (r7 != r1) goto L_0x01ce
        L_0x01a2:
            if (r7 != r1) goto L_0x01aa
            r2.mo11632T0()
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.END_OBJECT
            goto L_0x01af
        L_0x01aa:
            r2.mo11631S0()
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.END_ARRAY
        L_0x01af:
            r12.f2440h = r1
            return r1
        L_0x01b2:
            java.lang.String r1 = "was expecting comma to separate "
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
            b.j.a.a.r.d r2 = r12.f2411A
            java.lang.String r2 = r2.mo11507e()
            r1.append(r2)
            java.lang.String r2 = " entries"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r12.mo11535x0(r7, r1)
            throw r3
        L_0x01ce:
            b.j.a.a.r.d r1 = r12.f2411A
            boolean r1 = r1.mo11505c()
            r4 = 116(0x74, float:1.63E-43)
            r8 = 110(0x6e, float:1.54E-43)
            r10 = 102(0x66, float:1.43E-43)
            r11 = 91
            r13 = 45
            if (r1 != 0) goto L_0x023e
            r2.mo11617E1()
            r1 = 34
            if (r7 != r1) goto L_0x01ec
            r12.f2555N = r9
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.VALUE_STRING
            goto L_0x023b
        L_0x01ec:
            if (r7 == r13) goto L_0x0237
            if (r7 == r11) goto L_0x0228
            if (r7 == r10) goto L_0x0222
            if (r7 == r8) goto L_0x021c
            if (r7 == r4) goto L_0x0216
            r1 = 123(0x7b, float:1.72E-43)
            if (r7 == r1) goto L_0x0207
            switch(r7) {
                case 48: goto L_0x0202;
                case 49: goto L_0x0202;
                case 50: goto L_0x0202;
                case 51: goto L_0x0202;
                case 52: goto L_0x0202;
                case 53: goto L_0x0202;
                case 54: goto L_0x0202;
                case 55: goto L_0x0202;
                case 56: goto L_0x0202;
                case 57: goto L_0x0202;
                default: goto L_0x01fd;
            }
        L_0x01fd:
            b.j.a.a.j r1 = r12.mo11640b1(r7)
            goto L_0x023b
        L_0x0202:
            b.j.a.a.j r1 = r12.mo11651n1(r7)
            goto L_0x023b
        L_0x0207:
            b.j.a.a.r.d r1 = r12.f2411A
            int r2 = r12.f2429y
            int r3 = r12.f2430z
            b.j.a.a.r.d r1 = r1.mo11572h(r2, r3)
            r12.f2411A = r1
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.START_OBJECT
            goto L_0x023b
        L_0x0216:
            r2.mo11647i1()
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.VALUE_TRUE
            goto L_0x023b
        L_0x021c:
            r2.mo11644f1()
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.VALUE_NULL
            goto L_0x023b
        L_0x0222:
            r2.mo11643e1()
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.VALUE_FALSE
            goto L_0x023b
        L_0x0228:
            b.j.a.a.r.d r1 = r12.f2411A
            int r2 = r12.f2429y
            int r3 = r12.f2430z
            b.j.a.a.r.d r1 = r1.mo11571g(r2, r3)
            r12.f2411A = r1
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.START_ARRAY
            goto L_0x023b
        L_0x0237:
            b.j.a.a.j r1 = r2.mo11649l1()
        L_0x023b:
            r12.f2440h = r1
            return r1
        L_0x023e:
            int r1 = r12.f2424t
            r12.f2557P = r1
            r4 = 34
            if (r7 == r4) goto L_0x03ca
            java.lang.String r4 = " in field name"
            r8 = 39
            if (r7 != r8) goto L_0x0348
            int r10 = r12.f2365g
            int r11 = f2547X
            r10 = r10 & r11
            if (r10 == 0) goto L_0x0348
            int r7 = r12.f2425u
            if (r1 < r7) goto L_0x0266
            boolean r1 = r2.mo11641c1()
            if (r1 == 0) goto L_0x025e
            goto L_0x0266
        L_0x025e:
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.FIELD_NAME
            java.lang.String r2 = ": was expecting closing ''' for field name"
            r12.mo11533v0(r2, r1)
            throw r3
        L_0x0266:
            byte[] r1 = r12.f2559R
            int r7 = r12.f2424t
            int r10 = r7 + 1
            r12.f2424t = r10
            byte r1 = r1[r7]
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != r8) goto L_0x0276
            goto L_0x0645
        L_0x0276:
            int[] r7 = r12.f2554M
            int[] r10 = f2552c0
            r11 = 0
            r13 = 0
            r14 = 0
        L_0x027d:
            if (r1 != r8) goto L_0x02a3
            if (r13 <= 0) goto L_0x0295
            int r1 = r7.length
            if (r14 < r1) goto L_0x028c
            int r1 = r7.length
            int[] r1 = p005b.p082j.p083a.p084a.p085o.C1531b.m1809O0(r7, r1)
            r12.f2554M = r1
            r7 = r1
        L_0x028c:
            int r1 = r14 + 1
            int r3 = m1947j1(r11, r13)
            r7[r14] = r3
            r14 = r1
        L_0x0295:
            b.j.a.a.s.a r1 = r12.f2553L
            java.lang.String r1 = r1.mo11676n(r7, r14)
            if (r1 != 0) goto L_0x0647
            java.lang.String r1 = r12.mo11620H1(r7, r14, r13)
            goto L_0x0647
        L_0x02a3:
            r8 = r10[r1]
            if (r8 == 0) goto L_0x030a
            r8 = 34
            if (r1 == r8) goto L_0x030a
            r8 = 92
            if (r1 == r8) goto L_0x02b5
            java.lang.String r8 = "name"
            r12.mo11517L0(r1, r8)
            goto L_0x02b9
        L_0x02b5:
            char r1 = r2.mo11634V0()
        L_0x02b9:
            r8 = 127(0x7f, float:1.78E-43)
            if (r1 <= r8) goto L_0x030a
            r8 = 4
            if (r13 < r8) goto L_0x02d1
            int r8 = r7.length
            if (r14 < r8) goto L_0x02ca
            int r8 = r7.length
            int[] r7 = p005b.p082j.p083a.p084a.p085o.C1531b.m1809O0(r7, r8)
            r12.f2554M = r7
        L_0x02ca:
            int r8 = r14 + 1
            r7[r14] = r11
            r11 = 0
            r13 = 0
            r14 = r8
        L_0x02d1:
            r8 = 2048(0x800, float:2.87E-42)
            int r11 = r11 << 8
            if (r1 >= r8) goto L_0x02e0
            int r8 = r1 >> 6
            r8 = r8 | 192(0xc0, float:2.69E-43)
            r8 = r8 | r11
            int r13 = r13 + 1
        L_0x02de:
            r11 = r8
            goto L_0x0306
        L_0x02e0:
            int r8 = r1 >> 12
            r8 = r8 | 224(0xe0, float:3.14E-43)
            r8 = r8 | r11
            int r13 = r13 + 1
            r11 = 4
            if (r13 < r11) goto L_0x02fb
            int r11 = r7.length
            if (r14 < r11) goto L_0x02f4
            int r11 = r7.length
            int[] r7 = p005b.p082j.p083a.p084a.p085o.C1531b.m1809O0(r7, r11)
            r12.f2554M = r7
        L_0x02f4:
            int r11 = r14 + 1
            r7[r14] = r8
            r8 = 0
            r13 = 0
            r14 = r11
        L_0x02fb:
            int r8 = r8 << 8
            int r11 = r1 >> 6
            r11 = r11 & 63
            r11 = r11 | 128(0x80, float:1.794E-43)
            r8 = r8 | r11
            int r13 = r13 + r9
            goto L_0x02de
        L_0x0306:
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.794E-43)
        L_0x030a:
            r8 = 4
            if (r13 >= r8) goto L_0x0314
            int r13 = r13 + 1
            int r8 = r11 << 8
            r1 = r1 | r8
            r11 = r1
            goto L_0x0325
        L_0x0314:
            int r8 = r7.length
            if (r14 < r8) goto L_0x031e
            int r8 = r7.length
            int[] r7 = p005b.p082j.p083a.p084a.p085o.C1531b.m1809O0(r7, r8)
            r12.f2554M = r7
        L_0x031e:
            int r8 = r14 + 1
            r7[r14] = r11
            r11 = r1
            r14 = r8
            r13 = r9
        L_0x0325:
            int r1 = r12.f2424t
            int r8 = r12.f2425u
            if (r1 < r8) goto L_0x0338
            boolean r1 = r2.mo11641c1()
            if (r1 == 0) goto L_0x0332
            goto L_0x0338
        L_0x0332:
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.FIELD_NAME
            r12.mo11533v0(r4, r1)
            throw r3
        L_0x0338:
            byte[] r1 = r12.f2559R
            int r8 = r12.f2424t
            int r15 = r8 + 1
            r12.f2424t = r15
            byte r1 = r1[r8]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r8 = 39
            goto L_0x027d
        L_0x0348:
            int r1 = r12.f2365g
            int r8 = f2548Y
            r1 = r1 & r8
            if (r1 == 0) goto L_0x03bf
            int[] r1 = p005b.p082j.p083a.p084a.p087q.C1535a.f2446f
            r8 = r1[r7]
            if (r8 != 0) goto L_0x03b9
            int[] r8 = r12.f2554M
            r10 = 0
            r11 = 0
            r13 = 0
        L_0x035a:
            r14 = 4
            if (r10 >= r14) goto L_0x0364
            int r10 = r10 + 1
            int r13 = r13 << 8
            r7 = r7 | r13
            r13 = r7
            goto L_0x0375
        L_0x0364:
            int r10 = r8.length
            if (r11 < r10) goto L_0x036e
            int r10 = r8.length
            int[] r8 = p005b.p082j.p083a.p084a.p085o.C1531b.m1809O0(r8, r10)
            r12.f2554M = r8
        L_0x036e:
            int r10 = r11 + 1
            r8[r11] = r13
            r13 = r7
            r11 = r10
            r10 = r9
        L_0x0375:
            int r7 = r12.f2424t
            int r14 = r12.f2425u
            if (r7 < r14) goto L_0x0388
            boolean r7 = r2.mo11641c1()
            if (r7 == 0) goto L_0x0382
            goto L_0x0388
        L_0x0382:
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.FIELD_NAME
            r12.mo11533v0(r4, r1)
            throw r3
        L_0x0388:
            byte[] r7 = r12.f2559R
            int r14 = r12.f2424t
            byte r7 = r7[r14]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r15 = r1[r7]
            if (r15 == 0) goto L_0x03b4
            if (r10 <= 0) goto L_0x03a6
            int r1 = r8.length
            if (r11 < r1) goto L_0x03a1
            int r1 = r8.length
            int[] r1 = p005b.p082j.p083a.p084a.p085o.C1531b.m1809O0(r8, r1)
            r12.f2554M = r1
            r8 = r1
        L_0x03a1:
            int r1 = r11 + 1
            r8[r11] = r13
            r11 = r1
        L_0x03a6:
            b.j.a.a.s.a r1 = r12.f2553L
            java.lang.String r1 = r1.mo11676n(r8, r11)
            if (r1 != 0) goto L_0x0647
            java.lang.String r1 = r12.mo11620H1(r8, r11, r10)
            goto L_0x0647
        L_0x03b4:
            int r14 = r14 + 1
            r12.f2424t = r14
            goto L_0x035a
        L_0x03b9:
            java.lang.String r1 = "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"
            r12.mo11535x0(r7, r1)
            throw r3
        L_0x03bf:
            int r1 = r12.mo11633U0(r7)
            char r1 = (char) r1
            java.lang.String r2 = "was expecting double-quote to start field name"
            r12.mo11535x0(r1, r2)
            throw r3
        L_0x03ca:
            int r4 = r1 + 13
            int r7 = r12.f2425u
            if (r4 <= r7) goto L_0x0403
            if (r1 < r7) goto L_0x03e1
            boolean r1 = r2.mo11641c1()
            if (r1 == 0) goto L_0x03d9
            goto L_0x03e1
        L_0x03d9:
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.FIELD_NAME
            java.lang.String r2 = ": was expecting closing '\"' for name"
            r12.mo11533v0(r2, r1)
            throw r3
        L_0x03e1:
            byte[] r1 = r12.f2559R
            int r3 = r12.f2424t
            int r4 = r3 + 1
            r12.f2424t = r4
            byte r1 = r1[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 34
            if (r1 != r3) goto L_0x03f3
            goto L_0x0645
        L_0x03f3:
            int[] r14 = r12.f2554M
            r15 = 0
            r16 = 0
            r18 = 0
            r13 = r2
            r17 = r1
            java.lang.String r1 = r13.mo11626N1(r14, r15, r16, r17, r18)
            goto L_0x0647
        L_0x0403:
            byte[] r3 = r12.f2559R
            int[] r4 = f2552c0
            int r7 = r1 + 1
            r12.f2424t = r7
            byte r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r8 = r4[r1]
            if (r8 != 0) goto L_0x0641
            int r8 = r7 + 1
            r12.f2424t = r8
            byte r7 = r3[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r10 = r4[r7]
            if (r10 != 0) goto L_0x0633
            int r1 = r1 << 8
            r1 = r1 | r7
            int r7 = r8 + 1
            r12.f2424t = r7
            byte r8 = r3[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r10 = r4[r8]
            if (r10 != 0) goto L_0x0622
            int r1 = r1 << 8
            r1 = r1 | r8
            int r8 = r7 + 1
            r12.f2424t = r8
            byte r7 = r3[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r10 = r4[r7]
            if (r10 != 0) goto L_0x0616
            int r1 = r1 << 8
            r14 = r1 | r7
            int r1 = r8 + 1
            r12.f2424t = r1
            byte r7 = r3[r8]
            r8 = r7 & 255(0xff, float:3.57E-43)
            r7 = r4[r8]
            if (r7 != 0) goto L_0x060d
            r12.f2556O = r14
            int r7 = r1 + 1
            r12.f2424t = r7
            byte r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r10 = r4[r1]
            if (r10 == 0) goto L_0x046b
            r3 = 34
            if (r1 != r3) goto L_0x0465
            java.lang.String r1 = r12.mo11622J1(r14, r8, r9)
            goto L_0x0647
        L_0x0465:
            java.lang.String r1 = r12.mo11628P1(r14, r8, r1, r9)
            goto L_0x0647
        L_0x046b:
            int r8 = r8 << 8
            r1 = r1 | r8
            int r8 = r7 + 1
            r12.f2424t = r8
            byte r7 = r3[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r10 = r4[r7]
            if (r10 == 0) goto L_0x0480
            r3 = 34
            r4 = 2
            if (r7 != r3) goto L_0x04b8
            goto L_0x04b1
        L_0x0480:
            int r1 = r1 << 8
            r1 = r1 | r7
            int r7 = r8 + 1
            r12.f2424t = r7
            byte r8 = r3[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r10 = r4[r8]
            if (r10 == 0) goto L_0x049b
            r3 = 34
            r4 = 3
            if (r8 != r3) goto L_0x0495
            goto L_0x04b1
        L_0x0495:
            java.lang.String r1 = r12.mo11628P1(r14, r1, r8, r4)
            goto L_0x0647
        L_0x049b:
            int r1 = r1 << 8
            r15 = r1 | r8
            int r1 = r7 + 1
            r12.f2424t = r1
            byte r7 = r3[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = r4[r7]
            if (r8 == 0) goto L_0x04be
            r1 = 34
            r4 = 4
            if (r7 != r1) goto L_0x04b7
            r1 = r15
        L_0x04b1:
            java.lang.String r1 = r12.mo11622J1(r14, r1, r4)
            goto L_0x0647
        L_0x04b7:
            r1 = r15
        L_0x04b8:
            java.lang.String r1 = r12.mo11628P1(r14, r1, r7, r4)
            goto L_0x0647
        L_0x04be:
            int r8 = r1 + 1
            r12.f2424t = r8
            byte r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r10 = r4[r1]
            if (r10 == 0) goto L_0x04d6
            r3 = 34
            if (r1 != r3) goto L_0x04d4
            java.lang.String r1 = r12.mo11623K1(r14, r15, r7, r9)
            goto L_0x0647
        L_0x04d4:
            r3 = r9
            goto L_0x0508
        L_0x04d6:
            int r7 = r7 << 8
            r1 = r1 | r7
            int r7 = r8 + 1
            r12.f2424t = r7
            byte r8 = r3[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r10 = r4[r8]
            if (r10 == 0) goto L_0x04ed
            r3 = 34
            if (r8 != r3) goto L_0x04eb
            r3 = 2
            goto L_0x0523
        L_0x04eb:
            r3 = 2
            goto L_0x052a
        L_0x04ed:
            int r1 = r1 << 8
            r1 = r1 | r8
            int r8 = r7 + 1
            r12.f2424t = r8
            byte r7 = r3[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r10 = r4[r7]
            if (r10 == 0) goto L_0x050f
            r3 = 34
            if (r7 != r3) goto L_0x0502
            r3 = 3
            goto L_0x0523
        L_0x0502:
            r3 = 3
            r19 = r7
            r7 = r1
            r1 = r19
        L_0x0508:
            r17 = r1
            r18 = r3
            r16 = r7
            goto L_0x0530
        L_0x050f:
            int r1 = r1 << 8
            r1 = r1 | r7
            int r7 = r8 + 1
            r12.f2424t = r7
            byte r7 = r3[r8]
            r8 = r7 & 255(0xff, float:3.57E-43)
            r7 = r4[r8]
            if (r7 == 0) goto L_0x0537
            r3 = 34
            if (r8 != r3) goto L_0x0529
            r3 = 4
        L_0x0523:
            java.lang.String r1 = r12.mo11623K1(r14, r15, r1, r3)
            goto L_0x0647
        L_0x0529:
            r3 = 4
        L_0x052a:
            r16 = r1
            r18 = r3
            r17 = r8
        L_0x0530:
            r13 = r2
            java.lang.String r1 = r13.mo11629Q1(r14, r15, r16, r17, r18)
            goto L_0x0647
        L_0x0537:
            int[] r7 = r12.f2554M
            r10 = 0
            r7[r10] = r14
            r7[r9] = r15
            r10 = 2
            r7[r10] = r1
            r1 = 3
            r15 = r1
        L_0x0543:
            int r1 = r12.f2424t
            int r7 = r1 + 4
            int r10 = r12.f2425u
            if (r7 > r10) goto L_0x05ff
            int r7 = r1 + 1
            r12.f2424t = r7
            byte r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r10 = r4[r1]
            if (r10 == 0) goto L_0x0570
            r3 = 34
            int[] r14 = r12.f2554M
            if (r1 != r3) goto L_0x0563
            java.lang.String r1 = r12.mo11624L1(r14, r15, r8, r9)
            goto L_0x0647
        L_0x0563:
            r18 = 1
            r13 = r2
            r16 = r8
            r17 = r1
            java.lang.String r1 = r13.mo11626N1(r14, r15, r16, r17, r18)
            goto L_0x0647
        L_0x0570:
            int r8 = r8 << 8
            r1 = r1 | r8
            int r8 = r7 + 1
            r12.f2424t = r8
            byte r7 = r3[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r10 = r4[r7]
            if (r10 == 0) goto L_0x0599
            r3 = 34
            int[] r14 = r12.f2554M
            if (r7 != r3) goto L_0x058c
            r3 = 2
            java.lang.String r1 = r12.mo11624L1(r14, r15, r1, r3)
            goto L_0x0647
        L_0x058c:
            r18 = 2
            r13 = r2
            r16 = r1
            r17 = r7
            java.lang.String r1 = r13.mo11626N1(r14, r15, r16, r17, r18)
            goto L_0x0647
        L_0x0599:
            int r1 = r1 << 8
            r1 = r1 | r7
            int r7 = r8 + 1
            r12.f2424t = r7
            byte r8 = r3[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r10 = r4[r8]
            if (r10 == 0) goto L_0x05c2
            r3 = 34
            int[] r14 = r12.f2554M
            if (r8 != r3) goto L_0x05b5
            r3 = 3
            java.lang.String r1 = r12.mo11624L1(r14, r15, r1, r3)
            goto L_0x0647
        L_0x05b5:
            r18 = 3
            r13 = r2
            r16 = r1
            r17 = r8
            java.lang.String r1 = r13.mo11626N1(r14, r15, r16, r17, r18)
            goto L_0x0647
        L_0x05c2:
            int r1 = r1 << 8
            r1 = r1 | r8
            int r8 = r7 + 1
            r12.f2424t = r8
            byte r7 = r3[r7]
            r8 = r7 & 255(0xff, float:3.57E-43)
            r7 = r4[r8]
            if (r7 == 0) goto L_0x05eb
            r3 = 34
            int[] r14 = r12.f2554M
            if (r8 != r3) goto L_0x05de
            r3 = 4
            java.lang.String r1 = r12.mo11624L1(r14, r15, r1, r3)
            goto L_0x0647
        L_0x05de:
            r18 = 4
            r13 = r2
            r16 = r1
            r17 = r8
            java.lang.String r1 = r13.mo11626N1(r14, r15, r16, r17, r18)
            goto L_0x0647
        L_0x05eb:
            int[] r7 = r12.f2554M
            int r10 = r7.length
            if (r15 < r10) goto L_0x05f6
            int[] r7 = p005b.p082j.p083a.p084a.p085o.C1531b.m1809O0(r7, r15)
            r12.f2554M = r7
        L_0x05f6:
            int[] r7 = r12.f2554M
            int r10 = r15 + 1
            r7[r15] = r1
            r15 = r10
            goto L_0x0543
        L_0x05ff:
            int[] r14 = r12.f2554M
            r16 = 0
            r18 = 0
            r13 = r2
            r17 = r8
            java.lang.String r1 = r13.mo11626N1(r14, r15, r16, r17, r18)
            goto L_0x0647
        L_0x060d:
            r1 = 34
            r3 = 4
            if (r8 != r1) goto L_0x0614
            r1 = r14
            goto L_0x0628
        L_0x0614:
            r1 = r14
            goto L_0x062e
        L_0x0616:
            r3 = 34
            if (r7 != r3) goto L_0x061c
            r3 = 3
            goto L_0x0628
        L_0x061c:
            r3 = 3
            java.lang.String r1 = r12.mo11627O1(r1, r7, r3)
            goto L_0x0647
        L_0x0622:
            r3 = 34
            r4 = 2
            if (r8 != r3) goto L_0x062d
            r3 = r4
        L_0x0628:
            java.lang.String r1 = r12.mo11621I1(r1, r3)
            goto L_0x0647
        L_0x062d:
            r3 = r4
        L_0x062e:
            java.lang.String r1 = r12.mo11627O1(r1, r8, r3)
            goto L_0x0647
        L_0x0633:
            r3 = 34
            if (r7 != r3) goto L_0x063c
            java.lang.String r1 = r12.mo11621I1(r1, r9)
            goto L_0x0647
        L_0x063c:
            java.lang.String r1 = r12.mo11627O1(r1, r7, r9)
            goto L_0x0647
        L_0x0641:
            r3 = 34
            if (r1 != r3) goto L_0x0649
        L_0x0645:
            java.lang.String r1 = ""
        L_0x0647:
            r3 = 0
            goto L_0x064e
        L_0x0649:
            r3 = 0
            java.lang.String r1 = r12.mo11627O1(r3, r1, r3)
        L_0x064e:
            b.j.a.a.r.d r4 = r12.f2411A
            r4.mo11574j(r1)
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.FIELD_NAME
            r12.f2440h = r1
            int r1 = r12.f2424t
            int r4 = r1 + 4
            int r7 = r12.f2425u
            if (r4 < r7) goto L_0x0661
            goto L_0x06c8
        L_0x0661:
            byte[] r3 = r12.f2559R
            byte r4 = r3[r1]
            r7 = 58
            if (r4 != r7) goto L_0x068b
            int r1 = r1 + r9
            r12.f2424t = r1
            byte r4 = r3[r1]
            if (r4 <= r5) goto L_0x0677
            if (r4 == r6) goto L_0x06c2
            r3 = 35
            if (r4 != r3) goto L_0x06a8
            goto L_0x06c2
        L_0x0677:
            if (r4 == r5) goto L_0x067d
            r7 = 9
            if (r4 != r7) goto L_0x06c2
        L_0x067d:
            int r1 = r1 + r9
            r12.f2424t = r1
            byte r3 = r3[r1]
            if (r3 <= r5) goto L_0x06c2
            if (r3 == r6) goto L_0x06c2
            r4 = 35
            if (r3 != r4) goto L_0x06be
            goto L_0x06c2
        L_0x068b:
            if (r4 == r5) goto L_0x0691
            r8 = 9
            if (r4 != r8) goto L_0x0696
        L_0x0691:
            int r1 = r1 + r9
            r12.f2424t = r1
            byte r4 = r3[r1]
        L_0x0696:
            if (r4 != r7) goto L_0x06c7
            int r1 = r12.f2424t
            int r1 = r1 + r9
            r12.f2424t = r1
            byte r4 = r3[r1]
            if (r4 <= r5) goto L_0x06aa
            if (r4 == r6) goto L_0x06c2
            r3 = 35
            if (r4 != r3) goto L_0x06a8
            goto L_0x06c2
        L_0x06a8:
            r3 = r4
            goto L_0x06be
        L_0x06aa:
            if (r4 == r5) goto L_0x06b0
            r7 = 9
            if (r4 != r7) goto L_0x06c2
        L_0x06b0:
            int r1 = r1 + r9
            r12.f2424t = r1
            byte r3 = r3[r1]
            if (r3 <= r5) goto L_0x06c2
            if (r3 == r6) goto L_0x06c2
            r4 = 35
            if (r3 != r4) goto L_0x06be
            goto L_0x06c2
        L_0x06be:
            int r1 = r1 + r9
            r12.f2424t = r1
            goto L_0x06cc
        L_0x06c2:
            int r3 = r12.mo11659v1(r9)
            goto L_0x06cc
        L_0x06c7:
            r3 = 0
        L_0x06c8:
            int r3 = r12.mo11659v1(r3)
        L_0x06cc:
            r2.mo11617E1()
            r1 = 34
            if (r3 != r1) goto L_0x06dc
            r12.f2555N = r9
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.VALUE_STRING
            r12.f2412B = r1
            b.j.a.a.j r1 = r12.f2440h
            return r1
        L_0x06dc:
            r1 = 45
            if (r3 == r1) goto L_0x0719
            r1 = 91
            if (r3 == r1) goto L_0x0716
            r1 = 102(0x66, float:1.43E-43)
            if (r3 == r1) goto L_0x0710
            r1 = 110(0x6e, float:1.54E-43)
            if (r3 == r1) goto L_0x070a
            r1 = 116(0x74, float:1.63E-43)
            if (r3 == r1) goto L_0x0704
            r1 = 123(0x7b, float:1.72E-43)
            if (r3 == r1) goto L_0x0701
            switch(r3) {
                case 48: goto L_0x06fc;
                case 49: goto L_0x06fc;
                case 50: goto L_0x06fc;
                case 51: goto L_0x06fc;
                case 52: goto L_0x06fc;
                case 53: goto L_0x06fc;
                case 54: goto L_0x06fc;
                case 55: goto L_0x06fc;
                case 56: goto L_0x06fc;
                case 57: goto L_0x06fc;
                default: goto L_0x06f7;
            }
        L_0x06f7:
            b.j.a.a.j r1 = r12.mo11640b1(r3)
            goto L_0x071d
        L_0x06fc:
            b.j.a.a.j r1 = r12.mo11651n1(r3)
            goto L_0x071d
        L_0x0701:
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.START_OBJECT
            goto L_0x071d
        L_0x0704:
            r2.mo11647i1()
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.VALUE_TRUE
            goto L_0x071d
        L_0x070a:
            r2.mo11644f1()
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.VALUE_NULL
            goto L_0x071d
        L_0x0710:
            r2.mo11643e1()
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.VALUE_FALSE
            goto L_0x071d
        L_0x0716:
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.START_ARRAY
            goto L_0x071d
        L_0x0719:
            b.j.a.a.j r1 = r2.mo11649l1()
        L_0x071d:
            r12.f2412B = r1
            b.j.a.a.j r1 = r12.f2440h
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p088r.C1553h.mo11497l0():b.j.a.a.j");
    }

    /* renamed from: l1 */
    public C1525j mo11649l1() {
        int i;
        byte b;
        char[] g = this.f2413C.mo11702g();
        g[0] = '-';
        if (this.f2424t >= this.f2425u) {
            mo11642d1();
        }
        byte[] bArr = this.f2559R;
        int i2 = this.f2424t;
        this.f2424t = i2 + 1;
        int i3 = bArr[i2] & ExifInterface.MARKER;
        if (i3 <= 48) {
            if (i3 != 48) {
                return mo11639a1(i3, true);
            }
            i3 = mo11618F1();
        } else if (i3 > 57) {
            return mo11639a1(i3, true);
        }
        int i4 = 2;
        g[1] = (char) i3;
        int min = Math.min(this.f2425u, (this.f2424t + g.length) - 2);
        int i5 = 1;
        while (true) {
            int i6 = this.f2424t;
            if (i6 >= min) {
                return mo11650m1(g, i4, true, i5);
            }
            byte[] bArr2 = this.f2559R;
            i = i6 + 1;
            this.f2424t = i;
            b = bArr2[i6] & ExifInterface.MARKER;
            if (b >= 48 && b <= 57) {
                i5++;
                g[i4] = (char) b;
                i4++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return mo11648k1(g, i4, b, true, i5);
        }
        this.f2424t = i - 1;
        this.f2413C.f2637i = i4;
        if (this.f2411A.mo11506d()) {
            mo11619G1(b);
        }
        return mo11521Q0(true, i5);
    }

    /* renamed from: m1 */
    public final C1525j mo11650m1(char[] cArr, int i, boolean z, int i2) {
        int i3;
        byte b;
        char[] cArr2 = cArr;
        int i4 = i;
        int i5 = i2;
        while (true) {
            if (this.f2424t < this.f2425u || mo11641c1()) {
                byte[] bArr = this.f2559R;
                int i6 = this.f2424t;
                i3 = i6 + 1;
                this.f2424t = i3;
                b = bArr[i6] & ExifInterface.MARKER;
                if (b <= 57 && b >= 48) {
                    if (i4 >= cArr2.length) {
                        cArr2 = this.f2413C.mo11705j();
                        i4 = 0;
                    }
                    cArr2[i4] = (char) b;
                    i5++;
                    i4++;
                }
            } else {
                this.f2413C.f2637i = i4;
                this.f2420J = z;
                this.f2421K = i5;
                this.f2414D = 0;
                return C1525j.VALUE_NUMBER_INT;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return mo11648k1(cArr2, i4, b, z, i5);
        }
        this.f2424t = i3 - 1;
        this.f2413C.f2637i = i4;
        if (this.f2411A.mo11506d()) {
            mo11619G1(this.f2559R[this.f2424t] & ExifInterface.MARKER);
        }
        this.f2420J = z;
        this.f2421K = i5;
        this.f2414D = 0;
        return C1525j.VALUE_NUMBER_INT;
    }

    /* renamed from: n1 */
    public C1525j mo11651n1(int i) {
        int i2;
        byte b;
        char[] g = this.f2413C.mo11702g();
        if (i == 48) {
            i = mo11618F1();
        }
        g[0] = (char) i;
        int min = Math.min(this.f2425u, (this.f2424t + g.length) - 1);
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int i5 = this.f2424t;
            if (i5 >= min) {
                return mo11650m1(g, i3, false, i4);
            }
            byte[] bArr = this.f2559R;
            i2 = i5 + 1;
            this.f2424t = i2;
            b = bArr[i5] & ExifInterface.MARKER;
            if (b >= 48 && b <= 57) {
                i4++;
                g[i3] = (char) b;
                i3++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return mo11648k1(g, i3, b, false, i4);
        }
        this.f2424t = i2 - 1;
        this.f2413C.f2637i = i3;
        if (this.f2411A.mo11506d()) {
            mo11619G1(b);
        }
        return mo11521Q0(false, i4);
    }

    /* renamed from: o1 */
    public void mo11652o1(int i) {
        if (i < 32) {
            mo11537z0(i);
            throw null;
        } else {
            mo11653p1(i);
            throw null;
        }
    }

    /* renamed from: p1 */
    public void mo11653p1(int i) {
        StringBuilder u = C0843a.m460u("Invalid UTF-8 start byte 0x");
        u.append(Integer.toHexString(i));
        throw new C1520f(this, u.toString());
    }

    /* renamed from: q1 */
    public void mo11654q1(int i) {
        StringBuilder u = C0843a.m460u("Invalid UTF-8 middle byte 0x");
        u.append(Integer.toHexString(i));
        throw new C1520f(this, u.toString());
    }

    /* renamed from: r1 */
    public void mo11655r1(int i, int i2) {
        this.f2424t = i2;
        mo11654q1(i);
        throw null;
    }

    /* renamed from: s1 */
    public void mo11656s1(String str) {
        mo11657t1(str, mo11518M0());
        throw null;
    }

    /* renamed from: t1 */
    public void mo11657t1(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.f2424t >= this.f2425u && !mo11641c1()) {
                break;
            }
            byte[] bArr = this.f2559R;
            int i = this.f2424t;
            this.f2424t = i + 1;
            char U0 = (char) mo11633U0(bArr[i]);
            if (!Character.isJavaIdentifierPart(U0)) {
                break;
            }
            sb.append(U0);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        mo11531t0("Unrecognized token '%s': was expecting %s", sb, str2);
        throw null;
    }

    /* renamed from: u1 */
    public final void mo11658u1() {
        if (this.f2424t < this.f2425u || mo11641c1()) {
            byte[] bArr = this.f2559R;
            int i = this.f2424t;
            if (bArr[i] == 10) {
                this.f2424t = i + 1;
            }
        }
        this.f2427w++;
        this.f2428x = this.f2424t;
    }

    /* renamed from: v1 */
    public final int mo11659v1(boolean z) {
        while (true) {
            if (this.f2424t < this.f2425u || mo11641c1()) {
                byte[] bArr = this.f2559R;
                int i = this.f2424t;
                int i2 = i + 1;
                this.f2424t = i2;
                byte b = bArr[i] & ExifInterface.MARKER;
                if (b > 32) {
                    if (b == 47) {
                        mo11660w1();
                    } else if (b != 35 || !mo11616D1()) {
                        if (z) {
                            return b;
                        }
                        if (b == 58) {
                            z = true;
                        } else {
                            mo11535x0(b, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.f2427w++;
                    this.f2428x = i2;
                } else if (b == 13) {
                    mo11658u1();
                } else if (b != 9) {
                    mo11537z0(b);
                    throw null;
                }
            } else {
                StringBuilder u = C0843a.m460u(" within/between ");
                u.append(this.f2411A.mo11507e());
                u.append(" entries");
                mo11533v0(u.toString(), (C1525j) null);
                throw null;
            }
        }
    }

    /* renamed from: w1 */
    public final void mo11660w1() {
        if ((this.f2365g & f2549Z) == 0) {
            mo11535x0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this.f2424t < this.f2425u || mo11641c1()) {
            byte[] bArr = this.f2559R;
            int i = this.f2424t;
            this.f2424t = i + 1;
            byte b = bArr[i] & ExifInterface.MARKER;
            if (b == 47) {
                mo11661x1();
            } else if (b == 42) {
                int[] iArr = C1535a.f2447g;
                while (true) {
                    if (this.f2424t >= this.f2425u && !mo11641c1()) {
                        break;
                    }
                    byte[] bArr2 = this.f2559R;
                    int i2 = this.f2424t;
                    int i3 = i2 + 1;
                    this.f2424t = i3;
                    byte b2 = bArr2[i2] & ExifInterface.MARKER;
                    int i4 = iArr[b2];
                    if (i4 != 0) {
                        if (i4 == 2) {
                            mo11662y1();
                        } else if (i4 == 3) {
                            mo11663z1();
                        } else if (i4 == 4) {
                            mo11613A1();
                        } else if (i4 == 10) {
                            this.f2427w++;
                            this.f2428x = i3;
                        } else if (i4 == 13) {
                            mo11658u1();
                        } else if (i4 == 42) {
                            if (i3 >= this.f2425u && !mo11641c1()) {
                                break;
                            }
                            byte[] bArr3 = this.f2559R;
                            int i5 = this.f2424t;
                            if (bArr3[i5] == 47) {
                                this.f2424t = i5 + 1;
                                return;
                            }
                        } else {
                            mo11652o1(b2);
                            throw null;
                        }
                    }
                }
                mo11533v0(" in a comment", (C1525j) null);
                throw null;
            } else {
                mo11535x0(b, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            mo11533v0(" in a comment", (C1525j) null);
            throw null;
        }
    }

    /* renamed from: x1 */
    public final void mo11661x1() {
        int[] iArr = C1535a.f2447g;
        while (true) {
            if (this.f2424t < this.f2425u || mo11641c1()) {
                byte[] bArr = this.f2559R;
                int i = this.f2424t;
                int i2 = i + 1;
                this.f2424t = i2;
                byte b = bArr[i] & ExifInterface.MARKER;
                int i3 = iArr[b];
                if (i3 != 0) {
                    if (i3 == 2) {
                        mo11662y1();
                    } else if (i3 == 3) {
                        mo11663z1();
                    } else if (i3 == 4) {
                        mo11613A1();
                    } else if (i3 == 10) {
                        this.f2427w++;
                        this.f2428x = i2;
                        return;
                    } else if (i3 == 13) {
                        mo11658u1();
                        return;
                    } else if (i3 != 42 && i3 < 0) {
                        mo11652o1(b);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: y1 */
    public final void mo11662y1() {
        if (this.f2424t >= this.f2425u) {
            mo11642d1();
        }
        byte[] bArr = this.f2559R;
        int i = this.f2424t;
        int i2 = i + 1;
        this.f2424t = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            mo11655r1(b & ExifInterface.MARKER, i2);
            throw null;
        }
    }

    /* renamed from: z1 */
    public final void mo11663z1() {
        if (this.f2424t >= this.f2425u) {
            mo11642d1();
        }
        byte[] bArr = this.f2559R;
        int i = this.f2424t;
        int i2 = i + 1;
        this.f2424t = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= this.f2425u) {
                mo11642d1();
            }
            byte[] bArr2 = this.f2559R;
            int i3 = this.f2424t;
            int i4 = i3 + 1;
            this.f2424t = i4;
            byte b2 = bArr2[i3];
            if ((b2 & 192) != 128) {
                mo11655r1(b2 & ExifInterface.MARKER, i4);
                throw null;
            }
            return;
        }
        mo11655r1(b & ExifInterface.MARKER, i2);
        throw null;
    }
}
