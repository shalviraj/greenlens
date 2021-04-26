package p005b.p096l.p097a.p113c.p145h.p147b;

/* renamed from: b.l.a.c.h.b.o4 */
public final class C3270o4 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3293q5 f5808g;

    /* renamed from: h */
    public final /* synthetic */ C3281p4 f5809h;

    public C3270o4(C3281p4 p4Var, C3293q5 q5Var) {
        this.f5809h = p4Var;
        this.f5808g = q5Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0306, code lost:
        if (android.text.TextUtils.isEmpty(r1.f5544l) == false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0461, code lost:
        if (android.text.TextUtils.isEmpty(r1.f5544l) == false) goto L_0x0463;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            b.l.a.c.h.b.p4 r0 = r13.f5809h
            b.l.a.c.h.b.q5 r1 = r13.f5808g
            b.l.a.c.h.b.m4 r2 = r0.mo14331f()
            r2.mo14126h()
            b.l.a.c.h.b.f r2 = r0.f5848g
            b.l.a.c.h.b.p4 r2 = r2.f5638a
            b.l.a.c.h.b.ea r2 = r2.f5847f
            b.l.a.c.h.b.m r2 = new b.l.a.c.h.b.m
            r2.<init>(r0)
            r2.mo14378m()
            r0.f5863v = r2
            b.l.a.c.h.b.g3 r2 = new b.l.a.c.h.b.g3
            long r3 = r1.f5888f
            r2.<init>(r0, r3)
            r2.mo14066j()
            r0.f5864w = r2
            b.l.a.c.h.b.i3 r1 = new b.l.a.c.h.b.i3
            r1.<init>(r0)
            r1.mo14066j()
            r0.f5861t = r1
            b.l.a.c.h.b.f8 r1 = new b.l.a.c.h.b.f8
            r1.<init>(r0)
            r1.mo14066j()
            r0.f5862u = r1
            b.l.a.c.h.b.q9 r1 = r0.f5853l
            r1.mo14379n()
            b.l.a.c.h.b.c4 r1 = r0.f5849h
            r1.mo14379n()
            b.l.a.c.h.b.f4 r1 = new b.l.a.c.h.b.f4
            r1.<init>(r0)
            r0.f5865x = r1
            b.l.a.c.h.b.g3 r1 = r0.f5864w
            boolean r3 = r1.f5256b
            if (r3 != 0) goto L_0x04d3
            r1.mo14240l()
            b.l.a.c.h.b.p4 r3 = r1.f5638a
            java.util.concurrent.atomic.AtomicInteger r3 = r3.f5840G
            r3.incrementAndGet()
            r3 = 1
            r1.f5256b = r3
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5805l
            b.l.a.c.h.b.f r4 = r0.f5848g
            r4.mo14193n()
            r4 = 39065(0x9899, double:1.93007E-319)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "App measurement initialized, version"
            r1.mo14415b(r5, r4)
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5805l
            java.lang.String r4 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r1.mo14414a(r4)
            java.lang.String r1 = r2.mo14241m()
            java.lang.String r2 = r0.f5843b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00c2
            b.l.a.c.h.b.q9 r2 = r0.mo14467t()
            boolean r2 = r2.mo14517H(r1)
            if (r2 == 0) goto L_0x00a3
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5805l
            java.lang.String r2 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            r1.mo14414a(r2)
            goto L_0x00c2
        L_0x00a3:
            b.l.a.c.h.b.o3 r2 = r0.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5805l
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            int r5 = r1.length()
            if (r5 == 0) goto L_0x00ba
            java.lang.String r1 = r4.concat(r1)
            goto L_0x00bf
        L_0x00ba:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L_0x00bf:
            r2.mo14414a(r1)
        L_0x00c2:
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5806m
            java.lang.String r2 = "Debug-level message logging enabled"
            r1.mo14414a(r2)
            int r1 = r0.f5839F
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f5840G
            int r2 = r2.get()
            if (r1 == r2) goto L_0x00f2
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5799f
            int r2 = r0.f5839F
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.atomic.AtomicInteger r4 = r0.f5840G
            int r4 = r4.get()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Not all components initialized"
            r1.mo14416c(r5, r2, r4)
        L_0x00f2:
            r0.f5866y = r3
            b.l.a.c.h.b.p4 r0 = r13.f5809h
            b.l.a.c.h.b.q5 r1 = r13.f5808g
            b.l.a.c.e.i.ec r1 = r1.f5889g
            b.l.a.c.h.b.m4 r2 = r0.mo14331f()
            r2.mo14126h()
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r2 = r0.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5411u0
            r5 = 0
            boolean r2 = r2.mo14197r(r5, r4)
            if (r2 == 0) goto L_0x0221
            b.l.a.c.h.b.c4 r2 = r0.mo14464q()
            b.l.a.c.h.b.g r2 = r2.mo14147s()
            b.l.a.c.h.b.c4 r6 = r0.mo14464q()
            b.l.a.c.h.b.p4 r7 = r6.f5638a
            r6.mo14126h()
            android.content.SharedPreferences r6 = r6.mo14143o()
            r7 = 100
            java.lang.String r8 = "consent_source"
            int r6 = r6.getInt(r8, r7)
            b.l.a.c.h.b.f r8 = r0.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r9 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5413v0
            boolean r8 = r8.mo14197r(r5, r9)
            r10 = 30
            if (r8 == 0) goto L_0x01f2
            b.l.a.c.h.b.f r8 = r0.f5848g
            b.l.a.c.h.b.p4 r11 = r8.f5638a
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            boolean r11 = r8.mo14197r(r5, r9)
            if (r11 != 0) goto L_0x0147
            r8 = r5
            goto L_0x014d
        L_0x0147:
            java.lang.String r11 = "google_analytics_default_allow_ad_storage"
            java.lang.Boolean r8 = r8.mo14199t(r11)
        L_0x014d:
            b.l.a.c.h.b.f r11 = r0.f5848g
            b.l.a.c.h.b.p4 r12 = r11.f5638a
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            boolean r9 = r11.mo14197r(r5, r9)
            if (r9 != 0) goto L_0x015c
            r9 = r5
            goto L_0x0162
        L_0x015c:
            java.lang.String r9 = "google_analytics_default_allow_analytics_storage"
            java.lang.Boolean r9 = r11.mo14199t(r9)
        L_0x0162:
            r11 = -10
            if (r8 != 0) goto L_0x0168
            if (r9 == 0) goto L_0x017a
        L_0x0168:
            b.l.a.c.h.b.c4 r12 = r0.mo14464q()
            boolean r12 = r12.mo14146r(r11)
            if (r12 == 0) goto L_0x017a
            b.l.a.c.h.b.g r1 = new b.l.a.c.h.b.g
            r1.<init>(r8, r9)
            r7 = r11
            goto L_0x01e6
        L_0x017a:
            b.l.a.c.h.b.g3 r8 = r0.mo14457b()
            java.lang.String r8 = r8.mo14242n()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x01a4
            if (r6 == 0) goto L_0x0198
            if (r6 == r10) goto L_0x0198
            r8 = 10
            if (r6 == r8) goto L_0x0198
            if (r6 == r10) goto L_0x0198
            if (r6 == r10) goto L_0x0198
            r8 = 40
            if (r6 != r8) goto L_0x01a4
        L_0x0198:
            b.l.a.c.h.b.q6 r1 = r0.mo14466s()
            b.l.a.c.h.b.g r6 = p005b.p096l.p097a.p113c.p145h.p147b.C3177g.f5529c
            long r8 = r0.f5841H
            r1.mo14512y(r6, r11, r8)
            goto L_0x01e5
        L_0x01a4:
            b.l.a.c.e.i.d9 r6 = p005b.p096l.p097a.p113c.p131e.p140i.C2758d9.f4686h
            b.l.a.c.e.i.e9 r6 = r6.mo13235a()
            r6.mo13300a()
            b.l.a.c.h.b.f r6 = r0.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5347D0
            boolean r6 = r6.mo14197r(r5, r8)
            if (r6 == 0) goto L_0x01c5
            b.l.a.c.h.b.g3 r6 = r0.mo14457b()
            java.lang.String r6 = r6.mo14242n()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x01e5
        L_0x01c5:
            if (r1 == 0) goto L_0x01e5
            android.os.Bundle r6 = r1.f4712m
            if (r6 == 0) goto L_0x01e5
            b.l.a.c.h.b.c4 r6 = r0.mo14464q()
            boolean r6 = r6.mo14146r(r10)
            if (r6 == 0) goto L_0x01e5
            android.os.Bundle r1 = r1.f4712m
            b.l.a.c.h.b.g r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3177g.m5990a(r1)
            b.l.a.c.h.b.g r6 = p005b.p096l.p097a.p113c.p145h.p147b.C3177g.f5529c
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L_0x01e5
            r7 = r10
            goto L_0x01e6
        L_0x01e5:
            r1 = r5
        L_0x01e6:
            if (r1 == 0) goto L_0x021a
            b.l.a.c.h.b.q6 r2 = r0.mo14466s()
            long r8 = r0.f5841H
            r2.mo14512y(r1, r7, r8)
            goto L_0x0219
        L_0x01f2:
            if (r1 == 0) goto L_0x021a
            android.os.Bundle r6 = r1.f4712m
            if (r6 == 0) goto L_0x021a
            b.l.a.c.h.b.c4 r6 = r0.mo14464q()
            boolean r6 = r6.mo14146r(r10)
            if (r6 == 0) goto L_0x021a
            android.os.Bundle r1 = r1.f4712m
            b.l.a.c.h.b.g r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3177g.m5990a(r1)
            b.l.a.c.h.b.g r6 = p005b.p096l.p097a.p113c.p145h.p147b.C3177g.f5529c
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L_0x021a
            b.l.a.c.h.b.q6 r2 = r0.mo14466s()
            long r6 = r0.f5841H
            r2.mo14512y(r1, r10, r6)
        L_0x0219:
            r2 = r1
        L_0x021a:
            b.l.a.c.h.b.q6 r1 = r0.mo14466s()
            r1.mo14513z(r2)
        L_0x0221:
            b.l.a.c.h.b.c4 r1 = r0.mo14464q()
            b.l.a.c.h.b.y3 r1 = r1.f5425e
            long r1 = r1.mo14633a()
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x024d
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5807n
            long r6 = r0.f5841H
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "Persisting first open"
            r1.mo14415b(r6, r2)
            b.l.a.c.h.b.c4 r1 = r0.mo14464q()
            b.l.a.c.h.b.y3 r1 = r1.f5425e
            long r6 = r0.f5841H
            r1.mo14634b(r6)
        L_0x024d:
            b.l.a.c.h.b.q6 r1 = r0.mo14466s()
            b.l.a.c.h.b.x9 r1 = r1.f5904n
            boolean r2 = r1.mo14632c()
            if (r2 == 0) goto L_0x026a
            boolean r2 = r1.mo14631b()
            if (r2 == 0) goto L_0x026a
            b.l.a.c.h.b.p4 r1 = r1.f6107a
            b.l.a.c.h.b.c4 r1 = r1.mo14464q()
            b.l.a.c.h.b.b4 r1 = r1.f5441u
            r1.mo14128b(r5)
        L_0x026a:
            boolean r1 = r0.mo14462l()
            if (r1 != 0) goto L_0x02eb
            boolean r1 = r0.mo14460j()
            if (r1 == 0) goto L_0x04c9
            b.l.a.c.h.b.q9 r1 = r0.mo14467t()
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r1 = r1.mo14516E(r2)
            if (r1 != 0) goto L_0x028d
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5799f
            java.lang.String r2 = "App is missing INTERNET permission"
            r1.mo14414a(r2)
        L_0x028d:
            b.l.a.c.h.b.q9 r1 = r0.mo14467t()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r1.mo14516E(r2)
            if (r1 != 0) goto L_0x02a4
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5799f
            java.lang.String r2 = "App is missing ACCESS_NETWORK_STATE permission"
            r1.mo14414a(r2)
        L_0x02a4:
            android.content.Context r1 = r0.f5842a
            b.l.a.c.b.q.a r1 = p005b.p096l.p097a.p113c.p119b.p128q.C1968b.m2885a(r1)
            boolean r1 = r1.mo12295c()
            if (r1 != 0) goto L_0x02de
            b.l.a.c.h.b.f r1 = r0.f5848g
            boolean r1 = r1.mo14205z()
            if (r1 != 0) goto L_0x02de
            android.content.Context r1 = r0.f5842a
            boolean r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6341X(r1)
            if (r1 != 0) goto L_0x02cb
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5799f
            java.lang.String r2 = "AppMeasurementReceiver not registered/enabled"
            r1.mo14414a(r2)
        L_0x02cb:
            android.content.Context r1 = r0.f5842a
            boolean r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6337D(r1)
            if (r1 != 0) goto L_0x02de
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5799f
            java.lang.String r2 = "AppMeasurementService not registered/enabled"
            r1.mo14414a(r2)
        L_0x02de:
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5799f
            java.lang.String r2 = "Uploading is not possible. App measurement disabled"
            r1.mo14414a(r2)
            goto L_0x04c9
        L_0x02eb:
            b.l.a.c.h.b.g3 r1 = r0.mo14457b()
            java.lang.String r1 = r1.mo14242n()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0308
            b.l.a.c.h.b.g3 r1 = r0.mo14457b()
            r1.mo14065i()
            java.lang.String r1 = r1.f5544l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03ce
        L_0x0308:
            b.l.a.c.h.b.q9 r1 = r0.mo14467t()
            b.l.a.c.h.b.g3 r2 = r0.mo14457b()
            java.lang.String r2 = r2.mo14242n()
            b.l.a.c.h.b.c4 r6 = r0.mo14464q()
            r6.mo14126h()
            android.content.SharedPreferences r6 = r6.mo14143o()
            java.lang.String r7 = "gmp_app_id"
            java.lang.String r6 = r6.getString(r7, r5)
            b.l.a.c.h.b.g3 r8 = r0.mo14457b()
            r8.mo14065i()
            java.lang.String r8 = r8.f5544l
            b.l.a.c.h.b.c4 r9 = r0.mo14464q()
            r9.mo14126h()
            android.content.SharedPreferences r9 = r9.mo14143o()
            java.lang.String r10 = "admob_app_id"
            java.lang.String r9 = r9.getString(r10, r5)
            boolean r1 = r1.mo14546p(r2, r6, r8, r9)
            if (r1 == 0) goto L_0x0393
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5805l
            java.lang.String r2 = "Rechecking which service to use due to a GMP App Id change"
            r1.mo14414a(r2)
            b.l.a.c.h.b.c4 r1 = r0.mo14464q()
            r1.mo14126h()
            java.lang.Boolean r2 = r1.mo14145q()
            android.content.SharedPreferences r6 = r1.mo14143o()
            android.content.SharedPreferences$Editor r6 = r6.edit()
            r6.clear()
            r6.apply()
            if (r2 == 0) goto L_0x036e
            r1.mo14144p(r2)
        L_0x036e:
            b.l.a.c.h.b.i3 r1 = r0.mo14469v()
            r1.mo14264l()
            b.l.a.c.h.b.f8 r1 = r0.f5862u
            r1.mo14220o()
            b.l.a.c.h.b.f8 r1 = r0.f5862u
            r1.mo14217l()
            b.l.a.c.h.b.c4 r1 = r0.mo14464q()
            b.l.a.c.h.b.y3 r1 = r1.f5425e
            long r8 = r0.f5841H
            r1.mo14634b(r8)
            b.l.a.c.h.b.c4 r1 = r0.mo14464q()
            b.l.a.c.h.b.b4 r1 = r1.f5427g
            r1.mo14128b(r5)
        L_0x0393:
            b.l.a.c.h.b.c4 r1 = r0.mo14464q()
            b.l.a.c.h.b.g3 r2 = r0.mo14457b()
            java.lang.String r2 = r2.mo14242n()
            r1.mo14126h()
            android.content.SharedPreferences r1 = r1.mo14143o()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r7, r2)
            r1.apply()
            b.l.a.c.h.b.c4 r1 = r0.mo14464q()
            b.l.a.c.h.b.g3 r2 = r0.mo14457b()
            r2.mo14065i()
            java.lang.String r2 = r2.f5544l
            r1.mo14126h()
            android.content.SharedPreferences r1 = r1.mo14143o()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r10, r2)
            r1.apply()
        L_0x03ce:
            p005b.p096l.p097a.p113c.p131e.p140i.C2980u8.m5384b()
            b.l.a.c.h.b.f r1 = r0.f5848g
            boolean r1 = r1.mo14197r(r5, r4)
            if (r1 == 0) goto L_0x03f0
            b.l.a.c.h.b.c4 r1 = r0.mo14464q()
            b.l.a.c.h.b.g r1 = r1.mo14147s()
            boolean r1 = r1.mo14234e()
            if (r1 != 0) goto L_0x03f0
            b.l.a.c.h.b.c4 r1 = r0.mo14464q()
            b.l.a.c.h.b.b4 r1 = r1.f5427g
            r1.mo14128b(r5)
        L_0x03f0:
            b.l.a.c.h.b.q6 r1 = r0.mo14466s()
            b.l.a.c.h.b.c4 r2 = r0.mo14464q()
            b.l.a.c.h.b.b4 r2 = r2.f5427g
            java.lang.String r2 = r2.mo14127a()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r1 = r1.f5897g
            r1.set(r2)
            p005b.p096l.p097a.p113c.p131e.p140i.C2716a9.m4567b()
            b.l.a.c.h.b.f r1 = r0.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5397n0
            boolean r1 = r1.mo14197r(r5, r2)
            if (r1 == 0) goto L_0x0446
            b.l.a.c.h.b.q9 r1 = r0.mo14467t()
            b.l.a.c.h.b.p4 r1 = r1.f5638a     // Catch:{ ClassNotFoundException -> 0x0422 }
            android.content.Context r1 = r1.f5842a     // Catch:{ ClassNotFoundException -> 0x0422 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0422 }
            java.lang.String r2 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0422 }
            goto L_0x0446
        L_0x0422:
            b.l.a.c.h.b.c4 r1 = r0.mo14464q()
            b.l.a.c.h.b.b4 r1 = r1.f5440t
            java.lang.String r1 = r1.mo14127a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0446
            b.l.a.c.h.b.o3 r1 = r0.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5802i
            java.lang.String r2 = "Remote config removed with active feature rollouts"
            r1.mo14414a(r2)
            b.l.a.c.h.b.c4 r1 = r0.mo14464q()
            b.l.a.c.h.b.b4 r1 = r1.f5440t
            r1.mo14128b(r5)
        L_0x0446:
            b.l.a.c.h.b.g3 r1 = r0.mo14457b()
            java.lang.String r1 = r1.mo14242n()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0463
            b.l.a.c.h.b.g3 r1 = r0.mo14457b()
            r1.mo14065i()
            java.lang.String r1 = r1.f5544l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x04c9
        L_0x0463:
            boolean r1 = r0.mo14460j()
            b.l.a.c.h.b.c4 r2 = r0.mo14464q()
            android.content.SharedPreferences r2 = r2.f5423c
            r4 = 0
            if (r2 != 0) goto L_0x0472
            r2 = r4
            goto L_0x0478
        L_0x0472:
            java.lang.String r5 = "deferred_analytics_collection"
            boolean r2 = r2.contains(r5)
        L_0x0478:
            if (r2 != 0) goto L_0x048b
            b.l.a.c.h.b.f r2 = r0.f5848g
            boolean r2 = r2.mo14200u()
            if (r2 != 0) goto L_0x048b
            b.l.a.c.h.b.c4 r2 = r0.mo14464q()
            r5 = r1 ^ 1
            r2.mo14148t(r5)
        L_0x048b:
            if (r1 == 0) goto L_0x0494
            b.l.a.c.h.b.q6 r1 = r0.mo14466s()
            r1.mo14503o()
        L_0x0494:
            b.l.a.c.h.b.u8 r1 = r0.mo14465r()
            b.l.a.c.h.b.t8 r1 = r1.f6002d
            r1.mo14598a()
            b.l.a.c.h.b.f8 r1 = r0.mo14473z()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.mo14230z(r2)
            b.l.a.c.h.b.f8 r1 = r0.mo14473z()
            b.l.a.c.h.b.c4 r2 = r0.mo14464q()
            b.l.a.c.h.b.x3 r2 = r2.f5443w
            android.os.Bundle r2 = r2.mo14620a()
            r1.mo14126h()
            r1.mo14065i()
            b.l.a.c.h.b.v9 r4 = r1.mo14226v(r4)
            b.l.a.c.h.b.n7 r5 = new b.l.a.c.h.b.n7
            r5.<init>(r1, r4, r2)
            r1.mo14224t(r5)
        L_0x04c9:
            b.l.a.c.h.b.c4 r0 = r0.mo14464q()
            b.l.a.c.h.b.w3 r0 = r0.f5434n
            r0.mo14614b(r3)
            return
        L_0x04d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3270o4.run():void");
    }
}
