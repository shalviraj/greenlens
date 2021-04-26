package p298d.p299a.p300a.p301a;

import java.lang.ref.SoftReference;
import p298d.p344x.p345b.C6851a;

/* renamed from: d.a.a.a.n0 */
public class C5939n0<T> extends C5943p0<T> implements C6851a<T> {

    /* renamed from: h */
    public final C6851a<T> f11754h;

    /* renamed from: i */
    public volatile SoftReference<Object> f11755i;

    public C5939n0(T t, C6851a<T> aVar) {
        if (aVar != null) {
            this.f11755i = null;
            this.f11754h = aVar;
            if (t != null) {
                this.f11755i = new SoftReference<>(t);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
    }

    public T invoke() {
        T t;
        SoftReference<Object> softReference = this.f11755i;
        if (softReference == null || (t = softReference.get()) == null) {
            T invoke = this.f11754h.invoke();
            this.f11755i = new SoftReference<>(invoke == null ? C5943p0.f11760g : invoke);
            return invoke;
        } else if (t == C5943p0.f11760g) {
            return null;
        } else {
            return t;
        }
    }
}
