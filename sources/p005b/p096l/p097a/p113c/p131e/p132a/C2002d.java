package p005b.p096l.p097a.p113c.p131e.p132a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.a.d */
public final class C2002d implements C2000b, IInterface {

    /* renamed from: a */
    public final IBinder f3557a;

    /* renamed from: b */
    public final String f3558b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public C2002d(IBinder iBinder) {
        this.f3557a = iBinder;
    }

    public IBinder asBinder() {
        return this.f3557a;
    }

    /* renamed from: c */
    public final boolean mo12319c() {
        Parcel k = mo12324k(6, mo12323g());
        int i = C1999a.f3555a;
        boolean z = k.readInt() != 0;
        k.recycle();
        return z;
    }

    /* renamed from: g */
    public final Parcel mo12323g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3558b);
        return obtain;
    }

    public final String getId() {
        Parcel k = mo12324k(1, mo12323g());
        String readString = k.readString();
        k.recycle();
        return readString;
    }

    /* renamed from: k */
    public final Parcel mo12324k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f3557a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: z0 */
    public final boolean mo12321z0(boolean z) {
        Parcel g = mo12323g();
        int i = C1999a.f3555a;
        boolean z2 = true;
        g.writeInt(1);
        Parcel k = mo12324k(2, g);
        if (k.readInt() == 0) {
            z2 = false;
        }
        k.recycle();
        return z2;
    }
}
