package com.appfoundry.previewer.model;

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

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0012"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/ChartDataJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/ChartData;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "nullableStringAdapter", "Lb/p/a/l;", "", "", "nullableListOfAnyAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class ChartDataJsonAdapter extends C5075l<ChartData> {
    private final C5075l<List<Object>> nullableListOfAnyAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;

    public ChartDataJsonAdapter(C5099x xVar) {
        C6888i.m12438e(xVar, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("data", "name");
        C6888i.m12437d(a, "JsonReader.Options.of(\"data\", \"name\")");
        this.options = a;
        ParameterizedType m = C4805c3.m8814m(List.class, Object.class);
        C6800r rVar = C6800r.f13715g;
        C5075l<List<Object>> d = xVar.mo16932d(m, rVar, "data");
        C6888i.m12437d(d, "moshi.adapter(Types.newP…emptySet(),\n      \"data\")");
        this.nullableListOfAnyAdapter = d;
        C5075l<String> d2 = xVar.mo16932d(String.class, rVar, "name");
        C6888i.m12437d(d2, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.nullableStringAdapter = d2;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C6888i.m12438e(qVar, "reader");
        qVar.mo16840e();
        List list = null;
        String str = null;
        while (qVar.mo16835N()) {
            int n0 = qVar.mo16844n0(this.options);
            if (n0 == -1) {
                qVar.mo16845o0();
                qVar.mo16846p0();
            } else if (n0 == 0) {
                list = this.nullableListOfAnyAdapter.mo16804a(qVar);
            } else if (n0 == 1) {
                str = this.nullableStringAdapter.mo16804a(qVar);
            }
        }
        qVar.mo16849z();
        return new ChartData(list, str);
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        ChartData chartData = (ChartData) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(chartData, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("data");
        this.nullableListOfAnyAdapter.mo16805e(uVar, chartData.f10937a);
        uVar.mo16865O("name");
        this.nullableStringAdapter.mo16805e(uVar, chartData.f10938b);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(ChartData)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ChartData)";
    }
}
