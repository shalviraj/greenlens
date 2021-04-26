package p421m.p422m0.p427h;

import p421m.C7826a0;

/* renamed from: m.m0.h.b */
public final class C7903b implements C7826a0 {

    /* renamed from: a */
    public final boolean f15753a;

    public C7903b(boolean z) {
        this.f15753a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x022b, code lost:
        if (p298d.p415c0.C7694h.m13928f("close", p421m.C7850h0.m14257d(r0, "Connection", (java.lang.String) null, 2), true) != false) goto L_0x022f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p421m.C7850h0 mo18360a(p421m.C7826a0.C7827a r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "call"
            java.lang.String r2 = "chain"
            p298d.p344x.p346c.C6888i.m12438e(r0, r2)
            m.m0.h.g r0 = (p421m.p422m0.p427h.C7909g) r0
            m.m0.g.c r2 = r0.f15763e
            p298d.p344x.p346c.C6888i.m12436c(r2)
            m.e0 r0 = r0.f15764f
            m.g0 r3 = r0.f15531e
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "request"
            p298d.p344x.p346c.C6888i.m12438e(r0, r6)
            m.u r7 = r2.f15662d     // Catch:{ IOException -> 0x02bb }
            m.m0.g.e r8 = r2.f15661c     // Catch:{ IOException -> 0x02bb }
            java.util.Objects.requireNonNull(r7)     // Catch:{ IOException -> 0x02bb }
            p298d.p344x.p346c.C6888i.m12438e(r8, r1)     // Catch:{ IOException -> 0x02bb }
            m.m0.h.d r7 = r2.f15664f     // Catch:{ IOException -> 0x02bb }
            r7.mo25654b(r0)     // Catch:{ IOException -> 0x02bb }
            m.u r7 = r2.f15662d     // Catch:{ IOException -> 0x02bb }
            m.m0.g.e r8 = r2.f15661c     // Catch:{ IOException -> 0x02bb }
            java.util.Objects.requireNonNull(r7)     // Catch:{ IOException -> 0x02bb }
            p298d.p344x.p346c.C6888i.m12438e(r8, r1)     // Catch:{ IOException -> 0x02bb }
            p298d.p344x.p346c.C6888i.m12438e(r0, r6)     // Catch:{ IOException -> 0x02bb }
            java.lang.String r6 = r0.f15529c
            boolean r6 = p421m.p422m0.p427h.C7908f.m14396a(r6)
            r7 = 0
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L_0x009c
            if (r3 == 0) goto L_0x009c
            java.lang.String r6 = "Expect"
            java.lang.String r6 = r0.mo25533b(r6)
            java.lang.String r10 = "100-continue"
            boolean r6 = p298d.p415c0.C7694h.m13928f(r10, r6, r8)
            if (r6 == 0) goto L_0x006e
            m.m0.h.d r6 = r2.f15664f     // Catch:{ IOException -> 0x0062 }
            r6.mo25655c()     // Catch:{ IOException -> 0x0062 }
            m.h0$a r6 = r2.mo25609c(r8)
            r2.mo25610d()
            r10 = r7
            goto L_0x0070
        L_0x0062:
            r0 = move-exception
            m.u r1 = r2.f15662d
            m.m0.g.e r3 = r2.f15661c
            r1.mo25827b(r3, r0)
            r2.mo25611e(r0)
            throw r0
        L_0x006e:
            r10 = r8
            r6 = r9
        L_0x0070:
            if (r6 != 0) goto L_0x0083
            n.y r8 = r2.mo25608b(r0, r7)
            n.f r8 = p005b.p291q.p292a.C5266a.m9806G(r8)
            r3.mo25544c(r8)
            n.t r8 = (p435n.C8058t) r8
            r8.close()
            goto L_0x0099
        L_0x0083:
            m.m0.g.e r3 = r2.f15661c
            r3.mo25626k(r2, r8, r7, r9)
            m.m0.g.i r3 = r2.f15660b
            boolean r3 = r3.mo25640j()
            if (r3 != 0) goto L_0x0099
            m.m0.h.d r3 = r2.f15664f
            m.m0.g.i r3 = r3.mo25661h()
            r3.mo25642l()
        L_0x0099:
            r9 = r6
            r8 = r10
            goto L_0x00a1
        L_0x009c:
            m.m0.g.e r3 = r2.f15661c
            r3.mo25626k(r2, r8, r7, r9)
        L_0x00a1:
            m.m0.h.d r3 = r2.f15664f     // Catch:{ IOException -> 0x02af }
            r3.mo25653a()     // Catch:{ IOException -> 0x02af }
            if (r9 != 0) goto L_0x00b5
            m.h0$a r9 = r2.mo25609c(r7)
            p298d.p344x.p346c.C6888i.m12436c(r9)
            if (r8 == 0) goto L_0x00b5
            r2.mo25610d()
            r8 = r7
        L_0x00b5:
            r9.mo25564g(r0)
            m.m0.g.i r3 = r2.f15660b
            m.x r3 = r3.f15716d
            r9.f15566e = r3
            r9.f15572k = r4
            long r10 = java.lang.System.currentTimeMillis()
            r9.f15573l = r10
            m.h0 r3 = r9.mo25558a()
            int r6 = r3.f15552j
            r9 = 100
            if (r6 != r9) goto L_0x00f3
            m.h0$a r3 = r2.mo25609c(r7)
            p298d.p344x.p346c.C6888i.m12436c(r3)
            if (r8 == 0) goto L_0x00dc
            r2.mo25610d()
        L_0x00dc:
            r3.mo25564g(r0)
            m.m0.g.i r0 = r2.f15660b
            m.x r0 = r0.f15716d
            r3.f15566e = r0
            r3.f15572k = r4
            long r4 = java.lang.System.currentTimeMillis()
            r3.f15573l = r4
            m.h0 r3 = r3.mo25558a()
            int r6 = r3.f15552j
        L_0x00f3:
            java.lang.String r0 = "response"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            m.u r4 = r2.f15662d
            m.m0.g.e r5 = r2.f15661c
            java.util.Objects.requireNonNull(r4)
            p298d.p344x.p346c.C6888i.m12438e(r5, r1)
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            r1 = r27
            boolean r4 = r1.f15753a
            java.lang.String r5 = "message == null"
            java.lang.String r7 = "protocol == null"
            java.lang.String r8 = "request == null"
            java.lang.String r9 = "code < 0: "
            if (r4 == 0) goto L_0x0198
            r4 = 101(0x65, float:1.42E-43)
            if (r6 != r4) goto L_0x0198
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            m.e0 r11 = r3.f15549g
            m.d0 r12 = r3.f15550h
            int r14 = r3.f15552j
            java.lang.String r13 = r3.f15551i
            m.x r15 = r3.f15553k
            m.y r0 = r3.f15554l
            m.y$a r0 = r0.mo25841n()
            m.h0 r4 = r3.f15556n
            m.h0 r10 = r3.f15557o
            m.h0 r1 = r3.f15558p
            r28 = r8
            r16 = r9
            long r8 = r3.f15559q
            r26 = r6
            r17 = r7
            long r6 = r3.f15560r
            m.m0.g.c r3 = r3.f15561s
            m.j0 r18 = p421m.p422m0.C7867c.f15621c
            if (r14 < 0) goto L_0x0145
            r19 = 1
            goto L_0x0147
        L_0x0145:
            r19 = 0
        L_0x0147:
            if (r19 == 0) goto L_0x0188
            if (r11 == 0) goto L_0x017e
            if (r12 == 0) goto L_0x0174
            if (r13 == 0) goto L_0x016a
            m.y r16 = r0.mo25846b()
            m.h0 r0 = new m.h0
            r5 = r10
            r10 = r0
            r17 = r18
            r18 = r4
            r19 = r5
            r20 = r1
            r21 = r8
            r23 = r6
            r25 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25)
            goto L_0x0210
        L_0x016a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x0174:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x017e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r28.toString()
            r0.<init>(r1)
            throw r0
        L_0x0188:
            r1 = r16
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m444e(r1, r14)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0198:
            r26 = r6
            r17 = r7
            r28 = r8
            r1 = r9
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            m.e0 r4 = r3.f15549g
            m.d0 r6 = r3.f15550h
            int r7 = r3.f15552j
            java.lang.String r8 = r3.f15551i
            m.x r9 = r3.f15553k
            m.y r10 = r3.f15554l
            m.y$a r10 = r10.mo25841n()
            m.h0 r11 = r3.f15556n
            m.h0 r12 = r3.f15557o
            m.h0 r13 = r3.f15558p
            long r14 = r3.f15559q
            r18 = r14
            long r14 = r3.f15560r
            r16 = r1
            m.m0.g.c r1 = r3.f15561s
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            java.lang.String r0 = "Content-Type"
            r20 = r14
            r14 = 2
            r15 = 0
            java.lang.String r0 = p421m.C7850h0.m14257d(r3, r0, r15, r14)     // Catch:{ IOException -> 0x02a3 }
            m.m0.h.d r14 = r2.f15664f     // Catch:{ IOException -> 0x02a3 }
            long r14 = r14.mo25657d(r3)     // Catch:{ IOException -> 0x02a3 }
            r22 = r5
            m.m0.h.d r5 = r2.f15664f     // Catch:{ IOException -> 0x02a3 }
            n.a0 r3 = r5.mo25658e(r3)     // Catch:{ IOException -> 0x02a3 }
            m.m0.g.c$b r5 = new m.m0.g.c$b     // Catch:{ IOException -> 0x02a3 }
            r5.<init>(r2, r3, r14)     // Catch:{ IOException -> 0x02a3 }
            m.m0.h.h r3 = new m.m0.h.h     // Catch:{ IOException -> 0x02a3 }
            n.g r5 = p005b.p291q.p292a.C5266a.m9812H(r5)     // Catch:{ IOException -> 0x02a3 }
            r3.<init>(r0, r14, r5)     // Catch:{ IOException -> 0x02a3 }
            if (r7 < 0) goto L_0x01ef
            r0 = 1
            goto L_0x01f0
        L_0x01ef:
            r0 = 0
        L_0x01f0:
            if (r0 == 0) goto L_0x0293
            if (r4 == 0) goto L_0x0289
            if (r6 == 0) goto L_0x027f
            if (r8 == 0) goto L_0x0275
            m.y r0 = r10.mo25846b()
            m.h0 r22 = new m.h0
            r10 = r3
            r3 = r22
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r0
            r16 = r20
            r14 = r18
            r18 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18)
            r0 = r22
        L_0x0210:
            m.e0 r1 = r0.f15549g
            java.lang.String r3 = "Connection"
            java.lang.String r1 = r1.mo25533b(r3)
            java.lang.String r4 = "close"
            r5 = 1
            boolean r1 = p298d.p415c0.C7694h.m13928f(r4, r1, r5)
            if (r1 != 0) goto L_0x022e
            r1 = 2
            r6 = 0
            java.lang.String r1 = p421m.C7850h0.m14257d(r0, r3, r6, r1)
            boolean r1 = p298d.p415c0.C7694h.m13928f(r4, r1, r5)
            if (r1 == 0) goto L_0x0238
            goto L_0x022f
        L_0x022e:
            r6 = 0
        L_0x022f:
            m.m0.h.d r1 = r2.f15664f
            m.m0.g.i r1 = r1.mo25661h()
            r1.mo25642l()
        L_0x0238:
            r1 = 204(0xcc, float:2.86E-43)
            r2 = r26
            if (r2 == r1) goto L_0x0242
            r1 = 205(0xcd, float:2.87E-43)
            if (r2 != r1) goto L_0x0274
        L_0x0242:
            m.j0 r1 = r0.f15555m
            if (r1 == 0) goto L_0x024b
            long r3 = r1.mo25565d()
            goto L_0x024d
        L_0x024b:
            r3 = -1
        L_0x024d:
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0274
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r3 = "HTTP "
            java.lang.String r4 = " had non-zero Content-Length: "
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m461v(r3, r2, r4)
            m.j0 r0 = r0.f15555m
            if (r0 == 0) goto L_0x0269
            long r3 = r0.mo25565d()
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
        L_0x0269:
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0274:
            return r0
        L_0x0275:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r22.toString()
            r0.<init>(r1)
            throw r0
        L_0x027f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x0289:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r28.toString()
            r0.<init>(r1)
            throw r0
        L_0x0293:
            r0 = r16
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m444e(r0, r7)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02a3:
            r0 = move-exception
            m.u r1 = r2.f15662d
            m.m0.g.e r3 = r2.f15661c
            r1.mo25828c(r3, r0)
            r2.mo25611e(r0)
            throw r0
        L_0x02af:
            r0 = move-exception
            m.u r1 = r2.f15662d
            m.m0.g.e r3 = r2.f15661c
            r1.mo25827b(r3, r0)
            r2.mo25611e(r0)
            throw r0
        L_0x02bb:
            r0 = move-exception
            m.u r1 = r2.f15662d
            m.m0.g.e r3 = r2.f15661c
            r1.mo25827b(r3, r0)
            r2.mo25611e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p427h.C7903b.mo18360a(m.a0$a):m.h0");
    }
}
