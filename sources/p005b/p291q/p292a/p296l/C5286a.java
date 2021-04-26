package p005b.p291q.p292a.p296l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: b.q.a.l.a */
public class C5286a extends Drawable {

    /* renamed from: a */
    public final Paint f10577a = new Paint(2);

    /* renamed from: b */
    public Bitmap f10578b;

    /* renamed from: c */
    public int f10579c = 255;

    /* renamed from: d */
    public int f10580d;

    /* renamed from: e */
    public int f10581e;

    public C5286a(Bitmap bitmap) {
        this.f10578b = bitmap;
        if (bitmap != null) {
            this.f10580d = bitmap.getWidth();
            this.f10581e = this.f10578b.getHeight();
            return;
        }
        this.f10581e = 0;
        this.f10580d = 0;
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f10578b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f10578b, (Rect) null, getBounds(), this.f10577a);
        }
    }

    public int getAlpha() {
        return this.f10579c;
    }

    public int getIntrinsicHeight() {
        return this.f10581e;
    }

    public int getIntrinsicWidth() {
        return this.f10580d;
    }

    public int getMinimumHeight() {
        return this.f10581e;
    }

    public int getMinimumWidth() {
        return this.f10580d;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.f10579c = i;
        this.f10577a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f10577a.setColorFilter(colorFilter);
    }

    public void setFilterBitmap(boolean z) {
        this.f10577a.setFilterBitmap(z);
    }
}
