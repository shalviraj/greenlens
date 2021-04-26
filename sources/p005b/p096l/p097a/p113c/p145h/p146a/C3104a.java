package p005b.p096l.p097a.p113c.p145h.p146a;

import p005b.p096l.p097a.p113c.p131e.p140i.C2790g0;
import p005b.p096l.p097a.p113c.p145h.p147b.C3282p5;

/* renamed from: b.l.a.c.h.a.a */
public class C3104a {

    /* renamed from: a */
    public final C2790g0 f5240a;

    /* renamed from: b.l.a.c.h.a.a$a */
    public interface C3105a extends C3282p5 {
    }

    public C3104a(C2790g0 g0Var) {
        this.f5240a = g0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r0.f4745h == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.f4745h.registerOnMeasurementEventListener(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        android.util.Log.w(r0.f4738a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14060a(@androidx.annotation.RecentlyNonNull p005b.p096l.p097a.p113c.p145h.p146a.C3104a.C3105a r6) {
        /*
            r5 = this;
            b.l.a.c.e.i.g0 r0 = r5.f5240a
            java.util.Objects.requireNonNull(r0)
            java.util.List<android.util.Pair<b.l.a.c.h.b.p5, b.l.a.c.e.i.x>> r1 = r0.f4742e
            monitor-enter(r1)
            r2 = 0
        L_0x0009:
            java.util.List<android.util.Pair<b.l.a.c.h.b.p5, b.l.a.c.e.i.x>> r3 = r0.f4742e     // Catch:{ all -> 0x0059 }
            int r3 = r3.size()     // Catch:{ all -> 0x0059 }
            if (r2 >= r3) goto L_0x002d
            java.util.List<android.util.Pair<b.l.a.c.h.b.p5, b.l.a.c.e.i.x>> r3 = r0.f4742e     // Catch:{ all -> 0x0059 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0059 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0059 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0059 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x002a
            java.lang.String r6 = r0.f4738a     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "OnEventListener already registered."
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x0059 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            goto L_0x0058
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x002d:
            b.l.a.c.e.i.x r2 = new b.l.a.c.e.i.x     // Catch:{ all -> 0x0059 }
            r2.<init>(r6)     // Catch:{ all -> 0x0059 }
            java.util.List<android.util.Pair<b.l.a.c.h.b.p5, b.l.a.c.e.i.x>> r3 = r0.f4742e     // Catch:{ all -> 0x0059 }
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0059 }
            r4.<init>(r6, r2)     // Catch:{ all -> 0x0059 }
            r3.add(r4)     // Catch:{ all -> 0x0059 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            b.l.a.c.e.i.vb r6 = r0.f4745h
            if (r6 == 0) goto L_0x004e
            b.l.a.c.e.i.vb r6 = r0.f4745h     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            r6.registerOnMeasurementEventListener(r2)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            goto L_0x0058
        L_0x0047:
            java.lang.String r6 = r0.f4738a
            java.lang.String r1 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r6, r1)
        L_0x004e:
            b.l.a.c.e.i.t r6 = new b.l.a.c.e.i.t
            r6.<init>(r0, r2)
            java.util.concurrent.ExecutorService r0 = r0.f4740c
            r0.execute(r6)
        L_0x0058:
            return
        L_0x0059:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p146a.C3104a.mo14060a(b.l.a.c.h.a.a$a):void");
    }
}
