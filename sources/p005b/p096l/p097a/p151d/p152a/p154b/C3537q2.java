package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.RemoteException;
import java.util.Map;
import p005b.p096l.p097a.p151d.p152a.p159e.C3586g;
import p005b.p096l.p097a.p151d.p152a.p159e.C3607q0;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.b.q2 */
public final class C3537q2 extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ Map f6536h;

    /* renamed from: i */
    public final /* synthetic */ C3647n f6537i;

    /* renamed from: j */
    public final /* synthetic */ C3518m f6538j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3537q2(C3518m mVar, C3647n nVar, Map map, C3647n nVar2) {
        super(nVar);
        this.f6538j = mVar;
        this.f6536h = map;
        this.f6537i = nVar2;
    }

    /* renamed from: a */
    public final void mo14738a() {
        try {
            C3518m mVar = this.f6538j;
            ((C3607q0) mVar.f6471c.f6673k).mo14899F0(mVar.f6469a, C3518m.m6695i(this.f6536h), new C3506j(this.f6538j, this.f6537i));
        } catch (RemoteException e) {
            C3518m.f6467f.mo14883a(e, "syncPacks", new Object[0]);
            this.f6537i.mo14928a(new RuntimeException(e));
        }
    }
}
