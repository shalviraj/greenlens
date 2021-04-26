package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import java.util.Locale;
import p005b.p035e.p036a.p037a.C0843a;

public class Layer {
    private final LottieComposition composition;
    private final boolean hidden;
    private final List<Keyframe<Float>> inOutKeyframes;
    private final long layerId;
    private final String layerName;
    private final LayerType layerType;
    private final List<Mask> masks;
    private final MatteType matteType;
    private final long parentId;
    private final int preCompHeight;
    private final int preCompWidth;
    @Nullable
    private final String refId;
    private final List<ContentModel> shapes;
    private final int solidColor;
    private final int solidHeight;
    private final int solidWidth;
    private final float startFrame;
    @Nullable
    private final AnimatableTextFrame text;
    @Nullable
    private final AnimatableTextProperties textProperties;
    @Nullable
    private final AnimatableFloatValue timeRemapping;
    private final float timeStretch;
    private final AnimatableTransform transform;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<ContentModel> list, LottieComposition lottieComposition, String str, long j, LayerType layerType2, long j2, @Nullable String str2, List<Mask> list2, AnimatableTransform animatableTransform, int i, int i2, int i3, float f, float f2, int i4, int i5, @Nullable AnimatableTextFrame animatableTextFrame, @Nullable AnimatableTextProperties animatableTextProperties, List<Keyframe<Float>> list3, MatteType matteType2, @Nullable AnimatableFloatValue animatableFloatValue, boolean z) {
        this.shapes = list;
        this.composition = lottieComposition;
        this.layerName = str;
        this.layerId = j;
        this.layerType = layerType2;
        this.parentId = j2;
        this.refId = str2;
        this.masks = list2;
        this.transform = animatableTransform;
        this.solidWidth = i;
        this.solidHeight = i2;
        this.solidColor = i3;
        this.timeStretch = f;
        this.startFrame = f2;
        this.preCompWidth = i4;
        this.preCompHeight = i5;
        this.text = animatableTextFrame;
        this.textProperties = animatableTextProperties;
        this.inOutKeyframes = list3;
        this.matteType = matteType2;
        this.timeRemapping = animatableFloatValue;
        this.hidden = z;
    }

    public LottieComposition getComposition() {
        return this.composition;
    }

    public long getId() {
        return this.layerId;
    }

    public List<Keyframe<Float>> getInOutKeyframes() {
        return this.inOutKeyframes;
    }

    public LayerType getLayerType() {
        return this.layerType;
    }

    public List<Mask> getMasks() {
        return this.masks;
    }

    public MatteType getMatteType() {
        return this.matteType;
    }

    public String getName() {
        return this.layerName;
    }

    public long getParentId() {
        return this.parentId;
    }

    public int getPreCompHeight() {
        return this.preCompHeight;
    }

    public int getPreCompWidth() {
        return this.preCompWidth;
    }

    @Nullable
    public String getRefId() {
        return this.refId;
    }

    public List<ContentModel> getShapes() {
        return this.shapes;
    }

    public int getSolidColor() {
        return this.solidColor;
    }

    public int getSolidHeight() {
        return this.solidHeight;
    }

    public int getSolidWidth() {
        return this.solidWidth;
    }

    public float getStartProgress() {
        return this.startFrame / this.composition.getDurationFrames();
    }

    @Nullable
    public AnimatableTextFrame getText() {
        return this.text;
    }

    @Nullable
    public AnimatableTextProperties getTextProperties() {
        return this.textProperties;
    }

    @Nullable
    public AnimatableFloatValue getTimeRemapping() {
        return this.timeRemapping;
    }

    public float getTimeStretch() {
        return this.timeStretch;
    }

    public AnimatableTransform getTransform() {
        return this.transform;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder u = C0843a.m460u(str);
        u.append(getName());
        u.append("\n");
        Layer layerModelForId = this.composition.layerModelForId(getParentId());
        if (layerModelForId != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                u.append(str2);
                u.append(layerModelForId.getName());
                layerModelForId = this.composition.layerModelForId(layerModelForId.getParentId());
                if (layerModelForId == null) {
                    break;
                }
                str2 = "->";
            }
            u.append(str);
            u.append("\n");
        }
        if (!getMasks().isEmpty()) {
            u.append(str);
            u.append("\tMasks: ");
            u.append(getMasks().size());
            u.append("\n");
        }
        if (!(getSolidWidth() == 0 || getSolidHeight() == 0)) {
            u.append(str);
            u.append("\tBackground: ");
            u.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(getSolidWidth()), Integer.valueOf(getSolidHeight()), Integer.valueOf(getSolidColor())}));
        }
        if (!this.shapes.isEmpty()) {
            u.append(str);
            u.append("\tShapes:\n");
            for (ContentModel next : this.shapes) {
                u.append(str);
                u.append("\t\t");
                u.append(next);
                u.append("\n");
            }
        }
        return u.toString();
    }
}
