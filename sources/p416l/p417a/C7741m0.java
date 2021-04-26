package p416l.p417a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p337v.C6827f;
import p416l.p417a.p419u1.C7771a;
import p416l.p417a.p419u1.C7782k;
import p416l.p417a.p419u1.C7789p;
import p416l.p417a.p419u1.C7795s;
import p416l.p417a.p419u1.C7796t;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0002 !B\u0007¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00032\n\u0010\u0010\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0018\u0010\u0005J\u001b\u0010\u001a\u001a\u00020\u00192\n\u0010\u0010\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, mo24462d2 = {"Ll/a/m0;", "Ll/a/n0;", "", "Ld/r;", "shutdown", "()V", "", "z0", "()J", "Ld/v/f;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "n0", "(Ld/v/f;Ljava/lang/Runnable;)V", "task", "w0", "(Ljava/lang/Runnable;)V", "now", "Ll/a/m0$a;", "delayedTask", "B0", "(JLl/a/m0$a;)V", "A0", "", "x0", "(Ljava/lang/Runnable;)Z", "y0", "()Z", "isEmpty", "<init>", "a", "b", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.m0 */
public abstract class C7741m0 extends C7746n0 {

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15287k;

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15288l;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* renamed from: l.a.m0$a */
    public static abstract class C7742a implements Runnable, Comparable<C7742a>, C7728i0, C7796t {

        /* renamed from: g */
        public Object f15289g;

        /* renamed from: h */
        public int f15290h;

        /* renamed from: i */
        public long f15291i;

        public int compareTo(Object obj) {
            int i = ((this.f15291i - ((C7742a) obj).f15291i) > 0 ? 1 : ((this.f15291i - ((C7742a) obj).f15291i) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: d */
        public int mo25414d() {
            return this.f15290h;
        }

        public final synchronized void dispose() {
            Object obj = this.f15289g;
            C7789p pVar = C7749o0.f15294a;
            if (obj != pVar) {
                if (!(obj instanceof C7743b)) {
                    obj = null;
                }
                C7743b bVar = (C7743b) obj;
                if (bVar != null) {
                    synchronized (bVar) {
                        if (mo25417l() != null) {
                            bVar.mo25466d(mo25414d());
                        }
                    }
                }
                this.f15289g = pVar;
            }
        }

        /* renamed from: e */
        public void mo25415e(int i) {
            this.f15290h = i;
        }

        /* renamed from: i */
        public void mo25416i(C7795s<?> sVar) {
            if (this.f15289g != C7749o0.f15294a) {
                this.f15289g = sVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: l */
        public C7795s<?> mo25417l() {
            Object obj = this.f15289g;
            if (!(obj instanceof C7795s)) {
                obj = null;
            }
            return (C7795s) obj;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("Delayed[nanos=");
            u.append(this.f15291i);
            u.append(']');
            return u.toString();
        }
    }

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, mo24462d2 = {"l/a/m0$b", "Ll/a/u1/s;", "Ll/a/m0$a;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
    /* renamed from: l.a.m0$b */
    public static final class C7743b extends C7795s<C7742a> {

        /* renamed from: b */
        public long f15292b;

        public C7743b(long j) {
            this.f15292b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C7741m0> cls2 = C7741m0.class;
        f15287k = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f15288l = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: A0 */
    public final void mo25407A0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [l.a.u1.t] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        if ((r8 - r0.f15292b) > 0) goto L_0x0050;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25408B0(long r13, p416l.p417a.C7741m0.C7742a r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x000a
            r0 = r4
            goto L_0x0063
        L_0x000a:
            java.lang.Object r0 = r12._delayed
            l.a.m0$b r0 = (p416l.p417a.C7741m0.C7743b) r0
            if (r0 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f15288l
            l.a.m0$b r5 = new l.a.m0$b
            r5.<init>(r13)
            r0.compareAndSet(r12, r3, r5)
            java.lang.Object r0 = r12._delayed
            p298d.p344x.p346c.C6888i.m12436c(r0)
            l.a.m0$b r0 = (p416l.p417a.C7741m0.C7743b) r0
        L_0x0022:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f15289g     // Catch:{ all -> 0x00a5 }
            l.a.u1.p r6 = p416l.p417a.C7749o0.f15294a     // Catch:{ all -> 0x00a5 }
            if (r5 != r6) goto L_0x002b
            r0 = r2
            goto L_0x0062
        L_0x002b:
            monitor-enter(r0)     // Catch:{ all -> 0x00a5 }
            l.a.u1.t r5 = r0.mo25464b()     // Catch:{ all -> 0x00a2 }
            l.a.m0$a r5 = (p416l.p417a.C7741m0.C7742a) r5     // Catch:{ all -> 0x00a2 }
            int r6 = r12._isCompleted     // Catch:{ all -> 0x00a2 }
            if (r6 == 0) goto L_0x0039
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            r0 = r4
            goto L_0x0062
        L_0x0039:
            r6 = 0
            if (r5 != 0) goto L_0x003f
            r8 = r13
            goto L_0x0050
        L_0x003f:
            long r8 = r5.f15291i     // Catch:{ all -> 0x00a2 }
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0048
            r8 = r13
        L_0x0048:
            long r10 = r0.f15292b     // Catch:{ all -> 0x00a2 }
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0052
        L_0x0050:
            r0.f15292b = r8     // Catch:{ all -> 0x00a2 }
        L_0x0052:
            long r8 = r15.f15291i     // Catch:{ all -> 0x00a2 }
            long r10 = r0.f15292b     // Catch:{ all -> 0x00a2 }
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x005d
            r15.f15291i = r10     // Catch:{ all -> 0x00a2 }
        L_0x005d:
            r0.mo25463a(r15)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            r0 = r1
        L_0x0062:
            monitor-exit(r15)
        L_0x0063:
            if (r0 == 0) goto L_0x007c
            if (r0 == r4) goto L_0x0076
            if (r0 != r2) goto L_0x006a
            goto L_0x00a1
        L_0x006a:
            java.lang.String r13 = "unexpected result"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x0076:
            l.a.b0 r0 = p416l.p417a.C7703b0.f15242n
            r0.mo25408B0(r13, r15)
            goto L_0x00a1
        L_0x007c:
            java.lang.Object r13 = r12._delayed
            l.a.m0$b r13 = (p416l.p417a.C7741m0.C7743b) r13
            if (r13 == 0) goto L_0x008f
            monitor-enter(r13)
            l.a.u1.t r14 = r13.mo25464b()     // Catch:{ all -> 0x008c }
            monitor-exit(r13)
            r3 = r14
            l.a.m0$a r3 = (p416l.p417a.C7741m0.C7742a) r3
            goto L_0x008f
        L_0x008c:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x008f:
            if (r3 != r15) goto L_0x0092
            r1 = r4
        L_0x0092:
            if (r1 == 0) goto L_0x00a1
            java.lang.Thread r13 = r12.mo25317v0()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L_0x00a1
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L_0x00a1:
            return
        L_0x00a2:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            throw r13     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7741m0.mo25408B0(long, l.a.m0$a):void");
    }

    /* renamed from: n0 */
    public final void mo25402n0(C6827f fVar, Runnable runnable) {
        mo25409w0(runnable);
    }

    public void shutdown() {
        C7742a aVar;
        C7750o1 o1Var = C7750o1.f15297b;
        C7750o1.f15296a.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f15287k.compareAndSet(this, (Object) null, C7749o0.f15295b)) {
                    break;
                }
            } else if (obj instanceof C7782k) {
                ((C7782k) obj).mo25455b();
                break;
            } else if (obj == C7749o0.f15295b) {
                break;
            } else {
                C7782k kVar = new C7782k(8, true);
                kVar.mo25454a((Runnable) obj);
                if (f15287k.compareAndSet(this, obj, kVar)) {
                    break;
                }
            }
        }
        do {
        } while (mo25412z0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C7743b bVar = (C7743b) this._delayed;
            if (bVar != null && (aVar = (C7742a) bVar.mo25467e()) != null) {
                C7703b0.f15242n.mo25408B0(nanoTime, aVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: w0 */
    public final void mo25409w0(Runnable runnable) {
        if (mo25410x0(runnable)) {
            Thread v0 = mo25317v0();
            if (Thread.currentThread() != v0) {
                LockSupport.unpark(v0);
                return;
            }
            return;
        }
        C7703b0.f15242n.mo25409w0(runnable);
    }

    /* renamed from: x0 */
    public final boolean mo25410x0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (f15287k.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C7782k) {
                C7782k kVar = (C7782k) obj;
                int a = kVar.mo25454a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    f15287k.compareAndSet(this, obj, kVar.mo25458e());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C7749o0.f15295b) {
                return false;
            } else {
                C7782k kVar2 = new C7782k(8, true);
                kVar2.mo25454a((Runnable) obj);
                kVar2.mo25454a(runnable);
                if (f15287k.compareAndSet(this, obj, kVar2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: y0 */
    public boolean mo25411y0() {
        C7771a<C7722g0<?>> aVar = this.f15282j;
        if (!(aVar == null || aVar.f15322b == aVar.f15323c)) {
            return false;
        }
        C7743b bVar = (C7743b) this._delayed;
        if (bVar != null && !bVar.mo25465c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof C7782k) {
            return ((C7782k) obj).mo25457d();
        }
        if (obj == C7749o0.f15295b) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x007e A[EDGE_INSN: B:84:0x007e->B:43:0x007e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo25412z0() {
        /*
            r11 = this;
            boolean r0 = r11.mo25400u0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r11._delayed
            l.a.m0$b r0 = (p416l.p417a.C7741m0.C7743b) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x004c
            boolean r6 = r0.mo25465c()
            if (r6 != 0) goto L_0x004c
            long r6 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            l.a.u1.t r8 = r0.mo25464b()     // Catch:{ all -> 0x0049 }
            if (r8 == 0) goto L_0x0042
            l.a.m0$a r8 = (p416l.p417a.C7741m0.C7742a) r8     // Catch:{ all -> 0x0049 }
            long r9 = r8.f15291i     // Catch:{ all -> 0x0049 }
            long r9 = r6 - r9
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x002f
            r9 = r3
            goto L_0x0030
        L_0x002f:
            r9 = r5
        L_0x0030:
            if (r9 == 0) goto L_0x0037
            boolean r8 = r11.mo25410x0(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x0038
        L_0x0037:
            r8 = r5
        L_0x0038:
            if (r8 == 0) goto L_0x003f
            l.a.u1.t r8 = r0.mo25466d(r5)     // Catch:{ all -> 0x0049 }
            goto L_0x0040
        L_0x003f:
            r8 = r4
        L_0x0040:
            monitor-exit(r0)
            goto L_0x0044
        L_0x0042:
            monitor-exit(r0)
            r8 = r4
        L_0x0044:
            l.a.m0$a r8 = (p416l.p417a.C7741m0.C7742a) r8
            if (r8 == 0) goto L_0x004c
            goto L_0x001c
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004c:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x0051
            goto L_0x007e
        L_0x0051:
            boolean r6 = r0 instanceof p416l.p417a.p419u1.C7782k
            if (r6 == 0) goto L_0x006e
            r6 = r0
            l.a.u1.k r6 = (p416l.p417a.p419u1.C7782k) r6
            java.lang.Object r7 = r6.mo25459f()
            l.a.u1.p r8 = p416l.p417a.p419u1.C7782k.f15343g
            if (r7 == r8) goto L_0x0064
            r4 = r7
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            goto L_0x007e
        L_0x0064:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f15287k
            l.a.u1.k r6 = r6.mo25458e()
            r7.compareAndSet(r11, r0, r6)
            goto L_0x004c
        L_0x006e:
            l.a.u1.p r6 = p416l.p417a.C7749o0.f15295b
            if (r0 != r6) goto L_0x0073
            goto L_0x007e
        L_0x0073:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f15287k
            boolean r6 = r6.compareAndSet(r11, r0, r4)
            if (r6 == 0) goto L_0x004c
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
        L_0x007e:
            if (r4 == 0) goto L_0x0084
            r4.run()
            return r1
        L_0x0084:
            l.a.u1.a<l.a.g0<?>> r0 = r11.f15282j
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x009a
            int r4 = r0.f15322b
            int r0 = r0.f15323c
            if (r4 != r0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r3 = r5
        L_0x0095:
            if (r3 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r3 = r1
            goto L_0x009b
        L_0x009a:
            r3 = r6
        L_0x009b:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a0
            goto L_0x00d8
        L_0x00a0:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x00a5
            goto L_0x00b2
        L_0x00a5:
            boolean r3 = r0 instanceof p416l.p417a.p419u1.C7782k
            if (r3 == 0) goto L_0x00d3
            l.a.u1.k r0 = (p416l.p417a.p419u1.C7782k) r0
            boolean r0 = r0.mo25457d()
            if (r0 != 0) goto L_0x00b2
            goto L_0x00d8
        L_0x00b2:
            java.lang.Object r0 = r11._delayed
            l.a.m0$b r0 = (p416l.p417a.C7741m0.C7743b) r0
            if (r0 == 0) goto L_0x00d7
            monitor-enter(r0)
            l.a.u1.t r3 = r0.mo25464b()     // Catch:{ all -> 0x00d0 }
            monitor-exit(r0)
            l.a.m0$a r3 = (p416l.p417a.C7741m0.C7742a) r3
            if (r3 == 0) goto L_0x00d7
            long r3 = r3.f15291i
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ce
            goto L_0x00d8
        L_0x00ce:
            r1 = r3
            goto L_0x00d8
        L_0x00d0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d3:
            l.a.u1.p r3 = p416l.p417a.C7749o0.f15295b
            if (r0 != r3) goto L_0x00d8
        L_0x00d7:
            r1 = r6
        L_0x00d8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7741m0.mo25412z0():long");
    }
}
