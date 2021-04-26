package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Dimensions {

    /* renamed from: a */
    public final Float f10989a;

    /* renamed from: b */
    public final Float f10990b;

    /* renamed from: c */
    public final Float f10991c;

    /* renamed from: d */
    public final Float f10992d;

    public Dimensions(Float f, Float f2, Float f3, Float f4) {
        this.f10989a = f;
        this.f10990b = f2;
        this.f10991c = f3;
        this.f10992d = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dimensions)) {
            return false;
        }
        Dimensions dimensions = (Dimensions) obj;
        return C6888i.m12434a(this.f10989a, dimensions.f10989a) && C6888i.m12434a(this.f10990b, dimensions.f10990b) && C6888i.m12434a(this.f10991c, dimensions.f10991c) && C6888i.m12434a(this.f10992d, dimensions.f10992d);
    }

    public int hashCode() {
        Float f = this.f10989a;
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f10990b;
        int hashCode2 = (hashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f10991c;
        int hashCode3 = (hashCode2 + (f3 != null ? f3.hashCode() : 0)) * 31;
        Float f4 = this.f10992d;
        if (f4 != null) {
            i = f4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Dimensions(left=");
        u.append(this.f10989a);
        u.append(", top=");
        u.append(this.f10990b);
        u.append(", right=");
        u.append(this.f10991c);
        u.append(", bottom=");
        u.append(this.f10992d);
        u.append(")");
        return u.toString();
    }
}
