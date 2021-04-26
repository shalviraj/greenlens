package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class ResponseAsAction {

    /* renamed from: a */
    public final String f11094a;

    /* renamed from: b */
    public final Params f11095b;

    public ResponseAsAction(String str, Params params) {
        this.f11094a = str;
        this.f11095b = params;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseAsAction)) {
            return false;
        }
        ResponseAsAction responseAsAction = (ResponseAsAction) obj;
        return C6888i.m12434a(this.f11094a, responseAsAction.f11094a) && C6888i.m12434a(this.f11095b, responseAsAction.f11095b);
    }

    public int hashCode() {
        String str = this.f11094a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Params params = this.f11095b;
        if (params != null) {
            i = params.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ResponseAsAction(action=");
        u.append(this.f11094a);
        u.append(", params=");
        u.append(this.f11095b);
        u.append(")");
        return u.toString();
    }
}
