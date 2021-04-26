package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.tc */
public final class C2499tc implements Parcelable.Creator<C2475sc> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        C3938x xVar = null;
        String str = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                xVar = (C3938x) C0823f.m392r(parcel, readInt, C3938x.CREATOR);
            } else if (i != 2) {
                C0823f.m379k0(parcel, readInt);
            } else {
                str = C0823f.m394s(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2475sc(xVar, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2475sc[i];
    }
}
