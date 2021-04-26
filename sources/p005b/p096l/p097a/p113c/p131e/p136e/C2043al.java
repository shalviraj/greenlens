package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.al */
public final class C2043al extends C1948a implements C2553vi {
    public static final Parcelable.Creator<C2043al> CREATOR = new C2068bl();

    /* renamed from: g */
    public final String f3604g;

    /* renamed from: h */
    public final long f3605h;

    /* renamed from: i */
    public final boolean f3606i;

    /* renamed from: j */
    public final String f3607j;
    @Nullable

    /* renamed from: k */
    public final String f3608k;
    @Nullable

    /* renamed from: l */
    public final String f3609l;

    /* renamed from: m */
    public final boolean f3610m;

    /* renamed from: n */
    public final String f3611n;
    @Nullable

    /* renamed from: o */
    public C2434qj f3612o;

    public C2043al(String str, long j, boolean z, String str2, @Nullable String str3, @Nullable String str4, boolean z2, @Nullable String str5) {
        C0823f.m376j(str);
        this.f3604g = str;
        this.f3605h = j;
        this.f3606i = z;
        this.f3607j = str2;
        this.f3608k = str3;
        this.f3609l = str4;
        this.f3610m = z2;
        this.f3611n = str5;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.f3604g);
        String str = this.f3608k;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f3609l;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        C2434qj qjVar = this.f3612o;
        if (qjVar != null) {
            jSONObject.put("autoRetrievalInfo", qjVar.mo12930a());
        }
        String str3 = this.f3611n;
        if (str3 != null) {
            jSONObject.put("safetyNetToken", str3);
        }
        return jSONObject.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3604g, false);
        long j = this.f3605h;
        C0823f.m333B0(parcel, 2, 8);
        parcel.writeLong(j);
        boolean z = this.f3606i;
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m395s0(parcel, 4, this.f3607j, false);
        C0823f.m395s0(parcel, 5, this.f3608k, false);
        C0823f.m395s0(parcel, 6, this.f3609l, false);
        boolean z2 = this.f3610m;
        C0823f.m333B0(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C0823f.m395s0(parcel, 8, this.f3611n, false);
        C0823f.m331A0(parcel, w0);
    }
}
