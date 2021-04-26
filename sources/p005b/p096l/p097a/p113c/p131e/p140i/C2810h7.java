package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Iterator;
import java.util.Map;

/* renamed from: b.l.a.c.e.i.h7 */
public final class C2810h7 implements Iterator<Map.Entry> {

    /* renamed from: g */
    public int f4816g = -1;

    /* renamed from: h */
    public boolean f4817h;

    /* renamed from: i */
    public Iterator<Map.Entry> f4818i;

    /* renamed from: j */
    public final /* synthetic */ C2836j7 f4819j;

    public /* synthetic */ C2810h7(C2836j7 j7Var) {
        this.f4819j = j7Var;
    }

    /* renamed from: b */
    public final Iterator<Map.Entry> mo13374b() {
        if (this.f4818i == null) {
            this.f4818i = this.f4819j.f4857i.entrySet().iterator();
        }
        return this.f4818i;
    }

    public final boolean hasNext() {
        if (this.f4816g + 1 < this.f4819j.f4856h.size()) {
            return true;
        }
        if (this.f4819j.f4857i.isEmpty()) {
            return false;
        }
        if (mo13374b().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f4817h = true;
        int i = this.f4816g + 1;
        this.f4816g = i;
        return (Map.Entry) (i < this.f4819j.f4856h.size() ? this.f4819j.f4856h.get(this.f4816g) : mo13374b().next());
    }

    public final void remove() {
        if (this.f4817h) {
            this.f4817h = false;
            C2836j7 j7Var = this.f4819j;
            int i = C2836j7.f4854m;
            j7Var.mo13430h();
            if (this.f4816g < this.f4819j.f4856h.size()) {
                C2836j7 j7Var2 = this.f4819j;
                int i2 = this.f4816g;
                this.f4816g = i2 - 1;
                j7Var2.mo13427f(i2);
                return;
            }
            mo13374b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
