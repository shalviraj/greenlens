package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.g.d */
public final class C2672d extends C1948a implements C1789h {
    public static final Parcelable.Creator<C2672d> CREATOR = new C2674e();

    /* renamed from: g */
    public final Status f4559g;

    public C2672d(Status status) {
        this.f4559g = status;
    }

    /* renamed from: w */
    public final Status mo12039w() {
        return this.f4559g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f4559g, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
