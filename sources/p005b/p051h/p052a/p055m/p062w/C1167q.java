package p005b.p051h.p052a.p055m.p062w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p058v.C1108r;
import p005b.p051h.p052a.p055m.p062w.C1161n;

/* renamed from: b.h.a.m.w.q */
public class C1167q<Model, Data> implements C1161n<Model, Data> {

    /* renamed from: a */
    public final List<C1161n<Model, Data>> f1416a;

    /* renamed from: b */
    public final Pools.Pool<List<Throwable>> f1417b;

    /* renamed from: b.h.a.m.w.q$a */
    public static class C1168a<Data> implements C0987d<Data>, C0987d.C0988a<Data> {

        /* renamed from: g */
        public final List<C0987d<Data>> f1418g;

        /* renamed from: h */
        public final Pools.Pool<List<Throwable>> f1419h;

        /* renamed from: i */
        public int f1420i;

        /* renamed from: j */
        public C0934f f1421j;

        /* renamed from: k */
        public C0987d.C0988a<? super Data> f1422k;
        @Nullable

        /* renamed from: l */
        public List<Throwable> f1423l;

        /* renamed from: m */
        public boolean f1424m;

        public C1168a(@NonNull List<C0987d<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.f1419h = pool;
            if (!list.isEmpty()) {
                this.f1418g = list;
                this.f1420i = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo10839a() {
            return this.f1418g.get(0).mo10839a();
        }

        /* renamed from: b */
        public void mo10842b() {
            List<Throwable> list = this.f1423l;
            if (list != null) {
                this.f1419h.release(list);
            }
            this.f1423l = null;
            for (C0987d<Data> b : this.f1418g) {
                b.mo10842b();
            }
        }

        /* renamed from: c */
        public void mo10853c(@NonNull Exception exc) {
            List<Throwable> list = this.f1423l;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            mo11056g();
        }

        public void cancel() {
            this.f1424m = true;
            for (C0987d<Data> cancel : this.f1418g) {
                cancel.cancel();
            }
        }

        /* renamed from: d */
        public void mo10854d(@Nullable Data data) {
            if (data != null) {
                this.f1422k.mo10854d(data);
            } else {
                mo11056g();
            }
        }

        @NonNull
        /* renamed from: e */
        public C0962a mo10846e() {
            return this.f1418g.get(0).mo10846e();
        }

        /* renamed from: f */
        public void mo10847f(@NonNull C0934f fVar, @NonNull C0987d.C0988a<? super Data> aVar) {
            this.f1421j = fVar;
            this.f1422k = aVar;
            this.f1423l = this.f1419h.acquire();
            this.f1418g.get(this.f1420i).mo10847f(fVar, this);
            if (this.f1424m) {
                cancel();
            }
        }

        /* renamed from: g */
        public final void mo11056g() {
            if (!this.f1424m) {
                if (this.f1420i < this.f1418g.size() - 1) {
                    this.f1420i++;
                    mo10847f(this.f1421j, this.f1422k);
                    return;
                }
                Objects.requireNonNull(this.f1423l, "Argument must not be null");
                this.f1422k.mo10853c(new C1108r("Fetch failed", (List<Throwable>) new ArrayList(this.f1423l)));
            }
        }
    }

    public C1167q(@NonNull List<C1161n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.f1416a = list;
        this.f1417b = pool;
    }

    /* renamed from: a */
    public C1161n.C1162a<Data> mo11030a(@NonNull Model model, int i, int i2, @NonNull C0979p pVar) {
        C1161n.C1162a a;
        int size = this.f1416a.size();
        ArrayList arrayList = new ArrayList(size);
        C0974m mVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1161n nVar = this.f1416a.get(i3);
            if (nVar.mo11031b(model) && (a = nVar.mo11030a(model, i, i2, pVar)) != null) {
                mVar = a.f1409a;
                arrayList.add(a.f1411c);
            }
        }
        if (arrayList.isEmpty() || mVar == null) {
            return null;
        }
        return new C1161n.C1162a<>(mVar, new C1168a(arrayList, this.f1417b));
    }

    /* renamed from: b */
    public boolean mo11031b(@NonNull Model model) {
        for (C1161n<Model, Data> b : this.f1416a) {
            if (b.mo11031b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("MultiModelLoader{modelLoaders=");
        u.append(Arrays.toString(this.f1416a.toArray()));
        u.append('}');
        return u.toString();
    }
}
