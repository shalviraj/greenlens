package p005b.p280p.p281a;

import java.io.IOException;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p435n.C8042f;

/* renamed from: b.p.a.s */
public final class C5085s extends C5087u {

    /* renamed from: o */
    public static final String[] f9826o = new String[128];

    /* renamed from: m */
    public final C8042f f9827m;

    /* renamed from: n */
    public String f9828n;

    static {
        for (int i = 0; i <= 31; i++) {
            f9826o[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f9826o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C5085s(C8042f fVar) {
        Objects.requireNonNull(fVar, "sink == null");
        this.f9827m = fVar;
        mo16886f0(6);
    }

    /* renamed from: t0 */
    public static void m9322t0(C8042f fVar, String str) {
        String str2;
        String[] strArr = f9826o;
        fVar.mo25887E(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                fVar.mo25916m(str, i, i2);
            }
            fVar.mo25905e0(str2);
            i = i2 + 1;
        }
        if (i < length) {
            fVar.mo25916m(str, i, length);
        }
        fVar.mo25887E(34);
    }

    /* renamed from: H */
    public C5087u mo16864H() {
        this.f9835k = false;
        mo16877r0(3, 5, '}');
        return this;
    }

    /* renamed from: O */
    public C5087u mo16865O(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f9831g != 0) {
            int Z = mo16885Z();
            if ((Z == 3 || Z == 5) && this.f9828n == null && !this.f9835k) {
                this.f9828n = str;
                this.f9833i[this.f9831g - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: S */
    public C5087u mo16866S() {
        if (this.f9835k) {
            StringBuilder u = C0843a.m460u("null cannot be used as a map key in JSON at path ");
            u.append(mo16884N());
            throw new IllegalStateException(u.toString());
        } else if (this.f9828n != null) {
            this.f9828n = null;
            return this;
        } else {
            mo16876q0();
            this.f9827m.mo25905e0("null");
            int[] iArr = this.f9834j;
            int i = this.f9831g - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    public void close() {
        this.f9827m.close();
        int i = this.f9831g;
        if (i > 1 || (i == 1 && this.f9832h[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f9831g = 0;
    }

    /* renamed from: d */
    public C5087u mo16868d() {
        if (!this.f9835k) {
            mo16879u0();
            mo16878s0(1, 2, '[');
            return this;
        }
        StringBuilder u = C0843a.m460u("Array cannot be used as a map key in JSON at path ");
        u.append(mo16884N());
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: e */
    public C5087u mo16869e() {
        if (!this.f9835k) {
            mo16879u0();
            mo16878s0(3, 5, '{');
            return this;
        }
        StringBuilder u = C0843a.m460u("Object cannot be used as a map key in JSON at path ");
        u.append(mo16884N());
        throw new IllegalStateException(u.toString());
    }

    public void flush() {
        if (this.f9831g != 0) {
            this.f9827m.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: h0 */
    public C5087u mo16871h0(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f9835k) {
            this.f9835k = false;
            mo16865O(Double.toString(d));
            return this;
        } else {
            mo16879u0();
            mo16876q0();
            this.f9827m.mo25905e0(Double.toString(d));
            int[] iArr = this.f9834j;
            int i = this.f9831g - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: l0 */
    public C5087u mo16872l0(long j) {
        if (this.f9835k) {
            this.f9835k = false;
            mo16865O(Long.toString(j));
            return this;
        }
        mo16879u0();
        mo16876q0();
        this.f9827m.mo25905e0(Long.toString(j));
        int[] iArr = this.f9834j;
        int i = this.f9831g - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: n0 */
    public C5087u mo16873n0(Number number) {
        String obj = number.toString();
        if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f9835k) {
            this.f9835k = false;
            mo16865O(obj);
            return this;
        } else {
            mo16879u0();
            mo16876q0();
            this.f9827m.mo25905e0(obj);
            int[] iArr = this.f9834j;
            int i = this.f9831g - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: o0 */
    public C5087u mo16874o0(String str) {
        if (str == null) {
            mo16866S();
            return this;
        } else if (this.f9835k) {
            this.f9835k = false;
            mo16865O(str);
            return this;
        } else {
            mo16879u0();
            mo16876q0();
            m9322t0(this.f9827m, str);
            int[] iArr = this.f9834j;
            int i = this.f9831g - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: p0 */
    public C5087u mo16875p0(boolean z) {
        if (!this.f9835k) {
            mo16879u0();
            mo16876q0();
            this.f9827m.mo25905e0(z ? "true" : "false");
            int[] iArr = this.f9834j;
            int i = this.f9831g - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder u = C0843a.m460u("Boolean cannot be used as a map key in JSON at path ");
        u.append(mo16884N());
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: q0 */
    public final void mo16876q0() {
        int Z = mo16885Z();
        int i = 7;
        if (Z != 1) {
            if (Z != 2) {
                if (Z == 4) {
                    i = 5;
                    this.f9827m.mo25905e0(":");
                } else if (Z == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else if (Z != 6) {
                    if (Z == 7) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                    throw new IllegalStateException("Nesting problem.");
                }
                this.f9832h[this.f9831g - 1] = i;
            }
            this.f9827m.mo25887E(44);
        }
        i = 2;
        this.f9832h[this.f9831g - 1] = i;
    }

    /* renamed from: r0 */
    public final C5087u mo16877r0(int i, int i2, char c) {
        int Z = mo16885Z();
        if (Z != i2 && Z != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f9828n == null) {
            int i3 = this.f9831g;
            int i4 = this.f9836l;
            if (i3 == (~i4)) {
                this.f9836l = ~i4;
                return this;
            }
            int i5 = i3 - 1;
            this.f9831g = i5;
            this.f9833i[i5] = null;
            int[] iArr = this.f9834j;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            this.f9827m.mo25887E(c);
            return this;
        } else {
            StringBuilder u = C0843a.m460u("Dangling name: ");
            u.append(this.f9828n);
            throw new IllegalStateException(u.toString());
        }
    }

    /* renamed from: s0 */
    public final C5087u mo16878s0(int i, int i2, char c) {
        int i3 = this.f9831g;
        int i4 = this.f9836l;
        if (i3 == i4) {
            int[] iArr = this.f9832h;
            if (iArr[i3 - 1] == i || iArr[i3 - 1] == i2) {
                this.f9836l = ~i4;
                return this;
            }
        }
        mo16876q0();
        mo16887q();
        int[] iArr2 = this.f9832h;
        int i5 = this.f9831g;
        int i6 = i5 + 1;
        this.f9831g = i6;
        iArr2[i5] = i;
        this.f9834j[i6 - 1] = 0;
        this.f9827m.mo25887E(c);
        return this;
    }

    /* renamed from: u0 */
    public final void mo16879u0() {
        if (this.f9828n != null) {
            int Z = mo16885Z();
            if (Z == 5) {
                this.f9827m.mo25887E(44);
            } else if (Z != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f9832h[this.f9831g - 1] = 4;
            m9322t0(this.f9827m, this.f9828n);
            this.f9828n = null;
        }
    }

    /* renamed from: z */
    public C5087u mo16880z() {
        mo16877r0(1, 2, ']');
        return this;
    }
}
