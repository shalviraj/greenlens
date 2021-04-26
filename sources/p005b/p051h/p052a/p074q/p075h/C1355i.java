package p005b.p051h.p052a.p074q.p075h;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p074q.C1340b;
import p005b.p051h.p052a.p074q.C1345g;

@Deprecated
/* renamed from: b.h.a.q.h.i */
public abstract class C1355i<T extends View, Z> extends C1347a<Z> {

    /* renamed from: g */
    public final T f1762g;

    /* renamed from: h */
    public final C1356a f1763h;

    @VisibleForTesting
    /* renamed from: b.h.a.q.h.i$a */
    public static final class C1356a {
        @VisibleForTesting
        @Nullable

        /* renamed from: d */
        public static Integer f1764d;

        /* renamed from: a */
        public final View f1765a;

        /* renamed from: b */
        public final List<C1353g> f1766b = new ArrayList();
        @Nullable

        /* renamed from: c */
        public C1357a f1767c;

        /* renamed from: b.h.a.q.h.i$a$a */
        public static final class C1357a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: g */
            public final WeakReference<C1356a> f1768g;

            public C1357a(@NonNull C1356a aVar) {
                this.f1768g = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C1356a aVar = (C1356a) this.f1768g.get();
                if (aVar == null || aVar.f1766b.isEmpty()) {
                    return true;
                }
                int d = aVar.mo11221d();
                int c = aVar.mo11220c();
                if (!aVar.mo11222e(d, c)) {
                    return true;
                }
                Iterator it = new ArrayList(aVar.f1766b).iterator();
                while (it.hasNext()) {
                    ((C1353g) it.next()).mo11196d(d, c);
                }
                aVar.mo11218a();
                return true;
            }
        }

        public C1356a(@NonNull View view) {
            this.f1765a = view;
        }

        /* renamed from: a */
        public void mo11218a() {
            ViewTreeObserver viewTreeObserver = this.f1765a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f1767c);
            }
            this.f1767c = null;
            this.f1766b.clear();
        }

        /* renamed from: b */
        public final int mo11219b(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f1765a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f1765a.getContext();
            if (f1764d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f1764d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f1764d.intValue();
        }

        /* renamed from: c */
        public final int mo11220c() {
            int paddingBottom = this.f1765a.getPaddingBottom() + this.f1765a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f1765a.getLayoutParams();
            return mo11219b(this.f1765a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        /* renamed from: d */
        public final int mo11221d() {
            int paddingRight = this.f1765a.getPaddingRight() + this.f1765a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f1765a.getLayoutParams();
            return mo11219b(this.f1765a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        /* renamed from: e */
        public final boolean mo11222e(int i, int i2) {
            if (!(i > 0 || i == Integer.MIN_VALUE)) {
                return false;
            }
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
    }

    public C1355i(@NonNull T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f1762g = t;
        this.f1763h = new C1356a(t);
    }

    @CallSuper
    /* renamed from: a */
    public void mo11210a(@NonNull C1353g gVar) {
        this.f1763h.f1766b.remove(gVar);
    }

    @Nullable
    /* renamed from: f */
    public C1340b mo11213f() {
        Object tag = this.f1762g.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof C1340b) {
            return (C1340b) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @CallSuper
    /* renamed from: h */
    public void mo11214h(@NonNull C1353g gVar) {
        C1356a aVar = this.f1763h;
        int d = aVar.mo11221d();
        int c = aVar.mo11220c();
        if (aVar.mo11222e(d, c)) {
            ((C1345g) gVar).mo11196d(d, c);
            return;
        }
        if (!aVar.f1766b.contains(gVar)) {
            aVar.f1766b.add(gVar);
        }
        if (aVar.f1767c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f1765a.getViewTreeObserver();
            C1356a.C1357a aVar2 = new C1356a.C1357a(aVar);
            aVar.f1767c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    /* renamed from: i */
    public void mo11215i(@Nullable C1340b bVar) {
        this.f1762g.setTag(R.id.glide_custom_view_target_tag, bVar);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Target for: ");
        u.append(this.f1762g);
        return u.toString();
    }
}
