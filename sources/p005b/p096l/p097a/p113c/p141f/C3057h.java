package p005b.p096l.p097a.p113c.p141f;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.f.h */
public final class C3057h implements Parcelable.Creator<C3056g> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = C0823f.m367e0(parcel, readInt);
            } else if (i3 == 2) {
                i2 = C0823f.m367e0(parcel, readInt);
            } else if (i3 == 3) {
                j = C0823f.m369f0(parcel, readInt);
            } else if (i3 != 4) {
                C0823f.m379k0(parcel, readInt);
            } else {
                j2 = C0823f.m369f0(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3056g(i, i2, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3056g[i];
    }
}
