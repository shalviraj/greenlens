package androidx.core.util;

import android.util.Range;
import kotlin.Metadata;
import p298d.p333a0.C6755a;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u001e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00008V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, mo24462d2 = {"androidx/core/util/RangeKt$toClosedRange$1", "Ld/a0/a;", "kotlin.jvm.PlatformType", "getStart", "()Ljava/lang/Comparable;", "start", "getEndInclusive", "endInclusive", "core-ktx_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class RangeKt$toClosedRange$1 implements C6755a<T> {
    public final /* synthetic */ Range $this_toClosedRange;

    public RangeKt$toClosedRange$1(Range<T> range) {
        this.$this_toClosedRange = range;
    }

    public boolean contains(T t) {
        C6888i.m12439f(t, "value");
        C6888i.m12438e(t, "value");
        return t.compareTo(getStart()) >= 0 && t.compareTo(getEndInclusive()) <= 0;
    }

    public T getEndInclusive() {
        return this.$this_toClosedRange.getUpper();
    }

    public T getStart() {
        return this.$this_toClosedRange.getLower();
    }

    public boolean isEmpty() {
        return getStart().compareTo(getEndInclusive()) > 0;
    }
}
