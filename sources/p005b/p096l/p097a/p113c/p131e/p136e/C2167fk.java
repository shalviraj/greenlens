package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.fk */
public final class C2167fk implements Parcelable.Creator<C2142ek> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        C2242ik ikVar = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                C0823f.m379k0(parcel, readInt);
            } else {
                ikVar = (C2242ik) C0823f.m392r(parcel, readInt, C2242ik.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2142ek(ikVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2142ek[i];
    }
}
