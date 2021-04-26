package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.bd */
public final class C2060bd implements Parcelable.Creator<C2035ad> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        C2364nl nlVar = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i != 2) {
                C0823f.m379k0(parcel, readInt);
            } else {
                nlVar = (C2364nl) C0823f.m392r(parcel, readInt, C2364nl.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2035ad(str, nlVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2035ad[i];
    }
}
