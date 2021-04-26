package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class FirebaseProjectInfo {

    /* renamed from: a */
    public final String f11008a;

    /* renamed from: b */
    public final String f11009b;

    /* renamed from: c */
    public final String f11010c;

    /* renamed from: d */
    public final String f11011d;

    public FirebaseProjectInfo(String str, String str2, String str3, String str4) {
        this.f11008a = str;
        this.f11009b = str2;
        this.f11010c = str3;
        this.f11011d = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseProjectInfo)) {
            return false;
        }
        FirebaseProjectInfo firebaseProjectInfo = (FirebaseProjectInfo) obj;
        return C6888i.m12434a(this.f11008a, firebaseProjectInfo.f11008a) && C6888i.m12434a(this.f11009b, firebaseProjectInfo.f11009b) && C6888i.m12434a(this.f11010c, firebaseProjectInfo.f11010c) && C6888i.m12434a(this.f11011d, firebaseProjectInfo.f11011d);
    }

    public int hashCode() {
        String str = this.f11008a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11009b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11010c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11011d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("FirebaseProjectInfo(project_number=");
        u.append(this.f11008a);
        u.append(", firebase_url=");
        u.append(this.f11009b);
        u.append(", project_id=");
        u.append(this.f11010c);
        u.append(", storage_bucket=");
        return C0843a.m455p(u, this.f11011d, ")");
    }
}
