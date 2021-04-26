package p005b.p096l.p180d.p191q.p192f.p195g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3427g;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4188a;

/* renamed from: b.l.d.q.f.g.o */
public class C4027o implements C3427g<C4188a, Void> {

    /* renamed from: a */
    public final /* synthetic */ Executor f7379a;

    /* renamed from: b */
    public final /* synthetic */ C4030p f7380b;

    public C4027o(C4030p pVar, Executor executor) {
        this.f7380b = pVar;
        this.f7379a = executor;
    }

    @NonNull
    /* renamed from: a */
    public C3428h mo14700a(@Nullable Object obj) {
        if (((C4188a) obj) == null) {
            C3982b.f7289a.mo15500f("Received null app settings at app startup. Cannot send cached reports");
        } else {
            C4032q.m7431b(C4032q.this);
            C4032q.this.f7401n.mo15533c(this.f7379a);
            C4032q.this.f7405r.mo14702b(null);
        }
        return C1960d.m2740P(null);
    }
}
