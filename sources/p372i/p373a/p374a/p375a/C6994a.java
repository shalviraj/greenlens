package p372i.p373a.p374a.p375a;

import android.app.Activity;
import android.view.ViewTreeObserver;
import p372i.p373a.p374a.p375a.C6996c;

/* renamed from: i.a.a.a.a */
public class C6994a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: g */
    public final /* synthetic */ C6996c f14032g;

    public C6994a(C6996c cVar) {
        this.f14032g = cVar;
    }

    public boolean onPreDraw() {
        Activity activity = this.f14032g.f14041g;
        if (activity == null) {
            return true;
        }
        activity.getWindow().getDecorView().getViewTreeObserver().removeOnPreDrawListener(this);
        this.f14032g.f14037c = new C6996c.C6997a((C6994a) null);
        this.f14032g.f14037c.execute(new Void[0]);
        return true;
    }
}
