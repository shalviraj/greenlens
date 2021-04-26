package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.util.Log;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1817g;
import p005b.p096l.p097a.p113c.p119b.p122m.C1929n;

/* renamed from: b.l.a.c.b.l.k.z0 */
public final class C1883z0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C1754b f3361g;

    /* renamed from: h */
    public final /* synthetic */ C1817g.C1819b f3362h;

    public C1883z0(C1817g.C1819b bVar, C1754b bVar2) {
        this.f3362h = bVar;
        this.f3361g = bVar2;
    }

    public final void run() {
        C1754b bVar;
        C1929n nVar;
        C1817g.C1819b bVar2 = this.f3362h;
        C1817g.C1818a aVar = C1817g.this.f3188g.get(bVar2.f3206b);
        if (aVar != null) {
            if (this.f3361g.mo11986W()) {
                C1817g.C1819b bVar3 = this.f3362h;
                bVar3.f3209e = true;
                if (bVar3.f3205a.mo12030t()) {
                    C1817g.C1819b bVar4 = this.f3362h;
                    if (bVar4.f3209e && (nVar = bVar4.f3207c) != null) {
                        bVar4.f3205a.mo12022j(nVar, bVar4.f3208d);
                        return;
                    }
                    return;
                }
                try {
                    C1770a.C1779f fVar = this.f3362h.f3205a;
                    fVar.mo12022j((C1929n) null, fVar.mo12021i());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    bVar = new C1754b(10);
                }
            } else {
                bVar = this.f3361g;
                aVar.mo12088n(bVar);
            }
        }
    }
}
