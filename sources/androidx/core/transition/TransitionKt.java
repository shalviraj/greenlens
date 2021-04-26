package androidx.core.transition;

import android.transition.Transition;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a*\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0007\u0010\u0006\u001a*\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\b\u0010\u0006\u001a*\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\t\u0010\u0006\u001a*\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\n\u0010\u0006\u001a\u0001\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0006\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, mo24462d2 = {"Landroid/transition/Transition;", "Lkotlin/Function1;", "Ld/r;", "action", "Landroid/transition/Transition$TransitionListener;", "doOnEnd", "(Landroid/transition/Transition;Ld/x/b/l;)Landroid/transition/Transition$TransitionListener;", "doOnStart", "doOnCancel", "doOnResume", "doOnPause", "onEnd", "onStart", "onCancel", "onResume", "onPause", "addListener", "(Landroid/transition/Transition;Ld/x/b/l;Ld/x/b/l;Ld/x/b/l;Ld/x/b/l;Ld/x/b/l;)Landroid/transition/Transition$TransitionListener;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class TransitionKt {
    @RequiresApi(19)
    public static final Transition.TransitionListener addListener(Transition transition, C6862l<? super Transition, C6777r> lVar, C6862l<? super Transition, C6777r> lVar2, C6862l<? super Transition, C6777r> lVar3, C6862l<? super Transition, C6777r> lVar4, C6862l<? super Transition, C6777r> lVar5) {
        C6888i.m12439f(transition, "$this$addListener");
        C6888i.m12439f(lVar, "onEnd");
        C6888i.m12439f(lVar2, "onStart");
        C6888i.m12439f(lVar3, "onCancel");
        C6888i.m12439f(lVar4, "onResume");
        C6888i.m12439f(lVar5, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar3, lVar2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, C6862l lVar, C6862l lVar2, C6862l lVar3, C6862l lVar4, C6862l lVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = TransitionKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            lVar2 = TransitionKt$addListener$2.INSTANCE;
        }
        C6862l lVar6 = lVar2;
        if ((i & 4) != 0) {
            lVar3 = TransitionKt$addListener$3.INSTANCE;
        }
        C6862l lVar7 = lVar3;
        if ((i & 8) != 0) {
            lVar4 = TransitionKt$addListener$4.INSTANCE;
        }
        if ((i & 16) != 0) {
            lVar5 = TransitionKt$addListener$5.INSTANCE;
        }
        C6888i.m12439f(transition, "$this$addListener");
        C6888i.m12439f(lVar, "onEnd");
        C6888i.m12439f(lVar6, "onStart");
        C6888i.m12439f(lVar7, "onCancel");
        C6888i.m12439f(lVar4, "onResume");
        C6888i.m12439f(lVar5, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar7, lVar6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnCancel(Transition transition, C6862l<? super Transition, C6777r> lVar) {
        C6888i.m12439f(transition, "$this$doOnCancel");
        C6888i.m12439f(lVar, "action");
        TransitionKt$doOnCancel$$inlined$addListener$1 transitionKt$doOnCancel$$inlined$addListener$1 = new TransitionKt$doOnCancel$$inlined$addListener$1(lVar);
        transition.addListener(transitionKt$doOnCancel$$inlined$addListener$1);
        return transitionKt$doOnCancel$$inlined$addListener$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnEnd(Transition transition, C6862l<? super Transition, C6777r> lVar) {
        C6888i.m12439f(transition, "$this$doOnEnd");
        C6888i.m12439f(lVar, "action");
        TransitionKt$doOnEnd$$inlined$addListener$1 transitionKt$doOnEnd$$inlined$addListener$1 = new TransitionKt$doOnEnd$$inlined$addListener$1(lVar);
        transition.addListener(transitionKt$doOnEnd$$inlined$addListener$1);
        return transitionKt$doOnEnd$$inlined$addListener$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnPause(Transition transition, C6862l<? super Transition, C6777r> lVar) {
        C6888i.m12439f(transition, "$this$doOnPause");
        C6888i.m12439f(lVar, "action");
        TransitionKt$doOnPause$$inlined$addListener$1 transitionKt$doOnPause$$inlined$addListener$1 = new TransitionKt$doOnPause$$inlined$addListener$1(lVar);
        transition.addListener(transitionKt$doOnPause$$inlined$addListener$1);
        return transitionKt$doOnPause$$inlined$addListener$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnResume(Transition transition, C6862l<? super Transition, C6777r> lVar) {
        C6888i.m12439f(transition, "$this$doOnResume");
        C6888i.m12439f(lVar, "action");
        TransitionKt$doOnResume$$inlined$addListener$1 transitionKt$doOnResume$$inlined$addListener$1 = new TransitionKt$doOnResume$$inlined$addListener$1(lVar);
        transition.addListener(transitionKt$doOnResume$$inlined$addListener$1);
        return transitionKt$doOnResume$$inlined$addListener$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnStart(Transition transition, C6862l<? super Transition, C6777r> lVar) {
        C6888i.m12439f(transition, "$this$doOnStart");
        C6888i.m12439f(lVar, "action");
        TransitionKt$doOnStart$$inlined$addListener$1 transitionKt$doOnStart$$inlined$addListener$1 = new TransitionKt$doOnStart$$inlined$addListener$1(lVar);
        transition.addListener(transitionKt$doOnStart$$inlined$addListener$1);
        return transitionKt$doOnStart$$inlined$addListener$1;
    }
}
