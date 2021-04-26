package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p142g.p144g.C3099g;

public final class LatLng extends C1948a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new C3099g();

    /* renamed from: g */
    public final double f11354g;

    /* renamed from: h */
    public final double f11355h;

    public LatLng(double d, double d2) {
        this.f11355h = (-180.0d > d2 || d2 >= 180.0d) ? ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d2;
        this.f11354g = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f11354g) == Double.doubleToLongBits(latLng.f11354g) && Double.doubleToLongBits(this.f11355h) == Double.doubleToLongBits(latLng.f11355h);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f11354g);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f11355h);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        double d = this.f11354g;
        double d2 = this.f11355h;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        double d = this.f11354g;
        C0823f.m333B0(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.f11355h;
        C0823f.m333B0(parcel, 3, 8);
        parcel.writeDouble(d2);
        C0823f.m331A0(parcel, w0);
    }
}
