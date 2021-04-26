package p005b.p096l.p097a.p113c.p142g.p144g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.g.g.g */
public final class C3099g implements Parcelable.Creator<LatLng> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        double d = ShadowDrawableWrapper.COS_45;
        double d2 = 0.0d;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                C0823f.m405x0(parcel, readInt, 8);
                d = parcel.readDouble();
            } else if (i != 3) {
                C0823f.m379k0(parcel, readInt);
            } else {
                C0823f.m405x0(parcel, readInt, 8);
                d2 = parcel.readDouble();
            }
        }
        C0823f.m408z(parcel, l0);
        return new LatLng(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
