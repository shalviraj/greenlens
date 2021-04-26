package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import p005b.p291q.p292a.C5266a;
import p005b.p291q.p292a.p293i.C5277d;
import p005b.p291q.p292a.p297m.C5301e;

public class OverlayView extends View {

    /* renamed from: A */
    public float f11565A = -1.0f;

    /* renamed from: B */
    public int f11566B = -1;

    /* renamed from: C */
    public int f11567C = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);

    /* renamed from: D */
    public int f11568D = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);

    /* renamed from: E */
    public int f11569E = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);

    /* renamed from: F */
    public C5277d f11570F;

    /* renamed from: G */
    public boolean f11571G;

    /* renamed from: g */
    public final RectF f11572g = new RectF();

    /* renamed from: h */
    public final RectF f11573h = new RectF();

    /* renamed from: i */
    public int f11574i;

    /* renamed from: j */
    public int f11575j;

    /* renamed from: k */
    public float[] f11576k;

    /* renamed from: l */
    public int f11577l;

    /* renamed from: m */
    public int f11578m;

    /* renamed from: n */
    public float f11579n;

    /* renamed from: o */
    public float[] f11580o = null;

    /* renamed from: p */
    public boolean f11581p;

    /* renamed from: q */
    public boolean f11582q;

    /* renamed from: r */
    public boolean f11583r;

    /* renamed from: s */
    public int f11584s;

    /* renamed from: t */
    public Path f11585t = new Path();

    /* renamed from: u */
    public Paint f11586u = new Paint(1);

    /* renamed from: v */
    public Paint f11587v = new Paint(1);

    /* renamed from: w */
    public Paint f11588w = new Paint(1);

    /* renamed from: x */
    public Paint f11589x = new Paint(1);

    /* renamed from: y */
    public int f11590y = 0;

    /* renamed from: z */
    public float f11591z = -1.0f;

    public OverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo22904a() {
        this.f11576k = C5266a.m9991m1(this.f11572g);
        C5266a.m9961h1(this.f11572g);
        this.f11580o = null;
        this.f11585t.reset();
        this.f11585t.addCircle(this.f11572g.centerX(), this.f11572g.centerY(), Math.min(this.f11572g.width(), this.f11572g.height()) / 2.0f, Path.Direction.CW);
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.f11572g;
    }

    public int getFreestyleCropMode() {
        return this.f11590y;
    }

    public C5277d getOverlayViewChangeListener() {
        return this.f11570F;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        if (this.f11583r) {
            canvas.clipPath(this.f11585t, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f11572g, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f11584s);
        canvas.restore();
        if (this.f11583r) {
            canvas.drawCircle(this.f11572g.centerX(), this.f11572g.centerY(), Math.min(this.f11572g.width(), this.f11572g.height()) / 2.0f, this.f11586u);
        }
        if (this.f11582q) {
            if (this.f11580o == null && !this.f11572g.isEmpty()) {
                this.f11580o = new float[((this.f11578m * 4) + (this.f11577l * 4))];
                int i = 0;
                for (int i2 = 0; i2 < this.f11577l; i2++) {
                    float[] fArr = this.f11580o;
                    int i3 = i + 1;
                    RectF rectF = this.f11572g;
                    fArr[i] = rectF.left;
                    int i4 = i3 + 1;
                    float f = ((float) i2) + 1.0f;
                    float height = (f / ((float) (this.f11577l + 1))) * rectF.height();
                    RectF rectF2 = this.f11572g;
                    fArr[i3] = height + rectF2.top;
                    float[] fArr2 = this.f11580o;
                    int i5 = i4 + 1;
                    fArr2[i4] = rectF2.right;
                    i = i5 + 1;
                    fArr2[i5] = ((f / ((float) (this.f11577l + 1))) * rectF2.height()) + this.f11572g.top;
                }
                for (int i6 = 0; i6 < this.f11578m; i6++) {
                    float[] fArr3 = this.f11580o;
                    int i7 = i + 1;
                    float f2 = ((float) i6) + 1.0f;
                    float width = (f2 / ((float) (this.f11578m + 1))) * this.f11572g.width();
                    RectF rectF3 = this.f11572g;
                    fArr3[i] = width + rectF3.left;
                    float[] fArr4 = this.f11580o;
                    int i8 = i7 + 1;
                    fArr4[i7] = rectF3.top;
                    int i9 = i8 + 1;
                    float width2 = (f2 / ((float) (this.f11578m + 1))) * rectF3.width();
                    RectF rectF4 = this.f11572g;
                    fArr4[i8] = width2 + rectF4.left;
                    i = i9 + 1;
                    this.f11580o[i9] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f11580o;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f11587v);
            }
        }
        if (this.f11581p) {
            canvas.drawRect(this.f11572g, this.f11588w);
        }
        if (this.f11590y != 0) {
            canvas.save();
            this.f11573h.set(this.f11572g);
            RectF rectF5 = this.f11573h;
            int i10 = this.f11569E;
            rectF5.inset((float) i10, (float) (-i10));
            canvas.clipRect(this.f11573h, Region.Op.DIFFERENCE);
            this.f11573h.set(this.f11572g);
            RectF rectF6 = this.f11573h;
            int i11 = this.f11569E;
            rectF6.inset((float) (-i11), (float) i11);
            canvas.clipRect(this.f11573h, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f11572g, this.f11589x);
            canvas.restore();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f11574i = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f11575j = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.f11571G) {
                this.f11571G = false;
                setTargetAspectRatio(this.f11579n);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019f, code lost:
        if (r16 == false) goto L_0x01a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            android.graphics.RectF r1 = r0.f11572g
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01cd
            int r1 = r0.f11590y
            if (r1 != 0) goto L_0x0010
            goto L_0x01cd
        L_0x0010:
            float r1 = r19.getX()
            float r3 = r19.getY()
            int r4 = r19.getAction()
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = -1
            r8 = 1
            if (r4 != 0) goto L_0x0081
            int r4 = r0.f11567C
            double r9 = (double) r4
            r11 = r5
            r4 = 0
        L_0x0027:
            r12 = 8
            if (r4 >= r12) goto L_0x0054
            float[] r12 = r0.f11576k
            r12 = r12[r4]
            float r12 = r1 - r12
            double r12 = (double) r12
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = java.lang.Math.pow(r12, r14)
            float[] r2 = r0.f11576k
            int r17 = r4 + 1
            r2 = r2[r17]
            float r2 = r3 - r2
            double r6 = (double) r2
            double r6 = java.lang.Math.pow(r6, r14)
            double r6 = r6 + r12
            double r6 = java.lang.Math.sqrt(r6)
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0051
            int r11 = r4 / 2
            r9 = r6
        L_0x0051:
            int r4 = r4 + 2
            goto L_0x0027
        L_0x0054:
            int r2 = r0.f11590y
            if (r2 != r8) goto L_0x0064
            if (r11 >= 0) goto L_0x0064
            android.graphics.RectF r2 = r0.f11572g
            boolean r2 = r2.contains(r1, r3)
            if (r2 == 0) goto L_0x0064
            r6 = 4
            goto L_0x0065
        L_0x0064:
            r6 = r11
        L_0x0065:
            r0.f11566B = r6
            if (r6 == r5) goto L_0x006b
            r2 = r8
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r2 != 0) goto L_0x0075
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.f11591z = r4
            r0.f11565A = r4
            goto L_0x0080
        L_0x0075:
            float r4 = r0.f11591z
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0080
            r0.f11591z = r1
            r0.f11565A = r3
        L_0x0080:
            return r2
        L_0x0081:
            int r2 = r19.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r4 = 2
            if (r2 != r4) goto L_0x01ac
            int r2 = r19.getPointerCount()
            if (r2 != r8) goto L_0x01ac
            int r2 = r0.f11566B
            if (r2 == r5) goto L_0x01ac
            int r2 = r18.getPaddingLeft()
            float r2 = (float) r2
            float r1 = java.lang.Math.max(r1, r2)
            int r2 = r18.getWidth()
            int r5 = r18.getPaddingRight()
            int r2 = r2 - r5
            float r2 = (float) r2
            float r1 = java.lang.Math.min(r1, r2)
            int r2 = r18.getPaddingTop()
            float r2 = (float) r2
            float r2 = java.lang.Math.max(r3, r2)
            int r3 = r18.getHeight()
            int r5 = r18.getPaddingBottom()
            int r3 = r3 - r5
            float r3 = (float) r3
            float r2 = java.lang.Math.min(r2, r3)
            android.graphics.RectF r3 = r0.f11573h
            android.graphics.RectF r5 = r0.f11572g
            r3.set(r5)
            int r3 = r0.f11566B
            if (r3 == 0) goto L_0x0147
            if (r3 == r8) goto L_0x013b
            if (r3 == r4) goto L_0x012f
            r4 = 3
            if (r3 == r4) goto L_0x0123
            r4 = 4
            if (r3 == r4) goto L_0x00d9
            goto L_0x0152
        L_0x00d9:
            android.graphics.RectF r3 = r0.f11573h
            float r4 = r0.f11591z
            float r4 = r1 - r4
            float r5 = r0.f11565A
            float r5 = r2 - r5
            r3.offset(r4, r5)
            android.graphics.RectF r3 = r0.f11573h
            float r3 = r3.left
            int r4 = r18.getLeft()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a7
            android.graphics.RectF r3 = r0.f11573h
            float r3 = r3.top
            int r4 = r18.getTop()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a7
            android.graphics.RectF r3 = r0.f11573h
            float r3 = r3.right
            int r4 = r18.getRight()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a7
            android.graphics.RectF r3 = r0.f11573h
            float r3 = r3.bottom
            int r4 = r18.getBottom()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a7
            android.graphics.RectF r3 = r0.f11572g
            android.graphics.RectF r4 = r0.f11573h
            r3.set(r4)
            goto L_0x01a1
        L_0x0123:
            android.graphics.RectF r3 = r0.f11573h
            android.graphics.RectF r4 = r0.f11572g
            float r5 = r4.top
            float r4 = r4.right
            r3.set(r1, r5, r4, r2)
            goto L_0x0152
        L_0x012f:
            android.graphics.RectF r3 = r0.f11573h
            android.graphics.RectF r4 = r0.f11572g
            float r5 = r4.left
            float r4 = r4.top
            r3.set(r5, r4, r1, r2)
            goto L_0x0152
        L_0x013b:
            android.graphics.RectF r3 = r0.f11573h
            android.graphics.RectF r4 = r0.f11572g
            float r5 = r4.left
            float r4 = r4.bottom
            r3.set(r5, r2, r1, r4)
            goto L_0x0152
        L_0x0147:
            android.graphics.RectF r3 = r0.f11573h
            android.graphics.RectF r4 = r0.f11572g
            float r5 = r4.right
            float r4 = r4.bottom
            r3.set(r1, r2, r5, r4)
        L_0x0152:
            android.graphics.RectF r3 = r0.f11573h
            float r3 = r3.height()
            int r4 = r0.f11568D
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0161
            r3 = r8
            goto L_0x0162
        L_0x0161:
            r3 = 0
        L_0x0162:
            android.graphics.RectF r4 = r0.f11573h
            float r4 = r4.width()
            int r5 = r0.f11568D
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0172
            r16 = r8
            goto L_0x0174
        L_0x0172:
            r16 = 0
        L_0x0174:
            android.graphics.RectF r4 = r0.f11572g
            if (r16 == 0) goto L_0x017d
            android.graphics.RectF r5 = r0.f11573h
            float r5 = r5.left
            goto L_0x017f
        L_0x017d:
            float r5 = r4.left
        L_0x017f:
            if (r3 == 0) goto L_0x0186
            android.graphics.RectF r6 = r0.f11573h
            float r6 = r6.top
            goto L_0x0188
        L_0x0186:
            float r6 = r4.top
        L_0x0188:
            if (r16 == 0) goto L_0x018f
            android.graphics.RectF r7 = r0.f11573h
            float r7 = r7.right
            goto L_0x0191
        L_0x018f:
            float r7 = r4.right
        L_0x0191:
            if (r3 == 0) goto L_0x0198
            android.graphics.RectF r9 = r0.f11573h
            float r9 = r9.bottom
            goto L_0x019a
        L_0x0198:
            float r9 = r4.bottom
        L_0x019a:
            r4.set(r5, r6, r7, r9)
            if (r3 != 0) goto L_0x01a1
            if (r16 == 0) goto L_0x01a7
        L_0x01a1:
            r18.mo22904a()
            r18.postInvalidate()
        L_0x01a7:
            r0.f11591z = r1
            r0.f11565A = r2
            return r8
        L_0x01ac:
            int r1 = r19.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != r8) goto L_0x01cb
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.f11591z = r1
            r0.f11565A = r1
            r0.f11566B = r5
            b.q.a.i.d r1 = r0.f11570F
            if (r1 == 0) goto L_0x01cb
            android.graphics.RectF r2 = r0.f11572g
            b.q.a.m.e r1 = (p005b.p291q.p292a.p297m.C5301e) r1
            com.yalantis.ucrop.view.UCropView r1 = r1.f10642a
            com.yalantis.ucrop.view.GestureCropImageView r1 = r1.f11592g
            r1.setCropRect(r2)
        L_0x01cb:
            r1 = 0
            return r1
        L_0x01cd:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.view.OverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCircleDimmedLayer(boolean z) {
        this.f11583r = z;
    }

    public void setCropFrameColor(@ColorInt int i) {
        this.f11588w.setColor(i);
    }

    public void setCropFrameStrokeWidth(@IntRange(from = 0) int i) {
        this.f11588w.setStrokeWidth((float) i);
    }

    public void setCropGridColor(@ColorInt int i) {
        this.f11587v.setColor(i);
    }

    public void setCropGridColumnCount(@IntRange(from = 0) int i) {
        this.f11578m = i;
        this.f11580o = null;
    }

    public void setCropGridRowCount(@IntRange(from = 0) int i) {
        this.f11577l = i;
        this.f11580o = null;
    }

    public void setCropGridStrokeWidth(@IntRange(from = 0) int i) {
        this.f11587v.setStrokeWidth((float) i);
    }

    public void setDimmedColor(@ColorInt int i) {
        this.f11584s = i;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.f11590y = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.f11590y = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(C5277d dVar) {
        this.f11570F = dVar;
    }

    public void setShowCropFrame(boolean z) {
        this.f11581p = z;
    }

    public void setShowCropGrid(boolean z) {
        this.f11582q = z;
    }

    public void setTargetAspectRatio(float f) {
        this.f11579n = f;
        int i = this.f11574i;
        if (i > 0) {
            int i2 = (int) (((float) i) / f);
            int i3 = this.f11575j;
            if (i2 > i3) {
                int i4 = (int) (((float) i3) * f);
                int i5 = (i - i4) / 2;
                this.f11572g.set((float) (getPaddingLeft() + i5), (float) getPaddingTop(), (float) (getPaddingLeft() + i4 + i5), (float) (getPaddingTop() + this.f11575j));
            } else {
                int i6 = (i3 - i2) / 2;
                this.f11572g.set((float) getPaddingLeft(), (float) (getPaddingTop() + i6), (float) (getPaddingLeft() + this.f11574i), (float) (getPaddingTop() + i2 + i6));
            }
            C5277d dVar = this.f11570F;
            if (dVar != null) {
                ((C5301e) dVar).f10642a.f11592g.setCropRect(this.f11572g);
            }
            mo22904a();
            postInvalidate();
            return;
        }
        this.f11571G = true;
    }
}
