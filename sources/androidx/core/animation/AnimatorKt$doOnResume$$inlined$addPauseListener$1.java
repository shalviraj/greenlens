package androidx.core.animation;

import android.animation.Animator;
import kotlin.Metadata;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b¸\u0006\u0000"}, mo24462d2 = {"androidx/core/animation/AnimatorKt$addPauseListener$listener$1", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Ld/r;", "onAnimationPause", "(Landroid/animation/Animator;)V", "onAnimationResume", "core-ktx_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class AnimatorKt$doOnResume$$inlined$addPauseListener$1 implements Animator.AnimatorPauseListener {
    public final /* synthetic */ C6862l $onResume;

    public AnimatorKt$doOnResume$$inlined$addPauseListener$1(C6862l lVar) {
        this.$onResume = lVar;
    }

    public void onAnimationPause(Animator animator) {
        C6888i.m12439f(animator, "animator");
    }

    public void onAnimationResume(Animator animator) {
        C6888i.m12439f(animator, "animator");
        this.$onResume.invoke(animator);
    }
}
