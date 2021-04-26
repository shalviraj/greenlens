package p005b.p096l.p097a.p098a.p101f.p106q.p107h;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.p102n.C1647a;
import p005b.p096l.p097a.p098a.p101f.p102n.C1652e;
import p005b.p096l.p097a.p098a.p101f.p102n.C1654g;
import p005b.p096l.p097a.p098a.p101f.p102n.C1662m;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1700c;
import p005b.p096l.p097a.p098a.p101f.p106q.p108i.C1708h;
import p005b.p096l.p097a.p098a.p101f.p109r.C1733b;
import p005b.p096l.p097a.p098a.p101f.p110s.C1735a;

/* renamed from: b.l.a.a.f.q.h.l */
public class C1689l {

    /* renamed from: a */
    public final Context f2982a;

    /* renamed from: b */
    public final C1652e f2983b;

    /* renamed from: c */
    public final C1700c f2984c;

    /* renamed from: d */
    public final C1695r f2985d;

    /* renamed from: e */
    public final Executor f2986e;

    /* renamed from: f */
    public final C1733b f2987f;

    /* renamed from: g */
    public final C1735a f2988g;

    public C1689l(Context context, C1652e eVar, C1700c cVar, C1695r rVar, Executor executor, C1733b bVar, C1735a aVar) {
        this.f2982a = context;
        this.f2983b = eVar;
        this.f2984c = cVar;
        this.f2985d = rVar;
        this.f2986e = executor;
        this.f2987f = bVar;
        this.f2988g = aVar;
    }

    /* renamed from: a */
    public void mo11879a(C1640h hVar, int i) {
        C1654g b;
        C1662m mVar = this.f2983b.get(hVar.mo11808b());
        Iterable<C1708h> iterable = (Iterable) this.f2987f.mo11914d(new C1685h(this, hVar));
        if (iterable.iterator().hasNext()) {
            if (mVar == null) {
                C0823f.m402w("Uploader", "Unknown backend for %s, deleting event batch for it...", hVar);
                b = C1654g.m2180a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (C1708h a : iterable) {
                    arrayList.add(a.mo11892a());
                }
                byte[] c = hVar.mo11809c();
                if (1 != 0) {
                    b = mVar.mo11737b(new C1647a(arrayList, c, (C1647a.C1648a) null));
                } else {
                    throw new IllegalStateException(C0843a.m451l("Missing required properties:", ""));
                }
            }
            this.f2987f.mo11914d(new C1686i(this, b, iterable, hVar, i));
        }
    }
}
