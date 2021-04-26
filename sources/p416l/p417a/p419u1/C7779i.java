package p416l.p417a.p419u1;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000j\u0002`\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00060\u0000j\u0002`\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00060\u0000j\u0002`\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u000b8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0013\u0010\u0003\u001a\u00020\u00018F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, mo24462d2 = {"Ll/a/u1/i;", "", "Lkotlinx/coroutines/internal/Node;", "next", "Ld/r;", "f", "(Ll/a/u1/i;)V", "Ll/a/u1/m;", "op", "a", "(Ll/a/u1/m;)Ll/a/u1/i;", "", "l", "()Z", "", "toString", "()Ljava/lang/String;", "i", "()Ll/a/u1/i;", "prevNode", "h", "nextNode", "j", "isRemoved", "g", "()Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.u1.i */
public class C7779i {

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15335g;

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15336h;

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15337i;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001e\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, mo24462d2 = {"l/a/u1/i$a", "Ll/a/u1/c;", "Ll/a/u1/i;", "Lkotlinx/coroutines/internal/Node;", "c", "Ll/a/u1/i;", "newNode", "b", "oldNext", "<init>", "(Ll/a/u1/i;)V", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
    /* renamed from: l.a.u1.i$a */
    public static abstract class C7780a extends C7773c<C7779i> {

        /* renamed from: b */
        public C7779i f15338b;

        /* renamed from: c */
        public final C7779i f15339c;

        public C7780a(C7779i iVar) {
            this.f15339c = iVar;
        }

        /* renamed from: b */
        public void mo25436b(Object obj, Object obj2) {
            C7779i iVar = (C7779i) obj;
            boolean z = obj2 == null;
            C7779i iVar2 = z ? this.f15339c : this.f15338b;
            if (iVar2 != null && C7779i.f15335g.compareAndSet(iVar, this, iVar2) && z) {
                C7779i iVar3 = this.f15339c;
                C7779i iVar4 = this.f15338b;
                C6888i.m12436c(iVar4);
                iVar3.mo25445f(iVar4);
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C7779i> cls2 = C7779i.class;
        f15335g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f15336h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f15337i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (f15335g.compareAndSet(r2, r1, ((p416l.p417a.p419u1.C7787n) r3).f15352a) != false) goto L_0x003f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p416l.p417a.p419u1.C7779i mo25444a(p416l.p417a.p419u1.C7786m r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r7 = r6._prev
            l.a.u1.i r7 = (p416l.p417a.p419u1.C7779i) r7
            r0 = 0
            r1 = r7
        L_0x0006:
            r2 = r0
        L_0x0007:
            java.lang.Object r3 = r1._next
            if (r3 != r6) goto L_0x0018
            if (r7 != r1) goto L_0x000e
            return r1
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f15336h
            boolean r7 = r0.compareAndSet(r6, r7, r1)
            if (r7 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r1
        L_0x0018:
            boolean r4 = r6.mo25443j()
            if (r4 == 0) goto L_0x001f
            return r0
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            return r1
        L_0x0022:
            boolean r4 = r3 instanceof p416l.p417a.p419u1.C7786m
            if (r4 == 0) goto L_0x002c
            l.a.u1.m r3 = (p416l.p417a.p419u1.C7786m) r3
            r3.mo25435a(r1)
            goto L_0x0000
        L_0x002c:
            boolean r4 = r3 instanceof p416l.p417a.p419u1.C7787n
            if (r4 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f15335g
            l.a.u1.n r3 = (p416l.p417a.p419u1.C7787n) r3
            l.a.u1.i r3 = r3.f15352a
            boolean r1 = r4.compareAndSet(r2, r1, r3)
            if (r1 != 0) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            r1 = r2
            goto L_0x0006
        L_0x0041:
            java.lang.Object r1 = r1._prev
            l.a.u1.i r1 = (p416l.p417a.p419u1.C7779i) r1
            goto L_0x0007
        L_0x0046:
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            java.util.Objects.requireNonNull(r3, r2)
            r2 = r3
            l.a.u1.i r2 = (p416l.p417a.p419u1.C7779i) r2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.p419u1.C7779i.mo25444a(l.a.u1.m):l.a.u1.i");
    }

    /* renamed from: f */
    public final void mo25445f(C7779i iVar) {
        C7779i iVar2;
        do {
            iVar2 = (C7779i) iVar._prev;
            if (mo25446g() != iVar) {
                return;
            }
        } while (!f15336h.compareAndSet(iVar, iVar2, this));
        if (mo25443j()) {
            iVar.mo25444a((C7786m) null);
        }
    }

    /* renamed from: g */
    public final Object mo25446g() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C7786m)) {
                return obj;
            }
            ((C7786m) obj).mo25435a(this);
        }
    }

    /* renamed from: h */
    public final C7779i mo25447h() {
        C7779i iVar;
        Object g = mo25446g();
        C7787n nVar = (C7787n) (!(g instanceof C7787n) ? null : g);
        if (nVar != null && (iVar = nVar.f15352a) != null) {
            return iVar;
        }
        Objects.requireNonNull(g, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        return (C7779i) g;
    }

    /* renamed from: i */
    public final C7779i mo25448i() {
        C7779i a = mo25444a((C7786m) null);
        if (a == null) {
            Object obj = this._prev;
            while (true) {
                a = (C7779i) obj;
                if (!a.mo25443j()) {
                    break;
                }
                obj = a._prev;
            }
        }
        return a;
    }

    /* renamed from: j */
    public boolean mo25443j() {
        return mo25446g() instanceof C7787n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25449l() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4.mo25446g()
            boolean r1 = r0 instanceof p416l.p417a.p419u1.C7787n
            if (r1 == 0) goto L_0x000d
            l.a.u1.n r0 = (p416l.p417a.p419u1.C7787n) r0
            l.a.u1.i r0 = r0.f15352a
            goto L_0x0037
        L_0x000d:
            if (r0 != r4) goto L_0x0012
            l.a.u1.i r0 = (p416l.p417a.p419u1.C7779i) r0
            goto L_0x0037
        L_0x0012:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            java.util.Objects.requireNonNull(r0, r1)
            r1 = r0
            l.a.u1.i r1 = (p416l.p417a.p419u1.C7779i) r1
            java.lang.Object r2 = r1._removedRef
            l.a.u1.n r2 = (p416l.p417a.p419u1.C7787n) r2
            if (r2 == 0) goto L_0x0021
            goto L_0x002b
        L_0x0021:
            l.a.u1.n r2 = new l.a.u1.n
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f15337i
            r3.lazySet(r1, r2)
        L_0x002b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f15335g
            boolean r0 = r3.compareAndSet(r4, r0, r2)
            if (r0 == 0) goto L_0x0000
            r0 = 0
            r1.mo25444a(r0)
        L_0x0037:
            if (r0 != 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.p419u1.C7779i.mo25449l():boolean");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
