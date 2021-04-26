package p005b.p096l.p180d.p213v;

import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p097a.p113c.p150j.C3429i;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p181a0.C3822h;

/* renamed from: b.l.d.v.t0 */
public final class C4271t0 implements C4233b {

    /* renamed from: a */
    public final C3825d f7906a;

    /* renamed from: b */
    public final C4264q f7907b;

    /* renamed from: c */
    public final C4276w f7908c;

    /* renamed from: d */
    public final Executor f7909d;

    /* renamed from: e */
    public final C3822h f7910e;

    public C4271t0(C3825d dVar, C4264q qVar, Executor executor, C3822h hVar) {
        dVar.mo15344a();
        C4276w wVar = new C4276w(dVar.f7042a, qVar);
        this.f7906a = dVar;
        this.f7907b = qVar;
        this.f7908c = wVar;
        this.f7909d = executor;
        this.f7910e = hVar;
    }

    /* renamed from: a */
    public final C3428h<Void> mo15813a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        C3428h<String> g = mo15868g(mo15867f(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
        int i = C4250j0.f7867a;
        return g.mo14685g(C4254l0.f7878g, new C4275v0());
    }

    /* renamed from: b */
    public final C3428h<Void> mo15814b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        C3428h<String> g = mo15868g(mo15867f(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
        int i = C4250j0.f7867a;
        return g.mo14685g(C4254l0.f7878g, new C4275v0());
    }

    /* renamed from: c */
    public final boolean mo15815c() {
        return false;
    }

    /* renamed from: d */
    public final C3428h<String> mo15816d(String str, String str2, String str3, String str4) {
        return mo15868g(mo15867f(str, str3, str4, new Bundle()));
    }

    /* renamed from: e */
    public final boolean mo15817e() {
        return this.f7907b.mo15861b() != 0;
    }

    /* renamed from: f */
    public final C3428h<Bundle> mo15867f(String str, String str2, String str3, Bundle bundle) {
        String str4;
        bundle.putString("scope", str3);
        bundle.putString(NotificationCompat.MessagingStyle.Message.KEY_SENDER, str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        C3825d dVar = this.f7906a;
        dVar.mo15344a();
        bundle.putString("gmp_app_id", dVar.f7044c.f7059b);
        bundle.putString("gmsv", Integer.toString(this.f7907b.mo15863d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f7907b.mo15862c());
        C4264q qVar = this.f7907b;
        synchronized (qVar) {
            if (qVar.f7891c == null) {
                qVar.mo15864e();
            }
            str4 = qVar.f7891c;
        }
        bundle.putString("app_ver_name", str4);
        bundle.putString("cliv", "fiid-12451000");
        bundle.putString("Firebase-Client", this.f7910e.mo15341a());
        C3429i iVar = new C3429i();
        this.f7909d.execute(new C4269s0(this, bundle, iVar));
        return iVar.f6197a;
    }

    /* renamed from: g */
    public final C3428h<String> mo15868g(C3428h<Bundle> hVar) {
        return hVar.mo14685g(this.f7909d, new C4273u0(this));
    }
}
