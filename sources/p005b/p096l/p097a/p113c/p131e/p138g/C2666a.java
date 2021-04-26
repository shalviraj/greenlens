package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.g.a */
public class C2666a implements IInterface {

    /* renamed from: a */
    public final IBinder f4552a;

    /* renamed from: b */
    public final String f4553b;

    public C2666a(IBinder iBinder, String str) {
        this.f4552a = iBinder;
        this.f4553b = str;
    }

    public IBinder asBinder() {
        return this.f4552a;
    }

    /* renamed from: g */
    public final Parcel mo13161g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4553b);
        return obtain;
    }

    /* renamed from: k */
    public final void mo13162k(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4552a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
