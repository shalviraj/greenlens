package p005b.p096l.p097a.p113c.p145h.p147b;

import p005b.p096l.p097a.p113c.p131e.p140i.C2972u0;

/* renamed from: b.l.a.c.h.b.ca */
public final class C3141ca extends C3129ba {

    /* renamed from: g */
    public final C2972u0 f5454g;

    /* renamed from: h */
    public final /* synthetic */ C3153da f5455h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3141ca(C3153da daVar, String str, int i, C2972u0 u0Var) {
        super(str, i);
        this.f5455h = daVar;
        this.f5454g = u0Var;
    }

    /* renamed from: a */
    public final int mo14120a() {
        return this.f5454g.mo13761t();
    }

    /* renamed from: b */
    public final boolean mo14121b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo14122c() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v15, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0198 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0199  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14155i(java.lang.Long r12, java.lang.Long r13, p005b.p096l.p097a.p113c.p131e.p140i.C2805h2 r14, boolean r15) {
        /*
            r11 = this;
            p005b.p096l.p097a.p113c.p131e.p140i.C2799g9.m4777b()
            b.l.a.c.h.b.da r0 = r11.f5455h
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            java.lang.String r1 = r11.f5329a
            b.l.a.c.h.b.a3<java.lang.Boolean> r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5368Y
            boolean r0 = r0.mo14197r(r1, r2)
            b.l.a.c.e.i.u0 r1 = r11.f5454g
            boolean r1 = r1.mo13764w()
            b.l.a.c.e.i.u0 r2 = r11.f5454g
            boolean r2 = r2.mo13765x()
            b.l.a.c.e.i.u0 r3 = r11.f5454g
            boolean r3 = r3.mo13767z()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x002e
            if (r2 != 0) goto L_0x002e
            if (r3 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r1 = r4
            goto L_0x002f
        L_0x002e:
            r1 = r5
        L_0x002f:
            r2 = 0
            if (r15 == 0) goto L_0x005c
            if (r1 != 0) goto L_0x005c
            b.l.a.c.h.b.da r12 = r11.f5455h
            b.l.a.c.h.b.p4 r12 = r12.f5638a
            b.l.a.c.h.b.o3 r12 = r12.mo14329d()
            b.l.a.c.h.b.m3 r12 = r12.f5807n
            int r13 = r11.f5330b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            b.l.a.c.e.i.u0 r14 = r11.f5454g
            boolean r14 = r14.mo13760s()
            if (r14 == 0) goto L_0x0056
            b.l.a.c.e.i.u0 r14 = r11.f5454g
            int r14 = r14.mo13761t()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
        L_0x0056:
            java.lang.String r14 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r12.mo14416c(r14, r13, r2)
            return r5
        L_0x005c:
            b.l.a.c.e.i.u0 r6 = r11.f5454g
            b.l.a.c.e.i.n0 r6 = r6.mo13763v()
            boolean r7 = r6.mo13508x()
            boolean r8 = r14.mo13367x()
            if (r8 == 0) goto L_0x009e
            boolean r8 = r6.mo13505u()
            if (r8 != 0) goto L_0x0090
            b.l.a.c.h.b.da r6 = r11.f5455h
            b.l.a.c.h.b.p4 r6 = r6.f5638a
            b.l.a.c.h.b.o3 r6 = r6.mo14329d()
            b.l.a.c.h.b.m3 r6 = r6.f5802i
            b.l.a.c.h.b.da r7 = r11.f5455h
            b.l.a.c.h.b.p4 r7 = r7.f5638a
            b.l.a.c.h.b.j3 r7 = r7.mo14468u()
            java.lang.String r8 = r14.mo13364u()
            java.lang.String r7 = r7.mo14323r(r8)
            java.lang.String r8 = "No number filter for long property. property"
            goto L_0x017e
        L_0x0090:
            long r8 = r14.mo13368y()
            b.l.a.c.e.i.s0 r2 = r6.mo13506v()
            java.lang.Boolean r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3129ba.m5862f(r8, r2)
            goto L_0x015d
        L_0x009e:
            boolean r8 = r14.mo13369z()
            if (r8 == 0) goto L_0x00df
            boolean r8 = r6.mo13505u()
            if (r8 != 0) goto L_0x00c8
            b.l.a.c.h.b.da r6 = r11.f5455h
            b.l.a.c.h.b.p4 r6 = r6.f5638a
            b.l.a.c.h.b.o3 r6 = r6.mo14329d()
            b.l.a.c.h.b.m3 r6 = r6.f5802i
            b.l.a.c.h.b.da r7 = r11.f5455h
            b.l.a.c.h.b.p4 r7 = r7.f5638a
            b.l.a.c.h.b.j3 r7 = r7.mo14468u()
            java.lang.String r8 = r14.mo13364u()
            java.lang.String r7 = r7.mo14323r(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L_0x017e
        L_0x00c8:
            double r8 = r14.mo13361A()
            b.l.a.c.e.i.s0 r6 = r6.mo13506v()
            java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x015d }
            r10.<init>(r8)     // Catch:{ NumberFormatException -> 0x015d }
            double r8 = java.lang.Math.ulp(r8)     // Catch:{ NumberFormatException -> 0x015d }
            java.lang.Boolean r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3129ba.m5864h(r10, r6, r8)     // Catch:{ NumberFormatException -> 0x015d }
            goto L_0x015d
        L_0x00df:
            boolean r8 = r14.mo13365v()
            if (r8 == 0) goto L_0x0162
            boolean r8 = r6.mo13503s()
            if (r8 != 0) goto L_0x0149
            boolean r8 = r6.mo13505u()
            if (r8 != 0) goto L_0x010e
            b.l.a.c.h.b.da r6 = r11.f5455h
            b.l.a.c.h.b.p4 r6 = r6.f5638a
            b.l.a.c.h.b.o3 r6 = r6.mo14329d()
            b.l.a.c.h.b.m3 r6 = r6.f5802i
            b.l.a.c.h.b.da r7 = r11.f5455h
            b.l.a.c.h.b.p4 r7 = r7.f5638a
            b.l.a.c.h.b.j3 r7 = r7.mo14468u()
            java.lang.String r8 = r14.mo13364u()
            java.lang.String r7 = r7.mo14323r(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L_0x017e
        L_0x010e:
            java.lang.String r8 = r14.mo13366w()
            boolean r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6204z(r8)
            if (r8 == 0) goto L_0x0125
            java.lang.String r2 = r14.mo13366w()
            b.l.a.c.e.i.s0 r6 = r6.mo13506v()
            java.lang.Boolean r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3129ba.m5863g(r2, r6)
            goto L_0x015d
        L_0x0125:
            b.l.a.c.h.b.da r6 = r11.f5455h
            b.l.a.c.h.b.p4 r6 = r6.f5638a
            b.l.a.c.h.b.o3 r6 = r6.mo14329d()
            b.l.a.c.h.b.m3 r6 = r6.f5802i
            b.l.a.c.h.b.da r7 = r11.f5455h
            b.l.a.c.h.b.p4 r7 = r7.f5638a
            b.l.a.c.h.b.j3 r7 = r7.mo14468u()
            java.lang.String r8 = r14.mo13364u()
            java.lang.String r7 = r7.mo14323r(r8)
            java.lang.String r8 = r14.mo13366w()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo14416c(r9, r7, r8)
            goto L_0x0181
        L_0x0149:
            java.lang.String r2 = r14.mo13366w()
            b.l.a.c.e.i.y0 r6 = r6.mo13504t()
            b.l.a.c.h.b.da r8 = r11.f5455h
            b.l.a.c.h.b.p4 r8 = r8.f5638a
            b.l.a.c.h.b.o3 r8 = r8.mo14329d()
            java.lang.Boolean r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3129ba.m5861e(r2, r6, r8)
        L_0x015d:
            java.lang.Boolean r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3129ba.m5860d(r2, r7)
            goto L_0x0181
        L_0x0162:
            b.l.a.c.h.b.da r6 = r11.f5455h
            b.l.a.c.h.b.p4 r6 = r6.f5638a
            b.l.a.c.h.b.o3 r6 = r6.mo14329d()
            b.l.a.c.h.b.m3 r6 = r6.f5802i
            b.l.a.c.h.b.da r7 = r11.f5455h
            b.l.a.c.h.b.p4 r7 = r7.f5638a
            b.l.a.c.h.b.j3 r7 = r7.mo14468u()
            java.lang.String r8 = r14.mo13364u()
            java.lang.String r7 = r7.mo14323r(r8)
            java.lang.String r8 = "User property has no value, property"
        L_0x017e:
            r6.mo14415b(r8, r7)
        L_0x0181:
            b.l.a.c.h.b.da r6 = r11.f5455h
            b.l.a.c.h.b.p4 r6 = r6.f5638a
            b.l.a.c.h.b.o3 r6 = r6.mo14329d()
            b.l.a.c.h.b.m3 r6 = r6.f5807n
            if (r2 != 0) goto L_0x0190
            java.lang.String r7 = "null"
            goto L_0x0191
        L_0x0190:
            r7 = r2
        L_0x0191:
            java.lang.String r8 = "Property filter result"
            r6.mo14415b(r8, r7)
            if (r2 != 0) goto L_0x0199
            return r4
        L_0x0199:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r11.f5331c = r4
            if (r3 == 0) goto L_0x01a7
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01a6
            goto L_0x01a7
        L_0x01a6:
            return r5
        L_0x01a7:
            if (r15 == 0) goto L_0x01b1
            b.l.a.c.e.i.u0 r15 = r11.f5454g
            boolean r15 = r15.mo13764w()
            if (r15 == 0) goto L_0x01b3
        L_0x01b1:
            r11.f5332d = r2
        L_0x01b3:
            boolean r15 = r2.booleanValue()
            if (r15 == 0) goto L_0x01f8
            if (r1 == 0) goto L_0x01f8
            boolean r15 = r14.mo13362s()
            if (r15 == 0) goto L_0x01f8
            long r14 = r14.mo13363t()
            if (r12 == 0) goto L_0x01cb
            long r14 = r12.longValue()
        L_0x01cb:
            if (r0 == 0) goto L_0x01e3
            b.l.a.c.e.i.u0 r12 = r11.f5454g
            boolean r12 = r12.mo13764w()
            if (r12 == 0) goto L_0x01e3
            b.l.a.c.e.i.u0 r12 = r11.f5454g
            boolean r12 = r12.mo13765x()
            if (r12 != 0) goto L_0x01e3
            if (r13 == 0) goto L_0x01e3
            long r14 = r13.longValue()
        L_0x01e3:
            b.l.a.c.e.i.u0 r12 = r11.f5454g
            boolean r12 = r12.mo13765x()
            if (r12 == 0) goto L_0x01f2
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11.f5334f = r12
            goto L_0x01f8
        L_0x01f2:
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11.f5333e = r12
        L_0x01f8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3141ca.mo14155i(java.lang.Long, java.lang.Long, b.l.a.c.e.i.h2, boolean):boolean");
    }
}
