package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import p005b.p025b.p026a.p029f.C0830a;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0004R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, mo24462d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "Landroid/widget/ScrollView;", "Ld/r;", "onAttachedToWindow", "()V", "", "left", "top", "oldl", "oldt", "onScrollChanged", "(IIII)V", "a", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "g", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootView", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "setRootView", "(Lcom/afollestad/materialdialogs/internal/main/DialogLayout;)V", "rootView", "", "b", "()Z", "isScrollable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, mo24463k = 1, mo24464mv = {1, 4, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogScrollView extends ScrollView {

    /* renamed from: g */
    public DialogLayout f10683g;

    /* renamed from: com.afollestad.materialdialogs.internal.main.DialogScrollView$a */
    public static final class C5310a extends C6890k implements C6862l<DialogScrollView, C6777r> {

        /* renamed from: g */
        public static final C5310a f10684g = new C5310a();

        public C5310a() {
            super(1);
        }

        public Object invoke(Object obj) {
            DialogScrollView dialogScrollView = (DialogScrollView) obj;
            C6888i.m12439f(dialogScrollView, "$receiver");
            dialogScrollView.mo17339a();
            dialogScrollView.setOverScrollMode((dialogScrollView.getChildCount() == 0 || dialogScrollView.getMeasuredHeight() == 0 || !dialogScrollView.mo17340b()) ? 2 : 1);
            return C6777r.f13694a;
        }
    }

    public DialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo17339a() {
        boolean z = false;
        if (getChildCount() == 0 || getMeasuredHeight() == 0 || !mo17340b()) {
            DialogLayout dialogLayout = this.f10683g;
            if (dialogLayout != null) {
                dialogLayout.mo17313b(false, false);
                return;
            }
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        C6888i.m12435b(childAt, "view");
        int bottom = childAt.getBottom() - (getScrollY() + getMeasuredHeight());
        DialogLayout dialogLayout2 = this.f10683g;
        if (dialogLayout2 != null) {
            boolean z2 = getScrollY() > 0;
            if (bottom > 0) {
                z = true;
            }
            dialogLayout2.mo17313b(z2, z);
        }
    }

    /* renamed from: b */
    public final boolean mo17340b() {
        View childAt = getChildAt(0);
        C6888i.m12435b(childAt, "getChildAt(0)");
        return childAt.getMeasuredHeight() > getHeight();
    }

    public final DialogLayout getRootView() {
        return this.f10683g;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5310a aVar = C5310a.f10684g;
        C6888i.m12439f(this, "$this$waitForWidth");
        C6888i.m12439f(aVar, "block");
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new C0830a(this, aVar));
        } else {
            aVar.invoke(this);
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        mo17339a();
    }

    public final void setRootView(DialogLayout dialogLayout) {
        this.f10683g = dialogLayout;
    }
}
