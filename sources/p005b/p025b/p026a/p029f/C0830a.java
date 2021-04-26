package p005b.p025b.p026a.p029f;

import android.view.View;
import android.view.ViewTreeObserver;
import p298d.p344x.p345b.C6862l;

/* renamed from: b.b.a.f.a */
public final class C0830a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: g */
    public Integer f658g;

    /* renamed from: h */
    public final /* synthetic */ View f659h;

    /* renamed from: i */
    public final /* synthetic */ C6862l f660i;

    public C0830a(View view, TLd/x/b/l tld_x_b_l) {
        this.f659h = view;
        this.f660i = tld_x_b_l;
    }

    public void onGlobalLayout() {
        Integer num = this.f658g;
        if (num != null) {
            int measuredWidth = this.f659h.getMeasuredWidth();
            if (num != null && num.intValue() == measuredWidth) {
                this.f659h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
        }
        if (this.f659h.getMeasuredWidth() > 0 && this.f659h.getMeasuredHeight() > 0) {
            Integer num2 = this.f658g;
            int measuredWidth2 = this.f659h.getMeasuredWidth();
            if (num2 == null || num2.intValue() != measuredWidth2) {
                this.f658g = Integer.valueOf(this.f659h.getMeasuredWidth());
                this.f660i.invoke(this.f659h);
            }
        }
    }
}
