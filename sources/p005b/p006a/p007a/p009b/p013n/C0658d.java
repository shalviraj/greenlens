package p005b.p006a.p007a.p009b.p013n;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.b.n.d */
public final class C0658d implements ViewPager2.PageTransformer {
    public void transformPage(View view, float f) {
        C6888i.m12438e(view, "page");
        float height = (float) view.getHeight();
        float width = (float) view.getWidth();
        int i = (f > ((float) 0) ? 1 : (f == ((float) 0) ? 0 : -1));
        float f2 = 1.0f;
        if (i <= 0) {
            f2 = Math.abs(1.0f + f);
        }
        if (f2 < 0.5f) {
            f2 = 0.5f;
        }
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setPivotX(width * 0.5f);
        view.setPivotY(height * 0.5f);
        view.setTranslationX(i > 0 ? width * f : (-width) * f * 0.25f);
    }
}
