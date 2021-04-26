package p005b.p096l.p097a.p113c.p145h.p147b;

import androidx.annotation.WorkerThread;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;

@WorkerThread
/* renamed from: b.l.a.c.h.b.t6 */
public final class C3327t6 implements Runnable {

    /* renamed from: g */
    public final URL f5975g;

    /* renamed from: h */
    public final String f5976h;

    /* renamed from: i */
    public final /* synthetic */ C3338u6 f5977i;

    /* renamed from: j */
    public final C3259n4 f5978j;

    public C3327t6(C3338u6 u6Var, String str, URL url, C3259n4 n4Var) {
        this.f5977i = u6Var;
        C0823f.m376j(str);
        Objects.requireNonNull(url, "null reference");
        this.f5975g = url;
        this.f5978j = n4Var;
        this.f5976h = str;
    }

    /* renamed from: a */
    public final void mo14595a(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f5977i.f5638a.mo14331f().mo14420q(new C3316s6(this, i, exc, bArr, map));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[SYNTHETIC, Splitter:B:24:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            b.l.a.c.h.b.u6 r0 = r10.f5977i
            r0.mo14332g()
            r0 = 0
            r1 = 0
            b.l.a.c.h.b.u6 r2 = r10.f5977i     // Catch:{ IOException -> 0x006a, all -> 0x005c }
            java.net.URL r3 = r10.f5975g     // Catch:{ IOException -> 0x006a, all -> 0x005c }
            java.net.HttpURLConnection r2 = r2.mo14604o(r3)     // Catch:{ IOException -> 0x006a, all -> 0x005c }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x0056, all -> 0x0050 }
            java.util.Map r4 = r2.getHeaderFields()     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x003e }
            r5.<init>()     // Catch:{ all -> 0x003e }
            java.io.InputStream r6 = r2.getInputStream()     // Catch:{ all -> 0x003e }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x003c }
        L_0x0024:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x003c }
            if (r8 <= 0) goto L_0x002e
            r5.write(r7, r0, r8)     // Catch:{ all -> 0x003c }
            goto L_0x0024
        L_0x002e:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x003c }
            r6.close()     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
            r2.disconnect()
            r10.mo14595a(r3, r1, r0, r4)
            return
        L_0x003c:
            r0 = move-exception
            goto L_0x0040
        L_0x003e:
            r0 = move-exception
            r6 = r1
        L_0x0040:
            if (r6 == 0) goto L_0x0045
            r6.close()     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
        L_0x0045:
            throw r0     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            goto L_0x0061
        L_0x0048:
            r0 = move-exception
            goto L_0x006f
        L_0x004a:
            r0 = move-exception
            r4 = r1
            goto L_0x0061
        L_0x004d:
            r0 = move-exception
            r4 = r1
            goto L_0x006f
        L_0x0050:
            r3 = move-exception
            r4 = r1
            r9 = r3
            r3 = r0
            r0 = r9
            goto L_0x0061
        L_0x0056:
            r3 = move-exception
            r4 = r1
            r9 = r3
            r3 = r0
            r0 = r9
            goto L_0x006f
        L_0x005c:
            r2 = move-exception
            r3 = r0
            r4 = r1
            r0 = r2
            r2 = r4
        L_0x0061:
            if (r2 == 0) goto L_0x0066
            r2.disconnect()
        L_0x0066:
            r10.mo14595a(r3, r1, r1, r4)
            throw r0
        L_0x006a:
            r2 = move-exception
            r3 = r0
            r4 = r1
            r0 = r2
            r2 = r4
        L_0x006f:
            if (r2 == 0) goto L_0x0074
            r2.disconnect()
        L_0x0074:
            r10.mo14595a(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3327t6.run():void");
    }
}
