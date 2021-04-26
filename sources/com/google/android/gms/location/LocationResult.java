package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p141f.C3054e;

public final class LocationResult extends C1948a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new C3054e();

    /* renamed from: h */
    public static final List<Location> f11331h = Collections.emptyList();

    /* renamed from: g */
    public final List<Location> f11332g;

    public LocationResult(List<Location> list) {
        this.f11332g = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f11332g.size() != this.f11332g.size()) {
            return false;
        }
        Iterator<Location> it = this.f11332g.iterator();
        for (Location time : locationResult.f11332g) {
            if (it.next().getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.f11332g) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11332g);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m401v0(parcel, 1, this.f11332g, false);
        C0823f.m331A0(parcel, w0);
    }
}
