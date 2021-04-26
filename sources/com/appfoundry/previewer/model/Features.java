package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Features {

    /* renamed from: a */
    public final Boolean f10995a;

    /* renamed from: b */
    public final Boolean f10996b;

    /* renamed from: c */
    public final Boolean f10997c;

    public Features(Boolean bool, Boolean bool2, Boolean bool3) {
        this.f10995a = bool;
        this.f10996b = bool2;
        this.f10997c = bool3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Features)) {
            return false;
        }
        Features features = (Features) obj;
        return C6888i.m12434a(this.f10995a, features.f10995a) && C6888i.m12434a(this.f10996b, features.f10996b) && C6888i.m12434a(this.f10997c, features.f10997c);
    }

    public int hashCode() {
        Boolean bool = this.f10995a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.f10996b;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f10997c;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Features(auth=");
        u.append(this.f10995a);
        u.append(", audio=");
        u.append(this.f10996b);
        u.append(", watermark=");
        u.append(this.f10997c);
        u.append(")");
        return u.toString();
    }
}
