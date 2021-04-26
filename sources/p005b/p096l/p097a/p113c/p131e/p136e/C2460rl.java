package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;

/* renamed from: b.l.a.c.e.e.rl */
public final class C2460rl extends C1948a implements C2577wi<C2460rl> {
    public static final Parcelable.Creator<C2460rl> CREATOR = new C2508tl();

    /* renamed from: k */
    public static final String f4268k = C2460rl.class.getSimpleName();

    /* renamed from: g */
    public String f4269g;

    /* renamed from: h */
    public String f4270h;

    /* renamed from: i */
    public long f4271i;

    /* renamed from: j */
    public boolean f4272j;

    public C2460rl() {
    }

    public C2460rl(String str, String str2, long j, boolean z) {
        this.f4269g = str;
        this.f4270h = str2;
        this.f4271i = j;
        this.f4272j = z;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4269g = C1963g.m2880a(jSONObject.optString("idToken", (String) null));
            this.f4270h = C1963g.m2880a(jSONObject.optString("refreshToken", (String) null));
            this.f4271i = jSONObject.optLong("expiresIn", 0);
            this.f4272j = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f4268k, str);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 2, this.f4269g, false);
        C0823f.m395s0(parcel, 3, this.f4270h, false);
        long j = this.f4271i;
        C0823f.m333B0(parcel, 4, 8);
        parcel.writeLong(j);
        boolean z = this.f4272j;
        C0823f.m333B0(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m331A0(parcel, w0);
    }
}
