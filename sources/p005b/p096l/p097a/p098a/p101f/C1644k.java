package p005b.p096l.p097a.p098a.p101f;

import android.content.Context;
import java.util.Objects;
import p005b.p096l.p097a.p098a.p101f.C1631c;
import p005b.p096l.p097a.p098a.p101f.p106q.C1670e;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1689l;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1691n;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1693p;
import p005b.p096l.p097a.p098a.p101f.p110s.C1735a;

/* renamed from: b.l.a.a.f.k */
public class C1644k implements C1643j {

    /* renamed from: e */
    public static volatile C1645l f2887e;

    /* renamed from: a */
    public final C1735a f2888a;

    /* renamed from: b */
    public final C1735a f2889b;

    /* renamed from: c */
    public final C1670e f2890c;

    /* renamed from: d */
    public final C1689l f2891d;

    public C1644k(C1735a aVar, C1735a aVar2, C1670e eVar, C1689l lVar, C1693p pVar) {
        this.f2888a = aVar;
        this.f2889b = aVar2;
        this.f2890c = eVar;
        this.f2891d = lVar;
        pVar.f2998a.execute(new C1691n(pVar));
    }

    /* renamed from: a */
    public static C1644k m2168a() {
        C1645l lVar = f2887e;
        if (lVar != null) {
            return ((C1631c) lVar).f2876r.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: b */
    public static void m2169b(Context context) {
        if (f2887e == null) {
            synchronized (C1644k.class) {
                if (f2887e == null) {
                    Objects.requireNonNull(context);
                    Class<Context> cls = Context.class;
                    f2887e = new C1631c(context, (C1631c.C1632a) null);
                }
            }
        }
    }
}
