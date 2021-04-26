package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.i.a */
public class C2706a implements IInterface {

    /* renamed from: a */
    public final IBinder f4599a;

    /* renamed from: b */
    public final String f4600b;

    public C2706a(IBinder iBinder, String str) {
        this.f4599a = iBinder;
        this.f4600b = str;
    }

    public final IBinder asBinder() {
        return this.f4599a;
    }

    /* renamed from: g */
    public final Parcel mo13211g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4600b);
        return obtain;
    }

    /* renamed from: k */
    public final void mo13212k(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4599a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: n */
    public final Parcel mo13213n(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f4599a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
