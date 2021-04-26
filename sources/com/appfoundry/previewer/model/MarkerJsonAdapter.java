package com.appfoundry.previewer.model;

import java.util.Objects;
import kotlin.Metadata;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5078n;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p005b.p280p.p281a.p284z.C5117b;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0013"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/MarkerJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Marker;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "stringAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Geometry;", "nullableGeometryAdapter", "Lcom/appfoundry/previewer/model/Properties;", "nullablePropertiesAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class MarkerJsonAdapter extends C5075l<Marker> {
    private final C5075l<Geometry> nullableGeometryAdapter;
    private final C5075l<Properties> nullablePropertiesAdapter;
    private final C5081q.C5082a options;
    private final C5075l<String> stringAdapter;

    public MarkerJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("type", "geometry", "properties");
        C6888i.m12437d(a, "JsonReader.Options.of(\"t…\"geometry\", \"properties\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar.mo16932d(String.class, rVar, "type");
        C6888i.m12437d(d, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.stringAdapter = d;
        C5075l<Geometry> d2 = xVar.mo16932d(Geometry.class, rVar, "geometry");
        C6888i.m12437d(d2, "moshi.adapter(Geometry::…  emptySet(), \"geometry\")");
        this.nullableGeometryAdapter = d2;
        C5075l<Properties> d3 = xVar.mo16932d(Properties.class, rVar, "properties");
        C6888i.m12437d(d3, "moshi.adapter(Properties…emptySet(), \"properties\")");
        this.nullablePropertiesAdapter = d3;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        String str = null;
        Geometry geometry = null;
        Properties properties = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                str = this.stringAdapter.mo16804a(qVar);
                if (str == null) {
                    C5078n m = C5117b.m9426m("type", "type", qVar);
                    C6888i.m12437d(m, "Util.unexpectedNull(\"typ…ype\",\n            reader)");
                    throw m;
                }
            } else if (n0 == 1) {
                geometry = this.nullableGeometryAdapter.mo16804a(qVar);
            } else if (n0 == 2) {
                properties = this.nullablePropertiesAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        if (str != null) {
            return new Marker(str, geometry, properties);
        }
        C5078n g = C5117b.m9420g("type", "type", qVar);
        C6888i.m12437d(g, "Util.missingProperty(\"type\", \"type\", reader)");
        throw g;
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        Marker marker = (Marker) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(marker, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("type");
        this.stringAdapter.mo16805e(uVar, marker.f11029a);
        uVar.mo16865O("geometry");
        this.nullableGeometryAdapter.mo16805e(uVar, marker.f11030b);
        uVar.mo16865O("properties");
        this.nullablePropertiesAdapter.mo16805e(uVar, marker.f11031c);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(Marker)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Marker)";
    }
}
