package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.ol */
public final class C2388ol implements Parcelable.Creator<C2364nl> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int l0 = C0823f.m381l0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
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
                    str5 = C0823f.m394s(parcel2, readInt);
                    break;
                case 7:
                    str6 = C0823f.m394s(parcel2, readInt);
                    break;
                case 8:
                    str7 = C0823f.m394s(parcel2, readInt);
                    break;
                case 9:
                    str8 = C0823f.m394s(parcel2, readInt);
                    break;
                case 10:
                    z = C0823f.m356Y(parcel2, readInt);
                    break;
                case 11:
                    z2 = C0823f.m356Y(parcel2, readInt);
                    break;
                case 12:
                    str9 = C0823f.m394s(parcel2, readInt);
                    break;
                case 13:
                    str10 = C0823f.m394s(parcel2, readInt);
                    break;
                case 14:
                    str11 = C0823f.m394s(parcel2, readInt);
                    break;
                case 15:
                    str12 = C0823f.m394s(parcel2, readInt);
                    break;
                case 16:
                    z3 = C0823f.m356Y(parcel2, readInt);
                    break;
                case 17:
                    str13 = C0823f.m394s(parcel2, readInt);
                    break;
                default:
                    C0823f.m379k0(parcel2, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel2, l0);
        return new C2364nl(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2364nl[i];
    }
}
