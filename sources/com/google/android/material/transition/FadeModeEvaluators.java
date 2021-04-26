package com.google.android.material.transition;

import p005b.p035e.p036a.p037a.C0843a;

public class FadeModeEvaluators {
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };

    /* renamed from: IN */
    private static final FadeModeEvaluator f11391IN = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), 255);
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            float a = C0843a.m440a(f3, f2, 0.35f, f2);
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, a, f), TransitionUtils.lerp(0, 255, a, f3, f));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i, boolean z) {
        if (i == 0) {
            return z ? f11391IN : OUT;
        }
        if (i == 1) {
            return z ? OUT : f11391IN;
        }
        if (i == 2) {
            return CROSS;
        }
        if (i == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException(C0843a.m444e("Invalid fade mode: ", i));
    }
}
