package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.tj */
public final class C2506tj extends C1948a implements C2577wi<C2506tj> {
    public static final Parcelable.Creator<C2506tj> CREATOR = new C2530uj();

    /* renamed from: m */
    public static final String f4315m = C2506tj.class.getSimpleName();

    /* renamed from: g */
    public String f4316g;

    /* renamed from: h */
    public boolean f4317h;

    /* renamed from: i */
    public String f4318i;

    /* renamed from: j */
    public boolean f4319j;

    /* renamed from: k */
    public C2316ll f4320k;

    /* renamed from: l */
    public List<String> f4321l;

    public C2506tj() {
        this.f4320k = new C2316ll((List<String>) null);
    }

    public C2506tj(String str, boolean z, String str2, boolean z2, C2316ll llVar, List<String> list) {
        this.f4316g = str;
        this.f4317h = z;
        this.f4318i = str2;
        this.f4319j = z2;
        this.f4320k = llVar == null ? new C2316ll((List<String>) null) : new C2316ll(llVar.f4050h);
        this.f4321l = list;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4316g = jSONObject.optString("authUri", (String) null);
            this.f4317h = jSONObject.optBoolean("registered", false);
            this.f4318i = jSONObject.optString("providerId", (String) null);
            this.f4319j = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.f4320k = new C2316ll((List<String>) null);
            } else {
                this.f4320k = new C2316ll(1, C1960d.m2811j1(jSONObject.optJSONArray("allProviders")));
            }
            this.f4321l = C1960d.m2811j1(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f4315m, str);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 2, this.f4316g, false);
        boolean z = this.f4317h;
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m395s0(parcel, 4, this.f4318i, false);
        boolean z2 = this.f4319j;
        C0823f.m333B0(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C0823f.m393r0(parcel, 6, this.f4320k, i, false);
        C0823f.m397t0(parcel, 7, this.f4321l, false);
        C0823f.m331A0(parcel, w0);
    }
}
