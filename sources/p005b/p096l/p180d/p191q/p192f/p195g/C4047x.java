package p005b.p096l.p180d.p191q.p192f.p195g;

import java.util.concurrent.Callable;
import p005b.p096l.p180d.p191q.p192f.C3982b;

/* renamed from: b.l.d.q.f.g.x */
public class C4047x implements Callable<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ C4043w f7438a;

    public C4047x(C4043w wVar) {
        this.f7438a = wVar;
    }

    public Object call() {
        C4032q qVar = this.f7438a.f7427f;
        boolean z = true;
        if (!qVar.f7390c.mo15553b().exists()) {
            String f = qVar.mo15539f();
            if (f == null || !qVar.f7398k.mo15494h(f)) {
                z = false;
            }
        } else {
            C3982b.f7289a.mo15499e("Found previous crash marker.");
            qVar.f7390c.mo15553b().delete();
        }
        return Boolean.valueOf(z);
    }
}
