package p005b.p096l.p097a.p113c.p141f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.f.d */
public final class C3053d implements Parcelable.Creator<LocationRequest> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int l0 = C0823f.m381l0(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C0823f.m367e0(parcel2, readInt);
                    break;
                case 2:
                    j = C0823f.m369f0(parcel2, readInt);
                    break;
                case 3:
                    j2 = C0823f.m369f0(parcel2, readInt);
                    break;
                case 4:
                    z = C0823f.m356Y(parcel2, readInt);
                    break;
                case 5:
                    j3 = C0823f.m369f0(parcel2, readInt);
                    break;
                case 6:
                    i2 = C0823f.m367e0(parcel2, readInt);
                    break;
                case 7:
                    f = C0823f.m361b0(parcel2, readInt);
                    break;
                case 8:
                    j4 = C0823f.m369f0(parcel2, readInt);
                    break;
                default:
                    C0823f.m379k0(parcel2, readInt);
                    break;
            }
        }
        C0823f.m408z(parcel2, l0);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
