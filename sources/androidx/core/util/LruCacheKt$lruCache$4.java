package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p345b.C6868r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo24462d2 = {"androidx/core/util/LruCacheKt$lruCache$4", "Landroid/util/LruCache;", "key", "value", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Ld/r;", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "core-ktx_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class LruCacheKt$lruCache$4 extends LruCache<K, V> {
    public final /* synthetic */ C6862l $create;
    public final /* synthetic */ int $maxSize;
    public final /* synthetic */ C6868r $onEntryRemoved;
    public final /* synthetic */ C6866p $sizeOf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(C6866p pVar, C6862l lVar, C6868r rVar, int i, int i2) {
        super(i2);
        this.$sizeOf = pVar;
        this.$create = lVar;
        this.$onEntryRemoved = rVar;
        this.$maxSize = i;
    }

    public V create(K k) {
        C6888i.m12439f(k, "key");
        return this.$create.invoke(k);
    }

    public void entryRemoved(boolean z, K k, V v, V v2) {
        C6888i.m12439f(k, "key");
        C6888i.m12439f(v, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
    }

    public int sizeOf(K k, V v) {
        C6888i.m12439f(k, "key");
        C6888i.m12439f(v, "value");
        return ((Number) this.$sizeOf.invoke(k, v)).intValue();
    }
}
