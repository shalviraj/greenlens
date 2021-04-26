package p005b.p096l.p097a.p113c.p148i.p149b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p119b.p122m.C1929n;
import p005b.p096l.p097a.p113c.p131e.p134c.C2014a;
import p005b.p096l.p097a.p113c.p131e.p134c.C2015b;

/* renamed from: b.l.a.c.i.b.h */
public final class C3405h implements C3403f, IInterface {

    /* renamed from: a */
    public final IBinder f6171a;

    /* renamed from: b */
    public final String f6172b = "com.google.android.gms.signin.internal.ISignInService";

    public C3405h(IBinder iBinder) {
        this.f6171a = iBinder;
    }

    /* renamed from: G0 */
    public final void mo14658G0(C1929n nVar, int i, boolean z) {
        Parcel g = mo14662g();
        int i2 = C2015b.f3568a;
        g.writeStrongBinder(nVar == null ? null : nVar.asBinder());
        g.writeInt(i);
        g.writeInt(z ? 1 : 0);
        mo14663k(9, g);
    }

    /* renamed from: T */
    public final void mo14659T(int i) {
        Parcel g = mo14662g();
        g.writeInt(i);
        mo14663k(7, g);
    }

    /* renamed from: U0 */
    public final void mo14660U0(C3407j jVar, C3401d dVar) {
        Parcel g = mo14662g();
        int i = C2015b.f3568a;
        g.writeInt(1);
        jVar.writeToParcel(g, 0);
        g.writeStrongBinder((C2014a) dVar);
        mo14663k(12, g);
    }

    public IBinder asBinder() {
        return this.f6171a;
    }

    /* renamed from: g */
    public final Parcel mo14662g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6172b);
        return obtain;
    }

    /* renamed from: k */
    public final void mo14663k(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6171a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
