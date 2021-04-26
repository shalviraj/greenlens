package p005b.p096l.p097a.p151d.p152a.p154b;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: b.l.a.d.a.b.p0 */
public final /* synthetic */ class C3531p0 implements C3548u0 {

    /* renamed from: a */
    public final C3551v0 f6511a;

    /* renamed from: b */
    public final List f6512b;

    public C3531p0(C3551v0 v0Var, List list) {
        this.f6511a = v0Var;
        this.f6512b = list;
    }

    /* renamed from: a */
    public final Object mo14793a() {
        C3551v0 v0Var = this.f6511a;
        List list = this.f6512b;
        Objects.requireNonNull(v0Var);
        HashMap hashMap = new HashMap();
        for (C3542s0 next : v0Var.f6586e.values()) {
            String str = next.f6554c.f6539a;
            if (list.contains(str)) {
                C3542s0 s0Var = (C3542s0) hashMap.get(str);
                if ((s0Var == null ? -1 : s0Var.f6552a) < next.f6552a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }
}
