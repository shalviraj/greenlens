package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;

public final class DefaultBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final DefaultBuiltIns Instance = new DefaultBuiltIns(false, 1, (DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DefaultBuiltIns getInstance() {
            return DefaultBuiltIns.Instance;
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public DefaultBuiltIns(boolean z) {
        super(new C7417e("DefaultBuiltIns"));
        if (z) {
            createBuiltInsModule(false);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultBuiltIns(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public static final DefaultBuiltIns getInstance() {
        return Companion.getInstance();
    }
}
