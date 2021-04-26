package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Firebase {

    /* renamed from: a */
    public final String f10998a;

    /* renamed from: b */
    public final String f10999b;

    public Firebase(String str, String str2) {
        this.f10998a = str;
        this.f10999b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Firebase)) {
            return false;
        }
        Firebase firebase = (Firebase) obj;
        return C6888i.m12434a(this.f10998a, firebase.f10998a) && C6888i.m12434a(this.f10999b, firebase.f10999b);
    }

    public int hashCode() {
        String str = this.f10998a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10999b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Firebase(plist=");
        u.append(this.f10998a);
        u.append(", json=");
        return C0843a.m455p(u, this.f10999b, ")");
    }
}
