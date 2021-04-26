package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Resolution {

    /* renamed from: a */
    public final Integer f11092a;

    /* renamed from: b */
    public final Integer f11093b;

    public Resolution(Integer num, Integer num2) {
        this.f11092a = num;
        this.f11093b = num2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resolution)) {
            return false;
        }
        Resolution resolution = (Resolution) obj;
        return C6888i.m12434a(this.f11092a, resolution.f11092a) && C6888i.m12434a(this.f11093b, resolution.f11093b);
    }

    public int hashCode() {
        Integer num = this.f11092a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f11093b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Resolution(width=");
        u.append(this.f11092a);
        u.append(", height=");
        u.append(this.f11093b);
        u.append(")");
        return u.toString();
    }
}
