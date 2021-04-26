package p005b.p051h.p052a.p055m.p062w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import p005b.p051h.p052a.p078s.C1377g;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.m.w.m */
public class C1158m<A, B> {

    /* renamed from: a */
    public final C1377g<C1160b<A>, B> f1404a;

    /* renamed from: b.h.a.m.w.m$a */
    public class C1159a extends C1377g<C1160b<A>, B> {
        public C1159a(C1158m mVar, long j) {
            super(j);
        }

        /* renamed from: c */
        public void mo10931c(@NonNull Object obj, @Nullable Object obj2) {
            C1160b bVar = (C1160b) obj;
            Objects.requireNonNull(bVar);
            Queue<C1160b<?>> queue = C1160b.f1405d;
            synchronized (queue) {
                queue.offer(bVar);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: b.h.a.m.w.m$b */
    public static final class C1160b<A> {

        /* renamed from: d */
        public static final Queue<C1160b<?>> f1405d = new ArrayDeque(0);

        /* renamed from: a */
        public int f1406a;

        /* renamed from: b */
        public int f1407b;

        /* renamed from: c */
        public A f1408c;

        static {
            char[] cArr = C1380j.f1801a;
        }

        /* renamed from: a */
        public static <A> C1160b<A> m1071a(A a, int i, int i2) {
            C1160b<A> poll;
            Queue<C1160b<?>> queue = f1405d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new C1160b<>();
            }
            poll.f1408c = a;
            poll.f1407b = i;
            poll.f1406a = i2;
            return poll;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1160b)) {
                return false;
            }
            C1160b bVar = (C1160b) obj;
            return this.f1407b == bVar.f1407b && this.f1406a == bVar.f1406a && this.f1408c.equals(bVar.f1408c);
        }

        public int hashCode() {
            return this.f1408c.hashCode() + (((this.f1406a * 31) + this.f1407b) * 31);
        }
    }

    public C1158m(long j) {
        this.f1404a = new C1159a(this, j);
    }
}
