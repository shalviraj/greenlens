package p005b.p096l.p097a.p113c.p119b.p126p;

import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;

/* renamed from: b.l.a.c.b.p.f */
public class C1962f {

    /* renamed from: a */
    public static String f3521a;

    /* renamed from: b */
    public static int f3522b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC, Splitter:B:18:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b A[SYNTHETIC, Splitter:B:26:0x004b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m2878a() {
        /*
            java.lang.String r0 = f3521a
            if (r0 != 0) goto L_0x0050
            int r0 = f3522b
            if (r0 != 0) goto L_0x000e
            int r0 = android.os.Process.myPid()
            f3522b = r0
        L_0x000e:
            int r0 = f3522b
            r1 = 0
            if (r0 > 0) goto L_0x0014
            goto L_0x004e
        L_0x0014:
            r2 = 25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            java.lang.String r2 = "/proc/"
            r3.append(r2)     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            r3.append(r0)     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            java.io.BufferedReader r0 = m2879b(r0)     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            java.lang.String r2 = r0.readLine()     // Catch:{ IOException -> 0x0049, all -> 0x003c }
            java.lang.String r1 = r2.trim()     // Catch:{ IOException -> 0x0049, all -> 0x003c }
            r0.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x004e
        L_0x003c:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0042
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r0
        L_0x0048:
            r0 = r1
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            f3521a = r1
        L_0x0050:
            java.lang.String r0 = f3521a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p126p.C1962f.m2878a():java.lang.String");
    }

    /* renamed from: b */
    public static BufferedReader m2879b(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
