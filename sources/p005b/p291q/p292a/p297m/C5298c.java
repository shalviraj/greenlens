package p005b.p291q.p292a.p297m;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.yalantis.ucrop.UCropActivity;
import p005b.p291q.p292a.C5266a;
import p005b.p291q.p292a.p294j.C5281c;
import p005b.p291q.p292a.p296l.C5286a;

/* renamed from: b.q.a.m.c */
public class C5298c extends AppCompatImageView {

    /* renamed from: g */
    public final float[] f10626g;

    /* renamed from: h */
    public final float[] f10627h;

    /* renamed from: i */
    public final float[] f10628i;

    /* renamed from: j */
    public Matrix f10629j;

    /* renamed from: k */
    public int f10630k;

    /* renamed from: l */
    public int f10631l;

    /* renamed from: m */
    public C5299a f10632m;

    /* renamed from: n */
    public float[] f10633n;

    /* renamed from: o */
    public float[] f10634o;

    /* renamed from: p */
    public boolean f10635p;

    /* renamed from: q */
    public boolean f10636q;

    /* renamed from: r */
    public int f10637r;

    /* renamed from: s */
    public String f10638s;

    /* renamed from: t */
    public String f10639t;

    /* renamed from: u */
    public C5281c f10640u;

    /* renamed from: b.q.a.m.c$a */
    public interface C5299a {
    }

    public C5298c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5298c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10626g = new float[8];
        this.f10627h = new float[2];
        this.f10628i = new float[9];
        this.f10629j = new Matrix();
        this.f10635p = false;
        this.f10636q = false;
        this.f10637r = 0;
        mo17270c();
    }

    /* renamed from: a */
    public float mo17268a(@NonNull Matrix matrix) {
        matrix.getValues(this.f10628i);
        float[] fArr = this.f10628i;
        matrix.getValues(fArr);
        return (float) (-(Math.atan2((double) fArr[1], (double) this.f10628i[0]) * 57.29577951308232d));
    }

    /* renamed from: b */
    public float mo17269b(@NonNull Matrix matrix) {
        matrix.getValues(this.f10628i);
        double pow = Math.pow((double) this.f10628i[0], 2.0d);
        matrix.getValues(this.f10628i);
        return (float) Math.sqrt(Math.pow((double) this.f10628i[3], 2.0d) + pow);
    }

    /* renamed from: c */
    public void mo17270c() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: d */
    public void mo17247d() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            Log.d("TransformImageView", String.format("Image size: [%d:%d]", new Object[]{Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)}));
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.f10633n = C5266a.m9991m1(rectF);
            this.f10634o = C5266a.m9961h1(rectF);
            this.f10636q = true;
            C5299a aVar = this.f10632m;
            if (aVar != null) {
                UCropActivity.C5851a aVar2 = (UCropActivity.C5851a) aVar;
                UCropActivity.this.f11543r.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
                UCropActivity.this.f11525D.setClickable(false);
                UCropActivity uCropActivity = UCropActivity.this;
                uCropActivity.f11542q = false;
                uCropActivity.supportInvalidateOptionsMenu();
            }
        }
    }

    /* renamed from: e */
    public void mo17271e(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f10629j.postRotate(f, f2, f3);
            setImageMatrix(this.f10629j);
            C5299a aVar = this.f10632m;
            if (aVar != null) {
                ((UCropActivity.C5851a) aVar).mo22892a(mo17268a(this.f10629j));
            }
        }
    }

    /* renamed from: f */
    public void mo17248f(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f10629j.postScale(f, f, f2, f3);
            setImageMatrix(this.f10629j);
            C5299a aVar = this.f10632m;
            if (aVar != null) {
                ((UCropActivity.C5851a) aVar).mo22893b(mo17269b(this.f10629j));
            }
        }
    }

    /* renamed from: g */
    public void mo17272g(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f10629j.postTranslate(f, f2);
            setImageMatrix(this.f10629j);
        }
    }

    public float getCurrentAngle() {
        return mo17268a(this.f10629j);
    }

    public float getCurrentScale() {
        return mo17269b(this.f10629j);
    }

    public C5281c getExifInfo() {
        return this.f10640u;
    }

    public String getImageInputPath() {
        return this.f10638s;
    }

    public String getImageOutputPath() {
        return this.f10639t;
    }

    public int getMaxBitmapSize() {
        int i;
        if (this.f10637r <= 0) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            Point point = new Point();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
            int i2 = point.x;
            int i3 = point.y;
            int sqrt = (int) Math.sqrt(Math.pow((double) i3, 2.0d) + Math.pow((double) i2, 2.0d));
            Canvas canvas = new Canvas();
            int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
            if (min > 0) {
                sqrt = Math.min(sqrt, min);
            }
            try {
                i = C5266a.m9796E1();
            } catch (Exception e) {
                Log.d("EglUtils", "getMaxTextureSize: ", e);
                i = 0;
            }
            if (i > 0) {
                sqrt = Math.min(sqrt, i);
            }
            Log.d("BitmapLoadUtils", "maxBitmapSize: " + sqrt);
            this.f10637r = sqrt;
        }
        return this.f10637r;
    }

    @Nullable
    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof C5286a)) {
            return null;
        }
        return ((C5286a) getDrawable()).f10578b;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.f10635p && !this.f10636q)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f10630k = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f10631l = (getHeight() - getPaddingBottom()) - paddingTop;
            mo17247d();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new C5286a(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f10629j.set(matrix);
        this.f10629j.mapPoints(this.f10626g, this.f10633n);
        this.f10629j.mapPoints(this.f10627h, this.f10634o);
    }

    public void setMaxBitmapSize(int i) {
        this.f10637r = i;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(C5299a aVar) {
        this.f10632m = aVar;
    }
}
