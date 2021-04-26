package p005b.p096l.p097a.p113c.p142g.p143f;

import android.os.IBinder;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p131e.p139h.C2697a;
import p005b.p096l.p097a.p113c.p131e.p139h.C2699c;

/* renamed from: b.l.a.c.g.f.j */
public final class C3086j extends C2697a implements C3080d {
    public C3086j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    /* renamed from: X */
    public final void mo14042X(boolean z) {
        Parcel g = mo13198g();
        int i = C2699c.f4597a;
        g.writeInt(z ? 1 : 0);
        mo13200n(8, g);
    }
}
