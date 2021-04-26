package com.appfoundry.previewer.model;

import com.amplitude.api.DatabaseHelper;
import java.lang.reflect.ParameterizedType;
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

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\tR$\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\t¨\u0006\u001d"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/AppJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/App;", "", "toString", "()Ljava/lang/String;", "", "Lcom/appfoundry/previewer/model/Style;", "nullableListOfStyleAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Features;", "nullableFeaturesAdapter", "Lcom/appfoundry/previewer/model/Store;", "nullableStoreAdapter", "Lcom/appfoundry/previewer/model/Paywall;", "nullablePaywallAdapter", "Lcom/appfoundry/previewer/model/Data;", "nullableDataAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lcom/appfoundry/previewer/model/Integration;", "nullableIntegrationAdapter", "Lcom/appfoundry/previewer/model/Asset;", "nullableListOfAssetAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class AppJsonAdapter extends C5075l<App> {
    private final C5075l<Data> nullableDataAdapter;
    private final C5075l<Features> nullableFeaturesAdapter;
    private final C5075l<Integration> nullableIntegrationAdapter;
    private final C5075l<List<Asset>> nullableListOfAssetAdapter;
    private final C5075l<List<Style>> nullableListOfStyleAdapter;
    private final C5075l<Paywall> nullablePaywallAdapter;
    private final C5075l<Store> nullableStoreAdapter;
    private final C5081q.C5082a options;

    public AppJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("fonts", "assets", DatabaseHelper.STORE_TABLE_NAME, "integration", "data", "styles", "features", "paywall");
        C6888i.m12437d(a, "JsonReader.Options.of(\"f…\", \"features\", \"paywall\")");
        this.options = a;
        ParameterizedType m = C4805c3.m8814m(List.class, Asset.class);
        C6800r rVar = C6800r.f13715g;
        C5075l<List<Asset>> d = xVar.mo16932d(m, rVar, "fonts");
        C6888i.m12437d(d, "moshi.adapter(Types.newP…mptySet(),\n      \"fonts\")");
        this.nullableListOfAssetAdapter = d;
        C5075l<Store> d2 = xVar.mo16932d(Store.class, rVar, DatabaseHelper.STORE_TABLE_NAME);
        C6888i.m12437d(d2, "moshi.adapter(Store::cla…     emptySet(), \"store\")");
        this.nullableStoreAdapter = d2;
        C5075l<Integration> d3 = xVar.mo16932d(Integration.class, rVar, "integration");
        C6888i.m12437d(d3, "moshi.adapter(Integratio…mptySet(), \"integration\")");
        this.nullableIntegrationAdapter = d3;
        C5075l<Data> d4 = xVar.mo16932d(Data.class, rVar, "data");
        C6888i.m12437d(d4, "moshi.adapter(Data::clas…emptySet(),\n      \"data\")");
        this.nullableDataAdapter = d4;
        C5075l<List<Style>> d5 = xVar.mo16932d(C4805c3.m8814m(List.class, Style.class), rVar, "styles");
        C6888i.m12437d(d5, "moshi.adapter(Types.newP…ptySet(),\n      \"styles\")");
        this.nullableListOfStyleAdapter = d5;
        C5075l<Features> d6 = xVar.mo16932d(Features.class, rVar, "features");
        C6888i.m12437d(d6, "moshi.adapter(Features::…  emptySet(), \"features\")");
        this.nullableFeaturesAdapter = d6;
        C5075l<Paywall> d7 = xVar.mo16932d(Paywall.class, rVar, "paywall");
        C6888i.m12437d(d7, "moshi.adapter(Paywall::c…   emptySet(), \"paywall\")");
        this.nullablePaywallAdapter = d7;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        List list = null;
        List list2 = null;
        Store store = null;
        Integration integration = null;
        Data data = null;
        List list3 = null;
        Features features = null;
        Paywall paywall = null;
        while (qVar.mo16835N()) {
            switch (qVar.mo16844n0(this.options)) {
                case -1:
                    qVar.mo16845o0();
                    qVar.mo16846p0();
                    break;
                case 0:
                    list = this.nullableListOfAssetAdapter.mo16804a(qVar);
                    break;
                case 1:
                    list2 = this.nullableListOfAssetAdapter.mo16804a(qVar);
                    break;
                case 2:
                    store = this.nullableStoreAdapter.mo16804a(qVar);
                    break;
                case 3:
                    integration = this.nullableIntegrationAdapter.mo16804a(qVar);
                    break;
                case 4:
                    data = this.nullableDataAdapter.mo16804a(qVar);
                    break;
                case 5:
                    list3 = this.nullableListOfStyleAdapter.mo16804a(qVar);
                    break;
                case 6:
                    features = this.nullableFeaturesAdapter.mo16804a(qVar);
                    break;
                case 7:
                    paywall = this.nullablePaywallAdapter.mo16804a(qVar);
                    break;
            }
        }
        qVar.mo16849z();
        return new App(list, list2, store, integration, data, list3, features, paywall);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        App app2 = (App) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(app2, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("fonts");
        this.nullableListOfAssetAdapter.mo16805e(uVar, app2.f10887a);
        uVar.mo16865O("assets");
        this.nullableListOfAssetAdapter.mo16805e(uVar, app2.f10888b);
        uVar.mo16865O(DatabaseHelper.STORE_TABLE_NAME);
        this.nullableStoreAdapter.mo16805e(uVar, app2.f10889c);
        uVar.mo16865O("integration");
        this.nullableIntegrationAdapter.mo16805e(uVar, app2.f10890d);
        uVar.mo16865O("data");
        this.nullableDataAdapter.mo16805e(uVar, app2.f10891e);
        uVar.mo16865O("styles");
        this.nullableListOfStyleAdapter.mo16805e(uVar, app2.f10892f);
        uVar.mo16865O("features");
        this.nullableFeaturesAdapter.mo16805e(uVar, app2.f10893g);
        uVar.mo16865O("paywall");
        this.nullablePaywallAdapter.mo16805e(uVar, app2.f10894h);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(App)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(App)";
    }
}
