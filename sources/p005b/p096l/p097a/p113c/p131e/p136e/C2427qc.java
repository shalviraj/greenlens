package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.qc */
public final class C2427qc extends C1948a {
    public static final Parcelable.Creator<C2427qc> CREATOR = new C2451rc();

    /* renamed from: g */
    public final C3938x f4228g;

    /* renamed from: h */
    public final String f4229h;

    /* renamed from: i */
    public final String f4230i;

    public C2427qc(C3938x xVar, String str, String str2) {
        this.f4228g = xVar;
        this.f4229h = str;
        this.f4230i = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f4228g, i, false);
        C0823f.m395s0(parcel, 2, this.f4229h, false);
        C0823f.m395s0(parcel, 3, this.f4230i, false);
        C0823f.m331A0(parcel, w0);
    }
}
