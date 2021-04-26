package p005b.p096l.p180d.p190p;

import androidx.annotation.GuardedBy;
import p005b.p096l.p180d.p215w.C4283a;
import p005b.p096l.p180d.p215w.C4284b;

/* renamed from: b.l.d.p.c0 */
public class C3947c0<T> implements C4284b<T> {

    /* renamed from: c */
    public static final /* synthetic */ int f7225c = 0;
    @GuardedBy("this")

    /* renamed from: a */
    public C4283a<T> f7226a;

    /* renamed from: b */
    public volatile C4284b<T> f7227b;

    public C3947c0(C4283a<T> aVar, C4284b<T> bVar) {
        this.f7226a = aVar;
        this.f7227b = bVar;
    }

    public T get() {
        return this.f7227b.get();
    }
}
