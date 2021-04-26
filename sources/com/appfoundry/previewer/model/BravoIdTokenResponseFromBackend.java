package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class BravoIdTokenResponseFromBackend {

    /* renamed from: a */
    public final String f10933a;

    /* renamed from: b */
    public final String f10934b;

    /* renamed from: c */
    public final String f10935c;

    /* renamed from: d */
    public final String f10936d;

    public BravoIdTokenResponseFromBackend(String str, String str2, String str3, String str4) {
        this.f10933a = str;
        this.f10934b = str2;
        this.f10935c = str3;
        this.f10936d = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BravoIdTokenResponseFromBackend)) {
            return false;
        }
        BravoIdTokenResponseFromBackend bravoIdTokenResponseFromBackend = (BravoIdTokenResponseFromBackend) obj;
        return C6888i.m12434a(this.f10933a, bravoIdTokenResponseFromBackend.f10933a) && C6888i.m12434a(this.f10934b, bravoIdTokenResponseFromBackend.f10934b) && C6888i.m12434a(this.f10935c, bravoIdTokenResponseFromBackend.f10935c) && C6888i.m12434a(this.f10936d, bravoIdTokenResponseFromBackend.f10936d);
    }

    public int hashCode() {
        String str = this.f10933a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10934b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10935c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f10936d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("BravoIdTokenResponseFromBackend(id=");
        u.append(this.f10933a);
        u.append(", email=");
        u.append(this.f10934b);
        u.append(", name=");
        u.append(this.f10935c);
        u.append(", token=");
        return C0843a.m455p(u, this.f10936d, ")");
    }
}
