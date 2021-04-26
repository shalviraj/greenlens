package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0033Px;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import kotlin.Metadata;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p414b0.C7668h;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\r\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a(\u0010\u0013\u001a\u00020\n*\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0011H\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a.\u0010\u0016\u001a\u00020\n*\u00020\u00002\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0015H\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001e\u0010\u001d\u001a\u00020\n*\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u0001H\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a<\u0010#\u001a\u00020\n*\u00020\u001b2\b\b\u0003\u0010\u001f\u001a\u00020\u00012\b\b\u0003\u0010 \u001a\u00020\u00012\b\b\u0003\u0010!\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u0001H\b¢\u0006\u0004\b#\u0010$\u001a<\u0010'\u001a\u00020\n*\u00020\u001b2\b\b\u0003\u0010%\u001a\u00020\u00012\b\b\u0003\u0010 \u001a\u00020\u00012\b\b\u0003\u0010&\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u0001H\b¢\u0006\u0004\b'\u0010$\"\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030(*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0018\u0010\u001c\u001a\u00020\u0001*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, mo24462d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "get", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "view", "", "contains", "(Landroid/view/ViewGroup;Landroid/view/View;)Z", "Ld/r;", "plusAssign", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "minusAssign", "isEmpty", "(Landroid/view/ViewGroup;)Z", "isNotEmpty", "Lkotlin/Function1;", "action", "forEach", "(Landroid/view/ViewGroup;Ld/x/b/l;)V", "Lkotlin/Function2;", "forEachIndexed", "(Landroid/view/ViewGroup;Ld/x/b/p;)V", "", "iterator", "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "Landroid/view/ViewGroup$MarginLayoutParams;", "size", "setMargins", "(Landroid/view/ViewGroup$MarginLayoutParams;I)V", "left", "top", "right", "bottom", "updateMargins", "(Landroid/view/ViewGroup$MarginLayoutParams;IIII)V", "start", "end", "updateMarginsRelative", "Ld/b0/h;", "getChildren", "(Landroid/view/ViewGroup;)Ld/b0/h;", "children", "getSize", "(Landroid/view/ViewGroup;)I", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class ViewGroupKt {
    public static final boolean contains(ViewGroup viewGroup, View view) {
        C6888i.m12439f(viewGroup, "$this$contains");
        C6888i.m12439f(view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(ViewGroup viewGroup, C6862l<? super View, C6777r> lVar) {
        C6888i.m12439f(viewGroup, "$this$forEach");
        C6888i.m12439f(lVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C6888i.m12435b(childAt, "getChildAt(index)");
            lVar.invoke(childAt);
        }
    }

    public static final void forEachIndexed(ViewGroup viewGroup, C6866p<? super Integer, ? super View, C6777r> pVar) {
        C6888i.m12439f(viewGroup, "$this$forEachIndexed");
        C6888i.m12439f(pVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Integer valueOf = Integer.valueOf(i);
            View childAt = viewGroup.getChildAt(i);
            C6888i.m12435b(childAt, "getChildAt(index)");
            pVar.invoke(valueOf, childAt);
        }
    }

    public static final View get(ViewGroup viewGroup, int i) {
        C6888i.m12439f(viewGroup, "$this$get");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder v = C0843a.m461v("Index: ", i, ", Size: ");
        v.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(v.toString());
    }

    public static final C7668h<View> getChildren(ViewGroup viewGroup) {
        C6888i.m12439f(viewGroup, "$this$children");
        return new ViewGroupKt$children$1(viewGroup);
    }

    public static final int getSize(ViewGroup viewGroup) {
        C6888i.m12439f(viewGroup, "$this$size");
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup viewGroup) {
        C6888i.m12439f(viewGroup, "$this$isEmpty");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(ViewGroup viewGroup) {
        C6888i.m12439f(viewGroup, "$this$isNotEmpty");
        return viewGroup.getChildCount() != 0;
    }

    public static final Iterator<View> iterator(ViewGroup viewGroup) {
        C6888i.m12439f(viewGroup, "$this$iterator");
        return new ViewGroupKt$iterator$1(viewGroup);
    }

    public static final void minusAssign(ViewGroup viewGroup, View view) {
        C6888i.m12439f(viewGroup, "$this$minusAssign");
        C6888i.m12439f(view, "view");
        viewGroup.removeView(view);
    }

    public static final void plusAssign(ViewGroup viewGroup, View view) {
        C6888i.m12439f(viewGroup, "$this$plusAssign");
        C6888i.m12439f(view, "view");
        viewGroup.addView(view);
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @C0033Px int i) {
        C6888i.m12439f(marginLayoutParams, "$this$setMargins");
        marginLayoutParams.setMargins(i, i, i, i);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @C0033Px int i, @C0033Px int i2, @C0033Px int i3, @C0033Px int i4) {
        C6888i.m12439f(marginLayoutParams, "$this$updateMargins");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        C6888i.m12439f(marginLayoutParams, "$this$updateMargins");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    @RequiresApi(17)
    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams marginLayoutParams, @C0033Px int i, @C0033Px int i2, @C0033Px int i3, @C0033Px int i4) {
        C6888i.m12439f(marginLayoutParams, "$this$updateMarginsRelative");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        C6888i.m12439f(marginLayoutParams, "$this$updateMarginsRelative");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
