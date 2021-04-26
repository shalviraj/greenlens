package p005b.p096l.p097a.p113c.p145h.p147b;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p131e.p140i.C2716a9;

/* renamed from: b.l.a.c.h.b.t8 */
public final class C3329t8 {

    /* renamed from: a */
    public final /* synthetic */ C3340u8 f5983a;

    public C3329t8(C3340u8 u8Var) {
        this.f5983a = u8Var;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14598a() {
        this.f5983a.mo14126h();
        C3135c4 q = this.f5983a.f5638a.mo14464q();
        Objects.requireNonNull((C1959c) this.f5983a.f5638a.f5855n);
        if (q.mo14149u(System.currentTimeMillis())) {
            this.f5983a.f5638a.mo14464q().f5432l.mo14614b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f5983a.f5638a.mo14329d().f5807n.mo14414a("Detected application was in foreground");
                Objects.requireNonNull((C1959c) this.f5983a.f5638a.f5855n);
                mo14600c(System.currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14599b(long j, boolean z) {
        this.f5983a.mo14126h();
        this.f5983a.mo14606l();
        if (this.f5983a.f5638a.mo14464q().mo14149u(j)) {
            this.f5983a.f5638a.mo14464q().f5432l.mo14614b(true);
        }
        this.f5983a.f5638a.mo14464q().f5435o.mo14634b(j);
        if (this.f5983a.f5638a.mo14464q().f5432l.mo14613a()) {
            mo14600c(j, z);
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo14600c(long j, boolean z) {
        this.f5983a.mo14126h();
        if (this.f5983a.f5638a.mo14460j()) {
            this.f5983a.f5638a.mo14464q().f5435o.mo14634b(j);
            Objects.requireNonNull((C1959c) this.f5983a.f5638a.f5855n);
            this.f5983a.f5638a.mo14329d().f5807n.mo14415b("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f5983a.f5638a.mo14466s().mo14501m("auto", "_sid", valueOf, j);
            this.f5983a.f5638a.mo14464q().f5432l.mo14614b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f5983a.f5638a.f5848g.mo14197r((String) null, C3134c3.f5387i0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f5983a.f5638a.mo14466s().mo14494B("auto", "_s", j, bundle);
            C2716a9.m4567b();
            if (this.f5983a.f5638a.f5848g.mo14197r((String) null, C3134c3.f5397n0)) {
                String a = this.f5983a.f5638a.mo14464q().f5440t.mo14127a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f5983a.f5638a.mo14466s().mo14494B("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
