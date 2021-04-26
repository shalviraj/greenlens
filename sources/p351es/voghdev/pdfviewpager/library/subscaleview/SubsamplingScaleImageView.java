package p351es.voghdev.pdfviewpager.library.subscaleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p005b.p035e.p036a.p037a.C0843a;
import p351es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaImageDecoder;
import p351es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaImageRegionDecoder;
import p364h.p365a.p366a.p367a.C6968a;
import p364h.p365a.p366a.p367a.p370e.C6983a;
import p364h.p365a.p366a.p367a.p370e.C6984b;
import p364h.p365a.p366a.p367a.p370e.C6985c;
import p364h.p365a.p366a.p367a.p370e.C6986d;
import p364h.p365a.p366a.p367a.p370e.C6987e;
import p364h.p365a.p366a.p367a.p370e.C6988f;
import p364h.p365a.p366a.p367a.p370e.p371g.C6989a;
import p364h.p365a.p366a.p367a.p370e.p371g.C6990b;
import p364h.p365a.p366a.p367a.p370e.p371g.C6991c;
import p364h.p365a.p366a.p367a.p370e.p371g.C6992d;

/* renamed from: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView */
public class SubsamplingScaleImageView extends View {

    /* renamed from: x0 */
    public static Bitmap.Config f13811x0;

    /* renamed from: A */
    public int f13812A = 1;

    /* renamed from: B */
    public int f13813B = 500;

    /* renamed from: C */
    public float f13814C;

    /* renamed from: D */
    public float f13815D;

    /* renamed from: E */
    public PointF f13816E;

    /* renamed from: F */
    public PointF f13817F;

    /* renamed from: G */
    public PointF f13818G;

    /* renamed from: H */
    public Float f13819H;

    /* renamed from: I */
    public PointF f13820I;

    /* renamed from: J */
    public PointF f13821J;

    /* renamed from: K */
    public int f13822K;

    /* renamed from: L */
    public int f13823L;

    /* renamed from: M */
    public int f13824M;

    /* renamed from: N */
    public boolean f13825N;

    /* renamed from: O */
    public boolean f13826O;

    /* renamed from: P */
    public boolean f13827P;

    /* renamed from: Q */
    public int f13828Q;

    /* renamed from: R */
    public GestureDetector f13829R;

    /* renamed from: S */
    public GestureDetector f13830S;

    /* renamed from: T */
    public C6992d f13831T;

    /* renamed from: U */
    public final ReadWriteLock f13832U = new ReentrantReadWriteLock(true);

    /* renamed from: V */
    public C6990b<? extends C6991c> f13833V = new C6989a(SkiaImageDecoder.class);

    /* renamed from: W */
    public C6990b<? extends C6992d> f13834W = new C6989a(SkiaImageRegionDecoder.class);

    /* renamed from: a0 */
    public PointF f13835a0;

    /* renamed from: b0 */
    public float f13836b0;

    /* renamed from: c0 */
    public final float f13837c0;

    /* renamed from: d0 */
    public float f13838d0;

    /* renamed from: e0 */
    public boolean f13839e0;

    /* renamed from: f0 */
    public PointF f13840f0;

    /* renamed from: g */
    public Bitmap f13841g;

    /* renamed from: g0 */
    public PointF f13842g0;

    /* renamed from: h */
    public boolean f13843h;

    /* renamed from: h0 */
    public PointF f13844h0;

    /* renamed from: i */
    public boolean f13845i;

    /* renamed from: i0 */
    public C6918d f13846i0;

    /* renamed from: j */
    public Uri f13847j;

    /* renamed from: j0 */
    public boolean f13848j0;

    /* renamed from: k */
    public int f13849k;

    /* renamed from: k0 */
    public boolean f13850k0;

    /* renamed from: l */
    public Map<Integer, List<C6922h>> f13851l;

    /* renamed from: l0 */
    public C6986d f13852l0;

    /* renamed from: m */
    public int f13853m = 0;

    /* renamed from: m0 */
    public C6987e f13854m0;

    /* renamed from: n */
    public float f13855n = 2.0f;

    /* renamed from: n0 */
    public View.OnLongClickListener f13856n0;

    /* renamed from: o */
    public float f13857o = mo24249q();

    /* renamed from: o0 */
    public final Handler f13858o0;

    /* renamed from: p */
    public int f13859p = -1;

    /* renamed from: p0 */
    public Paint f13860p0;

    /* renamed from: q */
    public int f13861q = 1;

    /* renamed from: q0 */
    public Paint f13862q0;

    /* renamed from: r */
    public int f13863r = 1;

    /* renamed from: r0 */
    public C6921g f13864r0;

    /* renamed from: s */
    public int f13865s = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* renamed from: s0 */
    public Matrix f13866s0;

    /* renamed from: t */
    public int f13867t = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* renamed from: t0 */
    public RectF f13868t0;

    /* renamed from: u */
    public Executor f13869u = AsyncTask.THREAD_POOL_EXECUTOR;

    /* renamed from: u0 */
    public final float[] f13870u0 = new float[8];

    /* renamed from: v */
    public boolean f13871v = true;

    /* renamed from: v0 */
    public final float[] f13872v0 = new float[8];

    /* renamed from: w */
    public boolean f13873w = true;

    /* renamed from: w0 */
    public final float f13874w0 = getResources().getDisplayMetrics().density;

    /* renamed from: x */
    public boolean f13875x = true;

    /* renamed from: y */
    public boolean f13876y = true;

    /* renamed from: z */
    public float f13877z = 1.0f;

    /* renamed from: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$a */
    public class C6915a implements Handler.Callback {
        public C6915a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r4 = r3.f13878a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                int r4 = r4.what
                r0 = 1
                if (r4 != r0) goto L_0x001c
                es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView r4 = p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.this
                android.view.View$OnLongClickListener r1 = r4.f13856n0
                if (r1 == 0) goto L_0x001c
                r2 = 0
                r4.f13828Q = r2
                p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.super.setOnLongClickListener(r1)
                es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView r4 = p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.this
                r4.performLongClick()
                es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView r4 = p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.this
                r1 = 0
                p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.super.setOnLongClickListener((android.view.View.OnLongClickListener) null)
            L_0x001c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.C6915a.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$b */
    public class C6916b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public final /* synthetic */ Context f13879a;

        public C6916b(Context context) {
            this.f13879a = context;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            if (!subsamplingScaleImageView.f13875x || !subsamplingScaleImageView.f13848j0 || subsamplingScaleImageView.f13816E == null) {
                return onDoubleTapEvent(motionEvent);
            }
            subsamplingScaleImageView.setGestureDetector(this.f13879a);
            SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
            if (subsamplingScaleImageView2.f13876y) {
                subsamplingScaleImageView2.f13835a0 = new PointF(motionEvent.getX(), motionEvent.getY());
                SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
                PointF pointF = SubsamplingScaleImageView.this.f13816E;
                subsamplingScaleImageView3.f13817F = new PointF(pointF.x, pointF.y);
                SubsamplingScaleImageView subsamplingScaleImageView4 = SubsamplingScaleImageView.this;
                subsamplingScaleImageView4.f13815D = subsamplingScaleImageView4.f13814C;
                subsamplingScaleImageView4.f13827P = true;
                subsamplingScaleImageView4.f13825N = true;
                subsamplingScaleImageView4.f13838d0 = -1.0f;
                subsamplingScaleImageView4.f13842g0 = subsamplingScaleImageView4.mo24222F(subsamplingScaleImageView4.f13835a0);
                SubsamplingScaleImageView.this.f13844h0 = new PointF(motionEvent.getX(), motionEvent.getY());
                SubsamplingScaleImageView subsamplingScaleImageView5 = SubsamplingScaleImageView.this;
                PointF pointF2 = SubsamplingScaleImageView.this.f13842g0;
                subsamplingScaleImageView5.f13840f0 = new PointF(pointF2.x, pointF2.y);
                SubsamplingScaleImageView.this.f13839e0 = false;
                return false;
            }
            subsamplingScaleImageView2.mo24238j(subsamplingScaleImageView2.mo24222F(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            if (!subsamplingScaleImageView.f13873w || !subsamplingScaleImageView.f13848j0 || subsamplingScaleImageView.f13816E == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.f13825N))) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            PointF pointF = SubsamplingScaleImageView.this.f13816E;
            PointF pointF2 = new PointF((f * 0.25f) + pointF.x, (f2 * 0.25f) + pointF.y);
            float width = ((float) (SubsamplingScaleImageView.this.getWidth() / 2)) - pointF2.x;
            SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
            float height = ((float) (subsamplingScaleImageView2.getHeight() / 2)) - pointF2.y;
            SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
            C6919e eVar = new C6919e(new PointF(width / subsamplingScaleImageView2.f13814C, height / subsamplingScaleImageView3.f13814C), (C6915a) null);
            if (C6988f.f14027d.contains(1)) {
                eVar.f13898e = 1;
                eVar.f13901h = false;
                eVar.f13899f = 3;
                eVar.mo24291a();
                return true;
            }
            throw new IllegalArgumentException("Unknown easing type: 1");
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SubsamplingScaleImageView.this.performClick();
            return true;
        }
    }

    /* renamed from: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$c */
    public class C6917c extends GestureDetector.SimpleOnGestureListener {
        public C6917c() {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SubsamplingScaleImageView.this.performClick();
            return true;
        }
    }

    /* renamed from: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d */
    public static class C6918d {

        /* renamed from: a */
        public float f13882a;

        /* renamed from: b */
        public float f13883b;

        /* renamed from: c */
        public PointF f13884c;

        /* renamed from: d */
        public PointF f13885d;

        /* renamed from: e */
        public PointF f13886e;

        /* renamed from: f */
        public PointF f13887f;

        /* renamed from: g */
        public long f13888g = 500;

        /* renamed from: h */
        public boolean f13889h = true;

        /* renamed from: i */
        public int f13890i = 2;

        /* renamed from: j */
        public int f13891j = 1;

        /* renamed from: k */
        public long f13892k = System.currentTimeMillis();

        /* renamed from: l */
        public C6985c f13893l;

        public C6918d(C6915a aVar) {
        }
    }

    /* renamed from: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$e */
    public final class C6919e {

        /* renamed from: a */
        public final float f13894a;

        /* renamed from: b */
        public final PointF f13895b;

        /* renamed from: c */
        public final PointF f13896c;

        /* renamed from: d */
        public long f13897d = 500;

        /* renamed from: e */
        public int f13898e = 2;

        /* renamed from: f */
        public int f13899f = 1;

        /* renamed from: g */
        public boolean f13900g = true;

        /* renamed from: h */
        public boolean f13901h = true;

        public C6919e(float f, PointF pointF, PointF pointF2, C6915a aVar) {
            this.f13894a = f;
            this.f13895b = pointF;
            this.f13896c = pointF2;
        }

        /* renamed from: a */
        public void mo24291a() {
            PointF pointF;
            C6985c cVar;
            C6918d dVar = SubsamplingScaleImageView.this.f13846i0;
            if (!(dVar == null || (cVar = dVar.f13893l) == null)) {
                try {
                    cVar.mo24366c();
                } catch (Exception e) {
                    Log.w(C6988f.f14024a, "Error thrown by animation listener", e);
                }
            }
            int width = (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2) + SubsamplingScaleImageView.this.getPaddingLeft();
            int height = (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2) + SubsamplingScaleImageView.this.getPaddingTop();
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            float min = Math.min(subsamplingScaleImageView.f13855n, Math.max(subsamplingScaleImageView.mo24249q(), this.f13894a));
            if (this.f13901h) {
                SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                PointF pointF2 = this.f13895b;
                float f = pointF2.x;
                float f2 = pointF2.y;
                pointF = new PointF();
                PointF E = subsamplingScaleImageView2.mo24221E(f, f2, min);
                pointF.set((((float) ((((subsamplingScaleImageView2.getWidth() - subsamplingScaleImageView2.getPaddingRight()) - subsamplingScaleImageView2.getPaddingLeft()) / 2) + subsamplingScaleImageView2.getPaddingLeft())) - E.x) / min, (((float) ((((subsamplingScaleImageView2.getHeight() - subsamplingScaleImageView2.getPaddingBottom()) - subsamplingScaleImageView2.getPaddingTop()) / 2) + subsamplingScaleImageView2.getPaddingTop())) - E.y) / min);
            } else {
                pointF = this.f13895b;
            }
            SubsamplingScaleImageView.this.f13846i0 = new C6918d((C6915a) null);
            SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
            C6918d dVar2 = subsamplingScaleImageView3.f13846i0;
            dVar2.f13882a = subsamplingScaleImageView3.f13814C;
            dVar2.f13883b = min;
            dVar2.f13892k = System.currentTimeMillis();
            Objects.requireNonNull(SubsamplingScaleImageView.this.f13846i0);
            SubsamplingScaleImageView subsamplingScaleImageView4 = SubsamplingScaleImageView.this;
            subsamplingScaleImageView4.f13846i0.f13884c = subsamplingScaleImageView4.getCenter();
            SubsamplingScaleImageView subsamplingScaleImageView5 = SubsamplingScaleImageView.this;
            C6918d dVar3 = subsamplingScaleImageView5.f13846i0;
            dVar3.f13885d = pointF;
            dVar3.f13886e = subsamplingScaleImageView5.mo24218B(pointF);
            SubsamplingScaleImageView.this.f13846i0.f13887f = new PointF((float) width, (float) height);
            C6918d dVar4 = SubsamplingScaleImageView.this.f13846i0;
            dVar4.f13888g = this.f13897d;
            dVar4.f13889h = this.f13900g;
            dVar4.f13890i = this.f13898e;
            dVar4.f13891j = this.f13899f;
            dVar4.f13892k = System.currentTimeMillis();
            C6918d dVar5 = SubsamplingScaleImageView.this.f13846i0;
            dVar5.f13893l = null;
            PointF pointF3 = this.f13896c;
            if (pointF3 != null) {
                float f3 = pointF3.x;
                PointF pointF4 = dVar5.f13884c;
                float f4 = f3 - (pointF4.x * min);
                float f5 = pointF3.y - (pointF4.y * min);
                C6921g gVar = new C6921g(min, new PointF(f4, f5), (C6915a) null);
                SubsamplingScaleImageView.this.mo24241m(true, gVar);
                C6918d dVar6 = SubsamplingScaleImageView.this.f13846i0;
                PointF pointF5 = this.f13896c;
                float f6 = pointF5.x;
                PointF pointF6 = gVar.f13911b;
                dVar6.f13887f = new PointF((pointF6.x - f4) + f6, (pointF6.y - f5) + pointF5.y);
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        public C6919e(float f, PointF pointF, C6915a aVar) {
            this.f13894a = f;
            this.f13895b = pointF;
            this.f13896c = null;
        }

        public C6919e(PointF pointF, C6915a aVar) {
            this.f13894a = SubsamplingScaleImageView.this.f13814C;
            this.f13895b = pointF;
            this.f13896c = null;
        }
    }

    /* renamed from: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$f */
    public static class C6920f extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f13903a;

        /* renamed from: b */
        public final WeakReference<Context> f13904b;

        /* renamed from: c */
        public final WeakReference<C6990b<? extends C6991c>> f13905c;

        /* renamed from: d */
        public final Uri f13906d;

        /* renamed from: e */
        public final boolean f13907e;

        /* renamed from: f */
        public Bitmap f13908f;

        /* renamed from: g */
        public Exception f13909g;

        public C6920f(SubsamplingScaleImageView subsamplingScaleImageView, Context context, C6990b<? extends C6991c> bVar, Uri uri, boolean z) {
            this.f13903a = new WeakReference<>(subsamplingScaleImageView);
            this.f13904b = new WeakReference<>(context);
            this.f13905c = new WeakReference<>(bVar);
            this.f13906d = uri;
            this.f13907e = z;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                String uri = this.f13906d.toString();
                Context context = (Context) this.f13904b.get();
                C6990b bVar = (C6990b) this.f13905c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.f13903a.get();
                if (!(context == null || bVar == null || subsamplingScaleImageView == null)) {
                    this.f13908f = ((C6991c) bVar.mo24375a()).mo24298a(context, this.f13906d);
                    return Integer.valueOf(SubsamplingScaleImageView.m12489d(subsamplingScaleImageView, context, uri));
                }
            } catch (Exception e) {
                Log.e(C6988f.f14024a, "Failed to load bitmap", e);
                this.f13909g = e;
            } catch (OutOfMemoryError e2) {
                Log.e(C6988f.f14024a, "Failed to load bitmap - OutOfMemoryError", e2);
                this.f13909g = new RuntimeException(e2);
            }
            return null;
        }

        public void onPostExecute(Object obj) {
            C6986d dVar;
            Integer num = (Integer) obj;
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.f13903a.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.f13908f;
                if (bitmap == null || num == null) {
                    Exception exc = this.f13909g;
                    if (exc != null && (dVar = subsamplingScaleImageView.f13852l0) != null) {
                        if (this.f13907e) {
                            dVar.mo24367a(exc);
                        } else {
                            dVar.mo24372f(exc);
                        }
                    }
                } else if (this.f13907e) {
                    Bitmap.Config config = SubsamplingScaleImageView.f13811x0;
                    subsamplingScaleImageView.mo24251s(bitmap);
                } else {
                    int intValue = num.intValue();
                    Bitmap.Config config2 = SubsamplingScaleImageView.f13811x0;
                    subsamplingScaleImageView.mo24250r(bitmap, intValue, false);
                }
            }
        }
    }

    /* renamed from: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$g */
    public static class C6921g {

        /* renamed from: a */
        public float f13910a;

        /* renamed from: b */
        public final PointF f13911b;

        public C6921g(float f, PointF pointF, C6915a aVar) {
            this.f13910a = f;
            this.f13911b = pointF;
        }
    }

    /* renamed from: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h */
    public static class C6922h {

        /* renamed from: a */
        public Rect f13912a;

        /* renamed from: b */
        public int f13913b;

        /* renamed from: c */
        public Bitmap f13914c;

        /* renamed from: d */
        public boolean f13915d;

        /* renamed from: e */
        public boolean f13916e;

        /* renamed from: f */
        public Rect f13917f;

        /* renamed from: g */
        public Rect f13918g;

        public C6922h() {
        }

        public C6922h(C6915a aVar) {
        }
    }

    /* renamed from: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$i */
    public static class C6923i extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f13919a;

        /* renamed from: b */
        public final WeakReference<C6992d> f13920b;

        /* renamed from: c */
        public final WeakReference<C6922h> f13921c;

        /* renamed from: d */
        public Exception f13922d;

        public C6923i(SubsamplingScaleImageView subsamplingScaleImageView, C6992d dVar, C6922h hVar) {
            this.f13919a = new WeakReference<>(subsamplingScaleImageView);
            this.f13920b = new WeakReference<>(dVar);
            this.f13921c = new WeakReference<>(hVar);
            hVar.f13915d = true;
        }

        public Object doInBackground(Object[] objArr) {
            SubsamplingScaleImageView subsamplingScaleImageView;
            Void[] voidArr = (Void[]) objArr;
            try {
                subsamplingScaleImageView = (SubsamplingScaleImageView) this.f13919a.get();
                C6992d dVar = (C6992d) this.f13920b.get();
                C6922h hVar = (C6922h) this.f13921c.get();
                if (dVar == null || hVar == null || subsamplingScaleImageView == null || !dVar.mo24299a() || !hVar.f13916e) {
                    if (hVar != null) {
                        hVar.f13915d = false;
                    }
                    return null;
                }
                subsamplingScaleImageView.f13832U.readLock().lock();
                if (dVar.mo24299a()) {
                    SubsamplingScaleImageView.m12490e(subsamplingScaleImageView, hVar.f13912a, hVar.f13918g);
                    Bitmap b = dVar.mo24300b(hVar.f13918g, hVar.f13913b);
                    subsamplingScaleImageView.f13832U.readLock().unlock();
                    return b;
                }
                hVar.f13915d = false;
                subsamplingScaleImageView.f13832U.readLock().unlock();
                return null;
            } catch (Exception e) {
                Log.e(C6988f.f14024a, "Failed to decode tile", e);
                this.f13922d = e;
            } catch (OutOfMemoryError e2) {
                Log.e(C6988f.f14024a, "Failed to decode tile - OutOfMemoryError", e2);
                this.f13922d = new RuntimeException(e2);
            } catch (Throwable th) {
                subsamplingScaleImageView.f13832U.readLock().unlock();
                throw th;
            }
        }

        public void onPostExecute(Object obj) {
            C6986d dVar;
            Bitmap bitmap;
            Bitmap bitmap2 = (Bitmap) obj;
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.f13919a.get();
            C6922h hVar = (C6922h) this.f13921c.get();
            if (subsamplingScaleImageView != null && hVar != null) {
                if (bitmap2 != null) {
                    hVar.f13914c = bitmap2;
                    hVar.f13915d = false;
                    Bitmap.Config config = SubsamplingScaleImageView.f13811x0;
                    synchronized (subsamplingScaleImageView) {
                        subsamplingScaleImageView.mo24236h();
                        subsamplingScaleImageView.mo24226g();
                        if (subsamplingScaleImageView.mo24248p() && (bitmap = subsamplingScaleImageView.f13841g) != null) {
                            if (!subsamplingScaleImageView.f13845i) {
                                bitmap.recycle();
                            }
                            subsamplingScaleImageView.f13841g = null;
                            C6986d dVar2 = subsamplingScaleImageView.f13852l0;
                            if (dVar2 != null && subsamplingScaleImageView.f13845i) {
                                dVar2.mo24370d();
                            }
                            subsamplingScaleImageView.f13843h = false;
                            subsamplingScaleImageView.f13845i = false;
                        }
                        subsamplingScaleImageView.invalidate();
                    }
                    return;
                }
                Exception exc = this.f13922d;
                if (exc != null && (dVar = subsamplingScaleImageView.f13852l0) != null) {
                    dVar.mo24369c(exc);
                }
            }
        }
    }

    /* renamed from: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$j */
    public static class C6924j extends AsyncTask<Void, Void, int[]> {

        /* renamed from: a */
        public final WeakReference<SubsamplingScaleImageView> f13923a;

        /* renamed from: b */
        public final WeakReference<Context> f13924b;

        /* renamed from: c */
        public final WeakReference<C6990b<? extends C6992d>> f13925c;

        /* renamed from: d */
        public final Uri f13926d;

        /* renamed from: e */
        public C6992d f13927e;

        /* renamed from: f */
        public Exception f13928f;

        public C6924j(SubsamplingScaleImageView subsamplingScaleImageView, Context context, C6990b<? extends C6992d> bVar, Uri uri) {
            this.f13923a = new WeakReference<>(subsamplingScaleImageView);
            this.f13924b = new WeakReference<>(context);
            this.f13925c = new WeakReference<>(bVar);
            this.f13926d = uri;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                String uri = this.f13926d.toString();
                Context context = (Context) this.f13924b.get();
                C6990b bVar = (C6990b) this.f13925c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.f13923a.get();
                if (!(context == null || bVar == null || subsamplingScaleImageView == null)) {
                    C6992d dVar = (C6992d) bVar.mo24375a();
                    this.f13927e = dVar;
                    Point c = dVar.mo24301c(context, this.f13926d);
                    return new int[]{c.x, c.y, SubsamplingScaleImageView.m12489d(subsamplingScaleImageView, context, uri)};
                }
            } catch (Exception e) {
                Log.e(C6988f.f14024a, "Failed to initialise bitmap decoder", e);
                this.f13928f = e;
            }
            return null;
        }

        public void onPostExecute(Object obj) {
            C6986d dVar;
            int i;
            int i2;
            int i3;
            int[] iArr = (int[]) obj;
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.f13923a.get();
            if (subsamplingScaleImageView != null) {
                C6992d dVar2 = this.f13927e;
                if (dVar2 == null || iArr == null || iArr.length != 3) {
                    Exception exc = this.f13928f;
                    if (exc != null && (dVar = subsamplingScaleImageView.f13852l0) != null) {
                        dVar.mo24372f(exc);
                        return;
                    }
                    return;
                }
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = iArr[2];
                Bitmap.Config config = SubsamplingScaleImageView.f13811x0;
                synchronized (subsamplingScaleImageView) {
                    int i7 = subsamplingScaleImageView.f13822K;
                    if (i7 > 0 && (i3 = subsamplingScaleImageView.f13823L) > 0 && !(i7 == i4 && i3 == i5)) {
                        subsamplingScaleImageView.mo24282w(false);
                        Bitmap bitmap = subsamplingScaleImageView.f13841g;
                        if (bitmap != null) {
                            if (!subsamplingScaleImageView.f13845i) {
                                bitmap.recycle();
                            }
                            subsamplingScaleImageView.f13841g = null;
                            C6986d dVar3 = subsamplingScaleImageView.f13852l0;
                            if (dVar3 != null && subsamplingScaleImageView.f13845i) {
                                dVar3.mo24370d();
                            }
                            subsamplingScaleImageView.f13843h = false;
                            subsamplingScaleImageView.f13845i = false;
                        }
                    }
                    subsamplingScaleImageView.f13831T = dVar2;
                    subsamplingScaleImageView.f13822K = i4;
                    subsamplingScaleImageView.f13823L = i5;
                    subsamplingScaleImageView.f13824M = i6;
                    subsamplingScaleImageView.mo24236h();
                    if (!subsamplingScaleImageView.mo24226g() && (i = subsamplingScaleImageView.f13865s) > 0 && i != Integer.MAX_VALUE && (i2 = subsamplingScaleImageView.f13867t) > 0 && i2 != Integer.MAX_VALUE && subsamplingScaleImageView.getWidth() > 0 && subsamplingScaleImageView.getHeight() > 0) {
                        subsamplingScaleImageView.mo24242n(new Point(subsamplingScaleImageView.f13865s, subsamplingScaleImageView.f13867t));
                    }
                    subsamplingScaleImageView.invalidate();
                    subsamplingScaleImageView.requestLayout();
                }
            }
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.f13858o0 = new Handler(new C6915a());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C6968a.f13980a);
            if (obtainStyledAttributes.hasValue(0) && (string = obtainStyledAttributes.getString(0)) != null && string.length() > 0) {
                String str = "file:///android_asset/" + string;
                Objects.requireNonNull(str, "Uri must not be null");
                if (!str.contains("://")) {
                    str = C0843a.m451l("file:///", str.startsWith("/") ? str.substring(1) : str);
                }
                C6983a aVar = new C6983a(Uri.parse(str));
                aVar.f14016d = true;
                setImage(aVar);
            }
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
                C6983a aVar2 = new C6983a(resourceId);
                aVar2.f14016d = true;
                setImage(aVar2);
            }
            if (obtainStyledAttributes.hasValue(1)) {
                setPanEnabled(obtainStyledAttributes.getBoolean(1, true));
            }
            if (obtainStyledAttributes.hasValue(5)) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(5, true));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                setQuickScaleEnabled(obtainStyledAttributes.getBoolean(2, true));
            }
            if (obtainStyledAttributes.hasValue(4)) {
                setTileBackgroundColor(obtainStyledAttributes.getColor(4, Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.f13837c0 = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|(1:47)) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        android.util.Log.w(p364h.p365a.p366a.p367a.p370e.C6988f.f14024a, "Could not get orientation of image from media store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (r8 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0057 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m12489d(p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView r8, android.content.Context r9, java.lang.String r10) {
        /*
            java.lang.String r8 = "content"
            boolean r8 = r10.startsWith(r8)
            r0 = 0
            if (r8 == 0) goto L_0x006a
            r8 = 0
            java.lang.String r1 = "orientation"
            java.lang.String[] r4 = new java.lang.String[]{r1}     // Catch:{ Exception -> 0x0057 }
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Exception -> 0x0057 }
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch:{ Exception -> 0x0057 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0057 }
            if (r8 == 0) goto L_0x0052
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0057 }
            if (r9 == 0) goto L_0x0052
            int r9 = r8.getInt(r0)     // Catch:{ Exception -> 0x0057 }
            java.util.List<java.lang.Integer> r10 = p364h.p365a.p366a.p367a.p370e.C6988f.f14025b     // Catch:{ Exception -> 0x0057 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0057 }
            boolean r10 = r10.contains(r1)     // Catch:{ Exception -> 0x0057 }
            if (r10 == 0) goto L_0x003c
            r10 = -1
            if (r9 == r10) goto L_0x003c
            r0 = r9
            goto L_0x0052
        L_0x003c:
            java.lang.String r10 = p364h.p365a.p366a.p367a.p370e.C6988f.f14024a     // Catch:{ Exception -> 0x0057 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0057 }
            r1.<init>()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = "Unsupported orientation: "
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            r1.append(r9)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r9 = r1.toString()     // Catch:{ Exception -> 0x0057 }
            android.util.Log.w(r10, r9)     // Catch:{ Exception -> 0x0057 }
        L_0x0052:
            if (r8 == 0) goto L_0x00c2
            goto L_0x0060
        L_0x0055:
            r9 = move-exception
            goto L_0x0064
        L_0x0057:
            java.lang.String r9 = p364h.p365a.p366a.p367a.p370e.C6988f.f14024a     // Catch:{ all -> 0x0055 }
            java.lang.String r10 = "Could not get orientation of image from media store"
            android.util.Log.w(r9, r10)     // Catch:{ all -> 0x0055 }
            if (r8 == 0) goto L_0x00c2
        L_0x0060:
            r8.close()
            goto L_0x00c2
        L_0x0064:
            if (r8 == 0) goto L_0x0069
            r8.close()
        L_0x0069:
            throw r9
        L_0x006a:
            java.lang.String r8 = "file:///"
            boolean r8 = r10.startsWith(r8)
            if (r8 == 0) goto L_0x00c2
            java.lang.String r8 = "file:///android_asset/"
            boolean r8 = r10.startsWith(r8)
            if (r8 != 0) goto L_0x00c2
            android.media.ExifInterface r8 = new android.media.ExifInterface     // Catch:{ Exception -> 0x00bb }
            r9 = 7
            java.lang.String r9 = r10.substring(r9)     // Catch:{ Exception -> 0x00bb }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r9 = "Orientation"
            r10 = 1
            int r8 = r8.getAttributeInt(r9, r10)     // Catch:{ Exception -> 0x00bb }
            if (r8 == r10) goto L_0x00c2
            if (r8 != 0) goto L_0x0090
            goto L_0x00c2
        L_0x0090:
            r9 = 6
            if (r8 != r9) goto L_0x0097
            r8 = 90
        L_0x0095:
            r0 = r8
            goto L_0x00c2
        L_0x0097:
            r9 = 3
            if (r8 != r9) goto L_0x009d
            r8 = 180(0xb4, float:2.52E-43)
            goto L_0x0095
        L_0x009d:
            r9 = 8
            if (r8 != r9) goto L_0x00a4
            r8 = 270(0x10e, float:3.78E-43)
            goto L_0x0095
        L_0x00a4:
            java.lang.String r9 = p364h.p365a.p366a.p367a.p370e.C6988f.f14024a     // Catch:{ Exception -> 0x00bb }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bb }
            r10.<init>()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r1 = "Unsupported EXIF orientation: "
            r10.append(r1)     // Catch:{ Exception -> 0x00bb }
            r10.append(r8)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x00bb }
            android.util.Log.w(r9, r8)     // Catch:{ Exception -> 0x00bb }
            goto L_0x00c2
        L_0x00bb:
            java.lang.String r8 = p364h.p365a.p366a.p367a.p370e.C6988f.f14024a
            java.lang.String r9 = "Could not get EXIF orientation of image"
            android.util.Log.w(r8, r9)
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.m12489d(es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView, android.content.Context, java.lang.String):int");
    }

    /* renamed from: e */
    public static void m12490e(SubsamplingScaleImageView subsamplingScaleImageView, Rect rect, Rect rect2) {
        if (subsamplingScaleImageView.getRequiredRotation() == 0) {
            rect2.set(rect);
        } else if (subsamplingScaleImageView.getRequiredRotation() == 90) {
            int i = rect.top;
            int i2 = subsamplingScaleImageView.f13823L;
            rect2.set(i, i2 - rect.right, rect.bottom, i2 - rect.left);
        } else if (subsamplingScaleImageView.getRequiredRotation() == 180) {
            int i3 = subsamplingScaleImageView.f13822K;
            int i4 = subsamplingScaleImageView.f13823L;
            rect2.set(i3 - rect.right, i4 - rect.bottom, i3 - rect.left, i4 - rect.top);
        } else {
            int i5 = subsamplingScaleImageView.f13822K;
            rect2.set(i5 - rect.bottom, rect.left, i5 - rect.top, rect.right);
        }
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return f13811x0;
    }

    @AnyThread
    private int getRequiredRotation() {
        int i = this.f13853m;
        return i == -1 ? this.f13824M : i;
    }

    /* access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.f13829R = new GestureDetector(context, new C6916b(context));
        this.f13830S = new GestureDetector(context, new C6917c());
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        f13811x0 = config;
    }

    /* renamed from: A */
    public final void mo24217A(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    /* renamed from: B */
    public final PointF mo24218B(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = new PointF();
        if (this.f13816E == null) {
            return null;
        }
        pointF2.set(mo24219C(f), mo24220D(f2));
        return pointF2;
    }

    /* renamed from: C */
    public final float mo24219C(float f) {
        PointF pointF = this.f13816E;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f13814C) + pointF.x;
    }

    /* renamed from: D */
    public final float mo24220D(float f) {
        PointF pointF = this.f13816E;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f13814C) + pointF.y;
    }

    @NonNull
    /* renamed from: E */
    public final PointF mo24221E(float f, float f2, float f3) {
        int width = (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2) + getPaddingLeft();
        int height = (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2) + getPaddingTop();
        if (this.f13864r0 == null) {
            this.f13864r0 = new C6921g(0.0f, new PointF(0.0f, 0.0f), (C6915a) null);
        }
        C6921g gVar = this.f13864r0;
        gVar.f13910a = f3;
        gVar.f13911b.set(((float) width) - (f * f3), ((float) height) - (f2 * f3));
        mo24241m(true, this.f13864r0);
        return this.f13864r0.f13911b;
    }

    /* renamed from: F */
    public final PointF mo24222F(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = new PointF();
        if (this.f13816E == null) {
            return null;
        }
        pointF2.set(mo24223G(f), mo24224H(f2));
        return pointF2;
    }

    /* renamed from: G */
    public final float mo24223G(float f) {
        PointF pointF = this.f13816E;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.f13814C;
    }

    /* renamed from: H */
    public final float mo24224H(float f) {
        PointF pointF = this.f13816E;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.f13814C;
    }

    /* renamed from: f */
    public final int mo24225f(float f) {
        int i;
        if (this.f13859p > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= ((float) this.f13859p) / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int y = (int) (((float) mo24284y()) * f);
        int x = (int) (((float) mo24283x()) * f);
        if (y == 0 || x == 0) {
            return 32;
        }
        int i2 = 1;
        if (mo24283x() > x || mo24284y() > y) {
            i = Math.round(((float) mo24283x()) / ((float) x));
            int round = Math.round(((float) mo24284y()) / ((float) y));
            if (i >= round) {
                i = round;
            }
        } else {
            i = 1;
        }
        while (true) {
            int i3 = i2 * 2;
            if (i3 >= i) {
                return i2;
            }
            i2 = i3;
        }
    }

    /* renamed from: g */
    public final boolean mo24226g() {
        boolean p = mo24248p();
        if (!this.f13850k0 && p) {
            mo24279t();
            this.f13850k0 = true;
            C6986d dVar = this.f13852l0;
            if (dVar != null) {
                dVar.mo24371e();
            }
        }
        return p;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final PointF getCenter() {
        float width = (float) (getWidth() / 2);
        float height = (float) (getHeight() / 2);
        PointF pointF = new PointF();
        if (this.f13816E == null) {
            return null;
        }
        pointF.set(mo24223G(width), mo24224H(height));
        return pointF;
    }

    public float getMaxScale() {
        return this.f13855n;
    }

    public final float getMinScale() {
        return mo24249q();
    }

    public final int getOrientation() {
        return this.f13853m;
    }

    public final int getSHeight() {
        return this.f13823L;
    }

    public final int getSWidth() {
        return this.f13822K;
    }

    public final float getScale() {
        return this.f13814C;
    }

    public final C6984b getState() {
        if (this.f13816E == null || this.f13822K <= 0 || this.f13823L <= 0) {
            return null;
        }
        return new C6984b(getScale(), getCenter(), getOrientation());
    }

    /* renamed from: h */
    public final boolean mo24236h() {
        boolean z = getWidth() > 0 && getHeight() > 0 && this.f13822K > 0 && this.f13823L > 0 && (this.f13841g != null || mo24248p());
        if (!this.f13848j0 && z) {
            mo24279t();
            this.f13848j0 = true;
            C6986d dVar = this.f13852l0;
            if (dVar != null) {
                dVar.mo24368b();
            }
        }
        return z;
    }

    /* renamed from: i */
    public final float mo24237i(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((double) ((f6 * f6) + (f5 * f5)));
    }

    /* renamed from: j */
    public final void mo24238j(PointF pointF, PointF pointF2) {
        float f;
        if (!this.f13873w) {
            PointF pointF3 = this.f13821J;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                f = pointF3.y;
            } else {
                pointF.x = (float) (mo24284y() / 2);
                f = (float) (mo24283x() / 2);
            }
            pointF.y = f;
        }
        float min = Math.min(this.f13855n, this.f13877z);
        float f2 = this.f13814C;
        boolean z = ((double) f2) <= ((double) min) * 0.9d || f2 == this.f13857o;
        if (!z) {
            min = mo24249q();
        }
        float f3 = min;
        int i = this.f13812A;
        if (i == 3) {
            this.f13846i0 = null;
            this.f13819H = Float.valueOf(f3);
            this.f13820I = pointF;
            this.f13821J = pointF;
            invalidate();
        } else if (i == 2 || !z || !this.f13873w) {
            C6919e eVar = new C6919e(f3, pointF, (C6915a) null);
            eVar.f13900g = false;
            eVar.f13897d = (long) this.f13813B;
            eVar.f13899f = 4;
            eVar.mo24291a();
        } else if (i == 1) {
            C6919e eVar2 = new C6919e(f3, pointF, pointF2, (C6915a) null);
            eVar2.f13900g = false;
            eVar2.f13897d = (long) this.f13813B;
            eVar2.f13899f = 4;
            eVar2.mo24291a();
        }
        invalidate();
    }

    /* renamed from: k */
    public final float mo24239k(int i, long j, float f, float f2, long j2) {
        float f3;
        if (i == 1) {
            float f4 = ((float) j) / ((float) j2);
            return C0843a.m440a(f4, 2.0f, (-f2) * f4, f);
        } else if (i == 2) {
            float f5 = ((float) j) / (((float) j2) / 2.0f);
            if (f5 < 1.0f) {
                f3 = (f2 / 2.0f) * f5 * f5;
            } else {
                float f6 = f5 - 1.0f;
                f3 = (((f6 - 2.0f) * f6) - 1.0f) * ((-f2) / 2.0f);
            }
            return f3 + f;
        } else {
            throw new IllegalStateException(C0843a.m444e("Unexpected easing type: ", i));
        }
    }

    /* renamed from: l */
    public final void mo24240l(boolean z) {
        boolean z2;
        if (this.f13816E == null) {
            z2 = true;
            this.f13816E = new PointF(0.0f, 0.0f);
        } else {
            z2 = false;
        }
        if (this.f13864r0 == null) {
            this.f13864r0 = new C6921g(0.0f, new PointF(0.0f, 0.0f), (C6915a) null);
        }
        C6921g gVar = this.f13864r0;
        gVar.f13910a = this.f13814C;
        gVar.f13911b.set(this.f13816E);
        mo24241m(z, this.f13864r0);
        C6921g gVar2 = this.f13864r0;
        this.f13814C = gVar2.f13910a;
        this.f13816E.set(gVar2.f13911b);
        if (z2 && this.f13863r != 4) {
            this.f13816E.set(mo24221E((float) (mo24284y() / 2), (float) (mo24283x() / 2), this.f13814C));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24241m(boolean r12, p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.C6921g r13) {
        /*
            r11 = this;
            int r0 = r11.f13861q
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L_0x000b
            boolean r0 = r11.f13848j0
            if (r0 == 0) goto L_0x000b
            r12 = r1
        L_0x000b:
            android.graphics.PointF r0 = r13.f13911b
            float r3 = r13.f13910a
            float r4 = r11.mo24249q()
            float r3 = java.lang.Math.max(r4, r3)
            float r4 = r11.f13855n
            float r3 = java.lang.Math.min(r4, r3)
            int r4 = r11.mo24284y()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r5 = r11.mo24283x()
            float r5 = (float) r5
            float r5 = r5 * r3
            int r6 = r11.f13861q
            r7 = 3
            if (r6 != r7) goto L_0x0049
            boolean r6 = r11.f13848j0
            if (r6 == 0) goto L_0x0049
            float r6 = r0.x
            int r8 = r11.getWidth()
            int r8 = r8 / r2
            float r8 = (float) r8
            float r8 = r8 - r4
            float r6 = java.lang.Math.max(r6, r8)
            r0.x = r6
            float r6 = r0.y
            int r8 = r11.getHeight()
            int r8 = r8 / r2
            goto L_0x005f
        L_0x0049:
            float r6 = r0.x
            if (r12 == 0) goto L_0x0062
            int r8 = r11.getWidth()
            float r8 = (float) r8
            float r8 = r8 - r4
            float r6 = java.lang.Math.max(r6, r8)
            r0.x = r6
            float r6 = r0.y
            int r8 = r11.getHeight()
        L_0x005f:
            float r8 = (float) r8
            float r8 = r8 - r5
            goto L_0x006c
        L_0x0062:
            float r8 = -r4
            float r6 = java.lang.Math.max(r6, r8)
            r0.x = r6
            float r6 = r0.y
            float r8 = -r5
        L_0x006c:
            float r6 = java.lang.Math.max(r6, r8)
            r0.y = r6
            int r6 = r11.getPaddingLeft()
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r6 > 0) goto L_0x0083
            int r6 = r11.getPaddingRight()
            if (r6 <= 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r6 = r8
            goto L_0x0093
        L_0x0083:
            int r6 = r11.getPaddingLeft()
            float r6 = (float) r6
            int r9 = r11.getPaddingLeft()
            int r10 = r11.getPaddingRight()
            int r10 = r10 + r9
            float r9 = (float) r10
            float r6 = r6 / r9
        L_0x0093:
            int r9 = r11.getPaddingTop()
            if (r9 > 0) goto L_0x009f
            int r9 = r11.getPaddingBottom()
            if (r9 <= 0) goto L_0x00af
        L_0x009f:
            int r8 = r11.getPaddingTop()
            float r8 = (float) r8
            int r9 = r11.getPaddingTop()
            int r10 = r11.getPaddingBottom()
            int r10 = r10 + r9
            float r9 = (float) r10
            float r8 = r8 / r9
        L_0x00af:
            int r9 = r11.f13861q
            if (r9 != r7) goto L_0x00cb
            boolean r7 = r11.f13848j0
            if (r7 == 0) goto L_0x00cb
            int r12 = r11.getWidth()
            int r12 = r12 / r2
            int r12 = java.lang.Math.max(r1, r12)
            float r12 = (float) r12
            int r4 = r11.getHeight()
            int r4 = r4 / r2
            int r1 = java.lang.Math.max(r1, r4)
            goto L_0x00f6
        L_0x00cb:
            if (r12 == 0) goto L_0x00e5
            int r12 = r11.getWidth()
            float r12 = (float) r12
            float r12 = r12 - r4
            float r12 = r12 * r6
            r1 = 0
            float r12 = java.lang.Math.max(r1, r12)
            int r2 = r11.getHeight()
            float r2 = (float) r2
            float r2 = r2 - r5
            float r2 = r2 * r8
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x00f7
        L_0x00e5:
            int r12 = r11.getWidth()
            int r12 = java.lang.Math.max(r1, r12)
            float r12 = (float) r12
            int r2 = r11.getHeight()
            int r1 = java.lang.Math.max(r1, r2)
        L_0x00f6:
            float r1 = (float) r1
        L_0x00f7:
            float r2 = r0.x
            float r12 = java.lang.Math.min(r2, r12)
            r0.x = r12
            float r12 = r0.y
            float r12 = java.lang.Math.min(r12, r1)
            r0.y = r12
            r13.f13910a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.mo24241m(boolean, es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$g):void");
    }

    /* renamed from: n */
    public final synchronized void mo24242n(@NonNull Point point) {
        C6921g gVar = new C6921g(0.0f, new PointF(0.0f, 0.0f), (C6915a) null);
        this.f13864r0 = gVar;
        mo24241m(true, gVar);
        int f = mo24225f(this.f13864r0.f13910a);
        this.f13849k = f;
        if (f > 1) {
            this.f13849k = f / 2;
        }
        if (this.f13849k != 1 || mo24284y() >= point.x || mo24283x() >= point.y) {
            mo24243o(point);
            for (C6922h iVar : this.f13851l.get(Integer.valueOf(this.f13849k))) {
                new C6923i(this, this.f13831T, iVar).executeOnExecutor(this.f13869u, new Void[0]);
            }
            mo24280u(true);
        } else {
            this.f13831T.recycle();
            this.f13831T = null;
            new C6920f(this, getContext(), this.f13833V, this.f13847j, false).executeOnExecutor(this.f13869u, new Void[0]);
        }
    }

    /* renamed from: o */
    public final void mo24243o(Point point) {
        Point point2 = point;
        this.f13851l = new LinkedHashMap();
        int i = this.f13849k;
        boolean z = true;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int y = mo24284y() / i2;
            int x = mo24283x() / i3;
            int i4 = y / i;
            int i5 = x / i;
            while (true) {
                if (i4 + i2 + (z ? 1 : 0) > point2.x || (((double) i4) > ((double) getWidth()) * 1.25d && i < this.f13849k)) {
                    i2++;
                    y = mo24284y() / i2;
                    i4 = y / i;
                }
            }
            while (true) {
                if (i5 + i3 + z > point2.y || (((double) i5) > ((double) getHeight()) * 1.25d && i < this.f13849k)) {
                    i3++;
                    x = mo24283x() / i3;
                    i5 = x / i;
                }
            }
            ArrayList arrayList = new ArrayList(i2 * i3);
            int i6 = 0;
            while (i6 < i2) {
                int i7 = 0;
                while (i7 < i3) {
                    C6922h hVar = new C6922h((C6915a) null);
                    hVar.f13913b = i;
                    hVar.f13916e = i == this.f13849k ? z : false;
                    hVar.f13912a = new Rect(i6 * y, i7 * x, i6 == i2 + -1 ? mo24284y() : (i6 + 1) * y, i7 == i3 + -1 ? mo24283x() : (i7 + 1) * x);
                    hVar.f13917f = new Rect(0, 0, 0, 0);
                    hVar.f13918g = new Rect(hVar.f13912a);
                    arrayList.add(hVar);
                    i7++;
                    z = true;
                }
                i6++;
                z = true;
            }
            this.f13851l.put(Integer.valueOf(i), arrayList);
            z = true;
            if (i != 1) {
                i /= 2;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r29) {
        /*
            r28 = this;
            r11 = r28
            r12 = r29
            super.onDraw(r29)
            android.graphics.Paint r0 = r11.f13860p0
            r9 = 1
            if (r0 != 0) goto L_0x0020
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r11.f13860p0 = r0
            r0.setAntiAlias(r9)
            android.graphics.Paint r0 = r11.f13860p0
            r0.setFilterBitmap(r9)
            android.graphics.Paint r0 = r11.f13860p0
            r0.setDither(r9)
        L_0x0020:
            int r0 = r11.f13822K
            if (r0 == 0) goto L_0x03dd
            int r0 = r11.f13823L
            if (r0 == 0) goto L_0x03dd
            int r0 = r28.getWidth()
            if (r0 == 0) goto L_0x03dd
            int r0 = r28.getHeight()
            if (r0 != 0) goto L_0x0036
            goto L_0x03dd
        L_0x0036:
            java.util.Map<java.lang.Integer, java.util.List<es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h>> r0 = r11.f13851l
            if (r0 != 0) goto L_0x005a
            h.a.a.a.e.g.d r0 = r11.f13831T
            if (r0 == 0) goto L_0x005a
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r29.getMaximumBitmapWidth()
            int r2 = r11.f13865s
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r29.getMaximumBitmapHeight()
            int r3 = r11.f13867t
            int r2 = java.lang.Math.min(r2, r3)
            r0.<init>(r1, r2)
            r11.mo24242n(r0)
        L_0x005a:
            boolean r0 = r28.mo24236h()
            if (r0 != 0) goto L_0x0061
            return
        L_0x0061:
            r28.mo24279t()
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r0 = r11.f13846i0
            r10 = 0
            r13 = 0
            if (r0 == 0) goto L_0x013a
            android.graphics.PointF r0 = r0.f13886e
            if (r0 == 0) goto L_0x013a
            float r0 = r11.f13814C
            android.graphics.PointF r1 = r11.f13818G
            if (r1 != 0) goto L_0x007b
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r13, r13)
            r11.f13818G = r1
        L_0x007b:
            android.graphics.PointF r1 = r11.f13818G
            android.graphics.PointF r2 = r11.f13816E
            r1.set(r2)
            long r1 = java.lang.System.currentTimeMillis()
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r3 = r11.f13846i0
            long r4 = r3.f13892k
            long r1 = r1 - r4
            long r3 = r3.f13888g
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0093
            r14 = r9
            goto L_0x0094
        L_0x0093:
            r14 = r10
        L_0x0094:
            long r15 = java.lang.Math.min(r1, r3)
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r1 = r11.f13846i0
            int r2 = r1.f13890i
            float r5 = r1.f13882a
            float r3 = r1.f13883b
            float r6 = r3 - r5
            long r7 = r1.f13888g
            r1 = r28
            r3 = r15
            float r1 = r1.mo24239k(r2, r3, r5, r6, r7)
            r11.f13814C = r1
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r1 = r11.f13846i0
            int r2 = r1.f13890i
            android.graphics.PointF r3 = r1.f13886e
            float r5 = r3.x
            android.graphics.PointF r3 = r1.f13887f
            float r3 = r3.x
            float r6 = r3 - r5
            long r7 = r1.f13888g
            r1 = r28
            r3 = r15
            float r17 = r1.mo24239k(r2, r3, r5, r6, r7)
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r1 = r11.f13846i0
            int r2 = r1.f13890i
            android.graphics.PointF r3 = r1.f13886e
            float r5 = r3.y
            android.graphics.PointF r3 = r1.f13887f
            float r3 = r3.y
            float r6 = r3 - r5
            long r7 = r1.f13888g
            r1 = r28
            r3 = r15
            float r1 = r1.mo24239k(r2, r3, r5, r6, r7)
            android.graphics.PointF r2 = r11.f13816E
            float r3 = r2.x
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r4 = r11.f13846i0
            android.graphics.PointF r4 = r4.f13885d
            float r4 = r4.x
            float r4 = r11.mo24219C(r4)
            float r4 = r4 - r17
            float r3 = r3 - r4
            r2.x = r3
            android.graphics.PointF r2 = r11.f13816E
            float r3 = r2.y
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r4 = r11.f13846i0
            android.graphics.PointF r4 = r4.f13885d
            float r4 = r4.y
            float r4 = r11.mo24220D(r4)
            float r4 = r4 - r1
            float r3 = r3 - r4
            r2.y = r3
            if (r14 != 0) goto L_0x010f
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r1 = r11.f13846i0
            float r2 = r1.f13882a
            float r1 = r1.f13883b
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r1 = r10
            goto L_0x0110
        L_0x010f:
            r1 = r9
        L_0x0110:
            r11.mo24240l(r1)
            android.graphics.PointF r1 = r11.f13818G
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r2 = r11.f13846i0
            int r2 = r2.f13891j
            r11.mo24285z(r0, r1, r2)
            r11.mo24280u(r14)
            if (r14 == 0) goto L_0x0137
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r0 = r11.f13846i0
            h.a.a.a.e.c r0 = r0.f13893l
            if (r0 == 0) goto L_0x0134
            r0.mo24364a()     // Catch:{ Exception -> 0x012b }
            goto L_0x0134
        L_0x012b:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = p364h.p365a.p366a.p367a.p370e.C6988f.f14024a
            java.lang.String r2 = "Error thrown by animation listener"
            android.util.Log.w(r0, r2, r1)
        L_0x0134:
            r0 = 0
            r11.f13846i0 = r0
        L_0x0137:
            r28.invalidate()
        L_0x013a:
            java.util.Map<java.lang.Integer, java.util.List<es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h>> r0 = r11.f13851l
            r14 = 90
            r15 = 180(0xb4, float:2.52E-43)
            r8 = 270(0x10e, float:3.78E-43)
            if (r0 == 0) goto L_0x0307
            boolean r0 = r28.mo24248p()
            if (r0 == 0) goto L_0x0307
            int r0 = r11.f13849k
            float r1 = r11.f13814C
            int r1 = r11.mo24225f(r1)
            int r0 = java.lang.Math.min(r0, r1)
            java.util.Map<java.lang.Integer, java.util.List<es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h>> r1 = r11.f13851l
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r13 = r10
        L_0x0161:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x019d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != r0) goto L_0x0161
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0183:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0161
            java.lang.Object r3 = r2.next()
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h r3 = (p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.C6922h) r3
            boolean r4 = r3.f13916e
            if (r4 == 0) goto L_0x0183
            boolean r4 = r3.f13915d
            if (r4 != 0) goto L_0x019b
            android.graphics.Bitmap r3 = r3.f13914c
            if (r3 != 0) goto L_0x0183
        L_0x019b:
            r13 = r9
            goto L_0x0183
        L_0x019d:
            java.util.Map<java.lang.Integer, java.util.List<es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h>> r1 = r11.f13851l
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r16 = r1.iterator()
        L_0x01a7:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x03dd
            java.lang.Object r1 = r16.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 == r0) goto L_0x01c6
            if (r13 == 0) goto L_0x01c2
            goto L_0x01c6
        L_0x01c2:
            r20 = r13
            goto L_0x0301
        L_0x01c6:
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r17 = r1.iterator()
        L_0x01d0:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x01c2
            java.lang.Object r1 = r17.next()
            r10 = r1
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h r10 = (p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.C6922h) r10
            android.graphics.Rect r1 = r10.f13912a
            android.graphics.Rect r2 = r10.f13917f
            int r3 = r1.left
            float r3 = (float) r3
            float r3 = r11.mo24219C(r3)
            int r3 = (int) r3
            int r4 = r1.top
            float r4 = (float) r4
            float r4 = r11.mo24220D(r4)
            int r4 = (int) r4
            int r5 = r1.right
            float r5 = (float) r5
            float r5 = r11.mo24219C(r5)
            int r5 = (int) r5
            int r1 = r1.bottom
            float r1 = (float) r1
            float r1 = r11.mo24220D(r1)
            int r1 = (int) r1
            r2.set(r3, r4, r5, r1)
            boolean r1 = r10.f13915d
            if (r1 != 0) goto L_0x02f9
            android.graphics.Bitmap r1 = r10.f13914c
            if (r1 == 0) goto L_0x02f9
            android.graphics.Paint r1 = r11.f13862q0
            if (r1 == 0) goto L_0x0215
            android.graphics.Rect r2 = r10.f13917f
            r12.drawRect(r2, r1)
        L_0x0215:
            android.graphics.Matrix r1 = r11.f13866s0
            if (r1 != 0) goto L_0x0220
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r11.f13866s0 = r1
        L_0x0220:
            android.graphics.Matrix r1 = r11.f13866s0
            r1.reset()
            float[] r2 = r11.f13870u0
            r3 = 0
            r4 = 0
            android.graphics.Bitmap r1 = r10.f13914c
            int r1 = r1.getWidth()
            float r5 = (float) r1
            r6 = 0
            android.graphics.Bitmap r1 = r10.f13914c
            int r1 = r1.getWidth()
            float r7 = (float) r1
            android.graphics.Bitmap r1 = r10.f13914c
            int r1 = r1.getHeight()
            float r9 = (float) r1
            r18 = 0
            android.graphics.Bitmap r1 = r10.f13914c
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r19 = r1
            r1 = r28
            r20 = r13
            r13 = r8
            r8 = r9
            r9 = r18
            r13 = r10
            r10 = r19
            r1.mo24217A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = r28.getRequiredRotation()
            if (r1 != 0) goto L_0x0279
            float[] r2 = r11.f13872v0
            android.graphics.Rect r1 = r13.f13917f
            int r3 = r1.left
            float r9 = (float) r3
            int r3 = r1.top
            float r6 = (float) r3
            int r3 = r1.right
            float r7 = (float) r3
            int r1 = r1.bottom
            float r10 = (float) r1
            r1 = r28
            r3 = r9
            r4 = r6
            r5 = r7
            r8 = r10
            r1.mo24217A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x02da
        L_0x0279:
            int r1 = r28.getRequiredRotation()
            if (r1 != r14) goto L_0x0299
            float[] r2 = r11.f13872v0
            android.graphics.Rect r1 = r13.f13917f
            int r3 = r1.right
            float r5 = (float) r3
            int r3 = r1.top
            float r10 = (float) r3
            int r3 = r1.bottom
            float r8 = (float) r3
            int r1 = r1.left
            float r9 = (float) r1
            r1 = r28
            r3 = r5
            r4 = r10
            r6 = r8
            r7 = r9
            r1.mo24217A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x02da
        L_0x0299:
            int r1 = r28.getRequiredRotation()
            if (r1 != r15) goto L_0x02b9
            float[] r2 = r11.f13872v0
            android.graphics.Rect r1 = r13.f13917f
            int r3 = r1.right
            float r9 = (float) r3
            int r3 = r1.bottom
            float r6 = (float) r3
            int r3 = r1.left
            float r7 = (float) r3
            int r1 = r1.top
            float r10 = (float) r1
            r1 = r28
            r3 = r9
            r4 = r6
            r5 = r7
            r8 = r10
            r1.mo24217A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x02da
        L_0x02b9:
            int r1 = r28.getRequiredRotation()
            r2 = 270(0x10e, float:3.78E-43)
            if (r1 != r2) goto L_0x02da
            float[] r2 = r11.f13872v0
            android.graphics.Rect r1 = r13.f13917f
            int r3 = r1.left
            float r5 = (float) r3
            int r3 = r1.bottom
            float r10 = (float) r3
            int r3 = r1.top
            float r8 = (float) r3
            int r1 = r1.right
            float r9 = (float) r1
            r1 = r28
            r3 = r5
            r4 = r10
            r6 = r8
            r7 = r9
            r1.mo24217A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x02da:
            android.graphics.Matrix r1 = r11.f13866s0
            float[] r2 = r11.f13870u0
            r23 = 0
            float[] r3 = r11.f13872v0
            r25 = 0
            r26 = 4
            r21 = r1
            r22 = r2
            r24 = r3
            r21.setPolyToPoly(r22, r23, r24, r25, r26)
            android.graphics.Bitmap r1 = r13.f13914c
            android.graphics.Matrix r2 = r11.f13866s0
            android.graphics.Paint r3 = r11.f13860p0
            r12.drawBitmap(r1, r2, r3)
            goto L_0x02fb
        L_0x02f9:
            r20 = r13
        L_0x02fb:
            r13 = r20
            r8 = 270(0x10e, float:3.78E-43)
            goto L_0x01d0
        L_0x0301:
            r13 = r20
            r8 = 270(0x10e, float:3.78E-43)
            goto L_0x01a7
        L_0x0307:
            r1 = r13
            android.graphics.Bitmap r0 = r11.f13841g
            if (r0 == 0) goto L_0x03dd
            float r2 = r11.f13814C
            boolean r3 = r11.f13843h
            if (r3 == 0) goto L_0x0330
            int r3 = r11.f13822K
            float r3 = (float) r3
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
            float r2 = r2 * r3
            float r0 = r11.f13814C
            int r3 = r11.f13823L
            float r3 = (float) r3
            android.graphics.Bitmap r4 = r11.f13841g
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r0 = r0 * r3
            r27 = r2
            r2 = r0
            r0 = r27
            goto L_0x0331
        L_0x0330:
            r0 = r2
        L_0x0331:
            android.graphics.Matrix r3 = r11.f13866s0
            if (r3 != 0) goto L_0x033c
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r11.f13866s0 = r3
        L_0x033c:
            android.graphics.Matrix r3 = r11.f13866s0
            r3.reset()
            android.graphics.Matrix r3 = r11.f13866s0
            r3.postScale(r0, r2)
            android.graphics.Matrix r0 = r11.f13866s0
            int r2 = r28.getRequiredRotation()
            float r2 = (float) r2
            r0.postRotate(r2)
            android.graphics.Matrix r0 = r11.f13866s0
            android.graphics.PointF r2 = r11.f13816E
            float r3 = r2.x
            float r2 = r2.y
            r0.postTranslate(r3, r2)
            int r0 = r28.getRequiredRotation()
            if (r0 != r15) goto L_0x0371
            android.graphics.Matrix r0 = r11.f13866s0
            float r2 = r11.f13814C
            int r3 = r11.f13822K
            float r3 = (float) r3
            float r3 = r3 * r2
            int r4 = r11.f13823L
            float r4 = (float) r4
            float r2 = r2 * r4
            r0.postTranslate(r3, r2)
            goto L_0x0396
        L_0x0371:
            int r0 = r28.getRequiredRotation()
            if (r0 != r14) goto L_0x0383
            android.graphics.Matrix r0 = r11.f13866s0
            float r2 = r11.f13814C
            int r3 = r11.f13823L
            float r3 = (float) r3
            float r2 = r2 * r3
            r0.postTranslate(r2, r1)
            goto L_0x0396
        L_0x0383:
            int r0 = r28.getRequiredRotation()
            r2 = 270(0x10e, float:3.78E-43)
            if (r0 != r2) goto L_0x0396
            android.graphics.Matrix r0 = r11.f13866s0
            float r2 = r11.f13814C
            int r3 = r11.f13822K
            float r3 = (float) r3
            float r2 = r2 * r3
            r0.postTranslate(r1, r2)
        L_0x0396:
            android.graphics.Paint r0 = r11.f13862q0
            if (r0 == 0) goto L_0x03d4
            android.graphics.RectF r0 = r11.f13868t0
            if (r0 != 0) goto L_0x03a5
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r11.f13868t0 = r0
        L_0x03a5:
            android.graphics.RectF r0 = r11.f13868t0
            boolean r2 = r11.f13843h
            if (r2 == 0) goto L_0x03b2
            android.graphics.Bitmap r2 = r11.f13841g
            int r2 = r2.getWidth()
            goto L_0x03b4
        L_0x03b2:
            int r2 = r11.f13822K
        L_0x03b4:
            float r2 = (float) r2
            boolean r3 = r11.f13843h
            if (r3 == 0) goto L_0x03c0
            android.graphics.Bitmap r3 = r11.f13841g
            int r3 = r3.getHeight()
            goto L_0x03c2
        L_0x03c0:
            int r3 = r11.f13823L
        L_0x03c2:
            float r3 = (float) r3
            r0.set(r1, r1, r2, r3)
            android.graphics.Matrix r0 = r11.f13866s0
            android.graphics.RectF r1 = r11.f13868t0
            r0.mapRect(r1)
            android.graphics.RectF r0 = r11.f13868t0
            android.graphics.Paint r1 = r11.f13862q0
            r12.drawRect(r0, r1)
        L_0x03d4:
            android.graphics.Bitmap r0 = r11.f13841g
            android.graphics.Matrix r1 = r11.f13866s0
            android.graphics.Paint r2 = r11.f13860p0
            r12.drawBitmap(r0, r1, r2)
        L_0x03dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.onDraw(android.graphics.Canvas):void");
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = true;
        boolean z2 = mode != 1073741824;
        if (mode2 == 1073741824) {
            z = false;
        }
        if (this.f13822K > 0 && this.f13823L > 0) {
            if (z2 && z) {
                size = mo24284y();
                size2 = mo24283x();
            } else if (z) {
                size2 = (int) ((((double) mo24283x()) / ((double) mo24284y())) * ((double) size));
            } else if (z2) {
                size = (int) ((((double) mo24284y()) / ((double) mo24283x())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        PointF center = getCenter();
        if (this.f13848j0 && center != null) {
            this.f13846i0 = null;
            this.f13819H = Float.valueOf(this.f13814C);
            this.f13820I = center;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0087, code lost:
        if (r8 != 262) goto L_0x03fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r2 = r0.f13846i0
            r3 = 1
            if (r2 == 0) goto L_0x0011
            boolean r4 = r2.f13889h
            if (r4 != 0) goto L_0x0011
            r0.mo24281v(r3)
            return r3
        L_0x0011:
            if (r2 == 0) goto L_0x001a
            h.a.a.a.e.c r2 = r2.f13893l
            if (r2 == 0) goto L_0x001a
            r2.mo24365b()     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            r2 = 0
            r0.f13846i0 = r2
            android.graphics.PointF r4 = r0.f13816E
            if (r4 != 0) goto L_0x0029
            android.view.GestureDetector r2 = r0.f13830S
            if (r2 == 0) goto L_0x0028
            r2.onTouchEvent(r1)
        L_0x0028:
            return r3
        L_0x0029:
            boolean r4 = r0.f13827P
            r5 = 0
            if (r4 != 0) goto L_0x003f
            android.view.GestureDetector r4 = r0.f13829R
            if (r4 == 0) goto L_0x0038
            boolean r4 = r4.onTouchEvent(r1)
            if (r4 == 0) goto L_0x003f
        L_0x0038:
            r0.f13825N = r5
            r0.f13826O = r5
            r0.f13828Q = r5
            return r3
        L_0x003f:
            android.graphics.PointF r4 = r0.f13817F
            r6 = 0
            if (r4 != 0) goto L_0x004b
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r6, r6)
            r0.f13817F = r4
        L_0x004b:
            android.graphics.PointF r4 = r0.f13818G
            if (r4 != 0) goto L_0x0056
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r6, r6)
            r0.f13818G = r4
        L_0x0056:
            android.graphics.PointF r4 = r0.f13835a0
            if (r4 != 0) goto L_0x0061
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r6, r6)
            r0.f13835a0 = r4
        L_0x0061:
            float r4 = r0.f13814C
            android.graphics.PointF r7 = r0.f13818G
            android.graphics.PointF r8 = r0.f13816E
            r7.set(r8)
            int r7 = r17.getPointerCount()
            int r8 = r17.getAction()
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 2
            if (r8 == 0) goto L_0x0474
            if (r8 == r3) goto L_0x0400
            if (r8 == r10) goto L_0x008b
            r6 = 5
            if (r8 == r6) goto L_0x0474
            r6 = 6
            if (r8 == r6) goto L_0x0400
            r6 = 261(0x105, float:3.66E-43)
            if (r8 == r6) goto L_0x0474
            r2 = 262(0x106, float:3.67E-43)
            if (r8 == r2) goto L_0x0400
            goto L_0x03fd
        L_0x008b:
            int r2 = r0.f13828Q
            if (r2 <= 0) goto L_0x03f0
            r2 = 1084227584(0x40a00000, float:5.0)
            if (r7 < r10) goto L_0x01db
            float r6 = r1.getX(r5)
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r5)
            float r11 = r1.getY(r3)
            float r6 = r0.mo24237i(r6, r7, r8, r11)
            float r7 = r1.getX(r5)
            float r8 = r1.getX(r3)
            float r8 = r8 + r7
            float r8 = r8 / r9
            float r7 = r1.getY(r5)
            float r11 = r1.getY(r3)
            float r11 = r11 + r7
            float r11 = r11 / r9
            boolean r7 = r0.f13875x
            if (r7 == 0) goto L_0x03f0
            android.graphics.PointF r7 = r0.f13835a0
            float r9 = r7.x
            float r7 = r7.y
            float r7 = r0.mo24237i(r9, r8, r7, r11)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x00dd
            float r7 = r0.f13836b0
            float r7 = r6 - r7
            float r7 = java.lang.Math.abs(r7)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x00dd
            boolean r2 = r0.f13826O
            if (r2 == 0) goto L_0x03f0
        L_0x00dd:
            r0.f13825N = r3
            r0.f13826O = r3
            float r2 = r0.f13814C
            double r12 = (double) r2
            float r2 = r0.f13855n
            float r7 = r0.f13836b0
            float r7 = r6 / r7
            float r9 = r0.f13815D
            float r7 = r7 * r9
            float r2 = java.lang.Math.min(r2, r7)
            r0.f13814C = r2
            float r7 = r16.mo24249q()
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0111
            r0.f13836b0 = r6
            float r2 = r16.mo24249q()
            r0.f13815D = r2
            android.graphics.PointF r2 = r0.f13835a0
            r2.set(r8, r11)
            android.graphics.PointF r2 = r0.f13817F
            android.graphics.PointF r6 = r0.f13816E
            r2.set(r6)
            goto L_0x0318
        L_0x0111:
            boolean r2 = r0.f13873w
            if (r2 == 0) goto L_0x018c
            android.graphics.PointF r2 = r0.f13835a0
            float r7 = r2.x
            android.graphics.PointF r9 = r0.f13817F
            float r14 = r9.x
            float r7 = r7 - r14
            float r2 = r2.y
            float r9 = r9.y
            float r2 = r2 - r9
            float r9 = r0.f13814C
            float r14 = r0.f13815D
            float r9 = r9 / r14
            float r7 = r7 * r9
            float r9 = r9 * r2
            android.graphics.PointF r2 = r0.f13816E
            float r7 = r8 - r7
            r2.x = r7
            float r7 = r11 - r9
            r2.y = r7
            int r2 = r16.mo24283x()
            double r14 = (double) r2
            double r14 = r14 * r12
            int r2 = r16.getHeight()
            r7 = r6
            double r5 = (double) r2
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0155
            float r2 = r0.f13814C
            int r5 = r16.mo24283x()
            float r5 = (float) r5
            float r2 = r2 * r5
            int r5 = r16.getHeight()
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0175
        L_0x0155:
            int r2 = r16.mo24284y()
            double r5 = (double) r2
            double r12 = r12 * r5
            int r2 = r16.getWidth()
            double r5 = (double) r2
            int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0318
            float r2 = r0.f13814C
            int r5 = r16.mo24284y()
            float r5 = (float) r5
            float r2 = r2 * r5
            int r5 = r16.getWidth()
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0318
        L_0x0175:
            r0.mo24240l(r3)
            android.graphics.PointF r2 = r0.f13835a0
            r2.set(r8, r11)
            android.graphics.PointF r2 = r0.f13817F
            android.graphics.PointF r5 = r0.f13816E
            r2.set(r5)
            float r2 = r0.f13814C
            r0.f13815D = r2
            r0.f13836b0 = r7
            goto L_0x0318
        L_0x018c:
            android.graphics.PointF r2 = r0.f13821J
            if (r2 == 0) goto L_0x01b1
            android.graphics.PointF r2 = r0.f13816E
            int r5 = r16.getWidth()
            int r5 = r5 / r10
            float r5 = (float) r5
            float r6 = r0.f13814C
            android.graphics.PointF r7 = r0.f13821J
            float r7 = r7.x
            float r6 = r6 * r7
            float r5 = r5 - r6
            r2.x = r5
            android.graphics.PointF r2 = r0.f13816E
            int r5 = r16.getHeight()
            int r5 = r5 / r10
            float r5 = (float) r5
            float r6 = r0.f13814C
            android.graphics.PointF r7 = r0.f13821J
            float r7 = r7.y
            goto L_0x01d5
        L_0x01b1:
            android.graphics.PointF r2 = r0.f13816E
            int r5 = r16.getWidth()
            int r5 = r5 / r10
            float r5 = (float) r5
            float r6 = r0.f13814C
            int r7 = r16.mo24284y()
            int r7 = r7 / r10
            float r7 = (float) r7
            float r6 = r6 * r7
            float r5 = r5 - r6
            r2.x = r5
            android.graphics.PointF r2 = r0.f13816E
            int r5 = r16.getHeight()
            int r5 = r5 / r10
            float r5 = (float) r5
            float r6 = r0.f13814C
            int r7 = r16.mo24283x()
            int r7 = r7 / r10
            float r7 = (float) r7
        L_0x01d5:
            float r6 = r6 * r7
            float r5 = r5 - r6
            r2.y = r5
            goto L_0x0318
        L_0x01db:
            boolean r5 = r0.f13827P
            if (r5 == 0) goto L_0x031d
            android.graphics.PointF r2 = r0.f13844h0
            float r2 = r2.y
            float r5 = r17.getY()
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 * r9
            float r5 = r0.f13837c0
            float r2 = r2 + r5
            float r5 = r0.f13838d0
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01fa
            r0.f13838d0 = r2
        L_0x01fa:
            float r5 = r17.getY()
            android.graphics.PointF r7 = r0.f13840f0
            float r8 = r7.y
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0208
            r5 = r3
            goto L_0x0209
        L_0x0208:
            r5 = 0
        L_0x0209:
            float r8 = r17.getY()
            r7.set(r6, r8)
            float r7 = r0.f13838d0
            float r7 = r2 / r7
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r8 - r7
            float r7 = java.lang.Math.abs(r7)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r9
            r9 = 1022739087(0x3cf5c28f, float:0.03)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x022a
            boolean r9 = r0.f13839e0
            if (r9 == 0) goto L_0x0315
        L_0x022a:
            r0.f13839e0 = r3
            float r9 = r0.f13838d0
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0237
            if (r5 == 0) goto L_0x0236
            float r8 = r8 + r7
            goto L_0x0237
        L_0x0236:
            float r8 = r8 - r7
        L_0x0237:
            float r5 = r0.f13814C
            double r11 = (double) r5
            float r5 = r16.mo24249q()
            float r7 = r0.f13855n
            float r9 = r0.f13814C
            float r9 = r9 * r8
            float r7 = java.lang.Math.min(r7, r9)
            float r5 = java.lang.Math.max(r5, r7)
            r0.f13814C = r5
            boolean r7 = r0.f13873w
            if (r7 == 0) goto L_0x02c8
            android.graphics.PointF r7 = r0.f13835a0
            float r8 = r7.x
            android.graphics.PointF r9 = r0.f13817F
            float r13 = r9.x
            float r13 = r8 - r13
            float r7 = r7.y
            float r9 = r9.y
            float r9 = r7 - r9
            float r14 = r0.f13815D
            float r5 = r5 / r14
            float r13 = r13 * r5
            float r5 = r5 * r9
            android.graphics.PointF r9 = r0.f13816E
            float r8 = r8 - r13
            r9.x = r8
            float r7 = r7 - r5
            r9.y = r7
            int r5 = r16.mo24283x()
            double r7 = (double) r5
            double r7 = r7 * r11
            int r5 = r16.getHeight()
            double r13 = (double) r5
            int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x028e
            float r5 = r0.f13814C
            int r7 = r16.mo24283x()
            float r7 = (float) r7
            float r5 = r5 * r7
            int r7 = r16.getHeight()
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x02ae
        L_0x028e:
            int r5 = r16.mo24284y()
            double r7 = (double) r5
            double r11 = r11 * r7
            int r5 = r16.getWidth()
            double r7 = (double) r5
            int r5 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0315
            float r5 = r0.f13814C
            int r7 = r16.mo24284y()
            float r7 = (float) r7
            float r5 = r5 * r7
            int r7 = r16.getWidth()
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0315
        L_0x02ae:
            r0.mo24240l(r3)
            android.graphics.PointF r2 = r0.f13835a0
            android.graphics.PointF r5 = r0.f13842g0
            android.graphics.PointF r5 = r0.mo24218B(r5)
            r2.set(r5)
            android.graphics.PointF r2 = r0.f13817F
            android.graphics.PointF r5 = r0.f13816E
            r2.set(r5)
            float r2 = r0.f13814C
            r0.f13815D = r2
            goto L_0x0316
        L_0x02c8:
            android.graphics.PointF r5 = r0.f13821J
            if (r5 == 0) goto L_0x02ed
            android.graphics.PointF r5 = r0.f13816E
            int r6 = r16.getWidth()
            int r6 = r6 / r10
            float r6 = (float) r6
            float r7 = r0.f13814C
            android.graphics.PointF r8 = r0.f13821J
            float r8 = r8.x
            float r7 = r7 * r8
            float r6 = r6 - r7
            r5.x = r6
            android.graphics.PointF r5 = r0.f13816E
            int r6 = r16.getHeight()
            int r6 = r6 / r10
            float r6 = (float) r6
            float r7 = r0.f13814C
            android.graphics.PointF r8 = r0.f13821J
            float r8 = r8.y
            goto L_0x0311
        L_0x02ed:
            android.graphics.PointF r5 = r0.f13816E
            int r6 = r16.getWidth()
            int r6 = r6 / r10
            float r6 = (float) r6
            float r7 = r0.f13814C
            int r8 = r16.mo24284y()
            int r8 = r8 / r10
            float r8 = (float) r8
            float r7 = r7 * r8
            float r6 = r6 - r7
            r5.x = r6
            android.graphics.PointF r5 = r0.f13816E
            int r6 = r16.getHeight()
            int r6 = r6 / r10
            float r6 = (float) r6
            float r7 = r0.f13814C
            int r8 = r16.mo24283x()
            int r8 = r8 / r10
            float r8 = (float) r8
        L_0x0311:
            float r7 = r7 * r8
            float r6 = r6 - r7
            r5.y = r6
        L_0x0315:
            r6 = r2
        L_0x0316:
            r0.f13838d0 = r6
        L_0x0318:
            r0.mo24240l(r3)
            goto L_0x03e9
        L_0x031d:
            boolean r5 = r0.f13825N
            if (r5 != 0) goto L_0x03f0
            float r5 = r17.getX()
            android.graphics.PointF r6 = r0.f13835a0
            float r6 = r6.x
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            float r6 = r17.getY()
            android.graphics.PointF r7 = r0.f13835a0
            float r7 = r7.y
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            float r7 = r0.f13874w0
            float r7 = r7 * r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x034a
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 > 0) goto L_0x034a
            boolean r8 = r0.f13826O
            if (r8 == 0) goto L_0x03f0
        L_0x034a:
            android.graphics.PointF r8 = r0.f13816E
            android.graphics.PointF r9 = r0.f13817F
            float r9 = r9.x
            float r11 = r17.getX()
            android.graphics.PointF r12 = r0.f13835a0
            float r12 = r12.x
            float r11 = r11 - r12
            float r11 = r11 + r9
            r8.x = r11
            android.graphics.PointF r8 = r0.f13816E
            android.graphics.PointF r9 = r0.f13817F
            float r9 = r9.y
            float r11 = r17.getY()
            android.graphics.PointF r12 = r0.f13835a0
            float r12 = r12.y
            float r11 = r11 - r12
            float r11 = r11 + r9
            r8.y = r11
            android.graphics.PointF r8 = r0.f13816E
            float r9 = r8.x
            float r8 = r8.y
            r0.mo24240l(r3)
            android.graphics.PointF r11 = r0.f13816E
            float r12 = r11.x
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0381
            r9 = r3
            goto L_0x0382
        L_0x0381:
            r9 = 0
        L_0x0382:
            float r11 = r11.y
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x038a
            r11 = r3
            goto L_0x038b
        L_0x038a:
            r11 = 0
        L_0x038b:
            if (r9 == 0) goto L_0x0397
            int r12 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x0397
            boolean r12 = r0.f13826O
            if (r12 != 0) goto L_0x0397
            r12 = r3
            goto L_0x0398
        L_0x0397:
            r12 = 0
        L_0x0398:
            if (r11 == 0) goto L_0x03a4
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x03a4
            boolean r5 = r0.f13826O
            if (r5 != 0) goto L_0x03a4
            r5 = r3
            goto L_0x03a5
        L_0x03a4:
            r5 = 0
        L_0x03a5:
            if (r8 != 0) goto L_0x03b0
            r8 = 1077936128(0x40400000, float:3.0)
            float r8 = r8 * r7
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x03b0
            r8 = r3
            goto L_0x03b1
        L_0x03b0:
            r8 = 0
        L_0x03b1:
            if (r12 != 0) goto L_0x03c2
            if (r5 != 0) goto L_0x03c2
            if (r9 == 0) goto L_0x03bf
            if (r11 == 0) goto L_0x03bf
            if (r8 != 0) goto L_0x03bf
            boolean r5 = r0.f13826O
            if (r5 == 0) goto L_0x03c2
        L_0x03bf:
            r0.f13826O = r3
            goto L_0x03c9
        L_0x03c2:
            if (r2 > 0) goto L_0x03cb
            int r2 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x03c9
            goto L_0x03cb
        L_0x03c9:
            r2 = 0
            goto L_0x03d6
        L_0x03cb:
            r2 = 0
            r0.f13828Q = r2
            android.os.Handler r5 = r0.f13858o0
            r5.removeMessages(r3)
            r0.mo24281v(r2)
        L_0x03d6:
            boolean r5 = r0.f13873w
            if (r5 != 0) goto L_0x03e9
            android.graphics.PointF r5 = r0.f13816E
            android.graphics.PointF r6 = r0.f13817F
            float r7 = r6.x
            r5.x = r7
            float r6 = r6.y
            r5.y = r6
            r0.mo24281v(r2)
        L_0x03e9:
            boolean r2 = r0.f13871v
            r0.mo24280u(r2)
            r2 = r3
            goto L_0x03f1
        L_0x03f0:
            r2 = 0
        L_0x03f1:
            if (r2 == 0) goto L_0x03fd
            android.os.Handler r2 = r0.f13858o0
            r2.removeMessages(r3)
            r16.invalidate()
            goto L_0x0470
        L_0x03fd:
            r2 = 0
            goto L_0x0471
        L_0x0400:
            android.os.Handler r2 = r0.f13858o0
            r2.removeMessages(r3)
            boolean r2 = r0.f13827P
            if (r2 == 0) goto L_0x0417
            r2 = 0
            r0.f13827P = r2
            boolean r2 = r0.f13839e0
            if (r2 != 0) goto L_0x0417
            android.graphics.PointF r2 = r0.f13842g0
            android.graphics.PointF r5 = r0.f13835a0
            r0.mo24238j(r2, r5)
        L_0x0417:
            int r2 = r0.f13828Q
            if (r2 <= 0) goto L_0x0467
            boolean r2 = r0.f13825N
            if (r2 != 0) goto L_0x0423
            boolean r5 = r0.f13826O
            if (r5 == 0) goto L_0x0467
        L_0x0423:
            if (r2 == 0) goto L_0x0453
            if (r7 != r10) goto L_0x0453
            r0.f13826O = r3
            android.graphics.PointF r2 = r0.f13817F
            android.graphics.PointF r5 = r0.f13816E
            float r6 = r5.x
            float r5 = r5.y
            r2.set(r6, r5)
            int r2 = r17.getActionIndex()
            if (r2 != r3) goto L_0x0446
            android.graphics.PointF r2 = r0.f13835a0
            r5 = 0
            float r6 = r1.getX(r5)
            float r8 = r1.getY(r5)
            goto L_0x0450
        L_0x0446:
            android.graphics.PointF r2 = r0.f13835a0
            float r6 = r1.getX(r3)
            float r8 = r1.getY(r3)
        L_0x0450:
            r2.set(r6, r8)
        L_0x0453:
            r2 = 3
            if (r7 >= r2) goto L_0x045a
            r2 = 0
            r0.f13825N = r2
            goto L_0x045b
        L_0x045a:
            r2 = 0
        L_0x045b:
            if (r7 >= r10) goto L_0x0461
            r0.f13826O = r2
            r0.f13828Q = r2
        L_0x0461:
            r0.mo24280u(r3)
            r5 = r2
            goto L_0x04f5
        L_0x0467:
            r2 = 0
            if (r7 != r3) goto L_0x0470
            r0.f13825N = r2
            r0.f13826O = r2
            r0.f13828Q = r2
        L_0x0470:
            r2 = r3
        L_0x0471:
            r5 = 0
            goto L_0x04f6
        L_0x0474:
            r0.f13846i0 = r2
            r0.mo24281v(r3)
            int r2 = r0.f13828Q
            int r2 = java.lang.Math.max(r2, r7)
            r0.f13828Q = r2
            if (r7 < r10) goto L_0x04d1
            boolean r2 = r0.f13875x
            if (r2 == 0) goto L_0x04c8
            r2 = 0
            float r5 = r1.getX(r2)
            float r6 = r1.getX(r3)
            float r7 = r1.getY(r2)
            float r2 = r1.getY(r3)
            float r2 = r0.mo24237i(r5, r6, r7, r2)
            float r5 = r0.f13814C
            r0.f13815D = r5
            r0.f13836b0 = r2
            android.graphics.PointF r2 = r0.f13817F
            android.graphics.PointF r5 = r0.f13816E
            float r6 = r5.x
            float r5 = r5.y
            r2.set(r6, r5)
            android.graphics.PointF r2 = r0.f13835a0
            r5 = 0
            float r6 = r1.getX(r5)
            float r7 = r1.getX(r3)
            float r7 = r7 + r6
            float r7 = r7 / r9
            float r6 = r1.getY(r5)
            float r8 = r1.getY(r3)
            float r8 = r8 + r6
            float r8 = r8 / r9
            r2.set(r7, r8)
            goto L_0x04cb
        L_0x04c8:
            r5 = 0
            r0.f13828Q = r5
        L_0x04cb:
            android.os.Handler r2 = r0.f13858o0
            r2.removeMessages(r3)
            goto L_0x04f5
        L_0x04d1:
            r5 = 0
            boolean r2 = r0.f13827P
            if (r2 != 0) goto L_0x04f5
            android.graphics.PointF r2 = r0.f13817F
            android.graphics.PointF r6 = r0.f13816E
            float r7 = r6.x
            float r6 = r6.y
            r2.set(r7, r6)
            android.graphics.PointF r2 = r0.f13835a0
            float r6 = r17.getX()
            float r7 = r17.getY()
            r2.set(r6, r7)
            android.os.Handler r2 = r0.f13858o0
            r6 = 600(0x258, double:2.964E-321)
            r2.sendEmptyMessageDelayed(r3, r6)
        L_0x04f5:
            r2 = r3
        L_0x04f6:
            android.graphics.PointF r6 = r0.f13818G
            r0.mo24285z(r4, r6, r10)
            if (r2 != 0) goto L_0x0505
            boolean r1 = super.onTouchEvent(r17)
            if (r1 == 0) goto L_0x0504
            goto L_0x0505
        L_0x0504:
            r3 = r5
        L_0x0505:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final boolean mo24248p() {
        boolean z = true;
        if (this.f13841g != null && !this.f13843h) {
            return true;
        }
        Map<Integer, List<C6922h>> map = this.f13851l;
        if (map == null) {
            return false;
        }
        for (Map.Entry next : map.entrySet()) {
            if (((Integer) next.getKey()).intValue() == this.f13849k) {
                for (C6922h hVar : (List) next.getValue()) {
                    if (hVar.f13915d || hVar.f13914c == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: q */
    public final float mo24249q() {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i = this.f13863r;
        if (i == 2 || i == 4) {
            return Math.max(((float) (getWidth() - paddingRight)) / ((float) mo24284y()), ((float) (getHeight() - paddingTop)) / ((float) mo24283x()));
        }
        if (i == 3) {
            float f = this.f13857o;
            if (f > 0.0f) {
                return f;
            }
        }
        return Math.min(((float) (getWidth() - paddingRight)) / ((float) mo24284y()), ((float) (getHeight() - paddingTop)) / ((float) mo24283x()));
    }

    /* renamed from: r */
    public final synchronized void mo24250r(Bitmap bitmap, int i, boolean z) {
        C6986d dVar;
        int i2 = this.f13822K;
        if (i2 > 0 && this.f13823L > 0 && !(i2 == bitmap.getWidth() && this.f13823L == bitmap.getHeight())) {
            mo24282w(false);
        }
        Bitmap bitmap2 = this.f13841g;
        if (bitmap2 != null && !this.f13845i) {
            bitmap2.recycle();
        }
        if (!(this.f13841g == null || !this.f13845i || (dVar = this.f13852l0) == null)) {
            dVar.mo24370d();
        }
        this.f13843h = false;
        this.f13845i = z;
        this.f13841g = bitmap;
        this.f13822K = bitmap.getWidth();
        this.f13823L = bitmap.getHeight();
        this.f13824M = i;
        boolean h = mo24236h();
        boolean g = mo24226g();
        if (h || g) {
            invalidate();
            requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24251s(android.graphics.Bitmap r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.graphics.Bitmap r0 = r1.f13841g     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x001d
            boolean r0 = r1.f13850k0     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x000a
            goto L_0x001d
        L_0x000a:
            r1.f13841g = r2     // Catch:{ all -> 0x0022 }
            r2 = 1
            r1.f13843h = r2     // Catch:{ all -> 0x0022 }
            boolean r2 = r1.mo24236h()     // Catch:{ all -> 0x0022 }
            if (r2 == 0) goto L_0x001b
            r1.invalidate()     // Catch:{ all -> 0x0022 }
            r1.requestLayout()     // Catch:{ all -> 0x0022 }
        L_0x001b:
            monitor-exit(r1)
            return
        L_0x001d:
            r2.recycle()     // Catch:{ all -> 0x0022 }
            monitor-exit(r1)
            return
        L_0x0022:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.mo24251s(android.graphics.Bitmap):void");
    }

    public final void setBitmapDecoderClass(@NonNull Class<? extends C6991c> cls) {
        if (cls != null) {
            this.f13833V = new C6989a(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setBitmapDecoderFactory(@NonNull C6990b<? extends C6991c> bVar) {
        if (bVar != null) {
            this.f13833V = bVar;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.f13813B = Math.max(0, i);
    }

    public final void setDoubleTapZoomScale(float f) {
        this.f13877z = f;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (C6988f.f14026c.contains(Integer.valueOf(i))) {
            this.f13812A = i;
            return;
        }
        throw new IllegalArgumentException(C0843a.m444e("Invalid zoom style: ", i));
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.f13871v = z;
    }

    public void setExecutor(@NonNull Executor executor) {
        Objects.requireNonNull(executor, "Executor must not be null");
        this.f13869u = executor;
    }

    public final void setImage(@NonNull C6983a aVar) {
        Objects.requireNonNull(aVar, "imageSource must not be null");
        mo24282w(true);
        Bitmap bitmap = aVar.f14014b;
        if (bitmap != null) {
            mo24250r(bitmap, 0, aVar.f14019g);
            return;
        }
        Uri uri = aVar.f14013a;
        this.f13847j = uri;
        if (uri == null && aVar.f14015c != null) {
            StringBuilder u = C0843a.m460u("android.resource://");
            u.append(getContext().getPackageName());
            u.append("/");
            u.append(aVar.f14015c);
            this.f13847j = Uri.parse(u.toString());
        }
        if (!aVar.f14016d) {
            new C6920f(this, getContext(), this.f13833V, this.f13847j, false).executeOnExecutor(this.f13869u, new Void[0]);
            return;
        }
        new C6924j(this, getContext(), this.f13834W, this.f13847j).executeOnExecutor(this.f13869u, new Void[0]);
    }

    public final void setMaxScale(float f) {
        this.f13855n = f;
    }

    public void setMaxTileSize(int i) {
        this.f13865s = i;
        this.f13867t = i;
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setMinScale(float f) {
        this.f13857o = f;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setMinimumScaleType(int i) {
        if (C6988f.f14029f.contains(Integer.valueOf(i))) {
            this.f13863r = i;
            if (this.f13848j0) {
                mo24240l(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0843a.m444e("Invalid scale type: ", i));
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f13859p = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, (float) i);
        if (this.f13848j0) {
            mo24282w(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(C6986d dVar) {
        this.f13852l0 = dVar;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13856n0 = onLongClickListener;
    }

    public void setOnStateChangedListener(C6987e eVar) {
        this.f13854m0 = eVar;
    }

    public final void setOrientation(int i) {
        if (C6988f.f14025b.contains(Integer.valueOf(i))) {
            this.f13853m = i;
            mo24282w(false);
            invalidate();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException(C0843a.m444e("Invalid orientation: ", i));
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.f13873w = z;
        if (!z && (pointF = this.f13816E) != null) {
            pointF.x = ((float) (getWidth() / 2)) - (this.f13814C * ((float) (mo24284y() / 2)));
            this.f13816E.y = ((float) (getHeight() / 2)) - (this.f13814C * ((float) (mo24283x() / 2)));
            if (this.f13848j0) {
                mo24280u(true);
                invalidate();
            }
        }
    }

    public final void setPanLimit(int i) {
        if (C6988f.f14028e.contains(Integer.valueOf(i))) {
            this.f13861q = i;
            if (this.f13848j0) {
                mo24240l(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0843a.m444e("Invalid pan limit: ", i));
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.f13876y = z;
    }

    public final void setRegionDecoderClass(@NonNull Class<? extends C6992d> cls) {
        if (cls != null) {
            this.f13834W = new C6989a(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setRegionDecoderFactory(@NonNull C6990b<? extends C6992d> bVar) {
        if (bVar != null) {
            this.f13834W = bVar;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.f13862q0 = null;
        } else {
            Paint paint = new Paint();
            this.f13862q0 = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f13862q0.setColor(i);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.f13875x = z;
    }

    /* renamed from: t */
    public final void mo24279t() {
        Float f;
        if (getWidth() != 0 && getHeight() != 0 && this.f13822K > 0 && this.f13823L > 0) {
            if (!(this.f13820I == null || (f = this.f13819H) == null)) {
                this.f13814C = f.floatValue();
                if (this.f13816E == null) {
                    this.f13816E = new PointF();
                }
                this.f13816E.x = ((float) (getWidth() / 2)) - (this.f13814C * this.f13820I.x);
                this.f13816E.y = ((float) (getHeight() / 2)) - (this.f13814C * this.f13820I.y);
                this.f13820I = null;
                this.f13819H = null;
                mo24240l(true);
                mo24280u(true);
            }
            mo24240l(false);
        }
    }

    /* renamed from: u */
    public final void mo24280u(boolean z) {
        if (this.f13831T != null && this.f13851l != null) {
            int min = Math.min(this.f13849k, mo24225f(this.f13814C));
            for (Map.Entry<Integer, List<C6922h>> value : this.f13851l.entrySet()) {
                for (C6922h hVar : (List) value.getValue()) {
                    int i = hVar.f13913b;
                    if (i < min || (i > min && i != this.f13849k)) {
                        hVar.f13916e = false;
                        Bitmap bitmap = hVar.f13914c;
                        if (bitmap != null) {
                            bitmap.recycle();
                            hVar.f13914c = null;
                        }
                    }
                    int i2 = hVar.f13913b;
                    if (i2 == min) {
                        float G = mo24223G(0.0f);
                        float G2 = mo24223G((float) getWidth());
                        float H = mo24224H(0.0f);
                        float H2 = mo24224H((float) getHeight());
                        Rect rect = hVar.f13912a;
                        if (G <= ((float) rect.right) && ((float) rect.left) <= G2 && H <= ((float) rect.bottom) && ((float) rect.top) <= H2) {
                            hVar.f13916e = true;
                            if (!hVar.f13915d && hVar.f13914c == null && z) {
                                new C6923i(this, this.f13831T, hVar).executeOnExecutor(this.f13869u, new Void[0]);
                            }
                        } else if (hVar.f13913b != this.f13849k) {
                            hVar.f13916e = false;
                            Bitmap bitmap2 = hVar.f13914c;
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                                hVar.f13914c = null;
                            }
                        }
                    } else if (i2 == this.f13849k) {
                        hVar.f13916e = true;
                    }
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo24281v(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: w */
    public final void mo24282w(boolean z) {
        C6986d dVar;
        this.f13814C = 0.0f;
        this.f13815D = 0.0f;
        this.f13816E = null;
        this.f13817F = null;
        this.f13818G = null;
        this.f13819H = Float.valueOf(0.0f);
        this.f13820I = null;
        this.f13821J = null;
        this.f13825N = false;
        this.f13826O = false;
        this.f13827P = false;
        this.f13828Q = 0;
        this.f13849k = 0;
        this.f13835a0 = null;
        this.f13836b0 = 0.0f;
        this.f13838d0 = 0.0f;
        this.f13839e0 = false;
        this.f13842g0 = null;
        this.f13840f0 = null;
        this.f13844h0 = null;
        this.f13846i0 = null;
        this.f13864r0 = null;
        this.f13866s0 = null;
        this.f13868t0 = null;
        if (z) {
            this.f13847j = null;
            this.f13832U.writeLock().lock();
            try {
                C6992d dVar2 = this.f13831T;
                if (dVar2 != null) {
                    dVar2.recycle();
                    this.f13831T = null;
                }
                this.f13832U.writeLock().unlock();
                Bitmap bitmap = this.f13841g;
                if (bitmap != null && !this.f13845i) {
                    bitmap.recycle();
                }
                if (!(this.f13841g == null || !this.f13845i || (dVar = this.f13852l0) == null)) {
                    dVar.mo24370d();
                }
                this.f13822K = 0;
                this.f13823L = 0;
                this.f13824M = 0;
                this.f13848j0 = false;
                this.f13850k0 = false;
                this.f13841g = null;
                this.f13843h = false;
                this.f13845i = false;
            } catch (Throwable th) {
                this.f13832U.writeLock().unlock();
                throw th;
            }
        }
        Map<Integer, List<C6922h>> map = this.f13851l;
        if (map != null) {
            for (Map.Entry<Integer, List<C6922h>> value : map.entrySet()) {
                for (C6922h hVar : (List) value.getValue()) {
                    hVar.f13916e = false;
                    Bitmap bitmap2 = hVar.f13914c;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        hVar.f13914c = null;
                    }
                }
            }
            this.f13851l = null;
        }
        setGestureDetector(getContext());
    }

    /* renamed from: x */
    public final int mo24283x() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f13822K : this.f13823L;
    }

    /* renamed from: y */
    public final int mo24284y() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f13823L : this.f13822K;
    }

    /* renamed from: z */
    public final void mo24285z(float f, PointF pointF, int i) {
        C6987e eVar = this.f13854m0;
        if (eVar != null) {
            float f2 = this.f13814C;
            if (f2 != f) {
                eVar.mo24373a(f2, i);
            }
        }
        if (this.f13854m0 != null && !this.f13816E.equals(pointF)) {
            this.f13854m0.mo24374b(getCenter(), i);
        }
    }
}
