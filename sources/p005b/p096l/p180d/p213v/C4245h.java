package p005b.p096l.p180d.p213v;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import p005b.p096l.p097a.p113c.p119b.p125o.C1956a;
import p005b.p096l.p097a.p113c.p131e.p137f.C2654a;

/* renamed from: b.l.d.v.h */
public final class C4245h implements ServiceConnection {

    /* renamed from: a */
    public int f7856a = 0;

    /* renamed from: b */
    public final Messenger f7857b = new Messenger(new C2654a(Looper.getMainLooper(), new C4243g(this)));

    /* renamed from: c */
    public C4251k f7858c;

    /* renamed from: d */
    public final Queue<C4255m<?>> f7859d = new ArrayDeque();

    /* renamed from: e */
    public final SparseArray<C4255m<?>> f7860e = new SparseArray<>();

    /* renamed from: f */
    public final /* synthetic */ C4241f f7861f;

    public C4245h(C4241f fVar, C4239e eVar) {
        this.f7861f = fVar;
    }

    /* renamed from: a */
    public final synchronized void mo15832a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.f7856a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f7856a = 4;
            C1956a b = C1956a.m2685b();
            Context context = this.f7861f.f7845a;
            Objects.requireNonNull(b);
            context.unbindService(this);
            C4262p pVar = new C4262p(i, str);
            for (C4255m b2 : this.f7859d) {
                b2.mo15848b(pVar);
            }
            this.f7859d.clear();
            for (int i3 = 0; i3 < this.f7860e.size(); i3++) {
                this.f7860e.valueAt(i3).mo15848b(pVar);
            }
            this.f7860e.clear();
        } else if (i2 == 3) {
            this.f7856a = 4;
        } else if (i2 != 4) {
            int i4 = this.f7856a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo15833b(p005b.p096l.p180d.p213v.C4255m r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f7856a     // Catch:{ all -> 0x00a6 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x0043
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a6 }
            int r0 = r5.f7856a     // Catch:{ all -> 0x00a6 }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r2.<init>(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x00a6 }
            r2.append(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00a6 }
            r6.<init>(r0)     // Catch:{ all -> 0x00a6 }
            throw r6     // Catch:{ all -> 0x00a6 }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<b.l.d.v.m<?>> r0 = r5.f7859d     // Catch:{ all -> 0x00a6 }
            r0.add(r6)     // Catch:{ all -> 0x00a6 }
            b.l.d.v.f r6 = r5.f7861f     // Catch:{ all -> 0x00a6 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f7846b     // Catch:{ all -> 0x00a6 }
            b.l.d.v.i r0 = new b.l.d.v.i     // Catch:{ all -> 0x00a6 }
            r0.<init>(r5)     // Catch:{ all -> 0x00a6 }
            r6.execute(r0)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r5)
            return r3
        L_0x0043:
            java.util.Queue<b.l.d.v.m<?>> r0 = r5.f7859d     // Catch:{ all -> 0x00a6 }
            r0.add(r6)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r5)
            return r3
        L_0x004a:
            java.util.Queue<b.l.d.v.m<?>> r0 = r5.f7859d     // Catch:{ all -> 0x00a6 }
            r0.add(r6)     // Catch:{ all -> 0x00a6 }
            int r6 = r5.f7856a     // Catch:{ all -> 0x00a6 }
            if (r6 != 0) goto L_0x0055
            r6 = r3
            goto L_0x0056
        L_0x0055:
            r6 = r2
        L_0x0056:
            p005b.p006a.p007a.p024o.C0823f.m384n(r6)     // Catch:{ all -> 0x00a6 }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x00a6 }
            if (r6 == 0) goto L_0x0068
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x00a6 }
        L_0x0068:
            r5.f7856a = r3     // Catch:{ all -> 0x00a6 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x00a6 }
            b.l.a.c.b.o.a r0 = p005b.p096l.p097a.p113c.p119b.p125o.C1956a.m2685b()     // Catch:{ all -> 0x00a6 }
            b.l.d.v.f r1 = r5.f7861f     // Catch:{ all -> 0x00a6 }
            android.content.Context r1 = r1.f7845a     // Catch:{ all -> 0x00a6 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.Class r4 = r1.getClass()     // Catch:{ all -> 0x00a6 }
            r4.getName()     // Catch:{ all -> 0x00a6 }
            boolean r6 = r0.mo12288c(r1, r6, r5, r3)     // Catch:{ all -> 0x00a6 }
            if (r6 != 0) goto L_0x0094
            java.lang.String r6 = "Unable to bind to service"
            r5.mo15832a(r2, r6)     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x0094:
            b.l.d.v.f r6 = r5.f7861f     // Catch:{ all -> 0x00a6 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f7846b     // Catch:{ all -> 0x00a6 }
            b.l.d.v.j r0 = new b.l.d.v.j     // Catch:{ all -> 0x00a6 }
            r0.<init>(r5)     // Catch:{ all -> 0x00a6 }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00a6 }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x00a6 }
        L_0x00a4:
            monitor-exit(r5)
            return r3
        L_0x00a6:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p213v.C4245h.mo15833b(b.l.d.v.m):boolean");
    }

    /* renamed from: c */
    public final synchronized void mo15834c() {
        if (this.f7856a == 2 && this.f7859d.isEmpty() && this.f7860e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f7856a = 3;
            C1956a b = C1956a.m2685b();
            Context context = this.f7861f.f7845a;
            Objects.requireNonNull(b);
            context.unbindService(this);
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            mo15832a(0, "Null service connection");
            return;
        }
        try {
            this.f7858c = new C4251k(iBinder);
            this.f7856a = 2;
            this.f7861f.f7846b.execute(new C4247i(this));
        } catch (RemoteException e) {
            mo15832a(0, e.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        mo15832a(2, "Service disconnected");
    }
}
