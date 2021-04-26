package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.C1758d;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1851p;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p128q.C1968b;
import p005b.p096l.p097a.p113c.p131e.p133b.C2004b;
import p005b.p096l.p097a.p113c.p131e.p133b.C2010h;
import p005b.p096l.p097a.p113c.p131e.p133b.C2012j;
import p005b.p096l.p097a.p113c.p150j.C3423e0;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p097a.p113c.p150j.C3430j;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.nj */
public final class C2362nj {

    /* renamed from: d */
    public static final C1955a f4098d = new C1955a("FirebaseAuth", "SmsRetrieverHelper");

    /* renamed from: a */
    public final Context f4099a;

    /* renamed from: b */
    public final ScheduledExecutorService f4100b;

    /* renamed from: c */
    public final HashMap<String, C2338mj> f4101c = new HashMap<>();

    public C2362nj(@NonNull Context context) {
        this.f4099a = context;
        this.f4100b = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    /* renamed from: f */
    public static /* synthetic */ void m3825f(C2362nj njVar, String str) {
        C2338mj mjVar = njVar.f4101c.get(str);
        if (mjVar != null && !C1960d.m2757U1(mjVar.f4079d) && !C1960d.m2757U1(mjVar.f4080e) && !mjVar.f4077b.isEmpty()) {
            for (C2648zh d : mjVar.f4077b) {
                d.mo13139d(C3938x.m7314V(mjVar.f4079d, mjVar.f4080e));
            }
            mjVar.f4083h = true;
        }
    }

    /* renamed from: g */
    public static String m3826g(String str, String str2) {
        String q = C0843a.m456q(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()), str, " ", str2);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(q.getBytes(C2311lg.f4045a));
            String substring = Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
            C1955a aVar = f4098d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19 + String.valueOf(substring).length());
            sb.append("Package: ");
            sb.append(str);
            sb.append(" -- Hash: ");
            sb.append(substring);
            aVar.mo12282a(sb.toString(), new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            C1955a aVar2 = f4098d;
            String valueOf = String.valueOf(e.getMessage());
            aVar2.mo12283b(valueOf.length() != 0 ? "NoSuchAlgorithm: ".concat(valueOf) : new String("NoSuchAlgorithm: "), new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo12836a(String str) {
        return this.f4101c.get(str) != null;
    }

    /* renamed from: b */
    public final void mo12837b(String str, C2648zh zhVar, long j, boolean z) {
        this.f4101c.put(str, new C2338mj(j, z));
        mo12838c(zhVar, str);
        C2338mj mjVar = this.f4101c.get(str);
        long j2 = mjVar.f4076a;
        if (j2 <= 0) {
            C1955a aVar = f4098d;
            Log.w(aVar.f3501a, aVar.mo12284c("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]));
            return;
        }
        mjVar.f4081f = this.f4100b.schedule(new C2241ij(this, str), j2, TimeUnit.SECONDS);
        if (!mjVar.f4078c) {
            C1955a aVar2 = f4098d;
            Log.w(aVar2.f3501a, aVar2.mo12284c("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]));
            return;
        }
        C2314lj ljVar = new C2314lj(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        this.f4099a.getApplicationContext().registerReceiver(ljVar, intentFilter);
        C2010h hVar = new C2010h(this.f4099a);
        C1851p.C1852a a = C1851p.m2499a();
        a.f3274a = new C2012j(hVar);
        a.f3275b = new C1758d[]{C2004b.f3560b};
        C3428h e = hVar.mo12036e(1, a.mo12158a());
        C2266jj jjVar = new C2266jj();
        C3423e0 e0Var = (C3423e0) e;
        Objects.requireNonNull(e0Var);
        e0Var.mo14682d(C3430j.f6198a, jjVar);
    }

    /* renamed from: c */
    public final void mo12838c(C2648zh zhVar, String str) {
        C2338mj mjVar = this.f4101c.get(str);
        if (mjVar != null) {
            mjVar.f4077b.add(zhVar);
            if (mjVar.f4082g) {
                zhVar.mo12770c(mjVar.f4079d);
            }
            if (mjVar.f4083h) {
                zhVar.mo13139d(C3938x.m7314V(mjVar.f4079d, mjVar.f4080e));
            }
            if (mjVar.f4084i) {
                zhVar.mo13140e(mjVar.f4079d);
            }
        }
    }

    /* renamed from: d */
    public final String mo12839d() {
        try {
            String packageName = this.f4099a.getPackageName();
            String g = m3826g(packageName, (Build.VERSION.SDK_INT < 28 ? C1968b.m2885a(this.f4099a).mo12294b(packageName, 64).signatures : C1968b.m2885a(this.f4099a).mo12294b(packageName, 134217728).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (g != null) {
                return g;
            }
            C1955a aVar = f4098d;
            Log.e(aVar.f3501a, aVar.mo12284c("Hash generation failed.", new Object[0]));
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            C1955a aVar2 = f4098d;
            Log.e(aVar2.f3501a, aVar2.mo12284c("Unable to find package to obtain hash.", new Object[0]));
            return null;
        }
    }

    /* renamed from: e */
    public final void mo12840e(String str) {
        C2338mj mjVar = this.f4101c.get(str);
        if (mjVar != null) {
            ScheduledFuture<?> scheduledFuture = mjVar.f4081f;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                mjVar.f4081f.cancel(false);
            }
            mjVar.f4077b.clear();
            this.f4101c.remove(str);
        }
    }

    /* renamed from: h */
    public final void mo12841h(String str) {
        C2338mj mjVar = this.f4101c.get(str);
        if (mjVar != null) {
            if (!mjVar.f4084i) {
                mo12842i(str);
            }
            mo12840e(str);
        }
    }

    /* renamed from: i */
    public final void mo12842i(String str) {
        C2338mj mjVar = this.f4101c.get(str);
        if (mjVar != null && !mjVar.f4083h && !C1960d.m2757U1(mjVar.f4079d)) {
            C1955a aVar = f4098d;
            Log.w(aVar.f3501a, aVar.mo12284c("Timed out waiting for SMS.", new Object[0]));
            for (C2648zh e : mjVar.f4077b) {
                e.mo13140e(mjVar.f4079d);
            }
            mjVar.f4084i = true;
        }
    }
}
