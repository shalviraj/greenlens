package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.amplitude.api.Constants;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.p127h.C1964a;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p180d.C3814a;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p181a0.C3822h;
import p005b.p096l.p180d.p211t.C4220b;
import p005b.p096l.p180d.p211t.C4222d;
import p005b.p096l.p180d.p213v.C4231a;
import p005b.p096l.p180d.p213v.C4232a0;
import p005b.p096l.p180d.p213v.C4233b;
import p005b.p096l.p180d.p213v.C4234b0;
import p005b.p096l.p180d.p213v.C4237d;
import p005b.p096l.p180d.p213v.C4250j0;
import p005b.p096l.p180d.p213v.C4263p0;
import p005b.p096l.p180d.p213v.C4264q;
import p005b.p096l.p180d.p213v.C4265q0;
import p005b.p096l.p180d.p213v.C4267r0;
import p005b.p096l.p180d.p213v.C4270t;
import p005b.p096l.p180d.p213v.C4271t0;
import p005b.p096l.p180d.p213v.C4272u;
import p005b.p096l.p180d.p213v.C4277w0;
import p005b.p096l.p180d.p213v.C4278x;
import p005b.p096l.p180d.p213v.C4279x0;
import p005b.p096l.p180d.p213v.C4282z;

public class FirebaseInstanceId {

    /* renamed from: i */
    public static final long f11437i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    public static C4278x f11438j;

    /* renamed from: k */
    public static ScheduledExecutorService f11439k;

    /* renamed from: a */
    public final Executor f11440a;

    /* renamed from: b */
    public final C3825d f11441b;

    /* renamed from: c */
    public final C4264q f11442c;

    /* renamed from: d */
    public C4233b f11443d;

    /* renamed from: e */
    public final C4270t f11444e;

    /* renamed from: f */
    public final C4234b0 f11445f;

    /* renamed from: g */
    public boolean f11446g = false;

    /* renamed from: h */
    public final C5768a f11447h;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    public class C5768a {

        /* renamed from: a */
        public final boolean f11448a;

        /* renamed from: b */
        public final C4222d f11449b;
        @Nullable

        /* renamed from: c */
        public C4220b<C3814a> f11450c;
        @Nullable

        /* renamed from: d */
        public Boolean f11451d;

        public C5768a(C4222d dVar) {
            boolean z;
            Boolean bool;
            ApplicationInfo applicationInfo;
            Bundle bundle;
            this.f11449b = dVar;
            try {
                Class.forName("b.l.d.z.a");
            } catch (ClassNotFoundException unused) {
                C3825d dVar2 = FirebaseInstanceId.this.f11441b;
                dVar2.mo15344a();
                Context context = dVar2.f7042a;
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(context.getPackageName());
                ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
                z = (resolveService == null || resolveService.serviceInfo == null) ? false : z;
            }
            z = true;
            this.f11448a = z;
            C3825d dVar3 = FirebaseInstanceId.this.f11441b;
            dVar3.mo15344a();
            Context context2 = dVar3.f7042a;
            SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            } else {
                try {
                    PackageManager packageManager = context2.getPackageManager();
                    if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled"))) {
                        bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                bool = null;
            }
            this.f11451d = bool;
            if (bool == null && this.f11448a) {
                C4267r0 r0Var = new C4267r0(this);
                this.f11450c = r0Var;
                dVar.mo15482a(C3814a.class, r0Var);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
            return r1.f11448a && r1.f11452e.f11441b.mo15348h();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean mo22178a() {
            /*
                r1 = this;
                monitor-enter(r1)
                java.lang.Boolean r0 = r1.f11451d     // Catch:{ all -> 0x001e }
                if (r0 == 0) goto L_0x000b
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x001e }
                monitor-exit(r1)
                return r0
            L_0x000b:
                boolean r0 = r1.f11448a     // Catch:{ all -> 0x001e }
                if (r0 == 0) goto L_0x001c
                com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x001e }
                b.l.d.d r0 = r0.f11441b     // Catch:{ all -> 0x001e }
                boolean r0 = r0.mo15348h()     // Catch:{ all -> 0x001e }
                if (r0 == 0) goto L_0x001c
                r0 = 1
            L_0x001a:
                monitor-exit(r1)
                return r0
            L_0x001c:
                r0 = 0
                goto L_0x001a
            L_0x001e:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.C5768a.mo22178a():boolean");
        }
    }

    public FirebaseInstanceId(C3825d dVar, C4222d dVar2, C3822h hVar) {
        dVar.mo15344a();
        C4264q qVar = new C4264q(dVar.f7042a);
        Executor a = C4250j0.m7791a();
        Executor a2 = C4250j0.m7791a();
        if (C4264q.m7804a(dVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f11438j == null) {
                    dVar.mo15344a();
                    f11438j = new C4278x(dVar.f7042a);
                }
            }
            this.f11441b = dVar;
            this.f11442c = qVar;
            if (this.f11443d == null) {
                dVar.mo15344a();
                C4233b bVar = (C4233b) dVar.f7045d.mo15457a(C4233b.class);
                this.f11443d = (bVar == null || !bVar.mo15817e()) ? new C4271t0(dVar, qVar, a, hVar) : bVar;
            }
            this.f11443d = this.f11443d;
            this.f11440a = a2;
            this.f11445f = new C4234b0(f11438j);
            C5768a aVar = new C5768a(dVar2);
            this.f11447h = aVar;
            this.f11444e = new C4270t(a);
            if (aVar.mo22178a()) {
                mo22175k();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: a */
    public static FirebaseInstanceId m10541a() {
        return getInstance(C3825d.m7208c());
    }

    /* renamed from: f */
    public static void m10542f(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f11439k == null) {
                f11439k = new ScheduledThreadPoolExecutor(1, new C1964a("FirebaseInstanceId"));
            }
            f11439k.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    @Keep
    public static FirebaseInstanceId getInstance(@NonNull C3825d dVar) {
        dVar.mo15344a();
        return (FirebaseInstanceId) dVar.f7045d.mo15457a(FirebaseInstanceId.class);
    }

    @Nullable
    /* renamed from: j */
    public static C4232a0 m10543j(String str, String str2) {
        C4232a0 b;
        C4278x xVar = f11438j;
        synchronized (xVar) {
            b = C4232a0.m7772b(xVar.f7924a.getString(C4278x.m7829a("", str, str2), (String) null));
        }
        return b;
    }

    /* renamed from: l */
    public static String m10544l() {
        C4279x0 x0Var;
        C4278x xVar = f11438j;
        synchronized (xVar) {
            x0Var = xVar.f7927d.get("");
            if (x0Var == null) {
                try {
                    x0Var = xVar.f7926c.mo15882h(xVar.f7925b, "");
                } catch (C4237d unused) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    m10541a().mo22177o();
                    x0Var = xVar.f7926c.mo15883j(xVar.f7925b, "");
                }
                xVar.f7927d.put("", x0Var);
            }
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x0Var.f7928a.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused2) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: n */
    public static boolean m10545n() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    @WorkerThread
    /* renamed from: b */
    public String mo22168b(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
                str2 = "*";
            }
            return ((C4231a) mo22170d(C1960d.m2740P(null).mo14686h(this.f11440a, new C4263p0(this, str, str2)))).mo15812a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: c */
    public final synchronized void mo22169c() {
        if (!this.f11446g) {
            mo22171e(0);
        }
    }

    /* renamed from: d */
    public final <T> T mo22170d(C3428h<T> hVar) {
        try {
            return C1960d.m2797g(hVar, Constants.EVENT_UPLOAD_PERIOD_MILLIS, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo22177o();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: e */
    public final synchronized void mo22171e(long j) {
        m10542f(new C4282z(this, this.f11445f, Math.min(Math.max(30, j << 1), f11437i)), j);
        this.f11446g = true;
    }

    /* renamed from: g */
    public final synchronized void mo22172g(boolean z) {
        this.f11446g = z;
    }

    /* renamed from: h */
    public final boolean mo22173h(@Nullable C4232a0 a0Var) {
        if (a0Var != null) {
            return (System.currentTimeMillis() > (a0Var.f7831c + C4232a0.f7827d) ? 1 : (System.currentTimeMillis() == (a0Var.f7831c + C4232a0.f7827d) ? 0 : -1)) > 0 || !this.f11442c.mo15862c().equals(a0Var.f7830b);
        }
    }

    /* renamed from: i */
    public final C3428h mo22174i(String str, String str2) {
        C3428h<TContinuationResult> hVar;
        String l = m10544l();
        C4232a0 j = m10543j(str, str2);
        if (!this.f11443d.mo15815c() && !mo22173h(j)) {
            return C1960d.m2740P(new C4277w0(l, j.f7829a));
        }
        int i = C4232a0.f7828e;
        String str3 = j == null ? null : j.f7829a;
        C4270t tVar = this.f11444e;
        synchronized (tVar) {
            Pair pair = new Pair(str, str2);
            hVar = tVar.f7905b.get(pair);
            if (hVar == null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(pair);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                    sb.append("Making new request for: ");
                    sb.append(valueOf);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                hVar = this.f11443d.mo15816d(l, str3, str, str2).mo14693o(this.f11440a, new C4265q0(this, str, str2, l)).mo14686h(tVar.f7904a, new C4272u(tVar, pair));
                tVar.f7905b.put(pair, hVar);
            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf2 = String.valueOf(pair);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 29);
                sb2.append("Joining ongoing request for: ");
                sb2.append(valueOf2);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
        }
        return hVar;
    }

    /* renamed from: k */
    public final void mo22175k() {
        boolean z;
        C4232a0 m = mo22176m();
        if (!this.f11443d.mo15815c() && !mo22173h(m)) {
            C4234b0 b0Var = this.f11445f;
            synchronized (b0Var) {
                z = b0Var.mo15818a() != null;
            }
            if (!z) {
                return;
            }
        }
        mo22169c();
    }

    @Nullable
    /* renamed from: m */
    public final C4232a0 mo22176m() {
        return m10543j(C4264q.m7804a(this.f11441b), "*");
    }

    /* renamed from: o */
    public final synchronized void mo22177o() {
        f11438j.mo15875c();
        if (this.f11447h.mo22178a()) {
            mo22169c();
        }
    }
}
