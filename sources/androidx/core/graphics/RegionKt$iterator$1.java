package androidx.core.graphics;

import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.Metadata;
import p298d.p344x.p346c.p347a0.C6875a;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo24462d2 = {"androidx/core/graphics/RegionKt$iterator$1", "", "Landroid/graphics/Rect;", "", "hasNext", "()Z", "next", "()Landroid/graphics/Rect;", "Landroid/graphics/RegionIterator;", "iterator", "Landroid/graphics/RegionIterator;", "hasMore", "Z", "rect", "Landroid/graphics/Rect;", "core-ktx_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class RegionKt$iterator$1 implements Iterator<Rect>, C6875a {
    public final /* synthetic */ Region $this_iterator;
    private boolean hasMore;
    private final RegionIterator iterator;
    private final Rect rect;

    public RegionKt$iterator$1(Region region) {
        this.$this_iterator = region;
        RegionIterator regionIterator = new RegionIterator(region);
        this.iterator = regionIterator;
        Rect rect2 = new Rect();
        this.rect = rect2;
        this.hasMore = regionIterator.next(rect2);
    }

    public boolean hasNext() {
        return this.hasMore;
    }

    public Rect next() {
        if (this.hasMore) {
            Rect rect2 = new Rect(this.rect);
            this.hasMore = this.iterator.next(this.rect);
            return rect2;
        }
        throw new IndexOutOfBoundsException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
