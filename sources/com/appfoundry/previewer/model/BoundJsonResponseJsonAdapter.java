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

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR$\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\t¨\u0006\u001a"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/BoundJsonResponseJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/BoundJsonResponse;", "", "toString", "()Ljava/lang/String;", "", "Lcom/appfoundry/previewer/model/Asset;", "nullableListOfAssetAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Style;", "nullableListOfStyleAdapter", "", "nullableBooleanAdapter", "Lcom/appfoundry/previewer/model/DebugRequest;", "nullableListOfDebugRequestAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lcom/appfoundry/previewer/model/BoundNode;", "nullableBoundNodeAdapter", "nullableStringAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class BoundJsonResponseJsonAdapter extends C5075l<BoundJsonResponse> {
    private final C5075l<Boolean> nullableBooleanAdapter;
    private final C5075l<BoundNode> nullableBoundNodeAdapter;
    private final C5075l<List<Asset>> nullableListOfAssetAdapter;
    private final C5075l<List<DebugRequest>> nullableListOfDebugRequestAdapter;
    private final C5075l<List<Style>> nullableListOfStyleAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;

    public BoundJsonResponseJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("data", "styles", "assets", "nextLink", "success", "debugRequests");
        C6888i.m12437d(a, "JsonReader.Options.of(\"d…uccess\", \"debugRequests\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<BoundNode> d = xVar.mo16932d(BoundNode.class, rVar, "data");
        C6888i.m12437d(d, "moshi.adapter(BoundNode:…java, emptySet(), \"data\")");
        this.nullableBoundNodeAdapter = d;
        C5075l<List<Style>> d2 = xVar.mo16932d(C4805c3.m8814m(List.class, Style.class), rVar, "styles");
        C6888i.m12437d(d2, "moshi.adapter(Types.newP…ptySet(),\n      \"styles\")");
        this.nullableListOfStyleAdapter = d2;
        C5075l<List<Asset>> d3 = xVar.mo16932d(C4805c3.m8814m(List.class, Asset.class), rVar, "assets");
        C6888i.m12437d(d3, "moshi.adapter(Types.newP…ptySet(),\n      \"assets\")");
        this.nullableListOfAssetAdapter = d3;
        C5075l<String> d4 = xVar.mo16932d(String.class, rVar, "nextLink");
        C6888i.m12437d(d4, "moshi.adapter(String::cl…  emptySet(), \"nextLink\")");
        this.nullableStringAdapter = d4;
        C5075l<Boolean> d5 = xVar.mo16932d(Boolean.class, rVar, "success");
        C6888i.m12437d(d5, "moshi.adapter(Boolean::c…e, emptySet(), \"success\")");
        this.nullableBooleanAdapter = d5;
        C5075l<List<DebugRequest>> d6 = xVar.mo16932d(C4805c3.m8814m(List.class, DebugRequest.class), rVar, "debugRequests");
        C6888i.m12437d(d6, "moshi.adapter(Types.newP…tySet(), \"debugRequests\")");
        this.nullableListOfDebugRequestAdapter = d6;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        BoundNode boundNode = null;
        List list = null;
        List list2 = null;
        String str = null;
        Boolean bool = null;
        List list3 = null;
        while (qVar.mo16835N()) {
            switch (qVar.mo16844n0(this.options)) {
                case -1:
                    qVar.mo16845o0();
                    qVar.mo16846p0();
                    break;
                case 0:
                    boundNode = this.nullableBoundNodeAdapter.mo16804a(qVar);
                    break;
                case 1:
                    list = this.nullableListOfStyleAdapter.mo16804a(qVar);
                    break;
                case 2:
                    list2 = this.nullableListOfAssetAdapter.mo16804a(qVar);
                    break;
                case 3:
                    str = this.nullableStringAdapter.mo16804a(qVar);
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.mo16804a(qVar);
                    break;
                case 5:
                    list3 = this.nullableListOfDebugRequestAdapter.mo16804a(qVar);
                    break;
            }
        }
        qVar.mo16849z();
        return new BoundJsonResponse(boundNode, list, list2, str, bool, list3);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        BoundJsonResponse boundJsonResponse = (BoundJsonResponse) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(boundJsonResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("data");
        this.nullableBoundNodeAdapter.mo16805e(uVar, boundJsonResponse.f10917a);
        uVar.mo16865O("styles");
        this.nullableListOfStyleAdapter.mo16805e(uVar, boundJsonResponse.f10918b);
        uVar.mo16865O("assets");
        this.nullableListOfAssetAdapter.mo16805e(uVar, boundJsonResponse.f10919c);
        uVar.mo16865O("nextLink");
        this.nullableStringAdapter.mo16805e(uVar, boundJsonResponse.f10920d);
        uVar.mo16865O("success");
        this.nullableBooleanAdapter.mo16805e(uVar, boundJsonResponse.f10921e);
        uVar.mo16865O("debugRequests");
        this.nullableListOfDebugRequestAdapter.mo16805e(uVar, boundJsonResponse.f10922f);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(BoundJsonResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(BoundJsonResponse)";
    }
}
