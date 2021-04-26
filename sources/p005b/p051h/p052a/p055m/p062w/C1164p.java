package p005b.p051h.p052a.p055m.p062w;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b.h.a.m.w.p */
public class C1164p {

    /* renamed from: a */
    public final C1169r f1412a;

    /* renamed from: b */
    public final C1165a f1413b = new C1165a();

    /* renamed from: b.h.a.m.w.p$a */
    public static class C1165a {

        /* renamed from: a */
        public final Map<Class<?>, C1166a<?>> f1414a = new HashMap();

        /* renamed from: b.h.a.m.w.p$a$a */
        public static class C1166a<Model> {

            /* renamed from: a */
            public final List<C1161n<Model, ?>> f1415a;

            public C1166a(List<C1161n<Model, ?>> list) {
                this.f1415a = list;
            }
        }
    }

    public C1164p(@NonNull Pools.Pool<List<Throwable>> pool) {
        C1169r rVar = new C1169r(pool);
        this.f1412a = rVar;
    }
}
