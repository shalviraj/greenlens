package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

public final class BuiltInsLoader$Companion$Instance$2 extends C6890k implements C6851a<BuiltInsLoader> {
    public static final BuiltInsLoader$Companion$Instance$2 INSTANCE = new BuiltInsLoader$Companion$Instance$2();

    public BuiltInsLoader$Companion$Instance$2() {
        super(0);
    }

    public final BuiltInsLoader invoke() {
        Class<BuiltInsLoader> cls = BuiltInsLoader.class;
        ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
        C6888i.m12437d(load, "implementations");
        BuiltInsLoader builtInsLoader = (BuiltInsLoader) C6790h.m12362p(load);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
