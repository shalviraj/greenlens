package p298d.p334t;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import p005b.p280p.p281a.p282a0.p283a.C5057a;
import p005b.p280p.p281a.p282a0.p283a.C5061c;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6734k;
import p298d.p344x.p346c.p347a0.C6877c;

/* renamed from: d.t.c */
public abstract class C6785c<K, V> extends AbstractMap<K, V> implements Map<K, V>, C6877c {
    public final Set<Map.Entry<K, V>> entrySet() {
        C5057a.C5059b bVar = (C5057a.C5059b) this;
        List<C6734k> list = bVar.f9775g;
        ArrayList arrayList = new ArrayList(C5266a.m9892V(list, 10));
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new AbstractMap.SimpleEntry((C6734k) next, bVar.f9776h[i]));
                i = i2;
            } else {
                C6790h.m12333T();
                throw null;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            Object value = ((AbstractMap.SimpleEntry) next2).getValue();
            Class<Metadata> cls = C5061c.f9777a;
            if (value != C5061c.f9778b) {
                linkedHashSet.add(next2);
            }
        }
        return linkedHashSet;
    }
}
