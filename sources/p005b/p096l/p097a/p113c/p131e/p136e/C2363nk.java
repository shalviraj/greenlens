package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amplitude.api.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;

/* renamed from: b.l.a.c.e.e.nk */
public final class C2363nk extends C1948a implements C2577wi<C2363nk> {
    public static final Parcelable.Creator<C2363nk> CREATOR = new C2387ok();

    /* renamed from: l */
    public static final String f4102l = C2363nk.class.getSimpleName();

    /* renamed from: g */
    public String f4103g;

    /* renamed from: h */
    public String f4104h;

    /* renamed from: i */
    public Long f4105i;

    /* renamed from: j */
    public String f4106j;

    /* renamed from: k */
    public Long f4107k;

    public C2363nk() {
        this.f4107k = Long.valueOf(System.currentTimeMillis());
    }

    public C2363nk(String str, String str2, Long l, String str3) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f4103g = str;
        this.f4104h = str2;
        this.f4105i = l;
        this.f4106j = str3;
        this.f4107k = valueOf;
    }

    public C2363nk(String str, String str2, Long l, String str3, Long l2) {
        this.f4103g = str;
        this.f4104h = str2;
        this.f4105i = l;
        this.f4106j = str3;
        this.f4107k = l2;
    }

    /* renamed from: X */
    public static C2363nk m3834X(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C2363nk nkVar = new C2363nk();
            nkVar.f4103g = jSONObject.optString("refresh_token", (String) null);
            nkVar.f4104h = jSONObject.optString("access_token", (String) null);
            nkVar.f4105i = Long.valueOf(jSONObject.optLong("expires_in"));
            nkVar.f4106j = jSONObject.optString("token_type", (String) null);
            nkVar.f4107k = Long.valueOf(jSONObject.optLong("issued_at"));
            return nkVar;
        } catch (JSONException e) {
            Log.d(f4102l, "Failed to read GetTokenResponse from JSONObject");
            throw new C2034ac(e);
        }
    }

    /* renamed from: V */
    public final boolean mo12843V() {
        return System.currentTimeMillis() + Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS < (this.f4105i.longValue() * 1000) + this.f4107k.longValue();
    }

    /* renamed from: W */
    public final String mo12844W() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f4103g);
            jSONObject.put("access_token", this.f4104h);
            jSONObject.put("expires_in", this.f4105i);
            jSONObject.put("token_type", this.f4106j);
            jSONObject.put("issued_at", this.f4107k);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d(f4102l, "Failed to convert GetTokenResponse to JSON");
            throw new C2034ac(e);
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4103g = C1963g.m2880a(jSONObject.optString("refresh_token"));
            this.f4104h = C1963g.m2880a(jSONObject.optString("access_token"));
            this.f4105i = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.f4106j = C1963g.m2880a(jSONObject.optString("token_type"));
            this.f4107k = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f4102l, str);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 2, this.f4103g, false);
        C0823f.m395s0(parcel, 3, this.f4104h, false);
        Long l = this.f4105i;
        C0823f.m391q0(parcel, 4, Long.valueOf(l == null ? 0 : l.longValue()), false);
        C0823f.m395s0(parcel, 5, this.f4106j, false);
        C0823f.m391q0(parcel, 6, Long.valueOf(this.f4107k.longValue()), false);
        C0823f.m331A0(parcel, w0);
    }
}
