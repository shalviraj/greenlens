package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.l.a.c.e.i.o0 */
public final class C2894o0 {

    /* renamed from: a */
    public static final ClassLoader f4920a = C2894o0.class.getClassLoader();

    /* renamed from: a */
    public static <T extends Parcelable> T m5007a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m5008b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m5009c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
