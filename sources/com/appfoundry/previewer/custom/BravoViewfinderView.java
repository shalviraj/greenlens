package com.appfoundry.previewer.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.segment.analytics.integrations.BasePayload;
import java.util.List;
import kotlin.Metadata;
import p005b.p096l.p232f.C4625s;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, mo24462d2 = {"Lcom/appfoundry/previewer/custom/BravoViewfinderView;", "Lcom/journeyapps/barcodescanner/ViewfinderView;", "Landroid/graphics/Canvas;", "canvas", "Ld/r;", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class BravoViewfinderView extends ViewfinderView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BravoViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6888i.m12438e(context, BasePayload.CONTEXT_KEY);
    }

    public void onDraw(Canvas canvas) {
        C6888i.m12438e(canvas, "canvas");
        mo22217a();
        Rect rect = this.f11484p;
        if (rect != null && this.f11485q != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Paint paint = this.f11475g;
            C6888i.m12437d(paint, "paint");
            paint.setColor(ContextCompat.getColor(getContext(), R.color.previewer_qr_background));
            float f = (float) width;
            canvas.drawRect(0.0f, 0.0f, f, (float) rect.top, this.f11475g);
            canvas.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), this.f11475g);
            float f2 = f;
            canvas.drawRect((float) (rect.right + 1), (float) rect.top, f2, (float) (rect.bottom + 1), this.f11475g);
            canvas.drawRect(0.0f, (float) (rect.bottom + 1), f2, (float) height, this.f11475g);
            C6888i.m12437d(rect, "frame");
            Paint paint2 = this.f11475g;
            C6888i.m12437d(paint2, "paint");
            paint2.setColor(this.f11478j);
            Paint paint3 = this.f11475g;
            C6888i.m12437d(paint3, "paint");
            int[] iArr = ViewfinderView.f11474r;
            paint3.setAlpha(iArr[this.f11480l]);
            this.f11480l = (this.f11480l + 1) % iArr.length;
            float width2 = ((float) rect.width()) / ((float) this.f11485q.f9029g);
            float height2 = ((float) rect.height()) / ((float) this.f11485q.f9030h);
            int i = rect.left;
            int i2 = rect.top;
            List<C4625s> list = this.f11482n;
            C6888i.m12437d(list, "lastPossibleResultPoints");
            if (!list.isEmpty()) {
                Paint paint4 = this.f11475g;
                C6888i.m12437d(paint4, "paint");
                paint4.setAlpha(80);
                Paint paint5 = this.f11475g;
                C6888i.m12437d(paint5, "paint");
                paint5.setColor(this.f11479k);
                for (C4625s next : this.f11482n) {
                    C6888i.m12437d(next, "point");
                    canvas.drawCircle((float) (((int) (next.f8708a * width2)) + i), (float) (((int) (next.f8709b * height2)) + i2), 3.0f, this.f11475g);
                }
                this.f11482n.clear();
            }
            List<C4625s> list2 = this.f11481m;
            C6888i.m12437d(list2, "possibleResultPoints");
            if (!list2.isEmpty()) {
                Paint paint6 = this.f11475g;
                C6888i.m12437d(paint6, "paint");
                paint6.setAlpha(160);
                Paint paint7 = this.f11475g;
                C6888i.m12437d(paint7, "paint");
                paint7.setColor(this.f11479k);
                for (C4625s next2 : this.f11481m) {
                    C6888i.m12437d(next2, "point");
                    canvas.drawCircle((float) (((int) (next2.f8708a * width2)) + i), (float) (((int) (next2.f8709b * height2)) + i2), (float) 6, this.f11475g);
                }
                List<C4625s> list3 = this.f11481m;
                List<C4625s> list4 = this.f11482n;
                this.f11481m = list4;
                this.f11482n = list3;
                list4.clear();
            }
            postInvalidateDelayed(80, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }
}
