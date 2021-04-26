package com.yalantis.ucrop.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import java.util.Objects;
import p005b.p291q.p292a.p296l.C5290c;
import p005b.p291q.p292a.p297m.C5294a;

public class GestureCropImageView extends C5294a {

    /* renamed from: H */
    public ScaleGestureDetector f11554H;

    /* renamed from: I */
    public C5290c f11555I;

    /* renamed from: J */
    public GestureDetector f11556J;

    /* renamed from: K */
    public float f11557K;

    /* renamed from: L */
    public float f11558L;

    /* renamed from: M */
    public boolean f11559M = true;

    /* renamed from: N */
    public boolean f11560N = true;

    /* renamed from: O */
    public int f11561O = 5;

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$b */
    public class C5854b extends GestureDetector.SimpleOnGestureListener {
        public C5854b(C5853a aVar) {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            float doubleTapTargetScale = gestureCropImageView.getDoubleTapTargetScale();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (doubleTapTargetScale > gestureCropImageView.getMaxScale()) {
                doubleTapTargetScale = gestureCropImageView.getMaxScale();
            }
            float currentScale = gestureCropImageView.getCurrentScale();
            C5294a.C5296b bVar = new C5294a.C5296b(gestureCropImageView, 200, currentScale, doubleTapTargetScale - currentScale, x, y);
            gestureCropImageView.f10597B = bVar;
            gestureCropImageView.post(bVar);
            return super.onDoubleTap(motionEvent);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.mo17272g(-f, -f2);
            return true;
        }
    }

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$c */
    public class C5855c extends C5290c.C5292b {
        public C5855c(C5853a aVar) {
        }
    }

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$d */
    public class C5856d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C5856d(C5853a aVar) {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            GestureCropImageView gestureCropImageView2 = GestureCropImageView.this;
            gestureCropImageView.mo17248f(scaleFactor, gestureCropImageView2.f11557K, gestureCropImageView2.f11558L);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: c */
    public void mo17270c() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f11556J = new GestureDetector(getContext(), new C5854b((C5853a) null), (Handler) null, true);
        this.f11554H = new ScaleGestureDetector(getContext(), new C5856d((C5853a) null));
        this.f11555I = new C5290c(new C5855c((C5853a) null));
    }

    public int getDoubleTapScaleSteps() {
        return this.f11561O;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow((double) (getMaxScale() / getMinScale()), (double) (1.0f / ((float) this.f11561O))));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        if ((motionEvent.getAction() & 255) == 0) {
            mo17254i();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f11557K = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f11558L = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        this.f11556J.onTouchEvent(motionEvent);
        if (this.f11560N) {
            this.f11554H.onTouchEvent(motionEvent);
        }
        if (this.f11559M) {
            C5290c cVar = this.f11555I;
            Objects.requireNonNull(cVar);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                cVar.f10588c = motionEvent.getX();
                cVar.f10589d = motionEvent.getY();
                cVar.f10590e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            } else if (actionMasked == 1) {
                cVar.f10590e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    cVar.f10586a = motionEvent.getX();
                    cVar.f10587b = motionEvent.getY();
                    cVar.f10591f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                } else if (actionMasked == 6) {
                    cVar.f10591f = -1;
                }
            } else if (!(cVar.f10590e == -1 || cVar.f10591f == -1 || motionEvent.getPointerCount() <= cVar.f10591f)) {
                float x = motionEvent.getX(cVar.f10590e);
                float y = motionEvent.getY(cVar.f10590e);
                float x2 = motionEvent.getX(cVar.f10591f);
                float y2 = motionEvent.getY(cVar.f10591f);
                if (cVar.f10593h) {
                    cVar.f10592g = 0.0f;
                    cVar.f10593h = false;
                } else {
                    float f2 = cVar.f10586a;
                    float degrees = (((float) Math.toDegrees((double) ((float) Math.atan2((double) (y2 - y), (double) (x2 - x))))) % 360.0f) - (((float) Math.toDegrees((double) ((float) Math.atan2((double) (cVar.f10587b - cVar.f10589d), (double) (f2 - cVar.f10588c))))) % 360.0f);
                    cVar.f10592g = degrees;
                    if (degrees < -180.0f) {
                        f = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        f = degrees - 360.0f;
                    }
                    cVar.f10592g = f;
                }
                C5290c.C5291a aVar = cVar.f10594i;
                if (aVar != null) {
                    GestureCropImageView gestureCropImageView = GestureCropImageView.this;
                    gestureCropImageView.mo17271e(cVar.f10592g, gestureCropImageView.f11557K, gestureCropImageView.f11558L);
                }
                cVar.f10586a = x2;
                cVar.f10587b = y2;
                cVar.f10588c = x;
                cVar.f10589d = y;
            }
            cVar.f10592g = 0.0f;
            cVar.f10593h = true;
        }
        if ((motionEvent.getAction() & 255) == 1) {
            setImageToWrapCropBounds(true);
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.f11561O = i;
    }

    public void setRotateEnabled(boolean z) {
        this.f11559M = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f11560N = z;
    }
}
