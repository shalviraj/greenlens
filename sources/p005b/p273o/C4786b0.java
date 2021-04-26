package p005b.p273o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p005b.p273o.C4968s4;

/* renamed from: b.o.b0 */
public class C4786b0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C4968s4.C4974f f9161a;

    /* renamed from: b */
    public final /* synthetic */ C4777a0 f9162b;

    public C4786b0(C4777a0 a0Var, C4968s4.C4974f fVar) {
        this.f9162b = a0Var;
        this.f9161a = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        C4777a0.m8758a(this.f9162b);
        C4968s4.C4974f fVar = this.f9161a;
        if (fVar != null) {
            fVar.mo16704a();
        }
    }
}
