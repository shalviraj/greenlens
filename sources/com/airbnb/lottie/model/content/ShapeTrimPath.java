package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.TrimPathContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import p005b.p035e.p036a.p037a.C0843a;

public class ShapeTrimPath implements ContentModel {
    private final AnimatableFloatValue end;
    private final boolean hidden;
    private final String name;
    private final AnimatableFloatValue offset;
    private final AnimatableFloatValue start;
    private final Type type;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException(C0843a.m444e("Unknown trim path type ", i));
        }
    }

    public ShapeTrimPath(String str, Type type2, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, boolean z) {
        this.name = str;
        this.type = type2;
        this.start = animatableFloatValue;
        this.end = animatableFloatValue2;
        this.offset = animatableFloatValue3;
        this.hidden = z;
    }

    public AnimatableFloatValue getEnd() {
        return this.end;
    }

    public String getName() {
        return this.name;
    }

    public AnimatableFloatValue getOffset() {
        return this.offset;
    }

    public AnimatableFloatValue getStart() {
        return this.start;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new TrimPathContent(baseLayer, this);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Trim Path: {start: ");
        u.append(this.start);
        u.append(", end: ");
        u.append(this.end);
        u.append(", offset: ");
        u.append(this.offset);
        u.append("}");
        return u.toString();
    }
}
