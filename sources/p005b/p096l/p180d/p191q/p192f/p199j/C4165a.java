package p005b.p096l.p180d.p191q.p192f.p199j;

import java.util.HashMap;
import java.util.Map;

/* renamed from: b.l.d.q.f.j.a */
public class C4165a {

    /* renamed from: a */
    public final String f7721a;

    /* renamed from: b */
    public final Map<String, String> f7722b;

    /* renamed from: c */
    public final Map<String, String> f7723c = new HashMap();

    public C4165a(String str, Map<String, String> map) {
        this.f7721a = str;
        this.f7722b = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006e, code lost:
        r9 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0076, code lost:
        if (r9.isEmpty() == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0078, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007f, code lost:
        if (r8.contains("?") == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        if (r8.endsWith("&") != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        r9 = p005b.p035e.p036a.p037a.C0843a.m451l("&", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        return p005b.p035e.p036a.p037a.C0843a.m451l(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x002c, code lost:
        if (r1.getValue() != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        return p005b.p035e.p036a.p037a.C0843a.m452m(r8, "?", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002f, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        r2.append(r5);
        r0.append(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0040, code lost:
        if (r9.hasNext() == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0042, code lost:
        r2 = r9.next();
        r4 = p005b.p035e.p036a.p037a.C0843a.m460u("&");
        r4.append((java.lang.String) r2.getKey());
        r4.append("=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005c, code lost:
        if (r2.getValue() == null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005e, code lost:
        r5 = r1;
        r1 = r2;
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        r6 = r5;
        r5 = (java.lang.String) r1.getValue();
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006b, code lost:
        r5 = r1;
        r2 = r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15768a(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = "="
            r2.append(r3)
            java.lang.Object r4 = r1.getValue()
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x002f
            goto L_0x0061
        L_0x002f:
            r1 = r5
        L_0x0030:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            boolean r2 = r9.hasNext()
            java.lang.String r4 = "&"
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.StringBuilder r4 = p005b.p035e.p036a.p037a.C0843a.m460u(r4)
            java.lang.Object r5 = r2.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            r4.append(r3)
            java.lang.Object r5 = r2.getValue()
            if (r5 == 0) goto L_0x006b
            r5 = r1
            r1 = r2
            r2 = r4
        L_0x0061:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r6 = r5
            r5 = r1
            r1 = r6
            goto L_0x0030
        L_0x006b:
            r5 = r1
            r2 = r4
            goto L_0x002f
        L_0x006e:
            java.lang.String r9 = r0.toString()
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0079
            return r8
        L_0x0079:
            java.lang.String r0 = "?"
            boolean r1 = r8.contains(r0)
            if (r1 == 0) goto L_0x0090
            boolean r0 = r8.endsWith(r4)
            if (r0 != 0) goto L_0x008b
            java.lang.String r9 = p005b.p035e.p036a.p037a.C0843a.m451l(r4, r9)
        L_0x008b:
            java.lang.String r8 = p005b.p035e.p036a.p037a.C0843a.m451l(r8, r9)
            return r8
        L_0x0090:
            java.lang.String r8 = p005b.p035e.p036a.p037a.C0843a.m452m(r8, r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p199j.C4165a.mo15768a(java.lang.String, java.util.Map):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p180d.p191q.p192f.p199j.C4167c mo15769b() {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = r8.f7721a     // Catch:{ all -> 0x00a6 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r8.f7722b     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r8.mo15768a(r1, r2)     // Catch:{ all -> 0x00a6 }
            b.l.d.q.f.b r2 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r3.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r4 = "GET Request URL: "
            r3.append(r4)     // Catch:{ all -> 0x00a6 }
            r3.append(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a6 }
            r2.mo15499e(r3)     // Catch:{ all -> 0x00a6 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x00a6 }
            r2.<init>(r1)     // Catch:{ all -> 0x00a6 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x00a6 }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x00a6 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch:{ all -> 0x00a4 }
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x00a4 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r8.f7723c     // Catch:{ all -> 0x00a4 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00a4 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a4 }
        L_0x0041:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a4 }
            if (r3 == 0) goto L_0x005d
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a4 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00a4 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00a4 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00a4 }
            r1.addRequestProperty(r4, r3)     // Catch:{ all -> 0x00a4 }
            goto L_0x0041
        L_0x005d:
            r1.connect()     // Catch:{ all -> 0x00a4 }
            int r2 = r1.getResponseCode()     // Catch:{ all -> 0x00a4 }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ all -> 0x00a4 }
            if (r3 == 0) goto L_0x0096
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0092 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0092 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0092 }
            r0.<init>(r4)     // Catch:{ all -> 0x0092 }
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r5.<init>()     // Catch:{ all -> 0x0092 }
        L_0x007f:
            int r6 = r0.read(r4)     // Catch:{ all -> 0x0092 }
            r7 = -1
            if (r6 == r7) goto L_0x008b
            r7 = 0
            r5.append(r4, r7, r6)     // Catch:{ all -> 0x0092 }
            goto L_0x007f
        L_0x008b:
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0092 }
            goto L_0x0096
        L_0x0090:
            r2 = r0
            goto L_0x0094
        L_0x0092:
            r0 = move-exception
            goto L_0x0090
        L_0x0094:
            r0 = r3
            goto L_0x00a8
        L_0x0096:
            if (r3 == 0) goto L_0x009b
            r3.close()
        L_0x009b:
            r1.disconnect()
            b.l.d.q.f.j.c r1 = new b.l.d.q.f.j.c
            r1.<init>(r2, r0)
            return r1
        L_0x00a4:
            r2 = move-exception
            goto L_0x00a8
        L_0x00a6:
            r2 = move-exception
            r1 = r0
        L_0x00a8:
            if (r0 == 0) goto L_0x00ad
            r0.close()
        L_0x00ad:
            if (r1 == 0) goto L_0x00b2
            r1.disconnect()
        L_0x00b2:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p199j.C4165a.mo15769b():b.l.d.q.f.j.c");
    }
}
