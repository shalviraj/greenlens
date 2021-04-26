package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Size {

    /* renamed from: a */
    public final Integer f11109a;

    /* renamed from: b */
    public final Integer f11110b;

    public Size(Integer num, Integer num2) {
        this.f11109a = num;
        this.f11110b = num2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return C6888i.m12434a(this.f11109a, size.f11109a) && C6888i.m12434a(this.f11110b, size.f11110b);
    }

    public int hashCode() {
        Integer num = this.f11109a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f11110b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Size(width=");
        u.append(this.f11109a);
        u.append(", height=");
        u.append(this.f11110b);
        u.append(")");
        return u.toString();
    }
}
