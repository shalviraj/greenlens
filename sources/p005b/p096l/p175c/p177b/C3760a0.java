package p005b.p096l.p175c.p177b;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: b.l.c.b.a0 */
public abstract class C3760a0<E> extends AbstractSet<E> {
    public boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof C3792o) {
            collection = ((C3792o) collection).mo15163c();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= size()) {
            for (Object remove : collection) {
                z |= remove(remove);
            }
        } else {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
