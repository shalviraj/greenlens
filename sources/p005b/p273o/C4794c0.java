package p005b.p273o;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p273o.C4857i2;

/* renamed from: b.o.c0 */
public class C4794c0 {

    /* renamed from: a */
    public static final List<C4799e> f9176a = new ArrayList();

    /* renamed from: b */
    public static ConcurrentHashMap<C4800f, C4796b> f9177b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static boolean f9178c;

    /* renamed from: d */
    public static final Object f9179d = new C4795a();

    /* renamed from: e */
    public static C4797c f9180e;

    /* renamed from: f */
    public static Thread f9181f;

    /* renamed from: g */
    public static Context f9182g;

    /* renamed from: h */
    public static Location f9183h;

    /* renamed from: i */
    public static String f9184i;

    /* renamed from: b.o.c0$a */
    public static class C4795a {
    }

    /* renamed from: b.o.c0$b */
    public interface C4796b {
        /* renamed from: a */
        C4800f mo16539a();

        /* renamed from: b */
        void mo16540b(C4798d dVar);
    }

    /* renamed from: b.o.c0$c */
    public static class C4797c extends HandlerThread {

        /* renamed from: g */
        public Handler f9185g = new Handler(getLooper());

        public C4797c() {
            super("OSH_LocationHandlerThread");
            start();
        }
    }

    /* renamed from: b.o.c0$d */
    public static class C4798d {

        /* renamed from: a */
        public Double f9186a;

        /* renamed from: b */
        public Double f9187b;

        /* renamed from: c */
        public Float f9188c;

        /* renamed from: d */
        public Integer f9189d;

        /* renamed from: e */
        public Boolean f9190e;

        /* renamed from: f */
        public Long f9191f;

        public String toString() {
            StringBuilder u = C0843a.m460u("LocationPoint{lat=");
            u.append(this.f9186a);
            u.append(", log=");
            u.append(this.f9187b);
            u.append(", accuracy=");
            u.append(this.f9188c);
            u.append(", type=");
            u.append(this.f9189d);
            u.append(", bg=");
            u.append(this.f9190e);
            u.append(", timeStamp=");
            u.append(this.f9191f);
            u.append('}');
            return u.toString();
        }
    }

    /* renamed from: b.o.c0$e */
    public static abstract class C4799e implements C4796b {
        /* renamed from: c */
        public void mo16542c(C4857i2.C4876s sVar) {
        }
    }

    /* renamed from: b.o.c0$f */
    public enum C4800f {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    /* renamed from: a */
    public static void m8785a(C4798d dVar) {
        Thread thread;
        Class<C4794c0> cls = C4794c0.class;
        HashMap hashMap = new HashMap();
        synchronized (cls) {
            hashMap.putAll(f9177b);
            f9177b.clear();
            thread = f9181f;
        }
        for (C4800f fVar : hashMap.keySet()) {
            ((C4796b) hashMap.get(fVar)).mo16540b(dVar);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == f9181f) {
            synchronized (cls) {
                if (thread == f9181f) {
                    f9181f = null;
                }
            }
        }
        C4815d3.m8835j(C4815d3.f9230a, "OS_LAST_LOCATION_TIME", System.currentTimeMillis());
    }

    /* renamed from: b */
    public static void m8786b(Location location) {
        double d;
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        C4857i2.m8933a(kVar, "LocationController fireCompleteForLocation with location: " + location, (Throwable) null);
        C4798d dVar = new C4798d();
        dVar.f9188c = Float.valueOf(location.getAccuracy());
        dVar.f9190e = Boolean.valueOf(C4857i2.f9363h ^ true);
        dVar.f9189d = Integer.valueOf(f9178c ^ true ? 1 : 0);
        dVar.f9191f = Long.valueOf(location.getTime());
        if (f9178c) {
            dVar.f9186a = Double.valueOf(new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
            d = new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue();
        } else {
            dVar.f9186a = Double.valueOf(location.getLatitude());
            d = location.getLongitude();
        }
        dVar.f9187b = Double.valueOf(d);
        m8785a(dVar);
        m8792h(f9182g);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public static void m8787c() {
        /*
            r0 = 0
            com.onesignal.PermissionsActivity.f11505i = r0
            java.lang.Object r0 = f9179d
            monitor-enter(r0)
            boolean r1 = m8789e()     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r1 == 0) goto L_0x0011
            p005b.p273o.C4932p.m9068c()     // Catch:{ all -> 0x0024 }
            goto L_0x001f
        L_0x0011:
            boolean r1 = m8790f()     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x001f
            monitor-enter(r0)     // Catch:{ all -> 0x0024 }
            p005b.p273o.C4986u.f9638j = r2     // Catch:{ all -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            goto L_0x001f
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            m8785a(r2)
            return
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4794c0.m8787c():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0 A[Catch:{ NameNotFoundException -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a7 A[Catch:{ NameNotFoundException -> 0x00ae }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8788d(android.content.Context r4, boolean r5, boolean r6, p005b.p273o.C4794c0.C4796b r7) {
        /*
            b.o.i2$s r0 = p005b.p273o.C4857i2.C4876s.PERMISSION_GRANTED
            b.o.i2$s r1 = p005b.p273o.C4857i2.C4876s.ERROR
            boolean r2 = r7 instanceof p005b.p273o.C4794c0.C4799e
            if (r2 == 0) goto L_0x0016
            java.util.List<b.o.c0$e> r2 = f9176a
            monitor-enter(r2)
            r3 = r7
            b.o.c0$e r3 = (p005b.p273o.C4794c0.C4799e) r3     // Catch:{ all -> 0x0013 }
            r2.add(r3)     // Catch:{ all -> 0x0013 }
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            goto L_0x0016
        L_0x0013:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r4
        L_0x0016:
            f9182g = r4
            java.util.concurrent.ConcurrentHashMap<b.o.c0$f, b.o.c0$b> r2 = f9177b
            b.o.c0$f r3 = r7.mo16539a()
            r2.put(r3, r7)
            boolean r7 = p005b.p273o.C4857i2.f9337G
            if (r7 != 0) goto L_0x002c
            m8793i(r5, r1)
            m8787c()
            return
        L_0x002c:
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            int r7 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2695B(r4, r7)
            r2 = -1
            if (r7 != r2) goto L_0x003e
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            int r2 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2695B(r4, r2)
            r3 = 1
            f9178c = r3
        L_0x003e:
            if (r7 == 0) goto L_0x00b6
            android.content.pm.PackageManager r7 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ae }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x00ae }
            r3 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r4 = r7.getPackageInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x00ae }
            java.lang.String[] r4 = r4.requestedPermissions     // Catch:{ NameNotFoundException -> 0x00ae }
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NameNotFoundException -> 0x00ae }
            b.o.i2$s r7 = p005b.p273o.C4857i2.C4876s.PERMISSION_DENIED     // Catch:{ NameNotFoundException -> 0x00ae }
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = r4.contains(r3)     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r3 == 0) goto L_0x0061
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            goto L_0x006d
        L_0x0061:
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r4 = r4.contains(r3)     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r4 == 0) goto L_0x0070
            if (r2 == 0) goto L_0x007a
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
        L_0x006d:
            f9184i = r4     // Catch:{ NameNotFoundException -> 0x00ae }
            goto L_0x007a
        L_0x0070:
            b.o.i2$k r4 = p005b.p273o.C4857i2.C4868k.INFO     // Catch:{ NameNotFoundException -> 0x00ae }
            java.lang.String r7 = "Location permissions not added on AndroidManifest file"
            r3 = 0
            p005b.p273o.C4857i2.m8933a(r4, r7, r3)     // Catch:{ NameNotFoundException -> 0x00ae }
            b.o.i2$s r7 = p005b.p273o.C4857i2.C4876s.LOCATION_PERMISSIONS_MISSING_MANIFEST     // Catch:{ NameNotFoundException -> 0x00ae }
        L_0x007a:
            java.lang.String r4 = f9184i     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r4 == 0) goto L_0x009e
            if (r5 == 0) goto L_0x009e
            boolean r4 = com.onesignal.PermissionsActivity.f11504h     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r4 != 0) goto L_0x00bc
            boolean r4 = com.onesignal.PermissionsActivity.f11505i     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r4 == 0) goto L_0x0089
            goto L_0x00bc
        L_0x0089:
            com.onesignal.PermissionsActivity.f11506j = r6     // Catch:{ NameNotFoundException -> 0x00ae }
            b.o.v3 r4 = new b.o.v3     // Catch:{ NameNotFoundException -> 0x00ae }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x00ae }
            com.onesignal.PermissionsActivity.f11508l = r4     // Catch:{ NameNotFoundException -> 0x00ae }
            b.o.a r4 = p005b.p273o.C4793c.f9174h     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r4 == 0) goto L_0x00bc
            java.lang.String r6 = com.onesignal.PermissionsActivity.f11503g     // Catch:{ NameNotFoundException -> 0x00ae }
            b.o.a$b r7 = com.onesignal.PermissionsActivity.f11508l     // Catch:{ NameNotFoundException -> 0x00ae }
            r4.mo16487a(r6, r7)     // Catch:{ NameNotFoundException -> 0x00ae }
            goto L_0x00bc
        L_0x009e:
            if (r2 != 0) goto L_0x00a7
            m8793i(r5, r0)     // Catch:{ NameNotFoundException -> 0x00ae }
            m8794j()     // Catch:{ NameNotFoundException -> 0x00ae }
            goto L_0x00bc
        L_0x00a7:
            m8793i(r5, r7)     // Catch:{ NameNotFoundException -> 0x00ae }
            m8787c()     // Catch:{ NameNotFoundException -> 0x00ae }
            goto L_0x00bc
        L_0x00ae:
            r4 = move-exception
            m8793i(r5, r1)
            r4.printStackTrace()
            goto L_0x00bc
        L_0x00b6:
            m8793i(r5, r0)
            m8794j()
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4794c0.m8788d(android.content.Context, boolean, boolean, b.o.c0$b):void");
    }

    /* renamed from: e */
    public static boolean m8789e() {
        return C4835f2.m8863m();
    }

    /* renamed from: f */
    public static boolean m8790f() {
        boolean z;
        char c;
        boolean z2;
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            c = 2;
        } else {
            if (!C4835f2.m8864n()) {
                if (C4835f2.m8860j()) {
                    if (C4835f2.m8859i() && C4835f2.m8862l()) {
                        z2 = C4835f2.m8865o();
                        if (z2 || (!C4835f2.m8864n() && C4835f2.m8869s("com.huawei.hwid"))) {
                            c = 13;
                        }
                    }
                }
                z2 = false;
                c = 13;
            }
            c = 1;
        }
        if (!(c == 13) || !C4835f2.m8861k()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8791g() {
        /*
            java.lang.Object r0 = f9179d
            monitor-enter(r0)
            boolean r1 = m8789e()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x000e
            p005b.p273o.C4932p.m9069g()     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x000e:
            boolean r1 = m8790f()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017
            p005b.p273o.C4986u.m9143g()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4794c0.m8791g():void");
    }

    /* renamed from: h */
    public static boolean m8792h(Context context) {
        if (!(C1960d.m2695B(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || C1960d.m2695B(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) || !C4857i2.f9337G) {
            return false;
        }
        long currentTimeMillis = ((C4857i2.f9363h ? 300 : 600) * 1000) - (System.currentTimeMillis() - C4815d3.m8829d(C4815d3.f9230a, "OS_LAST_LOCATION_TIME", -600000));
        Long l = C4957r3.f9567a;
        C4857i2.C4868k kVar = C4857i2.C4868k.VERBOSE;
        C4857i2.m8933a(kVar, "scheduleLocationUpdateTask:delayMs: " + currentTimeMillis, (Throwable) null);
        C4957r3.m9116c(context, currentTimeMillis);
        return true;
    }

    /* renamed from: i */
    public static void m8793i(boolean z, C4857i2.C4876s sVar) {
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        if (!z) {
            C4857i2.m8933a(kVar, "LocationController sendAndClearPromptHandlers from non prompt flow", (Throwable) null);
            return;
        }
        List<C4799e> list = f9176a;
        synchronized (list) {
            C4857i2.m8933a(kVar, "LocationController calling prompt handlers", (Throwable) null);
            for (C4799e c : list) {
                c.mo16542c(sVar);
            }
            f9176a.clear();
        }
    }

    /* renamed from: j */
    public static void m8794j() {
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        StringBuilder u = C0843a.m460u("LocationController startGetLocation with lastLocation: ");
        u.append(f9183h);
        C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
        if (f9180e == null) {
            f9180e = new C4797c();
        }
        try {
            if (m8789e()) {
                C4932p.m9070j();
            } else if (m8790f()) {
                C4986u.m9144k();
            } else {
                m8787c();
            }
        } catch (Throwable th) {
            C4857i2.m8933a(C4857i2.C4868k.WARN, "Location permission exists but there was an error initializing: ", th);
            m8787c();
        }
    }
}
