package com.appfoundry.previewer.custom;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.core.view.ViewCompat;
import androidx.viewpager2.widget.ViewPager2;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.segment.analytics.integrations.BasePayload;
import java.util.Objects;
import kotlin.Metadata;
import p005b.p006a.p007a.C0663d;
import p005b.p006a.p007a.p009b.C0630g;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010 \u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0017R\u0018\u0010+\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0017R\u0016\u0010/\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0017R\u0018\u00101\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010\"R\u0018\u00103\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010&R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u0010\u0017R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010\"R\u0016\u0010=\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010\u0017¨\u0006B"}, mo24462d2 = {"Lcom/appfoundry/previewer/custom/DotIndicator;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/animation/Animator;", "b", "(Landroid/content/Context;)Landroid/animation/Animator;", "", "orientation", "backgroundDrawableId", "animator", "Ld/r;", "a", "(IILandroid/animation/Animator;)V", "", "dpValue", "c", "(F)I", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "x", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "internalPageChangeCallback", "l", "I", "animatorReverseResId", "i", "indicatorWidth", "m", "indicatorBackgroundResId", "v", "lastPosition", "w", "itemNumber", "p", "Landroid/animation/Animator;", "animatorIn", "Landroid/view/View;", "s", "Landroid/view/View;", "currentIndicator", "u", "indicatorTint", "r", "immediateAnimatorIn", "j", "indicatorHeight", "n", "indicatorUnselectedBackgroundResId", "q", "immediateAnimatorOut", "t", "selectedIndicator", "h", "indicatorMargin", "Landroidx/viewpager2/widget/ViewPager2;", "g", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "o", "animatorOut", "k", "animatorResId", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class DotIndicator extends LinearLayout {

    /* renamed from: g */
    public ViewPager2 f10858g;

    /* renamed from: h */
    public int f10859h = -1;

    /* renamed from: i */
    public int f10860i = -1;

    /* renamed from: j */
    public int f10861j = -1;

    /* renamed from: k */
    public int f10862k;

    /* renamed from: l */
    public int f10863l;

    /* renamed from: m */
    public int f10864m;

    /* renamed from: n */
    public int f10865n;

    /* renamed from: o */
    public Animator f10866o;

    /* renamed from: p */
    public Animator f10867p;

    /* renamed from: q */
    public Animator f10868q;

    /* renamed from: r */
    public Animator f10869r;

    /* renamed from: s */
    public View f10870s;

    /* renamed from: t */
    public View f10871t;

    /* renamed from: u */
    public int f10872u;

    /* renamed from: v */
    public int f10873v;

    /* renamed from: w */
    public int f10874w;

    /* renamed from: x */
    public final ViewPager2.OnPageChangeCallback f10875x;

    /* renamed from: com.appfoundry.previewer.custom.DotIndicator$a */
    public final class C5450a implements Interpolator {
        public C5450a(DotIndicator dotIndicator) {
        }

        public float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DotIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6888i.m12438e(context, BasePayload.CONTEXT_KEY);
        int i = R.animator.scale_alpha;
        this.f10862k = R.animator.scale_alpha;
        int i2 = R.drawable.white_dot;
        this.f10864m = R.drawable.white_dot;
        this.f10865n = R.drawable.white_dot;
        this.f10872u = ViewCompat.MEASURED_STATE_MASK;
        this.f10873v = -1;
        this.f10875x = new C0630g(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0663d.f354a);
            C6888i.m12437d(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.DotIndicator)");
            this.f10860i = obtainStyledAttributes.getDimensionPixelSize(8, -1);
            this.f10861j = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            this.f10859h = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            int i3 = 0;
            this.f10862k = obtainStyledAttributes.getResourceId(0, R.animator.scale_alpha);
            this.f10863l = obtainStyledAttributes.getResourceId(1, 0);
            int resourceId = obtainStyledAttributes.getResourceId(2, R.drawable.white_dot);
            this.f10864m = resourceId;
            this.f10865n = obtainStyledAttributes.getResourceId(3, resourceId);
            setOrientation(obtainStyledAttributes.getInt(7, -1) == 1 ? 1 : i3);
            int i4 = obtainStyledAttributes.getInt(4, -1);
            setGravity(i4 < 0 ? 17 : i4);
            obtainStyledAttributes.recycle();
        }
        int i5 = this.f10860i;
        this.f10860i = i5 < 0 ? mo18473c((float) 5) : i5;
        int i6 = this.f10861j;
        this.f10861j = i6 < 0 ? mo18473c((float) 5) : i6;
        int i7 = this.f10859h;
        this.f10859h = i7 < 0 ? mo18473c((float) 5) : i7;
        int i8 = this.f10862k;
        i = i8 != 0 ? i8 : i;
        this.f10862k = i;
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
        C6888i.m12437d(loadAnimator, "AnimatorInflater.loadAni…r(context, animatorResId)");
        this.f10866o = loadAnimator;
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, this.f10862k);
        C6888i.m12437d(loadAnimator2, "AnimatorInflater.loadAni…r(context, animatorResId)");
        this.f10868q = loadAnimator2;
        loadAnimator2.setDuration(0);
        this.f10867p = mo18472b(context);
        Animator b = mo18472b(context);
        this.f10869r = b;
        b.setDuration(0);
        int i9 = this.f10864m;
        i2 = i9 != 0 ? i9 : i2;
        this.f10864m = i2;
        int i10 = this.f10865n;
        this.f10865n = i10 != 0 ? i10 : i2;
    }

    /* renamed from: a */
    public final void mo18471a(int i, @DrawableRes int i2, Animator animator) {
        if (animator != null && animator.isRunning()) {
            animator.end();
            animator.cancel();
        }
        View view = new View(getContext());
        view.setBackgroundResource(i2);
        addView(view, this.f10860i, this.f10861j);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (i == 0) {
            int i3 = this.f10859h;
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i3;
        } else {
            int i4 = this.f10859h;
            layoutParams2.topMargin = i4;
            layoutParams2.bottomMargin = i4;
        }
        view.setLayoutParams(layoutParams2);
        if (animator != null) {
            animator.setTarget(view);
        }
        if (animator != null) {
            animator.start();
        }
    }

    /* renamed from: b */
    public final Animator mo18472b(Context context) {
        int i = this.f10863l;
        if (i == 0) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, this.f10862k);
            C6888i.m12437d(loadAnimator, "AnimatorInflater.loadAni…r(context, animatorResId)");
            loadAnimator.setInterpolator(new C5450a(this));
            return loadAnimator;
        }
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, i);
        C6888i.m12437d(loadAnimator2, "AnimatorInflater.loadAni…xt, animatorReverseResId)");
        return loadAnimator2;
    }

    /* renamed from: c */
    public final int mo18473c(float f) {
        Resources resources = getResources();
        C6888i.m12437d(resources, "resources");
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }
}
