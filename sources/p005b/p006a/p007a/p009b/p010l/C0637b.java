package p005b.p006a.p007a.p009b.p010l;

import android.view.View;
import android.view.animation.Animation;
import androidx.core.view.ViewCompat;
import p005b.p006a.p007a.p008a.C0605h;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.b.l.b */
public final class C0637b implements Animation.AnimationListener {

    /* renamed from: a */
    public float f302a;

    /* renamed from: b */
    public final /* synthetic */ C0605h f303b;

    /* renamed from: b.a.a.b.l.b$a */
    public static final class C0638a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C0637b f304g;

        public C0638a(C0637b bVar) {
            this.f304g = bVar;
        }

        public final void run() {
            if (this.f304g.f303b.getView() != null && !this.f304g.f303b.isDetached()) {
                View view = this.f304g.f303b.getView();
                C6888i.m12436c(view);
                ViewCompat.setTranslationZ(view, this.f304g.f302a);
            }
        }
    }

    public C0637b(C0605h hVar) {
        this.f303b = hVar;
    }

    public void onAnimationEnd(Animation animation) {
        C6888i.m12438e(animation, "animation");
        if (this.f303b.getView() != null && !this.f303b.isDetached()) {
            View view = this.f303b.getView();
            C6888i.m12436c(view);
            view.postDelayed(new C0638a(this), (long) 10);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        C6888i.m12438e(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        C6888i.m12438e(animation, "animation");
        if (this.f303b.getView() != null && !this.f303b.isDetached()) {
            View view = this.f303b.getView();
            C6888i.m12436c(view);
            this.f302a = ViewCompat.getTranslationZ(view);
            View view2 = this.f303b.getView();
            C6888i.m12436c(view2);
            ViewCompat.setTranslationZ(view2, 100.0f);
        }
    }
}
