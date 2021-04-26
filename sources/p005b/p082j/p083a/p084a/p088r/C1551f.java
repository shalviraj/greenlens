package p005b.p082j.p083a.p084a.p088r;

import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p082j.p083a.p084a.C1519e;
import p005b.p082j.p083a.p084a.C1520f;
import p005b.p082j.p083a.p084a.C1521g;
import p005b.p082j.p083a.p084a.C1525j;
import p005b.p082j.p083a.p084a.C1526k;
import p005b.p082j.p083a.p084a.p085o.C1531b;
import p005b.p082j.p083a.p084a.p087q.C1535a;
import p005b.p082j.p083a.p084a.p087q.C1537b;
import p005b.p082j.p083a.p084a.p089s.C1556b;
import p005b.p082j.p083a.p084a.p090t.C1568h;

/* renamed from: b.j.a.a.r.f */
public class C1551f extends C1531b {

    /* renamed from: S */
    public static final int f2514S = C1521g.C1522a.ALLOW_TRAILING_COMMA.f2382h;

    /* renamed from: T */
    public static final int f2515T = C1521g.C1522a.ALLOW_NUMERIC_LEADING_ZEROS.f2382h;

    /* renamed from: U */
    public static final int f2516U = C1521g.C1522a.ALLOW_NON_NUMERIC_NUMBERS.f2382h;

    /* renamed from: V */
    public static final int f2517V = C1521g.C1522a.ALLOW_MISSING_VALUES.f2382h;

    /* renamed from: W */
    public static final int f2518W = C1521g.C1522a.ALLOW_SINGLE_QUOTES.f2382h;

    /* renamed from: X */
    public static final int f2519X = C1521g.C1522a.ALLOW_UNQUOTED_FIELD_NAMES.f2382h;

    /* renamed from: Y */
    public static final int f2520Y = C1521g.C1522a.ALLOW_COMMENTS.f2382h;

    /* renamed from: Z */
    public static final int f2521Z = C1521g.C1522a.ALLOW_YAML_COMMENTS.f2382h;

    /* renamed from: a0 */
    public static final int[] f2522a0 = C1535a.f2443c;

    /* renamed from: L */
    public Reader f2523L;

    /* renamed from: M */
    public char[] f2524M;

    /* renamed from: N */
    public boolean f2525N;

    /* renamed from: O */
    public final C1556b f2526O;

    /* renamed from: P */
    public final int f2527P;

    /* renamed from: Q */
    public boolean f2528Q;

    /* renamed from: R */
    public long f2529R;

    public C1551f(C1537b bVar, int i, Reader reader, C1526k kVar, C1556b bVar2) {
        super(bVar, i);
        this.f2523L = reader;
        bVar.mo11538a(bVar.f2458g);
        char[] b = bVar.f2455d.mo11685b(0, 0);
        bVar.f2458g = b;
        this.f2524M = b;
        this.f2424t = 0;
        this.f2425u = 0;
        this.f2526O = bVar2;
        this.f2527P = bVar2.f2585c;
        this.f2525N = true;
    }

    /* renamed from: F0 */
    public void mo11511F0() {
        if (this.f2523L != null) {
            if (this.f2422r.f2454c || mo11496h0(C1521g.C1522a.AUTO_CLOSE_SOURCE)) {
                this.f2523L.close();
            }
            this.f2523L = null;
        }
    }

    /* renamed from: J0 */
    public void mo11515J0() {
        char[] cArr;
        C1556b bVar;
        super.mo11515J0();
        C1556b bVar2 = this.f2526O;
        if ((!bVar2.f2594l) && (bVar = bVar2.f2583a) != null && bVar2.f2587e) {
            C1556b.C1558b bVar3 = new C1556b.C1558b(bVar2);
            int i = bVar3.f2599a;
            C1556b.C1558b bVar4 = bVar.f2584b.get();
            if (i != bVar4.f2599a) {
                if (i > 12000) {
                    bVar3 = new C1556b.C1558b(0, 0, new String[64], new C1556b.C1557a[32]);
                }
                bVar.f2584b.compareAndSet(bVar4, bVar3);
            }
            bVar2.f2594l = true;
        }
        if (this.f2525N && (cArr = this.f2524M) != null) {
            this.f2524M = null;
            C1537b bVar5 = this.f2422r;
            Objects.requireNonNull(bVar5);
            bVar5.mo11539b(cArr, bVar5.f2458g);
            bVar5.f2458g = null;
            bVar5.f2455d.f2606b.set(0, cArr);
        }
    }

    /* renamed from: R0 */
    public final void mo11581R0(String str, int i, int i2) {
        if (Character.isJavaIdentifierPart((char) i2)) {
            mo11590a1(str.substring(0, i));
            throw null;
        }
    }

    /* renamed from: S0 */
    public final void mo11582S0(int i) {
        if (i == 93) {
            mo11599j1();
            if (this.f2411A.mo11504b()) {
                this.f2411A = this.f2411A.mo11570f();
                this.f2440h = C1525j.END_ARRAY;
            } else {
                mo11516K0(i, '}');
                throw null;
            }
        }
        if (i == 125) {
            mo11599j1();
            if (this.f2411A.mo11505c()) {
                this.f2411A = this.f2411A.mo11570f();
                this.f2440h = C1525j.END_OBJECT;
                return;
            }
            mo11516K0(i, ']');
            throw null;
        }
    }

    /* renamed from: T0 */
    public char mo11583T0() {
        if (this.f2424t < this.f2425u || mo11585V0()) {
            char[] cArr = this.f2524M;
            int i = this.f2424t;
            this.f2424t = i + 1;
            char c = cArr[i];
            if (c == '\"' || c == '/' || c == '\\') {
                return c;
            }
            if (c == 'b') {
                return 8;
            }
            if (c == 'f') {
                return 12;
            }
            if (c == 'n') {
                return 10;
            }
            if (c == 'r') {
                return 13;
            }
            if (c == 't') {
                return 9;
            }
            if (c != 'u') {
                mo11513H0(c);
                return c;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < 4) {
                if (this.f2424t < this.f2425u || mo11585V0()) {
                    char[] cArr2 = this.f2524M;
                    int i4 = this.f2424t;
                    this.f2424t = i4 + 1;
                    char c2 = cArr2[i4];
                    int i5 = C1535a.f2449i[c2 & 255];
                    if (i5 >= 0) {
                        i3 = (i3 << 4) | i5;
                        i2++;
                    } else {
                        mo11535x0(c2, "expected a hex-digit for character escape sequence");
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

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ?, r10v1 ?, r10v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: U0 */
    public p005b.p082j.p083a.p084a.C1525j mo11584U0(
/*
Method generation error in method: b.j.a.a.r.f.U0(int, boolean):b.j.a.a.j, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ?
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

    /* renamed from: V0 */
    public boolean mo11585V0() {
        int i = this.f2425u;
        Reader reader = this.f2523L;
        if (reader != null) {
            char[] cArr = this.f2524M;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this.f2424t = 0;
                this.f2425u = read;
                long j = (long) i;
                this.f2426v += j;
                this.f2428x -= i;
                this.f2529R -= j;
                return true;
            }
            mo11511F0();
            if (read == 0) {
                StringBuilder u = C0843a.m460u("Reader returned 0 characters when trying to read ");
                u.append(this.f2425u);
                throw new IOException(u.toString());
            }
        }
        return false;
    }

    /* renamed from: W0 */
    public final void mo11586W0(String str, int i) {
        int i2;
        char c;
        int length = str.length();
        if (this.f2424t + length >= this.f2425u) {
            int length2 = str.length();
            do {
                if ((this.f2424t < this.f2425u || mo11585V0()) && this.f2524M[this.f2424t] == str.charAt(i)) {
                    i2 = this.f2424t + 1;
                    this.f2424t = i2;
                    i++;
                } else {
                    mo11590a1(str.substring(0, i));
                    throw null;
                }
            } while (i < length2);
            if ((i2 < this.f2425u || mo11585V0()) && (c = this.f2524M[this.f2424t]) >= '0' && c != ']' && c != '}') {
                mo11581R0(str, i, c);
                return;
            }
            return;
        }
        while (this.f2524M[this.f2424t] == str.charAt(i)) {
            int i3 = this.f2424t + 1;
            this.f2424t = i3;
            i++;
            if (i >= length) {
                char c2 = this.f2524M[i3];
                if (c2 >= '0' && c2 != ']' && c2 != '}') {
                    mo11581R0(str, i, c2);
                    return;
                }
                return;
            }
        }
        mo11590a1(str.substring(0, i));
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r8 == 'E') goto L_0x0036;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p082j.p083a.p084a.C1525j mo11587X0(int r8, int r9, int r10, boolean r11, int r12) {
        /*
            r7 = this;
            int r0 = r7.f2425u
            r1 = 0
            r2 = 57
            r3 = 48
            r4 = 0
            r5 = 46
            if (r8 != r5) goto L_0x002e
            r8 = r4
        L_0x000d:
            if (r10 < r0) goto L_0x0014
            b.j.a.a.j r8 = r7.mo11589Z0(r11, r9)
            return r8
        L_0x0014:
            char[] r5 = r7.f2524M
            int r6 = r10 + 1
            char r10 = r5[r10]
            if (r10 < r3) goto L_0x0023
            if (r10 <= r2) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r8 = r8 + 1
            r10 = r6
            goto L_0x000d
        L_0x0023:
            if (r8 == 0) goto L_0x0028
            r8 = r10
            r10 = r6
            goto L_0x002e
        L_0x0028:
            java.lang.String r8 = "Decimal point not followed by a digit"
            r7.mo11527E0(r10, r8)
            throw r1
        L_0x002e:
            r5 = 101(0x65, float:1.42E-43)
            if (r8 == r5) goto L_0x0036
            r5 = 69
            if (r8 != r5) goto L_0x006d
        L_0x0036:
            if (r10 < r0) goto L_0x003f
        L_0x0038:
            r7.f2424t = r9
            b.j.a.a.j r8 = r7.mo11589Z0(r11, r9)
            return r8
        L_0x003f:
            char[] r8 = r7.f2524M
            int r5 = r10 + 1
            char r10 = r8[r10]
            r6 = 45
            if (r10 == r6) goto L_0x0052
            r6 = 43
            if (r10 != r6) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            r8 = r10
            r10 = r5
        L_0x0050:
            r5 = r4
            goto L_0x005a
        L_0x0052:
            if (r5 < r0) goto L_0x0055
            goto L_0x0038
        L_0x0055:
            int r10 = r5 + 1
            char r8 = r8[r5]
            goto L_0x0050
        L_0x005a:
            if (r8 > r2) goto L_0x006b
            if (r8 < r3) goto L_0x006b
            int r5 = r5 + 1
            if (r10 < r0) goto L_0x0063
            goto L_0x0038
        L_0x0063:
            char[] r8 = r7.f2524M
            int r6 = r10 + 1
            char r8 = r8[r10]
            r10 = r6
            goto L_0x005a
        L_0x006b:
            if (r5 == 0) goto L_0x008d
        L_0x006d:
            int r10 = r10 + -1
            r7.f2424t = r10
            b.j.a.a.r.d r0 = r7.f2411A
            boolean r0 = r0.mo11506d()
            if (r0 == 0) goto L_0x007c
            r7.mo11600k1(r8)
        L_0x007c:
            int r10 = r10 - r9
            b.j.a.a.t.h r8 = r7.f2413C
            char[] r0 = r7.f2524M
            r8.mo11710o(r0, r9, r10)
            r7.f2420J = r11
            r7.f2421K = r12
            r7.f2414D = r4
            b.j.a.a.j r8 = p005b.p082j.p083a.p084a.C1525j.VALUE_NUMBER_FLOAT
            return r8
        L_0x008d:
            java.lang.String r9 = "Exponent indicator not followed by a digit"
            r7.mo11527E0(r8, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p088r.C1551f.mo11587X0(int, int, int, boolean, int):b.j.a.a.j");
    }

    /* renamed from: Y0 */
    public final String mo11588Y0(int i, int i2, int i3) {
        this.f2413C.mo11710o(this.f2524M, i, this.f2424t - i);
        char[] k = this.f2413C.mo11706k();
        int i4 = this.f2413C.f2637i;
        while (true) {
            if (this.f2424t < this.f2425u || mo11585V0()) {
                char[] cArr = this.f2524M;
                int i5 = this.f2424t;
                this.f2424t = i5 + 1;
                char c = cArr[i5];
                if (c <= '\\') {
                    if (c == '\\') {
                        c = mo11583T0();
                    } else if (c <= i3) {
                        if (c == i3) {
                            C1568h hVar = this.f2413C;
                            hVar.f2637i = i4;
                            return this.f2526O.mo11681c(hVar.mo11707l(), hVar.mo11708m(), hVar.mo11711p(), i2);
                        } else if (c < ' ') {
                            mo11517L0(c, "name");
                        }
                    }
                }
                i2 = (i2 * 33) + c;
                int i6 = i4 + 1;
                k[i4] = c;
                if (i6 >= k.length) {
                    k = this.f2413C.mo11705j();
                    i4 = 0;
                } else {
                    i4 = i6;
                }
            } else {
                mo11533v0(" in field name", C1525j.FIELD_NAME);
                throw null;
            }
        }
    }

    /* renamed from: Z0 */
    public final C1525j mo11589Z0(boolean z, int i) {
        int i2;
        char c;
        boolean z2;
        int i3;
        char c2;
        char l1;
        int i4;
        char c3;
        if (z) {
            i++;
        }
        this.f2424t = i;
        char[] g = this.f2413C.mo11702g();
        int i5 = 0;
        if (z) {
            g[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i6 = this.f2424t;
        if (i6 < this.f2425u) {
            char[] cArr = this.f2524M;
            this.f2424t = i6 + 1;
            c = cArr[i6];
        } else {
            c = mo11601l1("No digit following minus sign", C1525j.VALUE_NUMBER_INT);
        }
        if (c == '0') {
            int i7 = this.f2424t;
            int i8 = this.f2425u;
            if ((i7 >= i8 || ((c3 = this.f2524M[i7]) >= '0' && c3 <= '9')) && ((i7 < i8 || mo11585V0()) && (c = this.f2524M[i4]) >= '0' && c <= '9')) {
                if ((this.f2365g & f2515T) != 0) {
                    this.f2424t = (i4 = this.f2424t) + 1;
                    if (c == '0') {
                        while (true) {
                            if (this.f2424t >= this.f2425u && !mo11585V0()) {
                                break;
                            }
                            char[] cArr2 = this.f2524M;
                            int i9 = this.f2424t;
                            c = cArr2[i9];
                            if (c < '0' || c > '9') {
                                break;
                            }
                            this.f2424t = i9 + 1;
                            if (c != '0') {
                                break;
                            }
                        }
                    }
                } else {
                    throw new C1520f(this, C0843a.m451l("Invalid numeric value: ", "Leading zeroes not allowed"));
                }
            }
            c = '0';
        }
        int i10 = 0;
        while (true) {
            if (c >= '0' && c <= '9') {
                i10++;
                if (i2 >= g.length) {
                    g = this.f2413C.mo11705j();
                    i2 = 0;
                }
                int i11 = i2 + 1;
                g[i2] = c;
                if (this.f2424t >= this.f2425u && !mo11585V0()) {
                    c = 0;
                    i2 = i11;
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.f2524M;
                int i12 = this.f2424t;
                this.f2424t = i12 + 1;
                c = cArr3[i12];
                i2 = i11;
            } else {
                z2 = false;
            }
        }
        if (i10 == 0) {
            return mo11584U0(c, z);
        }
        if (c == '.') {
            if (i2 >= g.length) {
                g = this.f2413C.mo11705j();
                i2 = 0;
            }
            g[i2] = c;
            int i13 = i2 + 1;
            i3 = 0;
            while (true) {
                if (this.f2424t >= this.f2425u && !mo11585V0()) {
                    z2 = true;
                    break;
                }
                char[] cArr4 = this.f2524M;
                int i14 = this.f2424t;
                this.f2424t = i14 + 1;
                c = cArr4[i14];
                if (c < '0' || c > '9') {
                    break;
                }
                i3++;
                if (i2 >= g.length) {
                    g = this.f2413C.mo11705j();
                    i2 = 0;
                }
                g[i2] = c;
                i13 = i2 + 1;
            }
            if (i3 == 0) {
                mo11527E0(c, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            i3 = 0;
        }
        if (c == 'e' || c == 'E') {
            if (i2 >= g.length) {
                g = this.f2413C.mo11705j();
            } else {
                i5 = i2;
            }
            int i15 = i5 + 1;
            g[i5] = c;
            int i16 = this.f2424t;
            if (i16 < this.f2425u) {
                char[] cArr5 = this.f2524M;
                this.f2424t = i16 + 1;
                c2 = cArr5[i16];
            } else {
                c2 = mo11601l1("expected a digit for number exponent", (C1525j) null);
            }
            if (c2 == '-' || c2 == '+') {
                if (i15 >= g.length) {
                    g = this.f2413C.mo11705j();
                    i15 = 0;
                }
                int i17 = i15 + 1;
                g[i15] = c2;
                int i18 = this.f2424t;
                if (i18 < this.f2425u) {
                    char[] cArr6 = this.f2524M;
                    this.f2424t = i18 + 1;
                    l1 = cArr6[i18];
                } else {
                    l1 = mo11601l1("expected a digit for number exponent", (C1525j) null);
                }
                i15 = i17;
            }
            int i19 = 0;
            char c4 = c2;
            while (true) {
                if (c > '9' || c < '0') {
                    break;
                }
                i19++;
                if (i15 >= g.length) {
                    g = this.f2413C.mo11705j();
                    i15 = 0;
                }
                int i20 = i15 + 1;
                g[i15] = c;
                if (this.f2424t >= this.f2425u && !mo11585V0()) {
                    i15 = i20;
                    z2 = true;
                    break;
                }
                char[] cArr7 = this.f2524M;
                int i21 = this.f2424t;
                this.f2424t = i21 + 1;
                c4 = cArr7[i21];
                i15 = i20;
            }
            i5 = i19;
            if (i5 == 0) {
                mo11527E0(c, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this.f2424t--;
            if (this.f2411A.mo11506d()) {
                mo11600k1(c);
            }
        }
        this.f2413C.f2637i = i2;
        if (i3 >= 1 || i5 >= 1) {
            this.f2420J = z;
            this.f2421K = i10;
            this.f2414D = 0;
            return C1525j.VALUE_NUMBER_FLOAT;
        }
        this.f2420J = z;
        this.f2421K = i10;
        this.f2414D = 0;
        return C1525j.VALUE_NUMBER_INT;
    }

    /* renamed from: a1 */
    public void mo11590a1(String str) {
        mo11591b1(str, mo11518M0());
        throw null;
    }

    /* renamed from: b1 */
    public void mo11591b1(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.f2424t >= this.f2425u && !mo11585V0()) {
                break;
            }
            char c = this.f2524M[this.f2424t];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.f2424t++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        mo11531t0("Unrecognized token '%s': was expecting %s", sb, str2);
        throw null;
    }

    /* renamed from: c1 */
    public final int mo11592c1() {
        char c;
        while (true) {
            if (this.f2424t < this.f2425u || mo11585V0()) {
                char[] cArr = this.f2524M;
                int i = this.f2424t;
                int i2 = i + 1;
                this.f2424t = i2;
                c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        mo11595f1();
                    } else if (c != '#' || !mo11598i1()) {
                        return c;
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this.f2427w++;
                    this.f2428x = i2;
                } else if (c == 13) {
                    mo11593d1();
                } else if (c != 9) {
                    mo11537z0(c);
                    throw null;
                }
            } else {
                StringBuilder u = C0843a.m460u("Unexpected end-of-input within/between ");
                u.append(this.f2411A.mo11507e());
                u.append(" entries");
                throw new C1520f(this, u.toString());
            }
        }
        return c;
    }

    /* renamed from: d1 */
    public final void mo11593d1() {
        if (this.f2424t < this.f2425u || mo11585V0()) {
            char[] cArr = this.f2524M;
            int i = this.f2424t;
            if (cArr[i] == 10) {
                this.f2424t = i + 1;
            }
        }
        this.f2427w++;
        this.f2428x = this.f2424t;
    }

    /* renamed from: e */
    public C1519e mo11494e() {
        return new C1519e(mo11512G0(), -1, ((long) this.f2424t) + this.f2426v, this.f2427w, (this.f2424t - this.f2428x) + 1);
    }

    /* renamed from: e1 */
    public final int mo11594e1(boolean z) {
        while (true) {
            if (this.f2424t < this.f2425u || mo11585V0()) {
                char[] cArr = this.f2524M;
                int i = this.f2424t;
                int i2 = i + 1;
                this.f2424t = i2;
                char c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        mo11595f1();
                    } else if (c != '#' || !mo11598i1()) {
                        if (z) {
                            return c;
                        }
                        if (c == ':') {
                            z = true;
                        } else {
                            mo11535x0(c, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this.f2427w++;
                    this.f2428x = i2;
                } else if (c == 13) {
                    mo11593d1();
                } else if (c != 9) {
                    mo11537z0(c);
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

    /* renamed from: f0 */
    public final String mo11495f0() {
        C1525j jVar = this.f2440h;
        if (jVar == C1525j.VALUE_STRING) {
            if (this.f2528Q) {
                this.f2528Q = false;
                int i = this.f2424t;
                int i2 = this.f2425u;
                if (i < i2) {
                    int[] iArr = f2522a0;
                    int length = iArr.length;
                    while (true) {
                        char[] cArr = this.f2524M;
                        char c = cArr[i];
                        if (c >= length || iArr[c] == 0) {
                            i++;
                            if (i >= i2) {
                                break;
                            }
                        } else if (c == '\"') {
                            C1568h hVar = this.f2413C;
                            int i3 = this.f2424t;
                            hVar.mo11710o(cArr, i3, i - i3);
                            this.f2424t = i + 1;
                        }
                    }
                }
                C1568h hVar2 = this.f2413C;
                char[] cArr2 = this.f2524M;
                int i4 = this.f2424t;
                int i5 = i - i4;
                hVar2.f2630b = null;
                hVar2.f2631c = -1;
                hVar2.f2632d = 0;
                hVar2.f2638j = null;
                hVar2.f2639k = null;
                if (hVar2.f2634f) {
                    hVar2.mo11697b();
                } else if (hVar2.f2636h == null) {
                    hVar2.f2636h = hVar2.mo11696a(i5);
                }
                hVar2.f2635g = 0;
                hVar2.f2637i = 0;
                if (hVar2.f2631c >= 0) {
                    hVar2.mo11712q(i5);
                }
                hVar2.f2638j = null;
                hVar2.f2639k = null;
                char[] cArr3 = hVar2.f2636h;
                int length2 = cArr3.length;
                int i6 = hVar2.f2637i;
                int i7 = length2 - i6;
                if (i7 >= i5) {
                    System.arraycopy(cArr2, i4, cArr3, i6, i5);
                    hVar2.f2637i += i5;
                } else {
                    if (i7 > 0) {
                        System.arraycopy(cArr2, i4, cArr3, i6, i7);
                        i4 += i7;
                        i5 -= i7;
                    }
                    do {
                        hVar2.mo11703h();
                        int min = Math.min(hVar2.f2636h.length, i5);
                        System.arraycopy(cArr2, i4, hVar2.f2636h, 0, min);
                        hVar2.f2637i += min;
                        i4 += min;
                        i5 -= min;
                    } while (i5 > 0);
                }
                this.f2424t = i;
                char[] k = this.f2413C.mo11706k();
                int i8 = this.f2413C.f2637i;
                int[] iArr2 = f2522a0;
                int length3 = iArr2.length;
                while (true) {
                    if (this.f2424t < this.f2425u || mo11585V0()) {
                        char[] cArr4 = this.f2524M;
                        int i9 = this.f2424t;
                        this.f2424t = i9 + 1;
                        char c2 = cArr4[i9];
                        if (c2 < length3 && iArr2[c2] != 0) {
                            if (c2 == '\"') {
                                this.f2413C.f2637i = i8;
                                break;
                            } else if (c2 == '\\') {
                                c2 = mo11583T0();
                            } else if (c2 < ' ') {
                                mo11517L0(c2, "string value");
                            }
                        }
                        if (i8 >= k.length) {
                            k = this.f2413C.mo11705j();
                            i8 = 0;
                        }
                        k[i8] = c2;
                        i8++;
                    } else {
                        mo11533v0(": was expecting closing quote for a string value", C1525j.VALUE_STRING);
                        throw null;
                    }
                }
            }
            return this.f2413C.mo11701f();
        } else if (jVar == null) {
            return null;
        } else {
            int i10 = jVar.f2403j;
            if (i10 == 5) {
                return this.f2411A.f2506f;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                return this.f2413C.mo11701f();
            }
            return jVar.f2400g;
        }
    }

    /* renamed from: f1 */
    public final void mo11595f1() {
        if ((this.f2365g & f2520Y) == 0) {
            mo11535x0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this.f2424t < this.f2425u || mo11585V0()) {
            char[] cArr = this.f2524M;
            int i = this.f2424t;
            this.f2424t = i + 1;
            char c = cArr[i];
            if (c == '/') {
                mo11596g1();
            } else if (c == '*') {
                while (true) {
                    if (this.f2424t >= this.f2425u && !mo11585V0()) {
                        break;
                    }
                    char[] cArr2 = this.f2524M;
                    int i2 = this.f2424t;
                    int i3 = i2 + 1;
                    this.f2424t = i3;
                    char c2 = cArr2[i2];
                    if (c2 <= '*') {
                        if (c2 == '*') {
                            if (i3 >= this.f2425u && !mo11585V0()) {
                                break;
                            }
                            char[] cArr3 = this.f2524M;
                            int i4 = this.f2424t;
                            if (cArr3[i4] == '/') {
                                this.f2424t = i4 + 1;
                                return;
                            }
                        } else if (c2 >= ' ') {
                            continue;
                        } else if (c2 == 10) {
                            this.f2427w++;
                            this.f2428x = i3;
                        } else if (c2 == 13) {
                            mo11593d1();
                        } else if (c2 != 9) {
                            mo11537z0(c2);
                            throw null;
                        }
                    }
                }
                mo11533v0(" in a comment", (C1525j) null);
                throw null;
            } else {
                mo11535x0(c, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            mo11533v0(" in a comment", (C1525j) null);
            throw null;
        }
    }

    /* renamed from: g1 */
    public final void mo11596g1() {
        while (true) {
            if (this.f2424t < this.f2425u || mo11585V0()) {
                char[] cArr = this.f2524M;
                int i = this.f2424t;
                int i2 = i + 1;
                this.f2424t = i2;
                char c = cArr[i];
                if (c < ' ') {
                    if (c == 10) {
                        this.f2427w++;
                        this.f2428x = i2;
                        return;
                    } else if (c == 13) {
                        mo11593d1();
                        return;
                    } else if (c != 9) {
                        mo11537z0(c);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h1 */
    public final int mo11597h1() {
        char c;
        while (true) {
            if (this.f2424t < this.f2425u || mo11585V0()) {
                char[] cArr = this.f2524M;
                int i = this.f2424t;
                int i2 = i + 1;
                this.f2424t = i2;
                c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        mo11595f1();
                    } else if (c != '#' || !mo11598i1()) {
                        return c;
                    }
                } else if (c == ' ') {
                    continue;
                } else if (c == 10) {
                    this.f2427w++;
                    this.f2428x = i2;
                } else if (c == 13) {
                    mo11593d1();
                } else if (c != 9) {
                    mo11537z0(c);
                    throw null;
                }
            } else {
                mo11522p0();
                return -1;
            }
        }
        return c;
    }

    /* renamed from: i1 */
    public final boolean mo11598i1() {
        if ((this.f2365g & f2521Z) == 0) {
            return false;
        }
        mo11596g1();
        return true;
    }

    /* renamed from: j1 */
    public final void mo11599j1() {
        int i = this.f2424t;
        this.f2429y = this.f2427w;
        this.f2430z = i - this.f2428x;
    }

    /* renamed from: k1 */
    public final void mo11600k1(int i) {
        int i2 = this.f2424t + 1;
        this.f2424t = i2;
        if (i == 9) {
            return;
        }
        if (i == 10) {
            this.f2427w++;
            this.f2428x = i2;
        } else if (i == 13) {
            mo11593d1();
        } else if (i != 32) {
            mo11535x0(i, "Expected space separating root-level values");
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v36, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: char} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0197, code lost:
        r12 = r14.mo11592c1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a7, code lost:
        if (r12 == 125) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0207, code lost:
        r10 = r3.f2424t;
        r3.f2424t = r6;
        r6 = r3.mo11588Y0(r10, r9, 34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0327, code lost:
        if (r9 != '#') goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x033b, code lost:
        if (r6 != '#') goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x035a, code lost:
        if (r9 != '#') goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x035d, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0370, code lost:
        if (r6 != '#') goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x03f1, code lost:
        if (r12 != 44) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x047a, code lost:
        if (r3.f2411A.mo11504b() == false) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        r20 = r4;
        r4 = r3;
        r3 = null;
        r11 = 10;
        r10 = 13;
        r9 = '/';
        r8 = ' ';
        r7 = '#';
        r6 = r5;
        r5 = r20;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r6v16, types: [char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r6v19, types: [char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r9v15, types: [char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r9v17, types: [char] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x011b A[EDGE_INSN: B:422:0x011b->B:68:0x011b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x02e5 A[EDGE_INSN: B:448:0x02e5->B:175:0x02e5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0140  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p082j.p083a.p084a.C1525j mo11497l0() {
        /*
            r21 = this;
            r0 = r21
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
            boolean r2 = r0.f2528Q
            java.lang.String r4 = "string value"
            java.lang.String r5 = ": was expecting closing quote for a string value"
            r6 = 92
            r7 = 32
            r8 = 34
            if (r2 == 0) goto L_0x007f
            r0.f2528Q = r1
            int r1 = r0.f2424t
            int r2 = r0.f2425u
            char[] r9 = r0.f2524M
        L_0x0048:
            if (r1 < r2) goto L_0x005d
            r0.f2424t = r1
            boolean r1 = r21.mo11585V0()
            if (r1 == 0) goto L_0x0057
            int r1 = r0.f2424t
            int r2 = r0.f2425u
            goto L_0x005d
        L_0x0057:
            b.j.a.a.j r1 = p005b.p082j.p083a.p084a.C1525j.VALUE_STRING
            r0.mo11533v0(r5, r1)
            throw r3
        L_0x005d:
            int r10 = r1 + 1
            char r1 = r9[r1]
            if (r1 > r6) goto L_0x007d
            if (r1 != r6) goto L_0x006f
            r0.f2424t = r10
            r21.mo11583T0()
            int r1 = r0.f2424t
            int r2 = r0.f2425u
            goto L_0x0048
        L_0x006f:
            if (r1 > r8) goto L_0x007d
            if (r1 != r8) goto L_0x0076
            r0.f2424t = r10
            goto L_0x007f
        L_0x0076:
            if (r1 >= r7) goto L_0x007d
            r0.f2424t = r10
            r0.mo11517L0(r1, r4)
        L_0x007d:
            r1 = r10
            goto L_0x0048
        L_0x007f:
            int r1 = r0.f2424t
            int r2 = r0.f2425u
            r6 = 35
            r8 = 47
            r9 = 13
            r10 = 10
            r11 = 9
            r12 = -1
            r13 = 1
            if (r1 < r2) goto L_0x00a0
            boolean r1 = r21.mo11585V0()
            if (r1 != 0) goto L_0x00a0
            r21.mo11522p0()
            r14 = r0
            r1 = r3
            r2 = r12
        L_0x009d:
            r3 = r14
            goto L_0x0138
        L_0x00a0:
            char[] r1 = r0.f2524M
            int r2 = r0.f2424t
            int r14 = r2 + 1
            r0.f2424t = r14
            char r1 = r1[r2]
            if (r1 <= r7) goto L_0x00c5
            if (r1 == r8) goto L_0x00b6
            if (r1 != r6) goto L_0x00b1
            goto L_0x00b6
        L_0x00b1:
            r14 = r0
            r2 = r12
            r12 = r1
            r1 = r3
            goto L_0x009d
        L_0x00b6:
            int r14 = r14 + r12
            r0.f2424t = r14
            r1 = r0
            r2 = r1
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            goto L_0x0128
        L_0x00c5:
            if (r1 == r7) goto L_0x00de
            if (r1 != r10) goto L_0x00d1
            int r1 = r0.f2427w
            int r1 = r1 + r13
            r0.f2427w = r1
            r0.f2428x = r14
            goto L_0x00de
        L_0x00d1:
            if (r1 != r9) goto L_0x00d7
            r1 = r0
            r2 = r1
            r3 = r2
            goto L_0x010d
        L_0x00d7:
            if (r1 != r11) goto L_0x00da
            goto L_0x00de
        L_0x00da:
            r0.mo11537z0(r1)
            throw r3
        L_0x00de:
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x00e1:
            int r11 = r1.f2424t
            int r14 = r1.f2425u
            if (r11 >= r14) goto L_0x011b
            char[] r14 = r1.f2524M
            int r15 = r11 + 1
            r1.f2424t = r15
            char r11 = r14[r11]
            if (r11 <= r7) goto L_0x00ff
            if (r11 == r8) goto L_0x00fb
            if (r11 != r6) goto L_0x00f6
            goto L_0x00fb
        L_0x00f6:
            r1 = 0
            r14 = r2
            r2 = r12
            r12 = r11
            goto L_0x0138
        L_0x00fb:
            int r15 = r15 + r12
            r1.f2424t = r15
            goto L_0x011b
        L_0x00ff:
            if (r11 == r7) goto L_0x00e1
            if (r11 != r10) goto L_0x010b
            int r11 = r1.f2427w
            int r11 = r11 + r13
            r1.f2427w = r11
            r1.f2428x = r15
            goto L_0x00e1
        L_0x010b:
            if (r11 != r9) goto L_0x0111
        L_0x010d:
            r1.mo11593d1()
            goto L_0x00e1
        L_0x0111:
            r14 = 9
            if (r11 != r14) goto L_0x0116
            goto L_0x00e1
        L_0x0116:
            r1.mo11537z0(r11)
            r1 = 0
            throw r1
        L_0x011b:
            r11 = 0
            r20 = r4
            r4 = r3
            r3 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r20
        L_0x0128:
            int r1 = r1.mo11597h1()
            r14 = r2
            r2 = r12
            r12 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
        L_0x0138:
            if (r12 >= 0) goto L_0x0140
            r14.close()
            r3.f2440h = r1
            return r1
        L_0x0140:
            r1 = 93
            if (r12 == r1) goto L_0x068e
            r11 = 125(0x7d, float:1.75E-43)
            if (r12 != r11) goto L_0x014a
            goto L_0x068e
        L_0x014a:
            b.j.a.a.r.d r15 = r3.f2411A
            int r11 = r15.f2385b
            int r11 = r11 + r13
            r15.f2385b = r11
            int r15 = r15.f2384a
            if (r15 == 0) goto L_0x0159
            if (r11 <= 0) goto L_0x0159
            r11 = r13
            goto L_0x015a
        L_0x0159:
            r11 = 0
        L_0x015a:
            r15 = 44
            if (r11 == 0) goto L_0x01c8
            if (r12 != r15) goto L_0x01ab
        L_0x0160:
            int r11 = r3.f2424t
            int r12 = r3.f2425u
            if (r11 >= r12) goto L_0x0197
            char[] r12 = r3.f2524M
            int r15 = r11 + 1
            r3.f2424t = r15
            char r11 = r12[r11]
            if (r11 <= r7) goto L_0x017b
            if (r11 == r8) goto L_0x0177
            if (r11 != r6) goto L_0x0175
            goto L_0x0177
        L_0x0175:
            r12 = r11
            goto L_0x019c
        L_0x0177:
            int r15 = r15 + r2
            r3.f2424t = r15
            goto L_0x0197
        L_0x017b:
            if (r11 >= r7) goto L_0x0160
            if (r11 != r10) goto L_0x0187
            int r11 = r3.f2427w
            int r11 = r11 + r13
            r3.f2427w = r11
            r3.f2428x = r15
            goto L_0x0160
        L_0x0187:
            if (r11 != r9) goto L_0x018d
            r14.mo11593d1()
            goto L_0x0160
        L_0x018d:
            r12 = 9
            if (r11 != r12) goto L_0x0192
            goto L_0x0160
        L_0x0192:
            r3.mo11537z0(r11)
            r1 = 0
            throw r1
        L_0x0197:
            int r2 = r14.mo11592c1()
            r12 = r2
        L_0x019c:
            int r2 = r3.f2365g
            int r6 = f2514S
            r2 = r2 & r6
            if (r2 == 0) goto L_0x01c8
            if (r12 == r1) goto L_0x068e
            r1 = 125(0x7d, float:1.75E-43)
            if (r12 != r1) goto L_0x01c8
            goto L_0x068e
        L_0x01ab:
            java.lang.String r1 = "was expecting comma to separate "
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
            b.j.a.a.r.d r2 = r3.f2411A
            java.lang.String r2 = r2.mo11507e()
            r1.append(r2)
            java.lang.String r2 = " entries"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.mo11535x0(r12, r1)
            r1 = 0
            throw r1
        L_0x01c8:
            b.j.a.a.r.d r1 = r3.f2411A
            boolean r1 = r1.mo11505c()
            r2 = 39
            if (r1 == 0) goto L_0x03ab
            int r6 = r3.f2424t
            long r9 = (long) r6
            r3.f2529R = r9
            r9 = 34
            if (r12 != r9) goto L_0x0213
            int r9 = r3.f2527P
            int[] r10 = f2522a0
        L_0x01df:
            int r11 = r3.f2425u
            if (r6 >= r11) goto L_0x0207
            char[] r11 = r3.f2524M
            char r12 = r11[r6]
            int r15 = r10.length
            if (r12 >= r15) goto L_0x0201
            r15 = r10[r12]
            if (r15 == 0) goto L_0x0201
            r10 = 34
            if (r12 != r10) goto L_0x0207
            int r10 = r3.f2424t
            int r12 = r6 + 1
            r3.f2424t = r12
            b.j.a.a.s.b r12 = r3.f2526O
            int r6 = r6 - r10
            java.lang.String r6 = r12.mo11681c(r11, r10, r6, r9)
            goto L_0x02fb
        L_0x0201:
            int r9 = r9 * 33
            int r9 = r9 + r12
            int r6 = r6 + 1
            goto L_0x01df
        L_0x0207:
            int r10 = r3.f2424t
            r3.f2424t = r6
            r6 = 34
            java.lang.String r6 = r3.mo11588Y0(r10, r9, r6)
            goto L_0x02fb
        L_0x0213:
            if (r12 != r2) goto L_0x0256
            int r9 = r3.f2365g
            int r10 = f2518W
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0256
            int r9 = r3.f2527P
            int r10 = r3.f2425u
            if (r6 >= r10) goto L_0x024c
            int[] r11 = f2522a0
            int r12 = r11.length
        L_0x0225:
            char[] r15 = r3.f2524M
            char r0 = r15[r6]
            if (r0 != r2) goto L_0x023a
            int r0 = r3.f2424t
            int r10 = r6 + 1
            r3.f2424t = r10
            b.j.a.a.s.b r10 = r3.f2526O
            int r6 = r6 - r0
            java.lang.String r6 = r10.mo11681c(r15, r0, r6, r9)
            goto L_0x02fb
        L_0x023a:
            if (r0 >= r12) goto L_0x0241
            r15 = r11[r0]
            if (r15 == 0) goto L_0x0241
            goto L_0x024c
        L_0x0241:
            int r9 = r9 * 33
            int r9 = r9 + r0
            int r6 = r6 + 1
            if (r6 < r10) goto L_0x0249
            goto L_0x024c
        L_0x0249:
            r0 = r21
            goto L_0x0225
        L_0x024c:
            int r0 = r3.f2424t
            r3.f2424t = r6
            java.lang.String r6 = r3.mo11588Y0(r0, r9, r2)
            goto L_0x02fb
        L_0x0256:
            int r0 = r3.f2365g
            int r6 = f2519X
            r0 = r0 & r6
            if (r0 == 0) goto L_0x03a4
            int[] r0 = p005b.p082j.p083a.p084a.p087q.C1535a.f2445e
            int r6 = r0.length
            if (r12 >= r6) goto L_0x026a
            r9 = r0[r12]
            if (r9 != 0) goto L_0x0268
            r9 = r13
            goto L_0x026f
        L_0x0268:
            r9 = 0
            goto L_0x026f
        L_0x026a:
            char r9 = (char) r12
            boolean r9 = java.lang.Character.isJavaIdentifierPart(r9)
        L_0x026f:
            if (r9 == 0) goto L_0x039d
            int r9 = r3.f2424t
            int r10 = r3.f2527P
            int r11 = r3.f2425u
            if (r9 >= r11) goto L_0x02ad
        L_0x0279:
            char[] r12 = r3.f2524M
            char r15 = r12[r9]
            if (r15 >= r6) goto L_0x0290
            r16 = r0[r15]
            if (r16 == 0) goto L_0x02a6
            int r0 = r3.f2424t
            int r0 = r0 - r13
            r3.f2424t = r9
            b.j.a.a.s.b r6 = r3.f2526O
            int r9 = r9 - r0
            java.lang.String r6 = r6.mo11681c(r12, r0, r9, r10)
            goto L_0x02fb
        L_0x0290:
            char r12 = (char) r15
            boolean r12 = java.lang.Character.isJavaIdentifierPart(r12)
            if (r12 != 0) goto L_0x02a6
            int r0 = r3.f2424t
            int r0 = r0 - r13
            r3.f2424t = r9
            b.j.a.a.s.b r6 = r3.f2526O
            char[] r11 = r3.f2524M
            int r9 = r9 - r0
            java.lang.String r6 = r6.mo11681c(r11, r0, r9, r10)
            goto L_0x02fb
        L_0x02a6:
            int r10 = r10 * 33
            int r10 = r10 + r15
            int r9 = r9 + 1
            if (r9 < r11) goto L_0x0279
        L_0x02ad:
            int r6 = r3.f2424t
            int r6 = r6 - r13
            r3.f2424t = r9
            b.j.a.a.t.h r11 = r3.f2413C
            char[] r12 = r3.f2524M
            int r9 = r9 - r6
            r11.mo11710o(r12, r6, r9)
            b.j.a.a.t.h r6 = r3.f2413C
            char[] r6 = r6.mo11706k()
            b.j.a.a.t.h r9 = r3.f2413C
            int r9 = r9.f2637i
            int r11 = r0.length
        L_0x02c5:
            int r12 = r3.f2424t
            int r15 = r3.f2425u
            if (r12 < r15) goto L_0x02d2
            boolean r12 = r14.mo11585V0()
            if (r12 != 0) goto L_0x02d2
            goto L_0x02e5
        L_0x02d2:
            char[] r12 = r3.f2524M
            int r15 = r3.f2424t
            char r12 = r12[r15]
            if (r12 >= r11) goto L_0x02df
            r15 = r0[r12]
            if (r15 == 0) goto L_0x0382
            goto L_0x02e5
        L_0x02df:
            boolean r15 = java.lang.Character.isJavaIdentifierPart(r12)
            if (r15 != 0) goto L_0x0382
        L_0x02e5:
            b.j.a.a.t.h r0 = r3.f2413C
            r0.f2637i = r9
            char[] r6 = r0.mo11707l()
            int r9 = r0.mo11708m()
            int r0 = r0.mo11711p()
            b.j.a.a.s.b r11 = r3.f2526O
            java.lang.String r6 = r11.mo11681c(r6, r9, r0, r10)
        L_0x02fb:
            b.j.a.a.r.d r0 = r3.f2411A
            r0.mo11574j(r6)
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.FIELD_NAME
            r3.f2440h = r0
            int r0 = r3.f2424t
            int r6 = r0 + 4
            int r9 = r3.f2425u
            if (r6 < r9) goto L_0x0314
            r0 = 0
            int r0 = r3.mo11594e1(r0)
        L_0x0311:
            r12 = r0
            goto L_0x03ab
        L_0x0314:
            char[] r6 = r3.f2524M
            char r9 = r6[r0]
            r10 = 58
            if (r9 != r10) goto L_0x0340
            int r0 = r0 + r13
            r3.f2424t = r0
            char r9 = r6[r0]
            if (r9 <= r7) goto L_0x032a
            if (r9 == r8) goto L_0x0377
            r6 = 35
            if (r9 != r6) goto L_0x035d
            goto L_0x0377
        L_0x032a:
            if (r9 == r7) goto L_0x0330
            r10 = 9
            if (r9 != r10) goto L_0x0377
        L_0x0330:
            int r0 = r0 + r13
            r3.f2424t = r0
            char r6 = r6[r0]
            if (r6 <= r7) goto L_0x0377
            if (r6 == r8) goto L_0x0377
            r8 = 35
            if (r6 != r8) goto L_0x033e
            goto L_0x0377
        L_0x033e:
            r12 = r6
            goto L_0x0373
        L_0x0340:
            if (r9 == r7) goto L_0x0346
            r11 = 9
            if (r9 != r11) goto L_0x034b
        L_0x0346:
            int r0 = r0 + r13
            r3.f2424t = r0
            char r9 = r6[r0]
        L_0x034b:
            if (r9 != r10) goto L_0x037c
            int r0 = r3.f2424t
            int r0 = r0 + r13
            r3.f2424t = r0
            char r9 = r6[r0]
            if (r9 <= r7) goto L_0x035f
            if (r9 == r8) goto L_0x0377
            r6 = 35
            if (r9 != r6) goto L_0x035d
            goto L_0x0377
        L_0x035d:
            r12 = r9
            goto L_0x0373
        L_0x035f:
            if (r9 == r7) goto L_0x0365
            r10 = 9
            if (r9 != r10) goto L_0x0377
        L_0x0365:
            int r0 = r0 + r13
            r3.f2424t = r0
            char r6 = r6[r0]
            if (r6 <= r7) goto L_0x0377
            if (r6 == r8) goto L_0x0377
            r8 = 35
            if (r6 != r8) goto L_0x033e
            goto L_0x0377
        L_0x0373:
            int r0 = r0 + r13
            r3.f2424t = r0
            goto L_0x03ab
        L_0x0377:
            int r0 = r3.mo11594e1(r13)
            goto L_0x0311
        L_0x037c:
            r0 = 0
            int r12 = r3.mo11594e1(r0)
            goto L_0x03ab
        L_0x0382:
            int r8 = r3.f2424t
            int r8 = r8 + r13
            r3.f2424t = r8
            int r10 = r10 * 33
            int r10 = r10 + r12
            int r8 = r9 + 1
            r6[r9] = r12
            int r9 = r6.length
            if (r8 < r9) goto L_0x0398
            b.j.a.a.t.h r6 = r3.f2413C
            char[] r6 = r6.mo11705j()
            r8 = 0
        L_0x0398:
            r9 = r8
            r8 = 47
            goto L_0x02c5
        L_0x039d:
            java.lang.String r0 = "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"
            r3.mo11535x0(r12, r0)
            r0 = 0
            throw r0
        L_0x03a4:
            r0 = 0
            java.lang.String r1 = "was expecting double-quote to start field name"
            r3.mo11535x0(r12, r1)
            throw r0
        L_0x03ab:
            r14.mo11599j1()
            r0 = 34
            if (r12 == r0) goto L_0x0682
            r0 = 45
            r6 = 101(0x65, float:1.42E-43)
            r8 = 48
            r9 = 46
            r10 = 57
            if (r12 == r0) goto L_0x0619
            r0 = 91
            if (r12 == r0) goto L_0x0607
            r0 = 102(0x66, float:1.43E-43)
            r11 = 108(0x6c, float:1.51E-43)
            if (r12 == r0) goto L_0x05cd
            r0 = 110(0x6e, float:1.54E-43)
            r15 = 117(0x75, float:1.64E-43)
            if (r12 == r0) goto L_0x059c
            r0 = 116(0x74, float:1.63E-43)
            if (r12 == r0) goto L_0x0569
            r0 = 123(0x7b, float:1.72E-43)
            if (r12 == r0) goto L_0x0557
            r0 = 125(0x7d, float:1.75E-43)
            if (r12 == r0) goto L_0x0550
            switch(r12) {
                case 48: goto L_0x03f5;
                case 49: goto L_0x03f5;
                case 50: goto L_0x03f5;
                case 51: goto L_0x03f5;
                case 52: goto L_0x03f5;
                case 53: goto L_0x03f5;
                case 54: goto L_0x03f5;
                case 55: goto L_0x03f5;
                case 56: goto L_0x03f5;
                case 57: goto L_0x03f5;
                default: goto L_0x03dd;
            }
        L_0x03dd:
            if (r12 == r2) goto L_0x04c1
            r0 = 73
            if (r12 == r0) goto L_0x04a5
            r0 = 78
            if (r12 == r0) goto L_0x048e
            r0 = 93
            if (r12 == r0) goto L_0x0474
            r0 = 43
            if (r12 == r0) goto L_0x044f
            r0 = 44
            if (r12 == r0) goto L_0x047e
            goto L_0x051d
        L_0x03f5:
            int r0 = r3.f2424t
            int r2 = r0 + -1
            int r4 = r3.f2425u
            if (r12 != r8) goto L_0x03fe
            goto L_0x0402
        L_0x03fe:
            if (r0 < r4) goto L_0x0409
            r3.f2424t = r2
        L_0x0402:
            r0 = 0
            b.j.a.a.j r0 = r3.mo11589Z0(r0, r2)
            goto L_0x0686
        L_0x0409:
            char[] r5 = r3.f2524M
            int r7 = r0 + 1
            char r15 = r5[r0]
            if (r15 < r8) goto L_0x0418
            if (r15 <= r10) goto L_0x0414
            goto L_0x0418
        L_0x0414:
            int r13 = r13 + 1
            r0 = r7
            goto L_0x03fe
        L_0x0418:
            if (r15 == r9) goto L_0x043f
            if (r15 == r6) goto L_0x043f
            r0 = 69
            if (r15 != r0) goto L_0x0421
            goto L_0x043f
        L_0x0421:
            int r7 = r7 + -1
            r3.f2424t = r7
            b.j.a.a.r.d r0 = r3.f2411A
            boolean r0 = r0.mo11506d()
            if (r0 == 0) goto L_0x0430
            r3.mo11600k1(r15)
        L_0x0430:
            int r7 = r7 - r2
            b.j.a.a.t.h r0 = r3.f2413C
            char[] r4 = r3.f2524M
            r0.mo11710o(r4, r2, r7)
            r0 = 0
            b.j.a.a.j r0 = r3.mo11521Q0(r0, r13)
            goto L_0x0686
        L_0x043f:
            r3.f2424t = r7
            r18 = 0
            r16 = r2
            r17 = r7
            r19 = r13
            b.j.a.a.j r0 = r14.mo11587X0(r15, r16, r17, r18, r19)
            goto L_0x0686
        L_0x044f:
            int r0 = r3.f2424t
            int r2 = r3.f2425u
            if (r0 < r2) goto L_0x0463
            boolean r0 = r14.mo11585V0()
            if (r0 == 0) goto L_0x045c
            goto L_0x0463
        L_0x045c:
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.VALUE_NUMBER_INT
            r3.mo11534w0(r0)
            r0 = 0
            throw r0
        L_0x0463:
            char[] r0 = r3.f2524M
            int r2 = r3.f2424t
            int r4 = r2 + 1
            r3.f2424t = r4
            char r0 = r0[r2]
            r2 = 0
            b.j.a.a.j r0 = r3.mo11584U0(r0, r2)
            goto L_0x0686
        L_0x0474:
            b.j.a.a.r.d r0 = r3.f2411A
            boolean r0 = r0.mo11504b()
            if (r0 != 0) goto L_0x047e
            goto L_0x051d
        L_0x047e:
            int r0 = r3.f2365g
            int r2 = f2517V
            r0 = r0 & r2
            if (r0 == 0) goto L_0x051d
            int r0 = r3.f2424t
            int r0 = r0 - r13
            r3.f2424t = r0
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.VALUE_NULL
            goto L_0x0686
        L_0x048e:
            java.lang.String r0 = "NaN"
            r3.mo11586W0(r0, r13)
            int r2 = r3.f2365g
            int r4 = f2516U
            r2 = r2 & r4
            if (r2 == 0) goto L_0x049d
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x04b3
        L_0x049d:
            b.j.a.a.f r0 = new b.j.a.a.f
            java.lang.String r1 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r0.<init>(r3, r1)
            throw r0
        L_0x04a5:
            java.lang.String r0 = "Infinity"
            r3.mo11586W0(r0, r13)
            int r2 = r3.f2365g
            int r4 = f2516U
            r2 = r2 & r4
            if (r2 == 0) goto L_0x04b9
            r4 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
        L_0x04b3:
            b.j.a.a.j r0 = r3.mo11520P0(r0, r4)
            goto L_0x0686
        L_0x04b9:
            b.j.a.a.f r0 = new b.j.a.a.f
            java.lang.String r1 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r0.<init>(r3, r1)
            throw r0
        L_0x04c1:
            r0 = 0
            int r6 = r3.f2365g
            int r8 = f2518W
            r6 = r6 & r8
            if (r6 == 0) goto L_0x051d
            b.j.a.a.t.h r6 = r3.f2413C
            char[] r6 = r6.mo11702g()
            b.j.a.a.t.h r8 = r3.f2413C
            int r8 = r8.f2637i
        L_0x04d3:
            int r9 = r3.f2424t
            int r10 = r3.f2425u
            if (r9 < r10) goto L_0x04e7
            boolean r9 = r14.mo11585V0()
            if (r9 == 0) goto L_0x04e0
            goto L_0x04e7
        L_0x04e0:
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.VALUE_STRING
            r3.mo11533v0(r5, r0)
            r0 = 0
            throw r0
        L_0x04e7:
            char[] r9 = r3.f2524M
            int r10 = r3.f2424t
            int r11 = r10 + 1
            r3.f2424t = r11
            char r9 = r9[r10]
            r10 = 92
            if (r9 > r10) goto L_0x050d
            if (r9 != r10) goto L_0x04fc
            char r9 = r14.mo11583T0()
            goto L_0x050d
        L_0x04fc:
            if (r9 > r2) goto L_0x050d
            if (r9 != r2) goto L_0x0508
            b.j.a.a.t.h r0 = r3.f2413C
            r0.f2637i = r8
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.VALUE_STRING
            goto L_0x0686
        L_0x0508:
            if (r9 >= r7) goto L_0x050d
            r3.mo11517L0(r9, r4)
        L_0x050d:
            int r10 = r6.length
            if (r8 < r10) goto L_0x0517
            b.j.a.a.t.h r6 = r3.f2413C
            char[] r6 = r6.mo11705j()
            r8 = r0
        L_0x0517:
            int r10 = r8 + 1
            r6[r8] = r9
            r8 = r10
            goto L_0x04d3
        L_0x051d:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r12)
            if (r0 == 0) goto L_0x053a
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            char r1 = (char) r12
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r14.mo11518M0()
            r3.mo11591b1(r0, r1)
            r0 = 0
            throw r0
        L_0x053a:
            r0 = 0
            java.lang.String r1 = "expected a valid value "
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
            java.lang.String r2 = r14.mo11518M0()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.mo11535x0(r12, r1)
            throw r0
        L_0x0550:
            r0 = 0
            java.lang.String r1 = "expected a value"
            r3.mo11535x0(r12, r1)
            throw r0
        L_0x0557:
            if (r1 != 0) goto L_0x0565
            b.j.a.a.r.d r0 = r3.f2411A
            int r2 = r3.f2429y
            int r4 = r3.f2430z
            b.j.a.a.r.d r0 = r0.mo11572h(r2, r4)
            r3.f2411A = r0
        L_0x0565:
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.START_OBJECT
            goto L_0x0686
        L_0x0569:
            int r0 = r3.f2424t
            int r2 = r0 + 3
            int r4 = r3.f2425u
            if (r2 >= r4) goto L_0x0593
            char[] r2 = r3.f2524M
            char r4 = r2[r0]
            r5 = 114(0x72, float:1.6E-43)
            if (r4 != r5) goto L_0x0593
            int r0 = r0 + r13
            char r4 = r2[r0]
            if (r4 != r15) goto L_0x0593
            int r0 = r0 + r13
            char r4 = r2[r0]
            if (r4 != r6) goto L_0x0593
            int r0 = r0 + r13
            char r2 = r2[r0]
            if (r2 < r8) goto L_0x0590
            r4 = 93
            if (r2 == r4) goto L_0x0590
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 != r4) goto L_0x0593
        L_0x0590:
            r3.f2424t = r0
            goto L_0x0598
        L_0x0593:
            java.lang.String r0 = "true"
            r3.mo11586W0(r0, r13)
        L_0x0598:
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.VALUE_TRUE
            goto L_0x0686
        L_0x059c:
            int r0 = r3.f2424t
            int r2 = r0 + 3
            int r4 = r3.f2425u
            if (r2 >= r4) goto L_0x05c4
            char[] r2 = r3.f2524M
            char r4 = r2[r0]
            if (r4 != r15) goto L_0x05c4
            int r0 = r0 + r13
            char r4 = r2[r0]
            if (r4 != r11) goto L_0x05c4
            int r0 = r0 + r13
            char r4 = r2[r0]
            if (r4 != r11) goto L_0x05c4
            int r0 = r0 + r13
            char r2 = r2[r0]
            if (r2 < r8) goto L_0x05c1
            r4 = 93
            if (r2 == r4) goto L_0x05c1
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 != r4) goto L_0x05c4
        L_0x05c1:
            r3.f2424t = r0
            goto L_0x05c9
        L_0x05c4:
            java.lang.String r0 = "null"
            r3.mo11586W0(r0, r13)
        L_0x05c9:
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.VALUE_NULL
            goto L_0x0686
        L_0x05cd:
            int r0 = r3.f2424t
            int r2 = r0 + 4
            int r4 = r3.f2425u
            if (r2 >= r4) goto L_0x05fe
            char[] r2 = r3.f2524M
            char r4 = r2[r0]
            r5 = 97
            if (r4 != r5) goto L_0x05fe
            int r0 = r0 + r13
            char r4 = r2[r0]
            if (r4 != r11) goto L_0x05fe
            int r0 = r0 + r13
            char r4 = r2[r0]
            r5 = 115(0x73, float:1.61E-43)
            if (r4 != r5) goto L_0x05fe
            int r0 = r0 + r13
            char r4 = r2[r0]
            if (r4 != r6) goto L_0x05fe
            int r0 = r0 + r13
            char r2 = r2[r0]
            if (r2 < r8) goto L_0x05fb
            r4 = 93
            if (r2 == r4) goto L_0x05fb
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 != r4) goto L_0x05fe
        L_0x05fb:
            r3.f2424t = r0
            goto L_0x0603
        L_0x05fe:
            java.lang.String r0 = "false"
            r3.mo11586W0(r0, r13)
        L_0x0603:
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.VALUE_FALSE
            goto L_0x0686
        L_0x0607:
            if (r1 != 0) goto L_0x0615
            b.j.a.a.r.d r0 = r3.f2411A
            int r2 = r3.f2429y
            int r4 = r3.f2430z
            b.j.a.a.r.d r0 = r0.mo11571g(r2, r4)
            r3.f2411A = r0
        L_0x0615:
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.START_ARRAY
            goto L_0x0686
        L_0x0619:
            int r0 = r3.f2424t
            int r2 = r0 + -1
            int r4 = r3.f2425u
            if (r0 < r4) goto L_0x0622
            goto L_0x0633
        L_0x0622:
            char[] r5 = r3.f2524M
            int r7 = r0 + 1
            char r0 = r5[r0]
            if (r0 > r10) goto L_0x067b
            if (r0 >= r8) goto L_0x062d
            goto L_0x067b
        L_0x062d:
            if (r0 != r8) goto L_0x0630
            goto L_0x0633
        L_0x0630:
            r0 = r13
        L_0x0631:
            if (r7 < r4) goto L_0x0638
        L_0x0633:
            b.j.a.a.j r0 = r3.mo11589Z0(r13, r2)
            goto L_0x0686
        L_0x0638:
            char[] r5 = r3.f2524M
            int r11 = r7 + 1
            char r15 = r5[r7]
            if (r15 < r8) goto L_0x0647
            if (r15 <= r10) goto L_0x0643
            goto L_0x0647
        L_0x0643:
            int r0 = r0 + 1
            r7 = r11
            goto L_0x0631
        L_0x0647:
            if (r15 == r9) goto L_0x066c
            if (r15 == r6) goto L_0x066c
            r4 = 69
            if (r15 != r4) goto L_0x0650
            goto L_0x066c
        L_0x0650:
            int r11 = r11 + -1
            r3.f2424t = r11
            b.j.a.a.r.d r4 = r3.f2411A
            boolean r4 = r4.mo11506d()
            if (r4 == 0) goto L_0x065f
            r3.mo11600k1(r15)
        L_0x065f:
            int r11 = r11 - r2
            b.j.a.a.t.h r4 = r3.f2413C
            char[] r5 = r3.f2524M
            r4.mo11710o(r5, r2, r11)
            b.j.a.a.j r0 = r3.mo11521Q0(r13, r0)
            goto L_0x0686
        L_0x066c:
            r3.f2424t = r11
            r18 = 1
            r16 = r2
            r17 = r11
            r19 = r0
            b.j.a.a.j r0 = r14.mo11587X0(r15, r16, r17, r18, r19)
            goto L_0x0686
        L_0x067b:
            r3.f2424t = r7
            b.j.a.a.j r0 = r3.mo11584U0(r0, r13)
            goto L_0x0686
        L_0x0682:
            r3.f2528Q = r13
            b.j.a.a.j r0 = p005b.p082j.p083a.p084a.C1525j.VALUE_STRING
        L_0x0686:
            if (r1 == 0) goto L_0x068b
            r3.f2412B = r0
            goto L_0x0691
        L_0x068b:
            r3.f2440h = r0
            return r0
        L_0x068e:
            r3.mo11582S0(r12)
        L_0x0691:
            b.j.a.a.j r0 = r3.f2440h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p082j.p083a.p084a.p088r.C1551f.mo11497l0():b.j.a.a.j");
    }

    /* renamed from: l1 */
    public char mo11601l1(String str, C1525j jVar) {
        if (this.f2424t < this.f2425u || mo11585V0()) {
            char[] cArr = this.f2524M;
            int i = this.f2424t;
            this.f2424t = i + 1;
            return cArr[i];
        }
        mo11533v0(str, jVar);
        throw null;
    }

    public C1551f(C1537b bVar, int i, Reader reader, C1526k kVar, C1556b bVar2, char[] cArr, int i2, int i3, boolean z) {
        super(bVar, i);
        this.f2523L = null;
        this.f2524M = cArr;
        this.f2424t = i2;
        this.f2425u = i3;
        this.f2526O = bVar2;
        this.f2527P = bVar2.f2585c;
        this.f2525N = z;
    }
}
