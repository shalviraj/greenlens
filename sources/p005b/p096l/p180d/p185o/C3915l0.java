package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.l0 */
public final class C3915l0 implements Parcelable.Creator<C3854a> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = C0823f.m394s(parcel, readInt);
                    break;
                case 2:
                    str2 = C0823f.m394s(parcel, readInt);
                    break;
                case 3:
                    str3 = C0823f.m394s(parcel, readInt);
                    break;
                case 4:
                    str4 = C0823f.m394s(parcel, readInt);
                    break;
                case 5:
                    z = C0823f.m356Y(parcel, readInt);
                    break;
                case 6:
                    str5 = C0823f.m394s(parcel, readInt);
                    break;
                case 7:
                    z2 = C0823f.m356Y(parcel, readInt);
                    break;
                case 8:
                    str6 = C0823f.m394s(parcel, readInt);
                    break;
                case 9:
                    i = C0823f.m367e0(parcel, readInt);
                    break;
                case 10:
                    str7 = C0823f.m394s(parcel, readInt);
                    break;
                default:
                    C0823f.m379k0(parcel, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3854a(str, str2, str3, str4, z, str5, z2, str6, i, str7);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3854a[i];
    }
}
