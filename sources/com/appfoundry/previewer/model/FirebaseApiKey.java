package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class FirebaseApiKey {

    /* renamed from: a */
    public final String f11001a;

    public FirebaseApiKey(String str) {
        this.f11001a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FirebaseApiKey) && C6888i.m12434a(this.f11001a, ((FirebaseApiKey) obj).f11001a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f11001a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("FirebaseApiKey(current_key="), this.f11001a, ")");
    }
}
