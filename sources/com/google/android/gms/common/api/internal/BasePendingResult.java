package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1785e;
import p005b.p096l.p097a.p113c.p119b.p120l.C1787f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p120l.C1790i;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1854p1;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1872v1;
import p005b.p096l.p097a.p113c.p131e.p134c.C2016c;

@KeepName
public abstract class BasePendingResult<R extends C1789h> extends C1785e<R> {

    /* renamed from: n */
    public static final ThreadLocal<Boolean> f11286n = new C1872v1();

    /* renamed from: a */
    public final Object f11287a;

    /* renamed from: b */
    public final C5472a<R> f11288b;

    /* renamed from: c */
    public final WeakReference<GoogleApiClient> f11289c;

    /* renamed from: d */
    public final CountDownLatch f11290d;

    /* renamed from: e */
    public final ArrayList<C1785e.C1786a> f11291e;

    /* renamed from: f */
    public C1790i<? super R> f11292f;

    /* renamed from: g */
    public final AtomicReference<C1854p1> f11293g;

    /* renamed from: h */
    public R f11294h;

    /* renamed from: i */
    public Status f11295i;

    /* renamed from: j */
    public volatile boolean f11296j;

    /* renamed from: k */
    public boolean f11297k;

    /* renamed from: l */
    public boolean f11298l;

    /* renamed from: m */
    public boolean f11299m;
    @KeepName
    public C5473b mResultGuardian;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C5472a<R extends C1789h> extends C2016c {
        public C5472a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C1790i iVar = (C1790i) pair.first;
                C1789h hVar = (C1789h) pair.second;
                try {
                    iVar.mo12040a(hVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m10378g(hVar);
                    throw e;
                }
            } else if (i != 2) {
                Log.wtf("BasePendingResult", C0843a.m438N(45, "Don't know how to handle message: ", i), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo18867h(Status.f11280m);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    public final class C5473b {
        public C5473b(C1872v1 v1Var) {
        }

        public final void finalize() {
            BasePendingResult.m10378g(BasePendingResult.this.f11294h);
            super.finalize();
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f11287a = new Object();
        this.f11290d = new CountDownLatch(1);
        this.f11291e = new ArrayList<>();
        this.f11293g = new AtomicReference<>();
        this.f11299m = false;
        this.f11288b = new C5472a<>(Looper.getMainLooper());
        this.f11289c = new WeakReference<>((Object) null);
    }

    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.f11287a = new Object();
        this.f11290d = new CountDownLatch(1);
        this.f11291e = new ArrayList<>();
        this.f11293g = new AtomicReference<>();
        this.f11299m = false;
        this.f11288b = new C5472a<>(googleApiClient.mo12142f());
        this.f11289c = new WeakReference<>(googleApiClient);
    }

    /* renamed from: g */
    public static void m10378g(C1789h hVar) {
        if (hVar instanceof C1787f) {
            try {
                ((C1787f) hVar).mo12038a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(hVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18862a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11287a
            monitor-enter(r0)
            boolean r1 = r2.f11297k     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x001f
            boolean r1 = r2.f11296j     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            R r1 = r2.f11294h     // Catch:{ all -> 0x0021 }
            m10378g(r1)     // Catch:{ all -> 0x0021 }
            r1 = 1
            r2.f11297k = r1     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f11281n     // Catch:{ all -> 0x0021 }
            b.l.a.c.b.l.h r1 = r2.mo13164b(r1)     // Catch:{ all -> 0x0021 }
            r2.mo18866f(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo18862a():void");
    }

    @NonNull
    /* renamed from: b */
    public abstract R mo13164b(Status status);

    /* renamed from: c */
    public final R mo18863c() {
        R r;
        synchronized (this.f11287a) {
            C0823f.m386o(!this.f11296j, "Result has already been consumed.");
            C0823f.m386o(mo18864d(), "Result is not ready.");
            r = this.f11294h;
            this.f11294h = null;
            this.f11292f = null;
            this.f11296j = true;
        }
        C1854p1 andSet = this.f11293g.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo12155a(this);
        }
        return r;
    }

    /* renamed from: d */
    public final boolean mo18864d() {
        return this.f11290d.getCount() == 0;
    }

    /* renamed from: e */
    public final void mo18865e(R r) {
        synchronized (this.f11287a) {
            if (this.f11298l || this.f11297k) {
                m10378g(r);
                return;
            }
            mo18864d();
            boolean z = true;
            C0823f.m386o(!mo18864d(), "Results have already been set");
            if (this.f11296j) {
                z = false;
            }
            C0823f.m386o(z, "Result has already been consumed");
            mo18866f(r);
        }
    }

    /* renamed from: f */
    public final void mo18866f(R r) {
        this.f11294h = r;
        this.f11290d.countDown();
        this.f11295i = this.f11294h.mo12039w();
        if (this.f11297k) {
            this.f11292f = null;
        } else if (this.f11292f != null) {
            this.f11288b.removeMessages(2);
            C5472a<R> aVar = this.f11288b;
            C1790i<? super R> iVar = this.f11292f;
            C1789h c = mo18863c();
            Objects.requireNonNull(aVar);
            aVar.sendMessage(aVar.obtainMessage(1, new Pair(iVar, c)));
        } else if (this.f11294h instanceof C1787f) {
            this.mResultGuardian = new C5473b((C1872v1) null);
        }
        ArrayList<C1785e.C1786a> arrayList = this.f11291e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1785e.C1786a aVar2 = arrayList.get(i);
            i++;
            aVar2.mo12037a(this.f11295i);
        }
        this.f11291e.clear();
    }

    /* renamed from: h */
    public final void mo18867h(Status status) {
        synchronized (this.f11287a) {
            if (!mo18864d()) {
                mo18865e(mo13164b(status));
                this.f11298l = true;
            }
        }
    }

    /* renamed from: i */
    public final void mo18868i() {
        this.f11299m = this.f11299m || f11286n.get().booleanValue();
    }
}
