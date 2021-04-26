package com.andrefrsousa.superbottomsheet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.segment.analytics.integrations.BasePayload;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006("}, mo24462d2 = {"Lcom/andrefrsousa/superbottomsheet/CornerRadiusFrameLayout;", "Landroid/widget/FrameLayout;", "", "w", "h", "oldw", "oldh", "Ld/r;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "radius", "setCornerRadius$lib_release", "(F)V", "setCornerRadius", "Landroid/graphics/RectF;", "i", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "path", "", "j", "[F", "outerRadii", "", "g", "Z", "noCornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lib_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class CornerRadiusFrameLayout extends FrameLayout {

    /* renamed from: g */
    public boolean f10705g = true;

    /* renamed from: h */
    public final Path f10706h = new Path();

    /* renamed from: i */
    public final RectF f10707i = new RectF();

    /* renamed from: j */
    public final float[] f10708j = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CornerRadiusFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6888i.m12438e(context, BasePayload.CONTEXT_KEY);
    }

    public void draw(Canvas canvas) {
        if (this.f10705g) {
            super.draw(canvas);
            return;
        }
        C6888i.m12436c(canvas);
        int save = canvas.save();
        canvas.clipPath(this.f10706h);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f10707i.set(0.0f, 0.0f, (float) i, (float) i2);
        Path path = this.f10706h;
        path.reset();
        path.addRoundRect(this.f10707i, this.f10708j, Path.Direction.CW);
        path.close();
    }

    public final void setCornerRadius$lib_release(float f) {
        float[] fArr = this.f10708j;
        boolean z = false;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        if (f == 0.0f) {
            z = true;
        }
        this.f10705g = z;
        if (getWidth() != 0 && getHeight() != 0) {
            Path path = this.f10706h;
            path.reset();
            path.addRoundRect(this.f10707i, this.f10708j, Path.Direction.CW);
            path.close();
            invalidate();
        }
    }
}
