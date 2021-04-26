package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.nd */
public final class C2356nd implements Parcelable.Creator<C2332md> {
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
        return new C2332md(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2332md[i];
    }
}
