package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3860c0;

/* renamed from: b.l.a.c.e.e.ke */
public final class C2285ke extends C1948a {
    public static final Parcelable.Creator<C2285ke> CREATOR = new C2309le();

    /* renamed from: g */
    public final C3860c0 f4013g;

    /* renamed from: h */
    public final String f4014h;

    public C2285ke(C3860c0 c0Var, String str) {
        this.f4013g = c0Var;
        this.f4014h = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f4013g, i, false);
        C0823f.m395s0(parcel, 2, this.f4014h, false);
        C0823f.m331A0(parcel, w0);
    }
}
