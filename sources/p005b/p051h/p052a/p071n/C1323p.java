package p005b.p051h.p052a.p071n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p005b.p051h.p052a.p074q.p075h.C1354h;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.n.p */
public final class C1323p implements C1312i {

    /* renamed from: g */
    public final Set<C1354h<?>> f1677g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: d */
    public void mo10773d() {
        Iterator it = ((ArrayList) C1380j.m1472e(this.f1677g)).iterator();
        while (it.hasNext()) {
            ((C1354h) it.next()).mo10773d();
        }
    }

    /* renamed from: j */
    public void mo10774j() {
        Iterator it = ((ArrayList) C1380j.m1472e(this.f1677g)).iterator();
        while (it.hasNext()) {
            ((C1354h) it.next()).mo10774j();
        }
    }

    public void onStart() {
        Iterator it = ((ArrayList) C1380j.m1472e(this.f1677g)).iterator();
        while (it.hasNext()) {
            ((C1354h) it.next()).onStart();
        }
    }
}
