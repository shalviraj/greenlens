package com.appfoundry.previewer.model;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class FirebaseClient {

    /* renamed from: a */
    public final FirebaseClientInfo f11002a;

    /* renamed from: b */
    public final List<FirebaseApiKey> f11003b;

    public FirebaseClient(FirebaseClientInfo firebaseClientInfo, List<FirebaseApiKey> list) {
        this.f11002a = firebaseClientInfo;
        this.f11003b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseClient)) {
            return false;
        }
        FirebaseClient firebaseClient = (FirebaseClient) obj;
        return C6888i.m12434a(this.f11002a, firebaseClient.f11002a) && C6888i.m12434a(this.f11003b, firebaseClient.f11003b);
    }

    public int hashCode() {
        FirebaseClientInfo firebaseClientInfo = this.f11002a;
        int i = 0;
        int hashCode = (firebaseClientInfo != null ? firebaseClientInfo.hashCode() : 0) * 31;
        List<FirebaseApiKey> list = this.f11003b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("FirebaseClient(client_info=");
        u.append(this.f11002a);
        u.append(", api_key=");
        u.append(this.f11003b);
        u.append(")");
        return u.toString();
    }
}
