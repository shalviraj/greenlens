package p005b.p096l.p097a.p113c.p148i.p149b;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1944s;

/* renamed from: b.l.a.c.i.b.i */
public final class C3406i implements Parcelable.Creator<C3407j> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        int i = 0;
        C1944s sVar = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C0823f.m367e0(parcel, readInt);
            } else if (i2 != 2) {
                C0823f.m379k0(parcel, readInt);
            } else {
                sVar = (C1944s) C0823f.m392r(parcel, readInt, C1944s.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3407j(i, sVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3407j[i];
    }
}
