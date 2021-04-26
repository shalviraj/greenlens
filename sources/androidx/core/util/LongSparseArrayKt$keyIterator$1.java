package androidx.core.util;

import android.util.LongSparseArray;
import kotlin.Metadata;
import p298d.p334t.C6805w;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo24462d2 = {"androidx/core/util/LongSparseArrayKt$keyIterator$1", "Ld/t/w;", "", "hasNext", "()Z", "", "nextLong", "()J", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "core-ktx_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class LongSparseArrayKt$keyIterator$1 extends C6805w {
    public final /* synthetic */ LongSparseArray $this_keyIterator;
    private int index;

    public LongSparseArrayKt$keyIterator$1(LongSparseArray<T> longSparseArray) {
        this.$this_keyIterator = longSparseArray;
    }

    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        return this.index < this.$this_keyIterator.size();
    }

    public long nextLong() {
        LongSparseArray longSparseArray = this.$this_keyIterator;
        int i = this.index;
        this.index = i + 1;
        return longSparseArray.keyAt(i);
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
