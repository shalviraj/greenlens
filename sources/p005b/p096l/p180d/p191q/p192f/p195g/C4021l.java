package p005b.p096l.p180d.p191q.p192f.p195g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3427g;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4188a;

/* renamed from: b.l.d.q.f.g.l */
public class C4021l implements C3427g<C4188a, Void> {

    /* renamed from: a */
    public final /* synthetic */ Executor f7366a;

    /* renamed from: b */
    public final /* synthetic */ C4023m f7367b;

    public C4021l(C4023m mVar, Executor executor) {
        this.f7367b = mVar;
        this.f7366a = executor;
    }

    @NonNull
    /* renamed from: a */
    public C3428h mo14700a(@Nullable Object obj) {
        if (((C4188a) obj) == null) {
            C3982b.f7289a.mo15500f("Received null app settings, cannot send reports at crash time.");
            return C1960d.m2740P(null);
        }
        return C1960d.m2753T0(Arrays.asList(new C3428h[]{C4032q.m7431b(this.f7367b.f7373e), this.f7367b.f7373e.f7401n.mo15533c(this.f7366a)}));
    }
}
