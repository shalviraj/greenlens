package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class AuthInfoFromBackend {

    /* renamed from: a */
    public final String f10902a;

    /* renamed from: b */
    public final String f10903b;

    /* renamed from: c */
    public final Boolean f10904c;

    /* renamed from: d */
    public final AuthSettings f10905d;

    public AuthInfoFromBackend(String str, String str2, Boolean bool, AuthSettings authSettings) {
        this.f10902a = str;
        this.f10903b = str2;
        this.f10904c = bool;
        this.f10905d = authSettings;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthInfoFromBackend)) {
            return false;
        }
        AuthInfoFromBackend authInfoFromBackend = (AuthInfoFromBackend) obj;
        return C6888i.m12434a(this.f10902a, authInfoFromBackend.f10902a) && C6888i.m12434a(this.f10903b, authInfoFromBackend.f10903b) && C6888i.m12434a(this.f10904c, authInfoFromBackend.f10904c) && C6888i.m12434a(this.f10905d, authInfoFromBackend.f10905d);
    }

    public int hashCode() {
        String str = this.f10902a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10903b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f10904c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        AuthSettings authSettings = this.f10905d;
        if (authSettings != null) {
            i = authSettings.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("AuthInfoFromBackend(collectionId=");
        u.append(this.f10902a);
        u.append(", type=");
        u.append(this.f10903b);
        u.append(", interactive=");
        u.append(this.f10904c);
        u.append(", settings=");
        u.append(this.f10905d);
        u.append(")");
        return u.toString();
    }
}
