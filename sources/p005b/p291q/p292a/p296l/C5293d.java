package p005b.p291q.p292a.p296l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* renamed from: b.q.a.l.d */
public class C5293d extends StateListDrawable {

    /* renamed from: g */
    public int f10595g;

    public C5293d(Drawable drawable, int i) {
        this.f10595g = i;
        addState(new int[]{16842913}, drawable);
        addState(new int[0], drawable);
    }

    public boolean isStateful() {
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842913) {
                z = true;
            }
        }
        if (z) {
            setColorFilter(this.f10595g, PorterDuff.Mode.SRC_ATOP);
        } else {
            clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
