package p005b.p096l.p180d.p216x;

import java.util.Objects;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p216x.p218m.C4299a;
import p005b.p096l.p180d.p216x.p218m.C4303c;
import p005b.p096l.p180d.p216x.p218m.C4305d;

/* renamed from: b.l.d.x.b */
public final /* synthetic */ class C4286b implements Runnable {

    /* renamed from: g */
    public final C4288d f7941g;

    public C4286b(C4288d dVar) {
        this.f7941g = dVar;
    }

    public void run() {
        C4305d b;
        C4288d dVar = this.f7941g;
        Object obj = C4288d.f7944m;
        Objects.requireNonNull(dVar);
        synchronized (C4288d.f7944m) {
            C3825d dVar2 = dVar.f7946a;
            dVar2.mo15344a();
            C4285a a = C4285a.m7851a(dVar2.f7042a, "generatefid.lock");
            try {
                b = dVar.f7948c.mo15925b();
                if (b.mo15927i()) {
                    String f = dVar.mo15896f(b);
                    C4303c cVar = dVar.f7948c;
                    C4299a.C4301b bVar = (C4299a.C4301b) b.mo15917j();
                    bVar.f7978a = f;
                    bVar.mo15920b(C4303c.C4304a.UNREGISTERED);
                    b = bVar.mo15919a();
                    cVar.mo15924a(b);
                }
            } finally {
                if (a != null) {
                    a.mo15889b();
                }
            }
        }
        dVar.mo15900i(b);
        dVar.f7954i.execute(new C4287c(dVar, false));
    }
}
