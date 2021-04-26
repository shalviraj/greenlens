package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Marker {

    /* renamed from: a */
    public final String f11029a;

    /* renamed from: b */
    public final Geometry f11030b;

    /* renamed from: c */
    public final Properties f11031c;

    public Marker(String str, Geometry geometry, Properties properties) {
        C6888i.m12438e(str, "type");
        this.f11029a = str;
        this.f11030b = geometry;
        this.f11031c = properties;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Marker)) {
            return false;
        }
        Marker marker = (Marker) obj;
        return C6888i.m12434a(this.f11029a, marker.f11029a) && C6888i.m12434a(this.f11030b, marker.f11030b) && C6888i.m12434a(this.f11031c, marker.f11031c);
    }

    public int hashCode() {
        String str = this.f11029a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Geometry geometry = this.f11030b;
        int hashCode2 = (hashCode + (geometry != null ? geometry.hashCode() : 0)) * 31;
        Properties properties = this.f11031c;
        if (properties != null) {
            i = properties.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Marker(type=");
        u.append(this.f11029a);
        u.append(", geometry=");
        u.append(this.f11030b);
        u.append(", properties=");
        u.append(this.f11031c);
        u.append(")");
        return u.toString();
    }
}
