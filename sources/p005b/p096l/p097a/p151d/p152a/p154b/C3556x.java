package p005b.p096l.p097a.p151d.p152a.p154b;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.d.a.b.x */
public final class C3556x extends AssetPackState {

    /* renamed from: a */
    public final String f6601a;

    /* renamed from: b */
    public final int f6602b;

    /* renamed from: c */
    public final int f6603c;

    /* renamed from: d */
    public final long f6604d;

    /* renamed from: e */
    public final long f6605e;

    /* renamed from: f */
    public final int f6606f;

    /* renamed from: g */
    public final int f6607g;

    /* renamed from: h */
    public final String f6608h;

    public C3556x(String str, int i, int i2, long j, long j2, int i3, int i4, String str2) {
        Objects.requireNonNull(str, "Null name");
        this.f6601a = str;
        this.f6602b = i;
        this.f6603c = i2;
        this.f6604d = j;
        this.f6605e = j2;
        this.f6606f = i3;
        this.f6607g = i4;
        Objects.requireNonNull(str2, "Null versionTag");
        this.f6608h = str2;
    }

    /* renamed from: a */
    public final int mo14849a() {
        return this.f6607g;
    }

    /* renamed from: b */
    public final String mo14850b() {
        return this.f6608h;
    }

    /* renamed from: c */
    public final long mo14851c() {
        return this.f6604d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f6601a.equals(assetPackState.mo14854g()) && this.f6602b == assetPackState.mo14855h() && this.f6603c == assetPackState.mo14853f() && this.f6604d == assetPackState.mo14851c() && this.f6605e == assetPackState.mo14857i() && this.f6606f == assetPackState.mo14858j() && this.f6607g == assetPackState.mo14849a() && this.f6608h.equals(assetPackState.mo14850b());
        }
    }

    /* renamed from: f */
    public final int mo14853f() {
        return this.f6603c;
    }

    /* renamed from: g */
    public final String mo14854g() {
        return this.f6601a;
    }

    /* renamed from: h */
    public final int mo14855h() {
        return this.f6602b;
    }

    public final int hashCode() {
        int hashCode = this.f6601a.hashCode();
        int i = this.f6602b;
        int i2 = this.f6603c;
        long j = this.f6604d;
        long j2 = this.f6605e;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f6606f) * 1000003) ^ this.f6607g) * 1000003) ^ this.f6608h.hashCode();
    }

    /* renamed from: i */
    public final long mo14857i() {
        return this.f6605e;
    }

    /* renamed from: j */
    public final int mo14858j() {
        return this.f6606f;
    }

    public final String toString() {
        String str = this.f6601a;
        int i = this.f6602b;
        int i2 = this.f6603c;
        long j = this.f6604d;
        long j2 = this.f6605e;
        int i3 = this.f6606f;
        int i4 = this.f6607g;
        String str2 = this.f6608h;
        StringBuilder sb = new StringBuilder(str.length() + 230 + str2.length());
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append(", versionTag=");
        return C0843a.m455p(sb, str2, "}");
    }
}
