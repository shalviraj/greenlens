package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, mo24462d2 = {"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Ld/r;", "onTransitionEnd", "(Landroid/transition/Transition;)V", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    public final /* synthetic */ C6862l $onCancel;
    public final /* synthetic */ C6862l $onEnd;
    public final /* synthetic */ C6862l $onPause;
    public final /* synthetic */ C6862l $onResume;
    public final /* synthetic */ C6862l $onStart;

    public TransitionKt$addListener$listener$1(C6862l lVar, C6862l lVar2, C6862l lVar3, C6862l lVar4, C6862l lVar5) {
        this.$onEnd = lVar;
        this.$onResume = lVar2;
        this.$onPause = lVar3;
        this.$onCancel = lVar4;
        this.$onStart = lVar5;
    }

    public void onTransitionCancel(Transition transition) {
        C6888i.m12439f(transition, "transition");
        this.$onCancel.invoke(transition);
    }

    public void onTransitionEnd(Transition transition) {
        C6888i.m12439f(transition, "transition");
        this.$onEnd.invoke(transition);
    }

    public void onTransitionPause(Transition transition) {
        C6888i.m12439f(transition, "transition");
        this.$onPause.invoke(transition);
    }

    public void onTransitionResume(Transition transition) {
        C6888i.m12439f(transition, "transition");
        this.$onResume.invoke(transition);
    }

    public void onTransitionStart(Transition transition) {
        C6888i.m12439f(transition, "transition");
        this.$onStart.invoke(transition);
    }
}
