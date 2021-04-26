package p005b.p096l.p180d.p213v;

import android.util.Pair;
import p005b.p096l.p097a.p113c.p150j.C3414a;
import p005b.p096l.p097a.p113c.p150j.C3428h;

/* renamed from: b.l.d.v.u */
public final /* synthetic */ class C4272u implements C3414a {

    /* renamed from: a */
    public final C4270t f7911a;

    /* renamed from: b */
    public final Pair f7912b;

    public C4272u(C4270t tVar, Pair pair) {
        this.f7911a = tVar;
        this.f7912b = pair;
    }

    /* renamed from: a */
    public final Object mo14670a(C3428h hVar) {
        C4270t tVar = this.f7911a;
        Pair pair = this.f7912b;
        synchronized (tVar) {
            tVar.f7905b.remove(pair);
        }
        return hVar;
    }
}
