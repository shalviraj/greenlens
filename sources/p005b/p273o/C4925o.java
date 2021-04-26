package p005b.p273o;

import com.segment.analytics.internal.Utils;
import p005b.p273o.C4857i2;

/* renamed from: b.o.o */
public final class C4925o implements Runnable {
    public void run() {
        try {
            C4963s sVar = C4932p.f9520j;
            Thread.sleep((long) Utils.DEFAULT_FLUSH_INTERVAL);
            C4857i2.m8933a(C4857i2.C4868k.WARN, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", (Throwable) null);
            C4794c0.m8787c();
            C4794c0.m8792h(C4794c0.f9182g);
        } catch (InterruptedException unused) {
        }
    }
}
