package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.ml */
public final class C2340ml implements Parcelable.Creator<C2316ll> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        int i = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C0823f.m367e0(parcel, readInt);
            } else if (i2 != 2) {
                C0823f.m379k0(parcel, readInt);
            } else {
                arrayList = C0823f.m396t(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2316ll(i, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2316ll[i];
    }
}
