package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.ek */
public final class C2142ek extends C1948a implements C2577wi<C2142ek> {
    public static final Parcelable.Creator<C2142ek> CREATOR = new C2167fk();

    /* renamed from: h */
    public static final String f3829h = C2142ek.class.getSimpleName();

    /* renamed from: g */
    public C2242ik f3830g;

    public C2142ek() {
    }

    public C2142ek(C2242ik ikVar) {
        C2242ik ikVar2;
        if (ikVar == null) {
            ikVar2 = new C2242ik();
        } else {
            List<C2192gk> list = ikVar.f3947g;
            C2242ik ikVar3 = new C2242ik();
            if (list != null && !list.isEmpty()) {
                ikVar3.f3947g.addAll(list);
            }
            ikVar2 = ikVar3;
        }
        this.f3830g = ikVar2;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        C2242ik ikVar;
        int i;
        C2192gk gkVar;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                ikVar = new C2242ik();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z = false;
                        int i2 = 0;
                        while (i2 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                            if (jSONObject2 == null) {
                                gkVar = new C2192gk();
                                i = i2;
                            } else {
                                i = i2;
                                gkVar = new C2192gk(C1963g.m2880a(jSONObject2.optString("localId", (String) null)), C1963g.m2880a(jSONObject2.optString(NotificationCompat.CATEGORY_EMAIL, (String) null)), jSONObject2.optBoolean("emailVerified", z), C1963g.m2880a(jSONObject2.optString("displayName", (String) null)), C1963g.m2880a(jSONObject2.optString("photoUrl", (String) null)), C2555vk.m4322V(jSONObject2.optJSONArray("providerUserInfo")), C1963g.m2880a(jSONObject2.optString("rawPassword", (String) null)), C1963g.m2880a(jSONObject2.optString("phoneNumber", (String) null)), jSONObject2.optLong("createdAt", 0), jSONObject2.optLong("lastLoginAt", 0), false, (C3919n0) null, C2435qk.m4037W(jSONObject2.optJSONArray("mfaInfo")));
                            }
                            arrayList.add(gkVar);
                            i2 = i + 1;
                            z = false;
                        }
                        ikVar = new C2242ik(arrayList);
                    }
                }
                ikVar = new C2242ik(new ArrayList());
            }
            this.f3830g = ikVar;
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f3829h, str2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 2, this.f3830g, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
