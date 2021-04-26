package p005b.p006a.p007a.p021l;

import android.content.Context;
import com.wuman.android.auth.AuthorizationFlow;
import java.io.IOException;
import p005b.p006a.p007a.p023n.C0817f;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p038f.p039a.C0849e;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p298d.p344x.p346c.C6888i;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.l.c */
public final class C0788c implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C0785b f579g;

    public C0788c(C0785b bVar) {
        this.f579g = bVar;
    }

    public final void run() {
        try {
            C0785b bVar = this.f579g;
            AuthorizationFlow authorizationFlow = bVar.f569f;
            Long l = null;
            C3663f loadCredential = authorizationFlow != null ? authorizationFlow.loadCredential(bVar.f568e) : null;
            if (loadCredential != null) {
                C0817f fVar = C0817f.f641b;
                StringBuilder sb = new StringBuilder();
                Context a = C0849e.m505a();
                C6888i.m12437d(a, "appContext()");
                sb.append(a.getPackageName());
                sb.append(C0823f.m332B());
                sb.append("app_oauth_token");
                loadCredential.setAccessToken(C0817f.m294b(sb.toString()));
            }
            if (loadCredential != null) {
                C0817f fVar2 = C0817f.f641b;
                StringBuilder sb2 = new StringBuilder();
                Context a2 = C0849e.m505a();
                C6888i.m12437d(a2, "appContext()");
                sb2.append(a2.getPackageName());
                sb2.append(C0823f.m332B());
                sb2.append("refreshToken");
                loadCredential.setRefreshToken(C0817f.m294b(sb2.toString()));
            }
            if (loadCredential != null) {
                C0817f fVar3 = C0817f.f641b;
                StringBuilder sb3 = new StringBuilder();
                Context a3 = C0849e.m505a();
                C6888i.m12437d(a3, "appContext()");
                sb3.append(a3.getPackageName());
                sb3.append(C0823f.m332B());
                sb3.append("expirationTimeMilliseconds");
                String b = C0817f.m294b(sb3.toString());
                if (b != null) {
                    l = Long.valueOf(Long.parseLong(b));
                }
                loadCredential.setExpirationTimeMilliseconds(l);
            }
            if (loadCredential != null) {
                loadCredential.refreshToken();
            }
        } catch (IOException e) {
            C8091a.f16272d.mo26044b("Error refreshing token: %s", e.toString());
        }
    }
}
