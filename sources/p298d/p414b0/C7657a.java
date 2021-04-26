package p298d.p414b0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.b0.a */
public final class C7657a<T> implements C7668h<T> {

    /* renamed from: a */
    public final AtomicReference<C7668h<T>> f15168a;

    public C7657a(C7668h<? extends T> hVar) {
        C6888i.m12438e(hVar, "sequence");
        this.f15168a = new AtomicReference<>(hVar);
    }

    public Iterator<T> iterator() {
        C7668h andSet = this.f15168a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
