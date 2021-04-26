package p005b.p096l.p164b.p165a.p169b.p170p;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p005b.p096l.p164b.p165a.p169b.C3683k;
import p005b.p096l.p164b.p165a.p173d.C3745v;

/* renamed from: b.l.b.a.b.p.c */
public final class C3691c extends C3683k {

    /* renamed from: g */
    public static final C3694c f6814g = new C3693b();

    /* renamed from: e */
    public final HttpURLConnection f6815e;

    /* renamed from: f */
    public int f6816f = 0;

    /* renamed from: b.l.b.a.b.p.c$a */
    public class C3692a implements Callable<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C3694c f6817a;

        /* renamed from: b */
        public final /* synthetic */ OutputStream f6818b;

        /* renamed from: c */
        public final /* synthetic */ C3745v f6819c;

        public C3692a(C3691c cVar, C3694c cVar2, OutputStream outputStream, C3745v vVar) {
            this.f6817a = cVar2;
            this.f6818b = outputStream;
            this.f6819c = vVar;
        }

        public Object call() {
            C3694c cVar = this.f6817a;
            OutputStream outputStream = this.f6818b;
            C3745v vVar = this.f6819c;
            Objects.requireNonNull((C3693b) cVar);
            vVar.mo15014a(outputStream);
            return Boolean.TRUE;
        }
    }

    /* renamed from: b.l.b.a.b.p.c$b */
    public static class C3693b implements C3694c {
    }

    /* renamed from: b.l.b.a.b.p.c$c */
    public interface C3694c {
    }

    public C3691c(HttpURLConnection httpURLConnection) {
        this.f6815e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    /* renamed from: a */
    public void mo14999a(String str, String str2) {
        this.f6815e.addRequestProperty(str, str2);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0089 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p164b.p165a.p169b.C3684l mo15000b() {
        /*
            r9 = this;
            b.l.b.a.b.p.c$c r0 = f6814g
            java.net.HttpURLConnection r1 = r9.f6815e
            b.l.b.a.d.v r2 = r9.f6803d
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = r9.f6802c
            if (r2 == 0) goto L_0x0011
            java.lang.String r3 = "Content-Type"
            r1.addRequestProperty(r3, r2)
        L_0x0011:
            java.lang.String r2 = r9.f6801b
            if (r2 == 0) goto L_0x001c
            java.net.HttpURLConnection r3 = r9.f6815e
            java.lang.String r4 = "Content-Encoding"
            r3.addRequestProperty(r4, r2)
        L_0x001c:
            long r2 = r9.f6800a
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x002d
            java.lang.String r5 = java.lang.Long.toString(r2)
            java.lang.String r6 = "Content-Length"
            r1.setRequestProperty(r6, r5)
        L_0x002d:
            java.lang.String r5 = r1.getRequestMethod()
            java.lang.String r6 = "POST"
            boolean r6 = r6.equals(r5)
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x0053
            java.lang.String r6 = "PUT"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0044
            goto L_0x0053
        L_0x0044:
            if (r4 != 0) goto L_0x0048
            r0 = r8
            goto L_0x0049
        L_0x0048:
            r0 = r7
        L_0x0049:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r7] = r5
            java.lang.String r3 = "%s with non-zero content length is not supported"
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2845s(r0, r3, r2)
            goto L_0x0089
        L_0x0053:
            r1.setDoOutput(r8)
            if (r4 < 0) goto L_0x0064
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0064
            int r2 = (int) r2
            r1.setFixedLengthStreamingMode(r2)
            goto L_0x0067
        L_0x0064:
            r1.setChunkedStreamingMode(r7)
        L_0x0067:
            java.io.OutputStream r2 = r1.getOutputStream()
            r9.mo15016e(r0, r2)     // Catch:{ IOException -> 0x0076 }
            r2.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0089
        L_0x0072:
            r0 = move-exception
            throw r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0085
        L_0x0076:
            r0 = move-exception
            int r3 = r1.getResponseCode()     // Catch:{ IOException -> 0x007e }
            if (r3 <= 0) goto L_0x007e
            r7 = r8
        L_0x007e:
            if (r7 == 0) goto L_0x0084
            r2.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x0089
        L_0x0084:
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0085:
            r2.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0088:
            throw r0
        L_0x0089:
            r1.connect()     // Catch:{ all -> 0x0092 }
            b.l.b.a.b.p.d r0 = new b.l.b.a.b.p.d     // Catch:{ all -> 0x0092 }
            r0.<init>(r1)     // Catch:{ all -> 0x0092 }
            return r0
        L_0x0092:
            r0 = move-exception
            r1.disconnect()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p169b.p170p.C3691c.mo15000b():b.l.b.a.b.l");
    }

    /* renamed from: c */
    public void mo15001c(int i, int i2) {
        this.f6815e.setReadTimeout(i2);
        this.f6815e.setConnectTimeout(i);
    }

    /* renamed from: d */
    public void mo15002d(int i) {
        this.f6816f = i;
    }

    /* renamed from: e */
    public final void mo15016e(C3694c cVar, OutputStream outputStream) {
        if (this.f6816f == 0) {
            C3745v vVar = this.f6803d;
            Objects.requireNonNull((C3693b) cVar);
            vVar.mo15014a(outputStream);
            return;
        }
        C3692a aVar = new C3692a(this, cVar, outputStream, this.f6803d);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future submit = newSingleThreadExecutor.submit(new FutureTask(aVar), (Object) null);
        newSingleThreadExecutor.shutdown();
        try {
            submit.get((long) this.f6816f, TimeUnit.MILLISECONDS);
            if (!newSingleThreadExecutor.isTerminated()) {
                newSingleThreadExecutor.shutdown();
            }
        } catch (InterruptedException e) {
            throw new IOException("Socket write interrupted", e);
        } catch (ExecutionException e2) {
            throw new IOException("Exception in socket write", e2);
        } catch (TimeoutException e3) {
            throw new IOException("Socket write timed out", e3);
        }
    }
}
