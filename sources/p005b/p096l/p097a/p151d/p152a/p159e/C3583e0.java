package p005b.p096l.p097a.p151d.p152a.p159e;

import java.util.Objects;

/* renamed from: b.l.a.d.a.e.e0 */
public final class C3583e0<T> implements C3585f0, C3579c0 {

    /* renamed from: c */
    public static final Object f6645c = new Object();

    /* renamed from: a */
    public volatile C3585f0<T> f6646a;

    /* renamed from: b */
    public volatile Object f6647b = f6645c;

    public C3583e0(C3585f0<T> f0Var) {
        this.f6646a = f0Var;
    }

    /* renamed from: b */
    public static <P extends C3585f0<T>, T> C3579c0<T> m6802b(P p) {
        if (p instanceof C3579c0) {
            return (C3579c0) p;
        }
        Objects.requireNonNull(p);
        return new C3583e0(p);
    }

    /* renamed from: a */
    public final T mo14735a() {
        T t = this.f6647b;
        T t2 = f6645c;
        if (t == t2) {
            synchronized (this) {
                t = this.f6647b;
                if (t == t2) {
                    t = this.f6646a.mo14735a();
                    T t3 = this.f6647b;
                    if (t3 != t2) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f6647b = t;
                    this.f6646a = null;
                }
            }
        }
        return t;
    }
}
