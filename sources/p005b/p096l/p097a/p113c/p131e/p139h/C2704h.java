package p005b.p096l.p097a.p113c.p131e.p139h;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b.l.a.c.e.h.h */
public abstract class C2704h extends C2698b implements C2703g {
    /* renamed from: k */
    public static C2703g m4547k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof C2703g ? (C2703g) queryLocalInterface : new C2705i(iBinder);
    }
}
