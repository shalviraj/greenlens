package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Iterator;
import java.util.Map;

/* renamed from: b.l.a.c.e.i.l6 */
public final class C2861l6 {
    /* renamed from: a */
    public static final int m4939a(int i, Object obj, Object obj2) {
        C2848k6 k6Var = (C2848k6) obj;
        C2835j6 j6Var = (C2835j6) obj2;
        if (k6Var.isEmpty()) {
            return 0;
        }
        Iterator it = k6Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m4940b(Object obj, Object obj2) {
        C2848k6 k6Var = (C2848k6) obj;
        C2848k6 k6Var2 = (C2848k6) obj2;
        if (!k6Var2.isEmpty()) {
            if (!k6Var.f4872g) {
                k6Var = k6Var.isEmpty() ? new C2848k6() : new C2848k6(k6Var);
            }
            k6Var.mo13447b();
            if (!k6Var2.isEmpty()) {
                k6Var.putAll(k6Var2);
            }
        }
        return k6Var;
    }
}
