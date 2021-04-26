package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p141f.C3060k;
import p005b.p096l.p097a.p113c.p141f.C3061l;
import p005b.p096l.p097a.p113c.p141f.C3062m;

/* renamed from: b.l.a.c.e.g.a0 */
public final class C2667a0 extends C1948a {
    public static final Parcelable.Creator<C2667a0> CREATOR = new C2669b0();

    /* renamed from: g */
    public int f4554g;

    /* renamed from: h */
    public C2695y f4555h;

    /* renamed from: i */
    public C3060k f4556i;

    /* renamed from: j */
    public C2676f f4557j;

    public C2667a0(int i, C2695y yVar, IBinder iBinder, IBinder iBinder2) {
        C3060k kVar;
        this.f4554g = i;
        this.f4555h = yVar;
        C2676f fVar = null;
        if (iBinder == null) {
            kVar = null;
        } else {
            int i2 = C3061l.f5203a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            kVar = queryLocalInterface instanceof C3060k ? (C3060k) queryLocalInterface : new C3062m(iBinder);
        }
        this.f4556i = kVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface2 instanceof C2676f ? (C2676f) queryLocalInterface2 : new C2678h(iBinder2);
        }
        this.f4557j = fVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f4554g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m393r0(parcel, 2, this.f4555h, i, false);
        C3060k kVar = this.f4556i;
        IBinder iBinder = null;
        C0823f.m389p0(parcel, 3, kVar == null ? null : kVar.asBinder(), false);
        C2676f fVar = this.f4557j;
        if (fVar != null) {
            iBinder = fVar.asBinder();
        }
        C0823f.m389p0(parcel, 4, iBinder, false);
        C0823f.m331A0(parcel, w0);
    }
}
