package p298d.p334t;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p333a0.C6758d;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6876b;

/* renamed from: d.t.y */
public final class C6807y<T> extends C6807y<T> implements List, C6876b {

    /* renamed from: g */
    public final List<T> f13721g;

    public C6807y(List<T> list) {
        C6888i.m12438e(list, "delegate");
        this.f13721g = list;
    }

    public void add(int i, T t) {
        List<T> list = this.f13721g;
        int size = size();
        if (i < 0 || size < i) {
            StringBuilder v = C0843a.m461v("Position index ", i, " must be in range [");
            v.append(new C6758d(0, size()));
            v.append("].");
            throw new IndexOutOfBoundsException(v.toString());
        }
        list.add(size() - i, t);
    }

    public void clear() {
        this.f13721g.clear();
    }

    public T get(int i) {
        return this.f13721g.get(C6790h.m12340a(this, i));
    }

    public final Object remove(int i) {
        return this.f13721g.remove(C6790h.m12340a(this, i));
    }

    public T set(int i, T t) {
        return this.f13721g.set(C6790h.m12340a(this, i), t);
    }

    public final int size() {
        return this.f13721g.size();
    }
}
