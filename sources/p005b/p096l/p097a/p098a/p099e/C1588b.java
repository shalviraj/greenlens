package p005b.p096l.p097a.p098a.p099e;

/* renamed from: b.l.a.a.e.b */
public final /* synthetic */ class C1588b {

    /* renamed from: a */
    public final C1590d f2698a;

    public C1588b(C1590d dVar) {
        this.f2698a = dVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0121 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x013f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0146 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo11735a(java.lang.Object r14) {
        /*
            r13 = this;
            b.l.a.a.e.d r0 = r13.f2698a
            b.l.a.a.e.d$a r14 = (p005b.p096l.p097a.p098a.p099e.C1590d.C1591a) r14
            java.util.Objects.requireNonNull(r0)
            java.net.URL r1 = r14.f2707a
            java.lang.String r2 = "CctTransportBackend"
            java.lang.String r3 = "Making request to: %s"
            p005b.p006a.p007a.p024o.C0823f.m402w(r2, r3, r1)
            java.net.URL r1 = r14.f2707a
            java.net.URLConnection r1 = r1.openConnection()
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r3 = 30000(0x7530, float:4.2039E-41)
            r1.setConnectTimeout(r3)
            int r3 = r0.f2706g
            r1.setReadTimeout(r3)
            r3 = 1
            r1.setDoOutput(r3)
            r4 = 0
            r1.setInstanceFollowRedirects(r4)
            java.lang.String r5 = "POST"
            r1.setRequestMethod(r5)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = "2.3.3"
            r3[r4] = r5
            java.lang.String r4 = "datatransport/%s android/"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.String r4 = "User-Agent"
            r1.setRequestProperty(r4, r3)
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r4 = "gzip"
            r1.setRequestProperty(r3, r4)
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "application/json"
            r1.setRequestProperty(r5, r6)
            java.lang.String r6 = "Accept-Encoding"
            r1.setRequestProperty(r6, r4)
            java.lang.String r6 = r14.f2709c
            if (r6 == 0) goto L_0x005c
            java.lang.String r7 = "X-Goog-Api-Key"
            r1.setRequestProperty(r7, r6)
        L_0x005c:
            r6 = 0
            r8 = 0
            java.io.OutputStream r9 = r1.getOutputStream()     // Catch:{ ConnectException -> 0x0159, UnknownHostException -> 0x0157, c -> 0x0149, IOException -> 0x0147 }
            java.util.zip.GZIPOutputStream r10 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0140 }
            r10.<init>(r9)     // Catch:{ all -> 0x0140 }
            b.l.d.s.a r0 = r0.f2700a     // Catch:{ all -> 0x013b }
            b.l.a.a.e.e.j r14 = r14.f2708b     // Catch:{ all -> 0x013b }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ all -> 0x013b }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x013b }
            r12.<init>(r10)     // Catch:{ all -> 0x013b }
            r11.<init>(r12)     // Catch:{ all -> 0x013b }
            b.l.d.s.j.d r0 = (p005b.p096l.p180d.p208s.p210j.C4215d) r0     // Catch:{ all -> 0x013b }
            r0.mo15804a(r14, r11)     // Catch:{ all -> 0x013b }
            r10.close()     // Catch:{ all -> 0x0140 }
            if (r9 == 0) goto L_0x0083
            r9.close()     // Catch:{ ConnectException -> 0x0159, UnknownHostException -> 0x0157, c -> 0x0149, IOException -> 0x0147 }
        L_0x0083:
            int r14 = r1.getResponseCode()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Status Code: "
            r0.append(r9)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            p005b.p006a.p007a.p024o.C0823f.m351T(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Content-Type: "
            r0.append(r9)
            java.lang.String r5 = r1.getHeaderField(r5)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            p005b.p006a.p007a.p024o.C0823f.m351T(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Content-Encoding: "
            r0.append(r5)
            java.lang.String r5 = r1.getHeaderField(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            p005b.p006a.p007a.p024o.C0823f.m351T(r2, r0)
            r0 = 302(0x12e, float:4.23E-43)
            if (r14 == r0) goto L_0x0129
            r0 = 301(0x12d, float:4.22E-43)
            if (r14 == r0) goto L_0x0129
            r0 = 307(0x133, float:4.3E-43)
            if (r14 != r0) goto L_0x00d8
            goto L_0x0129
        L_0x00d8:
            r0 = 200(0xc8, float:2.8E-43)
            if (r14 == r0) goto L_0x00e3
            b.l.a.a.e.d$b r0 = new b.l.a.a.e.d$b
            r0.<init>(r14, r8, r6)
            goto L_0x0166
        L_0x00e3:
            java.io.InputStream r0 = r1.getInputStream()
            java.lang.String r1 = r1.getHeaderField(r3)     // Catch:{ all -> 0x0122 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x00f7
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0122 }
            r1.<init>(r0)     // Catch:{ all -> 0x0122 }
            goto L_0x00f8
        L_0x00f7:
            r1 = r0
        L_0x00f8:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x011b }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x011b }
            r3.<init>(r1)     // Catch:{ all -> 0x011b }
            r2.<init>(r3)     // Catch:{ all -> 0x011b }
            b.l.a.a.e.e.n r2 = p005b.p096l.p097a.p098a.p099e.p100e.C1620n.m2127a(r2)     // Catch:{ all -> 0x011b }
            b.l.a.a.e.e.h r2 = (p005b.p096l.p097a.p098a.p099e.p100e.C1611h) r2     // Catch:{ all -> 0x011b }
            long r2 = r2.f2787a     // Catch:{ all -> 0x011b }
            b.l.a.a.e.d$b r4 = new b.l.a.a.e.d$b     // Catch:{ all -> 0x011b }
            r4.<init>(r14, r8, r2)     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x0114
            r1.close()     // Catch:{ all -> 0x0122 }
        L_0x0114:
            if (r0 == 0) goto L_0x0119
            r0.close()
        L_0x0119:
            r0 = r4
            goto L_0x0166
        L_0x011b:
            r14 = move-exception
            if (r1 == 0) goto L_0x0121
            r1.close()     // Catch:{ all -> 0x0121 }
        L_0x0121:
            throw r14     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r14 = move-exception
            if (r0 == 0) goto L_0x0128
            r0.close()     // Catch:{ all -> 0x0128 }
        L_0x0128:
            throw r14
        L_0x0129:
            java.lang.String r0 = "Location"
            java.lang.String r0 = r1.getHeaderField(r0)
            b.l.a.a.e.d$b r1 = new b.l.a.a.e.d$b
            java.net.URL r2 = new java.net.URL
            r2.<init>(r0)
            r1.<init>(r14, r2, r6)
            r0 = r1
            goto L_0x0166
        L_0x013b:
            r14 = move-exception
            r10.close()     // Catch:{ all -> 0x013f }
        L_0x013f:
            throw r14     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r14 = move-exception
            if (r9 == 0) goto L_0x0146
            r9.close()     // Catch:{ all -> 0x0146 }
        L_0x0146:
            throw r14     // Catch:{ ConnectException -> 0x0159, UnknownHostException -> 0x0157, c -> 0x0149, IOException -> 0x0147 }
        L_0x0147:
            r14 = move-exception
            goto L_0x014a
        L_0x0149:
            r14 = move-exception
        L_0x014a:
            java.lang.String r0 = "Couldn't encode request, returning with 400"
            p005b.p006a.p007a.p024o.C0823f.m406y(r2, r0, r14)
            b.l.a.a.e.d$b r0 = new b.l.a.a.e.d$b
            r14 = 400(0x190, float:5.6E-43)
            r0.<init>(r14, r8, r6)
            goto L_0x0166
        L_0x0157:
            r14 = move-exception
            goto L_0x015a
        L_0x0159:
            r14 = move-exception
        L_0x015a:
            java.lang.String r0 = "Couldn't open connection, returning with 500"
            p005b.p006a.p007a.p024o.C0823f.m406y(r2, r0, r14)
            b.l.a.a.e.d$b r0 = new b.l.a.a.e.d$b
            r14 = 500(0x1f4, float:7.0E-43)
            r0.<init>(r14, r8, r6)
        L_0x0166:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p098a.p099e.C1588b.mo11735a(java.lang.Object):java.lang.Object");
    }
}
