package p298d.p299a.p300a.p301a.p303y0.p404k;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7648n;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: d.a.a.a.y0.k.e */
public class C7417e implements C7441m {

    /* renamed from: d */
    public static final String f14829d;

    /* renamed from: e */
    public static final C7441m f14830e = new C7418a("NO_LOCKS", C7423f.f14837a, C7416d.f14828b);

    /* renamed from: a */
    public final C7439k f14831a;

    /* renamed from: b */
    public final C7423f f14832b;

    /* renamed from: c */
    public final String f14833c;

    /* renamed from: d.a.a.a.y0.k.e$a */
    public static class C7418a extends C7417e {
        public C7418a(String str, C7423f fVar, C7439k kVar) {
            super(str, fVar, kVar);
        }

        /* renamed from: l */
        public <K, V> C7433o<V> mo25027l(String str, K k) {
            return new C7433o<>(null, true);
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$b */
    public class C7419b extends C7428j<T> {

        /* renamed from: j */
        public final /* synthetic */ Object f14834j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7419b(C7417e eVar, C7417e eVar2, C6851a aVar, Object obj) {
            super(eVar2, aVar);
            this.f14834j = obj;
        }

        /* renamed from: c */
        public C7433o<T> mo25029c(boolean z) {
            return new C7433o<>(this.f14834j, false);
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$c */
    public class C7420c extends C7429k<T> {

        /* renamed from: k */
        public final /* synthetic */ C6862l f14835k;

        /* renamed from: l */
        public final /* synthetic */ C6862l f14836l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7420c(C7417e eVar, C7417e eVar2, C6851a aVar, C6862l lVar, C6862l lVar2) {
            super(eVar2, aVar);
            this.f14835k = lVar;
            this.f14836l = lVar2;
        }

        /* renamed from: a */
        public static /* synthetic */ void m13360a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i != 2 ? 2 : 3)];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: c */
        public C7433o<T> mo25029c(boolean z) {
            C6862l lVar = this.f14835k;
            if (lVar != null) {
                return new C7433o<>(lVar.invoke(Boolean.valueOf(z)), false);
            }
            C7433o<T> c = super.mo25029c(z);
            if (c != null) {
                return c;
            }
            m13360a(0);
            throw null;
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$d */
    public static class C7421d<K, V> extends C7422e<K, V> implements C7413a<K, V> {
        public C7421d(C7417e eVar, ConcurrentMap concurrentMap, C7418a aVar) {
            super(eVar, concurrentMap, (C7418a) null);
        }

        /* renamed from: a */
        public static /* synthetic */ void m13362a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: e */
        public V mo25030e(K k, C6851a<? extends V> aVar) {
            V invoke = invoke(new C7425g(k, aVar));
            if (invoke != null) {
                return invoke;
            }
            m13362a(3);
            throw null;
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$e */
    public static class C7422e<K, V> extends C7430l<C7425g<K, V>, V> implements C7414b<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7422e(C7417e eVar, ConcurrentMap concurrentMap, C7418a aVar) {
            super(eVar, concurrentMap, new C7434f());
            if (eVar == null) {
                m13364a(0);
                throw null;
            } else if (concurrentMap != null) {
            } else {
                m13364a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m13364a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$f */
    public interface C7423f {

        /* renamed from: a */
        public static final C7423f f14837a = new C7424a();

        /* renamed from: d.a.a.a.y0.k.e$f$a */
        public static class C7424a implements C7423f {
            /* renamed from: a */
            public RuntimeException mo25031a(Throwable th) {
                C6888i.m12438e(th, "e");
                throw th;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$g */
    public static class C7425g<K, V> {

        /* renamed from: a */
        public final K f14838a;

        /* renamed from: b */
        public final C6851a<? extends V> f14839b;

        public C7425g(K k, C6851a<? extends V> aVar) {
            this.f14838a = k;
            this.f14839b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C7425g.class == obj.getClass() && this.f14838a.equals(((C7425g) obj).f14838a);
        }

        public int hashCode() {
            return this.f14838a.hashCode();
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$h */
    public static class C7426h<T> implements C7438j<T> {

        /* renamed from: g */
        public final C7417e f14840g;

        /* renamed from: h */
        public final C6851a<? extends T> f14841h;

        /* renamed from: i */
        public volatile Object f14842i;

        public C7426h(C7417e eVar, C6851a<? extends T> aVar) {
            if (eVar == null) {
                m13366a(0);
                throw null;
            } else if (aVar != null) {
                this.f14842i = C7432n.NOT_COMPUTED;
                this.f14840g = eVar;
                this.f14841h = aVar;
            } else {
                m13366a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m13366a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 3) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 3) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        public void mo25034b(T t) {
        }

        /* renamed from: c */
        public C7433o<T> mo25029c(boolean z) {
            C7433o<T> l = this.f14840g.mo25027l("in a lazy value", null);
            if (l != null) {
                return l;
            }
            m13366a(2);
            throw null;
        }

        public T invoke() {
            T t;
            T t2 = C7432n.RECURSION_WAS_DETECTED;
            T t3 = C7432n.COMPUTING;
            T t4 = this.f14842i;
            if (!(t4 instanceof C7432n)) {
                C7648n.m13877c(t4);
                return t4;
            }
            this.f14840g.f14831a.lock();
            try {
                T t5 = this.f14842i;
                if (!(t5 instanceof C7432n)) {
                    C7648n.m13877c(t5);
                    this.f14840g.f14831a.unlock();
                    return t5;
                }
                if (t5 == t3) {
                    this.f14842i = t2;
                    C7433o c = mo25029c(true);
                    if (!c.f14852b) {
                        t = c.f14851a;
                        this.f14840g.f14831a.unlock();
                        return t;
                    }
                }
                if (t5 == t2) {
                    C7433o c2 = mo25029c(false);
                    if (!c2.f14852b) {
                        t = c2.f14851a;
                        this.f14840g.f14831a.unlock();
                        return t;
                    }
                }
                this.f14842i = t3;
                t = this.f14841h.invoke();
                mo25034b(t);
                this.f14842i = t;
                this.f14840g.f14831a.unlock();
                return t;
            } catch (Throwable th) {
                this.f14840g.f14831a.unlock();
                throw th;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$i */
    public static abstract class C7427i<T> extends C7426h<T> {

        /* renamed from: j */
        public volatile C7440l<T> f14843j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7427i(C7417e eVar, C6851a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                m13369a(0);
                throw null;
            } else if (aVar != null) {
                this.f14843j = null;
            } else {
                m13369a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m13369a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        public final void mo25034b(T t) {
            this.f14843j = new C7440l<>(t);
            try {
                C7420c cVar = (C7420c) this;
                if (t != null) {
                    cVar.f14836l.invoke(t);
                } else {
                    C7420c.m13360a(2);
                    throw null;
                }
            } finally {
                this.f14843j = null;
            }
        }

        public T invoke() {
            C7440l<T> lVar = this.f14843j;
            if (lVar != null) {
                boolean z = true;
                if (lVar.f14855b == Thread.currentThread()) {
                    if (lVar.f14855b != Thread.currentThread()) {
                        z = false;
                    }
                    if (z) {
                        return lVar.f14854a;
                    }
                    throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
                }
            }
            return super.invoke();
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$j */
    public static class C7428j<T> extends C7426h<T> implements C7437i<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7428j(C7417e eVar, C6851a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                m13371a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                m13371a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m13371a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke != null) {
                return invoke;
            }
            m13371a(2);
            throw null;
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$k */
    public static abstract class C7429k<T> extends C7427i<T> implements C7437i<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7429k(C7417e eVar, C6851a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                m13372a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                m13372a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m13372a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke != null) {
                return invoke;
            }
            m13372a(2);
            throw null;
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$l */
    public static class C7430l<K, V> implements C7436h<K, V> {

        /* renamed from: g */
        public final C7417e f14844g;

        /* renamed from: h */
        public final ConcurrentMap<K, Object> f14845h;

        /* renamed from: i */
        public final C6862l<? super K, ? extends V> f14846i;

        public C7430l(C7417e eVar, ConcurrentMap<K, Object> concurrentMap, C6862l<? super K, ? extends V> lVar) {
            if (eVar == null) {
                m13373a(0);
                throw null;
            } else if (concurrentMap == null) {
                m13373a(1);
                throw null;
            } else if (lVar != null) {
                this.f14844g = eVar;
                this.f14845h = concurrentMap;
                this.f14846i = lVar;
            } else {
                m13373a(2);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m13373a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: d */
        public final AssertionError mo25035d(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f14844g);
            C7417e.m13347m(assertionError);
            return assertionError;
        }

        public V invoke(K k) {
            Object obj;
            AssertionError th;
            AssertionError assertionError;
            C7432n nVar = C7432n.RECURSION_WAS_DETECTED;
            C7432n nVar2 = C7432n.COMPUTING;
            Object obj2 = this.f14845h.get(k);
            if (obj2 != null && obj2 != nVar2) {
                return C7648n.m13876b(obj2);
            }
            this.f14844g.f14831a.lock();
            try {
                Object obj3 = this.f14845h.get(k);
                if (obj3 == nVar2) {
                    C7433o l = this.f14844g.mo25027l("", k);
                    if (l == null) {
                        m13373a(3);
                        throw null;
                    } else if (!l.f14852b) {
                        obj = l.f14851a;
                        return obj;
                    } else {
                        obj3 = nVar;
                    }
                }
                if (obj3 == nVar) {
                    C7433o l2 = this.f14844g.mo25027l("", k);
                    if (l2 == null) {
                        m13373a(3);
                        throw null;
                    } else if (!l2.f14852b) {
                        obj = l2.f14851a;
                        return obj;
                    }
                }
                if (obj3 != null) {
                    obj = C7648n.m13876b(obj3);
                    return obj;
                }
                try {
                    this.f14845h.put(k, nVar2);
                    V invoke = this.f14846i.invoke(k);
                    Object put = this.f14845h.put(k, invoke == null ? C7648n.f15148a : invoke);
                    if (put == nVar2) {
                        this.f14844g.f14831a.unlock();
                        return invoke;
                    }
                    assertionError = mo25035d(k, put);
                    try {
                        throw assertionError;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    assertionError = null;
                    if (C5266a.m9815H2(th)) {
                        this.f14845h.remove(k);
                        throw ((RuntimeException) th);
                    } else if (th != assertionError) {
                        Object put2 = this.f14845h.put(k, new C7648n.C7650b(th, (C7648n.C7649a) null));
                        if (put2 != nVar2) {
                            throw mo25035d(k, put2);
                        }
                        ((C7423f.C7424a) this.f14844g.f14832b).mo25031a(th);
                        throw null;
                    } else {
                        ((C7423f.C7424a) this.f14844g.f14832b).mo25031a(th);
                        throw null;
                    }
                }
            } finally {
                this.f14844g.f14831a.unlock();
            }
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$m */
    public static class C7431m<K, V> extends C7430l<K, V> implements C7435g<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7431m(C7417e eVar, ConcurrentMap<K, Object> concurrentMap, C6862l<? super K, ? extends V> lVar) {
            super(eVar, concurrentMap, lVar);
            if (concurrentMap == null) {
                m13375a(1);
                throw null;
            } else if (lVar != null) {
            } else {
                m13375a(2);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m13375a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V invoke(K k) {
            V invoke = super.invoke(k);
            if (invoke != null) {
                return invoke;
            }
            m13375a(3);
            throw null;
        }
    }

    /* renamed from: d.a.a.a.y0.k.e$n */
    public enum C7432n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* renamed from: d.a.a.a.y0.k.e$o */
    public static class C7433o<T> {

        /* renamed from: a */
        public final T f14851a;

        /* renamed from: b */
        public final boolean f14852b;

        public C7433o(T t, boolean z) {
            this.f14851a = t;
            this.f14852b = z;
        }

        public String toString() {
            if (this.f14852b) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.f14851a);
        }
    }

    static {
        String canonicalName = C7417e.class.getCanonicalName();
        String str = "";
        C6888i.m12438e(canonicalName, "$this$substringBeforeLast");
        C6888i.m12438e(".", "delimiter");
        C6888i.m12438e(str, "missingDelimiterValue");
        int p = C7694h.m13938p(canonicalName, ".", 0, false, 6);
        if (p != -1) {
            str = canonicalName.substring(0, p);
            C6888i.m12437d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        f14829d = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7417e(java.lang.String r5) {
        /*
            r4 = this;
            d.a.a.a.y0.k.e$f r0 = p298d.p299a.p300a.p301a.p303y0.p404k.C7417e.C7423f.f14837a
            int r1 = p298d.p299a.p300a.p301a.p303y0.p404k.C7439k.f14853a
            d.a.a.a.y0.k.c r1 = new d.a.a.a.y0.k.c
            r2 = 0
            r3 = 1
            r1.<init>(r2, r3)
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p404k.C7417e.<init>(java.lang.String):void");
    }

    public C7417e(String str, C7423f fVar, C7439k kVar) {
        if (str == null) {
            m13345j(4);
            throw null;
        } else if (fVar == null) {
            m13345j(5);
            throw null;
        } else if (kVar != null) {
            this.f14831a = kVar;
            this.f14832b = fVar;
            this.f14833c = str;
        } else {
            m13345j(6);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m13345j(int r13) {
        /*
            r0 = 37
            r1 = 20
            r2 = 13
            r3 = 10
            if (r13 == r3) goto L_0x0013
            if (r13 == r2) goto L_0x0013
            if (r13 == r1) goto L_0x0013
            if (r13 == r0) goto L_0x0013
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x0015
        L_0x0013:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L_0x0015:
            r5 = 3
            r6 = 2
            if (r13 == r3) goto L_0x0021
            if (r13 == r2) goto L_0x0021
            if (r13 == r1) goto L_0x0021
            if (r13 == r0) goto L_0x0021
            r7 = r5
            goto L_0x0022
        L_0x0021:
            r7 = r6
        L_0x0022:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager"
            java.lang.String r9 = "compute"
            r10 = 1
            r11 = 0
            if (r13 == r10) goto L_0x0065
            if (r13 == r5) goto L_0x0065
            r5 = 5
            if (r13 == r5) goto L_0x0065
            r5 = 6
            if (r13 == r5) goto L_0x0060
            switch(r13) {
                case 8: goto L_0x0065;
                case 9: goto L_0x005d;
                case 10: goto L_0x005a;
                case 11: goto L_0x005d;
                case 12: goto L_0x0055;
                case 13: goto L_0x005a;
                case 14: goto L_0x005d;
                case 15: goto L_0x0050;
                case 16: goto L_0x005d;
                case 17: goto L_0x0055;
                case 18: goto L_0x0050;
                case 19: goto L_0x005d;
                case 20: goto L_0x005a;
                case 21: goto L_0x005d;
                case 22: goto L_0x0050;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x0055;
                case 26: goto L_0x004b;
                case 27: goto L_0x0055;
                case 28: goto L_0x004b;
                case 29: goto L_0x0046;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x0046;
                case 34: goto L_0x004b;
                case 35: goto L_0x0041;
                case 36: goto L_0x003c;
                case 37: goto L_0x005a;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r5 = "debugText"
            r7[r11] = r5
            goto L_0x0069
        L_0x003c:
            java.lang.String r5 = "throwable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0041:
            java.lang.String r5 = "source"
            r7[r11] = r5
            goto L_0x0069
        L_0x0046:
            java.lang.String r5 = "postCompute"
            r7[r11] = r5
            goto L_0x0069
        L_0x004b:
            java.lang.String r5 = "computable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0050:
            java.lang.String r5 = "map"
            r7[r11] = r5
            goto L_0x0069
        L_0x0055:
            java.lang.String r5 = "onRecursiveCall"
            r7[r11] = r5
            goto L_0x0069
        L_0x005a:
            r7[r11] = r8
            goto L_0x0069
        L_0x005d:
            r7[r11] = r9
            goto L_0x0069
        L_0x0060:
            java.lang.String r5 = "lock"
            r7[r11] = r5
            goto L_0x0069
        L_0x0065:
            java.lang.String r5 = "exceptionHandlingStrategy"
            r7[r11] = r5
        L_0x0069:
            java.lang.String r5 = "sanitizeStackTrace"
            java.lang.String r11 = "createMemoizedFunctionWithNullableValues"
            java.lang.String r12 = "createMemoizedFunction"
            if (r13 == r3) goto L_0x0080
            if (r13 == r2) goto L_0x0080
            if (r13 == r1) goto L_0x007d
            if (r13 == r0) goto L_0x007a
            r7[r10] = r8
            goto L_0x0082
        L_0x007a:
            r7[r10] = r5
            goto L_0x0082
        L_0x007d:
            r7[r10] = r11
            goto L_0x0082
        L_0x0080:
            r7[r10] = r12
        L_0x0082:
            switch(r13) {
                case 4: goto L_0x00be;
                case 5: goto L_0x00be;
                case 6: goto L_0x00be;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00b6;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00b6;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00b6;
                case 17: goto L_0x00b6;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b3;
                case 20: goto L_0x00c2;
                case 21: goto L_0x00b3;
                case 22: goto L_0x00b3;
                case 23: goto L_0x00ae;
                case 24: goto L_0x00ae;
                case 25: goto L_0x00ae;
                case 26: goto L_0x00a9;
                case 27: goto L_0x00a9;
                case 28: goto L_0x00a4;
                case 29: goto L_0x00a4;
                case 30: goto L_0x009f;
                case 31: goto L_0x009a;
                case 32: goto L_0x0095;
                case 33: goto L_0x0095;
                case 34: goto L_0x0092;
                case 35: goto L_0x008d;
                case 36: goto L_0x008a;
                case 37: goto L_0x00c2;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.String r5 = "createWithExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x008a:
            r7[r6] = r5
            goto L_0x00c2
        L_0x008d:
            java.lang.String r5 = "recursionDetectedDefault"
            r7[r6] = r5
            goto L_0x00c2
        L_0x0092:
            r7[r6] = r9
            goto L_0x00c2
        L_0x0095:
            java.lang.String r5 = "createNullableLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009a:
            java.lang.String r5 = "createRecursionTolerantNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009f:
            java.lang.String r5 = "createNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a4:
            java.lang.String r5 = "createLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a9:
            java.lang.String r5 = "createRecursionTolerantLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00ae:
            java.lang.String r5 = "createLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00b3:
            r7[r6] = r11
            goto L_0x00c2
        L_0x00b6:
            r7[r6] = r12
            goto L_0x00c2
        L_0x00b9:
            java.lang.String r5 = "replaceExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00be:
            java.lang.String r5 = "<init>"
            r7[r6] = r5
        L_0x00c2:
            java.lang.String r4 = java.lang.String.format(r4, r7)
            if (r13 == r3) goto L_0x00d4
            if (r13 == r2) goto L_0x00d4
            if (r13 == r1) goto L_0x00d4
            if (r13 == r0) goto L_0x00d4
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            goto L_0x00d9
        L_0x00d4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r4)
        L_0x00d9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p404k.C7417e.m13345j(int):void");
    }

    /* renamed from: k */
    public static <K> ConcurrentMap<K, Object> m13346k() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* renamed from: m */
    public static <T extends Throwable> T m13347m(T t) {
        if (t != null) {
            StackTraceElement[] stackTrace = t.getStackTrace();
            int length = stackTrace.length;
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (!stackTrace[i2].getClassName().startsWith(f14829d)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            List subList = Arrays.asList(stackTrace).subList(i, length);
            t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
            return t;
        }
        m13345j(36);
        throw null;
    }

    /* renamed from: a */
    public <T> C7437i<T> mo25018a(C6851a<? extends T> aVar) {
        if (aVar != null) {
            return new C7428j(this, aVar);
        }
        m13345j(23);
        throw null;
    }

    /* renamed from: b */
    public <T> T mo25019b(C6851a<? extends T> aVar) {
        this.f14831a.lock();
        try {
            T invoke = aVar.invoke();
            this.f14831a.unlock();
            return invoke;
        } catch (Throwable th) {
            this.f14831a.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public <K, V> C7414b<K, V> mo25020c() {
        return new C7422e(this, m13346k(), (C7418a) null);
    }

    /* renamed from: d */
    public <T> C7438j<T> mo25021d(C6851a<? extends T> aVar) {
        return new C7426h(this, aVar);
    }

    /* renamed from: e */
    public <T> C7437i<T> mo25022e(C6851a<? extends T> aVar, C6862l<? super Boolean, ? extends T> lVar, C6862l<? super T, C6777r> lVar2) {
        return new C7420c(this, this, aVar, lVar, lVar2);
    }

    /* renamed from: f */
    public <K, V> C7413a<K, V> mo25023f() {
        return new C7421d(this, m13346k(), (C7418a) null);
    }

    /* renamed from: g */
    public <T> C7437i<T> mo25024g(C6851a<? extends T> aVar, T t) {
        return new C7419b(this, this, aVar, t);
    }

    /* renamed from: h */
    public <K, V> C7435g<K, V> mo25025h(C6862l<? super K, ? extends V> lVar) {
        return new C7431m(this, m13346k(), lVar);
    }

    /* renamed from: i */
    public <K, V> C7436h<K, V> mo25026i(C6862l<? super K, ? extends V> lVar) {
        return new C7430l(this, m13346k(), lVar);
    }

    /* renamed from: l */
    public <K, V> C7433o<V> mo25027l(String str, K k) {
        String str2;
        StringBuilder y = C0843a.m464y("Recursion detected ", str);
        if (k == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k;
        }
        y.append(str2);
        y.append(" under ");
        y.append(this);
        AssertionError assertionError = new AssertionError(y.toString());
        m13347m(assertionError);
        throw assertionError;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return C0843a.m455p(sb, this.f14833c, ")");
    }
}
