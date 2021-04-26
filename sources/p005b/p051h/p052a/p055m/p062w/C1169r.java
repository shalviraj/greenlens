package p005b.p051h.p052a.p055m.p062w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p005b.p051h.p052a.C0935g;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p062w.C1161n;

/* renamed from: b.h.a.m.w.r */
public class C1169r {

    /* renamed from: e */
    public static final C1172c f1425e = new C1172c();

    /* renamed from: f */
    public static final C1161n<Object, Object> f1426f = new C1170a();

    /* renamed from: a */
    public final List<C1171b<?, ?>> f1427a = new ArrayList();

    /* renamed from: b */
    public final C1172c f1428b;

    /* renamed from: c */
    public final Set<C1171b<?, ?>> f1429c = new HashSet();

    /* renamed from: d */
    public final Pools.Pool<List<Throwable>> f1430d;

    /* renamed from: b.h.a.m.w.r$a */
    public static class C1170a implements C1161n<Object, Object> {
        @Nullable
        /* renamed from: a */
        public C1161n.C1162a<Object> mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
            return null;
        }

        /* renamed from: b */
        public boolean mo11031b(@NonNull Object obj) {
            return false;
        }
    }

    /* renamed from: b.h.a.m.w.r$b */
    public static class C1171b<Model, Data> {

        /* renamed from: a */
        public final Class<Model> f1431a;

        /* renamed from: b */
        public final Class<Data> f1432b;

        /* renamed from: c */
        public final C1163o<? extends Model, ? extends Data> f1433c;

        public C1171b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C1163o<? extends Model, ? extends Data> oVar) {
            this.f1431a = cls;
            this.f1432b = cls2;
            this.f1433c = oVar;
        }
    }

    /* renamed from: b.h.a.m.w.r$c */
    public static class C1172c {
    }

    public C1169r(@NonNull Pools.Pool<List<Throwable>> pool) {
        C1172c cVar = f1425e;
        this.f1430d = pool;
        this.f1428b = cVar;
    }

    @NonNull
    /* renamed from: a */
    public final <Model, Data> C1161n<Model, Data> mo11057a(@NonNull C1171b<?, ?> bVar) {
        C1161n<? extends Model, ? extends Data> b = bVar.f1433c.mo11033b(this);
        Objects.requireNonNull(b, "Argument must not be null");
        return b;
    }

    @NonNull
    /* renamed from: b */
    public synchronized <Model, Data> C1161n<Model, Data> mo11058b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C1171b next : this.f1427a) {
                if (this.f1429c.contains(next)) {
                    z = true;
                } else {
                    if (next.f1431a.isAssignableFrom(cls) && next.f1432b.isAssignableFrom(cls2)) {
                        this.f1429c.add(next);
                        arrayList.add(mo11057a(next));
                        this.f1429c.remove(next);
                    }
                }
            }
            if (arrayList.size() > 1) {
                C1172c cVar = this.f1428b;
                Pools.Pool<List<Throwable>> pool = this.f1430d;
                Objects.requireNonNull(cVar);
                return new C1167q(arrayList, pool);
            } else if (arrayList.size() == 1) {
                return (C1161n) arrayList.get(0);
            } else if (z) {
                return f1426f;
            } else {
                throw new C0935g.C0938c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f1429c.clear();
            throw th;
        }
    }

    @NonNull
    /* renamed from: c */
    public synchronized <Model> List<C1161n<Model, ?>> mo11059c(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1171b next : this.f1427a) {
                if (!this.f1429c.contains(next)) {
                    if (next.f1431a.isAssignableFrom(cls)) {
                        this.f1429c.add(next);
                        C1161n<? extends Model, ? extends Data> b = next.f1433c.mo11033b(this);
                        Objects.requireNonNull(b, "Argument must not be null");
                        arrayList.add(b);
                        this.f1429c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f1429c.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: d */
    public synchronized List<Class<?>> mo11060d(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1171b next : this.f1427a) {
            if (!arrayList.contains(next.f1432b) && next.f1431a.isAssignableFrom(cls)) {
                arrayList.add(next.f1432b);
            }
        }
        return arrayList;
    }
}
