package p005b.p096l.p097a.p113c.p145h.p147b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.MainThread;
import com.segment.analytics.AnalyticsContext;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

@TargetApi(14)
@MainThread
/* renamed from: b.l.a.c.h.b.p6 */
public final class C3283p6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    public final /* synthetic */ C3294q6 f5868g;

    public /* synthetic */ C3283p6(C3294q6 q6Var) {
        this.f5868g = q6Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f5868g.f5638a.mo14329d().f5807n.mo14414a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f5868g.f5638a.mo14467t();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.f5868g.f5638a.mo14331f().mo14420q(new C3272o6(this, z, data, str, queryParameter));
                    }
                }
            }
        } catch (Exception e) {
            this.f5868g.f5638a.mo14329d().f5799f.mo14415b("Throwable caught in onActivityCreated", e);
        } catch (Throwable th) {
            this.f5868g.f5638a.mo14472y().mo14216t(activity, bundle);
            throw th;
        }
        this.f5868g.f5638a.mo14472y().mo14216t(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        C3174f7 y = this.f5868g.f5638a.mo14472y();
        synchronized (y.f5518l) {
            if (activity == y.f5513g) {
                y.f5513g = null;
            }
        }
        if (y.f5638a.f5848g.mo14202w()) {
            y.f5512f.remove(activity);
        }
    }

    @MainThread
    public final void onActivityPaused(Activity activity) {
        C3174f7 y = this.f5868g.f5638a.mo14472y();
        if (y.f5638a.f5848g.mo14197r((String) null, C3134c3.f5407s0)) {
            synchronized (y.f5518l) {
                y.f5517k = false;
                y.f5514h = true;
            }
        }
        Objects.requireNonNull((C1959c) y.f5638a.f5855n);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!y.f5638a.f5848g.mo14197r((String) null, C3134c3.f5405r0) || y.f5638a.f5848g.mo14202w()) {
            C3371x6 o = y.mo14212o(activity);
            y.f5510d = y.f5509c;
            y.f5509c = null;
            y.f5638a.mo14331f().mo14420q(new C3150d7(y, o, elapsedRealtime));
        } else {
            y.f5509c = null;
            y.f5638a.mo14331f().mo14420q(new C3138c7(y, elapsedRealtime));
        }
        C3340u8 r = this.f5868g.f5638a.mo14465r();
        Objects.requireNonNull((C1959c) r.f5638a.f5855n);
        r.f5638a.mo14331f().mo14420q(new C3263n8(r, SystemClock.elapsedRealtime()));
    }

    @MainThread
    public final void onActivityResumed(Activity activity) {
        C3340u8 r = this.f5868g.f5638a.mo14465r();
        Objects.requireNonNull((C1959c) r.f5638a.f5855n);
        r.f5638a.mo14331f().mo14420q(new C3252m8(r, SystemClock.elapsedRealtime()));
        C3174f7 y = this.f5868g.f5638a.mo14472y();
        if (y.f5638a.f5848g.mo14197r((String) null, C3134c3.f5407s0)) {
            synchronized (y.f5518l) {
                y.f5517k = true;
                if (activity != y.f5513g) {
                    synchronized (y.f5518l) {
                        y.f5513g = activity;
                        y.f5514h = false;
                    }
                    if (y.f5638a.f5848g.mo14197r((String) null, C3134c3.f5405r0) && y.f5638a.f5848g.mo14202w()) {
                        y.f5515i = null;
                        y.f5638a.mo14331f().mo14420q(new C3162e7(y));
                    }
                }
            }
        }
        if (!y.f5638a.f5848g.mo14197r((String) null, C3134c3.f5405r0) || y.f5638a.f5848g.mo14202w()) {
            y.mo14209l(activity, y.mo14212o(activity), false);
            C3133c2 g = y.f5638a.mo14458g();
            Objects.requireNonNull((C1959c) g.f5638a.f5855n);
            g.f5638a.mo14331f().mo14420q(new C3120b1(g, SystemClock.elapsedRealtime()));
            return;
        }
        y.f5509c = y.f5515i;
        y.f5638a.mo14331f().mo14420q(new C3126b7(y));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C3371x6 x6Var;
        C3174f7 y = this.f5868g.f5638a.mo14472y();
        if (y.f5638a.f5848g.mo14202w() && bundle != null && (x6Var = y.f5512f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong(AnalyticsContext.Device.DEVICE_ID_KEY, x6Var.f6094c);
            bundle2.putString("name", x6Var.f6092a);
            bundle2.putString("referrer_name", x6Var.f6093b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
