package p416l.p417a.p420v1;

import java.util.concurrent.TimeUnit;
import p005b.p291q.p292a.C5266a;
import p298d.p333a0.C6759e;
import p416l.p417a.p419u1.C7790q;

/* renamed from: l.a.v1.l */
public final class C7813l {

    /* renamed from: a */
    public static final long f15414a = C5266a.m10006o4("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f15415b;

    /* renamed from: c */
    public static final int f15416c;

    /* renamed from: d */
    public static final long f15417d = TimeUnit.SECONDS.toNanos(C5266a.m10006o4("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static C7809h f15418e = C7807f.f15409a;

    static {
        C5266a.m10000n4("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
        int i = C7790q.f15355a;
        int n4 = C5266a.m10000n4("kotlinx.coroutines.scheduler.core.pool.size", i < 2 ? 2 : i, 1, 0, 8, (Object) null);
        f15415b = n4;
        f15416c = C5266a.m10000n4("kotlinx.coroutines.scheduler.max.pool.size", C6759e.m12305a(i * 128, n4, 2097150), 0, 2097150, 4, (Object) null);
    }
}
