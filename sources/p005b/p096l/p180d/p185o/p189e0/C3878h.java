package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3940y;

/* renamed from: b.l.d.o.e0.h */
public final class C3878h implements Parcelable.Creator<C3876g> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        String str2 = null;
        ArrayList<C3940y> arrayList = null;
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
                arrayList = C0823f.m400v(parcel, readInt, C3940y.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3876g(str, str2, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3876g[i];
    }
}
