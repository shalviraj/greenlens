package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.Bundle;
import android.os.RemoteException;
import p005b.p096l.p097a.p151d.p152a.p159e.C3586g;
import p005b.p096l.p097a.p151d.p152a.p159e.C3607q0;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.b.e */
public final class C3486e extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ int f6368h;

    /* renamed from: i */
    public final /* synthetic */ C3647n f6369i;

    /* renamed from: j */
    public final /* synthetic */ C3518m f6370j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3486e(C3518m mVar, C3647n nVar, int i, C3647n nVar2) {
        super(nVar);
        this.f6370j = mVar;
        this.f6368h = i;
        this.f6369i = nVar2;
    }

    /* renamed from: a */
    public final void mo14738a() {
        try {
            C3518m mVar = this.f6370j;
            String str = mVar.f6469a;
            int i = this.f6368h;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            ((C3607q0) mVar.f6471c.f6673k).mo14903c0(str, bundle, C3518m.m6694h(), new C3498h(this.f6370j, this.f6369i, (int[]) null));
        } catch (RemoteException e) {
            C3518m.f6467f.mo14883a(e, "notifySessionFailed", new Object[0]);
        }
    }
}
