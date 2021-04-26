package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\b¢\u0006\u0004\b\u0003\u0010\u0004\u001aP\u0010\u0010\u001a\u00020\u000e*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a:\u0010\u0010\u001a\u00020\u000e*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\b¢\u0006\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, mo24462d2 = {"", "T", "Landroid/content/Context;", "getSystemService", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/util/AttributeSet;", "set", "", "attrs", "", "defStyleAttr", "defStyleRes", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Ld/r;", "block", "withStyledAttributes", "(Landroid/content/Context;Landroid/util/AttributeSet;[IIILd/x/b/l;)V", "resourceId", "(Landroid/content/Context;I[ILd/x/b/l;)V", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(Context context) {
        C6888i.m12439f(context, "$this$getSystemService");
        C6888i.m12442i();
        throw null;
    }

    public static final void withStyledAttributes(Context context, @StyleRes int i, int[] iArr, C6862l<? super TypedArray, C6777r> lVar) {
        C6888i.m12439f(context, "$this$withStyledAttributes");
        C6888i.m12439f(iArr, "attrs");
        C6888i.m12439f(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, @AttrRes int i, @StyleRes int i2, C6862l<? super TypedArray, C6777r> lVar) {
        C6888i.m12439f(context, "$this$withStyledAttributes");
        C6888i.m12439f(iArr, "attrs");
        C6888i.m12439f(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, C6862l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        C6888i.m12439f(context, "$this$withStyledAttributes");
        C6888i.m12439f(iArr, "attrs");
        C6888i.m12439f(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
