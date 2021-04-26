package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p141f.C3053d;

public final class LocationRequest extends C1948a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C3053d();

    /* renamed from: g */
    public int f11323g;

    /* renamed from: h */
    public long f11324h;

    /* renamed from: i */
    public long f11325i;

    /* renamed from: j */
    public boolean f11326j;

    /* renamed from: k */
    public long f11327k;

    /* renamed from: l */
    public int f11328l;

    /* renamed from: m */
    public float f11329m;

    /* renamed from: n */
    public long f11330n;

    public LocationRequest() {
        this.f11323g = 102;
        this.f11324h = 3600000;
        this.f11325i = 600000;
        this.f11326j = false;
        this.f11327k = RecyclerView.FOREVER_NS;
        this.f11328l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f11329m = 0.0f;
        this.f11330n = 0;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f11323g = i;
        this.f11324h = j;
        this.f11325i = j2;
        this.f11326j = z;
        this.f11327k = j3;
        this.f11328l = i2;
        this.f11329m = f;
        this.f11330n = j4;
    }

    /* renamed from: V */
    public static void m10410V(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f11323g == locationRequest.f11323g) {
            long j = this.f11324h;
            long j2 = locationRequest.f11324h;
            if (j == j2 && this.f11325i == locationRequest.f11325i && this.f11326j == locationRequest.f11326j && this.f11327k == locationRequest.f11327k && this.f11328l == locationRequest.f11328l && this.f11329m == locationRequest.f11329m) {
                long j3 = this.f11330n;
                if (j3 >= j) {
                    j = j3;
                }
                long j4 = locationRequest.f11330n;
                if (j4 >= j2) {
                    j2 = j4;
                }
                if (j == j2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11323g), Long.valueOf(this.f11324h), Float.valueOf(this.f11329m), Long.valueOf(this.f11330n)});
    }

    public final String toString() {
        StringBuilder u = C0843a.m460u("Request[");
        int i = this.f11323g;
        u.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f11323g != 105) {
            u.append(" requested=");
            u.append(this.f11324h);
            u.append("ms");
        }
        u.append(" fastest=");
        u.append(this.f11325i);
        u.append("ms");
        if (this.f11330n > this.f11324h) {
            u.append(" maxWait=");
            u.append(this.f11330n);
            u.append("ms");
        }
        if (this.f11329m > 0.0f) {
            u.append(" smallestDisplacement=");
            u.append(this.f11329m);
            u.append("m");
        }
        long j = this.f11327k;
        if (j != RecyclerView.FOREVER_NS) {
            u.append(" expireIn=");
            u.append(j - SystemClock.elapsedRealtime());
            u.append("ms");
        }
        if (this.f11328l != Integer.MAX_VALUE) {
            u.append(" num=");
            u.append(this.f11328l);
        }
        u.append(']');
        return u.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f11323g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.f11324h;
        C0823f.m333B0(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.f11325i;
        C0823f.m333B0(parcel, 3, 8);
        parcel.writeLong(j2);
        boolean z = this.f11326j;
        C0823f.m333B0(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        long j3 = this.f11327k;
        C0823f.m333B0(parcel, 5, 8);
        parcel.writeLong(j3);
        int i3 = this.f11328l;
        C0823f.m333B0(parcel, 6, 4);
        parcel.writeInt(i3);
        float f = this.f11329m;
        C0823f.m333B0(parcel, 7, 4);
        parcel.writeFloat(f);
        long j4 = this.f11330n;
        C0823f.m333B0(parcel, 8, 8);
        parcel.writeLong(j4);
        C0823f.m331A0(parcel, w0);
    }
}
