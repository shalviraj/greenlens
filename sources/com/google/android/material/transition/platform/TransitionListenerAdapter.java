package com.google.android.material.transition.platform;

import android.transition.Transition;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public abstract class TransitionListenerAdapter implements Transition.TransitionListener {
    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }
}
