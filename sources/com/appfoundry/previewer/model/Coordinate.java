package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Coordinate {

    /* renamed from: a */
    public final Float f10982a;

    /* renamed from: b */
    public final Float f10983b;

    public Coordinate(Float f, Float f2) {
        this.f10982a = f;
        this.f10983b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinate)) {
            return false;
        }
        Coordinate coordinate = (Coordinate) obj;
        return C6888i.m12434a(this.f10982a, coordinate.f10982a) && C6888i.m12434a(this.f10983b, coordinate.f10983b);
    }

    public int hashCode() {
        Float f = this.f10982a;
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f10983b;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Coordinate(x=");
        u.append(this.f10982a);
        u.append(", y=");
        u.append(this.f10983b);
        u.append(")");
        return u.toString();
    }
}
