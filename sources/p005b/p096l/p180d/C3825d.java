package p005b.p096l.p180d;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.p003os.UserManagerCompat;
import com.google.android.material.badge.BadgeDrawable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1800c;
import p005b.p096l.p097a.p113c.p119b.p122m.C1941q0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1942r;
import p005b.p096l.p097a.p113c.p119b.p126p.C1962f;
import p005b.p096l.p180d.p190p.C3961m;
import p005b.p096l.p180d.p190p.C3973x;
import p005b.p096l.p180d.p221y.C4320a;

/* renamed from: b.l.d.d */
public class C3825d {

    /* renamed from: i */
    public static final Object f7039i = new Object();

    /* renamed from: j */
    public static final Executor f7040j = new C3829d((C3826a) null);

    /* renamed from: k */
    public static final Map<String, C3825d> f7041k = new ArrayMap();

    /* renamed from: a */
    public final Context f7042a;

    /* renamed from: b */
    public final String f7043b;

    /* renamed from: c */
    public final C3838l f7044c;

    /* renamed from: d */
    public final C3961m f7045d;

    /* renamed from: e */
    public final AtomicBoolean f7046e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f7047f = new AtomicBoolean();

    /* renamed from: g */
    public final C3973x<C4320a> f7048g;

    /* renamed from: h */
    public final List<C3827b> f7049h = new CopyOnWriteArrayList();

    /* renamed from: b.l.d.d$b */
    public interface C3827b {
        /* renamed from: a */
        void mo15352a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: b.l.d.d$c */
    public static class C3828c implements C1800c.C1801a {

        /* renamed from: a */
        public static AtomicReference<C3828c> f7050a = new AtomicReference<>();

        /* renamed from: a */
        public void mo12064a(boolean z) {
            Object obj = C3825d.f7039i;
            synchronized (C3825d.f7039i) {
                Iterator it = new ArrayList(C3825d.f7041k.values()).iterator();
                while (it.hasNext()) {
                    C3825d dVar = (C3825d) it.next();
                    if (dVar.f7046e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        for (C3827b a : dVar.f7049h) {
                            a.mo15352a(z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b.l.d.d$d */
    public static class C3829d implements Executor {

        /* renamed from: g */
        public static final Handler f7051g = new Handler(Looper.getMainLooper());

        public C3829d(C3826a aVar) {
        }

        public void execute(@NonNull Runnable runnable) {
            f7051g.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: b.l.d.d$e */
    public static class C3830e extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<C3830e> f7052b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f7053a;

        public C3830e(Context context) {
            this.f7053a = context;
        }

        public void onReceive(Context context, Intent intent) {
            Object obj = C3825d.f7039i;
            synchronized (C3825d.f7039i) {
                for (C3825d f : C3825d.f7041k.values()) {
                    f.mo15347f();
                }
            }
            this.f7053a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb A[LOOP:1: B:25:0x00b5->B:27:0x00bb, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3825d(android.content.Context r9, java.lang.String r10, p005b.p096l.p180d.C3838l r11) {
        /*
            r8 = this;
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r8.f7046e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.f7047f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f7049h = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r9, r0)
            r8.f7042a = r9
            p005b.p006a.p007a.p024o.C0823f.m376j(r10)
            r8.f7043b = r10
            java.util.Objects.requireNonNull(r11, r0)
            r8.f7044c = r11
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r10 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "ComponentDiscovery"
            r3 = 0
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r4 != 0) goto L_0x0042
            java.lang.String r10 = "Context has no PackageManager."
            goto L_0x0060
        L_0x0042:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0067 }
            r5.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r4 = r4.getServiceInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r4 != 0) goto L_0x0064
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0067 }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x0067 }
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r10 = " has no service info."
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r10 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0067 }
        L_0x0060:
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x006c
        L_0x0064:
            android.os.Bundle r10 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x006d
        L_0x0067:
            java.lang.String r10 = "Application info not found."
            android.util.Log.w(r2, r10)
        L_0x006c:
            r10 = r3
        L_0x006d:
            if (r10 != 0) goto L_0x0079
            java.lang.String r10 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r2, r10)
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00b1
        L_0x0079:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r4 = r10.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0086:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b0
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.get(r5)
            java.lang.String r7 = "com.google.firebase.components.ComponentRegistrar"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0086
            java.lang.String r6 = "com.google.firebase.components:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0086
            r6 = 31
            java.lang.String r5 = r5.substring(r6)
            r2.add(r5)
            goto L_0x0086
        L_0x00b0:
            r10 = r2
        L_0x00b1:
            java.util.Iterator r10 = r10.iterator()
        L_0x00b5:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            b.l.d.p.f r4 = new b.l.d.p.f
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00b5
        L_0x00ca:
            java.util.concurrent.Executor r10 = f7040j
            int r2 = p005b.p096l.p180d.p190p.C3961m.f7255g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.addAll(r0)
            com.google.firebase.FirebaseCommonRegistrar r0 = new com.google.firebase.FirebaseCommonRegistrar
            r0.<init>()
            b.l.d.p.n r5 = new b.l.d.p.n
            r5.<init>(r0)
            r2.add(r5)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            b.l.d.p.d r0 = p005b.p096l.p180d.p190p.C3948d.m7322c(r9, r0, r5)
            r4.add(r0)
            java.lang.Class<b.l.d.d> r0 = p005b.p096l.p180d.C3825d.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            b.l.d.p.d r0 = p005b.p096l.p180d.p190p.C3948d.m7322c(r8, r0, r5)
            r4.add(r0)
            java.lang.Class<b.l.d.l> r0 = p005b.p096l.p180d.C3838l.class
            java.lang.Class[] r1 = new java.lang.Class[r1]
            b.l.d.p.d r11 = p005b.p096l.p180d.p190p.C3948d.m7322c(r11, r0, r1)
            r4.add(r11)
            b.l.d.p.m r11 = new b.l.d.p.m
            r11.<init>(r10, r2, r4, r3)
            r8.f7045d = r11
            b.l.d.p.x r10 = new b.l.d.p.x
            b.l.d.c r11 = new b.l.d.c
            r11.<init>(r8, r9)
            r10.<init>(r11)
            r8.f7048g = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.C3825d.<init>(android.content.Context, java.lang.String, b.l.d.l):void");
    }

    /* renamed from: b */
    public static List<String> m7207b() {
        ArrayList arrayList = new ArrayList();
        synchronized (f7039i) {
            for (C3825d next : f7041k.values()) {
                next.mo15344a();
                arrayList.add(next.f7043b);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @NonNull
    /* renamed from: c */
    public static C3825d m7208c() {
        C3825d dVar;
        synchronized (f7039i) {
            dVar = f7041k.get("[DEFAULT]");
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C1962f.m2878a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    @NonNull
    /* renamed from: d */
    public static C3825d m7209d(@NonNull String str) {
        C3825d dVar;
        String str2;
        synchronized (f7039i) {
            dVar = f7041k.get(str.trim());
            if (dVar == null) {
                List<String> b = m7207b();
                if (((ArrayList) b).isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", b);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return dVar;
    }

    @NonNull
    /* renamed from: g */
    public static C3825d m7210g(@NonNull Context context, @NonNull C3838l lVar, @NonNull String str) {
        C3825d dVar;
        AtomicReference<C3828c> atomicReference = C3828c.f7050a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (C3828c.f7050a.get() == null) {
                C3828c cVar = new C3828c();
                if (C3828c.f7050a.compareAndSet((Object) null, cVar)) {
                    C1800c.m2388b(application);
                    C1800c.f3150k.mo12052a(cVar);
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f7039i) {
            Map<String, C3825d> map = f7041k;
            boolean z = !map.containsKey(trim);
            C0823f.m386o(z, "FirebaseApp name " + trim + " already exists!");
            C0823f.m380l(context, "Application context cannot be null.");
            dVar = new C3825d(context, trim, lVar);
            map.put(trim, dVar);
        }
        dVar.mo15347f();
        return dVar;
    }

    /* renamed from: a */
    public final void mo15344a() {
        C0823f.m386o(!this.f7047f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: e */
    public String mo15345e() {
        String str;
        StringBuilder sb = new StringBuilder();
        mo15344a();
        byte[] bytes = this.f7043b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        mo15344a();
        byte[] bytes2 = this.f7044c.f7059b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3825d)) {
            return false;
        }
        String str = this.f7043b;
        C3825d dVar = (C3825d) obj;
        dVar.mo15344a();
        return str.equals(dVar.f7043b);
    }

    /* renamed from: f */
    public final void mo15347f() {
        HashMap hashMap;
        if (!UserManagerCompat.isUserUnlocked(this.f7042a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            mo15344a();
            sb.append(this.f7043b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f7042a;
            if (C3830e.f7052b.get() == null) {
                C3830e eVar = new C3830e(context);
                if (C3830e.f7052b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        mo15344a();
        sb2.append(this.f7043b);
        Log.i("FirebaseApp", sb2.toString());
        C3961m mVar = this.f7045d;
        boolean i = mo15350i();
        if (mVar.f7261f.compareAndSet((Object) null, Boolean.valueOf(i))) {
            synchronized (mVar) {
                hashMap = new HashMap(mVar.f7256a);
            }
            mVar.mo15470e(hashMap, i);
        }
    }

    /* renamed from: h */
    public boolean mo15348h() {
        boolean z;
        mo15344a();
        C4320a aVar = this.f7048g.get();
        synchronized (aVar) {
            z = aVar.f8030d;
        }
        return z;
    }

    public int hashCode() {
        return this.f7043b.hashCode();
    }

    @VisibleForTesting
    /* renamed from: i */
    public boolean mo15350i() {
        mo15344a();
        return "[DEFAULT]".equals(this.f7043b);
    }

    public String toString() {
        C1942r rVar = new C1942r(this, (C1941q0) null);
        rVar.mo12270a("name", this.f7043b);
        rVar.mo12270a("options", this.f7044c);
        return rVar.toString();
    }
}
