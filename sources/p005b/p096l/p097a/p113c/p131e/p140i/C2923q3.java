package p005b.p096l.p097a.p113c.p131e.p140i;

import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: b.l.a.c.e.i.q3 */
public final class C2923q3 {
    @GuardedBy("SharedPreferencesLoader.class")

    /* renamed from: a */
    public static final Map<String, C2923q3> f4948a = new ArrayMap();

    /* renamed from: a */
    public static synchronized void m5103a() {
        synchronized (C2923q3.class) {
            Map<String, C2923q3> map = f4948a;
            Iterator<C2923q3> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                Objects.requireNonNull(it.next());
                throw null;
            }
        }
    }
}
