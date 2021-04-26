package p005b.p096l.p097a.p113c.p145h.p147b;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.FutureTask;

/* renamed from: b.l.a.c.h.b.k4 */
public final class C3226k4<V> extends FutureTask<V> implements Comparable<C3226k4<V>> {

    /* renamed from: g */
    public final long f5679g;

    /* renamed from: h */
    public final boolean f5680h;

    /* renamed from: i */
    public final String f5681i;

    /* renamed from: j */
    public final /* synthetic */ C3248m4 f5682j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3226k4(C3248m4 m4Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f5682j = m4Var;
        long andIncrement = C3248m4.f5728k.getAndIncrement();
        this.f5679g = andIncrement;
        this.f5681i = str;
        this.f5680h = z;
        if (andIncrement == RecyclerView.FOREVER_NS) {
            m4Var.f5638a.mo14329d().f5799f.mo14414a("Tasks index overflow");
        }
    }

    public final int compareTo(@NonNull Object obj) {
        C3226k4 k4Var = (C3226k4) obj;
        boolean z = this.f5680h;
        if (z != k4Var.f5680h) {
            return !z ? 1 : -1;
        }
        int i = (this.f5679g > k4Var.f5679g ? 1 : (this.f5679g == k4Var.f5679g ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        this.f5682j.f5638a.mo14329d().f5800g.mo14415b("Two tasks share the same index. index", Long.valueOf(this.f5679g));
        return 0;
    }

    public final void setException(Throwable th) {
        this.f5682j.f5638a.mo14329d().f5799f.mo14415b(this.f5681i, th);
        super.setException(th);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [b.l.a.c.h.b.m4, java.util.concurrent.Callable<V>, b.l.a.c.h.b.j5] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.concurrent.Callable, boolean] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.String, boolean] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3226k4(java.util.concurrent.Callable<V> r3, boolean r4, java.lang.String r5) {
        /*
            r2 = this;
            r2.f5682j = r3
            r2.<init>(r4)
            java.util.concurrent.atomic.AtomicLong r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3248m4.f5728k
            long r0 = r4.getAndIncrement()
            r2.f5679g = r0
            java.lang.String r4 = "Task exception on worker thread"
            r2.f5681i = r4
            r2.f5680h = r5
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0029
            b.l.a.c.h.b.p4 r3 = r3.f5638a
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()
            b.l.a.c.h.b.m3 r3 = r3.f5799f
            java.lang.String r4 = "Tasks index overflow"
            r3.mo14414a(r4)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3226k4.<init>(b.l.a.c.h.b.m4, java.util.concurrent.Callable, boolean):void");
    }
}
