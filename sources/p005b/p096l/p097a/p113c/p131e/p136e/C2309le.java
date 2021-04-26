package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3860c0;

/* renamed from: b.l.a.c.e.e.le */
public final class C2309le implements Parcelable.Creator<C2285ke> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        C3860c0 c0Var = null;
        String str = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                c0Var = (C3860c0) C0823f.m392r(parcel, readInt, C3860c0.CREATOR);
            } else if (i != 2) {
                C0823f.m379k0(parcel, readInt);
            } else {
                str = C0823f.m394s(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2285ke(c0Var, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2285ke[i];
    }
}
