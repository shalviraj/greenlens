package com.appfoundry.previewer.model;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Data {

    /* renamed from: a */
    public final List<Page> f10984a;

    /* renamed from: b */
    public final List<Page> f10985b;

    public Data(List<Page> list, List<Page> list2) {
        this.f10984a = list;
        this.f10985b = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return C6888i.m12434a(this.f10984a, data.f10984a) && C6888i.m12434a(this.f10985b, data.f10985b);
    }

    public int hashCode() {
        List<Page> list = this.f10984a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Page> list2 = this.f10985b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Data(menus=");
        u.append(this.f10984a);
        u.append(", pages=");
        u.append(this.f10985b);
        u.append(")");
        return u.toString();
    }
}
