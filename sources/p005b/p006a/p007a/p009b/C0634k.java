package p005b.p006a.p007a.p009b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import p005b.p006a.p007a.p019j.C0780k;

/* renamed from: b.a.a.b.k */
public class C0634k extends View {

    /* renamed from: g */
    public Paint f295g;

    /* renamed from: h */
    public Path f296h;

    /* renamed from: i */
    public RectF f297i;

    /* renamed from: j */
    public C0780k f298j;

    public C0634k(Context context, C0780k kVar) {
        super(context);
        this.f298j = kVar;
        Paint paint = new Paint(1);
        this.f295g = paint;
        paint.setColor(0);
        float f = this.f298j.f555e;
        float f2 = 0.0f;
        f = f == 0.0f ? 0.001f : f;
        this.f296h = new Path();
        C0780k kVar2 = this.f298j;
        RectF rectF = new RectF(f, f, ((float) kVar2.f551a) - f, ((float) kVar2.f552b) - f);
        this.f297i = rectF;
        this.f296h.addRoundRect(rectF, this.f298j.f558h, Path.Direction.CW);
        C0780k kVar3 = this.f298j;
        float f3 = kVar3.f557g;
        this.f295g.setShadowLayer(f, kVar3.f556f, f3 >= 0.0f ? f3 : f2, kVar3.f554d);
        if (Build.VERSION.SDK_INT <= 27) {
            setLayerType(1, (Paint) null);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f296h, this.f295g);
    }
}
