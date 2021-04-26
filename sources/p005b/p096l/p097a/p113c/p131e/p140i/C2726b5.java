package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.l.a.c.e.i.b5 */
public final class C2726b5 {

    /* renamed from: b */
    public static volatile C2726b5 f4641b;

    /* renamed from: c */
    public static volatile C2726b5 f4642c;

    /* renamed from: d */
    public static final C2726b5 f4643d = new C2726b5(true);

    /* renamed from: a */
    public final Map<C2712a5, C2886n5<?, ?>> f4644a;

    public C2726b5() {
        this.f4644a = new HashMap();
    }

    public C2726b5(boolean z) {
        this.f4644a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C2726b5 m4589a() {
        C2726b5 b5Var = f4641b;
        if (b5Var == null) {
            synchronized (C2726b5.class) {
                b5Var = f4641b;
                if (b5Var == null) {
                    b5Var = f4643d;
                    f4641b = b5Var;
                }
            }
        }
        return b5Var;
    }
}
