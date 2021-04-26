package p005b.p096l.p180d.p191q.p192f.p195g;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p195g.C4032q;

/* renamed from: b.l.d.q.f.g.p */
public class C4030p implements Callable<C3428h<Void>> {

    /* renamed from: a */
    public final /* synthetic */ Boolean f7384a;

    /* renamed from: b */
    public final /* synthetic */ C4032q.C4033a f7385b;

    public C4030p(C4032q.C4033a aVar, Boolean bool) {
        this.f7385b = aVar;
        this.f7384a = bool;
    }

    public Object call() {
        if (!this.f7384a.booleanValue()) {
            C3982b.f7289a.mo15499e("Deleting cached crash reports...");
            File[] listFiles = C4032q.this.mo15540g().listFiles(C4015i.f7358a);
            if (listFiles == null) {
                listFiles = new File[0];
            }
            for (File delete : listFiles) {
                delete.delete();
            }
            Iterator it = ((ArrayList) C4032q.this.f7401n.f7375b.mo15776c()).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            C4032q.this.f7405r.mo14702b(null);
            return C1960d.m2740P(null);
        }
        C3982b.f7289a.mo15496b("Sending cached crash reports...");
        boolean booleanValue = this.f7384a.booleanValue();
        C4001c0 c0Var = C4032q.this.f7389b;
        Objects.requireNonNull(c0Var);
        if (booleanValue) {
            c0Var.f7315g.mo14702b(null);
            C4032q.C4033a aVar = this.f7385b;
            Executor executor = C4032q.this.f7392e.f7341a;
            return aVar.f7406a.mo14693o(executor, new C4027o(this, executor));
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }
}
