package p416l.p417a;

import p005b.p291q.p292a.C5266a;
import p298d.p337v.C6824d;
import p298d.p344x.p346c.C6888i;
import p416l.p417a.p420v1.C7810i;

/* renamed from: l.a.g0 */
public abstract class C7722g0<T> extends C7810i {

    /* renamed from: i */
    public int f15271i;

    public C7722g0(int i) {
        this.f15271i = i;
    }

    /* renamed from: b */
    public void mo25368b(Object obj, Throwable th) {
    }

    /* renamed from: d */
    public abstract C6824d<T> mo25369d();

    /* renamed from: e */
    public Throwable mo25370e(Object obj) {
        if (!(obj instanceof C7754q)) {
            obj = null;
        }
        C7754q qVar = (C7754q) obj;
        if (qVar != null) {
            return qVar.f15306a;
        }
        return null;
    }

    /* renamed from: f */
    public <T> T mo25371f(Object obj) {
        return obj;
    }

    /* renamed from: g */
    public final void mo25385g(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C5266a.m10007p(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C6888i.m12436c(th);
            C5266a.m9904X1(mo25369d().getContext(), new C7700a0("Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: h */
    public abstract Object mo25372h();

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r4.mo25428U() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        if (r4.mo25428U() != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            l.a.v1.j r0 = r10.f15412h
            d.v.d r1 = r10.mo25369d()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x008f
            l.a.u1.e r1 = (p416l.p417a.p419u1.C7775e) r1     // Catch:{ all -> 0x0097 }
            d.v.d<T> r2 = r1.f15331m     // Catch:{ all -> 0x0097 }
            java.lang.Object r1 = r1.f15329k     // Catch:{ all -> 0x0097 }
            d.v.f r3 = r2.getContext()     // Catch:{ all -> 0x0097 }
            java.lang.Object r1 = p416l.p417a.p419u1.C7791r.m14156b(r3, r1)     // Catch:{ all -> 0x0097 }
            l.a.u1.p r4 = p416l.p417a.p419u1.C7791r.f15356a     // Catch:{ all -> 0x0097 }
            r5 = 0
            if (r1 == r4) goto L_0x0020
            l.a.q1 r4 = p416l.p417a.C7769u.m14115b(r2, r3, r1)     // Catch:{ all -> 0x0097 }
            goto L_0x0021
        L_0x0020:
            r4 = r5
        L_0x0021:
            d.v.f r6 = r2.getContext()     // Catch:{ all -> 0x0082 }
            java.lang.Object r7 = r10.mo25372h()     // Catch:{ all -> 0x0082 }
            java.lang.Throwable r8 = r10.mo25370e(r7)     // Catch:{ all -> 0x0082 }
            if (r8 != 0) goto L_0x0040
            int r9 = r10.f15271i     // Catch:{ all -> 0x0082 }
            boolean r9 = p005b.p291q.p292a.C5266a.m10010p2(r9)     // Catch:{ all -> 0x0082 }
            if (r9 == 0) goto L_0x0040
            l.a.x0$a r9 = p416l.p417a.C7819x0.f15427f     // Catch:{ all -> 0x0082 }
            d.v.f$a r6 = r6.get(r9)     // Catch:{ all -> 0x0082 }
            l.a.x0 r6 = (p416l.p417a.C7819x0) r6     // Catch:{ all -> 0x0082 }
            goto L_0x0041
        L_0x0040:
            r6 = r5
        L_0x0041:
            if (r6 == 0) goto L_0x0058
            boolean r9 = r6.mo25307d()     // Catch:{ all -> 0x0082 }
            if (r9 != 0) goto L_0x0058
            java.util.concurrent.CancellationException r6 = r6.mo25334S()     // Catch:{ all -> 0x0082 }
            r10.mo25368b(r7, r6)     // Catch:{ all -> 0x0082 }
            java.lang.Object r6 = p005b.p291q.p292a.C5266a.m10038u0(r6)     // Catch:{ all -> 0x0082 }
        L_0x0054:
            r2.mo24166c(r6)     // Catch:{ all -> 0x0082 }
            goto L_0x0064
        L_0x0058:
            if (r8 == 0) goto L_0x005f
            java.lang.Object r6 = p005b.p291q.p292a.C5266a.m10038u0(r8)     // Catch:{ all -> 0x0082 }
            goto L_0x0054
        L_0x005f:
            java.lang.Object r6 = r10.mo25371f(r7)     // Catch:{ all -> 0x0082 }
            goto L_0x0054
        L_0x0064:
            d.r r2 = p298d.C6777r.f13694a     // Catch:{ all -> 0x0082 }
            if (r4 == 0) goto L_0x006e
            boolean r4 = r4.mo25428U()     // Catch:{ all -> 0x0097 }
            if (r4 == 0) goto L_0x0071
        L_0x006e:
            p416l.p417a.p419u1.C7791r.m14155a(r3, r1)     // Catch:{ all -> 0x0097 }
        L_0x0071:
            r0.mo25496H()     // Catch:{ all -> 0x0075 }
            goto L_0x007a
        L_0x0075:
            r0 = move-exception
            java.lang.Object r2 = p005b.p291q.p292a.C5266a.m10038u0(r0)
        L_0x007a:
            java.lang.Throwable r0 = p298d.C6769k.m12309a(r2)
            r10.mo25385g(r5, r0)
            goto L_0x00aa
        L_0x0082:
            r2 = move-exception
            if (r4 == 0) goto L_0x008b
            boolean r4 = r4.mo25428U()     // Catch:{ all -> 0x0097 }
            if (r4 == 0) goto L_0x008e
        L_0x008b:
            p416l.p417a.p419u1.C7791r.m14155a(r3, r1)     // Catch:{ all -> 0x0097 }
        L_0x008e:
            throw r2     // Catch:{ all -> 0x0097 }
        L_0x008f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>"
            r1.<init>(r2)     // Catch:{ all -> 0x0097 }
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            r0.mo25496H()     // Catch:{ all -> 0x009e }
            d.r r0 = p298d.C6777r.f13694a     // Catch:{ all -> 0x009e }
            goto L_0x00a3
        L_0x009e:
            r0 = move-exception
            java.lang.Object r0 = p005b.p291q.p292a.C5266a.m10038u0(r0)
        L_0x00a3:
            java.lang.Throwable r0 = p298d.C6769k.m12309a(r0)
            r10.mo25385g(r1, r0)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7722g0.run():void");
    }
}
