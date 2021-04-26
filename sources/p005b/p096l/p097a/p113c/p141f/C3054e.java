package p005b.p096l.p097a.p113c.p141f;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.f.e */
public final class C3054e implements Parcelable.Creator<LocationResult> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        List<Location> list = LocationResult.f11331h;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C0823f.m379k0(parcel, readInt);
            } else {
                list = C0823f.m400v(parcel, readInt, Location.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
