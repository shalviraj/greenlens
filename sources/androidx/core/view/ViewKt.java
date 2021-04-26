package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0033Px;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import p298d.C6774o;
import p298d.C6777r;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a*\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0006\u0010\u0005\u001a*\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\n\u0010\u0005\u001a*\u0010\u000b\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u000b\u0010\u0005\u001a<\u0010\u0011\u001a\u00020\u0002*\u00020\u00002\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\f2\b\b\u0003\u0010\u0010\u001a\u00020\fH\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\b\b\u0003\u0010\u0014\u001a\u00020\f2\b\b\u0003\u0010\u0010\u001a\u00020\fH\b¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u001e\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\fH\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a,\u0010\u001d\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a,\u0010\u001f\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\b¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u001b\u0010#\u001a\u00020\"*\u00020\u00002\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$\u001a(\u0010'\u001a\u00020\u0002*\u00020\u00002\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b'\u0010\u0005\u001a4\u0010'\u001a\u00020\u0002\"\n\b\u0000\u0010(\u0018\u0001*\u00020%*\u00020\u00002\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b)\u0010\u0005\"\u0018\u0010,\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010+\"*\u0010/\u001a\u00020-*\u00020\u00002\u0006\u0010.\u001a\u00020-8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102\"\u0018\u00104\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b3\u0010+\"*\u00105\u001a\u00020-*\u00020\u00002\u0006\u0010.\u001a\u00020-8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b5\u00100\"\u0004\b6\u00102\"\u0018\u00108\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b7\u0010+\"\u0018\u0010:\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b9\u0010+\"*\u0010;\u001a\u00020-*\u00020\u00002\u0006\u0010.\u001a\u00020-8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b;\u00100\"\u0004\b<\u00102\"\u0018\u0010>\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010+\"\u0018\u0010@\u001a\u00020\f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010+¨\u0006A"}, mo24462d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Ld/r;", "action", "doOnNextLayout", "(Landroid/view/View;Ld/x/b/l;)V", "doOnLayout", "Landroidx/core/view/OneShotPreDrawListener;", "doOnPreDraw", "(Landroid/view/View;Ld/x/b/l;)Landroidx/core/view/OneShotPreDrawListener;", "doOnAttach", "doOnDetach", "", "start", "top", "end", "bottom", "updatePaddingRelative", "(Landroid/view/View;IIII)V", "left", "right", "updatePadding", "size", "setPadding", "(Landroid/view/View;I)V", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "postDelayed", "(Landroid/view/View;JLd/x/b/a;)Ljava/lang/Runnable;", "postOnAnimationDelayed", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "drawToBitmap", "(Landroid/view/View;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/view/ViewGroup$LayoutParams;", "block", "updateLayoutParams", "T", "updateLayoutParamsTyped", "getMarginStart", "(Landroid/view/View;)I", "marginStart", "", "value", "isGone", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "getMarginTop", "marginTop", "isInvisible", "setInvisible", "getMarginLeft", "marginLeft", "getMarginEnd", "marginEnd", "isVisible", "setVisible", "getMarginBottom", "marginBottom", "getMarginRight", "marginRight", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class ViewKt {
    public static final void doOnAttach(View view, C6862l<? super View, C6777r> lVar) {
        C6888i.m12439f(view, "$this$doOnAttach");
        C6888i.m12439f(lVar, "action");
        if (ViewCompat.isAttachedToWindow(view)) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewKt$doOnAttach$1(view, lVar));
        }
    }

    public static final void doOnDetach(View view, C6862l<? super View, C6777r> lVar) {
        C6888i.m12439f(view, "$this$doOnDetach");
        C6888i.m12439f(lVar, "action");
        if (!ViewCompat.isAttachedToWindow(view)) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewKt$doOnDetach$1(view, lVar));
        }
    }

    public static final void doOnLayout(View view, C6862l<? super View, C6777r> lVar) {
        C6888i.m12439f(view, "$this$doOnLayout");
        C6888i.m12439f(lVar, "action");
        if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ViewKt$doOnLayout$$inlined$doOnNextLayout$1(lVar));
        } else {
            lVar.invoke(view);
        }
    }

    public static final void doOnNextLayout(View view, C6862l<? super View, C6777r> lVar) {
        C6888i.m12439f(view, "$this$doOnNextLayout");
        C6888i.m12439f(lVar, "action");
        view.addOnLayoutChangeListener(new ViewKt$doOnNextLayout$1(lVar));
    }

    public static final OneShotPreDrawListener doOnPreDraw(View view, C6862l<? super View, C6777r> lVar) {
        C6888i.m12439f(view, "$this$doOnPreDraw");
        C6888i.m12439f(lVar, "action");
        OneShotPreDrawListener add = OneShotPreDrawListener.add(view, new ViewKt$doOnPreDraw$1(view, lVar));
        C6888i.m12435b(add, "OneShotPreDrawListener.add(this) { action(this) }");
        return add;
    }

    public static final Bitmap drawToBitmap(View view, Bitmap.Config config) {
        C6888i.m12439f(view, "$this$drawToBitmap");
        C6888i.m12439f(config, "config");
        if (ViewCompat.isLaidOut(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            C6888i.m12435b(createBitmap, "Bitmap.createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-((float) view.getScrollX()), -((float) view.getScrollY()));
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final int getMarginBottom(View view) {
        C6888i.m12439f(view, "$this$marginBottom");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(View view) {
        C6888i.m12439f(view, "$this$marginEnd");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginLeft(View view) {
        C6888i.m12439f(view, "$this$marginLeft");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View view) {
        C6888i.m12439f(view, "$this$marginRight");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View view) {
        C6888i.m12439f(view, "$this$marginStart");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginTop(View view) {
        C6888i.m12439f(view, "$this$marginTop");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(View view) {
        C6888i.m12439f(view, "$this$isGone");
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(View view) {
        C6888i.m12439f(view, "$this$isInvisible");
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(View view) {
        C6888i.m12439f(view, "$this$isVisible");
        return view.getVisibility() == 0;
    }

    public static final Runnable postDelayed(View view, long j, C6851a<C6777r> aVar) {
        C6888i.m12439f(view, "$this$postDelayed");
        C6888i.m12439f(aVar, "action");
        ViewKt$postDelayed$runnable$1 viewKt$postDelayed$runnable$1 = new ViewKt$postDelayed$runnable$1(aVar);
        view.postDelayed(viewKt$postDelayed$runnable$1, j);
        return viewKt$postDelayed$runnable$1;
    }

    @RequiresApi(16)
    public static final Runnable postOnAnimationDelayed(View view, long j, C6851a<C6777r> aVar) {
        C6888i.m12439f(view, "$this$postOnAnimationDelayed");
        C6888i.m12439f(aVar, "action");
        ViewKt$postOnAnimationDelayed$runnable$1 viewKt$postOnAnimationDelayed$runnable$1 = new ViewKt$postOnAnimationDelayed$runnable$1(aVar);
        view.postOnAnimationDelayed(viewKt$postOnAnimationDelayed$runnable$1, j);
        return viewKt$postOnAnimationDelayed$runnable$1;
    }

    public static final void setGone(View view, boolean z) {
        C6888i.m12439f(view, "$this$isGone");
        view.setVisibility(z ? 8 : 0);
    }

    public static final void setInvisible(View view, boolean z) {
        C6888i.m12439f(view, "$this$isInvisible");
        view.setVisibility(z ? 4 : 0);
    }

    public static final void setPadding(View view, @C0033Px int i) {
        C6888i.m12439f(view, "$this$setPadding");
        view.setPadding(i, i, i, i);
    }

    public static final void setVisible(View view, boolean z) {
        C6888i.m12439f(view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
    }

    public static final void updateLayoutParams(View view, C6862l<? super ViewGroup.LayoutParams, C6777r> lVar) {
        C6888i.m12439f(view, "$this$updateLayoutParams");
        C6888i.m12439f(lVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            lVar.invoke(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new C6774o("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, C6862l<? super T, C6777r> lVar) {
        C6888i.m12439f(view, "$this$updateLayoutParams");
        C6888i.m12439f(lVar, "block");
        view.getLayoutParams();
        C6888i.m12442i();
        throw null;
    }

    public static final void updatePadding(View view, @C0033Px int i, @C0033Px int i2, @C0033Px int i3, @C0033Px int i4) {
        C6888i.m12439f(view, "$this$updatePadding");
        view.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        C6888i.m12439f(view, "$this$updatePadding");
        view.setPadding(i, i2, i3, i4);
    }

    @RequiresApi(17)
    public static final void updatePaddingRelative(View view, @C0033Px int i, @C0033Px int i2, @C0033Px int i3, @C0033Px int i4) {
        C6888i.m12439f(view, "$this$updatePaddingRelative");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        C6888i.m12439f(view, "$this$updatePaddingRelative");
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
