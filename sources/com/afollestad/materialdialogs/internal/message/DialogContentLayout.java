package com.afollestad.materialdialogs.internal.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import com.segment.analytics.integrations.BasePayload;
import kotlin.Metadata;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6774o;
import p298d.p299a.C6736l;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u00102\u001a\u000201\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001d\u00100\u001a\u00020\u00028B@\u0002X\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00067"}, mo24462d2 = {"Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "Landroid/widget/FrameLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "Ld/r;", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "i", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "getRecyclerView", "()Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "setRecyclerView", "(Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;)V", "recyclerView", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "h", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "getScrollView", "()Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "setScrollView", "(Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;)V", "scrollView", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "rootLayout", "Landroid/view/View;", "j", "Landroid/view/View;", "getCustomView", "()Landroid/view/View;", "setCustomView", "(Landroid/view/View;)V", "customView", "g", "Ld/f;", "getFrameHorizontalMargin", "()I", "frameHorizontalMargin", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, mo24463k = 1, mo24464mv = {1, 4, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogContentLayout extends FrameLayout {

    /* renamed from: k */
    public static final /* synthetic */ C6736l[] f10692k = {C6902w.m12462c(new C6896q(C6902w.m12460a(DialogContentLayout.class), "frameHorizontalMargin", "getFrameHorizontalMargin()I"))};

    /* renamed from: g */
    public final C6764f f10693g = C5266a.m9890U2(new C5311a(this));

    /* renamed from: h */
    public DialogScrollView f10694h;

    /* renamed from: i */
    public DialogRecyclerView f10695i;

    /* renamed from: j */
    public View f10696j;

    /* renamed from: com.afollestad.materialdialogs.internal.message.DialogContentLayout$a */
    public static final class C5311a extends C6890k implements C6851a<Integer> {

        /* renamed from: g */
        public final /* synthetic */ DialogContentLayout f10697g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5311a(DialogContentLayout dialogContentLayout) {
            super(0);
            this.f10697g = dialogContentLayout;
        }

        public Object invoke() {
            return Integer.valueOf(this.f10697g.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_horizontal));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
    }

    private final int getFrameHorizontalMargin() {
        C6764f fVar = this.f10693g;
        C6736l lVar = f10692k[0];
        return ((Number) fVar.getValue()).intValue();
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new C6774o("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    public final View getCustomView() {
        return this.f10696j;
    }

    public final DialogRecyclerView getRecyclerView() {
        return this.f10695i;
    }

    public final DialogScrollView getScrollView() {
        return this.f10694h;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            C6888i.m12435b(childAt, "currentChild");
            int measuredHeight = childAt.getMeasuredHeight() + i6;
            boolean a = C6888i.m12434a(childAt, this.f10696j);
            childAt.layout(0, i6, getMeasuredWidth(), measuredHeight);
            i5++;
            i6 = measuredHeight;
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        DialogScrollView dialogScrollView = this.f10694h;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        }
        DialogScrollView dialogScrollView2 = this.f10694h;
        int measuredHeight = dialogScrollView2 != null ? dialogScrollView2.getMeasuredHeight() : 0;
        int i3 = size2 - measuredHeight;
        int childCount = this.f10694h != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, measuredHeight);
            return;
        }
        int i4 = i3 / childCount;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt = getChildAt(i5);
            C6888i.m12435b(childAt, "currentChild");
            int id = childAt.getId();
            DialogScrollView dialogScrollView3 = this.f10694h;
            if (dialogScrollView3 == null || id != dialogScrollView3.getId()) {
                boolean a = C6888i.m12434a(childAt, this.f10696j);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
                measuredHeight = childAt.getMeasuredHeight() + measuredHeight;
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setCustomView(View view) {
        this.f10696j = view;
    }

    public final void setRecyclerView(DialogRecyclerView dialogRecyclerView) {
        this.f10695i = dialogRecyclerView;
    }

    public final void setScrollView(DialogScrollView dialogScrollView) {
        this.f10694h = dialogScrollView;
    }
}
