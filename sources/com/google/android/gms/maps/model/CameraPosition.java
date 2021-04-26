package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1941q0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1942r;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p142g.p144g.C3097e;

public final class CameraPosition extends C1948a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C3097e();

    /* renamed from: g */
    public final LatLng f11350g;

    /* renamed from: h */
    public final float f11351h;

    /* renamed from: i */
    public final float f11352i;

    /* renamed from: j */
    public final float f11353j;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        C0823f.m380l(latLng, "null camera target");
        C0823f.m364d(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f11350g = latLng;
        this.f11351h = f;
        this.f11352i = f2 + 0.0f;
        this.f11353j = (((double) f3) <= ShadowDrawableWrapper.COS_45 ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f11350g.equals(cameraPosition.f11350g) && Float.floatToIntBits(this.f11351h) == Float.floatToIntBits(cameraPosition.f11351h) && Float.floatToIntBits(this.f11352i) == Float.floatToIntBits(cameraPosition.f11352i) && Float.floatToIntBits(this.f11353j) == Float.floatToIntBits(cameraPosition.f11353j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11350g, Float.valueOf(this.f11351h), Float.valueOf(this.f11352i), Float.valueOf(this.f11353j)});
    }

    public final String toString() {
        C1942r rVar = new C1942r(this, (C1941q0) null);
        rVar.mo12270a("target", this.f11350g);
        rVar.mo12270a("zoom", Float.valueOf(this.f11351h));
        rVar.mo12270a("tilt", Float.valueOf(this.f11352i));
        rVar.mo12270a("bearing", Float.valueOf(this.f11353j));
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 2, this.f11350g, i, false);
        float f = this.f11351h;
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeFloat(f);
        float f2 = this.f11352i;
        C0823f.m333B0(parcel, 4, 4);
        parcel.writeFloat(f2);
        float f3 = this.f11353j;
        C0823f.m333B0(parcel, 5, 4);
        parcel.writeFloat(f3);
        C0823f.m331A0(parcel, w0);
    }
}
