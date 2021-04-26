package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.jk */
public final class C2267jk implements Parcelable.Creator<C2242ik> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        ArrayList<C2192gk> arrayList = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                C0823f.m379k0(parcel, readInt);
            } else {
                arrayList = C0823f.m400v(parcel, readInt, C2192gk.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2242ik(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2242ik[i];
    }
}
