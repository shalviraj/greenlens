package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1941q0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1942r;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p142g.p144g.C3098f;

public final class LatLngBounds extends C1948a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C3098f();

    /* renamed from: g */
    public final LatLng f11356g;

    /* renamed from: h */
    public final LatLng f11357h;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C0823f.m380l(latLng, "null southwest");
        C0823f.m380l(latLng2, "null northeast");
        double d = latLng2.f11354g;
        double d2 = latLng.f11354g;
        C0823f.m364d(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.f11354g));
        this.f11356g = latLng;
        this.f11357h = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f11356g.equals(latLngBounds.f11356g) && this.f11357h.equals(latLngBounds.f11357h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11356g, this.f11357h});
    }

    public final String toString() {
        C1942r rVar = new C1942r(this, (C1941q0) null);
        rVar.mo12270a("southwest", this.f11356g);
        rVar.mo12270a("northeast", this.f11357h);
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 2, this.f11356g, i, false);
        C0823f.m393r0(parcel, 3, this.f11357h, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
