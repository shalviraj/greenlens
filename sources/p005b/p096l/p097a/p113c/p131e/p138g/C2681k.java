package p005b.p096l.p097a.p113c.p131e.p138g;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1830j;
import p005b.p096l.p097a.p113c.p141f.C3049a;

/* renamed from: b.l.a.c.e.g.k */
public final class C2681k {

    /* renamed from: a */
    public final C2694x<C2679i> f4563a;

    /* renamed from: b */
    public final Context f4564b;

    /* renamed from: c */
    public boolean f4565c = false;

    /* renamed from: d */
    public final Map<C1830j.C1831a<C3049a>, C2684n> f4566d = new HashMap();

    /* renamed from: e */
    public final Map<C1830j.C1831a<Object>, C2683m> f4567e = new HashMap();

    /* renamed from: f */
    public final Map<C1830j.C1831a<Object>, C2682l> f4568f = new HashMap();

    public C2681k(Context context, C2694x<C2679i> xVar) {
        this.f4564b = context;
        this.f4563a = xVar;
    }

    /* renamed from: a */
    public final void mo13176a() {
        synchronized (this.f4566d) {
            for (C2684n next : this.f4566d.values()) {
                if (next != null) {
                    ((C2679i) this.f4563a.mo13191b()).mo13175p0(C2690t.m4525V(next, (C2676f) null));
                }
            }
            this.f4566d.clear();
        }
        synchronized (this.f4568f) {
            for (C2682l next2 : this.f4568f.values()) {
                if (next2 != null) {
                    ((C2679i) this.f4563a.mo13191b()).mo13175p0(new C2690t(2, (C2688r) null, (IBinder) null, (PendingIntent) null, next2, (IBinder) null));
                }
            }
            this.f4568f.clear();
        }
        synchronized (this.f4567e) {
            for (C2683m next3 : this.f4567e.values()) {
                if (next3 != null) {
                    ((C2679i) this.f4563a.mo13191b()).mo13173d1(new C2667a0(2, (C2695y) null, next3, (IBinder) null));
                }
            }
            this.f4567e.clear();
        }
    }

    /* renamed from: b */
    public final void mo13177b(LocationRequest locationRequest, C1830j<C3049a> jVar, C2676f fVar) {
        C2684n nVar;
        C1830j<C3049a> jVar2 = jVar;
        this.f4563a.mo13190a();
        synchronized (this.f4566d) {
            C2684n nVar2 = this.f4566d.get(jVar2.f3232c);
            if (nVar2 == null) {
                nVar2 = new C2684n(jVar2);
            }
            nVar = nVar2;
            this.f4566d.put(jVar2.f3232c, nVar);
        }
        ((C2679i) this.f4563a.mo13191b()).mo13175p0(new C2690t(1, new C2688r(locationRequest, C2688r.f4572n, (String) null, false, false, false, (String) null), nVar, (PendingIntent) null, (IBinder) null, fVar != null ? fVar.asBinder() : null));
    }

    /* renamed from: c */
    public final void mo13178c() {
        if (this.f4565c) {
            this.f4563a.mo13190a();
            ((C2679i) this.f4563a.mo13191b()).mo13174h0(false);
            this.f4565c = false;
        }
    }
}
