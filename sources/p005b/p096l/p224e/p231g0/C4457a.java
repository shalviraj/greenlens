package p005b.p096l.p224e.p231g0;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p224e.p226e0.C4370q;

/* renamed from: b.l.e.g0.a */
public class C4457a implements Closeable {

    /* renamed from: v */
    public static final char[] f8252v = ")]}'\n".toCharArray();

    /* renamed from: g */
    public final Reader f8253g;

    /* renamed from: h */
    public boolean f8254h = false;

    /* renamed from: i */
    public final char[] f8255i = new char[1024];

    /* renamed from: j */
    public int f8256j = 0;

    /* renamed from: k */
    public int f8257k = 0;

    /* renamed from: l */
    public int f8258l = 0;

    /* renamed from: m */
    public int f8259m = 0;

    /* renamed from: n */
    public int f8260n = 0;

    /* renamed from: o */
    public long f8261o;

    /* renamed from: p */
    public int f8262p;

    /* renamed from: q */
    public String f8263q;

    /* renamed from: r */
    public int[] f8264r;

    /* renamed from: s */
    public int f8265s;

    /* renamed from: t */
    public String[] f8266t;

    /* renamed from: u */
    public int[] f8267u;

    /* renamed from: b.l.e.g0.a$a */
    public class C4458a extends C4370q {
    }

    static {
        C4370q.f8086a = new C4458a();
    }

    public C4457a(Reader reader) {
        int[] iArr = new int[32];
        this.f8264r = iArr;
        this.f8265s = 0;
        this.f8265s = 0 + 1;
        iArr[0] = 6;
        this.f8266t = new String[32];
        this.f8267u = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f8253g = reader;
    }

    /* renamed from: A0 */
    public final void mo16095A0() {
        char c;
        do {
            if (this.f8256j < this.f8257k || mo16097O(1)) {
                char[] cArr = this.f8255i;
                int i = this.f8256j;
                int i2 = i + 1;
                this.f8256j = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f8258l++;
                    this.f8259m = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* renamed from: B0 */
    public void mo16040B0() {
        int i;
        char c;
        int i2 = 0;
        do {
            int i3 = this.f8260n;
            if (i3 == 0) {
                i3 = mo16106z();
            }
            if (i3 == 3) {
                mo16104x0(1);
            } else if (i3 == 1) {
                mo16104x0(3);
            } else if (i3 == 4 || i3 == 2) {
                this.f8265s--;
                i2--;
                this.f8260n = 0;
            } else if (i3 == 14 || i3 == 10) {
                while (true) {
                    i = 0;
                    while (true) {
                        int i4 = this.f8256j + i;
                        if (i4 < this.f8257k) {
                            char c2 = this.f8255i[i4];
                            if (!(c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ')) {
                                if (c2 != '#') {
                                    if (c2 != ',') {
                                        if (!(c2 == '/' || c2 == '=')) {
                                            if (!(c2 == '{' || c2 == '}' || c2 == ':')) {
                                                if (c2 != ';') {
                                                    switch (c2) {
                                                        case '[':
                                                        case ']':
                                                            break;
                                                        case '\\':
                                                            break;
                                                        default:
                                                            i++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f8256j = i4;
                            if (!mo16097O(1)) {
                            }
                        }
                    }
                }
                mo16100q();
                this.f8256j += i;
                this.f8260n = 0;
            } else {
                if (i3 == 8 || i3 == 12) {
                    c = '\'';
                } else if (i3 == 9 || i3 == 13) {
                    c = '\"';
                } else {
                    if (i3 == 16) {
                        this.f8256j += this.f8262p;
                    }
                    this.f8260n = 0;
                }
                mo16107z0(c);
                this.f8260n = 0;
            }
            i2++;
            this.f8260n = 0;
        } while (i2 != 0);
        int[] iArr = this.f8267u;
        int i5 = this.f8265s;
        int i6 = i5 - 1;
        iArr[i6] = iArr[i6] + 1;
        this.f8266t[i5 - 1] = "null";
    }

    /* renamed from: C0 */
    public final IOException mo16096C0(String str) {
        StringBuilder u = C0843a.m460u(str);
        u.append(mo16099h0());
        throw new C4461d(u.toString());
    }

    /* renamed from: H */
    public void mo16045H() {
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        if (i == 4) {
            int i2 = this.f8265s - 1;
            this.f8265s = i2;
            int[] iArr = this.f8267u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f8260n = 0;
            return;
        }
        StringBuilder u = C0843a.m460u("Expected END_ARRAY but was ");
        u.append(mo16060w0());
        u.append(mo16099h0());
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: N */
    public void mo16046N() {
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        if (i == 2) {
            int i2 = this.f8265s - 1;
            this.f8265s = i2;
            this.f8266t[i2] = null;
            int[] iArr = this.f8267u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f8260n = 0;
            return;
        }
        StringBuilder u = C0843a.m460u("Expected END_OBJECT but was ");
        u.append(mo16060w0());
        u.append(mo16099h0());
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: O */
    public final boolean mo16097O(int i) {
        int i2;
        int i3;
        char[] cArr = this.f8255i;
        int i4 = this.f8259m;
        int i5 = this.f8256j;
        this.f8259m = i4 - i5;
        int i6 = this.f8257k;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f8257k = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f8257k = 0;
        }
        this.f8256j = 0;
        do {
            Reader reader = this.f8253g;
            int i8 = this.f8257k;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f8257k + read;
            this.f8257k = i2;
            if (this.f8258l == 0 && (i3 = this.f8259m) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f8256j++;
                this.f8259m = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: S */
    public String mo16047S() {
        StringBuilder t = C0843a.m459t('$');
        int i = this.f8265s;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f8264r[i2];
            if (i3 == 1 || i3 == 2) {
                t.append('[');
                t.append(this.f8267u[i2]);
                t.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                t.append('.');
                String[] strArr = this.f8266t;
                if (strArr[i2] != null) {
                    t.append(strArr[i2]);
                }
            }
        }
        return t.toString();
    }

    /* renamed from: Z */
    public boolean mo16048Z() {
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public void close() {
        this.f8260n = 0;
        this.f8264r[0] = 8;
        this.f8265s = 1;
        this.f8253g.close();
    }

    /* renamed from: d */
    public void mo16050d() {
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        if (i == 3) {
            mo16104x0(1);
            this.f8267u[this.f8265s - 1] = 0;
            this.f8260n = 0;
            return;
        }
        StringBuilder u = C0843a.m460u("Expected BEGIN_ARRAY but was ");
        u.append(mo16060w0());
        u.append(mo16099h0());
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: e */
    public void mo16051e() {
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        if (i == 1) {
            mo16104x0(3);
            this.f8260n = 0;
            return;
        }
        StringBuilder u = C0843a.m460u("Expected BEGIN_OBJECT but was ");
        u.append(mo16060w0());
        u.append(mo16099h0());
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: f0 */
    public final boolean mo16098f0(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo16100q();
        return false;
    }

    /* renamed from: h0 */
    public String mo16099h0() {
        StringBuilder x = C0843a.m463x(" at line ", this.f8258l + 1, " column ", (this.f8256j - this.f8259m) + 1, " path ");
        x.append(mo16047S());
        return x.toString();
    }

    /* renamed from: l0 */
    public boolean mo16052l0() {
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        if (i == 5) {
            this.f8260n = 0;
            int[] iArr = this.f8267u;
            int i2 = this.f8265s - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f8260n = 0;
            int[] iArr2 = this.f8267u;
            int i3 = this.f8265s - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder u = C0843a.m460u("Expected a boolean but was ");
            u.append(mo16060w0());
            u.append(mo16099h0());
            throw new IllegalStateException(u.toString());
        }
    }

    /* renamed from: n0 */
    public double mo16053n0() {
        String str;
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        if (i == 15) {
            this.f8260n = 0;
            int[] iArr = this.f8267u;
            int i2 = this.f8265s - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f8261o;
        }
        if (i == 16) {
            this.f8263q = new String(this.f8255i, this.f8256j, this.f8262p);
            this.f8256j += this.f8262p;
        } else {
            if (i == 8 || i == 9) {
                str = mo16102t0(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                str = mo16103v0();
            } else if (i != 11) {
                StringBuilder u = C0843a.m460u("Expected a double but was ");
                u.append(mo16060w0());
                u.append(mo16099h0());
                throw new IllegalStateException(u.toString());
            }
            this.f8263q = str;
        }
        this.f8260n = 11;
        double parseDouble = Double.parseDouble(this.f8263q);
        if (this.f8254h || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f8263q = null;
            this.f8260n = 0;
            int[] iArr2 = this.f8267u;
            int i3 = this.f8265s - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new C4461d("JSON forbids NaN and infinities: " + parseDouble + mo16099h0());
    }

    /* renamed from: o0 */
    public int mo16054o0() {
        String str;
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        if (i == 15) {
            long j = this.f8261o;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f8260n = 0;
                int[] iArr = this.f8267u;
                int i3 = this.f8265s - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder u = C0843a.m460u("Expected an int but was ");
            u.append(this.f8261o);
            u.append(mo16099h0());
            throw new NumberFormatException(u.toString());
        }
        if (i == 16) {
            this.f8263q = new String(this.f8255i, this.f8256j, this.f8262p);
            this.f8256j += this.f8262p;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                str = mo16103v0();
            } else {
                str = mo16102t0(i == 8 ? '\'' : '\"');
            }
            this.f8263q = str;
            try {
                int parseInt = Integer.parseInt(this.f8263q);
                this.f8260n = 0;
                int[] iArr2 = this.f8267u;
                int i4 = this.f8265s - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder u2 = C0843a.m460u("Expected an int but was ");
            u2.append(mo16060w0());
            u2.append(mo16099h0());
            throw new IllegalStateException(u2.toString());
        }
        this.f8260n = 11;
        double parseDouble = Double.parseDouble(this.f8263q);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f8263q = null;
            this.f8260n = 0;
            int[] iArr3 = this.f8267u;
            int i6 = this.f8265s - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder u3 = C0843a.m460u("Expected an int but was ");
        u3.append(this.f8263q);
        u3.append(mo16099h0());
        throw new NumberFormatException(u3.toString());
    }

    /* renamed from: p0 */
    public long mo16055p0() {
        String str;
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        if (i == 15) {
            this.f8260n = 0;
            int[] iArr = this.f8267u;
            int i2 = this.f8265s - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f8261o;
        }
        if (i == 16) {
            this.f8263q = new String(this.f8255i, this.f8256j, this.f8262p);
            this.f8256j += this.f8262p;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                str = mo16103v0();
            } else {
                str = mo16102t0(i == 8 ? '\'' : '\"');
            }
            this.f8263q = str;
            try {
                long parseLong = Long.parseLong(this.f8263q);
                this.f8260n = 0;
                int[] iArr2 = this.f8267u;
                int i3 = this.f8265s - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder u = C0843a.m460u("Expected a long but was ");
            u.append(mo16060w0());
            u.append(mo16099h0());
            throw new IllegalStateException(u.toString());
        }
        this.f8260n = 11;
        double parseDouble = Double.parseDouble(this.f8263q);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f8263q = null;
            this.f8260n = 0;
            int[] iArr3 = this.f8267u;
            int i4 = this.f8265s - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder u2 = C0843a.m460u("Expected a long but was ");
        u2.append(this.f8263q);
        u2.append(mo16099h0());
        throw new NumberFormatException(u2.toString());
    }

    /* renamed from: q */
    public final void mo16100q() {
        if (!this.f8254h) {
            mo16096C0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: q0 */
    public String mo16056q0() {
        String str;
        char c;
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        if (i == 14) {
            str = mo16103v0();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                StringBuilder u = C0843a.m460u("Expected a name but was ");
                u.append(mo16060w0());
                u.append(mo16099h0());
                throw new IllegalStateException(u.toString());
            }
            str = mo16102t0(c);
        }
        this.f8260n = 0;
        this.f8266t[this.f8265s - 1] = str;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1 != '/') goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r9.f8256j = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r4 != r2) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r9.f8256j = r4 - 1;
        r2 = mo16097O(2);
        r9.f8256j++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r2 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        mo16100q();
        r2 = r9.f8256j;
        r4 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r4 == '*') goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r4 == '/') goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        r9.f8256j = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        r9.f8256j = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if ((r9.f8256j + 2) <= r9.f8257k) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (mo16097O(2) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r1 = r9.f8255i;
        r2 = r9.f8256j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        if (r1[r2] != 10) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        r9.f8258l++;
        r9.f8259m = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r4 >= 2) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r9.f8255i[r9.f8256j + r4] == "*/".charAt(r4)) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r9.f8256j++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        if (r3 == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        mo16096C0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r9.f8256j = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ce, code lost:
        if (r1 != '#') goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        mo16100q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        return r1;
     */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16101r0(boolean r10) {
        /*
            r9 = this;
            char[] r0 = r9.f8255i
        L_0x0002:
            int r1 = r9.f8256j
        L_0x0004:
            int r2 = r9.f8257k
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0030
            r9.f8256j = r1
            boolean r1 = r9.mo16097O(r3)
            if (r1 != 0) goto L_0x002c
            if (r10 != 0) goto L_0x0015
            r10 = -1
            return r10
        L_0x0015:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            java.lang.String r1 = r9.mo16099h0()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x002c:
            int r1 = r9.f8256j
            int r2 = r9.f8257k
        L_0x0030:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0041
            int r1 = r9.f8258l
            int r1 = r1 + r3
            r9.f8258l = r1
            r9.f8259m = r4
            goto L_0x00d9
        L_0x0041:
            r6 = 32
            if (r1 == r6) goto L_0x00d9
            r6 = 13
            if (r1 == r6) goto L_0x00d9
            r6 = 9
            if (r1 != r6) goto L_0x004f
            goto L_0x00d9
        L_0x004f:
            r6 = 47
            if (r1 != r6) goto L_0x00ca
            r9.f8256j = r4
            r7 = 2
            if (r4 != r2) goto L_0x0068
            int r4 = r4 + -1
            r9.f8256j = r4
            boolean r2 = r9.mo16097O(r7)
            int r4 = r9.f8256j
            int r4 = r4 + r3
            r9.f8256j = r4
            if (r2 != 0) goto L_0x0068
            return r1
        L_0x0068:
            r9.mo16100q()
            int r2 = r9.f8256j
            char r4 = r0[r2]
            r8 = 42
            if (r4 == r8) goto L_0x007b
            if (r4 == r6) goto L_0x0076
            return r1
        L_0x0076:
            int r2 = r2 + 1
            r9.f8256j = r2
            goto L_0x00d3
        L_0x007b:
            int r2 = r2 + 1
            r9.f8256j = r2
        L_0x007f:
            int r1 = r9.f8256j
            int r1 = r1 + r7
            int r2 = r9.f8257k
            r4 = 0
            if (r1 <= r2) goto L_0x0090
            boolean r1 = r9.mo16097O(r7)
            if (r1 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r3 = r4
            goto L_0x00bc
        L_0x0090:
            char[] r1 = r9.f8255i
            int r2 = r9.f8256j
            char r1 = r1[r2]
            if (r1 != r5) goto L_0x00a2
            int r1 = r9.f8258l
            int r1 = r1 + r3
            r9.f8258l = r1
            int r2 = r2 + 1
            r9.f8259m = r2
            goto L_0x00b3
        L_0x00a2:
            if (r4 >= r7) goto L_0x00bc
            char[] r1 = r9.f8255i
            int r2 = r9.f8256j
            int r2 = r2 + r4
            char r1 = r1[r2]
            java.lang.String r2 = "*/"
            char r2 = r2.charAt(r4)
            if (r1 == r2) goto L_0x00b9
        L_0x00b3:
            int r1 = r9.f8256j
            int r1 = r1 + r3
            r9.f8256j = r1
            goto L_0x007f
        L_0x00b9:
            int r4 = r4 + 1
            goto L_0x00a2
        L_0x00bc:
            if (r3 == 0) goto L_0x00c3
            int r1 = r9.f8256j
            int r1 = r1 + r7
            goto L_0x0004
        L_0x00c3:
            java.lang.String r10 = "Unterminated comment"
            r9.mo16096C0(r10)
            r10 = 0
            throw r10
        L_0x00ca:
            r2 = 35
            r9.f8256j = r4
            if (r1 != r2) goto L_0x00d8
            r9.mo16100q()
        L_0x00d3:
            r9.mo16095A0()
            goto L_0x0002
        L_0x00d8:
            return r1
        L_0x00d9:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p224e.p231g0.C4457a.mo16101r0(boolean):int");
    }

    /* renamed from: s0 */
    public void mo16057s0() {
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        if (i == 7) {
            this.f8260n = 0;
            int[] iArr = this.f8267u;
            int i2 = this.f8265s - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder u = C0843a.m460u("Expected null but was ");
        u.append(mo16060w0());
        u.append(mo16099h0());
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: t0 */
    public final String mo16102t0(char c) {
        char[] cArr = this.f8255i;
        StringBuilder sb = null;
        while (true) {
            int i = this.f8256j;
            int i2 = this.f8257k;
            int i3 = i;
            while (true) {
                if (i < i2) {
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f8256j = i4;
                        int i5 = (i4 - i3) - 1;
                        if (sb == null) {
                            return new String(cArr, i3, i5);
                        }
                        sb.append(cArr, i3, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f8256j = i4;
                        int i6 = (i4 - i3) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i3, i6);
                        sb.append(mo16105y0());
                    } else {
                        if (c2 == 10) {
                            this.f8258l++;
                            this.f8259m = i4;
                        }
                        i = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i3) * 2, 16));
                    }
                    sb.append(cArr, i3, i - i3);
                    this.f8256j = i;
                    if (!mo16097O(1)) {
                        mo16096C0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + mo16099h0();
    }

    /* renamed from: u0 */
    public String mo16059u0() {
        String str;
        char c;
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        if (i == 10) {
            str = mo16103v0();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                str = this.f8263q;
                this.f8263q = null;
            } else if (i == 15) {
                str = Long.toString(this.f8261o);
            } else if (i == 16) {
                str = new String(this.f8255i, this.f8256j, this.f8262p);
                this.f8256j += this.f8262p;
            } else {
                StringBuilder u = C0843a.m460u("Expected a string but was ");
                u.append(mo16060w0());
                u.append(mo16099h0());
                throw new IllegalStateException(u.toString());
            }
            str = mo16102t0(c);
        }
        this.f8260n = 0;
        int[] iArr = this.f8267u;
        int i2 = this.f8265s - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        mo16100q();
     */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo16103v0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r0
        L_0x0003:
            int r3 = r6.f8256j
            int r4 = r3 + r2
            int r5 = r6.f8257k
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f8255i
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.mo16100q()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f8255i
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.mo16097O(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f8255i
            int r4 = r6.f8256j
            r1.append(r3, r4, r2)
            int r3 = r6.f8256j
            int r3 = r3 + r2
            r6.f8256j = r3
            r2 = 1
            boolean r2 = r6.mo16097O(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f8255i
            int r3 = r6.f8256j
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f8255i
            int r3 = r6.f8256j
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f8256j
            int r2 = r2 + r0
            r6.f8256j = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p224e.p231g0.C4457a.mo16103v0():java.lang.String");
    }

    /* renamed from: w0 */
    public C4459b mo16060w0() {
        int i = this.f8260n;
        if (i == 0) {
            i = mo16106z();
        }
        switch (i) {
            case 1:
                return C4459b.BEGIN_OBJECT;
            case 2:
                return C4459b.END_OBJECT;
            case 3:
                return C4459b.BEGIN_ARRAY;
            case 4:
                return C4459b.END_ARRAY;
            case 5:
            case 6:
                return C4459b.BOOLEAN;
            case 7:
                return C4459b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C4459b.STRING;
            case 12:
            case 13:
            case 14:
                return C4459b.NAME;
            case 15:
            case 16:
                return C4459b.NUMBER;
            case 17:
                return C4459b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: x0 */
    public final void mo16104x0(int i) {
        int i2 = this.f8265s;
        int[] iArr = this.f8264r;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f8264r = Arrays.copyOf(iArr, i3);
            this.f8267u = Arrays.copyOf(this.f8267u, i3);
            this.f8266t = (String[]) Arrays.copyOf(this.f8266t, i3);
        }
        int[] iArr2 = this.f8264r;
        int i4 = this.f8265s;
        this.f8265s = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: y0 */
    public final char mo16105y0() {
        int i;
        int i2;
        if (this.f8256j != this.f8257k || mo16097O(1)) {
            char[] cArr = this.f8255i;
            int i3 = this.f8256j;
            int i4 = i3 + 1;
            this.f8256j = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f8258l++;
                this.f8259m = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
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
                    mo16096C0("Invalid escape sequence");
                    throw null;
                } else if (i4 + 4 <= this.f8257k || mo16097O(4)) {
                    char c2 = 0;
                    int i5 = this.f8256j;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.f8255i[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i2 = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                StringBuilder u = C0843a.m460u("\\u");
                                u.append(new String(this.f8255i, this.f8256j, 4));
                                throw new NumberFormatException(u.toString());
                            } else {
                                i2 = c3 - 'A';
                            }
                            i = i2 + 10;
                        } else {
                            i = c3 - '0';
                        }
                        c2 = (char) (i + c4);
                        i5++;
                    }
                    this.f8256j += 4;
                    return c2;
                } else {
                    mo16096C0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c;
        }
        mo16096C0("Unterminated escape sequence");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01f8, code lost:
        if (r9 == 6) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0210, code lost:
        if (mo16098f0(r6) != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0212, code lost:
        if (r9 != 2) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0214, code lost:
        if (r15 == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x021a, code lost:
        if (r11 != Long.MIN_VALUE) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x021c, code lost:
        if (r16 == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0220, code lost:
        if (r11 != 0) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0222, code lost:
        if (r16 != false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0224, code lost:
        if (r16 == false) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0227, code lost:
        r11 = -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0228, code lost:
        r0.f8261o = r11;
        r0.f8256j += r19;
        r1 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0233, code lost:
        if (r9 == 2) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0236, code lost:
        if (r9 == 4) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0239, code lost:
        if (r9 != 7) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x023b, code lost:
        r0.f8262p = r19;
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0241, code lost:
        r6 = r1;
        r0.f8260n = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0174 A[RETURN] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo16106z() {
        /*
            r20 = this;
            r0 = r20
            int[] r1 = r0.f8264r
            int r2 = r0.f8265s
            int r3 = r2 + -1
            r3 = r1[r3]
            r7 = 93
            r8 = 59
            r9 = 44
            r10 = 3
            r11 = 6
            r12 = 7
            r13 = 5
            r14 = 2
            r15 = 0
            r5 = 4
            r6 = 0
            r4 = 1
            if (r3 != r4) goto L_0x0020
            int r2 = r2 - r4
            r1[r2] = r14
            goto L_0x00d1
        L_0x0020:
            if (r3 != r14) goto L_0x003a
            int r1 = r0.mo16101r0(r4)
            if (r1 == r9) goto L_0x00d1
            if (r1 == r8) goto L_0x0035
            if (r1 != r7) goto L_0x002f
            r0.f8260n = r5
            return r5
        L_0x002f:
            java.lang.String r1 = "Unterminated array"
            r0.mo16096C0(r1)
            throw r15
        L_0x0035:
            r20.mo16100q()
            goto L_0x00d1
        L_0x003a:
            if (r3 == r10) goto L_0x02c2
            if (r3 != r13) goto L_0x0040
            goto L_0x02c2
        L_0x0040:
            if (r3 != r5) goto L_0x0074
            int r2 = r2 - r4
            r1[r2] = r13
            int r1 = r0.mo16101r0(r4)
            r2 = 58
            if (r1 == r2) goto L_0x00d1
            r2 = 61
            if (r1 != r2) goto L_0x006e
            r20.mo16100q()
            int r1 = r0.f8256j
            int r2 = r0.f8257k
            if (r1 < r2) goto L_0x0060
            boolean r1 = r0.mo16097O(r4)
            if (r1 == 0) goto L_0x00d1
        L_0x0060:
            char[] r1 = r0.f8255i
            int r2 = r0.f8256j
            char r1 = r1[r2]
            r5 = 62
            if (r1 != r5) goto L_0x00d1
            int r2 = r2 + r4
            r0.f8256j = r2
            goto L_0x00d1
        L_0x006e:
            java.lang.String r1 = "Expected ':'"
            r0.mo16096C0(r1)
            throw r15
        L_0x0074:
            if (r3 != r11) goto L_0x00b6
            boolean r1 = r0.f8254h
            if (r1 == 0) goto L_0x00ae
            r0.mo16101r0(r4)
            int r1 = r0.f8256j
            int r1 = r1 - r4
            r0.f8256j = r1
            char[] r2 = f8252v
            int r5 = r2.length
            int r1 = r1 + r5
            int r5 = r0.f8257k
            if (r1 <= r5) goto L_0x0092
            int r1 = r2.length
            boolean r1 = r0.mo16097O(r1)
            if (r1 != 0) goto L_0x0092
            goto L_0x00ae
        L_0x0092:
            r1 = r6
        L_0x0093:
            char[] r2 = f8252v
            int r5 = r2.length
            if (r1 >= r5) goto L_0x00a8
            char[] r5 = r0.f8255i
            int r15 = r0.f8256j
            int r15 = r15 + r1
            char r5 = r5[r15]
            char r2 = r2[r1]
            if (r5 == r2) goto L_0x00a4
            goto L_0x00ae
        L_0x00a4:
            int r1 = r1 + 1
            r15 = 0
            goto L_0x0093
        L_0x00a8:
            int r1 = r0.f8256j
            int r2 = r2.length
            int r1 = r1 + r2
            r0.f8256j = r1
        L_0x00ae:
            int[] r1 = r0.f8264r
            int r2 = r0.f8265s
            int r2 = r2 - r4
            r1[r2] = r12
            goto L_0x00d1
        L_0x00b6:
            if (r3 != r12) goto L_0x00cd
            int r1 = r0.mo16101r0(r6)
            r2 = -1
            if (r1 != r2) goto L_0x00c4
            r1 = 17
        L_0x00c1:
            r0.f8260n = r1
            return r1
        L_0x00c4:
            r20.mo16100q()
            int r1 = r0.f8256j
            int r1 = r1 - r4
            r0.f8256j = r1
            goto L_0x00d1
        L_0x00cd:
            r1 = 8
            if (r3 == r1) goto L_0x02ba
        L_0x00d1:
            int r1 = r0.mo16101r0(r4)
            r2 = 34
            if (r1 == r2) goto L_0x02b6
            r2 = 39
            if (r1 == r2) goto L_0x02af
            if (r1 == r9) goto L_0x0297
            if (r1 == r8) goto L_0x0297
            r2 = 91
            if (r1 == r2) goto L_0x0294
            if (r1 == r7) goto L_0x028d
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x028a
            int r1 = r0.f8256j
            int r1 = r1 - r4
            r0.f8256j = r1
            char[] r2 = r0.f8255i
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x011a
            r2 = 84
            if (r1 != r2) goto L_0x00fd
            goto L_0x011a
        L_0x00fd:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0114
            r2 = 70
            if (r1 != r2) goto L_0x0106
            goto L_0x0114
        L_0x0106:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x010e
            r2 = 78
            if (r1 != r2) goto L_0x0169
        L_0x010e:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r3 = r12
            goto L_0x011f
        L_0x0114:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r3 = r11
            goto L_0x011f
        L_0x011a:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r3 = r13
        L_0x011f:
            int r5 = r1.length()
            r7 = r4
        L_0x0124:
            if (r7 >= r5) goto L_0x014d
            int r8 = r0.f8256j
            int r8 = r8 + r7
            int r9 = r0.f8257k
            if (r8 < r9) goto L_0x0136
            int r8 = r7 + 1
            boolean r8 = r0.mo16097O(r8)
            if (r8 != 0) goto L_0x0136
            goto L_0x0169
        L_0x0136:
            char[] r8 = r0.f8255i
            int r9 = r0.f8256j
            int r9 = r9 + r7
            char r8 = r8[r9]
            char r9 = r1.charAt(r7)
            if (r8 == r9) goto L_0x014a
            char r9 = r2.charAt(r7)
            if (r8 == r9) goto L_0x014a
            goto L_0x0169
        L_0x014a:
            int r7 = r7 + 1
            goto L_0x0124
        L_0x014d:
            int r1 = r0.f8256j
            int r1 = r1 + r5
            int r2 = r0.f8257k
            if (r1 < r2) goto L_0x015c
            int r1 = r5 + 1
            boolean r1 = r0.mo16097O(r1)
            if (r1 == 0) goto L_0x016b
        L_0x015c:
            char[] r1 = r0.f8255i
            int r2 = r0.f8256j
            int r2 = r2 + r5
            char r1 = r1[r2]
            boolean r1 = r0.mo16098f0(r1)
            if (r1 == 0) goto L_0x016b
        L_0x0169:
            r3 = r6
            goto L_0x0172
        L_0x016b:
            int r1 = r0.f8256j
            int r1 = r1 + r5
            r0.f8256j = r1
            r0.f8260n = r3
        L_0x0172:
            if (r3 == 0) goto L_0x0175
            return r3
        L_0x0175:
            char[] r1 = r0.f8255i
            int r2 = r0.f8256j
            int r3 = r0.f8257k
            r7 = 0
            r15 = r4
            r5 = r6
            r9 = r5
            r16 = r9
            r11 = r7
        L_0x0183:
            int r6 = r2 + r5
            if (r6 != r3) goto L_0x019d
            int r2 = r1.length
            if (r5 != r2) goto L_0x018d
        L_0x018a:
            r6 = 0
            goto L_0x026d
        L_0x018d:
            int r2 = r5 + 1
            boolean r2 = r0.mo16097O(r2)
            if (r2 != 0) goto L_0x0199
            r19 = r5
            goto L_0x0212
        L_0x0199:
            int r2 = r0.f8256j
            int r3 = r0.f8257k
        L_0x019d:
            int r6 = r2 + r5
            char r6 = r1[r6]
            r13 = 43
            if (r6 == r13) goto L_0x0261
            r13 = 69
            if (r6 == r13) goto L_0x0257
            r13 = 101(0x65, float:1.42E-43)
            if (r6 == r13) goto L_0x0257
            r13 = 45
            if (r6 == r13) goto L_0x024b
            r13 = 46
            if (r6 == r13) goto L_0x0245
            r13 = 48
            if (r6 < r13) goto L_0x020a
            r13 = 57
            if (r6 <= r13) goto L_0x01be
            goto L_0x020a
        L_0x01be:
            if (r9 == r4) goto L_0x01fe
            if (r9 != 0) goto L_0x01c3
            goto L_0x01fe
        L_0x01c3:
            if (r9 != r14) goto L_0x01ed
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x01ca
            goto L_0x018a
        L_0x01ca:
            r17 = 10
            long r17 = r17 * r11
            int r6 = r6 + -48
            r19 = r5
            long r4 = (long) r6
            long r17 = r17 - r4
            r4 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x01e7
            if (r4 != 0) goto L_0x01e5
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r4 = 0
            goto L_0x01e8
        L_0x01e7:
            r4 = 1
        L_0x01e8:
            r15 = r15 & r4
            r11 = r17
            r4 = 6
            goto L_0x0206
        L_0x01ed:
            r19 = r5
            if (r9 != r10) goto L_0x01f4
            r4 = 6
            r9 = 4
            goto L_0x0206
        L_0x01f4:
            r4 = 5
            if (r9 == r4) goto L_0x01fb
            r4 = 6
            if (r9 != r4) goto L_0x0206
            goto L_0x01fc
        L_0x01fb:
            r4 = 6
        L_0x01fc:
            r9 = 7
            goto L_0x0206
        L_0x01fe:
            r19 = r5
            r4 = 6
            int r6 = r6 + -48
            int r5 = -r6
            long r11 = (long) r5
            r9 = r14
        L_0x0206:
            r6 = r19
            goto L_0x0267
        L_0x020a:
            r19 = r5
            boolean r1 = r0.mo16098f0(r6)
            if (r1 != 0) goto L_0x018a
        L_0x0212:
            if (r9 != r14) goto L_0x0233
            if (r15 == 0) goto L_0x0233
            r1 = -9223372036854775808
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x021e
            if (r16 == 0) goto L_0x0233
        L_0x021e:
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0224
            if (r16 != 0) goto L_0x0233
        L_0x0224:
            if (r16 == 0) goto L_0x0227
            goto L_0x0228
        L_0x0227:
            long r11 = -r11
        L_0x0228:
            r0.f8261o = r11
            int r1 = r0.f8256j
            int r1 = r1 + r19
            r0.f8256j = r1
            r1 = 15
            goto L_0x0241
        L_0x0233:
            if (r9 == r14) goto L_0x023b
            r1 = 4
            if (r9 == r1) goto L_0x023b
            r1 = 7
            if (r9 != r1) goto L_0x018a
        L_0x023b:
            r6 = r19
            r0.f8262p = r6
            r1 = 16
        L_0x0241:
            r6 = r1
            r0.f8260n = r6
            goto L_0x026d
        L_0x0245:
            r6 = r5
            r4 = 6
            if (r9 != r14) goto L_0x018a
            r4 = r10
            goto L_0x0266
        L_0x024b:
            r6 = r5
            r4 = 6
            if (r9 != 0) goto L_0x0253
            r9 = 1
            r16 = 1
            goto L_0x0267
        L_0x0253:
            r5 = 5
            if (r9 != r5) goto L_0x018a
            goto L_0x0266
        L_0x0257:
            r6 = r5
            r4 = 6
            r5 = 5
            if (r9 == r14) goto L_0x025f
            r4 = 4
            if (r9 != r4) goto L_0x018a
        L_0x025f:
            r9 = r5
            goto L_0x0267
        L_0x0261:
            r6 = r5
            r5 = 5
            if (r9 != r5) goto L_0x018a
            r4 = 6
        L_0x0266:
            r9 = r4
        L_0x0267:
            int r5 = r6 + 1
            r4 = 1
            r13 = 5
            goto L_0x0183
        L_0x026d:
            if (r6 == 0) goto L_0x0270
            return r6
        L_0x0270:
            char[] r1 = r0.f8255i
            int r2 = r0.f8256j
            char r1 = r1[r2]
            boolean r1 = r0.mo16098f0(r1)
            if (r1 == 0) goto L_0x0283
            r20.mo16100q()
            r1 = 10
            goto L_0x00c1
        L_0x0283:
            java.lang.String r1 = "Expected value"
            r0.mo16096C0(r1)
            r1 = 0
            throw r1
        L_0x028a:
            r1 = r4
            goto L_0x00c1
        L_0x028d:
            r1 = r4
            if (r3 != r1) goto L_0x0298
            r2 = 4
            r0.f8260n = r2
            return r2
        L_0x0294:
            r0.f8260n = r10
            return r10
        L_0x0297:
            r1 = r4
        L_0x0298:
            if (r3 == r1) goto L_0x02a4
            if (r3 != r14) goto L_0x029d
            goto L_0x02a4
        L_0x029d:
            java.lang.String r1 = "Unexpected value"
            r0.mo16096C0(r1)
            r1 = 0
            throw r1
        L_0x02a4:
            r20.mo16100q()
            int r2 = r0.f8256j
            int r2 = r2 - r1
            r0.f8256j = r2
            r1 = 7
            goto L_0x00c1
        L_0x02af:
            r20.mo16100q()
            r1 = 8
            goto L_0x00c1
        L_0x02b6:
            r1 = 9
            goto L_0x00c1
        L_0x02ba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02c2:
            int r2 = r2 - r4
            r5 = 4
            r1[r2] = r5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 5
            if (r3 != r2) goto L_0x02e4
            int r2 = r0.mo16101r0(r4)
            if (r2 == r9) goto L_0x02e2
            if (r2 == r8) goto L_0x02df
            if (r2 != r1) goto L_0x02d8
            r0.f8260n = r14
            return r14
        L_0x02d8:
            java.lang.String r1 = "Unterminated object"
            r0.mo16096C0(r1)
            r1 = 0
            throw r1
        L_0x02df:
            r20.mo16100q()
        L_0x02e2:
            r2 = 1
            goto L_0x02e5
        L_0x02e4:
            r2 = r4
        L_0x02e5:
            int r4 = r0.mo16101r0(r2)
            r5 = 34
            if (r4 == r5) goto L_0x031f
            r5 = 39
            if (r4 == r5) goto L_0x0318
            java.lang.String r5 = "Expected name"
            if (r4 == r1) goto L_0x030d
            r20.mo16100q()
            int r1 = r0.f8256j
            int r1 = r1 - r2
            r0.f8256j = r1
            char r1 = (char) r4
            boolean r1 = r0.mo16098f0(r1)
            if (r1 == 0) goto L_0x0308
            r1 = 14
            goto L_0x00c1
        L_0x0308:
            r0.mo16096C0(r5)
            r1 = 0
            throw r1
        L_0x030d:
            r1 = 0
            r2 = 5
            if (r3 == r2) goto L_0x0314
            r0.f8260n = r14
            return r14
        L_0x0314:
            r0.mo16096C0(r5)
            throw r1
        L_0x0318:
            r20.mo16100q()
            r1 = 12
            goto L_0x00c1
        L_0x031f:
            r1 = 13
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p224e.p231g0.C4457a.mo16106z():int");
    }

    /* renamed from: z0 */
    public final void mo16107z0(char c) {
        char[] cArr = this.f8255i;
        while (true) {
            int i = this.f8256j;
            int i2 = this.f8257k;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f8256j = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f8256j = i3;
                        mo16105y0();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f8258l++;
                            this.f8259m = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f8256j = i;
                    if (!mo16097O(1)) {
                        mo16096C0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }
}
