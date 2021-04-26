package p005b.p096l.p097a.p151d.p152a.p157d;

import com.google.android.play.core.install.InstallState;
import java.util.Objects;

/* renamed from: b.l.a.d.a.d.c */
public final class C3572c extends InstallState {

    /* renamed from: a */
    public final int f6635a;

    /* renamed from: b */
    public final long f6636b;

    /* renamed from: c */
    public final long f6637c;

    /* renamed from: d */
    public final int f6638d;

    /* renamed from: e */
    public final String f6639e;

    public C3572c(int i, long j, long j2, int i2, String str) {
        this.f6635a = i;
        this.f6636b = j;
        this.f6637c = j2;
        this.f6638d = i2;
        Objects.requireNonNull(str, "Null packageName");
        this.f6639e = str;
    }

    /* renamed from: a */
    public final long mo14871a() {
        return this.f6636b;
    }

    /* renamed from: b */
    public final int mo14872b() {
        return this.f6638d;
    }

    /* renamed from: c */
    public final int mo14873c() {
        return this.f6635a;
    }

    /* renamed from: d */
    public final String mo14874d() {
        return this.f6639e;
    }

    /* renamed from: e */
    public final long mo14875e() {
        return this.f6637c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f6635a == installState.mo14873c() && this.f6636b == installState.mo14871a() && this.f6637c == installState.mo14875e() && this.f6638d == installState.mo14872b() && this.f6639e.equals(installState.mo14874d());
        }
    }

    public final int hashCode() {
        int i = this.f6635a;
        long j = this.f6636b;
        long j2 = this.f6637c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f6638d) * 1000003) ^ this.f6639e.hashCode();
    }

    public final String toString() {
        int i = this.f6635a;
        long j = this.f6636b;
        long j2 = this.f6637c;
        int i2 = this.f6638d;
        String str = this.f6639e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
