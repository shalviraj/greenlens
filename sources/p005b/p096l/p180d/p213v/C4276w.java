package p005b.p096l.p180d.p213v;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.concurrent.ExecutionException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.d.v.w */
public final class C4276w {

    /* renamed from: g */
    public static int f7915g;

    /* renamed from: h */
    public static PendingIntent f7916h;

    /* renamed from: a */
    public final SimpleArrayMap<String, C3429i<Bundle>> f7917a = new SimpleArrayMap<>();

    /* renamed from: b */
    public final Context f7918b;

    /* renamed from: c */
    public final C4264q f7919c;

    /* renamed from: d */
    public Messenger f7920d;

    /* renamed from: e */
    public Messenger f7921e;

    /* renamed from: f */
    public C4260o0 f7922f;

    public C4276w(Context context, C4264q qVar) {
        this.f7918b = context;
        this.f7919c = qVar;
        this.f7920d = new Messenger(new C4274v(this, Looper.getMainLooper()));
    }

    /* renamed from: a */
    public final void mo15870a(String str, Bundle bundle) {
        synchronized (this.f7917a) {
            C3429i remove = this.f7917a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.f6197a.mo14695q(bundle);
        }
    }

    /* renamed from: b */
    public final Bundle mo15871b(Bundle bundle) {
        int i;
        if (this.f7919c.mo15863d() < 12000000) {
            return mo15872c(bundle);
        }
        C4241f b = C4241f.m7784b(this.f7918b);
        synchronized (b) {
            i = b.f7848d;
            b.f7848d = i + 1;
        }
        try {
            return (Bundle) C1960d.m2793f(b.mo15828a(new C4259o(i, bundle)));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e.getCause() instanceof C4262p) || ((C4262p) e.getCause()).f7885g != 4) {
                return null;
            }
            return mo15872c(bundle);
        }
    }

    /* renamed from: c */
    public final Bundle mo15872c(Bundle bundle) {
        Bundle d = mo15873d(bundle);
        if (d == null || !d.containsKey("google.messenger")) {
            return d;
        }
        Bundle d2 = mo15873d(bundle);
        if (d2 == null || !d2.containsKey("google.messenger")) {
            return d2;
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final android.os.Bundle mo15873d(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.Class<b.l.d.v.w> r0 = p005b.p096l.p180d.p213v.C4276w.class
            monitor-enter(r0)
            int r1 = f7915g     // Catch:{ all -> 0x014a }
            int r2 = r1 + 1
            f7915g = r2     // Catch:{ all -> 0x014a }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x014a }
            monitor-exit(r0)
            b.l.a.c.j.i r2 = new b.l.a.c.j.i
            r2.<init>()
            androidx.collection.SimpleArrayMap<java.lang.String, b.l.a.c.j.i<android.os.Bundle>> r3 = r8.f7917a
            monitor-enter(r3)
            androidx.collection.SimpleArrayMap<java.lang.String, b.l.a.c.j.i<android.os.Bundle>> r4 = r8.f7917a     // Catch:{ all -> 0x0147 }
            r4.put(r1, r2)     // Catch:{ all -> 0x0147 }
            monitor-exit(r3)     // Catch:{ all -> 0x0147 }
            b.l.d.v.q r3 = r8.f7919c
            int r3 = r3.mo15861b()
            if (r3 == 0) goto L_0x013f
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)
            b.l.d.v.q r4 = r8.f7919c
            int r4 = r4.mo15861b()
            r5 = 2
            if (r4 != r5) goto L_0x003a
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            goto L_0x003c
        L_0x003a:
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
        L_0x003c:
            r3.setAction(r4)
            r3.putExtras(r9)
            android.content.Context r9 = r8.f7918b
            monitor-enter(r0)
            android.app.PendingIntent r4 = f7916h     // Catch:{ all -> 0x013c }
            if (r4 != 0) goto L_0x005a
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x013c }
            r4.<init>()     // Catch:{ all -> 0x013c }
            java.lang.String r6 = "com.google.example.invalidpackage"
            r4.setPackage(r6)     // Catch:{ all -> 0x013c }
            r6 = 0
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r9, r6, r4, r6)     // Catch:{ all -> 0x013c }
            f7916h = r9     // Catch:{ all -> 0x013c }
        L_0x005a:
            java.lang.String r9 = "app"
            android.app.PendingIntent r4 = f7916h     // Catch:{ all -> 0x013c }
            r3.putExtra(r9, r4)     // Catch:{ all -> 0x013c }
            monitor-exit(r0)
            java.lang.String r9 = "kid"
            java.lang.String r0 = java.lang.String.valueOf(r1)
            int r0 = r0.length()
            int r0 = r0 + 5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.lang.String r0 = "|ID|"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "|"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.putExtra(r9, r0)
            java.lang.String r9 = "FirebaseInstanceId"
            r0 = 3
            boolean r9 = android.util.Log.isLoggable(r9, r0)
            if (r9 == 0) goto L_0x00b4
            java.lang.String r9 = "FirebaseInstanceId"
            android.os.Bundle r4 = r3.getExtras()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r6 = r4.length()
            int r6 = r6 + 8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Sending "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.util.Log.d(r9, r4)
        L_0x00b4:
            java.lang.String r9 = "google.messenger"
            android.os.Messenger r4 = r8.f7920d
            r3.putExtra(r9, r4)
            android.os.Messenger r9 = r8.f7921e
            if (r9 != 0) goto L_0x00c3
            b.l.d.v.o0 r9 = r8.f7922f
            if (r9 == 0) goto L_0x00eb
        L_0x00c3:
            android.os.Message r9 = android.os.Message.obtain()
            r9.obj = r3
            android.os.Messenger r4 = r8.f7921e     // Catch:{ RemoteException -> 0x00dc }
            if (r4 == 0) goto L_0x00d1
            r4.send(r9)     // Catch:{ RemoteException -> 0x00dc }
            goto L_0x00fe
        L_0x00d1:
            b.l.d.v.o0 r4 = r8.f7922f     // Catch:{ RemoteException -> 0x00dc }
            android.os.Messenger r4 = r4.f7884g     // Catch:{ RemoteException -> 0x00dc }
            java.util.Objects.requireNonNull(r4)     // Catch:{ RemoteException -> 0x00dc }
            r4.send(r9)     // Catch:{ RemoteException -> 0x00dc }
            goto L_0x00fe
        L_0x00dc:
            java.lang.String r9 = "FirebaseInstanceId"
            boolean r9 = android.util.Log.isLoggable(r9, r0)
            if (r9 == 0) goto L_0x00eb
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r0 = "Messenger failed, fallback to startService"
            android.util.Log.d(r9, r0)
        L_0x00eb:
            b.l.d.v.q r9 = r8.f7919c
            int r9 = r9.mo15861b()
            if (r9 != r5) goto L_0x00f9
            android.content.Context r9 = r8.f7918b
            r9.sendBroadcast(r3)
            goto L_0x00fe
        L_0x00f9:
            android.content.Context r9 = r8.f7918b
            r9.startService(r3)
        L_0x00fe:
            b.l.a.c.j.e0<TResult> r9 = r2.f6197a     // Catch:{ InterruptedException | TimeoutException -> 0x0120, ExecutionException -> 0x0119 }
            r2 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x0120, ExecutionException -> 0x0119 }
            java.lang.Object r9 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2797g(r9, r2, r0)     // Catch:{ InterruptedException | TimeoutException -> 0x0120, ExecutionException -> 0x0119 }
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ InterruptedException | TimeoutException -> 0x0120, ExecutionException -> 0x0119 }
            androidx.collection.SimpleArrayMap<java.lang.String, b.l.a.c.j.i<android.os.Bundle>> r0 = r8.f7917a
            monitor-enter(r0)
            androidx.collection.SimpleArrayMap<java.lang.String, b.l.a.c.j.i<android.os.Bundle>> r2 = r8.f7917a     // Catch:{ all -> 0x0114 }
            r2.remove(r1)     // Catch:{ all -> 0x0114 }
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return r9
        L_0x0114:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            throw r9
        L_0x0117:
            r9 = move-exception
            goto L_0x012f
        L_0x0119:
            r9 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0117 }
            r0.<init>(r9)     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0120:
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r0 = "No response"
            android.util.Log.w(r9, r0)     // Catch:{ all -> 0x0117 }
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "TIMEOUT"
            r9.<init>(r0)     // Catch:{ all -> 0x0117 }
            throw r9     // Catch:{ all -> 0x0117 }
        L_0x012f:
            androidx.collection.SimpleArrayMap<java.lang.String, b.l.a.c.j.i<android.os.Bundle>> r2 = r8.f7917a
            monitor-enter(r2)
            androidx.collection.SimpleArrayMap<java.lang.String, b.l.a.c.j.i<android.os.Bundle>> r0 = r8.f7917a     // Catch:{ all -> 0x0139 }
            r0.remove(r1)     // Catch:{ all -> 0x0139 }
            monitor-exit(r2)     // Catch:{ all -> 0x0139 }
            throw r9
        L_0x0139:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0139 }
            throw r9
        L_0x013c:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L_0x013f:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r9.<init>(r0)
            throw r9
        L_0x0147:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0147 }
            throw r9
        L_0x014a:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p213v.C4276w.mo15873d(android.os.Bundle):android.os.Bundle");
    }
}
