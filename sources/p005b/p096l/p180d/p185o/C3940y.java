package p005b.p096l.p180d.p185o;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p131e.p136e.C2034ac;

/* renamed from: b.l.d.o.y */
public class C3940y extends C3930t {
    @RecentlyNonNull
    public static final Parcelable.Creator<C3940y> CREATOR = new C3907h0();

    /* renamed from: g */
    public final String f7216g;

    /* renamed from: h */
    public final String f7217h;

    /* renamed from: i */
    public final long f7218i;

    /* renamed from: j */
    public final String f7219j;

    public C3940y(@RecentlyNonNull String str, String str2, long j, @RecentlyNonNull String str3) {
        C0823f.m376j(str);
        this.f7216g = str;
        this.f7217h = str2;
        this.f7218i = j;
        C0823f.m376j(str3);
        this.f7219j = str3;
    }

    @RecentlyNullable
    /* renamed from: V */
    public JSONObject mo15449V() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f7216g);
            jSONObject.putOpt("displayName", this.f7217h);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f7218i));
            jSONObject.putOpt("phoneNumber", this.f7219j);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new C2034ac(e);
        }
    }

    @SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7216g, false);
        C0823f.m395s0(parcel, 2, this.f7217h, false);
        long j = this.f7218i;
        C0823f.m333B0(parcel, 3, 8);
        parcel.writeLong(j);
        C0823f.m395s0(parcel, 4, this.f7219j, false);
        C0823f.m331A0(parcel, w0);
    }
}
