package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.e.a */
public class C2021a implements IInterface {

    /* renamed from: a */
    public final IBinder f3572a;

    /* renamed from: b */
    public final String f3573b;

    public C2021a(IBinder iBinder, String str) {
        this.f3572a = iBinder;
        this.f3573b = str;
    }

    public final IBinder asBinder() {
        return this.f3572a;
    }

    /* renamed from: g */
    public final void mo12339g(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3572a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: k */
    public final void mo12340k(int i, Parcel parcel) {
        try {
            this.f3572a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: n */
    public final Parcel mo12341n() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3573b);
        return obtain;
    }
}
