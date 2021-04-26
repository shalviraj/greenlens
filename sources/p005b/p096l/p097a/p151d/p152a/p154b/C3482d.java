package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.Bundle;
import android.os.RemoteException;
import p005b.p096l.p097a.p151d.p152a.p159e.C3586g;
import p005b.p096l.p097a.p151d.p152a.p159e.C3607q0;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.b.d */
public final class C3482d extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ int f6333h;

    /* renamed from: i */
    public final /* synthetic */ String f6334i;

    /* renamed from: j */
    public final /* synthetic */ C3647n f6335j;

    /* renamed from: k */
    public final /* synthetic */ int f6336k;

    /* renamed from: l */
    public final /* synthetic */ C3518m f6337l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3482d(C3518m mVar, C3647n nVar, int i, String str, C3647n nVar2, int i2) {
        super(nVar);
        this.f6337l = mVar;
        this.f6333h = i;
        this.f6334i = str;
        this.f6335j = nVar2;
        this.f6336k = i2;
    }

    /* renamed from: a */
    public final void mo14738a() {
        try {
            C3518m mVar = this.f6337l;
            String str = mVar.f6469a;
            int i = this.f6333h;
            String str2 = this.f6334i;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            ((C3607q0) mVar.f6471c.f6673k).mo14897C(str, bundle, C3518m.m6694h(), new C3514l(this.f6337l, this.f6335j, this.f6333h, this.f6334i, this.f6336k));
        } catch (RemoteException e) {
            C3518m.f6467f.mo14883a(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
