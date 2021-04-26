package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class RichText {

    /* renamed from: a */
    public final String f11101a;

    /* renamed from: b */
    public final String f11102b;

    /* renamed from: c */
    public final String f11103c;

    public RichText(String str, String str2, String str3) {
        this.f11101a = str;
        this.f11102b = str2;
        this.f11103c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichText)) {
            return false;
        }
        RichText richText = (RichText) obj;
        return C6888i.m12434a(this.f11101a, richText.f11101a) && C6888i.m12434a(this.f11102b, richText.f11102b) && C6888i.m12434a(this.f11103c, richText.f11103c);
    }

    public int hashCode() {
        String str = this.f11101a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11102b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11103c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("RichText(text=");
        u.append(this.f11101a);
        u.append(", styleId=");
        u.append(this.f11102b);
        u.append(", anchor=");
        return C0843a.m455p(u, this.f11103c, ")");
    }
}
