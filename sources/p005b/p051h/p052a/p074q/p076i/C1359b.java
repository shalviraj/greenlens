package p005b.p051h.p052a.p074q.p076i;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import p005b.p051h.p052a.p074q.p075h.C1351e;
import p005b.p051h.p052a.p074q.p076i.C1362d;

/* renamed from: b.h.a.q.i.b */
public class C1359b implements C1362d<Drawable> {

    /* renamed from: a */
    public final int f1771a;

    /* renamed from: b */
    public final boolean f1772b;

    public C1359b(int i, boolean z) {
        this.f1771a = i;
        this.f1772b = z;
    }

    /* renamed from: a */
    public boolean mo11225a(Object obj, C1362d.C1363a aVar) {
        Drawable drawable = (Drawable) obj;
        C1351e eVar = (C1351e) aVar;
        Drawable drawable2 = ((ImageView) eVar.f1762g).getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f1772b);
        transitionDrawable.startTransition(this.f1771a);
        ((ImageView) eVar.f1762g).setImageDrawable(transitionDrawable);
        return true;
    }
}
