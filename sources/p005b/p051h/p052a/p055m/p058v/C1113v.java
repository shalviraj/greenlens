package p005b.p051h.p052a.p055m.p058v;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.Objects;
import p005b.p051h.p052a.p078s.p079k.C1382a;
import p005b.p051h.p052a.p078s.p079k.C1390d;

/* renamed from: b.h.a.m.v.v */
public final class C1113v<Z> implements C1115w<Z>, C1382a.C1386d {

    /* renamed from: k */
    public static final Pools.Pool<C1113v<?>> f1341k = C1382a.m1478a(20, new C1114a());

    /* renamed from: g */
    public final C1390d f1342g = new C1390d.C1392b();

    /* renamed from: h */
    public C1115w<Z> f1343h;

    /* renamed from: i */
    public boolean f1344i;

    /* renamed from: j */
    public boolean f1345j;

    /* renamed from: b.h.a.m.v.v$a */
    public class C1114a implements C1382a.C1384b<C1113v<?>> {
        /* renamed from: a */
        public Object mo10934a() {
            return new C1113v();
        }
    }

    @NonNull
    /* renamed from: c */
    public static <Z> C1113v<Z> m988c(C1115w<Z> wVar) {
        C1113v<Z> acquire = f1341k.acquire();
        Objects.requireNonNull(acquire, "Argument must not be null");
        acquire.f1345j = false;
        acquire.f1344i = true;
        acquire.f1343h = wVar;
        return acquire;
    }

    /* renamed from: a */
    public int mo11004a() {
        return this.f1343h.mo11004a();
    }

    @NonNull
    /* renamed from: b */
    public Class<Z> mo11005b() {
        return this.f1343h.mo11005b();
    }

    /* renamed from: d */
    public synchronized void mo11026d() {
        this.f1342g.mo11267a();
        if (this.f1344i) {
            this.f1344i = false;
            if (this.f1345j) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @NonNull
    public Z get() {
        return this.f1343h.get();
    }

    @NonNull
    /* renamed from: k */
    public C1390d mo10935k() {
        return this.f1342g;
    }

    public synchronized void recycle() {
        this.f1342g.mo11267a();
        this.f1345j = true;
        if (!this.f1344i) {
            this.f1343h.recycle();
            this.f1343h = null;
            f1341k.release(this);
        }
    }
}
