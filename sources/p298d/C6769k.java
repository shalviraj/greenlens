package p298d;

import java.io.Serializable;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.k */
public final class C6769k<T> implements Serializable {

    /* renamed from: d.k$a */
    public static final class C6770a implements Serializable {

        /* renamed from: g */
        public final Throwable f13683g;

        public C6770a(Throwable th) {
            C6888i.m12438e(th, "exception");
            this.f13683g = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C6770a) && C6888i.m12434a(this.f13683g, ((C6770a) obj).f13683g);
        }

        public int hashCode() {
            return this.f13683g.hashCode();
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("Failure(");
            u.append(this.f13683g);
            u.append(')');
            return u.toString();
        }
    }

    /* renamed from: a */
    public static final Throwable m12309a(Object obj) {
        if (obj instanceof C6770a) {
            return ((C6770a) obj).f13683g;
        }
        return null;
    }
}
