package p005b.p051h.p052a.p055m.p058v;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.p058v.C1076i;
import p005b.p051h.p052a.p055m.p058v.C1106q;
import p005b.p051h.p052a.p055m.p058v.p061e0.C1067a;
import p005b.p051h.p052a.p074q.C1344f;
import p005b.p051h.p052a.p074q.C1345g;
import p005b.p051h.p052a.p078s.C1373e;
import p005b.p051h.p052a.p078s.p079k.C1382a;
import p005b.p051h.p052a.p078s.p079k.C1390d;

/* renamed from: b.h.a.m.v.m */
public class C1097m<R> implements C1076i.C1077a<R>, C1382a.C1386d {

    /* renamed from: E */
    public static final C1100c f1280E = new C1100c();

    /* renamed from: A */
    public boolean f1281A;

    /* renamed from: B */
    public C1106q<?> f1282B;

    /* renamed from: C */
    public C1076i<R> f1283C;

    /* renamed from: D */
    public volatile boolean f1284D;

    /* renamed from: g */
    public final C1102e f1285g = new C1102e();

    /* renamed from: h */
    public final C1390d f1286h = new C1390d.C1392b();

    /* renamed from: i */
    public final C1106q.C1107a f1287i;

    /* renamed from: j */
    public final Pools.Pool<C1097m<?>> f1288j;

    /* renamed from: k */
    public final C1100c f1289k;

    /* renamed from: l */
    public final C1103n f1290l;

    /* renamed from: m */
    public final C1067a f1291m;

    /* renamed from: n */
    public final C1067a f1292n;

    /* renamed from: o */
    public final C1067a f1293o;

    /* renamed from: p */
    public final C1067a f1294p;

    /* renamed from: q */
    public final AtomicInteger f1295q = new AtomicInteger();

    /* renamed from: r */
    public C0974m f1296r;

    /* renamed from: s */
    public boolean f1297s;

    /* renamed from: t */
    public boolean f1298t;

    /* renamed from: u */
    public boolean f1299u;

    /* renamed from: v */
    public boolean f1300v;

    /* renamed from: w */
    public C1115w<?> f1301w;

    /* renamed from: x */
    public C0962a f1302x;

    /* renamed from: y */
    public boolean f1303y;

    /* renamed from: z */
    public C1108r f1304z;

    /* renamed from: b.h.a.m.v.m$a */
    public class C1098a implements Runnable {

        /* renamed from: g */
        public final C1344f f1305g;

        public C1098a(C1344f fVar) {
            this.f1305g = fVar;
        }

        public void run() {
            C1345g gVar = (C1345g) this.f1305g;
            gVar.f1726b.mo11267a();
            synchronized (gVar.f1727c) {
                synchronized (C1097m.this) {
                    if (C1097m.this.f1285g.f1311g.contains(new C1101d(this.f1305g, C1373e.f1790b))) {
                        C1097m mVar = C1097m.this;
                        C1344f fVar = this.f1305g;
                        Objects.requireNonNull(mVar);
                        try {
                            ((C1345g) fVar).mo11205m(mVar.f1304z, 5);
                        } catch (Throwable th) {
                            throw new C1021c(th);
                        }
                    }
                    C1097m.this.mo10991c();
                }
            }
        }
    }

    /* renamed from: b.h.a.m.v.m$b */
    public class C1099b implements Runnable {

        /* renamed from: g */
        public final C1344f f1307g;

        public C1099b(C1344f fVar) {
            this.f1307g = fVar;
        }

        public void run() {
            C1345g gVar = (C1345g) this.f1307g;
            gVar.f1726b.mo11267a();
            synchronized (gVar.f1727c) {
                synchronized (C1097m.this) {
                    if (C1097m.this.f1285g.f1311g.contains(new C1101d(this.f1307g, C1373e.f1790b))) {
                        C1097m.this.f1282B.mo11006c();
                        C1097m mVar = C1097m.this;
                        C1344f fVar = this.f1307g;
                        Objects.requireNonNull(mVar);
                        try {
                            ((C1345g) fVar).mo11206n(mVar.f1282B, mVar.f1302x);
                            C1097m.this.mo10995g(this.f1307g);
                        } catch (Throwable th) {
                            throw new C1021c(th);
                        }
                    }
                    C1097m.this.mo10991c();
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: b.h.a.m.v.m$c */
    public static class C1100c {
    }

    /* renamed from: b.h.a.m.v.m$d */
    public static final class C1101d {

        /* renamed from: a */
        public final C1344f f1309a;

        /* renamed from: b */
        public final Executor f1310b;

        public C1101d(C1344f fVar, Executor executor) {
            this.f1309a = fVar;
            this.f1310b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1101d) {
                return this.f1309a.equals(((C1101d) obj).f1309a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1309a.hashCode();
        }
    }

    /* renamed from: b.h.a.m.v.m$e */
    public static final class C1102e implements Iterable<C1101d> {

        /* renamed from: g */
        public final List<C1101d> f1311g = new ArrayList(2);

        public boolean isEmpty() {
            return this.f1311g.isEmpty();
        }

        @NonNull
        public Iterator<C1101d> iterator() {
            return this.f1311g.iterator();
        }
    }

    public C1097m(C1067a aVar, C1067a aVar2, C1067a aVar3, C1067a aVar4, C1103n nVar, C1106q.C1107a aVar5, Pools.Pool<C1097m<?>> pool) {
        C1100c cVar = f1280E;
        this.f1291m = aVar;
        this.f1292n = aVar2;
        this.f1293o = aVar3;
        this.f1294p = aVar4;
        this.f1290l = nVar;
        this.f1287i = aVar5;
        this.f1288j = pool;
        this.f1289k = cVar;
    }

    /* renamed from: a */
    public synchronized void mo10989a(C1344f fVar, Executor executor) {
        Runnable runnable;
        this.f1286h.mo11267a();
        this.f1285g.f1311g.add(new C1101d(fVar, executor));
        boolean z = true;
        if (this.f1303y) {
            mo10992d(1);
            runnable = new C1099b(fVar);
        } else if (this.f1281A) {
            mo10992d(1);
            runnable = new C1098a(fVar);
        } else {
            if (this.f1284D) {
                z = false;
            }
            C0823f.m366e(z, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(runnable);
    }

    /* renamed from: b */
    public void mo10990b() {
        if (!mo10993e()) {
            this.f1284D = true;
            C1076i<R> iVar = this.f1283C;
            iVar.f1206K = true;
            C1073g gVar = iVar.f1204I;
            if (gVar != null) {
                gVar.cancel();
            }
            C1103n nVar = this.f1290l;
            C0974m mVar = this.f1296r;
            C1090l lVar = (C1090l) nVar;
            synchronized (lVar) {
                C1111t tVar = lVar.f1255a;
                Objects.requireNonNull(tVar);
                Map<C0974m, C1097m<?>> a = tVar.mo11023a(this.f1300v);
                if (equals(a.get(mVar))) {
                    a.remove(mVar);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo10991c() {
        C1106q<?> qVar;
        synchronized (this) {
            this.f1286h.mo11267a();
            C0823f.m366e(mo10993e(), "Not yet complete!");
            int decrementAndGet = this.f1295q.decrementAndGet();
            C0823f.m366e(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qVar = this.f1282B;
                mo10994f();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.mo11007d();
        }
    }

    /* renamed from: d */
    public synchronized void mo10992d(int i) {
        C1106q<?> qVar;
        C0823f.m366e(mo10993e(), "Not yet complete!");
        if (this.f1295q.getAndAdd(i) == 0 && (qVar = this.f1282B) != null) {
            qVar.mo11006c();
        }
    }

    /* renamed from: e */
    public final boolean mo10993e() {
        return this.f1281A || this.f1303y || this.f1284D;
    }

    /* renamed from: f */
    public final synchronized void mo10994f() {
        boolean a;
        if (this.f1296r != null) {
            this.f1285g.f1311g.clear();
            this.f1296r = null;
            this.f1282B = null;
            this.f1301w = null;
            this.f1281A = false;
            this.f1284D = false;
            this.f1303y = false;
            C1076i<R> iVar = this.f1283C;
            C1076i.C1081e eVar = iVar.f1213m;
            synchronized (eVar) {
                eVar.f1232a = true;
                a = eVar.mo10974a(false);
            }
            if (a) {
                iVar.mo10970u();
            }
            this.f1283C = null;
            this.f1304z = null;
            this.f1302x = null;
            this.f1288j.release(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: g */
    public synchronized void mo10995g(C1344f fVar) {
        boolean z;
        this.f1286h.mo11267a();
        this.f1285g.f1311g.remove(new C1101d(fVar, C1373e.f1790b));
        if (this.f1285g.isEmpty()) {
            mo10990b();
            if (!this.f1303y) {
                if (!this.f1281A) {
                    z = false;
                    if (z && this.f1295q.get() == 0) {
                        mo10994f();
                    }
                }
            }
            z = true;
            mo10994f();
        }
    }

    /* renamed from: h */
    public void mo10996h(C1076i<?> iVar) {
        (this.f1298t ? this.f1293o : this.f1299u ? this.f1294p : this.f1292n).f1168g.execute(iVar);
    }

    @NonNull
    /* renamed from: k */
    public C1390d mo10935k() {
        return this.f1286h;
    }
}
