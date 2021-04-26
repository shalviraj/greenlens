package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C5312L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

public class CompositionLayer extends BaseLayer {
    @Nullable
    private Boolean hasMasks;
    @Nullable
    private Boolean hasMatte;
    private Paint layerPaint = new Paint();
    private final List<BaseLayer> layers = new ArrayList();
    private final RectF newClipRect = new RectF();
    private final RectF rect = new RectF();
    @Nullable
    private BaseKeyframeAnimation<Float, Float> timeRemapping;

    /* renamed from: com.airbnb.lottie.model.layer.CompositionLayer$1 */
    public static /* synthetic */ class C53671 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
        static {
            /*
                com.airbnb.lottie.model.layer.Layer.MatteType.values()
                r0 = 6
                int[] r0 = new int[r0]
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType = r0
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.ADD     // Catch:{ NoSuchFieldError -> 0x000d }
                r1 = 1
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.INVERT     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1 = 2
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.CompositionLayer.C53671.<clinit>():void");
        }
    }

    public CompositionLayer(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, LottieComposition lottieComposition) {
        super(lottieDrawable, layer);
        int i;
        BaseLayer baseLayer;
        AnimatableFloatValue timeRemapping2 = layer.getTimeRemapping();
        if (timeRemapping2 != null) {
            BaseKeyframeAnimation<Float, Float> createAnimation = timeRemapping2.createAnimation();
            this.timeRemapping = createAnimation;
            addAnimation(createAnimation);
            this.timeRemapping.addUpdateListener(this);
        } else {
            this.timeRemapping = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(lottieComposition.getLayers().size());
        int size = list.size() - 1;
        BaseLayer baseLayer2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            BaseLayer forModel = BaseLayer.forModel(layer2, lottieDrawable, lottieComposition);
            if (forModel != null) {
                longSparseArray.put(forModel.getLayerModel().getId(), forModel);
                if (baseLayer2 != null) {
                    baseLayer2.setMatteLayer(forModel);
                    baseLayer2 = null;
                } else {
                    this.layers.add(0, forModel);
                    int ordinal = layer2.getMatteType().ordinal();
                    if (ordinal == 1 || ordinal == 2) {
                        baseLayer2 = forModel;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            BaseLayer baseLayer3 = (BaseLayer) longSparseArray.get(longSparseArray.keyAt(i));
            if (!(baseLayer3 == null || (baseLayer = (BaseLayer) longSparseArray.get(baseLayer3.getLayerModel().getParentId())) == null)) {
                baseLayer3.setParentLayer(baseLayer);
            }
        }
    }

    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t != LottieProperty.TIME_REMAP) {
            return;
        }
        if (lottieValueCallback == null) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.timeRemapping;
            if (baseKeyframeAnimation != null) {
                baseKeyframeAnimation.setValueCallback((LottieValueCallback<Float>) null);
                return;
            }
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
        this.timeRemapping = valueCallbackKeyframeAnimation;
        valueCallbackKeyframeAnimation.addUpdateListener(this);
        addAnimation(this.timeRemapping);
    }

    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        C5312L.beginSection("CompositionLayer#draw");
        this.newClipRect.set(0.0f, 0.0f, (float) this.layerModel.getPreCompWidth(), (float) this.layerModel.getPreCompHeight());
        matrix.mapRect(this.newClipRect);
        boolean z = this.lottieDrawable.isApplyingOpacityToLayersEnabled() && this.layers.size() > 1 && i != 255;
        if (z) {
            this.layerPaint.setAlpha(i);
            Utils.saveLayerCompat(canvas, this.newClipRect, this.layerPaint);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.layers.size() - 1; size >= 0; size--) {
            if (!this.newClipRect.isEmpty() ? canvas.clipRect(this.newClipRect) : true) {
                this.layers.get(size).draw(canvas, matrix, i);
            }
        }
        canvas.restore();
        C5312L.endSection("CompositionLayer#draw");
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        for (int size = this.layers.size() - 1; size >= 0; size--) {
            this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.layers.get(size).getBounds(this.rect, this.boundsMatrix, true);
            rectF.union(this.rect);
        }
    }

    public boolean hasMasks() {
        if (this.hasMasks == null) {
            int size = this.layers.size() - 1;
            while (size >= 0) {
                BaseLayer baseLayer = this.layers.get(size);
                if (!(baseLayer instanceof ShapeLayer)) {
                    if ((baseLayer instanceof CompositionLayer) && ((CompositionLayer) baseLayer).hasMasks()) {
                    }
                    size--;
                } else if (!baseLayer.hasMasksOnThisLayer()) {
                    size--;
                }
                this.hasMasks = Boolean.TRUE;
                return true;
            }
            this.hasMasks = Boolean.FALSE;
        }
        return this.hasMasks.booleanValue();
    }

    public boolean hasMatte() {
        if (this.hasMatte == null) {
            if (!hasMatteOnThisLayer()) {
                int size = this.layers.size() - 1;
                while (size >= 0) {
                    if (!this.layers.get(size).hasMatteOnThisLayer()) {
                        size--;
                    }
                }
                this.hasMatte = Boolean.FALSE;
            }
            this.hasMatte = Boolean.TRUE;
            return true;
        }
        return this.hasMatte.booleanValue();
    }

    public void resolveChildKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        for (int i2 = 0; i2 < this.layers.size(); i2++) {
            this.layers.get(i2).resolveKeyPath(keyPath, i, list, keyPath2);
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        super.setOutlineMasksAndMattes(z);
        for (BaseLayer outlineMasksAndMattes : this.layers) {
            outlineMasksAndMattes.setOutlineMasksAndMattes(z);
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, mo101to = 1.0d) float f) {
        super.setProgress(f);
        if (this.timeRemapping != null) {
            f = ((this.layerModel.getComposition().getFrameRate() * this.timeRemapping.getValue().floatValue()) - this.layerModel.getComposition().getStartFrame()) / (this.lottieDrawable.getComposition().getDurationFrames() + 0.01f);
        }
        if (this.timeRemapping == null) {
            f -= this.layerModel.getStartProgress();
        }
        if (this.layerModel.getTimeStretch() != 0.0f) {
            f /= this.layerModel.getTimeStretch();
        }
        for (int size = this.layers.size() - 1; size >= 0; size--) {
            this.layers.get(size).setProgress(f);
        }
    }
}
