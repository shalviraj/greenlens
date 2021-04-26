package p005b.p096l.p097a.p151d.p152a.p159e;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: b.l.a.d.a.e.m0 */
public abstract class C3599m0 extends C3589h0 implements C3601n0 {
    public C3599m0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* renamed from: g */
    public final boolean mo14882g(int i, Parcel parcel) {
        if (i == 2) {
            mo14739X0((Bundle) C3591i0.m6813a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo14740y0((Bundle) C3591i0.m6813a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
