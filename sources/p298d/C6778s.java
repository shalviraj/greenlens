package p298d;

import java.io.Serializable;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.s */
public final class C6778s<T> implements C6764f<T>, Serializable {

    /* renamed from: g */
    public C6851a<? extends T> f13695g;

    /* renamed from: h */
    public Object f13696h = C6775p.f13693a;

    public C6778s(C6851a<? extends T> aVar) {
        C6888i.m12438e(aVar, "initializer");
        this.f13695g = aVar;
    }

    public T getValue() {
        if (this.f13696h == C6775p.f13693a) {
            C6851a<? extends T> aVar = this.f13695g;
            C6888i.m12436c(aVar);
            this.f13696h = aVar.invoke();
            this.f13695g = null;
        }
        return this.f13696h;
    }

    public String toString() {
        return this.f13696h != C6775p.f13693a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
