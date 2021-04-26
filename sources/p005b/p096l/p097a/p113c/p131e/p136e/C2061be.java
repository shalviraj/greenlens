package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.be */
public final class C2061be implements Parcelable.Creator<C2036ae> {
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
        long j = 0;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = C0823f.m394s(parcel2, readInt);
                    break;
                case 2:
                    str2 = C0823f.m394s(parcel2, readInt);
                    break;
                case 3:
                    str3 = C0823f.m394s(parcel2, readInt);
                    break;
                case 4:
                    j = C0823f.m369f0(parcel2, readInt);
                    break;
                case 5:
                    z = C0823f.m356Y(parcel2, readInt);
                    break;
                case 6:
                    z2 = C0823f.m356Y(parcel2, readInt);
                    break;
                case 7:
                    str4 = C0823f.m394s(parcel2, readInt);
                    break;
                case 8:
                    str5 = C0823f.m394s(parcel2, readInt);
                    break;
                case 9:
                    z3 = C0823f.m356Y(parcel2, readInt);
                    break;
                default:
                    C0823f.m379k0(parcel2, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel2, l0);
        return new C2036ae(str, str2, str3, j, z, z2, str4, str5, z3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2036ae[i];
    }
}
