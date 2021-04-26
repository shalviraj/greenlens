package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Config {

    /* renamed from: a */
    public final String f10963a;

    /* renamed from: b */
    public final String f10964b;

    /* renamed from: c */
    public final String f10965c;

    /* renamed from: d */
    public final String f10966d;

    public Config(String str, String str2, String str3, String str4) {
        this.f10963a = str;
        this.f10964b = str2;
        this.f10965c = str3;
        this.f10966d = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return C6888i.m12434a(this.f10963a, config.f10963a) && C6888i.m12434a(this.f10964b, config.f10964b) && C6888i.m12434a(this.f10965c, config.f10965c) && C6888i.m12434a(this.f10966d, config.f10966d);
    }

    public int hashCode() {
        String str = this.f10963a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10964b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10965c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f10966d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Config(method=");
        u.append(this.f10963a);
        u.append(", url=");
        u.append(this.f10964b);
        u.append(", headers=");
        u.append(this.f10965c);
        u.append(", data=");
        return C0843a.m455p(u, this.f10966d, ")");
    }
}
