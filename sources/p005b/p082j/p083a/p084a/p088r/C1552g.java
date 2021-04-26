package p005b.p082j.p083a.p084a.p088r;

import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p082j.p083a.p084a.C1516c;
import p005b.p082j.p083a.p084a.C1517d;
import p005b.p082j.p083a.p084a.C1526k;
import p005b.p082j.p083a.p084a.C1527l;
import p005b.p082j.p083a.p084a.C1528m;
import p005b.p082j.p083a.p084a.p087q.C1535a;
import p005b.p082j.p083a.p084a.p087q.C1537b;
import p005b.p082j.p083a.p084a.p087q.C1542g;
import p005b.p082j.p083a.p084a.p087q.C1543h;
import p005b.p082j.p083a.p084a.p090t.C1563e;

/* renamed from: b.j.a.a.r.g */
public class C1552g extends C1548c {

    /* renamed from: A */
    public static final byte[] f2530A = {110, 117, 108, 108};

    /* renamed from: B */
    public static final byte[] f2531B = {116, 114, 117, 101};

    /* renamed from: C */
    public static final byte[] f2532C = {102, 97, 108, 115, 101};

    /* renamed from: z */
    public static final byte[] f2533z = ((byte[]) C1535a.f2442b.clone());

    /* renamed from: q */
    public final OutputStream f2534q;

    /* renamed from: r */
    public byte f2535r;

    /* renamed from: s */
    public byte[] f2536s;

    /* renamed from: t */
    public int f2537t;

    /* renamed from: u */
    public final int f2538u;

    /* renamed from: v */
    public final int f2539v;

    /* renamed from: w */
    public char[] f2540w;

    /* renamed from: x */
    public final int f2541x;

    /* renamed from: y */
    public boolean f2542y;

    public C1552g(C1537b bVar, int i, C1526k kVar, OutputStream outputStream, char c) {
        super(bVar, i, kVar);
        this.f2534q = outputStream;
        this.f2535r = (byte) c;
        if (c != '\"') {
            this.f2499l = C1535a.m1848a(c);
        }
        this.f2542y = true;
        bVar.mo11538a(bVar.f2457f);
        byte[] a = bVar.f2455d.mo11684a(1);
        bVar.f2457f = a;
        this.f2536s = a;
        int length = a.length;
        this.f2538u = length;
        this.f2539v = length >> 3;
        bVar.mo11538a(bVar.f2459h);
        char[] b = bVar.f2455d.mo11685b(1, 0);
        bVar.f2459h = b;
        this.f2540w = b;
        this.f2541x = b.length;
        if (mo11510v0(C1517d.C1518a.ESCAPE_NON_ASCII)) {
            mo11569y0(127);
        }
    }

    /* renamed from: A0 */
    public final int mo11602A0(int i, int i2) {
        byte[] bArr = this.f2536s;
        if (i < 55296 || i > 57343) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | 224);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            bArr[i4] = (byte) ((i & 63) | 128);
            return i4 + 1;
        }
        int i5 = i2 + 1;
        bArr[i2] = 92;
        int i6 = i5 + 1;
        bArr[i5] = 117;
        int i7 = i6 + 1;
        byte[] bArr2 = f2533z;
        bArr[i6] = bArr2[(i >> 12) & 15];
        int i8 = i7 + 1;
        bArr[i7] = bArr2[(i >> 8) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i >> 4) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[i & 15];
        return i10;
    }

    /* renamed from: B0 */
    public final int mo11603B0(int i, char[] cArr, int i2, int i3) {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this.f2536s;
            int i4 = this.f2537t;
            int i5 = i4 + 1;
            this.f2537t = i5;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i6 = i5 + 1;
            this.f2537t = i6;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            this.f2537t = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        } else if (i2 >= i3 || cArr == null) {
            throw new C1516c(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", new Object[]{Integer.valueOf(i)}), this);
        } else {
            char c = cArr[i2];
            if (c < 56320 || c > 57343) {
                StringBuilder u = C0843a.m460u("Incomplete surrogate pair: first char 0x");
                u.append(Integer.toHexString(i));
                u.append(", second 0x");
                u.append(Integer.toHexString(c));
                throw new C1516c(u.toString(), this);
            }
            int i7 = (c - 56320) + ((i - 55296) << 10) + 65536;
            if (this.f2537t + 4 > this.f2538u) {
                mo11612z0();
            }
            byte[] bArr2 = this.f2536s;
            int i8 = this.f2537t;
            int i9 = i8 + 1;
            this.f2537t = i9;
            bArr2[i8] = (byte) ((i7 >> 18) | 240);
            int i10 = i9 + 1;
            this.f2537t = i10;
            bArr2[i9] = (byte) (((i7 >> 12) & 63) | 128);
            int i11 = i10 + 1;
            this.f2537t = i11;
            bArr2[i10] = (byte) (((i7 >> 6) & 63) | 128);
            this.f2537t = i11 + 1;
            bArr2[i11] = (byte) ((i7 & 63) | 128);
            return i2 + 1;
        }
    }

    /* renamed from: C0 */
    public final void mo11604C0(String str) {
        byte b;
        int k = this.f2410j.mo11580k();
        if (this.f2345g != null) {
            mo11568x0(str, k);
            return;
        }
        if (k == 1) {
            b = 44;
        } else if (k == 2) {
            b = 58;
        } else if (k == 3) {
            C1528m mVar = this.f2501n;
            if (mVar != null) {
                byte[] a = ((C1543h) mVar).mo11553a();
                if (a.length > 0) {
                    mo11605D0(a);
                    return;
                }
                return;
            }
            return;
        } else if (k == 5) {
            mo11567w0(str);
            throw null;
        } else {
            return;
        }
        if (this.f2537t >= this.f2538u) {
            mo11612z0();
        }
        byte[] bArr = this.f2536s;
        int i = this.f2537t;
        this.f2537t = i + 1;
        bArr[i] = b;
    }

    /* renamed from: D0 */
    public final void mo11605D0(byte[] bArr) {
        int length = bArr.length;
        if (this.f2537t + length > this.f2538u) {
            mo11612z0();
            if (length > 512) {
                this.f2534q.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f2536s, this.f2537t, length);
        this.f2537t += length;
    }

    /* renamed from: E0 */
    public final int mo11606E0(int i, int i2) {
        int i3;
        byte[] bArr = this.f2536s;
        int i4 = i2 + 1;
        bArr[i2] = 92;
        int i5 = i4 + 1;
        bArr[i4] = 117;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = f2533z;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= 255;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = 48;
            i3 = i8 + 1;
            bArr[i8] = 48;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = f2533z;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    /* renamed from: F0 */
    public final void mo11607F0() {
        if (this.f2537t + 4 >= this.f2538u) {
            mo11612z0();
        }
        System.arraycopy(f2530A, 0, this.f2536s, this.f2537t, 4);
        this.f2537t += 4;
    }

    /* renamed from: G0 */
    public final void mo11608G0(String str) {
        if (this.f2537t >= this.f2538u) {
            mo11612z0();
        }
        byte[] bArr = this.f2536s;
        int i = this.f2537t;
        this.f2537t = i + 1;
        bArr[i] = this.f2535r;
        mo11474p0(str);
        if (this.f2537t >= this.f2538u) {
            mo11612z0();
        }
        byte[] bArr2 = this.f2536s;
        int i2 = this.f2537t;
        this.f2537t = i2 + 1;
        bArr2[i2] = this.f2535r;
    }

    /* renamed from: H */
    public void mo11460H(String str) {
        int i = 0;
        if (this.f2345g != null) {
            int j = this.f2410j.mo11579j(str);
            if (j != 4) {
                if (j == 1) {
                    C1563e eVar = (C1563e) this.f2345g;
                    Objects.requireNonNull(eVar.f2624k);
                    mo11472n0(',');
                    eVar.f2620g.mo11692a(this, eVar.f2623j);
                } else {
                    C1563e eVar2 = (C1563e) this.f2345g;
                    eVar2.f2620g.mo11692a(this, eVar2.f2623j);
                }
                if (this.f2502o) {
                    mo11611J0(str, false);
                    return;
                }
                int length = str.length();
                if (length > this.f2541x) {
                    mo11611J0(str, true);
                    return;
                }
                if (this.f2537t >= this.f2538u) {
                    mo11612z0();
                }
                byte[] bArr = this.f2536s;
                int i2 = this.f2537t;
                this.f2537t = i2 + 1;
                bArr[i2] = this.f2535r;
                str.getChars(0, length, this.f2540w, 0);
                if (length <= this.f2539v) {
                    if (this.f2537t + length > this.f2538u) {
                        mo11612z0();
                    }
                    mo11610I0(this.f2540w, 0, length);
                } else {
                    char[] cArr = this.f2540w;
                    do {
                        int min = Math.min(this.f2539v, length);
                        if (this.f2537t + min > this.f2538u) {
                            mo11612z0();
                        }
                        mo11610I0(cArr, i, min);
                        i += min;
                        length -= min;
                    } while (length > 0);
                }
                if (this.f2537t >= this.f2538u) {
                    mo11612z0();
                }
                byte[] bArr2 = this.f2536s;
                int i3 = this.f2537t;
                this.f2537t = i3 + 1;
                bArr2[i3] = this.f2535r;
                return;
            }
            throw new C1516c("Can not write a field name, expecting a value", this);
        }
        int j2 = this.f2410j.mo11579j(str);
        if (j2 != 4) {
            if (j2 == 1) {
                if (this.f2537t >= this.f2538u) {
                    mo11612z0();
                }
                byte[] bArr3 = this.f2536s;
                int i4 = this.f2537t;
                this.f2537t = i4 + 1;
                bArr3[i4] = 44;
            }
            if (this.f2502o) {
                mo11611J0(str, false);
                return;
            }
            int length2 = str.length();
            if (length2 > this.f2541x) {
                mo11611J0(str, true);
                return;
            }
            if (this.f2537t >= this.f2538u) {
                mo11612z0();
            }
            byte[] bArr4 = this.f2536s;
            int i5 = this.f2537t;
            int i6 = i5 + 1;
            this.f2537t = i6;
            bArr4[i5] = this.f2535r;
            if (length2 <= this.f2539v) {
                if (i6 + length2 > this.f2538u) {
                    mo11612z0();
                }
                mo11609H0(str, 0, length2);
            } else {
                do {
                    int min2 = Math.min(this.f2539v, length2);
                    if (this.f2537t + min2 > this.f2538u) {
                        mo11612z0();
                    }
                    mo11609H0(str, i, min2);
                    i += min2;
                    length2 -= min2;
                } while (length2 > 0);
            }
            if (this.f2537t >= this.f2538u) {
                mo11612z0();
            }
            byte[] bArr5 = this.f2536s;
            int i7 = this.f2537t;
            this.f2537t = i7 + 1;
            bArr5[i7] = this.f2535r;
            return;
        }
        throw new C1516c("Can not write a field name, expecting a value", this);
    }

    /* renamed from: H0 */
    public final void mo11609H0(String str, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        int i5 = i2 + i;
        int i6 = this.f2537t;
        byte[] bArr = this.f2536s;
        int[] iArr = this.f2499l;
        while (r12 < i5 && (charAt = str.charAt(r12)) <= 127 && iArr[charAt] == 0) {
            bArr[i6] = (byte) charAt;
            i = r12 + 1;
            i6++;
        }
        this.f2537t = i6;
        if (r12 >= i5) {
            return;
        }
        if (this.f2500m == 0) {
            if (C0843a.m462w(i5, r12, 6, i6) > this.f2538u) {
                mo11612z0();
            }
            int i7 = this.f2537t;
            byte[] bArr2 = this.f2536s;
            int[] iArr2 = this.f2499l;
            while (r12 < i5) {
                int i8 = r12 + 1;
                char charAt2 = str.charAt(r12);
                if (charAt2 <= 127) {
                    if (iArr2[charAt2] == 0) {
                        bArr2[i7] = (byte) charAt2;
                        r12 = i8;
                        i7++;
                    } else {
                        int i9 = iArr2[charAt2];
                        if (i9 > 0) {
                            int i10 = i7 + 1;
                            bArr2[i7] = 92;
                            i7 = i10 + 1;
                            bArr2[i10] = (byte) i9;
                            r12 = i8;
                        } else {
                            i4 = mo11606E0(charAt2, i7);
                        }
                    }
                } else if (charAt2 <= 2047) {
                    int i11 = i7 + 1;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    i7 = i11 + 1;
                    bArr2[i11] = (byte) ((charAt2 & '?') | 128);
                    r12 = i8;
                } else {
                    i4 = mo11602A0(charAt2, i7);
                }
                i7 = i4;
                r12 = i8;
            }
            this.f2537t = i7;
            return;
        }
        if (C0843a.m462w(i5, r12, 6, i6) > this.f2538u) {
            mo11612z0();
        }
        int i12 = this.f2537t;
        byte[] bArr3 = this.f2536s;
        int[] iArr3 = this.f2499l;
        int i13 = this.f2500m;
        while (r12 < i5) {
            int i14 = r12 + 1;
            char charAt3 = str.charAt(r12);
            if (charAt3 <= 127) {
                if (iArr3[charAt3] == 0) {
                    bArr3[i12] = (byte) charAt3;
                    r12 = i14;
                    i12++;
                } else {
                    int i15 = iArr3[charAt3];
                    if (i15 > 0) {
                        int i16 = i12 + 1;
                        bArr3[i12] = 92;
                        i12 = i16 + 1;
                        bArr3[i16] = (byte) i15;
                        r12 = i14;
                    }
                }
            } else if (charAt3 <= i13) {
                if (charAt3 <= 2047) {
                    int i17 = i12 + 1;
                    bArr3[i12] = (byte) ((charAt3 >> 6) | 192);
                    i12 = i17 + 1;
                    bArr3[i17] = (byte) ((charAt3 & '?') | 128);
                    r12 = i14;
                } else {
                    i3 = mo11602A0(charAt3, i12);
                    i12 = i3;
                    r12 = i14;
                }
            }
            i3 = mo11606E0(charAt3, i12);
            i12 = i3;
            r12 = i14;
        }
        this.f2537t = i12;
    }

    /* renamed from: I0 */
    public final void mo11610I0(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        char c;
        int i5 = i2 + i;
        int i6 = this.f2537t;
        byte[] bArr = this.f2536s;
        int[] iArr = this.f2499l;
        while (r12 < i5 && (c = cArr[r12]) <= 127 && iArr[c] == 0) {
            bArr[i6] = (byte) c;
            i = r12 + 1;
            i6++;
        }
        this.f2537t = i6;
        if (r12 >= i5) {
            return;
        }
        if (this.f2500m == 0) {
            if (C0843a.m462w(i5, r12, 6, i6) > this.f2538u) {
                mo11612z0();
            }
            int i7 = this.f2537t;
            byte[] bArr2 = this.f2536s;
            int[] iArr2 = this.f2499l;
            while (r12 < i5) {
                int i8 = r12 + 1;
                char c2 = cArr[r12];
                if (c2 <= 127) {
                    if (iArr2[c2] == 0) {
                        bArr2[i7] = (byte) c2;
                        r12 = i8;
                        i7++;
                    } else {
                        int i9 = iArr2[c2];
                        if (i9 > 0) {
                            int i10 = i7 + 1;
                            bArr2[i7] = 92;
                            i7 = i10 + 1;
                            bArr2[i10] = (byte) i9;
                            r12 = i8;
                        } else {
                            i4 = mo11606E0(c2, i7);
                        }
                    }
                } else if (c2 <= 2047) {
                    int i11 = i7 + 1;
                    bArr2[i7] = (byte) ((c2 >> 6) | 192);
                    i7 = i11 + 1;
                    bArr2[i11] = (byte) ((c2 & '?') | 128);
                    r12 = i8;
                } else {
                    i4 = mo11602A0(c2, i7);
                }
                i7 = i4;
                r12 = i8;
            }
            this.f2537t = i7;
            return;
        }
        if (C0843a.m462w(i5, r12, 6, i6) > this.f2538u) {
            mo11612z0();
        }
        int i12 = this.f2537t;
        byte[] bArr3 = this.f2536s;
        int[] iArr3 = this.f2499l;
        int i13 = this.f2500m;
        while (r12 < i5) {
            int i14 = r12 + 1;
            char c3 = cArr[r12];
            if (c3 <= 127) {
                if (iArr3[c3] == 0) {
                    bArr3[i12] = (byte) c3;
                    r12 = i14;
                    i12++;
                } else {
                    int i15 = iArr3[c3];
                    if (i15 > 0) {
                        int i16 = i12 + 1;
                        bArr3[i12] = 92;
                        i12 = i16 + 1;
                        bArr3[i16] = (byte) i15;
                        r12 = i14;
                    }
                }
            } else if (c3 <= i13) {
                if (c3 <= 2047) {
                    int i17 = i12 + 1;
                    bArr3[i12] = (byte) ((c3 >> 6) | 192);
                    i12 = i17 + 1;
                    bArr3[i17] = (byte) ((c3 & '?') | 128);
                    r12 = i14;
                } else {
                    i3 = mo11602A0(c3, i12);
                    i12 = i3;
                    r12 = i14;
                }
            }
            i3 = mo11606E0(c3, i12);
            i12 = i3;
            r12 = i14;
        }
        this.f2537t = i12;
    }

    /* renamed from: J0 */
    public final void mo11611J0(String str, boolean z) {
        if (z) {
            if (this.f2537t >= this.f2538u) {
                mo11612z0();
            }
            byte[] bArr = this.f2536s;
            int i = this.f2537t;
            this.f2537t = i + 1;
            bArr[i] = this.f2535r;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int min = Math.min(this.f2539v, length);
            if (this.f2537t + min > this.f2538u) {
                mo11612z0();
            }
            mo11609H0(str, i2, min);
            i2 += min;
            length -= min;
        }
        if (z) {
            if (this.f2537t >= this.f2538u) {
                mo11612z0();
            }
            byte[] bArr2 = this.f2536s;
            int i3 = this.f2537t;
            this.f2537t = i3 + 1;
            bArr2[i3] = this.f2535r;
        }
    }

    /* renamed from: N */
    public void mo11461N() {
        mo11604C0("write a null");
        mo11607F0();
    }

    /* renamed from: O */
    public void mo11462O(double d) {
        if (this.f2409i || (C1542g.m1863d(d) && C1517d.C1518a.QUOTE_NON_NUMERIC_NUMBERS.mo11481e(this.f2408h))) {
            mo11479t0(String.valueOf(d));
            return;
        }
        mo11604C0("write a number");
        mo11474p0(String.valueOf(d));
    }

    /* renamed from: S */
    public void mo11463S(float f) {
        if (this.f2409i || (C1542g.m1864e(f) && C1517d.C1518a.QUOTE_NON_NUMERIC_NUMBERS.mo11481e(this.f2408h))) {
            mo11479t0(String.valueOf(f));
            return;
        }
        mo11604C0("write a number");
        mo11474p0(String.valueOf(f));
    }

    /* renamed from: Z */
    public void mo11464Z(int i) {
        mo11604C0("write a number");
        if (this.f2537t + 11 >= this.f2538u) {
            mo11612z0();
        }
        if (this.f2409i) {
            if (this.f2537t + 13 >= this.f2538u) {
                mo11612z0();
            }
            byte[] bArr = this.f2536s;
            int i2 = this.f2537t;
            int i3 = i2 + 1;
            this.f2537t = i3;
            bArr[i2] = this.f2535r;
            int f = C1542g.m1865f(i, bArr, i3);
            this.f2537t = f;
            byte[] bArr2 = this.f2536s;
            this.f2537t = f + 1;
            bArr2[f] = this.f2535r;
            return;
        }
        this.f2537t = C1542g.m1865f(i, this.f2536s, this.f2537t);
    }

    public void close() {
        if (this.f2536s != null && mo11510v0(C1517d.C1518a.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C1550e eVar = this.f2410j;
                if (!eVar.mo11504b()) {
                    if (!eVar.mo11505c()) {
                        break;
                    }
                    mo11480z();
                } else {
                    mo11475q();
                }
            }
        }
        mo11612z0();
        this.f2537t = 0;
        if (this.f2534q != null) {
            if (this.f2498k.f2454c || mo11510v0(C1517d.C1518a.AUTO_CLOSE_TARGET)) {
                this.f2534q.close();
            } else if (mo11510v0(C1517d.C1518a.FLUSH_PASSED_TO_STREAM)) {
                this.f2534q.flush();
            }
        }
        byte[] bArr = this.f2536s;
        if (bArr != null && this.f2542y) {
            this.f2536s = null;
            this.f2498k.mo11541d(bArr);
        }
        char[] cArr = this.f2540w;
        if (cArr != null) {
            this.f2540w = null;
            C1537b bVar = this.f2498k;
            Objects.requireNonNull(bVar);
            bVar.mo11539b(cArr, bVar.f2459h);
            bVar.f2459h = null;
            bVar.f2455d.f2606b.set(1, cArr);
        }
    }

    /* renamed from: e */
    public void mo11467e(boolean z) {
        mo11604C0("write a boolean value");
        if (this.f2537t + 5 >= this.f2538u) {
            mo11612z0();
        }
        byte[] bArr = z ? f2531B : f2532C;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f2536s, this.f2537t, length);
        this.f2537t += length;
    }

    /* renamed from: f0 */
    public void mo11468f0(long j) {
        mo11604C0("write a number");
        if (this.f2409i) {
            if (this.f2537t + 23 >= this.f2538u) {
                mo11612z0();
            }
            byte[] bArr = this.f2536s;
            int i = this.f2537t;
            int i2 = i + 1;
            this.f2537t = i2;
            bArr[i] = this.f2535r;
            int g = C1542g.m1866g(j, bArr, i2);
            this.f2537t = g;
            byte[] bArr2 = this.f2536s;
            this.f2537t = g + 1;
            bArr2[g] = this.f2535r;
            return;
        }
        if (this.f2537t + 21 >= this.f2538u) {
            mo11612z0();
        }
        this.f2537t = C1542g.m1866g(j, this.f2536s, this.f2537t);
    }

    public void flush() {
        mo11612z0();
        if (this.f2534q != null && mo11510v0(C1517d.C1518a.FLUSH_PASSED_TO_STREAM)) {
            this.f2534q.flush();
        }
    }

    /* renamed from: h0 */
    public void mo11470h0(BigDecimal bigDecimal) {
        mo11604C0("write a number");
        if (bigDecimal == null) {
            mo11607F0();
            return;
        }
        boolean z = this.f2409i;
        String u0 = mo11509u0(bigDecimal);
        if (z) {
            mo11608G0(u0);
        } else {
            mo11474p0(u0);
        }
    }

    /* renamed from: l0 */
    public void mo11471l0(BigInteger bigInteger) {
        mo11604C0("write a number");
        if (bigInteger == null) {
            mo11607F0();
            return;
        }
        boolean z = this.f2409i;
        String bigInteger2 = bigInteger.toString();
        if (z) {
            mo11608G0(bigInteger2);
        } else {
            mo11474p0(bigInteger2);
        }
    }

    /* renamed from: n0 */
    public void mo11472n0(char c) {
        if (this.f2537t + 3 >= this.f2538u) {
            mo11612z0();
        }
        byte[] bArr = this.f2536s;
        if (c <= 127) {
            int i = this.f2537t;
            this.f2537t = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            int i2 = this.f2537t;
            int i3 = i2 + 1;
            this.f2537t = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.f2537t = i3 + 1;
            bArr[i3] = (byte) ((c & '?') | 128);
        } else {
            mo11603B0(c, (char[]) null, 0, 0);
        }
    }

    /* renamed from: o0 */
    public void mo11473o0(C1528m mVar) {
        byte[] bArr = this.f2536s;
        int i = this.f2537t;
        C1543h hVar = (C1543h) mVar;
        byte[] bArr2 = hVar.f2473h;
        if (bArr2 == null) {
            bArr2 = C1543h.f2471i.mo11542b(hVar.f2472g);
            hVar.f2473h = bArr2;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            length = -1;
        } else {
            System.arraycopy(bArr2, 0, bArr, i, length);
        }
        if (length < 0) {
            mo11605D0(((C1543h) mVar).mo11553a());
        } else {
            this.f2537t += length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r7 = r6 - 1;
     */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11474p0(java.lang.String r14) {
        /*
            r13 = this;
            int r0 = r14.length()
            char[] r1 = r13.f2540w
            int r2 = r1.length
            r3 = 0
            if (r0 > r2) goto L_0x0012
            r14.getChars(r3, r0, r1, r3)
            r13.mo11476q0(r1, r3, r0)
            goto L_0x0098
        L_0x0012:
            int r2 = r1.length
            if (r0 > r2) goto L_0x001f
            int r2 = r3 + r0
            r14.getChars(r3, r2, r1, r3)
            r13.mo11476q0(r1, r3, r0)
            goto L_0x0098
        L_0x001f:
            int r4 = r13.f2538u
            int r5 = r4 >> 2
            int r4 = r4 >> 4
            int r5 = r5 + r4
            int r2 = java.lang.Math.min(r2, r5)
            int r4 = r2 * 3
            r5 = r3
        L_0x002d:
            if (r0 <= 0) goto L_0x0098
            int r6 = java.lang.Math.min(r2, r0)
            int r7 = r5 + r6
            r14.getChars(r5, r7, r1, r3)
            int r7 = r13.f2537t
            int r7 = r7 + r4
            int r8 = r13.f2538u
            if (r7 <= r8) goto L_0x0042
            r13.mo11612z0()
        L_0x0042:
            r7 = 1
            if (r6 <= r7) goto L_0x0054
            int r7 = r6 + -1
            char r8 = r1[r7]
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r9) goto L_0x0054
            r9 = 56319(0xdbff, float:7.892E-41)
            if (r8 > r9) goto L_0x0054
            r6 = r7
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r7 >= r6) goto L_0x0095
        L_0x0057:
            char r8 = r1[r7]
            r9 = 127(0x7f, float:1.78E-43)
            if (r8 <= r9) goto L_0x0086
            int r8 = r7 + 1
            char r7 = r1[r7]
            r9 = 2048(0x800, float:2.87E-42)
            if (r7 >= r9) goto L_0x0081
            byte[] r9 = r13.f2536s
            int r10 = r13.f2537t
            int r11 = r10 + 1
            r13.f2537t = r11
            int r12 = r7 >> 6
            r12 = r12 | 192(0xc0, float:2.69E-43)
            byte r12 = (byte) r12
            r9[r10] = r12
            int r10 = r11 + 1
            r13.f2537t = r10
            r7 = r7 & 63
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7
            r9[r11] = r7
            r7 = r8
            goto L_0x0055
        L_0x0081:
            int r7 = r13.mo11603B0(r7, r1, r8, r6)
            goto L_0x0055
        L_0x0086:
            byte[] r9 = r13.f2536s
            int r10 = r13.f2537t
            int r11 = r10 + 1
            r13.f2537t = r11
            byte r8 = (byte) r8
            r9[r10] = r8
            int r7 = r7 + 1
            if (r7 < r6) goto L_0x0057
        L_0x0095:
            int r5 = r5 + r6
            int r0 = r0 - r6
            goto L_0x002d
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p088r.C1552g.mo11474p0(java.lang.String):void");
    }

    /* renamed from: q */
    public final void mo11475q() {
        if (this.f2410j.mo11504b()) {
            C1527l lVar = this.f2345g;
            if (lVar != null) {
                C1563e eVar = (C1563e) lVar;
                if (this.f2410j.f2385b + 1 > 0) {
                    mo11472n0(' ');
                } else {
                    mo11472n0(' ');
                }
                mo11472n0(']');
            } else {
                if (this.f2537t >= this.f2538u) {
                    mo11612z0();
                }
                byte[] bArr = this.f2536s;
                int i = this.f2537t;
                this.f2537t = i + 1;
                bArr[i] = 93;
            }
            this.f2410j = this.f2410j.mo11575f();
            return;
        }
        StringBuilder u = C0843a.m460u("Current context not Array but ");
        u.append(this.f2410j.mo11507e());
        throw new C1516c(u.toString(), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r1 = r10 + 1;
        r10 = r9[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r10 >= 2048) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r5 = r8.f2537t;
        r6 = r5 + 1;
        r8.f2537t = r6;
        r0[r5] = (byte) ((r10 >> 6) | 192);
        r8.f2537t = r6 + 1;
        r0[r6] = (byte) ((r10 & '?') | 128);
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r10 = mo11603B0(r10, r9, r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r0 = r10 + 1;
        r10 = r9[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r10 >= 2048) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        r1 = r8.f2536s;
        r2 = r8.f2537t;
        r5 = r2 + 1;
        r8.f2537t = r5;
        r1[r2] = (byte) ((r10 >> 6) | 192);
        r8.f2537t = r5 + 1;
        r1[r5] = (byte) ((r10 & '?') | 128);
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008a, code lost:
        r10 = mo11603B0(r10, r9, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if ((r8.f2537t + 3) < r8.f2538u) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        mo11612z0();
     */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11476q0(char[] r9, int r10, int r11) {
        /*
            r8 = this;
            int r0 = r11 + r11
            int r0 = r0 + r11
            int r1 = r8.f2537t
            int r1 = r1 + r0
            int r2 = r8.f2538u
            r3 = 2048(0x800, float:2.87E-42)
            r4 = 128(0x80, float:1.794E-43)
            if (r1 <= r2) goto L_0x0060
            if (r2 >= r0) goto L_0x005d
            byte[] r0 = r8.f2536s
            int r11 = r11 + r10
        L_0x0013:
            if (r10 >= r11) goto L_0x005c
        L_0x0015:
            char r1 = r9[r10]
            if (r1 < r4) goto L_0x0048
            int r1 = r8.f2537t
            int r1 = r1 + 3
            int r5 = r8.f2538u
            if (r1 < r5) goto L_0x0024
            r8.mo11612z0()
        L_0x0024:
            int r1 = r10 + 1
            char r10 = r9[r10]
            if (r10 >= r3) goto L_0x0043
            int r5 = r8.f2537t
            int r6 = r5 + 1
            r8.f2537t = r6
            int r7 = r10 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r0[r5] = r7
            int r5 = r6 + 1
            r8.f2537t = r5
            r10 = r10 & 63
            r10 = r10 | r4
            byte r10 = (byte) r10
            r0[r6] = r10
            r10 = r1
            goto L_0x0013
        L_0x0043:
            int r10 = r8.mo11603B0(r10, r9, r1, r11)
            goto L_0x0013
        L_0x0048:
            int r5 = r8.f2537t
            if (r5 < r2) goto L_0x004f
            r8.mo11612z0()
        L_0x004f:
            int r5 = r8.f2537t
            int r6 = r5 + 1
            r8.f2537t = r6
            byte r1 = (byte) r1
            r0[r5] = r1
            int r10 = r10 + 1
            if (r10 < r11) goto L_0x0015
        L_0x005c:
            return
        L_0x005d:
            r8.mo11612z0()
        L_0x0060:
            int r11 = r11 + r10
        L_0x0061:
            if (r10 >= r11) goto L_0x009e
        L_0x0063:
            char r0 = r9[r10]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x008f
            int r0 = r10 + 1
            char r10 = r9[r10]
            if (r10 >= r3) goto L_0x008a
            byte[] r1 = r8.f2536s
            int r2 = r8.f2537t
            int r5 = r2 + 1
            r8.f2537t = r5
            int r6 = r10 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r1[r2] = r6
            int r2 = r5 + 1
            r8.f2537t = r2
            r10 = r10 & 63
            r10 = r10 | r4
            byte r10 = (byte) r10
            r1[r5] = r10
            r10 = r0
            goto L_0x0061
        L_0x008a:
            int r10 = r8.mo11603B0(r10, r9, r0, r11)
            goto L_0x0061
        L_0x008f:
            byte[] r1 = r8.f2536s
            int r2 = r8.f2537t
            int r5 = r2 + 1
            r8.f2537t = r5
            byte r0 = (byte) r0
            r1[r2] = r0
            int r10 = r10 + 1
            if (r10 < r11) goto L_0x0063
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p088r.C1552g.mo11476q0(char[], int, int):void");
    }

    /* renamed from: r0 */
    public final void mo11477r0() {
        mo11604C0("start an array");
        this.f2410j = this.f2410j.mo11576g();
        C1527l lVar = this.f2345g;
        if (lVar != null) {
            C1563e eVar = (C1563e) lVar;
            mo11472n0('[');
            return;
        }
        if (this.f2537t >= this.f2538u) {
            mo11612z0();
        }
        byte[] bArr = this.f2536s;
        int i = this.f2537t;
        this.f2537t = i + 1;
        bArr[i] = 91;
    }

    /* renamed from: s0 */
    public final void mo11478s0() {
        mo11604C0("start an object");
        this.f2410j = this.f2410j.mo11577h();
        C1527l lVar = this.f2345g;
        if (lVar != null) {
            C1563e eVar = (C1563e) lVar;
            mo11472n0('{');
            if (!eVar.f2620g.isInline()) {
                eVar.f2623j++;
                return;
            }
            return;
        }
        if (this.f2537t >= this.f2538u) {
            mo11612z0();
        }
        byte[] bArr = this.f2536s;
        int i = this.f2537t;
        this.f2537t = i + 1;
        bArr[i] = 123;
    }

    /* renamed from: t0 */
    public void mo11479t0(String str) {
        mo11604C0("write a string");
        if (str == null) {
            mo11607F0();
            return;
        }
        int length = str.length();
        if (length > this.f2539v) {
            mo11611J0(str, true);
            return;
        }
        if (this.f2537t + length >= this.f2538u) {
            mo11612z0();
        }
        byte[] bArr = this.f2536s;
        int i = this.f2537t;
        this.f2537t = i + 1;
        bArr[i] = this.f2535r;
        mo11609H0(str, 0, length);
        if (this.f2537t >= this.f2538u) {
            mo11612z0();
        }
        byte[] bArr2 = this.f2536s;
        int i2 = this.f2537t;
        this.f2537t = i2 + 1;
        bArr2[i2] = this.f2535r;
    }

    /* renamed from: z */
    public final void mo11480z() {
        if (this.f2410j.mo11505c()) {
            C1527l lVar = this.f2345g;
            if (lVar != null) {
                ((C1563e) lVar).mo11694a(this, this.f2410j.f2385b + 1);
            } else {
                if (this.f2537t >= this.f2538u) {
                    mo11612z0();
                }
                byte[] bArr = this.f2536s;
                int i = this.f2537t;
                this.f2537t = i + 1;
                bArr[i] = 125;
            }
            this.f2410j = this.f2410j.mo11575f();
            return;
        }
        StringBuilder u = C0843a.m460u("Current context not Object but ");
        u.append(this.f2410j.mo11507e());
        throw new C1516c(u.toString(), this);
    }

    /* renamed from: z0 */
    public final void mo11612z0() {
        int i = this.f2537t;
        if (i > 0) {
            this.f2537t = 0;
            this.f2534q.write(this.f2536s, 0, i);
        }
    }
}
