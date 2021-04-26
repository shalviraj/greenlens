package p298d;

import java.io.Serializable;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.m */
public final class C6772m<T> implements C6764f<T>, Serializable {

    /* renamed from: g */
    public C6851a<? extends T> f13687g;

    /* renamed from: h */
    public volatile Object f13688h = C6775p.f13693a;

    /* renamed from: i */
    public final Object f13689i = this;

    public C6772m(C6851a aVar, Object obj, int i) {
        int i2 = i & 2;
        C6888i.m12438e(aVar, "initializer");
        this.f13687g = aVar;
    }

    public T getValue() {
        T t;
        T t2 = this.f13688h;
        T t3 = C6775p.f13693a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.f13689i) {
            t = this.f13688h;
            if (t == t3) {
                C6851a aVar = this.f13687g;
                C6888i.m12436c(aVar);
                t = aVar.invoke();
                this.f13688h = t;
                this.f13687g = null;
            }
        }
        return t;
    }

    public String toString() {
        return this.f13688h != C6775p.f13693a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
