package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.qd */
public final class C2428qd extends C1948a {
    public static final Parcelable.Creator<C2428qd> CREATOR = new C2452rd();

    /* renamed from: g */
    public final C2364nl f4231g;

    public C2428qd(C2364nl nlVar) {
        this.f4231g = nlVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f4231g, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
