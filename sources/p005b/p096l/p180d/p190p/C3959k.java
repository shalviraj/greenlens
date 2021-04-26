package p005b.p096l.p180d.p190p;

import java.util.Set;
import p005b.p096l.p180d.p215w.C4284b;

/* renamed from: b.l.d.p.k */
public final /* synthetic */ class C3959k implements Runnable {

    /* renamed from: g */
    public final C3974y f7252g;

    /* renamed from: h */
    public final C4284b f7253h;

    public C3959k(C3974y yVar, C4284b bVar) {
        this.f7252g = yVar;
        this.f7253h = bVar;
    }

    public void run() {
        Set set;
        Object obj;
        C3974y yVar = this.f7252g;
        C4284b bVar = this.f7253h;
        int i = C3961m.f7255g;
        synchronized (yVar) {
            if (yVar.f7281b == null) {
                set = yVar.f7280a;
                obj = bVar;
            } else {
                set = yVar.f7281b;
                obj = bVar.get();
            }
            set.add(obj);
        }
    }
}
