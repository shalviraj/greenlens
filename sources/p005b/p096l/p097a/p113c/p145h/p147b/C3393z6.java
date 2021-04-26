package p005b.p096l.p097a.p113c.p145h.p147b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.C1763f;
import p005b.p096l.p097a.p113c.p131e.p140i.C3035yb;

/* renamed from: b.l.a.c.h.b.z6 */
public final class C3393z6 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3035yb f6149g;

    /* renamed from: h */
    public final /* synthetic */ C3309s f6150h;

    /* renamed from: i */
    public final /* synthetic */ String f6151i;

    /* renamed from: j */
    public final /* synthetic */ AppMeasurementDynamiteService f6152j;

    public C3393z6(AppMeasurementDynamiteService appMeasurementDynamiteService, C3035yb ybVar, C3309s sVar, String str) {
        this.f6152j = appMeasurementDynamiteService;
        this.f6149g = ybVar;
        this.f6150h = sVar;
        this.f6151i = str;
    }

    public final void run() {
        C3175f8 z = this.f6152j.f11364a.mo14473z();
        C3035yb ybVar = this.f6149g;
        C3309s sVar = this.f6150h;
        String str = this.f6151i;
        z.mo14126h();
        z.mo14065i();
        C3297q9 t = z.f5638a.mo14467t();
        Objects.requireNonNull(t);
        if (C1763f.f3113b.mo12004b(t.f5638a.f5842a, 12451000) != 0) {
            z.f5638a.mo14329d().f5802i.mo14414a("Not bundling data. Service unavailable or out of date");
            z.f5638a.mo14467t().mo14528S(ybVar, new byte[0]);
            return;
        }
        z.mo14224t(new C3284p7(z, sVar, str, ybVar));
    }
}
