package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import p005b.p096l.p097a.p151d.p152a.p156c.C3567c;
import p005b.p096l.p097a.p151d.p152a.p159e.C3577b0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

/* renamed from: b.l.a.d.a.b.y0 */
public final class C3560y0 {

    /* renamed from: e */
    public static final C3584f f6620e = new C3584f("ExtractorTaskFinder");

    /* renamed from: a */
    public final C3551v0 f6621a;

    /* renamed from: b */
    public final C3544t f6622b;

    /* renamed from: c */
    public final C3562z f6623c;

    /* renamed from: d */
    public final C3567c f6624d;

    public C3560y0(C3551v0 v0Var, C3544t tVar, C3562z zVar, C3567c cVar) {
        this.f6621a = v0Var;
        this.f6622b = tVar;
        this.f6623c = zVar;
        this.f6624d = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: b.l.a.d.a.b.j1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: b.l.a.d.a.b.j1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: b.l.a.d.a.b.g1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: b.l.a.d.a.b.g1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: b.l.a.d.a.b.v1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: b.l.a.d.a.b.v1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: b.l.a.d.a.b.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: b.l.a.d.a.b.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: b.l.a.d.a.b.x0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: b.l.a.d.a.b.x0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: b.l.a.d.a.b.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: b.l.a.d.a.b.v1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: b.l.a.d.a.b.g1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: b.l.a.d.a.b.j1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: b.l.a.d.a.b.x0} */
    /* JADX WARNING: type inference failed for: r0v53, types: [b.l.a.d.a.b.x0] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
        if (r0 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        f6620e.mo14884b(3, "Found final move task for session %s with pack %s.", new java.lang.Object[]{java.lang.Integer.valueOf(r8.f6552a), r8.f6554c.f6539a});
        r12 = r8.f6552a;
        r9 = r8.f6554c;
        r11 = new p005b.p096l.p097a.p151d.p152a.p154b.C3508j1(r12, r9.f6539a, r8.f6553b, r9.f6540b);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0261 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0384 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0357 A[LOOP:10: B:108:0x0357->B:166:0x0357, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x027b A[Catch:{ IOException -> 0x0105, all -> 0x0401 }] */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p097a.p151d.p152a.p154b.C3557x0 mo14865a() {
        /*
            r33 = this;
            r1 = r33
            b.l.a.d.a.b.v0 r0 = r1.f6621a     // Catch:{ all -> 0x0401 }
            java.util.concurrent.locks.ReentrantLock r0 = r0.f6587f     // Catch:{ all -> 0x0401 }
            r0.lock()     // Catch:{ all -> 0x0401 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0401 }
            r2.<init>()     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.v0 r0 = r1.f6621a     // Catch:{ all -> 0x0401 }
            java.util.Map<java.lang.Integer, b.l.a.d.a.b.s0> r0 = r0.f6586e     // Catch:{ all -> 0x0401 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0401 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0401 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0401 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.s0 r3 = (p005b.p096l.p097a.p151d.p152a.p154b.C3542s0) r3     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r4 = r3.f6554c     // Catch:{ all -> 0x0401 }
            int r4 = r4.f6541c     // Catch:{ all -> 0x0401 }
            boolean r4 = p005b.p096l.p097a.p151d.p152a.p154b.C3484d1.m6660f(r4)     // Catch:{ all -> 0x0401 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x0401 }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0401 }
            r3 = 0
            if (r0 == 0) goto L_0x0043
        L_0x003b:
            b.l.a.d.a.b.v0 r0 = r1.f6621a
            java.util.concurrent.locks.ReentrantLock r0 = r0.f6587f
            r0.unlock()
            return r3
        L_0x0043:
            b.l.a.d.a.c.c r0 = r1.f6624d     // Catch:{ all -> 0x0401 }
            boolean r0 = r0.mo14870a()     // Catch:{ all -> 0x0401 }
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 2
            if (r0 == 0) goto L_0x00b4
            b.l.a.d.a.b.t r0 = r1.f6622b     // Catch:{ all -> 0x0401 }
            java.util.Map r0 = r0.mo14821i()     // Catch:{ all -> 0x0401 }
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x0401 }
        L_0x0059:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0401 }
            if (r9 == 0) goto L_0x00a8
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.s0 r9 = (p005b.p096l.p097a.p151d.p152a.p154b.C3542s0) r9     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r10 = r9.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r10 = r10.f6539a     // Catch:{ all -> 0x0401 }
            r11 = r0
            java.util.HashMap r11 = (java.util.HashMap) r11     // Catch:{ all -> 0x0401 }
            java.lang.Object r10 = r11.get(r10)     // Catch:{ all -> 0x0401 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0401 }
            if (r10 == 0) goto L_0x0059
            b.l.a.d.a.b.r0 r11 = r9.f6554c     // Catch:{ all -> 0x0401 }
            long r11 = r11.f6540b     // Catch:{ all -> 0x0401 }
            long r13 = r10.longValue()     // Catch:{ all -> 0x0401 }
            int r10 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x0059
            b.l.a.d.a.e.f r0 = f6620e     // Catch:{ all -> 0x0401 }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0401 }
            int r10 = r9.f6552a     // Catch:{ all -> 0x0401 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0401 }
            r8[r6] = r10     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r10 = r9.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r10 = r10.f6539a     // Catch:{ all -> 0x0401 }
            r8[r5] = r10     // Catch:{ all -> 0x0401 }
            java.lang.String r10 = "Found promote pack task for session %s with pack %s."
            r0.mo14884b(r4, r10, r8)     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.x0 r0 = new b.l.a.d.a.b.x0     // Catch:{ all -> 0x0401 }
            int r8 = r9.f6552a     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r9 = r9.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r9 = r9.f6539a     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.t r10 = r1.f6622b     // Catch:{ all -> 0x0401 }
            r10.mo14832t(r9)     // Catch:{ all -> 0x0401 }
            r0.<init>(r8, r9, r3)     // Catch:{ all -> 0x0401 }
            goto L_0x00a9
        L_0x00a8:
            r0 = r3
        L_0x00a9:
            if (r0 != 0) goto L_0x00ac
            goto L_0x00b4
        L_0x00ac:
            b.l.a.d.a.b.v0 r2 = r1.f6621a
            java.util.concurrent.locks.ReentrantLock r2 = r2.f6587f
            r2.unlock()
            return r0
        L_0x00b4:
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0401 }
        L_0x00b8:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x0401 }
            if (r8 == 0) goto L_0x0124
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.s0 r8 = (p005b.p096l.p097a.p151d.p152a.p154b.C3542s0) r8     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.t r9 = r1.f6622b     // Catch:{ IOException -> 0x0105 }
            b.l.a.d.a.b.r0 r10 = r8.f6554c     // Catch:{ IOException -> 0x0105 }
            java.lang.String r11 = r10.f6539a     // Catch:{ IOException -> 0x0105 }
            int r12 = r8.f6553b     // Catch:{ IOException -> 0x0105 }
            long r13 = r10.f6540b     // Catch:{ IOException -> 0x0105 }
            int r9 = r9.mo14827o(r11, r12, r13)     // Catch:{ IOException -> 0x0105 }
            b.l.a.d.a.b.r0 r10 = r8.f6554c     // Catch:{ IOException -> 0x0105 }
            java.util.List<b.l.a.d.a.b.t0> r10 = r10.f6543e     // Catch:{ IOException -> 0x0105 }
            int r10 = r10.size()     // Catch:{ IOException -> 0x0105 }
            if (r9 != r10) goto L_0x00b8
            b.l.a.d.a.e.f r0 = f6620e     // Catch:{ all -> 0x0401 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0401 }
            int r10 = r8.f6552a     // Catch:{ all -> 0x0401 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0401 }
            r9[r6] = r10     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r10 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r10 = r10.f6539a     // Catch:{ all -> 0x0401 }
            r9[r5] = r10     // Catch:{ all -> 0x0401 }
            java.lang.String r10 = "Found final move task for session %s with pack %s."
            r0.mo14884b(r4, r10, r9)     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.j1 r0 = new b.l.a.d.a.b.j1     // Catch:{ all -> 0x0401 }
            int r12 = r8.f6552a     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r9 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r13 = r9.f6539a     // Catch:{ all -> 0x0401 }
            int r14 = r8.f6553b     // Catch:{ all -> 0x0401 }
            long r8 = r9.f6540b     // Catch:{ all -> 0x0401 }
            r11 = r0
            r15 = r8
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x0401 }
            goto L_0x0125
        L_0x0105:
            r0 = move-exception
            b.l.a.d.a.b.g0 r2 = new b.l.a.d.a.b.g0     // Catch:{ all -> 0x0401 }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0401 }
            int r4 = r8.f6552a     // Catch:{ all -> 0x0401 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0401 }
            r3[r6] = r4     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r4 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r4 = r4.f6539a     // Catch:{ all -> 0x0401 }
            r3[r5] = r4     // Catch:{ all -> 0x0401 }
            java.lang.String r4 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0401 }
            int r4 = r8.f6552a     // Catch:{ all -> 0x0401 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0401 }
            throw r2     // Catch:{ all -> 0x0401 }
        L_0x0124:
            r0 = r3
        L_0x0125:
            if (r0 != 0) goto L_0x00ac
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0401 }
        L_0x012b:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x0401 }
            if (r8 == 0) goto L_0x01ae
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.s0 r8 = (p005b.p096l.p097a.p151d.p152a.p154b.C3542s0) r8     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r9 = r8.f6554c     // Catch:{ all -> 0x0401 }
            int r9 = r9.f6541c     // Catch:{ all -> 0x0401 }
            boolean r9 = p005b.p096l.p097a.p151d.p152a.p154b.C3484d1.m6660f(r9)     // Catch:{ all -> 0x0401 }
            if (r9 == 0) goto L_0x012b
            b.l.a.d.a.b.r0 r9 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.util.List<b.l.a.d.a.b.t0> r9 = r9.f6543e     // Catch:{ all -> 0x0401 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0401 }
        L_0x0149:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0401 }
            if (r10 == 0) goto L_0x012b
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.t0 r10 = (p005b.p096l.p097a.p151d.p152a.p154b.C3545t0) r10     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.t r11 = r1.f6622b     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r12 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r13 = r12.f6539a     // Catch:{ all -> 0x0401 }
            int r14 = r8.f6553b     // Catch:{ all -> 0x0401 }
            long r5 = r12.f6540b     // Catch:{ all -> 0x0401 }
            java.lang.String r15 = r10.f6568a     // Catch:{ all -> 0x0401 }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r5
            java.io.File r5 = r11.mo14825m(r12, r13, r14, r16)     // Catch:{ all -> 0x0401 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x0401 }
            if (r5 == 0) goto L_0x01ab
            b.l.a.d.a.e.f r0 = f6620e     // Catch:{ all -> 0x0401 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0401 }
            int r6 = r8.f6552a     // Catch:{ all -> 0x0401 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0401 }
            r9 = 0
            r5[r9] = r6     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r6 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r6 = r6.f6539a     // Catch:{ all -> 0x0401 }
            r9 = 1
            r5[r9] = r6     // Catch:{ all -> 0x0401 }
            java.lang.String r6 = r10.f6568a     // Catch:{ all -> 0x0401 }
            r5[r7] = r6     // Catch:{ all -> 0x0401 }
            java.lang.String r6 = "Found merge task for session %s with pack %s and slice %s."
            r0.mo14884b(r4, r6, r5)     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.g1 r0 = new b.l.a.d.a.b.g1     // Catch:{ all -> 0x0401 }
            int r5 = r8.f6552a     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r6 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r9 = r6.f6539a     // Catch:{ all -> 0x0401 }
            int r8 = r8.f6553b     // Catch:{ all -> 0x0401 }
            long r11 = r6.f6540b     // Catch:{ all -> 0x0401 }
            java.lang.String r6 = r10.f6568a     // Catch:{ all -> 0x0401 }
            r19 = r0
            r20 = r5
            r21 = r9
            r22 = r8
            r23 = r11
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0401 }
            goto L_0x01af
        L_0x01ab:
            r5 = 1
            r6 = 0
            goto L_0x0149
        L_0x01ae:
            r0 = r3
        L_0x01af:
            if (r0 != 0) goto L_0x00ac
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0401 }
        L_0x01b5:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0401 }
            if (r5 == 0) goto L_0x023a
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.s0 r5 = (p005b.p096l.p097a.p151d.p152a.p154b.C3542s0) r5     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r6 = r5.f6554c     // Catch:{ all -> 0x0401 }
            int r6 = r6.f6541c     // Catch:{ all -> 0x0401 }
            boolean r6 = p005b.p096l.p097a.p151d.p152a.p154b.C3484d1.m6660f(r6)     // Catch:{ all -> 0x0401 }
            if (r6 == 0) goto L_0x01b5
            b.l.a.d.a.b.r0 r6 = r5.f6554c     // Catch:{ all -> 0x0401 }
            java.util.List<b.l.a.d.a.b.t0> r6 = r6.f6543e     // Catch:{ all -> 0x0401 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0401 }
        L_0x01d3:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0401 }
            if (r8 == 0) goto L_0x01b5
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.t0 r8 = (p005b.p096l.p097a.p151d.p152a.p154b.C3545t0) r8     // Catch:{ all -> 0x0401 }
            boolean r9 = r1.mo14866b(r5, r8)     // Catch:{ all -> 0x0401 }
            if (r9 == 0) goto L_0x01d3
            b.l.a.d.a.b.t r10 = r1.f6622b     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r9 = r5.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r11 = r9.f6539a     // Catch:{ all -> 0x0401 }
            int r12 = r5.f6553b     // Catch:{ all -> 0x0401 }
            long r13 = r9.f6540b     // Catch:{ all -> 0x0401 }
            java.lang.String r15 = r8.f6568a     // Catch:{ all -> 0x0401 }
            java.io.File r9 = r10.mo14824l(r11, r12, r13, r15)     // Catch:{ all -> 0x0401 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x0401 }
            if (r9 == 0) goto L_0x01d3
            b.l.a.d.a.e.f r0 = f6620e     // Catch:{ all -> 0x0401 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0401 }
            int r9 = r5.f6552a     // Catch:{ all -> 0x0401 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0401 }
            r10 = 0
            r6[r10] = r9     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r9 = r5.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r9 = r9.f6539a     // Catch:{ all -> 0x0401 }
            r10 = 1
            r6[r10] = r9     // Catch:{ all -> 0x0401 }
            java.lang.String r9 = r8.f6568a     // Catch:{ all -> 0x0401 }
            r6[r7] = r9     // Catch:{ all -> 0x0401 }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.mo14884b(r4, r9, r6)     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.v1 r0 = new b.l.a.d.a.b.v1     // Catch:{ all -> 0x0401 }
            int r6 = r5.f6552a     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r9 = r5.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r10 = r9.f6539a     // Catch:{ all -> 0x0401 }
            int r5 = r5.f6553b     // Catch:{ all -> 0x0401 }
            long r11 = r9.f6540b     // Catch:{ all -> 0x0401 }
            java.lang.String r9 = r8.f6568a     // Catch:{ all -> 0x0401 }
            java.lang.String r8 = r8.f6569b     // Catch:{ all -> 0x0401 }
            r19 = r0
            r20 = r6
            r21 = r10
            r22 = r5
            r23 = r11
            r25 = r9
            r26 = r8
            r19.<init>(r20, r21, r22, r23, r25, r26)     // Catch:{ all -> 0x0401 }
            goto L_0x023b
        L_0x023a:
            r0 = r3
        L_0x023b:
            if (r0 != 0) goto L_0x00ac
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x0401 }
        L_0x0241:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0401 }
            r6 = 4
            if (r0 == 0) goto L_0x0332
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0401 }
            r8 = r0
            b.l.a.d.a.b.s0 r8 = (p005b.p096l.p097a.p151d.p152a.p154b.C3542s0) r8     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r0 = r8.f6554c     // Catch:{ all -> 0x0401 }
            int r0 = r0.f6541c     // Catch:{ all -> 0x0401 }
            boolean r0 = p005b.p096l.p097a.p151d.p152a.p154b.C3484d1.m6660f(r0)     // Catch:{ all -> 0x0401 }
            if (r0 == 0) goto L_0x0241
            b.l.a.d.a.b.r0 r0 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.util.List<b.l.a.d.a.b.t0> r0 = r0.f6543e     // Catch:{ all -> 0x0401 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0401 }
        L_0x0261:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0401 }
            if (r0 == 0) goto L_0x0241
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0401 }
            r10 = r0
            b.l.a.d.a.b.t0 r10 = (p005b.p096l.p097a.p151d.p152a.p154b.C3545t0) r10     // Catch:{ all -> 0x0401 }
            int r0 = r10.f6573f     // Catch:{ all -> 0x0401 }
            r11 = 1
            if (r0 == r11) goto L_0x0278
            if (r0 != r7) goto L_0x0276
            goto L_0x0278
        L_0x0276:
            r0 = 0
            goto L_0x0279
        L_0x0278:
            r0 = 1
        L_0x0279:
            if (r0 != 0) goto L_0x0261
            b.l.a.d.a.b.s1 r0 = new b.l.a.d.a.b.s1     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.t r11 = r1.f6622b     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r12 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r13 = r12.f6539a     // Catch:{ all -> 0x0401 }
            int r14 = r8.f6553b     // Catch:{ all -> 0x0401 }
            long r3 = r12.f6540b     // Catch:{ all -> 0x0401 }
            java.lang.String r12 = r10.f6568a     // Catch:{ all -> 0x0401 }
            r19 = r0
            r20 = r11
            r21 = r13
            r22 = r14
            r23 = r3
            r25 = r12
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0401 }
            int r0 = r0.mo14812j()     // Catch:{ IOException -> 0x029d }
            goto L_0x02ae
        L_0x029d:
            r0 = move-exception
            r3 = r0
            b.l.a.d.a.e.f r0 = f6620e     // Catch:{ all -> 0x0401 }
            r4 = 1
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0401 }
            r4 = 0
            r11[r4] = r3     // Catch:{ all -> 0x0401 }
            java.lang.String r3 = "Slice checkpoint corrupt, restarting extraction. %s"
            r4 = 6
            r0.mo14884b(r4, r3, r11)     // Catch:{ all -> 0x0401 }
            r0 = 0
        L_0x02ae:
            r3 = -1
            if (r0 == r3) goto L_0x032c
            java.util.List<b.l.a.d.a.b.q0> r3 = r10.f6571d     // Catch:{ all -> 0x0401 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.q0 r3 = (p005b.p096l.p097a.p151d.p152a.p154b.C3535q0) r3     // Catch:{ all -> 0x0401 }
            boolean r3 = r3.f6532a     // Catch:{ all -> 0x0401 }
            if (r3 == 0) goto L_0x032c
            b.l.a.d.a.e.f r3 = f6620e     // Catch:{ all -> 0x0401 }
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0401 }
            int r5 = r10.f6572e     // Catch:{ all -> 0x0401 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0401 }
            r9 = 0
            r4[r9] = r5     // Catch:{ all -> 0x0401 }
            int r5 = r8.f6552a     // Catch:{ all -> 0x0401 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0401 }
            r9 = 1
            r4[r9] = r5     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r5 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r5 = r5.f6539a     // Catch:{ all -> 0x0401 }
            r4[r7] = r5     // Catch:{ all -> 0x0401 }
            java.lang.String r5 = r10.f6568a     // Catch:{ all -> 0x0401 }
            r9 = 3
            r4[r9] = r5     // Catch:{ all -> 0x0401 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0401 }
            r4[r6] = r5     // Catch:{ all -> 0x0401 }
            java.lang.String r5 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r3.mo14884b(r9, r5, r4)     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.z r3 = r1.f6623c     // Catch:{ all -> 0x0401 }
            int r4 = r8.f6552a     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r5 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r5 = r5.f6539a     // Catch:{ all -> 0x0401 }
            java.lang.String r9 = r10.f6568a     // Catch:{ all -> 0x0401 }
            java.io.InputStream r32 = r3.mo14868a(r4, r5, r9, r0)     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.e0 r3 = new b.l.a.d.a.b.e0     // Catch:{ all -> 0x0401 }
            int r4 = r8.f6552a     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r5 = r8.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r9 = r5.f6539a     // Catch:{ all -> 0x0401 }
            int r11 = r8.f6553b     // Catch:{ all -> 0x0401 }
            long r12 = r5.f6540b     // Catch:{ all -> 0x0401 }
            java.lang.String r5 = r10.f6568a     // Catch:{ all -> 0x0401 }
            int r14 = r10.f6572e     // Catch:{ all -> 0x0401 }
            java.util.List<b.l.a.d.a.b.q0> r10 = r10.f6571d     // Catch:{ all -> 0x0401 }
            int r28 = r10.size()     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r8 = r8.f6554c     // Catch:{ all -> 0x0401 }
            long r6 = r8.f6542d     // Catch:{ all -> 0x0401 }
            int r8 = r8.f6541c     // Catch:{ all -> 0x0401 }
            r19 = r3
            r20 = r4
            r21 = r9
            r22 = r11
            r23 = r12
            r25 = r5
            r26 = r14
            r27 = r0
            r29 = r6
            r31 = r8
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x0401 }
            goto L_0x0333
        L_0x032c:
            r3 = 0
            r4 = 3
            r6 = 4
            r7 = 2
            goto L_0x0261
        L_0x0332:
            r3 = 0
        L_0x0333:
            if (r3 != 0) goto L_0x003b
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0401 }
        L_0x0339:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0401 }
            if (r2 == 0) goto L_0x03f3
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.s0 r2 = (p005b.p096l.p097a.p151d.p152a.p154b.C3542s0) r2     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r3 = r2.f6554c     // Catch:{ all -> 0x0401 }
            int r3 = r3.f6541c     // Catch:{ all -> 0x0401 }
            boolean r3 = p005b.p096l.p097a.p151d.p152a.p154b.C3484d1.m6660f(r3)     // Catch:{ all -> 0x0401 }
            if (r3 == 0) goto L_0x0339
            b.l.a.d.a.b.r0 r3 = r2.f6554c     // Catch:{ all -> 0x0401 }
            java.util.List<b.l.a.d.a.b.t0> r3 = r3.f6543e     // Catch:{ all -> 0x0401 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0401 }
        L_0x0357:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0401 }
            if (r4 == 0) goto L_0x0339
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.t0 r4 = (p005b.p096l.p097a.p151d.p152a.p154b.C3545t0) r4     // Catch:{ all -> 0x0401 }
            int r5 = r4.f6573f     // Catch:{ all -> 0x0401 }
            r6 = 1
            if (r5 == r6) goto L_0x036e
            r6 = 2
            if (r5 != r6) goto L_0x036c
            goto L_0x036e
        L_0x036c:
            r5 = 0
            goto L_0x036f
        L_0x036e:
            r5 = 1
        L_0x036f:
            if (r5 == 0) goto L_0x0357
            java.util.List<b.l.a.d.a.b.q0> r5 = r4.f6571d     // Catch:{ all -> 0x0401 }
            r6 = 0
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.q0 r5 = (p005b.p096l.p097a.p151d.p152a.p154b.C3535q0) r5     // Catch:{ all -> 0x0401 }
            boolean r5 = r5.f6532a     // Catch:{ all -> 0x0401 }
            if (r5 == 0) goto L_0x0357
            boolean r5 = r1.mo14866b(r2, r4)     // Catch:{ all -> 0x0401 }
            if (r5 != 0) goto L_0x0357
            b.l.a.d.a.e.f r0 = f6620e     // Catch:{ all -> 0x0401 }
            r5 = 4
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0401 }
            int r5 = r4.f6573f     // Catch:{ all -> 0x0401 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0401 }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x0401 }
            int r5 = r2.f6552a     // Catch:{ all -> 0x0401 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0401 }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r5 = r2.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r5 = r5.f6539a     // Catch:{ all -> 0x0401 }
            r7 = 2
            r3[r7] = r5     // Catch:{ all -> 0x0401 }
            java.lang.String r5 = r4.f6568a     // Catch:{ all -> 0x0401 }
            r8 = 3
            r3[r8] = r5     // Catch:{ all -> 0x0401 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.mo14884b(r8, r5, r3)     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.z r0 = r1.f6623c     // Catch:{ all -> 0x0401 }
            int r3 = r2.f6552a     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r5 = r2.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r5 = r5.f6539a     // Catch:{ all -> 0x0401 }
            java.lang.String r6 = r4.f6568a     // Catch:{ all -> 0x0401 }
            r9 = 0
            java.io.InputStream r29 = r0.mo14868a(r3, r5, r6, r9)     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.p1 r0 = new b.l.a.d.a.b.p1     // Catch:{ all -> 0x0401 }
            int r3 = r2.f6552a     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r5 = r2.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r5 = r5.f6539a     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.t r6 = r1.f6622b     // Catch:{ all -> 0x0401 }
            int r19 = r6.mo14832t(r5)     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.t r6 = r1.f6622b     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r7 = r2.f6554c     // Catch:{ all -> 0x0401 }
            java.lang.String r7 = r7.f6539a     // Catch:{ all -> 0x0401 }
            long r20 = r6.mo14833u(r7)     // Catch:{ all -> 0x0401 }
            int r6 = r2.f6553b     // Catch:{ all -> 0x0401 }
            b.l.a.d.a.b.r0 r2 = r2.f6554c     // Catch:{ all -> 0x0401 }
            long r7 = r2.f6540b     // Catch:{ all -> 0x0401 }
            int r2 = r4.f6573f     // Catch:{ all -> 0x0401 }
            java.lang.String r9 = r4.f6568a     // Catch:{ all -> 0x0401 }
            long r10 = r4.f6570c     // Catch:{ all -> 0x0401 }
            r16 = r0
            r17 = r3
            r18 = r5
            r22 = r6
            r23 = r7
            r25 = r2
            r26 = r9
            r27 = r10
            r16.<init>(r17, r18, r19, r20, r22, r23, r25, r26, r27, r29)     // Catch:{ all -> 0x0401 }
            goto L_0x03f4
        L_0x03f3:
            r0 = 0
        L_0x03f4:
            if (r0 == 0) goto L_0x03f8
            goto L_0x00ac
        L_0x03f8:
            b.l.a.d.a.b.v0 r0 = r1.f6621a
            java.util.concurrent.locks.ReentrantLock r0 = r0.f6587f
            r0.unlock()
            r2 = 0
            return r2
        L_0x0401:
            r0 = move-exception
            b.l.a.d.a.b.v0 r2 = r1.f6621a
            java.util.concurrent.locks.ReentrantLock r2 = r2.f6587f
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p151d.p152a.p154b.C3560y0.mo14865a():b.l.a.d.a.b.x0");
    }

    /* renamed from: b */
    public final boolean mo14866b(C3542s0 s0Var, C3545t0 t0Var) {
        FileInputStream fileInputStream;
        C3544t tVar = this.f6622b;
        C3539r0 r0Var = s0Var.f6554c;
        File q = tVar.mo14829q(r0Var.f6539a, s0Var.f6553b, r0Var.f6540b, t0Var.f6568a);
        if (!q.exists()) {
            return false;
        }
        try {
            fileInputStream = new FileInputStream(q);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null) {
                C3543s1.f6555h.mo14884b(6, "Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } else if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            C3543s1.f6555h.mo14884b(6, "Could not read checkpoint while checking if extraction finished. %s", new Object[]{e});
            return false;
        } catch (Throwable th) {
            C3577b0.f6643a.mo14880a(th, th);
        }
        throw th;
    }
}
