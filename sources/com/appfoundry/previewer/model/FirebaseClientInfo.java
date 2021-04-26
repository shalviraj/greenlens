package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class FirebaseClientInfo {

    /* renamed from: a */
    public final String f11004a;

    /* renamed from: b */
    public final FirebaseAndroidClientInfo f11005b;

    public FirebaseClientInfo(String str, FirebaseAndroidClientInfo firebaseAndroidClientInfo) {
        this.f11004a = str;
        this.f11005b = firebaseAndroidClientInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseClientInfo)) {
            return false;
        }
        FirebaseClientInfo firebaseClientInfo = (FirebaseClientInfo) obj;
        return C6888i.m12434a(this.f11004a, firebaseClientInfo.f11004a) && C6888i.m12434a(this.f11005b, firebaseClientInfo.f11005b);
    }

    public int hashCode() {
        String str = this.f11004a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        FirebaseAndroidClientInfo firebaseAndroidClientInfo = this.f11005b;
        if (firebaseAndroidClientInfo != null) {
            i = firebaseAndroidClientInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("FirebaseClientInfo(mobilesdk_app_id=");
        u.append(this.f11004a);
        u.append(", android_client_info=");
        u.append(this.f11005b);
        u.append(")");
        return u.toString();
    }
}
