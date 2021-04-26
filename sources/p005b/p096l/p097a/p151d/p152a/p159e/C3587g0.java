package p005b.p096l.p097a.p151d.p152a.p159e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.d.a.e.g0 */
public class C3587g0 implements IInterface {

    /* renamed from: a */
    public final IBinder f6650a;

    /* renamed from: b */
    public final String f6651b;

    public C3587g0(IBinder iBinder, String str) {
        this.f6650a = iBinder;
        this.f6651b = str;
    }

    public final IBinder asBinder() {
        return this.f6650a;
    }

    /* renamed from: g */
    public final Parcel mo14887g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6651b);
        return obtain;
    }

    /* renamed from: k */
    public final void mo14888k(int i, Parcel parcel) {
        try {
            this.f6650a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
