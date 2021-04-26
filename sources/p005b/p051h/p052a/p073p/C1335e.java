package p005b.p051h.p052a.p073p;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005b.p051h.p052a.p055m.C0981r;

/* renamed from: b.h.a.p.e */
public class C1335e {

    /* renamed from: a */
    public final List<String> f1687a = new ArrayList();

    /* renamed from: b */
    public final Map<String, List<C1336a<?, ?>>> f1688b = new HashMap();

    /* renamed from: b.h.a.p.e$a */
    public static class C1336a<T, R> {

        /* renamed from: a */
        public final Class<T> f1689a;

        /* renamed from: b */
        public final Class<R> f1690b;

        /* renamed from: c */
        public final C0981r<T, R> f1691c;

        public C1336a(@NonNull Class<T> cls, @NonNull Class<R> cls2, C0981r<T, R> rVar) {
            this.f1689a = cls;
            this.f1690b = cls2;
            this.f1691c = rVar;
        }

        /* renamed from: a */
        public boolean mo11172a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f1689a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f1690b);
        }
    }

    @NonNull
    /* renamed from: a */
    public final synchronized List<C1336a<?, ?>> mo11170a(@NonNull String str) {
        List<C1336a<?, ?>> list;
        if (!this.f1687a.contains(str)) {
            this.f1687a.add(str);
        }
        list = this.f1688b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f1688b.put(str, list);
        }
        return list;
    }

    @NonNull
    /* renamed from: b */
    public synchronized <T, R> List<Class<R>> mo11171b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f1687a) {
            List<C1336a> list = this.f1688b.get(str);
            if (list != null) {
                for (C1336a aVar : list) {
                    if (aVar.mo11172a(cls, cls2) && !arrayList.contains(aVar.f1690b)) {
                        arrayList.add(aVar.f1690b);
                    }
                }
            }
        }
        return arrayList;
    }
}
