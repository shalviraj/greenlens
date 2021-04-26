package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\b*\u00020\u0007H\n¢\u0006\u0004\b\u0002\u0010\t\u001a\u0014\u0010\u0004\u001a\u00020\b*\u00020\u0007H\n¢\u0006\u0004\b\u0004\u0010\t\u001a\u0014\u0010\u0005\u001a\u00020\b*\u00020\u0007H\n¢\u0006\u0004\b\u0005\u0010\t\u001a\u0014\u0010\u0006\u001a\u00020\b*\u00020\u0007H\n¢\u0006\u0004\b\u0006\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\n¢\u0006\u0004\b\u000b\u0010\r\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0001H\n¢\u0006\u0004\b\u000b\u0010\u000f\u001a\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\u0010\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0011H\n¢\u0006\u0004\b\u000b\u0010\u0012\u001a\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0013H\n¢\u0006\u0004\b\u000b\u0010\u0014\u001a\u001c\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001c\u0010\u0016\u001a\u00020\u0015*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\n¢\u0006\u0004\b\u0016\u0010\u0018\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0016\u0010\u000f\u001a\u001c\u0010\u0016\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\bH\n¢\u0006\u0004\b\u0016\u0010\u0010\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0011H\n¢\u0006\u0004\b\u0016\u0010\u0012\u001a\u001c\u0010\u0016\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0013H\n¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001c\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0001H\n¢\u0006\u0004\b\u001a\u0010\u000f\u001a\u001c\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0001H\n¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\bH\n¢\u0006\u0004\b\u001a\u0010\u0010\u001a\u001c\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\f¢\u0006\u0004\b\u001c\u0010\f\u001a\u001c\u0010\u001c\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\f¢\u0006\u0004\b\u001c\u0010\r\u001a\u001c\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\f¢\u0006\u0004\b\u001d\u0010\f\u001a\u001c\u0010\u001d\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\f¢\u0006\u0004\b\u001d\u0010\r\u001a\u001c\u0010\u001e\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\f¢\u0006\u0004\b\u001e\u0010\u0017\u001a\u001c\u0010\u001e\u001a\u00020\u0015*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\f¢\u0006\u0004\b\u001e\u0010\u0018\u001a\u001c\u0010!\u001a\u00020 *\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0011H\n¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010!\u001a\u00020 *\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0013H\n¢\u0006\u0004\b!\u0010#\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b$\u0010%\u001a\u0014\u0010&\u001a\u00020\u0000*\u00020\u0007H\b¢\u0006\u0004\b&\u0010'\u001a\u0014\u0010(\u001a\u00020\u0015*\u00020\u0000H\b¢\u0006\u0004\b(\u0010)\u001a\u0014\u0010(\u001a\u00020\u0015*\u00020\u0007H\b¢\u0006\u0004\b(\u0010*\u001a\u001c\u0010-\u001a\u00020\u0007*\u00020\u00072\u0006\u0010,\u001a\u00020+H\b¢\u0006\u0004\b-\u0010.¨\u0006/"}, mo24462d2 = {"Landroid/graphics/Rect;", "", "component1", "(Landroid/graphics/Rect;)I", "component2", "component3", "component4", "Landroid/graphics/RectF;", "", "(Landroid/graphics/RectF;)F", "r", "plus", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/graphics/Rect;", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/RectF;", "xy", "(Landroid/graphics/Rect;I)Landroid/graphics/Rect;", "(Landroid/graphics/RectF;F)Landroid/graphics/RectF;", "Landroid/graphics/Point;", "(Landroid/graphics/Rect;Landroid/graphics/Point;)Landroid/graphics/Rect;", "Landroid/graphics/PointF;", "(Landroid/graphics/RectF;Landroid/graphics/PointF;)Landroid/graphics/RectF;", "Landroid/graphics/Region;", "minus", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/graphics/Region;", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/Region;", "factor", "times", "(Landroid/graphics/RectF;I)Landroid/graphics/RectF;", "or", "and", "xor", "p", "", "contains", "(Landroid/graphics/Rect;Landroid/graphics/Point;)Z", "(Landroid/graphics/RectF;Landroid/graphics/PointF;)Z", "toRectF", "(Landroid/graphics/Rect;)Landroid/graphics/RectF;", "toRect", "(Landroid/graphics/RectF;)Landroid/graphics/Rect;", "toRegion", "(Landroid/graphics/Rect;)Landroid/graphics/Region;", "(Landroid/graphics/RectF;)Landroid/graphics/Region;", "Landroid/graphics/Matrix;", "m", "transform", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;)Landroid/graphics/RectF;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class RectKt {
    @SuppressLint({"CheckResult"})
    public static final Rect and(Rect rect, Rect rect2) {
        C6888i.m12439f(rect, "$this$and");
        C6888i.m12439f(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    @SuppressLint({"CheckResult"})
    public static final RectF and(RectF rectF, RectF rectF2) {
        C6888i.m12439f(rectF, "$this$and");
        C6888i.m12439f(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final float component1(RectF rectF) {
        C6888i.m12439f(rectF, "$this$component1");
        return rectF.left;
    }

    public static final int component1(Rect rect) {
        C6888i.m12439f(rect, "$this$component1");
        return rect.left;
    }

    public static final float component2(RectF rectF) {
        C6888i.m12439f(rectF, "$this$component2");
        return rectF.top;
    }

    public static final int component2(Rect rect) {
        C6888i.m12439f(rect, "$this$component2");
        return rect.top;
    }

    public static final float component3(RectF rectF) {
        C6888i.m12439f(rectF, "$this$component3");
        return rectF.right;
    }

    public static final int component3(Rect rect) {
        C6888i.m12439f(rect, "$this$component3");
        return rect.right;
    }

    public static final float component4(RectF rectF) {
        C6888i.m12439f(rectF, "$this$component4");
        return rectF.bottom;
    }

    public static final int component4(Rect rect) {
        C6888i.m12439f(rect, "$this$component4");
        return rect.bottom;
    }

    public static final boolean contains(Rect rect, Point point) {
        C6888i.m12439f(rect, "$this$contains");
        C6888i.m12439f(point, "p");
        return rect.contains(point.x, point.y);
    }

    public static final boolean contains(RectF rectF, PointF pointF) {
        C6888i.m12439f(rectF, "$this$contains");
        C6888i.m12439f(pointF, "p");
        return rectF.contains(pointF.x, pointF.y);
    }

    public static final Rect minus(Rect rect, int i) {
        C6888i.m12439f(rect, "$this$minus");
        Rect rect2 = new Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    public static final Rect minus(Rect rect, Point point) {
        C6888i.m12439f(rect, "$this$minus");
        C6888i.m12439f(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    public static final RectF minus(RectF rectF, float f) {
        C6888i.m12439f(rectF, "$this$minus");
        RectF rectF2 = new RectF(rectF);
        float f2 = -f;
        rectF2.offset(f2, f2);
        return rectF2;
    }

    public static final RectF minus(RectF rectF, PointF pointF) {
        C6888i.m12439f(rectF, "$this$minus");
        C6888i.m12439f(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    public static final Region minus(Rect rect, Rect rect2) {
        C6888i.m12439f(rect, "$this$minus");
        C6888i.m12439f(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final Region minus(RectF rectF, RectF rectF2) {
        C6888i.m12439f(rectF, "$this$minus");
        C6888i.m12439f(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: or */
    public static final Rect m36or(Rect rect, Rect rect2) {
        C6888i.m12439f(rect, "$this$or");
        C6888i.m12439f(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    /* renamed from: or */
    public static final RectF m37or(RectF rectF, RectF rectF2) {
        C6888i.m12439f(rectF, "$this$or");
        C6888i.m12439f(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final Rect plus(Rect rect, int i) {
        C6888i.m12439f(rect, "$this$plus");
        Rect rect2 = new Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    public static final Rect plus(Rect rect, Point point) {
        C6888i.m12439f(rect, "$this$plus");
        C6888i.m12439f(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    public static final Rect plus(Rect rect, Rect rect2) {
        C6888i.m12439f(rect, "$this$plus");
        C6888i.m12439f(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final RectF plus(RectF rectF, float f) {
        C6888i.m12439f(rectF, "$this$plus");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f, f);
        return rectF2;
    }

    public static final RectF plus(RectF rectF, PointF pointF) {
        C6888i.m12439f(rectF, "$this$plus");
        C6888i.m12439f(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    public static final RectF plus(RectF rectF, RectF rectF2) {
        C6888i.m12439f(rectF, "$this$plus");
        C6888i.m12439f(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final Rect times(Rect rect, int i) {
        C6888i.m12439f(rect, "$this$times");
        Rect rect2 = new Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    public static final RectF times(RectF rectF, float f) {
        C6888i.m12439f(rectF, "$this$times");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    public static final RectF times(RectF rectF, int i) {
        C6888i.m12439f(rectF, "$this$times");
        float f = (float) i;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    public static final Rect toRect(RectF rectF) {
        C6888i.m12439f(rectF, "$this$toRect");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public static final RectF toRectF(Rect rect) {
        C6888i.m12439f(rect, "$this$toRectF");
        return new RectF(rect);
    }

    public static final Region toRegion(Rect rect) {
        C6888i.m12439f(rect, "$this$toRegion");
        return new Region(rect);
    }

    public static final Region toRegion(RectF rectF) {
        C6888i.m12439f(rectF, "$this$toRegion");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    public static final RectF transform(RectF rectF, Matrix matrix) {
        C6888i.m12439f(rectF, "$this$transform");
        C6888i.m12439f(matrix, "m");
        matrix.mapRect(rectF);
        return rectF;
    }

    public static final Region xor(Rect rect, Rect rect2) {
        C6888i.m12439f(rect, "$this$xor");
        C6888i.m12439f(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final Region xor(RectF rectF, RectF rectF2) {
        C6888i.m12439f(rectF, "$this$xor");
        C6888i.m12439f(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }
}
