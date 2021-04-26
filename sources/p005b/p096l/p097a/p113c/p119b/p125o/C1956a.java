package p005b.p096l.p097a.p113c.p119b.p125o;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.Collections;
import java.util.List;

/* renamed from: b.l.a.c.b.o.a */
public class C1956a {

    /* renamed from: e */
    public static final Object f3504e = new Object();

    /* renamed from: f */
    public static volatile C1956a f3505f;

    /* renamed from: a */
    public final List<String> f3506a;

    /* renamed from: b */
    public final List<String> f3507b;

    /* renamed from: c */
    public final List<String> f3508c;

    /* renamed from: d */
    public final List<String> f3509d;

    public C1956a() {
        List<String> list = Collections.EMPTY_LIST;
        this.f3506a = list;
        this.f3507b = list;
        this.f3508c = list;
        this.f3509d = list;
    }

    /* renamed from: b */
    public static C1956a m2685b() {
        if (f3505f == null) {
            synchronized (f3504e) {
                if (f3505f == null) {
                    f3505f = new C1956a();
                }
            }
        }
        return f3505f;
    }

    /* renamed from: a */
    public boolean mo12287a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        context.getClass().getName();
        return mo12288c(context, intent, serviceConnection, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12288c(android.content.Context r4, android.content.Intent r5, android.content.ServiceConnection r6, int r7) {
        /*
            r3 = this;
            android.content.ComponentName r0 = r5.getComponent()
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x0028
        L_0x0009:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            r2.equals(r0)
            b.l.a.c.b.q.a r2 = p005b.p096l.p097a.p113c.p119b.p128q.C1968b.m2885a(r4)     // Catch:{ NameNotFoundException -> 0x0007 }
            android.content.Context r2 = r2.f3529a     // Catch:{ NameNotFoundException -> 0x0007 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0007 }
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0007 }
            int r0 = r0.flags     // Catch:{ NameNotFoundException -> 0x0007 }
            r2 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0007
            r0 = 1
        L_0x0028:
            if (r0 == 0) goto L_0x0032
            java.lang.String r4 = "ConnectionTracker"
            java.lang.String r5 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r4, r5)
            return r1
        L_0x0032:
            boolean r4 = r4.bindService(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p125o.C1956a.mo12288c(android.content.Context, android.content.Intent, android.content.ServiceConnection, int):boolean");
    }
}
