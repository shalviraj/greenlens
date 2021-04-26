package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.g0 */
public final class C3905g0 implements Parcelable.Creator<C3938x> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                    z = C0823f.m356Y(parcel, readInt);
                    break;
                case 4:
                    str3 = C0823f.m394s(parcel, readInt);
                    break;
                case 5:
                    z2 = C0823f.m356Y(parcel, readInt);
                    break;
                case 6:
                    str4 = C0823f.m394s(parcel, readInt);
                    break;
                case 7:
                    str5 = C0823f.m394s(parcel, readInt);
                    break;
                default:
                    C0823f.m379k0(parcel, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3938x(str, str2, z, str3, z2, str4, str5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3938x[i];
    }
}
