package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p122m.C1889b;

/* renamed from: b.l.a.c.h.b.e8 */
public final class C3163e8 implements ServiceConnection, C1889b.C1890a, C1889b.C1891b {

    /* renamed from: a */
    public volatile boolean f5495a;

    /* renamed from: b */
    public volatile C3225k3 f5496b;

    /* renamed from: c */
    public final /* synthetic */ C3175f8 f5497c;

    public C3163e8(C3175f8 f8Var) {
        this.f5497c = f8Var;
    }

    @MainThread
    /* renamed from: g */
    public final void mo12219g(int i) {
        C0823f.m372h("MeasurementServiceConnection.onConnectionSuspended");
        this.f5497c.f5638a.mo14329d().f5806m.mo14414a("Service connection suspended");
        this.f5497c.f5638a.mo14331f().mo14420q(new C3139c8(this));
    }

    @MainThread
    /* renamed from: k */
    public final void mo12220k(Bundle bundle) {
        C0823f.m372h("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Objects.requireNonNull(this.f5496b, "null reference");
                this.f5497c.f5638a.mo14331f().mo14420q(new C3127b8(this, (C3170f3) this.f5496b.mo12190B()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f5496b = null;
                this.f5495a = false;
            }
        }
    }

    @MainThread
    /* renamed from: n */
    public final void mo12221n(@NonNull C1754b bVar) {
        C0823f.m372h("MeasurementServiceConnection.onConnectionFailed");
        C3281p4 p4Var = this.f5497c.f5638a;
        C3269o3 o3Var = p4Var.f5850i;
        C3269o3 o3Var2 = (o3Var == null || !o3Var.mo14376k()) ? null : p4Var.f5850i;
        if (o3Var2 != null) {
            o3Var2.f5802i.mo14415b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f5495a = false;
            this.f5496b = null;
        }
        this.f5497c.f5638a.mo14331f().mo14420q(new C3151d8(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f5497c.f5638a.mo14329d().f5799f.mo14414a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    @androidx.annotation.MainThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            p005b.p006a.p007a.p024o.C0823f.m372h(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f5495a = r4     // Catch:{ all -> 0x001c }
            b.l.a.c.h.b.f8 r4 = r3.f5497c     // Catch:{ all -> 0x001c }
            b.l.a.c.h.b.p4 r4 = r4.f5638a     // Catch:{ all -> 0x001c }
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()     // Catch:{ all -> 0x001c }
            b.l.a.c.h.b.m3 r4 = r4.f5799f     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo14414a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0098
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0060 }
            boolean r2 = r1 instanceof p005b.p096l.p097a.p113c.p145h.p147b.C3170f3     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x003a
            b.l.a.c.h.b.f3 r1 = (p005b.p096l.p097a.p113c.p145h.p147b.C3170f3) r1     // Catch:{ RemoteException -> 0x0060 }
        L_0x0038:
            r0 = r1
            goto L_0x0040
        L_0x003a:
            b.l.a.c.h.b.d3 r1 = new b.l.a.c.h.b.d3     // Catch:{ RemoteException -> 0x0060 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0038
        L_0x0040:
            b.l.a.c.h.b.f8 r5 = r3.f5497c     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.h.b.p4 r5 = r5.f5638a     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.h.b.m3 r5 = r5.f5807n     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo14414a(r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0050:
            b.l.a.c.h.b.f8 r5 = r3.f5497c     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.h.b.p4 r5 = r5.f5638a     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.h.b.m3 r5 = r5.f5799f     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo14415b(r2, r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0060:
            b.l.a.c.h.b.f8 r5 = r3.f5497c     // Catch:{ all -> 0x001c }
            b.l.a.c.h.b.p4 r5 = r5.f5638a     // Catch:{ all -> 0x001c }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ all -> 0x001c }
            b.l.a.c.h.b.m3 r5 = r5.f5799f     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo14414a(r1)     // Catch:{ all -> 0x001c }
        L_0x006f:
            if (r0 != 0) goto L_0x0086
            r3.f5495a = r4     // Catch:{ all -> 0x001c }
            b.l.a.c.b.o.a r4 = p005b.p096l.p097a.p113c.p119b.p125o.C1956a.m2685b()     // Catch:{ IllegalArgumentException -> 0x0096 }
            b.l.a.c.h.b.f8 r5 = r3.f5497c     // Catch:{ IllegalArgumentException -> 0x0096 }
            b.l.a.c.h.b.p4 r0 = r5.f5638a     // Catch:{ IllegalArgumentException -> 0x0096 }
            android.content.Context r0 = r0.f5842a     // Catch:{ IllegalArgumentException -> 0x0096 }
            b.l.a.c.h.b.e8 r5 = r5.f5520c     // Catch:{ IllegalArgumentException -> 0x0096 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ IllegalArgumentException -> 0x0096 }
            r0.unbindService(r5)     // Catch:{ IllegalArgumentException -> 0x0096 }
            goto L_0x0096
        L_0x0086:
            b.l.a.c.h.b.f8 r4 = r3.f5497c     // Catch:{ all -> 0x001c }
            b.l.a.c.h.b.p4 r4 = r4.f5638a     // Catch:{ all -> 0x001c }
            b.l.a.c.h.b.m4 r4 = r4.mo14331f()     // Catch:{ all -> 0x001c }
            b.l.a.c.h.b.y7 r5 = new b.l.a.c.h.b.y7     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.mo14420q(r5)     // Catch:{ all -> 0x001c }
        L_0x0096:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0098:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3163e8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        C0823f.m372h("MeasurementServiceConnection.onServiceDisconnected");
        this.f5497c.f5638a.mo14329d().f5806m.mo14414a("Service disconnected");
        this.f5497c.f5638a.mo14331f().mo14420q(new C3115a8(this, componentName));
    }
}
