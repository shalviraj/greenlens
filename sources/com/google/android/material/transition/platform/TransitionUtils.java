package com.google.android.material.transition.platform;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import p005b.p035e.p036a.p037a.C0843a;

@RequiresApi(21)
public class TransitionUtils {
    private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final String EASING_TYPE_FORMAT_END = ")";
    private static final String EASING_TYPE_FORMAT_START = "(";
    private static final String EASING_TYPE_PATH = "path";
    @AttrRes
    public static final int NO_ATTR_RES_ID = 0;
    public static final int NO_DURATION = -1;
    private static final int PATH_TYPE_ARC = 1;
    private static final int PATH_TYPE_LINEAR = 0;
    private static final RectF transformAlphaRectF = new RectF();

    public interface CanvasOperation {
        void run(Canvas canvas);
    }

    public interface CornerSizeBinaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2);
    }

    private TransitionUtils() {
    }

    public static float calculateArea(@NonNull RectF rectF) {
        return rectF.height() * rectF.width();
    }

    public static ShapeAppearanceModel convertToRelativeCornerSizes(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() {
            @NonNull
            public CornerSize apply(@NonNull CornerSize cornerSize) {
                return cornerSize instanceof RelativeCornerSize ? cornerSize : new RelativeCornerSize(cornerSize.getCornerSize(rectF) / rectF.height());
            }
        });
    }

    public static Shader createColorShader(@ColorInt int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    @NonNull
    public static <T> T defaultIfNull(@Nullable T t, @NonNull T t2) {
        return t != null ? t : t2;
    }

    public static View findAncestorById(View view, @IdRes int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(C0843a.m451l(resourceName, " is not a valid ancestor"));
    }

    public static View findDescendantOrAncestorById(View view, @IdRes int i) {
        View findViewById = view.findViewById(i);
        return findViewById != null ? findViewById : findAncestorById(view, i);
    }

    private static float getControlPoint(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    private static String getEasingContent(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static RectF getLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF((float) i, (float) i2, (float) (view.getWidth() + i), (float) (view.getHeight() + i2));
    }

    public static RectF getRelativeBounds(View view) {
        return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
    }

    public static Rect getRelativeBoundsRect(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean isEasingType(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(EASING_TYPE_FORMAT_START);
        return str.startsWith(sb.toString()) && str.endsWith(EASING_TYPE_FORMAT_END);
    }

    private static boolean isShapeAppearanceSignificant(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        return (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) ? false : true;
    }

    public static float lerp(float f, float f2, float f3) {
        return C0843a.m440a(f2, f, f3, f);
    }

    public static float lerp(float f, float f2, @FloatRange(from = 0.0d, mo101to = 1.0d) float f3, @FloatRange(from = 0.0d, mo101to = 1.0d) float f4, @FloatRange(from = 0.0d, mo101to = 1.0d) float f5) {
        return lerp(f, f2, f3, f4, f5, false);
    }

    public static float lerp(float f, float f2, @FloatRange(from = 0.0d, mo101to = 1.0d) float f3, @FloatRange(from = 0.0d, mo101to = 1.0d) float f4, @FloatRange(from = 0.0d) float f5, boolean z) {
        return (!z || (f5 >= 0.0f && f5 <= 1.0f)) ? f5 < f3 ? f : f5 > f4 ? f2 : lerp(f, f2, (f5 - f3) / (f4 - f3)) : lerp(f, f2, f5);
    }

    public static int lerp(int i, int i2, @FloatRange(from = 0.0d, mo101to = 1.0d) float f, @FloatRange(from = 0.0d, mo101to = 1.0d) float f2, @FloatRange(from = 0.0d, mo101to = 1.0d) float f3) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) lerp((float) i, (float) i2, (f3 - f) / (f2 - f));
    }

    public static ShapeAppearanceModel lerp(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, @FloatRange(from = 0.0d, mo101to = 1.0d) float f, @FloatRange(from = 0.0d, mo101to = 1.0d) float f2, @FloatRange(from = 0.0d, mo101to = 1.0d) float f3) {
        if (f3 < f) {
            return shapeAppearanceModel;
        }
        if (f3 > f2) {
            return shapeAppearanceModel2;
        }
        final RectF rectF3 = rectF;
        final RectF rectF4 = rectF2;
        final float f4 = f;
        final float f5 = f2;
        final float f6 = f3;
        return transformCornerSizes(shapeAppearanceModel, shapeAppearanceModel2, rectF, new CornerSizeBinaryOperator() {
            @NonNull
            public CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2) {
                return new AbsoluteCornerSize(TransitionUtils.lerp(cornerSize.getCornerSize(rectF3), cornerSize2.getCornerSize(rectF4), f4, f5, f6));
            }
        });
    }

    public static void maybeAddTransition(TransitionSet transitionSet, @Nullable Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    public static boolean maybeApplyThemeDuration(Transition transition, Context context, @AttrRes int i) {
        int resolveInteger;
        if (i == 0 || transition.getDuration() != -1 || (resolveInteger = MaterialAttributes.resolveInteger(context, i, -1)) == -1) {
            return false;
        }
        transition.setDuration((long) resolveInteger);
        return true;
    }

    public static boolean maybeApplyThemeInterpolator(Transition transition, Context context, @AttrRes int i, TimeInterpolator timeInterpolator) {
        if (i == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(resolveThemeInterpolator(context, i, timeInterpolator));
        return true;
    }

    public static boolean maybeApplyThemePath(Transition transition, Context context, @AttrRes int i) {
        PathMotion resolveThemePath;
        if (i == 0 || (resolveThemePath = resolveThemePath(context, i)) == null) {
            return false;
        }
        transition.setPathMotion(resolveThemePath);
        return true;
    }

    public static void maybeRemoveTransition(TransitionSet transitionSet, @Nullable Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    public static TimeInterpolator resolveThemeInterpolator(Context context, @AttrRes int i, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (isEasingType(valueOf, EASING_TYPE_CUBIC_BEZIER)) {
                String[] split = getEasingContent(valueOf, EASING_TYPE_CUBIC_BEZIER).split(",");
                if (split.length == 4) {
                    return PathInterpolatorCompat.create(getControlPoint(split, 0), getControlPoint(split, 1), getControlPoint(split, 2), getControlPoint(split, 3));
                }
                StringBuilder u = C0843a.m460u("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                u.append(split.length);
                throw new IllegalArgumentException(u.toString());
            } else if (isEasingType(valueOf, EASING_TYPE_PATH)) {
                return PathInterpolatorCompat.create(PathParser.createPathFromPathData(getEasingContent(valueOf, EASING_TYPE_PATH)));
            } else {
                throw new IllegalArgumentException(C0843a.m451l("Invalid motion easing type: ", valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
    }

    @Nullable
    public static PathMotion resolveThemePath(Context context, @AttrRes int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.type;
        if (i2 == 16) {
            int i3 = typedValue.data;
            if (i3 == 0) {
                return null;
            }
            if (i3 == 1) {
                return new MaterialArcMotion();
            }
            throw new IllegalArgumentException(C0843a.m444e("Invalid motion path type: ", i3));
        } else if (i2 == 3) {
            return new PatternPathMotion(PathParser.createPathFromPathData(String.valueOf(typedValue.string)));
        } else {
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int i) {
        RectF rectF = transformAlphaRectF;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    public static void transform(Canvas canvas, Rect rect, float f, float f2, float f3, int i, CanvasOperation canvasOperation) {
        if (i > 0) {
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                saveLayerAlphaCompat(canvas, rect, i);
            }
            canvasOperation.run(canvas);
            canvas.restoreToCount(save);
        }
    }

    public static ShapeAppearanceModel transformCornerSizes(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
        return (isShapeAppearanceSignificant(shapeAppearanceModel, rectF) ? shapeAppearanceModel : shapeAppearanceModel2).toBuilder().setTopLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }
}
