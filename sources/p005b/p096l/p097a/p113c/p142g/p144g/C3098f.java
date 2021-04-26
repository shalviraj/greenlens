package p005b.p096l.p097a.p113c.p142g.p144g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.g.g.f */
public final class C3098f implements Parcelable.Creator<LatLngBounds> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                latLng = (LatLng) C0823f.m392r(parcel, readInt, LatLng.CREATOR);
            } else if (i != 3) {
                C0823f.m379k0(parcel, readInt);
            } else {
                latLng2 = (LatLng) C0823f.m392r(parcel, readInt, LatLng.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
