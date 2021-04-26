package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.q0 */
public final class C3925q0 implements Parcelable.Creator<C3863e> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C0823f.m379k0(parcel, readInt);
            } else {
                str = C0823f.m394s(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3863e(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C3863e[i];
    }
}
