package p005b.p096l.p224e;

import java.io.IOException;
import java.io.StringWriter;
import p005b.p096l.p224e.p226e0.p228z.C4414o;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.q */
public abstract class C4472q {
    /* renamed from: d */
    public C4469n mo16135d() {
        if (this instanceof C4469n) {
            return (C4469n) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: e */
    public C4475t mo16136e() {
        if (this instanceof C4475t) {
            return (C4475t) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: l */
    public C4477v mo16137l() {
        if (this instanceof C4477v) {
            return (C4477v) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: n */
    public long mo16133n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: q */
    public String mo16134q() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C4460c cVar = new C4460c(stringWriter);
            cVar.f8286l = true;
            C4414o.f8202X.mo10756b(cVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
