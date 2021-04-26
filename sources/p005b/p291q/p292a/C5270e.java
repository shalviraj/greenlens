package p005b.p291q.p292a;

import android.view.View;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;

/* renamed from: b.q.a.e */
public class C5270e implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ UCropActivity f10530g;

    public C5270e(UCropActivity uCropActivity) {
        this.f10530g = uCropActivity;
    }

    public void onClick(View view) {
        UCropActivity uCropActivity = this.f10530g;
        GestureCropImageView gestureCropImageView = uCropActivity.f11544s;
        gestureCropImageView.mo17256k(-gestureCropImageView.getCurrentAngle());
        uCropActivity.f11544s.setImageToWrapCropBounds(true);
    }
}
