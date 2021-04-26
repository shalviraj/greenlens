package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p131e.p135d.C2018b;
import p005b.p096l.p097a.p113c.p131e.p135d.C2019c;

/* renamed from: b.l.a.c.b.m.l0 */
public final class C1926l0 extends C2018b implements C1933o {
    public C1926l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: k1 */
    public final void mo12228k1(int i, IBinder iBinder, Bundle bundle) {
        Parcel g = mo12335g();
        g.writeInt(i);
        g.writeStrongBinder(iBinder);
        int i2 = C2019c.f3571a;
        g.writeInt(0);
        Parcel obtain = Parcel.obtain();
        try {
            this.f3569a.transact(1, g, obtain, 0);
            obtain.readException();
        } finally {
            g.recycle();
            obtain.recycle();
        }
    }
}
