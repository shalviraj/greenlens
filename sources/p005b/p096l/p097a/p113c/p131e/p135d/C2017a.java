package p005b.p096l.p097a.p113c.p131e.p135d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.d.a */
public class C2017a extends Binder implements IInterface {
    public C2017a(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    /* renamed from: g */
    public boolean mo12265g(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
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
        return mo12265g(i, parcel, parcel2, i2);
    }
}
