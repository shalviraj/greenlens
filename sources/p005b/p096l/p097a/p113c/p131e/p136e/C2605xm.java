package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.l.a.c.e.e.xm */
public final class C2605xm {

    /* renamed from: b */
    public static volatile C2605xm f4469b;

    /* renamed from: c */
    public static final C2605xm f4470c = new C2605xm(true);

    /* renamed from: a */
    public final Map<C2581wm, C2245in<?, ?>> f4471a;

    public C2605xm() {
        this.f4471a = new HashMap();
    }

    public C2605xm(boolean z) {
        this.f4471a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C2605xm m4408a() {
        C2605xm xmVar = f4469b;
        if (xmVar == null) {
            synchronized (C2605xm.class) {
                xmVar = f4469b;
                if (xmVar == null) {
                    xmVar = f4470c;
                    f4469b = xmVar;
                }
            }
        }
        return xmVar;
    }
}
