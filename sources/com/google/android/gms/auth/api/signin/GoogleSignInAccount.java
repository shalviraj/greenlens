package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.segment.analytics.AnalyticsContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p114a.p115a.p117b.C1751b;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

public class GoogleSignInAccount extends C1948a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1751b();

    /* renamed from: g */
    public final int f11247g;

    /* renamed from: h */
    public String f11248h;

    /* renamed from: i */
    public String f11249i;

    /* renamed from: j */
    public String f11250j;

    /* renamed from: k */
    public String f11251k;

    /* renamed from: l */
    public Uri f11252l;

    /* renamed from: m */
    public String f11253m;

    /* renamed from: n */
    public long f11254n;

    /* renamed from: o */
    public String f11255o;

    /* renamed from: p */
    public List<Scope> f11256p;

    /* renamed from: q */
    public String f11257q;

    /* renamed from: r */
    public String f11258r;

    /* renamed from: s */
    public Set<Scope> f11259s = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f11247g = i;
        this.f11248h = str;
        this.f11249i = str2;
        this.f11250j = str3;
        this.f11251k = str4;
        this.f11252l = uri;
        this.f11253m = str5;
        this.f11254n = j;
        this.f11255o = str6;
        this.f11256p = list;
        this.f11257q = str7;
        this.f11258r = str8;
    }

    @Nullable
    /* renamed from: W */
    public static GoogleSignInAccount m10368W(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString(AnalyticsContext.Device.DEVICE_ID_KEY);
        String optString3 = jSONObject.optString("tokenId", (String) null);
        String optString4 = jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null);
        String optString5 = jSONObject.optString("displayName", (String) null);
        String optString6 = jSONObject.optString("givenName", (String) null);
        String optString7 = jSONObject.optString("familyName", (String) null);
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        long longValue = valueOf.longValue();
        C0823f.m376j(string);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, (String) null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        GoogleSignInAccount googleSignInAccount3 = googleSignInAccount;
        googleSignInAccount3.f11253m = jSONObject.optString("serverAuthCode", (String) null);
        return googleSignInAccount3;
    }

    @NonNull
    /* renamed from: V */
    public Set<Scope> mo18843V() {
        HashSet hashSet = new HashSet(this.f11256p);
        hashSet.addAll(this.f11259s);
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f11255o.equals(this.f11255o) && googleSignInAccount.mo18843V().equals(mo18843V());
    }

    public int hashCode() {
        return mo18843V().hashCode() + ((this.f11255o.hashCode() + 527) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f11247g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m395s0(parcel, 2, this.f11248h, false);
        C0823f.m395s0(parcel, 3, this.f11249i, false);
        C0823f.m395s0(parcel, 4, this.f11250j, false);
        C0823f.m395s0(parcel, 5, this.f11251k, false);
        C0823f.m393r0(parcel, 6, this.f11252l, i, false);
        C0823f.m395s0(parcel, 7, this.f11253m, false);
        long j = this.f11254n;
        C0823f.m333B0(parcel, 8, 8);
        parcel.writeLong(j);
        C0823f.m395s0(parcel, 9, this.f11255o, false);
        C0823f.m401v0(parcel, 10, this.f11256p, false);
        C0823f.m395s0(parcel, 11, this.f11257q, false);
        C0823f.m395s0(parcel, 12, this.f11258r, false);
        C0823f.m331A0(parcel, w0);
    }
}
