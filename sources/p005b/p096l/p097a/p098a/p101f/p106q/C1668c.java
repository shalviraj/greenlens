package p005b.p096l.p097a.p098a.p101f.p106q;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p005b.p096l.p097a.p098a.p101f.C1634e;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.C1644k;
import p005b.p096l.p097a.p098a.p101f.p102n.C1652e;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1695r;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1700c;
import p005b.p096l.p097a.p098a.p101f.p109r.C1733b;
import p005b.p096l.p180d.p191q.p192f.p201l.C4176a;

/* renamed from: b.l.a.a.f.q.c */
public class C1668c implements C1670e {

    /* renamed from: f */
    public static final Logger f2933f = Logger.getLogger(C1644k.class.getName());

    /* renamed from: a */
    public final C1695r f2934a;

    /* renamed from: b */
    public final Executor f2935b;

    /* renamed from: c */
    public final C1652e f2936c;

    /* renamed from: d */
    public final C1700c f2937d;

    /* renamed from: e */
    public final C1733b f2938e;

    public C1668c(Executor executor, C1652e eVar, C1695r rVar, C1700c cVar, C1733b bVar) {
        this.f2935b = executor;
        this.f2936c = eVar;
        this.f2934a = rVar;
        this.f2937d = cVar;
        this.f2938e = bVar;
    }

    /* renamed from: a */
    public void mo11855a(C1640h hVar, C1634e eVar, C4176a aVar) {
        this.f2935b.execute(new C1666a(this, hVar, aVar, eVar));
    }
}
