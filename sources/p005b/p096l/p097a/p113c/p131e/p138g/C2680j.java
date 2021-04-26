package p005b.p096l.p097a.p113c.p131e.p138g;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.g.j */
public final class C2680j extends C2666a implements C2679i {
    public C2680j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: d */
    public final Location mo13172d(String str) {
        Parcel g = mo13161g();
        g.writeString(str);
        g = Parcel.obtain();
        try {
            this.f4552a.transact(21, g, g, 0);
            g.readException();
            g.recycle();
            return (Location) C2692v.m4526a(g, Location.CREATOR);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            g.recycle();
        }
    }

    /* renamed from: d1 */
    public final void mo13173d1(C2667a0 a0Var) {
        Parcel g = mo13161g();
        int i = C2692v.f4586a;
        g.writeInt(1);
        a0Var.writeToParcel(g, 0);
        mo13162k(75, g);
    }

    /* renamed from: h0 */
    public final void mo13174h0(boolean z) {
        Parcel g = mo13161g();
        int i = C2692v.f4586a;
        g.writeInt(z ? 1 : 0);
        mo13162k(12, g);
    }

    /* renamed from: p0 */
    public final void mo13175p0(C2690t tVar) {
        Parcel g = mo13161g();
        int i = C2692v.f4586a;
        g.writeInt(1);
        tVar.writeToParcel(g, 0);
        mo13162k(59, g);
    }
}
