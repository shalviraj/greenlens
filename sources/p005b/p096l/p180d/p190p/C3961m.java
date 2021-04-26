package p005b.p096l.p180d.p190p;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.p207r.C4201a;
import p005b.p096l.p180d.p211t.C4219a;
import p005b.p096l.p180d.p211t.C4221c;
import p005b.p096l.p180d.p211t.C4222d;
import p005b.p096l.p180d.p215w.C4284b;

/* renamed from: b.l.d.p.m */
public class C3961m extends C3942a implements C4201a {

    /* renamed from: g */
    public static final /* synthetic */ int f7255g = 0;

    /* renamed from: a */
    public final Map<C3948d<?>, C4284b<?>> f7256a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, C4284b<?>> f7257b = new HashMap();

    /* renamed from: c */
    public final Map<Class<?>, C3974y<?>> f7258c = new HashMap();

    /* renamed from: d */
    public final List<C4284b<C3956h>> f7259d;

    /* renamed from: e */
    public final C3971v f7260e;

    /* renamed from: f */
    public final AtomicReference<Boolean> f7261f = new AtomicReference<>();

    public C3961m(Executor executor, Iterable iterable, Collection collection, C3962a aVar) {
        C3971v vVar = new C3971v(executor);
        this.f7260e = vVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3948d.m7322c(vVar, C3971v.class, C4222d.class, C4221c.class));
        arrayList.add(C3948d.m7322c(this, C4201a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3948d dVar = (C3948d) it.next();
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object add : iterable) {
            arrayList2.add(add);
        }
        this.f7259d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    C3956h hVar = (C3956h) ((C4284b) it2.next()).get();
                    if (hVar != null) {
                        arrayList.addAll(hVar.getComponents());
                        it2.remove();
                    }
                } catch (C3972w e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f7256a.isEmpty()) {
                C1960d.m2713G(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f7256a.keySet());
                arrayList4.addAll(arrayList);
                C1960d.m2713G(arrayList4);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C3948d dVar2 = (C3948d) it3.next();
                this.f7256a.put(dVar2, new C3973x(new C3957i(this, dVar2)));
            }
            arrayList3.addAll(mo15472g(arrayList));
            arrayList3.addAll(mo15473h());
            mo15471f();
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.f7261f.get();
        if (bool != null) {
            mo15470e(this.f7256a, bool.booleanValue());
        }
    }

    /* renamed from: c */
    public synchronized <T> C4284b<T> mo15465c(Class<T> cls) {
        Objects.requireNonNull(cls, "Null interface requested.");
        return this.f7257b.get(cls);
    }

    /* renamed from: d */
    public synchronized <T> C4284b<Set<T>> mo15466d(Class<T> cls) {
        C3974y yVar = this.f7258c.get(cls);
        if (yVar != null) {
            return yVar;
        }
        return C3960l.f7254a;
    }

    /* renamed from: e */
    public final void mo15470e(Map<C3948d<?>, C4284b<?>> map, boolean z) {
        Queue<C4219a<?>> queue;
        Set<Map.Entry> emptySet;
        for (Map.Entry next : map.entrySet()) {
            C4284b bVar = (C4284b) next.getValue();
            int i = ((C3948d) next.getKey()).f7230c;
            boolean z2 = false;
            if (!(i == 1)) {
                if (i == 2) {
                    z2 = true;
                }
                if (z2) {
                    if (!z) {
                    }
                }
            }
            bVar.get();
        }
        C3971v vVar = this.f7260e;
        synchronized (vVar) {
            queue = vVar.f7275b;
            if (queue != null) {
                vVar.f7275b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C4219a aVar : queue) {
                Objects.requireNonNull(aVar);
                synchronized (vVar) {
                    Queue<C4219a<?>> queue2 = vVar.f7275b;
                    if (queue2 != null) {
                        queue2.add(aVar);
                    } else {
                        synchronized (vVar) {
                            Map map2 = vVar.f7274a.get((Object) null);
                            emptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        }
                        for (Map.Entry entry : emptySet) {
                            ((Executor) entry.getValue()).execute(new C3970u(entry, aVar));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo15471f() {
        for (C3948d next : this.f7256a.keySet()) {
            Iterator<C3967r> it = next.f7229b.iterator();
            while (true) {
                if (it.hasNext()) {
                    C3967r next2 = it.next();
                    if (next2.mo15477a() && !this.f7258c.containsKey(next2.f7268a)) {
                        this.f7258c.put(next2.f7268a, new C3974y(Collections.emptySet()));
                    } else if (this.f7257b.containsKey(next2.f7268a)) {
                        continue;
                    } else {
                        if (next2.f7269b == 1) {
                            throw new C3975z(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.f7268a}));
                        } else if (!next2.mo15477a()) {
                            this.f7257b.put(next2.f7268a, new C3947c0(C3943a0.f7221a, C3945b0.f7223a));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final List<Runnable> mo15472g(List<C3948d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C3948d next : list) {
            if (next.mo15459b()) {
                C4284b bVar = this.f7256a.get(next);
                for (Class next2 : next.f7228a) {
                    if (!this.f7257b.containsKey(next2)) {
                        this.f7257b.put(next2, bVar);
                    } else {
                        arrayList.add(new C3958j((C3947c0) this.f7257b.get(next2), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List<Runnable> mo15473h() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f7256a.entrySet()) {
            C3948d dVar = (C3948d) next.getKey();
            if (!dVar.mo15459b()) {
                C4284b bVar = (C4284b) next.getValue();
                for (Class next2 : dVar.f7228a) {
                    if (!hashMap.containsKey(next2)) {
                        hashMap.put(next2, new HashSet());
                    }
                    ((Set) hashMap.get(next2)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f7258c.containsKey(entry.getKey())) {
                this.f7258c.put((Class) entry.getKey(), new C3974y((Set) ((Collection) entry.getValue())));
            } else {
                C3974y yVar = this.f7258c.get(entry.getKey());
                for (C4284b kVar : (Set) entry.getValue()) {
                    arrayList.add(new C3959k(yVar, kVar));
                }
            }
        }
        return arrayList;
    }
}
