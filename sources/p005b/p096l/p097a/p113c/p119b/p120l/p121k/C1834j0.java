package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.C1760e;
import p005b.p096l.p097a.p113c.p119b.C1767i;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p119b.p122m.C1919j;
import p005b.p096l.p097a.p113c.p148i.C3397a;
import p005b.p096l.p097a.p113c.p148i.C3412e;

/* renamed from: b.l.a.c.b.l.k.j0 */
public final class C1834j0 extends GoogleApiClient implements C1807d1 {

    /* renamed from: b */
    public final Lock f3236b;

    /* renamed from: c */
    public final C1919j f3237c;

    /* renamed from: d */
    public C1803c1 f3238d = null;

    /* renamed from: e */
    public final int f3239e;

    /* renamed from: f */
    public final Context f3240f;

    /* renamed from: g */
    public final Looper f3241g;

    /* renamed from: h */
    public final Queue<C1805d<?, ?>> f3242h = new LinkedList();

    /* renamed from: i */
    public volatile boolean f3243i;

    /* renamed from: j */
    public long f3244j = 120000;

    /* renamed from: k */
    public long f3245k = 5000;

    /* renamed from: l */
    public final C1837k0 f3246l;

    /* renamed from: m */
    public final C1760e f3247m;

    /* renamed from: n */
    public C1798b1 f3248n;

    /* renamed from: o */
    public final Map<C1770a.C1773c<?>, C1770a.C1779f> f3249o;

    /* renamed from: p */
    public Set<Scope> f3250p = new HashSet();

    /* renamed from: q */
    public final C1905d f3251q;

    /* renamed from: r */
    public final Map<C1770a<?>, Boolean> f3252r;

    /* renamed from: s */
    public final C1770a.C1771a<? extends C3412e, C3397a> f3253s;

    /* renamed from: t */
    public final C1836k f3254t = new C1836k();

    /* renamed from: u */
    public final ArrayList<C1875w1> f3255u;

    /* renamed from: v */
    public Integer f3256v = null;

    /* renamed from: w */
    public final C1850o1 f3257w;

    /* renamed from: x */
    public final C1919j.C1920a f3258x;

    public C1834j0(Context context, Lock lock, Looper looper, C1905d dVar, C1760e eVar, C1770a.C1771a aVar, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        Map map3 = map2;
        int i3 = i;
        C1828i0 i0Var = new C1828i0(this);
        this.f3258x = i0Var;
        this.f3240f = context;
        this.f3236b = lock;
        this.f3237c = new C1919j(looper, i0Var);
        this.f3241g = looper;
        this.f3246l = new C1837k0(this, looper);
        this.f3247m = eVar;
        this.f3239e = i3;
        if (i3 >= 0) {
            this.f3256v = Integer.valueOf(i2);
        }
        this.f3252r = map;
        this.f3249o = map3;
        this.f3255u = arrayList;
        this.f3257w = new C1850o1(map3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoogleApiClient.C5470b bVar = (GoogleApiClient.C5470b) it.next();
            C1919j jVar = this.f3237c;
            Objects.requireNonNull(jVar);
            Objects.requireNonNull(bVar, "null reference");
            synchronized (jVar.f3464i) {
                if (jVar.f3457b.contains(bVar)) {
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    jVar.f3457b.add(bVar);
                }
            }
            if (jVar.f3456a.mo12130a()) {
                Handler handler = jVar.f3463h;
                handler.sendMessage(handler.obtainMessage(1, bVar));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f3237c.mo12253b((GoogleApiClient.C5471c) it2.next());
        }
        this.f3251q = dVar;
        this.f3253s = aVar;
    }

    /* renamed from: j */
    public static int m2466j(Iterable<C1770a.C1779f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C1770a.C1779f next : iterable) {
            if (next.mo12030t()) {
                z2 = true;
            }
            if (next.mo12020h()) {
                z3 = true;
            }
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: k */
    public static void m2467k(C1834j0 j0Var) {
        j0Var.f3236b.lock();
        try {
            if (j0Var.f3243i) {
                j0Var.mo12146l();
            }
        } finally {
            j0Var.f3236b.unlock();
        }
    }

    /* renamed from: o */
    public static String m2468o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: a */
    public final void mo12049a(Bundle bundle) {
        while (!this.f3242h.isEmpty()) {
            mo12139d(this.f3242h.remove());
        }
        C1919j jVar = this.f3237c;
        C0823f.m370g(jVar.f3463h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (jVar.f3464i) {
            boolean z = true;
            C0823f.m384n(!jVar.f3462g);
            jVar.f3463h.removeMessages(1);
            jVar.f3462g = true;
            if (jVar.f3458c.size() != 0) {
                z = false;
            }
            C0823f.m384n(z);
            ArrayList arrayList = new ArrayList(jVar.f3457b);
            int i = jVar.f3461f.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                GoogleApiClient.C5470b bVar = (GoogleApiClient.C5470b) obj;
                if (!jVar.f3460e || !jVar.f3456a.mo12130a() || jVar.f3461f.get() != i) {
                    break;
                } else if (!jVar.f3458c.contains(bVar)) {
                    bVar.mo12087k(bundle);
                }
            }
            jVar.f3458c.clear();
            jVar.f3462g = false;
        }
    }

    /* renamed from: b */
    public final void mo12050b(C1754b bVar) {
        C1760e eVar = this.f3247m;
        Context context = this.f3240f;
        int i = bVar.f3095h;
        Objects.requireNonNull(eVar);
        if (!C1767i.m2345c(context, i)) {
            mo12147m();
        }
        if (!this.f3243i) {
            C1919j jVar = this.f3237c;
            C0823f.m370g(jVar.f3463h, "onConnectionFailure must only be called on the Handler thread");
            jVar.f3463h.removeMessages(1);
            synchronized (jVar.f3464i) {
                ArrayList arrayList = new ArrayList(jVar.f3459d);
                int i2 = jVar.f3461f.get();
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i3);
                    i3++;
                    GoogleApiClient.C5471c cVar = (GoogleApiClient.C5471c) obj;
                    if (!jVar.f3460e) {
                        break;
                    } else if (jVar.f3461f.get() != i2) {
                        break;
                    } else if (jVar.f3459d.contains(cVar)) {
                        cVar.mo12088n(bVar);
                    }
                }
            }
            this.f3237c.mo12252a();
        }
    }

    /* renamed from: c */
    public final void mo12051c(int i, boolean z) {
        if (i == 1 && !z && !this.f3243i) {
            this.f3243i = true;
            if (this.f3248n == null) {
                try {
                    this.f3248n = this.f3247m.mo12008g(this.f3240f.getApplicationContext(), new C1846n0(this));
                } catch (SecurityException unused) {
                }
            }
            C1837k0 k0Var = this.f3246l;
            k0Var.sendMessageDelayed(k0Var.obtainMessage(1), this.f3244j);
            C1837k0 k0Var2 = this.f3246l;
            k0Var2.sendMessageDelayed(k0Var2.obtainMessage(2), this.f3245k);
        }
        for (BasePendingResult h : (BasePendingResult[]) this.f3257w.f3269a.toArray(C1850o1.f3268e)) {
            h.mo18867h(C1850o1.f3267d);
        }
        C1919j jVar = this.f3237c;
        C0823f.m370g(jVar.f3463h, "onUnintentionalDisconnection must only be called on the Handler thread");
        jVar.f3463h.removeMessages(1);
        synchronized (jVar.f3464i) {
            jVar.f3462g = true;
            ArrayList arrayList = new ArrayList(jVar.f3457b);
            int i2 = jVar.f3461f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                GoogleApiClient.C5470b bVar = (GoogleApiClient.C5470b) obj;
                if (!jVar.f3460e || jVar.f3461f.get() != i2) {
                    break;
                } else if (jVar.f3457b.contains(bVar)) {
                    bVar.mo12086g(i);
                }
            }
            jVar.f3458c.clear();
            jVar.f3462g = false;
        }
        this.f3237c.mo12252a();
        if (i == 2) {
            mo12146l();
        }
    }

    public final void connect() {
        this.f3236b.lock();
        try {
            boolean z = false;
            if (this.f3239e >= 0) {
                if (this.f3256v != null) {
                    z = true;
                }
                C0823f.m386o(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f3256v;
                if (num == null) {
                    this.f3256v = Integer.valueOf(m2466j(this.f3249o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            mo12144h(this.f3256v.intValue());
        } finally {
            this.f3236b.unlock();
        }
    }

    /* renamed from: d */
    public final <A extends C1770a.C1772b, T extends C1805d<? extends C1789h, A>> T mo12139d(@NonNull T t) {
        C0823f.m362c(t.f3158o != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f3249o.containsKey(t.f3158o);
        C1770a<?> aVar = t.f3159p;
        String str = aVar != null ? aVar.f3126c : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        C0823f.m362c(containsKey, sb.toString());
        this.f3236b.lock();
        try {
            if (this.f3238d != null) {
                if (this.f3243i) {
                    this.f3242h.add(t);
                    while (!this.f3242h.isEmpty()) {
                        C1805d remove = this.f3242h.remove();
                        this.f3257w.mo12157b(remove);
                        remove.mo12074l(Status.f11279l);
                    }
                } else {
                    t = this.f3238d.mo12069d(t);
                }
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f3236b.unlock();
        }
    }

    public final void disconnect() {
        this.f3236b.lock();
        try {
            this.f3257w.mo12156a();
            C1803c1 c1Var = this.f3238d;
            if (c1Var != null) {
                c1Var.mo12067b();
            }
            C1836k kVar = this.f3254t;
            for (C1830j<?> jVar : kVar.f3259a) {
                jVar.f3231b = null;
            }
            kVar.f3259a.clear();
            for (C1805d dVar : this.f3242h) {
                dVar.f11293g.set((Object) null);
                dVar.mo18862a();
            }
            this.f3242h.clear();
            if (this.f3238d != null) {
                mo12147m();
                this.f3237c.mo12252a();
            }
        } finally {
            this.f3236b.unlock();
        }
    }

    @NonNull
    /* renamed from: e */
    public final <C extends C1770a.C1779f> C mo12141e(@NonNull C1770a.C1773c<C> cVar) {
        C c = (C1770a.C1779f) this.f3249o.get(cVar);
        C0823f.m380l(c, "Appropriate Api was not requested.");
        return c;
    }

    /* renamed from: f */
    public final Looper mo12142f() {
        return this.f3241g;
    }

    /* renamed from: g */
    public final boolean mo12143g() {
        C1803c1 c1Var = this.f3238d;
        return c1Var != null && c1Var.mo12066a();
    }

    /* renamed from: h */
    public final void mo12144h(int i) {
        this.f3236b.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            C0823f.m362c(z, sb.toString());
            mo12148n(i);
            mo12146l();
        } finally {
            this.f3236b.unlock();
        }
    }

    /* renamed from: i */
    public final void mo12145i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f3240f);
        printWriter.append(str).append("mResuming=").print(this.f3243i);
        printWriter.append(" mWorkQueue.size()=").print(this.f3242h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f3257w.f3269a.size());
        C1803c1 c1Var = this.f3238d;
        if (c1Var != null) {
            c1Var.mo12070e(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: l */
    public final void mo12146l() {
        this.f3237c.f3460e = true;
        this.f3238d.mo12068c();
    }

    /* renamed from: m */
    public final boolean mo12147m() {
        if (!this.f3243i) {
            return false;
        }
        this.f3243i = false;
        this.f3246l.removeMessages(2);
        this.f3246l.removeMessages(1);
        C1798b1 b1Var = this.f3248n;
        if (b1Var != null) {
            b1Var.mo12047a();
            this.f3248n = null;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: b.l.a.c.b.l.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12148n(int r19) {
        /*
            r18 = this;
            r15 = r18
            java.lang.Integer r0 = r15.f3256v
            if (r0 != 0) goto L_0x000d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r15.f3256v = r0
            goto L_0x0015
        L_0x000d:
            int r0 = r0.intValue()
            r1 = r19
            if (r0 != r1) goto L_0x0191
        L_0x0015:
            b.l.a.c.b.l.k.c1 r0 = r15.f3238d
            if (r0 == 0) goto L_0x001a
            return
        L_0x001a:
            java.util.Map<b.l.a.c.b.l.a$c<?>, b.l.a.c.b.l.a$f> r0 = r15.f3249o
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x0026:
            boolean r4 = r0.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x0042
            java.lang.Object r4 = r0.next()
            b.l.a.c.b.l.a$f r4 = (p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1779f) r4
            boolean r6 = r4.mo12030t()
            if (r6 == 0) goto L_0x003a
            r2 = r5
        L_0x003a:
            boolean r4 = r4.mo12020h()
            if (r4 == 0) goto L_0x0026
            r3 = r5
            goto L_0x0026
        L_0x0042:
            java.lang.Integer r0 = r15.f3256v
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x015d
            r3 = 2
            if (r0 == r3) goto L_0x0050
        L_0x004d:
            r12 = r15
            goto L_0x0162
        L_0x0050:
            if (r2 == 0) goto L_0x004d
            android.content.Context r2 = r15.f3240f
            java.util.concurrent.locks.Lock r3 = r15.f3236b
            android.os.Looper r4 = r15.f3241g
            b.l.a.c.b.e r6 = r15.f3247m
            java.util.Map<b.l.a.c.b.l.a$c<?>, b.l.a.c.b.l.a$f> r0 = r15.f3249o
            b.l.a.c.b.m.d r8 = r15.f3251q
            java.util.Map<b.l.a.c.b.l.a<?>, java.lang.Boolean> r7 = r15.f3252r
            b.l.a.c.b.l.a$a<? extends b.l.a.c.i.e, b.l.a.c.i.a> r9 = r15.f3253s
            java.util.ArrayList<b.l.a.c.b.l.k.w1> r10 = r15.f3255u
            androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap
            r11.<init>()
            androidx.collection.ArrayMap r12 = new androidx.collection.ArrayMap
            r12.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r13 = 0
        L_0x0077:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x00a6
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r16 = r14.getValue()
            r1 = r16
            b.l.a.c.b.l.a$f r1 = (p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1779f) r1
            boolean r16 = r1.mo12020h()
            if (r16 == 0) goto L_0x0092
            r13 = r1
        L_0x0092:
            boolean r16 = r1.mo12030t()
            java.lang.Object r14 = r14.getKey()
            b.l.a.c.b.l.a$c r14 = (p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1773c) r14
            if (r16 == 0) goto L_0x00a2
            r11.put(r14, r1)
            goto L_0x0077
        L_0x00a2:
            r12.put(r14, r1)
            goto L_0x0077
        L_0x00a6:
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ r5
            java.lang.String r1 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            p005b.p006a.p007a.p024o.C0823f.m386o(r0, r1)
            androidx.collection.ArrayMap r14 = new androidx.collection.ArrayMap
            r14.<init>()
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fe
            java.lang.Object r1 = r0.next()
            b.l.a.c.b.l.a r1 = (p005b.p096l.p097a.p113c.p119b.p120l.C1770a) r1
            r16 = r0
            b.l.a.c.b.l.a$c r0 = r1.mo12012a()
            boolean r17 = r11.containsKey(r0)
            if (r17 == 0) goto L_0x00e6
            java.lang.Object r0 = r7.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r14.put(r1, r0)
        L_0x00e3:
            r0 = r16
            goto L_0x00c2
        L_0x00e6:
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r7.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r5.put(r1, r0)
            goto L_0x00e3
        L_0x00f6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r10.size()
            r15 = 0
        L_0x010d:
            if (r15 >= r0) goto L_0x0141
            java.lang.Object r16 = r10.get(r15)
            int r15 = r15 + 1
            r19 = r0
            r0 = r16
            b.l.a.c.b.l.k.w1 r0 = (p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1875w1) r0
            r16 = r10
            b.l.a.c.b.l.a<?> r10 = r0.f3317a
            boolean r10 = r14.containsKey(r10)
            if (r10 == 0) goto L_0x0129
            r7.add(r0)
            goto L_0x0134
        L_0x0129:
            b.l.a.c.b.l.a<?> r10 = r0.f3317a
            boolean r10 = r5.containsKey(r10)
            if (r10 == 0) goto L_0x0139
            r1.add(r0)
        L_0x0134:
            r0 = r19
            r10 = r16
            goto L_0x010d
        L_0x0139:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            r0.<init>(r1)
            throw r0
        L_0x0141:
            b.l.a.c.b.l.k.x1 r15 = new b.l.a.c.b.l.k.x1
            r0 = r15
            r16 = r1
            r1 = r2
            r2 = r18
            r17 = r5
            r5 = r6
            r6 = r11
            r11 = r7
            r7 = r12
            r10 = r13
            r12 = r16
            r13 = r14
            r14 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r12 = r18
            r12.f3238d = r15
            return
        L_0x015d:
            r12 = r15
            if (r2 == 0) goto L_0x0189
            if (r3 != 0) goto L_0x0181
        L_0x0162:
            b.l.a.c.b.l.k.p0 r13 = new b.l.a.c.b.l.k.p0
            android.content.Context r1 = r12.f3240f
            java.util.concurrent.locks.Lock r3 = r12.f3236b
            android.os.Looper r4 = r12.f3241g
            b.l.a.c.b.e r5 = r12.f3247m
            java.util.Map<b.l.a.c.b.l.a$c<?>, b.l.a.c.b.l.a$f> r6 = r12.f3249o
            b.l.a.c.b.m.d r7 = r12.f3251q
            java.util.Map<b.l.a.c.b.l.a<?>, java.lang.Boolean> r8 = r12.f3252r
            b.l.a.c.b.l.a$a<? extends b.l.a.c.i.e, b.l.a.c.i.a> r9 = r12.f3253s
            java.util.ArrayList<b.l.a.c.b.l.k.w1> r10 = r12.f3255u
            r0 = r13
            r2 = r18
            r11 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f3238d = r13
            return
        L_0x0181:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            r0.<init>(r1)
            throw r0
        L_0x0189:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r0.<init>(r1)
            throw r0
        L_0x0191:
            r12 = r15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = m2468o(r19)
            java.lang.Integer r2 = r12.f3256v
            int r2 = r2.intValue()
            java.lang.String r2 = m2468o(r2)
            int r3 = r1.length()
            int r3 = r3 + 51
            int r4 = r2.length()
            int r4 = r4 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.String r4 = "Cannot use sign-in mode: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ". Mode was already set to "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1834j0.mo12148n(int):void");
    }
}
