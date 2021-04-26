package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.bl */
public final class C2068bl implements Parcelable.Creator<C2043al> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int l0 = C0823f.m381l0(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = C0823f.m394s(parcel2, readInt);
                    break;
                case 2:
                    j = C0823f.m369f0(parcel2, readInt);
                    break;
                case 3:
                    z = C0823f.m356Y(parcel2, readInt);
                    break;
                case 4:
                    str2 = C0823f.m394s(parcel2, readInt);
                    break;
                case 5:
                    str3 = C0823f.m394s(parcel2, readInt);
                    break;
                case 6:
                    str4 = C0823f.m394s(parcel2, readInt);
                    break;
                case 7:
                    z2 = C0823f.m356Y(parcel2, readInt);
                    break;
                case 8:
                    str5 = C0823f.m394s(parcel2, readInt);
                    break;
                default:
                    C0823f.m379k0(parcel2, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel2, l0);
        return new C2043al(str, j, z, str2, str3, str4, z2, str5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2043al[i];
    }
}
