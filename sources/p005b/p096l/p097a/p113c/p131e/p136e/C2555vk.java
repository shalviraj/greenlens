package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;

/* renamed from: b.l.a.c.e.e.vk */
public final class C2555vk extends C1948a {
    public static final Parcelable.Creator<C2555vk> CREATOR = new C2579wk();

    /* renamed from: g */
    public final List<C2507tk> f4373g;

    public C2555vk() {
        this.f4373g = new ArrayList();
    }

    public C2555vk(List<C2507tk> list) {
        this.f4373g = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    /* renamed from: V */
    public static C2555vk m4322V(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new C2555vk(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(jSONObject == null ? new C2507tk() : new C2507tk(C1963g.m2880a(jSONObject.optString("federatedId", (String) null)), C1963g.m2880a(jSONObject.optString("displayName", (String) null)), C1963g.m2880a(jSONObject.optString("photoUrl", (String) null)), C1963g.m2880a(jSONObject.optString("providerId", (String) null)), (String) null, C1963g.m2880a(jSONObject.optString("phoneNumber", (String) null)), C1963g.m2880a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null))));
        }
        return new C2555vk(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m401v0(parcel, 2, this.f4373g, false);
        C0823f.m331A0(parcel, w0);
    }
}
