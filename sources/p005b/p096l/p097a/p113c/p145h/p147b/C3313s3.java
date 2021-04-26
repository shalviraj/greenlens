package p005b.p096l.p097a.p113c.p145h.p147b;

import androidx.annotation.WorkerThread;
import java.net.URL;
import java.util.Map;
import p005b.p006a.p007a.p024o.C0823f;

@WorkerThread
/* renamed from: b.l.a.c.h.b.s3 */
public final class C3313s3 implements Runnable {

    /* renamed from: g */
    public final URL f5944g;

    /* renamed from: h */
    public final byte[] f5945h;

    /* renamed from: i */
    public final C3291q3 f5946i;

    /* renamed from: j */
    public final String f5947j;

    /* renamed from: k */
    public final Map<String, String> f5948k;

    /* renamed from: l */
    public final /* synthetic */ C3324t3 f5949l;

    public C3313s3(C3324t3 t3Var, String str, URL url, byte[] bArr, Map<String, String> map, C3291q3 q3Var) {
        this.f5949l = t3Var;
        C0823f.m376j(str);
        this.f5944g = url;
        this.f5945h = bArr;
        this.f5946i = q3Var;
        this.f5947j = str;
        this.f5948k = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf A[SYNTHETIC, Splitter:B:41:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ec A[SYNTHETIC, Splitter:B:59:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0129 A[SYNTHETIC, Splitter:B:71:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            b.l.a.c.h.b.t3 r1 = r12.f5949l
            r1.mo14332g()
            r1 = 0
            r2 = 0
            b.l.a.c.h.b.t3 r3 = r12.f5949l     // Catch:{ IOException -> 0x0121, all -> 0x00e5 }
            java.net.URL r4 = r12.f5944g     // Catch:{ IOException -> 0x0121, all -> 0x00e5 }
            java.net.HttpURLConnection r3 = r3.mo14592m(r4)     // Catch:{ IOException -> 0x0121, all -> 0x00e5 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f5948k     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            if (r4 == 0) goto L_0x0039
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
        L_0x001d:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            goto L_0x001d
        L_0x0039:
            byte[] r4 = r12.f5945h     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            if (r4 == 0) goto L_0x0089
            b.l.a.c.h.b.t3 r4 = r12.f5949l     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            b.l.a.c.h.b.j9 r4 = r4.f6128b     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            b.l.a.c.h.b.l9 r4 = r4.f5654g     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r4)     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            byte[] r5 = r12.f5945h     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            byte[] r4 = r4.mo14401F(r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            b.l.a.c.h.b.t3 r5 = r12.f5949l     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            b.l.a.c.h.b.p4 r5 = r5.f5638a     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            b.l.a.c.h.b.m3 r5 = r5.f5807n     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            int r6 = r4.length     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            java.lang.String r7 = "Uploading data. size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            r5.mo14415b(r7, r8)     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r3.addRequestProperty(r5, r7)     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            r3.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            r3.connect()     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            r5.write(r4)     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            goto L_0x0089
        L_0x007c:
            r4 = move-exception
            r8 = r1
            r11 = r2
            r2 = r5
            goto L_0x00ea
        L_0x0082:
            r4 = move-exception
            r8 = r1
            r11 = r2
            r9 = r4
            r2 = r5
            goto L_0x0127
        L_0x0089:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00e1, all -> 0x00dd }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00db, all -> 0x00d9 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00cb }
            r4.<init>()     // Catch:{ all -> 0x00cb }
            java.io.InputStream r5 = r3.getInputStream()     // Catch:{ all -> 0x00cb }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00c9 }
        L_0x009e:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00c9 }
            if (r7 <= 0) goto L_0x00a8
            r4.write(r6, r1, r7)     // Catch:{ all -> 0x00c9 }
            goto L_0x009e
        L_0x00a8:
            byte[] r10 = r4.toByteArray()     // Catch:{ all -> 0x00c9 }
            r5.close()     // Catch:{ IOException -> 0x00d6, all -> 0x00d3 }
            r3.disconnect()
            b.l.a.c.h.b.t3 r0 = r12.f5949l
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.m4 r0 = r0.mo14331f()
            b.l.a.c.h.b.r3 r1 = new b.l.a.c.h.b.r3
            java.lang.String r6 = r12.f5947j
            b.l.a.c.h.b.q3 r7 = r12.f5946i
            r9 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00c5:
            r0.mo14420q(r1)
            return
        L_0x00c9:
            r1 = move-exception
            goto L_0x00cd
        L_0x00cb:
            r1 = move-exception
            r5 = r2
        L_0x00cd:
            if (r5 == 0) goto L_0x00d2
            r5.close()     // Catch:{ IOException -> 0x00d6, all -> 0x00d3 }
        L_0x00d2:
            throw r1     // Catch:{ IOException -> 0x00d6, all -> 0x00d3 }
        L_0x00d3:
            r1 = move-exception
            r4 = r1
            goto L_0x00ea
        L_0x00d6:
            r1 = move-exception
            r4 = r1
            goto L_0x0126
        L_0x00d9:
            r4 = move-exception
            goto L_0x00df
        L_0x00db:
            r4 = move-exception
            goto L_0x00e3
        L_0x00dd:
            r4 = move-exception
            r8 = r1
        L_0x00df:
            r11 = r2
            goto L_0x00ea
        L_0x00e1:
            r4 = move-exception
            r8 = r1
        L_0x00e3:
            r11 = r2
            goto L_0x0126
        L_0x00e5:
            r3 = move-exception
            r4 = r3
            r8 = r1
            r3 = r2
            r11 = r3
        L_0x00ea:
            if (r2 == 0) goto L_0x0104
            r2.close()     // Catch:{ IOException -> 0x00f0 }
            goto L_0x0104
        L_0x00f0:
            r1 = move-exception
            b.l.a.c.h.b.t3 r2 = r12.f5949l
            b.l.a.c.h.b.p4 r2 = r2.f5638a
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5799f
            java.lang.String r5 = r12.f5947j
            java.lang.Object r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r5)
            r2.mo14416c(r0, r5, r1)
        L_0x0104:
            if (r3 == 0) goto L_0x0109
            r3.disconnect()
        L_0x0109:
            b.l.a.c.h.b.t3 r0 = r12.f5949l
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.m4 r0 = r0.mo14331f()
            b.l.a.c.h.b.r3 r1 = new b.l.a.c.h.b.r3
            java.lang.String r6 = r12.f5947j
            b.l.a.c.h.b.q3 r7 = r12.f5946i
            r9 = 0
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.mo14420q(r1)
            throw r4
        L_0x0121:
            r3 = move-exception
            r4 = r3
            r8 = r1
            r3 = r2
            r11 = r3
        L_0x0126:
            r9 = r4
        L_0x0127:
            if (r2 == 0) goto L_0x0141
            r2.close()     // Catch:{ IOException -> 0x012d }
            goto L_0x0141
        L_0x012d:
            r1 = move-exception
            b.l.a.c.h.b.t3 r2 = r12.f5949l
            b.l.a.c.h.b.p4 r2 = r2.f5638a
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5799f
            java.lang.String r4 = r12.f5947j
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r4)
            r2.mo14416c(r0, r4, r1)
        L_0x0141:
            if (r3 == 0) goto L_0x0146
            r3.disconnect()
        L_0x0146:
            b.l.a.c.h.b.t3 r0 = r12.f5949l
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.m4 r0 = r0.mo14331f()
            b.l.a.c.h.b.r3 r1 = new b.l.a.c.h.b.r3
            java.lang.String r6 = r12.f5947j
            b.l.a.c.h.b.q3 r7 = r12.f5946i
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3313s3.run():void");
    }
}
