package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\u000b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\n¢\u0006\u0004\b\u000b\u0010\n\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u000e\u0010\r\u001a\u001c\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\f¢\u0006\u0004\b\u000f\u0010\t\u001a\u001c\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\f¢\u0006\u0004\b\u000f\u0010\n\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\f¢\u0006\u0004\b\u0010\u0010\t\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\f¢\u0006\u0004\b\u0010\u0010\n\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\f¢\u0006\u0004\b\u0011\u0010\t\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\f¢\u0006\u0004\b\u0011\u0010\n\u001a(\u0010\u0015\u001a\u00020\u0013*\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0012H\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017*\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, mo24462d2 = {"Landroid/graphics/Region;", "Landroid/graphics/Point;", "p", "", "contains", "(Landroid/graphics/Region;Landroid/graphics/Point;)Z", "Landroid/graphics/Rect;", "r", "plus", "(Landroid/graphics/Region;Landroid/graphics/Rect;)Landroid/graphics/Region;", "(Landroid/graphics/Region;Landroid/graphics/Region;)Landroid/graphics/Region;", "minus", "unaryMinus", "(Landroid/graphics/Region;)Landroid/graphics/Region;", "not", "or", "and", "xor", "Lkotlin/Function1;", "Ld/r;", "action", "forEach", "(Landroid/graphics/Region;Ld/x/b/l;)V", "", "iterator", "(Landroid/graphics/Region;)Ljava/util/Iterator;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class RegionKt {
    public static final Region and(Region region, Rect rect) {
        C6888i.m12439f(region, "$this$and");
        C6888i.m12439f(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    public static final Region and(Region region, Region region2) {
        C6888i.m12439f(region, "$this$and");
        C6888i.m12439f(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final boolean contains(Region region, Point point) {
        C6888i.m12439f(region, "$this$contains");
        C6888i.m12439f(point, "p");
        return region.contains(point.x, point.y);
    }

    public static final void forEach(Region region, C6862l<? super Rect, C6777r> lVar) {
        C6888i.m12439f(region, "$this$forEach");
        C6888i.m12439f(lVar, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (regionIterator.next(rect)) {
                lVar.invoke(rect);
            } else {
                return;
            }
        }
    }

    public static final Iterator<Rect> iterator(Region region) {
        C6888i.m12439f(region, "$this$iterator");
        return new RegionKt$iterator$1(region);
    }

    public static final Region minus(Region region, Rect rect) {
        C6888i.m12439f(region, "$this$minus");
        C6888i.m12439f(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region minus(Region region, Region region2) {
        C6888i.m12439f(region, "$this$minus");
        C6888i.m12439f(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    public static final Region not(Region region) {
        C6888i.m12439f(region, "$this$not");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    /* renamed from: or */
    public static final Region m38or(Region region, Rect rect) {
        C6888i.m12439f(region, "$this$or");
        C6888i.m12439f(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    /* renamed from: or */
    public static final Region m39or(Region region, Region region2) {
        C6888i.m12439f(region, "$this$or");
        C6888i.m12439f(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    public static final Region plus(Region region, Rect rect) {
        C6888i.m12439f(region, "$this$plus");
        C6888i.m12439f(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final Region plus(Region region, Region region2) {
        C6888i.m12439f(region, "$this$plus");
        C6888i.m12439f(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    public static final Region unaryMinus(Region region) {
        C6888i.m12439f(region, "$this$unaryMinus");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region xor(Region region, Rect rect) {
        C6888i.m12439f(region, "$this$xor");
        C6888i.m12439f(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    public static final Region xor(Region region, Region region2) {
        C6888i.m12439f(region, "$this$xor");
        C6888i.m12439f(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
