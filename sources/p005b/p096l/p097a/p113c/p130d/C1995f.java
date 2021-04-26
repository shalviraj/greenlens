package p005b.p096l.p097a.p113c.p130d;

import android.os.IBinder;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p131e.p135d.C2018b;
import p005b.p096l.p097a.p113c.p131e.p135d.C2019c;

/* renamed from: b.l.a.c.d.f */
public final class C1995f extends C2018b implements C1996g {
    public C1995f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: P0 */
    public final int mo12312P0() {
        Parcel k = mo12336k(6, mo12335g());
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: W */
    public final int mo12313W(C1980b bVar, String str, boolean z) {
        Parcel g = mo12335g();
        C2019c.m2942b(g, bVar);
        g.writeString(str);
        g.writeInt(z ? 1 : 0);
        Parcel k = mo12336k(3, g);
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: e0 */
    public final C1980b mo12314e0(C1980b bVar, String str, int i) {
        Parcel g = mo12335g();
        C2019c.m2942b(g, bVar);
        g.writeString(str);
        g.writeInt(i);
        Parcel k = mo12336k(4, g);
        C1980b k2 = C1980b.C1981a.m2899k(k.readStrongBinder());
        k.recycle();
        return k2;
    }

    /* renamed from: q */
    public final int mo12315q(C1980b bVar, String str, boolean z) {
        Parcel g = mo12335g();
        C2019c.m2942b(g, bVar);
        g.writeString(str);
        g.writeInt(z ? 1 : 0);
        Parcel k = mo12336k(5, g);
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: x0 */
    public final C1980b mo12316x0(C1980b bVar, String str, int i) {
        Parcel g = mo12335g();
        C2019c.m2942b(g, bVar);
        g.writeString(str);
        g.writeInt(i);
        Parcel k = mo12336k(2, g);
        C1980b k2 = C1980b.C1981a.m2899k(k.readStrongBinder());
        k.recycle();
        return k2;
    }
}
