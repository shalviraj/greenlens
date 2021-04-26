package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p005b.p096l.p097a.p151d.p152a.p159e.C3586g;
import p005b.p096l.p097a.p151d.p152a.p159e.C3607q0;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.b.p2 */
public final class C3533p2 extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ List f6521h;

    /* renamed from: i */
    public final /* synthetic */ C3647n f6522i;

    /* renamed from: j */
    public final /* synthetic */ C3518m f6523j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3533p2(C3518m mVar, C3647n nVar, List list, C3647n nVar2) {
        super(nVar);
        this.f6523j = mVar;
        this.f6521h = list;
        this.f6522i = nVar2;
    }

    /* renamed from: a */
    public final void mo14738a() {
        List<String> list = this.f6521h;
        ArrayList arrayList = new ArrayList(list.size());
        for (String putString : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", putString);
            arrayList.add(bundle);
        }
        try {
            C3518m mVar = this.f6523j;
            ((C3607q0) mVar.f6471c.f6673k).mo14898E(mVar.f6469a, arrayList, C3518m.m6694h(), new C3498h(this.f6523j, this.f6522i, (byte[]) null));
        } catch (RemoteException e) {
            C3518m.f6467f.mo14883a(e, "cancelDownloads(%s)", this.f6521h);
        }
    }
}
