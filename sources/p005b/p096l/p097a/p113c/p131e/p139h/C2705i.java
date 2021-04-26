package p005b.p096l.p097a.p113c.p131e.p139h;

import android.os.IBinder;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p129c.C1980b;

/* renamed from: b.l.a.c.e.h.i */
public final class C2705i extends C2697a implements C2703g {
    public C2705i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* renamed from: P */
    public final boolean mo13205P(C2703g gVar) {
        Parcel g = mo13198g();
        C2699c.m4538a(g, gVar);
        Parcel k = mo13199k(16, g);
        boolean z = k.readInt() != 0;
        k.recycle();
        return z;
    }

    /* renamed from: V */
    public final void mo13206V(C1980b bVar) {
        Parcel g = mo13198g();
        C2699c.m4538a(g, bVar);
        mo13200n(29, g);
    }

    /* renamed from: V0 */
    public final void mo13207V0(C1980b bVar) {
        Parcel g = mo13198g();
        C2699c.m4538a(g, bVar);
        mo13200n(18, g);
    }

    /* renamed from: h */
    public final int mo13208h() {
        Parcel k = mo13199k(17, mo13198g());
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: j */
    public final C1980b mo13209j() {
        Parcel k = mo13199k(30, mo13198g());
        C1980b k2 = C1980b.C1981a.m2899k(k.readStrongBinder());
        k.recycle();
        return k2;
    }
}
