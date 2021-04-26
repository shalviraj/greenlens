package com.appfoundry.previewer.model;

import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/FirebaseClientJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/FirebaseClient;", "", "toString", "()Ljava/lang/String;", "", "Lcom/appfoundry/previewer/model/FirebaseApiKey;", "nullableListOfFirebaseApiKeyAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/FirebaseClientInfo;", "nullableFirebaseClientInfoAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class FirebaseClientJsonAdapter extends C5075l<FirebaseClient> {
    private final C5075l<FirebaseClientInfo> nullableFirebaseClientInfoAdapter;
    private final C5075l<List<FirebaseApiKey>> nullableListOfFirebaseApiKeyAdapter;
    private final C5081q.C5082a options;

    public FirebaseClientJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("client_info", "api_key");
        C6888i.m12437d(a, "JsonReader.Options.of(\"client_info\", \"api_key\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<FirebaseClientInfo> d = xVar.mo16932d(FirebaseClientInfo.class, rVar, "client_info");
        C6888i.m12437d(d, "moshi.adapter(FirebaseCl…mptySet(), \"client_info\")");
        this.nullableFirebaseClientInfoAdapter = d;
        C5075l<List<FirebaseApiKey>> d2 = xVar.mo16932d(C4805c3.m8814m(List.class, FirebaseApiKey.class), rVar, "api_key");
        C6888i.m12437d(d2, "moshi.adapter(Types.newP…   emptySet(), \"api_key\")");
        this.nullableListOfFirebaseApiKeyAdapter = d2;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        FirebaseClientInfo firebaseClientInfo = null;
        List list = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                firebaseClientInfo = this.nullableFirebaseClientInfoAdapter.mo16804a(qVar);
            } else if (n0 == 1) {
                list = this.nullableListOfFirebaseApiKeyAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        return new FirebaseClient(firebaseClientInfo, list);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        FirebaseClient firebaseClient = (FirebaseClient) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(firebaseClient, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("client_info");
        this.nullableFirebaseClientInfoAdapter.mo16805e(uVar, firebaseClient.f11002a);
        uVar.mo16865O("api_key");
        this.nullableListOfFirebaseApiKeyAdapter.mo16805e(uVar, firebaseClient.f11003b);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(FirebaseClient)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(FirebaseClient)";
    }
}
