package com.appfoundry.previewer.model;

import java.util.Objects;
import kotlin.Metadata;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/IntegrationJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Integration;", "", "toString", "()Ljava/lang/String;", "Lcom/appfoundry/previewer/model/Firebase;", "nullableFirebaseAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/OneSignal;", "nullableOneSignalAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class IntegrationJsonAdapter extends C5075l<Integration> {
    private final C5075l<Firebase> nullableFirebaseAdapter;
    private final C5075l<OneSignal> nullableOneSignalAdapter;
    private final C5081q.C5082a options;

    public IntegrationJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("oneSignal", "firebase");
        C6888i.m12437d(a, "JsonReader.Options.of(\"oneSignal\", \"firebase\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<OneSignal> d = xVar.mo16932d(OneSignal.class, rVar, "oneSignal");
        C6888i.m12437d(d, "moshi.adapter(OneSignal:… emptySet(), \"oneSignal\")");
        this.nullableOneSignalAdapter = d;
        C5075l<Firebase> d2 = xVar.mo16932d(Firebase.class, rVar, "firebase");
        C6888i.m12437d(d2, "moshi.adapter(Firebase::…  emptySet(), \"firebase\")");
        this.nullableFirebaseAdapter = d2;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        OneSignal oneSignal = null;
        Firebase firebase = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                oneSignal = this.nullableOneSignalAdapter.mo16804a(qVar);
            } else if (n0 == 1) {
                firebase = this.nullableFirebaseAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        return new Integration(oneSignal, firebase);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        Integration integration = (Integration) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(integration, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("oneSignal");
        this.nullableOneSignalAdapter.mo16805e(uVar, integration.f11016a);
        uVar.mo16865O("firebase");
        this.nullableFirebaseAdapter.mo16805e(uVar, integration.f11017b);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(Integration)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Integration)";
    }
}
