package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1941q0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1942r;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p142g.C3101h;

public final class GoogleMapOptions extends C1948a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C3101h();

    /* renamed from: g */
    public Boolean f11333g;

    /* renamed from: h */
    public Boolean f11334h;

    /* renamed from: i */
    public int f11335i = -1;

    /* renamed from: j */
    public CameraPosition f11336j;

    /* renamed from: k */
    public Boolean f11337k;

    /* renamed from: l */
    public Boolean f11338l;

    /* renamed from: m */
    public Boolean f11339m;

    /* renamed from: n */
    public Boolean f11340n;

    /* renamed from: o */
    public Boolean f11341o;

    /* renamed from: p */
    public Boolean f11342p;

    /* renamed from: q */
    public Boolean f11343q;

    /* renamed from: r */
    public Boolean f11344r;

    /* renamed from: s */
    public Boolean f11345s;

    /* renamed from: t */
    public Float f11346t = null;

    /* renamed from: u */
    public Float f11347u = null;

    /* renamed from: v */
    public LatLngBounds f11348v = null;

    /* renamed from: w */
    public Boolean f11349w;

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12) {
        this.f11333g = C1960d.m2783c1(b);
        this.f11334h = C1960d.m2783c1(b2);
        this.f11335i = i;
        this.f11336j = cameraPosition;
        this.f11337k = C1960d.m2783c1(b3);
        this.f11338l = C1960d.m2783c1(b4);
        this.f11339m = C1960d.m2783c1(b5);
        this.f11340n = C1960d.m2783c1(b6);
        this.f11341o = C1960d.m2783c1(b7);
        this.f11342p = C1960d.m2783c1(b8);
        this.f11343q = C1960d.m2783c1(b9);
        this.f11344r = C1960d.m2783c1(b10);
        this.f11345s = C1960d.m2783c1(b11);
        this.f11346t = f;
        this.f11347u = f2;
        this.f11348v = latLngBounds;
        this.f11349w = C1960d.m2783c1(b12);
    }

    public final String toString() {
        C1942r rVar = new C1942r(this, (C1941q0) null);
        rVar.mo12270a("MapType", Integer.valueOf(this.f11335i));
        rVar.mo12270a("LiteMode", this.f11343q);
        rVar.mo12270a("Camera", this.f11336j);
        rVar.mo12270a("CompassEnabled", this.f11338l);
        rVar.mo12270a("ZoomControlsEnabled", this.f11337k);
        rVar.mo12270a("ScrollGesturesEnabled", this.f11339m);
        rVar.mo12270a("ZoomGesturesEnabled", this.f11340n);
        rVar.mo12270a("TiltGesturesEnabled", this.f11341o);
        rVar.mo12270a("RotateGesturesEnabled", this.f11342p);
        rVar.mo12270a("ScrollGesturesEnabledDuringRotateOrZoom", this.f11349w);
        rVar.mo12270a("MapToolbarEnabled", this.f11344r);
        rVar.mo12270a("AmbientEnabled", this.f11345s);
        rVar.mo12270a("MinZoomPreference", this.f11346t);
        rVar.mo12270a("MaxZoomPreference", this.f11347u);
        rVar.mo12270a("LatLngBoundsForCameraTarget", this.f11348v);
        rVar.mo12270a("ZOrderOnTop", this.f11333g);
        rVar.mo12270a("UseViewLifecycleInFragment", this.f11334h);
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        byte U0 = C1960d.m2756U0(this.f11333g);
        C0823f.m333B0(parcel, 2, 4);
        parcel.writeInt(U0);
        byte U02 = C1960d.m2756U0(this.f11334h);
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeInt(U02);
        int i2 = this.f11335i;
        C0823f.m333B0(parcel, 4, 4);
        parcel.writeInt(i2);
        C0823f.m393r0(parcel, 5, this.f11336j, i, false);
        byte U03 = C1960d.m2756U0(this.f11337k);
        C0823f.m333B0(parcel, 6, 4);
        parcel.writeInt(U03);
        byte U04 = C1960d.m2756U0(this.f11338l);
        C0823f.m333B0(parcel, 7, 4);
        parcel.writeInt(U04);
        byte U05 = C1960d.m2756U0(this.f11339m);
        C0823f.m333B0(parcel, 8, 4);
        parcel.writeInt(U05);
        byte U06 = C1960d.m2756U0(this.f11340n);
        C0823f.m333B0(parcel, 9, 4);
        parcel.writeInt(U06);
        byte U07 = C1960d.m2756U0(this.f11341o);
        C0823f.m333B0(parcel, 10, 4);
        parcel.writeInt(U07);
        byte U08 = C1960d.m2756U0(this.f11342p);
        C0823f.m333B0(parcel, 11, 4);
        parcel.writeInt(U08);
        byte U09 = C1960d.m2756U0(this.f11343q);
        C0823f.m333B0(parcel, 12, 4);
        parcel.writeInt(U09);
        byte U010 = C1960d.m2756U0(this.f11344r);
        C0823f.m333B0(parcel, 14, 4);
        parcel.writeInt(U010);
        byte U011 = C1960d.m2756U0(this.f11345s);
        C0823f.m333B0(parcel, 15, 4);
        parcel.writeInt(U011);
        C0823f.m387o0(parcel, 16, this.f11346t, false);
        C0823f.m387o0(parcel, 17, this.f11347u, false);
        C0823f.m393r0(parcel, 18, this.f11348v, i, false);
        byte U012 = C1960d.m2756U0(this.f11349w);
        C0823f.m333B0(parcel, 19, 4);
        parcel.writeInt(U012);
        C0823f.m331A0(parcel, w0);
    }
}
