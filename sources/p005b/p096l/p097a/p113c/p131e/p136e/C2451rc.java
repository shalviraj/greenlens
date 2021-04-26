package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.rc */
public final class C2451rc implements Parcelable.Creator<C2427qc> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        C3938x xVar = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                xVar = (C3938x) C0823f.m392r(parcel, readInt, C3938x.CREATOR);
            } else if (i == 2) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i != 3) {
                C0823f.m379k0(parcel, readInt);
            } else {
                str2 = C0823f.m394s(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2427qc(xVar, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2427qc[i];
    }
}
