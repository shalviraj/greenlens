package p005b.p291q.p292a;

import android.view.View;
import android.view.ViewGroup;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import java.util.Iterator;

/* renamed from: b.q.a.c */
public class C5268c implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ UCropActivity f10528g;

    public C5268c(UCropActivity uCropActivity) {
        this.f10528g = uCropActivity;
    }

    public void onClick(View view) {
        GestureCropImageView gestureCropImageView = this.f10528g.f11544s;
        AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) ((ViewGroup) view).getChildAt(0);
        if (view.isSelected()) {
            if (aspectRatioTextView.f11597j != 0.0f) {
                float f = aspectRatioTextView.f11599l;
                float f2 = aspectRatioTextView.f11600m;
                aspectRatioTextView.f11599l = f2;
                aspectRatioTextView.f11600m = f;
                aspectRatioTextView.f11597j = f2 / f;
            }
            aspectRatioTextView.mo22929b();
        }
        gestureCropImageView.setTargetAspectRatio(aspectRatioTextView.f11597j);
        this.f10528g.f11544s.setImageToWrapCropBounds(true);
        if (!view.isSelected()) {
            Iterator<ViewGroup> it = this.f10528g.f11522A.iterator();
            while (it.hasNext()) {
                ViewGroup next = it.next();
                next.setSelected(next == view);
            }
        }
    }
}
