package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.z3 */
public final class C3390z3 {

    /* renamed from: a */
    public final String f6140a;

    /* renamed from: b */
    public final String f6141b;

    /* renamed from: c */
    public final String f6142c;

    /* renamed from: d */
    public final long f6143d;

    /* renamed from: e */
    public final /* synthetic */ C3135c4 f6144e;

    public /* synthetic */ C3390z3(C3135c4 c4Var, long j) {
        this.f6144e = c4Var;
        C0823f.m376j("health_monitor");
        C0823f.m360b(j > 0);
        this.f6140a = "health_monitor:start";
        this.f6141b = "health_monitor:count";
        this.f6142c = "health_monitor:value";
        this.f6143d = j;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14641a() {
        this.f6144e.mo14126h();
        Objects.requireNonNull((C1959c) this.f6144e.f5638a.f5855n);
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f6144e.mo14143o().edit();
        edit.remove(this.f6141b);
        edit.remove(this.f6142c);
        edit.putLong(this.f6140a, currentTimeMillis);
        edit.apply();
    }
}
