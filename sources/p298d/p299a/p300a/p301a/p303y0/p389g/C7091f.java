package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7095h;

/* renamed from: d.a.a.a.y0.g.f */
public class C7091f {

    /* renamed from: b */
    public static final C7091f f14182b = new C7091f(true);

    /* renamed from: a */
    public final Map<C7092a, C7095h.C7102f<?, ?>> f14183a;

    /* renamed from: d.a.a.a.y0.g.f$a */
    public static final class C7092a {

        /* renamed from: a */
        public final Object f14184a;

        /* renamed from: b */
        public final int f14185b;

        public C7092a(Object obj, int i) {
            this.f14184a = obj;
            this.f14185b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7092a)) {
                return false;
            }
            C7092a aVar = (C7092a) obj;
            return this.f14184a == aVar.f14184a && this.f14185b == aVar.f14185b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f14184a) * 65535) + this.f14185b;
        }
    }

    public C7091f() {
        this.f14183a = new HashMap();
    }

    public C7091f(boolean z) {
        this.f14183a = Collections.emptyMap();
    }

    /* renamed from: a */
    public final void mo24660a(C7095h.C7102f<?, ?> fVar) {
        this.f14183a.put(new C7092a(fVar.f14203a, fVar.f14206d.f14199h), fVar);
    }
}
