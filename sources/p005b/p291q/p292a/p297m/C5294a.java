package p005b.p291q.p292a.p297m;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yalantis.ucrop.UCropActivity;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p005b.p291q.p292a.C5266a;
import p005b.p291q.p292a.p293i.C5276c;
import p005b.p291q.p292a.p297m.C5298c;

/* renamed from: b.q.a.m.a */
public class C5294a extends C5298c {

    /* renamed from: A */
    public Runnable f10596A;

    /* renamed from: B */
    public Runnable f10597B;

    /* renamed from: C */
    public float f10598C;

    /* renamed from: D */
    public float f10599D;

    /* renamed from: E */
    public int f10600E;

    /* renamed from: F */
    public int f10601F;

    /* renamed from: G */
    public long f10602G;

    /* renamed from: v */
    public final RectF f10603v;

    /* renamed from: w */
    public final Matrix f10604w;

    /* renamed from: x */
    public float f10605x;

    /* renamed from: y */
    public float f10606y;

    /* renamed from: z */
    public C5276c f10607z;

    /* renamed from: b.q.a.m.a$a */
    public static class C5295a implements Runnable {

        /* renamed from: g */
        public final WeakReference<C5294a> f10608g;

        /* renamed from: h */
        public final long f10609h;

        /* renamed from: i */
        public final long f10610i = System.currentTimeMillis();

        /* renamed from: j */
        public final float f10611j;

        /* renamed from: k */
        public final float f10612k;

        /* renamed from: l */
        public final float f10613l;

        /* renamed from: m */
        public final float f10614m;

        /* renamed from: n */
        public final float f10615n;

        /* renamed from: o */
        public final float f10616o;

        /* renamed from: p */
        public final boolean f10617p;

        public C5295a(C5294a aVar, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.f10608g = new WeakReference<>(aVar);
            this.f10609h = j;
            this.f10611j = f;
            this.f10612k = f2;
            this.f10613l = f3;
            this.f10614m = f4;
            this.f10615n = f5;
            this.f10616o = f6;
            this.f10617p = z;
        }

        public void run() {
            C5294a aVar = (C5294a) this.f10608g.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f10609h, System.currentTimeMillis() - this.f10610i);
                float f = this.f10613l;
                float f2 = (float) this.f10609h;
                float f3 = (min / f2) - 1.0f;
                float f4 = (f3 * f3 * f3) + 1.0f;
                float f5 = (f * f4) + 0.0f;
                float f6 = (f4 * this.f10614m) + 0.0f;
                float I0 = C5266a.m9819I0(min, 0.0f, this.f10616o, f2);
                if (min < ((float) this.f10609h)) {
                    float[] fArr = aVar.f10627h;
                    aVar.mo17272g(f5 - (fArr[0] - this.f10611j), f6 - (fArr[1] - this.f10612k));
                    if (!this.f10617p) {
                        aVar.mo17257l(this.f10615n + I0, aVar.f10603v.centerX(), aVar.f10603v.centerY());
                    }
                    if (!aVar.mo17255j(aVar.f10626g)) {
                        aVar.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: b.q.a.m.a$b */
    public static class C5296b implements Runnable {

        /* renamed from: g */
        public final WeakReference<C5294a> f10618g;

        /* renamed from: h */
        public final long f10619h;

        /* renamed from: i */
        public final long f10620i = System.currentTimeMillis();

        /* renamed from: j */
        public final float f10621j;

        /* renamed from: k */
        public final float f10622k;

        /* renamed from: l */
        public final float f10623l;

        /* renamed from: m */
        public final float f10624m;

        public C5296b(C5294a aVar, long j, float f, float f2, float f3, float f4) {
            this.f10618g = new WeakReference<>(aVar);
            this.f10619h = j;
            this.f10621j = f;
            this.f10622k = f2;
            this.f10623l = f3;
            this.f10624m = f4;
        }

        public void run() {
            C5294a aVar = (C5294a) this.f10618g.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f10619h, System.currentTimeMillis() - this.f10620i);
                float I0 = C5266a.m9819I0(min, 0.0f, this.f10622k, (float) this.f10619h);
                if (min < ((float) this.f10619h)) {
                    aVar.mo17257l(this.f10621j + I0, this.f10623l, this.f10624m);
                    aVar.post(this);
                    return;
                }
                aVar.setImageToWrapCropBounds(true);
            }
        }
    }

    public C5294a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5294a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10603v = new RectF();
        this.f10604w = new Matrix();
        this.f10606y = 10.0f;
        this.f10597B = null;
        this.f10600E = 0;
        this.f10601F = 0;
        this.f10602G = 500;
    }

    /* renamed from: d */
    public void mo17247d() {
        super.mo17247d();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            if (this.f10605x == 0.0f) {
                this.f10605x = intrinsicWidth / intrinsicHeight;
            }
            int i = this.f10630k;
            float f = (float) i;
            float f2 = this.f10605x;
            int i2 = (int) (f / f2);
            int i3 = this.f10631l;
            if (i2 > i3) {
                float f3 = (float) i3;
                int i4 = (int) (f2 * f3);
                int i5 = (i - i4) / 2;
                this.f10603v.set((float) i5, 0.0f, (float) (i4 + i5), f3);
            } else {
                int i6 = (i3 - i2) / 2;
                this.f10603v.set(0.0f, (float) i6, f, (float) (i2 + i6));
            }
            mo17253h(intrinsicWidth, intrinsicHeight);
            float width = this.f10603v.width();
            float height = this.f10603v.height();
            float max = Math.max(this.f10603v.width() / intrinsicWidth, this.f10603v.height() / intrinsicHeight);
            RectF rectF = this.f10603v;
            float f4 = ((height - (intrinsicHeight * max)) / 2.0f) + rectF.top;
            this.f10629j.reset();
            this.f10629j.postScale(max, max);
            this.f10629j.postTranslate(((width - (intrinsicWidth * max)) / 2.0f) + rectF.left, f4);
            setImageMatrix(this.f10629j);
            C5276c cVar = this.f10607z;
            if (cVar != null) {
                ((C5300d) cVar).f10641a.f11593h.setTargetAspectRatio(this.f10605x);
            }
            C5298c.C5299a aVar = this.f10632m;
            if (aVar != null) {
                ((UCropActivity.C5851a) aVar).mo22893b(getCurrentScale());
                ((UCropActivity.C5851a) this.f10632m).mo22892a(getCurrentAngle());
            }
        }
    }

    /* renamed from: f */
    public void mo17248f(float f, float f2, float f3) {
        if ((f > 1.0f && getCurrentScale() * f <= getMaxScale()) || (f < 1.0f && getCurrentScale() * f >= getMinScale())) {
            super.mo17248f(f, f2, f3);
        }
    }

    @Nullable
    public C5276c getCropBoundsChangeListener() {
        return this.f10607z;
    }

    public float getMaxScale() {
        return this.f10598C;
    }

    public float getMinScale() {
        return this.f10599D;
    }

    public float getTargetAspectRatio() {
        return this.f10605x;
    }

    /* renamed from: h */
    public final void mo17253h(float f, float f2) {
        float min = Math.min(Math.min(this.f10603v.width() / f, this.f10603v.width() / f2), Math.min(this.f10603v.height() / f2, this.f10603v.height() / f));
        this.f10599D = min;
        this.f10598C = min * this.f10606y;
    }

    /* renamed from: i */
    public void mo17254i() {
        removeCallbacks(this.f10596A);
        removeCallbacks(this.f10597B);
    }

    /* renamed from: j */
    public boolean mo17255j(float[] fArr) {
        this.f10604w.reset();
        this.f10604w.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.f10604w.mapPoints(copyOf);
        float[] m1 = C5266a.m9991m1(this.f10603v);
        this.f10604w.mapPoints(m1);
        return C5266a.m9799E4(copyOf).contains(C5266a.m9799E4(m1));
    }

    /* renamed from: k */
    public void mo17256k(float f) {
        mo17271e(f, this.f10603v.centerX(), this.f10603v.centerY());
    }

    /* renamed from: l */
    public void mo17257l(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            mo17248f(f / getCurrentScale(), f2, f3);
        }
    }

    public void setCropBoundsChangeListener(@Nullable C5276c cVar) {
        this.f10607z = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.f10605x = rectF.width() / rectF.height();
        this.f10603v.set(rectF.left - ((float) getPaddingLeft()), rectF.top - ((float) getPaddingTop()), rectF.right - ((float) getPaddingRight()), rectF.bottom - ((float) getPaddingBottom()));
        Drawable drawable = getDrawable();
        if (drawable != null) {
            mo17253h((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        boolean z2;
        float f2;
        float f3;
        float f4;
        if (this.f10636q && !mo17255j(this.f10626g)) {
            float[] fArr = this.f10627h;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float currentScale = getCurrentScale();
            float centerX = this.f10603v.centerX() - f5;
            float centerY = this.f10603v.centerY() - f6;
            this.f10604w.reset();
            this.f10604w.setTranslate(centerX, centerY);
            float[] fArr2 = this.f10626g;
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            this.f10604w.mapPoints(copyOf);
            boolean j = mo17255j(copyOf);
            if (j) {
                this.f10604w.reset();
                this.f10604w.setRotate(-getCurrentAngle());
                float[] fArr3 = this.f10626g;
                float[] copyOf2 = Arrays.copyOf(fArr3, fArr3.length);
                float[] m1 = C5266a.m9991m1(this.f10603v);
                this.f10604w.mapPoints(copyOf2);
                this.f10604w.mapPoints(m1);
                RectF E4 = C5266a.m9799E4(copyOf2);
                RectF E42 = C5266a.m9799E4(m1);
                float f7 = E4.left - E42.left;
                float f8 = E4.top - E42.top;
                float f9 = E4.right - E42.right;
                float f10 = E4.bottom - E42.bottom;
                float[] fArr4 = new float[4];
                if (f7 <= 0.0f) {
                    f7 = 0.0f;
                }
                fArr4[0] = f7;
                if (f8 <= 0.0f) {
                    f8 = 0.0f;
                }
                fArr4[1] = f8;
                if (f9 >= 0.0f) {
                    f9 = 0.0f;
                }
                fArr4[2] = f9;
                if (f10 >= 0.0f) {
                    f10 = 0.0f;
                }
                fArr4[3] = f10;
                this.f10604w.reset();
                this.f10604w.setRotate(getCurrentAngle());
                this.f10604w.mapPoints(fArr4);
                f3 = -(fArr4[1] + fArr4[3]);
                f2 = 0.0f;
                f = currentScale;
                z2 = j;
                f4 = -(fArr4[0] + fArr4[2]);
            } else {
                RectF rectF = new RectF(this.f10603v);
                this.f10604w.reset();
                this.f10604w.setRotate(getCurrentAngle());
                this.f10604w.mapRect(rectF);
                float[] fArr5 = this.f10626g;
                z2 = j;
                f = currentScale;
                float[] fArr6 = {(float) Math.sqrt(Math.pow((double) (fArr5[1] - fArr5[3]), 2.0d) + Math.pow((double) (fArr5[0] - fArr5[2]), 2.0d)), (float) Math.sqrt(Math.pow((double) (fArr5[3] - fArr5[5]), 2.0d) + Math.pow((double) (fArr5[2] - fArr5[4]), 2.0d))};
                f4 = centerX;
                f2 = (Math.max(rectF.width() / fArr6[0], rectF.height() / fArr6[1]) * f) - f;
                f3 = centerY;
            }
            if (z) {
                C5295a aVar = new C5295a(this, this.f10602G, f5, f6, f4, f3, f, f2, z2);
                this.f10596A = aVar;
                post(aVar);
                return;
            }
            mo17272g(f4, f3);
            if (!z2) {
                mo17257l(f + f2, this.f10603v.centerX(), this.f10603v.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(@IntRange(from = 100) long j) {
        if (j > 0) {
            this.f10602G = j;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxResultImageSizeX(@IntRange(from = 10) int i) {
        this.f10600E = i;
    }

    public void setMaxResultImageSizeY(@IntRange(from = 10) int i) {
        this.f10601F = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.f10606y = f;
    }

    public void setTargetAspectRatio(float f) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.f10605x = f;
            return;
        }
        if (f == 0.0f) {
            f = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        }
        this.f10605x = f;
        C5276c cVar = this.f10607z;
        if (cVar != null) {
            ((C5300d) cVar).f10641a.f11593h.setTargetAspectRatio(f);
        }
    }
}
