package p005b.p096l.p097a.p098a.p101f.p103o.p104a;

import p387k.p388a.C7065a;

/* renamed from: b.l.a.a.f.o.a.a */
public final class C1663a<T> implements C7065a<T> {

    /* renamed from: c */
    public static final Object f2922c = new Object();

    /* renamed from: a */
    public volatile C7065a<T> f2923a;

    /* renamed from: b */
    public volatile Object f2924b = f2922c;

    public C1663a(C7065a<T> aVar) {
        this.f2923a = aVar;
    }

    /* renamed from: a */
    public static Object m2190a(Object obj, Object obj2) {
        if (!(obj != f2922c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f2924b;
        T t2 = f2922c;
        if (t == t2) {
            synchronized (this) {
                t = this.f2924b;
                if (t == t2) {
                    t = this.f2923a.get();
                    m2190a(this.f2924b, t);
                    this.f2924b = t;
                    this.f2923a = null;
                }
            }
        }
        return t;
    }
}
