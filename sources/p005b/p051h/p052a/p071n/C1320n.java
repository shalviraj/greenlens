package p005b.p051h.p052a.p071n;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p005b.p051h.p052a.p074q.C1340b;

/* renamed from: b.h.a.n.n */
public class C1320n {

    /* renamed from: a */
    public final Set<C1340b> f1667a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final List<C1340b> f1668b = new ArrayList();

    /* renamed from: c */
    public boolean f1669c;

    /* renamed from: a */
    public boolean mo11161a(@Nullable C1340b bVar) {
        boolean z = true;
        if (bVar == null) {
            return true;
        }
        boolean remove = this.f1667a.remove(bVar);
        if (!this.f1668b.remove(bVar) && !remove) {
            z = false;
        }
        if (z) {
            bVar.clear();
        }
        return z;
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f1667a.size() + ", isPaused=" + this.f1669c + "}";
    }
}
