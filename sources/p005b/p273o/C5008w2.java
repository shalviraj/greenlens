package p005b.p273o;

/* renamed from: b.o.w2 */
public final class C5008w2 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C4783a3 f9681g;

    public C5008w2(C4783a3 a3Var) {
        this.f9681g = a3Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        if (r3.isClosed() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        if (r3.isClosed() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        r3.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2 A[SYNTHETIC, Splitter:B:37:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0118 A[SYNTHETIC, Splitter:B:67:0x0118] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = 10
            r0.setPriority(r1)
            b.o.u0 r0 = p005b.p273o.C4857i2.m8948p()
            b.o.a3 r1 = r14.f9681g
            b.o.g1 r2 = r0.f9645c
            if (r2 != 0) goto L_0x001a
            b.o.g1 r2 = new b.o.g1
            r2.<init>(r1)
            r0.f9645c = r2
        L_0x001a:
            b.o.g1 r0 = r0.f9645c
            monitor-enter(r0)
            java.lang.String r1 = "message_id"
            java.lang.String r2 = "click_ids"
            java.lang.String[] r5 = new java.lang.String[]{r1, r2}     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "last_display < ?"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0122 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            r6 = 15552000(0xed4e00, double:7.683709E-317)
            long r2 = r2 - r6
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0122 }
            r3 = 1
            java.lang.String[] r11 = new java.lang.String[r3]     // Catch:{ all -> 0x0122 }
            r3 = 0
            r11[r3] = r2     // Catch:{ all -> 0x0122 }
            java.util.Set r2 = p005b.p273o.C4835f2.m8866p()     // Catch:{ all -> 0x0122 }
            java.util.Set r12 = p005b.p273o.C4835f2.m8866p()     // Catch:{ all -> 0x0122 }
            r13 = 0
            b.o.a3 r3 = r0.f9300a     // Catch:{ JSONException -> 0x00aa, all -> 0x00a7 }
            java.lang.String r4 = "in_app_message"
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r1
            r7 = r11
            android.database.Cursor r3 = r3.mo16511S(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ JSONException -> 0x00aa, all -> 0x00a7 }
            if (r3 == 0) goto L_0x0091
            int r4 = r3.getCount()     // Catch:{ JSONException -> 0x00a5 }
            if (r4 != 0) goto L_0x005b
            goto L_0x0091
        L_0x005b:
            boolean r4 = r3.moveToFirst()     // Catch:{ JSONException -> 0x00a5 }
            if (r4 == 0) goto L_0x008a
        L_0x0061:
            java.lang.String r4 = "message_id"
            int r4 = r3.getColumnIndex(r4)     // Catch:{ JSONException -> 0x00a5 }
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x00a5 }
            java.lang.String r5 = "click_ids"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ JSONException -> 0x00a5 }
            java.lang.String r5 = r3.getString(r5)     // Catch:{ JSONException -> 0x00a5 }
            r2.add(r4)     // Catch:{ JSONException -> 0x00a5 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00a5 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x00a5 }
            java.util.Set r4 = p005b.p273o.C4835f2.m8867q(r4)     // Catch:{ JSONException -> 0x00a5 }
            r12.addAll(r4)     // Catch:{ JSONException -> 0x00a5 }
            boolean r4 = r3.moveToNext()     // Catch:{ JSONException -> 0x00a5 }
            if (r4 != 0) goto L_0x0061
        L_0x008a:
            boolean r4 = r3.isClosed()     // Catch:{ all -> 0x0122 }
            if (r4 != 0) goto L_0x00bb
            goto L_0x00b8
        L_0x0091:
            b.o.i2$k r4 = p005b.p273o.C4857i2.C4868k.DEBUG     // Catch:{ JSONException -> 0x00a5 }
            java.lang.String r5 = "Attempted to clean 6 month old IAM data, but none exists!"
            p005b.p273o.C4857i2.m8933a(r4, r5, r13)     // Catch:{ JSONException -> 0x00a5 }
            if (r3 == 0) goto L_0x0112
            boolean r1 = r3.isClosed()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x0112
            r3.close()     // Catch:{ all -> 0x0122 }
            goto L_0x0112
        L_0x00a5:
            r4 = move-exception
            goto L_0x00ad
        L_0x00a7:
            r1 = move-exception
            goto L_0x0116
        L_0x00aa:
            r3 = move-exception
            r4 = r3
            r3 = r13
        L_0x00ad:
            r4.printStackTrace()     // Catch:{ all -> 0x0114 }
            if (r3 == 0) goto L_0x00bb
            boolean r4 = r3.isClosed()     // Catch:{ all -> 0x0122 }
            if (r4 != 0) goto L_0x00bb
        L_0x00b8:
            r3.close()     // Catch:{ all -> 0x0122 }
        L_0x00bb:
            b.o.a3 r3 = r0.f9300a     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = "in_app_message"
            r3.mo16513d(r4, r1, r11)     // Catch:{ all -> 0x0122 }
            if (r2 == 0) goto L_0x00f4
            int r1 = r2.size()     // Catch:{ all -> 0x0122 }
            if (r1 <= 0) goto L_0x00f4
            java.lang.String r1 = p005b.p273o.C4815d3.f9230a     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = "PREFS_OS_DISPLAYED_IAMS"
            java.util.Set r4 = p005b.p273o.C4815d3.m8832g(r1, r3, r13)     // Catch:{ all -> 0x0122 }
            java.lang.String r5 = "PREFS_OS_IMPRESSIONED_IAMS"
            java.util.Set r6 = p005b.p273o.C4815d3.m8832g(r1, r5, r13)     // Catch:{ all -> 0x0122 }
            if (r4 == 0) goto L_0x00e6
            int r7 = r4.size()     // Catch:{ all -> 0x0122 }
            if (r7 <= 0) goto L_0x00e6
            r4.removeAll(r2)     // Catch:{ all -> 0x0122 }
            p005b.p273o.C4815d3.m8833h(r1, r3, r4)     // Catch:{ all -> 0x0122 }
        L_0x00e6:
            if (r6 == 0) goto L_0x00f4
            int r3 = r6.size()     // Catch:{ all -> 0x0122 }
            if (r3 <= 0) goto L_0x00f4
            r6.removeAll(r2)     // Catch:{ all -> 0x0122 }
            p005b.p273o.C4815d3.m8833h(r1, r5, r6)     // Catch:{ all -> 0x0122 }
        L_0x00f4:
            if (r12 == 0) goto L_0x0112
            int r1 = r12.size()     // Catch:{ all -> 0x0122 }
            if (r1 <= 0) goto L_0x0112
            java.lang.String r1 = p005b.p273o.C4815d3.f9230a     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = "PREFS_OS_CLICKED_CLICK_IDS_IAMS"
            java.util.Set r3 = p005b.p273o.C4815d3.m8832g(r1, r2, r13)     // Catch:{ all -> 0x0122 }
            if (r3 == 0) goto L_0x0112
            int r4 = r3.size()     // Catch:{ all -> 0x0122 }
            if (r4 <= 0) goto L_0x0112
            r3.removeAll(r12)     // Catch:{ all -> 0x0122 }
            p005b.p273o.C4815d3.m8833h(r1, r2, r3)     // Catch:{ all -> 0x0122 }
        L_0x0112:
            monitor-exit(r0)
            return
        L_0x0114:
            r1 = move-exception
            r13 = r3
        L_0x0116:
            if (r13 == 0) goto L_0x0121
            boolean r2 = r13.isClosed()     // Catch:{ all -> 0x0122 }
            if (r2 != 0) goto L_0x0121
            r13.close()     // Catch:{ all -> 0x0122 }
        L_0x0121:
            throw r1     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C5008w2.run():void");
    }
}
