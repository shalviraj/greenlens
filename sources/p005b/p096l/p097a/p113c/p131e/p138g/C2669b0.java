package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.g.b0 */
public final class C2669b0 implements Parcelable.Creator<C2667a0> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        C2695y yVar = null;
        int i = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C0823f.m367e0(parcel, readInt);
            } else if (i2 == 2) {
                yVar = (C2695y) C0823f.m392r(parcel, readInt, C2695y.CREATOR);
            } else if (i2 == 3) {
                iBinder = C0823f.m365d0(parcel, readInt);
            } else if (i2 != 4) {
                C0823f.m379k0(parcel, readInt);
            } else {
                iBinder2 = C0823f.m365d0(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2667a0(i, yVar, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2667a0[i];
    }
}
