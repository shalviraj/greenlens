package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.l.a.c.e.i.qa */
public final class C2930qa extends C3022xb {

    /* renamed from: a */
    public final AtomicReference<Bundle> f4955a = new AtomicReference<>();

    /* renamed from: b */
    public boolean f4956b;

    /* renamed from: o */
    public static final <T> T m5116o(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e);
            throw e;
        }
    }

    /* renamed from: Y */
    public final void mo13602Y(Bundle bundle) {
        synchronized (this.f4955a) {
            try {
                this.f4955a.set(bundle);
                this.f4956b = true;
                this.f4955a.notify();
            } catch (Throwable th) {
                this.f4955a.notify();
                throw th;
            }
        }
    }

    /* renamed from: k */
    public final String mo13603k(long j) {
        return (String) m5116o(mo13604n(j), String.class);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo13604n(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r0 = r2.f4955a
            monitor-enter(r0)
            boolean r1 = r2.f4956b     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r1 = r2.f4955a     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r3 = r2.f4955a     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2930qa.mo13604n(long):android.os.Bundle");
    }
}
