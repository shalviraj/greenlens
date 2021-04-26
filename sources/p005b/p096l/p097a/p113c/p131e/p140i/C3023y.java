package p005b.p096l.p097a.p113c.p131e.p140i;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p129c.C1984d;

/* renamed from: b.l.a.c.e.i.y */
public final class C3023y extends C2997w {

    /* renamed from: k */
    public final /* synthetic */ Bundle f5144k;

    /* renamed from: l */
    public final /* synthetic */ Activity f5145l;

    /* renamed from: m */
    public final /* synthetic */ C2777f0 f5146m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3023y(C2777f0 f0Var, Bundle bundle, Activity activity) {
        super(f0Var.f4718g, true);
        this.f5146m = f0Var;
        this.f5144k = bundle;
        this.f5145l = activity;
    }

    /* renamed from: a */
    public final void mo13214a() {
        Bundle bundle;
        if (this.f5144k != null) {
            bundle = new Bundle();
            if (this.f5144k.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f5144k.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        C2996vb vbVar = this.f5146m.f4718g.f4745h;
        Objects.requireNonNull(vbVar, "null reference");
        vbVar.onActivityCreated(new C1984d(this.f5145l), bundle, this.f5095h);
    }
}
