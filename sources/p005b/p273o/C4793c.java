package p005b.p273o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Objects;
import p005b.p273o.C4771a;
import p005b.p273o.C4857i2;

/* renamed from: b.o.c */
public class C4793c implements Application.ActivityLifecycleCallbacks {
    @Nullable

    /* renamed from: g */
    public static C4793c f9173g;
    @SuppressLint({"StaticFieldLeak"})
    @Nullable

    /* renamed from: h */
    public static C4771a f9174h;
    @Nullable

    /* renamed from: i */
    public static ComponentCallbacks f9175i;

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C4771a aVar = f9174h;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C4771a aVar = f9174h;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            C4857i2.m8933a(kVar, "onActivityDestroyed: " + activity, (Throwable) null);
            C4771a.f9117e.clear();
            if (activity == aVar.f9119a) {
                aVar.f9119a = null;
                aVar.mo16489c();
            }
            aVar.mo16490d();
        }
    }

    public void onActivityPaused(Activity activity) {
        C4771a aVar = f9174h;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            C4857i2.m8933a(kVar, "onActivityPaused: " + activity, (Throwable) null);
            if (activity == aVar.f9119a) {
                aVar.f9119a = null;
                aVar.mo16489c();
            }
            aVar.mo16490d();
        }
    }

    public void onActivityResumed(Activity activity) {
        C4771a aVar = f9174h;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            C4857i2.m8933a(kVar, "onActivityResumed: " + activity, (Throwable) null);
            aVar.mo16491e(activity);
            aVar.mo16490d();
            aVar.mo16488b();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        C4771a aVar = f9174h;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    public void onActivityStopped(Activity activity) {
        C4771a aVar = f9174h;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            C4857i2.m8933a(kVar, "onActivityStopped: " + activity, (Throwable) null);
            if (activity == aVar.f9119a) {
                aVar.f9119a = null;
                aVar.mo16489c();
            }
            for (Map.Entry<String, C4771a.C4773b> value : C4771a.f9115c.entrySet()) {
                ((C4771a.C4773b) value.getValue()).mo16494c(activity);
            }
            aVar.mo16490d();
        }
    }
}
