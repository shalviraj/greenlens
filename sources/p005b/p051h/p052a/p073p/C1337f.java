package p005b.p051h.p052a.p073p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p005b.p051h.p052a.p055m.C0982s;

/* renamed from: b.h.a.p.f */
public class C1337f {

    /* renamed from: a */
    public final List<C1338a<?>> f1692a = new ArrayList();

    /* renamed from: b.h.a.p.f$a */
    public static final class C1338a<T> {

        /* renamed from: a */
        public final Class<T> f1693a;

        /* renamed from: b */
        public final C0982s<T> f1694b;

        public C1338a(@NonNull Class<T> cls, @NonNull C0982s<T> sVar) {
            this.f1693a = cls;
            this.f1694b = sVar;
        }
    }

    @Nullable
    /* renamed from: a */
    public synchronized <Z> C0982s<Z> mo11173a(@NonNull Class<Z> cls) {
        int size = this.f1692a.size();
        for (int i = 0; i < size; i++) {
            C1338a aVar = this.f1692a.get(i);
            if (aVar.f1693a.isAssignableFrom(cls)) {
                return aVar.f1694b;
            }
        }
        return null;
    }
}
