package androidx.core.animation;

import android.animation.Animator;
import kotlin.Metadata;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, mo24462d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Ld/r;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    public final /* synthetic */ C6862l $onCancel;
    public final /* synthetic */ C6862l $onEnd;
    public final /* synthetic */ C6862l $onRepeat;
    public final /* synthetic */ C6862l $onStart;

    public AnimatorKt$addListener$listener$1(C6862l lVar, C6862l lVar2, C6862l lVar3, C6862l lVar4) {
        this.$onRepeat = lVar;
        this.$onEnd = lVar2;
        this.$onCancel = lVar3;
        this.$onStart = lVar4;
    }

    public void onAnimationCancel(Animator animator) {
        C6888i.m12439f(animator, "animator");
        this.$onCancel.invoke(animator);
    }

    public void onAnimationEnd(Animator animator) {
        C6888i.m12439f(animator, "animator");
        this.$onEnd.invoke(animator);
    }

    public void onAnimationRepeat(Animator animator) {
        C6888i.m12439f(animator, "animator");
        this.$onRepeat.invoke(animator);
    }

    public void onAnimationStart(Animator animator) {
        C6888i.m12439f(animator, "animator");
        this.$onStart.invoke(animator);
    }
}
