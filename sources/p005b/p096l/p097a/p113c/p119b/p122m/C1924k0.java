package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.IBinder;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p131e.p135d.C2018b;

/* renamed from: b.l.a.c.b.m.k0 */
public final class C1924k0 extends C2018b implements C1921j0 {
    public C1924k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: b */
    public final C1980b mo12255b() {
        Parcel k = mo12336k(1, mo12335g());
        C1980b k2 = C1980b.C1981a.m2899k(k.readStrongBinder());
        k.recycle();
        return k2;
    }

    /* renamed from: c */
    public final int mo12256c() {
        Parcel k = mo12336k(2, mo12335g());
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }
}
