package p005b.p096l.p097a.p113c.p142g.p144g;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p129c.C1980b;

/* renamed from: b.l.a.c.g.g.c */
public final class C3095c extends C1948a {
    public static final Parcelable.Creator<C3095c> CREATOR = new C3100h();

    /* renamed from: g */
    public LatLng f5224g;

    /* renamed from: h */
    public String f5225h;

    /* renamed from: i */
    public String f5226i;

    /* renamed from: j */
    public C3093a f5227j;

    /* renamed from: k */
    public float f5228k = 0.5f;

    /* renamed from: l */
    public float f5229l = 1.0f;

    /* renamed from: m */
    public boolean f5230m;

    /* renamed from: n */
    public boolean f5231n = true;

    /* renamed from: o */
    public boolean f5232o = false;

    /* renamed from: p */
    public float f5233p = 0.0f;

    /* renamed from: q */
    public float f5234q = 0.5f;

    /* renamed from: r */
    public float f5235r = 0.0f;

    /* renamed from: s */
    public float f5236s = 1.0f;

    /* renamed from: t */
    public float f5237t;

    public C3095c() {
    }

    public C3095c(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f5224g = latLng;
        this.f5225h = str;
        this.f5226i = str2;
        this.f5227j = iBinder == null ? null : new C3093a(C1980b.C1981a.m2899k(iBinder));
        this.f5228k = f;
        this.f5229l = f2;
        this.f5230m = z;
        this.f5231n = z2;
        this.f5232o = z3;
        this.f5233p = f3;
        this.f5234q = f4;
        this.f5235r = f5;
        this.f5236s = f6;
        this.f5237t = f7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 2, this.f5224g, i, false);
        C0823f.m395s0(parcel, 3, this.f5225h, false);
        C0823f.m395s0(parcel, 4, this.f5226i, false);
        C3093a aVar = this.f5227j;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.f5222a.asBinder();
        }
        C0823f.m389p0(parcel, 5, iBinder, false);
        float f = this.f5228k;
        C0823f.m333B0(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.f5229l;
        C0823f.m333B0(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.f5230m;
        C0823f.m333B0(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f5231n;
        C0823f.m333B0(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.f5232o;
        C0823f.m333B0(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.f5233p;
        C0823f.m333B0(parcel, 11, 4);
        parcel.writeFloat(f3);
        float f4 = this.f5234q;
        C0823f.m333B0(parcel, 12, 4);
        parcel.writeFloat(f4);
        float f5 = this.f5235r;
        C0823f.m333B0(parcel, 13, 4);
        parcel.writeFloat(f5);
        float f6 = this.f5236s;
        C0823f.m333B0(parcel, 14, 4);
        parcel.writeFloat(f6);
        float f7 = this.f5237t;
        C0823f.m333B0(parcel, 15, 4);
        parcel.writeFloat(f7);
        C0823f.m331A0(parcel, w0);
    }
}
