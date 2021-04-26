package p005b.p096l.p097a.p098a.p101f.p106q;

import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p101f.C1634e;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.p102n.C1662m;
import p005b.p096l.p180d.p191q.p192f.p201l.C4176a;

/* renamed from: b.l.a.a.f.q.a */
public final /* synthetic */ class C1666a implements Runnable {

    /* renamed from: g */
    public final C1668c f2926g;

    /* renamed from: h */
    public final C1640h f2927h;

    /* renamed from: i */
    public final C4176a f2928i;

    /* renamed from: j */
    public final C1634e f2929j;

    public C1666a(C1668c cVar, C1640h hVar, C4176a aVar, C1634e eVar) {
        this.f2926g = cVar;
        this.f2927h = hVar;
        this.f2928i = aVar;
        this.f2929j = eVar;
    }

    public void run() {
        C1668c cVar = this.f2926g;
        C1640h hVar = this.f2927h;
        C4176a aVar = this.f2928i;
        C1634e eVar = this.f2929j;
        Logger logger = C1668c.f2933f;
        try {
            C1662m mVar = cVar.f2936c.get(hVar.mo11808b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{hVar.mo11808b()});
                C1668c.f2933f.warning(format);
                aVar.mo15779a(new IllegalArgumentException(format));
                return;
            }
            cVar.f2938e.mo11914d(new C1667b(cVar, hVar, mVar.mo11736a(eVar)));
            aVar.mo15779a((Exception) null);
        } catch (Exception e) {
            Logger logger2 = C1668c.f2933f;
            StringBuilder u = C0843a.m460u("Error scheduling event ");
            u.append(e.getMessage());
            logger2.warning(u.toString());
            aVar.mo15779a(e);
        }
    }
}
