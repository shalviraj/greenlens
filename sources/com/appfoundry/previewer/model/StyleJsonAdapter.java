package com.appfoundry.previewer.model;

import androidx.constraintlayout.motion.widget.Key;
import com.segment.analytics.AnalyticsContext;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5078n;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5087u;
import p005b.p280p.p281a.C5099x;
import p005b.p280p.p281a.p284z.C5117b;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\tR$\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\tR$\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\tR\u001e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\tR\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\t¨\u0006#"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/StyleJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Style;", "", "toString", "()Ljava/lang/String;", "", "Lcom/appfoundry/previewer/model/GradientColorStop;", "nullableListOfGradientColorStopAdapter", "Lb/p/a/l;", "nullableStringAdapter", "", "nullableFloatAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableIntAdapter", "Lcom/appfoundry/previewer/model/Coordinate;", "nullableListOfCoordinateAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stringAdapter", "nullableListOfFloatAdapter", "Lcom/appfoundry/previewer/model/Dimensions;", "nullableDimensionsAdapter", "Lcom/appfoundry/previewer/model/Shadow;", "nullableShadowAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class StyleJsonAdapter extends C5075l<Style> {
    private volatile Constructor<Style> constructorRef;
    private final C5075l<Boolean> nullableBooleanAdapter;
    private final C5075l<Dimensions> nullableDimensionsAdapter;
    private final C5075l<Float> nullableFloatAdapter;
    private final C5075l<Integer> nullableIntAdapter;
    private final C5075l<List<Coordinate>> nullableListOfCoordinateAdapter;
    private final C5075l<List<Float>> nullableListOfFloatAdapter;
    private final C5075l<List<GradientColorStop>> nullableListOfGradientColorStopAdapter;
    private final C5075l<Shadow> nullableShadowAdapter;
    private final C5075l<String> nullableStringAdapter;
    private final C5081q.C5082a options;
    private final C5075l<String> stringAdapter;

    public StyleJsonAdapter(C5099x xVar) {
        C5099x xVar2 = xVar;
        Class<Float> cls = Float.class;
        Class<String> cls2 = String.class;
        C6888i.m12438e(xVar2, "moshi");
        C5081q.C5082a a = C5081q.C5082a.m9296a(AnalyticsContext.Device.DEVICE_ID_KEY, "color", "backgroundColor", "textBackgroundColor", "fontId", "fontSize", "lineHeight", "letterSpacing", "width", "height", "margins", "paddings", "positioning", "textAlign", "horizontalPosition", "verticalPosition", "scaleMode", "opacity", "gradientType", "gradientPositions", "gradientColorStops", "overlay", "aspectRatio", "borderWidth", "borderColor", "shadow", "borderRadius", "cornerRadii", "minHeight", "textCase", "textDecoration", Key.ROTATION, "behavior", "italic", "fontWeight", "anchor", "modalHeight", "modalResizable", "popupColor", "popupBlur");
        C6888i.m12437d(a, "JsonReader.Options.of(\"i…popupColor\", \"popupBlur\")");
        this.options = a;
        C6800r rVar = C6800r.f13715g;
        C5075l<String> d = xVar2.mo16932d(cls2, rVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        C6888i.m12437d(d, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.stringAdapter = d;
        C5075l<String> d2 = xVar2.mo16932d(cls2, rVar, "color");
        C6888i.m12437d(d2, "moshi.adapter(String::cl…     emptySet(), \"color\")");
        this.nullableStringAdapter = d2;
        C5075l<Float> d3 = xVar2.mo16932d(cls, rVar, "fontSize");
        C6888i.m12437d(d3, "moshi.adapter(Float::cla…  emptySet(), \"fontSize\")");
        this.nullableFloatAdapter = d3;
        C5075l<Dimensions> d4 = xVar2.mo16932d(Dimensions.class, rVar, "margins");
        C6888i.m12437d(d4, "moshi.adapter(Dimensions…a, emptySet(), \"margins\")");
        this.nullableDimensionsAdapter = d4;
        C5075l<Integer> d5 = xVar2.mo16932d(Integer.class, rVar, "opacity");
        C6888i.m12437d(d5, "moshi.adapter(Int::class…   emptySet(), \"opacity\")");
        this.nullableIntAdapter = d5;
        C5075l<List<Coordinate>> d6 = xVar2.mo16932d(C4805c3.m8814m(List.class, Coordinate.class), rVar, "gradientPositions");
        C6888i.m12437d(d6, "moshi.adapter(Types.newP…t(), \"gradientPositions\")");
        this.nullableListOfCoordinateAdapter = d6;
        C5075l<List<GradientColorStop>> d7 = xVar2.mo16932d(C4805c3.m8814m(List.class, GradientColorStop.class), rVar, "gradientColorStops");
        C6888i.m12437d(d7, "moshi.adapter(Types.newP…(), \"gradientColorStops\")");
        this.nullableListOfGradientColorStopAdapter = d7;
        C5075l<Boolean> d8 = xVar2.mo16932d(Boolean.class, rVar, "overlay");
        C6888i.m12437d(d8, "moshi.adapter(Boolean::c…e, emptySet(), \"overlay\")");
        this.nullableBooleanAdapter = d8;
        C5075l<Shadow> d9 = xVar2.mo16932d(Shadow.class, rVar, "shadow");
        C6888i.m12437d(d9, "moshi.adapter(Shadow::cl…    emptySet(), \"shadow\")");
        this.nullableShadowAdapter = d9;
        C5075l<List<Float>> d10 = xVar2.mo16932d(C4805c3.m8814m(List.class, cls), rVar, "cornerRadii");
        C6888i.m12437d(d10, "moshi.adapter(Types.newP…mptySet(), \"cornerRadii\")");
        this.nullableListOfFloatAdapter = d10;
    }

    /* renamed from: a */
    public Object mo16804a(C5081q qVar) {
        C5081q qVar2 = qVar;
        Class<Dimensions> cls = Dimensions.class;
        Class<Boolean> cls2 = Boolean.class;
        Class<Integer> cls3 = Integer.class;
        Class<Float> cls4 = Float.class;
        Class<String> cls5 = String.class;
        C6888i.m12438e(qVar2, "reader");
        qVar.mo16840e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        Float f5 = null;
        Dimensions dimensions = null;
        Dimensions dimensions2 = null;
        Dimensions dimensions3 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Integer num = null;
        String str10 = null;
        List list = null;
        List list2 = null;
        Boolean bool = null;
        Float f6 = null;
        Float f7 = null;
        String str11 = null;
        Shadow shadow = null;
        Float f8 = null;
        List list3 = null;
        Float f9 = null;
        String str12 = null;
        String str13 = null;
        Float f10 = null;
        String str14 = null;
        Boolean bool2 = null;
        Integer num2 = null;
        String str15 = null;
        Integer num3 = null;
        Boolean bool3 = null;
        String str16 = null;
        Boolean bool4 = null;
        while (qVar.mo16835N()) {
            switch (qVar2.mo16844n0(this.options)) {
                case -1:
                    qVar.mo16845o0();
                    qVar.mo16846p0();
                    break;
                case 0:
                    str = this.stringAdapter.mo16804a(qVar2);
                    if (str != null) {
                        break;
                    } else {
                        C5078n m = C5117b.m9426m(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar2);
                        C6888i.m12437d(m, "Util.unexpectedNull(\"id\", \"id\", reader)");
                        throw m;
                    }
                case 1:
                    str2 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 5:
                    f = this.nullableFloatAdapter.mo16804a(qVar2);
                    break;
                case 6:
                    f2 = this.nullableFloatAdapter.mo16804a(qVar2);
                    break;
                case 7:
                    f3 = this.nullableFloatAdapter.mo16804a(qVar2);
                    break;
                case 8:
                    f4 = this.nullableFloatAdapter.mo16804a(qVar2);
                    break;
                case 9:
                    f5 = this.nullableFloatAdapter.mo16804a(qVar2);
                    break;
                case 10:
                    dimensions = this.nullableDimensionsAdapter.mo16804a(qVar2);
                    break;
                case 11:
                    dimensions2 = this.nullableDimensionsAdapter.mo16804a(qVar2);
                    break;
                case 12:
                    dimensions3 = this.nullableDimensionsAdapter.mo16804a(qVar2);
                    break;
                case 13:
                    str6 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 14:
                    str7 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 15:
                    str8 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 16:
                    str9 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 17:
                    num = this.nullableIntAdapter.mo16804a(qVar2);
                    break;
                case 18:
                    str10 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 19:
                    list = this.nullableListOfCoordinateAdapter.mo16804a(qVar2);
                    break;
                case 20:
                    list2 = this.nullableListOfGradientColorStopAdapter.mo16804a(qVar2);
                    break;
                case 21:
                    bool = this.nullableBooleanAdapter.mo16804a(qVar2);
                    break;
                case 22:
                    f6 = this.nullableFloatAdapter.mo16804a(qVar2);
                    break;
                case 23:
                    f7 = this.nullableFloatAdapter.mo16804a(qVar2);
                    break;
                case 24:
                    str11 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 25:
                    shadow = this.nullableShadowAdapter.mo16804a(qVar2);
                    break;
                case 26:
                    f8 = this.nullableFloatAdapter.mo16804a(qVar2);
                    break;
                case 27:
                    list3 = this.nullableListOfFloatAdapter.mo16804a(qVar2);
                    break;
                case 28:
                    f9 = this.nullableFloatAdapter.mo16804a(qVar2);
                    break;
                case 29:
                    str12 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 30:
                    str13 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 31:
                    f10 = this.nullableFloatAdapter.mo16804a(qVar2);
                    break;
                case 32:
                    str14 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 33:
                    bool2 = this.nullableBooleanAdapter.mo16804a(qVar2);
                    break;
                case 34:
                    num2 = this.nullableIntAdapter.mo16804a(qVar2);
                    break;
                case 35:
                    str15 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 36:
                    num3 = this.nullableIntAdapter.mo16804a(qVar2);
                    break;
                case 37:
                    bool3 = this.nullableBooleanAdapter.mo16804a(qVar2);
                    break;
                case 38:
                    str16 = this.nullableStringAdapter.mo16804a(qVar2);
                    break;
                case 39:
                    bool4 = this.nullableBooleanAdapter.mo16804a(qVar2);
                    break;
            }
        }
        qVar.mo16849z();
        Class<Boolean> cls6 = cls2;
        Class<Integer> cls7 = cls3;
        int i = (int) 4294967295L;
        if (-1 != i || -1 != i) {
            Constructor<Style> constructor = this.constructorRef;
            if (constructor == null) {
                Class cls8 = Integer.TYPE;
                constructor = Style.class.getDeclaredConstructor(new Class[]{cls5, cls5, cls5, cls5, cls5, cls4, cls4, cls4, cls4, cls4, cls, cls, cls, cls5, cls5, cls5, cls5, cls7, cls5, List.class, List.class, cls6, cls4, cls4, cls5, Shadow.class, cls4, List.class, cls4, cls5, cls5, cls4, cls5, cls6, cls7, cls5, cls7, cls6, cls5, cls6, cls7, cls7, cls8, cls8, C5117b.f9905c});
                this.constructorRef = constructor;
                C6888i.m12437d(constructor, "Style::class.java.getDec…his.constructorRef = it }");
            }
            Object[] objArr = new Object[45];
            if (str != null) {
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = str3;
                objArr[3] = str4;
                objArr[4] = str5;
                objArr[5] = f;
                objArr[6] = f2;
                objArr[7] = f3;
                objArr[8] = f4;
                objArr[9] = f5;
                objArr[10] = dimensions;
                objArr[11] = dimensions2;
                objArr[12] = dimensions3;
                objArr[13] = str6;
                objArr[14] = str7;
                objArr[15] = str8;
                objArr[16] = str9;
                objArr[17] = num;
                objArr[18] = str10;
                objArr[19] = list;
                objArr[20] = list2;
                objArr[21] = bool;
                objArr[22] = f6;
                objArr[23] = f7;
                objArr[24] = str11;
                objArr[25] = shadow;
                objArr[26] = f8;
                objArr[27] = list3;
                objArr[28] = f9;
                objArr[29] = str12;
                objArr[30] = str13;
                objArr[31] = f10;
                objArr[32] = str14;
                objArr[33] = bool2;
                objArr[34] = num2;
                objArr[35] = str15;
                objArr[36] = num3;
                objArr[37] = bool3;
                objArr[38] = str16;
                objArr[39] = bool4;
                objArr[40] = null;
                objArr[41] = null;
                objArr[42] = -1;
                objArr[43] = -1;
                objArr[44] = null;
                Style newInstance = constructor.newInstance(objArr);
                C6888i.m12437d(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            C5078n g = C5117b.m9420g(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar);
            C6888i.m12437d(g, "Util.missingProperty(\"id\", \"id\", reader)");
            throw g;
        } else if (str != null) {
            return new Style(str, str2, str3, str4, str5, f, f2, f3, f4, f5, dimensions, dimensions2, dimensions3, str6, str7, str8, str9, num, str10, list, list2, bool, f6, f7, str11, shadow, f8, list3, f9, str12, str13, f10, str14, bool2, num2, str15, num3, bool3, str16, bool4, (Integer) null, (Integer) null, 0, 768, (DefaultConstructorMarker) null);
        } else {
            C5078n g2 = C5117b.m9420g(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar2);
            C6888i.m12437d(g2, "Util.missingProperty(\"id\", \"id\", reader)");
            throw g2;
        }
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, Object obj) {
        Style style = (Style) obj;
        C6888i.m12438e(uVar, "writer");
        Objects.requireNonNull(style, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        uVar.mo16869e();
        uVar.mo16865O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.stringAdapter.mo16805e(uVar, style.f11140a);
        uVar.mo16865O("color");
        this.nullableStringAdapter.mo16805e(uVar, style.f11141b);
        uVar.mo16865O("backgroundColor");
        this.nullableStringAdapter.mo16805e(uVar, style.f11142c);
        uVar.mo16865O("textBackgroundColor");
        this.nullableStringAdapter.mo16805e(uVar, style.f11143d);
        uVar.mo16865O("fontId");
        this.nullableStringAdapter.mo16805e(uVar, style.f11144e);
        uVar.mo16865O("fontSize");
        this.nullableFloatAdapter.mo16805e(uVar, style.f11145f);
        uVar.mo16865O("lineHeight");
        this.nullableFloatAdapter.mo16805e(uVar, style.f11146g);
        uVar.mo16865O("letterSpacing");
        this.nullableFloatAdapter.mo16805e(uVar, style.f11147h);
        uVar.mo16865O("width");
        this.nullableFloatAdapter.mo16805e(uVar, style.f11148i);
        uVar.mo16865O("height");
        this.nullableFloatAdapter.mo16805e(uVar, style.f11149j);
        uVar.mo16865O("margins");
        this.nullableDimensionsAdapter.mo16805e(uVar, style.f11150k);
        uVar.mo16865O("paddings");
        this.nullableDimensionsAdapter.mo16805e(uVar, style.f11151l);
        uVar.mo16865O("positioning");
        this.nullableDimensionsAdapter.mo16805e(uVar, style.f11152m);
        uVar.mo16865O("textAlign");
        this.nullableStringAdapter.mo16805e(uVar, style.f11153n);
        uVar.mo16865O("horizontalPosition");
        this.nullableStringAdapter.mo16805e(uVar, style.f11154o);
        uVar.mo16865O("verticalPosition");
        this.nullableStringAdapter.mo16805e(uVar, style.f11155p);
        uVar.mo16865O("scaleMode");
        this.nullableStringAdapter.mo16805e(uVar, style.f11156q);
        uVar.mo16865O("opacity");
        this.nullableIntAdapter.mo16805e(uVar, style.f11157r);
        uVar.mo16865O("gradientType");
        this.nullableStringAdapter.mo16805e(uVar, style.f11158s);
        uVar.mo16865O("gradientPositions");
        this.nullableListOfCoordinateAdapter.mo16805e(uVar, style.f11159t);
        uVar.mo16865O("gradientColorStops");
        this.nullableListOfGradientColorStopAdapter.mo16805e(uVar, style.f11160u);
        uVar.mo16865O("overlay");
        this.nullableBooleanAdapter.mo16805e(uVar, style.f11161v);
        uVar.mo16865O("aspectRatio");
        this.nullableFloatAdapter.mo16805e(uVar, style.f11162w);
        uVar.mo16865O("borderWidth");
        this.nullableFloatAdapter.mo16805e(uVar, style.f11163x);
        uVar.mo16865O("borderColor");
        this.nullableStringAdapter.mo16805e(uVar, style.f11164y);
        uVar.mo16865O("shadow");
        this.nullableShadowAdapter.mo16805e(uVar, style.f11165z);
        uVar.mo16865O("borderRadius");
        this.nullableFloatAdapter.mo16805e(uVar, style.f11124A);
        uVar.mo16865O("cornerRadii");
        this.nullableListOfFloatAdapter.mo16805e(uVar, style.f11125B);
        uVar.mo16865O("minHeight");
        this.nullableFloatAdapter.mo16805e(uVar, style.f11126C);
        uVar.mo16865O("textCase");
        this.nullableStringAdapter.mo16805e(uVar, style.f11127D);
        uVar.mo16865O("textDecoration");
        this.nullableStringAdapter.mo16805e(uVar, style.f11128E);
        uVar.mo16865O(Key.ROTATION);
        this.nullableFloatAdapter.mo16805e(uVar, style.f11129F);
        uVar.mo16865O("behavior");
        this.nullableStringAdapter.mo16805e(uVar, style.f11130G);
        uVar.mo16865O("italic");
        this.nullableBooleanAdapter.mo16805e(uVar, style.f11131H);
        uVar.mo16865O("fontWeight");
        this.nullableIntAdapter.mo16805e(uVar, style.f11132I);
        uVar.mo16865O("anchor");
        this.nullableStringAdapter.mo16805e(uVar, style.f11133J);
        uVar.mo16865O("modalHeight");
        this.nullableIntAdapter.mo16805e(uVar, style.f11134K);
        uVar.mo16865O("modalResizable");
        this.nullableBooleanAdapter.mo16805e(uVar, style.f11135L);
        uVar.mo16865O("popupColor");
        this.nullableStringAdapter.mo16805e(uVar, style.f11136M);
        uVar.mo16865O("popupBlur");
        this.nullableBooleanAdapter.mo16805e(uVar, style.f11137N);
        uVar.mo16864H();
    }

    public String toString() {
        C6888i.m12437d("GeneratedJsonAdapter(Style)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Style)";
    }
}
