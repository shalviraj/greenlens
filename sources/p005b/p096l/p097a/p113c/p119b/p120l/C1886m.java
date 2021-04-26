package p005b.p096l.p097a.p113c.p119b.p120l;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.b.l.m */
public final class C1886m implements Parcelable.Creator<Status> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = C0823f.m367e0(parcel, readInt);
            } else if (i3 == 2) {
                str = C0823f.m394s(parcel, readInt);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) C0823f.m392r(parcel, readInt, PendingIntent.CREATOR);
            } else if (i3 != 1000) {
                C0823f.m379k0(parcel, readInt);
            } else {
                i = C0823f.m367e0(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
