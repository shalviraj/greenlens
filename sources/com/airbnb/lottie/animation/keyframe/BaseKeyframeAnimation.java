package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5312L;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;

public abstract class BaseKeyframeAnimation<K, A> {
    private float cachedEndProgress = -1.0f;
    @Nullable
    private A cachedGetValue = null;
    private float cachedStartDelayProgress = -1.0f;
    private boolean isDiscrete = false;
    private final KeyframesWrapper<K> keyframesWrapper;
    public final List<AnimationListener> listeners = new ArrayList(1);
    public float progress = 0.0f;
    @Nullable
    public LottieValueCallback<A> valueCallback;

    public interface AnimationListener {
        void onValueChanged();
    }

    public static final class EmptyKeyframeWrapper<T> implements KeyframesWrapper<T> {
        private EmptyKeyframeWrapper() {
        }

        public Keyframe<T> getCurrentKeyframe() {
            throw new IllegalStateException("not implemented");
        }

        public float getEndProgress() {
            return 1.0f;
        }

        public float getStartDelayProgress() {
            return 0.0f;
        }

        public boolean isCachedValueEnabled(float f) {
            throw new IllegalStateException("not implemented");
        }

        public boolean isEmpty() {
            return true;
        }

        public boolean isValueChanged(float f) {
            return false;
        }
    }

    public interface KeyframesWrapper<T> {
        Keyframe<T> getCurrentKeyframe();

        @FloatRange(from = 0.0d, mo101to = 1.0d)
        float getEndProgress();

        @FloatRange(from = 0.0d, mo101to = 1.0d)
        float getStartDelayProgress();

        boolean isCachedValueEnabled(float f);

        boolean isEmpty();

        boolean isValueChanged(float f);
    }

    public static final class KeyframesWrapperImpl<T> implements KeyframesWrapper<T> {
        private Keyframe<T> cachedCurrentKeyframe = null;
        private float cachedInterpolatedProgress = -1.0f;
        @NonNull
        private Keyframe<T> currentKeyframe;
        private final List<? extends Keyframe<T>> keyframes;

        public KeyframesWrapperImpl(List<? extends Keyframe<T>> list) {
            this.keyframes = list;
            this.currentKeyframe = findKeyframe(0.0f);
        }

        private Keyframe<T> findKeyframe(float f) {
            Keyframe<T> keyframe = (Keyframe) C0843a.m437M(this.keyframes, 1);
            if (f >= keyframe.getStartProgress()) {
                return keyframe;
            }
            for (int size = this.keyframes.size() - 2; size >= 1; size--) {
                Keyframe<T> keyframe2 = (Keyframe) this.keyframes.get(size);
                if (this.currentKeyframe != keyframe2 && keyframe2.containsProgress(f)) {
                    return keyframe2;
                }
            }
            return (Keyframe) this.keyframes.get(0);
        }

        @NonNull
        public Keyframe<T> getCurrentKeyframe() {
            return this.currentKeyframe;
        }

        public float getEndProgress() {
            List<? extends Keyframe<T>> list = this.keyframes;
            return ((Keyframe) list.get(list.size() - 1)).getEndProgress();
        }

        public float getStartDelayProgress() {
            return ((Keyframe) this.keyframes.get(0)).getStartProgress();
        }

        public boolean isCachedValueEnabled(float f) {
            Keyframe<T> keyframe = this.cachedCurrentKeyframe;
            Keyframe<T> keyframe2 = this.currentKeyframe;
            if (keyframe == keyframe2 && this.cachedInterpolatedProgress == f) {
                return true;
            }
            this.cachedCurrentKeyframe = keyframe2;
            this.cachedInterpolatedProgress = f;
            return false;
        }

        public boolean isEmpty() {
            return false;
        }

        public boolean isValueChanged(float f) {
            if (this.currentKeyframe.containsProgress(f)) {
                return !this.currentKeyframe.isStatic();
            }
            this.currentKeyframe = findKeyframe(f);
            return true;
        }
    }

    public static final class SingleKeyframeWrapper<T> implements KeyframesWrapper<T> {
        private float cachedInterpolatedProgress = -1.0f;
        @NonNull
        private final Keyframe<T> keyframe;

        public SingleKeyframeWrapper(List<? extends Keyframe<T>> list) {
            this.keyframe = (Keyframe) list.get(0);
        }

        public Keyframe<T> getCurrentKeyframe() {
            return this.keyframe;
        }

        public float getEndProgress() {
            return this.keyframe.getEndProgress();
        }

        public float getStartDelayProgress() {
            return this.keyframe.getStartProgress();
        }

        public boolean isCachedValueEnabled(float f) {
            if (this.cachedInterpolatedProgress == f) {
                return true;
            }
            this.cachedInterpolatedProgress = f;
            return false;
        }

        public boolean isEmpty() {
            return false;
        }

        public boolean isValueChanged(float f) {
            return !this.keyframe.isStatic();
        }
    }

    public BaseKeyframeAnimation(List<? extends Keyframe<K>> list) {
        this.keyframesWrapper = wrap(list);
    }

    @FloatRange(from = 0.0d, mo101to = 1.0d)
    private float getStartDelayProgress() {
        if (this.cachedStartDelayProgress == -1.0f) {
            this.cachedStartDelayProgress = this.keyframesWrapper.getStartDelayProgress();
        }
        return this.cachedStartDelayProgress;
    }

    private static <T> KeyframesWrapper<T> wrap(List<? extends Keyframe<T>> list) {
        return list.isEmpty() ? new EmptyKeyframeWrapper() : list.size() == 1 ? new SingleKeyframeWrapper(list) : new KeyframesWrapperImpl(list);
    }

    public void addUpdateListener(AnimationListener animationListener) {
        this.listeners.add(animationListener);
    }

    public Keyframe<K> getCurrentKeyframe() {
        C5312L.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        Keyframe<K> currentKeyframe = this.keyframesWrapper.getCurrentKeyframe();
        C5312L.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        return currentKeyframe;
    }

    @FloatRange(from = 0.0d, mo101to = 1.0d)
    public float getEndProgress() {
        if (this.cachedEndProgress == -1.0f) {
            this.cachedEndProgress = this.keyframesWrapper.getEndProgress();
        }
        return this.cachedEndProgress;
    }

    public float getInterpolatedCurrentKeyframeProgress() {
        Keyframe currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return currentKeyframe.interpolator.getInterpolation(getLinearCurrentKeyframeProgress());
    }

    public float getLinearCurrentKeyframeProgress() {
        if (this.isDiscrete) {
            return 0.0f;
        }
        Keyframe currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return (this.progress - currentKeyframe.getStartProgress()) / (currentKeyframe.getEndProgress() - currentKeyframe.getStartProgress());
    }

    public float getProgress() {
        return this.progress;
    }

    public A getValue() {
        float linearCurrentKeyframeProgress = getLinearCurrentKeyframeProgress();
        if (this.valueCallback == null && this.keyframesWrapper.isCachedValueEnabled(linearCurrentKeyframeProgress)) {
            return this.cachedGetValue;
        }
        Keyframe currentKeyframe = getCurrentKeyframe();
        Interpolator interpolator = currentKeyframe.xInterpolator;
        A value = (interpolator == null || currentKeyframe.yInterpolator == null) ? getValue(currentKeyframe, getInterpolatedCurrentKeyframeProgress()) : getValue(currentKeyframe, linearCurrentKeyframeProgress, interpolator.getInterpolation(linearCurrentKeyframeProgress), currentKeyframe.yInterpolator.getInterpolation(linearCurrentKeyframeProgress));
        this.cachedGetValue = value;
        return value;
    }

    public abstract A getValue(Keyframe<K> keyframe, float f);

    public A getValue(Keyframe<K> keyframe, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void notifyListeners() {
        for (int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).onValueChanged();
        }
    }

    public void setIsDiscrete() {
        this.isDiscrete = true;
    }

    public void setProgress(@FloatRange(from = 0.0d, mo101to = 1.0d) float f) {
        if (!this.keyframesWrapper.isEmpty()) {
            if (f < getStartDelayProgress()) {
                f = getStartDelayProgress();
            } else if (f > getEndProgress()) {
                f = getEndProgress();
            }
            if (f != this.progress) {
                this.progress = f;
                if (this.keyframesWrapper.isValueChanged(f)) {
                    notifyListeners();
                }
            }
        }
    }

    public void setValueCallback(@Nullable LottieValueCallback<A> lottieValueCallback) {
        LottieValueCallback<A> lottieValueCallback2 = this.valueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation((BaseKeyframeAnimation<?, ?>) null);
        }
        this.valueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }
}
