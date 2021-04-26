package p005b.p080i.p081a;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p080i.p081a.C1394b;
import p005b.p080i.p081a.C1422f;

/* renamed from: b.i.a.g */
public class C1489g {

    /* renamed from: g */
    public static HashSet<String> f2124g;

    /* renamed from: a */
    public Canvas f2125a;

    /* renamed from: b */
    public C1422f f2126b;

    /* renamed from: c */
    public C1497h f2127c;

    /* renamed from: d */
    public Stack<C1497h> f2128d;

    /* renamed from: e */
    public Stack<C1422f.C1454i0> f2129e;

    /* renamed from: f */
    public Stack<Matrix> f2130f;

    /* renamed from: b.i.a.g$b */
    public class C1491b implements C1422f.C1481w {

        /* renamed from: a */
        public List<C1492c> f2131a = new ArrayList();

        /* renamed from: b */
        public float f2132b;

        /* renamed from: c */
        public float f2133c;

        /* renamed from: d */
        public C1492c f2134d = null;

        /* renamed from: e */
        public boolean f2135e = false;

        /* renamed from: f */
        public boolean f2136f = true;

        /* renamed from: g */
        public int f2137g = -1;

        /* renamed from: h */
        public boolean f2138h;

        public C1491b(C1422f.C1479v vVar) {
            if (vVar != null) {
                vVar.mo11343h(this);
                if (this.f2138h) {
                    this.f2134d.mo11393b(this.f2131a.get(this.f2137g));
                    this.f2131a.set(this.f2137g, this.f2134d);
                    this.f2138h = false;
                }
                C1492c cVar = this.f2134d;
                if (cVar != null) {
                    this.f2131a.add(cVar);
                }
            }
        }

        /* renamed from: a */
        public void mo11335a(float f, float f2) {
            if (this.f2138h) {
                this.f2134d.mo11393b(this.f2131a.get(this.f2137g));
                this.f2131a.set(this.f2137g, this.f2134d);
                this.f2138h = false;
            }
            C1492c cVar = this.f2134d;
            if (cVar != null) {
                this.f2131a.add(cVar);
            }
            this.f2132b = f;
            this.f2133c = f2;
            this.f2134d = new C1492c(C1489g.this, f, f2, 0.0f, 0.0f);
            this.f2137g = this.f2131a.size();
        }

        /* renamed from: b */
        public void mo11336b(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f2136f || this.f2135e) {
                this.f2134d.mo11392a(f, f2);
                this.f2131a.add(this.f2134d);
                this.f2135e = false;
            }
            this.f2134d = new C1492c(C1489g.this, f5, f6, f5 - f3, f6 - f4);
            this.f2138h = false;
        }

        /* renamed from: c */
        public void mo11337c(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.f2135e = true;
            this.f2136f = false;
            C1492c cVar = this.f2134d;
            C1489g.m1627a(cVar.f2140a, cVar.f2141b, f, f2, f3, z, z2, f4, f5, this);
            this.f2136f = true;
            this.f2138h = false;
        }

        public void close() {
            this.f2131a.add(this.f2134d);
            mo11340e(this.f2132b, this.f2133c);
            this.f2138h = true;
        }

        /* renamed from: d */
        public void mo11339d(float f, float f2, float f3, float f4) {
            this.f2134d.mo11392a(f, f2);
            this.f2131a.add(this.f2134d);
            this.f2134d = new C1492c(C1489g.this, f3, f4, f3 - f, f4 - f2);
            this.f2138h = false;
        }

        /* renamed from: e */
        public void mo11340e(float f, float f2) {
            this.f2134d.mo11392a(f, f2);
            this.f2131a.add(this.f2134d);
            C1489g gVar = C1489g.this;
            C1492c cVar = this.f2134d;
            this.f2134d = new C1492c(gVar, f, f2, f - cVar.f2140a, f2 - cVar.f2141b);
            this.f2138h = false;
        }
    }

    /* renamed from: b.i.a.g$c */
    public class C1492c {

        /* renamed from: a */
        public float f2140a;

        /* renamed from: b */
        public float f2141b;

        /* renamed from: c */
        public float f2142c = 0.0f;

        /* renamed from: d */
        public float f2143d = 0.0f;

        /* renamed from: e */
        public boolean f2144e = false;

        public C1492c(C1489g gVar, float f, float f2, float f3, float f4) {
            this.f2140a = f;
            this.f2141b = f2;
            double sqrt = Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
            if (sqrt != ShadowDrawableWrapper.COS_45) {
                this.f2142c = (float) (((double) f3) / sqrt);
                this.f2143d = (float) (((double) f4) / sqrt);
            }
        }

        /* renamed from: a */
        public void mo11392a(float f, float f2) {
            float f3 = f - this.f2140a;
            float f4 = f2 - this.f2141b;
            double sqrt = Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
            if (sqrt != ShadowDrawableWrapper.COS_45) {
                f3 = (float) (((double) f3) / sqrt);
                f4 = (float) (((double) f4) / sqrt);
            }
            float f5 = this.f2142c;
            if (f3 == (-f5) && f4 == (-this.f2143d)) {
                this.f2144e = true;
                this.f2142c = -f4;
            } else {
                this.f2142c = f5 + f3;
                f3 = this.f2143d + f4;
            }
            this.f2143d = f3;
        }

        /* renamed from: b */
        public void mo11393b(C1492c cVar) {
            float f = cVar.f2142c;
            float f2 = this.f2142c;
            if (f == (-f2)) {
                float f3 = cVar.f2143d;
                if (f3 == (-this.f2143d)) {
                    this.f2144e = true;
                    this.f2142c = -f3;
                    this.f2143d = cVar.f2142c;
                    return;
                }
            }
            this.f2142c = f2 + f;
            this.f2143d += cVar.f2143d;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("(");
            u.append(this.f2140a);
            u.append(",");
            u.append(this.f2141b);
            u.append(" ");
            u.append(this.f2142c);
            u.append(",");
            u.append(this.f2143d);
            u.append(")");
            return u.toString();
        }
    }

    /* renamed from: b.i.a.g$d */
    public class C1493d implements C1422f.C1481w {

        /* renamed from: a */
        public Path f2145a = new Path();

        /* renamed from: b */
        public float f2146b;

        /* renamed from: c */
        public float f2147c;

        public C1493d(C1489g gVar, C1422f.C1479v vVar) {
            if (vVar != null) {
                vVar.mo11343h(this);
            }
        }

        /* renamed from: a */
        public void mo11335a(float f, float f2) {
            this.f2145a.moveTo(f, f2);
            this.f2146b = f;
            this.f2147c = f2;
        }

        /* renamed from: b */
        public void mo11336b(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f2145a.cubicTo(f, f2, f3, f4, f5, f6);
            this.f2146b = f5;
            this.f2147c = f6;
        }

        /* renamed from: c */
        public void mo11337c(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            C1489g.m1627a(this.f2146b, this.f2147c, f, f2, f3, z, z2, f4, f5, this);
            this.f2146b = f4;
            this.f2147c = f5;
        }

        public void close() {
            this.f2145a.close();
        }

        /* renamed from: d */
        public void mo11339d(float f, float f2, float f3, float f4) {
            this.f2145a.quadTo(f, f2, f3, f4);
            this.f2146b = f3;
            this.f2147c = f4;
        }

        /* renamed from: e */
        public void mo11340e(float f, float f2) {
            this.f2145a.lineTo(f, f2);
            this.f2146b = f;
            this.f2147c = f2;
        }
    }

    /* renamed from: b.i.a.g$e */
    public class C1494e extends C1495f {

        /* renamed from: d */
        public Path f2148d;

        public C1494e(Path path, float f, float f2) {
            super(f, f2);
            this.f2148d = path;
        }

        /* renamed from: b */
        public void mo11395b(String str) {
            if (C1489g.this.mo11369Z()) {
                C1489g gVar = C1489g.this;
                C1497h hVar = gVar.f2127c;
                if (hVar.f2158b) {
                    gVar.f2125a.drawTextOnPath(str, this.f2148d, this.f2150a, this.f2151b, hVar.f2160d);
                }
                C1489g gVar2 = C1489g.this;
                C1497h hVar2 = gVar2.f2127c;
                if (hVar2.f2159c) {
                    gVar2.f2125a.drawTextOnPath(str, this.f2148d, this.f2150a, this.f2151b, hVar2.f2161e);
                }
            }
            this.f2150a = C1489g.this.f2127c.f2160d.measureText(str) + this.f2150a;
        }
    }

    /* renamed from: b.i.a.g$f */
    public class C1495f extends C1499j {

        /* renamed from: a */
        public float f2150a;

        /* renamed from: b */
        public float f2151b;

        public C1495f(float f, float f2) {
            super(C1489g.this, (C1490a) null);
            this.f2150a = f;
            this.f2151b = f2;
        }

        /* renamed from: b */
        public void mo11395b(String str) {
            if (C1489g.this.mo11369Z()) {
                C1489g gVar = C1489g.this;
                C1497h hVar = gVar.f2127c;
                if (hVar.f2158b) {
                    gVar.f2125a.drawText(str, this.f2150a, this.f2151b, hVar.f2160d);
                }
                C1489g gVar2 = C1489g.this;
                C1497h hVar2 = gVar2.f2127c;
                if (hVar2.f2159c) {
                    gVar2.f2125a.drawText(str, this.f2150a, this.f2151b, hVar2.f2161e);
                }
            }
            this.f2150a = C1489g.this.f2127c.f2160d.measureText(str) + this.f2150a;
        }
    }

    /* renamed from: b.i.a.g$g */
    public class C1496g extends C1499j {

        /* renamed from: a */
        public float f2153a;

        /* renamed from: b */
        public float f2154b;

        /* renamed from: c */
        public Path f2155c;

        public C1496g(float f, float f2, Path path) {
            super(C1489g.this, (C1490a) null);
            this.f2153a = f;
            this.f2154b = f2;
            this.f2155c = path;
        }

        /* renamed from: a */
        public boolean mo11396a(C1422f.C1484x0 x0Var) {
            if (!(x0Var instanceof C1422f.C1486y0)) {
                return true;
            }
            C1489g.m1628a0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        /* renamed from: b */
        public void mo11395b(String str) {
            if (C1489g.this.mo11369Z()) {
                Path path = new Path();
                C1489g.this.f2127c.f2160d.getTextPath(str, 0, str.length(), this.f2153a, this.f2154b, path);
                this.f2155c.addPath(path);
            }
            this.f2153a = C1489g.this.f2127c.f2160d.measureText(str) + this.f2153a;
        }
    }

    /* renamed from: b.i.a.g$h */
    public class C1497h {

        /* renamed from: a */
        public C1422f.C1433d0 f2157a;

        /* renamed from: b */
        public boolean f2158b;

        /* renamed from: c */
        public boolean f2159c;

        /* renamed from: d */
        public Paint f2160d;

        /* renamed from: e */
        public Paint f2161e;

        /* renamed from: f */
        public C1422f.C1423a f2162f;

        /* renamed from: g */
        public C1422f.C1423a f2163g;

        /* renamed from: h */
        public boolean f2164h;

        public C1497h(C1489g gVar) {
            Paint paint = new Paint();
            this.f2160d = paint;
            paint.setFlags(193);
            this.f2160d.setHinting(0);
            this.f2160d.setStyle(Paint.Style.FILL);
            this.f2160d.setTypeface(Typeface.DEFAULT);
            Paint paint2 = new Paint();
            this.f2161e = paint2;
            paint2.setFlags(193);
            this.f2161e.setHinting(0);
            this.f2161e.setStyle(Paint.Style.STROKE);
            this.f2161e.setTypeface(Typeface.DEFAULT);
            this.f2157a = C1422f.C1433d0.m1537a();
        }

        public C1497h(C1489g gVar, C1497h hVar) {
            this.f2158b = hVar.f2158b;
            this.f2159c = hVar.f2159c;
            this.f2160d = new Paint(hVar.f2160d);
            this.f2161e = new Paint(hVar.f2161e);
            C1422f.C1423a aVar = hVar.f2162f;
            if (aVar != null) {
                this.f2162f = new C1422f.C1423a(aVar);
            }
            C1422f.C1423a aVar2 = hVar.f2163g;
            if (aVar2 != null) {
                this.f2163g = new C1422f.C1423a(aVar2);
            }
            this.f2164h = hVar.f2164h;
            try {
                this.f2157a = (C1422f.C1433d0) hVar.f2157a.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.f2157a = C1422f.C1433d0.m1537a();
            }
        }
    }

    /* renamed from: b.i.a.g$i */
    public class C1498i extends C1499j {

        /* renamed from: a */
        public float f2165a;

        /* renamed from: b */
        public float f2166b;

        /* renamed from: c */
        public RectF f2167c = new RectF();

        public C1498i(float f, float f2) {
            super(C1489g.this, (C1490a) null);
            this.f2165a = f;
            this.f2166b = f2;
        }

        /* renamed from: a */
        public boolean mo11396a(C1422f.C1484x0 x0Var) {
            if (!(x0Var instanceof C1422f.C1486y0)) {
                return true;
            }
            C1422f.C1486y0 y0Var = (C1422f.C1486y0) x0Var;
            C1422f.C1462m0 g = x0Var.f2065a.mo11301g(y0Var.f2117n);
            if (g == null) {
                C1489g.m1631q("TextPath path reference '%s' not found", y0Var.f2117n);
                return false;
            }
            C1422f.C1477u uVar = (C1422f.C1477u) g;
            Path path = new C1493d(C1489g.this, uVar.f2100o).f2145a;
            Matrix matrix = uVar.f2054n;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.f2167c.union(rectF);
            return false;
        }

        /* renamed from: b */
        public void mo11395b(String str) {
            if (C1489g.this.mo11369Z()) {
                Rect rect = new Rect();
                C1489g.this.f2127c.f2160d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f2165a, this.f2166b);
                this.f2167c.union(rectF);
            }
            this.f2165a = C1489g.this.f2127c.f2160d.measureText(str) + this.f2165a;
        }
    }

    /* renamed from: b.i.a.g$j */
    public abstract class C1499j {
        public C1499j(C1489g gVar, C1490a aVar) {
        }

        /* renamed from: a */
        public boolean mo11396a(C1422f.C1484x0 x0Var) {
            return true;
        }

        /* renamed from: b */
        public abstract void mo11395b(String str);
    }

    /* renamed from: b.i.a.g$k */
    public class C1500k extends C1499j {

        /* renamed from: a */
        public float f2169a = 0.0f;

        public C1500k(C1490a aVar) {
            super(C1489g.this, (C1490a) null);
        }

        /* renamed from: b */
        public void mo11395b(String str) {
            this.f2169a = C1489g.this.f2127c.f2160d.measureText(str) + this.f2169a;
        }
    }

    public C1489g(Canvas canvas, float f) {
        this.f2125a = canvas;
    }

    /* renamed from: a */
    public static void m1627a(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, C1422f.C1481w wVar) {
        float f8 = f5;
        boolean z3 = z2;
        float f9 = f6;
        float f10 = f7;
        if (f != f9 || f2 != f10) {
            if (f3 == 0.0f || f4 == 0.0f) {
                wVar.mo11340e(f9, f10);
                return;
            }
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            double radians = Math.toRadians(((double) f8) % 360.0d);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d = ((double) (f - f9)) / 2.0d;
            double d2 = ((double) (f2 - f10)) / 2.0d;
            double d3 = (sin * d2) + (cos * d);
            double d4 = (d2 * cos) + ((-sin) * d);
            double d5 = (double) (abs * abs);
            double d6 = (double) (abs2 * abs2);
            double d7 = d3 * d3;
            double d8 = d4 * d4;
            double d9 = (d8 / d6) + (d7 / d5);
            if (d9 > 0.99999d) {
                double sqrt = Math.sqrt(d9) * 1.00001d;
                abs = (float) (((double) abs) * sqrt);
                abs2 = (float) (sqrt * ((double) abs2));
                d5 = (double) (abs * abs);
                d6 = (double) (abs2 * abs2);
            }
            double d10 = z == z3 ? -1.0d : 1.0d;
            double d11 = d5 * d6;
            double d12 = d5 * d8;
            double d13 = d6 * d7;
            double d14 = ((d11 - d12) - d13) / (d12 + d13);
            if (d14 < ShadowDrawableWrapper.COS_45) {
                d14 = 0.0d;
            }
            double sqrt2 = Math.sqrt(d14) * d10;
            double d15 = (double) abs;
            double d16 = (double) abs2;
            double d17 = ((d15 * d4) / d16) * sqrt2;
            float f11 = abs;
            float f12 = abs2;
            double d18 = sqrt2 * (-((d16 * d3) / d15));
            double d19 = d16;
            double d20 = ((cos * d17) - (sin * d18)) + (((double) (f + f6)) / 2.0d);
            double d21 = (cos * d18) + (sin * d17) + (((double) (f2 + f7)) / 2.0d);
            double d22 = (d3 - d17) / d15;
            double d23 = (d4 - d18) / d19;
            double d24 = ((-d3) - d17) / d15;
            double d25 = ((-d4) - d18) / d19;
            double d26 = (d23 * d23) + (d22 * d22);
            double acos = Math.acos(d22 / Math.sqrt(d26)) * (d23 < ShadowDrawableWrapper.COS_45 ? -1.0d : 1.0d);
            double sqrt3 = ((d23 * d25) + (d22 * d24)) / Math.sqrt(((d25 * d25) + (d24 * d24)) * d26);
            double acos2 = ((d22 * d25) - (d23 * d24) < ShadowDrawableWrapper.COS_45 ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? ShadowDrawableWrapper.COS_45 : Math.acos(sqrt3));
            if (!z2 && acos2 > ShadowDrawableWrapper.COS_45) {
                acos2 -= 6.283185307179586d;
            } else if (z2 && acos2 < ShadowDrawableWrapper.COS_45) {
                acos2 += 6.283185307179586d;
            }
            double d27 = acos2 % 6.283185307179586d;
            double d28 = acos % 6.283185307179586d;
            int ceil = (int) Math.ceil((Math.abs(d27) * 2.0d) / 3.141592653589793d);
            double d29 = d27 / ((double) ceil);
            double d30 = d29 / 2.0d;
            double sin2 = (Math.sin(d30) * 1.3333333333333333d) / (Math.cos(d30) + 1.0d);
            int i = ceil * 6;
            float[] fArr = new float[i];
            int i2 = 0;
            int i3 = 0;
            while (i2 < ceil) {
                double d31 = (((double) i2) * d29) + d28;
                double cos2 = Math.cos(d31);
                double sin3 = Math.sin(d31);
                int i4 = i3 + 1;
                double d32 = d28;
                fArr[i3] = (float) (cos2 - (sin2 * sin3));
                int i5 = i4 + 1;
                int i6 = ceil;
                fArr[i4] = (float) ((cos2 * sin2) + sin3);
                double d33 = d31 + d29;
                double cos3 = Math.cos(d33);
                double sin4 = Math.sin(d33);
                int i7 = i5 + 1;
                double d34 = d29;
                fArr[i5] = (float) ((sin2 * sin4) + cos3);
                int i8 = i7 + 1;
                fArr[i7] = (float) (sin4 - (sin2 * cos3));
                int i9 = i8 + 1;
                fArr[i8] = (float) cos3;
                i3 = i9 + 1;
                fArr[i9] = (float) sin4;
                i2++;
                d21 = d21;
                i = i;
                d28 = d32;
                ceil = i6;
                d29 = d34;
            }
            int i10 = i;
            double d35 = d21;
            Matrix matrix = new Matrix();
            matrix.postScale(f11, f12);
            matrix.postRotate(f5);
            matrix.postTranslate((float) d20, (float) d21);
            matrix.mapPoints(fArr);
            fArr[i10 - 2] = f6;
            fArr[i10 - 1] = f7;
            int i11 = i10;
            for (int i12 = 0; i12 < i11; i12 += 6) {
                wVar.mo11336b(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3], fArr[i12 + 4], fArr[i12 + 5]);
            }
        }
    }

    /* renamed from: a0 */
    public static void m1628a0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: j */
    public static int m1629j(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    /* renamed from: k */
    public static int m1630k(int i, float f) {
        int i2 = 255;
        int round = Math.round(((float) ((i >> 24) & 255)) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }

    /* renamed from: q */
    public static void m1631q(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: A */
    public final boolean mo11344A(C1422f.C1433d0 d0Var, long j) {
        return (d0Var.f1962g & j) != 0;
    }

    /* renamed from: B */
    public final Path mo11345B(C1422f.C1429c cVar) {
        C1422f.C1429c cVar2 = cVar;
        C1422f.C1465o oVar = cVar2.f1928o;
        float f = 0.0f;
        float d = oVar != null ? oVar.mo11329d(this) : 0.0f;
        C1422f.C1465o oVar2 = cVar2.f1929p;
        if (oVar2 != null) {
            f = oVar2.mo11330f(this);
        }
        float b = cVar2.f1930q.mo11327b(this);
        float f2 = d - b;
        float f3 = f - b;
        float f4 = d + b;
        float f5 = f + b;
        if (cVar2.f2053h == null) {
            float f6 = 2.0f * b;
            cVar2.f2053h = new C1422f.C1423a(f2, f3, f6, f6);
        }
        float f7 = 0.5522848f * b;
        Path path = new Path();
        path.moveTo(d, f3);
        float f8 = d + f7;
        float f9 = f - f7;
        Path path2 = path;
        path2.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path2.cubicTo(f4, f10, f8, f5, d, f5);
        float f11 = d - f7;
        path2.cubicTo(f11, f5, f2, f10, f2, f);
        path2.cubicTo(f2, f9, f11, f3, d, f3);
        path.close();
        return path;
    }

    /* renamed from: C */
    public final Path mo11346C(C1422f.C1451h hVar) {
        C1422f.C1451h hVar2 = hVar;
        C1422f.C1465o oVar = hVar2.f2035o;
        float f = 0.0f;
        float d = oVar != null ? oVar.mo11329d(this) : 0.0f;
        C1422f.C1465o oVar2 = hVar2.f2036p;
        if (oVar2 != null) {
            f = oVar2.mo11330f(this);
        }
        float d2 = hVar2.f2037q.mo11329d(this);
        float f2 = hVar2.f2038r.mo11330f(this);
        float f3 = d - d2;
        float f4 = f - f2;
        float f5 = d + d2;
        float f6 = f + f2;
        if (hVar2.f2053h == null) {
            hVar2.f2053h = new C1422f.C1423a(f3, f4, d2 * 2.0f, 2.0f * f2);
        }
        float f7 = d2 * 0.5522848f;
        float f8 = 0.5522848f * f2;
        Path path = new Path();
        path.moveTo(d, f4);
        float f9 = d + f7;
        float f10 = f - f8;
        Path path2 = path;
        path.cubicTo(f9, f4, f5, f10, f5, f);
        float f11 = f8 + f;
        Path path3 = path2;
        path3.cubicTo(f5, f11, f9, f6, d, f6);
        float f12 = d - f7;
        path3.cubicTo(f12, f6, f3, f11, f3, f);
        path3.cubicTo(f3, f10, f12, f4, d, f4);
        path2.close();
        return path2;
    }

    /* renamed from: D */
    public final Path mo11347D(C1422f.C1485y yVar) {
        Path path = new Path();
        float[] fArr = yVar.f2116o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = yVar.f2116o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (yVar instanceof C1422f.C1487z) {
            path.close();
        }
        if (yVar.f2053h == null) {
            yVar.f2053h = mo11371c(path);
        }
        return path;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Path mo11348E(p005b.p080i.p081a.C1422f.C1424a0 r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            b.i.a.f$o r2 = r1.f1921s
            r3 = 0
            if (r2 != 0) goto L_0x000f
            b.i.a.f$o r4 = r1.f1922t
            if (r4 != 0) goto L_0x000f
            r2 = r3
            goto L_0x0020
        L_0x000f:
            if (r2 != 0) goto L_0x0018
            b.i.a.f$o r2 = r1.f1922t
            float r2 = r2.mo11330f(r0)
            goto L_0x0020
        L_0x0018:
            b.i.a.f$o r4 = r1.f1922t
            float r2 = r2.mo11329d(r0)
            if (r4 != 0) goto L_0x0022
        L_0x0020:
            r4 = r2
            goto L_0x0028
        L_0x0022:
            b.i.a.f$o r4 = r1.f1922t
            float r4 = r4.mo11330f(r0)
        L_0x0028:
            b.i.a.f$o r5 = r1.f1919q
            float r5 = r5.mo11329d(r0)
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r2 = java.lang.Math.min(r2, r5)
            b.i.a.f$o r5 = r1.f1920r
            float r5 = r5.mo11330f(r0)
            float r5 = r5 / r6
            float r4 = java.lang.Math.min(r4, r5)
            b.i.a.f$o r5 = r1.f1917o
            if (r5 == 0) goto L_0x0049
            float r5 = r5.mo11329d(r0)
            goto L_0x004a
        L_0x0049:
            r5 = r3
        L_0x004a:
            b.i.a.f$o r6 = r1.f1918p
            if (r6 == 0) goto L_0x0054
            float r6 = r6.mo11330f(r0)
            r13 = r6
            goto L_0x0055
        L_0x0054:
            r13 = r3
        L_0x0055:
            b.i.a.f$o r6 = r1.f1919q
            float r6 = r6.mo11329d(r0)
            b.i.a.f$o r7 = r1.f1920r
            float r7 = r7.mo11330f(r0)
            b.i.a.f$a r8 = r1.f2053h
            if (r8 != 0) goto L_0x006c
            b.i.a.f$a r8 = new b.i.a.f$a
            r8.<init>(r5, r13, r6, r7)
            r1.f2053h = r8
        L_0x006c:
            float r15 = r5 + r6
            float r1 = r13 + r7
            android.graphics.Path r14 = new android.graphics.Path
            r14.<init>()
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00d6
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x007f
            goto L_0x00d6
        L_0x007f:
            r3 = 1057841801(0x3f0d6289, float:0.5522848)
            float r16 = r2 * r3
            float r3 = r3 * r4
            float r12 = r13 + r4
            r14.moveTo(r5, r12)
            float r17 = r12 - r3
            float r11 = r5 + r2
            float r21 = r11 - r16
            r6 = r14
            r7 = r5
            r8 = r17
            r9 = r21
            r10 = r13
            r24 = r11
            r22 = r12
            r12 = r13
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            float r2 = r15 - r2
            r14.lineTo(r2, r13)
            float r6 = r2 + r16
            r7 = r14
            r8 = r6
            r9 = r13
            r10 = r15
            r11 = r17
            r12 = r15
            r13 = r22
            r7.cubicTo(r8, r9, r10, r11, r12, r13)
            float r12 = r1 - r4
            r14.lineTo(r15, r12)
            float r10 = r12 + r3
            r3 = r14
            r16 = r10
            r17 = r6
            r18 = r1
            r19 = r2
            r20 = r1
            r14.cubicTo(r15, r16, r17, r18, r19, r20)
            r2 = r24
            r3.lineTo(r2, r1)
            r6 = r3
            r7 = r21
            r8 = r1
            r9 = r5
            r11 = r5
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            goto L_0x00e3
        L_0x00d6:
            r3 = r14
            r3.moveTo(r5, r13)
            r3.lineTo(r15, r13)
            r3.lineTo(r15, r1)
            r3.lineTo(r5, r1)
        L_0x00e3:
            r3.lineTo(r5, r13)
            r3.close()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1489g.mo11348E(b.i.a.f$a0):android.graphics.Path");
    }

    /* renamed from: F */
    public final C1422f.C1423a mo11349F(C1422f.C1465o oVar, C1422f.C1465o oVar2, C1422f.C1465o oVar3, C1422f.C1465o oVar4) {
        float f = 0.0f;
        float d = oVar != null ? oVar.mo11329d(this) : 0.0f;
        if (oVar2 != null) {
            f = oVar2.mo11330f(this);
        }
        C1422f.C1423a z = mo11391z();
        return new C1422f.C1423a(d, f, oVar3 != null ? oVar3.mo11329d(this) : z.f1915c, oVar4 != null ? oVar4.mo11330f(this) : z.f1916d);
    }

    @TargetApi(19)
    /* renamed from: G */
    public final Path mo11350G(C1422f.C1456j0 j0Var, boolean z) {
        Path path;
        Path b;
        this.f2128d.push(this.f2127c);
        C1497h hVar = new C1497h(this, this.f2127c);
        this.f2127c = hVar;
        mo11367X(hVar, j0Var);
        if (!mo11379m() || !mo11369Z()) {
            this.f2127c = this.f2128d.pop();
            return null;
        }
        if (j0Var instanceof C1422f.C1443d1) {
            if (!z) {
                m1631q("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C1422f.C1443d1 d1Var = (C1422f.C1443d1) j0Var;
            C1422f.C1462m0 g = j0Var.f2065a.mo11301g(d1Var.f2017o);
            if (g == null) {
                m1631q("Use reference '%s' not found", d1Var.f2017o);
                this.f2127c = this.f2128d.pop();
                return null;
            } else if (!(g instanceof C1422f.C1456j0)) {
                this.f2127c = this.f2128d.pop();
                return null;
            } else {
                path = mo11350G((C1422f.C1456j0) g, false);
                if (path == null) {
                    return null;
                }
                if (d1Var.f2053h == null) {
                    d1Var.f2053h = mo11371c(path);
                }
                Matrix matrix = d1Var.f2060n;
                if (matrix != null) {
                    path.transform(matrix);
                }
            }
        } else if (j0Var instanceof C1422f.C1457k) {
            C1422f.C1457k kVar = (C1422f.C1457k) j0Var;
            if (j0Var instanceof C1422f.C1477u) {
                path = new C1493d(this, ((C1422f.C1477u) j0Var).f2100o).f2145a;
                if (j0Var.f2053h == null) {
                    j0Var.f2053h = mo11371c(path);
                }
            } else {
                path = j0Var instanceof C1422f.C1424a0 ? mo11348E((C1422f.C1424a0) j0Var) : j0Var instanceof C1422f.C1429c ? mo11345B((C1422f.C1429c) j0Var) : j0Var instanceof C1422f.C1451h ? mo11346C((C1422f.C1451h) j0Var) : j0Var instanceof C1422f.C1485y ? mo11347D((C1422f.C1485y) j0Var) : null;
            }
            if (path == null) {
                return null;
            }
            if (kVar.f2053h == null) {
                kVar.f2053h = mo11371c(path);
            }
            Matrix matrix2 = kVar.f2054n;
            if (matrix2 != null) {
                path.transform(matrix2);
            }
            path.setFillType(mo11390y());
        } else if (j0Var instanceof C1422f.C1480v0) {
            C1422f.C1480v0 v0Var = (C1422f.C1480v0) j0Var;
            List<C1422f.C1465o> list = v0Var.f2120n;
            float f = 0.0f;
            float d = (list == null || list.size() == 0) ? 0.0f : v0Var.f2120n.get(0).mo11329d(this);
            List<C1422f.C1465o> list2 = v0Var.f2121o;
            float f2 = (list2 == null || list2.size() == 0) ? 0.0f : v0Var.f2121o.get(0).mo11330f(this);
            List<C1422f.C1465o> list3 = v0Var.f2122p;
            float d2 = (list3 == null || list3.size() == 0) ? 0.0f : v0Var.f2122p.get(0).mo11329d(this);
            List<C1422f.C1465o> list4 = v0Var.f2123q;
            if (!(list4 == null || list4.size() == 0)) {
                f = v0Var.f2123q.get(0).mo11330f(this);
            }
            if (this.f2127c.f2157a.f1943A != C1422f.C1433d0.C1439f.Start) {
                C1500k kVar2 = new C1500k((C1490a) null);
                mo11382p(v0Var, kVar2);
                float f3 = kVar2.f2169a;
                if (this.f2127c.f2157a.f1943A == C1422f.C1433d0.C1439f.Middle) {
                    f3 /= 2.0f;
                }
                d -= f3;
            }
            if (v0Var.f2053h == null) {
                C1498i iVar = new C1498i(d, f2);
                mo11382p(v0Var, iVar);
                RectF rectF = iVar.f2167c;
                v0Var.f2053h = new C1422f.C1423a(rectF.left, rectF.top, rectF.width(), iVar.f2167c.height());
            }
            Path path2 = new Path();
            mo11382p(v0Var, new C1496g(d + d2, f2 + f, path2));
            Matrix matrix3 = v0Var.f2107r;
            if (matrix3 != null) {
                path2.transform(matrix3);
            }
            path2.setFillType(mo11390y());
            path = path2;
        } else {
            m1631q("Invalid %s element found in clipPath definition", j0Var.mo11307o());
            return null;
        }
        if (!(this.f2127c.f2157a.f1953K == null || (b = mo11370b(j0Var, j0Var.f2053h)) == null)) {
            path.op(b, Path.Op.INTERSECT);
        }
        this.f2127c = this.f2128d.pop();
        return path;
    }

    /* renamed from: H */
    public final void mo11351H(C1422f.C1456j0 j0Var) {
        mo11352I(j0Var, j0Var.f2053h);
    }

    /* renamed from: I */
    public final void mo11352I(C1422f.C1456j0 j0Var, C1422f.C1423a aVar) {
        if (this.f2127c.f2157a.f1955M != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f2125a.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f2125a.saveLayer((RectF) null, paint2, 31);
            C1422f.C1471r rVar = (C1422f.C1471r) this.f2126b.mo11301g(this.f2127c.f2157a.f1955M);
            mo11359P(rVar, j0Var, aVar);
            this.f2125a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f2125a.saveLayer((RectF) null, paint3, 31);
            mo11359P(rVar, j0Var, aVar);
            this.f2125a.restore();
            this.f2125a.restore();
        }
        mo11362S();
    }

    /* renamed from: J */
    public final boolean mo11353J() {
        C1422f.C1462m0 g;
        if (!(this.f2127c.f2157a.f1974s.floatValue() < 1.0f || this.f2127c.f2157a.f1955M != null)) {
            return false;
        }
        this.f2125a.saveLayerAlpha((RectF) null, m1629j(this.f2127c.f2157a.f1974s.floatValue()), 31);
        this.f2128d.push(this.f2127c);
        C1497h hVar = new C1497h(this, this.f2127c);
        this.f2127c = hVar;
        String str = hVar.f2157a.f1955M;
        if (str != null && ((g = this.f2126b.mo11301g(str)) == null || !(g instanceof C1422f.C1471r))) {
            m1631q("Mask reference '%s' not found", this.f2127c.f2157a.f1955M);
            this.f2127c.f2157a.f1955M = null;
        }
        return true;
    }

    /* renamed from: K */
    public final void mo11354K(C1422f.C1445e0 e0Var, C1422f.C1423a aVar, C1422f.C1423a aVar2, C1419e eVar) {
        if (aVar.f1915c != 0.0f && aVar.f1916d != 0.0f) {
            if (eVar == null && (eVar = e0Var.f2075n) == null) {
                eVar = C1419e.f1893d;
            }
            mo11367X(this.f2127c, e0Var);
            if (mo11379m()) {
                C1497h hVar = this.f2127c;
                hVar.f2162f = aVar;
                if (!hVar.f2157a.f1944B.booleanValue()) {
                    C1422f.C1423a aVar3 = this.f2127c.f2162f;
                    mo11360Q(aVar3.f1913a, aVar3.f1914b, aVar3.f1915c, aVar3.f1916d);
                }
                mo11374f(e0Var, this.f2127c.f2162f);
                Canvas canvas = this.f2125a;
                if (aVar2 != null) {
                    canvas.concat(mo11373e(this.f2127c.f2162f, aVar2, eVar));
                    this.f2127c.f2163g = e0Var.f2091o;
                } else {
                    C1422f.C1423a aVar4 = this.f2127c.f2162f;
                    canvas.translate(aVar4.f1913a, aVar4.f1914b);
                }
                boolean J = mo11353J();
                mo11368Y();
                mo11356M(e0Var, true);
                if (J) {
                    mo11352I(e0Var, e0Var.f2053h);
                }
                mo11365V(e0Var);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0163  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11355L(p005b.p080i.p081a.C1422f.C1462m0 r13) {
        /*
            r12 = this;
            b.i.a.f$d0$a r0 = p005b.p080i.p081a.C1422f.C1433d0.C1434a.EvenOdd
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1473s
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            r12.mo11363T()
            r12.mo11377i(r13)
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1445e0
            if (r1 == 0) goto L_0x0028
            b.i.a.f$e0 r13 = (p005b.p080i.p081a.C1422f.C1445e0) r13
            b.i.a.f$o r0 = r13.f2025p
            b.i.a.f$o r1 = r13.f2026q
            b.i.a.f$o r2 = r13.f2027r
            b.i.a.f$o r3 = r13.f2028s
            b.i.a.f$a r0 = r12.mo11349F(r0, r1, r2, r3)
            b.i.a.f$a r1 = r13.f2091o
            b.i.a.e r2 = r13.f2075n
            r12.mo11354K(r13, r0, r1, r2)
            goto L_0x07f0
        L_0x0028:
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1443d1
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x016b
            b.i.a.f$d1 r13 = (p005b.p080i.p081a.C1422f.C1443d1) r13
            b.i.a.f$c1 r0 = p005b.p080i.p081a.C1422f.C1431c1.percent
            b.i.a.f$o r1 = r13.f2020r
            if (r1 == 0) goto L_0x003e
            boolean r1 = r1.mo11332h()
            if (r1 != 0) goto L_0x07f0
        L_0x003e:
            b.i.a.f$o r1 = r13.f2021s
            if (r1 == 0) goto L_0x004a
            boolean r1 = r1.mo11332h()
            if (r1 == 0) goto L_0x004a
            goto L_0x07f0
        L_0x004a:
            b.i.a.g$h r1 = r12.f2127c
            r12.mo11367X(r1, r13)
            boolean r1 = r12.mo11379m()
            if (r1 != 0) goto L_0x0057
            goto L_0x07f0
        L_0x0057:
            b.i.a.f r1 = r13.f2065a
            java.lang.String r6 = r13.f2017o
            b.i.a.f$m0 r1 = r1.mo11301g(r6)
            if (r1 != 0) goto L_0x006e
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r13 = r13.f2017o
            r0[r3] = r13
            java.lang.String r13 = "Use reference '%s' not found"
            m1631q(r13, r0)
            goto L_0x07f0
        L_0x006e:
            android.graphics.Matrix r3 = r13.f2060n
            if (r3 == 0) goto L_0x0077
            android.graphics.Canvas r6 = r12.f2125a
            r6.concat(r3)
        L_0x0077:
            b.i.a.f$o r3 = r13.f2018p
            if (r3 == 0) goto L_0x0080
            float r3 = r3.mo11329d(r12)
            goto L_0x0081
        L_0x0080:
            r3 = r5
        L_0x0081:
            b.i.a.f$o r6 = r13.f2019q
            if (r6 == 0) goto L_0x008a
            float r6 = r6.mo11330f(r12)
            goto L_0x008b
        L_0x008a:
            r6 = r5
        L_0x008b:
            android.graphics.Canvas r7 = r12.f2125a
            r7.translate(r3, r6)
            b.i.a.f$a r3 = r13.f2053h
            r12.mo11374f(r13, r3)
            boolean r3 = r12.mo11353J()
            java.util.Stack<b.i.a.f$i0> r6 = r12.f2129e
            r6.push(r13)
            java.util.Stack<android.graphics.Matrix> r6 = r12.f2130f
            android.graphics.Canvas r7 = r12.f2125a
            android.graphics.Matrix r7 = r7.getMatrix()
            r6.push(r7)
            boolean r6 = r1 instanceof p005b.p080i.p081a.C1422f.C1445e0
            if (r6 == 0) goto L_0x00c3
            b.i.a.f$e0 r1 = (p005b.p080i.p081a.C1422f.C1445e0) r1
            b.i.a.f$o r0 = r13.f2020r
            b.i.a.f$o r4 = r13.f2021s
            b.i.a.f$a r0 = r12.mo11349F(r2, r2, r0, r4)
            r12.mo11363T()
            b.i.a.f$a r2 = r1.f2091o
            b.i.a.e r4 = r1.f2075n
            r12.mo11354K(r1, r0, r2, r4)
            goto L_0x0150
        L_0x00c3:
            boolean r6 = r1 instanceof p005b.p080i.p081a.C1422f.C1474s0
            if (r6 == 0) goto L_0x0154
            b.i.a.f$o r6 = r13.f2020r
            r7 = 1120403456(0x42c80000, float:100.0)
            if (r6 == 0) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            b.i.a.f$o r6 = new b.i.a.f$o
            r6.<init>(r7, r0)
        L_0x00d3:
            b.i.a.f$o r8 = r13.f2021s
            if (r8 == 0) goto L_0x00d8
            goto L_0x00dd
        L_0x00d8:
            b.i.a.f$o r8 = new b.i.a.f$o
            r8.<init>(r7, r0)
        L_0x00dd:
            b.i.a.f$a r0 = r12.mo11349F(r2, r2, r6, r8)
            r12.mo11363T()
            b.i.a.f$s0 r1 = (p005b.p080i.p081a.C1422f.C1474s0) r1
            float r2 = r0.f1915c
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0150
            float r2 = r0.f1916d
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00f3
            goto L_0x0150
        L_0x00f3:
            b.i.a.e r2 = r1.f2075n
            if (r2 == 0) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            b.i.a.e r2 = p005b.p080i.p081a.C1419e.f1893d
        L_0x00fa:
            b.i.a.g$h r5 = r12.f2127c
            r12.mo11367X(r5, r1)
            b.i.a.g$h r5 = r12.f2127c
            r5.f2162f = r0
            b.i.a.f$d0 r0 = r5.f2157a
            java.lang.Boolean r0 = r0.f1944B
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x011c
            b.i.a.g$h r0 = r12.f2127c
            b.i.a.f$a r0 = r0.f2162f
            float r5 = r0.f1913a
            float r6 = r0.f1914b
            float r7 = r0.f1915c
            float r0 = r0.f1916d
            r12.mo11360Q(r5, r6, r7, r0)
        L_0x011c:
            b.i.a.f$a r0 = r1.f2091o
            if (r0 == 0) goto L_0x0134
            android.graphics.Canvas r5 = r12.f2125a
            b.i.a.g$h r6 = r12.f2127c
            b.i.a.f$a r6 = r6.f2162f
            android.graphics.Matrix r0 = r12.mo11373e(r6, r0, r2)
            r5.concat(r0)
            b.i.a.g$h r0 = r12.f2127c
            b.i.a.f$a r2 = r1.f2091o
            r0.f2163g = r2
            goto L_0x0141
        L_0x0134:
            android.graphics.Canvas r0 = r12.f2125a
            b.i.a.g$h r2 = r12.f2127c
            b.i.a.f$a r2 = r2.f2162f
            float r5 = r2.f1913a
            float r2 = r2.f1914b
            r0.translate(r5, r2)
        L_0x0141:
            boolean r0 = r12.mo11353J()
            r12.mo11356M(r1, r4)
            if (r0 == 0) goto L_0x014d
            r12.mo11351H(r1)
        L_0x014d:
            r12.mo11365V(r1)
        L_0x0150:
            r12.mo11362S()
            goto L_0x0157
        L_0x0154:
            r12.mo11355L(r1)
        L_0x0157:
            java.util.Stack<b.i.a.f$i0> r0 = r12.f2129e
            r0.pop()
            java.util.Stack<android.graphics.Matrix> r0 = r12.f2130f
            r0.pop()
            if (r3 == 0) goto L_0x0166
            r12.mo11351H(r13)
        L_0x0166:
            r12.mo11365V(r13)
            goto L_0x07f0
        L_0x016b:
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1472r0
            if (r1 == 0) goto L_0x029b
            b.i.a.f$r0 r13 = (p005b.p080i.p081a.C1422f.C1472r0) r13
            b.i.a.g$h r0 = r12.f2127c
            r12.mo11367X(r0, r13)
            boolean r0 = r12.mo11379m()
            if (r0 != 0) goto L_0x017e
            goto L_0x07f0
        L_0x017e:
            android.graphics.Matrix r0 = r13.f2060n
            if (r0 == 0) goto L_0x0187
            android.graphics.Canvas r1 = r12.f2125a
            r1.concat(r0)
        L_0x0187:
            b.i.a.f$a r0 = r13.f2053h
            r12.mo11374f(r13, r0)
            boolean r0 = r12.mo11353J()
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getLanguage()
            java.util.List<b.i.a.f$m0> r2 = r13.f2030i
            java.util.Iterator r2 = r2.iterator()
        L_0x019e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0291
            java.lang.Object r3 = r2.next()
            b.i.a.f$m0 r3 = (p005b.p080i.p081a.C1422f.C1462m0) r3
            boolean r4 = r3 instanceof p005b.p080i.p081a.C1422f.C1448f0
            if (r4 != 0) goto L_0x01af
            goto L_0x019e
        L_0x01af:
            r4 = r3
            b.i.a.f$f0 r4 = (p005b.p080i.p081a.C1422f.C1448f0) r4
            java.lang.String r5 = r4.mo11318h()
            if (r5 == 0) goto L_0x01b9
            goto L_0x019e
        L_0x01b9:
            java.util.Set r5 = r4.mo11316e()
            if (r5 == 0) goto L_0x01cc
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x019e
            boolean r5 = r5.contains(r1)
            if (r5 != 0) goto L_0x01cc
            goto L_0x019e
        L_0x01cc:
            java.util.Set r5 = r4.mo11314a()
            if (r5 == 0) goto L_0x0278
            java.util.HashSet<java.lang.String> r6 = f2124g
            if (r6 != 0) goto L_0x0268
            java.lang.Class<b.i.a.g> r6 = p005b.p080i.p081a.C1489g.class
            monitor-enter(r6)
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x0265 }
            r7.<init>()     // Catch:{ all -> 0x0265 }
            f2124g = r7     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Structure"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "BasicStructure"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "ConditionalProcessing"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Image"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Style"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "ViewportAttribute"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Shape"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "BasicText"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "PaintAttribute"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "BasicPaintAttribute"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "OpacityAttribute"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "BasicGraphicsAttribute"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Marker"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Gradient"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Pattern"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Clip"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "BasicClip"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Mask"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f2124g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "View"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            monitor-exit(r6)
            goto L_0x0268
        L_0x0265:
            r13 = move-exception
            monitor-exit(r6)
            throw r13
        L_0x0268:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x019e
            java.util.HashSet<java.lang.String> r6 = f2124g
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L_0x0278
            goto L_0x019e
        L_0x0278:
            java.util.Set r5 = r4.mo11322m()
            if (r5 == 0) goto L_0x0283
            r5.isEmpty()
            goto L_0x019e
        L_0x0283:
            java.util.Set r4 = r4.mo11323n()
            if (r4 == 0) goto L_0x028e
            r4.isEmpty()
            goto L_0x019e
        L_0x028e:
            r12.mo11355L(r3)
        L_0x0291:
            if (r0 == 0) goto L_0x0296
            r12.mo11351H(r13)
        L_0x0296:
            r12.mo11365V(r13)
            goto L_0x07f0
        L_0x029b:
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1459l
            if (r1 == 0) goto L_0x02cd
            b.i.a.f$l r13 = (p005b.p080i.p081a.C1422f.C1459l) r13
            b.i.a.g$h r0 = r12.f2127c
            r12.mo11367X(r0, r13)
            boolean r0 = r12.mo11379m()
            if (r0 != 0) goto L_0x02ae
            goto L_0x07f0
        L_0x02ae:
            android.graphics.Matrix r0 = r13.f2060n
            if (r0 == 0) goto L_0x02b7
            android.graphics.Canvas r1 = r12.f2125a
            r1.concat(r0)
        L_0x02b7:
            b.i.a.f$a r0 = r13.f2053h
            r12.mo11374f(r13, r0)
            boolean r0 = r12.mo11353J()
            r12.mo11356M(r13, r4)
            if (r0 == 0) goto L_0x02c8
            r12.mo11351H(r13)
        L_0x02c8:
            r12.mo11365V(r13)
            goto L_0x07f0
        L_0x02cd:
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1463n
            r6 = 2
            if (r1 == 0) goto L_0x03f6
            b.i.a.f$n r13 = (p005b.p080i.p081a.C1422f.C1463n) r13
            b.i.a.f$o r0 = r13.f2070r
            if (r0 == 0) goto L_0x07f0
            boolean r0 = r0.mo11332h()
            if (r0 != 0) goto L_0x07f0
            b.i.a.f$o r0 = r13.f2071s
            if (r0 == 0) goto L_0x07f0
            boolean r0 = r0.mo11332h()
            if (r0 == 0) goto L_0x02ea
            goto L_0x07f0
        L_0x02ea:
            java.lang.String r0 = r13.f2067o
            if (r0 != 0) goto L_0x02f0
            goto L_0x07f0
        L_0x02f0:
            b.i.a.e r1 = r13.f2075n
            if (r1 == 0) goto L_0x02f5
            goto L_0x02f7
        L_0x02f5:
            b.i.a.e r1 = p005b.p080i.p081a.C1419e.f1893d
        L_0x02f7:
            java.lang.String r7 = "data:"
            boolean r7 = r0.startsWith(r7)
            if (r7 != 0) goto L_0x0300
            goto L_0x033a
        L_0x0300:
            int r7 = r0.length()
            r8 = 14
            if (r7 >= r8) goto L_0x0309
            goto L_0x033a
        L_0x0309:
            r7 = 44
            int r7 = r0.indexOf(r7)
            r8 = 12
            if (r7 >= r8) goto L_0x0314
            goto L_0x033a
        L_0x0314:
            int r8 = r7 + -7
            java.lang.String r8 = r0.substring(r8, r7)
            java.lang.String r9 = ";base64"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0323
            goto L_0x033a
        L_0x0323:
            int r7 = r7 + r4
            java.lang.String r0 = r0.substring(r7)     // Catch:{ Exception -> 0x0332 }
            byte[] r0 = android.util.Base64.decode(r0, r3)     // Catch:{ Exception -> 0x0332 }
            int r4 = r0.length     // Catch:{ Exception -> 0x0332 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r4)     // Catch:{ Exception -> 0x0332 }
            goto L_0x033a
        L_0x0332:
            r0 = move-exception
            java.lang.String r4 = "SVGAndroidRenderer"
            java.lang.String r7 = "Could not decode bad Data URL"
            android.util.Log.e(r4, r7, r0)
        L_0x033a:
            if (r2 != 0) goto L_0x033e
            goto L_0x07f0
        L_0x033e:
            b.i.a.f$a r0 = new b.i.a.f$a
            int r4 = r2.getWidth()
            float r4 = (float) r4
            int r7 = r2.getHeight()
            float r7 = (float) r7
            r0.<init>(r5, r5, r4, r7)
            b.i.a.g$h r4 = r12.f2127c
            r12.mo11367X(r4, r13)
            boolean r4 = r12.mo11379m()
            if (r4 != 0) goto L_0x035a
            goto L_0x07f0
        L_0x035a:
            boolean r4 = r12.mo11369Z()
            if (r4 != 0) goto L_0x0362
            goto L_0x07f0
        L_0x0362:
            android.graphics.Matrix r4 = r13.f2072t
            if (r4 == 0) goto L_0x036b
            android.graphics.Canvas r7 = r12.f2125a
            r7.concat(r4)
        L_0x036b:
            b.i.a.f$o r4 = r13.f2068p
            if (r4 == 0) goto L_0x0374
            float r4 = r4.mo11329d(r12)
            goto L_0x0375
        L_0x0374:
            r4 = r5
        L_0x0375:
            b.i.a.f$o r7 = r13.f2069q
            if (r7 == 0) goto L_0x037e
            float r7 = r7.mo11330f(r12)
            goto L_0x037f
        L_0x037e:
            r7 = r5
        L_0x037f:
            b.i.a.f$o r8 = r13.f2070r
            float r8 = r8.mo11329d(r12)
            b.i.a.f$o r9 = r13.f2071s
            float r9 = r9.mo11329d(r12)
            b.i.a.g$h r10 = r12.f2127c
            b.i.a.f$a r11 = new b.i.a.f$a
            r11.<init>(r4, r7, r8, r9)
            r10.f2162f = r11
            b.i.a.f$d0 r4 = r10.f2157a
            java.lang.Boolean r4 = r4.f1944B
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x03ad
            b.i.a.g$h r4 = r12.f2127c
            b.i.a.f$a r4 = r4.f2162f
            float r7 = r4.f1913a
            float r8 = r4.f1914b
            float r9 = r4.f1915c
            float r4 = r4.f1916d
            r12.mo11360Q(r7, r8, r9, r4)
        L_0x03ad:
            b.i.a.g$h r4 = r12.f2127c
            b.i.a.f$a r4 = r4.f2162f
            r13.f2053h = r4
            r12.mo11365V(r13)
            b.i.a.f$a r4 = r13.f2053h
            r12.mo11374f(r13, r4)
            boolean r4 = r12.mo11353J()
            r12.mo11368Y()
            android.graphics.Canvas r7 = r12.f2125a
            r7.save()
            android.graphics.Canvas r7 = r12.f2125a
            b.i.a.g$h r8 = r12.f2127c
            b.i.a.f$a r8 = r8.f2162f
            android.graphics.Matrix r0 = r12.mo11373e(r8, r0, r1)
            r7.concat(r0)
            android.graphics.Paint r0 = new android.graphics.Paint
            b.i.a.g$h r1 = r12.f2127c
            b.i.a.f$d0 r1 = r1.f2157a
            b.i.a.f$d0$e r1 = r1.f1961S
            b.i.a.f$d0$e r7 = p005b.p080i.p081a.C1422f.C1433d0.C1438e.optimizeSpeed
            if (r1 != r7) goto L_0x03e1
            goto L_0x03e2
        L_0x03e1:
            r3 = r6
        L_0x03e2:
            r0.<init>(r3)
            android.graphics.Canvas r1 = r12.f2125a
            r1.drawBitmap(r2, r5, r5, r0)
            android.graphics.Canvas r0 = r12.f2125a
            r0.restore()
            if (r4 == 0) goto L_0x07f0
            r12.mo11351H(r13)
            goto L_0x07f0
        L_0x03f6:
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1477u
            if (r1 == 0) goto L_0x047a
            b.i.a.f$u r13 = (p005b.p080i.p081a.C1422f.C1477u) r13
            b.i.a.f$v r1 = r13.f2100o
            if (r1 != 0) goto L_0x0402
            goto L_0x07f0
        L_0x0402:
            b.i.a.g$h r1 = r12.f2127c
            r12.mo11367X(r1, r13)
            boolean r1 = r12.mo11379m()
            if (r1 != 0) goto L_0x040f
            goto L_0x07f0
        L_0x040f:
            boolean r1 = r12.mo11369Z()
            if (r1 != 0) goto L_0x0417
            goto L_0x07f0
        L_0x0417:
            b.i.a.g$h r1 = r12.f2127c
            boolean r2 = r1.f2159c
            if (r2 != 0) goto L_0x0423
            boolean r1 = r1.f2158b
            if (r1 != 0) goto L_0x0423
            goto L_0x07f0
        L_0x0423:
            android.graphics.Matrix r1 = r13.f2054n
            if (r1 == 0) goto L_0x042c
            android.graphics.Canvas r2 = r12.f2125a
            r2.concat(r1)
        L_0x042c:
            b.i.a.g$d r1 = new b.i.a.g$d
            b.i.a.f$v r2 = r13.f2100o
            r1.<init>(r12, r2)
            android.graphics.Path r1 = r1.f2145a
            b.i.a.f$a r2 = r13.f2053h
            if (r2 != 0) goto L_0x043f
            b.i.a.f$a r2 = r12.mo11371c(r1)
            r13.f2053h = r2
        L_0x043f:
            r12.mo11365V(r13)
            r12.mo11375g(r13)
            b.i.a.f$a r2 = r13.f2053h
            r12.mo11374f(r13, r2)
            boolean r2 = r12.mo11353J()
            b.i.a.g$h r3 = r12.f2127c
            boolean r4 = r3.f2158b
            if (r4 == 0) goto L_0x0467
            b.i.a.f$d0 r3 = r3.f2157a
            b.i.a.f$d0$a r3 = r3.f1964i
            if (r3 == 0) goto L_0x045f
            if (r3 != r0) goto L_0x045f
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x0461
        L_0x045f:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        L_0x0461:
            r1.setFillType(r0)
            r12.mo11380n(r13, r1)
        L_0x0467:
            b.i.a.g$h r0 = r12.f2127c
            boolean r0 = r0.f2159c
            if (r0 == 0) goto L_0x0470
            r12.mo11381o(r1)
        L_0x0470:
            r12.mo11358O(r13)
            if (r2 == 0) goto L_0x07f0
            r12.mo11351H(r13)
            goto L_0x07f0
        L_0x047a:
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1424a0
            if (r1 == 0) goto L_0x04e2
            b.i.a.f$a0 r13 = (p005b.p080i.p081a.C1422f.C1424a0) r13
            b.i.a.f$o r0 = r13.f1919q
            if (r0 == 0) goto L_0x07f0
            b.i.a.f$o r1 = r13.f1920r
            if (r1 == 0) goto L_0x07f0
            boolean r0 = r0.mo11332h()
            if (r0 != 0) goto L_0x07f0
            b.i.a.f$o r0 = r13.f1920r
            boolean r0 = r0.mo11332h()
            if (r0 == 0) goto L_0x0498
            goto L_0x07f0
        L_0x0498:
            b.i.a.g$h r0 = r12.f2127c
            r12.mo11367X(r0, r13)
            boolean r0 = r12.mo11379m()
            if (r0 != 0) goto L_0x04a5
            goto L_0x07f0
        L_0x04a5:
            boolean r0 = r12.mo11369Z()
            if (r0 != 0) goto L_0x04ad
            goto L_0x07f0
        L_0x04ad:
            android.graphics.Matrix r0 = r13.f2054n
            if (r0 == 0) goto L_0x04b6
            android.graphics.Canvas r1 = r12.f2125a
            r1.concat(r0)
        L_0x04b6:
            android.graphics.Path r0 = r12.mo11348E(r13)
            r12.mo11365V(r13)
            r12.mo11375g(r13)
            b.i.a.f$a r1 = r13.f2053h
            r12.mo11374f(r13, r1)
            boolean r1 = r12.mo11353J()
            b.i.a.g$h r2 = r12.f2127c
            boolean r2 = r2.f2158b
            if (r2 == 0) goto L_0x04d2
            r12.mo11380n(r13, r0)
        L_0x04d2:
            b.i.a.g$h r2 = r12.f2127c
            boolean r2 = r2.f2159c
            if (r2 == 0) goto L_0x04db
            r12.mo11381o(r0)
        L_0x04db:
            if (r1 == 0) goto L_0x07f0
            r12.mo11351H(r13)
            goto L_0x07f0
        L_0x04e2:
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1429c
            if (r1 == 0) goto L_0x053e
            b.i.a.f$c r13 = (p005b.p080i.p081a.C1422f.C1429c) r13
            b.i.a.f$o r0 = r13.f1930q
            if (r0 == 0) goto L_0x07f0
            boolean r0 = r0.mo11332h()
            if (r0 == 0) goto L_0x04f4
            goto L_0x07f0
        L_0x04f4:
            b.i.a.g$h r0 = r12.f2127c
            r12.mo11367X(r0, r13)
            boolean r0 = r12.mo11379m()
            if (r0 != 0) goto L_0x0501
            goto L_0x07f0
        L_0x0501:
            boolean r0 = r12.mo11369Z()
            if (r0 != 0) goto L_0x0509
            goto L_0x07f0
        L_0x0509:
            android.graphics.Matrix r0 = r13.f2054n
            if (r0 == 0) goto L_0x0512
            android.graphics.Canvas r1 = r12.f2125a
            r1.concat(r0)
        L_0x0512:
            android.graphics.Path r0 = r12.mo11345B(r13)
            r12.mo11365V(r13)
            r12.mo11375g(r13)
            b.i.a.f$a r1 = r13.f2053h
            r12.mo11374f(r13, r1)
            boolean r1 = r12.mo11353J()
            b.i.a.g$h r2 = r12.f2127c
            boolean r2 = r2.f2158b
            if (r2 == 0) goto L_0x052e
            r12.mo11380n(r13, r0)
        L_0x052e:
            b.i.a.g$h r2 = r12.f2127c
            boolean r2 = r2.f2159c
            if (r2 == 0) goto L_0x0537
            r12.mo11381o(r0)
        L_0x0537:
            if (r1 == 0) goto L_0x07f0
            r12.mo11351H(r13)
            goto L_0x07f0
        L_0x053e:
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1451h
            if (r1 == 0) goto L_0x05a6
            b.i.a.f$h r13 = (p005b.p080i.p081a.C1422f.C1451h) r13
            b.i.a.f$o r0 = r13.f2037q
            if (r0 == 0) goto L_0x07f0
            b.i.a.f$o r1 = r13.f2038r
            if (r1 == 0) goto L_0x07f0
            boolean r0 = r0.mo11332h()
            if (r0 != 0) goto L_0x07f0
            b.i.a.f$o r0 = r13.f2038r
            boolean r0 = r0.mo11332h()
            if (r0 == 0) goto L_0x055c
            goto L_0x07f0
        L_0x055c:
            b.i.a.g$h r0 = r12.f2127c
            r12.mo11367X(r0, r13)
            boolean r0 = r12.mo11379m()
            if (r0 != 0) goto L_0x0569
            goto L_0x07f0
        L_0x0569:
            boolean r0 = r12.mo11369Z()
            if (r0 != 0) goto L_0x0571
            goto L_0x07f0
        L_0x0571:
            android.graphics.Matrix r0 = r13.f2054n
            if (r0 == 0) goto L_0x057a
            android.graphics.Canvas r1 = r12.f2125a
            r1.concat(r0)
        L_0x057a:
            android.graphics.Path r0 = r12.mo11346C(r13)
            r12.mo11365V(r13)
            r12.mo11375g(r13)
            b.i.a.f$a r1 = r13.f2053h
            r12.mo11374f(r13, r1)
            boolean r1 = r12.mo11353J()
            b.i.a.g$h r2 = r12.f2127c
            boolean r2 = r2.f2158b
            if (r2 == 0) goto L_0x0596
            r12.mo11380n(r13, r0)
        L_0x0596:
            b.i.a.g$h r2 = r12.f2127c
            boolean r2 = r2.f2159c
            if (r2 == 0) goto L_0x059f
            r12.mo11381o(r0)
        L_0x059f:
            if (r1 == 0) goto L_0x07f0
            r12.mo11351H(r13)
            goto L_0x07f0
        L_0x05a6:
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1467p
            if (r1 == 0) goto L_0x063f
            b.i.a.f$p r13 = (p005b.p080i.p081a.C1422f.C1467p) r13
            b.i.a.g$h r0 = r12.f2127c
            r12.mo11367X(r0, r13)
            boolean r0 = r12.mo11379m()
            if (r0 != 0) goto L_0x05b9
            goto L_0x07f0
        L_0x05b9:
            boolean r0 = r12.mo11369Z()
            if (r0 != 0) goto L_0x05c1
            goto L_0x07f0
        L_0x05c1:
            b.i.a.g$h r0 = r12.f2127c
            boolean r0 = r0.f2159c
            if (r0 != 0) goto L_0x05c9
            goto L_0x07f0
        L_0x05c9:
            android.graphics.Matrix r0 = r13.f2054n
            if (r0 == 0) goto L_0x05d2
            android.graphics.Canvas r1 = r12.f2125a
            r1.concat(r0)
        L_0x05d2:
            b.i.a.f$o r0 = r13.f2076o
            if (r0 != 0) goto L_0x05d8
            r0 = r5
            goto L_0x05dc
        L_0x05d8:
            float r0 = r0.mo11329d(r12)
        L_0x05dc:
            b.i.a.f$o r1 = r13.f2077p
            if (r1 != 0) goto L_0x05e2
            r1 = r5
            goto L_0x05e6
        L_0x05e2:
            float r1 = r1.mo11330f(r12)
        L_0x05e6:
            b.i.a.f$o r2 = r13.f2078q
            if (r2 != 0) goto L_0x05ec
            r2 = r5
            goto L_0x05f0
        L_0x05ec:
            float r2 = r2.mo11329d(r12)
        L_0x05f0:
            b.i.a.f$o r3 = r13.f2079r
            if (r3 != 0) goto L_0x05f5
            goto L_0x05f9
        L_0x05f5:
            float r5 = r3.mo11330f(r12)
        L_0x05f9:
            b.i.a.f$a r3 = r13.f2053h
            if (r3 != 0) goto L_0x0618
            b.i.a.f$a r3 = new b.i.a.f$a
            float r4 = java.lang.Math.min(r0, r2)
            float r6 = java.lang.Math.min(r1, r5)
            float r7 = r2 - r0
            float r7 = java.lang.Math.abs(r7)
            float r8 = r5 - r1
            float r8 = java.lang.Math.abs(r8)
            r3.<init>(r4, r6, r7, r8)
            r13.f2053h = r3
        L_0x0618:
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r3.moveTo(r0, r1)
            r3.lineTo(r2, r5)
            r12.mo11365V(r13)
            r12.mo11375g(r13)
            b.i.a.f$a r0 = r13.f2053h
            r12.mo11374f(r13, r0)
            boolean r0 = r12.mo11353J()
            r12.mo11381o(r3)
            r12.mo11358O(r13)
            if (r0 == 0) goto L_0x07f0
            r12.mo11351H(r13)
            goto L_0x07f0
        L_0x063f:
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1487z
            if (r1 == 0) goto L_0x06a5
            b.i.a.f$z r13 = (p005b.p080i.p081a.C1422f.C1487z) r13
            b.i.a.g$h r0 = r12.f2127c
            r12.mo11367X(r0, r13)
            boolean r0 = r12.mo11379m()
            if (r0 != 0) goto L_0x0652
            goto L_0x07f0
        L_0x0652:
            boolean r0 = r12.mo11369Z()
            if (r0 != 0) goto L_0x065a
            goto L_0x07f0
        L_0x065a:
            b.i.a.g$h r0 = r12.f2127c
            boolean r1 = r0.f2159c
            if (r1 != 0) goto L_0x0666
            boolean r0 = r0.f2158b
            if (r0 != 0) goto L_0x0666
            goto L_0x07f0
        L_0x0666:
            android.graphics.Matrix r0 = r13.f2054n
            if (r0 == 0) goto L_0x066f
            android.graphics.Canvas r1 = r12.f2125a
            r1.concat(r0)
        L_0x066f:
            float[] r0 = r13.f2116o
            int r0 = r0.length
            if (r0 >= r6) goto L_0x0676
            goto L_0x07f0
        L_0x0676:
            android.graphics.Path r0 = r12.mo11347D(r13)
            r12.mo11365V(r13)
            r12.mo11375g(r13)
            b.i.a.f$a r1 = r13.f2053h
            r12.mo11374f(r13, r1)
            boolean r1 = r12.mo11353J()
            b.i.a.g$h r2 = r12.f2127c
            boolean r2 = r2.f2158b
            if (r2 == 0) goto L_0x0692
            r12.mo11380n(r13, r0)
        L_0x0692:
            b.i.a.g$h r2 = r12.f2127c
            boolean r2 = r2.f2159c
            if (r2 == 0) goto L_0x069b
            r12.mo11381o(r0)
        L_0x069b:
            r12.mo11358O(r13)
            if (r1 == 0) goto L_0x07f0
            r12.mo11351H(r13)
            goto L_0x07f0
        L_0x06a5:
            boolean r1 = r13 instanceof p005b.p080i.p081a.C1422f.C1485y
            if (r1 == 0) goto L_0x071d
            b.i.a.f$y r13 = (p005b.p080i.p081a.C1422f.C1485y) r13
            b.i.a.g$h r1 = r12.f2127c
            r12.mo11367X(r1, r13)
            boolean r1 = r12.mo11379m()
            if (r1 != 0) goto L_0x06b8
            goto L_0x07f0
        L_0x06b8:
            boolean r1 = r12.mo11369Z()
            if (r1 != 0) goto L_0x06c0
            goto L_0x07f0
        L_0x06c0:
            b.i.a.g$h r1 = r12.f2127c
            boolean r2 = r1.f2159c
            if (r2 != 0) goto L_0x06cc
            boolean r1 = r1.f2158b
            if (r1 != 0) goto L_0x06cc
            goto L_0x07f0
        L_0x06cc:
            android.graphics.Matrix r1 = r13.f2054n
            if (r1 == 0) goto L_0x06d5
            android.graphics.Canvas r2 = r12.f2125a
            r2.concat(r1)
        L_0x06d5:
            float[] r1 = r13.f2116o
            int r1 = r1.length
            if (r1 >= r6) goto L_0x06dc
            goto L_0x07f0
        L_0x06dc:
            android.graphics.Path r1 = r12.mo11347D(r13)
            r12.mo11365V(r13)
            b.i.a.g$h r2 = r12.f2127c
            b.i.a.f$d0 r2 = r2.f2157a
            b.i.a.f$d0$a r2 = r2.f1964i
            if (r2 == 0) goto L_0x06f0
            if (r2 != r0) goto L_0x06f0
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x06f2
        L_0x06f0:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        L_0x06f2:
            r1.setFillType(r0)
            r12.mo11375g(r13)
            b.i.a.f$a r0 = r13.f2053h
            r12.mo11374f(r13, r0)
            boolean r0 = r12.mo11353J()
            b.i.a.g$h r2 = r12.f2127c
            boolean r2 = r2.f2158b
            if (r2 == 0) goto L_0x070a
            r12.mo11380n(r13, r1)
        L_0x070a:
            b.i.a.g$h r2 = r12.f2127c
            boolean r2 = r2.f2159c
            if (r2 == 0) goto L_0x0713
            r12.mo11381o(r1)
        L_0x0713:
            r12.mo11358O(r13)
            if (r0 == 0) goto L_0x07f0
            r12.mo11351H(r13)
            goto L_0x07f0
        L_0x071d:
            boolean r0 = r13 instanceof p005b.p080i.p081a.C1422f.C1480v0
            if (r0 == 0) goto L_0x07f0
            b.i.a.f$v0 r13 = (p005b.p080i.p081a.C1422f.C1480v0) r13
            b.i.a.g$h r0 = r12.f2127c
            r12.mo11367X(r0, r13)
            boolean r0 = r12.mo11379m()
            if (r0 != 0) goto L_0x0730
            goto L_0x07f0
        L_0x0730:
            android.graphics.Matrix r0 = r13.f2107r
            if (r0 == 0) goto L_0x0739
            android.graphics.Canvas r1 = r12.f2125a
            r1.concat(r0)
        L_0x0739:
            java.util.List<b.i.a.f$o> r0 = r13.f2120n
            if (r0 == 0) goto L_0x0751
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0744
            goto L_0x0751
        L_0x0744:
            java.util.List<b.i.a.f$o> r0 = r13.f2120n
            java.lang.Object r0 = r0.get(r3)
            b.i.a.f$o r0 = (p005b.p080i.p081a.C1422f.C1465o) r0
            float r0 = r0.mo11329d(r12)
            goto L_0x0752
        L_0x0751:
            r0 = r5
        L_0x0752:
            java.util.List<b.i.a.f$o> r1 = r13.f2121o
            if (r1 == 0) goto L_0x076a
            int r1 = r1.size()
            if (r1 != 0) goto L_0x075d
            goto L_0x076a
        L_0x075d:
            java.util.List<b.i.a.f$o> r1 = r13.f2121o
            java.lang.Object r1 = r1.get(r3)
            b.i.a.f$o r1 = (p005b.p080i.p081a.C1422f.C1465o) r1
            float r1 = r1.mo11330f(r12)
            goto L_0x076b
        L_0x076a:
            r1 = r5
        L_0x076b:
            java.util.List<b.i.a.f$o> r2 = r13.f2122p
            if (r2 == 0) goto L_0x0783
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0776
            goto L_0x0783
        L_0x0776:
            java.util.List<b.i.a.f$o> r2 = r13.f2122p
            java.lang.Object r2 = r2.get(r3)
            b.i.a.f$o r2 = (p005b.p080i.p081a.C1422f.C1465o) r2
            float r2 = r2.mo11329d(r12)
            goto L_0x0784
        L_0x0783:
            r2 = r5
        L_0x0784:
            java.util.List<b.i.a.f$o> r4 = r13.f2123q
            if (r4 == 0) goto L_0x079b
            int r4 = r4.size()
            if (r4 != 0) goto L_0x078f
            goto L_0x079b
        L_0x078f:
            java.util.List<b.i.a.f$o> r4 = r13.f2123q
            java.lang.Object r3 = r4.get(r3)
            b.i.a.f$o r3 = (p005b.p080i.p081a.C1422f.C1465o) r3
            float r5 = r3.mo11330f(r12)
        L_0x079b:
            b.i.a.f$d0$f r3 = r12.mo11389x()
            b.i.a.f$d0$f r4 = p005b.p080i.p081a.C1422f.C1433d0.C1439f.Start
            if (r3 == r4) goto L_0x07af
            float r4 = r12.mo11372d(r13)
            b.i.a.f$d0$f r6 = p005b.p080i.p081a.C1422f.C1433d0.C1439f.Middle
            if (r3 != r6) goto L_0x07ae
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r3
        L_0x07ae:
            float r0 = r0 - r4
        L_0x07af:
            b.i.a.f$a r3 = r13.f2053h
            if (r3 != 0) goto L_0x07d2
            b.i.a.g$i r3 = new b.i.a.g$i
            r3.<init>(r0, r1)
            r12.mo11382p(r13, r3)
            b.i.a.f$a r4 = new b.i.a.f$a
            android.graphics.RectF r6 = r3.f2167c
            float r7 = r6.left
            float r8 = r6.top
            float r6 = r6.width()
            android.graphics.RectF r3 = r3.f2167c
            float r3 = r3.height()
            r4.<init>(r7, r8, r6, r3)
            r13.f2053h = r4
        L_0x07d2:
            r12.mo11365V(r13)
            r12.mo11375g(r13)
            b.i.a.f$a r3 = r13.f2053h
            r12.mo11374f(r13, r3)
            boolean r3 = r12.mo11353J()
            b.i.a.g$f r4 = new b.i.a.g$f
            float r0 = r0 + r2
            float r1 = r1 + r5
            r4.<init>(r0, r1)
            r12.mo11382p(r13, r4)
            if (r3 == 0) goto L_0x07f0
            r12.mo11351H(r13)
        L_0x07f0:
            r12.mo11362S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1489g.mo11355L(b.i.a.f$m0):void");
    }

    /* renamed from: M */
    public final void mo11356M(C1422f.C1454i0 i0Var, boolean z) {
        if (z) {
            this.f2129e.push(i0Var);
            this.f2130f.push(this.f2125a.getMatrix());
        }
        for (C1422f.C1462m0 L : ((C1422f.C1450g0) i0Var).f2030i) {
            mo11355L(L);
        }
        if (z) {
            this.f2129e.pop();
            this.f2130f.pop();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fd, code lost:
        r1 = 0.0f - r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fe A[PHI: r1 
      PHI: (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:59:0x00f3, B:62:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013c  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11357N(p005b.p080i.p081a.C1422f.C1469q r12, p005b.p080i.p081a.C1489g.C1492c r13) {
        /*
            r11 = this;
            r11.mo11363T()
            java.lang.Float r0 = r12.f2090u
            r1 = 0
            if (r0 == 0) goto L_0x0033
            float r0 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x002c
            float r0 = r13.f2142c
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x001e
            float r2 = r13.f2143d
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
        L_0x001e:
            float r2 = r13.f2143d
            double r2 = (double) r2
            double r4 = (double) r0
            double r2 = java.lang.Math.atan2(r2, r4)
            double r2 = java.lang.Math.toDegrees(r2)
            float r0 = (float) r2
            goto L_0x0034
        L_0x002c:
            java.lang.Float r0 = r12.f2090u
            float r0 = r0.floatValue()
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            boolean r2 = r12.f2085p
            if (r2 == 0) goto L_0x003b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0047
        L_0x003b:
            b.i.a.g$h r2 = r11.f2127c
            b.i.a.f$d0 r2 = r2.f2157a
            b.i.a.f$o r2 = r2.f1968m
            r3 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2.mo11326a(r3)
        L_0x0047:
            b.i.a.g$h r3 = r11.mo11387v(r12)
            r11.f2127c = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r4 = r13.f2140a
            float r13 = r13.f2141b
            r3.preTranslate(r4, r13)
            r3.preRotate(r0)
            r3.preScale(r2, r2)
            b.i.a.f$o r13 = r12.f2086q
            if (r13 == 0) goto L_0x0068
            float r13 = r13.mo11329d(r11)
            goto L_0x0069
        L_0x0068:
            r13 = r1
        L_0x0069:
            b.i.a.f$o r0 = r12.f2087r
            if (r0 == 0) goto L_0x0072
            float r0 = r0.mo11330f(r11)
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            b.i.a.f$o r2 = r12.f2088s
            r4 = 1077936128(0x40400000, float:3.0)
            if (r2 == 0) goto L_0x007e
            float r2 = r2.mo11329d(r11)
            goto L_0x007f
        L_0x007e:
            r2 = r4
        L_0x007f:
            b.i.a.f$o r5 = r12.f2089t
            if (r5 == 0) goto L_0x0087
            float r4 = r5.mo11330f(r11)
        L_0x0087:
            b.i.a.f$a r5 = r12.f2091o
            if (r5 == 0) goto L_0x0119
            float r6 = r5.f1915c
            float r6 = r2 / r6
            float r5 = r5.f1916d
            float r5 = r4 / r5
            b.i.a.e r7 = r12.f2075n
            if (r7 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            b.i.a.e r7 = p005b.p080i.p081a.C1419e.f1893d
        L_0x009a:
            b.i.a.e r8 = p005b.p080i.p081a.C1419e.f1892c
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00b3
            b.i.a.e$b r8 = r7.f1895b
            b.i.a.e$b r9 = p005b.p080i.p081a.C1419e.C1421b.slice
            if (r8 != r9) goto L_0x00ad
            float r5 = java.lang.Math.max(r6, r5)
            goto L_0x00b1
        L_0x00ad:
            float r5 = java.lang.Math.min(r6, r5)
        L_0x00b1:
            r6 = r5
            r5 = r6
        L_0x00b3:
            float r13 = -r13
            float r13 = r13 * r6
            float r0 = -r0
            float r0 = r0 * r5
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.f2125a
            r13.concat(r3)
            b.i.a.f$a r13 = r12.f2091o
            float r0 = r13.f1915c
            float r0 = r0 * r6
            float r13 = r13.f1916d
            float r13 = r13 * r5
            b.i.a.e$a r8 = r7.f1894a
            int r8 = r8.ordinal()
            r9 = 2
            r10 = 1073741824(0x40000000, float:2.0)
            if (r8 == r9) goto L_0x00e8
            r9 = 3
            if (r8 == r9) goto L_0x00e5
            r9 = 5
            if (r8 == r9) goto L_0x00e8
            r9 = 6
            if (r8 == r9) goto L_0x00e5
            r9 = 8
            if (r8 == r9) goto L_0x00e8
            r9 = 9
            if (r8 == r9) goto L_0x00e5
            r0 = r1
            goto L_0x00ed
        L_0x00e5:
            float r0 = r2 - r0
            goto L_0x00eb
        L_0x00e8:
            float r0 = r2 - r0
            float r0 = r0 / r10
        L_0x00eb:
            float r0 = r1 - r0
        L_0x00ed:
            b.i.a.e$a r7 = r7.f1894a
            int r7 = r7.ordinal()
            switch(r7) {
                case 4: goto L_0x00fa;
                case 5: goto L_0x00fa;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00f7;
                case 9: goto L_0x00f7;
                default: goto L_0x00f6;
            }
        L_0x00f6:
            goto L_0x00fe
        L_0x00f7:
            float r13 = r4 - r13
            goto L_0x00fd
        L_0x00fa:
            float r13 = r4 - r13
            float r13 = r13 / r10
        L_0x00fd:
            float r1 = r1 - r13
        L_0x00fe:
            b.i.a.g$h r13 = r11.f2127c
            b.i.a.f$d0 r13 = r13.f2157a
            java.lang.Boolean r13 = r13.f1944B
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x010d
            r11.mo11360Q(r0, r1, r2, r4)
        L_0x010d:
            r3.reset()
            r3.preScale(r6, r5)
            android.graphics.Canvas r13 = r11.f2125a
            r13.concat(r3)
            goto L_0x0132
        L_0x0119:
            float r13 = -r13
            float r0 = -r0
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.f2125a
            r13.concat(r3)
            b.i.a.g$h r13 = r11.f2127c
            b.i.a.f$d0 r13 = r13.f2157a
            java.lang.Boolean r13 = r13.f1944B
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0132
            r11.mo11360Q(r1, r1, r2, r4)
        L_0x0132:
            boolean r13 = r11.mo11353J()
            r0 = 0
            r11.mo11356M(r12, r0)
            if (r13 == 0) goto L_0x0141
            b.i.a.f$a r13 = r12.f2053h
            r11.mo11352I(r12, r13)
        L_0x0141:
            r11.mo11362S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1489g.mo11357N(b.i.a.f$q, b.i.a.g$c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0188 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0189  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11358O(p005b.p080i.p081a.C1422f.C1457k r23) {
        /*
            r22 = this;
            r6 = r22
            r0 = r23
            b.i.a.g$h r1 = r6.f2127c
            b.i.a.f$d0 r1 = r1.f2157a
            java.lang.String r2 = r1.f1946D
            if (r2 != 0) goto L_0x0015
            java.lang.String r3 = r1.f1947E
            if (r3 != 0) goto L_0x0015
            java.lang.String r1 = r1.f1948F
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r1 = "Marker reference '%s' not found"
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0034
            b.i.a.f r3 = r0.f2065a
            b.i.a.f$m0 r2 = r3.mo11301g(r2)
            if (r2 == 0) goto L_0x0027
            b.i.a.f$q r2 = (p005b.p080i.p081a.C1422f.C1469q) r2
            r10 = r2
            goto L_0x0035
        L_0x0027:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            b.i.a.g$h r3 = r6.f2127c
            b.i.a.f$d0 r3 = r3.f2157a
            java.lang.String r3 = r3.f1946D
            r2[r7] = r3
            m1631q(r1, r2)
        L_0x0034:
            r10 = 0
        L_0x0035:
            b.i.a.g$h r2 = r6.f2127c
            b.i.a.f$d0 r2 = r2.f2157a
            java.lang.String r2 = r2.f1947E
            if (r2 == 0) goto L_0x0056
            b.i.a.f r3 = r0.f2065a
            b.i.a.f$m0 r2 = r3.mo11301g(r2)
            if (r2 == 0) goto L_0x0049
            b.i.a.f$q r2 = (p005b.p080i.p081a.C1422f.C1469q) r2
            r11 = r2
            goto L_0x0057
        L_0x0049:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            b.i.a.g$h r3 = r6.f2127c
            b.i.a.f$d0 r3 = r3.f2157a
            java.lang.String r3 = r3.f1947E
            r2[r7] = r3
            m1631q(r1, r2)
        L_0x0056:
            r11 = 0
        L_0x0057:
            b.i.a.g$h r2 = r6.f2127c
            b.i.a.f$d0 r2 = r2.f2157a
            java.lang.String r2 = r2.f1948F
            if (r2 == 0) goto L_0x0078
            b.i.a.f r3 = r0.f2065a
            b.i.a.f$m0 r2 = r3.mo11301g(r2)
            if (r2 == 0) goto L_0x006b
            b.i.a.f$q r2 = (p005b.p080i.p081a.C1422f.C1469q) r2
            r12 = r2
            goto L_0x0079
        L_0x006b:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            b.i.a.g$h r3 = r6.f2127c
            b.i.a.f$d0 r3 = r3.f2157a
            java.lang.String r3 = r3.f1948F
            r2[r7] = r3
            m1631q(r1, r2)
        L_0x0078:
            r12 = 0
        L_0x0079:
            boolean r1 = r0 instanceof p005b.p080i.p081a.C1422f.C1477u
            r13 = 2
            if (r1 == 0) goto L_0x008b
            b.i.a.g$b r1 = new b.i.a.g$b
            b.i.a.f$u r0 = (p005b.p080i.p081a.C1422f.C1477u) r0
            b.i.a.f$v r0 = r0.f2100o
            r1.<init>(r0)
            java.util.List<b.i.a.g$c> r0 = r1.f2131a
            goto L_0x017f
        L_0x008b:
            boolean r1 = r0 instanceof p005b.p080i.p081a.C1422f.C1467p
            if (r1 == 0) goto L_0x00e8
            b.i.a.f$p r0 = (p005b.p080i.p081a.C1422f.C1467p) r0
            b.i.a.f$o r1 = r0.f2076o
            if (r1 == 0) goto L_0x009b
            float r1 = r1.mo11329d(r6)
            r2 = r1
            goto L_0x009c
        L_0x009b:
            r2 = 0
        L_0x009c:
            b.i.a.f$o r1 = r0.f2077p
            if (r1 == 0) goto L_0x00a6
            float r1 = r1.mo11330f(r6)
            r3 = r1
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            b.i.a.f$o r1 = r0.f2078q
            if (r1 == 0) goto L_0x00b1
            float r1 = r1.mo11329d(r6)
            r15 = r1
            goto L_0x00b2
        L_0x00b1:
            r15 = 0
        L_0x00b2:
            b.i.a.f$o r0 = r0.f2079r
            if (r0 == 0) goto L_0x00bd
            float r0 = r0.mo11330f(r6)
            r16 = r0
            goto L_0x00bf
        L_0x00bd:
            r16 = 0
        L_0x00bf:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r13)
            b.i.a.g$c r4 = new b.i.a.g$c
            float r17 = r15 - r2
            float r18 = r16 - r3
            r0 = r4
            r1 = r22
            r14 = r4
            r4 = r17
            r9 = r5
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r9.add(r14)
            b.i.a.g$c r14 = new b.i.a.g$c
            r0 = r14
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r9.add(r14)
            r0 = r9
            goto L_0x017f
        L_0x00e8:
            r9 = r0
            b.i.a.f$y r9 = (p005b.p080i.p081a.C1422f.C1485y) r9
            float[] r0 = r9.f2116o
            int r14 = r0.length
            if (r14 >= r13) goto L_0x00f3
            r0 = 0
            goto L_0x017f
        L_0x00f3:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            b.i.a.g$c r16 = new b.i.a.g$c
            float[] r0 = r9.f2116o
            r2 = r0[r7]
            r3 = r0[r8]
            r4 = 0
            r5 = 0
            r0 = r16
            r1 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r5 = r13
            r1 = 0
            r2 = 0
        L_0x010c:
            if (r5 >= r14) goto L_0x013f
            float[] r1 = r9.f2116o
            r4 = r1[r5]
            int r2 = r5 + 1
            r3 = r1[r2]
            r0.mo11392a(r4, r3)
            r15.add(r0)
            b.i.a.g$c r16 = new b.i.a.g$c
            float r1 = r0.f2140a
            float r17 = r4 - r1
            float r0 = r0.f2141b
            float r18 = r3 - r0
            r0 = r16
            r1 = r22
            r2 = r4
            r19 = r3
            r20 = r4
            r4 = r17
            r17 = r5
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            int r5 = r17 + 2
            r2 = r19
            r1 = r20
            goto L_0x010c
        L_0x013f:
            boolean r3 = r9 instanceof p005b.p080i.p081a.C1422f.C1487z
            if (r3 == 0) goto L_0x017b
            float[] r3 = r9.f2116o
            r4 = r3[r7]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x017e
            r1 = r3[r8]
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x017e
            r2 = r3[r7]
            r3 = r3[r8]
            r0.mo11392a(r2, r3)
            r15.add(r0)
            b.i.a.g$c r9 = new b.i.a.g$c
            float r1 = r0.f2140a
            float r4 = r2 - r1
            float r0 = r0.f2141b
            float r5 = r3 - r0
            r0 = r9
            r1 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r0 = r15.get(r7)
            b.i.a.g$c r0 = (p005b.p080i.p081a.C1489g.C1492c) r0
            r9.mo11393b(r0)
            r15.add(r9)
            r15.set(r7, r9)
            goto L_0x017e
        L_0x017b:
            r15.add(r0)
        L_0x017e:
            r0 = r15
        L_0x017f:
            if (r0 != 0) goto L_0x0182
            return
        L_0x0182:
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0189
            return
        L_0x0189:
            b.i.a.g$h r2 = r6.f2127c
            b.i.a.f$d0 r2 = r2.f2157a
            r3 = 0
            r2.f1948F = r3
            r2.f1947E = r3
            r2.f1946D = r3
            if (r10 == 0) goto L_0x019f
            java.lang.Object r2 = r0.get(r7)
            b.i.a.g$c r2 = (p005b.p080i.p081a.C1489g.C1492c) r2
            r6.mo11357N(r10, r2)
        L_0x019f:
            if (r11 == 0) goto L_0x0208
            int r2 = r0.size()
            if (r2 <= r13) goto L_0x0208
            java.lang.Object r2 = r0.get(r7)
            b.i.a.g$c r2 = (p005b.p080i.p081a.C1489g.C1492c) r2
            java.lang.Object r3 = r0.get(r8)
            b.i.a.g$c r3 = (p005b.p080i.p081a.C1489g.C1492c) r3
            r4 = r8
            r21 = r3
            r3 = r2
            r2 = r21
        L_0x01b9:
            int r5 = r1 + -1
            if (r4 >= r5) goto L_0x0208
            int r4 = r4 + 1
            java.lang.Object r5 = r0.get(r4)
            b.i.a.g$c r5 = (p005b.p080i.p081a.C1489g.C1492c) r5
            boolean r7 = r2.f2144e
            if (r7 == 0) goto L_0x0201
            float r7 = r2.f2142c
            float r9 = r2.f2143d
            float r10 = r2.f2140a
            float r13 = r3.f2140a
            float r13 = r10 - r13
            float r14 = r2.f2141b
            float r3 = r3.f2141b
            float r3 = r14 - r3
            float r13 = r13 * r7
            float r3 = r3 * r9
            float r3 = r3 + r13
            r13 = 0
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x01ea
            float r3 = r5.f2140a
            float r3 = r3 - r10
            float r10 = r5.f2141b
            float r10 = r10 - r14
            float r3 = r3 * r7
            float r10 = r10 * r9
            float r3 = r3 + r10
        L_0x01ea:
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x01ef
            goto L_0x0202
        L_0x01ef:
            if (r3 != 0) goto L_0x01fa
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x0202
            int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x01fa
            goto L_0x0202
        L_0x01fa:
            float r3 = -r7
            r2.f2142c = r3
            float r3 = -r9
            r2.f2143d = r3
            goto L_0x0202
        L_0x0201:
            r13 = 0
        L_0x0202:
            r6.mo11357N(r11, r2)
            r3 = r2
            r2 = r5
            goto L_0x01b9
        L_0x0208:
            if (r12 == 0) goto L_0x0214
            int r1 = r1 - r8
            java.lang.Object r0 = r0.get(r1)
            b.i.a.g$c r0 = (p005b.p080i.p081a.C1489g.C1492c) r0
            r6.mo11357N(r12, r0)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1489g.mo11358O(b.i.a.f$k):void");
    }

    /* renamed from: P */
    public final void mo11359P(C1422f.C1471r rVar, C1422f.C1456j0 j0Var, C1422f.C1423a aVar) {
        float f;
        float f2;
        Boolean bool = rVar.f2092n;
        boolean z = true;
        if (bool != null && bool.booleanValue()) {
            C1422f.C1465o oVar = rVar.f2094p;
            f2 = oVar != null ? oVar.mo11329d(this) : aVar.f1915c;
            C1422f.C1465o oVar2 = rVar.f2095q;
            f = oVar2 != null ? oVar2.mo11330f(this) : aVar.f1916d;
        } else {
            C1422f.C1465o oVar3 = rVar.f2094p;
            float f3 = 1.2f;
            float c = oVar3 != null ? oVar3.mo11328c(this, 1.0f) : 1.2f;
            C1422f.C1465o oVar4 = rVar.f2095q;
            if (oVar4 != null) {
                f3 = oVar4.mo11328c(this, 1.0f);
            }
            f2 = c * aVar.f1915c;
            f = f3 * aVar.f1916d;
        }
        if (f2 != 0.0f && f != 0.0f) {
            mo11363T();
            C1497h v = mo11387v(rVar);
            this.f2127c = v;
            v.f2157a.f1974s = Float.valueOf(1.0f);
            boolean J = mo11353J();
            this.f2125a.save();
            Boolean bool2 = rVar.f2093o;
            if (bool2 != null && !bool2.booleanValue()) {
                z = false;
            }
            if (!z) {
                this.f2125a.translate(aVar.f1913a, aVar.f1914b);
                this.f2125a.scale(aVar.f1915c, aVar.f1916d);
            }
            mo11356M(rVar, false);
            this.f2125a.restore();
            if (J) {
                mo11352I(j0Var, aVar);
            }
            mo11362S();
        }
    }

    /* renamed from: Q */
    public final void mo11360Q(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        C1422f.C1426b bVar = this.f2127c.f2157a.f1945C;
        if (bVar != null) {
            f += bVar.f1926d.mo11329d(this);
            f2 += this.f2127c.f2157a.f1945C.f1923a.mo11330f(this);
            f5 -= this.f2127c.f2157a.f1945C.f1924b.mo11329d(this);
            f6 -= this.f2127c.f2157a.f1945C.f1925c.mo11330f(this);
        }
        this.f2125a.clipRect(f, f2, f5, f6);
    }

    /* renamed from: R */
    public final void mo11361R(C1497h hVar, boolean z, C1422f.C1464n0 n0Var) {
        C1422f.C1444e eVar;
        C1422f.C1433d0 d0Var = hVar.f2157a;
        float floatValue = (z ? d0Var.f1965j : d0Var.f1967l).floatValue();
        if (n0Var instanceof C1422f.C1444e) {
            eVar = (C1422f.C1444e) n0Var;
        } else if (n0Var instanceof C1422f.C1447f) {
            eVar = hVar.f2157a.f1975t;
        } else {
            return;
        }
        (z ? hVar.f2160d : hVar.f2161e).setColor(m1630k(eVar.f2024g, floatValue));
    }

    /* renamed from: S */
    public final void mo11362S() {
        this.f2125a.restore();
        this.f2127c = this.f2128d.pop();
    }

    /* renamed from: T */
    public final void mo11363T() {
        this.f2125a.save();
        this.f2128d.push(this.f2127c);
        this.f2127c = new C1497h(this, this.f2127c);
    }

    /* renamed from: U */
    public final String mo11364U(String str, boolean z, boolean z2) {
        String str2;
        if (this.f2127c.f2164h) {
            str2 = "[\\n\\t]";
        } else {
            str = str.replaceAll("\\n", "").replaceAll("\\t", " ");
            if (z) {
                str = str.replaceAll("^\\s+", "");
            }
            if (z2) {
                str = str.replaceAll("\\s+$", "");
            }
            str2 = "\\s{2,}";
        }
        return str.replaceAll(str2, " ");
    }

    /* renamed from: V */
    public final void mo11365V(C1422f.C1456j0 j0Var) {
        if (j0Var.f2066b != null && j0Var.f2053h != null) {
            Matrix matrix = new Matrix();
            if (this.f2130f.peek().invert(matrix)) {
                C1422f.C1423a aVar = j0Var.f2053h;
                C1422f.C1423a aVar2 = j0Var.f2053h;
                C1422f.C1423a aVar3 = j0Var.f2053h;
                float[] fArr = {aVar.f1913a, aVar.f1914b, aVar.mo11304a(), aVar2.f1914b, aVar2.mo11304a(), j0Var.f2053h.mo11305b(), aVar3.f1913a, aVar3.mo11305b()};
                matrix.preConcat(this.f2125a.getMatrix());
                matrix.mapPoints(fArr);
                RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                for (int i = 2; i <= 6; i += 2) {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    int i2 = i + 1;
                    if (fArr[i2] < rectF.top) {
                        rectF.top = fArr[i2];
                    }
                    if (fArr[i2] > rectF.bottom) {
                        rectF.bottom = fArr[i2];
                    }
                }
                C1422f.C1456j0 j0Var2 = (C1422f.C1456j0) this.f2129e.peek();
                C1422f.C1423a aVar4 = j0Var2.f2053h;
                if (aVar4 == null) {
                    float f = rectF.left;
                    float f2 = rectF.top;
                    j0Var2.f2053h = new C1422f.C1423a(f, f2, rectF.right - f, rectF.bottom - f2);
                    return;
                }
                float f3 = rectF.left;
                float f4 = rectF.top;
                float f5 = rectF.right - f3;
                float f6 = rectF.bottom - f4;
                if (f3 < aVar4.f1913a) {
                    aVar4.f1913a = f3;
                }
                if (f4 < aVar4.f1914b) {
                    aVar4.f1914b = f4;
                }
                float f7 = f3 + f5;
                if (f7 > aVar4.mo11304a()) {
                    aVar4.f1915c = f7 - aVar4.f1913a;
                }
                float f8 = f4 + f6;
                if (f8 > aVar4.mo11305b()) {
                    aVar4.f1916d = f8 - aVar4.f1914b;
                }
            }
        }
    }

    /* renamed from: W */
    public final void mo11366W(C1497h hVar, C1422f.C1433d0 d0Var) {
        Integer num;
        C1422f.C1433d0 d0Var2;
        int i;
        Paint.Join join;
        Paint paint;
        Paint.Cap cap;
        Paint paint2;
        if (mo11344A(d0Var, 4096)) {
            hVar.f2157a.f1975t = d0Var.f1975t;
        }
        if (mo11344A(d0Var, 2048)) {
            hVar.f2157a.f1974s = d0Var.f1974s;
        }
        boolean z = false;
        if (mo11344A(d0Var, 1)) {
            hVar.f2157a.f1963h = d0Var.f1963h;
            C1422f.C1464n0 n0Var = d0Var.f1963h;
            hVar.f2158b = (n0Var == null || n0Var == C1422f.C1444e.f2023i) ? false : true;
        }
        if (mo11344A(d0Var, 4)) {
            hVar.f2157a.f1965j = d0Var.f1965j;
        }
        if (mo11344A(d0Var, 6149)) {
            mo11361R(hVar, true, hVar.f2157a.f1963h);
        }
        if (mo11344A(d0Var, 2)) {
            hVar.f2157a.f1964i = d0Var.f1964i;
        }
        if (mo11344A(d0Var, 8)) {
            hVar.f2157a.f1966k = d0Var.f1966k;
            C1422f.C1464n0 n0Var2 = d0Var.f1966k;
            hVar.f2159c = (n0Var2 == null || n0Var2 == C1422f.C1444e.f2023i) ? false : true;
        }
        if (mo11344A(d0Var, 16)) {
            hVar.f2157a.f1967l = d0Var.f1967l;
        }
        if (mo11344A(d0Var, 6168)) {
            mo11361R(hVar, false, hVar.f2157a.f1966k);
        }
        if (mo11344A(d0Var, 34359738368L)) {
            hVar.f2157a.f1960R = d0Var.f1960R;
        }
        if (mo11344A(d0Var, 32)) {
            C1422f.C1433d0 d0Var3 = hVar.f2157a;
            C1422f.C1465o oVar = d0Var.f1968m;
            d0Var3.f1968m = oVar;
            hVar.f2161e.setStrokeWidth(oVar.mo11327b(this));
        }
        if (mo11344A(d0Var, 64)) {
            hVar.f2157a.f1969n = d0Var.f1969n;
            int ordinal = d0Var.f1969n.ordinal();
            if (ordinal == 0) {
                paint2 = hVar.f2161e;
                cap = Paint.Cap.BUTT;
            } else if (ordinal == 1) {
                paint2 = hVar.f2161e;
                cap = Paint.Cap.ROUND;
            } else if (ordinal == 2) {
                paint2 = hVar.f2161e;
                cap = Paint.Cap.SQUARE;
            }
            paint2.setStrokeCap(cap);
        }
        if (mo11344A(d0Var, 128)) {
            hVar.f2157a.f1970o = d0Var.f1970o;
            int ordinal2 = d0Var.f1970o.ordinal();
            if (ordinal2 == 0) {
                paint = hVar.f2161e;
                join = Paint.Join.MITER;
            } else if (ordinal2 == 1) {
                paint = hVar.f2161e;
                join = Paint.Join.ROUND;
            } else if (ordinal2 == 2) {
                paint = hVar.f2161e;
                join = Paint.Join.BEVEL;
            }
            paint.setStrokeJoin(join);
        }
        if (mo11344A(d0Var, 256)) {
            hVar.f2157a.f1971p = d0Var.f1971p;
            hVar.f2161e.setStrokeMiter(d0Var.f1971p.floatValue());
        }
        if (mo11344A(d0Var, 512)) {
            hVar.f2157a.f1972q = d0Var.f1972q;
        }
        if (mo11344A(d0Var, 1024)) {
            hVar.f2157a.f1973r = d0Var.f1973r;
        }
        Typeface typeface = null;
        if (mo11344A(d0Var, 1536)) {
            C1422f.C1465o[] oVarArr = hVar.f2157a.f1972q;
            if (oVarArr != null) {
                int length = oVarArr.length;
                int i2 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i2];
                float f = 0.0f;
                for (int i3 = 0; i3 < i2; i3++) {
                    fArr[i3] = hVar.f2157a.f1972q[i3 % length].mo11327b(this);
                    f += fArr[i3];
                }
                if (f != 0.0f) {
                    float b = hVar.f2157a.f1973r.mo11327b(this);
                    if (b < 0.0f) {
                        b = (b % f) + f;
                    }
                    hVar.f2161e.setPathEffect(new DashPathEffect(fArr, b));
                }
            }
            hVar.f2161e.setPathEffect((PathEffect) null);
        }
        if (mo11344A(d0Var, 16384)) {
            float textSize = this.f2127c.f2160d.getTextSize();
            hVar.f2157a.f1977v = d0Var.f1977v;
            hVar.f2160d.setTextSize(d0Var.f1977v.mo11328c(this, textSize));
            hVar.f2161e.setTextSize(d0Var.f1977v.mo11328c(this, textSize));
        }
        if (mo11344A(d0Var, 8192)) {
            hVar.f2157a.f1976u = d0Var.f1976u;
        }
        if (mo11344A(d0Var, 32768)) {
            if (d0Var.f1978w.intValue() == -1 && hVar.f2157a.f1978w.intValue() > 100) {
                d0Var2 = hVar.f2157a;
                i = d0Var2.f1978w.intValue() - 100;
            } else if (d0Var.f1978w.intValue() != 1 || hVar.f2157a.f1978w.intValue() >= 900) {
                d0Var2 = hVar.f2157a;
                num = d0Var.f1978w;
                d0Var2.f1978w = num;
            } else {
                d0Var2 = hVar.f2157a;
                i = d0Var2.f1978w.intValue() + 100;
            }
            num = Integer.valueOf(i);
            d0Var2.f1978w = num;
        }
        if (mo11344A(d0Var, 65536)) {
            hVar.f2157a.f1979x = d0Var.f1979x;
        }
        if (mo11344A(d0Var, 106496)) {
            List<String> list = hVar.f2157a.f1976u;
            if (list != null && this.f2126b != null) {
                for (String h : list) {
                    C1422f.C1433d0 d0Var4 = hVar.f2157a;
                    typeface = mo11376h(h, d0Var4.f1978w, d0Var4.f1979x);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                C1422f.C1433d0 d0Var5 = hVar.f2157a;
                typeface = mo11376h("serif", d0Var5.f1978w, d0Var5.f1979x);
            }
            hVar.f2160d.setTypeface(typeface);
            hVar.f2161e.setTypeface(typeface);
        }
        if (mo11344A(d0Var, 131072)) {
            hVar.f2157a.f1980y = d0Var.f1980y;
            Paint paint3 = hVar.f2160d;
            C1422f.C1433d0.C1440g gVar = d0Var.f1980y;
            C1422f.C1433d0.C1440g gVar2 = C1422f.C1433d0.C1440g.LineThrough;
            paint3.setStrikeThruText(gVar == gVar2);
            Paint paint4 = hVar.f2160d;
            C1422f.C1433d0.C1440g gVar3 = d0Var.f1980y;
            C1422f.C1433d0.C1440g gVar4 = C1422f.C1433d0.C1440g.Underline;
            paint4.setUnderlineText(gVar3 == gVar4);
            hVar.f2161e.setStrikeThruText(d0Var.f1980y == gVar2);
            Paint paint5 = hVar.f2161e;
            if (d0Var.f1980y == gVar4) {
                z = true;
            }
            paint5.setUnderlineText(z);
        }
        if (mo11344A(d0Var, 68719476736L)) {
            hVar.f2157a.f1981z = d0Var.f1981z;
        }
        if (mo11344A(d0Var, 262144)) {
            hVar.f2157a.f1943A = d0Var.f1943A;
        }
        if (mo11344A(d0Var, 524288)) {
            hVar.f2157a.f1944B = d0Var.f1944B;
        }
        if (mo11344A(d0Var, 2097152)) {
            hVar.f2157a.f1946D = d0Var.f1946D;
        }
        if (mo11344A(d0Var, 4194304)) {
            hVar.f2157a.f1947E = d0Var.f1947E;
        }
        if (mo11344A(d0Var, 8388608)) {
            hVar.f2157a.f1948F = d0Var.f1948F;
        }
        if (mo11344A(d0Var, 16777216)) {
            hVar.f2157a.f1949G = d0Var.f1949G;
        }
        if (mo11344A(d0Var, 33554432)) {
            hVar.f2157a.f1950H = d0Var.f1950H;
        }
        if (mo11344A(d0Var, 1048576)) {
            hVar.f2157a.f1945C = d0Var.f1945C;
        }
        if (mo11344A(d0Var, 268435456)) {
            hVar.f2157a.f1953K = d0Var.f1953K;
        }
        if (mo11344A(d0Var, 536870912)) {
            hVar.f2157a.f1954L = d0Var.f1954L;
        }
        if (mo11344A(d0Var, 1073741824)) {
            hVar.f2157a.f1955M = d0Var.f1955M;
        }
        if (mo11344A(d0Var, 67108864)) {
            hVar.f2157a.f1951I = d0Var.f1951I;
        }
        if (mo11344A(d0Var, 134217728)) {
            hVar.f2157a.f1952J = d0Var.f1952J;
        }
        if (mo11344A(d0Var, 8589934592L)) {
            hVar.f2157a.f1958P = d0Var.f1958P;
        }
        if (mo11344A(d0Var, 17179869184L)) {
            hVar.f2157a.f1959Q = d0Var.f1959Q;
        }
        if (mo11344A(d0Var, 137438953472L)) {
            hVar.f2157a.f1961S = d0Var.f1961S;
        }
    }

    /* renamed from: X */
    public final void mo11367X(C1497h hVar, C1422f.C1458k0 k0Var) {
        boolean z = false;
        boolean z2 = k0Var.f2066b == null;
        C1422f.C1433d0 d0Var = hVar.f2157a;
        Boolean bool = Boolean.TRUE;
        d0Var.f1949G = bool;
        if (!z2) {
            bool = Boolean.FALSE;
        }
        d0Var.f1944B = bool;
        d0Var.f1945C = null;
        d0Var.f1953K = null;
        d0Var.f1974s = Float.valueOf(1.0f);
        d0Var.f1951I = C1422f.C1444e.f2022h;
        d0Var.f1952J = Float.valueOf(1.0f);
        d0Var.f1955M = null;
        d0Var.f1956N = null;
        d0Var.f1957O = Float.valueOf(1.0f);
        d0Var.f1958P = null;
        d0Var.f1959Q = Float.valueOf(1.0f);
        d0Var.f1960R = C1422f.C1433d0.C1442i.None;
        C1422f.C1433d0 d0Var2 = k0Var.f2057e;
        if (d0Var2 != null) {
            mo11366W(hVar, d0Var2);
        }
        List<C1394b.C1411p> list = this.f2126b.f1911b.f1877a;
        if (list == null || list.isEmpty()) {
            z = true;
        }
        if (true ^ z) {
            for (C1394b.C1411p next : this.f2126b.f1911b.f1877a) {
                if (C1394b.m1491h((C1394b.C1412q) null, next.f1874a, k0Var)) {
                    mo11366W(hVar, next.f1875b);
                }
            }
        }
        C1422f.C1433d0 d0Var3 = k0Var.f2058f;
        if (d0Var3 != null) {
            mo11366W(hVar, d0Var3);
        }
    }

    /* renamed from: Y */
    public final void mo11368Y() {
        C1422f.C1444e eVar;
        C1422f.C1433d0 d0Var = this.f2127c.f2157a;
        C1422f.C1464n0 n0Var = d0Var.f1958P;
        if (n0Var instanceof C1422f.C1444e) {
            eVar = (C1422f.C1444e) n0Var;
        } else if (n0Var instanceof C1422f.C1447f) {
            eVar = d0Var.f1975t;
        } else {
            return;
        }
        int i = eVar.f2024g;
        Float f = d0Var.f1959Q;
        if (f != null) {
            i = m1630k(i, f.floatValue());
        }
        this.f2125a.drawColor(i);
    }

    /* renamed from: Z */
    public final boolean mo11369Z() {
        Boolean bool = this.f2127c.f2157a.f1950H;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @TargetApi(19)
    /* renamed from: b */
    public final Path mo11370b(C1422f.C1456j0 j0Var, C1422f.C1423a aVar) {
        Path G;
        C1422f.C1462m0 g = j0Var.f2065a.mo11301g(this.f2127c.f2157a.f1953K);
        boolean z = false;
        if (g == null) {
            m1631q("ClipPath reference '%s' not found", this.f2127c.f2157a.f1953K);
            return null;
        }
        C1422f.C1432d dVar = (C1422f.C1432d) g;
        this.f2128d.push(this.f2127c);
        this.f2127c = mo11387v(dVar);
        Boolean bool = dVar.f1942o;
        if (bool == null || bool.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(aVar.f1913a, aVar.f1914b);
            matrix.preScale(aVar.f1915c, aVar.f1916d);
        }
        Matrix matrix2 = dVar.f2060n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C1422f.C1462m0 next : dVar.f2030i) {
            if ((next instanceof C1422f.C1456j0) && (G = mo11350G((C1422f.C1456j0) next, true)) != null) {
                path.op(G, Path.Op.UNION);
            }
        }
        if (this.f2127c.f2157a.f1953K != null) {
            if (dVar.f2053h == null) {
                dVar.f2053h = mo11371c(path);
            }
            Path b = mo11370b(dVar, dVar.f2053h);
            if (b != null) {
                path.op(b, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f2127c = this.f2128d.pop();
        return path;
    }

    /* renamed from: c */
    public final C1422f.C1423a mo11371c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C1422f.C1423a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* renamed from: d */
    public final float mo11372d(C1422f.C1484x0 x0Var) {
        C1500k kVar = new C1500k((C1490a) null);
        mo11382p(x0Var, kVar);
        return kVar.f2169a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r6 != 9) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        r4 = r4 - r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[PHI: r4 
      PHI: (r4v3 float) = (r4v1 float), (r4v4 float) binds: [B:27:0x0071, B:30:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Matrix mo11373e(p005b.p080i.p081a.C1422f.C1423a r10, p005b.p080i.p081a.C1422f.C1423a r11, p005b.p080i.p081a.C1419e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L_0x008b
            b.i.a.e$a r1 = r12.f1894a
            if (r1 != 0) goto L_0x000d
            goto L_0x008b
        L_0x000d:
            float r1 = r10.f1915c
            float r2 = r11.f1915c
            float r1 = r1 / r2
            float r2 = r10.f1916d
            float r3 = r11.f1916d
            float r2 = r2 / r3
            float r3 = r11.f1913a
            float r3 = -r3
            float r4 = r11.f1914b
            float r4 = -r4
            b.i.a.e r5 = p005b.p080i.p081a.C1419e.f1892c
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x0030
            float r11 = r10.f1913a
            float r10 = r10.f1914b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            goto L_0x0088
        L_0x0030:
            b.i.a.e$b r5 = r12.f1895b
            b.i.a.e$b r6 = p005b.p080i.p081a.C1419e.C1421b.slice
            if (r5 != r6) goto L_0x003b
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x003f
        L_0x003b:
            float r1 = java.lang.Math.min(r1, r2)
        L_0x003f:
            float r2 = r10.f1915c
            float r2 = r2 / r1
            float r5 = r10.f1916d
            float r5 = r5 / r1
            b.i.a.e$a r6 = r12.f1894a
            int r6 = r6.ordinal()
            r7 = 2
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 == r7) goto L_0x0066
            r7 = 3
            if (r6 == r7) goto L_0x0062
            r7 = 5
            if (r6 == r7) goto L_0x0066
            r7 = 6
            if (r6 == r7) goto L_0x0062
            r7 = 8
            if (r6 == r7) goto L_0x0066
            r7 = 9
            if (r6 == r7) goto L_0x0062
            goto L_0x006b
        L_0x0062:
            float r6 = r11.f1915c
            float r6 = r6 - r2
            goto L_0x006a
        L_0x0066:
            float r6 = r11.f1915c
            float r6 = r6 - r2
            float r6 = r6 / r8
        L_0x006a:
            float r3 = r3 - r6
        L_0x006b:
            b.i.a.e$a r12 = r12.f1894a
            int r12 = r12.ordinal()
            switch(r12) {
                case 4: goto L_0x0079;
                case 5: goto L_0x0079;
                case 6: goto L_0x0079;
                case 7: goto L_0x0075;
                case 8: goto L_0x0075;
                case 9: goto L_0x0075;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x007e
        L_0x0075:
            float r11 = r11.f1916d
            float r11 = r11 - r5
            goto L_0x007d
        L_0x0079:
            float r11 = r11.f1916d
            float r11 = r11 - r5
            float r11 = r11 / r8
        L_0x007d:
            float r4 = r4 - r11
        L_0x007e:
            float r11 = r10.f1913a
            float r10 = r10.f1914b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
        L_0x0088:
            r0.preTranslate(r3, r4)
        L_0x008b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1489g.mo11373e(b.i.a.f$a, b.i.a.f$a, b.i.a.e):android.graphics.Matrix");
    }

    /* renamed from: f */
    public final void mo11374f(C1422f.C1456j0 j0Var, C1422f.C1423a aVar) {
        Path b;
        if (this.f2127c.f2157a.f1953K != null && (b = mo11370b(j0Var, aVar)) != null) {
            this.f2125a.clipPath(b);
        }
    }

    /* renamed from: g */
    public final void mo11375g(C1422f.C1456j0 j0Var) {
        C1422f.C1464n0 n0Var = this.f2127c.f2157a.f1963h;
        if (n0Var instanceof C1422f.C1475t) {
            mo11378l(true, j0Var.f2053h, (C1422f.C1475t) n0Var);
        }
        C1422f.C1464n0 n0Var2 = this.f2127c.f2157a.f1966k;
        if (n0Var2 instanceof C1422f.C1475t) {
            mo11378l(false, j0Var.f2053h, (C1422f.C1475t) n0Var2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r6.equals("monospace") == false) goto L_0x0029;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface mo11376h(java.lang.String r6, java.lang.Integer r7, p005b.p080i.p081a.C1422f.C1433d0.C1435b r8) {
        /*
            r5 = this;
            b.i.a.f$d0$b r0 = p005b.p080i.p081a.C1422f.C1433d0.C1435b.Italic
            r1 = 1
            r2 = 0
            if (r8 != r0) goto L_0x0008
            r8 = r1
            goto L_0x0009
        L_0x0008:
            r8 = r2
        L_0x0009:
            int r7 = r7.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 3
            r4 = 2
            if (r7 <= r0) goto L_0x0019
            if (r8 == 0) goto L_0x0017
            r7 = r3
            goto L_0x001e
        L_0x0017:
            r7 = r1
            goto L_0x001e
        L_0x0019:
            if (r8 == 0) goto L_0x001d
            r7 = r4
            goto L_0x001e
        L_0x001d:
            r7 = r2
        L_0x001e:
            r6.hashCode()
            r8 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1536685117: goto L_0x0055;
                case -1431958525: goto L_0x004c;
                case -1081737434: goto L_0x0041;
                case 109326717: goto L_0x0036;
                case 1126973893: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r1 = r8
            goto L_0x005f
        L_0x002b:
            java.lang.String r0 = "cursive"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r1 = 4
            goto L_0x005f
        L_0x0036:
            java.lang.String r0 = "serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r1 = r3
            goto L_0x005f
        L_0x0041:
            java.lang.String r0 = "fantasy"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            r1 = r4
            goto L_0x005f
        L_0x004c:
            java.lang.String r0 = "monospace"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x005f
            goto L_0x0029
        L_0x0055:
            java.lang.String r0 = "sans-serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x005e
            goto L_0x0029
        L_0x005e:
            r1 = r2
        L_0x005f:
            switch(r1) {
                case 0: goto L_0x006e;
                case 1: goto L_0x006b;
                case 2: goto L_0x006e;
                case 3: goto L_0x0064;
                case 4: goto L_0x006e;
                default: goto L_0x0062;
            }
        L_0x0062:
            r6 = 0
            goto L_0x0071
        L_0x0064:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
        L_0x0066:
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0071
        L_0x006b:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            goto L_0x0066
        L_0x006e:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            goto L_0x0066
        L_0x0071:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1489g.mo11376h(java.lang.String, java.lang.Integer, b.i.a.f$d0$b):android.graphics.Typeface");
    }

    /* renamed from: i */
    public final void mo11377i(C1422f.C1462m0 m0Var) {
        Boolean bool;
        if ((m0Var instanceof C1422f.C1458k0) && (bool = ((C1422f.C1458k0) m0Var).f2056d) != null) {
            this.f2127c.f2164h = bool.booleanValue();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8, types: [int] */
    /* JADX WARNING: type inference failed for: r7v11, types: [int] */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11378l(boolean r25, p005b.p080i.p081a.C1422f.C1423a r26, p005b.p080i.p081a.C1422f.C1475t r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            b.i.a.f$j r4 = p005b.p080i.p081a.C1422f.C1455j.repeat
            b.i.a.f$j r5 = p005b.p080i.p081a.C1422f.C1455j.reflect
            b.i.a.f r6 = r0.f2126b
            java.lang.String r7 = r3.f2096g
            b.i.a.f$m0 r6 = r6.mo11301g(r7)
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x0043
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            if (r1 == 0) goto L_0x0020
            java.lang.String r4 = "Fill"
            goto L_0x0022
        L_0x0020:
            java.lang.String r4 = "Stroke"
        L_0x0022:
            r2[r7] = r4
            java.lang.String r4 = r3.f2096g
            r2[r8] = r4
            java.lang.String r4 = "%s reference '%s' not found"
            m1631q(r4, r2)
            b.i.a.f$n0 r2 = r3.f2097h
            if (r2 == 0) goto L_0x0037
            b.i.a.g$h r3 = r0.f2127c
            r0.mo11361R(r3, r1, r2)
            goto L_0x0042
        L_0x0037:
            if (r1 == 0) goto L_0x003e
            b.i.a.g$h r1 = r0.f2127c
            r1.f2158b = r7
            goto L_0x0042
        L_0x003e:
            b.i.a.g$h r1 = r0.f2127c
            r1.f2159c = r7
        L_0x0042:
            return
        L_0x0043:
            boolean r3 = r6 instanceof p005b.p080i.p081a.C1422f.C1460l0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            if (r3 == 0) goto L_0x01b3
            b.i.a.f$l0 r6 = (p005b.p080i.p081a.C1422f.C1460l0) r6
            java.lang.String r3 = r6.f2048l
            if (r3 == 0) goto L_0x0053
            r0.mo11384s(r6, r3)
        L_0x0053:
            java.lang.Boolean r3 = r6.f2045i
            if (r3 == 0) goto L_0x005f
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x005f
            r3 = r8
            goto L_0x0060
        L_0x005f:
            r3 = r7
        L_0x0060:
            b.i.a.g$h r12 = r0.f2127c
            if (r1 == 0) goto L_0x0067
            android.graphics.Paint r12 = r12.f2160d
            goto L_0x0069
        L_0x0067:
            android.graphics.Paint r12 = r12.f2161e
        L_0x0069:
            if (r3 == 0) goto L_0x00a1
            b.i.a.f$a r10 = r24.mo11391z()
            b.i.a.f$o r13 = r6.f2061m
            if (r13 == 0) goto L_0x0078
            float r13 = r13.mo11329d(r0)
            goto L_0x0079
        L_0x0078:
            r13 = r11
        L_0x0079:
            b.i.a.f$o r14 = r6.f2062n
            if (r14 == 0) goto L_0x0082
            float r14 = r14.mo11330f(r0)
            goto L_0x0083
        L_0x0082:
            r14 = r11
        L_0x0083:
            b.i.a.f$o r15 = r6.f2063o
            if (r15 == 0) goto L_0x008c
            float r10 = r15.mo11329d(r0)
            goto L_0x008e
        L_0x008c:
            float r10 = r10.f1915c
        L_0x008e:
            b.i.a.f$o r15 = r6.f2064p
            if (r15 == 0) goto L_0x0097
            float r15 = r15.mo11330f(r0)
            goto L_0x0098
        L_0x0097:
            r15 = r11
        L_0x0098:
            r19 = r10
            r17 = r13
            r18 = r14
            r20 = r15
            goto L_0x00d1
        L_0x00a1:
            b.i.a.f$o r13 = r6.f2061m
            if (r13 == 0) goto L_0x00aa
            float r13 = r13.mo11328c(r0, r10)
            goto L_0x00ab
        L_0x00aa:
            r13 = r11
        L_0x00ab:
            b.i.a.f$o r14 = r6.f2062n
            if (r14 == 0) goto L_0x00b4
            float r14 = r14.mo11328c(r0, r10)
            goto L_0x00b5
        L_0x00b4:
            r14 = r11
        L_0x00b5:
            b.i.a.f$o r15 = r6.f2063o
            if (r15 == 0) goto L_0x00be
            float r15 = r15.mo11328c(r0, r10)
            goto L_0x00bf
        L_0x00be:
            r15 = r10
        L_0x00bf:
            b.i.a.f$o r9 = r6.f2064p
            if (r9 == 0) goto L_0x00c8
            float r9 = r9.mo11328c(r0, r10)
            goto L_0x00c9
        L_0x00c8:
            r9 = r11
        L_0x00c9:
            r20 = r9
            r17 = r13
            r18 = r14
            r19 = r15
        L_0x00d1:
            r24.mo11363T()
            b.i.a.g$h r9 = r0.mo11387v(r6)
            r0.f2127c = r9
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            if (r3 != 0) goto L_0x00ef
            float r3 = r2.f1913a
            float r10 = r2.f1914b
            r9.preTranslate(r3, r10)
            float r3 = r2.f1915c
            float r2 = r2.f1916d
            r9.preScale(r3, r2)
        L_0x00ef:
            android.graphics.Matrix r2 = r6.f2046j
            if (r2 == 0) goto L_0x00f6
            r9.preConcat(r2)
        L_0x00f6:
            java.util.List<b.i.a.f$m0> r2 = r6.f2044h
            int r2 = r2.size()
            if (r2 != 0) goto L_0x010d
            r24.mo11362S()
            b.i.a.g$h r2 = r0.f2127c
            if (r1 == 0) goto L_0x0109
            r2.f2158b = r7
            goto L_0x0396
        L_0x0109:
            r2.f2159c = r7
            goto L_0x0396
        L_0x010d:
            int[] r1 = new int[r2]
            float[] r3 = new float[r2]
            java.util.List<b.i.a.f$m0> r10 = r6.f2044h
            java.util.Iterator r10 = r10.iterator()
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0119:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x0166
            java.lang.Object r14 = r10.next()
            b.i.a.f$m0 r14 = (p005b.p080i.p081a.C1422f.C1462m0) r14
            b.i.a.f$c0 r14 = (p005b.p080i.p081a.C1422f.C1430c0) r14
            java.lang.Float r15 = r14.f1931h
            if (r15 == 0) goto L_0x0130
            float r15 = r15.floatValue()
            goto L_0x0131
        L_0x0130:
            r15 = r11
        L_0x0131:
            if (r7 == 0) goto L_0x013b
            int r16 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r16 < 0) goto L_0x0138
            goto L_0x013b
        L_0x0138:
            r3[r7] = r13
            goto L_0x013e
        L_0x013b:
            r3[r7] = r15
            r13 = r15
        L_0x013e:
            r24.mo11363T()
            b.i.a.g$h r15 = r0.f2127c
            r0.mo11367X(r15, r14)
            b.i.a.g$h r14 = r0.f2127c
            b.i.a.f$d0 r14 = r14.f2157a
            b.i.a.f$n0 r15 = r14.f1951I
            b.i.a.f$e r15 = (p005b.p080i.p081a.C1422f.C1444e) r15
            if (r15 != 0) goto L_0x0152
            b.i.a.f$e r15 = p005b.p080i.p081a.C1422f.C1444e.f2022h
        L_0x0152:
            int r15 = r15.f2024g
            java.lang.Float r14 = r14.f1952J
            float r14 = r14.floatValue()
            int r14 = m1630k(r15, r14)
            r1[r7] = r14
            int r7 = r7 + 1
            r24.mo11362S()
            goto L_0x0119
        L_0x0166:
            int r7 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r7 != 0) goto L_0x016e
            int r7 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x0170
        L_0x016e:
            if (r2 != r8) goto L_0x017b
        L_0x0170:
            r24.mo11362S()
            int r2 = r2 - r8
            r1 = r1[r2]
            r12.setColor(r1)
            goto L_0x0396
        L_0x017b:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            b.i.a.f$j r6 = r6.f2047k
            if (r6 == 0) goto L_0x018a
            if (r6 != r5) goto L_0x0186
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x018a
        L_0x0186:
            if (r6 != r4) goto L_0x018a
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
        L_0x018a:
            r23 = r2
            r24.mo11362S()
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            r16 = r2
            r21 = r1
            r22 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r2.setLocalMatrix(r9)
            r12.setShader(r2)
            b.i.a.g$h r1 = r0.f2127c
            b.i.a.f$d0 r1 = r1.f2157a
            java.lang.Float r1 = r1.f1965j
            float r1 = r1.floatValue()
            int r1 = m1629j(r1)
            r12.setAlpha(r1)
            goto L_0x0396
        L_0x01b3:
            boolean r3 = r6 instanceof p005b.p080i.p081a.C1422f.C1468p0
            if (r3 == 0) goto L_0x0313
            b.i.a.f$p0 r6 = (p005b.p080i.p081a.C1422f.C1468p0) r6
            java.lang.String r3 = r6.f2048l
            if (r3 == 0) goto L_0x01c0
            r0.mo11384s(r6, r3)
        L_0x01c0:
            java.lang.Boolean r3 = r6.f2045i
            if (r3 == 0) goto L_0x01cc
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x01cc
            r3 = r8
            goto L_0x01cd
        L_0x01cc:
            r3 = r7
        L_0x01cd:
            b.i.a.g$h r9 = r0.f2127c
            if (r1 == 0) goto L_0x01d4
            android.graphics.Paint r9 = r9.f2160d
            goto L_0x01d6
        L_0x01d4:
            android.graphics.Paint r9 = r9.f2161e
        L_0x01d6:
            if (r3 == 0) goto L_0x020f
            b.i.a.f$o r10 = new b.i.a.f$o
            r12 = 1112014848(0x42480000, float:50.0)
            b.i.a.f$c1 r13 = p005b.p080i.p081a.C1422f.C1431c1.percent
            r10.<init>(r12, r13)
            b.i.a.f$o r12 = r6.f2080m
            if (r12 == 0) goto L_0x01ea
            float r12 = r12.mo11329d(r0)
            goto L_0x01ee
        L_0x01ea:
            float r12 = r10.mo11329d(r0)
        L_0x01ee:
            b.i.a.f$o r13 = r6.f2081n
            if (r13 == 0) goto L_0x01f7
            float r13 = r13.mo11330f(r0)
            goto L_0x01fb
        L_0x01f7:
            float r13 = r10.mo11330f(r0)
        L_0x01fb:
            b.i.a.f$o r14 = r6.f2082o
            if (r14 == 0) goto L_0x0204
            float r10 = r14.mo11327b(r0)
            goto L_0x0208
        L_0x0204:
            float r10 = r10.mo11327b(r0)
        L_0x0208:
            r18 = r10
            r16 = r12
            r17 = r13
            goto L_0x0235
        L_0x020f:
            b.i.a.f$o r12 = r6.f2080m
            r13 = 1056964608(0x3f000000, float:0.5)
            if (r12 == 0) goto L_0x021a
            float r12 = r12.mo11328c(r0, r10)
            goto L_0x021b
        L_0x021a:
            r12 = r13
        L_0x021b:
            b.i.a.f$o r14 = r6.f2081n
            if (r14 == 0) goto L_0x0224
            float r14 = r14.mo11328c(r0, r10)
            goto L_0x0225
        L_0x0224:
            r14 = r13
        L_0x0225:
            b.i.a.f$o r15 = r6.f2082o
            if (r15 == 0) goto L_0x022e
            float r10 = r15.mo11328c(r0, r10)
            goto L_0x022f
        L_0x022e:
            r10 = r13
        L_0x022f:
            r18 = r10
            r16 = r12
            r17 = r14
        L_0x0235:
            r24.mo11363T()
            b.i.a.g$h r10 = r0.mo11387v(r6)
            r0.f2127c = r10
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            if (r3 != 0) goto L_0x0253
            float r3 = r2.f1913a
            float r12 = r2.f1914b
            r10.preTranslate(r3, r12)
            float r3 = r2.f1915c
            float r2 = r2.f1916d
            r10.preScale(r3, r2)
        L_0x0253:
            android.graphics.Matrix r2 = r6.f2046j
            if (r2 == 0) goto L_0x025a
            r10.preConcat(r2)
        L_0x025a:
            java.util.List<b.i.a.f$m0> r2 = r6.f2044h
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0271
            r24.mo11362S()
            b.i.a.g$h r2 = r0.f2127c
            if (r1 == 0) goto L_0x026d
            r2.f2158b = r7
            goto L_0x0396
        L_0x026d:
            r2.f2159c = r7
            goto L_0x0396
        L_0x0271:
            int[] r1 = new int[r2]
            float[] r3 = new float[r2]
            java.util.List<b.i.a.f$m0> r12 = r6.f2044h
            java.util.Iterator r12 = r12.iterator()
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x027d:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x02ca
            java.lang.Object r14 = r12.next()
            b.i.a.f$m0 r14 = (p005b.p080i.p081a.C1422f.C1462m0) r14
            b.i.a.f$c0 r14 = (p005b.p080i.p081a.C1422f.C1430c0) r14
            java.lang.Float r15 = r14.f1931h
            if (r15 == 0) goto L_0x0294
            float r15 = r15.floatValue()
            goto L_0x0295
        L_0x0294:
            r15 = r11
        L_0x0295:
            if (r7 == 0) goto L_0x029f
            int r19 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r19 < 0) goto L_0x029c
            goto L_0x029f
        L_0x029c:
            r3[r7] = r13
            goto L_0x02a2
        L_0x029f:
            r3[r7] = r15
            r13 = r15
        L_0x02a2:
            r24.mo11363T()
            b.i.a.g$h r15 = r0.f2127c
            r0.mo11367X(r15, r14)
            b.i.a.g$h r14 = r0.f2127c
            b.i.a.f$d0 r14 = r14.f2157a
            b.i.a.f$n0 r15 = r14.f1951I
            b.i.a.f$e r15 = (p005b.p080i.p081a.C1422f.C1444e) r15
            if (r15 != 0) goto L_0x02b6
            b.i.a.f$e r15 = p005b.p080i.p081a.C1422f.C1444e.f2022h
        L_0x02b6:
            int r15 = r15.f2024g
            java.lang.Float r14 = r14.f1952J
            float r14 = r14.floatValue()
            int r14 = m1630k(r15, r14)
            r1[r7] = r14
            int r7 = r7 + 1
            r24.mo11362S()
            goto L_0x027d
        L_0x02ca:
            int r7 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0308
            if (r2 != r8) goto L_0x02d1
            goto L_0x0308
        L_0x02d1:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            b.i.a.f$j r6 = r6.f2047k
            if (r6 == 0) goto L_0x02e0
            if (r6 != r5) goto L_0x02dc
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x02e0
        L_0x02dc:
            if (r6 != r4) goto L_0x02e0
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
        L_0x02e0:
            r21 = r2
            r24.mo11362S()
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            r15 = r2
            r19 = r1
            r20 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r2.setLocalMatrix(r10)
            r9.setShader(r2)
            b.i.a.g$h r1 = r0.f2127c
            b.i.a.f$d0 r1 = r1.f2157a
            java.lang.Float r1 = r1.f1965j
            float r1 = r1.floatValue()
            int r1 = m1629j(r1)
            r9.setAlpha(r1)
            goto L_0x0396
        L_0x0308:
            r24.mo11362S()
            int r2 = r2 - r8
            r1 = r1[r2]
            r9.setColor(r1)
            goto L_0x0396
        L_0x0313:
            boolean r2 = r6 instanceof p005b.p080i.p081a.C1422f.C1427b0
            if (r2 == 0) goto L_0x0396
            b.i.a.f$b0 r6 = (p005b.p080i.p081a.C1422f.C1427b0) r6
            r2 = 6442450944(0x180000000, double:3.1829936864E-314)
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            r9 = 2147483648(0x80000000, double:1.0609978955E-314)
            b.i.a.f$d0 r11 = r6.f2057e
            boolean r9 = r0.mo11344A(r11, r9)
            if (r1 == 0) goto L_0x0362
            if (r9 == 0) goto L_0x0341
            b.i.a.g$h r9 = r0.f2127c
            b.i.a.f$d0 r10 = r9.f2157a
            b.i.a.f$d0 r11 = r6.f2057e
            b.i.a.f$n0 r11 = r11.f1956N
            r10.f1963h = r11
            if (r11 == 0) goto L_0x033f
            r7 = r8
        L_0x033f:
            r9.f2158b = r7
        L_0x0341:
            b.i.a.f$d0 r7 = r6.f2057e
            boolean r4 = r0.mo11344A(r7, r4)
            if (r4 == 0) goto L_0x0353
            b.i.a.g$h r4 = r0.f2127c
            b.i.a.f$d0 r4 = r4.f2157a
            b.i.a.f$d0 r5 = r6.f2057e
            java.lang.Float r5 = r5.f1957O
            r4.f1965j = r5
        L_0x0353:
            b.i.a.f$d0 r4 = r6.f2057e
            boolean r2 = r0.mo11344A(r4, r2)
            if (r2 == 0) goto L_0x0396
            b.i.a.g$h r2 = r0.f2127c
            b.i.a.f$d0 r3 = r2.f2157a
            b.i.a.f$n0 r3 = r3.f1963h
            goto L_0x0393
        L_0x0362:
            if (r9 == 0) goto L_0x0373
            b.i.a.g$h r9 = r0.f2127c
            b.i.a.f$d0 r10 = r9.f2157a
            b.i.a.f$d0 r11 = r6.f2057e
            b.i.a.f$n0 r11 = r11.f1956N
            r10.f1966k = r11
            if (r11 == 0) goto L_0x0371
            r7 = r8
        L_0x0371:
            r9.f2159c = r7
        L_0x0373:
            b.i.a.f$d0 r7 = r6.f2057e
            boolean r4 = r0.mo11344A(r7, r4)
            if (r4 == 0) goto L_0x0385
            b.i.a.g$h r4 = r0.f2127c
            b.i.a.f$d0 r4 = r4.f2157a
            b.i.a.f$d0 r5 = r6.f2057e
            java.lang.Float r5 = r5.f1957O
            r4.f1967l = r5
        L_0x0385:
            b.i.a.f$d0 r4 = r6.f2057e
            boolean r2 = r0.mo11344A(r4, r2)
            if (r2 == 0) goto L_0x0396
            b.i.a.g$h r2 = r0.f2127c
            b.i.a.f$d0 r3 = r2.f2157a
            b.i.a.f$n0 r3 = r3.f1966k
        L_0x0393:
            r0.mo11361R(r2, r1, r3)
        L_0x0396:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1489g.mo11378l(boolean, b.i.a.f$a, b.i.a.f$t):void");
    }

    /* renamed from: m */
    public final boolean mo11379m() {
        Boolean bool = this.f2127c.f2157a.f1949G;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: n */
    public final void mo11380n(C1422f.C1456j0 j0Var, Path path) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        C1422f.C1456j0 j0Var2 = j0Var;
        Path path2 = path;
        C1422f.C1464n0 n0Var = this.f2127c.f2157a.f1963h;
        if (n0Var instanceof C1422f.C1475t) {
            C1422f.C1462m0 g = this.f2126b.mo11301g(((C1422f.C1475t) n0Var).f2096g);
            if (g instanceof C1422f.C1483x) {
                C1422f.C1483x xVar = (C1422f.C1483x) g;
                Boolean bool = xVar.f2108p;
                boolean z = bool != null && bool.booleanValue();
                String str = xVar.f2115w;
                if (str != null) {
                    mo11386u(xVar, str);
                }
                if (z) {
                    C1422f.C1465o oVar = xVar.f2111s;
                    f4 = oVar != null ? oVar.mo11329d(this) : 0.0f;
                    C1422f.C1465o oVar2 = xVar.f2112t;
                    f3 = oVar2 != null ? oVar2.mo11330f(this) : 0.0f;
                    C1422f.C1465o oVar3 = xVar.f2113u;
                    f2 = oVar3 != null ? oVar3.mo11329d(this) : 0.0f;
                    C1422f.C1465o oVar4 = xVar.f2114v;
                    f = oVar4 != null ? oVar4.mo11330f(this) : 0.0f;
                } else {
                    C1422f.C1465o oVar5 = xVar.f2111s;
                    float c = oVar5 != null ? oVar5.mo11328c(this, 1.0f) : 0.0f;
                    C1422f.C1465o oVar6 = xVar.f2112t;
                    float c2 = oVar6 != null ? oVar6.mo11328c(this, 1.0f) : 0.0f;
                    C1422f.C1465o oVar7 = xVar.f2113u;
                    float c3 = oVar7 != null ? oVar7.mo11328c(this, 1.0f) : 0.0f;
                    C1422f.C1465o oVar8 = xVar.f2114v;
                    float c4 = oVar8 != null ? oVar8.mo11328c(this, 1.0f) : 0.0f;
                    C1422f.C1423a aVar = j0Var2.f2053h;
                    float f6 = aVar.f1913a;
                    float f7 = aVar.f1915c;
                    f4 = (c * f7) + f6;
                    float f8 = aVar.f1914b;
                    float f9 = aVar.f1916d;
                    float f10 = c3 * f7;
                    f = c4 * f9;
                    f3 = (c2 * f9) + f8;
                    f2 = f10;
                }
                if (f2 != 0.0f && f != 0.0f) {
                    C1419e eVar = xVar.f2075n;
                    if (eVar == null) {
                        eVar = C1419e.f1893d;
                    }
                    mo11363T();
                    this.f2125a.clipPath(path2);
                    C1497h hVar = new C1497h(this);
                    mo11366W(hVar, C1422f.C1433d0.m1537a());
                    hVar.f2157a.f1944B = Boolean.FALSE;
                    mo11388w(xVar, hVar);
                    this.f2127c = hVar;
                    C1422f.C1423a aVar2 = j0Var2.f2053h;
                    Matrix matrix = xVar.f2110r;
                    if (matrix != null) {
                        this.f2125a.concat(matrix);
                        Matrix matrix2 = new Matrix();
                        if (xVar.f2110r.invert(matrix2)) {
                            C1422f.C1423a aVar3 = j0Var2.f2053h;
                            C1422f.C1423a aVar4 = j0Var2.f2053h;
                            C1422f.C1423a aVar5 = j0Var2.f2053h;
                            float[] fArr = {aVar3.f1913a, aVar3.f1914b, aVar3.mo11304a(), aVar4.f1914b, aVar4.mo11304a(), j0Var2.f2053h.mo11305b(), aVar5.f1913a, aVar5.mo11305b()};
                            matrix2.mapPoints(fArr);
                            RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                            for (int i = 2; i <= 6; i += 2) {
                                if (fArr[i] < rectF.left) {
                                    rectF.left = fArr[i];
                                }
                                if (fArr[i] > rectF.right) {
                                    rectF.right = fArr[i];
                                }
                                int i2 = i + 1;
                                if (fArr[i2] < rectF.top) {
                                    rectF.top = fArr[i2];
                                }
                                if (fArr[i2] > rectF.bottom) {
                                    rectF.bottom = fArr[i2];
                                }
                            }
                            float f11 = rectF.left;
                            float f12 = rectF.top;
                            aVar2 = new C1422f.C1423a(f11, f12, rectF.right - f11, rectF.bottom - f12);
                        }
                    }
                    float floor = (((float) Math.floor((double) ((aVar2.f1913a - f4) / f2))) * f2) + f4;
                    float a = aVar2.mo11304a();
                    float b = aVar2.mo11305b();
                    C1422f.C1423a aVar6 = new C1422f.C1423a(0.0f, 0.0f, f2, f);
                    boolean J = mo11353J();
                    for (float floor2 = (((float) Math.floor((double) ((aVar2.f1914b - f3) / f))) * f) + f3; floor2 < b; floor2 += f) {
                        float f13 = floor;
                        while (f13 < a) {
                            aVar6.f1913a = f13;
                            aVar6.f1914b = floor2;
                            mo11363T();
                            if (!this.f2127c.f2157a.f1944B.booleanValue()) {
                                f5 = b;
                                mo11360Q(aVar6.f1913a, aVar6.f1914b, aVar6.f1915c, aVar6.f1916d);
                            } else {
                                f5 = b;
                            }
                            C1422f.C1423a aVar7 = xVar.f2091o;
                            if (aVar7 != null) {
                                this.f2125a.concat(mo11373e(aVar6, aVar7, eVar));
                            } else {
                                Boolean bool2 = xVar.f2109q;
                                boolean z2 = bool2 == null || bool2.booleanValue();
                                this.f2125a.translate(f13, floor2);
                                if (!z2) {
                                    Canvas canvas = this.f2125a;
                                    C1422f.C1423a aVar8 = j0Var2.f2053h;
                                    canvas.scale(aVar8.f1915c, aVar8.f1916d);
                                }
                            }
                            for (C1422f.C1462m0 L : xVar.f2030i) {
                                mo11355L(L);
                            }
                            mo11362S();
                            f13 += f2;
                            b = f5;
                        }
                        float f14 = b;
                    }
                    if (J) {
                        mo11352I(xVar, xVar.f2053h);
                    }
                    mo11362S();
                    return;
                }
                return;
            }
        }
        this.f2125a.drawPath(path2, this.f2127c.f2160d);
    }

    /* renamed from: o */
    public final void mo11381o(Path path) {
        C1497h hVar = this.f2127c;
        if (hVar.f2157a.f1960R == C1422f.C1433d0.C1442i.NonScalingStroke) {
            Matrix matrix = this.f2125a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.f2125a.setMatrix(new Matrix());
            Shader shader = this.f2127c.f2161e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.f2125a.drawPath(path2, this.f2127c.f2161e);
            this.f2125a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.f2125a.drawPath(path, hVar.f2161e);
    }

    /* renamed from: p */
    public final void mo11382p(C1422f.C1484x0 x0Var, C1499j jVar) {
        float f;
        float f2;
        float f3;
        float f4;
        C1422f.C1433d0.C1439f x;
        C1499j jVar2 = jVar;
        if (mo11379m()) {
            Iterator<C1422f.C1462m0> it = x0Var.f2030i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C1422f.C1462m0 next = it.next();
                if (next instanceof C1422f.C1428b1) {
                    jVar2.mo11395b(mo11364U(((C1422f.C1428b1) next).f1927c, z, !it.hasNext()));
                } else {
                    C1422f.C1433d0.C1439f fVar = C1422f.C1433d0.C1439f.Middle;
                    C1422f.C1433d0.C1439f fVar2 = C1422f.C1433d0.C1439f.Start;
                    if (jVar2.mo11396a((C1422f.C1484x0) next)) {
                        if (next instanceof C1422f.C1486y0) {
                            mo11363T();
                            C1422f.C1486y0 y0Var = (C1422f.C1486y0) next;
                            mo11367X(this.f2127c, y0Var);
                            if (mo11379m() && mo11369Z()) {
                                C1422f.C1462m0 g = y0Var.f2065a.mo11301g(y0Var.f2117n);
                                if (g == null) {
                                    m1631q("TextPath reference '%s' not found", y0Var.f2117n);
                                } else {
                                    C1422f.C1477u uVar = (C1422f.C1477u) g;
                                    Path path = new C1493d(this, uVar.f2100o).f2145a;
                                    Matrix matrix = uVar.f2054n;
                                    if (matrix != null) {
                                        path.transform(matrix);
                                    }
                                    PathMeasure pathMeasure = new PathMeasure(path, false);
                                    C1422f.C1465o oVar = y0Var.f2118o;
                                    float c = oVar != null ? oVar.mo11328c(this, pathMeasure.getLength()) : 0.0f;
                                    C1422f.C1433d0.C1439f x2 = mo11389x();
                                    if (x2 != fVar2) {
                                        C1500k kVar = new C1500k((C1490a) null);
                                        mo11382p(y0Var, kVar);
                                        float f5 = kVar.f2169a;
                                        if (x2 == fVar) {
                                            f5 /= 2.0f;
                                        }
                                        c -= f5;
                                    }
                                    mo11375g((C1422f.C1456j0) y0Var.f2119p);
                                    boolean J = mo11353J();
                                    mo11382p(y0Var, new C1494e(path, c, 0.0f));
                                    if (J) {
                                        mo11352I(y0Var, y0Var.f2053h);
                                    }
                                }
                            }
                        } else if (next instanceof C1422f.C1478u0) {
                            mo11363T();
                            C1422f.C1478u0 u0Var = (C1422f.C1478u0) next;
                            mo11367X(this.f2127c, u0Var);
                            if (mo11379m()) {
                                List<C1422f.C1465o> list = u0Var.f2120n;
                                boolean z2 = list != null && list.size() > 0;
                                boolean z3 = jVar2 instanceof C1495f;
                                if (z3) {
                                    float d = !z2 ? ((C1495f) jVar2).f2150a : u0Var.f2120n.get(0).mo11329d(this);
                                    List<C1422f.C1465o> list2 = u0Var.f2121o;
                                    f2 = (list2 == null || list2.size() == 0) ? ((C1495f) jVar2).f2151b : u0Var.f2121o.get(0).mo11330f(this);
                                    List<C1422f.C1465o> list3 = u0Var.f2122p;
                                    f = (list3 == null || list3.size() == 0) ? 0.0f : u0Var.f2122p.get(0).mo11329d(this);
                                    List<C1422f.C1465o> list4 = u0Var.f2123q;
                                    float f6 = d;
                                    f3 = (list4 == null || list4.size() == 0) ? 0.0f : u0Var.f2123q.get(0).mo11330f(this);
                                    f4 = f6;
                                } else {
                                    f4 = 0.0f;
                                    f3 = 0.0f;
                                    f2 = 0.0f;
                                    f = 0.0f;
                                }
                                if (z2 && (x = mo11389x()) != fVar2) {
                                    C1500k kVar2 = new C1500k((C1490a) null);
                                    mo11382p(u0Var, kVar2);
                                    float f7 = kVar2.f2169a;
                                    if (x == fVar) {
                                        f7 /= 2.0f;
                                    }
                                    f4 -= f7;
                                }
                                mo11375g((C1422f.C1456j0) u0Var.f2102r);
                                if (z3) {
                                    C1495f fVar3 = (C1495f) jVar2;
                                    fVar3.f2150a = f4 + f;
                                    fVar3.f2151b = f2 + f3;
                                }
                                boolean J2 = mo11353J();
                                mo11382p(u0Var, jVar2);
                                if (J2) {
                                    mo11352I(u0Var, u0Var.f2053h);
                                }
                            }
                        } else if (next instanceof C1422f.C1476t0) {
                            mo11363T();
                            C1422f.C1476t0 t0Var = (C1422f.C1476t0) next;
                            mo11367X(this.f2127c, t0Var);
                            if (mo11379m()) {
                                mo11375g((C1422f.C1456j0) t0Var.f2099o);
                                C1422f.C1462m0 g2 = next.f2065a.mo11301g(t0Var.f2098n);
                                if (g2 == null || !(g2 instanceof C1422f.C1484x0)) {
                                    m1631q("Tref reference '%s' not found", t0Var.f2098n);
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    mo11383r((C1422f.C1484x0) g2, sb);
                                    if (sb.length() > 0) {
                                        jVar2.mo11395b(sb.toString());
                                    }
                                }
                            }
                        }
                        mo11362S();
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: r */
    public final void mo11383r(C1422f.C1484x0 x0Var, StringBuilder sb) {
        Iterator<C1422f.C1462m0> it = x0Var.f2030i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C1422f.C1462m0 next = it.next();
            if (next instanceof C1422f.C1484x0) {
                mo11383r((C1422f.C1484x0) next, sb);
            } else if (next instanceof C1422f.C1428b1) {
                sb.append(mo11364U(((C1422f.C1428b1) next).f1927c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* renamed from: s */
    public final void mo11384s(C1422f.C1453i iVar, String str) {
        C1422f.C1462m0 g = iVar.f2065a.mo11301g(str);
        if (g == null) {
            m1628a0("Gradient reference '%s' not found", str);
        } else if (!(g instanceof C1422f.C1453i)) {
            m1631q("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (g == iVar) {
            m1631q("Circular reference in gradient href attribute '%s'", str);
        } else {
            C1422f.C1453i iVar2 = (C1422f.C1453i) g;
            if (iVar.f2045i == null) {
                iVar.f2045i = iVar2.f2045i;
            }
            if (iVar.f2046j == null) {
                iVar.f2046j = iVar2.f2046j;
            }
            if (iVar.f2047k == null) {
                iVar.f2047k = iVar2.f2047k;
            }
            if (iVar.f2044h.isEmpty()) {
                iVar.f2044h = iVar2.f2044h;
            }
            try {
                if (iVar instanceof C1422f.C1460l0) {
                    C1422f.C1460l0 l0Var = (C1422f.C1460l0) iVar;
                    C1422f.C1460l0 l0Var2 = (C1422f.C1460l0) g;
                    if (l0Var.f2061m == null) {
                        l0Var.f2061m = l0Var2.f2061m;
                    }
                    if (l0Var.f2062n == null) {
                        l0Var.f2062n = l0Var2.f2062n;
                    }
                    if (l0Var.f2063o == null) {
                        l0Var.f2063o = l0Var2.f2063o;
                    }
                    if (l0Var.f2064p == null) {
                        l0Var.f2064p = l0Var2.f2064p;
                    }
                } else {
                    mo11385t((C1422f.C1468p0) iVar, (C1422f.C1468p0) g);
                }
            } catch (ClassCastException unused) {
            }
            String str2 = iVar2.f2048l;
            if (str2 != null) {
                mo11384s(iVar, str2);
            }
        }
    }

    /* renamed from: t */
    public final void mo11385t(C1422f.C1468p0 p0Var, C1422f.C1468p0 p0Var2) {
        if (p0Var.f2080m == null) {
            p0Var.f2080m = p0Var2.f2080m;
        }
        if (p0Var.f2081n == null) {
            p0Var.f2081n = p0Var2.f2081n;
        }
        if (p0Var.f2082o == null) {
            p0Var.f2082o = p0Var2.f2082o;
        }
        if (p0Var.f2083p == null) {
            p0Var.f2083p = p0Var2.f2083p;
        }
        if (p0Var.f2084q == null) {
            p0Var.f2084q = p0Var2.f2084q;
        }
    }

    /* renamed from: u */
    public final void mo11386u(C1422f.C1483x xVar, String str) {
        C1422f.C1462m0 g = xVar.f2065a.mo11301g(str);
        if (g == null) {
            m1628a0("Pattern reference '%s' not found", str);
        } else if (!(g instanceof C1422f.C1483x)) {
            m1631q("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (g == xVar) {
            m1631q("Circular reference in pattern href attribute '%s'", str);
        } else {
            C1422f.C1483x xVar2 = (C1422f.C1483x) g;
            if (xVar.f2108p == null) {
                xVar.f2108p = xVar2.f2108p;
            }
            if (xVar.f2109q == null) {
                xVar.f2109q = xVar2.f2109q;
            }
            if (xVar.f2110r == null) {
                xVar.f2110r = xVar2.f2110r;
            }
            if (xVar.f2111s == null) {
                xVar.f2111s = xVar2.f2111s;
            }
            if (xVar.f2112t == null) {
                xVar.f2112t = xVar2.f2112t;
            }
            if (xVar.f2113u == null) {
                xVar.f2113u = xVar2.f2113u;
            }
            if (xVar.f2114v == null) {
                xVar.f2114v = xVar2.f2114v;
            }
            if (xVar.f2030i.isEmpty()) {
                xVar.f2030i = xVar2.f2030i;
            }
            if (xVar.f2091o == null) {
                xVar.f2091o = xVar2.f2091o;
            }
            if (xVar.f2075n == null) {
                xVar.f2075n = xVar2.f2075n;
            }
            String str2 = xVar2.f2115w;
            if (str2 != null) {
                mo11386u(xVar, str2);
            }
        }
    }

    /* renamed from: v */
    public final C1497h mo11387v(C1422f.C1462m0 m0Var) {
        C1497h hVar = new C1497h(this);
        mo11366W(hVar, C1422f.C1433d0.m1537a());
        mo11388w(m0Var, hVar);
        return hVar;
    }

    /* renamed from: w */
    public final C1497h mo11388w(C1422f.C1462m0 m0Var, C1497h hVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (m0Var instanceof C1422f.C1458k0) {
                arrayList.add(0, (C1422f.C1458k0) m0Var);
            }
            C1422f.C1454i0 i0Var = m0Var.f2066b;
            if (i0Var == null) {
                break;
            }
            m0Var = (C1422f.C1462m0) i0Var;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mo11367X(hVar, (C1422f.C1458k0) it.next());
        }
        C1497h hVar2 = this.f2127c;
        hVar.f2163g = hVar2.f2163g;
        hVar.f2162f = hVar2.f2162f;
        return hVar;
    }

    /* renamed from: x */
    public final C1422f.C1433d0.C1439f mo11389x() {
        C1422f.C1433d0.C1439f fVar;
        C1422f.C1433d0 d0Var = this.f2127c.f2157a;
        if (d0Var.f1981z == C1422f.C1433d0.C1441h.LTR || (fVar = d0Var.f1943A) == C1422f.C1433d0.C1439f.Middle) {
            return d0Var.f1943A;
        }
        C1422f.C1433d0.C1439f fVar2 = C1422f.C1433d0.C1439f.Start;
        return fVar == fVar2 ? C1422f.C1433d0.C1439f.End : fVar2;
    }

    /* renamed from: y */
    public final Path.FillType mo11390y() {
        C1422f.C1433d0.C1434a aVar = this.f2127c.f2157a.f1954L;
        return (aVar == null || aVar != C1422f.C1433d0.C1434a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* renamed from: z */
    public C1422f.C1423a mo11391z() {
        C1497h hVar = this.f2127c;
        C1422f.C1423a aVar = hVar.f2163g;
        return aVar != null ? aVar : hVar.f2162f;
    }
}
