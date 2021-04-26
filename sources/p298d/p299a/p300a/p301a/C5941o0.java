package p298d.p299a.p300a.p301a;

import p298d.p344x.p345b.C6851a;

/* renamed from: d.a.a.a.o0 */
public class C5941o0<T> extends C5943p0<T> {

    /* renamed from: h */
    public final C6851a<T> f11757h;

    /* renamed from: i */
    public volatile Object f11758i;

    public C5941o0(C6851a<T> aVar) {
        if (aVar != null) {
            this.f11758i = null;
            this.f11757h = aVar;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"}));
    }

    public T invoke() {
        T t = this.f11758i;
        if (t == null) {
            T invoke = this.f11757h.invoke();
            this.f11758i = invoke == null ? C5943p0.f11760g : invoke;
            return invoke;
        } else if (t == C5943p0.f11760g) {
            return null;
        } else {
            return t;
        }
    }
}
