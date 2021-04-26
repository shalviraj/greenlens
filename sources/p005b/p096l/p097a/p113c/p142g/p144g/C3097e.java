package p005b.p096l.p097a.p113c.p142g.p144g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.g.g.e */
public final class C3097e implements Parcelable.Creator<CameraPosition> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        LatLng latLng = null;
        float f3 = 0.0f;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                latLng = (LatLng) C0823f.m392r(parcel, readInt, LatLng.CREATOR);
            } else if (i == 3) {
                f = C0823f.m361b0(parcel, readInt);
            } else if (i == 4) {
                f3 = C0823f.m361b0(parcel, readInt);
            } else if (i != 5) {
                C0823f.m379k0(parcel, readInt);
            } else {
                f2 = C0823f.m361b0(parcel, readInt);
            }
        }
        C0823f.m408z(parcel, l0);
        return new CameraPosition(latLng, f, f3, f2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
