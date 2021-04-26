package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.qk */
public final class C2435qk extends C1948a {
    public static final Parcelable.Creator<C2435qk> CREATOR = new C2483sk();
    @Nullable

    /* renamed from: g */
    public final String f4238g;
    @NonNull

    /* renamed from: h */
    public final String f4239h;

    /* renamed from: i */
    public final String f4240i;

    /* renamed from: j */
    public final long f4241j;

    public C2435qk(String str, String str2, String str3, long j) {
        this.f4238g = str;
        C0823f.m376j(str2);
        this.f4239h = str2;
        this.f4240i = str3;
        this.f4241j = j;
    }

    /* renamed from: V */
    public static C2435qk m4036V(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString = jSONObject.optString("phoneInfo", (String) null);
        String optString2 = jSONObject.optString("mfaEnrollmentId", (String) null);
        String optString3 = jSONObject.optString("displayName", (String) null);
        long j = 0;
        if (jSONObject.has("enrolledAt") && (optJSONObject = jSONObject.optJSONObject("enrolledAt")) != null && optJSONObject.has("seconds")) {
            j = optJSONObject.optLong("seconds", 0);
        }
        C2435qk qkVar = new C2435qk(optString, optString2, optString3, j);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return qkVar;
    }

    /* renamed from: W */
    public static List<C2435qk> m4037W(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m4036V(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f4238g, false);
        C0823f.m395s0(parcel, 2, this.f4239h, false);
        C0823f.m395s0(parcel, 3, this.f4240i, false);
        long j = this.f4241j;
        C0823f.m333B0(parcel, 4, 8);
        parcel.writeLong(j);
        C0823f.m331A0(parcel, w0);
    }
}
