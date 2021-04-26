package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.sc */
public final class C2475sc extends C1948a {
    public static final Parcelable.Creator<C2475sc> CREATOR = new C2499tc();

    /* renamed from: g */
    public final C3938x f4281g;

    /* renamed from: h */
    public final String f4282h;

    public C2475sc(C3938x xVar, String str) {
        this.f4281g = xVar;
        this.f4282h = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f4281g, i, false);
        C0823f.m395s0(parcel, 2, this.f4282h, false);
        C0823f.m331A0(parcel, w0);
    }
}
