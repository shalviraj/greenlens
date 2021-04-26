package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class BackendResponse {

    /* renamed from: a */
    public final String f10915a;

    /* renamed from: b */
    public final Params f10916b;

    public BackendResponse(String str, Params params) {
        this.f10915a = str;
        this.f10916b = params;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return C6888i.m12434a(this.f10915a, backendResponse.f10915a) && C6888i.m12434a(this.f10916b, backendResponse.f10916b);
    }

    public int hashCode() {
        String str = this.f10915a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Params params = this.f10916b;
        if (params != null) {
            i = params.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("BackendResponse(action=");
        u.append(this.f10915a);
        u.append(", params=");
        u.append(this.f10916b);
        u.append(")");
        return u.toString();
    }
}
