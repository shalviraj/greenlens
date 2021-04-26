package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class GradientColorStop {

    /* renamed from: a */
    public final String f11014a;

    /* renamed from: b */
    public final float f11015b;

    public GradientColorStop(String str, float f) {
        this.f11014a = str;
        this.f11015b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientColorStop)) {
            return false;
        }
        GradientColorStop gradientColorStop = (GradientColorStop) obj;
        return C6888i.m12434a(this.f11014a, gradientColorStop.f11014a) && Float.compare(this.f11015b, gradientColorStop.f11015b) == 0;
    }

    public int hashCode() {
        String str = this.f11014a;
        return Float.hashCode(this.f11015b) + ((str != null ? str.hashCode() : 0) * 31);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("GradientColorStop(color=");
        u.append(this.f11014a);
        u.append(", position=");
        u.append(this.f11015b);
        u.append(")");
        return u.toString();
    }
}
