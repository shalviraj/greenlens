package p005b.p096l.p097a.p113c.p131e.p139h;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.h.a */
public class C2697a implements IInterface {

    /* renamed from: a */
    public final IBinder f4595a;

    /* renamed from: b */
    public final String f4596b;

    public C2697a(IBinder iBinder, String str) {
        this.f4595a = iBinder;
        this.f4596b = str;
    }

    public IBinder asBinder() {
        return this.f4595a;
    }

    /* renamed from: g */
    public final Parcel mo13198g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4596b);
        return obtain;
    }

    /* renamed from: k */
    public final Parcel mo13199k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f4595a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: n */
    public final void mo13200n(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4595a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
