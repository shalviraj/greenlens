package com.appfoundry.previewer.model;

import com.segment.analytics.AnalyticsContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b(\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u0004\u0018\u00010\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR$\u0010*\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0004\"\u0004\b(\u0010)R\u001b\u00100\u001a\u0004\u0018\u00010+8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00103\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010\u0004R\"\u00107\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010\r\u001a\u0004\b5\u0010\u000f\"\u0004\b6\u0010\u0011R$\u0010;\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u0010&\u001a\u0004\b9\u0010\u0004\"\u0004\b:\u0010)R\"\u0010?\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010\r\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R\"\u0010C\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010&\u001a\u0004\bA\u0010\u0004\"\u0004\bB\u0010)R\u001b\u0010I\u001a\u0004\u0018\u00010D8\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001b\u0010L\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010&\u001a\u0004\bK\u0010\u0004R$\u0010Q\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010\u001d\u001a\u0004\bN\u0010\u001f\"\u0004\bO\u0010PR$\u0010U\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bR\u0010&\u001a\u0004\bS\u0010\u0004\"\u0004\bT\u0010)R*\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010V8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bW\u0010\u0016\u001a\u0004\bX\u0010\u0018\"\u0004\bY\u0010\u001aR$\u0010^\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b[\u0010\u001d\u001a\u0004\b\\\u0010\u001f\"\u0004\b]\u0010PR\u001b\u0010a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b_\u0010&\u001a\u0004\b`\u0010\u0004R\u001b\u0010f\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR*\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010V8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bg\u0010\u0016\u001a\u0004\bh\u0010\u0018\"\u0004\bi\u0010\u001aR\u001b\u0010m\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bk\u0010&\u001a\u0004\bl\u0010\u0004R\u001b\u0010p\u001a\u0004\u0018\u00010\u00148\u0006@\u0006¢\u0006\f\n\u0004\bn\u0010\u001d\u001a\u0004\bo\u0010\u001fR\u001b\u0010s\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bq\u0010&\u001a\u0004\br\u0010\u0004R$\u0010w\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bt\u0010&\u001a\u0004\bu\u0010\u0004\"\u0004\bv\u0010)R\u001b\u0010z\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bx\u0010&\u001a\u0004\by\u0010\u0004R!\u0010}\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\b{\u0010\u0016\u001a\u0004\b|\u0010\u0018¨\u0006~"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/Page;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "v", "Z", "getBound", "()Z", "setBound", "(Z)V", "bound", "", "Lcom/appfoundry/previewer/model/Container;", "g", "Ljava/util/List;", "getLayers", "()Ljava/util/List;", "setLayers", "(Ljava/util/List;)V", "layers", "e", "Lcom/appfoundry/previewer/model/Container;", "getHeader", "()Lcom/appfoundry/previewer/model/Container;", "header", "f", "getBody", "setBody", "body", "l", "Ljava/lang/String;", "getNextLink", "setNextLink", "(Ljava/lang/String;)V", "nextLink", "Lcom/appfoundry/previewer/model/States;", "p", "Lcom/appfoundry/previewer/model/States;", "getStates", "()Lcom/appfoundry/previewer/model/States;", "states", "b", "getName", "name", "z", "getPopupContainersWidthCalculated", "setPopupContainersWidthCalculated", "popupContainersWidthCalculated", "y", "getOriginalId", "setOriginalId", "originalId", "x", "getInPreviewer", "setInPreviewer", "inPreviewer", "a", "getId", "setId", "id", "Lcom/appfoundry/previewer/model/Animation;", "u", "Lcom/appfoundry/previewer/model/Animation;", "getAnimation", "()Lcom/appfoundry/previewer/model/Animation;", "animation", "t", "getStateSetId", "stateSetId", "i", "getBackground", "setBackground", "(Lcom/appfoundry/previewer/model/Container;)V", "background", "q", "getRemoteForm", "setRemoteForm", "remoteForm", "", "m", "getTags", "setTags", "tags", "d", "getTopBar", "setTopBar", "topBar", "c", "getType", "type", "j", "Ljava/lang/Boolean;", "getStart", "()Ljava/lang/Boolean;", "start", "w", "getNextPageBody", "setNextPageBody", "nextPageBody", "s", "getState", "state", "h", "getFooter", "footer", "r", "getStyleId", "styleId", "k", "getRemote", "setRemote", "remote", "n", "getIntro", "intro", "o", "getSwipeHref", "swipeHref", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class Page {

    /* renamed from: a */
    public String f11033a;

    /* renamed from: b */
    public final String f11034b;

    /* renamed from: c */
    public final String f11035c;

    /* renamed from: d */
    public Container f11036d;

    /* renamed from: e */
    public final Container f11037e;

    /* renamed from: f */
    public List<Container> f11038f;

    /* renamed from: g */
    public List<Container> f11039g;

    /* renamed from: h */
    public final Container f11040h;

    /* renamed from: i */
    public Container f11041i;

    /* renamed from: j */
    public final Boolean f11042j;

    /* renamed from: k */
    public String f11043k;

    /* renamed from: l */
    public String f11044l;

    /* renamed from: m */
    public List<String> f11045m;

    /* renamed from: n */
    public final String f11046n;

    /* renamed from: o */
    public final List<String> f11047o;

    /* renamed from: p */
    public final States f11048p;

    /* renamed from: q */
    public String f11049q;

    /* renamed from: r */
    public final String f11050r;

    /* renamed from: s */
    public final String f11051s;

    /* renamed from: t */
    public final String f11052t;

    /* renamed from: u */
    public final Animation f11053u;

    /* renamed from: v */
    public transient boolean f11054v;

    /* renamed from: w */
    public transient List<Container> f11055w;

    /* renamed from: x */
    public transient boolean f11056x;

    /* renamed from: y */
    public transient String f11057y;

    /* renamed from: z */
    public transient boolean f11058z;

    public Page(String str, String str2, String str3, Container container, Container container2, List list, List list2, Container container3, Container container4, Boolean bool, String str4, String str5, List list3, String str6, List list4, States states, String str7, String str8, String str9, String str10, Animation animation, boolean z, List list5, boolean z2, String str11, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str12 = str;
        int i2 = i;
        String str13 = (i2 & 2) != 0 ? null : str2;
        String str14 = (i2 & 4) != 0 ? null : str3;
        Container container5 = (i2 & 8) != 0 ? null : container;
        Container container6 = (i2 & 16) != 0 ? null : container2;
        List list6 = (i2 & 32) != 0 ? null : list;
        List list7 = (i2 & 64) != 0 ? null : list2;
        Container container7 = (i2 & 128) != 0 ? null : container3;
        Container container8 = (i2 & 256) != 0 ? null : container4;
        Boolean bool2 = (i2 & 512) != 0 ? null : bool;
        String str15 = (i2 & 1024) != 0 ? null : str4;
        String str16 = (i2 & 2048) != 0 ? null : str5;
        List list8 = (i2 & 4096) != 0 ? null : list3;
        String str17 = (i2 & 8192) != 0 ? null : str6;
        List list9 = (i2 & 16384) != 0 ? null : list4;
        States states2 = (i2 & 32768) != 0 ? null : states;
        String str18 = (i2 & 65536) != 0 ? null : str7;
        String str19 = (i2 & 131072) != 0 ? null : str8;
        String str20 = (i2 & 262144) != 0 ? null : str9;
        String str21 = (i2 & 524288) != 0 ? null : str10;
        Animation animation2 = (i2 & 1048576) != 0 ? null : animation;
        boolean z4 = (i2 & 2097152) != 0 ? false : z;
        List list10 = (i2 & 4194304) != 0 ? null : list5;
        boolean z5 = (i2 & 8388608) != 0 ? false : z2;
        String str22 = (i2 & 16777216) != 0 ? null : str11;
        boolean z6 = (i2 & 33554432) != 0 ? false : z3;
        C6888i.m12438e(str12, AnalyticsContext.Device.DEVICE_ID_KEY);
        this.f11033a = str12;
        this.f11034b = str13;
        this.f11035c = str14;
        this.f11036d = container5;
        this.f11037e = container6;
        this.f11038f = list6;
        this.f11039g = list7;
        this.f11040h = container7;
        this.f11041i = container8;
        this.f11042j = bool2;
        this.f11043k = str15;
        this.f11044l = str16;
        this.f11045m = list8;
        this.f11046n = str17;
        this.f11047o = list9;
        this.f11048p = states2;
        this.f11049q = str18;
        this.f11050r = str19;
        this.f11051s = str20;
        this.f11052t = str21;
        this.f11053u = animation2;
        this.f11054v = z4;
        this.f11055w = list10;
        this.f11056x = z5;
        this.f11057y = str22;
        this.f11058z = z6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Page)) {
            return false;
        }
        Page page = (Page) obj;
        return C6888i.m12434a(this.f11033a, page.f11033a) && C6888i.m12434a(this.f11034b, page.f11034b) && C6888i.m12434a(this.f11035c, page.f11035c) && C6888i.m12434a(this.f11036d, page.f11036d) && C6888i.m12434a(this.f11037e, page.f11037e) && C6888i.m12434a(this.f11038f, page.f11038f) && C6888i.m12434a(this.f11039g, page.f11039g) && C6888i.m12434a(this.f11040h, page.f11040h) && C6888i.m12434a(this.f11041i, page.f11041i) && C6888i.m12434a(this.f11042j, page.f11042j) && C6888i.m12434a(this.f11043k, page.f11043k) && C6888i.m12434a(this.f11044l, page.f11044l) && C6888i.m12434a(this.f11045m, page.f11045m) && C6888i.m12434a(this.f11046n, page.f11046n) && C6888i.m12434a(this.f11047o, page.f11047o) && C6888i.m12434a(this.f11048p, page.f11048p) && C6888i.m12434a(this.f11049q, page.f11049q) && C6888i.m12434a(this.f11050r, page.f11050r) && C6888i.m12434a(this.f11051s, page.f11051s) && C6888i.m12434a(this.f11052t, page.f11052t) && C6888i.m12434a(this.f11053u, page.f11053u) && this.f11054v == page.f11054v && C6888i.m12434a(this.f11055w, page.f11055w) && this.f11056x == page.f11056x && C6888i.m12434a(this.f11057y, page.f11057y) && this.f11058z == page.f11058z;
    }

    public int hashCode() {
        String str = this.f11033a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11034b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11035c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Container container = this.f11036d;
        int hashCode4 = (hashCode3 + (container != null ? container.hashCode() : 0)) * 31;
        Container container2 = this.f11037e;
        int hashCode5 = (hashCode4 + (container2 != null ? container2.hashCode() : 0)) * 31;
        List<Container> list = this.f11038f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List<Container> list2 = this.f11039g;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Container container3 = this.f11040h;
        int hashCode8 = (hashCode7 + (container3 != null ? container3.hashCode() : 0)) * 31;
        Container container4 = this.f11041i;
        int hashCode9 = (hashCode8 + (container4 != null ? container4.hashCode() : 0)) * 31;
        Boolean bool = this.f11042j;
        int hashCode10 = (hashCode9 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.f11043k;
        int hashCode11 = (hashCode10 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f11044l;
        int hashCode12 = (hashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list3 = this.f11045m;
        int hashCode13 = (hashCode12 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str6 = this.f11046n;
        int hashCode14 = (hashCode13 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<String> list4 = this.f11047o;
        int hashCode15 = (hashCode14 + (list4 != null ? list4.hashCode() : 0)) * 31;
        States states = this.f11048p;
        int hashCode16 = (hashCode15 + (states != null ? states.hashCode() : 0)) * 31;
        String str7 = this.f11049q;
        int hashCode17 = (hashCode16 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f11050r;
        int hashCode18 = (hashCode17 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f11051s;
        int hashCode19 = (hashCode18 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f11052t;
        int hashCode20 = (hashCode19 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Animation animation = this.f11053u;
        int hashCode21 = (hashCode20 + (animation != null ? animation.hashCode() : 0)) * 31;
        boolean z = this.f11054v;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode21 + (z ? 1 : 0)) * 31;
        List<Container> list5 = this.f11055w;
        int hashCode22 = (i2 + (list5 != null ? list5.hashCode() : 0)) * 31;
        boolean z3 = this.f11056x;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode22 + (z3 ? 1 : 0)) * 31;
        String str11 = this.f11057y;
        if (str11 != null) {
            i = str11.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z4 = this.f11058z;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Page(id=");
        u.append(this.f11033a);
        u.append(", name=");
        u.append(this.f11034b);
        u.append(", type=");
        u.append(this.f11035c);
        u.append(", topBar=");
        u.append(this.f11036d);
        u.append(", header=");
        u.append(this.f11037e);
        u.append(", body=");
        u.append(this.f11038f);
        u.append(", layers=");
        u.append(this.f11039g);
        u.append(", footer=");
        u.append(this.f11040h);
        u.append(", background=");
        u.append(this.f11041i);
        u.append(", start=");
        u.append(this.f11042j);
        u.append(", remote=");
        u.append(this.f11043k);
        u.append(", nextLink=");
        u.append(this.f11044l);
        u.append(", tags=");
        u.append(this.f11045m);
        u.append(", intro=");
        u.append(this.f11046n);
        u.append(", swipeHref=");
        u.append(this.f11047o);
        u.append(", states=");
        u.append(this.f11048p);
        u.append(", remoteForm=");
        u.append(this.f11049q);
        u.append(", styleId=");
        u.append(this.f11050r);
        u.append(", state=");
        u.append(this.f11051s);
        u.append(", stateSetId=");
        u.append(this.f11052t);
        u.append(", animation=");
        u.append(this.f11053u);
        u.append(", bound=");
        u.append(this.f11054v);
        u.append(", nextPageBody=");
        u.append(this.f11055w);
        u.append(", inPreviewer=");
        u.append(this.f11056x);
        u.append(", originalId=");
        u.append(this.f11057y);
        u.append(", popupContainersWidthCalculated=");
        u.append(this.f11058z);
        u.append(")");
        return u.toString();
    }
}
