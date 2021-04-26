package p005b.p096l.p097a.p113c.p131e.p140i;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005b.p096l.p097a.p113c.p119b.p126p.C1958b;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p145h.p146a.C3104a;
import p005b.p096l.p097a.p113c.p145h.p147b.C3282p5;
import p005b.p096l.p097a.p113c.p145h.p147b.C3360w6;

/* renamed from: b.l.a.c.e.i.g0 */
public final class C2790g0 {

    /* renamed from: i */
    public static volatile C2790g0 f4737i;

    /* renamed from: a */
    public final String f4738a;

    /* renamed from: b */
    public final C1958b f4739b;

    /* renamed from: c */
    public final ExecutorService f4740c;

    /* renamed from: d */
    public final C3104a f4741d;
    @GuardedBy("listenerList")

    /* renamed from: e */
    public final List<Pair<C3282p5, C3010x>> f4742e;

    /* renamed from: f */
    public int f4743f;

    /* renamed from: g */
    public boolean f4744g;

    /* renamed from: h */
    public volatile C2996vb f4745h;

    public C2790g0(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z;
        this.f4738a = (str == null || !m4764b(str2, str3)) ? "FA" : str;
        this.f4739b = C1959c.f3510a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2919q());
        boolean z2 = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f4740c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f4741d = new C3104a(this);
        this.f4742e = new ArrayList();
        try {
            if (C3360w6.m6446a(context, "google_app_id", C1960d.m2795f1(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (!z) {
                    this.f4744g = true;
                    Log.w(this.f4738a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        if (!m4764b(str2, str3)) {
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z2)) {
                    Log.w(this.f4738a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f4738a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        this.f4740c.execute(new C2789g(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f4738a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C2777f0(this));
        }
    }

    /* renamed from: b */
    public static final boolean m4764b(String str, String str2) {
        boolean z;
        if (!(str2 == null || str == null)) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static C2790g0 m4765c(Context context, String str, String str2, String str3, Bundle bundle) {
        Objects.requireNonNull(context, "null reference");
        if (f4737i == null) {
            synchronized (C2790g0.class) {
                if (f4737i == null) {
                    f4737i = new C2790g0(context, (String) null, (String) null, (String) null, bundle);
                }
            }
        }
        return f4737i;
    }

    /* renamed from: a */
    public final void mo13337a(Exception exc, boolean z, boolean z2) {
        this.f4744g |= z;
        if (z) {
            Log.w(this.f4738a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            this.f4740c.execute(new C2906p(this, "Error with data collection. Data lost.", exc));
        }
        Log.w(this.f4738a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: d */
    public final void mo13338d(String str, String str2, Bundle bundle) {
        this.f4740c.execute(new C2971u(this, (Long) null, str, str2, bundle, true, true));
    }
}
