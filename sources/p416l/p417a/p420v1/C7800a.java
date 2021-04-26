package p416l.p417a.p420v1;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p298d.p349z.C6911c;
import p416l.p417a.p419u1.C7789p;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002IJB+\u0012\u0006\u0010:\u001a\u00020\u0005\u0012\u0006\u0010C\u001a\u00020\u0005\u0012\b\b\u0002\u0010F\u001a\u00020\b\u0012\b\b\u0002\u00103\u001a\u00020+¢\u0006\u0004\bG\u0010HJ\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0003R\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0018\u00010\u0003R\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\n2\n\u0010\u0004\u001a\u00060\u0003R\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u00152\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010%\u001a\u00020\u00152\n\u0010!\u001a\u00060\u001aj\u0002`\u001b2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\n¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020'2\n\u0010!\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0015¢\u0006\u0004\b*\u0010 J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020'¢\u0006\u0004\b/\u00100R\u0016\u00103\u001a\u00020+8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00058\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u0002048\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b;\u00106R\u0013\u0010=\u001a\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010\u000eR\"\u0010A\u001a\u000e\u0012\n\u0012\b\u0018\u00010\u0003R\u00020\u00000>8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u00058\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bB\u00109R\u0016\u0010F\u001a\u00020\b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006K"}, mo24462d2 = {"Ll/a/v1/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Ll/a/v1/a$a;", "worker", "", "H", "(Ll/a/v1/a$a;)I", "", "state", "", "f0", "(J)Z", "h0", "()Z", "d", "()I", "q", "()Ll/a/v1/a$a;", "oldIndex", "newIndex", "Ld/r;", "O", "(Ll/a/v1/a$a;II)V", "N", "(Ll/a/v1/a$a;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "block", "Ll/a/v1/j;", "taskContext", "tailDispatch", "z", "(Ljava/lang/Runnable;Ll/a/v1/j;Z)V", "Ll/a/v1/i;", "e", "(Ljava/lang/Runnable;Ll/a/v1/j;)Ll/a/v1/i;", "Z", "", "toString", "()Ljava/lang/String;", "task", "S", "(Ll/a/v1/i;)V", "m", "Ljava/lang/String;", "schedulerName", "Ll/a/v1/d;", "g", "Ll/a/v1/d;", "globalCpuQueue", "j", "I", "corePoolSize", "h", "globalBlockingQueue", "isTerminated", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "i", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "workers", "k", "maxPoolSize", "l", "J", "idleWorkerKeepAliveNs", "<init>", "(IIJLjava/lang/String;)V", "a", "b", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.v1.a */
public final class C7800a implements Executor, Closeable {

    /* renamed from: n */
    public static final /* synthetic */ AtomicLongFieldUpdater f15371n = AtomicLongFieldUpdater.newUpdater(C7800a.class, "parkedWorkersStack");

    /* renamed from: o */
    public static final /* synthetic */ AtomicLongFieldUpdater f15372o = AtomicLongFieldUpdater.newUpdater(C7800a.class, "controlState");

    /* renamed from: p */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15373p = AtomicIntegerFieldUpdater.newUpdater(C7800a.class, "_isTerminated");

    /* renamed from: q */
    public static final C7789p f15374q = new C7789p("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;

    /* renamed from: g */
    public final C7805d f15375g;

    /* renamed from: h */
    public final C7805d f15376h;

    /* renamed from: i */
    public final AtomicReferenceArray<C7801a> f15377i;

    /* renamed from: j */
    public final int f15378j;

    /* renamed from: k */
    public final int f15379k;

    /* renamed from: l */
    public final long f15380l;

    /* renamed from: m */
    public final String f15381m;
    private volatile /* synthetic */ long parkedWorkersStack;

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0010\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020\n¢\u0006\u0004\b3\u00104J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0017\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0016\u0010)\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010&R*\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u0010,¨\u00065"}, mo24462d2 = {"l/a/v1/a$a", "Ljava/lang/Thread;", "Ll/a/v1/a$b;", "newState", "", "h", "(Ll/a/v1/a$b;)Z", "Ld/r;", "run", "()V", "", "upperBound", "d", "(I)I", "scanLocalQueue", "Ll/a/v1/i;", "a", "(Z)Ll/a/v1/i;", "e", "()Ll/a/v1/i;", "blockingOnly", "i", "Ll/a/v1/m;", "g", "Ll/a/v1/m;", "localQueue", "", "nextParkedWorker", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "l", "Z", "mayHaveLocalTasks", "Ll/a/v1/a$b;", "state", "", "J", "terminationDeadline", "j", "minDelayUntilStealableTaskNs", "index", "indexInArray", "I", "b", "()I", "f", "(I)V", "k", "rngState", "<init>", "(Ll/a/v1/a;I)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
    /* renamed from: l.a.v1.a$a */
    public final class C7801a extends Thread {

        /* renamed from: n */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f15382n = AtomicIntegerFieldUpdater.newUpdater(C7801a.class, "workerCtl");

        /* renamed from: g */
        public final C7814m f15383g = new C7814m();

        /* renamed from: h */
        public C7802b f15384h = C7802b.DORMANT;

        /* renamed from: i */
        public long f15385i;
        private volatile int indexInArray;

        /* renamed from: j */
        public long f15386j;

        /* renamed from: k */
        public int f15387k;

        /* renamed from: l */
        public boolean f15388l;
        private volatile Object nextParkedWorker = C7800a.f15374q;
        public volatile /* synthetic */ int workerCtl = 0;

        public C7801a(int i) {
            setDaemon(true);
            C6911c.C6912a aVar = C6911c.f13808b;
            this.f15387k = C6911c.f13807a.mo24213a();
            mo25490f(i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p416l.p417a.p420v1.C7810i mo25485a(boolean r11) {
            /*
                r10 = this;
                l.a.v1.a$b r0 = p416l.p417a.p420v1.C7800a.C7802b.CPU_ACQUIRED
                l.a.v1.a$b r1 = r10.f15384h
                r2 = 0
                r3 = 1
                if (r1 != r0) goto L_0x0009
                goto L_0x0030
            L_0x0009:
                l.a.v1.a r1 = p416l.p417a.p420v1.C7800a.this
            L_0x000b:
                long r6 = r1.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r8 = 42
                long r4 = r4 >> r8
                int r4 = (int) r4
                if (r4 != 0) goto L_0x001b
                r1 = r2
                goto L_0x002c
            L_0x001b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p416l.p417a.p420v1.C7800a.f15372o
                r5 = r1
                boolean r4 = r4.compareAndSet(r5, r6, r8)
                if (r4 == 0) goto L_0x000b
                r1 = r3
            L_0x002c:
                if (r1 == 0) goto L_0x0032
                r10.f15384h = r0
            L_0x0030:
                r0 = r3
                goto L_0x0033
            L_0x0032:
                r0 = r2
            L_0x0033:
                if (r0 == 0) goto L_0x006c
                if (r11 == 0) goto L_0x0060
                l.a.v1.a r11 = p416l.p417a.p420v1.C7800a.this
                int r11 = r11.f15378j
                int r11 = r11 * 2
                int r11 = r10.mo25488d(r11)
                if (r11 != 0) goto L_0x0044
                goto L_0x0045
            L_0x0044:
                r3 = r2
            L_0x0045:
                if (r3 == 0) goto L_0x004e
                l.a.v1.i r11 = r10.mo25489e()
                if (r11 == 0) goto L_0x004e
                goto L_0x006b
            L_0x004e:
                l.a.v1.m r11 = r10.f15383g
                l.a.v1.i r11 = r11.mo25508e()
                if (r11 == 0) goto L_0x0057
                goto L_0x006b
            L_0x0057:
                if (r3 != 0) goto L_0x0067
                l.a.v1.i r11 = r10.mo25489e()
                if (r11 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0060:
                l.a.v1.i r11 = r10.mo25489e()
                if (r11 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0067:
                l.a.v1.i r11 = r10.mo25493i(r2)
            L_0x006b:
                return r11
            L_0x006c:
                if (r11 == 0) goto L_0x0077
                l.a.v1.m r11 = r10.f15383g
                l.a.v1.i r11 = r11.mo25508e()
                if (r11 == 0) goto L_0x0077
                goto L_0x0081
            L_0x0077:
                l.a.v1.a r11 = p416l.p417a.p420v1.C7800a.this
                l.a.v1.d r11 = r11.f15376h
                java.lang.Object r11 = r11.mo25453d()
                l.a.v1.i r11 = (p416l.p417a.p420v1.C7810i) r11
            L_0x0081:
                if (r11 == 0) goto L_0x0084
                goto L_0x0088
            L_0x0084:
                l.a.v1.i r11 = r10.mo25493i(r3)
            L_0x0088:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.p420v1.C7800a.C7801a.mo25485a(boolean):l.a.v1.i");
        }

        /* renamed from: b */
        public final int mo25486b() {
            return this.indexInArray;
        }

        /* renamed from: c */
        public final Object mo25487c() {
            return this.nextParkedWorker;
        }

        /* renamed from: d */
        public final int mo25488d(int i) {
            int i2 = this.f15387k;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f15387k = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) % i;
        }

        /* renamed from: e */
        public final C7810i mo25489e() {
            C7805d dVar;
            if (mo25488d(2) == 0) {
                C7810i iVar = (C7810i) C7800a.this.f15375g.mo25453d();
                if (iVar != null) {
                    return iVar;
                }
                dVar = C7800a.this.f15376h;
            } else {
                C7810i iVar2 = (C7810i) C7800a.this.f15376h.mo25453d();
                if (iVar2 != null) {
                    return iVar2;
                }
                dVar = C7800a.this.f15375g;
            }
            return (C7810i) dVar.mo25453d();
        }

        /* renamed from: f */
        public final void mo25490f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C7800a.this.f15381m);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: g */
        public final void mo25491g(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: h */
        public final boolean mo25492h(C7802b bVar) {
            C7802b bVar2 = this.f15384h;
            boolean z = bVar2 == C7802b.CPU_ACQUIRED;
            if (z) {
                C7800a.f15372o.addAndGet(C7800a.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.f15384h = bVar;
            }
            return z;
        }

        /* renamed from: i */
        public final C7810i mo25493i(boolean z) {
            long j;
            long j2;
            int i = (int) (C7800a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int d = mo25488d(i);
            long j3 = RecyclerView.FOREVER_NS;
            for (int i2 = 0; i2 < i; i2++) {
                d++;
                if (d > i) {
                    d = 1;
                }
                C7801a aVar = C7800a.this.f15377i.get(d);
                if (!(aVar == null || aVar == this)) {
                    C7814m mVar = this.f15383g;
                    C7814m mVar2 = aVar.f15383g;
                    if (z) {
                        j = mVar.mo25510g(mVar2);
                    } else {
                        Objects.requireNonNull(mVar);
                        C7810i f = mVar2.mo25509f();
                        if (f != null) {
                            mVar.mo25504a(f, false);
                            j2 = -1;
                        } else {
                            j2 = mVar.mo25511h(mVar2, false);
                        }
                        j = j2;
                    }
                    if (j == -1) {
                        return this.f15383g.mo25508e();
                    }
                    if (j > 0) {
                        j3 = Math.min(j3, j);
                    }
                }
            }
            if (j3 == RecyclerView.FOREVER_NS) {
                j3 = 0;
            }
            this.f15386j = j3;
            return null;
        }

        public void run() {
            C7802b bVar = C7802b.PARKING;
            C7802b bVar2 = C7802b.TERMINATED;
            loop0:
            while (true) {
                boolean z = false;
                while (!C7800a.this.isTerminated() && this.f15384h != bVar2) {
                    C7810i a = mo25485a(this.f15388l);
                    if (a == null) {
                        this.f15388l = false;
                        if (this.f15386j == 0) {
                            if (this.nextParkedWorker != C7800a.f15374q) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != C7800a.f15374q) || this.workerCtl != -1 || C7800a.this.isTerminated() || this.f15384h == bVar2) {
                                        break;
                                    }
                                    mo25492h(bVar);
                                    Thread.interrupted();
                                    if (this.f15385i == 0) {
                                        this.f15385i = System.nanoTime() + C7800a.this.f15380l;
                                    }
                                    LockSupport.parkNanos(C7800a.this.f15380l);
                                    if (System.nanoTime() - this.f15385i >= 0) {
                                        this.f15385i = 0;
                                        synchronized (C7800a.this.f15377i) {
                                            if (!C7800a.this.isTerminated()) {
                                                if (((int) (C7800a.this.controlState & 2097151)) > C7800a.this.f15378j) {
                                                    if (f15382n.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        mo25490f(0);
                                                        C7800a.this.mo25472O(this, i, 0);
                                                        int andDecrement = (int) (C7800a.f15372o.getAndDecrement(C7800a.this) & 2097151);
                                                        if (andDecrement != i) {
                                                            C7801a aVar = C7800a.this.f15377i.get(andDecrement);
                                                            C6888i.m12436c(aVar);
                                                            C7801a aVar2 = aVar;
                                                            C7800a.this.f15377i.set(i, aVar2);
                                                            aVar2.mo25490f(i);
                                                            C7800a.this.mo25472O(aVar2, andDecrement, i);
                                                        }
                                                        C7800a.this.f15377i.set(andDecrement, (Object) null);
                                                        this.f15384h = bVar2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                C7800a.this.mo25471N(this);
                            }
                        } else if (!z) {
                            z = true;
                        } else {
                            mo25492h(bVar);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f15386j);
                            this.f15386j = 0;
                        }
                    } else {
                        this.f15386j = 0;
                        C7802b bVar3 = C7802b.BLOCKING;
                        int h0 = a.f15412h.mo25499h0();
                        this.f15385i = 0;
                        if (this.f15384h == bVar) {
                            this.f15384h = bVar3;
                        }
                        if (h0 != 0 && mo25492h(bVar3)) {
                            C7800a.this.mo25474Z();
                        }
                        C7800a.this.mo25473S(a);
                        if (h0 != 0) {
                            C7800a.f15372o.addAndGet(C7800a.this, -2097152);
                            if (this.f15384h != bVar2) {
                                this.f15384h = C7802b.DORMANT;
                            }
                        }
                    }
                }
            }
            mo25492h(bVar2);
        }
    }

    /* renamed from: l.a.v1.a$b */
    public enum C7802b {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public C7800a(int i, int i2, long j, String str) {
        this.f15378j = i;
        this.f15379k = i2;
        this.f15380l = j;
        this.f15381m = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.f15375g = new C7805d();
                        this.f15376h = new C7805d();
                        this.parkedWorkersStack = 0;
                        this.f15377i = new AtomicReferenceArray<>(i2 + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(C0843a.m445f("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(C0843a.m446g("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        throw new IllegalArgumentException(C0843a.m445f("Core pool size ", i, " should be at least 1").toString());
    }

    /* renamed from: H */
    public final int mo25470H(C7801a aVar) {
        int b;
        do {
            Object c = aVar.mo25487c();
            if (c == f15374q) {
                return -1;
            }
            if (c == null) {
                return 0;
            }
            aVar = (C7801a) c;
            b = aVar.mo25486b();
        } while (b == 0);
        return b;
    }

    /* renamed from: N */
    public final boolean mo25471N(C7801a aVar) {
        long j;
        int b;
        if (aVar.mo25487c() != f15374q) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            b = aVar.mo25486b();
            aVar.mo25491g(this.f15377i.get((int) (2097151 & j)));
        } while (!f15371n.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) b)));
        return true;
    }

    /* renamed from: O */
    public final void mo25472O(C7801a aVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? mo25470H(aVar) : i2;
            }
            if (i3 >= 0) {
                if (f15371n.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: S */
    public final void mo25473S(C7810i iVar) {
        try {
            iVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    /* renamed from: Z */
    public final void mo25474Z() {
        if (!mo25480h0() && !mo25479f0(this.controlState)) {
            mo25480h0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r1 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f15373p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x009c
        L_0x000c:
            l.a.v1.a$a r0 = r9.mo25482q()
            java.util.concurrent.atomic.AtomicReferenceArray<l.a.v1.a$a> r3 = r9.f15377i
            monitor-enter(r3)
            long r4 = r9.controlState     // Catch:{ all -> 0x009d }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r3)
            if (r2 > r4) goto L_0x0063
            r3 = r2
        L_0x001e:
            java.util.concurrent.atomic.AtomicReferenceArray<l.a.v1.a$a> r5 = r9.f15377i
            java.lang.Object r5 = r5.get(r3)
            p298d.p344x.p346c.C6888i.m12436c(r5)
            l.a.v1.a$a r5 = (p416l.p417a.p420v1.C7800a.C7801a) r5
            if (r5 == r0) goto L_0x005e
        L_0x002b:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L_0x003a
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L_0x002b
        L_0x003a:
            l.a.v1.m r5 = r5.f15383g
            l.a.v1.d r6 = r9.f15376h
            java.util.Objects.requireNonNull(r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p416l.p417a.p420v1.C7814m.f15419b
            r8 = 0
            java.lang.Object r7 = r7.getAndSet(r5, r8)
            l.a.v1.i r7 = (p416l.p417a.p420v1.C7810i) r7
            if (r7 == 0) goto L_0x004f
            r6.mo25450a(r7)
        L_0x004f:
            l.a.v1.i r7 = r5.mo25509f()
            if (r7 == 0) goto L_0x005a
            r6.mo25450a(r7)
            r7 = r2
            goto L_0x005b
        L_0x005a:
            r7 = r1
        L_0x005b:
            if (r7 == 0) goto L_0x005e
            goto L_0x004f
        L_0x005e:
            if (r3 == r4) goto L_0x0063
            int r3 = r3 + 1
            goto L_0x001e
        L_0x0063:
            l.a.v1.d r1 = r9.f15376h
            r1.mo25451b()
            l.a.v1.d r1 = r9.f15375g
            r1.mo25451b()
        L_0x006d:
            if (r0 == 0) goto L_0x0076
            l.a.v1.i r1 = r0.mo25485a(r2)
            if (r1 == 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            l.a.v1.d r1 = r9.f15375g
            java.lang.Object r1 = r1.mo25453d()
            l.a.v1.i r1 = (p416l.p417a.p420v1.C7810i) r1
        L_0x007e:
            if (r1 == 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            l.a.v1.d r1 = r9.f15376h
            java.lang.Object r1 = r1.mo25453d()
            l.a.v1.i r1 = (p416l.p417a.p420v1.C7810i) r1
        L_0x0089:
            if (r1 == 0) goto L_0x008f
            r9.mo25473S(r1)
            goto L_0x006d
        L_0x008f:
            if (r0 == 0) goto L_0x0096
            l.a.v1.a$b r1 = p416l.p417a.p420v1.C7800a.C7802b.TERMINATED
            r0.mo25492h(r1)
        L_0x0096:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        L_0x009c:
            return
        L_0x009d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.p420v1.C7800a.close():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        return r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo25476d() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<l.a.v1.a$a> r0 = r10.f15377i
            monitor-enter(r0)
            int r1 = r10._isTerminated     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x000a
            r1 = -1
        L_0x0008:
            monitor-exit(r0)
            return r1
        L_0x000a:
            long r1 = r10.controlState     // Catch:{ all -> 0x0077 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0077 }
            r6 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r6
            r6 = 21
            long r1 = r1 >> r6
            int r1 = (int) r1     // Catch:{ all -> 0x0077 }
            int r1 = r5 - r1
            r2 = 0
            if (r1 >= 0) goto L_0x0022
            r1 = r2
        L_0x0022:
            int r6 = r10.f15378j     // Catch:{ all -> 0x0077 }
            if (r1 < r6) goto L_0x0028
            monitor-exit(r0)
            return r2
        L_0x0028:
            int r6 = r10.f15379k     // Catch:{ all -> 0x0077 }
            if (r5 < r6) goto L_0x002e
            monitor-exit(r0)
            return r2
        L_0x002e:
            long r5 = r10.controlState     // Catch:{ all -> 0x0077 }
            long r5 = r5 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0077 }
            r6 = 1
            int r5 = r5 + r6
            if (r5 <= 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicReferenceArray<l.a.v1.a$a> r7 = r10.f15377i     // Catch:{ all -> 0x0077 }
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x0077 }
            if (r7 != 0) goto L_0x0040
            r7 = r6
            goto L_0x0041
        L_0x0040:
            r7 = r2
        L_0x0041:
            if (r7 == 0) goto L_0x006b
            l.a.v1.a$a r7 = new l.a.v1.a$a     // Catch:{ all -> 0x0077 }
            r7.<init>(r5)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReferenceArray<l.a.v1.a$a> r8 = r10.f15377i     // Catch:{ all -> 0x0077 }
            r8.set(r5, r7)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f15372o     // Catch:{ all -> 0x0077 }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x0077 }
            long r3 = r3 & r8
            int r3 = (int) r3     // Catch:{ all -> 0x0077 }
            if (r5 != r3) goto L_0x0058
            r2 = r6
        L_0x0058:
            if (r2 == 0) goto L_0x005f
            r7.start()     // Catch:{ all -> 0x0077 }
            int r1 = r1 + r6
            goto L_0x0008
        L_0x005f:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x006b:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.p420v1.C7800a.mo25476d():int");
    }

    /* renamed from: e */
    public final C7810i mo25477e(Runnable runnable, C7811j jVar) {
        long a = C7813l.f15418e.mo25501a();
        if (!(runnable instanceof C7810i)) {
            return new C7812k(runnable, a, jVar);
        }
        C7810i iVar = (C7810i) runnable;
        iVar.f15411g = a;
        iVar.f15412h = jVar;
        return iVar;
    }

    public void execute(Runnable runnable) {
        mo25484z(runnable, C7808g.f15410g, false);
    }

    /* renamed from: f0 */
    public final boolean mo25479f0(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f15378j) {
            int d = mo25476d();
            if (d == 1 && this.f15378j > 1) {
                mo25476d();
            }
            if (d > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h0 */
    public final boolean mo25480h0() {
        while (true) {
            long j = this.parkedWorkersStack;
            C7801a aVar = this.f15377i.get((int) (2097151 & j));
            if (aVar != null) {
                long j2 = (2097152 + j) & -2097152;
                int H = mo25470H(aVar);
                if (H < 0) {
                    continue;
                } else {
                    if (f15371n.compareAndSet(this, j, ((long) H) | j2)) {
                        aVar.mo25491g(f15374q);
                    } else {
                        continue;
                    }
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return false;
            }
            if (C7801a.f15382n.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: q */
    public final C7801a mo25482q() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C7801a)) {
            currentThread = null;
        }
        C7801a aVar = (C7801a) currentThread;
        if (aVar == null || !C6888i.m12434a(C7800a.this, this)) {
            return null;
        }
        return aVar;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        int length = this.f15377i.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            C7801a aVar = this.f15377i.get(i6);
            if (aVar != null) {
                int d = aVar.f15383g.mo25507d();
                int ordinal = aVar.f15384h.ordinal();
                if (ordinal == 0) {
                    i++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(d));
                    str = "c";
                } else if (ordinal == 1) {
                    i2++;
                    sb = new StringBuilder();
                    sb.append(String.valueOf(d));
                    str = "b";
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (d > 0) {
                        sb = new StringBuilder();
                        sb.append(String.valueOf(d));
                        str = "d";
                    }
                } else if (ordinal == 4) {
                    i5++;
                }
                sb.append(str);
                arrayList.add(sb.toString());
            }
        }
        long j = this.controlState;
        return this.f15381m + '@' + C5266a.m10027s1(this) + '[' + "Pool Size {" + "core = " + this.f15378j + ", " + "max = " + this.f15379k + "}, " + "Worker States {" + "CPU = " + i + ", " + "blocking = " + i2 + ", " + "parked = " + i3 + ", " + "dormant = " + i4 + ", " + "terminated = " + i5 + "}, " + "running workers queues = " + arrayList + ", " + "global CPU queue size = " + this.f15375g.mo25452c() + ", " + "global blocking queue size = " + this.f15376h.mo25452c() + ", " + "Control State {" + "created workers= " + ((int) (2097151 & j)) + ", " + "blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", " + "CPUs acquired = " + (this.f15378j - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: z */
    public final void mo25484z(Runnable runnable, C7811j jVar, boolean z) {
        C7810i iVar;
        C7810i e = mo25477e(runnable, jVar);
        C7801a q = mo25482q();
        boolean z2 = true;
        if (q == null || q.f15384h == C7802b.TERMINATED || (e.f15412h.mo25499h0() == 0 && q.f15384h == C7802b.BLOCKING)) {
            iVar = e;
        } else {
            q.f15388l = true;
            iVar = q.f15383g.mo25504a(e, z);
        }
        if (iVar != null) {
            if (!(iVar.f15412h.mo25499h0() == 1 ? this.f15376h : this.f15375g).mo25450a(iVar)) {
                throw new RejectedExecutionException(C0843a.m455p(new StringBuilder(), this.f15381m, " was terminated"));
            }
        }
        if (!z || q == null) {
            z2 = false;
        }
        if (e.f15412h.mo25499h0() != 0) {
            long addAndGet = f15372o.addAndGet(this, 2097152);
            if (!z2 && !mo25480h0() && !mo25479f0(addAndGet)) {
                mo25480h0();
            }
        } else if (!z2) {
            mo25474Z();
        }
    }
}
