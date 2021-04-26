package p005b.p051h.p052a.p055m.p064x.p070h;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.h.a.m.x.h.f */
public class C1299f {

    /* renamed from: a */
    public final List<C1300a<?, ?>> f1640a = new ArrayList();

    /* renamed from: b.h.a.m.x.h.f$a */
    public static final class C1300a<Z, R> {

        /* renamed from: a */
        public final Class<Z> f1641a;

        /* renamed from: b */
        public final Class<R> f1642b;

        /* renamed from: c */
        public final C1298e<Z, R> f1643c;

        public C1300a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull C1298e<Z, R> eVar) {
            this.f1641a = cls;
            this.f1642b = cls2;
            this.f1643c = eVar;
        }

        /* renamed from: a */
        public boolean mo11140a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f1641a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f1642b);
        }
    }

    @NonNull
    /* renamed from: a */
    public synchronized <Z, R> List<Class<R>> mo11139a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1300a<?, ?> a : this.f1640a) {
            if (a.mo11140a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
