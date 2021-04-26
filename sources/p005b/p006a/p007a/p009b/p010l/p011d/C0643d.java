package p005b.p006a.p007a.p009b.p010l.p011d;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.Key;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.appfoundry.previewer.constants.AnimationStrength;
import com.appfoundry.previewer.constants.AnimationType;
import java.util.List;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.b.l.d.d */
public final class C0643d<T extends RecyclerView.ViewHolder> extends C0641b<T> {

    /* renamed from: g */
    public Interpolator f318g;

    /* renamed from: h */
    public final String f319h;

    /* renamed from: i */
    public final String f320i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0643d(androidx.recyclerview.widget.RecyclerView.Adapter r7, androidx.recyclerview.widget.RecyclerView r8, java.util.List r9, android.view.animation.Interpolator r10, int r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r6 = this;
            r9 = r14 & 4
            r3 = 0
            r9 = r14 & 8
            r9 = 0
            r10 = r14 & 16
            if (r10 == 0) goto L_0x000c
            r11 = 300(0x12c, float:4.2E-43)
        L_0x000c:
            r5 = r11
            r10 = r14 & 64
            if (r10 == 0) goto L_0x0013
            java.lang.String r13 = "medium"
        L_0x0013:
            java.lang.String r10 = "adapter"
            p298d.p344x.p346c.C6888i.m12438e(r7, r10)
            java.lang.String r10 = "recyclerView"
            p298d.p344x.p346c.C6888i.m12438e(r8, r10)
            java.lang.String r10 = "scaleType"
            p298d.p344x.p346c.C6888i.m12438e(r12, r10)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f318g = r9
            r6.f319h = r12
            r6.f320i = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p009b.p010l.p011d.C0643d.<init>(androidx.recyclerview.widget.RecyclerView$Adapter, androidx.recyclerview.widget.RecyclerView, java.util.List, android.view.animation.Interpolator, int, java.lang.String, java.lang.String, int):void");
    }

    /* renamed from: a */
    public List<Animator> mo10426a(View view) {
        C6888i.m12438e(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.SCALE_X, new float[]{mo10427b(), 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, Key.SCALE_Y, new float[]{mo10427b(), 1.0f});
        Interpolator interpolator = this.f318g;
        if (interpolator != null) {
            C6888i.m12437d(ofFloat, "scaleXAnimator");
            ofFloat.setInterpolator(interpolator);
            C6888i.m12437d(ofFloat2, "scaleYAnimator");
            ofFloat2.setInterpolator(interpolator);
        }
        return C6790h.m12314A(ofFloat, ofFloat2);
    }

    /* renamed from: b */
    public final float mo10427b() {
        if (C6888i.m12434a(this.f319h, AnimationType.CONTRACT)) {
            String str = this.f320i;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 99152071) {
                    if (hashCode == 102970646 && str.equals(AnimationStrength.LIGHT)) {
                        return 1.1f;
                    }
                } else if (str.equals(AnimationStrength.HEAVY)) {
                    return 1.5f;
                }
            }
            return 1.3f;
        }
        String str2 = this.f320i;
        if (str2 != null) {
            int hashCode2 = str2.hashCode();
            if (hashCode2 != 99152071) {
                if (hashCode2 == 102970646 && str2.equals(AnimationStrength.LIGHT)) {
                    return 0.9f;
                }
            } else if (str2.equals(AnimationStrength.HEAVY)) {
                return 0.5f;
            }
        }
        return 0.7f;
    }
}
