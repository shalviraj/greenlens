package p005b.p096l.p097a.p151d.p152a.p159e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b.l.a.d.a.e.u0 */
public final class C3615u0 extends C3587g0 implements C3617v0 {
    public C3615u0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    /* renamed from: F */
    public final void mo14909F(Bundle bundle, Bundle bundle2) {
        Parcel g = mo14887g();
        int i = C3591i0.f6655a;
        g.writeInt(1);
        bundle.writeToParcel(g, 0);
        g.writeInt(1);
        bundle2.writeToParcel(g, 0);
        mo14888k(2, g);
    }

    /* renamed from: J */
    public final void mo14910J(Bundle bundle) {
        Parcel g = mo14887g();
        int i = C3591i0.f6655a;
        g.writeInt(1);
        bundle.writeToParcel(g, 0);
        mo14888k(4, g);
    }

    /* renamed from: k0 */
    public final void mo14911k0(Bundle bundle) {
        Parcel g = mo14887g();
        int i = C3591i0.f6655a;
        g.writeInt(1);
        bundle.writeToParcel(g, 0);
        mo14888k(3, g);
    }
}
