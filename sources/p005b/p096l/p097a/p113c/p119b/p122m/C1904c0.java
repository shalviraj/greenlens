package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1758d;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.b.m.c0 */
public final class C1904c0 extends C1948a {
    public static final Parcelable.Creator<C1904c0> CREATOR = new C1908d0();

    /* renamed from: g */
    public Bundle f3409g;

    /* renamed from: h */
    public C1758d[] f3410h;

    /* renamed from: i */
    public int f3411i;

    public C1904c0() {
    }

    public C1904c0(Bundle bundle, C1758d[] dVarArr, int i) {
        this.f3409g = bundle;
        this.f3410h = dVarArr;
        this.f3411i = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m385n0(parcel, 1, this.f3409g, false);
        C0823f.m399u0(parcel, 2, this.f3410h, i, false);
        int i2 = this.f3411i;
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeInt(i2);
        C0823f.m331A0(parcel, w0);
    }
}
