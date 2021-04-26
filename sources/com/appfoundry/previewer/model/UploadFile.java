package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class UploadFile {

    /* renamed from: a */
    public final String f11169a;

    /* renamed from: b */
    public final String f11170b;

    /* renamed from: c */
    public final String f11171c;

    /* renamed from: d */
    public final Integer f11172d;

    public UploadFile(String str, String str2, String str3, Integer num) {
        this.f11169a = str;
        this.f11170b = str2;
        this.f11171c = str3;
        this.f11172d = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadFile)) {
            return false;
        }
        UploadFile uploadFile = (UploadFile) obj;
        return C6888i.m12434a(this.f11169a, uploadFile.f11169a) && C6888i.m12434a(this.f11170b, uploadFile.f11170b) && C6888i.m12434a(this.f11171c, uploadFile.f11171c) && C6888i.m12434a(this.f11172d, uploadFile.f11172d);
    }

    public int hashCode() {
        String str = this.f11169a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11170b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11171c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f11172d;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("UploadFile(originalname=");
        u.append(this.f11169a);
        u.append(", mimetype=");
        u.append(this.f11170b);
        u.append(", url=");
        u.append(this.f11171c);
        u.append(", size=");
        u.append(this.f11172d);
        u.append(")");
        return u.toString();
    }
}
