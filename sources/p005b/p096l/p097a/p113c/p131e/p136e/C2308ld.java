package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.ld */
public final class C2308ld implements Parcelable.Creator<C2284kd> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        C2043al alVar = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C0823f.m379k0(parcel, readInt);
            } else {
                alVar = (C2043al) C0823f.m392r(parcel, readInt, C2043al.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2284kd(alVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2284kd[i];
    }
}
