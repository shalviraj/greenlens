package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p141f.C3052c;
import p005b.p096l.p097a.p113c.p141f.C3056g;

public final class LocationAvailability extends C1948a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C3052c();
    @Deprecated

    /* renamed from: g */
    public int f11318g;
    @Deprecated

    /* renamed from: h */
    public int f11319h;

    /* renamed from: i */
    public long f11320i;

    /* renamed from: j */
    public int f11321j;

    /* renamed from: k */
    public C3056g[] f11322k;

    public LocationAvailability(int i, int i2, int i3, long j, C3056g[] gVarArr) {
        this.f11321j = i;
        this.f11318g = i2;
        this.f11319h = i3;
        this.f11320i = j;
        this.f11322k = gVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f11318g == locationAvailability.f11318g && this.f11319h == locationAvailability.f11319h && this.f11320i == locationAvailability.f11320i && this.f11321j == locationAvailability.f11321j && Arrays.equals(this.f11322k, locationAvailability.f11322k);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11321j), Integer.valueOf(this.f11318g), Integer.valueOf(this.f11319h), Long.valueOf(this.f11320i), this.f11322k});
    }

    public final String toString() {
        boolean z = this.f11321j < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f11318g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f11319h;
        C0823f.m333B0(parcel, 2, 4);
        parcel.writeInt(i3);
        long j = this.f11320i;
        C0823f.m333B0(parcel, 3, 8);
        parcel.writeLong(j);
        int i4 = this.f11321j;
        C0823f.m333B0(parcel, 4, 4);
        parcel.writeInt(i4);
        C0823f.m399u0(parcel, 5, this.f11322k, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
