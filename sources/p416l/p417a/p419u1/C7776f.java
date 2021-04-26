package p416l.p417a.p419u1;

import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p344x.p345b.C6862l;

/* renamed from: l.a.u1.f */
public final class C7776f {

    /* renamed from: a */
    public static final C7789p f15332a = new C7789p("UNDEFINED");

    /* renamed from: b */
    public static final C7789p f15333b = new C7789p("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r8.mo25428U() != false) goto L_0x0091;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m14129a(p298d.p337v.C6824d<? super T> r6, java.lang.Object r7, p298d.p344x.p345b.C6862l<? super java.lang.Throwable, p298d.C6777r> r8) {
        /*
            boolean r0 = r6 instanceof p416l.p417a.p419u1.C7775e
            if (r0 == 0) goto L_0x00b6
            l.a.u1.e r6 = (p416l.p417a.p419u1.C7775e) r6
            java.lang.Object r8 = p005b.p291q.p292a.C5266a.m9793D4(r7, r8)
            l.a.w r0 = r6.f15330l
            d.v.f r1 = r6.getContext()
            boolean r0 = r0.mo25425o0(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f15328j = r8
            r6.f15271i = r1
            l.a.w r7 = r6.f15330l
            d.v.f r8 = r6.getContext()
            r7.mo25402n0(r8, r6)
            goto L_0x00b9
        L_0x0026:
            l.a.o1 r0 = p416l.p417a.C7750o1.f15297b
            l.a.l0 r0 = p416l.p417a.C7750o1.m14097a()
            boolean r2 = r0.mo25399t0()
            if (r2 == 0) goto L_0x003b
            r6.f15328j = r8
            r6.f15271i = r1
            r0.mo25396r0(r6)
            goto L_0x00b9
        L_0x003b:
            r0.mo25397s0(r1)
            r2 = 0
            d.v.f r3 = r6.getContext()     // Catch:{ all -> 0x00a9 }
            l.a.x0$a r4 = p416l.p417a.C7819x0.f15427f     // Catch:{ all -> 0x00a9 }
            d.v.f$a r3 = r3.get(r4)     // Catch:{ all -> 0x00a9 }
            l.a.x0 r3 = (p416l.p417a.C7819x0) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x006b
            boolean r4 = r3.mo25307d()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x006b
            java.util.concurrent.CancellationException r3 = r3.mo25334S()     // Catch:{ all -> 0x00a9 }
            boolean r4 = r8 instanceof p416l.p417a.C7757r     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x0062
            l.a.r r8 = (p416l.p417a.C7757r) r8     // Catch:{ all -> 0x00a9 }
            d.x.b.l<java.lang.Throwable, d.r> r8 = r8.f15310b     // Catch:{ all -> 0x00a9 }
            r8.invoke(r3)     // Catch:{ all -> 0x00a9 }
        L_0x0062:
            java.lang.Object r8 = p005b.p291q.p292a.C5266a.m10038u0(r3)     // Catch:{ all -> 0x00a9 }
            r6.mo24166c(r8)     // Catch:{ all -> 0x00a9 }
            r8 = r1
            goto L_0x006c
        L_0x006b:
            r8 = 0
        L_0x006c:
            if (r8 != 0) goto L_0x00a2
            d.v.d<T> r8 = r6.f15331m     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f15329k     // Catch:{ all -> 0x00a9 }
            d.v.f r4 = r8.getContext()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = p416l.p417a.p419u1.C7791r.m14156b(r4, r3)     // Catch:{ all -> 0x00a9 }
            l.a.u1.p r5 = p416l.p417a.p419u1.C7791r.f15356a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0083
            l.a.q1 r8 = p416l.p417a.C7769u.m14115b(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0084
        L_0x0083:
            r8 = r2
        L_0x0084:
            d.v.d<T> r5 = r6.f15331m     // Catch:{ all -> 0x0095 }
            r5.mo24166c(r7)     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.mo25428U()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            p416l.p417a.p419u1.C7791r.m14155a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.mo25428U()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            p416l.p417a.p419u1.C7791r.m14155a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.mo25400u0()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.mo25385g(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.mo25394p0(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.mo25394p0(r1)
            throw r6
        L_0x00b6:
            r6.mo24166c(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.p419u1.C7776f.m14129a(d.v.d, java.lang.Object, d.x.b.l):void");
    }

    /* renamed from: b */
    public static /* synthetic */ void m14130b(C6824d dVar, Object obj, C6862l lVar, int i) {
        int i2 = i & 2;
        m14129a(dVar, obj, (C6862l<? super Throwable, C6777r>) null);
    }
}
