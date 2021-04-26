package p005b.p096l.p097a.p151d.p152a.p161g;

import android.os.RemoteException;
import p005b.p096l.p097a.p151d.p152a.p156c.C3566b;
import p005b.p096l.p097a.p151d.p152a.p159e.C3586g;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.g.f */
public final class C3630f extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ C3647n f6694h;

    /* renamed from: i */
    public final /* synthetic */ C3632h f6695i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3630f(C3632h hVar, C3647n nVar, C3647n nVar2) {
        super(nVar);
        this.f6695i = hVar;
        this.f6694h = nVar2;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [b.l.a.d.a.e.e, b.l.a.d.a.g.g] */
    /* renamed from: a */
    public final void mo14738a() {
        try {
            C3632h hVar = this.f6695i;
            hVar.f6700a.f6673k.mo14879b0(hVar.f6701b, C3566b.m6788a("review"), new C3631g(this.f6695i, this.f6694h));
        } catch (RemoteException e) {
            C3632h.f6699c.mo14883a(e, "error requesting in-app review for %s", this.f6695i.f6701b);
            this.f6694h.mo14928a(new RuntimeException(e));
        }
    }
}
