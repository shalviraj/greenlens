package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.l.a.c.e.g.v */
public class C2692v {

    /* renamed from: a */
    public static final /* synthetic */ int f4586a = 0;

    static {
        C2692v.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m4526a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
