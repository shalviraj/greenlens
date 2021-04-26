package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.p189e0.C3901z;

/* renamed from: b.l.a.c.e.e.nl */
public final class C2364nl extends C1948a implements C2553vi {
    public static final Parcelable.Creator<C2364nl> CREATOR = new C2388ol();

    /* renamed from: g */
    public String f4108g;

    /* renamed from: h */
    public String f4109h;

    /* renamed from: i */
    public String f4110i;

    /* renamed from: j */
    public String f4111j;

    /* renamed from: k */
    public String f4112k;
    @Nullable

    /* renamed from: l */
    public String f4113l;

    /* renamed from: m */
    public String f4114m;

    /* renamed from: n */
    public String f4115n;

    /* renamed from: o */
    public boolean f4116o;

    /* renamed from: p */
    public boolean f4117p;

    /* renamed from: q */
    public String f4118q;

    /* renamed from: r */
    public String f4119r;

    /* renamed from: s */
    public String f4120s;

    /* renamed from: t */
    public String f4121t;

    /* renamed from: u */
    public boolean f4122u;
    @Nullable

    /* renamed from: v */
    public String f4123v;

    public C2364nl() {
        this.f4116o = true;
        this.f4117p = true;
    }

    public C2364nl(C3901z zVar, String str) {
        Objects.requireNonNull(zVar, "null reference");
        String str2 = zVar.f7185a;
        C0823f.m376j(str2);
        this.f4119r = str2;
        C0823f.m376j(str);
        this.f4120s = str;
        String str3 = zVar.f7187c;
        C0823f.m376j(str3);
        this.f4112k = str3;
        this.f4116o = true;
        StringBuilder u = C0843a.m460u("providerId=");
        u.append(this.f4112k);
        this.f4114m = u.toString();
    }

    public C2364nl(@Nullable String str, @Nullable String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.f4108g = "http://localhost";
        this.f4110i = str;
        this.f4111j = str2;
        this.f4115n = str4;
        this.f4118q = str5;
        this.f4121t = str6;
        this.f4123v = str7;
        this.f4116o = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f4111j) || !TextUtils.isEmpty(this.f4118q)) {
            C0823f.m376j(str3);
            this.f4112k = str3;
            this.f4113l = null;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f4110i)) {
                sb.append("id_token=");
                sb.append(this.f4110i);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f4111j)) {
                sb.append("access_token=");
                sb.append(this.f4111j);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f4113l)) {
                sb.append("identifier=");
                sb.append(this.f4113l);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f4115n)) {
                sb.append("oauth_token_secret=");
                sb.append(this.f4115n);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f4118q)) {
                sb.append("code=");
                sb.append(this.f4118q);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(str8)) {
                sb.append("nonce=");
                sb.append(str8);
                sb.append("&");
            }
            sb.append("providerId=");
            sb.append(this.f4112k);
            this.f4114m = sb.toString();
            this.f4117p = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    public C2364nl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.f4108g = str;
        this.f4109h = str2;
        this.f4110i = str3;
        this.f4111j = str4;
        this.f4112k = str5;
        this.f4113l = str6;
        this.f4114m = str7;
        this.f4115n = str8;
        this.f4116o = z;
        this.f4117p = z2;
        this.f4118q = str9;
        this.f4119r = str10;
        this.f4120s = str11;
        this.f4121t = str12;
        this.f4122u = z3;
        this.f4123v = str13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r1 != null) goto L_0x0052;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo12411a() {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r3.f4117p
            java.lang.String r2 = "autoCreate"
            r0.put(r2, r1)
            boolean r1 = r3.f4116o
            java.lang.String r2 = "returnSecureToken"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f4109h
            if (r1 == 0) goto L_0x001c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x001c:
            java.lang.String r1 = r3.f4114m
            if (r1 == 0) goto L_0x0025
            java.lang.String r2 = "postBody"
            r0.put(r2, r1)
        L_0x0025:
            java.lang.String r1 = r3.f4121t
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x002e:
            java.lang.String r1 = r3.f4123v
            if (r1 == 0) goto L_0x0037
            java.lang.String r2 = "pendingToken"
            r0.put(r2, r1)
        L_0x0037:
            java.lang.String r1 = r3.f4119r
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = r3.f4119r
            java.lang.String r2 = "sessionId"
            r0.put(r2, r1)
        L_0x0046:
            java.lang.String r1 = r3.f4120s
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "requestUri"
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = r3.f4120s
        L_0x0052:
            r0.put(r2, r1)
            goto L_0x005b
        L_0x0056:
            java.lang.String r1 = r3.f4108g
            if (r1 == 0) goto L_0x005b
            goto L_0x0052
        L_0x005b:
            boolean r1 = r3.f4122u
            java.lang.String r2 = "returnIdpCredential"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2364nl.mo12411a():java.lang.String");
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 2, this.f4108g, false);
        C0823f.m395s0(parcel, 3, this.f4109h, false);
        C0823f.m395s0(parcel, 4, this.f4110i, false);
        C0823f.m395s0(parcel, 5, this.f4111j, false);
        C0823f.m395s0(parcel, 6, this.f4112k, false);
        C0823f.m395s0(parcel, 7, this.f4113l, false);
        C0823f.m395s0(parcel, 8, this.f4114m, false);
        C0823f.m395s0(parcel, 9, this.f4115n, false);
        boolean z = this.f4116o;
        C0823f.m333B0(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f4117p;
        C0823f.m333B0(parcel, 11, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C0823f.m395s0(parcel, 12, this.f4118q, false);
        C0823f.m395s0(parcel, 13, this.f4119r, false);
        C0823f.m395s0(parcel, 14, this.f4120s, false);
        C0823f.m395s0(parcel, 15, this.f4121t, false);
        boolean z3 = this.f4122u;
        C0823f.m333B0(parcel, 16, 4);
        parcel.writeInt(z3 ? 1 : 0);
        C0823f.m395s0(parcel, 17, this.f4123v, false);
        C0823f.m331A0(parcel, w0);
    }
}
