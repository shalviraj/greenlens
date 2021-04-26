package p005b.p025b.p026a.p027e.p028a;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.segment.analytics.integrations.BasePayload;
import kotlin.Metadata;
import p005b.p025b.p026a.C0825b;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u00020\u00028\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006%"}, mo24462d2 = {"Lb/b/a/e/a/a;", "Landroid/view/ViewGroup;", "", "getDividerColor", "()I", "Landroid/graphics/Paint;", "a", "()Landroid/graphics/Paint;", "", "value", "i", "Z", "getDrawDivider", "()Z", "setDrawDivider", "(Z)V", "drawDivider", "h", "I", "getDividerHeight", "dividerHeight", "g", "Landroid/graphics/Paint;", "dividerPaint", "Lb/b/a/b;", "dialog", "Lb/b/a/b;", "getDialog", "()Lb/b/a/b;", "setDialog", "(Lb/b/a/b;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, mo24463k = 1, mo24464mv = {1, 4, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: b.b.a.e.a.a */
public abstract class C0829a extends ViewGroup {

    /* renamed from: g */
    public final Paint f655g;

    /* renamed from: h */
    public final int f656h;

    /* renamed from: i */
    public boolean f657i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0829a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
        Paint paint = new Paint();
        this.f655g = paint;
        C6888i.m12439f(this, "$this$dimenPx");
        Context context2 = getContext();
        C6888i.m12435b(context2, BasePayload.CONTEXT_KEY);
        this.f656h = context2.getResources().getDimensionPixelSize(R.dimen.md_divider_height);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.md_divider_height));
        paint.setAntiAlias(true);
    }

    private final int getDividerColor() {
        C6888i.m12446m("dialog");
        throw null;
    }

    /* renamed from: a */
    public final Paint mo10651a() {
        this.f655g.setColor(getDividerColor());
        return this.f655g;
    }

    public final C0825b getDialog() {
        C6888i.m12446m("dialog");
        throw null;
    }

    public final int getDividerHeight() {
        return this.f656h;
    }

    public final boolean getDrawDivider() {
        return this.f657i;
    }

    public final void setDialog(C0825b bVar) {
        C6888i.m12439f(bVar, "<set-?>");
    }

    public final void setDrawDivider(boolean z) {
        this.f657i = z;
        invalidate();
    }
}
