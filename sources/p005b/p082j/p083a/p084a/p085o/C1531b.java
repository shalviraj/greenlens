package p005b.p082j.p083a.p084a.p085o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p082j.p083a.p084a.C1519e;
import p005b.p082j.p083a.p084a.C1520f;
import p005b.p082j.p083a.p084a.C1521g;
import p005b.p082j.p083a.p084a.C1525j;
import p005b.p082j.p083a.p084a.p087q.C1537b;
import p005b.p082j.p083a.p084a.p087q.C1541f;
import p005b.p082j.p083a.p084a.p088r.C1547b;
import p005b.p082j.p083a.p084a.p088r.C1549d;
import p005b.p082j.p083a.p084a.p090t.C1568h;

/* renamed from: b.j.a.a.o.b */
public abstract class C1531b extends C1532c {

    /* renamed from: A */
    public C1549d f2411A;

    /* renamed from: B */
    public C1525j f2412B;

    /* renamed from: C */
    public final C1568h f2413C;

    /* renamed from: D */
    public int f2414D = 0;

    /* renamed from: E */
    public int f2415E;

    /* renamed from: F */
    public long f2416F;

    /* renamed from: G */
    public double f2417G;

    /* renamed from: H */
    public BigInteger f2418H;

    /* renamed from: I */
    public BigDecimal f2419I;

    /* renamed from: J */
    public boolean f2420J;

    /* renamed from: K */
    public int f2421K;

    /* renamed from: r */
    public final C1537b f2422r;

    /* renamed from: s */
    public boolean f2423s;

    /* renamed from: t */
    public int f2424t;

    /* renamed from: u */
    public int f2425u;

    /* renamed from: v */
    public long f2426v;

    /* renamed from: w */
    public int f2427w = 1;

    /* renamed from: x */
    public int f2428x;

    /* renamed from: y */
    public int f2429y = 1;

    /* renamed from: z */
    public int f2430z;

    public C1531b(C1537b bVar, int i) {
        super(i);
        boolean z = true;
        this.f2422r = bVar;
        this.f2413C = new C1568h(bVar.f2455d);
        this.f2411A = new C1549d((C1549d) null, (C1521g.C1522a.STRICT_DUPLICATE_DETECTION.f2382h & i) == 0 ? false : z ? new C1547b(this) : null, 0, 1, 0);
    }

    /* renamed from: O0 */
    public static int[] m1809O0(int[] iArr, int i) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    /* renamed from: F0 */
    public abstract void mo11511F0();

    /* renamed from: G0 */
    public Object mo11512G0() {
        if (C1521g.C1522a.INCLUDE_SOURCE_IN_LOCATION.mo11501d(this.f2365g)) {
            return this.f2422r.f2452a;
        }
        return null;
    }

    /* renamed from: H */
    public BigDecimal mo11487H() {
        BigDecimal bigDecimal;
        long j;
        int i = this.f2414D;
        if ((i & 16) == 0) {
            if (i == 0) {
                mo11514I0(16);
            }
            int i2 = this.f2414D;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    String f0 = mo11495f0();
                    String str = C1541f.f2466a;
                    try {
                        this.f2419I = new BigDecimal(f0);
                    } catch (NumberFormatException unused) {
                        throw C1541f.m1856a(f0);
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        bigDecimal = new BigDecimal(this.f2418H);
                    } else {
                        if ((i2 & 2) != 0) {
                            j = this.f2416F;
                        } else if ((i2 & 1) != 0) {
                            j = (long) this.f2415E;
                        } else {
                            mo11536y0();
                            throw null;
                        }
                        bigDecimal = BigDecimal.valueOf(j);
                    }
                    this.f2419I = bigDecimal;
                }
                this.f2414D |= 16;
            }
        }
        return this.f2419I;
    }

    /* renamed from: H0 */
    public char mo11513H0(char c) {
        if (mo11496h0(C1521g.C1522a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && mo11496h0(C1521g.C1522a.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        StringBuilder u = C0843a.m460u("Unrecognized character escape ");
        u.append(C1532c.m1829o0(c));
        throw new C1520f(this, u.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ca A[Catch:{ NumberFormatException -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d2 A[Catch:{ NumberFormatException -> 0x0109 }] */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11514I0(int r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            b.j.a.a.j r2 = r1.f2440h
            b.j.a.a.j r3 = p005b.p082j.p083a.p084a.C1525j.VALUE_NUMBER_INT
            r4 = 8
            java.lang.String r5 = "2.2250738585072012e-308"
            java.lang.String r6 = ")"
            java.lang.String r7 = "Malformed numeric value ("
            r8 = 0
            if (r2 != r3) goto L_0x0122
            int r2 = r1.f2421K
            r3 = 9
            r9 = 1
            if (r2 > r3) goto L_0x0027
            b.j.a.a.t.h r0 = r1.f2413C
            boolean r2 = r1.f2420J
            int r0 = r0.mo11700e(r2)
            r1.f2415E = r0
            r1.f2414D = r9
            return
        L_0x0027:
            r3 = 18
            r10 = 2
            r11 = 0
            if (r2 > r3) goto L_0x0087
            b.j.a.a.t.h r0 = r1.f2413C
            boolean r3 = r1.f2420J
            int r4 = r0.f2631c
            if (r4 < 0) goto L_0x004b
            char[] r5 = r0.f2630b
            if (r5 == 0) goto L_0x004b
            if (r3 == 0) goto L_0x0044
            int r4 = r4 + r9
            int r0 = r0.f2632d
            int r0 = r0 - r9
            long r3 = p005b.p082j.p083a.p084a.p087q.C1541f.m1859d(r5, r4, r0)
            goto L_0x0056
        L_0x0044:
            int r0 = r0.f2632d
            long r3 = p005b.p082j.p083a.p084a.p087q.C1541f.m1859d(r5, r4, r0)
            goto L_0x0060
        L_0x004b:
            if (r3 == 0) goto L_0x0058
            char[] r3 = r0.f2636h
            int r0 = r0.f2637i
            int r0 = r0 - r9
            long r3 = p005b.p082j.p083a.p084a.p087q.C1541f.m1859d(r3, r9, r0)
        L_0x0056:
            long r3 = -r3
            goto L_0x0060
        L_0x0058:
            char[] r3 = r0.f2636h
            int r0 = r0.f2637i
            long r3 = p005b.p082j.p083a.p084a.p087q.C1541f.m1859d(r3, r11, r0)
        L_0x0060:
            r0 = 10
            if (r2 != r0) goto L_0x0082
            boolean r0 = r1.f2420J
            if (r0 == 0) goto L_0x0075
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0082
            int r0 = (int) r3
            r1.f2415E = r0
            r1.f2414D = r9
            return
        L_0x0075:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0082
            int r0 = (int) r3
            r1.f2415E = r0
            r1.f2414D = r9
            return
        L_0x0082:
            r1.f2416F = r3
            r1.f2414D = r10
            return
        L_0x0087:
            b.j.a.a.t.h r2 = r1.f2413C
            java.lang.String r2 = r2.mo11701f()
            int r3 = r1.f2421K     // Catch:{ NumberFormatException -> 0x0109 }
            b.j.a.a.t.h r12 = r1.f2413C     // Catch:{ NumberFormatException -> 0x0109 }
            char[] r12 = r12.mo11707l()     // Catch:{ NumberFormatException -> 0x0109 }
            b.j.a.a.t.h r13 = r1.f2413C     // Catch:{ NumberFormatException -> 0x0109 }
            int r13 = r13.mo11708m()     // Catch:{ NumberFormatException -> 0x0109 }
            boolean r14 = r1.f2420J     // Catch:{ NumberFormatException -> 0x0109 }
            if (r14 == 0) goto L_0x00a1
            int r13 = r13 + 1
        L_0x00a1:
            if (r14 == 0) goto L_0x00a6
            java.lang.String r14 = p005b.p082j.p083a.p084a.p087q.C1541f.f2466a     // Catch:{ NumberFormatException -> 0x0109 }
            goto L_0x00a8
        L_0x00a6:
            java.lang.String r14 = p005b.p082j.p083a.p084a.p087q.C1541f.f2467b     // Catch:{ NumberFormatException -> 0x0109 }
        L_0x00a8:
            int r15 = r14.length()     // Catch:{ NumberFormatException -> 0x0109 }
            if (r3 >= r15) goto L_0x00af
            goto L_0x00c7
        L_0x00af:
            if (r3 <= r15) goto L_0x00b2
            goto L_0x00c8
        L_0x00b2:
            r3 = r11
        L_0x00b3:
            if (r3 >= r15) goto L_0x00c7
            int r16 = r13 + r3
            char r16 = r12[r16]     // Catch:{ NumberFormatException -> 0x0109 }
            char r17 = r14.charAt(r3)     // Catch:{ NumberFormatException -> 0x0109 }
            int r16 = r16 - r17
            if (r16 == 0) goto L_0x00c4
            if (r16 >= 0) goto L_0x00c8
            goto L_0x00c7
        L_0x00c4:
            int r3 = r3 + 1
            goto L_0x00b3
        L_0x00c7:
            r11 = r9
        L_0x00c8:
            if (r11 == 0) goto L_0x00d2
            long r3 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0109 }
            r1.f2416F = r3     // Catch:{ NumberFormatException -> 0x0109 }
            r4 = r10
            goto L_0x00fa
        L_0x00d2:
            if (r0 == r9) goto L_0x00fd
            if (r0 != r10) goto L_0x00d7
            goto L_0x00fd
        L_0x00d7:
            if (r0 == r4) goto L_0x00e9
            r3 = 32
            if (r0 != r3) goto L_0x00de
            goto L_0x00e9
        L_0x00de:
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ NumberFormatException -> 0x0109 }
            r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x0109 }
            r1.f2418H = r0     // Catch:{ NumberFormatException -> 0x0109 }
            r0 = 4
            r1.f2414D = r0     // Catch:{ NumberFormatException -> 0x0109 }
            goto L_0x00fc
        L_0x00e9:
            java.lang.String r0 = p005b.p082j.p083a.p084a.p087q.C1541f.f2466a     // Catch:{ NumberFormatException -> 0x0109 }
            boolean r0 = r5.equals(r2)     // Catch:{ NumberFormatException -> 0x0109 }
            if (r0 == 0) goto L_0x00f4
            r8 = 1
            goto L_0x00f8
        L_0x00f4:
            double r8 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x0109 }
        L_0x00f8:
            r1.f2417G = r8     // Catch:{ NumberFormatException -> 0x0109 }
        L_0x00fa:
            r1.f2414D = r4     // Catch:{ NumberFormatException -> 0x0109 }
        L_0x00fc:
            return
        L_0x00fd:
            if (r0 != r9) goto L_0x0105
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.VALUE_NUMBER_INT     // Catch:{ NumberFormatException -> 0x0109 }
            r1.mo11524B0(r2, r0)     // Catch:{ NumberFormatException -> 0x0109 }
            throw r8
        L_0x0105:
            r1.mo11526D0(r2)     // Catch:{ NumberFormatException -> 0x0109 }
            throw r8
        L_0x0109:
            r0 = move-exception
            java.lang.StringBuilder r3 = p005b.p035e.p036a.p037a.C0843a.m460u(r7)
            java.lang.String r2 = r1.mo11529r0(r2)
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            b.j.a.a.f r3 = new b.j.a.a.f
            r3.<init>(r1, r2, r0)
            throw r3
        L_0x0122:
            b.j.a.a.j r3 = p005b.p082j.p083a.p084a.C1525j.VALUE_NUMBER_FLOAT
            if (r2 != r3) goto L_0x016e
            r2 = 16
            if (r0 != r2) goto L_0x0135
            b.j.a.a.t.h r0 = r1.f2413C     // Catch:{ NumberFormatException -> 0x014f }
            java.math.BigDecimal r0 = r0.mo11699d()     // Catch:{ NumberFormatException -> 0x014f }
            r1.f2419I = r0     // Catch:{ NumberFormatException -> 0x014f }
            r1.f2414D = r2     // Catch:{ NumberFormatException -> 0x014f }
            goto L_0x014e
        L_0x0135:
            b.j.a.a.t.h r0 = r1.f2413C     // Catch:{ NumberFormatException -> 0x014f }
            java.lang.String r0 = r0.mo11701f()     // Catch:{ NumberFormatException -> 0x014f }
            java.lang.String r2 = p005b.p082j.p083a.p084a.p087q.C1541f.f2466a     // Catch:{ NumberFormatException -> 0x014f }
            boolean r2 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x014f }
            if (r2 == 0) goto L_0x0146
            r2 = 1
            goto L_0x014a
        L_0x0146:
            double r2 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x014f }
        L_0x014a:
            r1.f2417G = r2     // Catch:{ NumberFormatException -> 0x014f }
            r1.f2414D = r4     // Catch:{ NumberFormatException -> 0x014f }
        L_0x014e:
            return
        L_0x014f:
            r0 = move-exception
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r7)
            b.j.a.a.t.h r3 = r1.f2413C
            java.lang.String r3 = r3.mo11701f()
            java.lang.String r3 = r1.mo11529r0(r3)
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            b.j.a.a.f r3 = new b.j.a.a.f
            r3.<init>(r1, r2, r0)
            throw r3
        L_0x016e:
            java.lang.String r0 = "Current token (%s) not numeric, can not use numeric value accessors"
            r1.mo11530s0(r0, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p085o.C1531b.mo11514I0(int):void");
    }

    /* renamed from: J0 */
    public void mo11515J0() {
        C1568h hVar = this.f2413C;
        if (hVar.f2629a == null) {
            hVar.mo11709n();
        } else if (hVar.f2636h != null) {
            hVar.mo11709n();
            char[] cArr = hVar.f2636h;
            hVar.f2636h = null;
            hVar.f2629a.f2606b.set(2, cArr);
        }
    }

    /* renamed from: K0 */
    public void mo11516K0(int i, char c) {
        C1549d dVar = this.f2411A;
        throw new C1520f(this, String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", new Object[]{Character.valueOf((char) i), Character.valueOf(c), dVar.mo11507e(), new C1519e(mo11512G0(), -1, dVar.f2507g, dVar.f2508h)}));
    }

    /* renamed from: L0 */
    public void mo11517L0(int i, String str) {
        if (!mo11496h0(C1521g.C1522a.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            StringBuilder u = C0843a.m460u("Illegal unquoted character (");
            u.append(C1532c.m1829o0((char) i));
            u.append("): has to be escaped using backslash to be included in ");
            u.append(str);
            throw new C1520f(this, u.toString());
        }
    }

    /* renamed from: M0 */
    public String mo11518M0() {
        return mo11496h0(C1521g.C1522a.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    /* renamed from: N */
    public double mo11488N() {
        double d;
        int i = this.f2414D;
        if ((i & 8) == 0) {
            if (i == 0) {
                mo11514I0(8);
            }
            int i2 = this.f2414D;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    d = this.f2419I.doubleValue();
                } else if ((i2 & 4) != 0) {
                    d = this.f2418H.doubleValue();
                } else if ((i2 & 2) != 0) {
                    d = (double) this.f2416F;
                } else if ((i2 & 1) != 0) {
                    d = (double) this.f2415E;
                } else {
                    mo11536y0();
                    throw null;
                }
                this.f2417G = d;
                this.f2414D |= 8;
            }
        }
        return this.f2417G;
    }

    /* renamed from: N0 */
    public void mo11519N0() {
        int intValue;
        int i = this.f2414D;
        if ((i & 2) != 0) {
            long j = this.f2416F;
            int i2 = (int) j;
            if (((long) i2) == j) {
                this.f2415E = i2;
            } else {
                mo11524B0(mo11495f0(), this.f2440h);
                throw null;
            }
        } else {
            if ((i & 4) != 0) {
                if (C1532c.f2432j.compareTo(this.f2418H) > 0 || C1532c.f2433k.compareTo(this.f2418H) < 0) {
                    mo11523A0();
                    throw null;
                }
                intValue = this.f2418H.intValue();
            } else if ((i & 8) != 0) {
                double d = this.f2417G;
                if (d < -2.147483648E9d || d > 2.147483647E9d) {
                    mo11523A0();
                    throw null;
                }
                intValue = (int) d;
            } else if ((i & 16) == 0) {
                mo11536y0();
                throw null;
            } else if (C1532c.f2438p.compareTo(this.f2419I) > 0 || C1532c.f2439q.compareTo(this.f2419I) < 0) {
                mo11523A0();
                throw null;
            } else {
                intValue = this.f2419I.intValue();
            }
            this.f2415E = intValue;
        }
        this.f2414D |= 1;
    }

    /* renamed from: O */
    public float mo11489O() {
        return (float) mo11488N();
    }

    /* renamed from: P0 */
    public final C1525j mo11520P0(String str, double d) {
        C1568h hVar = this.f2413C;
        hVar.f2630b = null;
        hVar.f2631c = -1;
        hVar.f2632d = 0;
        hVar.f2638j = str;
        hVar.f2639k = null;
        if (hVar.f2634f) {
            hVar.mo11697b();
        }
        hVar.f2637i = 0;
        this.f2417G = d;
        this.f2414D = 8;
        return C1525j.VALUE_NUMBER_FLOAT;
    }

    /* renamed from: Q0 */
    public final C1525j mo11521Q0(boolean z, int i) {
        this.f2420J = z;
        this.f2421K = i;
        this.f2414D = 0;
        return C1525j.VALUE_NUMBER_INT;
    }

    /* renamed from: S */
    public int mo11490S() {
        int i = this.f2414D;
        if ((i & 1) == 0) {
            if (i == 0) {
                if (this.f2440h != C1525j.VALUE_NUMBER_INT || this.f2421K > 9) {
                    mo11514I0(1);
                    if ((this.f2414D & 1) == 0) {
                        mo11519N0();
                    }
                    return this.f2415E;
                }
                int e = this.f2413C.mo11700e(this.f2420J);
                this.f2415E = e;
                this.f2414D = 1;
                return e;
            } else if ((i & 1) == 0) {
                mo11519N0();
            }
        }
        return this.f2415E;
    }

    /* renamed from: Z */
    public long mo11491Z() {
        long j;
        int i = this.f2414D;
        if ((i & 2) == 0) {
            if (i == 0) {
                mo11514I0(2);
            }
            int i2 = this.f2414D;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    j = (long) this.f2415E;
                } else if ((i2 & 4) != 0) {
                    if (C1532c.f2434l.compareTo(this.f2418H) > 0 || C1532c.f2435m.compareTo(this.f2418H) < 0) {
                        mo11525C0();
                        throw null;
                    }
                    j = this.f2418H.longValue();
                } else if ((i2 & 8) != 0) {
                    double d = this.f2417G;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        mo11525C0();
                        throw null;
                    }
                    j = (long) d;
                } else if ((i2 & 16) == 0) {
                    mo11536y0();
                    throw null;
                } else if (C1532c.f2436n.compareTo(this.f2419I) > 0 || C1532c.f2437o.compareTo(this.f2419I) < 0) {
                    mo11525C0();
                    throw null;
                } else {
                    j = this.f2419I.longValue();
                }
                this.f2416F = j;
                this.f2414D |= 2;
            }
        }
        return this.f2416F;
    }

    public void close() {
        if (!this.f2423s) {
            this.f2424t = Math.max(this.f2424t, this.f2425u);
            this.f2423s = true;
            try {
                mo11511F0();
            } finally {
                mo11515J0();
            }
        }
    }

    /* renamed from: d */
    public BigInteger mo11493d() {
        BigInteger bigInteger;
        BigDecimal bigDecimal;
        long j;
        int i = this.f2414D;
        if ((i & 4) == 0) {
            if (i == 0) {
                mo11514I0(4);
            }
            int i2 = this.f2414D;
            if ((i2 & 4) == 0) {
                if ((i2 & 16) != 0) {
                    bigDecimal = this.f2419I;
                } else {
                    if ((i2 & 2) != 0) {
                        j = this.f2416F;
                    } else if ((i2 & 1) != 0) {
                        j = (long) this.f2415E;
                    } else if ((i2 & 8) != 0) {
                        bigDecimal = BigDecimal.valueOf(this.f2417G);
                    } else {
                        mo11536y0();
                        throw null;
                    }
                    bigInteger = BigInteger.valueOf(j);
                    this.f2418H = bigInteger;
                    this.f2414D |= 4;
                }
                bigInteger = bigDecimal.toBigInteger();
                this.f2418H = bigInteger;
                this.f2414D |= 4;
            }
        }
        return this.f2418H;
    }

    /* renamed from: p0 */
    public void mo11522p0() {
        if (!this.f2411A.mo11506d()) {
            String str = this.f2411A.mo11504b() ? "Array" : "Object";
            C1549d dVar = this.f2411A;
            mo11533v0(String.format(": expected close marker for %s (start marker at %s)", new Object[]{str, new C1519e(mo11512G0(), -1, dVar.f2507g, dVar.f2508h)}), (C1525j) null);
            throw null;
        }
    }

    /* renamed from: q */
    public String mo11499q() {
        C1549d dVar;
        C1525j jVar = this.f2440h;
        if ((jVar == C1525j.START_OBJECT || jVar == C1525j.START_ARRAY) && (dVar = this.f2411A.f2503c) != null) {
            return dVar.f2506f;
        }
        return this.f2411A.f2506f;
    }
}
