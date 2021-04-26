package p005b.p096l.p180d.p181a0;

import java.util.Set;
import p005b.p096l.p180d.p190p.C3953e;
import p005b.p096l.p180d.p190p.C3955g;

/* renamed from: b.l.d.a0.b */
public final /* synthetic */ class C3816b implements C3955g {

    /* renamed from: a */
    public static final C3816b f7030a = new C3816b();

    /* renamed from: a */
    public Object mo15340a(C3953e eVar) {
        Set<C3819e> b = eVar.mo15458b(C3819e.class);
        C3818d dVar = C3818d.f7033b;
        if (dVar == null) {
            synchronized (C3818d.class) {
                dVar = C3818d.f7033b;
                if (dVar == null) {
                    dVar = new C3818d();
                    C3818d.f7033b = dVar;
                }
            }
        }
        return new C3817c(b, dVar);
    }
}
