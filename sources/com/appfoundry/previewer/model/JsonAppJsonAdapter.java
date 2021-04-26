package com.appfoundry.previewer.model;

import com.segment.analytics.AnalyticsContext;
import java.util.Objects;
import kotlin.Metadata;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/JsonAppJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/JsonApp;", "", "toString", "()Ljava/lang/String;", "", "nullableIntAdapter", "Lb/p/a/l;", "nullableStringAdapter", "Lcom/appfoundry/previewer/model/App;", "nullableAppAdapter", "", "nullableLongAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class JsonAppJsonAdapter extends C5075l<JsonApp> {
    private final C5075l<App> nullableAppAdapter;
    private final C5075l<Integer> nullableIntAdapter;
    private final C5075l<Long> nullableLongAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;

    public JsonAppJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a(AnalyticsContext.Device.DEVICE_ID_KEY, "hash", "lastUpdate", "app", "statusCode", "message", "error", "issuedAt");
        C6888i.m12437d(a, "JsonReader.Options.of(\"i…ge\", \"error\", \"issuedAt\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar.mo16932d(String.class, rVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        C6888i.m12437d(d, "moshi.adapter(String::cl…,\n      emptySet(), \"id\")");
        this.nullableStringAdapter = d;
        C5075l<App> d2 = xVar.mo16932d(App.class, rVar, "app");
        C6888i.m12437d(d2, "moshi.adapter(App::class… emptySet(),\n      \"app\")");
        this.nullableAppAdapter = d2;
        C5075l<Integer> d3 = xVar.mo16932d(Integer.class, rVar, "statusCode");
        C6888i.m12437d(d3, "moshi.adapter(Int::class…emptySet(), \"statusCode\")");
        this.nullableIntAdapter = d3;
        C5075l<Long> d4 = xVar.mo16932d(Long.class, rVar, "issuedAt");
        C6888i.m12437d(d4, "moshi.adapter(Long::clas…  emptySet(), \"issuedAt\")");
        this.nullableLongAdapter = d4;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        String str = null;
        String str2 = null;
        String str3 = null;
        App app2 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
        while (qVar.mo16835N()) {
            switch (qVar.mo16844n0(this.options)) {
                case -1:
                    qVar.mo16845o0();
                    qVar.mo16846p0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 3:
                    app2 = this.nullableAppAdapter.mo16804a(qVar);
                    break;
                case 4:
                    num = this.nullableIntAdapter.mo16804a(qVar);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 7:
                    l = this.nullableLongAdapter.mo16804a(qVar);
                    break;
            }
        }
        qVar.mo16849z();
        return new JsonApp(str, str2, str3, app2, num, str4, str5, l);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        JsonApp jsonApp = (JsonApp) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(jsonApp, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.nullableStringAdapter.mo16805e(uVar, jsonApp.f11018a);
        uVar.mo16865O("hash");
        this.nullableStringAdapter.mo16805e(uVar, jsonApp.f11019b);
        uVar.mo16865O("lastUpdate");
        this.nullableStringAdapter.mo16805e(uVar, jsonApp.f11020c);
        uVar.mo16865O("app");
        this.nullableAppAdapter.mo16805e(uVar, jsonApp.f11021d);
        uVar.mo16865O("statusCode");
        this.nullableIntAdapter.mo16805e(uVar, jsonApp.f11022e);
        uVar.mo16865O("message");
        this.nullableStringAdapter.mo16805e(uVar, jsonApp.f11023f);
        uVar.mo16865O("error");
        this.nullableStringAdapter.mo16805e(uVar, jsonApp.f11024g);
        uVar.mo16865O("issuedAt");
        this.nullableLongAdapter.mo16805e(uVar, jsonApp.f11025h);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(JsonApp)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(JsonApp)";
    }
}
