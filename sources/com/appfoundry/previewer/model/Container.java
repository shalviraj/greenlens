package com.appfoundry.previewer.model;

import java.util.List;
import kotlin.Metadata;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\b\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010$\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bR\u0010SJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R!\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR*\u0010,\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010\r\u001a\u0004\b.\u0010\u0004\"\u0004\b/\u00100R\u001b\u00106\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u0010:\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u0010\r\u001a\u0004\b8\u0010\u0004\"\u0004\b9\u00100R$\u0010?\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b<\u00105\"\u0004\b=\u0010>R\u001b\u0010B\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010\r\u001a\u0004\bA\u0010\u0004R\u001b\u0010E\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010\r\u001a\u0004\bD\u0010\u0004R$\u0010I\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010\r\u001a\u0004\bG\u0010\u0004\"\u0004\bH\u00100R\u001b\u0010L\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010\r\u001a\u0004\bK\u0010\u0004R\u001b\u0010Q\u001a\u0004\u0018\u00010\u00008\u0006@\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006T"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/Container;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "h", "Ljava/lang/String;", "getStatusBar", "statusBar", "Lcom/appfoundry/previewer/model/Actions;", "k", "Lcom/appfoundry/previewer/model/Actions;", "getActions", "()Lcom/appfoundry/previewer/model/Actions;", "actions", "", "j", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "tags", "Lcom/appfoundry/previewer/model/Params;", "m", "Lcom/appfoundry/previewer/model/Params;", "getParams", "()Lcom/appfoundry/previewer/model/Params;", "params", "", "l", "getContainers", "containers", "Lcom/appfoundry/previewer/model/Component;", "f", "getComponents", "setComponents", "components", "e", "getHrefRemote", "setHrefRemote", "(Ljava/lang/String;)V", "hrefRemote", "i", "Ljava/lang/Boolean;", "getScrollable", "()Ljava/lang/Boolean;", "scrollable", "n", "getAudioUrl", "setAudioUrl", "audioUrl", "o", "getCarouselSlide", "setCarouselSlide", "(Ljava/lang/Boolean;)V", "carouselSlide", "a", "getId", "id", "c", "getStyleId", "styleId", "d", "getHref", "setHref", "href", "b", "getType", "type", "g", "Lcom/appfoundry/previewer/model/Container;", "getBackground", "()Lcom/appfoundry/previewer/model/Container;", "background", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/appfoundry/previewer/model/Container;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/appfoundry/previewer/model/Actions;Ljava/util/List;Lcom/appfoundry/previewer/model/Params;Ljava/lang/String;Ljava/lang/Boolean;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class Container {

    /* renamed from: a */
    public final String f10967a;

    /* renamed from: b */
    public final String f10968b;

    /* renamed from: c */
    public final String f10969c;

    /* renamed from: d */
    public String f10970d;

    /* renamed from: e */
    public String f10971e;

    /* renamed from: f */
    public List<Component> f10972f;

    /* renamed from: g */
    public final Container f10973g;

    /* renamed from: h */
    public final String f10974h;

    /* renamed from: i */
    public final Boolean f10975i;

    /* renamed from: j */
    public List<String> f10976j;

    /* renamed from: k */
    public final Actions f10977k;

    /* renamed from: l */
    public final List<Container> f10978l;

    /* renamed from: m */
    public final Params f10979m;

    /* renamed from: n */
    public transient String f10980n;

    /* renamed from: o */
    public transient Boolean f10981o;

    public Container(String str, String str2, String str3, String str4, String str5, List<Component> list, Container container, String str6, Boolean bool, List<String> list2, Actions actions, List<Container> list3, Params params, String str7, Boolean bool2) {
        this.f10967a = str;
        this.f10968b = str2;
        this.f10969c = str3;
        this.f10970d = str4;
        this.f10971e = str5;
        this.f10972f = list;
        this.f10973g = container;
        this.f10974h = str6;
        this.f10975i = bool;
        this.f10976j = list2;
        this.f10977k = actions;
        this.f10978l = list3;
        this.f10979m = params;
        this.f10980n = str7;
        this.f10981o = bool2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Container(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.List r25, com.appfoundry.previewer.model.Container r26, java.lang.String r27, java.lang.Boolean r28, java.util.List r29, com.appfoundry.previewer.model.Actions r30, java.util.List r31, com.appfoundry.previewer.model.Params r32, java.lang.String r33, java.lang.Boolean r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r17 = r2
            goto L_0x000c
        L_0x000a:
            r17 = r33
        L_0x000c:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0013
            r18 = r2
            goto L_0x0015
        L_0x0013:
            r18 = r34
        L_0x0015:
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r32
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.model.Container.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.appfoundry.previewer.model.Container, java.lang.String, java.lang.Boolean, java.util.List, com.appfoundry.previewer.model.Actions, java.util.List, com.appfoundry.previewer.model.Params, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Container)) {
            return false;
        }
        Container container = (Container) obj;
        return C6888i.m12434a(this.f10967a, container.f10967a) && C6888i.m12434a(this.f10968b, container.f10968b) && C6888i.m12434a(this.f10969c, container.f10969c) && C6888i.m12434a(this.f10970d, container.f10970d) && C6888i.m12434a(this.f10971e, container.f10971e) && C6888i.m12434a(this.f10972f, container.f10972f) && C6888i.m12434a(this.f10973g, container.f10973g) && C6888i.m12434a(this.f10974h, container.f10974h) && C6888i.m12434a(this.f10975i, container.f10975i) && C6888i.m12434a(this.f10976j, container.f10976j) && C6888i.m12434a(this.f10977k, container.f10977k) && C6888i.m12434a(this.f10978l, container.f10978l) && C6888i.m12434a(this.f10979m, container.f10979m) && C6888i.m12434a(this.f10980n, container.f10980n) && C6888i.m12434a(this.f10981o, container.f10981o);
    }

    public int hashCode() {
        String str = this.f10967a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10968b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10969c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f10970d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f10971e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<Component> list = this.f10972f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        Container container = this.f10973g;
        int hashCode7 = (hashCode6 + (container != null ? container.hashCode() : 0)) * 31;
        String str6 = this.f10974h;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool = this.f10975i;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<String> list2 = this.f10976j;
        int hashCode10 = (hashCode9 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Actions actions = this.f10977k;
        int hashCode11 = (hashCode10 + (actions != null ? actions.hashCode() : 0)) * 31;
        List<Container> list3 = this.f10978l;
        int hashCode12 = (hashCode11 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Params params = this.f10979m;
        int hashCode13 = (hashCode12 + (params != null ? params.hashCode() : 0)) * 31;
        String str7 = this.f10980n;
        int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Boolean bool2 = this.f10981o;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode14 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Container(id=");
        u.append(this.f10967a);
        u.append(", type=");
        u.append(this.f10968b);
        u.append(", styleId=");
        u.append(this.f10969c);
        u.append(", href=");
        u.append(this.f10970d);
        u.append(", hrefRemote=");
        u.append(this.f10971e);
        u.append(", components=");
        u.append(this.f10972f);
        u.append(", background=");
        u.append(this.f10973g);
        u.append(", statusBar=");
        u.append(this.f10974h);
        u.append(", scrollable=");
        u.append(this.f10975i);
        u.append(", tags=");
        u.append(this.f10976j);
        u.append(", actions=");
        u.append(this.f10977k);
        u.append(", containers=");
        u.append(this.f10978l);
        u.append(", params=");
        u.append(this.f10979m);
        u.append(", audioUrl=");
        u.append(this.f10980n);
        u.append(", carouselSlide=");
        u.append(this.f10981o);
        u.append(")");
        return u.toString();
    }
}
