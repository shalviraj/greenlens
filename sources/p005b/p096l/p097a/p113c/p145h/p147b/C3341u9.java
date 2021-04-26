package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p005b.p096l.p097a.p113c.p131e.p140i.C2733bc;

/* renamed from: b.l.a.c.h.b.u9 */
public final class C3341u9 implements C3282p5 {

    /* renamed from: a */
    public final C2733bc f6005a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f6006b;

    public C3341u9(AppMeasurementDynamiteService appMeasurementDynamiteService, C2733bc bcVar) {
        this.f6006b = appMeasurementDynamiteService;
        this.f6005a = bcVar;
    }

    /* renamed from: a */
    public final void mo14474a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f6005a.mo13254a0(str, str2, bundle, j);
        } catch (RemoteException e) {
            C3281p4 p4Var = this.f6006b.f11364a;
            if (p4Var != null) {
                p4Var.mo14329d().f5802i.mo14415b("Event listener threw exception", e);
            }
        }
    }
}
