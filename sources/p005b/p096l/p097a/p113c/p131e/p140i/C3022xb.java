package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.i.xb */
public abstract class C3022xb extends C2945s implements C3035yb {
    public C3022xb() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: g */
    public final boolean mo13242g(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ((C2930qa) this).mo13602Y((Bundle) C2894o0.m5007a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
