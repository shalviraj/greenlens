package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.pe */
public final class C2405pe implements Parcelable.Creator<C2381oe> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        Status status = null;
        C3919n0 n0Var = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                status = (Status) C0823f.m392r(parcel, readInt, Status.CREATOR);
            } else if (i == 2) {
                n0Var = (C3919n0) C0823f.m392r(parcel, readInt, C3919n0.CREATOR);
            } else if (i == 3) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i != 4) {
                C0823f.m379k0(parcel, readInt);
            } else {
                str2 = C0823f.m394s(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2381oe(status, n0Var, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C2381oe[i];
    }
}
