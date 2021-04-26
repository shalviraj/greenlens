package p005b.p082j.p083a.p084a.p089s;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p082j.p083a.p084a.p090t.C1566f;

/* renamed from: b.j.a.a.s.a */
public final class C1554a {

    /* renamed from: a */
    public final C1554a f2561a;

    /* renamed from: b */
    public final AtomicReference<C1555a> f2562b;

    /* renamed from: c */
    public final int f2563c;

    /* renamed from: d */
    public boolean f2564d;

    /* renamed from: e */
    public final boolean f2565e;

    /* renamed from: f */
    public int[] f2566f;

    /* renamed from: g */
    public int f2567g;

    /* renamed from: h */
    public int f2568h;

    /* renamed from: i */
    public int f2569i;

    /* renamed from: j */
    public int f2570j;

    /* renamed from: k */
    public int f2571k;

    /* renamed from: l */
    public String[] f2572l;

    /* renamed from: m */
    public int f2573m;

    /* renamed from: n */
    public int f2574n;

    /* renamed from: o */
    public boolean f2575o;

    /* renamed from: b.j.a.a.s.a$a */
    public static final class C1555a {

        /* renamed from: a */
        public final int f2576a;

        /* renamed from: b */
        public final int f2577b;

        /* renamed from: c */
        public final int f2578c;

        /* renamed from: d */
        public final int[] f2579d;

        /* renamed from: e */
        public final String[] f2580e;

        /* renamed from: f */
        public final int f2581f;

        /* renamed from: g */
        public final int f2582g;

        public C1555a(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.f2576a = i;
            this.f2577b = i2;
            this.f2578c = i3;
            this.f2579d = iArr;
            this.f2580e = strArr;
            this.f2581f = i4;
            this.f2582g = i5;
        }

        public C1555a(C1554a aVar) {
            this.f2576a = aVar.f2567g;
            this.f2577b = aVar.f2571k;
            this.f2578c = aVar.f2570j;
            this.f2579d = aVar.f2566f;
            this.f2580e = aVar.f2572l;
            this.f2581f = aVar.f2573m;
            this.f2582g = aVar.f2574n;
        }

        /* renamed from: a */
        public static C1555a m2019a(int i) {
            int i2 = i << 3;
            return new C1555a(i, 0, C1554a.m2004b(i), new int[i2], new String[(i << 1)], i2 - i, i2);
        }
    }

    public C1554a(int i, boolean z, int i2, boolean z2) {
        this.f2561a = null;
        this.f2563c = i2;
        this.f2564d = z;
        this.f2565e = z2;
        int i3 = 16;
        if (i >= 16) {
            if (((i - 1) & i) != 0) {
                while (i3 < i) {
                    i3 += i3;
                }
            }
            this.f2562b = new AtomicReference<>(C1555a.m2019a(i));
        }
        i = i3;
        this.f2562b = new AtomicReference<>(C1555a.m2019a(i));
    }

    public C1554a(C1554a aVar, boolean z, int i, boolean z2, C1555a aVar2) {
        this.f2561a = aVar;
        this.f2563c = i;
        this.f2564d = z;
        this.f2565e = z2;
        this.f2562b = null;
        this.f2571k = aVar2.f2577b;
        int i2 = aVar2.f2576a;
        this.f2567g = i2;
        int i3 = i2 << 2;
        this.f2568h = i3;
        this.f2569i = i3 + (i3 >> 1);
        this.f2570j = aVar2.f2578c;
        this.f2566f = aVar2.f2579d;
        this.f2572l = aVar2.f2580e;
        this.f2573m = aVar2.f2581f;
        this.f2574n = aVar2.f2582g;
        this.f2575o = true;
    }

    /* renamed from: b */
    public static int m2004b(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    /* renamed from: a */
    public final int mo11664a(int i) {
        return (i & (this.f2567g - 1)) << 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11665c(int r12) {
        /*
            r11 = this;
            int r0 = r11.f2567g
            int r1 = r0 + -1
            r1 = r1 & r12
            int r1 = r1 << 2
            int[] r2 = r11.f2566f
            int r3 = r1 + 3
            r3 = r2[r3]
            if (r3 != 0) goto L_0x0010
            return r1
        L_0x0010:
            int r3 = r11.f2571k
            r4 = 1
            int r0 = r0 >> r4
            if (r3 <= r0) goto L_0x0037
            int r0 = r11.f2573m
            int r3 = r11.mo11667e()
            int r0 = r0 - r3
            int r0 = r0 >> 2
            int r3 = r11.f2571k
            int r5 = r3 + 1
            int r5 = r5 >> 7
            if (r0 > r5) goto L_0x0035
            double r5 = (double) r3
            int r0 = r11.f2567g
            double r7 = (double) r0
            r9 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r7 = r7 * r9
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0037
        L_0x0035:
            r0 = r4
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r0 == 0) goto L_0x003f
            int r12 = r11.mo11666d(r12)
            return r12
        L_0x003f:
            int r0 = r11.f2568h
            int r3 = r1 >> 3
            int r3 = r3 << 2
            int r0 = r0 + r3
            int r3 = r0 + 3
            r3 = r2[r3]
            if (r3 != 0) goto L_0x004d
            return r0
        L_0x004d:
            int r0 = r11.f2569i
            int r3 = r11.f2570j
            int r5 = r3 + 2
            int r1 = r1 >> r5
            int r1 = r1 << r3
            int r0 = r0 + r1
            int r1 = r4 << r3
            int r1 = r1 + r0
        L_0x0059:
            if (r0 >= r1) goto L_0x0065
            int r3 = r0 + 3
            r3 = r2[r3]
            if (r3 != 0) goto L_0x0062
            return r0
        L_0x0062:
            int r0 = r0 + 4
            goto L_0x0059
        L_0x0065:
            int r0 = r11.f2573m
            int r1 = r0 + 4
            r11.f2573m = r1
            int r2 = r11.f2567g
            int r3 = r2 << 3
            if (r1 < r3) goto L_0x00a9
            boolean r0 = r11.f2565e
            if (r0 == 0) goto L_0x00a4
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 > r0) goto L_0x007a
            goto L_0x00a4
        L_0x007a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Spill-over slots in symbol table with "
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            int r1 = r11.f2571k
            r0.append(r1)
            java.lang.String r1 = " entries, hash area of "
            r0.append(r1)
            int r1 = r11.f2567g
            r0.append(r1)
            java.lang.String r1 = " slots is now full (all "
            r0.append(r1)
            int r1 = r11.f2567g
            int r1 = r1 >> 3
            java.lang.String r2 = " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`"
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m453n(r0, r1, r2)
            r12.<init>(r0)
            throw r12
        L_0x00a4:
            int r12 = r11.mo11666d(r12)
            return r12
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p089s.C1554a.mo11665c(int):int");
    }

    /* renamed from: d */
    public final int mo11666d(int i) {
        this.f2575o = false;
        int[] iArr = this.f2566f;
        String[] strArr = this.f2572l;
        int i2 = this.f2567g;
        int i3 = this.f2571k;
        int i4 = i2 + i2;
        int i5 = this.f2573m;
        if (i4 > 65536) {
            mo11677o(true);
        } else {
            this.f2566f = new int[(iArr.length + (i2 << 3))];
            this.f2567g = i4;
            int i6 = i4 << 2;
            this.f2568h = i6;
            this.f2569i = i6 + (i6 >> 1);
            this.f2570j = m2004b(i4);
            this.f2572l = new String[(strArr.length << 1)];
            mo11677o(false);
            int[] iArr2 = new int[16];
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8 += 4) {
                int i9 = iArr[i8 + 3];
                if (i9 != 0) {
                    i7++;
                    String str = strArr[i8 >> 2];
                    if (i9 == 1) {
                        iArr2[0] = iArr[i8];
                        mo11669g(str, iArr2, 1);
                    } else if (i9 == 2) {
                        iArr2[0] = iArr[i8];
                        iArr2[1] = iArr[i8 + 1];
                        mo11669g(str, iArr2, 2);
                    } else if (i9 != 3) {
                        if (i9 > iArr2.length) {
                            iArr2 = new int[i9];
                        }
                        System.arraycopy(iArr, iArr[i8 + 1], iArr2, 0, i9);
                        mo11669g(str, iArr2, i9);
                    } else {
                        iArr2[0] = iArr[i8];
                        iArr2[1] = iArr[i8 + 1];
                        iArr2[2] = iArr[i8 + 2];
                        mo11669g(str, iArr2, 3);
                    }
                }
            }
            if (i7 != i3) {
                throw new IllegalStateException(C0843a.m446g("Failed rehash(): old count=", i3, ", copyCount=", i7));
            }
        }
        int i10 = (i & (this.f2567g - 1)) << 2;
        int[] iArr3 = this.f2566f;
        if (iArr3[i10 + 3] == 0) {
            return i10;
        }
        int i11 = this.f2568h + ((i10 >> 3) << 2);
        if (iArr3[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this.f2569i;
        int i13 = this.f2570j;
        int i14 = i12 + ((i10 >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr3[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this.f2573m;
        this.f2573m = i16 + 4;
        return i16;
    }

    /* renamed from: e */
    public final int mo11667e() {
        int i = this.f2567g;
        return (i << 3) - i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r8 = r3 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r7[r3] == r0[r9]) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r3 = r8 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r7[r8] == r0[r9]) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r8 = r3 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r7[r3] == r0[r9]) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r9 = r8 + 1;
        r3 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (r7[r8] == r0[r4]) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        r8 = r9 + 1;
        r4 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (r7[r9] == r0[r3]) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        if (r7[r8] == r0[r4]) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r3 = r8 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r7[r8] == r0[r9]) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        return false;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11668f(int[] r7, int r8, int r9) {
        /*
            r6 = this;
            int[] r0 = r6.f2566f
            r1 = 0
            r2 = 1
            switch(r8) {
                case 4: goto L_0x003f;
                case 5: goto L_0x0031;
                case 6: goto L_0x0023;
                case 7: goto L_0x0015;
                case 8: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0069
        L_0x0009:
            r8 = r7[r1]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x0012
            return r1
        L_0x0012:
            r8 = r2
            r9 = r3
            goto L_0x0016
        L_0x0015:
            r8 = r1
        L_0x0016:
            int r3 = r8 + 1
            r8 = r7[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x0021
            return r1
        L_0x0021:
            r9 = r4
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            int r8 = r3 + 1
            r3 = r7[r3]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r3 == r9) goto L_0x002f
            return r1
        L_0x002f:
            r9 = r4
            goto L_0x0032
        L_0x0031:
            r8 = r1
        L_0x0032:
            int r3 = r8 + 1
            r8 = r7[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x003d
            return r1
        L_0x003d:
            r9 = r4
            goto L_0x0040
        L_0x003f:
            r3 = r1
        L_0x0040:
            int r8 = r3 + 1
            r3 = r7[r3]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r3 == r9) goto L_0x004b
            return r1
        L_0x004b:
            int r9 = r8 + 1
            r8 = r7[r8]
            int r3 = r4 + 1
            r4 = r0[r4]
            if (r8 == r4) goto L_0x0056
            return r1
        L_0x0056:
            int r8 = r9 + 1
            r9 = r7[r9]
            int r4 = r3 + 1
            r3 = r0[r3]
            if (r9 == r3) goto L_0x0061
            return r1
        L_0x0061:
            r7 = r7[r8]
            r8 = r0[r4]
            if (r7 == r8) goto L_0x0068
            return r1
        L_0x0068:
            return r2
        L_0x0069:
            r0 = r1
        L_0x006a:
            int r3 = r0 + 1
            r0 = r7[r0]
            int[] r4 = r6.f2566f
            int r5 = r9 + 1
            r9 = r4[r9]
            if (r0 == r9) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            if (r3 < r8) goto L_0x007b
            r1 = r2
        L_0x007a:
            return r1
        L_0x007b:
            r0 = r3
            r9 = r5
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p089s.C1554a.mo11668f(int[], int, int):boolean");
    }

    /* renamed from: g */
    public String mo11669g(String str, int[] iArr, int i) {
        int i2;
        if (this.f2575o) {
            int[] iArr2 = this.f2566f;
            this.f2566f = Arrays.copyOf(iArr2, iArr2.length);
            String[] strArr = this.f2572l;
            this.f2572l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f2575o = false;
        }
        if (this.f2564d) {
            str = C1566f.f2626h.mo11695a(str);
        }
        if (i == 1) {
            int i3 = iArr[0] ^ this.f2563c;
            int i4 = i3 + (i3 >>> 16);
            int i5 = i4 ^ (i4 << 3);
            i2 = mo11665c(i5 + (i5 >>> 12));
            int[] iArr3 = this.f2566f;
            iArr3[i2] = iArr[0];
            iArr3[i2 + 3] = 1;
        } else if (i == 2) {
            i2 = mo11665c(mo11670h(iArr[0], iArr[1]));
            int[] iArr4 = this.f2566f;
            iArr4[i2] = iArr[0];
            iArr4[i2 + 1] = iArr[1];
            iArr4[i2 + 3] = 2;
        } else if (i != 3) {
            int j = mo11672j(iArr, i);
            i2 = mo11665c(j);
            int[] iArr5 = this.f2566f;
            iArr5[i2] = j;
            int i6 = this.f2574n;
            int i7 = i6 + i;
            if (i7 > iArr5.length) {
                int length = i7 - iArr5.length;
                int min = Math.min(4096, this.f2567g);
                this.f2566f = Arrays.copyOf(this.f2566f, Math.max(length, min) + this.f2566f.length);
            }
            System.arraycopy(iArr, 0, this.f2566f, i6, i);
            this.f2574n += i;
            int[] iArr6 = this.f2566f;
            iArr6[i2 + 1] = i6;
            iArr6[i2 + 3] = i;
        } else {
            i2 = mo11665c(mo11671i(iArr[0], iArr[1], iArr[2]));
            int[] iArr7 = this.f2566f;
            iArr7[i2] = iArr[0];
            iArr7[i2 + 1] = iArr[1];
            iArr7[i2 + 2] = iArr[2];
            iArr7[i2 + 3] = 3;
        }
        this.f2572l[i2 >> 2] = str;
        this.f2571k++;
        return str;
    }

    /* renamed from: h */
    public int mo11670h(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = this.f2563c ^ ((i2 * 33) + (i3 ^ (i3 >>> 9)));
        int i5 = i4 + (i4 >>> 16);
        int i6 = i5 ^ (i5 >>> 4);
        return i6 + (i6 << 3);
    }

    /* renamed from: i */
    public int mo11671i(int i, int i2, int i3) {
        int i4 = i ^ this.f2563c;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    /* renamed from: j */
    public int mo11672j(int[] iArr, int i) {
        if (i >= 4) {
            int i2 = iArr[0] ^ this.f2563c;
            int i3 = i2 + (i2 >>> 9) + iArr[1];
            int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
            int i5 = i4 + (i4 >>> 4);
            for (int i6 = 3; i6 < i; i6++) {
                int i7 = iArr[i6];
                i5 += i7 ^ (i7 >> 21);
            }
            int i8 = i5 * 65599;
            int i9 = i8 + (i8 >>> 19);
            return (i9 << 5) ^ i9;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public String mo11673k(int i) {
        int i2 = this.f2563c ^ i;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        int a = mo11664a(i4 + (i4 >>> 12));
        int[] iArr = this.f2566f;
        int i5 = iArr[a + 3];
        if (i5 == 1) {
            if (iArr[a] == i) {
                return this.f2572l[a >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.f2568h + ((a >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 1) {
            if (iArr[i6] == i) {
                return this.f2572l[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        int i8 = this.f2569i;
        int i9 = this.f2570j;
        int i10 = i8 + ((a >> (i9 + 2)) << i9);
        int i11 = (1 << i9) + i10;
        while (i10 < i11) {
            int i12 = iArr[i10 + 3];
            if (i == iArr[i10] && 1 == i12) {
                return this.f2572l[i10 >> 2];
            }
            if (i12 == 0) {
                return null;
            }
            i10 += 4;
        }
        for (int e = mo11667e(); e < this.f2573m; e += 4) {
            if (i == iArr[e] && 1 == iArr[e + 3]) {
                return this.f2572l[e >> 2];
            }
        }
        return null;
    }

    /* renamed from: l */
    public String mo11674l(int i, int i2) {
        int a = mo11664a(mo11670h(i, i2));
        int[] iArr = this.f2566f;
        int i3 = iArr[a + 3];
        if (i3 == 2) {
            if (i == iArr[a] && i2 == iArr[a + 1]) {
                return this.f2572l[a >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.f2568h + ((a >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.f2572l[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.f2569i;
        int i7 = this.f2570j;
        int i8 = i6 + ((a >> (i7 + 2)) << i7);
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            int i10 = iArr[i8 + 3];
            if (i == iArr[i8] && i2 == iArr[i8 + 1] && 2 == i10) {
                return this.f2572l[i8 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
            i8 += 4;
        }
        for (int e = mo11667e(); e < this.f2573m; e += 4) {
            if (i == iArr[e] && i2 == iArr[e + 1] && 2 == iArr[e + 3]) {
                return this.f2572l[e >> 2];
            }
        }
        return null;
    }

    /* renamed from: m */
    public String mo11675m(int i, int i2, int i3) {
        int a = mo11664a(mo11671i(i, i2, i3));
        int[] iArr = this.f2566f;
        int i4 = iArr[a + 3];
        if (i4 == 3) {
            if (i == iArr[a] && iArr[a + 1] == i2 && iArr[a + 2] == i3) {
                return this.f2572l[a >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.f2568h + ((a >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.f2572l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        int i7 = this.f2569i;
        int i8 = this.f2570j;
        int i9 = i7 + ((a >> (i8 + 2)) << i8);
        int i10 = (1 << i8) + i9;
        while (i9 < i10) {
            int i11 = iArr[i9 + 3];
            if (i == iArr[i9] && i2 == iArr[i9 + 1] && i3 == iArr[i9 + 2] && 3 == i11) {
                return this.f2572l[i9 >> 2];
            }
            if (i11 == 0) {
                return null;
            }
            i9 += 4;
        }
        for (int e = mo11667e(); e < this.f2573m; e += 4) {
            if (i == iArr[e] && i2 == iArr[e + 1] && i3 == iArr[e + 2] && 3 == iArr[e + 3]) {
                return this.f2572l[e >> 2];
            }
        }
        return null;
    }

    /* renamed from: n */
    public String mo11676n(int[] iArr, int i) {
        if (i >= 4) {
            int j = mo11672j(iArr, i);
            int a = mo11664a(j);
            int[] iArr2 = this.f2566f;
            int i2 = iArr2[a + 3];
            if (j == iArr2[a] && i2 == i && mo11668f(iArr, i, iArr2[a + 1])) {
                return this.f2572l[a >> 2];
            }
            if (i2 == 0) {
                return null;
            }
            int i3 = this.f2568h + ((a >> 3) << 2);
            int i4 = iArr2[i3 + 3];
            if (j == iArr2[i3] && i4 == i && mo11668f(iArr, i, iArr2[i3 + 1])) {
                return this.f2572l[i3 >> 2];
            }
            int i5 = this.f2569i;
            int i6 = this.f2570j;
            int i7 = i5 + ((a >> (i6 + 2)) << i6);
            int[] iArr3 = this.f2566f;
            int i8 = (1 << i6) + i7;
            while (i7 < i8) {
                int i9 = iArr3[i7 + 3];
                if (j == iArr3[i7] && i == i9 && mo11668f(iArr, i, iArr3[i7 + 1])) {
                    return this.f2572l[i7 >> 2];
                }
                if (i9 == 0) {
                    return null;
                }
                i7 += 4;
            }
            for (int e = mo11667e(); e < this.f2573m; e += 4) {
                if (j == iArr3[e] && i == iArr3[e + 3] && mo11668f(iArr, i, iArr3[e + 1])) {
                    return this.f2572l[e >> 2];
                }
            }
            return null;
        } else if (i == 1) {
            return mo11673k(iArr[0]);
        } else {
            if (i != 2) {
                return i != 3 ? "" : mo11675m(iArr[0], iArr[1], iArr[2]);
            }
            return mo11674l(iArr[0], iArr[1]);
        }
    }

    /* renamed from: o */
    public final void mo11677o(boolean z) {
        this.f2571k = 0;
        this.f2573m = mo11667e();
        this.f2574n = this.f2567g << 3;
        if (z) {
            Arrays.fill(this.f2566f, 0);
            Arrays.fill(this.f2572l, (Object) null);
        }
    }

    public String toString() {
        int i = this.f2568h;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f2566f[i3] != 0) {
                i2++;
            }
        }
        int i4 = this.f2569i;
        int i5 = 0;
        for (int i6 = this.f2568h + 3; i6 < i4; i6 += 4) {
            if (this.f2566f[i6] != 0) {
                i5++;
            }
        }
        int i7 = this.f2569i + 3;
        int i8 = this.f2567g + i7;
        int i9 = 0;
        while (i7 < i8) {
            if (this.f2566f[i7] != 0) {
                i9++;
            }
            i7 += 4;
        }
        int e = (this.f2573m - mo11667e()) >> 2;
        int i10 = this.f2567g << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f2566f[i12] != 0) {
                i11++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[]{C1554a.class.getName(), Integer.valueOf(this.f2571k), Integer.valueOf(this.f2567g), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i9), Integer.valueOf(e), Integer.valueOf(i2 + i5 + i9 + e), Integer.valueOf(i11)});
    }
}
