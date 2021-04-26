package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Integration {

    /* renamed from: a */
    public final OneSignal f11016a;

    /* renamed from: b */
    public final Firebase f11017b;

    public Integration(OneSignal oneSignal, Firebase firebase) {
        this.f11016a = oneSignal;
        this.f11017b = firebase;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Integration)) {
            return false;
        }
        Integration integration = (Integration) obj;
        return C6888i.m12434a(this.f11016a, integration.f11016a) && C6888i.m12434a(this.f11017b, integration.f11017b);
    }

    public int hashCode() {
        OneSignal oneSignal = this.f11016a;
        int i = 0;
        int hashCode = (oneSignal != null ? oneSignal.hashCode() : 0) * 31;
        Firebase firebase = this.f11017b;
        if (firebase != null) {
            i = firebase.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Integration(oneSignal=");
        u.append(this.f11016a);
        u.append(", firebase=");
        u.append(this.f11017b);
        u.append(")");
        return u.toString();
    }
}
