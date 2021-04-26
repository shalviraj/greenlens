package com.appfoundry.previewer.model;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Paywall {

    /* renamed from: a */
    public final String f11087a;

    /* renamed from: b */
    public final List<String> f11088b;

    public Paywall(String str, List<String> list) {
        this.f11087a = str;
        this.f11088b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Paywall)) {
            return false;
        }
        Paywall paywall = (Paywall) obj;
        return C6888i.m12434a(this.f11087a, paywall.f11087a) && C6888i.m12434a(this.f11088b, paywall.f11088b);
    }

    public int hashCode() {
        String str = this.f11087a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f11088b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Paywall(message=");
        u.append(this.f11087a);
        u.append(", features=");
        u.append(this.f11088b);
        u.append(")");
        return u.toString();
    }
}
