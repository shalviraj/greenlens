package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class AuthSettings {

    /* renamed from: a */
    public final String f10906a;

    /* renamed from: b */
    public final String f10907b;

    /* renamed from: c */
    public final String f10908c;

    /* renamed from: d */
    public final String f10909d;

    /* renamed from: e */
    public final String f10910e;

    /* renamed from: f */
    public final String f10911f;

    /* renamed from: g */
    public final String f10912g;

    /* renamed from: h */
    public final String f10913h;

    /* renamed from: i */
    public final String f10914i;

    public AuthSettings(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f10906a = str;
        this.f10907b = str2;
        this.f10908c = str3;
        this.f10909d = str4;
        this.f10910e = str5;
        this.f10911f = str6;
        this.f10912g = str7;
        this.f10913h = str8;
        this.f10914i = str9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthSettings)) {
            return false;
        }
        AuthSettings authSettings = (AuthSettings) obj;
        return C6888i.m12434a(this.f10906a, authSettings.f10906a) && C6888i.m12434a(this.f10907b, authSettings.f10907b) && C6888i.m12434a(this.f10908c, authSettings.f10908c) && C6888i.m12434a(this.f10909d, authSettings.f10909d) && C6888i.m12434a(this.f10910e, authSettings.f10910e) && C6888i.m12434a(this.f10911f, authSettings.f10911f) && C6888i.m12434a(this.f10912g, authSettings.f10912g) && C6888i.m12434a(this.f10913h, authSettings.f10913h) && C6888i.m12434a(this.f10914i, authSettings.f10914i);
    }

    public int hashCode() {
        String str = this.f10906a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10907b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10908c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f10909d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f10910e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f10911f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f10912g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f10913h;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f10914i;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("AuthSettings(grant=");
        u.append(this.f10906a);
        u.append(", scope=");
        u.append(this.f10907b);
        u.append(", authUrl=");
        u.append(this.f10908c);
        u.append(", clientId=");
        u.append(this.f10909d);
        u.append(", tokenUrl=");
        u.append(this.f10910e);
        u.append(", callbackUrl=");
        u.append(this.f10911f);
        u.append(", clientSecret=");
        u.append(this.f10912g);
        u.append(", json=");
        u.append(this.f10913h);
        u.append(", jsonVision=");
        return C0843a.m455p(u, this.f10914i, ")");
    }
}
