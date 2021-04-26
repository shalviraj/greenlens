package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p131e.p136e.C2363nk;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.d.o.e0.k0 */
public final class C3885k0 implements Parcelable.Creator<C3883j0> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int l0 = C0823f.m381l0(parcel);
        C2363nk nkVar = null;
        C3877g0 g0Var = null;
        String str = null;
        String str2 = null;
        ArrayList<C3877g0> arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        C3887l0 l0Var = null;
        C3919n0 n0Var = null;
        C3891p pVar = null;
        boolean z = false;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    nkVar = (C2363nk) C0823f.m392r(parcel2, readInt, C2363nk.CREATOR);
                    break;
                case 2:
                    g0Var = (C3877g0) C0823f.m392r(parcel2, readInt, C3877g0.CREATOR);
                    break;
                case 3:
                    str = C0823f.m394s(parcel2, readInt);
                    break;
                case 4:
                    str2 = C0823f.m394s(parcel2, readInt);
                    break;
                case 5:
                    arrayList = C0823f.m400v(parcel2, readInt, C3877g0.CREATOR);
                    break;
                case 6:
                    arrayList2 = C0823f.m396t(parcel2, readInt);
                    break;
                case 7:
                    str3 = C0823f.m394s(parcel2, readInt);
                    break;
                case 8:
                    bool = C0823f.m357Z(parcel2, readInt);
                    break;
                case 9:
                    l0Var = (C3887l0) C0823f.m392r(parcel2, readInt, C3887l0.CREATOR);
                    break;
                case 10:
                    z = C0823f.m356Y(parcel2, readInt);
                    break;
                case 11:
                    n0Var = (C3919n0) C0823f.m392r(parcel2, readInt, C3919n0.CREATOR);
                    break;
                case 12:
                    pVar = (C3891p) C0823f.m392r(parcel2, readInt, C3891p.CREATOR);
                    break;
                default:
                    C0823f.m379k0(parcel2, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel2, l0);
        return new C3883j0(nkVar, g0Var, str, str2, arrayList, arrayList2, str3, bool, l0Var, z, n0Var, pVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3883j0[i];
    }
}
