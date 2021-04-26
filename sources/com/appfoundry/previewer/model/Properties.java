package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Properties {

    /* renamed from: a */
    public final String f11089a;

    /* renamed from: b */
    public final String f11090b;

    /* renamed from: c */
    public final String f11091c;

    public Properties(String str, String str2, String str3) {
        this.f11089a = str;
        this.f11090b = str2;
        this.f11091c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Properties)) {
            return false;
        }
        Properties properties = (Properties) obj;
        return C6888i.m12434a(this.f11089a, properties.f11089a) && C6888i.m12434a(this.f11090b, properties.f11090b) && C6888i.m12434a(this.f11091c, properties.f11091c);
    }

    public int hashCode() {
        String str = this.f11089a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11090b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11091c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Properties(icon=");
        u.append(this.f11089a);
        u.append(", link=");
        u.append(this.f11090b);
        u.append(", name=");
        return C0843a.m455p(u, this.f11091c, ")");
    }
}
