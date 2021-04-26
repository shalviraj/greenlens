package p005b.p096l.p224e.p226e0;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import p005b.p096l.p224e.C4468m;
import p005b.p096l.p224e.p226e0.p227a0.C4350b;
import p005b.p096l.p224e.p230f0.C4455a;

/* renamed from: b.l.e.e0.g */
public final class C4357g {

    /* renamed from: a */
    public final Map<Type, C4468m<?>> f8068a;

    /* renamed from: b */
    public final C4350b f8069b = C4350b.f8061a;

    /* renamed from: b.l.e.e0.g$a */
    public class C4358a implements C4380t<T> {

        /* renamed from: a */
        public final /* synthetic */ C4468m f8070a;

        /* renamed from: b */
        public final /* synthetic */ Type f8071b;

        public C4358a(C4357g gVar, C4468m mVar, Type type) {
            this.f8070a = mVar;
            this.f8071b = type;
        }

        /* renamed from: a */
        public T mo15987a() {
            return this.f8070a.mo16129a(this.f8071b);
        }
    }

    /* renamed from: b.l.e.e0.g$b */
    public class C4359b implements C4380t<T> {

        /* renamed from: a */
        public final /* synthetic */ C4468m f8072a;

        /* renamed from: b */
        public final /* synthetic */ Type f8073b;

        public C4359b(C4357g gVar, C4468m mVar, Type type) {
            this.f8072a = mVar;
            this.f8073b = type;
        }

        /* renamed from: a */
        public T mo15987a() {
            return this.f8072a.mo16129a(this.f8073b);
        }
    }

    public C4357g(Map<Type, C4468m<?>> map) {
        this.f8068a = map;
    }

    /* renamed from: a */
    public <T> C4380t<T> mo15988a(C4455a<T> aVar) {
        C4360h hVar;
        Type type = aVar.f8250b;
        Class<? super T> cls = aVar.f8249a;
        C4468m mVar = this.f8068a.get(type);
        if (mVar != null) {
            return new C4358a(this, mVar, type);
        }
        C4468m mVar2 = this.f8068a.get(cls);
        if (mVar2 != null) {
            return new C4359b(this, mVar2, type);
        }
        C4380t<T> tVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f8069b.mo15986a(declaredConstructor);
            }
            hVar = new C4360h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            tVar = SortedSet.class.isAssignableFrom(cls) ? new C4361i(this) : EnumSet.class.isAssignableFrom(cls) ? new C4362j(this, type) : Set.class.isAssignableFrom(cls) ? new C4363k(this) : Queue.class.isAssignableFrom(cls) ? new C4364l(this) : new C4365m(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                tVar = new C4366n(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                tVar = new C4352b(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                tVar = new C4353c(this);
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    Objects.requireNonNull(type2);
                    Type a = C4345a.m7961a(type2);
                    Class<?> e = C4345a.m7965e(a);
                    a.hashCode();
                    if (!String.class.isAssignableFrom(e)) {
                        tVar = new C4354d(this);
                    }
                }
                tVar = new C4355e(this);
            }
        }
        if (tVar != null) {
            return tVar;
        }
        return new C4356f(this, cls, type);
    }

    public String toString() {
        return this.f8068a.toString();
    }
}
