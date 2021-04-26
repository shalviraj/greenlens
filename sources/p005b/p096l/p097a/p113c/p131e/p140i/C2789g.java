package p005b.p096l.p097a.p113c.p131e.p140i;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p129c.C1984d;

/* renamed from: b.l.a.c.e.i.g */
public final class C2789g extends C2997w {

    /* renamed from: k */
    public final /* synthetic */ String f4732k;

    /* renamed from: l */
    public final /* synthetic */ String f4733l;

    /* renamed from: m */
    public final /* synthetic */ Context f4734m;

    /* renamed from: n */
    public final /* synthetic */ Bundle f4735n;

    /* renamed from: o */
    public final /* synthetic */ C2790g0 f4736o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2789g(C2790g0 g0Var, String str, String str2, Context context, Bundle bundle) {
        super(g0Var, true);
        this.f4736o = g0Var;
        this.f4732k = str;
        this.f4733l = str2;
        this.f4734m = context;
        this.f4735n = bundle;
    }

    /* renamed from: a */
    public final void mo13214a() {
        String str;
        String str2;
        String str3;
        try {
            C2996vb vbVar = null;
            if (C2790g0.m4764b(this.f4732k, this.f4733l)) {
                str = this.f4733l;
                str2 = this.f4732k;
                str3 = this.f4736o.f4738a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            Objects.requireNonNull(this.f4734m, "null reference");
            C2790g0 g0Var = this.f4736o;
            Context context = this.f4734m;
            Objects.requireNonNull(g0Var);
            try {
                vbVar = C2983ub.asInterface(DynamiteModule.m10395c(context, DynamiteModule.f11311k, ModuleDescriptor.MODULE_ID).mo18876b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.C5474a e) {
                g0Var.mo13337a(e, true, false);
            }
            g0Var.f4745h = vbVar;
            if (this.f4736o.f4745h == null) {
                Log.w(this.f4736o.f4738a, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m10394a(this.f4734m, ModuleDescriptor.MODULE_ID);
            int d = DynamiteModule.m10396d(this.f4734m, ModuleDescriptor.MODULE_ID, false);
            C2775ec ecVar = new C2775ec(39065, (long) Math.max(a, d), d < a, str3, str2, str, this.f4735n, C1960d.m2795f1(this.f4734m));
            C2996vb vbVar2 = this.f4736o.f4745h;
            Objects.requireNonNull(vbVar2, "null reference");
            vbVar2.initialize(new C1984d(this.f4734m), ecVar, this.f5094g);
        } catch (Exception e2) {
            this.f4736o.mo13337a(e2, true, false);
        }
    }
}
