package p005b.p096l.p097a.p113c.p131e.p136e;

import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.a.c.e.e.bj */
public final class C2066bj<ResultT, CallbackT> {

    /* renamed from: a */
    public final C2091cj<ResultT, CallbackT> f3651a;

    /* renamed from: b */
    public final C3429i<ResultT> f3652b;

    public C2066bj(C2091cj<ResultT, CallbackT> cjVar, C3429i<ResultT> iVar) {
        this.f3651a = cjVar;
        this.f3652b = iVar;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [b.l.d.o.p] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12434a(ResultT r13, com.google.android.gms.common.api.Status r14) {
        /*
            r12 = this;
            b.l.a.c.j.i<ResultT> r0 = r12.f3652b
            java.lang.String r1 = "completion source cannot be null"
            p005b.p006a.p007a.p024o.C0823f.m380l(r0, r1)
            if (r14 == 0) goto L_0x011e
            b.l.a.c.e.e.cj<ResultT, CallbackT> r13 = r12.f3651a
            b.l.a.c.e.e.qe r0 = r13.f3687m
            if (r0 == 0) goto L_0x00d1
            b.l.a.c.j.i<ResultT> r14 = r12.f3652b
            b.l.d.d r13 = r13.f3677c
            com.google.firebase.auth.FirebaseAuth r13 = com.google.firebase.auth.FirebaseAuth.getInstance(r13)
            b.l.a.c.e.e.cj<ResultT, CallbackT> r0 = r12.f3651a
            b.l.a.c.e.e.qe r1 = r0.f3687m
            java.lang.String r0 = r0.mo12391a()
            java.lang.String r2 = "reauthenticateWithCredential"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0038
            b.l.a.c.e.e.cj<ResultT, CallbackT> r0 = r12.f3651a
            java.lang.String r0 = r0.mo12391a()
            java.lang.String r2 = "reauthenticateWithCredentialWithData"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x003c
        L_0x0038:
            b.l.a.c.e.e.cj<ResultT, CallbackT> r0 = r12.f3651a
            b.l.d.o.p r0 = r0.f3678d
        L_0x003c:
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.f3674a
            java.util.Objects.requireNonNull(r13)
            java.util.Objects.requireNonNull(r1)
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.f3674a
            r3 = 17078(0x42b6, float:2.3931E-41)
            java.lang.Object r2 = r2.get(r3)
            android.util.Pair r2 = (android.util.Pair) r2
            b.l.d.o.k r3 = new b.l.d.o.k
            java.lang.Object r4 = r2.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            java.util.List<b.l.a.c.e.e.qk> r5 = r1.f4233h
            java.util.List r5 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2721I1(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0069:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r5.next()
            b.l.d.o.t r6 = (p005b.p096l.p180d.p185o.C3930t) r6
            boolean r8 = r6 instanceof p005b.p096l.p180d.p185o.C3940y
            if (r8 == 0) goto L_0x0069
            b.l.d.o.y r6 = (p005b.p096l.p180d.p185o.C3940y) r6
            r7.add(r6)
            goto L_0x0069
        L_0x007f:
            java.util.List<b.l.a.c.e.e.qk> r5 = r1.f4233h
            java.util.List r5 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2721I1(r5)
            java.lang.String r6 = r1.f4232g
            p005b.p006a.p007a.p024o.C0823f.m376j(r6)
            b.l.d.o.e0.g r8 = new b.l.d.o.e0.g
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.f7133i = r9
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x009c:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00b4
            java.lang.Object r9 = r5.next()
            b.l.d.o.t r9 = (p005b.p096l.p180d.p185o.C3930t) r9
            boolean r10 = r9 instanceof p005b.p096l.p180d.p185o.C3940y
            if (r10 == 0) goto L_0x009c
            java.util.List<b.l.d.o.y> r10 = r8.f7133i
            b.l.d.o.y r9 = (p005b.p096l.p180d.p185o.C3940y) r9
            r10.add(r9)
            goto L_0x009c
        L_0x00b4:
            r8.f7132h = r6
            b.l.d.o.e0.e r5 = new b.l.d.o.e0.e
            b.l.d.d r13 = r13.f11415a
            r13.mo15344a()
            java.lang.String r9 = r13.f7043b
            b.l.d.o.n0 r10 = r1.f4234i
            r11 = r0
            b.l.d.o.e0.j0 r11 = (p005b.p096l.p180d.p185o.p189e0.C3883j0) r11
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r3.<init>(r4, r2, r5)
            b.l.a.c.j.e0<TResult> r13 = r14.f6197a
            r13.mo14694p(r3)
            return
        L_0x00d1:
            b.l.d.o.c r13 = r13.f3684j
            if (r13 == 0) goto L_0x0112
            b.l.a.c.j.i<ResultT> r13 = r12.f3652b
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.f3674a
            int r0 = r14.f11283h
            r1 = 17012(0x4274, float:2.3839E-41)
            if (r0 == r1) goto L_0x00ed
            r1 = 17007(0x426f, float:2.3832E-41)
            if (r0 == r1) goto L_0x00ed
            r1 = 17025(0x4281, float:2.3857E-41)
            if (r0 != r1) goto L_0x00e8
            goto L_0x00ed
        L_0x00e8:
            b.l.d.i r14 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.m3151a(r14)
            goto L_0x010c
        L_0x00ed:
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.f3674a
            java.lang.Object r1 = r1.get(r0)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 == 0) goto L_0x00fc
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00fe
        L_0x00fc:
            java.lang.String r1 = "An internal error has occurred."
        L_0x00fe:
            java.lang.String r14 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.m3152b(r1, r14)
            b.l.d.o.m r1 = new b.l.d.o.m
            java.lang.String r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.m3153c(r0)
            r1.<init>(r0, r14)
            r14 = r1
        L_0x010c:
            b.l.a.c.j.e0<TResult> r13 = r13.f6197a
            r13.mo14694p(r14)
            return
        L_0x0112:
            b.l.a.c.j.i<ResultT> r13 = r12.f3652b
            b.l.d.i r14 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.m3151a(r14)
            b.l.a.c.j.e0<TResult> r13 = r13.f6197a
            r13.mo14694p(r14)
            return
        L_0x011e:
            b.l.a.c.j.i<ResultT> r14 = r12.f3652b
            b.l.a.c.j.e0<TResult> r14 = r14.f6197a
            r14.mo14695q(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2066bj.mo12434a(java.lang.Object, com.google.android.gms.common.api.Status):void");
    }
}
