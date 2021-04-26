package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

@Deprecated
/* renamed from: b.l.a.c.b.m.s0 */
public final class C1945s0 extends C1948a {
    public static final Parcelable.Creator<C1945s0> CREATOR = new C1943r0();

    /* renamed from: g */
    public final int f3490g;

    public C1945s0(int i) {
        this.f3490g = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f3490g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m331A0(parcel, w0);
    }
}
