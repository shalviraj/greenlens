package androidx.core.util;

import android.util.SparseLongArray;
import kotlin.Metadata;
import p298d.p334t.C6804v;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\r"}, mo24462d2 = {"androidx/core/util/SparseLongArrayKt$keyIterator$1", "Ld/t/v;", "", "hasNext", "()Z", "", "nextInt", "()I", "index", "I", "getIndex", "setIndex", "(I)V", "core-ktx_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class SparseLongArrayKt$keyIterator$1 extends C6804v {
    public final /* synthetic */ SparseLongArray $this_keyIterator;
    private int index;

    public SparseLongArrayKt$keyIterator$1(SparseLongArray sparseLongArray) {
        this.$this_keyIterator = sparseLongArray;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        return this.index < this.$this_keyIterator.size();
    }

    public int nextInt() {
        SparseLongArray sparseLongArray = this.$this_keyIterator;
        int i = this.index;
        this.index = i + 1;
        return sparseLongArray.keyAt(i);
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
