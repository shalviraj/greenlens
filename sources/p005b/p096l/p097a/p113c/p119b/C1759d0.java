package p005b.p096l.p097a.p113c.p119b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.b.d0 */
public final class C1759d0 implements Parcelable.Creator<C1753a0> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i == 2) {
                iBinder = C0823f.m365d0(parcel, readInt);
            } else if (i == 3) {
                z = C0823f.m356Y(parcel, readInt);
            } else if (i != 4) {
                C0823f.m379k0(parcel, readInt);
            } else {
                z2 = C0823f.m356Y(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C1753a0(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1753a0[i];
    }
}
