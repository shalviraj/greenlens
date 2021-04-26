package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.fc */
public final class C2159fc extends C1948a {
    public static final Parcelable.Creator<C2159fc> CREATOR = new C2184gc();

    /* renamed from: g */
    public final String f3854g;

    /* renamed from: h */
    public final String f3855h;

    public C2159fc(String str, String str2) {
        this.f3854g = str;
        this.f3855h = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3854g, false);
        C0823f.m395s0(parcel, 2, this.f3855h, false);
        C0823f.m331A0(parcel, w0);
    }
}
