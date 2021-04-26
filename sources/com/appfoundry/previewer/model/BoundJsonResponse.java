package com.appfoundry.previewer.model;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class BoundJsonResponse {

    /* renamed from: a */
    public final BoundNode f10917a;

    /* renamed from: b */
    public final List<Style> f10918b;

    /* renamed from: c */
    public final List<Asset> f10919c;

    /* renamed from: d */
    public final String f10920d;

    /* renamed from: e */
    public final Boolean f10921e;

    /* renamed from: f */
    public final List<DebugRequest> f10922f;

    public BoundJsonResponse(BoundNode boundNode, List<Style> list, List<Asset> list2, String str, Boolean bool, List<DebugRequest> list3) {
        this.f10917a = boundNode;
        this.f10918b = list;
        this.f10919c = list2;
        this.f10920d = str;
        this.f10921e = bool;
        this.f10922f = list3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundJsonResponse)) {
            return false;
        }
        BoundJsonResponse boundJsonResponse = (BoundJsonResponse) obj;
        return C6888i.m12434a(this.f10917a, boundJsonResponse.f10917a) && C6888i.m12434a(this.f10918b, boundJsonResponse.f10918b) && C6888i.m12434a(this.f10919c, boundJsonResponse.f10919c) && C6888i.m12434a(this.f10920d, boundJsonResponse.f10920d) && C6888i.m12434a(this.f10921e, boundJsonResponse.f10921e) && C6888i.m12434a(this.f10922f, boundJsonResponse.f10922f);
    }

    public int hashCode() {
        BoundNode boundNode = this.f10917a;
        int i = 0;
        int hashCode = (boundNode != null ? boundNode.hashCode() : 0) * 31;
        List<Style> list = this.f10918b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Asset> list2 = this.f10919c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f10920d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f10921e;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<DebugRequest> list3 = this.f10922f;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("BoundJsonResponse(data=");
        u.append(this.f10917a);
        u.append(", styles=");
        u.append(this.f10918b);
        u.append(", assets=");
        u.append(this.f10919c);
        u.append(", nextLink=");
        u.append(this.f10920d);
        u.append(", success=");
        u.append(this.f10921e);
        u.append(", debugRequests=");
        u.append(this.f10922f);
        u.append(")");
        return u.toString();
    }
}
