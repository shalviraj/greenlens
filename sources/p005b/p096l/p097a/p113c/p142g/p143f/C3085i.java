package p005b.p096l.p097a.p113c.p142g.p143f;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p131e.p139h.C2697a;
import p005b.p096l.p097a.p113c.p131e.p139h.C2699c;

/* renamed from: b.l.a.c.g.f.i */
public final class C3085i extends C2697a implements C3077a {
    public C3085i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    /* renamed from: M0 */
    public final C1980b mo14031M0(LatLng latLng, float f) {
        Parcel g = mo13198g();
        C2699c.m4539b(g, latLng);
        g.writeFloat(f);
        Parcel k = mo13199k(9, g);
        C1980b k2 = C1980b.C1981a.m2899k(k.readStrongBinder());
        k.recycle();
        return k2;
    }

    /* renamed from: v */
    public final C1980b mo14032v(LatLngBounds latLngBounds, int i) {
        Parcel g = mo13198g();
        C2699c.m4539b(g, latLngBounds);
        g.writeInt(i);
        Parcel k = mo13199k(10, g);
        C1980b k2 = C1980b.C1981a.m2899k(k.readStrongBinder());
        k.recycle();
        return k2;
    }
}
