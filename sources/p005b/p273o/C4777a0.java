package p005b.p273o;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Objects;
import p005b.p273o.C4857i2;
import p005b.p273o.C4968s4;

/* renamed from: b.o.a0 */
public class C4777a0 {

    /* renamed from: p */
    public static final int f9128p = Color.parseColor("#00000000");

    /* renamed from: q */
    public static final int f9129q = Color.parseColor("#BB000000");

    /* renamed from: r */
    public static final int f9130r = C4843g2.m8880b(24);

    /* renamed from: s */
    public static final int f9131s = C4843g2.m8880b(4);

    /* renamed from: a */
    public PopupWindow f9132a;

    /* renamed from: b */
    public Activity f9133b;

    /* renamed from: c */
    public final Handler f9134c = new Handler();

    /* renamed from: d */
    public int f9135d;

    /* renamed from: e */
    public int f9136e;

    /* renamed from: f */
    public double f9137f;

    /* renamed from: g */
    public boolean f9138g;

    /* renamed from: h */
    public boolean f9139h;

    /* renamed from: i */
    public boolean f9140i;
    @NonNull

    /* renamed from: j */
    public C4968s4.C4975g f9141j;

    /* renamed from: k */
    public WebView f9142k;

    /* renamed from: l */
    public RelativeLayout f9143l;

    /* renamed from: m */
    public C4899m f9144m;

    /* renamed from: n */
    public C4780c f9145n;

    /* renamed from: o */
    public Runnable f9146o;

    /* renamed from: b.o.a0$a */
    public class C4778a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ Activity f9147g;

        public C4778a(Activity activity) {
            this.f9147g = activity;
        }

        public void run() {
            C4777a0.this.mo16499d(this.f9147g);
        }
    }

    /* renamed from: b.o.a0$b */
    public class C4779b implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C4968s4.C4974f f9149g;

        public C4779b(C4968s4.C4974f fVar) {
            this.f9149g = fVar;
        }

        public void run() {
            RelativeLayout relativeLayout;
            C4777a0 a0Var = C4777a0.this;
            if (!a0Var.f9138g || (relativeLayout = a0Var.f9143l) == null) {
                C4777a0.m8758a(a0Var);
                C4968s4.C4974f fVar = this.f9149g;
                if (fVar != null) {
                    fVar.mo16704a();
                    return;
                }
                return;
            }
            C4968s4.C4974f fVar2 = this.f9149g;
            Objects.requireNonNull(a0Var);
            a0Var.mo16497b(relativeLayout, 400, C4777a0.f9129q, C4777a0.f9128p, new C4786b0(a0Var, fVar2)).start();
        }
    }

    /* renamed from: b.o.a0$c */
    public interface C4780c {
    }

    public C4777a0(@NonNull WebView webView, @NonNull C4968s4.C4975g gVar, int i, double d) {
        boolean z = false;
        this.f9139h = false;
        this.f9140i = false;
        this.f9142k = webView;
        this.f9141j = gVar;
        this.f9136e = i;
        this.f9135d = -1;
        this.f9137f = Double.isNaN(d) ? ShadowDrawableWrapper.COS_45 : d;
        int ordinal = gVar.ordinal();
        this.f9138g = !((ordinal == 0 || ordinal == 1) ? true : z);
    }

    /* renamed from: a */
    public static void m8758a(C4777a0 a0Var) {
        a0Var.mo16503h();
        C4780c cVar = a0Var.f9145n;
        if (cVar != null) {
            C5004v4 v4Var = (C5004v4) cVar;
            C4857i2.m8948p().mo16733p(v4Var.f9674a.f9602d);
            v4Var.f9674a.mo16702h();
        }
    }

    /* renamed from: b */
    public final ValueAnimator mo16497b(View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration((long) i);
        valueAnimator.setIntValues(new int[]{i2, i3});
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new C4966s2(view));
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p273o.C4899m.C4901b mo16498c(int r6, p005b.p273o.C4968s4.C4975g r7) {
        /*
            r5 = this;
            b.o.m$b r0 = new b.o.m$b
            r0.<init>()
            int r1 = f9130r
            r0.f9460d = r1
            r0.f9458b = r1
            r0.f9461e = r6
            r5.mo16502g()
            int r2 = r7.ordinal()
            r3 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r3) goto L_0x0039
            r4 = 2
            if (r2 == r4) goto L_0x0028
            r6 = 3
            if (r2 == r6) goto L_0x0020
            goto L_0x0049
        L_0x0020:
            int r6 = r5.mo16502g()
            int r1 = r1 * r4
            int r6 = r6 - r1
            r0.f9461e = r6
        L_0x0028:
            int r1 = r5.mo16502g()
            int r1 = r1 / r4
            int r6 = r6 / r4
            int r1 = r1 - r6
            int r6 = f9131s
            int r6 = r6 + r1
            r0.f9459c = r6
            r0.f9458b = r1
            r0.f9457a = r1
            goto L_0x0049
        L_0x0039:
            int r2 = r5.mo16502g()
            int r2 = r2 - r6
            r0.f9457a = r2
            int r6 = f9131s
            int r1 = r1 + r6
            goto L_0x0047
        L_0x0044:
            int r6 = f9131s
            int r1 = r1 - r6
        L_0x0047:
            r0.f9459c = r1
        L_0x0049:
            b.o.s4$g r6 = p005b.p273o.C4968s4.C4975g.TOP_BANNER
            if (r7 != r6) goto L_0x004e
            r3 = 0
        L_0x004e:
            r0.f9462f = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4777a0.mo16498c(int, b.o.s4$g):b.o.m$b");
    }

    /* renamed from: d */
    public final void mo16499d(Activity activity) {
        LinearLayout.LayoutParams layoutParams;
        int i;
        if (!C4843g2.m8882d(activity) || this.f9143l != null) {
            new Handler().postDelayed(new C4778a(activity), 200);
            return;
        }
        this.f9133b = activity;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, this.f9136e);
        layoutParams2.addRule(13);
        if (this.f9138g) {
            layoutParams = new LinearLayout.LayoutParams(this.f9135d, -1);
            int ordinal = this.f9141j.ordinal();
            if (ordinal == 0) {
                i = 49;
            } else if (ordinal == 1) {
                i = 81;
            } else if (ordinal == 2 || ordinal == 3) {
                i = 17;
            }
            layoutParams.gravity = i;
        } else {
            layoutParams = null;
        }
        C4968s4.C4975g gVar = this.f9141j;
        C4835f2.m8871u(new C5020x(this, layoutParams2, layoutParams, mo16498c(this.f9136e, gVar), gVar));
    }

    /* renamed from: e */
    public void mo16500e(@Nullable C4968s4.C4974f fVar) {
        C4899m mVar = this.f9144m;
        if (mVar == null) {
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
            this.f9143l = null;
            this.f9144m = null;
            this.f9142k = null;
            if (fVar != null) {
                ((C4968s4.C4972d) fVar).mo16704a();
                return;
            }
            return;
        }
        mVar.f9455i = true;
        mVar.f9454h.smoothSlideViewTo(mVar, mVar.getLeft(), mVar.f9456j.f9464h);
        ViewCompat.postInvalidateOnAnimation(mVar);
        mo16501f(fVar);
    }

    /* renamed from: f */
    public final void mo16501f(C4968s4.C4974f fVar) {
        new Handler(Looper.getMainLooper()).postDelayed(new C4779b(fVar), (long) 600);
    }

    /* renamed from: g */
    public final int mo16502g() {
        return C4843g2.m8881c(this.f9133b);
    }

    /* renamed from: h */
    public void mo16503h() {
        C4857i2.m8933a(C4857i2.C4868k.DEBUG, "InAppMessageView removing views", (Throwable) null);
        Runnable runnable = this.f9146o;
        if (runnable != null) {
            this.f9134c.removeCallbacks(runnable);
            this.f9146o = null;
        }
        C4899m mVar = this.f9144m;
        if (mVar != null) {
            mVar.removeAllViews();
        }
        PopupWindow popupWindow = this.f9132a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f9143l = null;
        this.f9144m = null;
        this.f9142k = null;
    }
}
