package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.i.s */
public class C2945s extends Binder implements IInterface {
    public C2945s(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    /* renamed from: g */
    public boolean mo13242g(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo13242g(i, parcel, parcel2, i2);
    }
}
