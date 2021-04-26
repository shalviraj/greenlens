package p005b.p096l.p180d.p185o.p189e0;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.d.o.e0.w */
public final class C3898w {
    @VisibleForTesting

    /* renamed from: a */
    public static final Map<String, String> f7182a;

    static {
        HashMap hashMap = new HashMap();
        f7182a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static Status m7286a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map<String, String> map = f7182a;
                if (map.containsKey(string)) {
                    String str2 = map.get(string);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string2).length());
                    sb.append(str2);
                    sb.append(":");
                    sb.append(string2);
                    return C1960d.m2768Y0(sb.toString());
                }
            }
            String valueOf = String.valueOf(str);
            return C1960d.m2768Y0(valueOf.length() != 0 ? "WEB_INTERNAL_ERROR:".concat(valueOf) : new String("WEB_INTERNAL_ERROR:"));
        } catch (JSONException e) {
            String localizedMessage = e.getLocalizedMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(localizedMessage).length());
            C0843a.m431G(sb2, "WEB_INTERNAL_ERROR:", str, "[ ", localizedMessage);
            sb2.append(" ]");
            return C1960d.m2768Y0(sb2.toString());
        }
    }
}
