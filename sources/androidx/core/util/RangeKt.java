package androidx.core.util;

import android.util.Range;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import p298d.p333a0.C6755a;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\f¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0007\u0010\n\u001a>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\f¢\u0006\u0004\b\u000b\u0010\n\u001a/\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo24462d2 = {"", "T", "that", "Landroid/util/Range;", "rangeTo", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "value", "plus", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "other", "(Landroid/util/Range;Landroid/util/Range;)Landroid/util/Range;", "and", "Ld/a0/a;", "toClosedRange", "(Landroid/util/Range;)Ld/a0/a;", "toRange", "(Ld/a0/a;)Landroid/util/Range;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class RangeKt {
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        C6888i.m12439f(range, "$this$and");
        C6888i.m12439f(range2, "other");
        Range<T> intersect = range.intersect(range2);
        C6888i.m12435b(intersect, "intersect(other)");
        return intersect;
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        C6888i.m12439f(range, "$this$plus");
        C6888i.m12439f(range2, "other");
        Range<T> extend = range.extend(range2);
        C6888i.m12435b(extend, "extend(other)");
        return extend;
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t) {
        C6888i.m12439f(range, "$this$plus");
        C6888i.m12439f(t, "value");
        Range<T> extend = range.extend(t);
        C6888i.m12435b(extend, "extend(value)");
        return extend;
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t, T t2) {
        C6888i.m12439f(t, "$this$rangeTo");
        C6888i.m12439f(t2, "that");
        return new Range<>(t, t2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> C6755a<T> toClosedRange(Range<T> range) {
        C6888i.m12439f(range, "$this$toClosedRange");
        return new RangeKt$toClosedRange$1(range);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(C6755a<T> aVar) {
        C6888i.m12439f(aVar, "$this$toRange");
        return new Range<>(aVar.getStart(), aVar.getEndInclusive());
    }
}
