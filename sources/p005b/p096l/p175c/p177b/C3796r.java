package p005b.p096l.p175c.p177b;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Collection;

/* renamed from: b.l.c.b.r */
public abstract class C3796r<E> extends C3760a0<E> {
    public void clear() {
        mo15174d().clear();
    }

    public boolean contains(Object obj) {
        return mo15174d().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return mo15174d().containsAll(collection);
    }

    /* renamed from: d */
    public abstract C3792o<E> mo15174d();

    public boolean isEmpty() {
        return mo15174d().isEmpty();
    }

    public boolean remove(Object obj) {
        return mo15174d().mo15145k(obj, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) > 0;
    }

    public int size() {
        return mo15174d().entrySet().size();
    }
}
