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

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0013"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/FirebaseConfigJsonJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/FirebaseConfigJson;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "Lcom/appfoundry/previewer/model/FirebaseClient;", "nullableListOfFirebaseClientAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/FirebaseProjectInfo;", "nullableFirebaseProjectInfoAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class FirebaseConfigJsonJsonAdapter extends C5075l<FirebaseConfigJson> {
    private final C5075l<FirebaseProjectInfo> nullableFirebaseProjectInfoAdapter;
    private final C5075l<List<FirebaseClient>> nullableListOfFirebaseClientAdapter;
    private final C5081q.C5082a options;

    public FirebaseConfigJsonJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("project_info", "client");
        C6888i.m12437d(a, "JsonReader.Options.of(\"project_info\", \"client\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<FirebaseProjectInfo> d = xVar.mo16932d(FirebaseProjectInfo.class, rVar, "project_info");
        C6888i.m12437d(d, "moshi.adapter(FirebasePr…ptySet(), \"project_info\")");
        this.nullableFirebaseProjectInfoAdapter = d;
        C5075l<List<FirebaseClient>> d2 = xVar.mo16932d(C4805c3.m8814m(List.class, FirebaseClient.class), rVar, "client");
        C6888i.m12437d(d2, "moshi.adapter(Types.newP…    emptySet(), \"client\")");
        this.nullableListOfFirebaseClientAdapter = d2;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        FirebaseProjectInfo firebaseProjectInfo = null;
        List list = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                firebaseProjectInfo = this.nullableFirebaseProjectInfoAdapter.mo16804a(qVar);
            } else if (n0 == 1) {
                list = this.nullableListOfFirebaseClientAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        return new FirebaseConfigJson(firebaseProjectInfo, list);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        FirebaseConfigJson firebaseConfigJson = (FirebaseConfigJson) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(firebaseConfigJson, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("project_info");
        this.nullableFirebaseProjectInfoAdapter.mo16805e(uVar, firebaseConfigJson.f11006a);
        uVar.mo16865O("client");
        this.nullableListOfFirebaseClientAdapter.mo16805e(uVar, firebaseConfigJson.f11007b);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(FirebaseConfigJson)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(FirebaseConfigJson)";
    }
}
