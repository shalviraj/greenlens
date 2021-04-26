package p005b.p096l.p097a.p113c.p141f;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.f.j */
public final class C3059j implements Parcelable.Creator<C3058i> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int l0 = C0823f.m381l0(parcel);
        boolean z = true;
        long j = 50;
        float f = 0.0f;
        long j2 = Long.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                z = C0823f.m356Y(parcel2, readInt);
            } else if (i2 == 2) {
                j = C0823f.m369f0(parcel2, readInt);
            } else if (i2 == 3) {
                f = C0823f.m361b0(parcel2, readInt);
            } else if (i2 == 4) {
                j2 = C0823f.m369f0(parcel2, readInt);
            } else if (i2 != 5) {
                C0823f.m379k0(parcel2, readInt);
            } else {
                i = C0823f.m367e0(parcel2, readInt);
            }
        }
        C0823f.m408z(parcel2, l0);
        return new C3058i(z, j, f, j2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3058i[i];
    }
}
