package p005b.p051h.p052a.p074q.p075h;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p051h.p052a.p074q.p076i.C1362d;

/* renamed from: b.h.a.q.h.e */
public abstract class C1351e<Z> extends C1355i<ImageView, Z> implements C1362d.C1363a {
    @Nullable

    /* renamed from: i */
    public Animatable f1761i;

    public C1351e(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    public void mo10649b(@NonNull Z z, @Nullable C1362d<? super Z> dVar) {
        if (dVar == null || !dVar.mo11225a(z, this)) {
            mo11216l(z);
        } else if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f1761i = animatable;
            animatable.start();
        } else {
            this.f1761i = null;
        }
    }

    /* renamed from: c */
    public void mo11211c(@Nullable Drawable drawable) {
        mo11216l((Object) null);
        ((ImageView) this.f1762g).setImageDrawable(drawable);
    }

    /* renamed from: d */
    public void mo10773d() {
        Animatable animatable = this.f1761i;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: e */
    public void mo11212e(@Nullable Drawable drawable) {
        mo11216l((Object) null);
        ((ImageView) this.f1762g).setImageDrawable(drawable);
    }

    /* renamed from: g */
    public void mo10650g(@Nullable Drawable drawable) {
        this.f1763h.mo11218a();
        Animatable animatable = this.f1761i;
        if (animatable != null) {
            animatable.stop();
        }
        mo11216l((Object) null);
        ((ImageView) this.f1762g).setImageDrawable(drawable);
    }

    /* renamed from: k */
    public abstract void mo11209k(@Nullable Z z);

    /* renamed from: l */
    public final void mo11216l(@Nullable Z z) {
        mo11209k(z);
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f1761i = animatable;
            animatable.start();
            return;
        }
        this.f1761i = null;
    }

    public void onStart() {
        Animatable animatable = this.f1761i;
        if (animatable != null) {
            animatable.start();
        }
    }
}
