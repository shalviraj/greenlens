package p005b.p096l.p180d.p191q.p192f.p195g;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import p005b.p096l.p097a.p113c.p150j.C3429i;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p191q.p192f.C3982b;

/* renamed from: b.l.d.q.f.g.c0 */
public class C4001c0 {

    /* renamed from: a */
    public final SharedPreferences f7309a;

    /* renamed from: b */
    public final C3825d f7310b;

    /* renamed from: c */
    public final Object f7311c = new Object();

    /* renamed from: d */
    public C3429i<Void> f7312d = new C3429i<>();

    /* renamed from: e */
    public boolean f7313e = false;
    @Nullable

    /* renamed from: f */
    public Boolean f7314f;

    /* renamed from: g */
    public final C3429i<Void> f7315g = new C3429i<>();

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4001c0(p005b.p096l.p180d.C3825d r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f7311c = r0
            b.l.a.c.j.i r0 = new b.l.a.c.j.i
            r0.<init>()
            r6.f7312d = r0
            r0 = 0
            r6.f7313e = r0
            b.l.a.c.j.i r1 = new b.l.a.c.j.i
            r1.<init>()
            r6.f7315g = r1
            r7.mo15344a()
            android.content.Context r1 = r7.f7042a
            r6.f7310b = r7
            android.content.SharedPreferences r7 = p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7400h(r1)
            r6.f7309a = r7
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x003d
            r6.f7313e = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x003e
        L_0x003d:
            r7 = r5
        L_0x003e:
            if (r7 != 0) goto L_0x008d
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x007a
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0069 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r1 == 0) goto L_0x007a
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x007a
            boolean r2 = r2.containsKey(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x007a
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            boolean r7 = r1.getBoolean(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            goto L_0x007b
        L_0x0069:
            r7 = move-exception
            b.l.d.q.f.b r1 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            r2 = 6
            boolean r1 = r1.mo15495a(r2)
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r1, r2, r7)
        L_0x007a:
            r7 = r5
        L_0x007b:
            if (r7 != 0) goto L_0x0081
            r6.f7313e = r0
            r7 = r5
            goto L_0x008d
        L_0x0081:
            r6.f7313e = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x008d:
            r6.f7314f = r7
            java.lang.Object r7 = r6.f7311c
            monitor-enter(r7)
            boolean r0 = r6.mo15513a()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x009d
            b.l.a.c.j.i<java.lang.Void> r0 = r6.f7312d     // Catch:{ all -> 0x009f }
            r0.mo14702b(r5)     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r7)     // Catch:{ all -> 0x009f }
            return
        L_0x009f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x009f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p195g.C4001c0.<init>(b.l.d.d):void");
    }

    /* renamed from: a */
    public synchronized boolean mo15513a() {
        boolean booleanValue;
        Boolean bool = this.f7314f;
        booleanValue = bool != null ? bool.booleanValue() : this.f7310b.mo15348h();
        C3982b.f7289a.mo15496b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{booleanValue ? "ENABLED" : "DISABLED", this.f7314f == null ? "global Firebase setting" : this.f7313e ? "firebase_crashlytics_collection_enabled manifest flag" : "API"}));
        return booleanValue;
    }
}
