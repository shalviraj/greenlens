package p005b.p006a.p007a.p009b.p010l.p011d;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.Key;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.appfoundry.previewer.constants.AnimationStrength;
import java.util.List;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.b.l.d.e */
public final class C0644e<T extends RecyclerView.ViewHolder> extends C0641b<T> {

    /* renamed from: g */
    public Interpolator f321g;

    /* renamed from: h */
    public final String f322h;

    /* renamed from: i */
    public final String f323i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0644e(androidx.recyclerview.widget.RecyclerView.Adapter r7, androidx.recyclerview.widget.RecyclerView r8, java.util.List r9, android.view.animation.Interpolator r10, java.lang.String r11, int r12, java.lang.String r13, int r14) {
        /*
            r6 = this;
            r9 = r14 & 4
            r3 = 0
            r9 = r14 & 8
            r9 = 0
            r10 = r14 & 32
            if (r10 == 0) goto L_0x000c
            r12 = 300(0x12c, float:4.2E-43)
        L_0x000c:
            r5 = r12
            r10 = r14 & 64
            if (r10 == 0) goto L_0x0013
            java.lang.String r13 = "medium"
        L_0x0013:
            java.lang.String r10 = "adapter"
            p298d.p344x.p346c.C6888i.m12438e(r7, r10)
            java.lang.String r10 = "recyclerView"
            p298d.p344x.p346c.C6888i.m12438e(r8, r10)
            java.lang.String r10 = "slideType"
            p298d.p344x.p346c.C6888i.m12438e(r11, r10)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f321g = r9
            r6.f322h = r11
            r6.f323i = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p009b.p010l.p011d.C0644e.<init>(androidx.recyclerview.widget.RecyclerView$Adapter, androidx.recyclerview.widget.RecyclerView, java.util.List, android.view.animation.Interpolator, java.lang.String, int, java.lang.String, int):void");
    }

    /* renamed from: a */
    public List<Animator> mo10426a(View view) {
        float f;
        C6888i.m12438e(view, "view");
        float[] fArr = new float[2];
        if (C6888i.m12434a(this.f322h, "right")) {
            String str = this.f323i;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 99152071) {
                    if (hashCode == 102970646 && str.equals(AnimationStrength.LIGHT)) {
                        f = -10.0f;
                    }
                } else if (str.equals(AnimationStrength.HEAVY)) {
                    f = -50.0f;
                }
            }
            f = -30.0f;
        } else {
            String str2 = this.f323i;
            if (str2 != null) {
                int hashCode2 = str2.hashCode();
                if (hashCode2 != 99152071) {
                    if (hashCode2 == 102970646 && str2.equals(AnimationStrength.LIGHT)) {
                        f = 10.0f;
                    }
                } else if (str2.equals(AnimationStrength.HEAVY)) {
                    f = 50.0f;
                }
            }
            f = 30.0f;
        }
        fArr[0] = C0820c.m304d() * f;
        fArr[1] = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.TRANSLATION_X, fArr);
        C6888i.m12437d(ofFloat, "ObjectAnimator.ofFloat(v…) * displayDensity(), 0f)");
        Interpolator interpolator = this.f321g;
        if (interpolator != null) {
            ofFloat.setInterpolator(interpolator);
        }
        return C5266a.m9910Y2(ofFloat);
    }
}
