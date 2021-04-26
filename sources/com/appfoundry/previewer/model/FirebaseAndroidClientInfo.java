package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class FirebaseAndroidClientInfo {

    /* renamed from: a */
    public final String f11000a;

    public FirebaseAndroidClientInfo(String str) {
        this.f11000a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FirebaseAndroidClientInfo) && C6888i.m12434a(this.f11000a, ((FirebaseAndroidClientInfo) obj).f11000a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f11000a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("FirebaseAndroidClientInfo(package_name="), this.f11000a, ")");
    }
}
