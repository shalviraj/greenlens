package p005b.p273o;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Objects;
import p005b.p273o.C4771a;

/* renamed from: b.o.g2 */
public class C4843g2 {

    /* renamed from: a */
    public static final int f9301a = m8880b(24);

    /* renamed from: b.o.g2$a */
    public static class C4844a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ String f9302g;

        /* renamed from: h */
        public final /* synthetic */ Runnable f9303h;

        /* renamed from: b.o.g2$a$a */
        public class C4845a extends C4771a.C4773b {

            /* renamed from: a */
            public final /* synthetic */ C4771a f9304a;

            public C4845a(C4771a aVar) {
                this.f9304a = aVar;
            }

            /* renamed from: a */
            public void mo16492a(@NonNull Activity activity) {
                C4771a aVar = this.f9304a;
                String str = C4844a.this.f9302g;
                Objects.requireNonNull(aVar);
                C4771a.f9115c.remove(str);
                if (C4843g2.m8882d(activity)) {
                    C4844a.this.f9303h.run();
                } else {
                    C4843g2.m8879a(activity, C4844a.this.f9303h);
                }
            }
        }

        public C4844a(String str, Runnable runnable) {
            this.f9302g = str;
            this.f9303h = runnable;
        }

        public void run() {
            C4771a aVar = C4793c.f9174h;
            if (aVar != null) {
                aVar.mo16487a(this.f9302g, new C4845a(aVar));
            }
        }
    }

    /* renamed from: a */
    public static void m8879a(@NonNull Activity activity, @NonNull Runnable runnable) {
        activity.getWindow().getDecorView().post(new C4844a("decorViewReady:" + runnable, runnable));
    }

    /* renamed from: b */
    public static int m8880b(int i) {
        return (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
    }

    /* renamed from: c */
    public static int m8881c(@NonNull Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        int height = decorView.getHeight();
        return rootWindowInsets == null ? height : (height - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    /* renamed from: d */
    public static boolean m8882d(@NonNull Activity activity) {
        return (activity.getWindow().getDecorView().getApplicationWindowToken() != null) && (activity.getWindow().getDecorView().getRootWindowInsets() != null);
    }

    /* renamed from: e */
    public static boolean m8883e(WeakReference<Activity> weakReference) {
        View view;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = ((Activity) weakReference.get()).getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        return view != null && displayMetrics.heightPixels - rect.bottom > f9301a;
    }
}
