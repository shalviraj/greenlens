package p005b.p096l.p180d.p191q.p192f.p193e;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: b.l.d.q.f.e.c */
public class C3989c implements C3988b, C3987a {

    /* renamed from: a */
    public final C3991e f7291a;

    /* renamed from: b */
    public final Object f7292b = new Object();

    /* renamed from: c */
    public CountDownLatch f7293c;

    public C3989c(@NonNull C3991e eVar, int i, TimeUnit timeUnit) {
        this.f7291a = eVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        p005b.p096l.p180d.p191q.p192f.C3982b.f7289a.mo15497c("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0050 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15502a(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f7292b
            monitor-enter(r0)
            b.l.d.q.f.b r1 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r2.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x005c }
            r2.append(r5)     // Catch:{ all -> 0x005c }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x005c }
            r2.append(r6)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x005c }
            r1.mo15499e(r2)     // Catch:{ all -> 0x005c }
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x005c }
            r3 = 1
            r2.<init>(r3)     // Catch:{ all -> 0x005c }
            r4.f7293c = r2     // Catch:{ all -> 0x005c }
            b.l.d.q.f.e.e r2 = r4.f7291a     // Catch:{ all -> 0x005c }
            b.l.d.n.a.a r2 = r2.f7295a     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "clx"
            r2.mo15360c(r3, r5, r6)     // Catch:{ all -> 0x005c }
            java.lang.String r5 = "Awaiting app exception callback from Analytics..."
            r1.mo15499e(r5)     // Catch:{ all -> 0x005c }
            java.util.concurrent.CountDownLatch r5 = r4.f7293c     // Catch:{ InterruptedException -> 0x0050 }
            r6 = 500(0x1f4, float:7.0E-43)
            long r2 = (long) r6     // Catch:{ InterruptedException -> 0x0050 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0050 }
            boolean r5 = r5.await(r2, r6)     // Catch:{ InterruptedException -> 0x0050 }
            if (r5 == 0) goto L_0x004a
            java.lang.String r5 = "App exception callback received from Analytics listener."
            r1.mo15499e(r5)     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0057
        L_0x004a:
            java.lang.String r5 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r1.mo15500f(r5)     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            b.l.d.q.f.b r5 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a     // Catch:{ all -> 0x005c }
            java.lang.String r6 = "Interrupted while awaiting app exception callback from Analytics listener."
            r5.mo15497c(r6)     // Catch:{ all -> 0x005c }
        L_0x0057:
            r5 = 0
            r4.f7293c = r5     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p193e.C3989c.mo15502a(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: b */
    public void mo15503b(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f7293c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
