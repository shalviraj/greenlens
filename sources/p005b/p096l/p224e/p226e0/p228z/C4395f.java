package p005b.p096l.p224e.p226e0.p228z;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p005b.p096l.p224e.C4469n;
import p005b.p096l.p224e.C4472q;
import p005b.p096l.p224e.C4474s;
import p005b.p096l.p224e.C4475t;
import p005b.p096l.p224e.C4477v;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.f */
public final class C4395f extends C4460c {

    /* renamed from: u */
    public static final Writer f8130u = new C4396a();

    /* renamed from: v */
    public static final C4477v f8131v = new C4477v("closed");

    /* renamed from: r */
    public final List<C4472q> f8132r = new ArrayList();

    /* renamed from: s */
    public String f8133s;

    /* renamed from: t */
    public C4472q f8134t = C4474s.f8318a;

    /* renamed from: b.l.e.e0.z.f$a */
    public class C4396a extends Writer {
        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C4395f() {
        super(f8130u);
    }

    /* renamed from: H */
    public C4460c mo16063H() {
        if (this.f8132r.isEmpty() || this.f8133s != null) {
            throw new IllegalStateException();
        } else if (mo16076u0() instanceof C4469n) {
            List<C4472q> list = this.f8132r;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: N */
    public C4460c mo16064N() {
        if (this.f8132r.isEmpty() || this.f8133s != null) {
            throw new IllegalStateException();
        } else if (mo16076u0() instanceof C4475t) {
            List<C4472q> list = this.f8132r;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: O */
    public C4460c mo16065O(String str) {
        if (this.f8132r.isEmpty() || this.f8133s != null) {
            throw new IllegalStateException();
        } else if (mo16076u0() instanceof C4475t) {
            this.f8133s = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: Z */
    public C4460c mo16066Z() {
        mo16077v0(C4474s.f8318a);
        return this;
    }

    public void close() {
        if (this.f8132r.isEmpty()) {
            this.f8132r.add(f8131v);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: e */
    public C4460c mo16068e() {
        C4469n nVar = new C4469n();
        mo16077v0(nVar);
        this.f8132r.add(nVar);
        return this;
    }

    public void flush() {
    }

    /* renamed from: o0 */
    public C4460c mo16070o0(long j) {
        mo16077v0(new C4477v((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: p0 */
    public C4460c mo16071p0(Boolean bool) {
        if (bool == null) {
            mo16077v0(C4474s.f8318a);
            return this;
        }
        mo16077v0(new C4477v(bool));
        return this;
    }

    /* renamed from: q */
    public C4460c mo16072q() {
        C4475t tVar = new C4475t();
        mo16077v0(tVar);
        this.f8132r.add(tVar);
        return this;
    }

    /* renamed from: q0 */
    public C4460c mo16073q0(Number number) {
        if (number == null) {
            mo16077v0(C4474s.f8318a);
            return this;
        }
        if (!this.f8286l) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        mo16077v0(new C4477v(number));
        return this;
    }

    /* renamed from: r0 */
    public C4460c mo16074r0(String str) {
        if (str == null) {
            mo16077v0(C4474s.f8318a);
            return this;
        }
        mo16077v0(new C4477v(str));
        return this;
    }

    /* renamed from: s0 */
    public C4460c mo16075s0(boolean z) {
        mo16077v0(new C4477v(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: u0 */
    public final C4472q mo16076u0() {
        List<C4472q> list = this.f8132r;
        return list.get(list.size() - 1);
    }

    /* renamed from: v0 */
    public final void mo16077v0(C4472q qVar) {
        if (this.f8133s != null) {
            if (!(qVar instanceof C4474s) || this.f8289o) {
                ((C4475t) mo16076u0()).f8319a.put(this.f8133s, qVar);
            }
            this.f8133s = null;
        } else if (this.f8132r.isEmpty()) {
            this.f8134t = qVar;
        } else {
            C4472q u0 = mo16076u0();
            if (u0 instanceof C4469n) {
                ((C4469n) u0).f8317g.add(qVar);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
