package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: b.l.a.c.b.l.k.c */
public final class C1800c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: k */
    public static final C1800c f3150k = new C1800c();

    /* renamed from: g */
    public final AtomicBoolean f3151g = new AtomicBoolean();

    /* renamed from: h */
    public final AtomicBoolean f3152h = new AtomicBoolean();

    /* renamed from: i */
    public final ArrayList<C1801a> f3153i = new ArrayList<>();

    /* renamed from: j */
    public boolean f3154j = false;

    /* renamed from: b.l.a.c.b.l.k.c$a */
    public interface C1801a {
        /* renamed from: a */
        void mo12064a(boolean z);
    }

    /* renamed from: b */
    public static void m2388b(Application application) {
        C1800c cVar = f3150k;
        synchronized (cVar) {
            if (!cVar.f3154j) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f3154j = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo12052a(C1801a aVar) {
        synchronized (f3150k) {
            this.f3153i.add(aVar);
        }
    }

    /* renamed from: c */
    public final void mo12053c(boolean z) {
        synchronized (f3150k) {
            ArrayList<C1801a> arrayList = this.f3153i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                C1801a aVar = arrayList.get(i);
                i++;
                aVar.mo12064a(z);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f3151g.compareAndSet(true, false);
        this.f3152h.set(true);
        if (compareAndSet) {
            mo12053c(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f3151g.compareAndSet(true, false);
        this.f3152h.set(true);
        if (compareAndSet) {
            mo12053c(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f3151g.compareAndSet(false, true)) {
            this.f3152h.set(true);
            mo12053c(true);
        }
    }
}
