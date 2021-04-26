package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.i.ac */
public abstract class C2719ac extends C2945s implements C2733bc {
    public C2719ac() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: g */
    public final boolean mo13242g(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ((C3010x) this).mo13254a0(parcel.readString(), parcel.readString(), (Bundle) C2894o0.m5007a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int e = ((C3010x) this).mo13255e();
            parcel2.writeNoException();
            parcel2.writeInt(e);
        }
        return true;
    }
}
