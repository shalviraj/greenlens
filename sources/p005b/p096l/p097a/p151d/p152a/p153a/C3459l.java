package p005b.p096l.p097a.p151d.p152a.p153a;

import android.os.Bundle;
import android.os.RemoteException;
import p005b.p096l.p097a.p151d.p152a.p156c.C3566b;
import p005b.p096l.p097a.p151d.p152a.p159e.C3586g;
import p005b.p096l.p097a.p151d.p152a.p159e.C3597l0;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.a.l */
public final class C3459l extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ C3647n f6256h;

    /* renamed from: i */
    public final /* synthetic */ String f6257i;

    /* renamed from: j */
    public final /* synthetic */ C3463p f6258j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3459l(C3463p pVar, C3647n nVar, C3647n nVar2, String str) {
        super(nVar);
        this.f6258j = pVar;
        this.f6256h = nVar2;
        this.f6257i = str;
    }

    /* renamed from: a */
    public final void mo14738a() {
        try {
            C3463p pVar = this.f6258j;
            String str = pVar.f6267b;
            Bundle bundle = new Bundle();
            bundle.putAll(C3566b.m6788a("app_update"));
            bundle.putInt("playcore.version.code", 11000);
            ((C3597l0) pVar.f6266a.f6673k).mo14892L(str, bundle, new C3461n(this.f6258j, this.f6256h));
        } catch (RemoteException e) {
            C3463p.f6264e.mo14883a(e, "completeUpdate(%s)", this.f6257i);
            this.f6256h.mo14928a(new RuntimeException(e));
        }
    }
}
