package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import java.util.Map;

/* renamed from: b.l.a.c.h.b.c2 */
public final class C3133c2 extends C3122b3 {

    /* renamed from: b */
    public final Map<String, Long> f5337b = new ArrayMap();

    /* renamed from: c */
    public final Map<String, Integer> f5338c = new ArrayMap();

    /* renamed from: d */
    public long f5339d;

    public C3133c2(C3281p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: i */
    public final void mo14135i(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f5638a.mo14329d().f5799f.mo14414a("Ad unit id must be a non-empty string");
        } else {
            this.f5638a.mo14331f().mo14420q(new C3106a(this, str, j));
        }
    }

    /* renamed from: j */
    public final void mo14136j(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f5638a.mo14329d().f5799f.mo14414a("Ad unit id must be a non-empty string");
        } else {
            this.f5638a.mo14331f().mo14420q(new C3107a0(this, str, j));
        }
    }

    @WorkerThread
    /* renamed from: k */
    public final void mo14137k(long j) {
        C3371x6 p = this.f5638a.mo14472y().mo14213p(false);
        for (String next : this.f5337b.keySet()) {
            mo14139m(next, j - this.f5337b.get(next).longValue(), p);
        }
        if (!this.f5337b.isEmpty()) {
            mo14138l(j - this.f5339d, p);
        }
        mo14140n(j);
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo14138l(long j, C3371x6 x6Var) {
        if (x6Var == null) {
            this.f5638a.mo14329d().f5807n.mo14414a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f5638a.mo14329d().f5807n.mo14415b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C3174f7.m5964r(x6Var, bundle, true);
            this.f5638a.mo14466s().mo14493A("am", "_xa", bundle);
        }
    }

    @WorkerThread
    /* renamed from: m */
    public final void mo14139m(String str, long j, C3371x6 x6Var) {
        if (x6Var == null) {
            this.f5638a.mo14329d().f5807n.mo14414a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f5638a.mo14329d().f5807n.mo14415b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C3174f7.m5964r(x6Var, bundle, true);
            this.f5638a.mo14466s().mo14493A("am", "_xu", bundle);
        }
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo14140n(long j) {
        for (String put : this.f5337b.keySet()) {
            this.f5337b.put(put, Long.valueOf(j));
        }
        if (!this.f5337b.isEmpty()) {
            this.f5339d = j;
        }
    }
}
