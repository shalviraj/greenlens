package p005b.p273o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import com.amplitude.api.Constants;
import com.appfoundry.previewer.constants.AnimationStrength;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4802c2;
import p005b.p273o.C4857i2;
import p005b.p273o.C4908n;
import p005b.p273o.p274w4.C5011a;
import p005b.p273o.p274w4.C5012b;
import p005b.p273o.p274w4.C5015e;

/* renamed from: b.o.a */
public class C4771a implements C4802c2.C4803a {

    /* renamed from: c */
    public static final Map<String, C4773b> f9115c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final Map<String, C4802c2.C4804b> f9116d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final Map<String, C4776e> f9117e = new ConcurrentHashMap();

    /* renamed from: f */
    public static C4775d f9118f = new C4775d();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    public Activity f9119a = null;

    /* renamed from: b */
    public boolean f9120b = false;

    /* renamed from: b.o.a$b */
    public static abstract class C4773b {
        /* renamed from: a */
        public void mo16492a(@NonNull Activity activity) {
        }

        /* renamed from: b */
        public void mo16493b() {
        }

        /* renamed from: c */
        public void mo16494c(@NonNull Activity activity) {
        }
    }

    /* renamed from: b.o.a$c */
    public static class C4774c implements Runnable {

        /* renamed from: g */
        public boolean f9121g;

        /* renamed from: h */
        public boolean f9122h;

        public C4774c(C4772a aVar) {
        }

        public void run() {
            if (C4857i2.m8943k() == null) {
                this.f9121g = true;
                for (Map.Entry<String, C4773b> value : C4771a.f9115c.entrySet()) {
                    ((C4773b) value.getValue()).mo16493b();
                }
                C4857i2.m8933a(C4857i2.C4868k.DEBUG, "Application lost focus", (Throwable) null);
                boolean z = false;
                C4857i2.f9363h = false;
                C4857i2.f9364i = C4857i2.C4863f.APP_CLOSE;
                C4857i2.m8929F(System.currentTimeMillis());
                C4794c0.m8791g();
                if (C4857i2.f9362g) {
                    C4806c4 c4Var = C4857i2.f9369n;
                    if (c4Var != null) {
                        c4Var.mo16547a();
                    }
                    if (C4857i2.f9358c == null) {
                        C4857i2.m8933a(C4857i2.C4868k.ERROR, "Android Context not found, please call OneSignal.init when your app starts.", (Throwable) null);
                    } else {
                        C4908n a = C4908n.m9005a();
                        Objects.requireNonNull(a);
                        C5015e eVar = C4857i2.f9377v.f9744a;
                        Objects.requireNonNull(eVar);
                        ArrayList arrayList = new ArrayList();
                        for (C5011a next : eVar.f9690a.values()) {
                            if (!(next instanceof C5012b)) {
                                arrayList.add(next.mo16753e());
                            }
                        }
                        a.mo16642b(arrayList, C4908n.C4910b.BACKGROUND);
                        a.f9474a = null;
                        boolean t = C4947q3.m9082b().mo16665t();
                        boolean t2 = C4947q3.m9081a().mo16665t();
                        if (t2) {
                            t2 = C4947q3.m9081a().mo16660m() != null;
                        }
                        if (t || t2) {
                            z = true;
                        }
                        if (z) {
                            C4957r3.m9115b(C4857i2.f9358c);
                        }
                        C4794c0.m8792h(C4857i2.f9358c);
                    }
                }
                this.f9122h = true;
            }
        }
    }

    /* renamed from: b.o.a$d */
    public static class C4775d extends HandlerThread {

        /* renamed from: g */
        public Handler f9123g = new Handler(getLooper());

        /* renamed from: h */
        public C4774c f9124h;

        public C4775d() {
            super("FocusHandlerThread");
            start();
        }
    }

    /* renamed from: b.o.a$e */
    public static class C4776e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: g */
        public final C4802c2.C4804b f9125g;

        /* renamed from: h */
        public final C4802c2.C4803a f9126h;

        /* renamed from: i */
        public final String f9127i;

        public C4776e(C4802c2.C4803a aVar, C4802c2.C4804b bVar, String str, C4772a aVar2) {
            this.f9126h = aVar;
            this.f9125g = bVar;
            this.f9127i = str;
        }

        public void onGlobalLayout() {
            if (!C4843g2.m8883e(new WeakReference(C4857i2.m8943k()))) {
                C4802c2.C4803a aVar = this.f9126h;
                String str = this.f9127i;
                Activity activity = ((C4771a) aVar).f9119a;
                if (activity != null) {
                    activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                C4771a.f9117e.remove(str);
                C4771a.f9116d.remove(str);
                this.f9125g.mo16546b();
            }
        }
    }

    /* renamed from: a */
    public void mo16487a(String str, C4773b bVar) {
        f9115c.put(str, bVar);
        Activity activity = this.f9119a;
        if (activity != null) {
            bVar.mo16492a(activity);
        }
    }

    /* renamed from: b */
    public final void mo16488b() {
        boolean z;
        AtomicLong atomicLong;
        C4775d dVar = f9118f;
        C4774c cVar = dVar.f9124h;
        if ((cVar != null && cVar.f9121g) || this.f9120b) {
            this.f9120b = false;
            if (cVar != null) {
                cVar.f9121g = false;
            }
            C4857i2.m8933a(C4857i2.C4868k.DEBUG, "Application on focus", (Throwable) null);
            C4857i2.f9363h = true;
            if (!C4857i2.f9364i.equals(C4857i2.C4863f.NOTIFICATION_CLICK)) {
                C4857i2.f9364i = C4857i2.C4863f.APP_OPEN;
            }
            C4794c0.m8791g();
            if (!C4857i2.m8930G("onAppFocus")) {
                if (C4857i2.f9356a != null) {
                    z = false;
                } else {
                    C4857i2.m8933a(C4857i2.C4868k.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.", (Throwable) null);
                    z = true;
                }
                if (!z) {
                    C4908n a = C4908n.m9005a();
                    Objects.requireNonNull(a);
                    a.f9474a = Long.valueOf(SystemClock.elapsedRealtime());
                    C4857i2.m8939g();
                    C4830e4 e4Var = C4857i2.f9368m;
                    if (e4Var != null) {
                        e4Var.mo16567b();
                    }
                    new Thread(new C4902m0(C4857i2.f9358c), "OS_RESTORE_NOTIFS").start();
                    C4857i2.m8944l(C4857i2.f9358c).mo16714a();
                    if (C4857i2.f9370o != null && C4857i2.m8947o()) {
                        C4818d4 d4Var = C4857i2.f9370o;
                        Objects.requireNonNull(d4Var);
                        if (!(C4818d4.f9238d == null || C4818d4.f9240f == null)) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis - C4818d4.f9238d.get() <= 120000 && ((atomicLong = C4818d4.f9239e) == null || currentTimeMillis - atomicLong.get() >= Constants.EVENT_UPLOAD_PERIOD_MILLIS)) {
                                try {
                                    Object b = d4Var.mo16558b(d4Var.f9242b);
                                    Method c = C4818d4.m8838c(C4818d4.f9237c);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("source", "OneSignal");
                                    bundle.putString(AnimationStrength.MEDIUM, "notification");
                                    bundle.putString("notification_id", C4818d4.f9240f.f9486a);
                                    bundle.putString("campaign", d4Var.mo16557a(C4818d4.f9240f));
                                    c.invoke(b, new Object[]{"os_notification_influence_open", bundle});
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        }
                    }
                    Context context = C4857i2.f9358c;
                    Long l = C4957r3.f9567a;
                    synchronized (C4957r3.class) {
                        C4957r3.f9567a = 0L;
                        if (!C4794c0.m8792h(context)) {
                            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(2071862118);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        dVar.f9123g.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: c */
    public final void mo16489c() {
        C4775d dVar = f9118f;
        C4774c cVar = new C4774c((C4772a) null);
        C4774c cVar2 = dVar.f9124h;
        if (cVar2 == null || !cVar2.f9121g || cVar2.f9122h) {
            dVar.f9124h = cVar;
            dVar.f9123g.removeCallbacksAndMessages((Object) null);
            dVar.f9123g.postDelayed(cVar, 2000);
        }
    }

    /* renamed from: d */
    public final void mo16490d() {
        String str;
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        StringBuilder u = C0843a.m460u("curActivity is NOW: ");
        if (this.f9119a != null) {
            StringBuilder u2 = C0843a.m460u("");
            u2.append(this.f9119a.getClass().getName());
            u2.append(":");
            u2.append(this.f9119a);
            str = u2.toString();
        } else {
            str = "null";
        }
        u.append(str);
        C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
    }

    /* renamed from: e */
    public void mo16491e(Activity activity) {
        this.f9119a = activity;
        for (Map.Entry<String, C4773b> value : f9115c.entrySet()) {
            ((C4773b) value.getValue()).mo16492a(this.f9119a);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.f9119a.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry next : f9116d.entrySet()) {
                C4776e eVar = new C4776e(this, (C4802c2.C4804b) next.getValue(), (String) next.getKey(), (C4772a) null);
                viewTreeObserver.addOnGlobalLayoutListener(eVar);
                f9117e.put(next.getKey(), eVar);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
