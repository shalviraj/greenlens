package p005b.p051h.p052a.p055m.p058v.p060d0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: b.h.a.m.v.d0.c */
public final class C1048c {

    /* renamed from: a */
    public final Map<String, C1049a> f1135a = new HashMap();

    /* renamed from: b */
    public final C1050b f1136b = new C1050b();

    /* renamed from: b.h.a.m.v.d0.c$a */
    public static class C1049a {

        /* renamed from: a */
        public final Lock f1137a = new ReentrantLock();

        /* renamed from: b */
        public int f1138b;
    }

    /* renamed from: b.h.a.m.v.d0.c$b */
    public static class C1050b {

        /* renamed from: a */
        public final Queue<C1049a> f1139a = new ArrayDeque();
    }

    /* renamed from: a */
    public void mo10928a(String str) {
        C1049a aVar;
        synchronized (this) {
            C1049a aVar2 = this.f1135a.get(str);
            Objects.requireNonNull(aVar2, "Argument must not be null");
            aVar = aVar2;
            int i = aVar.f1138b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f1138b = i2;
                if (i2 == 0) {
                    C1049a remove = this.f1135a.remove(str);
                    if (remove.equals(aVar)) {
                        C1050b bVar = this.f1136b;
                        synchronized (bVar.f1139a) {
                            if (bVar.f1139a.size() < 10) {
                                bVar.f1139a.offer(remove);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f1138b);
            }
        }
        aVar.f1137a.unlock();
    }
}
