package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Shadow {

    /* renamed from: a */
    public final String f11104a;

    /* renamed from: b */
    public final Float f11105b;

    /* renamed from: c */
    public final ShadowOffset f11106c;

    public Shadow(String str, Float f, ShadowOffset shadowOffset) {
        this.f11104a = str;
        this.f11105b = f;
        this.f11106c = shadowOffset;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return C6888i.m12434a(this.f11104a, shadow.f11104a) && C6888i.m12434a(this.f11105b, shadow.f11105b) && C6888i.m12434a(this.f11106c, shadow.f11106c);
    }

    public int hashCode() {
        String str = this.f11104a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Float f = this.f11105b;
        int hashCode2 = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        ShadowOffset shadowOffset = this.f11106c;
        if (shadowOffset != null) {
            i = shadowOffset.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Shadow(color=");
        u.append(this.f11104a);
        u.append(", radius=");
        u.append(this.f11105b);
        u.append(", offset=");
        u.append(this.f11106c);
        u.append(")");
        return u.toString();
    }
}
