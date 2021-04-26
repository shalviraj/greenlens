package p005b.p096l.p180d.p191q;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p005b.p096l.p097a.p113c.p150j.C3429i;
import p005b.p096l.p180d.p191q.p192f.p195g.C4036r0;
import p005b.p096l.p180d.p191q.p192f.p195g.C4039s0;
import p005b.p096l.p180d.p191q.p192f.p195g.C4042v;
import p005b.p096l.p180d.p191q.p192f.p195g.C4043w;
import p005b.p096l.p180d.p191q.p192f.p202m.C4183e;

/* renamed from: b.l.d.q.d */
public class C3979d implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ boolean f7285a;

    /* renamed from: b */
    public final /* synthetic */ C4043w f7286b;

    /* renamed from: c */
    public final /* synthetic */ C4183e f7287c;

    public C3979d(boolean z, C4043w wVar, C4183e eVar) {
        this.f7285a = z;
        this.f7286b = wVar;
        this.f7287c = eVar;
    }

    public Object call() {
        if (!this.f7285a) {
            return null;
        }
        C4043w wVar = this.f7286b;
        C4183e eVar = this.f7287c;
        ExecutorService executorService = wVar.f7431j;
        C4042v vVar = new C4042v(wVar, eVar);
        ExecutorService executorService2 = C4039s0.f7417a;
        executorService.execute(new C4036r0(vVar, new C3429i()));
        return null;
    }
}
