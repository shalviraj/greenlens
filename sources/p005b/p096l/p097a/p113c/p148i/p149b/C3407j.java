package p005b.p096l.p097a.p113c.p148i.p149b;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1944s;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.i.b.j */
public final class C3407j extends C1948a {
    public static final Parcelable.Creator<C3407j> CREATOR = new C3406i();

    /* renamed from: g */
    public final int f6173g;

    /* renamed from: h */
    public final C1944s f6174h;

    public C3407j(int i, C1944s sVar) {
        this.f6173g = i;
        this.f6174h = sVar;
    }

    public C3407j(C1944s sVar) {
        this.f6173g = 1;
        this.f6174h = sVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f6173g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m393r0(parcel, 2, this.f6174h, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
