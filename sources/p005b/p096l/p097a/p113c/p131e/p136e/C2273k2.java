package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.e.k2 */
public class C2273k2 extends Binder implements IInterface {
    public C2273k2(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: g */
    public boolean mo12764g(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo12764g(i, parcel, parcel2, i2);
    }
}
