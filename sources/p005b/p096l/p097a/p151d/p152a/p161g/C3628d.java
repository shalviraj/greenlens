package p005b.p096l.p097a.p151d.p152a.p161g;

import android.os.IBinder;
import android.os.IInterface;
import p005b.p096l.p097a.p151d.p152a.p159e.C3574a;
import p005b.p096l.p097a.p151d.p152a.p159e.C3576b;
import p005b.p096l.p097a.p151d.p152a.p159e.C3578c;
import p005b.p096l.p097a.p151d.p152a.p159e.C3596l;

/* renamed from: b.l.a.d.a.g.d */
public final /* synthetic */ class C3628d implements C3596l {

    /* renamed from: a */
    public static final C3596l f6693a = new C3628d();

    /* renamed from: a */
    public final Object mo14737a(IBinder iBinder) {
        int i = C3576b.f6642a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof C3578c ? (C3578c) queryLocalInterface : new C3574a(iBinder);
    }
}
