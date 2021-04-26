package p005b.p096l.p097a.p113c.p131e.p136e;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.pk */
public final class C2411pk {

    /* renamed from: a */
    public Long f4207a;

    /* renamed from: b */
    public Long f4208b;

    /* renamed from: a */
    public static C2411pk m4012a(String str) {
        try {
            C2411pk pkVar = new C2411pk();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            pkVar.f4207a = Long.valueOf(jSONObject.optLong("iat"));
            pkVar.f4208b = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return pkVar;
        } catch (JSONException e) {
            if (Log.isLoggable("JwtToken", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 41);
                sb.append("Failed to read JwtToken from JSONObject. ");
                sb.append(valueOf);
                Log.d("JwtToken", sb.toString());
            }
            String valueOf2 = String.valueOf(e);
            throw new UnsupportedEncodingException(C0843a.m455p(new StringBuilder(valueOf2.length() + 41), "Failed to read JwtToken from JSONObject. ", valueOf2));
        }
    }
}
