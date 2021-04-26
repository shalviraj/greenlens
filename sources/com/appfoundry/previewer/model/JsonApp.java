package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class JsonApp {

    /* renamed from: a */
    public final String f11018a;

    /* renamed from: b */
    public final String f11019b;

    /* renamed from: c */
    public final String f11020c;

    /* renamed from: d */
    public final App f11021d;

    /* renamed from: e */
    public final Integer f11022e;

    /* renamed from: f */
    public final String f11023f;

    /* renamed from: g */
    public final String f11024g;

    /* renamed from: h */
    public final Long f11025h;

    public JsonApp(String str, String str2, String str3, App app2, Integer num, String str4, String str5, Long l) {
        this.f11018a = str;
        this.f11019b = str2;
        this.f11020c = str3;
        this.f11021d = app2;
        this.f11022e = num;
        this.f11023f = str4;
        this.f11024g = str5;
        this.f11025h = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonApp)) {
            return false;
        }
        JsonApp jsonApp = (JsonApp) obj;
        return C6888i.m12434a(this.f11018a, jsonApp.f11018a) && C6888i.m12434a(this.f11019b, jsonApp.f11019b) && C6888i.m12434a(this.f11020c, jsonApp.f11020c) && C6888i.m12434a(this.f11021d, jsonApp.f11021d) && C6888i.m12434a(this.f11022e, jsonApp.f11022e) && C6888i.m12434a(this.f11023f, jsonApp.f11023f) && C6888i.m12434a(this.f11024g, jsonApp.f11024g) && C6888i.m12434a(this.f11025h, jsonApp.f11025h);
    }

    public int hashCode() {
        String str = this.f11018a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11019b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11020c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        App app2 = this.f11021d;
        int hashCode4 = (hashCode3 + (app2 != null ? app2.hashCode() : 0)) * 31;
        Integer num = this.f11022e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.f11023f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f11024g;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Long l = this.f11025h;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("JsonApp(id=");
        u.append(this.f11018a);
        u.append(", hash=");
        u.append(this.f11019b);
        u.append(", lastUpdate=");
        u.append(this.f11020c);
        u.append(", app=");
        u.append(this.f11021d);
        u.append(", statusCode=");
        u.append(this.f11022e);
        u.append(", message=");
        u.append(this.f11023f);
        u.append(", error=");
        u.append(this.f11024g);
        u.append(", issuedAt=");
        u.append(this.f11025h);
        u.append(")");
        return u.toString();
    }
}
