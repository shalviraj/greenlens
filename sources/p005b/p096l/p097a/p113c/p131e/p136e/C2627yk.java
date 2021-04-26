package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.yk */
public final class C2627yk extends C1948a implements C2577wi<C2627yk> {
    public static final Parcelable.Creator<C2627yk> CREATOR = new C2651zk();

    /* renamed from: k */
    public static final String f4511k = C2627yk.class.getSimpleName();

    /* renamed from: g */
    public String f4512g;

    /* renamed from: h */
    public String f4513h;

    /* renamed from: i */
    public String f4514i;

    /* renamed from: j */
    public C2435qk f4515j;

    public C2627yk() {
    }

    public C2627yk(String str, String str2, String str3, C2435qk qkVar) {
        this.f4512g = str;
        this.f4513h = str2;
        this.f4514i = str3;
        this.f4515j = qkVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ p005b.p096l.p097a.p113c.p131e.p136e.C2577wi mo12435d(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "mfaInfo"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "email"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1963g.m2880a(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f4512g = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "newEmail"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1963g.m2880a(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f4513h = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "reqType"
            int r4 = r3.optInt(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r6 = "REVERT_SECOND_FACTOR_ADDITION"
            java.lang.String r7 = "VERIFY_AND_CHANGE_EMAIL"
            java.lang.String r8 = "EMAIL_SIGNIN"
            java.lang.String r9 = "RECOVER_EMAIL"
            java.lang.String r10 = "VERIFY_EMAIL"
            java.lang.String r11 = "PASSWORD_RESET"
            r12 = 1
            if (r4 == r12) goto L_0x0047
            switch(r4) {
                case 4: goto L_0x0045;
                case 5: goto L_0x0043;
                case 6: goto L_0x0041;
                case 7: goto L_0x003f;
                case 8: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r4 = 0
            goto L_0x0048
        L_0x003d:
            r4 = r6
            goto L_0x0048
        L_0x003f:
            r4 = r7
            goto L_0x0048
        L_0x0041:
            r4 = r8
            goto L_0x0048
        L_0x0043:
            r4 = r9
            goto L_0x0048
        L_0x0045:
            r4 = r10
            goto L_0x0048
        L_0x0047:
            r4 = r11
        L_0x0048:
            r1.f4514i = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            if (r4 == 0) goto L_0x00a4
            java.lang.String r4 = "requestType"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            int r13 = r4.hashCode()     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r15 = 4
            r5 = 3
            r14 = 2
            switch(r13) {
                case -1874510116: goto L_0x0089;
                case -1452371317: goto L_0x0081;
                case -1341836234: goto L_0x0079;
                case -1099157829: goto L_0x0071;
                case 870738373: goto L_0x0069;
                case 970484929: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0091
        L_0x0061:
            boolean r6 = r4.equals(r9)
            if (r6 == 0) goto L_0x0091
            r6 = r15
            goto L_0x0092
        L_0x0069:
            boolean r6 = r4.equals(r8)
            if (r6 == 0) goto L_0x0091
            r6 = r14
            goto L_0x0092
        L_0x0071:
            boolean r6 = r4.equals(r7)
            if (r6 == 0) goto L_0x0091
            r6 = r5
            goto L_0x0092
        L_0x0079:
            boolean r6 = r4.equals(r10)
            if (r6 == 0) goto L_0x0091
            r6 = 0
            goto L_0x0092
        L_0x0081:
            boolean r6 = r4.equals(r11)
            if (r6 == 0) goto L_0x0091
            r6 = r12
            goto L_0x0092
        L_0x0089:
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0091
            r6 = 5
            goto L_0x0092
        L_0x0091:
            r6 = -1
        L_0x0092:
            if (r6 == 0) goto L_0x00a1
            if (r6 == r12) goto L_0x00a1
            if (r6 == r14) goto L_0x00a1
            if (r6 == r5) goto L_0x00a1
            if (r6 == r15) goto L_0x00a1
            r5 = 5
            if (r6 == r5) goto L_0x00a1
            r5 = 0
            goto L_0x00a2
        L_0x00a1:
            r5 = r4
        L_0x00a2:
            r1.f4514i = r5     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
        L_0x00a4:
            boolean r4 = r3.has(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            if (r4 == 0) goto L_0x00b4
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            b.l.a.c.e.e.qk r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2435qk.m4036V(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f4515j = r0     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
        L_0x00b4:
            return r1
        L_0x00b5:
            r0 = move-exception
            goto L_0x00b8
        L_0x00b7:
            r0 = move-exception
        L_0x00b8:
            java.lang.String r3 = f4511k
            b.l.a.c.e.e.qg r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2701C1(r0, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2627yk.mo12435d(java.lang.String):b.l.a.c.e.e.wi");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 2, this.f4512g, false);
        C0823f.m395s0(parcel, 3, this.f4513h, false);
        C0823f.m395s0(parcel, 4, this.f4514i, false);
        C0823f.m393r0(parcel, 5, this.f4515j, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
