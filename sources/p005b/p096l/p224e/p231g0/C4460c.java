package p005b.p096l.p224e.p231g0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.e.g0.c */
public class C4460c implements Closeable, Flushable {

    /* renamed from: p */
    public static final String[] f8279p = new String[128];

    /* renamed from: q */
    public static final String[] f8280q;

    /* renamed from: g */
    public final Writer f8281g;

    /* renamed from: h */
    public int[] f8282h = new int[32];

    /* renamed from: i */
    public int f8283i = 0;

    /* renamed from: j */
    public String f8284j;

    /* renamed from: k */
    public String f8285k;

    /* renamed from: l */
    public boolean f8286l;

    /* renamed from: m */
    public boolean f8287m;

    /* renamed from: n */
    public String f8288n;

    /* renamed from: o */
    public boolean f8289o;

    static {
        for (int i = 0; i <= 31; i++) {
            f8279p[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f8279p;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f8280q = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C4460c(Writer writer) {
        mo16111h0(6);
        this.f8285k = ":";
        this.f8289o = true;
        Objects.requireNonNull(writer, "out == null");
        this.f8281g = writer;
    }

    /* renamed from: H */
    public C4460c mo16063H() {
        mo16115z(1, 2, ']');
        return this;
    }

    /* renamed from: N */
    public C4460c mo16064N() {
        mo16115z(3, 5, '}');
        return this;
    }

    /* renamed from: O */
    public C4460c mo16065O(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f8288n != null) {
            throw new IllegalStateException();
        } else if (this.f8283i != 0) {
            this.f8288n = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: S */
    public final void mo16108S() {
        if (this.f8284j != null) {
            this.f8281g.write(10);
            int i = this.f8283i;
            for (int i2 = 1; i2 < i; i2++) {
                this.f8281g.write(this.f8284j);
            }
        }
    }

    /* renamed from: Z */
    public C4460c mo16066Z() {
        if (this.f8288n != null) {
            if (this.f8289o) {
                mo16114t0();
            } else {
                this.f8288n = null;
                return this;
            }
        }
        mo16109d();
        this.f8281g.write("null");
        return this;
    }

    public void close() {
        this.f8281g.close();
        int i = this.f8283i;
        if (i > 1 || (i == 1 && this.f8282h[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f8283i = 0;
    }

    /* renamed from: d */
    public final void mo16109d() {
        int f0 = mo16110f0();
        if (f0 == 1) {
            mo16112l0(2);
        } else if (f0 == 2) {
            this.f8281g.append(',');
        } else if (f0 != 4) {
            if (f0 != 6) {
                if (f0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f8286l) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            mo16112l0(7);
            return;
        } else {
            this.f8281g.append(this.f8285k);
            mo16112l0(5);
            return;
        }
        mo16108S();
    }

    /* renamed from: e */
    public C4460c mo16068e() {
        mo16114t0();
        mo16109d();
        mo16111h0(1);
        this.f8281g.write(91);
        return this;
    }

    /* renamed from: f0 */
    public final int mo16110f0() {
        int i = this.f8283i;
        if (i != 0) {
            return this.f8282h[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void flush() {
        if (this.f8283i != 0) {
            this.f8281g.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: h0 */
    public final void mo16111h0(int i) {
        int i2 = this.f8283i;
        int[] iArr = this.f8282h;
        if (i2 == iArr.length) {
            this.f8282h = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f8282h;
        int i3 = this.f8283i;
        this.f8283i = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: l0 */
    public final void mo16112l0(int i) {
        this.f8282h[this.f8283i - 1] = i;
    }

    /* renamed from: n0 */
    public final void mo16113n0(String str) {
        String str2;
        String[] strArr = this.f8287m ? f8280q : f8279p;
        this.f8281g.write(34);
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
                this.f8281g.write(str, i, i2 - i);
            }
            this.f8281g.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f8281g.write(str, i, length - i);
        }
        this.f8281g.write(34);
    }

    /* renamed from: o0 */
    public C4460c mo16070o0(long j) {
        mo16114t0();
        mo16109d();
        this.f8281g.write(Long.toString(j));
        return this;
    }

    /* renamed from: p0 */
    public C4460c mo16071p0(Boolean bool) {
        if (bool == null) {
            return mo16066Z();
        }
        mo16114t0();
        mo16109d();
        this.f8281g.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: q */
    public C4460c mo16072q() {
        mo16114t0();
        mo16109d();
        mo16111h0(3);
        this.f8281g.write(123);
        return this;
    }

    /* renamed from: q0 */
    public C4460c mo16073q0(Number number) {
        if (number == null) {
            return mo16066Z();
        }
        mo16114t0();
        String obj = number.toString();
        if (this.f8286l || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            mo16109d();
            this.f8281g.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: r0 */
    public C4460c mo16074r0(String str) {
        if (str == null) {
            return mo16066Z();
        }
        mo16114t0();
        mo16109d();
        mo16113n0(str);
        return this;
    }

    /* renamed from: s0 */
    public C4460c mo16075s0(boolean z) {
        mo16114t0();
        mo16109d();
        this.f8281g.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: t0 */
    public final void mo16114t0() {
        if (this.f8288n != null) {
            int f0 = mo16110f0();
            if (f0 == 5) {
                this.f8281g.write(44);
            } else if (f0 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            mo16108S();
            mo16112l0(4);
            mo16113n0(this.f8288n);
            this.f8288n = null;
        }
    }

    /* renamed from: z */
    public final C4460c mo16115z(int i, int i2, char c) {
        int f0 = mo16110f0();
        if (f0 != i2 && f0 != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f8288n == null) {
            this.f8283i--;
            if (f0 == i2) {
                mo16108S();
            }
            this.f8281g.write(c);
            return this;
        } else {
            StringBuilder u = C0843a.m460u("Dangling name: ");
            u.append(this.f8288n);
            throw new IllegalStateException(u.toString());
        }
    }
}
