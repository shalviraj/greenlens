package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.reflect.Type;
import java.util.Iterator;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6436w;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.d0 */
public abstract class C6180d0 implements C6436w {
    /* renamed from: O */
    public abstract Type mo23357O();

    public boolean equals(Object obj) {
        return (obj instanceof C6180d0) && C6888i.m12434a(mo23357O(), ((C6180d0) obj).mo23357O());
    }

    public int hashCode() {
        return mo23357O().hashCode();
    }

    /* renamed from: j */
    public C6412a mo23344j(C6714b bVar) {
        T t;
        C6888i.m12438e(this, "this");
        C6888i.m12438e(bVar, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C6713a b = ((C6412a) next).mo23350b();
            if (b != null) {
                t = b.mo23851b();
            }
            if (C6888i.m12434a(t, bVar)) {
                t = next;
                break;
            }
        }
        return (C6412a) t;
    }

    public String toString() {
        return getClass().getName() + ": " + mo23357O();
    }
}
