package p005b.p096l.p097a.p113c.p119b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p122m.C1932n0;

/* renamed from: b.l.a.c.b.j */
public class C1768j {

    /* renamed from: b */
    public static C1768j f3120b;

    /* renamed from: a */
    public final Context f3121a;

    public C1768j(Context context) {
        this.f3121a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1768j m2347a(Context context) {
        Objects.requireNonNull(context, "null reference");
        synchronized (C1768j.class) {
            if (f3120b == null) {
                C1932n0 n0Var = C1971t.f3532a;
                synchronized (C1971t.class) {
                    if (C1971t.f3534c == null) {
                        C1971t.f3534c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f3120b = new C1768j(context);
            }
        }
        return f3120b;
    }

    /* renamed from: c */
    public static C1972u m2348c(PackageInfo packageInfo, C1972u... uVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C1975x xVar = new C1975x(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < uVarArr.length; i++) {
            if (uVarArr[i].equals(xVar)) {
                return uVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m2349d(PackageInfo packageInfo, boolean z) {
        C1972u uVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                uVar = m2348c(packageInfo, C1977z.f3543a);
            } else {
                uVar = m2348c(packageInfo, C1977z.f3543a[0]);
            }
            if (uVar != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3 A[LOOP:0: B:5:0x001b->B:50:0x00b3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bd A[EDGE_INSN: B:63:0x00bd->B:52:0x00bd ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12011b(int r11) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f3121a
            b.l.a.c.b.q.a r0 = p005b.p096l.p097a.p113c.p119b.p128q.C1968b.m2885a(r0)
            android.content.Context r0 = r0.f3529a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r11 = r0.getPackagesForUid(r11)
            if (r11 == 0) goto L_0x00b7
            int r0 = r11.length
            if (r0 != 0) goto L_0x0017
            goto L_0x00b7
        L_0x0017:
            r0 = 0
            int r1 = r11.length
            r2 = 0
            r3 = r2
        L_0x001b:
            if (r3 >= r1) goto L_0x00bd
            r0 = r11[r3]
            android.content.Context r4 = r10.f3121a     // Catch:{ NameNotFoundException -> 0x0095 }
            b.l.a.c.b.q.a r4 = p005b.p096l.p097a.p113c.p119b.p128q.C1968b.m2885a(r4)     // Catch:{ NameNotFoundException -> 0x0095 }
            android.content.Context r4 = r4.f3529a     // Catch:{ NameNotFoundException -> 0x0095 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0095 }
            r5 = 64
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x0095 }
            android.content.Context r5 = r10.f3121a     // Catch:{ NameNotFoundException -> 0x0095 }
            boolean r5 = p005b.p096l.p097a.p113c.p119b.C1767i.m2343a(r5)     // Catch:{ NameNotFoundException -> 0x0095 }
            if (r4 != 0) goto L_0x0041
            java.lang.String r4 = "null pkg"
        L_0x003b:
            b.l.a.c.b.c0 r0 = p005b.p096l.p097a.p113c.p119b.C1757c0.m2327b(r4)     // Catch:{ NameNotFoundException -> 0x0095 }
            goto L_0x00af
        L_0x0041:
            android.content.pm.Signature[] r6 = r4.signatures     // Catch:{ NameNotFoundException -> 0x0095 }
            if (r6 == 0) goto L_0x0092
            int r6 = r6.length     // Catch:{ NameNotFoundException -> 0x0095 }
            r7 = 1
            if (r6 == r7) goto L_0x004a
            goto L_0x0092
        L_0x004a:
            b.l.a.c.b.x r6 = new b.l.a.c.b.x     // Catch:{ NameNotFoundException -> 0x0095 }
            android.content.pm.Signature[] r8 = r4.signatures     // Catch:{ NameNotFoundException -> 0x0095 }
            r8 = r8[r2]     // Catch:{ NameNotFoundException -> 0x0095 }
            byte[] r8 = r8.toByteArray()     // Catch:{ NameNotFoundException -> 0x0095 }
            r6.<init>(r8)     // Catch:{ NameNotFoundException -> 0x0095 }
            java.lang.String r8 = r4.packageName     // Catch:{ NameNotFoundException -> 0x0095 }
            b.l.a.c.b.m.n0 r9 = p005b.p096l.p097a.p113c.p119b.C1971t.f3532a     // Catch:{ NameNotFoundException -> 0x0095 }
            android.os.StrictMode$ThreadPolicy r9 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ NameNotFoundException -> 0x0095 }
            b.l.a.c.b.c0 r5 = p005b.p096l.p097a.p113c.p119b.C1971t.m2886a(r8, r6, r5, r2)     // Catch:{ all -> 0x008d }
            android.os.StrictMode.setThreadPolicy(r9)     // Catch:{ NameNotFoundException -> 0x0095 }
            boolean r9 = r5.f3101a     // Catch:{ NameNotFoundException -> 0x0095 }
            if (r9 == 0) goto L_0x008b
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch:{ NameNotFoundException -> 0x0095 }
            if (r4 == 0) goto L_0x008b
            int r4 = r4.flags     // Catch:{ NameNotFoundException -> 0x0095 }
            r4 = r4 & 2
            if (r4 == 0) goto L_0x008b
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ NameNotFoundException -> 0x0095 }
            b.l.a.c.b.c0 r6 = p005b.p096l.p097a.p113c.p119b.C1971t.m2886a(r8, r6, r2, r7)     // Catch:{ all -> 0x0086 }
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ NameNotFoundException -> 0x0095 }
            boolean r4 = r6.f3101a     // Catch:{ NameNotFoundException -> 0x0095 }
            if (r4 == 0) goto L_0x008b
            java.lang.String r4 = "debuggable release cert app rejected"
            goto L_0x003b
        L_0x0086:
            r5 = move-exception
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ NameNotFoundException -> 0x0095 }
            throw r5     // Catch:{ NameNotFoundException -> 0x0095 }
        L_0x008b:
            r0 = r5
            goto L_0x00af
        L_0x008d:
            r4 = move-exception
            android.os.StrictMode.setThreadPolicy(r9)     // Catch:{ NameNotFoundException -> 0x0095 }
            throw r4     // Catch:{ NameNotFoundException -> 0x0095 }
        L_0x0092:
            java.lang.String r4 = "single cert required"
            goto L_0x003b
        L_0x0095:
            java.lang.String r4 = "no pkg "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r0.length()
            if (r5 == 0) goto L_0x00a6
            java.lang.String r0 = r4.concat(r0)
            goto L_0x00ab
        L_0x00a6:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
        L_0x00ab:
            b.l.a.c.b.c0 r0 = p005b.p096l.p097a.p113c.p119b.C1757c0.m2327b(r0)
        L_0x00af:
            boolean r4 = r0.f3101a
            if (r4 != 0) goto L_0x00bd
            int r3 = r3 + 1
            goto L_0x001b
        L_0x00b7:
            java.lang.String r11 = "no pkgs"
            b.l.a.c.b.c0 r0 = p005b.p096l.p097a.p113c.p119b.C1757c0.m2327b(r11)
        L_0x00bd:
            boolean r11 = r0.f3101a
            if (r11 != 0) goto L_0x00df
            r11 = 3
            java.lang.String r1 = "GoogleCertificatesRslt"
            boolean r11 = android.util.Log.isLoggable(r1, r11)
            if (r11 == 0) goto L_0x00df
            java.lang.Throwable r11 = r0.f3103c
            if (r11 == 0) goto L_0x00d8
            java.lang.String r11 = r0.mo11995a()
            java.lang.Throwable r2 = r0.f3103c
            android.util.Log.d(r1, r11, r2)
            goto L_0x00df
        L_0x00d8:
            java.lang.String r11 = r0.mo11995a()
            android.util.Log.d(r1, r11)
        L_0x00df:
            boolean r11 = r0.f3101a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.C1768j.mo12011b(int):boolean");
    }
}
