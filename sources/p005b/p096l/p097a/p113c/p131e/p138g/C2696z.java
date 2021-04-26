package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1903c;
import p005b.p096l.p097a.p113c.p141f.C3058i;

/* renamed from: b.l.a.c.e.g.z */
public final class C2696z implements Parcelable.Creator<C2695y> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        C3058i iVar = C2695y.f4591k;
        List<C1903c> list = C2695y.f4590j;
        String str = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                iVar = (C3058i) C0823f.m392r(parcel, readInt, C3058i.CREATOR);
            } else if (i == 2) {
                list = C0823f.m400v(parcel, readInt, C1903c.CREATOR);
            } else if (i != 3) {
                C0823f.m379k0(parcel, readInt);
            } else {
                str = C0823f.m394s(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2695y(iVar, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2695y[i];
    }
}
