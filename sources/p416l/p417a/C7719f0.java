package p416l.p417a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p416l.p417a.p419u1.C7788o;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u0011"}, mo24462d2 = {"Ll/a/f0;", "T", "Ll/a/u1/o;", "", "state", "Ld/r;", "g", "(Ljava/lang/Object;)V", "L", "U", "()Ljava/lang/Object;", "Ld/v/f;", "context", "Ld/v/d;", "uCont", "<init>", "(Ld/v/f;Ld/v/d;)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.f0 */
public final class C7719f0<T> extends C7788o<T> {

    /* renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15265k = AtomicIntegerFieldUpdater.newUpdater(C7719f0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public C7719f0(C6827f fVar, C6824d<? super T> dVar) {
        super(fVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25300L(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L_0x0016
            if (r0 != r2) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f15265k
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            d.v.d<T> r0 = r4.f15353j
            d.v.d r0 = p005b.p291q.p292a.C5266a.m9986l2(r0)
            d.v.d<T> r1 = r4.f15353j
            java.lang.Object r5 = p005b.p291q.p292a.C5266a.m10047v3(r5, r1)
            r1 = 0
            p416l.p417a.p419u1.C7776f.m14130b(r0, r5, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7719f0.mo25300L(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo25367U() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 2
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f15265k
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            d.v.i.a r0 = p298d.p337v.p338i.C6833a.COROUTINE_SUSPENDED
            return r0
        L_0x0024:
            java.lang.Object r0 = r3.mo25346s()
            java.lang.Object r0 = p416l.p417a.C7714d1.m14023a(r0)
            boolean r1 = r0 instanceof p416l.p417a.C7754q
            if (r1 != 0) goto L_0x0031
            return r0
        L_0x0031:
            l.a.q r0 = (p416l.p417a.C7754q) r0
            java.lang.Throwable r0 = r0.f15306a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7719f0.mo25367U():java.lang.Object");
    }

    /* renamed from: g */
    public void mo25337g(Object obj) {
        mo25300L(obj);
    }
}
