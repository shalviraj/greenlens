package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.yc */
public final class C2619yc extends C1948a {
    public static final Parcelable.Creator<C2619yc> CREATOR = new C2643zc();

    /* renamed from: g */
    public final String f4482g;

    /* renamed from: h */
    public final String f4483h;

    /* renamed from: i */
    public final String f4484i;

    public C2619yc(String str, String str2, String str3) {
        this.f4482g = str;
        this.f4483h = str2;
        this.f4484i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f4482g, false);
        C0823f.m395s0(parcel, 2, this.f4483h, false);
        C0823f.m395s0(parcel, 3, this.f4484i, false);
        C0823f.m331A0(parcel, w0);
    }
}
