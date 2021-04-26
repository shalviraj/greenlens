package p005b.p096l.p097a.p113c.p131e.p134c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.l.a.c.e.c.b */
public class C2015b {

    /* renamed from: a */
    public static final /* synthetic */ int f3568a = 0;

    static {
        C2015b.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m2937a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
