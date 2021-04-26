package com.appfoundry.previewer.model;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class ChartData {

    /* renamed from: a */
    public final List<Object> f10937a;

    /* renamed from: b */
    public final String f10938b;

    public ChartData(List<? extends Object> list, String str) {
        this.f10937a = list;
        this.f10938b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartData)) {
            return false;
        }
        ChartData chartData = (ChartData) obj;
        return C6888i.m12434a(this.f10937a, chartData.f10937a) && C6888i.m12434a(this.f10938b, chartData.f10938b);
    }

    public int hashCode() {
        List<Object> list = this.f10937a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f10938b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ChartData(data=");
        u.append(this.f10937a);
        u.append(", name=");
        return C0843a.m455p(u, this.f10938b, ")");
    }
}
