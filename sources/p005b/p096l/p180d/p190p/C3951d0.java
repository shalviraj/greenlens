package p005b.p096l.p180d.p190p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p005b.p096l.p180d.p211t.C4221c;
import p005b.p096l.p180d.p215w.C4284b;

/* renamed from: b.l.d.p.d0 */
public final class C3951d0 extends C3942a {

    /* renamed from: a */
    public final Set<Class<?>> f7240a;

    /* renamed from: b */
    public final Set<Class<?>> f7241b;

    /* renamed from: c */
    public final Set<Class<?>> f7242c;

    /* renamed from: d */
    public final Set<Class<?>> f7243d;

    /* renamed from: e */
    public final Set<Class<?>> f7244e;

    /* renamed from: f */
    public final C3953e f7245f;

    /* renamed from: b.l.d.p.d0$a */
    public static class C3952a implements C4221c {

        /* renamed from: a */
        public final C4221c f7246a;

        public C3952a(Set<Class<?>> set, C4221c cVar) {
            this.f7246a = cVar;
        }
    }

    public C3951d0(C3948d<?> dVar, C3953e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C3967r next : dVar.f7229b) {
            int i = next.f7270c;
            boolean z = true;
            if (!(i == 0)) {
                if (i != 2 ? false : z) {
                    hashSet3.add(next.f7268a);
                } else if (next.mo15477a()) {
                    hashSet5.add(next.f7268a);
                } else {
                    hashSet2.add(next.f7268a);
                }
            } else if (next.mo15477a()) {
                hashSet4.add(next.f7268a);
            } else {
                hashSet.add(next.f7268a);
            }
        }
        if (!dVar.f7233f.isEmpty()) {
            hashSet.add(C4221c.class);
        }
        this.f7240a = Collections.unmodifiableSet(hashSet);
        this.f7241b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f7242c = Collections.unmodifiableSet(hashSet4);
        this.f7243d = Collections.unmodifiableSet(hashSet5);
        this.f7244e = dVar.f7233f;
        this.f7245f = eVar;
    }

    /* renamed from: a */
    public <T> T mo15457a(Class<T> cls) {
        if (this.f7240a.contains(cls)) {
            T a = this.f7245f.mo15457a(cls);
            return !cls.equals(C4221c.class) ? a : new C3952a(this.f7244e, (C4221c) a);
        }
        throw new C3969t(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> Set<T> mo15458b(Class<T> cls) {
        if (this.f7242c.contains(cls)) {
            return this.f7245f.mo15458b(cls);
        }
        throw new C3969t(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> C4284b<T> mo15465c(Class<T> cls) {
        if (this.f7241b.contains(cls)) {
            return this.f7245f.mo15465c(cls);
        }
        throw new C3969t(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> C4284b<Set<T>> mo15466d(Class<T> cls) {
        if (this.f7243d.contains(cls)) {
            return this.f7245f.mo15466d(cls);
        }
        throw new C3969t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }
}
