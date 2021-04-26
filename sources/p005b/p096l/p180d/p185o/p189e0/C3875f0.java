package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.d.o.e0.f0 */
public final class C3875f0 implements Parcelable.Creator<C3873e0> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        C3883j0 j0Var = null;
        C3869c0 c0Var = null;
        C3919n0 n0Var = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                j0Var = (C3883j0) C0823f.m392r(parcel, readInt, C3883j0.CREATOR);
            } else if (i == 2) {
                c0Var = (C3869c0) C0823f.m392r(parcel, readInt, C3869c0.CREATOR);
            } else if (i != 3) {
                C0823f.m379k0(parcel, readInt);
            } else {
                n0Var = (C3919n0) C0823f.m392r(parcel, readInt, C3919n0.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3873e0(j0Var, c0Var, n0Var);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3873e0[i];
    }
}
