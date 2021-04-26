package p298d.p344x.p346c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: d.x.c.y */
public class C6904y {

    /* renamed from: a */
    public final ArrayList<Object> f13804a;

    public C6904y(int i) {
        this.f13804a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void mo24208a(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f13804a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f13804a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f13804a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f13804a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f13804a.add(it.next());
                }
            } else {
                StringBuilder u = C0843a.m460u("Don't know how to spread ");
                u.append(obj.getClass());
                throw new UnsupportedOperationException(u.toString());
            }
        }
    }

    /* renamed from: b */
    public int mo24209b() {
        return this.f13804a.size();
    }
}
