package p005b.p096l.p224e.p230f0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import p005b.p096l.p224e.p226e0.C4345a;

/* renamed from: b.l.e.f0.a */
public class C4455a<T> {

    /* renamed from: a */
    public final Class<? super T> f8249a;

    /* renamed from: b */
    public final Type f8250b;

    /* renamed from: c */
    public final int f8251c;

    public C4455a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a = C4345a.m7961a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f8250b = a;
            this.f8249a = C4345a.m7965e(a);
            this.f8251c = a.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4455a) && C4345a.m7963c(this.f8250b, ((C4455a) obj).f8250b);
    }

    public final int hashCode() {
        return this.f8251c;
    }

    public final String toString() {
        return C4345a.m7969i(this.f8250b);
    }

    public C4455a(Type type) {
        Objects.requireNonNull(type);
        Type a = C4345a.m7961a(type);
        this.f8250b = a;
        this.f8249a = C4345a.m7965e(a);
        this.f8251c = a.hashCode();
    }
}
