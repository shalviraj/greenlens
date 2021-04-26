package p005b.p051h.p052a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p005b.p051h.p052a.C0931d;
import p005b.p051h.p052a.p055m.p058v.C1086k;
import p005b.p051h.p052a.p055m.p064x.p069g.C1282c;
import p005b.p051h.p052a.p071n.C1304c;
import p005b.p051h.p052a.p071n.C1306d;
import p005b.p051h.p052a.p071n.C1307e;
import p005b.p051h.p052a.p071n.C1309f;
import p005b.p051h.p052a.p071n.C1311h;
import p005b.p051h.p052a.p071n.C1312i;
import p005b.p051h.p052a.p071n.C1313j;
import p005b.p051h.p052a.p071n.C1319m;
import p005b.p051h.p052a.p071n.C1320n;
import p005b.p051h.p052a.p071n.C1323p;
import p005b.p051h.p052a.p074q.C1340b;
import p005b.p051h.p052a.p074q.C1342d;
import p005b.p051h.p052a.p074q.C1343e;
import p005b.p051h.p052a.p074q.p075h.C1354h;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.i */
public class C0943i implements ComponentCallbacks2, C1312i {

    /* renamed from: r */
    public static final C1343e f899r = ((C1343e) ((C1343e) new C1343e().mo10386f(Bitmap.class)).mo10389j());

    /* renamed from: g */
    public final C0929c f900g;

    /* renamed from: h */
    public final Context f901h;

    /* renamed from: i */
    public final C1311h f902i;
    @GuardedBy("this")

    /* renamed from: j */
    public final C1320n f903j;
    @GuardedBy("this")

    /* renamed from: k */
    public final C1319m f904k;
    @GuardedBy("this")

    /* renamed from: l */
    public final C1323p f905l = new C1323p();

    /* renamed from: m */
    public final Runnable f906m;

    /* renamed from: n */
    public final Handler f907n;

    /* renamed from: o */
    public final C1304c f908o;

    /* renamed from: p */
    public final CopyOnWriteArrayList<C1342d<Object>> f909p;
    @GuardedBy("this")

    /* renamed from: q */
    public C1343e f910q;

    /* renamed from: b.h.a.i$a */
    public class C0944a implements Runnable {
        public C0944a() {
        }

        public void run() {
            C0943i iVar = C0943i.this;
            iVar.f902i.mo11141a(iVar);
        }
    }

    /* renamed from: b.h.a.i$b */
    public class C0945b implements C1304c.C1305a {
        @GuardedBy("RequestManager.this")

        /* renamed from: a */
        public final C1320n f912a;

        public C0945b(@NonNull C1320n nVar) {
            this.f912a = nVar;
        }
    }

    static {
        C1343e eVar = (C1343e) ((C1343e) new C1343e().mo10386f(C1282c.class)).mo10389j();
        C1343e eVar2 = (C1343e) ((C1343e) ((C1343e) new C1343e().mo10387g(C1086k.f1252b)).mo10394p(C0934f.LOW)).mo10397t(true);
    }

    public C0943i(@NonNull C0929c cVar, @NonNull C1311h hVar, @NonNull C1319m mVar, @NonNull Context context) {
        C1343e eVar;
        C1320n nVar = new C1320n();
        C1306d dVar = cVar.f845m;
        C0944a aVar = new C0944a();
        this.f906m = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f907n = handler;
        this.f900g = cVar;
        this.f902i = hVar;
        this.f904k = mVar;
        this.f903j = nVar;
        this.f901h = context;
        Context applicationContext = context.getApplicationContext();
        C0945b bVar = new C0945b(nVar);
        Objects.requireNonNull((C1309f) dVar);
        boolean z = ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        C1304c eVar2 = z ? new C1307e(applicationContext, bVar) : new C1313j();
        this.f908o = eVar2;
        if (C1380j.m1475h()) {
            handler.post(aVar);
        } else {
            hVar.mo11141a(this);
        }
        hVar.mo11141a(eVar2);
        this.f909p = new CopyOnWriteArrayList<>(cVar.f841i.f867e);
        C0933e eVar3 = cVar.f841i;
        synchronized (eVar3) {
            if (eVar3.f872j == null) {
                Objects.requireNonNull((C0931d.C0932a) eVar3.f866d);
                C1343e eVar4 = new C1343e();
                eVar4.f1720z = true;
                eVar3.f872j = eVar4;
            }
            eVar = eVar3.f872j;
        }
        mo10416s(eVar);
        synchronized (cVar.f846n) {
            if (!cVar.f846n.contains(this)) {
                cVar.f846n.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* renamed from: d */
    public synchronized void mo10773d() {
        mo10780q();
        this.f905l.mo10773d();
    }

    /* renamed from: j */
    public synchronized void mo10774j() {
        this.f905l.mo10774j();
        for (T n : C1380j.m1472e(this.f905l.f1677g)) {
            mo10775n(n);
        }
        this.f905l.f1677g.clear();
        C1320n nVar = this.f903j;
        Iterator it = ((ArrayList) C1380j.m1472e(nVar.f1667a)).iterator();
        while (it.hasNext()) {
            nVar.mo11161a((C1340b) it.next());
        }
        nVar.f1668b.clear();
        this.f902i.mo11142b(this);
        this.f902i.mo11142b(this.f908o);
        this.f907n.removeCallbacks(this.f906m);
        C0929c cVar = this.f900g;
        synchronized (cVar.f846n) {
            if (cVar.f846n.contains(this)) {
                cVar.f846n.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @CheckResult
    @NonNull
    /* renamed from: k */
    public <ResourceType> C0941h<ResourceType> mo10411k(@NonNull Class<ResourceType> cls) {
        return new C0941h<>(this.f900g, this, cls, this.f901h);
    }

    @CheckResult
    @NonNull
    /* renamed from: l */
    public C0941h<Bitmap> mo10412l() {
        return mo10411k(Bitmap.class).mo10382a(f899r);
    }

    @CheckResult
    @NonNull
    /* renamed from: m */
    public C0941h<Drawable> mo10413m() {
        return mo10411k(Drawable.class);
    }

    /* renamed from: n */
    public void mo10775n(@Nullable C1354h<?> hVar) {
        boolean z;
        if (hVar != null) {
            boolean t = mo10782t(hVar);
            C1340b f = hVar.mo11213f();
            if (!t) {
                C0929c cVar = this.f900g;
                synchronized (cVar.f846n) {
                    Iterator<C0943i> it = cVar.f846n.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().mo10782t(hVar)) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z && f != null) {
                    hVar.mo11215i((C1340b) null);
                    f.clear();
                }
            }
        }
    }

    @CheckResult
    @NonNull
    /* renamed from: o */
    public C0941h<Drawable> mo10414o(@Nullable File file) {
        return mo10413m().mo10403F(file);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public synchronized void onStart() {
        mo10781r();
        this.f905l.onStart();
    }

    public void onTrimMemory(int i) {
    }

    @CheckResult
    @NonNull
    /* renamed from: p */
    public C0941h<Drawable> mo10415p(@Nullable String str) {
        return mo10413m().mo10405I(str);
    }

    /* renamed from: q */
    public synchronized void mo10780q() {
        C1320n nVar = this.f903j;
        nVar.f1669c = true;
        Iterator it = ((ArrayList) C1380j.m1472e(nVar.f1667a)).iterator();
        while (it.hasNext()) {
            C1340b bVar = (C1340b) it.next();
            if (bVar.isRunning()) {
                bVar.pause();
                nVar.f1668b.add(bVar);
            }
        }
    }

    /* renamed from: r */
    public synchronized void mo10781r() {
        C1320n nVar = this.f903j;
        nVar.f1669c = false;
        Iterator it = ((ArrayList) C1380j.m1472e(nVar.f1667a)).iterator();
        while (it.hasNext()) {
            C1340b bVar = (C1340b) it.next();
            if (!bVar.mo11183c() && !bVar.isRunning()) {
                bVar.mo11181a();
            }
        }
        nVar.f1668b.clear();
    }

    /* renamed from: s */
    public synchronized void mo10416s(@NonNull C1343e eVar) {
        this.f910q = (C1343e) ((C1343e) eVar.clone()).mo10383b();
    }

    /* renamed from: t */
    public synchronized boolean mo10782t(@NonNull C1354h<?> hVar) {
        C1340b f = hVar.mo11213f();
        if (f == null) {
            return true;
        }
        if (!this.f903j.mo11161a(f)) {
            return false;
        }
        this.f905l.f1677g.remove(hVar);
        hVar.mo11215i((C1340b) null);
        return true;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f903j + ", treeNode=" + this.f904k + "}";
    }
}
