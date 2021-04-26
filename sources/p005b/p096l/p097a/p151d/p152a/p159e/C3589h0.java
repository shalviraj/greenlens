package p005b.p096l.p097a.p151d.p152a.p159e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.d.a.e.h0 */
public class C3589h0 extends Binder implements IInterface {
    public C3589h0(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: g */
    public boolean mo14882g(int i, Parcel parcel) {
        throw null;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo14882g(i, parcel);
    }
}
