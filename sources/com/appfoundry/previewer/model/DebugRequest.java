package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class DebugRequest {

    /* renamed from: a */
    public final Config f10986a;

    /* renamed from: b */
    public final Integer f10987b;

    /* renamed from: c */
    public final Object f10988c;

    public DebugRequest(Config config, Integer num, Object obj) {
        this.f10986a = config;
        this.f10987b = num;
        this.f10988c = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugRequest)) {
            return false;
        }
        DebugRequest debugRequest = (DebugRequest) obj;
        return C6888i.m12434a(this.f10986a, debugRequest.f10986a) && C6888i.m12434a(this.f10987b, debugRequest.f10987b) && C6888i.m12434a(this.f10988c, debugRequest.f10988c);
    }

    public int hashCode() {
        Config config = this.f10986a;
        int i = 0;
        int hashCode = (config != null ? config.hashCode() : 0) * 31;
        Integer num = this.f10987b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Object obj = this.f10988c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("DebugRequest(config=");
        u.append(this.f10986a);
        u.append(", statusCode=");
        u.append(this.f10987b);
        u.append(", responseBody=");
        u.append(this.f10988c);
        u.append(")");
        return u.toString();
    }
}
