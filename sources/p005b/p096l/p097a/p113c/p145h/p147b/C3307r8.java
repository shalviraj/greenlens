package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.r8 */
public final class C3307r8 extends C3232l {

    /* renamed from: e */
    public final /* synthetic */ C3318s8 f5932e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3307r8(C3318s8 s8Var, C3238l5 l5Var) {
        super(l5Var);
        this.f5932e = s8Var;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14385a() {
        C3318s8 s8Var = this.f5932e;
        s8Var.f5963d.mo14126h();
        Objects.requireNonNull((C1959c) s8Var.f5963d.f5638a.f5855n);
        s8Var.mo14587a(false, false, SystemClock.elapsedRealtime());
        C3133c2 g = s8Var.f5963d.f5638a.mo14458g();
        Objects.requireNonNull((C1959c) s8Var.f5963d.f5638a.f5855n);
        g.mo14137k(SystemClock.elapsedRealtime());
    }
}
