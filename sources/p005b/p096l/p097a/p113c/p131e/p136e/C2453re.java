package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.re */
public final class C2453re implements Parcelable.Creator<C2429qe> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        ArrayList<C2435qk> arrayList = null;
        C3919n0 n0Var = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i == 2) {
                arrayList = C0823f.m400v(parcel, readInt, C2435qk.CREATOR);
            } else if (i != 3) {
                C0823f.m379k0(parcel, readInt);
            } else {
                n0Var = (C3919n0) C0823f.m392r(parcel, readInt, C3919n0.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2429qe(str, arrayList, n0Var);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2429qe[i];
    }
}
