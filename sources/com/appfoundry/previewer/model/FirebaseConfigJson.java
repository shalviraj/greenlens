package com.appfoundry.previewer.model;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class FirebaseConfigJson {

    /* renamed from: a */
    public final FirebaseProjectInfo f11006a;

    /* renamed from: b */
    public final List<FirebaseClient> f11007b;

    public FirebaseConfigJson(FirebaseProjectInfo firebaseProjectInfo, List<FirebaseClient> list) {
        this.f11006a = firebaseProjectInfo;
        this.f11007b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseConfigJson)) {
            return false;
        }
        FirebaseConfigJson firebaseConfigJson = (FirebaseConfigJson) obj;
        return C6888i.m12434a(this.f11006a, firebaseConfigJson.f11006a) && C6888i.m12434a(this.f11007b, firebaseConfigJson.f11007b);
    }

    public int hashCode() {
        FirebaseProjectInfo firebaseProjectInfo = this.f11006a;
        int i = 0;
        int hashCode = (firebaseProjectInfo != null ? firebaseProjectInfo.hashCode() : 0) * 31;
        List<FirebaseClient> list = this.f11007b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("FirebaseConfigJson(project_info=");
        u.append(this.f11006a);
        u.append(", client=");
        u.append(this.f11007b);
        u.append(")");
        return u.toString();
    }
}
