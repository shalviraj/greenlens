package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p345b.C6868r;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0006\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00052\u0016\b\u0006\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00072(\b\u0006\u0010\f\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u000b0\tH\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo24462d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "Ld/r;", "onEntryRemoved", "Landroid/util/LruCache;", "lruCache", "(ILd/x/b/p;Ld/x/b/l;Ld/x/b/r;)Landroid/util/LruCache;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i, C6866p<? super K, ? super V, Integer> pVar, C6862l<? super K, ? extends V> lVar, C6868r<? super Boolean, ? super K, ? super V, ? super V, C6777r> rVar) {
        C6888i.m12439f(pVar, "sizeOf");
        C6888i.m12439f(lVar, "create");
        C6888i.m12439f(rVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(pVar, lVar, rVar, i, i);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, C6866p pVar, C6862l lVar, C6868r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = LruCacheKt$lruCache$1.INSTANCE;
        }
        C6866p pVar2 = pVar;
        if ((i2 & 4) != 0) {
            lVar = LruCacheKt$lruCache$2.INSTANCE;
        }
        C6862l lVar2 = lVar;
        if ((i2 & 8) != 0) {
            rVar = LruCacheKt$lruCache$3.INSTANCE;
        }
        C6868r rVar2 = rVar;
        C6888i.m12439f(pVar2, "sizeOf");
        C6888i.m12439f(lVar2, "create");
        C6888i.m12439f(rVar2, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(pVar2, lVar2, rVar2, i, i);
    }
}
