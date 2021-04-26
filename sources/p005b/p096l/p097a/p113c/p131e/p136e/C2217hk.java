package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.hk */
public final class C2217hk implements Parcelable.Creator<C2192gk> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int l0 = C0823f.m381l0(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C2555vk vkVar = null;
        String str5 = null;
        String str6 = null;
        C3919n0 n0Var = null;
        ArrayList<C2435qk> arrayList = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C0823f.m394s(parcel2, readInt);
                    break;
                case 3:
                    str2 = C0823f.m394s(parcel2, readInt);
                    break;
                case 4:
                    z = C0823f.m356Y(parcel2, readInt);
                    break;
                case 5:
                    str3 = C0823f.m394s(parcel2, readInt);
                    break;
                case 6:
                    str4 = C0823f.m394s(parcel2, readInt);
                    break;
                case 7:
                    vkVar = (C2555vk) C0823f.m392r(parcel2, readInt, C2555vk.CREATOR);
                    break;
                case 8:
                    str5 = C0823f.m394s(parcel2, readInt);
                    break;
                case 9:
                    str6 = C0823f.m394s(parcel2, readInt);
                    break;
                case 10:
                    j = C0823f.m369f0(parcel2, readInt);
                    break;
                case 11:
                    j2 = C0823f.m369f0(parcel2, readInt);
                    break;
                case 12:
                    z2 = C0823f.m356Y(parcel2, readInt);
                    break;
                case 13:
                    n0Var = (C3919n0) C0823f.m392r(parcel2, readInt, C3919n0.CREATOR);
                    break;
                case 14:
                    arrayList = C0823f.m400v(parcel2, readInt, C2435qk.CREATOR);
                    break;
                default:
                    C0823f.m379k0(parcel2, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel2, l0);
        return new C2192gk(str, str2, z, str3, str4, vkVar, str5, str6, j, j2, z2, n0Var, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2192gk[i];
    }
}
