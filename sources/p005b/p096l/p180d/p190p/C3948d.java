package p005b.p096l.p180d.p190p;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: b.l.d.p.d */
public final class C3948d<T> {

    /* renamed from: a */
    public final Set<Class<? super T>> f7228a;

    /* renamed from: b */
    public final Set<C3967r> f7229b;

    /* renamed from: c */
    public final int f7230c;

    /* renamed from: d */
    public final int f7231d;

    /* renamed from: e */
    public final C3955g<T> f7232e;

    /* renamed from: f */
    public final Set<Class<?>> f7233f;

    /* renamed from: b.l.d.p.d$b */
    public static class C3950b<T> {

        /* renamed from: a */
        public final Set<Class<? super T>> f7234a;

        /* renamed from: b */
        public final Set<C3967r> f7235b = new HashSet();

        /* renamed from: c */
        public int f7236c;

        /* renamed from: d */
        public int f7237d;

        /* renamed from: e */
        public C3955g<T> f7238e;

        /* renamed from: f */
        public Set<Class<?>> f7239f;

        public C3950b(Class cls, Class[] clsArr, C3949a aVar) {
            HashSet hashSet = new HashSet();
            this.f7234a = hashSet;
            this.f7236c = 0;
            this.f7237d = 0;
            this.f7239f = new HashSet();
            Objects.requireNonNull(cls, "Null interface");
            hashSet.add(cls);
            for (Class requireNonNull : clsArr) {
                Objects.requireNonNull(requireNonNull, "Null interface");
            }
            Collections.addAll(this.f7234a, clsArr);
        }

        /* renamed from: a */
        public C3950b<T> mo15461a(C3967r rVar) {
            if (!this.f7234a.contains(rVar.f7268a)) {
                this.f7235b.add(rVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C3948d<T> mo15462b() {
            if (this.f7238e != null) {
                return new C3948d(new HashSet(this.f7234a), new HashSet(this.f7235b), this.f7236c, this.f7237d, this.f7238e, this.f7239f, (C3949a) null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        /* renamed from: c */
        public C3950b<T> mo15463c(C3955g<T> gVar) {
            this.f7238e = gVar;
            return this;
        }

        /* renamed from: d */
        public final C3950b<T> mo15464d(int i) {
            if (this.f7236c == 0) {
                this.f7236c = i;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public C3948d(Set set, Set set2, int i, int i2, C3955g gVar, Set set3, C3949a aVar) {
        this.f7228a = Collections.unmodifiableSet(set);
        this.f7229b = Collections.unmodifiableSet(set2);
        this.f7230c = i;
        this.f7231d = i2;
        this.f7232e = gVar;
        this.f7233f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> C3950b<T> m7321a(Class<T> cls) {
        return new C3950b<>(cls, new Class[0], (C3949a) null);
    }

    @SafeVarargs
    /* renamed from: c */
    public static <T> C3948d<T> m7322c(T t, Class<T> cls, Class<? super T>... clsArr) {
        C3950b bVar = new C3950b(cls, clsArr, (C3949a) null);
        bVar.mo15463c(new C3944b(t));
        return bVar.mo15462b();
    }

    /* renamed from: b */
    public boolean mo15459b() {
        return this.f7231d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f7228a.toArray()) + ">{" + this.f7230c + ", type=" + this.f7231d + ", deps=" + Arrays.toString(this.f7229b.toArray()) + "}";
    }
}
