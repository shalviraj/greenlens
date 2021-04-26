package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3854a;

/* renamed from: b.l.a.c.e.e.me */
public final class C2333me extends C1948a {
    public static final Parcelable.Creator<C2333me> CREATOR = new C2357ne();

    /* renamed from: g */
    public final String f4069g;

    /* renamed from: h */
    public final String f4070h;

    /* renamed from: i */
    public final C3854a f4071i;

    public C2333me(String str, String str2, C3854a aVar) {
        this.f4069g = str;
        this.f4070h = str2;
        this.f4071i = aVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f4069g, false);
        C0823f.m395s0(parcel, 2, this.f4070h, false);
        C0823f.m393r0(parcel, 3, this.f4071i, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
