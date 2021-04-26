package p005b.p051h.p052a.p055m.p064x.p069g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.p054l.C0956a;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p064x.p069g.C1287g;

/* renamed from: b.h.a.m.x.g.c */
public class C1282c extends Drawable implements C1287g.C1289b, Animatable, Animatable2Compat {

    /* renamed from: g */
    public final C1283a f1593g;

    /* renamed from: h */
    public boolean f1594h;

    /* renamed from: i */
    public boolean f1595i;

    /* renamed from: j */
    public boolean f1596j;

    /* renamed from: k */
    public boolean f1597k = true;

    /* renamed from: l */
    public int f1598l;

    /* renamed from: m */
    public int f1599m = -1;

    /* renamed from: n */
    public boolean f1600n;

    /* renamed from: o */
    public Paint f1601o;

    /* renamed from: p */
    public Rect f1602p;

    /* renamed from: q */
    public List<Animatable2Compat.AnimationCallback> f1603q;

    /* renamed from: b.h.a.m.x.g.c$a */
    public static final class C1283a extends Drawable.ConstantState {
        @VisibleForTesting

        /* renamed from: a */
        public final C1287g f1604a;

        public C1283a(C1287g gVar) {
            this.f1604a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public Drawable newDrawable() {
            return new C1282c(this);
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new C1282c(this);
        }
    }

    public C1282c(Context context, C0956a aVar, C0983t<Bitmap> tVar, int i, int i2, Bitmap bitmap) {
        C1283a aVar2 = new C1283a(new C1287g(C0929c.m652b(context), aVar, i, i2, tVar, bitmap));
        this.f1593g = aVar2;
    }

    /* renamed from: a */
    public void mo11114a() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        C1287g gVar = this.f1593g.f1604a;
        C1287g.C1288a aVar = gVar.f1614i;
        if ((aVar != null ? aVar.f1624k : -1) == gVar.f1606a.mo10811d() - 1) {
            this.f1598l++;
        }
        int i = this.f1599m;
        if (i != -1 && this.f1598l >= i) {
            List<Animatable2Compat.AnimationCallback> list = this.f1603q;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f1603q.get(i2).onAnimationEnd(this);
                }
            }
            stop();
        }
    }

    /* renamed from: b */
    public Bitmap mo11115b() {
        return this.f1593g.f1604a.f1617l;
    }

    /* renamed from: c */
    public final Paint mo11116c() {
        if (this.f1601o == null) {
            this.f1601o = new Paint(2);
        }
        return this.f1601o;
    }

    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.f1603q;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final void mo11117d() {
        C0823f.m366e(!this.f1596j, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f1593g.f1604a.f1606a.mo10811d() != 1) {
            if (!this.f1594h) {
                this.f1594h = true;
                C1287g gVar = this.f1593g.f1604a;
                if (gVar.f1615j) {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                } else if (!gVar.f1608c.contains(this)) {
                    boolean isEmpty = gVar.f1608c.isEmpty();
                    gVar.f1608c.add(this);
                    if (isEmpty && !gVar.f1611f) {
                        gVar.f1611f = true;
                        gVar.f1615j = false;
                        gVar.mo11134a();
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe twice in a row");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap;
        if (!this.f1596j) {
            if (this.f1600n) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f1602p == null) {
                    this.f1602p = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f1602p);
                this.f1600n = false;
            }
            C1287g gVar = this.f1593g.f1604a;
            C1287g.C1288a aVar = gVar.f1614i;
            if (aVar != null) {
                bitmap = aVar.f1626m;
            } else {
                bitmap = gVar.f1617l;
            }
            if (this.f1602p == null) {
                this.f1602p = new Rect();
            }
            canvas.drawBitmap(bitmap, (Rect) null, this.f1602p, mo11116c());
        }
    }

    /* renamed from: e */
    public final void mo11119e() {
        this.f1594h = false;
        C1287g gVar = this.f1593g.f1604a;
        gVar.f1608c.remove(this);
        if (gVar.f1608c.isEmpty()) {
            gVar.f1611f = false;
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f1593g;
    }

    public int getIntrinsicHeight() {
        return this.f1593g.f1604a.f1622q;
    }

    public int getIntrinsicWidth() {
        return this.f1593g.f1604a.f1621p;
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f1594h;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1600n = true;
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback != null) {
            if (this.f1603q == null) {
                this.f1603q = new ArrayList();
            }
            this.f1603q.add(animationCallback);
        }
    }

    public void setAlpha(int i) {
        mo11116c().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        mo11116c().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C0823f.m366e(!this.f1596j, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f1597k = z;
        if (!z) {
            mo11119e();
        } else if (this.f1595i) {
            mo11117d();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f1595i = true;
        this.f1598l = 0;
        if (this.f1597k) {
            mo11117d();
        }
    }

    public void stop() {
        this.f1595i = false;
        mo11119e();
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.f1603q;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public C1282c(C1283a aVar) {
        this.f1593g = aVar;
    }
}
