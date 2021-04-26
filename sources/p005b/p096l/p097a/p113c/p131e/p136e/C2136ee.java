package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.ee */
public final class C2136ee extends C1948a {
    public static final Parcelable.Creator<C2136ee> CREATOR = new C2161fe();

    /* renamed from: g */
    public final String f3820g;

    /* renamed from: h */
    public final String f3821h;

    public C2136ee(String str, String str2) {
        this.f3820g = str;
        this.f3821h = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3820g, false);
        C0823f.m395s0(parcel, 2, this.f3821h, false);
        C0823f.m331A0(parcel, w0);
    }
}
