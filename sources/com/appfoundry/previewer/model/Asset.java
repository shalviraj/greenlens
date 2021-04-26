package com.appfoundry.previewer.model;

import com.segment.analytics.AnalyticsContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p281a.C5077m;
import p298d.p344x.p346c.C6888i;

@C5077m(generateAdapter = true)
@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0004\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0019\u0010)\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b(\u0010\u0004R\u001b\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\r\u001a\u0004\b+\u0010\u0004¨\u0006-"}, mo24462d2 = {"Lcom/appfoundry/previewer/model/Asset;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getType", "type", "Lcom/appfoundry/previewer/model/Resolution;", "f", "Lcom/appfoundry/previewer/model/Resolution;", "getOriginalSize", "()Lcom/appfoundry/previewer/model/Resolution;", "originalSize", "b", "getUrl", "setUrl", "(Ljava/lang/String;)V", "url", "d", "Ljava/lang/Boolean;", "getPreload", "()Ljava/lang/Boolean;", "preload", "g", "Z", "getCached", "()Z", "setCached", "(Z)V", "cached", "a", "getId", "id", "c", "getThumbUrl", "thumbUrl", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class Asset {

    /* renamed from: a */
    public final String f10895a;

    /* renamed from: b */
    public String f10896b;

    /* renamed from: c */
    public final String f10897c;

    /* renamed from: d */
    public final Boolean f10898d;

    /* renamed from: e */
    public final String f10899e;

    /* renamed from: f */
    public final Resolution f10900f;

    /* renamed from: g */
    public transient boolean f10901g;

    public Asset(String str, String str2, String str3, Boolean bool, String str4, Resolution resolution, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 64) != 0 ? false : z;
        C6888i.m12438e(str, AnalyticsContext.Device.DEVICE_ID_KEY);
        this.f10895a = str;
        this.f10896b = str2;
        this.f10897c = str3;
        this.f10898d = bool;
        this.f10899e = str4;
        this.f10900f = resolution;
        this.f10901g = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return C6888i.m12434a(this.f10895a, asset.f10895a) && C6888i.m12434a(this.f10896b, asset.f10896b) && C6888i.m12434a(this.f10897c, asset.f10897c) && C6888i.m12434a(this.f10898d, asset.f10898d) && C6888i.m12434a(this.f10899e, asset.f10899e) && C6888i.m12434a(this.f10900f, asset.f10900f) && this.f10901g == asset.f10901g;
    }

    public int hashCode() {
        String str = this.f10895a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10896b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10897c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.f10898d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.f10899e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Resolution resolution = this.f10900f;
        if (resolution != null) {
            i = resolution.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.f10901g;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Asset(id=");
        u.append(this.f10895a);
        u.append(", url=");
        u.append(this.f10896b);
        u.append(", thumbUrl=");
        u.append(this.f10897c);
        u.append(", preload=");
        u.append(this.f10898d);
        u.append(", type=");
        u.append(this.f10899e);
        u.append(", originalSize=");
        u.append(this.f10900f);
        u.append(", cached=");
        u.append(this.f10901g);
        u.append(")");
        return u.toString();
    }
}
