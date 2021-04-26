package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1950c;

/* renamed from: b.l.d.o.e0.l0 */
public final class C3887l0 implements C1950c {
    public static final Parcelable.Creator<C3887l0> CREATOR = new C3868c();

    /* renamed from: g */
    public final long f7165g;

    /* renamed from: h */
    public final long f7166h;

    public C3887l0(long j, long j2) {
        this.f7165g = j;
        this.f7166h = j2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        long j = this.f7165g;
        C0823f.m333B0(parcel, 1, 8);
        parcel.writeLong(j);
        long j2 = this.f7166h;
        C0823f.m333B0(parcel, 2, 8);
        parcel.writeLong(j2);
        C0823f.m331A0(parcel, w0);
    }
}
