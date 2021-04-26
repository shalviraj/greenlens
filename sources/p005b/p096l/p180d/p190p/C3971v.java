package p005b.p096l.p180d.p190p;

import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p005b.p096l.p180d.p211t.C4219a;
import p005b.p096l.p180d.p211t.C4220b;
import p005b.p096l.p180d.p211t.C4221c;
import p005b.p096l.p180d.p211t.C4222d;

/* renamed from: b.l.d.p.v */
public class C3971v implements C4222d, C4221c {
    @GuardedBy("this")

    /* renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<C4220b<Object>, Executor>> f7274a = new HashMap();
    @GuardedBy("this")

    /* renamed from: b */
    public Queue<C4219a<?>> f7275b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f7276c;

    public C3971v(Executor executor) {
        this.f7276c = executor;
    }

    /* renamed from: a */
    public <T> void mo15482a(Class<T> cls, C4220b<? super T> bVar) {
        mo15483b(cls, this.f7276c, bVar);
    }

    /* renamed from: b */
    public synchronized <T> void mo15483b(Class<T> cls, Executor executor, C4220b<? super T> bVar) {
        Objects.requireNonNull(cls);
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(executor);
        if (!this.f7274a.containsKey(cls)) {
            this.f7274a.put(cls, new ConcurrentHashMap());
        }
        this.f7274a.get(cls).put(bVar, executor);
    }
}
