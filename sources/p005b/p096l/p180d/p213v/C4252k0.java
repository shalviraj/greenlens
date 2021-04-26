package p005b.p096l.p180d.p213v;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p005b.p096l.p097a.p113c.p119b.p126p.p127h.C1964a;

/* renamed from: b.l.d.v.k0 */
public final class C4252k0 implements ServiceConnection {

    /* renamed from: a */
    public final Context f7870a;

    /* renamed from: b */
    public final Intent f7871b;

    /* renamed from: c */
    public final ScheduledExecutorService f7872c;

    /* renamed from: d */
    public final Queue<C4244g0> f7873d = new ArrayDeque();

    /* renamed from: e */
    public C4248i0 f7874e;
    @GuardedBy("this")

    /* renamed from: f */
    public boolean f7875f = false;

    public C4252k0(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new C1964a("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.f7870a = applicationContext;
        this.f7871b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f7872c = scheduledThreadPoolExecutor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo15841a() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a9 }
        L_0x0011:
            java.util.Queue<b.l.d.v.g0> r0 = r6.f7873d     // Catch:{ all -> 0x00a9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a9 }
        L_0x0028:
            b.l.d.v.i0 r0 = r6.f7874e     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a9 }
        L_0x0041:
            java.util.Queue<b.l.d.v.g0> r0 = r6.f7873d     // Catch:{ all -> 0x00a9 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00a9 }
            b.l.d.v.g0 r0 = (p005b.p096l.p180d.p213v.C4244g0) r0     // Catch:{ all -> 0x00a9 }
            b.l.d.v.i0 r2 = r6.f7874e     // Catch:{ all -> 0x00a9 }
            r2.mo15839a(r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x0011
        L_0x004f:
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "EnhancedIntentService"
            boolean r3 = r6.f7875f     // Catch:{ all -> 0x00a9 }
            if (r3 != 0) goto L_0x0061
            r3 = r2
            goto L_0x0062
        L_0x0061:
            r3 = r1
        L_0x0062:
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r5.<init>(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = "binder is dead. start connection? "
            r5.append(r4)     // Catch:{ all -> 0x00a9 }
            r5.append(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00a9 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00a9 }
        L_0x0078:
            boolean r0 = r6.f7875f     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a5
            r6.f7875f = r2     // Catch:{ all -> 0x00a9 }
            b.l.a.c.b.o.a r0 = p005b.p096l.p097a.p113c.p119b.p125o.C1956a.m2685b()     // Catch:{ SecurityException -> 0x0098 }
            android.content.Context r2 = r6.f7870a     // Catch:{ SecurityException -> 0x0098 }
            android.content.Intent r3 = r6.f7871b     // Catch:{ SecurityException -> 0x0098 }
            r4 = 65
            boolean r0 = r0.mo12287a(r2, r3, r6, r4)     // Catch:{ SecurityException -> 0x0098 }
            if (r0 == 0) goto L_0x0090
            monitor-exit(r6)
            return
        L_0x0090:
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binding to the service failed"
            android.util.Log.e(r0, r2)     // Catch:{ SecurityException -> 0x0098 }
            goto L_0x00a0
        L_0x0098:
            r0 = move-exception
            java.lang.String r2 = "EnhancedIntentService"
            java.lang.String r3 = "Exception while binding the service"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00a9 }
        L_0x00a0:
            r6.f7875f = r1     // Catch:{ all -> 0x00a9 }
            r6.mo15842b()     // Catch:{ all -> 0x00a9 }
        L_0x00a5:
            monitor-exit(r6)
            return
        L_0x00a7:
            monitor-exit(r6)
            return
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p213v.C4252k0.mo15841a():void");
    }

    @GuardedBy("this")
    /* renamed from: b */
    public final void mo15842b() {
        while (!this.f7873d.isEmpty()) {
            this.f7873d.poll().mo15831a();
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        this.f7875f = false;
        if (!(iBinder instanceof C4248i0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            Log.e("EnhancedIntentService", sb2.toString());
            mo15842b();
            return;
        }
        this.f7874e = (C4248i0) iBinder;
        mo15841a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        mo15841a();
    }
}
