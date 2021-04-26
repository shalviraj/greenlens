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

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR$\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0015"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/MapJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Map;", "", "toString", "()Ljava/lang/String;", "", "nullableBooleanAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableIntAdapter", "", "", "nullableListOfFloatAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class MapJsonAdapter extends C5075l<Map> {
    private final C5075l<Boolean> nullableBooleanAdapter;
    private final C5075l<Integer> nullableIntAdapter;
    private final C5075l<List<Float>> nullableListOfFloatAdapter;
    private final C5081q.C5082a options;

    public MapJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("zoom", "center", "interactive");
        C6888i.m12437d(a, "JsonReader.Options.of(\"z… \"center\", \"interactive\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<Integer> d = xVar.mo16932d(Integer.class, rVar, "zoom");
        C6888i.m12437d(d, "moshi.adapter(Int::class…      emptySet(), \"zoom\")");
        this.nullableIntAdapter = d;
        C5075l<List<Float>> d2 = xVar.mo16932d(C4805c3.m8814m(List.class, Float.class), rVar, "center");
        C6888i.m12437d(d2, "moshi.adapter(Types.newP…    emptySet(), \"center\")");
        this.nullableListOfFloatAdapter = d2;
        C5075l<Boolean> d3 = xVar.mo16932d(Boolean.class, rVar, "interactive");
        C6888i.m12437d(d3, "moshi.adapter(Boolean::c…mptySet(), \"interactive\")");
        this.nullableBooleanAdapter = d3;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        Integer num = null;
        List list = null;
        Boolean bool = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                num = this.nullableIntAdapter.mo16804a(qVar);
            } else if (n0 == 1) {
                list = this.nullableListOfFloatAdapter.mo16804a(qVar);
            } else if (n0 == 2) {
                bool = this.nullableBooleanAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        return new Map(num, list, bool);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        Map map = (Map) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(map, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("zoom");
        this.nullableIntAdapter.mo16805e(uVar, map.f11026a);
        uVar.mo16865O("center");
        this.nullableListOfFloatAdapter.mo16805e(uVar, map.f11027b);
        uVar.mo16865O("interactive");
        this.nullableBooleanAdapter.mo16805e(uVar, map.f11028c);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(Map)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Map)";
    }
}
