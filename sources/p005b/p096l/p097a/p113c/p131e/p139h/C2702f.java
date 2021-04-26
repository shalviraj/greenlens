package p005b.p096l.p097a.p113c.p131e.p139h;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p129c.C1980b;

/* renamed from: b.l.a.c.e.h.f */
public final class C2702f extends C2697a implements C2700d {
    public C2702f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    /* renamed from: S0 */
    public final C1980b mo13204S0(Bitmap bitmap) {
        Parcel g = mo13198g();
        C2699c.m4539b(g, bitmap);
        Parcel k = mo13199k(6, g);
        C1980b k2 = C1980b.C1981a.m2899k(k.readStrongBinder());
        k.recycle();
        return k2;
    }
}
