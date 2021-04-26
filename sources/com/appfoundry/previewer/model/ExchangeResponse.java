package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class ExchangeResponse {

    /* renamed from: a */
    public final int f10993a;

    /* renamed from: b */
    public final String f10994b;

    public ExchangeResponse(int i, String str) {
        C6888i.m12438e(str, "response");
        this.f10993a = i;
        this.f10994b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeResponse)) {
            return false;
        }
        ExchangeResponse exchangeResponse = (ExchangeResponse) obj;
        return this.f10993a == exchangeResponse.f10993a && C6888i.m12434a(this.f10994b, exchangeResponse.f10994b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f10993a) * 31;
        String str = this.f10994b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ExchangeResponse(statusCode=");
        u.append(this.f10993a);
        u.append(", response=");
        return C0843a.m455p(u, this.f10994b, ")");
    }
}
