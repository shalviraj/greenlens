package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.g.e */
public final class C2674e implements Parcelable.Creator<C2672d> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        Status status = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C0823f.m379k0(parcel, readInt);
            } else {
                status = (Status) C0823f.m392r(parcel, readInt, Status.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C2672d(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2672d[i];
    }
}
