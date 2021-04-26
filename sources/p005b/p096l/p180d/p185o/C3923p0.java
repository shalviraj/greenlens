package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.p0 */
public final class C3923p0 implements Parcelable.Creator<C3861d> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i == 2) {
                str2 = C0823f.m394s(parcel, readInt);
            } else if (i == 3) {
                str3 = C0823f.m394s(parcel, readInt);
            } else if (i == 4) {
                str4 = C0823f.m394s(parcel, readInt);
            } else if (i != 5) {
                C0823f.m379k0(parcel, readInt);
            } else {
                z = C0823f.m356Y(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3861d(str, str2, str3, str4, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3861d[i];
    }
}
