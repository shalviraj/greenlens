package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.w9 */
public final class C3363w9 implements Parcelable.Creator<C3352v9> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int l0 = C0823f.m381l0(parcel);
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = "";
        long j6 = -2147483648L;
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
                    str3 = C0823f.m394s(parcel2, readInt);
                    break;
                case 5:
                    str4 = C0823f.m394s(parcel2, readInt);
                    break;
                case 6:
                    j = C0823f.m369f0(parcel2, readInt);
                    break;
                case 7:
                    j2 = C0823f.m369f0(parcel2, readInt);
                    break;
                case 8:
                    str5 = C0823f.m394s(parcel2, readInt);
                    break;
                case 9:
                    z = C0823f.m356Y(parcel2, readInt);
                    break;
                case 10:
                    z3 = C0823f.m356Y(parcel2, readInt);
                    break;
                case 11:
                    j6 = C0823f.m369f0(parcel2, readInt);
                    break;
                case 12:
                    str6 = C0823f.m394s(parcel2, readInt);
                    break;
                case 13:
                    j3 = C0823f.m369f0(parcel2, readInt);
                    break;
                case 14:
                    j4 = C0823f.m369f0(parcel2, readInt);
                    break;
                case 15:
                    i = C0823f.m367e0(parcel2, readInt);
                    break;
                case 16:
                    z2 = C0823f.m356Y(parcel2, readInt);
                    break;
                case 18:
                    z4 = C0823f.m356Y(parcel2, readInt);
                    break;
                case 19:
                    str7 = C0823f.m394s(parcel2, readInt);
                    break;
                case 21:
                    bool = C0823f.m357Z(parcel2, readInt);
                    break;
                case 22:
                    j5 = C0823f.m369f0(parcel2, readInt);
                    break;
                case 23:
                    arrayList = C0823f.m396t(parcel2, readInt);
                    break;
                case 24:
                    str8 = C0823f.m394s(parcel2, readInt);
                    break;
                case 25:
                    str9 = C0823f.m394s(parcel2, readInt);
                    break;
                default:
                    C0823f.m379k0(parcel2, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel2, l0);
        return new C3352v9(str, str2, str3, str4, j, j2, str5, z, z3, j6, str6, j3, j4, i, z2, z4, str7, bool, j5, (List<String>) arrayList, str8, str9);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3352v9[i];
    }
}
