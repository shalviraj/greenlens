package p005b.p273o;

import android.location.Location;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p131e.p138g.C2673d0;
import p005b.p096l.p097a.p113c.p141f.C3049a;
import p005b.p096l.p097a.p113c.p141f.C3050b;
import p005b.p273o.C4857i2;

/* renamed from: b.o.p */
public class C4932p extends C4794c0 {

    /* renamed from: j */
    public static C4963s f9520j;

    /* renamed from: k */
    public static C4934b f9521k;

    /* renamed from: b.o.p$a */
    public static class C4933a implements GoogleApiClient.C5470b, GoogleApiClient.C5471c {
        public C4933a(C4925o oVar) {
        }

        /* renamed from: g */
        public void mo12086g(int i) {
            C4932p.m9068c();
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
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: k */
        public void mo12087k(android.os.Bundle r5) {
            /*
                r4 = this;
                java.lang.Object r5 = p005b.p273o.C4794c0.f9179d
                monitor-enter(r5)
                r0 = 0
                com.onesignal.PermissionsActivity.f11505i = r0     // Catch:{ all -> 0x0073 }
                b.o.s r0 = p005b.p273o.C4932p.f9520j     // Catch:{ all -> 0x0073 }
                if (r0 == 0) goto L_0x0071
                com.google.android.gms.common.api.GoogleApiClient r0 = r0.f9575a     // Catch:{ all -> 0x0073 }
                if (r0 != 0) goto L_0x000f
                goto L_0x0071
            L_0x000f:
                b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.DEBUG     // Catch:{ all -> 0x0073 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
                r1.<init>()     // Catch:{ all -> 0x0073 }
                java.lang.String r2 = "LocationController GoogleApiClientListener onConnected lastLocation: "
                r1.append(r2)     // Catch:{ all -> 0x0073 }
                android.location.Location r2 = p005b.p273o.C4794c0.f9183h     // Catch:{ all -> 0x0073 }
                r1.append(r2)     // Catch:{ all -> 0x0073 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0073 }
                r2 = 0
                p005b.p273o.C4857i2.m8933a(r0, r1, r2)     // Catch:{ all -> 0x0073 }
                android.location.Location r1 = p005b.p273o.C4794c0.f9183h     // Catch:{ all -> 0x0073 }
                if (r1 != 0) goto L_0x0064
                b.o.s r1 = p005b.p273o.C4932p.f9520j     // Catch:{ all -> 0x0073 }
                com.google.android.gms.common.api.GoogleApiClient r1 = r1.f9575a     // Catch:{ all -> 0x0073 }
                monitor-enter(r5)     // Catch:{ all -> 0x0073 }
                boolean r3 = r1.mo12143g()     // Catch:{ all -> 0x0061 }
                if (r3 == 0) goto L_0x003f
                b.l.a.c.e.g.c0 r3 = p005b.p096l.p097a.p113c.p141f.C3050b.f5193d     // Catch:{ all -> 0x0061 }
                android.location.Location r1 = r3.mo13167a(r1)     // Catch:{ all -> 0x0061 }
                monitor-exit(r5)     // Catch:{ all -> 0x0061 }
                goto L_0x0041
            L_0x003f:
                monitor-exit(r5)     // Catch:{ all -> 0x0061 }
                r1 = r2
            L_0x0041:
                p005b.p273o.C4794c0.f9183h = r1     // Catch:{ all -> 0x0073 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
                r1.<init>()     // Catch:{ all -> 0x0073 }
                java.lang.String r3 = "LocationController GoogleApiClientListener lastLocation: "
                r1.append(r3)     // Catch:{ all -> 0x0073 }
                android.location.Location r3 = p005b.p273o.C4794c0.f9183h     // Catch:{ all -> 0x0073 }
                r1.append(r3)     // Catch:{ all -> 0x0073 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0073 }
                p005b.p273o.C4857i2.m8933a(r0, r1, r2)     // Catch:{ all -> 0x0073 }
                android.location.Location r0 = p005b.p273o.C4794c0.f9183h     // Catch:{ all -> 0x0073 }
                if (r0 == 0) goto L_0x0064
                p005b.p273o.C4794c0.m8786b(r0)     // Catch:{ all -> 0x0073 }
                goto L_0x0064
            L_0x0061:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0061 }
                throw r0     // Catch:{ all -> 0x0073 }
            L_0x0064:
                b.o.p$b r0 = new b.o.p$b     // Catch:{ all -> 0x0073 }
                b.o.s r1 = p005b.p273o.C4932p.f9520j     // Catch:{ all -> 0x0073 }
                com.google.android.gms.common.api.GoogleApiClient r1 = r1.f9575a     // Catch:{ all -> 0x0073 }
                r0.<init>(r1)     // Catch:{ all -> 0x0073 }
                p005b.p273o.C4932p.f9521k = r0     // Catch:{ all -> 0x0073 }
                monitor-exit(r5)     // Catch:{ all -> 0x0073 }
                return
            L_0x0071:
                monitor-exit(r5)     // Catch:{ all -> 0x0073 }
                return
            L_0x0073:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0073 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4932p.C4933a.mo12087k(android.os.Bundle):void");
        }

        /* renamed from: n */
        public void mo12088n(@NonNull C1754b bVar) {
            C4932p.m9068c();
        }
    }

    /* renamed from: b.o.p$b */
    public static class C4934b implements C3049a {

        /* renamed from: a */
        public GoogleApiClient f9522a;

        public C4934b(GoogleApiClient googleApiClient) {
            this.f9522a = googleApiClient;
            long j = C4857i2.f9363h ? 270000 : 570000;
            if (googleApiClient != null) {
                LocationRequest locationRequest = new LocationRequest();
                LocationRequest.m10410V(j);
                locationRequest.f11326j = true;
                locationRequest.f11325i = j;
                LocationRequest.m10410V(j);
                locationRequest.f11324h = j;
                if (!locationRequest.f11326j) {
                    locationRequest.f11325i = (long) (((double) j) / 6.0d);
                }
                long j2 = (long) (((double) j) * 1.5d);
                LocationRequest.m10410V(j2);
                locationRequest.f11330n = j2;
                locationRequest.f11323g = 102;
                C4857i2.m8933a(C4857i2.C4868k.DEBUG, "GMSLocationController GoogleApiClient requestLocationUpdates!", (Throwable) null);
                GoogleApiClient googleApiClient2 = this.f9522a;
                try {
                    synchronized (C4794c0.f9179d) {
                        if (googleApiClient2.mo12143g()) {
                            Objects.requireNonNull(C3050b.f5193d);
                            C0823f.m380l(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                            googleApiClient2.mo12139d(new C2673d0(googleApiClient2, locationRequest, this));
                        }
                    }
                } catch (Throwable th) {
                    C4857i2.m8933a(C4857i2.C4868k.WARN, "FusedLocationApi.requestLocationUpdates failed!", th);
                }
            }
        }

        /* renamed from: a */
        public void mo14010a(Location location) {
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            C4857i2.m8933a(kVar, "GMSLocationController onLocationChanged: " + location, (Throwable) null);
            C4794c0.f9183h = location;
        }
    }

    /* renamed from: c */
    public static void m9068c() {
        synchronized (C4794c0.f9179d) {
            C4963s sVar = f9520j;
            if (sVar != null) {
                Objects.requireNonNull(sVar);
                try {
                    sVar.f9576b.getMethod("disconnect", new Class[0]).invoke(sVar.f9575a, new Object[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            f9520j = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9069g() {
        /*
            java.lang.Object r0 = p005b.p273o.C4794c0.f9179d
            monitor-enter(r0)
            b.o.i2$k r1 = p005b.p273o.C4857i2.C4868k.DEBUG     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "GMSLocationController onFocusChange!"
            r3 = 0
            p005b.p273o.C4857i2.m8933a(r1, r2, r3)     // Catch:{ all -> 0x003c }
            b.o.s r1 = f9520j     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.f9575a     // Catch:{ all -> 0x003c }
            boolean r1 = r1.mo12143g()     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x0018
            goto L_0x003a
        L_0x0018:
            b.o.s r1 = f9520j     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.f9575a     // Catch:{ all -> 0x003c }
            b.o.p$b r2 = f9521k     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x0031
            b.l.a.c.e.g.c0 r2 = p005b.p096l.p097a.p113c.p141f.C3050b.f5193d     // Catch:{ all -> 0x003c }
            b.o.p$b r3 = f9521k     // Catch:{ all -> 0x003c }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x003c }
            b.l.a.c.e.g.e0 r2 = new b.l.a.c.e.g.e0     // Catch:{ all -> 0x003c }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x003c }
            r1.mo12139d(r2)     // Catch:{ all -> 0x003c }
        L_0x0031:
            b.o.p$b r2 = new b.o.p$b     // Catch:{ all -> 0x003c }
            r2.<init>(r1)     // Catch:{ all -> 0x003c }
            f9521k = r2     // Catch:{ all -> 0x003c }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x003c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4932p.m9069g():void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9070j() {
        /*
            java.lang.Thread r0 = p005b.p273o.C4794c0.f9181f
            if (r0 == 0) goto L_0x0006
            goto L_0x0099
        L_0x0006:
            java.lang.Object r0 = p005b.p273o.C4794c0.f9179d
            monitor-enter(r0)
            java.lang.Thread r1 = new java.lang.Thread     // Catch:{ all -> 0x009a }
            b.o.o r2 = new b.o.o     // Catch:{ all -> 0x009a }
            r2.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "OS_GMS_LOCATION_FALLBACK"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x009a }
            p005b.p273o.C4794c0.f9181f = r1     // Catch:{ all -> 0x009a }
            r1.start()     // Catch:{ all -> 0x009a }
            b.o.s r1 = f9520j     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x0027
            android.location.Location r1 = p005b.p273o.C4794c0.f9183h     // Catch:{ all -> 0x009a }
            if (r1 != 0) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            p005b.p273o.C4794c0.m8786b(r1)     // Catch:{ all -> 0x009a }
            goto L_0x0098
        L_0x0027:
            b.o.p$a r1 = new b.o.p$a     // Catch:{ all -> 0x009a }
            r2 = 0
            r1.<init>(r2)     // Catch:{ all -> 0x009a }
            com.google.android.gms.common.api.GoogleApiClient$a r3 = new com.google.android.gms.common.api.GoogleApiClient$a     // Catch:{ all -> 0x009a }
            android.content.Context r4 = p005b.p273o.C4794c0.f9182g     // Catch:{ all -> 0x009a }
            r3.<init>(r4)     // Catch:{ all -> 0x009a }
            b.l.a.c.b.l.a<b.l.a.c.b.l.a$d$c> r4 = p005b.p096l.p097a.p113c.p141f.C3050b.f5192c     // Catch:{ all -> 0x009a }
            java.lang.String r5 = "Api must not be null"
            p005b.p006a.p007a.p024o.C0823f.m380l(r4, r5)     // Catch:{ all -> 0x009a }
            java.util.Map<b.l.a.c.b.l.a<?>, b.l.a.c.b.l.a$d> r5 = r3.f11269g     // Catch:{ all -> 0x009a }
            r5.put(r4, r2)     // Catch:{ all -> 0x009a }
            b.l.a.c.b.l.a$a<?, O> r2 = r4.f3124a     // Catch:{ all -> 0x009a }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x009a }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x009a }
            java.util.Set<com.google.android.gms.common.api.Scope> r4 = r3.f11264b     // Catch:{ all -> 0x009a }
            r4.addAll(r2)     // Catch:{ all -> 0x009a }
            java.util.Set<com.google.android.gms.common.api.Scope> r4 = r3.f11263a     // Catch:{ all -> 0x009a }
            r4.addAll(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "Listener must not be null"
            p005b.p006a.p007a.p024o.C0823f.m380l(r1, r2)     // Catch:{ all -> 0x009a }
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$b> r2 = r3.f11274l     // Catch:{ all -> 0x009a }
            r2.add(r1)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "Listener must not be null"
            p005b.p006a.p007a.p024o.C0823f.m380l(r1, r2)     // Catch:{ all -> 0x009a }
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$c> r2 = r3.f11275m     // Catch:{ all -> 0x009a }
            r2.add(r1)     // Catch:{ all -> 0x009a }
            b.o.c0$c r1 = p005b.p273o.C4794c0.f9180e     // Catch:{ all -> 0x009a }
            android.os.Handler r1 = r1.f9185g     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "Handler must not be null"
            p005b.p006a.p007a.p024o.C0823f.m380l(r1, r2)     // Catch:{ all -> 0x009a }
            android.os.Looper r1 = r1.getLooper()     // Catch:{ all -> 0x009a }
            r3.f11271i = r1     // Catch:{ all -> 0x009a }
            com.google.android.gms.common.api.GoogleApiClient r1 = r3.mo18851a()     // Catch:{ all -> 0x009a }
            b.o.s r2 = new b.o.s     // Catch:{ all -> 0x009a }
            r2.<init>(r1)     // Catch:{ all -> 0x009a }
            f9520j = r2     // Catch:{ all -> 0x009a }
            java.lang.Class r1 = r2.f9576b     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = "connect"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0094 }
            java.lang.reflect.Method r1 = r1.getMethod(r3, r5)     // Catch:{ all -> 0x0094 }
            com.google.android.gms.common.api.GoogleApiClient r2 = r2.f9575a     // Catch:{ all -> 0x0094 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x0094 }
            r1.invoke(r2, r3)     // Catch:{ all -> 0x0094 }
            goto L_0x0098
        L_0x0094:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x009a }
        L_0x0098:
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
        L_0x0099:
            return
        L_0x009a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4932p.m9070j():void");
    }
}
