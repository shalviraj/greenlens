package p005b.p280p.p281a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.p.a.t */
public final class C5086t extends C5087u {

    /* renamed from: m */
    public Object[] f9829m = new Object[32];

    /* renamed from: n */
    public String f9830n;

    public C5086t() {
        mo16886f0(6);
    }

    /* renamed from: H */
    public C5087u mo16864H() {
        if (mo16885Z() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f9830n == null) {
            int i = this.f9831g;
            int i2 = this.f9836l;
            if (i == (~i2)) {
                this.f9836l = ~i2;
                return this;
            }
            this.f9835k = false;
            int i3 = i - 1;
            this.f9831g = i3;
            this.f9829m[i3] = null;
            this.f9833i[i3] = null;
            int[] iArr = this.f9834j;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        } else {
            StringBuilder u = C0843a.m460u("Dangling name: ");
            u.append(this.f9830n);
            throw new IllegalStateException(u.toString());
        }
    }

    /* renamed from: O */
    public C5087u mo16865O(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f9831g == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (mo16885Z() == 3 && this.f9830n == null && !this.f9835k) {
            this.f9830n = str;
            this.f9833i[this.f9831g - 1] = str;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    /* renamed from: S */
    public C5087u mo16866S() {
        if (!this.f9835k) {
            mo16883q0((Object) null);
            int[] iArr = this.f9834j;
            int i = this.f9831g - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder u = C0843a.m460u("null cannot be used as a map key in JSON at path ");
        u.append(mo16884N());
        throw new IllegalStateException(u.toString());
    }

    public void close() {
        int i = this.f9831g;
        if (i > 1 || (i == 1 && this.f9832h[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f9831g = 0;
    }

    /* renamed from: d */
    public C5087u mo16868d() {
        if (!this.f9835k) {
            int i = this.f9831g;
            int i2 = this.f9836l;
            if (i == i2 && this.f9832h[i - 1] == 1) {
                this.f9836l = ~i2;
                return this;
            }
            mo16887q();
            ArrayList arrayList = new ArrayList();
            mo16883q0(arrayList);
            Object[] objArr = this.f9829m;
            int i3 = this.f9831g;
            objArr[i3] = arrayList;
            this.f9834j[i3] = 0;
            mo16886f0(1);
            return this;
        }
        StringBuilder u = C0843a.m460u("Array cannot be used as a map key in JSON at path ");
        u.append(mo16884N());
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: e */
    public C5087u mo16869e() {
        if (!this.f9835k) {
            int i = this.f9831g;
            int i2 = this.f9836l;
            if (i == i2 && this.f9832h[i - 1] == 3) {
                this.f9836l = ~i2;
                return this;
            }
            mo16887q();
            C5088v vVar = new C5088v();
            mo16883q0(vVar);
            this.f9829m[this.f9831g] = vVar;
            mo16886f0(3);
            return this;
        }
        StringBuilder u = C0843a.m460u("Object cannot be used as a map key in JSON at path ");
        u.append(mo16884N());
        throw new IllegalStateException(u.toString());
    }

    public void flush() {
        if (this.f9831g == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: h0 */
    public C5087u mo16871h0(double d) {
        if (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f9835k) {
            this.f9835k = false;
            mo16865O(Double.toString(d));
            return this;
        } else {
            mo16883q0(Double.valueOf(d));
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
        mo16883q0(Long.valueOf(j));
        int[] iArr = this.f9834j;
        int i = this.f9831g - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: n0 */
    public C5087u mo16873n0(Number number) {
        return ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) ? mo16872l0(number.longValue()) : mo16871h0(number.doubleValue());
    }

    /* renamed from: o0 */
    public C5087u mo16874o0(String str) {
        if (this.f9835k) {
            this.f9835k = false;
            mo16865O(str);
            return this;
        }
        mo16883q0(str);
        int[] iArr = this.f9834j;
        int i = this.f9831g - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: p0 */
    public C5087u mo16875p0(boolean z) {
        if (!this.f9835k) {
            mo16883q0(Boolean.valueOf(z));
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
    public final C5086t mo16883q0(Object obj) {
        String str;
        Object put;
        int Z = mo16885Z();
        int i = this.f9831g;
        if (i == 1) {
            if (Z == 6) {
                this.f9832h[i - 1] = 7;
                this.f9829m[i - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (Z != 3 || (str = this.f9830n) == null) {
            if (Z == 1) {
                ((List) this.f9829m[i - 1]).add(obj);
            } else if (Z == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        } else if (obj == null || (put = ((Map) this.f9829m[i - 1]).put(str, obj)) == null) {
            this.f9830n = null;
        } else {
            StringBuilder u = C0843a.m460u("Map key '");
            u.append(this.f9830n);
            u.append("' has multiple values at path ");
            u.append(mo16884N());
            u.append(": ");
            u.append(put);
            u.append(" and ");
            u.append(obj);
            throw new IllegalArgumentException(u.toString());
        }
        return this;
    }

    /* renamed from: z */
    public C5087u mo16880z() {
        if (mo16885Z() == 1) {
            int i = this.f9831g;
            int i2 = this.f9836l;
            if (i == (~i2)) {
                this.f9836l = ~i2;
                return this;
            }
            int i3 = i - 1;
            this.f9831g = i3;
            this.f9829m[i3] = null;
            int[] iArr = this.f9834j;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }
}
