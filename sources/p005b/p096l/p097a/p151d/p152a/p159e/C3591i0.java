package p005b.p096l.p097a.p151d.p152a.p159e;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.l.a.d.a.e.i0 */
public final class C3591i0 {

    /* renamed from: a */
    public static final /* synthetic */ int f6655a = 0;

    static {
        C3591i0.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m6813a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
