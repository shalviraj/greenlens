package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3861d;

/* renamed from: b.l.a.c.e.e.wd */
public final class C2572wd extends C1948a {
    public static final Parcelable.Creator<C2572wd> CREATOR = new C2596xd();

    /* renamed from: g */
    public final C3861d f4398g;

    public C2572wd(C3861d dVar) {
        this.f4398g = dVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f4398g, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
