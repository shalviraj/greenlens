package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.amplitude.api.Constants;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.C1758d;
import p005b.p096l.p097a.p113c.p119b.C1760e;
import p005b.p096l.p097a.p113c.p119b.C1767i;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1783d;
import p005b.p096l.p097a.p113c.p119b.p120l.C1791j;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1830j;
import p005b.p096l.p097a.p113c.p119b.p122m.C1889b;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p119b.p122m.C1927m;
import p005b.p096l.p097a.p113c.p119b.p122m.C1929n;
import p005b.p096l.p097a.p113c.p119b.p122m.C1941q0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1942r;
import p005b.p096l.p097a.p113c.p119b.p122m.C1947u;
import p005b.p096l.p097a.p113c.p131e.p134c.C2016c;
import p005b.p096l.p097a.p113c.p148i.C3397a;
import p005b.p096l.p097a.p113c.p148i.C3412e;
import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.a.c.b.l.k.g */
public class C1817g implements Handler.Callback {

    /* renamed from: k */
    public static final Status f3178k = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: l */
    public static final Status f3179l = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: m */
    public static final Object f3180m = new Object();

    /* renamed from: n */
    public static C1817g f3181n;

    /* renamed from: a */
    public long f3182a = 10000;

    /* renamed from: b */
    public final Context f3183b;

    /* renamed from: c */
    public final C1760e f3184c;

    /* renamed from: d */
    public final C1927m f3185d;

    /* renamed from: e */
    public final AtomicInteger f3186e = new AtomicInteger(1);

    /* renamed from: f */
    public final AtomicInteger f3187f = new AtomicInteger(0);

    /* renamed from: g */
    public final Map<C1796b<?>, C1818a<?>> f3188g = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: h */
    public final Set<C1796b<?>> f3189h = new ArraySet();

    /* renamed from: i */
    public final Set<C1796b<?>> f3190i = new ArraySet();

    /* renamed from: j */
    public final Handler f3191j;

    /* renamed from: b.l.a.c.b.l.k.g$a */
    public class C1818a<O extends C1770a.C1774d> implements GoogleApiClient.C5470b, GoogleApiClient.C5471c, C1881y1 {

        /* renamed from: a */
        public final Queue<C1822g1> f3192a = new LinkedList();

        /* renamed from: b */
        public final C1770a.C1779f f3193b;

        /* renamed from: c */
        public final C1770a.C1772b f3194c;

        /* renamed from: d */
        public final C1796b<O> f3195d;

        /* renamed from: e */
        public final C1804c2 f3196e;

        /* renamed from: f */
        public final Set<C1869u1> f3197f = new HashSet();

        /* renamed from: g */
        public final Map<C1830j.C1831a<?>, C1815f1> f3198g = new HashMap();

        /* renamed from: h */
        public final int f3199h;

        /* renamed from: i */
        public final C1829i1 f3200i;

        /* renamed from: j */
        public boolean f3201j;

        /* renamed from: k */
        public final List<C1820c> f3202k = new ArrayList();

        /* renamed from: l */
        public C1754b f3203l = null;

        @WorkerThread
        public C1818a(C1783d<O> dVar) {
            C1770a.C1779f c = dVar.mo12034c(C1817g.this.f3191j.getLooper(), this);
            this.f3193b = c;
            if (c instanceof C1947u) {
                Objects.requireNonNull((C1947u) c);
                this.f3194c = null;
            } else {
                this.f3194c = c;
            }
            this.f3195d = dVar.f3131d;
            this.f3196e = new C1804c2();
            this.f3199h = dVar.f3133f;
            if (c.mo12030t()) {
                this.f3200i = dVar.mo12035d(C1817g.this.f3183b, C1817g.this.f3191j);
            } else {
                this.f3200i = null;
            }
        }

        @WorkerThread
        /* renamed from: a */
        public final void mo12094a() {
            C0823f.m368f(C1817g.this.f3191j);
            if (!this.f3193b.mo12016a() && !this.f3193b.mo12025o()) {
                C1817g gVar = C1817g.this;
                int a = gVar.f3185d.mo12262a(gVar.f3183b, this.f3193b);
                if (a != 0) {
                    mo12088n(new C1754b(a, (PendingIntent) null));
                    return;
                }
                C1817g gVar2 = C1817g.this;
                C1770a.C1779f fVar = this.f3193b;
                C1819b bVar = new C1819b(fVar, this.f3195d);
                if (fVar.mo12030t()) {
                    C1829i1 i1Var = this.f3200i;
                    C3412e eVar = i1Var.f3228f;
                    if (eVar != null) {
                        eVar.mo12017b();
                    }
                    i1Var.f3227e.f3420i = Integer.valueOf(System.identityHashCode(i1Var));
                    C1770a.C1771a<? extends C3412e, C3397a> aVar = i1Var.f3225c;
                    Context context = i1Var.f3223a;
                    Looper looper = i1Var.f3224b.getLooper();
                    C1905d dVar = i1Var.f3227e;
                    i1Var.f3228f = (C3412e) aVar.mo12013a(context, looper, dVar, dVar.f3418g, i1Var, i1Var);
                    i1Var.f3229g = bVar;
                    Set<Scope> set = i1Var.f3226d;
                    if (set == null || set.isEmpty()) {
                        i1Var.f3224b.post(new C1826h1(i1Var));
                    } else {
                        i1Var.f3228f.mo14651c();
                    }
                }
                this.f3193b.mo12028r(bVar);
            }
        }

        /* renamed from: b */
        public final boolean mo12095b() {
            return this.f3193b.mo12030t();
        }

        @WorkerThread
        @Nullable
        /* renamed from: c */
        public final C1758d mo12096c(@Nullable C1758d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                C1758d[] p = this.f3193b.mo12026p();
                if (p == null) {
                    p = new C1758d[0];
                }
                ArrayMap arrayMap = new ArrayMap(p.length);
                for (C1758d dVar : p) {
                    arrayMap.put(dVar.f3104g, Long.valueOf(dVar.mo11996V()));
                }
                for (C1758d dVar2 : dVarArr) {
                    if (!arrayMap.containsKey(dVar2.f3104g) || ((Long) arrayMap.get(dVar2.f3104g)).longValue() < dVar2.mo11996V()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        @WorkerThread
        /* renamed from: d */
        public final void mo12097d(C1822g1 g1Var) {
            C0823f.m368f(C1817g.this.f3191j);
            if (!this.f3193b.mo12016a()) {
                this.f3192a.add(g1Var);
                C1754b bVar = this.f3203l;
                if (bVar == null || !bVar.mo11985V()) {
                    mo12094a();
                } else {
                    mo12088n(this.f3203l);
                }
            } else if (mo12098e(g1Var)) {
                mo12106p();
            } else {
                this.f3192a.add(g1Var);
            }
        }

        @WorkerThread
        /* renamed from: e */
        public final boolean mo12098e(C1822g1 g1Var) {
            if (!(g1Var instanceof C1840l0)) {
                mo12108r(g1Var);
                return true;
            }
            C1840l0 l0Var = (C1840l0) g1Var;
            C1758d c = mo12096c(l0Var.mo12151f(this));
            if (c == null) {
                mo12108r(g1Var);
                return true;
            } else if (l0Var.mo12152g(this)) {
                C1820c cVar = new C1820c(this.f3195d, c, (C1862s0) null);
                int indexOf = this.f3202k.indexOf(cVar);
                if (indexOf >= 0) {
                    C1820c cVar2 = this.f3202k.get(indexOf);
                    C1817g.this.f3191j.removeMessages(15, cVar2);
                    Handler handler = C1817g.this.f3191j;
                    Message obtain = Message.obtain(handler, 15, cVar2);
                    Objects.requireNonNull(C1817g.this);
                    handler.sendMessageDelayed(obtain, 5000);
                    return false;
                }
                this.f3202k.add(cVar);
                Handler handler2 = C1817g.this.f3191j;
                Message obtain2 = Message.obtain(handler2, 15, cVar);
                Objects.requireNonNull(C1817g.this);
                handler2.sendMessageDelayed(obtain2, 5000);
                Handler handler3 = C1817g.this.f3191j;
                Message obtain3 = Message.obtain(handler3, 16, cVar);
                Objects.requireNonNull(C1817g.this);
                handler3.sendMessageDelayed(obtain3, 120000);
                C1754b bVar = new C1754b(2, (PendingIntent) null);
                mo12110t(bVar);
                C1817g.this.mo12092c(bVar, this.f3199h);
                return false;
            } else {
                l0Var.mo12126c(new C1791j(c));
                return false;
            }
        }

        @WorkerThread
        /* renamed from: f */
        public final void mo12099f() {
            mo12103l();
            mo12111u(C1754b.f3093k);
            mo12104m();
            Iterator<C1815f1> it = this.f3198g.values().iterator();
            if (!it.hasNext()) {
                mo12101i();
                mo12106p();
                return;
            }
            Objects.requireNonNull(it.next());
            throw null;
        }

        /* renamed from: g */
        public final void mo12086g(int i) {
            if (Looper.myLooper() == C1817g.this.f3191j.getLooper()) {
                mo12100h();
            } else {
                C1817g.this.f3191j.post(new C1871v0(this));
            }
        }

        @WorkerThread
        /* renamed from: h */
        public final void mo12100h() {
            mo12103l();
            this.f3201j = true;
            this.f3196e.mo12071a(true, C1850o1.f3267d);
            Handler handler = C1817g.this.f3191j;
            Message obtain = Message.obtain(handler, 9, this.f3195d);
            Objects.requireNonNull(C1817g.this);
            handler.sendMessageDelayed(obtain, 5000);
            Handler handler2 = C1817g.this.f3191j;
            Message obtain2 = Message.obtain(handler2, 11, this.f3195d);
            Objects.requireNonNull(C1817g.this);
            handler2.sendMessageDelayed(obtain2, 120000);
            C1817g.this.f3185d.f3474a.clear();
        }

        @WorkerThread
        /* renamed from: i */
        public final void mo12101i() {
            ArrayList arrayList = new ArrayList(this.f3192a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C1822g1 g1Var = (C1822g1) obj;
                if (!this.f3193b.mo12016a()) {
                    return;
                }
                if (mo12098e(g1Var)) {
                    this.f3192a.remove(g1Var);
                }
            }
        }

        @WorkerThread
        /* renamed from: j */
        public final void mo12102j() {
            C0823f.m368f(C1817g.this.f3191j);
            Status status = C1817g.f3178k;
            mo12107q(status);
            C1804c2 c2Var = this.f3196e;
            Objects.requireNonNull(c2Var);
            c2Var.mo12071a(false, status);
            for (C1830j.C1831a t1Var : (C1830j.C1831a[]) this.f3198g.keySet().toArray(new C1830j.C1831a[this.f3198g.size()])) {
                mo12097d(new C1866t1(t1Var, new C3429i()));
            }
            mo12111u(new C1754b(4));
            if (this.f3193b.mo12016a()) {
                this.f3193b.mo12019f(new C1877x0(this));
            }
        }

        /* renamed from: k */
        public final void mo12087k(@Nullable Bundle bundle) {
            if (Looper.myLooper() == C1817g.this.f3191j.getLooper()) {
                mo12099f();
            } else {
                C1817g.this.f3191j.post(new C1865t0(this));
            }
        }

        @WorkerThread
        /* renamed from: l */
        public final void mo12103l() {
            C0823f.m368f(C1817g.this.f3191j);
            this.f3203l = null;
        }

        @WorkerThread
        /* renamed from: m */
        public final void mo12104m() {
            if (this.f3201j) {
                C1817g.this.f3191j.removeMessages(11, this.f3195d);
                C1817g.this.f3191j.removeMessages(9, this.f3195d);
                this.f3201j = false;
            }
        }

        @WorkerThread
        /* renamed from: n */
        public final void mo12088n(@NonNull C1754b bVar) {
            C3412e eVar;
            C0823f.m368f(C1817g.this.f3191j);
            C1829i1 i1Var = this.f3200i;
            if (!(i1Var == null || (eVar = i1Var.f3228f) == null)) {
                eVar.mo12017b();
            }
            mo12103l();
            C1817g.this.f3185d.f3474a.clear();
            mo12111u(bVar);
            if (bVar.f3095h == 4) {
                Status status = C1817g.f3178k;
                mo12107q(C1817g.f3179l);
            } else if (this.f3192a.isEmpty()) {
                this.f3203l = bVar;
            } else {
                mo12110t(bVar);
                if (!C1817g.this.mo12092c(bVar, this.f3199h)) {
                    if (bVar.f3095h == 18) {
                        this.f3201j = true;
                    }
                    if (this.f3201j) {
                        Handler handler = C1817g.this.f3191j;
                        Message obtain = Message.obtain(handler, 9, this.f3195d);
                        Objects.requireNonNull(C1817g.this);
                        handler.sendMessageDelayed(obtain, 5000);
                        return;
                    }
                    String str = this.f3195d.f3143c.f3126c;
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(str).length() + 63);
                    sb.append("API: ");
                    sb.append(str);
                    sb.append(" is not available on this device. Connection failed with: ");
                    sb.append(valueOf);
                    mo12107q(new Status(17, sb.toString()));
                }
            }
        }

        /* renamed from: o */
        public final void mo12105o(C1754b bVar, C1770a<?> aVar, boolean z) {
            if (Looper.myLooper() == C1817g.this.f3191j.getLooper()) {
                mo12088n(bVar);
            } else {
                C1817g.this.f3191j.post(new C1868u0(this, bVar));
            }
        }

        /* renamed from: p */
        public final void mo12106p() {
            C1817g.this.f3191j.removeMessages(12, this.f3195d);
            Handler handler = C1817g.this.f3191j;
            handler.sendMessageDelayed(handler.obtainMessage(12, this.f3195d), C1817g.this.f3182a);
        }

        @WorkerThread
        /* renamed from: q */
        public final void mo12107q(Status status) {
            C0823f.m368f(C1817g.this.f3191j);
            for (C1822g1 a : this.f3192a) {
                a.mo12124a(status);
            }
            this.f3192a.clear();
        }

        @WorkerThread
        /* renamed from: r */
        public final void mo12108r(C1822g1 g1Var) {
            g1Var.mo12125b(this.f3196e, mo12095b());
            try {
                g1Var.mo12127e(this);
            } catch (DeadObjectException unused) {
                mo12086g(1);
                this.f3193b.mo12017b();
            }
        }

        @WorkerThread
        /* renamed from: s */
        public final boolean mo12109s(boolean z) {
            C0823f.m368f(C1817g.this.f3191j);
            if (!this.f3193b.mo12016a() || this.f3198g.size() != 0) {
                return false;
            }
            C1804c2 c2Var = this.f3196e;
            if (!c2Var.f3156a.isEmpty() || !c2Var.f3157b.isEmpty()) {
                if (z) {
                    mo12106p();
                }
                return false;
            }
            this.f3193b.mo12017b();
            return true;
        }

        @WorkerThread
        /* renamed from: t */
        public final boolean mo12110t(@NonNull C1754b bVar) {
            Status status = C1817g.f3178k;
            synchronized (C1817g.f3180m) {
                Objects.requireNonNull(C1817g.this);
            }
            return false;
        }

        @WorkerThread
        /* renamed from: u */
        public final void mo12111u(C1754b bVar) {
            for (C1869u1 next : this.f3197f) {
                String str = null;
                if (C0823f.m330A(bVar, C1754b.f3093k)) {
                    str = this.f3193b.mo12027q();
                }
                next.mo12164a(this.f3195d, bVar, str);
            }
            this.f3197f.clear();
        }
    }

    /* renamed from: b.l.a.c.b.l.k.g$b */
    public class C1819b implements C1835j1, C1889b.C1892c {

        /* renamed from: a */
        public final C1770a.C1779f f3205a;

        /* renamed from: b */
        public final C1796b<?> f3206b;

        /* renamed from: c */
        public C1929n f3207c = null;

        /* renamed from: d */
        public Set<Scope> f3208d = null;

        /* renamed from: e */
        public boolean f3209e = false;

        public C1819b(C1770a.C1779f fVar, C1796b<?> bVar) {
            this.f3205a = fVar;
            this.f3206b = bVar;
        }

        /* renamed from: a */
        public final void mo12112a(@NonNull C1754b bVar) {
            C1817g.this.f3191j.post(new C1883z0(this, bVar));
        }

        @WorkerThread
        /* renamed from: b */
        public final void mo12113b(C1754b bVar) {
            C1818a aVar = C1817g.this.f3188g.get(this.f3206b);
            C0823f.m368f(C1817g.this.f3191j);
            aVar.f3193b.mo12017b();
            aVar.mo12088n(bVar);
        }
    }

    /* renamed from: b.l.a.c.b.l.k.g$c */
    public static class C1820c {

        /* renamed from: a */
        public final C1796b<?> f3211a;

        /* renamed from: b */
        public final C1758d f3212b;

        public C1820c(C1796b bVar, C1758d dVar, C1862s0 s0Var) {
            this.f3211a = bVar;
            this.f3212b = dVar;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C1820c)) {
                C1820c cVar = (C1820c) obj;
                return C0823f.m330A(this.f3211a, cVar.f3211a) && C0823f.m330A(this.f3212b, cVar.f3212b);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f3211a, this.f3212b});
        }

        public final String toString() {
            C1942r rVar = new C1942r(this, (C1941q0) null);
            rVar.mo12270a("key", this.f3211a);
            rVar.mo12270a("feature", this.f3212b);
            return rVar.toString();
        }
    }

    public C1817g(Context context, Looper looper, C1760e eVar) {
        this.f3183b = context;
        C2016c cVar = new C2016c(looper, this);
        this.f3191j = cVar;
        this.f3184c = eVar;
        this.f3185d = new C1927m(eVar);
        cVar.sendMessage(cVar.obtainMessage(6));
    }

    /* renamed from: a */
    public static C1817g m2414a(Context context) {
        C1817g gVar;
        synchronized (f3180m) {
            if (f3181n == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = C1760e.f3107c;
                f3181n = new C1817g(applicationContext, looper, C1760e.f3108d);
            }
            gVar = f3181n;
        }
        return gVar;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo12091b(C1783d<?> dVar) {
        C1796b<O> bVar = dVar.f3131d;
        C1818a aVar = this.f3188g.get(bVar);
        if (aVar == null) {
            aVar = new C1818a(dVar);
            this.f3188g.put(bVar, aVar);
        }
        if (aVar.mo12095b()) {
            this.f3190i.add(bVar);
        }
        aVar.mo12094a();
    }

    /* renamed from: c */
    public final boolean mo12092c(C1754b bVar, int i) {
        PendingIntent pendingIntent;
        C1760e eVar = this.f3184c;
        Context context = this.f3183b;
        Objects.requireNonNull(eVar);
        if (bVar.mo11985V()) {
            pendingIntent = bVar.f3096i;
        } else {
            Intent a = eVar.mo12003a(context, bVar.f3095h, (String) null);
            pendingIntent = a == null ? null : PendingIntent.getActivity(context, 0, a, 134217728);
        }
        if (pendingIntent == null) {
            return false;
        }
        int i2 = bVar.f3095h;
        int i3 = GoogleApiActivity.f11260h;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        eVar.mo12009i(context, i2, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }

    @WorkerThread
    public boolean handleMessage(Message message) {
        C1758d[] f;
        int i = message.what;
        long j = Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS;
        int i2 = 0;
        C1818a aVar = null;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f3182a = j;
                this.f3191j.removeMessages(12);
                for (C1796b<?> obtainMessage : this.f3188g.keySet()) {
                    Handler handler = this.f3191j;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f3182a);
                }
                break;
            case 2:
                C1869u1 u1Var = (C1869u1) message.obj;
                Iterator<C1796b<?>> it = u1Var.f3308a.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C1796b next = it.next();
                        C1818a aVar2 = this.f3188g.get(next);
                        if (aVar2 == null) {
                            u1Var.mo12164a(next, new C1754b(13), (String) null);
                            break;
                        } else if (aVar2.f3193b.mo12016a()) {
                            u1Var.mo12164a(next, C1754b.f3093k, aVar2.f3193b.mo12027q());
                        } else {
                            C0823f.m368f(C1817g.this.f3191j);
                            if (aVar2.f3203l != null) {
                                C0823f.m368f(C1817g.this.f3191j);
                                u1Var.mo12164a(next, aVar2.f3203l, (String) null);
                            } else {
                                C0823f.m368f(C1817g.this.f3191j);
                                aVar2.f3197f.add(u1Var);
                                aVar2.mo12094a();
                            }
                        }
                    }
                }
            case 3:
                for (C1818a next2 : this.f3188g.values()) {
                    next2.mo12103l();
                    next2.mo12094a();
                }
                break;
            case 4:
            case 8:
            case 13:
                C1811e1 e1Var = (C1811e1) message.obj;
                C1818a aVar3 = this.f3188g.get(e1Var.f3169c.f3131d);
                if (aVar3 == null) {
                    mo12091b(e1Var.f3169c);
                    aVar3 = this.f3188g.get(e1Var.f3169c.f3131d);
                }
                if (aVar3.mo12095b() && this.f3187f.get() != e1Var.f3168b) {
                    e1Var.f3167a.mo12124a(f3178k);
                    aVar3.mo12102j();
                    break;
                } else {
                    aVar3.mo12097d(e1Var.f3167a);
                    break;
                }
                break;
            case 5:
                int i3 = message.arg1;
                C1754b bVar = (C1754b) message.obj;
                Iterator<C1818a<?>> it2 = this.f3188g.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C1818a next3 = it2.next();
                        if (next3.f3199h == i3) {
                            aVar = next3;
                        }
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i3);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    C1760e eVar = this.f3184c;
                    int i4 = bVar.f3095h;
                    Objects.requireNonNull(eVar);
                    boolean z = C1767i.f3116a;
                    String X = C1754b.m2323X(i4);
                    String str = bVar.f3097j;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(X).length() + 69);
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(X);
                    sb2.append(": ");
                    sb2.append(str);
                    aVar.mo12107q(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (this.f3183b.getApplicationContext() instanceof Application) {
                    C1800c.m2388b((Application) this.f3183b.getApplicationContext());
                    C1800c cVar = C1800c.f3150k;
                    cVar.mo12052a(new C1862s0(this));
                    if (!cVar.f3152h.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!cVar.f3152h.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            cVar.f3151g.set(true);
                        }
                    }
                    if (!cVar.f3151g.get()) {
                        this.f3182a = Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS;
                        break;
                    }
                }
                break;
            case 7:
                mo12091b((C1783d) message.obj);
                break;
            case 9:
                if (this.f3188g.containsKey(message.obj)) {
                    C1818a aVar4 = this.f3188g.get(message.obj);
                    C0823f.m368f(C1817g.this.f3191j);
                    if (aVar4.f3201j) {
                        aVar4.mo12094a();
                        break;
                    }
                }
                break;
            case 10:
                for (C1796b<?> remove : this.f3190i) {
                    this.f3188g.remove(remove).mo12102j();
                }
                this.f3190i.clear();
                break;
            case 11:
                if (this.f3188g.containsKey(message.obj)) {
                    C1818a aVar5 = this.f3188g.get(message.obj);
                    C0823f.m368f(C1817g.this.f3191j);
                    if (aVar5.f3201j) {
                        aVar5.mo12104m();
                        C1817g gVar = C1817g.this;
                        aVar5.mo12107q(gVar.f3184c.mo12006d(gVar.f3183b) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                        aVar5.f3193b.mo12017b();
                        break;
                    }
                }
                break;
            case 12:
                if (this.f3188g.containsKey(message.obj)) {
                    this.f3188g.get(message.obj).mo12109s(true);
                    break;
                }
                break;
            case 14:
                Objects.requireNonNull((C1861s) message.obj);
                if (!this.f3188g.containsKey((Object) null)) {
                    throw null;
                }
                this.f3188g.get((Object) null).mo12109s(false);
                throw null;
            case 15:
                C1820c cVar2 = (C1820c) message.obj;
                if (this.f3188g.containsKey(cVar2.f3211a)) {
                    C1818a aVar6 = this.f3188g.get(cVar2.f3211a);
                    if (aVar6.f3202k.contains(cVar2) && !aVar6.f3201j) {
                        if (aVar6.f3193b.mo12016a()) {
                            aVar6.mo12101i();
                            break;
                        } else {
                            aVar6.mo12094a();
                            break;
                        }
                    }
                }
                break;
            case 16:
                C1820c cVar3 = (C1820c) message.obj;
                if (this.f3188g.containsKey(cVar3.f3211a)) {
                    C1818a aVar7 = this.f3188g.get(cVar3.f3211a);
                    if (aVar7.f3202k.remove(cVar3)) {
                        C1817g.this.f3191j.removeMessages(15, cVar3);
                        C1817g.this.f3191j.removeMessages(16, cVar3);
                        C1758d dVar = cVar3.f3212b;
                        ArrayList arrayList = new ArrayList(aVar7.f3192a.size());
                        for (C1822g1 g1Var : aVar7.f3192a) {
                            if ((g1Var instanceof C1840l0) && (f = ((C1840l0) g1Var).mo12151f(aVar7)) != null) {
                                int length = f.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        i5 = -1;
                                    } else if (!C0823f.m330A(f[i5], dVar)) {
                                        i5++;
                                    }
                                }
                                if (i5 >= 0) {
                                    arrayList.add(g1Var);
                                }
                            }
                        }
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            C1822g1 g1Var2 = (C1822g1) obj;
                            aVar7.f3192a.remove(g1Var2);
                            g1Var2.mo12126c(new C1791j(dVar));
                        }
                        break;
                    }
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
