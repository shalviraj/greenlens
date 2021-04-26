package p005b.p032d.p033a;

import android.view.View;
import android.view.ViewTreeObserver;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.d.a.d */
public final class C0839d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: g */
    public final /* synthetic */ C0841f f679g;

    public C0839d(C0841f fVar) {
        this.f679g = fVar;
    }

    public boolean onPreDraw() {
        if (this.f679g.mo10678e().getHeight() <= 0) {
            return true;
        }
        this.f679g.mo10678e().getViewTreeObserver().removeOnPreDrawListener(this);
        int height = this.f679g.mo10678e().getHeight();
        View view = this.f679g.f681g;
        if (view == null) {
            C6888i.m12446m("sheetTouchOutsideContainer");
            throw null;
        } else if (height != view.getHeight()) {
            return true;
        } else {
            this.f679g.mo10679f(0.0f);
            C0841f fVar = this.f679g;
            if (!fVar.f691q) {
                return true;
            }
            fVar.mo10678e().setCornerRadius$lib_release(0.0f);
            return true;
        }
    }
}
