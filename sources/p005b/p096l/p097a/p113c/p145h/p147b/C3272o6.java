package p005b.p096l.p097a.p113c.p145h.p147b;

import android.net.Uri;

/* renamed from: b.l.a.c.h.b.o6 */
public final class C3272o6 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ boolean f5812g;

    /* renamed from: h */
    public final /* synthetic */ Uri f5813h;

    /* renamed from: i */
    public final /* synthetic */ String f5814i;

    /* renamed from: j */
    public final /* synthetic */ String f5815j;

    /* renamed from: k */
    public final /* synthetic */ C3283p6 f5816k;

    public C3272o6(C3283p6 p6Var, boolean z, Uri uri, String str, String str2) {
        this.f5816k = p6Var;
        this.f5812g = z;
        this.f5813h = uri;
        this.f5814i = str;
        this.f5815j = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r2.f5868g.f5638a.f5848g.mo14197r((java.lang.String) null, p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5377d0) == false) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2 A[SYNTHETIC, Splitter:B:31:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f2 A[Catch:{ Exception -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0132 A[Catch:{ Exception -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0134 A[Catch:{ Exception -> 0x01bb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            b.l.a.c.h.b.p6 r2 = r1.f5816k
            boolean r0 = r1.f5812g
            android.net.Uri r3 = r1.f5813h
            java.lang.String r4 = r1.f5814i
            java.lang.String r5 = r1.f5815j
            b.l.a.c.h.b.q6 r6 = r2.f5868g
            r6.mo14126h()
            b.l.a.c.h.b.q6 r6 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r6 = r6.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.f r6 = r6.f5848g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.a3<java.lang.Boolean> r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5375c0     // Catch:{ Exception -> 0x01bb }
            r8 = 0
            boolean r6 = r6.mo14197r(r8, r7)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r9 = "Activity created with data 'referrer' without required params"
            java.lang.String r10 = "_cis"
            java.lang.String r11 = "utm_medium"
            java.lang.String r12 = "utm_source"
            java.lang.String r13 = "utm_campaign"
            java.lang.String r14 = "gclid"
            if (r6 != 0) goto L_0x0048
            b.l.a.c.h.b.q6 r6 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r6 = r6.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.f r6 = r6.f5848g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.a3<java.lang.Boolean> r15 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5379e0     // Catch:{ Exception -> 0x01bb }
            boolean r6 = r6.mo14197r(r8, r15)     // Catch:{ Exception -> 0x01bb }
            if (r6 != 0) goto L_0x0048
            b.l.a.c.h.b.q6 r6 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r6 = r6.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.f r6 = r6.f5848g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.a3<java.lang.Boolean> r15 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5377d0     // Catch:{ Exception -> 0x01bb }
            boolean r6 = r6.mo14197r(r8, r15)     // Catch:{ Exception -> 0x01bb }
            if (r6 == 0) goto L_0x0056
        L_0x0048:
            b.l.a.c.h.b.q6 r6 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r6 = r6.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.q9 r6 = r6.mo14467t()     // Catch:{ Exception -> 0x01bb }
            boolean r15 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01bb }
            if (r15 == 0) goto L_0x0058
        L_0x0056:
            r6 = r8
            goto L_0x009e
        L_0x0058:
            boolean r15 = r5.contains(r14)     // Catch:{ Exception -> 0x01bb }
            if (r15 != 0) goto L_0x007c
            boolean r15 = r5.contains(r13)     // Catch:{ Exception -> 0x01bb }
            if (r15 != 0) goto L_0x007c
            boolean r15 = r5.contains(r12)     // Catch:{ Exception -> 0x01bb }
            if (r15 != 0) goto L_0x007c
            boolean r15 = r5.contains(r11)     // Catch:{ Exception -> 0x01bb }
            if (r15 != 0) goto L_0x007c
            b.l.a.c.h.b.p4 r6 = r6.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.o3 r6 = r6.mo14329d()     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.m3 r6 = r6.f5806m     // Catch:{ Exception -> 0x01bb }
            r6.mo14414a(r9)     // Catch:{ Exception -> 0x01bb }
            goto L_0x0056
        L_0x007c:
            java.lang.String r15 = "https://google.com/search?"
            int r16 = r5.length()     // Catch:{ Exception -> 0x01bb }
            if (r16 == 0) goto L_0x0089
            java.lang.String r15 = r15.concat(r5)     // Catch:{ Exception -> 0x01bb }
            goto L_0x008f
        L_0x0089:
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x01bb }
            r8.<init>(r15)     // Catch:{ Exception -> 0x01bb }
            r15 = r8
        L_0x008f:
            android.net.Uri r8 = android.net.Uri.parse(r15)     // Catch:{ Exception -> 0x01bb }
            android.os.Bundle r6 = r6.mo14536g0(r8)     // Catch:{ Exception -> 0x01bb }
            if (r6 == 0) goto L_0x009e
            java.lang.String r8 = "referrer"
            r6.putString(r10, r8)     // Catch:{ Exception -> 0x01bb }
        L_0x009e:
            java.lang.String r8 = "_cmp"
            if (r0 == 0) goto L_0x00f2
            b.l.a.c.h.b.q6 r0 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r0 = r0.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.q9 r0 = r0.mo14467t()     // Catch:{ Exception -> 0x01bb }
            android.os.Bundle r0 = r0.mo14536g0(r3)     // Catch:{ Exception -> 0x01bb }
            if (r0 == 0) goto L_0x00f3
            java.lang.String r3 = "intent"
            r0.putString(r10, r3)     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.q6 r3 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r3 = r3.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.f r3 = r3.f5848g     // Catch:{ Exception -> 0x01bb }
            r10 = 0
            boolean r3 = r3.mo14197r(r10, r7)     // Catch:{ Exception -> 0x01bb }
            if (r3 == 0) goto L_0x00e5
            boolean r3 = r0.containsKey(r14)     // Catch:{ Exception -> 0x01bb }
            if (r3 != 0) goto L_0x00e5
            if (r6 == 0) goto L_0x00e5
            boolean r3 = r6.containsKey(r14)     // Catch:{ Exception -> 0x01bb }
            if (r3 == 0) goto L_0x00e5
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01bb }
            r7 = 0
            java.lang.String r10 = r6.getString(r14)     // Catch:{ Exception -> 0x01bb }
            r3[r7] = r10     // Catch:{ Exception -> 0x01bb }
            java.lang.String r7 = "_cer"
            java.lang.String r10 = "gclid=%s"
            java.lang.String r3 = java.lang.String.format(r10, r3)     // Catch:{ Exception -> 0x01bb }
            r0.putString(r7, r3)     // Catch:{ Exception -> 0x01bb }
        L_0x00e5:
            b.l.a.c.h.b.q6 r3 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            r3.mo14493A(r4, r8, r0)     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.q6 r3 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.x9 r3 = r3.f5904n     // Catch:{ Exception -> 0x01bb }
            r3.mo14630a(r4, r0)     // Catch:{ Exception -> 0x01bb }
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            b.l.a.c.h.b.q6 r3 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r3 = r3.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.f r3 = r3.f5848g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.a3<java.lang.Boolean> r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5379e0     // Catch:{ Exception -> 0x01bb }
            r10 = 0
            boolean r3 = r3.mo14197r(r10, r7)     // Catch:{ Exception -> 0x01bb }
            if (r3 == 0) goto L_0x012c
            b.l.a.c.h.b.q6 r3 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r3 = r3.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.f r3 = r3.f5848g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.a3<java.lang.Boolean> r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5377d0     // Catch:{ Exception -> 0x01bb }
            r10 = 0
            boolean r3 = r3.mo14197r(r10, r7)     // Catch:{ Exception -> 0x01bb }
            if (r3 != 0) goto L_0x012c
            if (r6 == 0) goto L_0x012c
            boolean r3 = r6.containsKey(r14)     // Catch:{ Exception -> 0x01bb }
            if (r3 == 0) goto L_0x012c
            if (r0 == 0) goto L_0x0121
            boolean r0 = r0.containsKey(r14)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x012c
        L_0x0121:
            b.l.a.c.h.b.q6 r0 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            java.lang.String r3 = "_lgclid"
            java.lang.String r7 = r6.getString(r14)     // Catch:{ Exception -> 0x01bb }
            r0.mo14498F(r3, r7)     // Catch:{ Exception -> 0x01bb }
        L_0x012c:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01bb }
            if (r0 == 0) goto L_0x0134
            goto L_0x01ac
        L_0x0134:
            b.l.a.c.h.b.q6 r0 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r0 = r0.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.m3 r0 = r0.f5806m     // Catch:{ Exception -> 0x01bb }
            java.lang.String r3 = "Activity created with referrer"
            r0.mo14415b(r3, r5)     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.q6 r0 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r0 = r0.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.f r0 = r0.f5848g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.a3<java.lang.Boolean> r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5377d0     // Catch:{ Exception -> 0x01bb }
            r7 = 0
            boolean r0 = r0.mo14197r(r7, r3)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r3 = "_ldl"
            if (r0 == 0) goto L_0x0179
            if (r6 == 0) goto L_0x0163
            b.l.a.c.h.b.q6 r0 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            r0.mo14493A(r4, r8, r6)     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.q6 r0 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.x9 r0 = r0.f5904n     // Catch:{ Exception -> 0x01bb }
            r0.mo14630a(r4, r6)     // Catch:{ Exception -> 0x01bb }
            goto L_0x0172
        L_0x0163:
            b.l.a.c.h.b.q6 r0 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r0 = r0.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.m3 r0 = r0.f5806m     // Catch:{ Exception -> 0x01bb }
            java.lang.String r4 = "Referrer does not contain valid parameters"
            r0.mo14415b(r4, r5)     // Catch:{ Exception -> 0x01bb }
        L_0x0172:
            b.l.a.c.h.b.q6 r0 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            r4 = 0
            r0.mo14498F(r3, r4)     // Catch:{ Exception -> 0x01bb }
            return
        L_0x0179:
            boolean r0 = r5.contains(r14)     // Catch:{ Exception -> 0x01bb }
            if (r0 == 0) goto L_0x01ad
            boolean r0 = r5.contains(r13)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x01a1
            boolean r0 = r5.contains(r12)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x01a1
            boolean r0 = r5.contains(r11)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x01a1
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x01a1
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ Exception -> 0x01bb }
            if (r0 == 0) goto L_0x01ad
        L_0x01a1:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x01ac
            b.l.a.c.h.b.q6 r0 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            r0.mo14498F(r3, r5)     // Catch:{ Exception -> 0x01bb }
        L_0x01ac:
            return
        L_0x01ad:
            b.l.a.c.h.b.q6 r0 = r2.f5868g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.p4 r0 = r0.f5638a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.h.b.m3 r0 = r0.f5806m     // Catch:{ Exception -> 0x01bb }
            r0.mo14414a(r9)     // Catch:{ Exception -> 0x01bb }
            return
        L_0x01bb:
            r0 = move-exception
            b.l.a.c.h.b.q6 r2 = r2.f5868g
            b.l.a.c.h.b.p4 r2 = r2.f5638a
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5799f
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.mo14415b(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3272o6.run():void");
    }
}
