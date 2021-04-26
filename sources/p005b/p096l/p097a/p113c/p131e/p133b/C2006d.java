package p005b.p096l.p097a.p113c.p131e.p133b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.b.d */
public final class C2006d implements C2007e, IInterface {

    /* renamed from: a */
    public final IBinder f3564a;

    /* renamed from: b */
    public final String f3565b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public C2006d(IBinder iBinder) {
        this.f3564a = iBinder;
    }

    /* renamed from: G */
    public final void mo12327G(C2009g gVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3565b);
        int i = C2005c.f3563a;
        obtain.writeStrongBinder((C2003a) gVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f3564a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f3564a;
    }
}
