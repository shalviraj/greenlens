package com.appfoundry.previewer.model;

import java.util.Objects;
import kotlin.Metadata;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/FirebaseProjectInfoJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/FirebaseProjectInfo;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "nullableStringAdapter", "Lb/p/a/l;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class FirebaseProjectInfoJsonAdapter extends C5075l<FirebaseProjectInfo> {
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;

    public FirebaseProjectInfoJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("project_number", "firebase_url", "project_id", "storage_bucket");
        C6888i.m12437d(a, "JsonReader.Options.of(\"p…ct_id\", \"storage_bucket\")");
        this.options = a;
        C5075l<String> d = xVar.mo16932d(String.class, C6800r.f13715g, "project_number");
        C6888i.m12437d(d, "moshi.adapter(String::cl…ySet(), \"project_number\")");
        this.nullableStringAdapter = d;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                str = this.nullableStringAdapter.mo16804a(qVar);
            } else if (n0 == 1) {
                str2 = this.nullableStringAdapter.mo16804a(qVar);
            } else if (n0 == 2) {
                str3 = this.nullableStringAdapter.mo16804a(qVar);
            } else if (n0 == 3) {
                str4 = this.nullableStringAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        return new FirebaseProjectInfo(str, str2, str3, str4);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        FirebaseProjectInfo firebaseProjectInfo = (FirebaseProjectInfo) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(firebaseProjectInfo, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("project_number");
        this.nullableStringAdapter.mo16805e(uVar, firebaseProjectInfo.f11008a);
        uVar.mo16865O("firebase_url");
        this.nullableStringAdapter.mo16805e(uVar, firebaseProjectInfo.f11009b);
        uVar.mo16865O("project_id");
        this.nullableStringAdapter.mo16805e(uVar, firebaseProjectInfo.f11010c);
        uVar.mo16865O("storage_bucket");
        this.nullableStringAdapter.mo16805e(uVar, firebaseProjectInfo.f11011d);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(FirebaseProjectInfo)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(FirebaseProjectInfo)";
    }
}
