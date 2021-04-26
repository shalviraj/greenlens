package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.cd */
public final class C2085cd extends C1948a {
    public static final Parcelable.Creator<C2085cd> CREATOR = new C2110dd();

    /* renamed from: g */
    public final String f3659g;

    /* renamed from: h */
    public final C3938x f3660h;

    public C2085cd(String str, C3938x xVar) {
        this.f3659g = str;
        this.f3660h = xVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3659g, false);
        C0823f.m393r0(parcel, 2, this.f3660h, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
