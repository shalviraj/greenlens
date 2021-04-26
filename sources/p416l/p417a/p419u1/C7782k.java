package p416l.p417a.p419u1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0000\u0018\u0000 \u001a*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\b\u0004B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u000f\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005R\u0013\u0010\u0012\u001a\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u001b"}, mo24462d2 = {"Ll/a/u1/k;", "", "E", "", "b", "()Z", "element", "", "a", "(Ljava/lang/Object;)I", "f", "()Ljava/lang/Object;", "e", "()Ll/a/u1/k;", "d", "isEmpty", "c", "()I", "size", "I", "mask", "Z", "singleConsumer", "capacity", "<init>", "(IZ)V", "h", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.u1.k */
public final class C7782k<E> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15341e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f15342f;

    /* renamed from: g */
    public static final C7789p f15343g = new C7789p("REMOVE_FROZEN");

    /* renamed from: h */
    public static final C7783a f15344h = new C7783a((DefaultConstructorMarker) null);
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f15345a;

    /* renamed from: b */
    public /* synthetic */ AtomicReferenceArray f15346b;

    /* renamed from: c */
    public final int f15347c;

    /* renamed from: d */
    public final boolean f15348d;

    /* renamed from: l.a.u1.k$a */
    public static final class C7783a {
        public C7783a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: l.a.u1.k$b */
    public static final class C7784b {

        /* renamed from: a */
        public final int f15349a;

        public C7784b(int i) {
            this.f15349a = i;
        }
    }

    static {
        Class<C7782k> cls = C7782k.class;
        f15341e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f15342f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C7782k(int i, boolean z) {
        this.f15347c = i;
        this.f15348d = z;
        int i2 = i - 1;
        this.f15345a = i2;
        this.f15346b = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final int mo25454a(E e) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f15345a;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f15348d || this.f15346b.get(i2 & i3) == null) {
                if (f15342f.compareAndSet(this, j, (-1152921503533105153L & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    this.f15346b.set(i2 & i3, e);
                    C7782k kVar = this;
                    while ((kVar._state & 1152921504606846976L) != 0) {
                        kVar = kVar.mo25458e();
                        Object obj = kVar.f15346b.get(kVar.f15345a & i2);
                        if (!(obj instanceof C7784b) || ((C7784b) obj).f15349a != i2) {
                            kVar = null;
                            continue;
                        } else {
                            kVar.f15346b.set(kVar.f15345a & i2, e);
                            continue;
                        }
                        if (kVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i4 = this.f15347c;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    /* renamed from: b */
    public final boolean mo25455b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f15342f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: c */
    public final int mo25456c() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: d */
    public final boolean mo25457d() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p416l.p417a.p419u1.C7782k<E> mo25458e() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f15342f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            l.a.u1.k r0 = (p416l.p417a.p419u1.C7782k) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f15341e
            r1 = 0
            l.a.u1.k r4 = new l.a.u1.k
            int r5 = r10.f15347c
            int r5 = r5 * 2
            boolean r6 = r10.f15348d
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r2
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
        L_0x0040:
            int r7 = r10.f15345a
            r8 = r5 & r7
            r7 = r7 & r6
            if (r8 == r7) goto L_0x0060
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f15346b
            java.lang.Object r7 = r7.get(r8)
            if (r7 == 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            l.a.u1.k$b r7 = new l.a.u1.k$b
            r7.<init>(r5)
        L_0x0055:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.f15346b
            int r9 = r4.f15345a
            r9 = r9 & r5
            r8.set(r9, r7)
            int r5 = r5 + 1
            goto L_0x0040
        L_0x0060:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
            r0.compareAndSet(r10, r1, r4)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.p419u1.C7782k.mo25458e():l.a.u1.k");
    }

    /* renamed from: f */
    public final Object mo25459f() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f15343g;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.f15345a;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.f15346b.get(i4);
            if (obj == null) {
                if (this.f15348d) {
                    return null;
                }
            } else if (obj instanceof C7784b) {
                return null;
            } else {
                long j2 = ((long) ((i + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f15342f.compareAndSet(this, j, (j & -1073741824) | j2)) {
                    this.f15346b.set(this.f15345a & i, (Object) null);
                    return obj2;
                } else if (this.f15348d) {
                    C7782k kVar = this;
                    while (true) {
                        long j3 = kVar._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            kVar = kVar.mo25458e();
                        } else {
                            if (f15342f.compareAndSet(kVar, j3, (j3 & -1073741824) | j2)) {
                                kVar.f15346b.set(kVar.f15345a & i5, (Object) null);
                                kVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (kVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
