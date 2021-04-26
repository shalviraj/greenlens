package p005b.p006a.p007a.p009b.p013n;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.b.n.b */
public final class C0656b implements ViewPager2.PageTransformer {
    public void transformPage(View view, float f) {
        C6888i.m12438e(view, "page");
        view.setCameraDistance((float) (view.getWidth() * 20));
        float f2 = 0.0f;
        if (f < 0.0f) {
            f2 = (float) view.getWidth();
        }
        view.setPivotX(f2);
        view.setPivotY(((float) view.getHeight()) * 0.5f);
        view.setRotationY(f * 90.0f);
    }
}
