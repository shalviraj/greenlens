package p005b.p096l.p097a.p113c.p119b;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.b.s */
public final class C1970s implements Parcelable.Creator<C1758d> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i2 == 2) {
                i = C0823f.m367e0(parcel, readInt);
            } else if (i2 != 3) {
                C0823f.m379k0(parcel, readInt);
            } else {
                j = C0823f.m369f0(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C1758d(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1758d[i];
    }
}
