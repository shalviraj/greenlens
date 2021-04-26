package androidx.constraintlayout.motion.widget;

import android.annotation.TargetApi;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.motion.utils.Oscillator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import p005b.p035e.p036a.p037a.C0843a;

public abstract class KeyCycleOscillator {
    private static final String TAG = "KeyCycleOscillator";
    private CurveFit mCurveFit;
    public ConstraintAttribute mCustom;
    private CycleOscillator mCycleOscillator;
    private String mType;
    public int mVariesBy = 0;
    public ArrayList<WavePoint> mWavePoints = new ArrayList<>();
    private int mWaveShape = 0;

    public static class AlphaSet extends KeyCycleOscillator {
        public void setProperty(View view, float f) {
            view.setAlpha(get(f));
        }
    }

    public static class CustomSet extends KeyCycleOscillator {
        public float[] value = new float[1];

        public void setProperty(View view, float f) {
            this.value[0] = get(f);
            this.mCustom.setInterpolatedValue(view, this.value);
        }
    }

    public static class CycleOscillator {
        private static final String TAG = "CycleOscillator";
        public static final int UNSET = -1;
        public CurveFit mCurveFit;
        public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap<>();
        public float[] mOffset;
        public Oscillator mOscillator = new Oscillator();
        public float mPathLength;
        public float[] mPeriod;
        public double[] mPosition;
        public float[] mScale;
        public double[] mSplineSlopeCache;
        public double[] mSplineValueCache;
        public float[] mValues;
        private final int mVariesBy;
        public int mWaveShape;

        public CycleOscillator(int i, int i2, int i3) {
            this.mWaveShape = i;
            this.mVariesBy = i2;
            this.mOscillator.setType(i);
            this.mValues = new float[i3];
            this.mPosition = new double[i3];
            this.mPeriod = new float[i3];
            this.mOffset = new float[i3];
            this.mScale = new float[i3];
        }

        private ConstraintAttribute get(String str, ConstraintAttribute.AttributeType attributeType) {
            if (this.mCustomConstraints.containsKey(str)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str);
                if (constraintAttribute.getType() == attributeType) {
                    return constraintAttribute;
                }
                StringBuilder u = C0843a.m460u("ConstraintAttribute is already a ");
                u.append(constraintAttribute.getType().name());
                throw new IllegalArgumentException(u.toString());
            }
            ConstraintAttribute constraintAttribute2 = new ConstraintAttribute(str, attributeType);
            this.mCustomConstraints.put(str, constraintAttribute2);
            return constraintAttribute2;
        }

        public double getSlope(float f) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                double d = (double) f;
                curveFit.getSlope(d, this.mSplineSlopeCache);
                this.mCurveFit.getPos(d, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineSlopeCache;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d2 = (double) f;
            double value = this.mOscillator.getValue(d2);
            double slope = this.mOscillator.getSlope(d2);
            double[] dArr2 = this.mSplineSlopeCache;
            return (slope * this.mSplineValueCache[1]) + (value * dArr2[1]) + dArr2[0];
        }

        public double getValues(float f) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                curveFit.getPos((double) f, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineValueCache;
                dArr[0] = (double) this.mOffset[0];
                dArr[1] = (double) this.mValues[0];
            }
            return (this.mOscillator.getValue((double) f) * this.mSplineValueCache[1]) + this.mSplineValueCache[0];
        }

        public void setPoint(int i, int i2, float f, float f2, float f3) {
            this.mPosition[i] = ((double) i2) / 100.0d;
            this.mPeriod[i] = f;
            this.mOffset[i] = f2;
            this.mValues[i] = f3;
        }

        public void setup(float f) {
            this.mPathLength = f;
            int length = this.mPosition.length;
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
            float[] fArr = this.mValues;
            this.mSplineValueCache = new double[(fArr.length + 1)];
            this.mSplineSlopeCache = new double[(fArr.length + 1)];
            if (this.mPosition[0] > ShadowDrawableWrapper.COS_45) {
                this.mOscillator.addPoint(ShadowDrawableWrapper.COS_45, this.mPeriod[0]);
            }
            double[] dArr2 = this.mPosition;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[length2]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = (double) this.mOffset[i];
                int i2 = 0;
                while (true) {
                    float[] fArr2 = this.mValues;
                    if (i2 >= fArr2.length) {
                        break;
                    }
                    dArr[i2][1] = (double) fArr2[i2];
                    i2++;
                }
                this.mOscillator.addPoint(this.mPosition[i], this.mPeriod[i]);
            }
            this.mOscillator.normalize();
            double[] dArr3 = this.mPosition;
            this.mCurveFit = dArr3.length > 1 ? CurveFit.get(0, dArr3, dArr) : null;
        }
    }

    public static class ElevationSet extends KeyCycleOscillator {
        public void setProperty(View view, float f) {
            view.setElevation(get(f));
        }
    }

    public static class IntDoubleSort {
        private IntDoubleSort() {
        }

        private static int partition(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, i4, i2);
            return i4;
        }

        public static void sort(int[] iArr, float[] fArr, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int partition = partition(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = partition - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = partition + 1;
                }
            }
        }

        private static void swap(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    public static class IntFloatFloatSort {
        private IntFloatFloatSort() {
        }

        private static int partition(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, fArr2, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, fArr2, i4, i2);
            return i4;
        }

        public static void sort(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int partition = partition(iArr, fArr, fArr2, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = partition - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = partition + 1;
                }
            }
        }

        private static void swap(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
            float f2 = fArr2[i];
            fArr2[i] = fArr2[i2];
            fArr2[i2] = f2;
        }
    }

    public static class PathRotateSet extends KeyCycleOscillator {
        public void setPathRotate(View view, float f, double d, double d2) {
            view.setRotation(get(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        public void setProperty(View view, float f) {
        }
    }

    public static class ProgressSet extends KeyCycleOscillator {
        public boolean mNoMethod = false;

        public void setProperty(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f));
            } else if (!this.mNoMethod) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(get(f))});
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        Log.e(KeyCycleOscillator.TAG, "unable to setProgress", e);
                    }
                }
            }
        }
    }

    public static class RotationSet extends KeyCycleOscillator {
        public void setProperty(View view, float f) {
            view.setRotation(get(f));
        }
    }

    public static class RotationXset extends KeyCycleOscillator {
        public void setProperty(View view, float f) {
            view.setRotationX(get(f));
        }
    }

    public static class RotationYset extends KeyCycleOscillator {
        public void setProperty(View view, float f) {
            view.setRotationY(get(f));
        }
    }

    public static class ScaleXset extends KeyCycleOscillator {
        public void setProperty(View view, float f) {
            view.setScaleX(get(f));
        }
    }

    public static class ScaleYset extends KeyCycleOscillator {
        public void setProperty(View view, float f) {
            view.setScaleY(get(f));
        }
    }

    public static class TranslationXset extends KeyCycleOscillator {
        public void setProperty(View view, float f) {
            view.setTranslationX(get(f));
        }
    }

    public static class TranslationYset extends KeyCycleOscillator {
        public void setProperty(View view, float f) {
            view.setTranslationY(get(f));
        }
    }

    public static class TranslationZset extends KeyCycleOscillator {
        public void setProperty(View view, float f) {
            view.setTranslationZ(get(f));
        }
    }

    public static class WavePoint {
        public float mOffset;
        public float mPeriod;
        public int mPosition;
        public float mValue;

        public WavePoint(int i, float f, float f2, float f3) {
            this.mPosition = i;
            this.mValue = f3;
            this.mOffset = f2;
            this.mPeriod = f;
        }
    }

    public static KeyCycleOscillator makeSpline(String str) {
        if (str.startsWith(Key.CUSTOM)) {
            return new CustomSet();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals(Key.ROTATION_X)) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals(Key.ROTATION_Y)) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals(Key.TRANSLATION_X)) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals(Key.TRANSLATION_Y)) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals(Key.TRANSLATION_Z)) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals(Key.SCALE_X)) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals(Key.SCALE_Y)) {
                    c = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals(Key.WAVE_VARIES_BY)) {
                    c = 8;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    c = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals(Key.ELEVATION)) {
                    c = 10;
                    break;
                }
                break;
            case 37232917:
                if (str.equals(Key.TRANSITION_PATH_ROTATE)) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals(Key.ALPHA)) {
                    c = 12;
                    break;
                }
                break;
            case 156108012:
                if (str.equals(Key.WAVE_OFFSET)) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new RotationXset();
            case 1:
                return new RotationYset();
            case 2:
                return new TranslationXset();
            case 3:
                return new TranslationYset();
            case 4:
                return new TranslationZset();
            case 5:
                return new ProgressSet();
            case 6:
                return new ScaleXset();
            case 7:
                return new ScaleYset();
            case 8:
                return new AlphaSet();
            case 9:
                return new RotationSet();
            case 10:
                return new ElevationSet();
            case 11:
                return new PathRotateSet();
            case 12:
                return new AlphaSet();
            case 13:
                return new AlphaSet();
            default:
                return null;
        }
    }

    public float get(float f) {
        return (float) this.mCycleOscillator.getValues(f);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f) {
        return (float) this.mCycleOscillator.getSlope(f);
    }

    public void setPoint(int i, int i2, int i3, float f, float f2, float f3) {
        this.mWavePoints.add(new WavePoint(i, f, f2, f3));
        if (i3 != -1) {
            this.mVariesBy = i3;
        }
        this.mWaveShape = i2;
    }

    public void setPoint(int i, int i2, int i3, float f, float f2, float f3, ConstraintAttribute constraintAttribute) {
        this.mWavePoints.add(new WavePoint(i, f, f2, f3));
        if (i3 != -1) {
            this.mVariesBy = i3;
        }
        this.mWaveShape = i2;
        this.mCustom = constraintAttribute;
    }

    public abstract void setProperty(View view, float f);

    public void setType(String str) {
        this.mType = str;
    }

    @TargetApi(19)
    public void setup(float f) {
        int size = this.mWavePoints.size();
        if (size != 0) {
            Collections.sort(this.mWavePoints, new Comparator<WavePoint>() {
                public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
                    return Integer.compare(wavePoint.mPosition, wavePoint2.mPosition);
                }
            });
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            this.mCycleOscillator = new CycleOscillator(this.mWaveShape, this.mVariesBy, size);
            Iterator<WavePoint> it = this.mWavePoints.iterator();
            int i = 0;
            while (it.hasNext()) {
                WavePoint next = it.next();
                float f2 = next.mPeriod;
                dArr[i] = ((double) f2) * 0.01d;
                double[] dArr3 = dArr2[i];
                float f3 = next.mValue;
                dArr3[0] = (double) f3;
                double[] dArr4 = dArr2[i];
                float f4 = next.mOffset;
                dArr4[1] = (double) f4;
                this.mCycleOscillator.setPoint(i, next.mPosition, f2, f4, f3);
                i++;
            }
            this.mCycleOscillator.setup(f);
            this.mCurveFit = CurveFit.get(0, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        while (it.hasNext()) {
            WavePoint next = it.next();
            StringBuilder y = C0843a.m464y(str, "[");
            y.append(next.mPosition);
            y.append(" , ");
            y.append(decimalFormat.format((double) next.mValue));
            y.append("] ");
            str = y.toString();
        }
        return str;
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }
}
