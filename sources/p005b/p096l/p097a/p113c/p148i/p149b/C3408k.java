package p005b.p096l.p097a.p113c.p148i.p149b;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p122m.C1946t;

/* renamed from: b.l.a.c.i.b.k */
public final class C3408k implements Parcelable.Creator<C3409l> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        C1754b bVar = null;
        int i = 0;
        C1946t tVar = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C0823f.m367e0(parcel, readInt);
            } else if (i2 == 2) {
                bVar = (C1754b) C0823f.m392r(parcel, readInt, C1754b.CREATOR);
            } else if (i2 != 3) {
                C0823f.m379k0(parcel, readInt);
            } else {
                tVar = (C1946t) C0823f.m392r(parcel, readInt, C1946t.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3409l(i, bVar, tVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3409l[i];
    }
}
