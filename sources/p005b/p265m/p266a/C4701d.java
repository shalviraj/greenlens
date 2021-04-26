package p005b.p265m.p266a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p232f.p254x.p255a.C4654g;
import p005b.p265m.p266a.p267t.C4735b;
import p005b.p265m.p266a.p267t.C4738d;
import p005b.p265m.p266a.p267t.C4745f;
import p005b.p265m.p266a.p267t.C4746g;
import p005b.p265m.p266a.p267t.C4747h;
import p005b.p265m.p266a.p267t.C4748i;
import p005b.p265m.p266a.p267t.C4749j;
import p005b.p265m.p266a.p267t.C4750k;
import p005b.p265m.p266a.p267t.C4751l;
import p005b.p265m.p266a.p267t.C4754o;

/* renamed from: b.m.a.d */
public class C4701d extends ViewGroup {

    /* renamed from: G */
    public static final String f8947G = C4701d.class.getSimpleName();

    /* renamed from: A */
    public C4754o f8948A = null;

    /* renamed from: B */
    public boolean f8949B = false;

    /* renamed from: C */
    public final SurfaceHolder.Callback f8950C = new C4702a();

    /* renamed from: D */
    public final Handler.Callback f8951D = new C4703b();

    /* renamed from: E */
    public C4726o f8952E = new C4704c();

    /* renamed from: F */
    public final C4706e f8953F = new C4705d();

    /* renamed from: g */
    public C4738d f8954g;

    /* renamed from: h */
    public WindowManager f8955h;

    /* renamed from: i */
    public Handler f8956i;

    /* renamed from: j */
    public boolean f8957j = false;

    /* renamed from: k */
    public SurfaceView f8958k;

    /* renamed from: l */
    public TextureView f8959l;

    /* renamed from: m */
    public boolean f8960m = false;

    /* renamed from: n */
    public C4728q f8961n;

    /* renamed from: o */
    public int f8962o = -1;

    /* renamed from: p */
    public List<C4706e> f8963p = new ArrayList();

    /* renamed from: q */
    public C4749j f8964q;

    /* renamed from: r */
    public C4745f f8965r = new C4745f();

    /* renamed from: s */
    public C4729r f8966s;

    /* renamed from: t */
    public C4729r f8967t;

    /* renamed from: u */
    public Rect f8968u;

    /* renamed from: v */
    public C4729r f8969v;

    /* renamed from: w */
    public Rect f8970w = null;

    /* renamed from: x */
    public Rect f8971x = null;

    /* renamed from: y */
    public C4729r f8972y = null;

    /* renamed from: z */
    public double f8973z = 0.1d;

    /* renamed from: b.m.a.d$a */
    public class C4702a implements SurfaceHolder.Callback {
        public C4702a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder == null) {
                String str = C4701d.f8947G;
                Log.e(C4701d.f8947G, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            C4701d dVar = C4701d.this;
            dVar.f8969v = new C4729r(i2, i3);
            dVar.mo16416h();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C4701d.this.f8969v = null;
        }
    }

    /* renamed from: b.m.a.d$b */
    public class C4703b implements Handler.Callback {
        public C4703b() {
        }

        public boolean handleMessage(Message message) {
            C4749j jVar;
            int i = message.what;
            boolean z = true;
            if (i == R.id.zxing_prewiew_size_ready) {
                C4701d dVar = C4701d.this;
                C4729r rVar = (C4729r) message.obj;
                dVar.f8967t = rVar;
                C4729r rVar2 = dVar.f8966s;
                if (rVar2 != null) {
                    if (rVar == null || (jVar = dVar.f8964q) == null) {
                        dVar.f8971x = null;
                        dVar.f8970w = null;
                        dVar.f8968u = null;
                        throw new IllegalStateException("containerSize or previewSize is not set yet");
                    }
                    int i2 = rVar.f9029g;
                    int i3 = rVar.f9030h;
                    int i4 = rVar2.f9029g;
                    int i5 = rVar2.f9030h;
                    Rect b = jVar.f9099c.mo16482b(rVar, jVar.f9097a);
                    if (b.width() > 0 && b.height() > 0) {
                        dVar.f8968u = b;
                        Rect rect = new Rect(0, 0, i4, i5);
                        Rect rect2 = dVar.f8968u;
                        Rect rect3 = new Rect(rect);
                        rect3.intersect(rect2);
                        if (dVar.f8972y != null) {
                            rect3.inset(Math.max(0, (rect3.width() - dVar.f8972y.f9029g) / 2), Math.max(0, (rect3.height() - dVar.f8972y.f9030h) / 2));
                        } else {
                            int min = (int) Math.min(((double) rect3.width()) * dVar.f8973z, ((double) rect3.height()) * dVar.f8973z);
                            rect3.inset(min, min);
                            if (rect3.height() > rect3.width()) {
                                rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                            }
                        }
                        dVar.f8970w = rect3;
                        Rect rect4 = new Rect(dVar.f8970w);
                        Rect rect5 = dVar.f8968u;
                        rect4.offset(-rect5.left, -rect5.top);
                        Rect rect6 = new Rect((rect4.left * i2) / dVar.f8968u.width(), (rect4.top * i3) / dVar.f8968u.height(), (rect4.right * i2) / dVar.f8968u.width(), (rect4.bottom * i3) / dVar.f8968u.height());
                        dVar.f8971x = rect6;
                        if (rect6.width() <= 0 || dVar.f8971x.height() <= 0) {
                            dVar.f8971x = null;
                            dVar.f8970w = null;
                            Log.w(C4701d.f8947G, "Preview frame is too small");
                        } else {
                            dVar.f8953F.mo16431a();
                        }
                    }
                    dVar.requestLayout();
                    dVar.mo16416h();
                }
                return true;
            }
            if (i == R.id.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                C4701d dVar2 = C4701d.this;
                if (dVar2.f8954g == null) {
                    z = false;
                }
                if (z) {
                    dVar2.mo16404d();
                    C4701d.this.f8953F.mo16432b(exc);
                }
            } else if (i == R.id.zxing_camera_closed) {
                C4701d.this.f8953F.mo16435e();
            }
            return false;
        }
    }

    /* renamed from: b.m.a.d$c */
    public class C4704c implements C4726o {
        public C4704c() {
        }
    }

    /* renamed from: b.m.a.d$d */
    public class C4705d implements C4706e {
        public C4705d() {
        }

        /* renamed from: a */
        public void mo16431a() {
            for (C4706e a : C4701d.this.f8963p) {
                a.mo16431a();
            }
        }

        /* renamed from: b */
        public void mo16432b(Exception exc) {
            for (C4706e b : C4701d.this.f8963p) {
                b.mo16432b(exc);
            }
        }

        /* renamed from: c */
        public void mo16433c() {
            for (C4706e c : C4701d.this.f8963p) {
                c.mo16433c();
            }
        }

        /* renamed from: d */
        public void mo16434d() {
            for (C4706e d : C4701d.this.f8963p) {
                d.mo16434d();
            }
        }

        /* renamed from: e */
        public void mo16435e() {
            for (C4706e e : C4701d.this.f8963p) {
                e.mo16435e();
            }
        }
    }

    /* renamed from: b.m.a.d$e */
    public interface C4706e {
        /* renamed from: a */
        void mo16431a();

        /* renamed from: b */
        void mo16432b(Exception exc);

        /* renamed from: c */
        void mo16433c();

        /* renamed from: d */
        void mo16434d();

        /* renamed from: e */
        void mo16435e();
    }

    public C4701d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo16402b(context, attributeSet);
    }

    /* renamed from: a */
    public static void m8661a(C4701d dVar) {
        if ((dVar.f8954g != null) && dVar.getDisplayRotation() != dVar.f8962o) {
            dVar.mo16404d();
            dVar.mo16406f();
        }
    }

    private int getDisplayRotation() {
        return this.f8955h.getDefaultDisplay().getRotation();
    }

    /* renamed from: b */
    public final void mo16402b(Context context, AttributeSet attributeSet) {
        if (getBackground() == null) {
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        mo16403c(attributeSet);
        this.f8955h = (WindowManager) context.getSystemService("window");
        this.f8956i = new Handler(this.f8951D);
        this.f8961n = new C4728q();
    }

    /* renamed from: c */
    public void mo16403c(AttributeSet attributeSet) {
        C4754o oVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4654g.f8780a);
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f8972y = new C4729r(dimension, dimension2);
        }
        this.f8957j = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            oVar = new C4748i();
        } else if (integer == 2) {
            oVar = new C4750k();
        } else {
            if (integer == 3) {
                oVar = new C4751l();
            }
            obtainStyledAttributes.recycle();
        }
        this.f8948A = oVar;
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public void mo16404d() {
        TextureView textureView;
        SurfaceView surfaceView;
        C1960d.m2750S0();
        Log.d(f8947G, "pause()");
        this.f8962o = -1;
        C4738d dVar = this.f8954g;
        if (dVar != null) {
            C1960d.m2750S0();
            if (dVar.f9059f) {
                dVar.f9054a.mo16480b(dVar.f9066m);
            } else {
                dVar.f9060g = true;
            }
            dVar.f9059f = false;
            this.f8954g = null;
            this.f8960m = false;
        } else {
            this.f8956i.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.f8969v == null && (surfaceView = this.f8958k) != null) {
            surfaceView.getHolder().removeCallback(this.f8950C);
        }
        if (this.f8969v == null && (textureView = this.f8959l) != null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.f8966s = null;
        this.f8967t = null;
        this.f8971x = null;
        C4728q qVar = this.f8961n;
        OrientationEventListener orientationEventListener = qVar.f9027c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        qVar.f9027c = null;
        qVar.f9026b = null;
        qVar.f9028d = null;
        this.f8953F.mo16434d();
    }

    /* renamed from: e */
    public void mo16405e() {
    }

    /* renamed from: f */
    public void mo16406f() {
        C1960d.m2750S0();
        String str = f8947G;
        Log.d(str, "resume()");
        if (this.f8954g != null) {
            Log.w(str, "initCamera called twice");
        } else {
            C4738d dVar = new C4738d(getContext());
            C4745f fVar = this.f8965r;
            if (!dVar.f9059f) {
                dVar.f9062i = fVar;
                dVar.f9056c.f9078g = fVar;
            }
            this.f8954g = dVar;
            dVar.f9057d = this.f8956i;
            C1960d.m2750S0();
            dVar.f9059f = true;
            dVar.f9060g = false;
            C4747h hVar = dVar.f9054a;
            Runnable runnable = dVar.f9063j;
            synchronized (hVar.f9095d) {
                hVar.f9094c++;
                hVar.mo16480b(runnable);
            }
            this.f8962o = getDisplayRotation();
        }
        if (this.f8969v != null) {
            mo16416h();
        } else {
            SurfaceView surfaceView = this.f8958k;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f8950C);
            } else {
                TextureView textureView = this.f8959l;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        new C4700c(this).onSurfaceTextureAvailable(this.f8959l.getSurfaceTexture(), this.f8959l.getWidth(), this.f8959l.getHeight());
                    } else {
                        this.f8959l.setSurfaceTextureListener(new C4700c(this));
                    }
                }
            }
        }
        requestLayout();
        C4728q qVar = this.f8961n;
        Context context = getContext();
        C4726o oVar = this.f8952E;
        OrientationEventListener orientationEventListener = qVar.f9027c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        qVar.f9027c = null;
        qVar.f9026b = null;
        qVar.f9028d = null;
        Context applicationContext = context.getApplicationContext();
        qVar.f9028d = oVar;
        qVar.f9026b = (WindowManager) applicationContext.getSystemService("window");
        C4727p pVar = new C4727p(qVar, applicationContext, 3);
        qVar.f9027c = pVar;
        pVar.enable();
        qVar.f9025a = qVar.f9026b.getDefaultDisplay().getRotation();
    }

    /* renamed from: g */
    public final void mo16407g(C4746g gVar) {
        if (!this.f8960m && this.f8954g != null) {
            Log.i(f8947G, "Starting preview");
            C4738d dVar = this.f8954g;
            dVar.f9055b = gVar;
            C1960d.m2750S0();
            if (dVar.f9059f) {
                dVar.f9054a.mo16480b(dVar.f9065l);
                this.f8960m = true;
                mo16405e();
                this.f8953F.mo16433c();
                return;
            }
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public C4738d getCameraInstance() {
        return this.f8954g;
    }

    public C4745f getCameraSettings() {
        return this.f8965r;
    }

    public Rect getFramingRect() {
        return this.f8970w;
    }

    public C4729r getFramingRectSize() {
        return this.f8972y;
    }

    public double getMarginFraction() {
        return this.f8973z;
    }

    public Rect getPreviewFramingRect() {
        return this.f8971x;
    }

    public C4754o getPreviewScalingStrategy() {
        C4754o oVar = this.f8948A;
        return oVar != null ? oVar : this.f8959l != null ? new C4748i() : new C4750k();
    }

    public C4729r getPreviewSize() {
        return this.f8967t;
    }

    /* renamed from: h */
    public final void mo16416h() {
        Rect rect;
        C4746g gVar;
        float f;
        C4729r rVar = this.f8969v;
        if (rVar != null && this.f8967t != null && (rect = this.f8968u) != null) {
            if (this.f8958k == null || !rVar.equals(new C4729r(rect.width(), this.f8968u.height()))) {
                TextureView textureView = this.f8959l;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.f8967t != null) {
                        int width = this.f8959l.getWidth();
                        int height = this.f8959l.getHeight();
                        C4729r rVar2 = this.f8967t;
                        float f2 = ((float) width) / ((float) height);
                        float f3 = ((float) rVar2.f9029g) / ((float) rVar2.f9030h);
                        float f4 = 1.0f;
                        if (f2 < f3) {
                            float f5 = f3 / f2;
                            f = 1.0f;
                            f4 = f5;
                        } else {
                            f = f2 / f3;
                        }
                        Matrix matrix = new Matrix();
                        matrix.setScale(f4, f);
                        float f6 = (float) width;
                        float f7 = (float) height;
                        matrix.postTranslate((f6 - (f4 * f6)) / 2.0f, (f7 - (f * f7)) / 2.0f);
                        this.f8959l.setTransform(matrix);
                    }
                    gVar = new C4746g(this.f8959l.getSurfaceTexture());
                } else {
                    return;
                }
            } else {
                gVar = new C4746g(this.f8958k.getHolder());
            }
            mo16407g(gVar);
        }
    }

    public void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        if (this.f8957j) {
            TextureView textureView = new TextureView(getContext());
            this.f8959l = textureView;
            textureView.setSurfaceTextureListener(new C4700c(this));
            view = this.f8959l;
        } else {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.f8958k = surfaceView;
            surfaceView.getHolder().addCallback(this.f8950C);
            view = this.f8958k;
        }
        addView(view);
    }

    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C4729r rVar = new C4729r(i3 - i, i4 - i2);
        this.f8966s = rVar;
        C4738d dVar = this.f8954g;
        if (dVar != null && dVar.f9058e == null) {
            C4749j jVar = new C4749j(getDisplayRotation(), rVar);
            this.f8964q = jVar;
            jVar.f9099c = getPreviewScalingStrategy();
            C4738d dVar2 = this.f8954g;
            C4749j jVar2 = this.f8964q;
            dVar2.f9058e = jVar2;
            dVar2.f9056c.f9079h = jVar2;
            C1960d.m2750S0();
            if (dVar2.f9059f) {
                dVar2.f9054a.mo16480b(dVar2.f9064k);
                boolean z2 = this.f8949B;
                if (z2) {
                    C4738d dVar3 = this.f8954g;
                    Objects.requireNonNull(dVar3);
                    C1960d.m2750S0();
                    if (dVar3.f9059f) {
                        dVar3.f9054a.mo16480b(new C4735b(dVar3, z2));
                    }
                }
            } else {
                throw new IllegalStateException("CameraInstance is not open");
            }
        }
        SurfaceView surfaceView = this.f8958k;
        if (surfaceView != null) {
            Rect rect = this.f8968u;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.f8959l;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f8949B);
        return bundle;
    }

    public void setCameraSettings(C4745f fVar) {
        this.f8965r = fVar;
    }

    public void setFramingRectSize(C4729r rVar) {
        this.f8972y = rVar;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.f8973z = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(C4754o oVar) {
        this.f8948A = oVar;
    }

    public void setTorch(boolean z) {
        this.f8949B = z;
        C4738d dVar = this.f8954g;
        if (dVar != null) {
            C1960d.m2750S0();
            if (dVar.f9059f) {
                dVar.f9054a.mo16480b(new C4735b(dVar, z));
            }
        }
    }

    public void setUseTextureView(boolean z) {
        this.f8957j = z;
    }
}
