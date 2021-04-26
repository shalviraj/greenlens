package p005b.p280p.p281a;

import java.io.EOFException;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5081q;
import p435n.C8040e;
import p435n.C8043g;
import p435n.C8044h;

/* renamed from: b.p.a.r */
public final class C5084r extends C5081q {

    /* renamed from: q */
    public static final C8044h f9815q = C8044h.m14839k("'\\");

    /* renamed from: r */
    public static final C8044h f9816r = C8044h.m14839k("\"\\");

    /* renamed from: s */
    public static final C8044h f9817s = C8044h.m14839k("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: t */
    public static final C8044h f9818t = C8044h.m14839k("\n\r");

    /* renamed from: u */
    public static final C8044h f9819u = C8044h.m14839k("*/");

    /* renamed from: k */
    public final C8043g f9820k;

    /* renamed from: l */
    public final C8040e f9821l;

    /* renamed from: m */
    public int f9822m = 0;

    /* renamed from: n */
    public long f9823n;

    /* renamed from: o */
    public int f9824o;

    /* renamed from: p */
    public String f9825p;

    public C5084r(C8043g gVar) {
        Objects.requireNonNull(gVar, "source == null");
        this.f9820k = gVar;
        this.f9821l = gVar.mo25901c();
        mo16843l0(6);
    }

    /* renamed from: A0 */
    public final char mo16850A0() {
        int i;
        int i2;
        if (this.f9820k.mo25935t(1)) {
            byte readByte = this.f9821l.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                StringBuilder u = C0843a.m460u("Invalid escape sequence: \\");
                u.append((char) readByte);
                mo16848q0(u.toString());
                throw null;
            } else if (this.f9820k.mo25935t(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte N = this.f9821l.mo25891N((long) i3);
                    char c2 = (char) (c << 4);
                    if (N < 48 || N > 57) {
                        if (N >= 97 && N <= 102) {
                            i2 = N - 97;
                        } else if (N < 65 || N > 70) {
                            StringBuilder u2 = C0843a.m460u("\\u");
                            u2.append(this.f9821l.mo25921o0(4));
                            mo16848q0(u2.toString());
                            throw null;
                        } else {
                            i2 = N - 65;
                        }
                        i = i2 + 10;
                    } else {
                        i = N - 48;
                    }
                    c = (char) (i + c2);
                }
                this.f9821l.skip(4);
                return c;
            } else {
                StringBuilder u3 = C0843a.m460u("Unterminated escape sequence at path ");
                u3.append(mo16834H());
                throw new EOFException(u3.toString());
            }
        } else {
            mo16848q0("Unterminated escape sequence");
            throw null;
        }
    }

    /* renamed from: B0 */
    public final void mo16851B0(C8044h hVar) {
        while (true) {
            long P = this.f9820k.mo25893P(hVar);
            if (P == -1) {
                mo16848q0("Unterminated string");
                throw null;
            } else if (this.f9821l.mo25891N(P) == 92) {
                this.f9821l.skip(P + 1);
                mo16850A0();
            } else {
                this.f9821l.skip(P + 1);
                return;
            }
        }
    }

    /* renamed from: C0 */
    public final void mo16852C0() {
        long P = this.f9820k.mo25893P(f9817s);
        C8040e eVar = this.f9821l;
        if (P == -1) {
            P = eVar.f16140h;
        }
        eVar.skip(P);
    }

    /* renamed from: N */
    public boolean mo16835N() {
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double mo16836O() {
        /*
            r8 = this;
            int r0 = r8.f9822m
            if (r0 != 0) goto L_0x0008
            int r0 = r8.mo16855s0()
        L_0x0008:
            r1 = 16
            r2 = 0
            if (r0 != r1) goto L_0x001f
            r8.f9822m = r2
            int[] r0 = r8.f9801j
            int r1 = r8.f9798g
            int r1 = r1 + -1
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r8.f9823n
            double r0 = (double) r0
            return r0
        L_0x001f:
            r1 = 17
            java.lang.String r3 = "Expected a double but was "
            r4 = 11
            java.lang.String r5 = " at path "
            if (r0 != r1) goto L_0x0033
            n.e r0 = r8.f9821l
            int r1 = r8.f9824o
            long r6 = (long) r1
            java.lang.String r0 = r0.mo25921o0(r6)
            goto L_0x004d
        L_0x0033:
            r1 = 9
            if (r0 != r1) goto L_0x003a
            n.h r0 = f9816r
            goto L_0x0040
        L_0x003a:
            r1 = 8
            if (r0 != r1) goto L_0x0045
            n.h r0 = f9815q
        L_0x0040:
            java.lang.String r0 = r8.mo16862y0(r0)
            goto L_0x004d
        L_0x0045:
            r1 = 10
            if (r0 != r1) goto L_0x0050
            java.lang.String r0 = r8.mo16863z0()
        L_0x004d:
            r8.f9825p = r0
            goto L_0x0052
        L_0x0050:
            if (r0 != r4) goto L_0x00b6
        L_0x0052:
            r8.f9822m = r4
            java.lang.String r0 = r8.f9825p     // Catch:{ NumberFormatException -> 0x0099 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0099 }
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 != 0) goto L_0x0078
            boolean r3 = java.lang.Double.isInfinite(r0)
            if (r3 != 0) goto L_0x0078
            r3 = 0
            r8.f9825p = r3
            r8.f9822m = r2
            int[] r2 = r8.f9801j
            int r3 = r8.f9798g
            int r3 = r3 + -1
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
            return r0
        L_0x0078:
            b.p.a.o r2 = new b.p.a.o
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JSON forbids NaN and infinities: "
            r3.append(r4)
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r8.mo16834H()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0099:
            b.p.a.n r0 = new b.p.a.n
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r3)
            java.lang.String r2 = r8.f9825p
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.mo16834H()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            b.p.a.n r0 = new b.p.a.n
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r3)
            b.p.a.q$b r2 = r8.mo16842h0()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.mo16834H()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p281a.C5084r.mo16836O():double");
    }

    /* renamed from: S */
    public int mo16837S() {
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        if (i == 16) {
            long j = this.f9823n;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f9822m = 0;
                int[] iArr = this.f9801j;
                int i3 = this.f9798g - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder u = C0843a.m460u("Expected an int but was ");
            u.append(this.f9823n);
            u.append(" at path ");
            u.append(mo16834H());
            throw new C5078n(u.toString());
        }
        if (i == 17) {
            this.f9825p = this.f9821l.mo25921o0((long) this.f9824o);
        } else if (i == 9 || i == 8) {
            String y0 = mo16862y0(i == 9 ? f9816r : f9815q);
            this.f9825p = y0;
            try {
                int parseInt = Integer.parseInt(y0);
                this.f9822m = 0;
                int[] iArr2 = this.f9801j;
                int i4 = this.f9798g - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder u2 = C0843a.m460u("Expected an int but was ");
            u2.append(mo16842h0());
            u2.append(" at path ");
            u2.append(mo16834H());
            throw new C5078n(u2.toString());
        }
        this.f9822m = 11;
        try {
            double parseDouble = Double.parseDouble(this.f9825p);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f9825p = null;
                this.f9822m = 0;
                int[] iArr3 = this.f9801j;
                int i6 = this.f9798g - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder u3 = C0843a.m460u("Expected an int but was ");
            u3.append(this.f9825p);
            u3.append(" at path ");
            u3.append(mo16834H());
            throw new C5078n(u3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder u4 = C0843a.m460u("Expected an int but was ");
            u4.append(this.f9825p);
            u4.append(" at path ");
            u4.append(mo16834H());
            throw new C5078n(u4.toString());
        }
    }

    /* renamed from: Z */
    public <T> T mo16838Z() {
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        if (i == 7) {
            this.f9822m = 0;
            int[] iArr = this.f9801j;
            int i2 = this.f9798g - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        StringBuilder u = C0843a.m460u("Expected null but was ");
        u.append(mo16842h0());
        u.append(" at path ");
        u.append(mo16834H());
        throw new C5078n(u.toString());
    }

    public void close() {
        this.f9822m = 0;
        this.f9799h[0] = 8;
        this.f9798g = 1;
        C8040e eVar = this.f9821l;
        eVar.skip(eVar.f16140h);
        this.f9820k.close();
    }

    /* renamed from: d */
    public void mo16839d() {
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        if (i == 3) {
            mo16843l0(1);
            this.f9801j[this.f9798g - 1] = 0;
            this.f9822m = 0;
            return;
        }
        StringBuilder u = C0843a.m460u("Expected BEGIN_ARRAY but was ");
        u.append(mo16842h0());
        u.append(" at path ");
        u.append(mo16834H());
        throw new C5078n(u.toString());
    }

    /* renamed from: e */
    public void mo16840e() {
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        if (i == 1) {
            mo16843l0(3);
            this.f9822m = 0;
            return;
        }
        StringBuilder u = C0843a.m460u("Expected BEGIN_OBJECT but was ");
        u.append(mo16842h0());
        u.append(" at path ");
        u.append(mo16834H());
        throw new C5078n(u.toString());
    }

    /* renamed from: f0 */
    public String mo16841f0() {
        String str;
        C8044h hVar;
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        if (i == 10) {
            str = mo16863z0();
        } else {
            if (i == 9) {
                hVar = f9816r;
            } else if (i == 8) {
                hVar = f9815q;
            } else if (i == 11) {
                str = this.f9825p;
                this.f9825p = null;
            } else if (i == 16) {
                str = Long.toString(this.f9823n);
            } else if (i == 17) {
                str = this.f9821l.mo25921o0((long) this.f9824o);
            } else {
                StringBuilder u = C0843a.m460u("Expected a string but was ");
                u.append(mo16842h0());
                u.append(" at path ");
                u.append(mo16834H());
                throw new C5078n(u.toString());
            }
            str = mo16862y0(hVar);
        }
        this.f9822m = 0;
        int[] iArr = this.f9801j;
        int i2 = this.f9798g - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: h0 */
    public C5081q.C5083b mo16842h0() {
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        switch (i) {
            case 1:
                return C5081q.C5083b.BEGIN_OBJECT;
            case 2:
                return C5081q.C5083b.END_OBJECT;
            case 3:
                return C5081q.C5083b.BEGIN_ARRAY;
            case 4:
                return C5081q.C5083b.END_ARRAY;
            case 5:
            case 6:
                return C5081q.C5083b.BOOLEAN;
            case 7:
                return C5081q.C5083b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C5081q.C5083b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C5081q.C5083b.NAME;
            case 16:
            case 17:
                return C5081q.C5083b.NUMBER;
            case 18:
                return C5081q.C5083b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: n0 */
    public int mo16844n0(C5081q.C5082a aVar) {
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return mo16856t0(this.f9825p, aVar);
        }
        int m0 = this.f9820k.mo25917m0(aVar.f9803b);
        if (m0 != -1) {
            this.f9822m = 0;
            this.f9800i[this.f9798g - 1] = aVar.f9802a[m0];
            return m0;
        }
        String str = this.f9800i[this.f9798g - 1];
        String w0 = mo16860w0();
        int t0 = mo16856t0(w0, aVar);
        if (t0 == -1) {
            this.f9822m = 15;
            this.f9825p = w0;
            this.f9800i[this.f9798g - 1] = str;
        }
        return t0;
    }

    /* renamed from: o0 */
    public void mo16845o0() {
        C8044h hVar;
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        if (i == 14) {
            mo16852C0();
        } else {
            if (i == 13) {
                hVar = f9816r;
            } else if (i == 12) {
                hVar = f9815q;
            } else if (i != 15) {
                StringBuilder u = C0843a.m460u("Expected a name but was ");
                u.append(mo16842h0());
                u.append(" at path ");
                u.append(mo16834H());
                throw new C5078n(u.toString());
            }
            mo16851B0(hVar);
        }
        this.f9822m = 0;
        this.f9800i[this.f9798g - 1] = "null";
    }

    /* renamed from: p0 */
    public void mo16846p0() {
        C8044h hVar;
        int i = 0;
        do {
            int i2 = this.f9822m;
            if (i2 == 0) {
                i2 = mo16855s0();
            }
            if (i2 == 3) {
                mo16843l0(1);
            } else if (i2 == 1) {
                mo16843l0(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder u = C0843a.m460u("Expected a value but was ");
                        u.append(mo16842h0());
                        u.append(" at path ");
                        u.append(mo16834H());
                        throw new C5078n(u.toString());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder u2 = C0843a.m460u("Expected a value but was ");
                        u2.append(mo16842h0());
                        u2.append(" at path ");
                        u2.append(mo16834H());
                        throw new C5078n(u2.toString());
                    }
                } else if (i2 == 14 || i2 == 10) {
                    mo16852C0();
                    this.f9822m = 0;
                } else {
                    if (i2 == 9 || i2 == 13) {
                        hVar = f9816r;
                    } else if (i2 == 8 || i2 == 12) {
                        hVar = f9815q;
                    } else {
                        if (i2 == 17) {
                            this.f9821l.skip((long) this.f9824o);
                        } else if (i2 == 18) {
                            StringBuilder u3 = C0843a.m460u("Expected a value but was ");
                            u3.append(mo16842h0());
                            u3.append(" at path ");
                            u3.append(mo16834H());
                            throw new C5078n(u3.toString());
                        }
                        this.f9822m = 0;
                    }
                    mo16851B0(hVar);
                    this.f9822m = 0;
                }
                this.f9798g--;
                this.f9822m = 0;
            }
            i++;
            this.f9822m = 0;
        } while (i != 0);
        int[] iArr = this.f9801j;
        int i3 = this.f9798g;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f9800i[i3 - 1] = "null";
    }

    /* renamed from: q */
    public void mo16847q() {
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        if (i == 4) {
            int i2 = this.f9798g - 1;
            this.f9798g = i2;
            int[] iArr = this.f9801j;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f9822m = 0;
            return;
        }
        StringBuilder u = C0843a.m460u("Expected END_ARRAY but was ");
        u.append(mo16842h0());
        u.append(" at path ");
        u.append(mo16834H());
        throw new C5078n(u.toString());
    }

    /* renamed from: r0 */
    public final void mo16854r0() {
        mo16848q0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01af, code lost:
        if (mo16859v0(r2) != false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01b1, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b2, code lost:
        if (r4 != r2) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01b4, code lost:
        if (r7 == false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01ba, code lost:
        if (r8 != Long.MIN_VALUE) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01bc, code lost:
        if (r10 == false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c2, code lost:
        if (r8 != 0) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c4, code lost:
        if (r10 != false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01c6, code lost:
        if (r10 == false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01c9, code lost:
        r8 = -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01ca, code lost:
        r0.f9823n = r8;
        r0.f9821l.skip((long) r1);
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d5, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01d6, code lost:
        if (r4 == r2) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01d8, code lost:
        if (r4 == 4) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01db, code lost:
        if (r4 != 7) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01dd, code lost:
        r0.f9824o = r1;
        r1 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01e1, code lost:
        r15 = r1;
        r0.f9822m = r15;
     */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0128 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0129  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16855s0() {
        /*
            r17 = this;
            r0 = r17
            int[] r1 = r0.f9799h
            int r2 = r0.f9798g
            int r3 = r2 + -1
            r3 = r1[r3]
            r4 = 9
            r7 = 93
            r8 = 59
            r9 = 44
            r10 = 3
            r11 = 7
            r12 = 6
            r13 = 5
            r14 = 2
            r15 = 0
            r5 = 4
            r16 = 0
            r6 = 1
            if (r3 != r6) goto L_0x0022
            int r2 = r2 - r6
            r1[r2] = r14
            goto L_0x0084
        L_0x0022:
            if (r3 != r14) goto L_0x0040
            int r1 = r0.mo16861x0(r6)
            n.e r2 = r0.f9821l
            r2.readByte()
            if (r1 == r9) goto L_0x0084
            if (r1 == r8) goto L_0x003c
            if (r1 != r7) goto L_0x0036
            r0.f9822m = r5
            return r5
        L_0x0036:
            java.lang.String r1 = "Unterminated array"
            r0.mo16848q0(r1)
            throw r16
        L_0x003c:
            r17.mo16854r0()
            throw r16
        L_0x0040:
            if (r3 == r10) goto L_0x026a
            if (r3 != r13) goto L_0x0046
            goto L_0x026a
        L_0x0046:
            if (r3 != r5) goto L_0x0066
            int r2 = r2 - r6
            r1[r2] = r13
            int r1 = r0.mo16861x0(r6)
            n.e r2 = r0.f9821l
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x0084
            r2 = 61
            if (r1 == r2) goto L_0x0062
            java.lang.String r1 = "Expected ':'"
            r0.mo16848q0(r1)
            throw r16
        L_0x0062:
            r17.mo16854r0()
            throw r16
        L_0x0066:
            if (r3 != r12) goto L_0x006c
            int r2 = r2 - r6
            r1[r2] = r11
            goto L_0x0084
        L_0x006c:
            if (r3 != r11) goto L_0x007e
            int r1 = r0.mo16861x0(r15)
            r2 = -1
            if (r1 != r2) goto L_0x007a
            r1 = 18
        L_0x0077:
            r0.f9822m = r1
            return r1
        L_0x007a:
            r17.mo16854r0()
            throw r16
        L_0x007e:
            if (r3 == r4) goto L_0x0269
            r1 = 8
            if (r3 == r1) goto L_0x0261
        L_0x0084:
            int r1 = r0.mo16861x0(r6)
            r2 = 34
            if (r1 == r2) goto L_0x0259
            r2 = 39
            if (r1 == r2) goto L_0x0255
            if (r1 == r9) goto L_0x0245
            if (r1 == r8) goto L_0x0245
            r2 = 91
            if (r1 == r2) goto L_0x023d
            if (r1 == r7) goto L_0x0233
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x022b
            n.e r1 = r0.f9821l
            r2 = 0
            byte r1 = r1.mo25891N(r2)
            r4 = 116(0x74, float:1.63E-43)
            if (r1 == r4) goto L_0x00d0
            r4 = 84
            if (r1 != r4) goto L_0x00af
            goto L_0x00d0
        L_0x00af:
            r4 = 102(0x66, float:1.43E-43)
            if (r1 == r4) goto L_0x00ca
            r4 = 70
            if (r1 != r4) goto L_0x00b8
            goto L_0x00ca
        L_0x00b8:
            r4 = 110(0x6e, float:1.54E-43)
            if (r1 == r4) goto L_0x00c4
            r4 = 78
            if (r1 != r4) goto L_0x00c1
            goto L_0x00c4
        L_0x00c1:
            r7 = r15
            goto L_0x0126
        L_0x00c4:
            java.lang.String r1 = "null"
            java.lang.String r4 = "NULL"
            r7 = r11
            goto L_0x00d5
        L_0x00ca:
            java.lang.String r1 = "false"
            java.lang.String r4 = "FALSE"
            r7 = r12
            goto L_0x00d5
        L_0x00d0:
            java.lang.String r1 = "true"
            java.lang.String r4 = "TRUE"
            r7 = r13
        L_0x00d5:
            int r8 = r1.length()
            r9 = r6
        L_0x00da:
            if (r9 >= r8) goto L_0x0105
            n.g r15 = r0.f9820k
            int r11 = r9 + 1
            long r12 = (long) r11
            boolean r12 = r15.mo25935t(r12)
            if (r12 != 0) goto L_0x00e9
        L_0x00e7:
            r7 = 0
            goto L_0x0126
        L_0x00e9:
            n.e r12 = r0.f9821l
            r15 = r11
            long r10 = (long) r9
            byte r10 = r12.mo25891N(r10)
            char r11 = r1.charAt(r9)
            if (r10 == r11) goto L_0x00fe
            char r9 = r4.charAt(r9)
            if (r10 == r9) goto L_0x00fe
            goto L_0x00e7
        L_0x00fe:
            r9 = r15
            r10 = 3
            r11 = 7
            r12 = 6
            r13 = 5
            r15 = 0
            goto L_0x00da
        L_0x0105:
            n.g r1 = r0.f9820k
            int r4 = r8 + 1
            long r9 = (long) r4
            boolean r1 = r1.mo25935t(r9)
            if (r1 == 0) goto L_0x011e
            n.e r1 = r0.f9821l
            long r9 = (long) r8
            byte r1 = r1.mo25891N(r9)
            boolean r1 = r0.mo16859v0(r1)
            if (r1 == 0) goto L_0x011e
            goto L_0x00e7
        L_0x011e:
            n.e r1 = r0.f9821l
            long r8 = (long) r8
            r1.skip(r8)
            r0.f9822m = r7
        L_0x0126:
            if (r7 == 0) goto L_0x0129
            return r7
        L_0x0129:
            r8 = r2
            r7 = r6
            r1 = 0
            r4 = 0
            r10 = 0
        L_0x012e:
            n.g r11 = r0.f9820k
            int r12 = r1 + 1
            long r2 = (long) r12
            boolean r2 = r11.mo25935t(r2)
            if (r2 != 0) goto L_0x013c
            r2 = r14
            goto L_0x01b2
        L_0x013c:
            n.e r2 = r0.f9821l
            long r13 = (long) r1
            byte r2 = r2.mo25891N(r13)
            r13 = 43
            if (r2 == r13) goto L_0x0202
            r13 = 69
            if (r2 == r13) goto L_0x01f8
            r13 = 101(0x65, float:1.42E-43)
            if (r2 == r13) goto L_0x01f8
            r13 = 45
            if (r2 == r13) goto L_0x01ec
            r13 = 46
            if (r2 == r13) goto L_0x01e5
            r13 = 48
            if (r2 < r13) goto L_0x01ab
            r13 = 57
            if (r2 <= r13) goto L_0x0160
            goto L_0x01ab
        L_0x0160:
            if (r4 == r6) goto L_0x01a1
            if (r4 != 0) goto L_0x0165
            goto L_0x01a1
        L_0x0165:
            r1 = 2
            if (r4 != r1) goto L_0x018f
            r13 = 0
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x0170
            goto L_0x020f
        L_0x0170:
            r13 = 10
            long r13 = r13 * r8
            int r2 = r2 + -48
            long r1 = (long) r2
            long r13 = r13 - r1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0189
            if (r1 != 0) goto L_0x0187
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r1 = 0
            goto L_0x018a
        L_0x0189:
            r1 = r6
        L_0x018a:
            r1 = r1 & r7
            r7 = r1
            r8 = r13
            r3 = 6
            goto L_0x01a8
        L_0x018f:
            r1 = 3
            if (r4 != r1) goto L_0x0197
            r4 = r5
            r2 = 7
            r3 = 6
            goto L_0x0209
        L_0x0197:
            r1 = 5
            r3 = 6
            if (r4 == r1) goto L_0x019d
            if (r4 != r3) goto L_0x01a8
        L_0x019d:
            r2 = 7
            r4 = 7
            goto L_0x0209
        L_0x01a1:
            r3 = 6
            int r2 = r2 + -48
            int r1 = -r2
            long r1 = (long) r1
            r8 = r1
            r4 = 2
        L_0x01a8:
            r2 = 7
            goto L_0x0209
        L_0x01ab:
            boolean r2 = r0.mo16859v0(r2)
            if (r2 != 0) goto L_0x020f
            r2 = 2
        L_0x01b2:
            if (r4 != r2) goto L_0x01d6
            if (r7 == 0) goto L_0x01d5
            r2 = -9223372036854775808
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x01be
            if (r10 == 0) goto L_0x01d5
        L_0x01be:
            r2 = 0
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x01c6
            if (r10 != 0) goto L_0x01d5
        L_0x01c6:
            if (r10 == 0) goto L_0x01c9
            goto L_0x01ca
        L_0x01c9:
            long r8 = -r8
        L_0x01ca:
            r0.f9823n = r8
            n.e r2 = r0.f9821l
            long r3 = (long) r1
            r2.skip(r3)
            r1 = 16
            goto L_0x01e1
        L_0x01d5:
            r2 = 2
        L_0x01d6:
            if (r4 == r2) goto L_0x01dd
            if (r4 == r5) goto L_0x01dd
            r2 = 7
            if (r4 != r2) goto L_0x020f
        L_0x01dd:
            r0.f9824o = r1
            r1 = 17
        L_0x01e1:
            r15 = r1
            r0.f9822m = r15
            goto L_0x0210
        L_0x01e5:
            r1 = 2
            r2 = 7
            r3 = 6
            if (r4 != r1) goto L_0x020f
            r1 = 3
            goto L_0x0208
        L_0x01ec:
            r1 = 2
            r2 = 7
            r3 = 6
            if (r4 != 0) goto L_0x01f4
            r4 = r6
            r10 = r4
            goto L_0x0209
        L_0x01f4:
            r14 = 5
            if (r4 != r14) goto L_0x020f
            goto L_0x0207
        L_0x01f8:
            r1 = 2
            r2 = 7
            r3 = 6
            r14 = 5
            if (r4 == r1) goto L_0x0200
            if (r4 != r5) goto L_0x020f
        L_0x0200:
            r4 = r14
            goto L_0x0209
        L_0x0202:
            r2 = 7
            r3 = 6
            r14 = 5
            if (r4 != r14) goto L_0x020f
        L_0x0207:
            r1 = r3
        L_0x0208:
            r4 = r1
        L_0x0209:
            r1 = r12
            r2 = 0
            r14 = 2
            goto L_0x012e
        L_0x020f:
            r15 = 0
        L_0x0210:
            if (r15 == 0) goto L_0x0213
            return r15
        L_0x0213:
            n.e r1 = r0.f9821l
            r2 = 0
            byte r1 = r1.mo25891N(r2)
            boolean r1 = r0.mo16859v0(r1)
            if (r1 != 0) goto L_0x0227
            java.lang.String r1 = "Expected value"
            r0.mo16848q0(r1)
            throw r16
        L_0x0227:
            r17.mo16854r0()
            throw r16
        L_0x022b:
            n.e r1 = r0.f9821l
            r1.readByte()
            r0.f9822m = r6
            return r6
        L_0x0233:
            if (r3 != r6) goto L_0x0245
            n.e r1 = r0.f9821l
            r1.readByte()
            r0.f9822m = r5
            return r5
        L_0x023d:
            n.e r1 = r0.f9821l
            r1.readByte()
            r1 = 3
            goto L_0x0077
        L_0x0245:
            if (r3 == r6) goto L_0x0251
            r1 = 2
            if (r3 != r1) goto L_0x024b
            goto L_0x0251
        L_0x024b:
            java.lang.String r1 = "Unexpected value"
            r0.mo16848q0(r1)
            throw r16
        L_0x0251:
            r17.mo16854r0()
            throw r16
        L_0x0255:
            r17.mo16854r0()
            throw r16
        L_0x0259:
            n.e r1 = r0.f9821l
            r1.readByte()
            r0.f9822m = r4
            return r4
        L_0x0261:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0269:
            throw r16
        L_0x026a:
            int r2 = r2 - r6
            r1[r2] = r5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 5
            if (r3 != r2) goto L_0x028e
            int r2 = r0.mo16861x0(r6)
            n.e r4 = r0.f9821l
            r4.readByte()
            if (r2 == r9) goto L_0x028e
            if (r2 == r8) goto L_0x028a
            if (r2 != r1) goto L_0x0284
        L_0x0281:
            r1 = 2
            goto L_0x0077
        L_0x0284:
            java.lang.String r1 = "Unterminated object"
            r0.mo16848q0(r1)
            throw r16
        L_0x028a:
            r17.mo16854r0()
            throw r16
        L_0x028e:
            int r2 = r0.mo16861x0(r6)
            r4 = 34
            if (r2 == r4) goto L_0x02b8
            r4 = 39
            if (r2 == r4) goto L_0x02af
            if (r2 != r1) goto L_0x02ab
            r1 = 5
            if (r3 == r1) goto L_0x02a5
            n.e r1 = r0.f9821l
            r1.readByte()
            goto L_0x0281
        L_0x02a5:
            java.lang.String r1 = "Expected name"
            r0.mo16848q0(r1)
            throw r16
        L_0x02ab:
            r17.mo16854r0()
            throw r16
        L_0x02af:
            n.e r1 = r0.f9821l
            r1.readByte()
            r17.mo16854r0()
            throw r16
        L_0x02b8:
            n.e r1 = r0.f9821l
            r1.readByte()
            r1 = 13
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p281a.C5084r.mo16855s0():int");
    }

    /* renamed from: t0 */
    public final int mo16856t0(String str, C5081q.C5082a aVar) {
        int length = aVar.f9802a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f9802a[i])) {
                this.f9822m = 0;
                this.f9800i[this.f9798g - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("JsonReader(");
        u.append(this.f9820k);
        u.append(")");
        return u.toString();
    }

    /* renamed from: u0 */
    public final int mo16858u0(String str, C5081q.C5082a aVar) {
        int length = aVar.f9802a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f9802a[i])) {
                this.f9822m = 0;
                int[] iArr = this.f9801j;
                int i2 = this.f9798g - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: v0 */
    public final boolean mo16859v0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo16854r0();
        throw null;
    }

    /* renamed from: w0 */
    public String mo16860w0() {
        String str;
        C8044h hVar;
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        if (i == 14) {
            str = mo16863z0();
        } else {
            if (i == 13) {
                hVar = f9816r;
            } else if (i == 12) {
                hVar = f9815q;
            } else if (i == 15) {
                str = this.f9825p;
                this.f9825p = null;
            } else {
                StringBuilder u = C0843a.m460u("Expected a name but was ");
                u.append(mo16842h0());
                u.append(" at path ");
                u.append(mo16834H());
                throw new C5078n(u.toString());
            }
            str = mo16862y0(hVar);
        }
        this.f9822m = 0;
        this.f9800i[this.f9798g - 1] = str;
        return str;
    }

    /* renamed from: x0 */
    public final int mo16861x0(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (this.f9820k.mo25935t((long) i2)) {
                byte N = this.f9821l.mo25891N((long) i);
                if (N == 10 || N == 32 || N == 13 || N == 9) {
                    i = i2;
                } else {
                    this.f9821l.skip((long) (i2 - 1));
                    if (N == 47) {
                        if (!this.f9820k.mo25935t(2)) {
                            return N;
                        }
                        mo16854r0();
                        throw null;
                    } else if (N != 35) {
                        return N;
                    } else {
                        mo16854r0();
                        throw null;
                    }
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    /* renamed from: y0 */
    public final String mo16862y0(C8044h hVar) {
        StringBuilder sb = null;
        while (true) {
            long P = this.f9820k.mo25893P(hVar);
            if (P == -1) {
                mo16848q0("Unterminated string");
                throw null;
            } else if (this.f9821l.mo25891N(P) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f9821l.mo25921o0(P));
                this.f9821l.readByte();
                sb.append(mo16850A0());
            } else {
                String o0 = this.f9821l.mo25921o0(P);
                if (sb == null) {
                    this.f9821l.readByte();
                    return o0;
                }
                sb.append(o0);
                this.f9821l.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: z */
    public void mo16849z() {
        int i = this.f9822m;
        if (i == 0) {
            i = mo16855s0();
        }
        if (i == 2) {
            int i2 = this.f9798g - 1;
            this.f9798g = i2;
            this.f9800i[i2] = null;
            int[] iArr = this.f9801j;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f9822m = 0;
            return;
        }
        StringBuilder u = C0843a.m460u("Expected END_OBJECT but was ");
        u.append(mo16842h0());
        u.append(" at path ");
        u.append(mo16834H());
        throw new C5078n(u.toString());
    }

    /* renamed from: z0 */
    public final String mo16863z0() {
        long P = this.f9820k.mo25893P(f9817s);
        return P != -1 ? this.f9821l.mo25921o0(P) : this.f9821l.mo25919n0();
    }
}
