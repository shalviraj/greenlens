package p005b.p006a.p007a.p009b.p010l;

import android.view.animation.Animation;
import androidx.core.view.ViewCompat;
import com.appfoundry.previewer.BravoApp;
import p005b.p006a.p007a.p008a.C0605h;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.b.l.a */
public final class C0635a implements Animation.AnimationListener {

    /* renamed from: a */
    public float f299a;

    /* renamed from: b */
    public final /* synthetic */ C0605h f300b;

    /* renamed from: b.a.a.b.l.a$a */
    public static final class C0636a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C0635a f301g;

        public C0636a(C0635a aVar) {
            this.f301g = aVar;
        }

        public final void run() {
            if (!this.f301g.f300b.isDetached()) {
                ViewCompat.setTranslationZ(this.f301g.f300b.mo10333c(), this.f301g.f299a);
            }
        }
    }

    public C0635a(C0605h hVar) {
        this.f300b = hVar;
    }

    public void onAnimationEnd(Animation animation) {
        C6888i.m12438e(animation, "animation");
        if (!this.f300b.isDetached()) {
            this.f300b.mo10333c().postDelayed(new C0636a(this), (long) 10);
        }
        BravoApp.C5403b bVar = BravoApp.f10730N;
        BravoApp.f10722F = false;
    }

    public void onAnimationRepeat(Animation animation) {
        C6888i.m12438e(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        C6888i.m12438e(animation, "animation");
        if (!this.f300b.isDetached()) {
            this.f299a = ViewCompat.getTranslationZ(this.f300b.mo10333c());
            ViewCompat.setTranslationZ(this.f300b.mo10333c(), 100.0f);
        }
    }
}
