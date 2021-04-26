package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.b.m.r0 */
public final class C1943r0 implements Parcelable.Creator<C1945s0> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        int i = 0;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C0823f.m379k0(parcel, readInt);
            } else {
                i = C0823f.m367e0(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C1945s0(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1945s0[i];
    }
}
