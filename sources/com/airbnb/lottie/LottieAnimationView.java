package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class LottieAnimationView extends AppCompatImageView {
    /* access modifiers changed from: private */
    public static final LottieListener<Throwable> DEFAULT_FAILURE_LISTENER = new LottieListener<Throwable>() {
        public void onResult(Throwable th) {
            if (Utils.isNetworkException(th)) {
                Logger.warning("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    };
    private static final String TAG = LottieAnimationView.class.getSimpleName();
    private String animationName;
    @RawRes
    private int animationResId;
    private boolean autoPlay = false;
    private int buildDrawingCacheDepth = 0;
    /* access modifiers changed from: private */
    public boolean cacheComposition = true;
    @Nullable
    private LottieComposition composition;
    @Nullable
    private LottieTask<LottieComposition> compositionTask;
    /* access modifiers changed from: private */
    @Nullable
    public LottieListener<Throwable> failureListener;
    /* access modifiers changed from: private */
    @DrawableRes
    public int fallbackResource = 0;
    private boolean ignoreUnschedule = false;
    private boolean isInitialized;
    private final LottieListener<LottieComposition> loadedListener = new LottieListener<LottieComposition>() {
        public void onResult(LottieComposition lottieComposition) {
            LottieAnimationView.this.setComposition(lottieComposition);
        }
    };
    private final LottieDrawable lottieDrawable = new LottieDrawable();
    private final Set<LottieOnCompositionLoadedListener> lottieOnCompositionLoadedListeners = new HashSet();
    private boolean playAnimationWhenShown = false;
    private RenderMode renderMode = RenderMode.AUTOMATIC;
    private boolean wasAnimatingWhenDetached = false;
    private boolean wasAnimatingWhenNotShown = false;
    private final LottieListener<Throwable> wrappedFailureListener = new LottieListener<Throwable>() {
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.fallbackResource != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
            }
            (LottieAnimationView.this.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : LottieAnimationView.this.failureListener).onResult(th);
        }
    };

    /* renamed from: com.airbnb.lottie.LottieAnimationView$7 */
    public static /* synthetic */ class C53207 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$RenderMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0014 */
        static {
            /*
                com.airbnb.lottie.RenderMode.values()
                r0 = 3
                int[] r1 = new int[r0]
                $SwitchMap$com$airbnb$lottie$RenderMode = r1
                com.airbnb.lottie.RenderMode r2 = com.airbnb.lottie.RenderMode.HARDWARE     // Catch:{ NoSuchFieldError -> 0x000d }
                r2 = 1
                r1[r2] = r2     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                int[] r1 = $SwitchMap$com$airbnb$lottie$RenderMode     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.RenderMode r2 = com.airbnb.lottie.RenderMode.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 2
                r1[r2] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r1 = $SwitchMap$com$airbnb$lottie$RenderMode     // Catch:{ NoSuchFieldError -> 0x001b }
                com.airbnb.lottie.RenderMode r2 = com.airbnb.lottie.RenderMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x001b }
                r2 = 0
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x001b }
            L_0x001b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.C53207.<clinit>():void");
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public String animationName;
        public int animationResId;
        public String imageAssetsFolder;
        public boolean isAnimating;
        public float progress;
        public int repeatCount;
        public int repeatMode;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            this.isAnimating = parcel.readInt() != 1 ? false : true;
            this.imageAssetsFolder = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating ? 1 : 0);
            parcel.writeString(this.imageAssetsFolder);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        init((AttributeSet) null, C5356R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, C5356R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i);
    }

    private void cancelLoaderTask() {
        LottieTask<LottieComposition> lottieTask = this.compositionTask;
        if (lottieTask != null) {
            lottieTask.removeListener(this.loadedListener);
            this.compositionTask.removeFailureListener(this.wrappedFailureListener);
        }
    }

    private void clearComposition() {
        this.composition = null;
        this.lottieDrawable.clearComposition();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r3 != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (r0 != 1) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void enableOrDisableHardwareLayer() {
        /*
            r5 = this;
            com.airbnb.lottie.RenderMode r0 = r5.renderMode
            int r0 = r0.ordinal()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x000e
            if (r0 == r2) goto L_0x003a
        L_0x000c:
            r1 = r2
            goto L_0x003a
        L_0x000e:
            com.airbnb.lottie.LottieComposition r0 = r5.composition
            r3 = 0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.hasDashPattern()
            if (r0 == 0) goto L_0x0020
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L_0x0020
            goto L_0x0038
        L_0x0020:
            com.airbnb.lottie.LottieComposition r0 = r5.composition
            if (r0 == 0) goto L_0x002c
            int r0 = r0.getMaskAndMatteCount()
            r4 = 4
            if (r0 <= r4) goto L_0x002c
            goto L_0x0038
        L_0x002c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r0 == r4) goto L_0x0038
            r4 = 25
            if (r0 != r4) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r3 = r2
        L_0x0038:
            if (r3 == 0) goto L_0x000c
        L_0x003a:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L_0x0044
            r0 = 0
            r5.setLayerType(r1, r0)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.enableOrDisableHardwareLayer():void");
    }

    private LottieTask<LottieComposition> fromAssets(final String str) {
        return isInEditMode() ? new LottieTask<>(new Callable<LottieResult<LottieComposition>>() {
            public LottieResult<LottieComposition> call() {
                return LottieAnimationView.this.cacheComposition ? LottieCompositionFactory.fromAssetSync(LottieAnimationView.this.getContext(), str) : LottieCompositionFactory.fromAssetSync(LottieAnimationView.this.getContext(), str, (String) null);
            }
        }, true) : this.cacheComposition ? LottieCompositionFactory.fromAsset(getContext(), str) : LottieCompositionFactory.fromAsset(getContext(), str, (String) null);
    }

    private LottieTask<LottieComposition> fromRawRes(@RawRes final int i) {
        return isInEditMode() ? new LottieTask<>(new Callable<LottieResult<LottieComposition>>() {
            public LottieResult<LottieComposition> call() {
                return LottieAnimationView.this.cacheComposition ? LottieCompositionFactory.fromRawResSync(LottieAnimationView.this.getContext(), i) : LottieCompositionFactory.fromRawResSync(LottieAnimationView.this.getContext(), i, (String) null);
            }
        }, true) : this.cacheComposition ? LottieCompositionFactory.fromRawRes(getContext(), i) : LottieCompositionFactory.fromRawRes(getContext(), i, (String) null);
    }

    private void init(@Nullable AttributeSet attributeSet, @AttrRes int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5356R.styleable.LottieAnimationView, i, 0);
        this.cacheComposition = obtainStyledAttributes.getBoolean(C5356R.styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i2 = C5356R.styleable.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = C5356R.styleable.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = C5356R.styleable.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(i3);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(C5356R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
            if (obtainStyledAttributes.getBoolean(C5356R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
                this.wasAnimatingWhenDetached = true;
                this.autoPlay = true;
            }
            if (obtainStyledAttributes.getBoolean(C5356R.styleable.LottieAnimationView_lottie_loop, false)) {
                this.lottieDrawable.setRepeatCount(-1);
            }
            int i5 = C5356R.styleable.LottieAnimationView_lottie_repeatMode;
            if (obtainStyledAttributes.hasValue(i5)) {
                setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
            }
            int i6 = C5356R.styleable.LottieAnimationView_lottie_repeatCount;
            if (obtainStyledAttributes.hasValue(i6)) {
                setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
            }
            int i7 = C5356R.styleable.LottieAnimationView_lottie_speed;
            if (obtainStyledAttributes.hasValue(i7)) {
                setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(C5356R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
            setProgress(obtainStyledAttributes.getFloat(C5356R.styleable.LottieAnimationView_lottie_progress, 0.0f));
            enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(C5356R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
            int i8 = C5356R.styleable.LottieAnimationView_lottie_colorFilter;
            if (obtainStyledAttributes.hasValue(i8)) {
                addValueCallback(new KeyPath("**"), LottieProperty.COLOR_FILTER, new LottieValueCallback(new SimpleColorFilter(AppCompatResources.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(i8, -1)).getDefaultColor())));
            }
            int i9 = C5356R.styleable.LottieAnimationView_lottie_scale;
            if (obtainStyledAttributes.hasValue(i9)) {
                this.lottieDrawable.setScale(obtainStyledAttributes.getFloat(i9, 1.0f));
            }
            int i10 = C5356R.styleable.LottieAnimationView_lottie_renderMode;
            if (obtainStyledAttributes.hasValue(i10)) {
                RenderMode renderMode2 = RenderMode.AUTOMATIC;
                int i11 = obtainStyledAttributes.getInt(i10, 0);
                RenderMode.values();
                if (i11 >= 3) {
                    i11 = 0;
                }
                setRenderMode(RenderMode.values()[i11]);
            }
            obtainStyledAttributes.recycle();
            LottieDrawable lottieDrawable2 = this.lottieDrawable;
            if (Utils.getAnimationScale(getContext()) != 0.0f) {
                z = true;
            }
            lottieDrawable2.setSystemAnimationsAreEnabled(Boolean.valueOf(z));
            enableOrDisableHardwareLayer();
            this.isInitialized = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) {
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = lottieTask.addListener(this.loadedListener).addFailureListener(this.wrappedFailureListener);
    }

    private void setLottieDrawable() {
        boolean isAnimating = isAnimating();
        setImageDrawable((Drawable) null);
        setImageDrawable(this.lottieDrawable);
        if (isAnimating) {
            this.lottieDrawable.resumeAnimation();
        }
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.addAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.addAnimatorPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition != null) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(lottieComposition);
        }
        return this.lottieOnCompositionLoadedListeners.add(lottieOnCompositionLoadedListener);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, LottieValueCallback<T> lottieValueCallback) {
        this.lottieDrawable.addValueCallback(keyPath, t, lottieValueCallback);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, final SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        this.lottieDrawable.addValueCallback(keyPath, t, new LottieValueCallback<T>() {
            public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                return simpleLottieValueCallback.getValue(lottieFrameInfo);
            }
        });
    }

    public void buildDrawingCache(boolean z) {
        C5312L.beginSection("buildDrawingCache");
        this.buildDrawingCacheDepth++;
        super.buildDrawingCache(z);
        if (this.buildDrawingCacheDepth == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.buildDrawingCacheDepth--;
        C5312L.endSection("buildDrawingCache");
    }

    @MainThread
    public void cancelAnimation() {
        this.wasAnimatingWhenDetached = false;
        this.wasAnimatingWhenNotShown = false;
        this.playAnimationWhenShown = false;
        this.lottieDrawable.cancelAnimation();
        enableOrDisableHardwareLayer();
    }

    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.disableExtraScaleModeInFitXY();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.lottieDrawable.enableMergePathsForKitKatAndAbove(z);
    }

    @Nullable
    public LottieComposition getComposition() {
        return this.composition;
    }

    public long getDuration() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition != null) {
            return (long) lottieComposition.getDuration();
        }
        return 0;
    }

    public int getFrame() {
        return this.lottieDrawable.getFrame();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.lottieDrawable.getImageAssetsFolder();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.getMaxFrame();
    }

    public float getMinFrame() {
        return this.lottieDrawable.getMinFrame();
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        return this.lottieDrawable.getPerformanceTracker();
    }

    @FloatRange(from = 0.0d, mo101to = 1.0d)
    public float getProgress() {
        return this.lottieDrawable.getProgress();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.getRepeatMode();
    }

    public float getScale() {
        return this.lottieDrawable.getScale();
    }

    public float getSpeed() {
        return this.lottieDrawable.getSpeed();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.hasMasks();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.hasMatte();
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable2 = this.lottieDrawable;
        if (drawable2 == lottieDrawable2) {
            super.invalidateDrawable(lottieDrawable2);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.lottieDrawable.isAnimating();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.isMergePathsEnabledForKitKatAndAbove();
    }

    @Deprecated
    public void loop(boolean z) {
        this.lottieDrawable.setRepeatCount(z ? -1 : 0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.autoPlay || this.wasAnimatingWhenDetached) {
            playAnimation();
            this.autoPlay = false;
            this.wasAnimatingWhenDetached = false;
        }
    }

    public void onDetachedFromWindow() {
        if (isAnimating()) {
            cancelAnimation();
            this.wasAnimatingWhenDetached = true;
        }
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.animationName;
        this.animationName = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.animationName);
        }
        int i = savedState.animationResId;
        this.animationResId = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.progress);
        if (savedState.isAnimating) {
            playAnimation();
        }
        this.lottieDrawable.setImagesAssetsFolder(savedState.imageAssetsFolder);
        setRepeatMode(savedState.repeatMode);
        setRepeatCount(savedState.repeatCount);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.animationName;
        savedState.animationResId = this.animationResId;
        savedState.progress = this.lottieDrawable.getProgress();
        savedState.isAnimating = this.lottieDrawable.isAnimating() || (!ViewCompat.isAttachedToWindow(this) && this.wasAnimatingWhenDetached);
        savedState.imageAssetsFolder = this.lottieDrawable.getImageAssetsFolder();
        savedState.repeatMode = this.lottieDrawable.getRepeatMode();
        savedState.repeatCount = this.lottieDrawable.getRepeatCount();
        return savedState;
    }

    public void onVisibilityChanged(@NonNull View view, int i) {
        if (this.isInitialized) {
            if (isShown()) {
                if (this.wasAnimatingWhenNotShown) {
                    resumeAnimation();
                } else if (this.playAnimationWhenShown) {
                    playAnimation();
                }
                this.wasAnimatingWhenNotShown = false;
                this.playAnimationWhenShown = false;
            } else if (isAnimating()) {
                pauseAnimation();
                this.wasAnimatingWhenNotShown = true;
            }
        }
    }

    @MainThread
    public void pauseAnimation() {
        this.autoPlay = false;
        this.wasAnimatingWhenDetached = false;
        this.wasAnimatingWhenNotShown = false;
        this.playAnimationWhenShown = false;
        this.lottieDrawable.pauseAnimation();
        enableOrDisableHardwareLayer();
    }

    @MainThread
    public void playAnimation() {
        if (isShown()) {
            this.lottieDrawable.playAnimation();
            enableOrDisableHardwareLayer();
            return;
        }
        this.playAnimationWhenShown = true;
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.removeAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.removeAnimatorPauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        return this.lottieOnCompositionLoadedListeners.remove(lottieOnCompositionLoadedListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        return this.lottieDrawable.resolveKeyPath(keyPath);
    }

    @MainThread
    public void resumeAnimation() {
        if (isShown()) {
            this.lottieDrawable.resumeAnimation();
            enableOrDisableHardwareLayer();
            return;
        }
        this.playAnimationWhenShown = false;
        this.wasAnimatingWhenNotShown = true;
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.reverseAnimationSpeed();
    }

    public void setAnimation(@RawRes int i) {
        this.animationResId = i;
        this.animationName = null;
        setCompositionTask(fromRawRes(i));
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        setCompositionTask(LottieCompositionFactory.fromJsonInputStream(inputStream, str));
    }

    public void setAnimation(String str) {
        this.animationName = str;
        this.animationResId = 0;
        setCompositionTask(fromAssets(str));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.cacheComposition ? LottieCompositionFactory.fromUrl(getContext(), str) : LottieCompositionFactory.fromUrl(getContext(), str, (String) null));
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        setCompositionTask(LottieCompositionFactory.fromUrl(getContext(), str, str2));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.lottieDrawable.setApplyingOpacityToLayersEnabled(z);
    }

    public void setCacheComposition(boolean z) {
        this.cacheComposition = z;
    }

    public void setComposition(@NonNull LottieComposition lottieComposition) {
        if (C5312L.DBG) {
            String str = TAG;
            Log.v(str, "Set Composition \n" + lottieComposition);
        }
        this.lottieDrawable.setCallback(this);
        this.composition = lottieComposition;
        this.ignoreUnschedule = true;
        boolean composition2 = this.lottieDrawable.setComposition(lottieComposition);
        this.ignoreUnschedule = false;
        enableOrDisableHardwareLayer();
        if (getDrawable() != this.lottieDrawable || composition2) {
            if (!composition2) {
                setLottieDrawable();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (LottieOnCompositionLoadedListener onCompositionLoaded : this.lottieOnCompositionLoadedListeners) {
                onCompositionLoaded.onCompositionLoaded(lottieComposition);
            }
        }
    }

    public void setFailureListener(@Nullable LottieListener<Throwable> lottieListener) {
        this.failureListener = lottieListener;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.fallbackResource = i;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.lottieDrawable.setFontAssetDelegate(fontAssetDelegate);
    }

    public void setFrame(int i) {
        this.lottieDrawable.setFrame(i);
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.lottieDrawable.setImageAssetDelegate(imageAssetDelegate);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.setImagesAssetsFolder(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.setMaxFrame(i);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.setMaxFrame(str);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, mo101to = 1.0d) float f) {
        this.lottieDrawable.setMaxProgress(f);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.setMinAndMaxFrame(i, i2);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.lottieDrawable.setMinAndMaxFrame(str, str2, z);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, mo101to = 1.0d) float f, @FloatRange(from = 0.0d, mo101to = 1.0d) float f2) {
        this.lottieDrawable.setMinAndMaxProgress(f, f2);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.setMinFrame(i);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.setMinFrame(str);
    }

    public void setMinProgress(float f) {
        this.lottieDrawable.setMinProgress(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.lottieDrawable.setOutlineMasksAndMattes(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.lottieDrawable.setPerformanceTrackingEnabled(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, mo101to = 1.0d) float f) {
        this.lottieDrawable.setProgress(f);
    }

    public void setRenderMode(RenderMode renderMode2) {
        this.renderMode = renderMode2;
        enableOrDisableHardwareLayer();
    }

    public void setRepeatCount(int i) {
        this.lottieDrawable.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.lottieDrawable.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.lottieDrawable.setSafeMode(z);
    }

    public void setScale(float f) {
        this.lottieDrawable.setScale(f);
        if (getDrawable() == this.lottieDrawable) {
            setLottieDrawable();
        }
    }

    public void setSpeed(float f) {
        this.lottieDrawable.setSpeed(f);
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.lottieDrawable.setTextDelegate(textDelegate);
    }

    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable2;
        if (!this.ignoreUnschedule && drawable == (lottieDrawable2 = this.lottieDrawable) && lottieDrawable2.isAnimating()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable3 = (LottieDrawable) drawable;
            if (lottieDrawable3.isAnimating()) {
                lottieDrawable3.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        return this.lottieDrawable.updateBitmap(str, bitmap);
    }
}
