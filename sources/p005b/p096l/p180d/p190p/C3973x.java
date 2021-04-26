package p005b.p096l.p180d.p190p;

import p005b.p096l.p180d.p215w.C4284b;

/* renamed from: b.l.d.p.x */
public class C3973x<T> implements C4284b<T> {

    /* renamed from: c */
    public static final Object f7277c = new Object();

    /* renamed from: a */
    public volatile Object f7278a = f7277c;

    /* renamed from: b */
    public volatile C4284b<T> f7279b;

    public C3973x(C4284b<T> bVar) {
        this.f7279b = bVar;
    }

    public T get() {
        T t = this.f7278a;
        T t2 = f7277c;
        if (t == t2) {
            synchronized (this) {
                t = this.f7278a;
                if (t == t2) {
                    t = this.f7279b.get();
                    this.f7278a = t;
                    this.f7279b = null;
                }
            }
        }
        return t;
    }
}
