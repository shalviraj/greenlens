package com.appfoundry.previewer.model;

import androidx.core.app.NotificationCompat;
import com.segment.analytics.AnalyticsContext;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p005b.p280p.p281a.p284z.C5117b;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R$\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R$\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u001e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/ParamsJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Params;", "", "toString", "()Ljava/lang/String;", "nullableStringAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "Lcom/appfoundry/previewer/model/Marker;", "nullableListOfMarkerAdapter", "Lcom/appfoundry/previewer/model/ChartData;", "nullableListOfChartDataAdapter", "", "nullableFloatAdapter", "nullableListOfStringAdapter", "Lcom/appfoundry/previewer/model/Map;", "nullableMapAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class ParamsJsonAdapter extends C5075l<Params> {
    private volatile Constructor<Params> constructorRef;
    private final C5075l<Boolean> nullableBooleanAdapter;
    private final C5075l<Float> nullableFloatAdapter;
    private final C5075l<List<ChartData>> nullableListOfChartDataAdapter;
    private final C5075l<List<Marker>> nullableListOfMarkerAdapter;
    private final C5075l<List<String>> nullableListOfStringAdapter;
    private final C5075l<Map> nullableMapAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;

    public ParamsJsonAdapter(C5099x xVar) {
        C5099x xVar2 = xVar;
        Class<String> cls = String.class;
        C6888i.m12438e(xVar2, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a("url", "title", "datetime", "phone", NotificationCompat.CATEGORY_EMAIL, "place", "lat", "long", "startDate", "endDate", AnalyticsContext.Device.DEVICE_ID_KEY, "provider", "message", "href", "triggerUrl", "confirmPrompt", "infinite", "animation", "automatic", "map", "markers", "zoom", "chartType", "categories", "series", "colors", "hrefRemote", "required");
        C6888i.m12437d(a, "JsonReader.Options.of(\"u…\"hrefRemote\", \"required\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar2.mo16932d(cls, rVar, "url");
        C6888i.m12437d(d, "moshi.adapter(String::cl…\n      emptySet(), \"url\")");
        this.nullableStringAdapter = d;
        C5075l<Float> d2 = xVar2.mo16932d(Float.class, rVar, "lat");
        C6888i.m12437d(d2, "moshi.adapter(Float::cla…\n      emptySet(), \"lat\")");
        this.nullableFloatAdapter = d2;
        C5075l<Boolean> d3 = xVar2.mo16932d(Boolean.class, rVar, "infinite");
        C6888i.m12437d(d3, "moshi.adapter(Boolean::c…, emptySet(), \"infinite\")");
        this.nullableBooleanAdapter = d3;
        C5075l<Map> d4 = xVar2.mo16932d(Map.class, rVar, "map");
        C6888i.m12437d(d4, "moshi.adapter(Map::class… emptySet(),\n      \"map\")");
        this.nullableMapAdapter = d4;
        C5075l<List<Marker>> d5 = xVar2.mo16932d(C4805c3.m8814m(List.class, Marker.class), rVar, "markers");
        C6888i.m12437d(d5, "moshi.adapter(Types.newP…tySet(),\n      \"markers\")");
        this.nullableListOfMarkerAdapter = d5;
        C5075l<List<String>> d6 = xVar2.mo16932d(C4805c3.m8814m(List.class, cls), rVar, "categories");
        C6888i.m12437d(d6, "moshi.adapter(Types.newP…et(),\n      \"categories\")");
        this.nullableListOfStringAdapter = d6;
        C5075l<List<ChartData>> d7 = xVar2.mo16932d(C4805c3.m8814m(List.class, ChartData.class), rVar, "series");
        C6888i.m12437d(d7, "moshi.adapter(Types.newP…ptySet(),\n      \"series\")");
        this.nullableListOfChartDataAdapter = d7;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        long j;
        C5081q qVar2 = qVar;
        Class<Boolean> cls = Boolean.class;
        Class<Float> cls2 = Float.class;
        Class<String> cls3 = String.class;
        C6888i.m12438e(qVar2, "reader");
        qVar.mo16840e();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Float f = null;
        Float f2 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        Boolean bool = null;
        String str15 = null;
        Boolean bool2 = null;
        Map map = null;
        List list = null;
        Float f3 = null;
        String str16 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String str17 = null;
        Boolean bool3 = null;
        while (qVar.mo16835N()) {
            switch (qVar2.mo16844n0(this.options)) {
                case -1:
                    qVar.mo16845o0();
                    qVar.mo16846p0();
                    continue;
                case 0:
                    str = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294967294L;
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294967293L;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294967291L;
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294967287L;
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294967279L;
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294967263L;
                    break;
                case 6:
                    f = this.nullableFloatAdapter.mo16804a(qVar2);
                    j = 4294967231L;
                    break;
                case 7:
                    f2 = this.nullableFloatAdapter.mo16804a(qVar2);
                    j = 4294967167L;
                    break;
                case 8:
                    str7 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294967039L;
                    break;
                case 9:
                    str8 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294966783L;
                    break;
                case 10:
                    str9 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294966271L;
                    break;
                case 11:
                    str10 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294965247L;
                    break;
                case 12:
                    str11 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294963199L;
                    break;
                case 13:
                    str12 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294959103L;
                    break;
                case 14:
                    str13 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294950911L;
                    break;
                case 15:
                    str14 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294934527L;
                    break;
                case 16:
                    bool = this.nullableBooleanAdapter.mo16804a(qVar2);
                    j = 4294901759L;
                    break;
                case 17:
                    str15 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4294836223L;
                    break;
                case 18:
                    bool2 = this.nullableBooleanAdapter.mo16804a(qVar2);
                    j = 4294705151L;
                    break;
                case 19:
                    map = this.nullableMapAdapter.mo16804a(qVar2);
                    j = 4294443007L;
                    break;
                case 20:
                    list = this.nullableListOfMarkerAdapter.mo16804a(qVar2);
                    j = 4293918719L;
                    break;
                case 21:
                    f3 = this.nullableFloatAdapter.mo16804a(qVar2);
                    j = 4292870143L;
                    break;
                case 22:
                    str16 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4290772991L;
                    break;
                case 23:
                    list2 = this.nullableListOfStringAdapter.mo16804a(qVar2);
                    j = 4286578687L;
                    break;
                case 24:
                    list3 = this.nullableListOfChartDataAdapter.mo16804a(qVar2);
                    j = 4278190079L;
                    break;
                case 25:
                    list4 = this.nullableListOfStringAdapter.mo16804a(qVar2);
                    j = 4261412863L;
                    break;
                case 26:
                    str17 = this.nullableStringAdapter.mo16804a(qVar2);
                    j = 4227858431L;
                    break;
                case 27:
                    bool3 = this.nullableBooleanAdapter.mo16804a(qVar2);
                    j = 4160749567L;
                    break;
            }
            i &= (int) j;
        }
        qVar.mo16849z();
        if (i == ((int) 4026531840L)) {
            return new Params(str, str2, str3, str4, str5, str6, f, f2, str7, str8, str9, str10, str11, str12, str13, str14, bool, str15, bool2, map, list, f3, str16, list2, list3, list4, str17, bool3);
        }
        Constructor<Params> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Params.class.getDeclaredConstructor(new Class[]{cls3, cls3, cls3, cls3, cls3, cls3, cls2, cls2, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls, cls3, cls, Map.class, List.class, cls2, cls3, List.class, List.class, List.class, cls3, cls, Integer.TYPE, C5117b.f9905c});
            this.constructorRef = constructor;
            C6888i.m12437d(constructor, "Params::class.java.getDe…his.constructorRef = it }");
        }
        Params newInstance = constructor.newInstance(new Object[]{str, str2, str3, str4, str5, str6, f, f2, str7, str8, str9, str10, str11, str12, str13, str14, bool, str15, bool2, map, list, f3, str16, list2, list3, list4, str17, bool3, Integer.valueOf(i), null});
        C6888i.m12437d(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        Params params = (Params) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(params, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O("url");
        this.nullableStringAdapter.mo16805e(uVar, params.f11061a);
        uVar.mo16865O("title");
        this.nullableStringAdapter.mo16805e(uVar, params.f11062b);
        uVar.mo16865O("datetime");
        this.nullableStringAdapter.mo16805e(uVar, params.f11063c);
        uVar.mo16865O("phone");
        this.nullableStringAdapter.mo16805e(uVar, params.f11064d);
        uVar.mo16865O(NotificationCompat.CATEGORY_EMAIL);
        this.nullableStringAdapter.mo16805e(uVar, params.f11065e);
        uVar.mo16865O("place");
        this.nullableStringAdapter.mo16805e(uVar, params.f11066f);
        uVar.mo16865O("lat");
        this.nullableFloatAdapter.mo16805e(uVar, params.f11067g);
        uVar.mo16865O("long");
        this.nullableFloatAdapter.mo16805e(uVar, params.f11068h);
        uVar.mo16865O("startDate");
        this.nullableStringAdapter.mo16805e(uVar, params.f11069i);
        uVar.mo16865O("endDate");
        this.nullableStringAdapter.mo16805e(uVar, params.f11070j);
        uVar.mo16865O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.nullableStringAdapter.mo16805e(uVar, params.f11071k);
        uVar.mo16865O("provider");
        this.nullableStringAdapter.mo16805e(uVar, params.f11072l);
        uVar.mo16865O("message");
        this.nullableStringAdapter.mo16805e(uVar, params.f11073m);
        uVar.mo16865O("href");
        this.nullableStringAdapter.mo16805e(uVar, params.f11074n);
        uVar.mo16865O("triggerUrl");
        this.nullableStringAdapter.mo16805e(uVar, params.f11075o);
        uVar.mo16865O("confirmPrompt");
        this.nullableStringAdapter.mo16805e(uVar, params.f11076p);
        uVar.mo16865O("infinite");
        this.nullableBooleanAdapter.mo16805e(uVar, params.f11077q);
        uVar.mo16865O("animation");
        this.nullableStringAdapter.mo16805e(uVar, params.f11078r);
        uVar.mo16865O("automatic");
        this.nullableBooleanAdapter.mo16805e(uVar, params.f11079s);
        uVar.mo16865O("map");
        this.nullableMapAdapter.mo16805e(uVar, params.f11080t);
        uVar.mo16865O("markers");
        this.nullableListOfMarkerAdapter.mo16805e(uVar, params.f11081u);
        uVar.mo16865O("zoom");
        this.nullableFloatAdapter.mo16805e(uVar, params.f11082v);
        uVar.mo16865O("chartType");
        this.nullableStringAdapter.mo16805e(uVar, params.f11083w);
        uVar.mo16865O("categories");
        this.nullableListOfStringAdapter.mo16805e(uVar, params.f11084x);
        uVar.mo16865O("series");
        this.nullableListOfChartDataAdapter.mo16805e(uVar, params.f11085y);
        uVar.mo16865O("colors");
        this.nullableListOfStringAdapter.mo16805e(uVar, params.f11086z);
        uVar.mo16865O("hrefRemote");
        this.nullableStringAdapter.mo16805e(uVar, params.f11059A);
        uVar.mo16865O("required");
        this.nullableBooleanAdapter.mo16805e(uVar, params.f11060B);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(Params)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Params)";
    }
}
