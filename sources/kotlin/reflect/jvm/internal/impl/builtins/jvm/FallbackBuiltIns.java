package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6077c;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;

public final class FallbackBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final KotlinBuiltIns Instance = new FallbackBuiltIns();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KotlinBuiltIns getInstance() {
            return FallbackBuiltIns.Instance;
        }
    }

    private FallbackBuiltIns() {
        super(new C7417e("FallbackBuiltIns"));
        createBuiltInsModule(true);
    }

    public C6077c.C6078a getPlatformDependentDeclarationFilter() {
        return C6077c.C6078a.f11984a;
    }
}
