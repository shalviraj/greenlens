package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Iterator;
import java.util.Map;

/* renamed from: b.l.a.c.e.e.u0 */
public final class C2511u0 implements Iterator<Map.Entry> {

    /* renamed from: g */
    public int f4334g = -1;

    /* renamed from: h */
    public boolean f4335h;

    /* renamed from: i */
    public Iterator<Map.Entry> f4336i;

    /* renamed from: j */
    public final /* synthetic */ C2559w0 f4337j;

    public /* synthetic */ C2511u0(C2559w0 w0Var) {
        this.f4337j = w0Var;
    }

    /* renamed from: b */
    public final Iterator<Map.Entry> mo13021b() {
        if (this.f4336i == null) {
            this.f4336i = this.f4337j.f4388i.entrySet().iterator();
        }
        return this.f4336i;
    }

    public final boolean hasNext() {
        if (this.f4334g + 1 < this.f4337j.f4387h.size()) {
            return true;
        }
        if (this.f4337j.f4388i.isEmpty()) {
            return false;
        }
        if (mo13021b().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f4335h = true;
        int i = this.f4334g + 1;
        this.f4334g = i;
        return (Map.Entry) (i < this.f4337j.f4387h.size() ? this.f4337j.f4387h.get(this.f4334g) : mo13021b().next());
    }

    public final void remove() {
        if (this.f4335h) {
            this.f4335h = false;
            C2559w0 w0Var = this.f4337j;
            int i = C2559w0.f4385m;
            w0Var.mo13089h();
            if (this.f4334g < this.f4337j.f4387h.size()) {
                C2559w0 w0Var2 = this.f4337j;
                int i2 = this.f4334g;
                this.f4334g = i2 - 1;
                w0Var2.mo13086f(i2);
                return;
            }
            mo13021b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
