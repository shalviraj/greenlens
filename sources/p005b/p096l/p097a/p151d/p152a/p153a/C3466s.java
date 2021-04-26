package p005b.p096l.p097a.p151d.p152a.p153a;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.d.a.a.s */
public final class C3466s extends C3448a {

    /* renamed from: a */
    public final String f6273a;

    /* renamed from: b */
    public final int f6274b;

    /* renamed from: c */
    public final int f6275c;

    /* renamed from: d */
    public final int f6276d;

    /* renamed from: e */
    public final Integer f6277e;

    /* renamed from: f */
    public final int f6278f;

    /* renamed from: g */
    public final long f6279g;

    /* renamed from: h */
    public final long f6280h;

    /* renamed from: i */
    public final long f6281i;

    /* renamed from: j */
    public final long f6282j;

    /* renamed from: k */
    public final PendingIntent f6283k;

    /* renamed from: l */
    public final PendingIntent f6284l;

    /* renamed from: m */
    public final PendingIntent f6285m;

    /* renamed from: n */
    public final PendingIntent f6286n;

    public C3466s(String str, int i, int i2, int i3, @Nullable Integer num, int i4, long j, long j2, long j3, long j4, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4) {
        Objects.requireNonNull(str, "Null packageName");
        this.f6273a = str;
        this.f6274b = i;
        this.f6275c = i2;
        this.f6276d = i3;
        this.f6277e = num;
        this.f6278f = i4;
        this.f6279g = j;
        this.f6280h = j2;
        this.f6281i = j3;
        this.f6282j = j4;
        this.f6283k = pendingIntent;
        this.f6284l = pendingIntent2;
        this.f6285m = pendingIntent3;
        this.f6286n = pendingIntent4;
    }

    /* renamed from: a */
    public final int mo14711a() {
        return this.f6274b;
    }

    /* renamed from: b */
    public final long mo14712b() {
        return this.f6281i;
    }

    /* renamed from: c */
    public final long mo14713c() {
        return this.f6279g;
    }

    /* renamed from: d */
    public final long mo14714d() {
        return this.f6282j;
    }

    @Nullable
    /* renamed from: e */
    public final Integer mo14715e() {
        return this.f6277e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3448a) {
            C3448a aVar = (C3448a) obj;
            if (this.f6273a.equals(aVar.mo14723m()) && this.f6274b == aVar.mo14711a() && this.f6275c == aVar.mo14725o() && this.f6276d == aVar.mo14722l() && ((num = this.f6277e) != null ? num.equals(aVar.mo14715e()) : aVar.mo14715e() == null) && this.f6278f == aVar.mo14726p() && this.f6279g == aVar.mo14713c() && this.f6280h == aVar.mo14724n() && this.f6281i == aVar.mo14712b() && this.f6282j == aVar.mo14714d() && ((pendingIntent = this.f6283k) != null ? pendingIntent.equals(aVar.mo14716f()) : aVar.mo14716f() == null) && ((pendingIntent2 = this.f6284l) != null ? pendingIntent2.equals(aVar.mo14717g()) : aVar.mo14717g() == null) && ((pendingIntent3 = this.f6285m) != null ? pendingIntent3.equals(aVar.mo14718h()) : aVar.mo14718h() == null)) {
                PendingIntent pendingIntent4 = this.f6286n;
                PendingIntent i = aVar.mo14719i();
                if (pendingIntent4 != null ? pendingIntent4.equals(i) : i == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final PendingIntent mo14716f() {
        return this.f6283k;
    }

    @Nullable
    /* renamed from: g */
    public final PendingIntent mo14717g() {
        return this.f6284l;
    }

    @Nullable
    /* renamed from: h */
    public final PendingIntent mo14718h() {
        return this.f6285m;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f6273a.hashCode() ^ 1000003) * 1000003) ^ this.f6274b) * 1000003) ^ this.f6275c) * 1000003) ^ this.f6276d) * 1000003;
        Integer num = this.f6277e;
        int i = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i2 = this.f6278f;
        long j = this.f6279g;
        long j2 = this.f6280h;
        long j3 = this.f6281i;
        long j4 = this.f6282j;
        int i3 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        PendingIntent pendingIntent = this.f6283k;
        int hashCode3 = (i3 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.f6284l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.f6285m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.f6286n;
        if (pendingIntent4 != null) {
            i = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i;
    }

    @Nullable
    /* renamed from: i */
    public final PendingIntent mo14719i() {
        return this.f6286n;
    }

    /* renamed from: l */
    public final int mo14722l() {
        return this.f6276d;
    }

    @NonNull
    /* renamed from: m */
    public final String mo14723m() {
        return this.f6273a;
    }

    /* renamed from: n */
    public final long mo14724n() {
        return this.f6280h;
    }

    /* renamed from: o */
    public final int mo14725o() {
        return this.f6275c;
    }

    /* renamed from: p */
    public final int mo14726p() {
        return this.f6278f;
    }

    public final String toString() {
        String str = this.f6273a;
        int i = this.f6274b;
        int i2 = this.f6275c;
        int i3 = this.f6276d;
        String valueOf = String.valueOf(this.f6277e);
        int i4 = this.f6278f;
        long j = this.f6279g;
        long j2 = this.f6280h;
        long j3 = this.f6281i;
        long j4 = this.f6282j;
        String valueOf2 = String.valueOf(this.f6283k);
        long j5 = j4;
        String valueOf3 = String.valueOf(this.f6284l);
        String valueOf4 = String.valueOf(this.f6285m);
        long j6 = j3;
        String valueOf5 = String.valueOf(this.f6286n);
        int length = str.length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + valueOf4.length() + valueOf5.length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", additionalSpaceRequired=");
        sb.append(j6);
        sb.append(", assetPackStorageSize=");
        sb.append(j5);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        C0843a.m431G(sb, ", flexibleUpdateIntent=", valueOf3, ", immediateDestructiveUpdateIntent=", valueOf4);
        return C0843a.m456q(sb, ", flexibleDestructiveUpdateIntent=", valueOf5, "}");
    }
}
