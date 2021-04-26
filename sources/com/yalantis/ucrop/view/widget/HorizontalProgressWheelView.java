package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;

public class HorizontalProgressWheelView extends View {

    /* renamed from: g */
    public final Rect f11601g = new Rect();

    /* renamed from: h */
    public C5857a f11602h;

    /* renamed from: i */
    public float f11603i;

    /* renamed from: j */
    public Paint f11604j;

    /* renamed from: k */
    public Paint f11605k;

    /* renamed from: l */
    public int f11606l = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_horizontal_wheel_progress_line);

    /* renamed from: m */
    public int f11607m = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_height_horizontal_wheel_progress_line);

    /* renamed from: n */
    public int f11608n = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_margin_horizontal_wheel_progress_line);

    /* renamed from: o */
    public boolean f11609o;

    /* renamed from: p */
    public float f11610p;

    /* renamed from: q */
    public int f11611q = ContextCompat.getColor(getContext(), R.color.ucrop_color_widget_rotate_mid_line);

    /* renamed from: com.yalantis.ucrop.view.widget.HorizontalProgressWheelView$a */
    public interface C5857a {
        /* renamed from: a */
        void mo17214a(float f, float f2);

        /* renamed from: b */
        void mo17215b();

        /* renamed from: c */
        void mo17216c();
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.f11604j = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f11604j.setStrokeWidth((float) this.f11606l);
        this.f11604j.setColor(getResources().getColor(R.color.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.f11604j);
        this.f11605k = paint2;
        paint2.setColor(this.f11611q);
        this.f11605k.setStrokeCap(Paint.Cap.ROUND);
        this.f11605k.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_middle_wheel_progress_line));
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        float f;
        super.onDraw(canvas);
        canvas.getClipBounds(this.f11601g);
        int width = this.f11601g.width();
        int i = this.f11606l;
        int i2 = this.f11608n;
        int i3 = width / (i + i2);
        float f2 = this.f11610p % ((float) (i2 + i));
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i3 / 4;
            if (i4 < i5) {
                paint = this.f11604j;
                f = (float) i4;
            } else if (i4 > (i3 * 3) / 4) {
                paint = this.f11604j;
                f = (float) (i3 - i4);
            } else {
                this.f11604j.setAlpha(255);
                float f3 = -f2;
                Rect rect = this.f11601g;
                float f4 = ((float) rect.left) + f3 + ((float) ((this.f11606l + this.f11608n) * i4));
                float centerY = ((float) rect.centerY()) - (((float) this.f11607m) / 4.0f);
                Rect rect2 = this.f11601g;
                Canvas canvas2 = canvas;
                canvas2.drawLine(f4, centerY, f3 + ((float) rect2.left) + ((float) ((this.f11606l + this.f11608n) * i4)), (((float) this.f11607m) / 4.0f) + ((float) rect2.centerY()), this.f11604j);
            }
            paint.setAlpha((int) ((f / ((float) i5)) * 255.0f));
            float f32 = -f2;
            Rect rect3 = this.f11601g;
            float f42 = ((float) rect3.left) + f32 + ((float) ((this.f11606l + this.f11608n) * i4));
            float centerY2 = ((float) rect3.centerY()) - (((float) this.f11607m) / 4.0f);
            Rect rect22 = this.f11601g;
            Canvas canvas22 = canvas;
            canvas22.drawLine(f42, centerY2, f32 + ((float) rect22.left) + ((float) ((this.f11606l + this.f11608n) * i4)), (((float) this.f11607m) / 4.0f) + ((float) rect22.centerY()), this.f11604j);
        }
        float centerX = (float) this.f11601g.centerX();
        float centerY3 = ((float) this.f11601g.centerY()) - (((float) this.f11607m) / 2.0f);
        Canvas canvas3 = canvas;
        float f5 = centerY3;
        canvas3.drawLine(centerX, f5, (float) this.f11601g.centerX(), (((float) this.f11607m) / 2.0f) + ((float) this.f11601g.centerY()), this.f11605k);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11603i = motionEvent.getX();
        } else if (action == 1) {
            C5857a aVar = this.f11602h;
            if (aVar != null) {
                this.f11609o = false;
                aVar.mo17215b();
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f11603i;
            if (x != 0.0f) {
                if (!this.f11609o) {
                    this.f11609o = true;
                    C5857a aVar2 = this.f11602h;
                    if (aVar2 != null) {
                        aVar2.mo17216c();
                    }
                }
                this.f11610p -= x;
                postInvalidate();
                this.f11603i = motionEvent.getX();
                C5857a aVar3 = this.f11602h;
                if (aVar3 != null) {
                    aVar3.mo17214a(-x, this.f11610p);
                }
            }
        }
        return true;
    }

    public void setMiddleLineColor(@ColorInt int i) {
        this.f11611q = i;
        this.f11605k.setColor(i);
        invalidate();
    }

    public void setScrollingListener(C5857a aVar) {
        this.f11602h = aVar;
    }
}
