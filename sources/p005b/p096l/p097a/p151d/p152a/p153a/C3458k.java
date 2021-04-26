package p005b.p096l.p097a.p151d.p152a.p153a;

import android.os.RemoteException;
import p005b.p096l.p097a.p151d.p152a.p159e.C3586g;
import p005b.p096l.p097a.p151d.p152a.p159e.C3597l0;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.a.k */
public final class C3458k extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ String f6253h;

    /* renamed from: i */
    public final /* synthetic */ C3647n f6254i;

    /* renamed from: j */
    public final /* synthetic */ C3463p f6255j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3458k(C3463p pVar, C3647n nVar, String str, C3647n nVar2) {
        super(nVar);
        this.f6255j = pVar;
        this.f6253h = str;
        this.f6254i = nVar2;
    }

    /* renamed from: a */
    public final void mo14738a() {
        try {
            C3463p pVar = this.f6255j;
            ((C3597l0) pVar.f6266a.f6673k).mo14893j0(pVar.f6267b, C3463p.m6614a(pVar, this.f6253h), new C3462o(this.f6255j, this.f6254i, this.f6253h));
        } catch (RemoteException e) {
            C3463p.f6264e.mo14883a(e, "requestUpdateInfo(%s)", this.f6253h);
            this.f6254i.mo14928a(new RuntimeException(e));
        }
    }
}
