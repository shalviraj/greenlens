package com.appfoundry.previewer.model;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
public final class UploadInfoResponse {

    /* renamed from: a */
    public final String f11173a;

    /* renamed from: b */
    public final String f11174b;

    /* renamed from: c */
    public final Integer f11175c;

    public UploadInfoResponse(String str, String str2, Integer num) {
        this.f11173a = str;
        this.f11174b = str2;
        this.f11175c = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadInfoResponse)) {
            return false;
        }
        UploadInfoResponse uploadInfoResponse = (UploadInfoResponse) obj;
        return C6888i.m12434a(this.f11173a, uploadInfoResponse.f11173a) && C6888i.m12434a(this.f11174b, uploadInfoResponse.f11174b) && C6888i.m12434a(this.f11175c, uploadInfoResponse.f11175c);
    }

    public int hashCode() {
        String str = this.f11173a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11174b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f11175c;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("UploadInfoResponse(publicUrl=");
        u.append(this.f11173a);
        u.append(", uploadUrl=");
        u.append(this.f11174b);
        u.append(", expiresIn=");
        u.append(this.f11175c);
        u.append(")");
        return u.toString();
    }
}
