package p005b.p040g.p041a.p042e;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import p005b.p040g.p041a.C0851b;

/* renamed from: b.g.a.e.c */
public class C0856c extends C0851b {

    /* renamed from: g */
    public String f716g;

    /* renamed from: h */
    public String f717h;

    /* renamed from: i */
    public Map<String, Object> f718i;

    public C0856c(String str, int i) {
        super("An error occurred when trying to authenticate with the server.");
        this.f716g = str != null ? "a0.sdk.internal_error.plain" : "a0.sdk.internal_error.empty";
        this.f717h = str == null ? "Empty response body" : str;
    }

    public C0856c(String str, C0851b bVar) {
        super(str, bVar);
    }

    /* renamed from: a */
    public String mo10690a() {
        String str = this.f716g;
        return str != null ? str : "a0.sdk.internal_error.unknown";
    }

    /* renamed from: b */
    public String mo10691b() {
        if (!TextUtils.isEmpty(this.f717h)) {
            return this.f717h;
        }
        if (!"a0.sdk.internal_error.unknown".equals(mo10690a())) {
            return "Failed with unknown error";
        }
        return String.format("Received error with code %s", new Object[]{mo10690a()});
    }

    public C0856c(String str, String str2) {
        super("An error occurred when trying to authenticate with the server.");
        this.f716g = str;
        this.f717h = str2;
    }

    public C0856c(Map<String, Object> map) {
        super("An error occurred when trying to authenticate with the server.");
        String str;
        HashMap hashMap = new HashMap(map);
        this.f718i = hashMap;
        String str2 = (String) (hashMap.containsKey("error") ? this.f718i.get("error") : this.f718i.get("code"));
        this.f716g = str2 == null ? "a0.sdk.internal_error.unknown" : str2;
        if (!this.f718i.containsKey("description")) {
            this.f717h = (String) this.f718i.get("error_description");
            if (!"invalid_request".equals(mo10690a())) {
                return;
            }
            if ("OIDC conformant clients cannot use /oauth/access_token".equals(mo10691b()) || "OIDC conformant clients cannot use /oauth/ro".equals(mo10691b())) {
                Log.w(C0855b.class.getSimpleName(), "Your Auth0 Application is configured as 'OIDC Conformant' but this instance it's not. To authenticate you will need to enable the flag by calling Auth0#setOIDCConformant(true) on the Auth0 instance you used in the setup.");
                return;
            }
            return;
        }
        Object obj = this.f718i.get("description");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            if ("invalid_password".equals(this.f716g) && "PasswordStrengthError".equals(this.f718i.get("name"))) {
                str = new C0858e((Map) obj).f720a;
            } else {
                return;
            }
        }
        this.f717h = str;
    }
}
