package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.appfoundry.previewer.constants.AnimationStrength;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p125o.C1956a;
import p005b.p096l.p097a.p113c.p131e.p140i.C2819i3;

/* renamed from: b.l.a.c.h.b.d4 */
public final class C3147d4 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C2819i3 f5460g;

    /* renamed from: h */
    public final /* synthetic */ ServiceConnection f5461h;

    /* renamed from: i */
    public final /* synthetic */ C3159e4 f5462i;

    public C3147d4(C3159e4 e4Var, C2819i3 i3Var, ServiceConnection serviceConnection) {
        this.f5462i = e4Var;
        this.f5460g = i3Var;
        this.f5461h = serviceConnection;
    }

    public final void run() {
        C3247m3 m3Var;
        String str;
        C3159e4 e4Var = this.f5462i;
        C3171f4 f4Var = e4Var.f5485b;
        String str2 = e4Var.f5484a;
        C2819i3 i3Var = this.f5460g;
        ServiceConnection serviceConnection = this.f5461h;
        f4Var.f5505a.mo14331f().mo14126h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str2);
        Bundle bundle2 = null;
        try {
            Bundle L0 = i3Var.mo13384L0(bundle);
            if (L0 == null) {
                f4Var.f5505a.mo14329d().f5799f.mo14414a("Install Referrer Service returned a null response");
            } else {
                bundle2 = L0;
            }
        } catch (Exception e) {
            f4Var.f5505a.mo14329d().f5799f.mo14415b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        f4Var.f5505a.mo14331f().mo14126h();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                m3Var = f4Var.f5505a.mo14329d().f5802i;
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    m3Var = f4Var.f5505a.mo14329d().f5799f;
                    str = "No referrer defined in Install Referrer response";
                } else {
                    f4Var.f5505a.mo14329d().f5807n.mo14415b("InstallReferrer API result", string);
                    Bundle g0 = f4Var.f5505a.mo14467t().mo14536g0(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (g0 == null) {
                        m3Var = f4Var.f5505a.mo14329d().f5799f;
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = g0.getString(AnimationStrength.MEDIUM);
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                m3Var = f4Var.f5505a.mo14329d().f5799f;
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                g0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == f4Var.f5505a.mo14464q().f5426f.mo14633a()) {
                            m3Var = f4Var.f5505a.mo14329d().f5807n;
                            str = "Install Referrer campaign has already been logged";
                        } else if (f4Var.f5505a.mo14460j()) {
                            f4Var.f5505a.mo14464q().f5426f.mo14634b(j);
                            f4Var.f5505a.mo14329d().f5807n.mo14415b("Logging Install Referrer campaign from sdk with ", "referrer API");
                            g0.putString("_cis", "referrer API");
                            f4Var.f5505a.mo14466s().mo14493A("auto", "_cmp", g0);
                        }
                    }
                }
            }
            m3Var.mo14414a(str);
        }
        C1956a b = C1956a.m2685b();
        Context context = f4Var.f5505a.f5842a;
        Objects.requireNonNull(b);
        context.unbindService(serviceConnection);
    }
}
