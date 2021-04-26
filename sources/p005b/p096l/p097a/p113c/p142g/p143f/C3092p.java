package p005b.p096l.p097a.p113c.p142g.p143f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p131e.p139h.C2697a;
import p005b.p096l.p097a.p113c.p131e.p139h.C2699c;

/* renamed from: b.l.a.c.g.f.p */
public final class C3092p extends C2697a implements C3079c {
    public C3092p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    /* renamed from: g1 */
    public final void mo14038g1(Bundle bundle) {
        Parcel g = mo13198g();
        C2699c.m4539b(g, bundle);
        mo13200n(2, g);
    }

    /* renamed from: n0 */
    public final C1980b mo14039n0() {
        Parcel k = mo13199k(8, mo13198g());
        C1980b k2 = C1980b.C1981a.m2899k(k.readStrongBinder());
        k.recycle();
        return k2;
    }

    public final void onResume() {
        mo13200n(3, mo13198g());
    }

    /* renamed from: u0 */
    public final void mo14041u0(C3081e eVar) {
        Parcel g = mo13198g();
        C2699c.m4538a(g, eVar);
        mo13200n(9, g);
    }
}
