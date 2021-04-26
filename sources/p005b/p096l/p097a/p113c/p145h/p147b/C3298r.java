package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.r */
public final class C3298r implements Parcelable.Creator<C3287q> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                C0823f.m379k0(parcel, readInt);
            } else {
                bundle = C0823f.m390q(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3287q(bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3287q[i];
    }
}
