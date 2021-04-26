package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.C1763f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p148i.C3397a;
import p005b.p096l.p097a.p113c.p148i.C3412e;

/* renamed from: b.l.a.c.b.l.k.x1 */
public final class C1878x1 implements C1803c1 {

    /* renamed from: a */
    public final Context f3342a;

    /* renamed from: b */
    public final C1834j0 f3343b;

    /* renamed from: c */
    public final C1853p0 f3344c;

    /* renamed from: d */
    public final C1853p0 f3345d;

    /* renamed from: e */
    public final Map<C1770a.C1773c<?>, C1853p0> f3346e;

    /* renamed from: f */
    public final Set<C1845n> f3347f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: g */
    public final C1770a.C1779f f3348g;

    /* renamed from: h */
    public Bundle f3349h;

    /* renamed from: i */
    public C1754b f3350i = null;

    /* renamed from: j */
    public C1754b f3351j = null;

    /* renamed from: k */
    public boolean f3352k = false;

    /* renamed from: l */
    public final Lock f3353l;

    /* renamed from: m */
    public int f3354m = 0;

    public C1878x1(Context context, C1834j0 j0Var, Lock lock, Looper looper, C1763f fVar, Map<C1770a.C1773c<?>, C1770a.C1779f> map, Map<C1770a.C1773c<?>, C1770a.C1779f> map2, C1905d dVar, C1770a.C1771a<? extends C3412e, C3397a> aVar, C1770a.C1779f fVar2, ArrayList<C1875w1> arrayList, ArrayList<C1875w1> arrayList2, Map<C1770a<?>, Boolean> map3, Map<C1770a<?>, Boolean> map4) {
        this.f3342a = context;
        this.f3343b = j0Var;
        this.f3353l = lock;
        this.f3348g = fVar2;
        Context context2 = context;
        C1834j0 j0Var2 = j0Var;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C1763f fVar3 = fVar;
        C1853p0 p0Var = r3;
        C1853p0 p0Var2 = new C1853p0(context2, j0Var2, lock2, looper2, fVar3, map2, (C1905d) null, map4, (C1770a.C1771a<? extends C3412e, C3397a>) null, arrayList2, new C1884z1(this, (C1795a2) null));
        this.f3344c = p0Var;
        this.f3345d = new C1853p0(context2, j0Var2, lock2, looper2, fVar3, map, dVar, map3, aVar, arrayList, new C1799b2(this, (C1795a2) null));
        ArrayMap arrayMap = new ArrayMap();
        for (C1770a.C1773c<?> put : map2.keySet()) {
            arrayMap.put(put, this.f3344c);
        }
        for (C1770a.C1773c<?> put2 : map.keySet()) {
            arrayMap.put(put2, this.f3345d);
        }
        this.f3346e = Collections.unmodifiableMap(arrayMap);
    }

    /* renamed from: g */
    public static void m2562g(C1878x1 x1Var) {
        C1754b bVar;
        C1754b bVar2;
        if (!m2563h(x1Var.f3350i)) {
            if (x1Var.f3350i == null || !m2563h(x1Var.f3351j)) {
                bVar = x1Var.f3350i;
                if (bVar != null && (bVar2 = x1Var.f3351j) != null) {
                    if (x1Var.f3345d.f3287l < x1Var.f3344c.f3287l) {
                        bVar = bVar2;
                    }
                } else {
                    return;
                }
            } else {
                x1Var.f3345d.mo12067b();
                bVar = x1Var.f3350i;
            }
            x1Var.mo12179f(bVar);
        } else if (m2563h(x1Var.f3351j) || x1Var.mo12181j()) {
            int i = x1Var.f3354m;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    x1Var.f3354m = 0;
                }
                x1Var.f3343b.mo12049a(x1Var.f3349h);
            }
            x1Var.mo12180i();
            x1Var.f3354m = 0;
        } else {
            C1754b bVar3 = x1Var.f3351j;
            if (bVar3 == null) {
                return;
            }
            if (x1Var.f3354m == 1) {
                x1Var.mo12180i();
                return;
            }
            x1Var.mo12179f(bVar3);
            x1Var.f3344c.mo12067b();
        }
    }

    /* renamed from: h */
    public static boolean m2563h(C1754b bVar) {
        return bVar != null && bVar.mo11986W();
    }

    /* renamed from: a */
    public final boolean mo12066a() {
        this.f3353l.lock();
        try {
            boolean z = true;
            if (!(this.f3344c.f3286k instanceof C1864t) || (!(this.f3345d.f3286k instanceof C1864t) && !mo12181j() && this.f3354m != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f3353l.unlock();
        }
    }

    /* renamed from: b */
    public final void mo12067b() {
        this.f3351j = null;
        this.f3350i = null;
        this.f3354m = 0;
        this.f3344c.mo12067b();
        this.f3345d.mo12067b();
        mo12180i();
    }

    /* renamed from: c */
    public final void mo12068c() {
        this.f3354m = 2;
        this.f3352k = false;
        this.f3351j = null;
        this.f3350i = null;
        this.f3344c.f3286k.mo12119c();
        this.f3345d.f3286k.mo12119c();
    }

    /* renamed from: d */
    public final <A extends C1770a.C1772b, T extends C1805d<? extends C1789h, A>> T mo12069d(@NonNull T t) {
        C1853p0 p0Var;
        C1770a.C1773c<A> cVar = t.f3158o;
        C0823f.m362c(this.f3346e.containsKey(cVar), "GoogleApiClient is not configured to use the API required for this call.");
        if (!this.f3346e.get(cVar).equals(this.f3345d)) {
            p0Var = this.f3344c;
        } else if (mo12181j()) {
            t.mo12074l(new Status(1, 4, (String) null, this.f3348g == null ? null : PendingIntent.getActivity(this.f3342a, System.identityHashCode(this.f3343b), this.f3348g.mo12029s(), 134217728)));
            return t;
        } else {
            p0Var = this.f3345d;
        }
        return p0Var.mo12069d(t);
    }

    /* renamed from: e */
    public final void mo12070e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f3345d.mo12070e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f3344c.mo12070e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: f */
    public final void mo12179f(C1754b bVar) {
        int i = this.f3354m;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f3354m = 0;
            }
            this.f3343b.mo12050b(bVar);
        }
        mo12180i();
        this.f3354m = 0;
    }

    /* renamed from: i */
    public final void mo12180i() {
        for (C1845n a : this.f3347f) {
            a.mo12154a();
        }
        this.f3347f.clear();
    }

    /* renamed from: j */
    public final boolean mo12181j() {
        C1754b bVar = this.f3351j;
        return bVar != null && bVar.f3095h == 4;
    }
}
