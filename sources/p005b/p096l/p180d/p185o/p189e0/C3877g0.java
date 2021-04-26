package p005b.p096l.p180d.p185o.p189e0;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.segment.analytics.integrations.BasePayload;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p131e.p136e.C2034ac;
import p005b.p096l.p097a.p113c.p131e.p136e.C2192gk;
import p005b.p096l.p097a.p113c.p131e.p136e.C2507tk;
import p005b.p096l.p180d.p185o.C3858b0;

/* renamed from: b.l.d.o.e0.g0 */
public final class C3877g0 extends C1948a implements C3858b0 {
    public static final Parcelable.Creator<C3877g0> CREATOR = new C3879h0();
    @NonNull

    /* renamed from: g */
    public final String f7134g;
    @NonNull

    /* renamed from: h */
    public final String f7135h;
    @Nullable

    /* renamed from: i */
    public final String f7136i;
    @Nullable

    /* renamed from: j */
    public String f7137j;
    @Nullable

    /* renamed from: k */
    public final String f7138k;
    @Nullable

    /* renamed from: l */
    public final String f7139l;

    /* renamed from: m */
    public final boolean f7140m;
    @Nullable

    /* renamed from: n */
    public final String f7141n;

    public C3877g0(C2192gk gkVar, String str) {
        C0823f.m376j("firebase");
        String str2 = gkVar.f3890g;
        C0823f.m376j(str2);
        this.f7134g = str2;
        this.f7135h = "firebase";
        this.f7138k = gkVar.f3891h;
        this.f7136i = gkVar.f3893j;
        Uri parse = !TextUtils.isEmpty(gkVar.f3894k) ? Uri.parse(gkVar.f3894k) : null;
        if (parse != null) {
            this.f7137j = parse.toString();
        }
        this.f7140m = gkVar.f3892i;
        this.f7141n = null;
        this.f7139l = gkVar.f3897n;
    }

    public C3877g0(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z, @Nullable String str7) {
        this.f7134g = str;
        this.f7135h = str2;
        this.f7138k = str3;
        this.f7139l = str4;
        this.f7136i = str5;
        this.f7137j = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(this.f7137j);
        }
        this.f7140m = z;
        this.f7141n = str7;
    }

    @NonNull
    /* renamed from: R */
    public final String mo15365R() {
        return this.f7135h;
    }

    @Nullable
    /* renamed from: V */
    public final String mo15387V() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(BasePayload.USER_ID_KEY, this.f7134g);
            jSONObject.putOpt("providerId", this.f7135h);
            jSONObject.putOpt("displayName", this.f7136i);
            jSONObject.putOpt("photoUrl", this.f7137j);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EMAIL, this.f7138k);
            jSONObject.putOpt("phoneNumber", this.f7139l);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f7140m));
            jSONObject.putOpt("rawUserInfo", this.f7141n);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new C2034ac(e);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7134g, false);
        C0823f.m395s0(parcel, 2, this.f7135h, false);
        C0823f.m395s0(parcel, 3, this.f7136i, false);
        C0823f.m395s0(parcel, 4, this.f7137j, false);
        C0823f.m395s0(parcel, 5, this.f7138k, false);
        C0823f.m395s0(parcel, 6, this.f7139l, false);
        boolean z = this.f7140m;
        C0823f.m333B0(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m395s0(parcel, 8, this.f7141n, false);
        C0823f.m331A0(parcel, w0);
    }

    public C3877g0(C2507tk tkVar) {
        Objects.requireNonNull(tkVar, "null reference");
        this.f7134g = tkVar.f4322g;
        String str = tkVar.f4325j;
        C0823f.m376j(str);
        this.f7135h = str;
        this.f7136i = tkVar.f4323h;
        Uri parse = !TextUtils.isEmpty(tkVar.f4324i) ? Uri.parse(tkVar.f4324i) : null;
        if (parse != null) {
            this.f7137j = parse.toString();
        }
        this.f7138k = tkVar.f4328m;
        this.f7139l = tkVar.f4327l;
        this.f7140m = false;
        this.f7141n = tkVar.f4326k;
    }
}
