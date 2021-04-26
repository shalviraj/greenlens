package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.kd */
public final class C2284kd extends C1948a {
    public static final Parcelable.Creator<C2284kd> CREATOR = new C2308ld();

    /* renamed from: g */
    public final C2043al f4012g;

    public C2284kd(C2043al alVar) {
        this.f4012g = alVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f4012g, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
