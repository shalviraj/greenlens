package p005b.p096l.p097a.p151d.p152a.p159e;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import p005b.p096l.p097a.p151d.p152a.p161g.C3625a;
import p005b.p096l.p097a.p151d.p152a.p161g.C3631g;

/* renamed from: b.l.a.d.a.e.d */
public abstract class C3580d extends C3589h0 implements C3582e {
    public C3580d() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* renamed from: g */
    public final boolean mo14882g(int i, Parcel parcel) {
        if (i != 2) {
            return false;
        }
        C3631g gVar = (C3631g) this;
        gVar.f6698c.f6700a.mo14905b();
        gVar.f6696a.mo14884b(4, "onGetLaunchReviewFlowInfo", new Object[0]);
        gVar.f6697b.mo14929b(new C3625a((PendingIntent) ((Bundle) C3591i0.m6813a(parcel, Bundle.CREATOR)).get("confirmation_intent")));
        return true;
    }
}
