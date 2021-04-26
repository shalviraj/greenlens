package p005b.p273o;

/* renamed from: b.o.y3 */
public class C5045y3 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ String f9751g;

    /* renamed from: h */
    public final /* synthetic */ C5054z3 f9752h;

    public C5045y3(C5054z3 z3Var, String str) {
        this.f9752h = z3Var;
        this.f9751g = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca A[LOOP:0: B:1:0x0002->B:24:0x00ca, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            r2 = 5
            if (r1 >= r2) goto L_0x00d3
            b.o.z3 r3 = r12.f9752h
            java.lang.String r4 = r12.f9751g
            java.util.Objects.requireNonNull(r3)
            java.lang.String r5 = " Token"
            b.o.i2$k r6 = p005b.p273o.C4857i2.C4868k.INFO
            b.o.i2$k r7 = p005b.p273o.C4857i2.C4868k.ERROR
            r8 = 0
            r9 = 1
            java.lang.String r4 = r3.mo16522c(r4)     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            r10.<init>()     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            java.lang.String r11 = "Device registered, push token = "
            r10.append(r11)     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            r10.append(r4)     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            p005b.p273o.C4857i2.m8933a(r6, r10, r8)     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            b.o.w3$a r10 = r3.f9759a     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            b.o.i2$d r10 = (p005b.p273o.C4857i2.C4861d) r10     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            r10.mo16612a(r4, r9)     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            goto L_0x00c7
        L_0x0035:
            r2 = move-exception
            java.lang.String r4 = "Unknown error getting "
            java.lang.StringBuilder r4 = p005b.p035e.p036a.p037a.C0843a.m460u(r4)
            java.lang.String r6 = r3.mo16521b()
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            p005b.p273o.C4857i2.m8933a(r7, r4, r2)
            b.o.w3$a r2 = r3.f9759a
            r3 = -12
            goto L_0x007e
        L_0x0052:
            r4 = move-exception
            java.lang.String r10 = r4.getMessage()
            java.lang.String r11 = "SERVICE_NOT_AVAILABLE"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0084
            java.lang.String r2 = "Error Getting "
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
            java.lang.String r6 = r3.mo16521b()
            r2.append(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            p005b.p273o.C4857i2.m8933a(r7, r2, r4)
            boolean r2 = r3.f9761c
            if (r2 != 0) goto L_0x00c7
            b.o.w3$a r2 = r3.f9759a
            r3 = -11
        L_0x007e:
            b.o.i2$d r2 = (p005b.p273o.C4857i2.C4861d) r2
            r2.mo16612a(r8, r3)
            goto L_0x00c7
        L_0x0084:
            r5 = 4
            if (r1 < r5) goto L_0x00a3
            java.lang.String r5 = "Retry count of "
            java.lang.String r6 = " exceed! Could not get a "
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m461v(r5, r2, r6)
            java.lang.String r3 = r3.mo16521b()
            r2.append(r3)
            java.lang.String r3 = " Token."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            p005b.p273o.C4857i2.m8933a(r7, r2, r4)
            goto L_0x00c6
        L_0x00a3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "'Google Play services' returned SERVICE_NOT_AVAILABLE error. Current retry count: "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            p005b.p273o.C4857i2.m8933a(r6, r2, r4)
            r2 = 2
            if (r1 != r2) goto L_0x00c6
            b.o.w3$a r2 = r3.f9759a
            r4 = -9
            b.o.i2$d r2 = (p005b.p273o.C4857i2.C4861d) r2
            r2.mo16612a(r8, r4)
            r3.f9761c = r9
            goto L_0x00c7
        L_0x00c6:
            r9 = r0
        L_0x00c7:
            if (r9 == 0) goto L_0x00ca
            return
        L_0x00ca:
            int r1 = r1 + 1
            int r2 = r1 * 10000
            p005b.p273o.C4835f2.m8872v(r2)
            goto L_0x0002
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C5045y3.run():void");
    }
}
