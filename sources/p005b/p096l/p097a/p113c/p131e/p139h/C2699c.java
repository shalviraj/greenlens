package p005b.p096l.p097a.p113c.p131e.p139h;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.l.a.c.e.h.c */
public class C2699c {

    /* renamed from: a */
    public static final /* synthetic */ int f4597a = 0;

    static {
        C2699c.class.getClassLoader();
    }

    /* renamed from: a */
    public static void m4538a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: b */
    public static void m4539b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
