package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.k0 */
public final class C3913k0 implements Parcelable.Creator<C3860c0> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i == 3) {
                str2 = C0823f.m394s(parcel, readInt);
            } else if (i == 4) {
                z = C0823f.m356Y(parcel, readInt);
            } else if (i != 5) {
                C0823f.m379k0(parcel, readInt);
            } else {
                z2 = C0823f.m356Y(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3860c0(str, str2, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3860c0[i];
    }
}
