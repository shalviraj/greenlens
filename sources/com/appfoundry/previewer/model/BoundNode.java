package com.appfoundry.previewer.model;

import com.segment.analytics.AnalyticsContext;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class BoundNode {

    /* renamed from: a */
    public final String f10923a;

    /* renamed from: b */
    public final String f10924b;

    /* renamed from: c */
    public final List<String> f10925c;

    /* renamed from: d */
    public final Boolean f10926d;

    /* renamed from: e */
    public final Container f10927e;

    /* renamed from: f */
    public final Container f10928f;

    /* renamed from: g */
    public final List<Container> f10929g;

    /* renamed from: h */
    public List<Container> f10930h;

    /* renamed from: i */
    public final String f10931i;

    /* renamed from: j */
    public final String f10932j;

    public BoundNode(String str, String str2, List<String> list, Boolean bool, Container container, Container container2, List<Container> list2, List<Container> list3, String str3, String str4) {
        C6888i.m12438e(str, AnalyticsContext.Device.DEVICE_ID_KEY);
        this.f10923a = str;
        this.f10924b = str2;
        this.f10925c = list;
        this.f10926d = bool;
        this.f10927e = container;
        this.f10928f = container2;
        this.f10929g = list2;
        this.f10930h = list3;
        this.f10931i = str3;
        this.f10932j = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundNode)) {
            return false;
        }
        BoundNode boundNode = (BoundNode) obj;
        return C6888i.m12434a(this.f10923a, boundNode.f10923a) && C6888i.m12434a(this.f10924b, boundNode.f10924b) && C6888i.m12434a(this.f10925c, boundNode.f10925c) && C6888i.m12434a(this.f10926d, boundNode.f10926d) && C6888i.m12434a(this.f10927e, boundNode.f10927e) && C6888i.m12434a(this.f10928f, boundNode.f10928f) && C6888i.m12434a(this.f10929g, boundNode.f10929g) && C6888i.m12434a(this.f10930h, boundNode.f10930h) && C6888i.m12434a(this.f10931i, boundNode.f10931i) && C6888i.m12434a(this.f10932j, boundNode.f10932j);
    }

    public int hashCode() {
        String str = this.f10923a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10924b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f10925c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.f10926d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Container container = this.f10927e;
        int hashCode5 = (hashCode4 + (container != null ? container.hashCode() : 0)) * 31;
        Container container2 = this.f10928f;
        int hashCode6 = (hashCode5 + (container2 != null ? container2.hashCode() : 0)) * 31;
        List<Container> list2 = this.f10929g;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Container> list3 = this.f10930h;
        int hashCode8 = (hashCode7 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str3 = this.f10931i;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f10932j;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("BoundNode(id=");
        u.append(this.f10923a);
        u.append(", type=");
        u.append(this.f10924b);
        u.append(", tags=");
        u.append(this.f10925c);
        u.append(", start=");
        u.append(this.f10926d);
        u.append(", background=");
        u.append(this.f10927e);
        u.append(", topBar=");
        u.append(this.f10928f);
        u.append(", body=");
        u.append(this.f10929g);
        u.append(", layers=");
        u.append(this.f10930h);
        u.append(", remote=");
        u.append(this.f10931i);
        u.append(", remoteForm=");
        return C0843a.m455p(u, this.f10932j, ")");
    }
}
