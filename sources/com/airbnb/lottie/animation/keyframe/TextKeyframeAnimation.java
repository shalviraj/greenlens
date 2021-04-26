package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

public class TextKeyframeAnimation extends KeyframeAnimation<DocumentData> {
    public TextKeyframeAnimation(List<Keyframe<DocumentData>> list) {
        super(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = r2.endValue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.airbnb.lottie.model.DocumentData getValue(com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.DocumentData> r2, float r3) {
        /*
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x000e
            T r3 = r2.endValue
            if (r3 != 0) goto L_0x000b
            goto L_0x000e
        L_0x000b:
            com.airbnb.lottie.model.DocumentData r3 = (com.airbnb.lottie.model.DocumentData) r3
            return r3
        L_0x000e:
            T r2 = r2.startValue
            com.airbnb.lottie.model.DocumentData r2 = (com.airbnb.lottie.model.DocumentData) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation.getValue(com.airbnb.lottie.value.Keyframe, float):com.airbnb.lottie.model.DocumentData");
    }
}
