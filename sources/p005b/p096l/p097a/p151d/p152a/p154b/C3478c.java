package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.RemoteException;
import p005b.p096l.p097a.p151d.p152a.p159e.C3586g;
import p005b.p096l.p097a.p151d.p152a.p159e.C3607q0;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.b.c */
public final class C3478c extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ int f6310h;

    /* renamed from: i */
    public final /* synthetic */ String f6311i;

    /* renamed from: j */
    public final /* synthetic */ String f6312j;

    /* renamed from: k */
    public final /* synthetic */ int f6313k;

    /* renamed from: l */
    public final /* synthetic */ C3647n f6314l;

    /* renamed from: m */
    public final /* synthetic */ C3518m f6315m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3478c(C3518m mVar, C3647n nVar, int i, String str, String str2, int i2, C3647n nVar2) {
        super(nVar);
        this.f6315m = mVar;
        this.f6310h = i;
        this.f6311i = str;
        this.f6312j = str2;
        this.f6313k = i2;
        this.f6314l = nVar2;
    }

    /* renamed from: a */
    public final void mo14738a() {
        try {
            C3518m mVar = this.f6315m;
            ((C3607q0) mVar.f6471c.f6673k).mo14902R0(mVar.f6469a, C3518m.m6696j(this.f6310h, this.f6311i, this.f6312j, this.f6313k), C3518m.m6694h(), new C3498h(this.f6315m, this.f6314l, (char[]) null));
        } catch (RemoteException e) {
            C3518m.f6467f.mo14883a(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
