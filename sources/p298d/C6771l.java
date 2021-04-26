package p298d;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005b.p040g.p041a.p042e.p043f.C0866h;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.l */
public final class C6771l<T> implements C6764f<T>, Serializable {

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater<C6771l<?>, Object> f13684i = AtomicReferenceFieldUpdater.newUpdater(C6771l.class, Object.class, C0866h.f730g);

    /* renamed from: g */
    public volatile C6851a<? extends T> f13685g;

    /* renamed from: h */
    private volatile Object f13686h = C6775p.f13693a;

    public C6771l(C6851a<? extends T> aVar) {
        C6888i.m12438e(aVar, "initializer");
        this.f13685g = aVar;
    }

    public T getValue() {
        T t = this.f13686h;
        T t2 = C6775p.f13693a;
        if (t != t2) {
            return t;
        }
        C6851a<? extends T> aVar = this.f13685g;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (f13684i.compareAndSet(this, t2, invoke)) {
                this.f13685g = null;
                return invoke;
            }
        }
        return this.f13686h;
    }

    public String toString() {
        return this.f13686h != C6775p.f13693a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
