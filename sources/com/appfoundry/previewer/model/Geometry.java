package com.appfoundry.previewer.model;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Geometry {

    /* renamed from: a */
    public final String f11012a;

    /* renamed from: b */
    public final List<Float> f11013b;

    public Geometry(String str, List<Float> list) {
        this.f11012a = str;
        this.f11013b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Geometry)) {
            return false;
        }
        Geometry geometry = (Geometry) obj;
        return C6888i.m12434a(this.f11012a, geometry.f11012a) && C6888i.m12434a(this.f11013b, geometry.f11013b);
    }

    public int hashCode() {
        String str = this.f11012a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Float> list = this.f11013b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Geometry(type=");
        u.append(this.f11012a);
        u.append(", coordinates=");
        u.append(this.f11013b);
        u.append(")");
        return u.toString();
    }
}
