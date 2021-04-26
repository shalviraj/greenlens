package p005b.p096l.p097a.p113c.p131e.p140i;

import android.content.Context;

/* renamed from: b.l.a.c.e.i.h3 */
public final /* synthetic */ class C2806h3 implements C2975u3 {

    /* renamed from: g */
    public final Context f4760g;

    public C2806h3(Context context) {
        this.f4760g = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b A[Catch:{ RuntimeException -> 0x005e, all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013e A[Catch:{ RuntimeException -> 0x005e, all -> 0x0144 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo13235a() {
        /*
            r13 = this;
            java.lang.String r0 = "HermeticFileOverrides"
            android.content.Context r1 = r13.f4760g
            java.lang.Object r2 = p005b.p096l.p097a.p113c.p131e.p140i.C2910p3.f4929f
            java.lang.String r2 = android.os.Build.TYPE
            java.lang.String r3 = android.os.Build.TAGS
            java.lang.String r4 = "eng"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x001b
            java.lang.String r4 = "userdebug"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            java.lang.String r2 = "dev-keys"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x0030
            java.lang.String r2 = "test-keys"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            b.l.a.c.e.i.r3<java.lang.Object> r0 = p005b.p096l.p097a.p113c.p131e.p140i.C2936r3.f4976g
            goto L_0x0143
        L_0x0030:
            boolean r2 = r1.isDeviceProtectedStorage()
            if (r2 != 0) goto L_0x003a
            android.content.Context r1 = r1.createDeviceProtectedStorageContext()
        L_0x003a:
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0144 }
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ RuntimeException -> 0x005e }
            java.lang.String r5 = "phenotype_hermetic"
            java.io.File r1 = r1.getDir(r5, r3)     // Catch:{ RuntimeException -> 0x005e }
            java.lang.String r5 = "overrides.txt"
            r4.<init>(r1, r5)     // Catch:{ RuntimeException -> 0x005e }
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x005b
            b.l.a.c.e.i.t3 r1 = new b.l.a.c.e.i.t3     // Catch:{ all -> 0x0144 }
            r1.<init>(r4)     // Catch:{ all -> 0x0144 }
            goto L_0x0065
        L_0x005b:
            b.l.a.c.e.i.r3<java.lang.Object> r1 = p005b.p096l.p097a.p113c.p131e.p140i.C2936r3.f4976g     // Catch:{ all -> 0x0144 }
            goto L_0x0065
        L_0x005e:
            r1 = move-exception
            java.lang.String r4 = "no data dir"
            android.util.Log.e(r0, r4, r1)     // Catch:{ all -> 0x0144 }
            goto L_0x005b
        L_0x0065:
            boolean r4 = r1.mo13607a()     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x013e
            java.lang.Object r1 = r1.mo13608b()     // Catch:{ all -> 0x0144 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0144 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0137 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0137 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0137 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0137 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0137 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0137 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x012b }
            r5.<init>()     // Catch:{ all -> 0x012b }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x012b }
            r6.<init>()     // Catch:{ all -> 0x012b }
        L_0x008a:
            java.lang.String r7 = r4.readLine()     // Catch:{ all -> 0x012b }
            if (r7 == 0) goto L_0x00fe
            java.lang.String r8 = " "
            r9 = 3
            java.lang.String[] r8 = r7.split(r8, r9)     // Catch:{ all -> 0x012b }
            int r10 = r8.length     // Catch:{ all -> 0x012b }
            if (r10 == r9) goto L_0x00b0
            java.lang.String r8 = "Invalid: "
            int r9 = r7.length()     // Catch:{ all -> 0x012b }
            if (r9 == 0) goto L_0x00a7
            java.lang.String r7 = r8.concat(r7)     // Catch:{ all -> 0x012b }
            goto L_0x00ac
        L_0x00a7:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x012b }
            r7.<init>(r8)     // Catch:{ all -> 0x012b }
        L_0x00ac:
            android.util.Log.e(r0, r7)     // Catch:{ all -> 0x012b }
            goto L_0x008a
        L_0x00b0:
            r7 = r8[r3]     // Catch:{ all -> 0x012b }
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x012b }
            r9.<init>(r7)     // Catch:{ all -> 0x012b }
            r7 = 1
            r7 = r8[r7]     // Catch:{ all -> 0x012b }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x012b }
            r10.<init>(r7)     // Catch:{ all -> 0x012b }
            java.lang.String r7 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x012b }
            r10 = 2
            r11 = r8[r10]     // Catch:{ all -> 0x012b }
            java.lang.Object r11 = r6.get(r11)     // Catch:{ all -> 0x012b }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x012b }
            if (r11 != 0) goto L_0x00e6
            r8 = r8[r10]     // Catch:{ all -> 0x012b }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x012b }
            r10.<init>(r8)     // Catch:{ all -> 0x012b }
            java.lang.String r11 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x012b }
            int r8 = r11.length()     // Catch:{ all -> 0x012b }
            r12 = 1024(0x400, float:1.435E-42)
            if (r8 < r12) goto L_0x00e3
            if (r11 != r10) goto L_0x00e6
        L_0x00e3:
            r6.put(r10, r11)     // Catch:{ all -> 0x012b }
        L_0x00e6:
            boolean r8 = r5.containsKey(r9)     // Catch:{ all -> 0x012b }
            if (r8 != 0) goto L_0x00f4
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x012b }
            r8.<init>()     // Catch:{ all -> 0x012b }
            r5.put(r9, r8)     // Catch:{ all -> 0x012b }
        L_0x00f4:
            java.lang.Object r8 = r5.get(r9)     // Catch:{ all -> 0x012b }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x012b }
            r8.put(r7, r11)     // Catch:{ all -> 0x012b }
            goto L_0x008a
        L_0x00fe:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x012b }
            int r3 = r1.length()     // Catch:{ all -> 0x012b }
            int r3 = r3 + 7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x012b }
            r6.<init>(r3)     // Catch:{ all -> 0x012b }
            java.lang.String r3 = "Parsed "
            r6.append(r3)     // Catch:{ all -> 0x012b }
            r6.append(r1)     // Catch:{ all -> 0x012b }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x012b }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x012b }
            b.l.a.c.e.i.e3 r0 = new b.l.a.c.e.i.e3     // Catch:{ all -> 0x012b }
            r0.<init>(r5)     // Catch:{ all -> 0x012b }
            r4.close()     // Catch:{ IOException -> 0x0137 }
            b.l.a.c.e.i.t3 r1 = new b.l.a.c.e.i.t3     // Catch:{ all -> 0x0144 }
            r1.<init>(r0)     // Catch:{ all -> 0x0144 }
            r0 = r1
            goto L_0x0140
        L_0x012b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0130 }
            goto L_0x0136
        L_0x0130:
            r1 = move-exception
            b.l.a.c.e.i.y3 r3 = p005b.p096l.p097a.p113c.p131e.p140i.C2781f4.f4721a     // Catch:{ IOException -> 0x0137 }
            r3.mo13251a(r0, r1)     // Catch:{ IOException -> 0x0137 }
        L_0x0136:
            throw r0     // Catch:{ IOException -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0144 }
            r1.<init>(r0)     // Catch:{ all -> 0x0144 }
            throw r1     // Catch:{ all -> 0x0144 }
        L_0x013e:
            b.l.a.c.e.i.r3<java.lang.Object> r0 = p005b.p096l.p097a.p113c.p131e.p140i.C2936r3.f4976g     // Catch:{ all -> 0x0144 }
        L_0x0140:
            android.os.StrictMode.setThreadPolicy(r2)
        L_0x0143:
            return r0
        L_0x0144:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2806h3.mo13235a():java.lang.Object");
    }
}
