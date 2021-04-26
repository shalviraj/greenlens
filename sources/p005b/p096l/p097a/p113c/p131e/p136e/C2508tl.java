package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.tl */
public final class C2508tl implements Parcelable.Creator<C2460rl> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i == 3) {
                str2 = C0823f.m394s(parcel, readInt);
            } else if (i == 4) {
                j = C0823f.m369f0(parcel, readInt);
            } else if (i != 5) {
                C0823f.m379k0(parcel, readInt);
            } else {
                z = C0823f.m356Y(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2460rl(str, str2, j, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2460rl[i];
    }
}
