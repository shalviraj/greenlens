package p005b.p096l.p097a.p113c.p131e.p135d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.d.b */
public class C2018b implements IInterface {

    /* renamed from: a */
    public final IBinder f3569a;

    /* renamed from: b */
    public final String f3570b;

    public C2018b(IBinder iBinder, String str) {
        this.f3569a = iBinder;
        this.f3570b = str;
    }

    public IBinder asBinder() {
        return this.f3569a;
    }

    /* renamed from: g */
    public final Parcel mo12335g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3570b);
        return obtain;
    }

    /* renamed from: k */
    public final Parcel mo12336k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f3569a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
