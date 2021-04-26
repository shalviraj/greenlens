package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class Store {

    /* renamed from: a */
    public final String f11118a;

    /* renamed from: b */
    public final String f11119b;

    /* renamed from: c */
    public final String f11120c;

    /* renamed from: d */
    public final String f11121d;

    /* renamed from: e */
    public final String f11122e;

    /* renamed from: f */
    public final Integer f11123f;

    public Store(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.f11118a = str;
        this.f11119b = str2;
        this.f11120c = str3;
        this.f11121d = str4;
        this.f11122e = str5;
        this.f11123f = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Store)) {
            return false;
        }
        Store store = (Store) obj;
        return C6888i.m12434a(this.f11118a, store.f11118a) && C6888i.m12434a(this.f11119b, store.f11119b) && C6888i.m12434a(this.f11120c, store.f11120c) && C6888i.m12434a(this.f11121d, store.f11121d) && C6888i.m12434a(this.f11122e, store.f11122e) && C6888i.m12434a(this.f11123f, store.f11123f);
    }

    public int hashCode() {
        String str = this.f11118a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11119b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11120c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11121d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f11122e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.f11123f;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Store(name=");
        u.append(this.f11118a);
        u.append(", icon=");
        u.append(this.f11119b);
        u.append(", splash=");
        u.append(this.f11120c);
        u.append(", description=");
        u.append(this.f11121d);
        u.append(", bundleId=");
        u.append(this.f11122e);
        u.append(", ratingAppAlert=");
        u.append(this.f11123f);
        u.append(")");
        return u.toString();
    }
}
