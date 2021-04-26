package p005b.p096l.p097a.p113c.p145h.p147b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p005b.p096l.p097a.p113c.p131e.p140i.C3035yb;

/* renamed from: b.l.a.c.h.b.z7 */
public final class C3394z7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3035yb f6153g;

    /* renamed from: h */
    public final /* synthetic */ String f6154h;

    /* renamed from: i */
    public final /* synthetic */ String f6155i;

    /* renamed from: j */
    public final /* synthetic */ boolean f6156j;

    /* renamed from: k */
    public final /* synthetic */ AppMeasurementDynamiteService f6157k;

    public C3394z7(AppMeasurementDynamiteService appMeasurementDynamiteService, C3035yb ybVar, String str, String str2, boolean z) {
        this.f6157k = appMeasurementDynamiteService;
        this.f6153g = ybVar;
        this.f6154h = str;
        this.f6155i = str2;
        this.f6156j = z;
    }

    public final void run() {
        C3175f8 z = this.f6157k.f11364a.mo14473z();
        C3035yb ybVar = this.f6153g;
        String str = this.f6154h;
        String str2 = this.f6155i;
        boolean z2 = this.f6156j;
        z.mo14126h();
        z.mo14065i();
        z.mo14224t(new C3185g7(z, str, str2, z.mo14226v(false), z2, ybVar));
    }
}
