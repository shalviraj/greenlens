package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.util.ArrayList;
import java.util.List;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p254x.p255a.C4654g;
import p005b.p265m.p266a.C4701d;
import p005b.p265m.p266a.C4729r;

public class ViewfinderView extends View {

    /* renamed from: r */
    public static final int[] f11474r = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: g */
    public final Paint f11475g = new Paint(1);

    /* renamed from: h */
    public int f11476h;

    /* renamed from: i */
    public final int f11477i;

    /* renamed from: j */
    public final int f11478j;

    /* renamed from: k */
    public final int f11479k;

    /* renamed from: l */
    public int f11480l;

    /* renamed from: m */
    public List<C4625s> f11481m;

    /* renamed from: n */
    public List<C4625s> f11482n;

    /* renamed from: o */
    public C4701d f11483o;

    /* renamed from: p */
    public Rect f11484p;

    /* renamed from: q */
    public C4729r f11485q;

    /* renamed from: com.journeyapps.barcodescanner.ViewfinderView$a */
    public class C5774a implements C4701d.C4706e {
        public C5774a() {
        }

        /* renamed from: a */
        public void mo16431a() {
            ViewfinderView.this.mo22217a();
            ViewfinderView.this.invalidate();
        }

        /* renamed from: b */
        public void mo16432b(Exception exc) {
        }

        /* renamed from: c */
        public void mo16433c() {
        }

        /* renamed from: d */
        public void mo16434d() {
        }

        /* renamed from: e */
        public void mo16435e() {
        }
    }

    static {
        Class<ViewfinderView> cls = ViewfinderView.class;
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4654g.f8781b);
        this.f11476h = obtainStyledAttributes.getColor(3, resources.getColor(R.color.zxing_viewfinder_mask));
        this.f11477i = obtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.f11478j = obtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.f11479k = obtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        obtainStyledAttributes.recycle();
        this.f11480l = 0;
        this.f11481m = new ArrayList(20);
        this.f11482n = new ArrayList(20);
    }

    /* renamed from: a */
    public void mo22217a() {
        C4701d dVar = this.f11483o;
        if (dVar != null) {
            Rect framingRect = dVar.getFramingRect();
            C4729r previewSize = this.f11483o.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f11484p = framingRect;
                this.f11485q = previewSize;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        C4729r rVar;
        mo22217a();
        Rect rect = this.f11484p;
        if (rect != null && (rVar = this.f11485q) != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            this.f11475g.setColor(this.f11476h);
            float f = (float) width;
            canvas.drawRect(0.0f, 0.0f, f, (float) rect.top, this.f11475g);
            canvas.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), this.f11475g);
            float f2 = f;
            canvas.drawRect((float) (rect.right + 1), (float) rect.top, f2, (float) (rect.bottom + 1), this.f11475g);
            canvas.drawRect(0.0f, (float) (rect.bottom + 1), f2, (float) height, this.f11475g);
            this.f11475g.setColor(this.f11478j);
            Paint paint = this.f11475g;
            int[] iArr = f11474r;
            paint.setAlpha(iArr[this.f11480l]);
            this.f11480l = (this.f11480l + 1) % iArr.length;
            int height2 = (rect.height() / 2) + rect.top;
            canvas.drawRect((float) (rect.left + 2), (float) (height2 - 1), (float) (rect.right - 1), (float) (height2 + 2), this.f11475g);
            float width2 = ((float) getWidth()) / ((float) rVar.f9029g);
            float height3 = ((float) getHeight()) / ((float) rVar.f9030h);
            if (!this.f11482n.isEmpty()) {
                this.f11475g.setAlpha(80);
                this.f11475g.setColor(this.f11479k);
                for (C4625s next : this.f11482n) {
                    canvas.drawCircle((float) ((int) (next.f8708a * width2)), (float) ((int) (next.f8709b * height3)), 3.0f, this.f11475g);
                }
                this.f11482n.clear();
            }
            if (!this.f11481m.isEmpty()) {
                this.f11475g.setAlpha(160);
                this.f11475g.setColor(this.f11479k);
                for (C4625s next2 : this.f11481m) {
                    canvas.drawCircle((float) ((int) (next2.f8708a * width2)), (float) ((int) (next2.f8709b * height3)), 6.0f, this.f11475g);
                }
                List<C4625s> list = this.f11481m;
                List<C4625s> list2 = this.f11482n;
                this.f11481m = list2;
                this.f11482n = list;
                list2.clear();
            }
            postInvalidateDelayed(80, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }

    public void setCameraPreview(C4701d dVar) {
        this.f11483o = dVar;
        dVar.f8963p.add(new C5774a());
    }

    public void setMaskColor(int i) {
        this.f11476h = i;
    }
}
