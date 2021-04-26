package p005b.p051h.p052a.p078s.p079k;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p078s.p079k.C1390d;

/* renamed from: b.h.a.s.k.a */
public final class C1382a {

    /* renamed from: a */
    public static final C1387e<Object> f1804a = new C1383a();

    /* renamed from: b.h.a.s.k.a$a */
    public class C1383a implements C1387e<Object> {
        /* renamed from: a */
        public void mo11266a(@NonNull Object obj) {
        }
    }

    /* renamed from: b.h.a.s.k.a$b */
    public interface C1384b<T> {
        /* renamed from: a */
        T mo10934a();
    }

    /* renamed from: b.h.a.s.k.a$c */
    public static final class C1385c<T> implements Pools.Pool<T> {

        /* renamed from: a */
        public final C1384b<T> f1805a;

        /* renamed from: b */
        public final C1387e<T> f1806b;

        /* renamed from: c */
        public final Pools.Pool<T> f1807c;

        public C1385c(@NonNull Pools.Pool<T> pool, @NonNull C1384b<T> bVar, @NonNull C1387e<T> eVar) {
            this.f1807c = pool;
            this.f1805a = bVar;
            this.f1806b = eVar;
        }

        public T acquire() {
            T acquire = this.f1807c.acquire();
            if (acquire == null) {
                acquire = this.f1805a.mo10934a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder u = C0843a.m460u("Created new ");
                    u.append(acquire.getClass());
                    Log.v("FactoryPools", u.toString());
                }
            }
            if (acquire instanceof C1386d) {
                ((C1390d.C1392b) ((C1386d) acquire).mo10935k()).f1808a = false;
            }
            return acquire;
        }

        public boolean release(@NonNull T t) {
            if (t instanceof C1386d) {
                ((C1390d.C1392b) ((C1386d) t).mo10935k()).f1808a = true;
            }
            this.f1806b.mo11266a(t);
            return this.f1807c.release(t);
        }
    }

    /* renamed from: b.h.a.s.k.a$d */
    public interface C1386d {
        @NonNull
        /* renamed from: k */
        C1390d mo10935k();
    }

    /* renamed from: b.h.a.s.k.a$e */
    public interface C1387e<T> {
        /* renamed from: a */
        void mo11266a(@NonNull T t);
    }

    @NonNull
    /* renamed from: a */
    public static <T extends C1386d> Pools.Pool<T> m1478a(int i, @NonNull C1384b<T> bVar) {
        return new C1385c(new Pools.SynchronizedPool(i), bVar, f1804a);
    }
}
