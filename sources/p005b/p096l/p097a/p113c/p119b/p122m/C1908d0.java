package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1758d;

/* renamed from: b.l.a.c.b.m.d0 */
public final class C1908d0 implements Parcelable.Creator<C1904c0> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        Bundle bundle = null;
        int i = 0;
        C1758d[] dVarArr = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                bundle = C0823f.m390q(parcel, readInt);
            } else if (i2 == 2) {
                dVarArr = (C1758d[]) C0823f.m398u(parcel, readInt, C1758d.CREATOR);
            } else if (i2 != 3) {
                C0823f.m379k0(parcel, readInt);
            } else {
                i = C0823f.m367e0(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C1904c0(bundle, dVarArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1904c0[i];
    }
}
