package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.RemoteException;
import p005b.p096l.p097a.p151d.p152a.p159e.C3586g;
import p005b.p096l.p097a.p151d.p152a.p159e.C3607q0;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.b.f */
public final class C3490f extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ int f6383h;

    /* renamed from: i */
    public final /* synthetic */ String f6384i;

    /* renamed from: j */
    public final /* synthetic */ String f6385j;

    /* renamed from: k */
    public final /* synthetic */ int f6386k;

    /* renamed from: l */
    public final /* synthetic */ C3647n f6387l;

    /* renamed from: m */
    public final /* synthetic */ C3518m f6388m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3490f(C3518m mVar, C3647n nVar, int i, String str, String str2, int i2, C3647n nVar2) {
        super(nVar);
        this.f6388m = mVar;
        this.f6383h = i;
        this.f6384i = str;
        this.f6385j = str2;
        this.f6386k = i2;
        this.f6387l = nVar2;
    }

    /* renamed from: a */
    public final void mo14738a() {
        try {
            C3518m mVar = this.f6388m;
            ((C3607q0) mVar.f6471c.f6673k).mo14901K0(mVar.f6469a, C3518m.m6696j(this.f6383h, this.f6384i, this.f6385j, this.f6386k), C3518m.m6694h(), new C3502i(this.f6388m, this.f6387l));
        } catch (RemoteException e) {
            C3518m.f6467f.mo14884b(6, "getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{this.f6384i, this.f6385j, Integer.valueOf(this.f6386k), Integer.valueOf(this.f6383h)});
            this.f6387l.mo14928a(new RuntimeException(e));
        }
    }
}
