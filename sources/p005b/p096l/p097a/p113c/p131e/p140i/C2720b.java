package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.i.b */
public final class C2720b implements Parcelable.Creator<C2775ec> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int l0 = C0823f.m381l0(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    j = C0823f.m369f0(parcel2, readInt);
                    break;
                case 2:
                    j2 = C0823f.m369f0(parcel2, readInt);
                    break;
                case 3:
                    z = C0823f.m356Y(parcel2, readInt);
                    break;
                case 4:
                    str = C0823f.m394s(parcel2, readInt);
                    break;
                case 5:
                    str2 = C0823f.m394s(parcel2, readInt);
                    break;
                case 6:
                    str3 = C0823f.m394s(parcel2, readInt);
                    break;
                case 7:
                    bundle = C0823f.m390q(parcel2, readInt);
                    break;
                case 8:
                    str4 = C0823f.m394s(parcel2, readInt);
                    break;
                default:
                    C0823f.m379k0(parcel2, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel2, l0);
        return new C2775ec(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2775ec[i];
    }
}
