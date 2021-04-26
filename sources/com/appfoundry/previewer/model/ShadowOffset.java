package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class ShadowOffset {

    /* renamed from: a */
    public final Float f11107a;

    /* renamed from: b */
    public final Float f11108b;

    public ShadowOffset(Float f, Float f2) {
        this.f11107a = f;
        this.f11108b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowOffset)) {
            return false;
        }
        ShadowOffset shadowOffset = (ShadowOffset) obj;
        return C6888i.m12434a(this.f11107a, shadowOffset.f11107a) && C6888i.m12434a(this.f11108b, shadowOffset.f11108b);
    }

    public int hashCode() {
        Float f = this.f11107a;
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.f11108b;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ShadowOffset(x=");
        u.append(this.f11107a);
        u.append(", y=");
        u.append(this.f11108b);
        u.append(")");
        return u.toString();
    }
}
