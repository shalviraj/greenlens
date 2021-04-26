package p005b.p096l.p097a.p113c.p130d;

import android.os.IBinder;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p131e.p135d.C2018b;
import p005b.p096l.p097a.p113c.p131e.p135d.C2019c;

/* renamed from: b.l.a.c.d.h */
public final class C1997h extends C2018b implements C1998i {
    public C1997h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: R */
    public final C1980b mo12317R(C1980b bVar, String str, int i, C1980b bVar2) {
        Parcel g = mo12335g();
        C2019c.m2942b(g, bVar);
        g.writeString(str);
        g.writeInt(i);
        C2019c.m2942b(g, bVar2);
        Parcel k = mo12336k(2, g);
        C1980b k2 = C1980b.C1981a.m2899k(k.readStrongBinder());
        k.recycle();
        return k2;
    }

    /* renamed from: U */
    public final C1980b mo12318U(C1980b bVar, String str, int i, C1980b bVar2) {
        Parcel g = mo12335g();
        C2019c.m2942b(g, bVar);
        g.writeString(str);
        g.writeInt(i);
        C2019c.m2942b(g, bVar2);
        Parcel k = mo12336k(3, g);
        C1980b k2 = C1980b.C1981a.m2899k(k.readStrongBinder());
        k.recycle();
        return k2;
    }
}
