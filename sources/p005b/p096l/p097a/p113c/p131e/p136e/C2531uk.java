package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.uk */
public final class C2531uk implements Parcelable.Creator<C2507tk> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
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
                case 2:
                    str = C0823f.m394s(parcel, readInt);
                    break;
                case 3:
                    str2 = C0823f.m394s(parcel, readInt);
                    break;
                case 4:
                    str3 = C0823f.m394s(parcel, readInt);
                    break;
                case 5:
                    str4 = C0823f.m394s(parcel, readInt);
                    break;
                case 6:
                    str5 = C0823f.m394s(parcel, readInt);
                    break;
                case 7:
                    str6 = C0823f.m394s(parcel, readInt);
                    break;
                case 8:
                    str7 = C0823f.m394s(parcel, readInt);
                    break;
                default:
                    C0823f.m379k0(parcel, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2507tk(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2507tk[i];
    }
}
