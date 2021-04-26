package p005b.p273o;

import p005b.p273o.C5009w3;

/* renamed from: b.o.z3 */
public abstract class C5054z3 implements C5009w3 {

    /* renamed from: a */
    public C5009w3.C5010a f9759a;

    /* renamed from: b */
    public Thread f9760b;

    /* renamed from: c */
    public boolean f9761c;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        r7 = p005b.p035e.p036a.p037a.C0843a.m460u("Could not register with ");
        r7.append(mo16521b());
        r7.append(" due to an issue with your AndroidManifest.xml or with 'Google Play services'.");
        p005b.p273o.C4857i2.m8933a(r5, r7.toString(), r6);
        ((p005b.p273o.C4857i2.C4861d) r4.f9759a).mo16612a((java.lang.String) null, -8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16529a(android.content.Context r5, java.lang.String r6, p005b.p273o.C5009w3.C5010a r7) {
        /*
            r4 = this;
            b.o.i2$k r5 = p005b.p273o.C4857i2.C4868k.ERROR
            r4.f9759a = r7
            r0 = 0
            r1 = 1
            java.lang.Float.parseFloat(r6)     // Catch:{ all -> 0x000b }
            r2 = r1
            goto L_0x000c
        L_0x000b:
            r2 = r0
        L_0x000c:
            r3 = 0
            if (r2 != 0) goto L_0x001b
            java.lang.String r1 = "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard."
            p005b.p273o.C4857i2.m8933a(r5, r1, r3)
            r1 = -6
            b.o.i2$d r7 = (p005b.p273o.C4857i2.C4861d) r7
            r7.mo16612a(r3, r1)
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            if (r0 == 0) goto L_0x0077
            boolean r7 = p005b.p273o.C4835f2.m8864n()     // Catch:{ all -> 0x0055 }
            if (r7 == 0) goto L_0x0044
            monitor-enter(r4)     // Catch:{ all -> 0x0055 }
            java.lang.Thread r7 = r4.f9760b     // Catch:{ all -> 0x0041 }
            if (r7 == 0) goto L_0x0030
            boolean r7 = r7.isAlive()     // Catch:{ all -> 0x0041 }
            if (r7 == 0) goto L_0x0030
            goto L_0x003f
        L_0x0030:
            java.lang.Thread r7 = new java.lang.Thread     // Catch:{ all -> 0x0041 }
            b.o.y3 r0 = new b.o.y3     // Catch:{ all -> 0x0041 }
            r0.<init>(r4, r6)     // Catch:{ all -> 0x0041 }
            r7.<init>(r0)     // Catch:{ all -> 0x0041 }
            r4.f9760b = r7     // Catch:{ all -> 0x0041 }
            r7.start()     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            goto L_0x0077
        L_0x0041:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            throw r6     // Catch:{ all -> 0x0055 }
        L_0x0044:
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2732M0()     // Catch:{ all -> 0x0055 }
            java.lang.String r6 = "'Google Play services' app not installed or disabled on the device."
            p005b.p273o.C4857i2.m8933a(r5, r6, r3)     // Catch:{ all -> 0x0055 }
            b.o.w3$a r6 = r4.f9759a     // Catch:{ all -> 0x0055 }
            r7 = -7
            b.o.i2$d r6 = (p005b.p273o.C4857i2.C4861d) r6     // Catch:{ all -> 0x0055 }
            r6.mo16612a(r3, r7)     // Catch:{ all -> 0x0055 }
            goto L_0x0077
        L_0x0055:
            r6 = move-exception
            java.lang.String r7 = "Could not register with "
            java.lang.StringBuilder r7 = p005b.p035e.p036a.p037a.C0843a.m460u(r7)
            java.lang.String r0 = r4.mo16521b()
            r7.append(r0)
            java.lang.String r0 = " due to an issue with your AndroidManifest.xml or with 'Google Play services'."
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            p005b.p273o.C4857i2.m8933a(r5, r7, r6)
            b.o.w3$a r5 = r4.f9759a
            r6 = -8
            b.o.i2$d r5 = (p005b.p273o.C4857i2.C4861d) r5
            r5.mo16612a(r3, r6)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C5054z3.mo16529a(android.content.Context, java.lang.String, b.o.w3$a):void");
    }

    /* renamed from: b */
    public abstract String mo16521b();

    /* renamed from: c */
    public abstract String mo16522c(String str);
}
