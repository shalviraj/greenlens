package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.IBinder;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p119b.C1753a0;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p131e.p135d.C2018b;
import p005b.p096l.p097a.p113c.p131e.p135d.C2019c;

/* renamed from: b.l.a.c.b.m.o0 */
public final class C1935o0 extends C2018b implements C1932n0 {
    public C1935o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: E0 */
    public final boolean mo12264E0(C1753a0 a0Var, C1980b bVar) {
        Parcel g = mo12335g();
        int i = C2019c.f3571a;
        boolean z = true;
        g.writeInt(1);
        a0Var.writeToParcel(g, 0);
        C2019c.m2942b(g, bVar);
        Parcel k = mo12336k(5, g);
        if (k.readInt() == 0) {
            z = false;
        }
        k.recycle();
        return z;
    }
}
