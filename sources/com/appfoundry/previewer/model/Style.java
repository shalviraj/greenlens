package com.appfoundry.previewer.model;

import com.segment.analytics.AnalyticsContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\bX\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u001b\u0010-\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001b\u00102\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u0010\u000f\u001a\u0004\b4\u0010\u0011\"\u0004\b5\u00106R\u001b\u0010;\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0004R$\u0010@\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u00109\u001a\u0004\b=\u0010\u0004\"\u0004\b>\u0010?R$\u0010E\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0019\u001a\u0004\bB\u0010\u001b\"\u0004\bC\u0010DR\u001b\u0010H\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bF\u00109\u001a\u0004\bG\u0010\u0004R\u001b\u0010K\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bJ\u00101R\u001b\u0010N\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bL\u00109\u001a\u0004\bM\u0010\u0004R\u001b\u0010T\u001a\u0004\u0018\u00010O8\u0006@\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001b\u0010W\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006¢\u0006\f\n\u0004\bU\u0010\u001f\u001a\u0004\bV\u0010!R\u001b\u0010Z\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bX\u00109\u001a\u0004\bY\u0010\u0004R\u001b\u0010]\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\f\n\u0004\b[\u0010\u0019\u001a\u0004\b\\\u0010\u001bR\u001b\u0010`\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b^\u00109\u001a\u0004\b_\u0010\u0004R\u001b\u0010c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\ba\u00109\u001a\u0004\bb\u0010\u0004R\u001b\u0010f\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\f\n\u0004\bd\u0010\u0019\u001a\u0004\be\u0010\u001bR\u001b\u0010i\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bg\u00109\u001a\u0004\bh\u0010\u0004R\u0019\u0010l\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bj\u00109\u001a\u0004\bk\u0010\u0004R\u001b\u0010o\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bm\u00109\u001a\u0004\bn\u0010\u0004R\u001b\u0010r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bp\u00109\u001a\u0004\bq\u0010\u0004R\u001b\u0010u\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bs\u00109\u001a\u0004\bt\u0010\u0004R\u001b\u0010x\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\f\n\u0004\bv\u0010\u0019\u001a\u0004\bw\u0010\u001bR\u001b\u0010{\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\f\n\u0004\by\u0010\u0019\u001a\u0004\bz\u0010\u001bR\u001b\u0010~\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b|\u00109\u001a\u0004\b}\u0010\u0004R\u001d\u0010\u0001\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\r\n\u0004\b\u0010\u0019\u001a\u0005\b\u0001\u0010\u001bR\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u00109\u001a\u0005\b\u0001\u0010\u0004R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010$\u001a\u0005\b\u0001\u0010&R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010\u0019\u001a\u0005\b\u0001\u0010\u001bR\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010/\u001a\u0005\b\u0001\u00101R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u00109\u001a\u0005\b\u0001\u0010\u0004R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u00109\u001a\u0005\b\u0001\u0010\u0004R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010$\u001a\u0005\b\u0001\u0010&R)\u0010\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\b\u0001\u0010/\u001a\u0005\b\u0001\u00101\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\b\u0001\u0010/\u001a\u0005\b\u0001\u00101\"\u0006\b\u0001\u0010\u0001R\u001e\u0010¢\u0001\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010\u001f\u001a\u0005\b¡\u0001\u0010!R(\u0010¦\u0001\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010\u0019\u001a\u0005\b¤\u0001\u0010\u001b\"\u0005\b¥\u0001\u0010D¨\u0006§\u0001"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/Style;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lcom/appfoundry/previewer/model/Coordinate;", "t", "Ljava/util/List;", "getGradientPositions", "()Ljava/util/List;", "gradientPositions", "Lcom/appfoundry/previewer/model/GradientColorStop;", "u", "getGradientColorStops", "gradientColorStops", "", "h", "Ljava/lang/Float;", "getLetterSpacing", "()Ljava/lang/Float;", "letterSpacing", "Lcom/appfoundry/previewer/model/Dimensions;", "m", "Lcom/appfoundry/previewer/model/Dimensions;", "getPositioning", "()Lcom/appfoundry/previewer/model/Dimensions;", "positioning", "v", "Ljava/lang/Boolean;", "getOverlay", "()Ljava/lang/Boolean;", "overlay", "x", "getBorderWidth", "borderWidth", "L", "getModalResizable", "modalResizable", "K", "Ljava/lang/Integer;", "getModalHeight", "()Ljava/lang/Integer;", "modalHeight", "B", "getCornerRadii", "setCornerRadii", "(Ljava/util/List;)V", "cornerRadii", "n", "Ljava/lang/String;", "getTextAlign", "textAlign", "q", "getScaleMode", "setScaleMode", "(Ljava/lang/String;)V", "scaleMode", "w", "getAspectRatio", "setAspectRatio", "(Ljava/lang/Float;)V", "aspectRatio", "c", "getBackgroundColor", "backgroundColor", "I", "getFontWeight", "fontWeight", "s", "getGradientType", "gradientType", "Lcom/appfoundry/previewer/model/Shadow;", "z", "Lcom/appfoundry/previewer/model/Shadow;", "getShadow", "()Lcom/appfoundry/previewer/model/Shadow;", "shadow", "l", "getPaddings", "paddings", "b", "getColor", "color", "C", "getMinHeight", "minHeight", "o", "getHorizontalPosition", "horizontalPosition", "d", "getTextBackgroundColor", "textBackgroundColor", "F", "getRotation", "rotation", "p", "getVerticalPosition", "verticalPosition", "a", "getId", "id", "G", "getBehavior", "behavior", "y", "getBorderColor", "borderColor", "e", "getFontId", "fontId", "f", "getFontSize", "fontSize", "A", "getBorderRadius", "borderRadius", "E", "getTextDecoration", "textDecoration", "g", "getLineHeight", "lineHeight", "D", "getTextCase", "textCase", "H", "getItalic", "italic", "j", "getHeight", "height", "r", "getOpacity", "opacity", "J", "getAnchor", "anchor", "M", "getPopupColor", "popupColor", "N", "getPopupBlur", "popupBlur", "O", "getComponentWidth", "setComponentWidth", "(Ljava/lang/Integer;)V", "componentWidth", "P", "getComponentHeight", "setComponentHeight", "componentHeight", "k", "getMargins", "margins", "i", "getWidth", "setWidth", "width", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class Style {

    /* renamed from: A */
    public final Float f11124A;

    /* renamed from: B */
    public List<Float> f11125B;

    /* renamed from: C */
    public final Float f11126C;

    /* renamed from: D */
    public final String f11127D;

    /* renamed from: E */
    public final String f11128E;

    /* renamed from: F */
    public final Float f11129F;

    /* renamed from: G */
    public final String f11130G;

    /* renamed from: H */
    public final Boolean f11131H;

    /* renamed from: I */
    public final Integer f11132I;

    /* renamed from: J */
    public final String f11133J;

    /* renamed from: K */
    public final Integer f11134K;

    /* renamed from: L */
    public final Boolean f11135L;

    /* renamed from: M */
    public final String f11136M;

    /* renamed from: N */
    public final Boolean f11137N;

    /* renamed from: O */
    public transient Integer f11138O;

    /* renamed from: P */
    public transient Integer f11139P;

    /* renamed from: a */
    public final String f11140a;

    /* renamed from: b */
    public final String f11141b;

    /* renamed from: c */
    public final String f11142c;

    /* renamed from: d */
    public final String f11143d;

    /* renamed from: e */
    public final String f11144e;

    /* renamed from: f */
    public final Float f11145f;

    /* renamed from: g */
    public final Float f11146g;

    /* renamed from: h */
    public final Float f11147h;

    /* renamed from: i */
    public Float f11148i;

    /* renamed from: j */
    public final Float f11149j;

    /* renamed from: k */
    public final Dimensions f11150k;

    /* renamed from: l */
    public final Dimensions f11151l;

    /* renamed from: m */
    public final Dimensions f11152m;

    /* renamed from: n */
    public final String f11153n;

    /* renamed from: o */
    public final String f11154o;

    /* renamed from: p */
    public final String f11155p;

    /* renamed from: q */
    public String f11156q;

    /* renamed from: r */
    public final Integer f11157r;

    /* renamed from: s */
    public final String f11158s;

    /* renamed from: t */
    public final List<Coordinate> f11159t;

    /* renamed from: u */
    public final List<GradientColorStop> f11160u;

    /* renamed from: v */
    public final Boolean f11161v;

    /* renamed from: w */
    public Float f11162w;

    /* renamed from: x */
    public final Float f11163x;

    /* renamed from: y */
    public final String f11164y;

    /* renamed from: z */
    public final Shadow f11165z;

    public Style(String str, String str2, String str3, String str4, String str5, Float f, Float f2, Float f3, Float f4, Float f5, Dimensions dimensions, Dimensions dimensions2, Dimensions dimensions3, String str6, String str7, String str8, String str9, Integer num, String str10, List list, List list2, Boolean bool, Float f6, Float f7, String str11, Shadow shadow, Float f8, List list3, Float f9, String str12, String str13, Float f10, String str14, Boolean bool2, Integer num2, String str15, Integer num3, Boolean bool3, String str16, Boolean bool4, Integer num4, Integer num5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str17 = str;
        int i3 = i2;
        int i4 = 0;
        Integer num6 = (i3 & 256) != 0 ? 0 : num4;
        i4 = (i3 & 512) == 0 ? num5 : i4;
        C6888i.m12438e(str, AnalyticsContext.Device.DEVICE_ID_KEY);
        this.f11140a = str17;
        this.f11141b = str2;
        this.f11142c = str3;
        this.f11143d = str4;
        this.f11144e = str5;
        this.f11145f = f;
        this.f11146g = f2;
        this.f11147h = f3;
        this.f11148i = f4;
        this.f11149j = f5;
        this.f11150k = dimensions;
        this.f11151l = dimensions2;
        this.f11152m = dimensions3;
        this.f11153n = str6;
        this.f11154o = str7;
        this.f11155p = str8;
        this.f11156q = str9;
        this.f11157r = num;
        this.f11158s = str10;
        this.f11159t = list;
        this.f11160u = list2;
        this.f11161v = bool;
        this.f11162w = f6;
        this.f11163x = f7;
        this.f11164y = str11;
        this.f11165z = shadow;
        this.f11124A = f8;
        this.f11125B = list3;
        this.f11126C = f9;
        this.f11127D = str12;
        this.f11128E = str13;
        this.f11129F = f10;
        this.f11130G = str14;
        this.f11131H = bool2;
        this.f11132I = num2;
        this.f11133J = str15;
        this.f11134K = num3;
        this.f11135L = bool3;
        this.f11136M = str16;
        this.f11137N = bool4;
        this.f11138O = num6;
        this.f11139P = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Style)) {
            return false;
        }
        Style style = (Style) obj;
        return C6888i.m12434a(this.f11140a, style.f11140a) && C6888i.m12434a(this.f11141b, style.f11141b) && C6888i.m12434a(this.f11142c, style.f11142c) && C6888i.m12434a(this.f11143d, style.f11143d) && C6888i.m12434a(this.f11144e, style.f11144e) && C6888i.m12434a(this.f11145f, style.f11145f) && C6888i.m12434a(this.f11146g, style.f11146g) && C6888i.m12434a(this.f11147h, style.f11147h) && C6888i.m12434a(this.f11148i, style.f11148i) && C6888i.m12434a(this.f11149j, style.f11149j) && C6888i.m12434a(this.f11150k, style.f11150k) && C6888i.m12434a(this.f11151l, style.f11151l) && C6888i.m12434a(this.f11152m, style.f11152m) && C6888i.m12434a(this.f11153n, style.f11153n) && C6888i.m12434a(this.f11154o, style.f11154o) && C6888i.m12434a(this.f11155p, style.f11155p) && C6888i.m12434a(this.f11156q, style.f11156q) && C6888i.m12434a(this.f11157r, style.f11157r) && C6888i.m12434a(this.f11158s, style.f11158s) && C6888i.m12434a(this.f11159t, style.f11159t) && C6888i.m12434a(this.f11160u, style.f11160u) && C6888i.m12434a(this.f11161v, style.f11161v) && C6888i.m12434a(this.f11162w, style.f11162w) && C6888i.m12434a(this.f11163x, style.f11163x) && C6888i.m12434a(this.f11164y, style.f11164y) && C6888i.m12434a(this.f11165z, style.f11165z) && C6888i.m12434a(this.f11124A, style.f11124A) && C6888i.m12434a(this.f11125B, style.f11125B) && C6888i.m12434a(this.f11126C, style.f11126C) && C6888i.m12434a(this.f11127D, style.f11127D) && C6888i.m12434a(this.f11128E, style.f11128E) && C6888i.m12434a(this.f11129F, style.f11129F) && C6888i.m12434a(this.f11130G, style.f11130G) && C6888i.m12434a(this.f11131H, style.f11131H) && C6888i.m12434a(this.f11132I, style.f11132I) && C6888i.m12434a(this.f11133J, style.f11133J) && C6888i.m12434a(this.f11134K, style.f11134K) && C6888i.m12434a(this.f11135L, style.f11135L) && C6888i.m12434a(this.f11136M, style.f11136M) && C6888i.m12434a(this.f11137N, style.f11137N) && C6888i.m12434a(this.f11138O, style.f11138O) && C6888i.m12434a(this.f11139P, style.f11139P);
    }

    public int hashCode() {
        String str = this.f11140a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11141b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11142c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11143d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f11144e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Float f = this.f11145f;
        int hashCode6 = (hashCode5 + (f != null ? f.hashCode() : 0)) * 31;
        Float f2 = this.f11146g;
        int hashCode7 = (hashCode6 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f11147h;
        int hashCode8 = (hashCode7 + (f3 != null ? f3.hashCode() : 0)) * 31;
        Float f4 = this.f11148i;
        int hashCode9 = (hashCode8 + (f4 != null ? f4.hashCode() : 0)) * 31;
        Float f5 = this.f11149j;
        int hashCode10 = (hashCode9 + (f5 != null ? f5.hashCode() : 0)) * 31;
        Dimensions dimensions = this.f11150k;
        int hashCode11 = (hashCode10 + (dimensions != null ? dimensions.hashCode() : 0)) * 31;
        Dimensions dimensions2 = this.f11151l;
        int hashCode12 = (hashCode11 + (dimensions2 != null ? dimensions2.hashCode() : 0)) * 31;
        Dimensions dimensions3 = this.f11152m;
        int hashCode13 = (hashCode12 + (dimensions3 != null ? dimensions3.hashCode() : 0)) * 31;
        String str6 = this.f11153n;
        int hashCode14 = (hashCode13 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f11154o;
        int hashCode15 = (hashCode14 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f11155p;
        int hashCode16 = (hashCode15 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f11156q;
        int hashCode17 = (hashCode16 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Integer num = this.f11157r;
        int hashCode18 = (hashCode17 + (num != null ? num.hashCode() : 0)) * 31;
        String str10 = this.f11158s;
        int hashCode19 = (hashCode18 + (str10 != null ? str10.hashCode() : 0)) * 31;
        List<Coordinate> list = this.f11159t;
        int hashCode20 = (hashCode19 + (list != null ? list.hashCode() : 0)) * 31;
        List<GradientColorStop> list2 = this.f11160u;
        int hashCode21 = (hashCode20 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool = this.f11161v;
        int hashCode22 = (hashCode21 + (bool != null ? bool.hashCode() : 0)) * 31;
        Float f6 = this.f11162w;
        int hashCode23 = (hashCode22 + (f6 != null ? f6.hashCode() : 0)) * 31;
        Float f7 = this.f11163x;
        int hashCode24 = (hashCode23 + (f7 != null ? f7.hashCode() : 0)) * 31;
        String str11 = this.f11164y;
        int hashCode25 = (hashCode24 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Shadow shadow = this.f11165z;
        int hashCode26 = (hashCode25 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        Float f8 = this.f11124A;
        int hashCode27 = (hashCode26 + (f8 != null ? f8.hashCode() : 0)) * 31;
        List<Float> list3 = this.f11125B;
        int hashCode28 = (hashCode27 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Float f9 = this.f11126C;
        int hashCode29 = (hashCode28 + (f9 != null ? f9.hashCode() : 0)) * 31;
        String str12 = this.f11127D;
        int hashCode30 = (hashCode29 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f11128E;
        int hashCode31 = (hashCode30 + (str13 != null ? str13.hashCode() : 0)) * 31;
        Float f10 = this.f11129F;
        int hashCode32 = (hashCode31 + (f10 != null ? f10.hashCode() : 0)) * 31;
        String str14 = this.f11130G;
        int hashCode33 = (hashCode32 + (str14 != null ? str14.hashCode() : 0)) * 31;
        Boolean bool2 = this.f11131H;
        int hashCode34 = (hashCode33 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num2 = this.f11132I;
        int hashCode35 = (hashCode34 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str15 = this.f11133J;
        int hashCode36 = (hashCode35 + (str15 != null ? str15.hashCode() : 0)) * 31;
        Integer num3 = this.f11134K;
        int hashCode37 = (hashCode36 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool3 = this.f11135L;
        int hashCode38 = (hashCode37 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        String str16 = this.f11136M;
        int hashCode39 = (hashCode38 + (str16 != null ? str16.hashCode() : 0)) * 31;
        Boolean bool4 = this.f11137N;
        int hashCode40 = (hashCode39 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Integer num4 = this.f11138O;
        int hashCode41 = (hashCode40 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.f11139P;
        if (num5 != null) {
            i = num5.hashCode();
        }
        return hashCode41 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Style(id=");
        u.append(this.f11140a);
        u.append(", color=");
        u.append(this.f11141b);
        u.append(", backgroundColor=");
        u.append(this.f11142c);
        u.append(", textBackgroundColor=");
        u.append(this.f11143d);
        u.append(", fontId=");
        u.append(this.f11144e);
        u.append(", fontSize=");
        u.append(this.f11145f);
        u.append(", lineHeight=");
        u.append(this.f11146g);
        u.append(", letterSpacing=");
        u.append(this.f11147h);
        u.append(", width=");
        u.append(this.f11148i);
        u.append(", height=");
        u.append(this.f11149j);
        u.append(", margins=");
        u.append(this.f11150k);
        u.append(", paddings=");
        u.append(this.f11151l);
        u.append(", positioning=");
        u.append(this.f11152m);
        u.append(", textAlign=");
        u.append(this.f11153n);
        u.append(", horizontalPosition=");
        u.append(this.f11154o);
        u.append(", verticalPosition=");
        u.append(this.f11155p);
        u.append(", scaleMode=");
        u.append(this.f11156q);
        u.append(", opacity=");
        u.append(this.f11157r);
        u.append(", gradientType=");
        u.append(this.f11158s);
        u.append(", gradientPositions=");
        u.append(this.f11159t);
        u.append(", gradientColorStops=");
        u.append(this.f11160u);
        u.append(", overlay=");
        u.append(this.f11161v);
        u.append(", aspectRatio=");
        u.append(this.f11162w);
        u.append(", borderWidth=");
        u.append(this.f11163x);
        u.append(", borderColor=");
        u.append(this.f11164y);
        u.append(", shadow=");
        u.append(this.f11165z);
        u.append(", borderRadius=");
        u.append(this.f11124A);
        u.append(", cornerRadii=");
        u.append(this.f11125B);
        u.append(", minHeight=");
        u.append(this.f11126C);
        u.append(", textCase=");
        u.append(this.f11127D);
        u.append(", textDecoration=");
        u.append(this.f11128E);
        u.append(", rotation=");
        u.append(this.f11129F);
        u.append(", behavior=");
        u.append(this.f11130G);
        u.append(", italic=");
        u.append(this.f11131H);
        u.append(", fontWeight=");
        u.append(this.f11132I);
        u.append(", anchor=");
        u.append(this.f11133J);
        u.append(", modalHeight=");
        u.append(this.f11134K);
        u.append(", modalResizable=");
        u.append(this.f11135L);
        u.append(", popupColor=");
        u.append(this.f11136M);
        u.append(", popupBlur=");
        u.append(this.f11137N);
        u.append(", componentWidth=");
        u.append(this.f11138O);
        u.append(", componentHeight=");
        u.append(this.f11139P);
        u.append(")");
        return u.toString();
    }
}
