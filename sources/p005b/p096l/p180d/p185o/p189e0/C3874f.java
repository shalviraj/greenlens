package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3919n0;
import p005b.p096l.p180d.p185o.C3940y;

/* renamed from: b.l.d.o.e0.f */
public final class C3874f implements Parcelable.Creator<C3872e> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        ArrayList<C3940y> arrayList = null;
        C3876g gVar = null;
        String str = null;
        C3919n0 n0Var = null;
        C3883j0 j0Var = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                arrayList = C0823f.m400v(parcel, readInt, C3940y.CREATOR);
            } else if (i == 2) {
                gVar = (C3876g) C0823f.m392r(parcel, readInt, C3876g.CREATOR);
            } else if (i == 3) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i == 4) {
                n0Var = (C3919n0) C0823f.m392r(parcel, readInt, C3919n0.CREATOR);
            } else if (i != 5) {
                C0823f.m379k0(parcel, readInt);
            } else {
                j0Var = (C3883j0) C0823f.m392r(parcel, readInt, C3883j0.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3872e(arrayList, gVar, str, n0Var, j0Var);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3872e[i];
    }
}
