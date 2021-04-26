package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Tap {

    /* renamed from: a */
    public final String f11166a;

    /* renamed from: b */
    public final Params f11167b;

    public Tap(String str, Params params) {
        this.f11166a = str;
        this.f11167b = params;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tap)) {
            return false;
        }
        Tap tap = (Tap) obj;
        return C6888i.m12434a(this.f11166a, tap.f11166a) && C6888i.m12434a(this.f11167b, tap.f11167b);
    }

    public int hashCode() {
        String str = this.f11166a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Params params = this.f11167b;
        if (params != null) {
            i = params.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Tap(action=");
        u.append(this.f11166a);
        u.append(", params=");
        u.append(this.f11167b);
        u.append(")");
        return u.toString();
    }
}
