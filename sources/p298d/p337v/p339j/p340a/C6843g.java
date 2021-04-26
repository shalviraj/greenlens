package p298d.p337v.p339j.p340a;

import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p298d.p337v.C6832h;

/* renamed from: d.v.j.a.g */
public abstract class C6843g extends C6836a {
    public C6843g(C6824d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == C6832h.f13753g)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public C6827f getContext() {
        return C6832h.f13753g;
    }
}
