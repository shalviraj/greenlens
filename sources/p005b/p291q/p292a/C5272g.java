package p005b.p291q.p292a;

import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;

/* renamed from: b.q.a.g */
public class C5272g implements HorizontalProgressWheelView.C5857a {

    /* renamed from: a */
    public final /* synthetic */ UCropActivity f10532a;

    public C5272g(UCropActivity uCropActivity) {
        this.f10532a = uCropActivity;
    }

    /* renamed from: a */
    public void mo17214a(float f, float f2) {
        if (f > 0.0f) {
            GestureCropImageView gestureCropImageView = this.f10532a.f11544s;
            gestureCropImageView.mo17257l((((this.f10532a.f11544s.getMaxScale() - this.f10532a.f11544s.getMinScale()) / 15000.0f) * f) + gestureCropImageView.getCurrentScale(), gestureCropImageView.f10603v.centerX(), gestureCropImageView.f10603v.centerY());
            return;
        }
        GestureCropImageView gestureCropImageView2 = this.f10532a.f11544s;
        float maxScale = (((this.f10532a.f11544s.getMaxScale() - this.f10532a.f11544s.getMinScale()) / 15000.0f) * f) + gestureCropImageView2.getCurrentScale();
        float centerX = gestureCropImageView2.f10603v.centerX();
        float centerY = gestureCropImageView2.f10603v.centerY();
        if (maxScale >= gestureCropImageView2.getMinScale()) {
            gestureCropImageView2.mo17248f(maxScale / gestureCropImageView2.getCurrentScale(), centerX, centerY);
        }
    }

    /* renamed from: b */
    public void mo17215b() {
        this.f10532a.f11544s.setImageToWrapCropBounds(true);
    }

    /* renamed from: c */
    public void mo17216c() {
        this.f10532a.f11544s.mo17254i();
    }
}
