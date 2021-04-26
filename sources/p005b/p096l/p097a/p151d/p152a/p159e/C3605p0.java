package p005b.p096l.p097a.p151d.p152a.p159e;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b.l.a.d.a.e.p0 */
public abstract class C3605p0 extends C3589h0 implements C3607q0 {
    /* renamed from: k */
    public static C3607q0 m6836k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof C3607q0 ? (C3607q0) queryLocalInterface : new C3603o0(iBinder);
    }
}
