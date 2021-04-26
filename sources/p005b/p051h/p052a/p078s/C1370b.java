package p005b.p051h.p052a.p078s;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* renamed from: b.h.a.s.b */
public final class C1370b<K, V> extends ArrayMap<K, V> {

    /* renamed from: g */
    public int f1783g;

    public void clear() {
        this.f1783g = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f1783g == 0) {
            this.f1783g = super.hashCode();
        }
        return this.f1783g;
    }

    public V put(K k, V v) {
        this.f1783g = 0;
        return super.put(k, v);
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f1783g = 0;
        super.putAll(simpleArrayMap);
    }

    public V removeAt(int i) {
        this.f1783g = 0;
        return super.removeAt(i);
    }

    public V setValueAt(int i, V v) {
        this.f1783g = 0;
        return super.setValueAt(i, v);
    }
}
