package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.ad */
public final class C2035ad extends C1948a {
    public static final Parcelable.Creator<C2035ad> CREATOR = new C2060bd();

    /* renamed from: g */
    public final String f3585g;

    /* renamed from: h */
    public final C2364nl f3586h;

    public C2035ad(String str, C2364nl nlVar) {
        this.f3585g = str;
        this.f3586h = nlVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3585g, false);
        C0823f.m393r0(parcel, 2, this.f3586h, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
