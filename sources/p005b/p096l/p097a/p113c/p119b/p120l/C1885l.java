package p005b.p096l.p097a.p113c.p119b.p120l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.b.l.l */
public final class C1885l implements Parcelable.Creator<Scope> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = C0823f.m367e0(parcel, readInt);
            } else if (i2 != 2) {
                C0823f.m379k0(parcel, readInt);
            } else {
                str = C0823f.m394s(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new Scope(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
