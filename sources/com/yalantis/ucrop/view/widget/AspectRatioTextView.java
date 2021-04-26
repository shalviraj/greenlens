package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.util.Locale;
import p005b.p291q.p292a.C5267b;
import p005b.p291q.p292a.p294j.C5278a;

public class AspectRatioTextView extends AppCompatTextView {

    /* renamed from: g */
    public final Rect f11594g = new Rect();

    /* renamed from: h */
    public Paint f11595h;

    /* renamed from: i */
    public int f11596i;

    /* renamed from: j */
    public float f11597j;

    /* renamed from: k */
    public String f11598k;

    /* renamed from: l */
    public float f11599l;

    /* renamed from: m */
    public float f11600m;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5267b.f10526a);
        setGravity(1);
        this.f11598k = obtainStyledAttributes.getString(0);
        this.f11599l = obtainStyledAttributes.getFloat(1, 0.0f);
        float f = obtainStyledAttributes.getFloat(2, 0.0f);
        this.f11600m = f;
        float f2 = this.f11599l;
        if (f2 == 0.0f || f == 0.0f) {
            this.f11597j = 0.0f;
        } else {
            this.f11597j = f2 / f;
        }
        this.f11596i = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f11595h = paint;
        paint.setStyle(Paint.Style.FILL);
        mo22929b();
        mo22928a(getResources().getColor(R.color.ucrop_color_widget_active));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo22928a(@ColorInt int i) {
        Paint paint = this.f11595h;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i, ContextCompat.getColor(getContext(), R.color.ucrop_color_widget)}));
    }

    /* renamed from: b */
    public final void mo22929b() {
        String str;
        if (!TextUtils.isEmpty(this.f11598k)) {
            str = this.f11598k;
        } else {
            str = String.format(Locale.US, "%d:%d", new Object[]{Integer.valueOf((int) this.f11599l), Integer.valueOf((int) this.f11600m)});
        }
        setText(str);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f11594g);
            Rect rect = this.f11594g;
            float f = ((float) rect.bottom) - (((float) rect.top) / 2.0f);
            int i = this.f11596i;
            canvas.drawCircle(((float) (rect.right - rect.left)) / 2.0f, f - (((float) i) * 1.5f), ((float) i) / 2.0f, this.f11595h);
        }
    }

    public void setActiveColor(@ColorInt int i) {
        mo22928a(i);
        invalidate();
    }

    public void setAspectRatio(@NonNull C5278a aVar) {
        this.f11598k = aVar.f10534g;
        float f = aVar.f10535h;
        this.f11599l = f;
        float f2 = aVar.f10536i;
        this.f11600m = f2;
        if (f == 0.0f || f2 == 0.0f) {
            this.f11597j = 0.0f;
        } else {
            this.f11597j = f / f2;
        }
        mo22929b();
    }
}
