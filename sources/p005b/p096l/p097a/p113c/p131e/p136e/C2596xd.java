package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3861d;

/* renamed from: b.l.a.c.e.e.xd */
public final class C2596xd implements Parcelable.Creator<C2572wd> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        C3861d dVar = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C0823f.m379k0(parcel, readInt);
            } else {
                dVar = (C3861d) C0823f.m392r(parcel, readInt, C3861d.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2572wd(dVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2572wd[i];
    }
}
