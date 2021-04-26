package com.appfoundry.previewer.model;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Map {

    /* renamed from: a */
    public final Integer f11026a;

    /* renamed from: b */
    public final List<Float> f11027b;

    /* renamed from: c */
    public final Boolean f11028c;

    public Map(Integer num, List<Float> list, Boolean bool) {
        this.f11026a = num;
        this.f11027b = list;
        this.f11028c = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return C6888i.m12434a(this.f11026a, map.f11026a) && C6888i.m12434a(this.f11027b, map.f11027b) && C6888i.m12434a(this.f11028c, map.f11028c);
    }

    public int hashCode() {
        Integer num = this.f11026a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<Float> list = this.f11027b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.f11028c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Map(zoom=");
        u.append(this.f11026a);
        u.append(", center=");
        u.append(this.f11027b);
        u.append(", interactive=");
        u.append(this.f11028c);
        u.append(")");
        return u.toString();
    }
}
