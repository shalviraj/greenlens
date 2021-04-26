package p005b.p096l.p097a.p151d.p152a.p153a;

import android.os.IBinder;
import android.os.IInterface;
import p005b.p096l.p097a.p151d.p152a.p159e.C3593j0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3595k0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3596l;
import p005b.p096l.p097a.p151d.p152a.p159e.C3597l0;

/* renamed from: b.l.a.d.a.a.j */
public final /* synthetic */ class C3457j implements C3596l {

    /* renamed from: a */
    public static final C3596l f6252a = new C3457j();

    /* renamed from: a */
    public final Object mo14737a(IBinder iBinder) {
        int i = C3595k0.f6657a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof C3597l0 ? (C3597l0) queryLocalInterface : new C3593j0(iBinder);
    }
}
