package p416l.p417a.p420v1;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import p298d.p337v.C6827f;
import p416l.p417a.C7703b0;
import p416l.p417a.C7755q0;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010+\u001a\u00020\u001d¢\u0006\u0004\b,\u0010-J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ#\u0010\u0017\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010$\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050!8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010+\u001a\u00020\u001d8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010*¨\u0006."}, mo24462d2 = {"Ll/a/v1/e;", "Ll/a/q0;", "Ll/a/v1/j;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "Ld/r;", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "Ld/v/f;", "context", "block", "n0", "(Ld/v/f;Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "H", "", "tailDispatch", "p0", "(Ljava/lang/Runnable;Z)V", "Ll/a/v1/c;", "i", "Ll/a/v1/c;", "dispatcher", "", "j", "I", "parallelism", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "h", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "k", "Ljava/lang/String;", "name", "l", "h0", "()I", "taskMode", "<init>", "(Ll/a/v1/c;ILjava/lang/String;I)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.v1.e */
public final class C7806e extends C7755q0 implements C7811j, Executor {

    /* renamed from: m */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15403m = AtomicIntegerFieldUpdater.newUpdater(C7806e.class, "inFlightTasks");

    /* renamed from: h */
    public final ConcurrentLinkedQueue<Runnable> f15404h = new ConcurrentLinkedQueue<>();

    /* renamed from: i */
    public final C7804c f15405i;
    private volatile /* synthetic */ int inFlightTasks = 0;

    /* renamed from: j */
    public final int f15406j;

    /* renamed from: k */
    public final String f15407k;

    /* renamed from: l */
    public final int f15408l;

    public C7806e(C7804c cVar, int i, String str, int i2) {
        this.f15405i = cVar;
        this.f15406j = i;
        this.f15407k = str;
        this.f15408l = i2;
    }

    /* renamed from: H */
    public void mo25496H() {
        Runnable poll = this.f15404h.poll();
        if (poll != null) {
            C7804c cVar = this.f15405i;
            Objects.requireNonNull(cVar);
            try {
                cVar.f15398h.mo25484z(poll, this, true);
            } catch (RejectedExecutionException unused) {
                C7703b0.f15242n.mo25409w0(cVar.f15398h.mo25477e(poll, this));
            }
        } else {
            f15403m.decrementAndGet(this);
            Runnable poll2 = this.f15404h.poll();
            if (poll2 != null) {
                mo25500p0(poll2, true);
            }
        }
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        mo25500p0(runnable, false);
    }

    /* renamed from: h0 */
    public int mo25499h0() {
        return this.f15408l;
    }

    /* renamed from: n0 */
    public void mo25402n0(C6827f fVar, Runnable runnable) {
        mo25500p0(runnable, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v6 java.lang.Runnable) binds: [B:0:0x0000, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25500p0(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f15403m
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f15406j
            if (r1 > r2) goto L_0x0021
            l.a.v1.c r0 = r3.f15405i
            java.util.Objects.requireNonNull(r0)
            l.a.v1.a r1 = r0.f15398h     // Catch:{ RejectedExecutionException -> 0x0015 }
            r1.mo25484z(r4, r3, r5)     // Catch:{ RejectedExecutionException -> 0x0015 }
            goto L_0x0020
        L_0x0015:
            l.a.b0 r5 = p416l.p417a.C7703b0.f15242n
            l.a.v1.a r0 = r0.f15398h
            l.a.v1.i r4 = r0.mo25477e(r4, r3)
            r5.mo25409w0(r4)
        L_0x0020:
            return
        L_0x0021:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f15404h
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f15406j
            if (r4 < r0) goto L_0x002f
            return
        L_0x002f:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f15404h
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 == 0) goto L_0x003a
            goto L_0x0000
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.p420v1.C7806e.mo25500p0(java.lang.Runnable, boolean):void");
    }

    public String toString() {
        String str = this.f15407k;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f15405i + ']';
    }
}
