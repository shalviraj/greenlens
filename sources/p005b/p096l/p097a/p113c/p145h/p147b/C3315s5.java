package p005b.p096l.p097a.p113c.p145h.p147b;

/* renamed from: b.l.a.c.h.b.s5 */
public final /* synthetic */ class C3315s5 implements Runnable {

    /* renamed from: g */
    public final C3294q6 f5952g;

    public C3315s5(C3294q6 q6Var) {
        this.f5952g = q6Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            b.l.a.c.h.b.q6 r0 = r15.f5952g
            r0.mo14126h()
            b.l.a.c.h.b.p4 r1 = r0.f5638a
            b.l.a.c.h.b.c4 r1 = r1.mo14464q()
            b.l.a.c.h.b.w3 r1 = r1.f5438r
            boolean r1 = r1.mo14613a()
            if (r1 != 0) goto L_0x01df
            b.l.a.c.h.b.p4 r1 = r0.f5638a
            b.l.a.c.h.b.c4 r1 = r1.mo14464q()
            b.l.a.c.h.b.y3 r1 = r1.f5439s
            long r1 = r1.mo14633a()
            b.l.a.c.h.b.p4 r3 = r0.f5638a
            b.l.a.c.h.b.c4 r3 = r3.mo14464q()
            b.l.a.c.h.b.y3 r3 = r3.f5439s
            r4 = 1
            long r4 = r4 + r1
            r3.mo14634b(r4)
            b.l.a.c.h.b.p4 r3 = r0.f5638a
            b.l.a.c.h.b.f r4 = r3.f5848g
            r4 = 5
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r2 = 1
            if (r1 < 0) goto L_0x004f
            b.l.a.c.h.b.o3 r1 = r3.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5802i
            java.lang.String r3 = "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."
            r1.mo14414a(r3)
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.c4 r0 = r0.mo14464q()
            b.l.a.c.h.b.w3 r0 = r0.f5438r
            r0.mo14614b(r2)
            return
        L_0x004f:
            b.l.a.c.h.b.m4 r0 = r3.mo14331f()
            r0.mo14126h()
            b.l.a.c.h.b.u6 r0 = r3.mo14470w()
            p005b.p096l.p097a.p113c.p145h.p147b.C3281p4.m6275o(r0)
            b.l.a.c.h.b.g3 r0 = r3.mo14457b()
            java.lang.String r0 = r0.mo14241m()
            b.l.a.c.h.b.c4 r1 = r3.mo14464q()
            r1.mo14126h()
            b.l.a.c.h.b.p4 r4 = r1.f5638a
            b.l.a.c.b.p.b r4 = r4.f5855n
            b.l.a.c.b.p.c r4 = (p005b.p096l.p097a.p113c.p119b.p126p.C1959c) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r6 = r1.f5428h
            r7 = 0
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x0093
            long r9 = r1.f5430j
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x0087
            goto L_0x0093
        L_0x0087:
            android.util.Pair r4 = new android.util.Pair
            boolean r1 = r1.f5429i
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.<init>(r6, r1)
            goto L_0x00dc
        L_0x0093:
            b.l.a.c.h.b.p4 r6 = r1.f5638a
            b.l.a.c.h.b.f r6 = r6.f5848g
            b.l.a.c.h.b.a3<java.lang.Long> r9 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5372b
            long r9 = r6.mo14194o(r0, r9)
            long r9 = r9 + r4
            r1.f5430j = r9
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r2)
            b.l.a.c.h.b.p4 r4 = r1.f5638a     // Catch:{ Exception -> 0x00bc }
            android.content.Context r4 = r4.f5842a     // Catch:{ Exception -> 0x00bc }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r4 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r4)     // Catch:{ Exception -> 0x00bc }
            r1.f5428h = r8     // Catch:{ Exception -> 0x00bc }
            java.lang.String r5 = r4.getId()     // Catch:{ Exception -> 0x00bc }
            if (r5 == 0) goto L_0x00b5
            r1.f5428h = r5     // Catch:{ Exception -> 0x00bc }
        L_0x00b5:
            boolean r4 = r4.isLimitAdTrackingEnabled()     // Catch:{ Exception -> 0x00bc }
            r1.f5429i = r4     // Catch:{ Exception -> 0x00bc }
            goto L_0x00cc
        L_0x00bc:
            r4 = move-exception
            b.l.a.c.h.b.p4 r5 = r1.f5638a
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()
            b.l.a.c.h.b.m3 r5 = r5.f5806m
            java.lang.String r6 = "Unable to get advertising id"
            r5.mo14415b(r6, r4)
            r1.f5428h = r8
        L_0x00cc:
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r7)
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r5 = r1.f5428h
            boolean r1 = r1.f5429i
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.<init>(r5, r1)
        L_0x00dc:
            b.l.a.c.h.b.f r1 = r3.f5848g
            boolean r1 = r1.mo14201v()
            if (r1 == 0) goto L_0x01d3
            java.lang.Object r1 = r4.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x01d3
            java.lang.Object r1 = r4.first
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00fa
            goto L_0x01d3
        L_0x00fa:
            b.l.a.c.h.b.u6 r1 = r3.mo14470w()
            r1.mo14377l()
            b.l.a.c.h.b.p4 r1 = r1.f5638a
            android.content.Context r1 = r1.f5842a
            java.lang.String r5 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r5)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r5 = 0
            if (r1 == 0) goto L_0x0115
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0115 }
            goto L_0x0116
        L_0x0115:
            r1 = r5
        L_0x0116:
            if (r1 == 0) goto L_0x01ca
            boolean r1 = r1.isConnected()
            if (r1 == 0) goto L_0x01ca
            b.l.a.c.h.b.q9 r1 = r3.mo14467t()
            b.l.a.c.h.b.g3 r6 = r3.mo14457b()
            b.l.a.c.h.b.p4 r6 = r6.f5638a
            b.l.a.c.h.b.f r6 = r6.f5848g
            r6.mo14193n()
            java.lang.Object r4 = r4.first
            java.lang.String r4 = (java.lang.String) r4
            b.l.a.c.h.b.c4 r6 = r3.mo14464q()
            b.l.a.c.h.b.y3 r6 = r6.f5439s
            long r9 = r6.mo14633a()
            r11 = -1
            long r9 = r9 + r11
            java.util.Objects.requireNonNull(r1)
            p005b.p006a.p007a.p024o.C0823f.m376j(r4)     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            p005b.p006a.p007a.p024o.C0823f.m376j(r0)     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r13 = 39065(0x9899, double:1.93007E-319)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r12[r7] = r13     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            int r13 = r1.mo14522M()     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r12[r2] = r13     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            java.lang.String r13 = "v%s.%s"
            java.lang.String r12 = java.lang.String.format(r13, r12)     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r6[r7] = r12     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r6[r2] = r4     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r6[r11] = r0     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r2 = 3
            java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r6[r2] = r4     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            java.lang.String r2 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s"
            java.lang.String r2 = java.lang.String.format(r2, r6)     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            b.l.a.c.h.b.p4 r4 = r1.f5638a     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            b.l.a.c.h.b.f r4 = r4.f5848g     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            java.lang.String r6 = "debug.deferred.deeplink"
            java.lang.String r4 = r4.mo14189j(r6, r8)     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            boolean r4 = r0.equals(r4)     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            if (r4 == 0) goto L_0x018f
            java.lang.String r4 = "&ddl_test=1"
            java.lang.String r2 = r2.concat(r4)     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
        L_0x018f:
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r4.<init>(r2)     // Catch:{ MalformedURLException -> 0x0198, IllegalArgumentException -> 0x0196 }
            r5 = r4
            goto L_0x01aa
        L_0x0196:
            r2 = move-exception
            goto L_0x0199
        L_0x0198:
            r2 = move-exception
        L_0x0199:
            b.l.a.c.h.b.p4 r1 = r1.f5638a
            b.l.a.c.h.b.o3 r1 = r1.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5799f
            java.lang.String r2 = r2.getMessage()
            java.lang.String r4 = "Failed to create BOW URL for Deferred Deep Link. exception"
            r1.mo14415b(r4, r2)
        L_0x01aa:
            if (r5 == 0) goto L_0x01de
            b.l.a.c.h.b.u6 r1 = r3.mo14470w()
            b.l.a.c.h.b.n4 r2 = new b.l.a.c.h.b.n4
            r2.<init>(r3)
            r1.mo14126h()
            r1.mo14377l()
            b.l.a.c.h.b.p4 r3 = r1.f5638a
            b.l.a.c.h.b.m4 r3 = r3.mo14331f()
            b.l.a.c.h.b.t6 r4 = new b.l.a.c.h.b.t6
            r4.<init>(r1, r0, r5, r2)
            r3.mo14423t(r4)
            goto L_0x01de
        L_0x01ca:
            b.l.a.c.h.b.o3 r0 = r3.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5802i
            java.lang.String r1 = "Network is not available for Deferred Deep Link request. Skipping"
            goto L_0x01db
        L_0x01d3:
            b.l.a.c.h.b.o3 r0 = r3.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5806m
            java.lang.String r1 = "ADID unavailable to retrieve Deferred Deep Link. Skipping"
        L_0x01db:
            r0.mo14414a(r1)
        L_0x01de:
            return
        L_0x01df:
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5806m
            java.lang.String r1 = "Deferred Deep Link already retrieved. Not fetching again."
            r0.mo14414a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3315s5.run():void");
    }
}
