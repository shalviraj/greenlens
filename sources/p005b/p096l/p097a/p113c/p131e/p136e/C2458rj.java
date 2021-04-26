package p005b.p096l.p097a.p113c.p131e.p136e;

import android.util.Log;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.rj */
public final class C2458rj implements C2577wi<C2458rj> {

    /* renamed from: h */
    public static final String f4265h = "b.l.a.c.e.e.rj";

    /* renamed from: g */
    public String f4266g;

    /* renamed from: a */
    public final C2458rj mo12980a(@NonNull String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f4266g = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e) {
            String str2 = f4265h;
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52 + String.valueOf(message).length());
            sb.append("Failed to parse error for string [");
            sb.append(str);
            sb.append("] with exception: ");
            sb.append(message);
            Log.e(str2, sb.toString());
            throw new C2431qg(C0843a.m456q(new StringBuilder(String.valueOf(str).length() + 35), "Failed to parse error for string [", str, "]"), e);
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(@NonNull String str) {
        mo12980a(str);
        return this;
    }
}
