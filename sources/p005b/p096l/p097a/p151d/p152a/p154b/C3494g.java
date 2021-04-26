package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.RemoteException;
import p005b.p096l.p097a.p151d.p152a.p159e.C3586g;
import p005b.p096l.p097a.p151d.p152a.p159e.C3607q0;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.b.g */
public final class C3494g extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ C3647n f6405h;

    /* renamed from: i */
    public final /* synthetic */ C3518m f6406i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3494g(C3518m mVar, C3647n nVar, C3647n nVar2) {
        super(nVar);
        this.f6406i = mVar;
        this.f6405h = nVar2;
    }

    /* renamed from: a */
    public final void mo14738a() {
        try {
            C3518m mVar = this.f6406i;
            ((C3607q0) mVar.f6472d.f6673k).mo14900J0(mVar.f6469a, C3518m.m6694h(), new C3510k(this.f6406i, this.f6405h));
        } catch (RemoteException e) {
            C3518m.f6467f.mo14883a(e, "keepAlive", new Object[0]);
        }
    }
}
