package p360g.p361a.p362a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Deque;
import java.util.Locale;

/* renamed from: g.a.a.b */
public final class C6963b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    public int f13961g = 0;

    /* renamed from: h */
    public final DateFormat f13962h = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass() != C6964c.f13964b.f13977o) {
            C6964c.f13966d = new WeakReference<>(activity);
        }
        if (C6964c.f13964b.f13974l) {
            Deque<String> deque = C6964c.f13965c;
            deque.add(this.f13962h.format(new Date()) + ": " + activity.getClass().getSimpleName() + " created\n");
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (C6964c.f13964b.f13974l) {
            Deque<String> deque = C6964c.f13965c;
            deque.add(this.f13962h.format(new Date()) + ": " + activity.getClass().getSimpleName() + " destroyed\n");
        }
    }

    public void onActivityPaused(Activity activity) {
        if (C6964c.f13964b.f13974l) {
            Deque<String> deque = C6964c.f13965c;
            deque.add(this.f13962h.format(new Date()) + ": " + activity.getClass().getSimpleName() + " paused\n");
        }
    }

    public void onActivityResumed(Activity activity) {
        if (C6964c.f13964b.f13974l) {
            Deque<String> deque = C6964c.f13965c;
            deque.add(this.f13962h.format(new Date()) + ": " + activity.getClass().getSimpleName() + " resumed\n");
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        boolean z = true;
        int i = this.f13961g + 1;
        this.f13961g = i;
        if (i != 0) {
            z = false;
        }
        C6964c.f13967e = z;
    }

    public void onActivityStopped(Activity activity) {
        boolean z = true;
        int i = this.f13961g - 1;
        this.f13961g = i;
        if (i != 0) {
            z = false;
        }
        C6964c.f13967e = z;
    }
}
