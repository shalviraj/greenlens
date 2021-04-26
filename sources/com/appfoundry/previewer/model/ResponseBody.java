package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class ResponseBody {

    /* renamed from: a */
    public final Integer f11096a;

    /* renamed from: b */
    public final String f11097b;

    /* renamed from: c */
    public final String f11098c;

    /* renamed from: d */
    public final String f11099d;

    /* renamed from: e */
    public final DebugRequest f11100e;

    public ResponseBody(Integer num, String str, String str2, String str3, DebugRequest debugRequest) {
        this.f11096a = num;
        this.f11097b = str;
        this.f11098c = str2;
        this.f11099d = str3;
        this.f11100e = debugRequest;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseBody)) {
            return false;
        }
        ResponseBody responseBody = (ResponseBody) obj;
        return C6888i.m12434a(this.f11096a, responseBody.f11096a) && C6888i.m12434a(this.f11097b, responseBody.f11097b) && C6888i.m12434a(this.f11098c, responseBody.f11098c) && C6888i.m12434a(this.f11099d, responseBody.f11099d) && C6888i.m12434a(this.f11100e, responseBody.f11100e);
    }

    public int hashCode() {
        Integer num = this.f11096a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f11097b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11098c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11099d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        DebugRequest debugRequest = this.f11100e;
        if (debugRequest != null) {
            i = debugRequest.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ResponseBody(statusCode=");
        u.append(this.f11096a);
        u.append(", error=");
        u.append(this.f11097b);
        u.append(", message=");
        u.append(this.f11098c);
        u.append(", reason=");
        u.append(this.f11099d);
        u.append(", debugRequest=");
        u.append(this.f11100e);
        u.append(")");
        return u.toString();
    }
}
