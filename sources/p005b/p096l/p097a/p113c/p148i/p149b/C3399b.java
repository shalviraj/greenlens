package p005b.p096l.p097a.p113c.p148i.p149b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.i.b.b */
public final class C3399b implements Parcelable.Creator<C3400c> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = C0823f.m367e0(parcel, readInt);
            } else if (i3 == 2) {
                i2 = C0823f.m367e0(parcel, readInt);
            } else if (i3 != 3) {
                C0823f.m379k0(parcel, readInt);
            } else {
                intent = (Intent) C0823f.m392r(parcel, readInt, Intent.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C3400c(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3400c[i];
    }
}
