package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.e0.c */
public final class C3868c implements Parcelable.Creator<C3887l0> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                j = C0823f.m369f0(parcel, readInt);
            } else if (i != 2) {
                C0823f.m379k0(parcel, readInt);
            } else {
                j2 = C0823f.m369f0(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3887l0(j, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3887l0[i];
    }
}
