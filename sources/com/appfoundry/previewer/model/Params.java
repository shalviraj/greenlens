package com.appfoundry.previewer.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001Bï\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010N\u0012\u0010\b\u0002\u0010i\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\f\u0012\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bp\u0010qJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0004R\u001b\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0004R\u001b\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0004R\u001b\u0010+\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R!\u00102\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\u000e\u001a\u0004\b1\u0010\u0010R\u001b\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\u0013\u001a\u0004\b4\u0010\u0004R\u001b\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\u0013\u001a\u0004\b7\u0010\u0004R\u001b\u0010;\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010\u0013\u001a\u0004\b:\u0010\u0004R\u001b\u0010>\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b=\u0010*R\u001b\u0010A\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010\u0013\u001a\u0004\b@\u0010\u0004R\u001b\u0010D\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010\u0013\u001a\u0004\bC\u0010\u0004R\u001b\u0010G\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010\u0013\u001a\u0004\bF\u0010\u0004R\u001b\u0010J\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010\u001d\u001a\u0004\bI\u0010\u001fR\u001b\u0010M\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010\u0013\u001a\u0004\bL\u0010\u0004R\u001b\u0010S\u001a\u0004\u0018\u00010N8\u0006@\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR!\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\bT\u0010\u000e\u001a\u0004\bU\u0010\u0010R\u001b\u0010Y\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bW\u0010\u0013\u001a\u0004\bX\u0010\u0004R\u001b\u0010\\\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bZ\u0010\u0013\u001a\u0004\b[\u0010\u0004R\u001b\u0010_\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b]\u0010\u001d\u001a\u0004\b^\u0010\u001fR\u001b\u0010b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b`\u0010\u0013\u001a\u0004\ba\u0010\u0004R\u001b\u0010e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bc\u0010\u0013\u001a\u0004\bd\u0010\u0004R!\u0010i\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\bg\u0010\u000e\u001a\u0004\bh\u0010\u0010R\u001b\u0010l\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bj\u0010\u0013\u001a\u0004\bk\u0010\u0004R\u001b\u0010o\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bm\u0010\u0013\u001a\u0004\bn\u0010\u0004¨\u0006r"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/Params;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "x", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "categories", "a", "Ljava/lang/String;", "getUrl", "setUrl", "(Ljava/lang/String;)V", "url", "r", "getAnimation", "animation", "", "v", "Ljava/lang/Float;", "getZoom", "()Ljava/lang/Float;", "zoom", "k", "getId", "id", "d", "getPhone", "phone", "q", "Ljava/lang/Boolean;", "getInfinite", "()Ljava/lang/Boolean;", "infinite", "s", "getAutomatic", "automatic", "Lcom/appfoundry/previewer/model/ChartData;", "y", "getSeries", "series", "A", "getHrefRemote", "hrefRemote", "b", "getTitle", "title", "f", "getPlace", "place", "B", "getRequired", "required", "i", "getStartDate", "startDate", "c", "getDatetime", "datetime", "m", "getMessage", "message", "g", "getLat", "lat", "w", "getChartType", "chartType", "Lcom/appfoundry/previewer/model/Map;", "t", "Lcom/appfoundry/previewer/model/Map;", "getMap", "()Lcom/appfoundry/previewer/model/Map;", "map", "z", "getColors", "colors", "l", "getProvider", "provider", "n", "getHref", "href", "h", "getLong", "long", "j", "getEndDate", "endDate", "p", "getConfirmPrompt", "confirmPrompt", "Lcom/appfoundry/previewer/model/Marker;", "u", "getMarkers", "markers", "e", "getEmail", "email", "o", "getTriggerUrl", "triggerUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/appfoundry/previewer/model/Map;Ljava/util/List;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class Params {

    /* renamed from: A */
    public final String f11059A;

    /* renamed from: B */
    public final Boolean f11060B;

    /* renamed from: a */
    public String f11061a;

    /* renamed from: b */
    public final String f11062b;

    /* renamed from: c */
    public final String f11063c;

    /* renamed from: d */
    public final String f11064d;

    /* renamed from: e */
    public final String f11065e;

    /* renamed from: f */
    public final String f11066f;

    /* renamed from: g */
    public final Float f11067g;

    /* renamed from: h */
    public final Float f11068h;

    /* renamed from: i */
    public final String f11069i;

    /* renamed from: j */
    public final String f11070j;

    /* renamed from: k */
    public final String f11071k;

    /* renamed from: l */
    public final String f11072l;

    /* renamed from: m */
    public final String f11073m;

    /* renamed from: n */
    public final String f11074n;

    /* renamed from: o */
    public final String f11075o;

    /* renamed from: p */
    public final String f11076p;

    /* renamed from: q */
    public final Boolean f11077q;

    /* renamed from: r */
    public final String f11078r;

    /* renamed from: s */
    public final Boolean f11079s;

    /* renamed from: t */
    public final Map f11080t;

    /* renamed from: u */
    public final List<Marker> f11081u;

    /* renamed from: v */
    public final Float f11082v;

    /* renamed from: w */
    public final String f11083w;

    /* renamed from: x */
    public final List<String> f11084x;

    /* renamed from: y */
    public final List<ChartData> f11085y;

    /* renamed from: z */
    public final List<String> f11086z;

    public Params() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Float) null, (Float) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (Boolean) null, (Map) null, (List) null, (Float) null, (String) null, (List) null, (List) null, (List) null, (String) null, (Boolean) null, 268435455, (DefaultConstructorMarker) null);
    }

    public Params(String str, String str2, String str3, String str4, String str5, String str6, Float f, Float f2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, String str15, Boolean bool2, Map map, List<Marker> list, Float f3, String str16, List<String> list2, List<ChartData> list3, List<String> list4, String str17, Boolean bool3) {
        this.f11061a = str;
        this.f11062b = str2;
        this.f11063c = str3;
        this.f11064d = str4;
        this.f11065e = str5;
        this.f11066f = str6;
        this.f11067g = f;
        this.f11068h = f2;
        this.f11069i = str7;
        this.f11070j = str8;
        this.f11071k = str9;
        this.f11072l = str10;
        this.f11073m = str11;
        this.f11074n = str12;
        this.f11075o = str13;
        this.f11076p = str14;
        this.f11077q = bool;
        this.f11078r = str15;
        this.f11079s = bool2;
        this.f11080t = map;
        this.f11081u = list;
        this.f11082v = f3;
        this.f11083w = str16;
        this.f11084x = list2;
        this.f11085y = list3;
        this.f11086z = list4;
        this.f11059A = str17;
        this.f11060B = bool3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Params(java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.Float r36, java.lang.Float r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.Boolean r46, java.lang.String r47, java.lang.Boolean r48, com.appfoundry.previewer.model.Map r49, java.util.List r50, java.lang.Float r51, java.lang.String r52, java.util.List r53, java.util.List r54, java.util.List r55, java.lang.String r56, java.lang.Boolean r57, int r58, kotlin.jvm.internal.DefaultConstructorMarker r59) {
        /*
            r29 = this;
            r0 = r58
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r30
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r31
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r32
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r33
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r34
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r35
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r36
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r37
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r38
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r39
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r40
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r41
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r42
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r43
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r44
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r45
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r46
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r47
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r48
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r49
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r50
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r51
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r52
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r53
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r54
        L_0x00e9:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f2
            r26 = 0
            goto L_0x00f4
        L_0x00f2:
            r26 = r55
        L_0x00f4:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00fd
            r27 = 0
            goto L_0x00ff
        L_0x00fd:
            r27 = r56
        L_0x00ff:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r28
            if (r0 == 0) goto L_0x0107
            r0 = 0
            goto L_0x0109
        L_0x0107:
            r0 = r57
        L_0x0109:
            r30 = r29
            r31 = r1
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r36 = r7
            r37 = r8
            r38 = r9
            r39 = r10
            r40 = r11
            r41 = r12
            r42 = r13
            r43 = r14
            r44 = r15
            r45 = r2
            r46 = r16
            r47 = r17
            r48 = r18
            r49 = r19
            r50 = r20
            r51 = r21
            r52 = r22
            r53 = r23
            r54 = r24
            r55 = r25
            r56 = r26
            r57 = r27
            r58 = r0
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.model.Params.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, com.appfoundry.previewer.model.Map, java.util.List, java.lang.Float, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Params)) {
            return false;
        }
        Params params = (Params) obj;
        return C6888i.m12434a(this.f11061a, params.f11061a) && C6888i.m12434a(this.f11062b, params.f11062b) && C6888i.m12434a(this.f11063c, params.f11063c) && C6888i.m12434a(this.f11064d, params.f11064d) && C6888i.m12434a(this.f11065e, params.f11065e) && C6888i.m12434a(this.f11066f, params.f11066f) && C6888i.m12434a(this.f11067g, params.f11067g) && C6888i.m12434a(this.f11068h, params.f11068h) && C6888i.m12434a(this.f11069i, params.f11069i) && C6888i.m12434a(this.f11070j, params.f11070j) && C6888i.m12434a(this.f11071k, params.f11071k) && C6888i.m12434a(this.f11072l, params.f11072l) && C6888i.m12434a(this.f11073m, params.f11073m) && C6888i.m12434a(this.f11074n, params.f11074n) && C6888i.m12434a(this.f11075o, params.f11075o) && C6888i.m12434a(this.f11076p, params.f11076p) && C6888i.m12434a(this.f11077q, params.f11077q) && C6888i.m12434a(this.f11078r, params.f11078r) && C6888i.m12434a(this.f11079s, params.f11079s) && C6888i.m12434a(this.f11080t, params.f11080t) && C6888i.m12434a(this.f11081u, params.f11081u) && C6888i.m12434a(this.f11082v, params.f11082v) && C6888i.m12434a(this.f11083w, params.f11083w) && C6888i.m12434a(this.f11084x, params.f11084x) && C6888i.m12434a(this.f11085y, params.f11085y) && C6888i.m12434a(this.f11086z, params.f11086z) && C6888i.m12434a(this.f11059A, params.f11059A) && C6888i.m12434a(this.f11060B, params.f11060B);
    }

    public int hashCode() {
        String str = this.f11061a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11062b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11063c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11064d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f11065e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f11066f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Float f = this.f11067g;
        int hashCode7 = (hashCode6 + (f != null ? f.hashCode() : 0)) * 31;
        Float f2 = this.f11068h;
        int hashCode8 = (hashCode7 + (f2 != null ? f2.hashCode() : 0)) * 31;
        String str7 = this.f11069i;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f11070j;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f11071k;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f11072l;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f11073m;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f11074n;
        int hashCode14 = (hashCode13 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f11075o;
        int hashCode15 = (hashCode14 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f11076p;
        int hashCode16 = (hashCode15 + (str14 != null ? str14.hashCode() : 0)) * 31;
        Boolean bool = this.f11077q;
        int hashCode17 = (hashCode16 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str15 = this.f11078r;
        int hashCode18 = (hashCode17 + (str15 != null ? str15.hashCode() : 0)) * 31;
        Boolean bool2 = this.f11079s;
        int hashCode19 = (hashCode18 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Map map = this.f11080t;
        int hashCode20 = (hashCode19 + (map != null ? map.hashCode() : 0)) * 31;
        List<Marker> list = this.f11081u;
        int hashCode21 = (hashCode20 + (list != null ? list.hashCode() : 0)) * 31;
        Float f3 = this.f11082v;
        int hashCode22 = (hashCode21 + (f3 != null ? f3.hashCode() : 0)) * 31;
        String str16 = this.f11083w;
        int hashCode23 = (hashCode22 + (str16 != null ? str16.hashCode() : 0)) * 31;
        List<String> list2 = this.f11084x;
        int hashCode24 = (hashCode23 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<ChartData> list3 = this.f11085y;
        int hashCode25 = (hashCode24 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.f11086z;
        int hashCode26 = (hashCode25 + (list4 != null ? list4.hashCode() : 0)) * 31;
        String str17 = this.f11059A;
        int hashCode27 = (hashCode26 + (str17 != null ? str17.hashCode() : 0)) * 31;
        Boolean bool3 = this.f11060B;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode27 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Params(url=");
        u.append(this.f11061a);
        u.append(", title=");
        u.append(this.f11062b);
        u.append(", datetime=");
        u.append(this.f11063c);
        u.append(", phone=");
        u.append(this.f11064d);
        u.append(", email=");
        u.append(this.f11065e);
        u.append(", place=");
        u.append(this.f11066f);
        u.append(", lat=");
        u.append(this.f11067g);
        u.append(", long=");
        u.append(this.f11068h);
        u.append(", startDate=");
        u.append(this.f11069i);
        u.append(", endDate=");
        u.append(this.f11070j);
        u.append(", id=");
        u.append(this.f11071k);
        u.append(", provider=");
        u.append(this.f11072l);
        u.append(", message=");
        u.append(this.f11073m);
        u.append(", href=");
        u.append(this.f11074n);
        u.append(", triggerUrl=");
        u.append(this.f11075o);
        u.append(", confirmPrompt=");
        u.append(this.f11076p);
        u.append(", infinite=");
        u.append(this.f11077q);
        u.append(", animation=");
        u.append(this.f11078r);
        u.append(", automatic=");
        u.append(this.f11079s);
        u.append(", map=");
        u.append(this.f11080t);
        u.append(", markers=");
        u.append(this.f11081u);
        u.append(", zoom=");
        u.append(this.f11082v);
        u.append(", chartType=");
        u.append(this.f11083w);
        u.append(", categories=");
        u.append(this.f11084x);
        u.append(", series=");
        u.append(this.f11085y);
        u.append(", colors=");
        u.append(this.f11086z);
        u.append(", hrefRemote=");
        u.append(this.f11059A);
        u.append(", required=");
        u.append(this.f11060B);
        u.append(")");
        return u.toString();
    }
}
