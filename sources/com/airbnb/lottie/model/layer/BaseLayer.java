package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.C5312L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;

public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {
    private static final int CLIP_SAVE_FLAG = 2;
    private static final int CLIP_TO_LAYER_SAVE_FLAG = 16;
    private static final int MATRIX_SAVE_FLAG = 1;
    private static final int SAVE_FLAGS = 19;
    private final List<BaseKeyframeAnimation<?, ?>> animations;
    public final Matrix boundsMatrix;
    private final Paint clearPaint;
    private final Paint contentPaint = new LPaint(1);
    private final String drawTraceName;
    private final Paint dstInPaint = new LPaint(1, PorterDuff.Mode.DST_IN);
    private final Paint dstOutPaint = new LPaint(1, PorterDuff.Mode.DST_OUT);
    /* access modifiers changed from: private */
    @Nullable
    public FloatKeyframeAnimation inOutAnimation;
    public final Layer layerModel;
    public final LottieDrawable lottieDrawable;
    @Nullable
    private MaskKeyframeAnimation mask;
    private final RectF maskBoundsRect;
    private final Matrix matrix = new Matrix();
    private final RectF matteBoundsRect;
    @Nullable
    private BaseLayer matteLayer;
    private final Paint mattePaint;
    private boolean outlineMasksAndMattes;
    @Nullable
    private Paint outlineMasksAndMattesPaint;
    @Nullable
    private BaseLayer parentLayer;
    private List<BaseLayer> parentLayers;
    private final Path path = new Path();
    private final RectF rect;
    private final RectF tempMaskBoundsRect;
    public final TransformKeyframeAnimation transform;
    private boolean visible;

    /* renamed from: com.airbnb.lottie.model.layer.BaseLayer$2 */
    public static /* synthetic */ class C53662 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode;
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|21|22|23|(2:25|26)|27|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|21|22|23|(2:25|26)|27|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|21|22|23|(2:25|26)|27|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
        static {
            /*
                com.airbnb.lottie.model.content.Mask.MaskMode.values()
                r0 = 4
                int[] r1 = new int[r0]
                $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode = r1
                r2 = 1
                r3 = 3
                com.airbnb.lottie.model.content.Mask$MaskMode r4 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x000e }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 2
                int[] r4 = $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode     // Catch:{ NoSuchFieldError -> 0x0015 }
                com.airbnb.lottie.model.content.Mask$MaskMode r5 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0015 }
                r4[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r4 = $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode     // Catch:{ NoSuchFieldError -> 0x001b }
                com.airbnb.lottie.model.content.Mask$MaskMode r5 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x001b }
                r4[r1] = r3     // Catch:{ NoSuchFieldError -> 0x001b }
            L_0x001b:
                r4 = 0
                int[] r5 = $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.airbnb.lottie.model.content.Mask$MaskMode r6 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0022 }
                r5[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.airbnb.lottie.model.layer.Layer.LayerType.values()
                r5 = 7
                int[] r6 = new int[r5]
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType = r6
                com.airbnb.lottie.model.layer.Layer$LayerType r7 = com.airbnb.lottie.model.layer.Layer.LayerType.SHAPE     // Catch:{ NoSuchFieldError -> 0x002e }
                r6[r0] = r2     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r6 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x0034 }
                com.airbnb.lottie.model.layer.Layer$LayerType r7 = com.airbnb.lottie.model.layer.Layer.LayerType.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x0034 }
                r6[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                int[] r4 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x003a }
                com.airbnb.lottie.model.layer.Layer$LayerType r6 = com.airbnb.lottie.model.layer.Layer.LayerType.SOLID     // Catch:{ NoSuchFieldError -> 0x003a }
                r4[r2] = r3     // Catch:{ NoSuchFieldError -> 0x003a }
            L_0x003a:
                int[] r2 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.airbnb.lottie.model.layer.Layer$LayerType r4 = com.airbnb.lottie.model.layer.Layer.LayerType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                r0 = 5
                int[] r1 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.airbnb.lottie.model.layer.Layer$LayerType r2 = com.airbnb.lottie.model.layer.Layer.LayerType.NULL     // Catch:{ NoSuchFieldError -> 0x0047 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                r1 = 6
                int[] r2 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x004e }
                com.airbnb.lottie.model.layer.Layer$LayerType r3 = com.airbnb.lottie.model.layer.Layer.LayerType.TEXT     // Catch:{ NoSuchFieldError -> 0x004e }
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.airbnb.lottie.model.layer.Layer$LayerType r2 = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.BaseLayer.C53662.<clinit>():void");
        }
    }

    public BaseLayer(LottieDrawable lottieDrawable2, Layer layer) {
        LPaint lPaint = new LPaint(1);
        this.mattePaint = lPaint;
        this.clearPaint = new LPaint(PorterDuff.Mode.CLEAR);
        this.rect = new RectF();
        this.maskBoundsRect = new RectF();
        this.matteBoundsRect = new RectF();
        this.tempMaskBoundsRect = new RectF();
        this.boundsMatrix = new Matrix();
        this.animations = new ArrayList();
        this.visible = true;
        this.lottieDrawable = lottieDrawable2;
        this.layerModel = layer;
        this.drawTraceName = layer.getName() + "#draw";
        lPaint.setXfermode(layer.getMatteType() == Layer.MatteType.INVERT ? new PorterDuffXfermode(PorterDuff.Mode.DST_OUT) : new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        TransformKeyframeAnimation createAnimation = layer.getTransform().createAnimation();
        this.transform = createAnimation;
        createAnimation.addListener(this);
        if (layer.getMasks() != null && !layer.getMasks().isEmpty()) {
            MaskKeyframeAnimation maskKeyframeAnimation = new MaskKeyframeAnimation(layer.getMasks());
            this.mask = maskKeyframeAnimation;
            for (BaseKeyframeAnimation<ShapeData, Path> addUpdateListener : maskKeyframeAnimation.getMaskAnimations()) {
                addUpdateListener.addUpdateListener(this);
            }
            for (BaseKeyframeAnimation next : this.mask.getOpacityAnimations()) {
                addAnimation(next);
                next.addUpdateListener(this);
            }
        }
        setupInOutAnimations();
    }

    private void applyAddMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        this.contentPaint.setAlpha((int) (((float) baseKeyframeAnimation2.getValue().intValue()) * 2.55f));
        canvas.drawPath(this.path, this.contentPaint);
    }

    private void applyIntersectMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.dstInPaint);
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        this.contentPaint.setAlpha((int) (((float) baseKeyframeAnimation2.getValue().intValue()) * 2.55f));
        canvas.drawPath(this.path, this.contentPaint);
        canvas.restore();
    }

    private void applyInvertedAddMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.contentPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        this.contentPaint.setAlpha((int) (((float) baseKeyframeAnimation2.getValue().intValue()) * 2.55f));
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    private void applyInvertedIntersectMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.dstInPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.dstOutPaint.setAlpha((int) (((float) baseKeyframeAnimation2.getValue().intValue()) * 2.55f));
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    private void applyInvertedSubtractMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        Utils.saveLayerCompat(canvas, this.rect, this.dstOutPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.dstOutPaint.setAlpha((int) (((float) baseKeyframeAnimation2.getValue().intValue()) * 2.55f));
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    private void applyMasks(Canvas canvas, Matrix matrix2) {
        C5312L.beginSection("Layer#saveLayer");
        Utils.saveLayerCompat(canvas, this.rect, this.dstInPaint, 19);
        if (Build.VERSION.SDK_INT < 28) {
            clearCanvas(canvas);
        }
        C5312L.endSection("Layer#saveLayer");
        for (int i = 0; i < this.mask.getMasks().size(); i++) {
            Mask mask2 = this.mask.getMasks().get(i);
            BaseKeyframeAnimation baseKeyframeAnimation = this.mask.getMaskAnimations().get(i);
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.mask.getOpacityAnimations().get(i);
            int ordinal = mask2.getMaskMode().ordinal();
            if (ordinal == 0) {
                Canvas canvas2 = canvas;
                Matrix matrix3 = matrix2;
                if (mask2.isInverted()) {
                    applyInvertedAddMask(canvas2, matrix3, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
                } else {
                    applyAddMask(canvas2, matrix3, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
                }
            } else if (ordinal == 1) {
                if (i == 0) {
                    this.contentPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
                    this.contentPaint.setAlpha(255);
                    canvas.drawRect(this.rect, this.contentPaint);
                }
                Canvas canvas3 = canvas;
                Matrix matrix4 = matrix2;
                if (mask2.isInverted()) {
                    applyInvertedSubtractMask(canvas3, matrix4, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
                } else {
                    applySubtractMask(canvas3, matrix4, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
                }
            } else if (ordinal == 2) {
                Canvas canvas4 = canvas;
                Matrix matrix5 = matrix2;
                if (mask2.isInverted()) {
                    applyInvertedIntersectMask(canvas4, matrix5, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
                } else {
                    applyIntersectMask(canvas4, matrix5, mask2, baseKeyframeAnimation, baseKeyframeAnimation2);
                }
            } else if (ordinal == 3 && areAllMasksNone()) {
                this.contentPaint.setAlpha(255);
                canvas.drawRect(this.rect, this.contentPaint);
            }
        }
        C5312L.beginSection("Layer#restoreLayer");
        canvas.restore();
        C5312L.endSection("Layer#restoreLayer");
    }

    private void applySubtractMask(Canvas canvas, Matrix matrix2, Mask mask2, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
        this.path.set(baseKeyframeAnimation.getValue());
        this.path.transform(matrix2);
        canvas.drawPath(this.path, this.dstOutPaint);
    }

    private boolean areAllMasksNone() {
        if (this.mask.getMaskAnimations().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.mask.getMasks().size(); i++) {
            if (this.mask.getMasks().get(i).getMaskMode() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void buildParentLayerListIfNeeded() {
        if (this.parentLayers == null) {
            if (this.parentLayer == null) {
                this.parentLayers = Collections.emptyList();
                return;
            }
            this.parentLayers = new ArrayList();
            for (BaseLayer baseLayer = this.parentLayer; baseLayer != null; baseLayer = baseLayer.parentLayer) {
                this.parentLayers.add(baseLayer);
            }
        }
    }

    private void clearCanvas(Canvas canvas) {
        C5312L.beginSection("Layer#clearLayer");
        RectF rectF = this.rect;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.clearPaint);
        C5312L.endSection("Layer#clearLayer");
    }

    @Nullable
    public static BaseLayer forModel(Layer layer, LottieDrawable lottieDrawable2, LottieComposition lottieComposition) {
        int ordinal = layer.getLayerType().ordinal();
        if (ordinal == 0) {
            return new CompositionLayer(lottieDrawable2, layer, lottieComposition.getPrecomps(layer.getRefId()), lottieComposition);
        }
        if (ordinal == 1) {
            return new SolidLayer(lottieDrawable2, layer);
        }
        if (ordinal == 2) {
            return new ImageLayer(lottieDrawable2, layer);
        }
        if (ordinal == 3) {
            return new NullLayer(lottieDrawable2, layer);
        }
        if (ordinal == 4) {
            return new ShapeLayer(lottieDrawable2, layer);
        }
        if (ordinal == 5) {
            return new TextLayer(lottieDrawable2, layer);
        }
        StringBuilder u = C0843a.m460u("Unknown layer type ");
        u.append(layer.getLayerType());
        Logger.warning(u.toString());
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void intersectBoundsWithMask(android.graphics.RectF r11, android.graphics.Matrix r12) {
        /*
            r10 = this;
            android.graphics.RectF r0 = r10.maskBoundsRect
            r1 = 0
            r0.set(r1, r1, r1, r1)
            boolean r0 = r10.hasMasksOnThisLayer()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation r0 = r10.mask
            java.util.List r0 = r0.getMasks()
            int r0 = r0.size()
            r2 = 0
            r3 = r2
        L_0x0019:
            if (r3 >= r0) goto L_0x00a5
            com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation r4 = r10.mask
            java.util.List r4 = r4.getMasks()
            java.lang.Object r4 = r4.get(r3)
            com.airbnb.lottie.model.content.Mask r4 = (com.airbnb.lottie.model.content.Mask) r4
            com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation r5 = r10.mask
            java.util.List r5 = r5.getMaskAnimations()
            java.lang.Object r5 = r5.get(r3)
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation r5 = (com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation) r5
            java.lang.Object r5 = r5.getValue()
            android.graphics.Path r5 = (android.graphics.Path) r5
            android.graphics.Path r6 = r10.path
            r6.set(r5)
            android.graphics.Path r5 = r10.path
            r5.transform(r12)
            com.airbnb.lottie.model.content.Mask$MaskMode r5 = r4.getMaskMode()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0058
            r6 = 1
            if (r5 == r6) goto L_0x0057
            r6 = 2
            if (r5 == r6) goto L_0x0058
            r4 = 3
            if (r5 == r4) goto L_0x0057
            goto L_0x005f
        L_0x0057:
            return
        L_0x0058:
            boolean r4 = r4.isInverted()
            if (r4 == 0) goto L_0x005f
            return
        L_0x005f:
            android.graphics.Path r4 = r10.path
            android.graphics.RectF r5 = r10.tempMaskBoundsRect
            r4.computeBounds(r5, r2)
            android.graphics.RectF r4 = r10.maskBoundsRect
            if (r3 != 0) goto L_0x0070
            android.graphics.RectF r5 = r10.tempMaskBoundsRect
            r4.set(r5)
            goto L_0x00a1
        L_0x0070:
            float r5 = r4.left
            android.graphics.RectF r6 = r10.tempMaskBoundsRect
            float r6 = r6.left
            float r5 = java.lang.Math.min(r5, r6)
            android.graphics.RectF r6 = r10.maskBoundsRect
            float r6 = r6.top
            android.graphics.RectF r7 = r10.tempMaskBoundsRect
            float r7 = r7.top
            float r6 = java.lang.Math.min(r6, r7)
            android.graphics.RectF r7 = r10.maskBoundsRect
            float r7 = r7.right
            android.graphics.RectF r8 = r10.tempMaskBoundsRect
            float r8 = r8.right
            float r7 = java.lang.Math.max(r7, r8)
            android.graphics.RectF r8 = r10.maskBoundsRect
            float r8 = r8.bottom
            android.graphics.RectF r9 = r10.tempMaskBoundsRect
            float r9 = r9.bottom
            float r8 = java.lang.Math.max(r8, r9)
            r4.set(r5, r6, r7, r8)
        L_0x00a1:
            int r3 = r3 + 1
            goto L_0x0019
        L_0x00a5:
            android.graphics.RectF r12 = r10.maskBoundsRect
            boolean r12 = r11.intersect(r12)
            if (r12 != 0) goto L_0x00b0
            r11.set(r1, r1, r1, r1)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.BaseLayer.intersectBoundsWithMask(android.graphics.RectF, android.graphics.Matrix):void");
    }

    private void intersectBoundsWithMatte(RectF rectF, Matrix matrix2) {
        if (hasMatteOnThisLayer() && this.layerModel.getMatteType() != Layer.MatteType.INVERT) {
            this.matteBoundsRect.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.matteLayer.getBounds(this.matteBoundsRect, matrix2, true);
            if (!rectF.intersect(this.matteBoundsRect)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    private void invalidateSelf() {
        this.lottieDrawable.invalidateSelf();
    }

    private void recordRenderTime(float f) {
        this.lottieDrawable.getComposition().getPerformanceTracker().recordRenderTime(this.layerModel.getName(), f);
    }

    /* access modifiers changed from: private */
    public void setVisible(boolean z) {
        if (z != this.visible) {
            this.visible = z;
            invalidateSelf();
        }
    }

    private void setupInOutAnimations() {
        boolean z = true;
        if (!this.layerModel.getInOutKeyframes().isEmpty()) {
            FloatKeyframeAnimation floatKeyframeAnimation = new FloatKeyframeAnimation(this.layerModel.getInOutKeyframes());
            this.inOutAnimation = floatKeyframeAnimation;
            floatKeyframeAnimation.setIsDiscrete();
            this.inOutAnimation.addUpdateListener(new BaseKeyframeAnimation.AnimationListener() {
                public void onValueChanged() {
                    BaseLayer baseLayer = BaseLayer.this;
                    baseLayer.setVisible(baseLayer.inOutAnimation.getFloatValue() == 1.0f);
                }
            });
            if (((Float) this.inOutAnimation.getValue()).floatValue() != 1.0f) {
                z = false;
            }
            setVisible(z);
            addAnimation(this.inOutAnimation);
            return;
        }
        setVisible(true);
    }

    public void addAnimation(@Nullable BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (baseKeyframeAnimation != null) {
            this.animations.add(baseKeyframeAnimation);
        }
    }

    @CallSuper
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        this.transform.applyValueCallback(t, lottieValueCallback);
    }

    public void draw(Canvas canvas, Matrix matrix2, int i) {
        Paint paint;
        C5312L.beginSection(this.drawTraceName);
        if (!this.visible || this.layerModel.isHidden()) {
            C5312L.endSection(this.drawTraceName);
            return;
        }
        buildParentLayerListIfNeeded();
        C5312L.beginSection("Layer#parentMatrix");
        this.matrix.reset();
        this.matrix.set(matrix2);
        for (int size = this.parentLayers.size() - 1; size >= 0; size--) {
            this.matrix.preConcat(this.parentLayers.get(size).transform.getMatrix());
        }
        C5312L.endSection("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (this.transform.getOpacity() == null ? 100 : this.transform.getOpacity().getValue().intValue()))) / 100.0f) * 255.0f);
        if (hasMatteOnThisLayer() || hasMasksOnThisLayer()) {
            C5312L.beginSection("Layer#computeBounds");
            getBounds(this.rect, this.matrix, false);
            intersectBoundsWithMatte(this.rect, matrix2);
            this.matrix.preConcat(this.transform.getMatrix());
            intersectBoundsWithMask(this.rect, this.matrix);
            if (!this.rect.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C5312L.endSection("Layer#computeBounds");
            if (this.rect.width() >= 1.0f && this.rect.height() >= 1.0f) {
                C5312L.beginSection("Layer#saveLayer");
                this.contentPaint.setAlpha(255);
                Utils.saveLayerCompat(canvas, this.rect, this.contentPaint);
                C5312L.endSection("Layer#saveLayer");
                clearCanvas(canvas);
                C5312L.beginSection("Layer#drawLayer");
                drawLayer(canvas, this.matrix, intValue);
                C5312L.endSection("Layer#drawLayer");
                if (hasMasksOnThisLayer()) {
                    applyMasks(canvas, this.matrix);
                }
                if (hasMatteOnThisLayer()) {
                    C5312L.beginSection("Layer#drawMatte");
                    C5312L.beginSection("Layer#saveLayer");
                    Utils.saveLayerCompat(canvas, this.rect, this.mattePaint, 19);
                    C5312L.endSection("Layer#saveLayer");
                    clearCanvas(canvas);
                    this.matteLayer.draw(canvas, matrix2, intValue);
                    C5312L.beginSection("Layer#restoreLayer");
                    canvas.restore();
                    C5312L.endSection("Layer#restoreLayer");
                    C5312L.endSection("Layer#drawMatte");
                }
                C5312L.beginSection("Layer#restoreLayer");
                canvas.restore();
                C5312L.endSection("Layer#restoreLayer");
            }
            if (this.outlineMasksAndMattes && (paint = this.outlineMasksAndMattesPaint) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.outlineMasksAndMattesPaint.setColor(-251901);
                this.outlineMasksAndMattesPaint.setStrokeWidth(4.0f);
                canvas.drawRect(this.rect, this.outlineMasksAndMattesPaint);
                this.outlineMasksAndMattesPaint.setStyle(Paint.Style.FILL);
                this.outlineMasksAndMattesPaint.setColor(1357638635);
                canvas.drawRect(this.rect, this.outlineMasksAndMattesPaint);
            }
            recordRenderTime(C5312L.endSection(this.drawTraceName));
            return;
        }
        this.matrix.preConcat(this.transform.getMatrix());
        C5312L.beginSection("Layer#drawLayer");
        drawLayer(canvas, this.matrix, intValue);
        C5312L.endSection("Layer#drawLayer");
        recordRenderTime(C5312L.endSection(this.drawTraceName));
    }

    public abstract void drawLayer(Canvas canvas, Matrix matrix2, int i);

    @CallSuper
    public void getBounds(RectF rectF, Matrix matrix2, boolean z) {
        this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        buildParentLayerListIfNeeded();
        this.boundsMatrix.set(matrix2);
        if (z) {
            List<BaseLayer> list = this.parentLayers;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.boundsMatrix.preConcat(this.parentLayers.get(size).transform.getMatrix());
                }
            } else {
                BaseLayer baseLayer = this.parentLayer;
                if (baseLayer != null) {
                    this.boundsMatrix.preConcat(baseLayer.transform.getMatrix());
                }
            }
        }
        this.boundsMatrix.preConcat(this.transform.getMatrix());
    }

    public Layer getLayerModel() {
        return this.layerModel;
    }

    public String getName() {
        return this.layerModel.getName();
    }

    public boolean hasMasksOnThisLayer() {
        MaskKeyframeAnimation maskKeyframeAnimation = this.mask;
        return maskKeyframeAnimation != null && !maskKeyframeAnimation.getMaskAnimations().isEmpty();
    }

    public boolean hasMatteOnThisLayer() {
        return this.matteLayer != null;
    }

    public void onValueChanged() {
        invalidateSelf();
    }

    public void removeAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.animations.remove(baseKeyframeAnimation);
    }

    public void resolveChildKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
    }

    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        BaseLayer baseLayer = this.matteLayer;
        if (baseLayer != null) {
            KeyPath addKey = keyPath2.addKey(baseLayer.getName());
            if (keyPath.fullyResolvesTo(this.matteLayer.getName(), i)) {
                list.add(addKey.resolve(this.matteLayer));
            }
            if (keyPath.propagateToChildren(getName(), i)) {
                this.matteLayer.resolveChildKeyPath(keyPath, keyPath.incrementDepthBy(this.matteLayer.getName(), i) + i, list, addKey);
            }
        }
        if (keyPath.matches(getName(), i)) {
            if (!"__container".equals(getName())) {
                keyPath2 = keyPath2.addKey(getName());
                if (keyPath.fullyResolvesTo(getName(), i)) {
                    list.add(keyPath2.resolve(this));
                }
            }
            if (keyPath.propagateToChildren(getName(), i)) {
                resolveChildKeyPath(keyPath, keyPath.incrementDepthBy(getName(), i) + i, list, keyPath2);
            }
        }
    }

    public void setContents(List<Content> list, List<Content> list2) {
    }

    public void setMatteLayer(@Nullable BaseLayer baseLayer) {
        this.matteLayer = baseLayer;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (z && this.outlineMasksAndMattesPaint == null) {
            this.outlineMasksAndMattesPaint = new LPaint();
        }
        this.outlineMasksAndMattes = z;
    }

    public void setParentLayer(@Nullable BaseLayer baseLayer) {
        this.parentLayer = baseLayer;
    }

    public void setProgress(@FloatRange(from = 0.0d, mo101to = 1.0d) float f) {
        this.transform.setProgress(f);
        if (this.mask != null) {
            for (int i = 0; i < this.mask.getMaskAnimations().size(); i++) {
                this.mask.getMaskAnimations().get(i).setProgress(f);
            }
        }
        if (this.layerModel.getTimeStretch() != 0.0f) {
            f /= this.layerModel.getTimeStretch();
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.inOutAnimation;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.setProgress(f / this.layerModel.getTimeStretch());
        }
        BaseLayer baseLayer = this.matteLayer;
        if (baseLayer != null) {
            this.matteLayer.setProgress(baseLayer.layerModel.getTimeStretch() * f);
        }
        for (int i2 = 0; i2 < this.animations.size(); i2++) {
            this.animations.get(i2).setProgress(f);
        }
    }
}
