package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.e0.d0 */
public final class C3871d0 implements Parcelable.Creator<C3869c0> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        boolean z = false;
        String str2 = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i == 2) {
                str2 = C0823f.m394s(parcel, readInt);
            } else if (i != 3) {
                C0823f.m379k0(parcel, readInt);
            } else {
                z = C0823f.m356Y(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3869c0(str, str2, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3869c0[i];
    }
}
