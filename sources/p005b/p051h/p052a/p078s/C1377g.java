package p005b.p051h.p052a.p078s;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: b.h.a.s.g */
public class C1377g<T, Y> {

    /* renamed from: a */
    public final Map<T, Y> f1794a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public long f1795b;

    /* renamed from: c */
    public long f1796c;

    public C1377g(long j) {
        this.f1795b = j;
    }

    @Nullable
    /* renamed from: a */
    public synchronized Y mo11252a(@NonNull T t) {
        return this.f1794a.get(t);
    }

    /* renamed from: b */
    public int mo10930b(@Nullable Y y) {
        return 1;
    }

    /* renamed from: c */
    public void mo10931c(@NonNull T t, @Nullable Y y) {
    }

    @Nullable
    /* renamed from: d */
    public synchronized Y mo11253d(@NonNull T t, @Nullable Y y) {
        long b = (long) mo10930b(y);
        if (b >= this.f1795b) {
            mo10931c(t, y);
            return null;
        }
        if (y != null) {
            this.f1796c += b;
        }
        Y put = this.f1794a.put(t, y);
        if (put != null) {
            this.f1796c -= (long) mo10930b(put);
            if (!put.equals(y)) {
                mo10931c(t, put);
            }
        }
        mo11254e(this.f1795b);
        return put;
    }

    /* renamed from: e */
    public synchronized void mo11254e(long j) {
        while (this.f1796c > j) {
            Iterator<Map.Entry<T, Y>> it = this.f1794a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.f1796c -= (long) mo10930b(value);
            Object key = next.getKey();
            it.remove();
            mo10931c(key, value);
        }
    }
}
