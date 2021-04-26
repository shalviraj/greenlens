package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.amplitude.api.Constants;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p131e.p140i.C2776f;
import p005b.p096l.p097a.p113c.p131e.p140i.C2790g0;
import p005b.p096l.p097a.p113c.p145h.p147b.C3305r6;
import p005b.p096l.p180d.p182n.C3853b;
import p005b.p096l.p180d.p216x.C4288d;

public final class FirebaseAnalytics {

    /* renamed from: b */
    public static volatile FirebaseAnalytics f11413b;

    /* renamed from: a */
    public final C2790g0 f11414a;

    public FirebaseAnalytics(C2790g0 g0Var) {
        Objects.requireNonNull(g0Var, "null reference");
        this.f11414a = g0Var;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@RecentlyNonNull Context context) {
        if (f11413b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f11413b == null) {
                    f11413b = new FirebaseAnalytics(C2790g0.m4765c(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f11413b;
    }

    @Keep
    @Nullable
    public static C3305r6 getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        C2790g0 c = C2790g0.m4765c(context, (String) null, (String) null, (String) null, bundle);
        if (c == null) {
            return null;
        }
        return new C3853b(c);
    }

    @RecentlyNonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C1960d.m2797g(C4288d.m7853d().getId(), Constants.EVENT_UPLOAD_PERIOD_MILLIS, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @MainThread
    @Deprecated
    @Keep
    public void setCurrentScreen(@RecentlyNonNull Activity activity, @Size(max = 36, min = 1) @Nullable String str, @Size(max = 36, min = 1) @Nullable String str2) {
        C2790g0 g0Var = this.f11414a;
        Objects.requireNonNull(g0Var);
        g0Var.f4740c.execute(new C2776f(g0Var, activity, str, str2));
    }
}
