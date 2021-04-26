package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.i.m1 */
public final class C2869m1 extends C2706a implements C2819i3 {
    public C2869m1(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: L0 */
    public final Bundle mo13384L0(Bundle bundle) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, bundle);
        Parcel n = mo13213n(1, g);
        Bundle bundle2 = (Bundle) C2894o0.m5007a(n, Bundle.CREATOR);
        n.recycle();
        return bundle2;
    }
}
