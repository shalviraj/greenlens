package p435n;

import p298d.p344x.p346c.C6888i;

/* renamed from: n.s */
public final class C8057s implements C8030a0 {

    /* renamed from: g */
    public final C8040e f16170g;

    /* renamed from: h */
    public C8061v f16171h;

    /* renamed from: i */
    public int f16172i;

    /* renamed from: j */
    public boolean f16173j;

    /* renamed from: k */
    public long f16174k;

    /* renamed from: l */
    public final C8043g f16175l;

    public C8057s(C8043g gVar) {
        C6888i.m12438e(gVar, "upstream");
        this.f16175l = gVar;
        C8040e c = gVar.mo25901c();
        this.f16170g = c;
        C8061v vVar = c.f16139g;
        this.f16171h = vVar;
        this.f16172i = vVar != null ? vVar.f16184b : -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r6.f16184b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo17031T(p435n.C8040e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            p298d.p344x.p346c.C6888i.m12438e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L_0x000f
            r5 = r4
            goto L_0x0010
        L_0x000f:
            r5 = r3
        L_0x0010:
            if (r5 == 0) goto L_0x0085
            boolean r5 = r8.f16173j
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0079
            n.v r5 = r8.f16171h
            if (r5 == 0) goto L_0x002a
            n.e r6 = r8.f16170g
            n.v r6 = r6.f16139g
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f16172i
            p298d.p344x.p346c.C6888i.m12436c(r6)
            int r6 = r6.f16184b
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r3 = r4
        L_0x002b:
            if (r3 == 0) goto L_0x006d
            if (r2 != 0) goto L_0x0030
            return r0
        L_0x0030:
            n.g r0 = r8.f16175l
            long r1 = r8.f16174k
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo25935t(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            n.v r0 = r8.f16171h
            if (r0 != 0) goto L_0x0053
            n.e r0 = r8.f16170g
            n.v r0 = r0.f16139g
            if (r0 == 0) goto L_0x0053
            r8.f16171h = r0
            p298d.p344x.p346c.C6888i.m12436c(r0)
            int r0 = r0.f16184b
            r8.f16172i = r0
        L_0x0053:
            n.e r0 = r8.f16170g
            long r0 = r0.f16140h
            long r2 = r8.f16174k
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            n.e r2 = r8.f16170g
            long r4 = r8.f16174k
            r3 = r9
            r6 = r10
            r2.mo25946z(r3, r4, r6)
            long r0 = r8.f16174k
            long r0 = r0 + r10
            r8.f16174k = r0
            return r10
        L_0x006d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0079:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0085:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = p005b.p035e.p036a.p037a.C0843a.m448i(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p435n.C8057s.mo17031T(n.e, long):long");
    }

    public void close() {
        this.f16173j = true;
    }

    /* renamed from: f */
    public C8034b0 mo17035f() {
        return this.f16175l.mo17035f();
    }
}
