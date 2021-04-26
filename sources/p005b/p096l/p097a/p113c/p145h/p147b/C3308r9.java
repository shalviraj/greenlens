package p005b.p096l.p097a.p113c.p145h.p147b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p005b.p096l.p097a.p113c.p131e.p140i.C3035yb;

/* renamed from: b.l.a.c.h.b.r9 */
public final class C3308r9 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3035yb f5933g;

    /* renamed from: h */
    public final /* synthetic */ String f5934h;

    /* renamed from: i */
    public final /* synthetic */ String f5935i;

    /* renamed from: j */
    public final /* synthetic */ AppMeasurementDynamiteService f5936j;

    public C3308r9(AppMeasurementDynamiteService appMeasurementDynamiteService, C3035yb ybVar, String str, String str2) {
        this.f5936j = appMeasurementDynamiteService;
        this.f5933g = ybVar;
        this.f5934h = str;
        this.f5935i = str2;
    }

    public final void run() {
        C3175f8 z = this.f5936j.f11364a.mo14473z();
        C3035yb ybVar = this.f5933g;
        String str = this.f5934h;
        String str2 = this.f5935i;
        z.mo14126h();
        z.mo14065i();
        z.mo14224t(new C3361w7(z, str, str2, z.mo14226v(false), ybVar));
    }
}
