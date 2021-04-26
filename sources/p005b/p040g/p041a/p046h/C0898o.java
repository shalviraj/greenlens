package p005b.p040g.p041a.p046h;

import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import com.segment.analytics.AnalyticsContext;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p040g.p041a.C0851b;
import p005b.p040g.p041a.p042e.C0855b;
import p005b.p040g.p041a.p042e.C0856c;
import p005b.p040g.p041a.p042e.C0857d;
import p005b.p040g.p041a.p044f.C0869a;
import p005b.p040g.p041a.p047i.p048b.C0910c;
import p005b.p040g.p041a.p049j.C0921a;
import p005b.p280p.p285b.C5245o;

/* renamed from: b.g.a.h.o */
public class C0898o {

    /* renamed from: e */
    public static final String f800e = "o";

    /* renamed from: a */
    public final C0855b f801a;

    /* renamed from: b */
    public final String f802b;

    /* renamed from: c */
    public final String f803c;

    /* renamed from: d */
    public final String f804d;

    /* renamed from: b.g.a.h.o$a */
    public class C0899a implements C0869a<C0921a, C0856c> {

        /* renamed from: a */
        public final /* synthetic */ C0882d f805a;

        public C0899a(C0882d dVar) {
            this.f805a = dVar;
        }

        /* renamed from: a */
        public void mo10712a(Object obj) {
            this.f805a.mo10730a((C0921a) obj);
        }

        /* renamed from: b */
        public void mo10713b(C0851b bVar) {
            C0856c cVar = (C0856c) bVar;
            if ("Unauthorized".equals(cVar.mo10691b())) {
                String str = C0898o.f800e;
                StringBuilder u = C0843a.m460u("Unable to complete authentication with PKCE. PKCE support can be enabled by setting Application Type to 'Native' and Token Endpoint Authentication Method to 'None' for this app at 'https://manage.auth0.com/#/applications/");
                u.append(C0898o.this.f801a.f711a.f707a);
                u.append("/settings'.");
                Log.e(str, u.toString());
            }
            this.f805a.mo10731b(cVar);
        }
    }

    public C0898o(@NonNull C0855b bVar, String str) {
        C0879a aVar = new C0879a();
        this.f801a = bVar;
        this.f803c = str;
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 11);
        this.f802b = encodeToString;
        this.f804d = Base64.encodeToString(aVar.mo10728b(aVar.mo10727a(encodeToString)), 11);
    }

    /* renamed from: a */
    public void mo10745a(String str, @NonNull C0882d dVar) {
        C0855b bVar = this.f801a;
        String str2 = this.f803c;
        Objects.requireNonNull(bVar);
        C0857d b = C0857d.m561b();
        String str3 = bVar.f711a.f707a;
        if (str3 == null) {
            b.f719a.remove("client_id");
        } else {
            b.f719a.put("client_id", str3);
        }
        b.f719a.put("grant_type", "authorization_code");
        if (str == null) {
            b.f719a.remove("code");
        } else {
            b.f719a.put("code", str);
        }
        if (str2 == null) {
            b.f719a.remove("redirect_uri");
        } else {
            b.f719a.put("redirect_uri", str2);
        }
        Map<String, Object> a = b.mo10692a();
        C5245o.C5247b k = C5245o.m9723l(bVar.f711a.f708b.f10428i).mo17170k();
        k.mo17176b("oauth");
        k.mo17176b(AnalyticsContext.Device.DEVICE_TOKEN_KEY);
        C0910c cVar = (C0910c) bVar.f714d.mo10751a(k.mo17177c(), bVar.f712b, bVar.f713c, C0921a.class, bVar.f715e);
        cVar.mo10748a(a);
        String str4 = this.f802b;
        C0857d dVar2 = cVar.f819g;
        if (str4 == null) {
            dVar2.f719a.remove("code_verifier");
        } else {
            dVar2.f719a.put("code_verifier", str4);
        }
        cVar.mo10750c(new C0899a(dVar));
    }
}
