package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.g.q */
public class C2687q extends Binder implements IInterface {
    public C2687q(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    /* renamed from: g */
    public boolean mo13171g(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo13171g(i, parcel, parcel2, i2);
    }
}
