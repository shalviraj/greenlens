package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import java.util.List;

/* renamed from: b.l.a.c.h.b.y6 */
public final class C3382y6 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ Bundle f6121g;

    /* renamed from: h */
    public final /* synthetic */ C3371x6 f6122h;

    /* renamed from: i */
    public final /* synthetic */ C3371x6 f6123i;

    /* renamed from: j */
    public final /* synthetic */ long f6124j;

    /* renamed from: k */
    public final /* synthetic */ C3174f7 f6125k;

    public C3382y6(C3174f7 f7Var, Bundle bundle, C3371x6 x6Var, C3371x6 x6Var2, long j) {
        this.f6125k = f7Var;
        this.f6121g = bundle;
        this.f6122h = x6Var;
        this.f6123i = x6Var2;
        this.f6124j = j;
    }

    public final void run() {
        C3174f7 f7Var = this.f6125k;
        Bundle bundle = this.f6121g;
        C3371x6 x6Var = this.f6122h;
        C3371x6 x6Var2 = this.f6123i;
        long j = this.f6124j;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        f7Var.mo14210m(x6Var, x6Var2, j, true, f7Var.f5638a.mo14467t().mo14553t((String) null, "screen_view", bundle, (List<String>) null, true));
    }
}
