package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a*\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0007\u0010\u0006\u001a*\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\b\u0010\u0006\u001a*\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\t\u0010\u0006\u001a*\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\r\u001a\u00020\n*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\r\u0010\f\u001al\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0006\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a@\u0010\u0016\u001a\u00020\n*\u00020\u00002\u0014\b\u0006\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, mo24462d2 = {"Landroid/animation/Animator;", "Lkotlin/Function1;", "Ld/r;", "action", "Landroid/animation/Animator$AnimatorListener;", "doOnEnd", "(Landroid/animation/Animator;Ld/x/b/l;)Landroid/animation/Animator$AnimatorListener;", "doOnStart", "doOnCancel", "doOnRepeat", "Landroid/animation/Animator$AnimatorPauseListener;", "doOnResume", "(Landroid/animation/Animator;Ld/x/b/l;)Landroid/animation/Animator$AnimatorPauseListener;", "doOnPause", "onEnd", "onStart", "onCancel", "onRepeat", "addListener", "(Landroid/animation/Animator;Ld/x/b/l;Ld/x/b/l;Ld/x/b/l;Ld/x/b/l;)Landroid/animation/Animator$AnimatorListener;", "onResume", "onPause", "addPauseListener", "(Landroid/animation/Animator;Ld/x/b/l;Ld/x/b/l;)Landroid/animation/Animator$AnimatorPauseListener;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class AnimatorKt {
    public static final Animator.AnimatorListener addListener(Animator animator, C6862l<? super Animator, C6777r> lVar, C6862l<? super Animator, C6777r> lVar2, C6862l<? super Animator, C6777r> lVar3, C6862l<? super Animator, C6777r> lVar4) {
        C6888i.m12439f(animator, "$this$addListener");
        C6888i.m12439f(lVar, "onEnd");
        C6888i.m12439f(lVar2, "onStart");
        C6888i.m12439f(lVar3, "onCancel");
        C6888i.m12439f(lVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, C6862l lVar, C6862l lVar2, C6862l lVar3, C6862l lVar4, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = AnimatorKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            lVar2 = AnimatorKt$addListener$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            lVar3 = AnimatorKt$addListener$3.INSTANCE;
        }
        if ((i & 8) != 0) {
            lVar4 = AnimatorKt$addListener$4.INSTANCE;
        }
        C6888i.m12439f(animator, "$this$addListener");
        C6888i.m12439f(lVar, "onEnd");
        C6888i.m12439f(lVar2, "onStart");
        C6888i.m12439f(lVar3, "onCancel");
        C6888i.m12439f(lVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, C6862l<? super Animator, C6777r> lVar, C6862l<? super Animator, C6777r> lVar2) {
        C6888i.m12439f(animator, "$this$addPauseListener");
        C6888i.m12439f(lVar, "onResume");
        C6888i.m12439f(lVar2, "onPause");
        AnimatorKt$addPauseListener$listener$1 animatorKt$addPauseListener$listener$1 = new AnimatorKt$addPauseListener$listener$1(lVar2, lVar);
        animator.addPauseListener(animatorKt$addPauseListener$listener$1);
        return animatorKt$addPauseListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, C6862l lVar, C6862l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = AnimatorKt$addPauseListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            lVar2 = AnimatorKt$addPauseListener$2.INSTANCE;
        }
        C6888i.m12439f(animator, "$this$addPauseListener");
        C6888i.m12439f(lVar, "onResume");
        C6888i.m12439f(lVar2, "onPause");
        AnimatorKt$addPauseListener$listener$1 animatorKt$addPauseListener$listener$1 = new AnimatorKt$addPauseListener$listener$1(lVar2, lVar);
        animator.addPauseListener(animatorKt$addPauseListener$listener$1);
        return animatorKt$addPauseListener$listener$1;
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, C6862l<? super Animator, C6777r> lVar) {
        C6888i.m12439f(animator, "$this$doOnCancel");
        C6888i.m12439f(lVar, "action");
        AnimatorKt$doOnCancel$$inlined$addListener$1 animatorKt$doOnCancel$$inlined$addListener$1 = new AnimatorKt$doOnCancel$$inlined$addListener$1(lVar);
        animator.addListener(animatorKt$doOnCancel$$inlined$addListener$1);
        return animatorKt$doOnCancel$$inlined$addListener$1;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, C6862l<? super Animator, C6777r> lVar) {
        C6888i.m12439f(animator, "$this$doOnEnd");
        C6888i.m12439f(lVar, "action");
        AnimatorKt$doOnEnd$$inlined$addListener$1 animatorKt$doOnEnd$$inlined$addListener$1 = new AnimatorKt$doOnEnd$$inlined$addListener$1(lVar);
        animator.addListener(animatorKt$doOnEnd$$inlined$addListener$1);
        return animatorKt$doOnEnd$$inlined$addListener$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, C6862l<? super Animator, C6777r> lVar) {
        C6888i.m12439f(animator, "$this$doOnPause");
        C6888i.m12439f(lVar, "action");
        AnimatorKt$doOnPause$$inlined$addPauseListener$1 animatorKt$doOnPause$$inlined$addPauseListener$1 = new AnimatorKt$doOnPause$$inlined$addPauseListener$1(lVar);
        animator.addPauseListener(animatorKt$doOnPause$$inlined$addPauseListener$1);
        return animatorKt$doOnPause$$inlined$addPauseListener$1;
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, C6862l<? super Animator, C6777r> lVar) {
        C6888i.m12439f(animator, "$this$doOnRepeat");
        C6888i.m12439f(lVar, "action");
        AnimatorKt$doOnRepeat$$inlined$addListener$1 animatorKt$doOnRepeat$$inlined$addListener$1 = new AnimatorKt$doOnRepeat$$inlined$addListener$1(lVar);
        animator.addListener(animatorKt$doOnRepeat$$inlined$addListener$1);
        return animatorKt$doOnRepeat$$inlined$addListener$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, C6862l<? super Animator, C6777r> lVar) {
        C6888i.m12439f(animator, "$this$doOnResume");
        C6888i.m12439f(lVar, "action");
        AnimatorKt$doOnResume$$inlined$addPauseListener$1 animatorKt$doOnResume$$inlined$addPauseListener$1 = new AnimatorKt$doOnResume$$inlined$addPauseListener$1(lVar);
        animator.addPauseListener(animatorKt$doOnResume$$inlined$addPauseListener$1);
        return animatorKt$doOnResume$$inlined$addPauseListener$1;
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, C6862l<? super Animator, C6777r> lVar) {
        C6888i.m12439f(animator, "$this$doOnStart");
        C6888i.m12439f(lVar, "action");
        AnimatorKt$doOnStart$$inlined$addListener$1 animatorKt$doOnStart$$inlined$addListener$1 = new AnimatorKt$doOnStart$$inlined$addListener$1(lVar);
        animator.addListener(animatorKt$doOnStart$$inlined$addListener$1);
        return animatorKt$doOnStart$$inlined$addListener$1;
    }
}
