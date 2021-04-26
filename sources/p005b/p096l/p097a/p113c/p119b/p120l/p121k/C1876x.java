package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.C1763f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p119b.p122m.C1929n;
import p005b.p096l.p097a.p113c.p148i.C3397a;
import p005b.p096l.p097a.p113c.p148i.C3412e;

/* renamed from: b.l.a.c.b.l.k.x */
public final class C1876x implements C1843m0 {

    /* renamed from: a */
    public final C1853p0 f3320a;

    /* renamed from: b */
    public final Lock f3321b;

    /* renamed from: c */
    public final Context f3322c;

    /* renamed from: d */
    public final C1763f f3323d;

    /* renamed from: e */
    public C1754b f3324e;

    /* renamed from: f */
    public int f3325f;

    /* renamed from: g */
    public int f3326g = 0;

    /* renamed from: h */
    public int f3327h;

    /* renamed from: i */
    public final Bundle f3328i = new Bundle();

    /* renamed from: j */
    public final Set<C1770a.C1773c> f3329j = new HashSet();

    /* renamed from: k */
    public C3412e f3330k;

    /* renamed from: l */
    public boolean f3331l;

    /* renamed from: m */
    public boolean f3332m;

    /* renamed from: n */
    public boolean f3333n;

    /* renamed from: o */
    public C1929n f3334o;

    /* renamed from: p */
    public boolean f3335p;

    /* renamed from: q */
    public boolean f3336q;

    /* renamed from: r */
    public final C1905d f3337r;

    /* renamed from: s */
    public final Map<C1770a<?>, Boolean> f3338s;

    /* renamed from: t */
    public final C1770a.C1771a<? extends C3412e, C3397a> f3339t;

    /* renamed from: u */
    public ArrayList<Future<?>> f3340u = new ArrayList<>();

    public C1876x(C1853p0 p0Var, C1905d dVar, Map<C1770a<?>, Boolean> map, C1763f fVar, C1770a.C1771a<? extends C3412e, C3397a> aVar, Lock lock, Context context) {
        this.f3320a = p0Var;
        this.f3337r = dVar;
        this.f3338s = map;
        this.f3323d = fVar;
        this.f3339t = aVar;
        this.f3321b = lock;
        this.f3322c = context;
    }

    /* renamed from: a */
    public final void mo12117a() {
        this.f3320a.f3282g.clear();
        this.f3332m = false;
        this.f3324e = null;
        this.f3326g = 0;
        this.f3331l = true;
        this.f3333n = false;
        this.f3335p = false;
        HashMap hashMap = new HashMap();
        for (C1770a next : this.f3338s.keySet()) {
            C1770a.C1779f fVar = this.f3320a.f3281f.get(next.mo12012a());
            Objects.requireNonNull(next.f3124a);
            boolean booleanValue = this.f3338s.get(next).booleanValue();
            if (fVar.mo12030t()) {
                this.f3332m = true;
                if (booleanValue) {
                    this.f3329j.add(next.mo12012a());
                } else {
                    this.f3331l = false;
                }
            }
            hashMap.put(fVar, new C1882z(this, next, booleanValue));
        }
        if (this.f3332m) {
            this.f3337r.f3420i = Integer.valueOf(System.identityHashCode(this.f3320a.f3288m));
            C1810e0 e0Var = new C1810e0(this, (C1873w) null);
            C1770a.C1771a<? extends C3412e, C3397a> aVar = this.f3339t;
            Context context = this.f3322c;
            Looper looper = this.f3320a.f3288m.f3241g;
            C1905d dVar = this.f3337r;
            this.f3330k = (C3412e) aVar.mo12013a(context, looper, dVar, dVar.f3418g, e0Var, e0Var);
        }
        this.f3327h = this.f3320a.f3281f.size();
        this.f3340u.add(C1856q0.f3292a.submit(new C1879y(this, hashMap)));
    }

    /* renamed from: b */
    public final boolean mo12118b() {
        mo12174j();
        mo12176m(true);
        this.f3320a.mo12159f((C1754b) null);
        return true;
    }

    /* renamed from: c */
    public final void mo12119c() {
    }

    /* renamed from: d */
    public final <A extends C1770a.C1772b, T extends C1805d<? extends C1789h, A>> T mo12120d(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: e */
    public final boolean mo12170e() {
        C1754b bVar;
        int i = this.f3327h - 1;
        this.f3327h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            C1834j0 j0Var = this.f3320a.f3288m;
            Objects.requireNonNull(j0Var);
            StringWriter stringWriter = new StringWriter();
            j0Var.mo12145i("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
            Log.w("GACConnecting", stringWriter.toString());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            bVar = new C1754b(8, (PendingIntent) null);
        } else {
            bVar = this.f3324e;
            if (bVar == null) {
                return true;
            }
            this.f3320a.f3287l = this.f3325f;
        }
        mo12178p(bVar);
        return false;
    }

    /* renamed from: f */
    public final void mo12171f() {
        if (this.f3327h == 0) {
            if (!this.f3332m || this.f3333n) {
                ArrayList arrayList = new ArrayList();
                this.f3326g = 1;
                this.f3327h = this.f3320a.f3281f.size();
                for (C1770a.C1773c next : this.f3320a.f3281f.keySet()) {
                    if (!this.f3320a.f3282g.containsKey(next)) {
                        arrayList.add(this.f3320a.f3281f.get(next));
                    } else if (mo12170e()) {
                        mo12172h();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f3340u.add(C1856q0.f3292a.submit(new C1806d0(this, arrayList)));
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo12121g(int i) {
        mo12178p(new C1754b(8, (PendingIntent) null));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public final void mo12172h() {
        C1853p0 p0Var = this.f3320a;
        p0Var.f3276a.lock();
        try {
            p0Var.f3288m.mo12147m();
            p0Var.f3286k = new C1864t(p0Var);
            p0Var.f3286k.mo12117a();
            p0Var.f3277b.signalAll();
            p0Var.f3276a.unlock();
            C1856q0.f3292a.execute(new C1873w(this));
            C3412e eVar = this.f3330k;
            if (eVar != null) {
                if (this.f3335p) {
                    eVar.mo14653g(this.f3334o, this.f3336q);
                }
                mo12176m(false);
            }
            for (C1770a.C1773c<?> cVar : this.f3320a.f3282g.keySet()) {
                this.f3320a.f3281f.get(cVar).mo12017b();
            }
            this.f3320a.f3289n.mo12049a(this.f3328i.isEmpty() ? null : this.f3328i);
        } catch (Throwable th) {
            p0Var.f3276a.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    public final void mo12173i() {
        this.f3332m = false;
        this.f3320a.f3288m.f3250p = Collections.emptySet();
        for (C1770a.C1773c next : this.f3329j) {
            if (!this.f3320a.f3282g.containsKey(next)) {
                this.f3320a.f3282g.put(next, new C1754b(17, (PendingIntent) null));
            }
        }
    }

    /* renamed from: j */
    public final void mo12174j() {
        ArrayList<Future<?>> arrayList = this.f3340u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.f3340u.clear();
    }

    /* renamed from: k */
    public final void mo12122k(Bundle bundle) {
        if (mo12177n(1)) {
            if (bundle != null) {
                this.f3328i.putAll(bundle);
            }
            if (mo12170e()) {
                mo12172h();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r8 != false) goto L_0x0023;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12175l(p005b.p096l.p097a.p113c.p119b.C1754b r6, p005b.p096l.p097a.p113c.p119b.p120l.C1770a<?> r7, boolean r8) {
        /*
            r5 = this;
            b.l.a.c.b.l.a$a<?, O> r0 = r7.f3124a
            java.util.Objects.requireNonNull(r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L_0x0023
            boolean r8 = r6.mo11985V()
            if (r8 == 0) goto L_0x0014
        L_0x0012:
            r8 = r2
            goto L_0x0021
        L_0x0014:
            b.l.a.c.b.f r8 = r5.f3323d
            int r3 = r6.f3095h
            r4 = 0
            android.content.Intent r8 = r8.mo12003a(r4, r3, r4)
            if (r8 == 0) goto L_0x0020
            goto L_0x0012
        L_0x0020:
            r8 = r1
        L_0x0021:
            if (r8 == 0) goto L_0x002c
        L_0x0023:
            b.l.a.c.b.b r8 = r5.f3324e
            if (r8 == 0) goto L_0x002b
            int r8 = r5.f3325f
            if (r0 >= r8) goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            if (r1 == 0) goto L_0x0032
            r5.f3324e = r6
            r5.f3325f = r0
        L_0x0032:
            b.l.a.c.b.l.k.p0 r8 = r5.f3320a
            java.util.Map<b.l.a.c.b.l.a$c<?>, b.l.a.c.b.b> r8 = r8.f3282g
            b.l.a.c.b.l.a$c r7 = r7.mo12012a()
            r8.put(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1876x.mo12175l(b.l.a.c.b.b, b.l.a.c.b.l.a, boolean):void");
    }

    /* renamed from: m */
    public final void mo12176m(boolean z) {
        C3412e eVar = this.f3330k;
        if (eVar != null) {
            if (eVar.mo12016a() && z) {
                this.f3330k.mo14652d();
            }
            this.f3330k.mo12017b();
            if (this.f3337r.f3419h) {
                this.f3330k = null;
            }
            this.f3334o = null;
        }
    }

    /* renamed from: n */
    public final boolean mo12177n(int i) {
        if (this.f3326g == i) {
            return true;
        }
        C1834j0 j0Var = this.f3320a.f3288m;
        Objects.requireNonNull(j0Var);
        StringWriter stringWriter = new StringWriter();
        j0Var.mo12145i("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        Log.w("GACConnecting", stringWriter.toString());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GACConnecting", sb.toString());
        int i2 = this.f3327h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        Log.w("GACConnecting", sb2.toString());
        int i3 = this.f3326g;
        String str = "UNKNOWN";
        String str2 = i3 != 0 ? i3 != 1 ? str : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        if (i == 0) {
            str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        } else if (i == 1) {
            str = "STEP_GETTING_REMOTE_SERVICE";
        }
        StringBuilder sb3 = new StringBuilder(str.length() + str2.length() + 70);
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(str2);
        sb3.append(" but received callback for step ");
        sb3.append(str);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        mo12178p(new C1754b(8, (PendingIntent) null));
        return false;
    }

    /* renamed from: o */
    public final void mo12123o(C1754b bVar, C1770a<?> aVar, boolean z) {
        if (mo12177n(1)) {
            mo12175l(bVar, aVar, z);
            if (mo12170e()) {
                mo12172h();
            }
        }
    }

    /* renamed from: p */
    public final void mo12178p(C1754b bVar) {
        mo12174j();
        mo12176m(!bVar.mo11985V());
        this.f3320a.mo12159f(bVar);
        this.f3320a.f3289n.mo12050b(bVar);
    }
}
