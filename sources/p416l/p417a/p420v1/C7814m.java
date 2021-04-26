package p416l.p417a.p420v1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0004R\u001e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, mo24462d2 = {"Ll/a/v1/m;", "", "Ll/a/v1/i;", "e", "()Ll/a/v1/i;", "task", "", "fair", "a", "(Ll/a/v1/i;Z)Ll/a/v1/i;", "victim", "", "g", "(Ll/a/v1/m;)J", "b", "(Ll/a/v1/i;)Ll/a/v1/i;", "blockingOnly", "h", "(Ll/a/v1/m;Z)J", "f", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "d", "()I", "size", "c", "bufferSize", "<init>", "()V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.v1.m */
public final class C7814m {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15419b;

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15420c;

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15421d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15422e;

    /* renamed from: a */
    public final AtomicReferenceArray<C7810i> f15423a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C7814m> cls = C7814m.class;
        f15419b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f15420c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f15421d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f15422e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: a */
    public final C7810i mo25504a(C7810i iVar, boolean z) {
        if (z) {
            return mo25505b(iVar);
        }
        C7810i iVar2 = (C7810i) f15419b.getAndSet(this, iVar);
        if (iVar2 != null) {
            return mo25505b(iVar2);
        }
        return null;
    }

    /* renamed from: b */
    public final C7810i mo25505b(C7810i iVar) {
        boolean z = true;
        if (iVar.f15412h.mo25499h0() != 1) {
            z = false;
        }
        if (z) {
            f15422e.incrementAndGet(this);
        }
        if (mo25506c() == 127) {
            return iVar;
        }
        int i = this.producerIndex & 127;
        while (this.f15423a.get(i) != null) {
            Thread.yield();
        }
        this.f15423a.lazySet(i, iVar);
        f15420c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    public final int mo25506c() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: d */
    public final int mo25507d() {
        return this.lastScheduledTask != null ? mo25506c() + 1 : mo25506c();
    }

    /* renamed from: e */
    public final C7810i mo25508e() {
        C7810i iVar = (C7810i) f15419b.getAndSet(this, (Object) null);
        return iVar != null ? iVar : mo25509f();
    }

    /* renamed from: f */
    public final C7810i mo25509f() {
        C7810i andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f15421d.compareAndSet(this, i, i + 1) && (andSet = this.f15423a.getAndSet(i2, (Object) null)) != null) {
                boolean z = true;
                if (andSet.f15412h.mo25499h0() != 1) {
                    z = false;
                }
                if (z) {
                    f15422e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* renamed from: g */
    public final long mo25510g(C7814m mVar) {
        int i = mVar.consumerIndex;
        int i2 = mVar.producerIndex;
        AtomicReferenceArray<C7810i> atomicReferenceArray = mVar.f15423a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            C7810i iVar = atomicReferenceArray.get(i3);
            if (iVar != null) {
                if (iVar.f15412h.mo25499h0() != 1) {
                    z = false;
                }
                if (z && atomicReferenceArray.compareAndSet(i3, iVar, (Object) null)) {
                    f15422e.decrementAndGet(mVar);
                    mo25504a(iVar, false);
                    return -1;
                }
            }
            i++;
        }
        return mo25511h(mVar, true);
    }

    /* renamed from: h */
    public final long mo25511h(C7814m mVar, boolean z) {
        C7810i iVar;
        do {
            iVar = (C7810i) mVar.lastScheduledTask;
            if (iVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (iVar.f15412h.mo25499h0() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = C7813l.f15418e.mo25501a() - iVar.f15411g;
            long j = C7813l.f15414a;
            if (a < j) {
                return j - a;
            }
        } while (!f15419b.compareAndSet(mVar, iVar, (Object) null));
        mo25504a(iVar, false);
        return -1;
    }
}
