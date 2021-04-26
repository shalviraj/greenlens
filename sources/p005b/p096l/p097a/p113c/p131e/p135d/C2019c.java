package p005b.p096l.p097a.p113c.p131e.p135d;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.l.a.c.e.d.c */
public class C2019c {

    /* renamed from: a */
    public static final /* synthetic */ int f3571a = 0;

    static {
        C2019c.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m2941a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m2942b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
