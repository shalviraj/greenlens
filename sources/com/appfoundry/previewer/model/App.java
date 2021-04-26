package com.appfoundry.previewer.model;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class App {

    /* renamed from: a */
    public final List<Asset> f10887a;

    /* renamed from: b */
    public List<Asset> f10888b;

    /* renamed from: c */
    public final Store f10889c;

    /* renamed from: d */
    public final Integration f10890d;

    /* renamed from: e */
    public final Data f10891e;

    /* renamed from: f */
    public List<Style> f10892f;

    /* renamed from: g */
    public final Features f10893g;

    /* renamed from: h */
    public final Paywall f10894h;

    public App(List<Asset> list, List<Asset> list2, Store store, Integration integration, Data data, List<Style> list3, Features features, Paywall paywall) {
        this.f10887a = list;
        this.f10888b = list2;
        this.f10889c = store;
        this.f10890d = integration;
        this.f10891e = data;
        this.f10892f = list3;
        this.f10893g = features;
        this.f10894h = paywall;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof App)) {
            return false;
        }
        App app2 = (App) obj;
        return C6888i.m12434a(this.f10887a, app2.f10887a) && C6888i.m12434a(this.f10888b, app2.f10888b) && C6888i.m12434a(this.f10889c, app2.f10889c) && C6888i.m12434a(this.f10890d, app2.f10890d) && C6888i.m12434a(this.f10891e, app2.f10891e) && C6888i.m12434a(this.f10892f, app2.f10892f) && C6888i.m12434a(this.f10893g, app2.f10893g) && C6888i.m12434a(this.f10894h, app2.f10894h);
    }

    public int hashCode() {
        List<Asset> list = this.f10887a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Asset> list2 = this.f10888b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Store store = this.f10889c;
        int hashCode3 = (hashCode2 + (store != null ? store.hashCode() : 0)) * 31;
        Integration integration = this.f10890d;
        int hashCode4 = (hashCode3 + (integration != null ? integration.hashCode() : 0)) * 31;
        Data data = this.f10891e;
        int hashCode5 = (hashCode4 + (data != null ? data.hashCode() : 0)) * 31;
        List<Style> list3 = this.f10892f;
        int hashCode6 = (hashCode5 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Features features = this.f10893g;
        int hashCode7 = (hashCode6 + (features != null ? features.hashCode() : 0)) * 31;
        Paywall paywall = this.f10894h;
        if (paywall != null) {
            i = paywall.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("App(fonts=");
        u.append(this.f10887a);
        u.append(", assets=");
        u.append(this.f10888b);
        u.append(", store=");
        u.append(this.f10889c);
        u.append(", integration=");
        u.append(this.f10890d);
        u.append(", data=");
        u.append(this.f10891e);
        u.append(", styles=");
        u.append(this.f10892f);
        u.append(", features=");
        u.append(this.f10893g);
        u.append(", paywall=");
        u.append(this.f10894h);
        u.append(")");
        return u.toString();
    }
}
