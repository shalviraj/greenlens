package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6074a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6076b;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6077c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6086a0;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

public final class JvmBuiltIns extends KotlinBuiltIns {
    public static final /* synthetic */ C6736l<Object>[] $$delegatedProperties = {C6902w.m12462c(new C6896q(C6902w.m12460a(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    private final C7437i customizer$delegate;
    /* access modifiers changed from: private */
    public C6851a<Settings> settingsComputation;

    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    public static final class Settings {
        private final boolean isAdditionalBuiltInsFeatureSupported;
        private final C6021a0 ownerModuleDescriptor;

        public Settings(C6021a0 a0Var, boolean z) {
            C6888i.m12438e(a0Var, "ownerModuleDescriptor");
            this.ownerModuleDescriptor = a0Var;
            this.isAdditionalBuiltInsFeatureSupported = z;
        }

        public final C6021a0 getOwnerModuleDescriptor() {
            return this.ownerModuleDescriptor;
        }

        public final boolean isAdditionalBuiltInsFeatureSupported() {
            return this.isAdditionalBuiltInsFeatureSupported;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = {1, 2, 3};

        static {
            Kind.values();
            Kind kind = Kind.FROM_DEPENDENCIES;
            Kind kind2 = Kind.FROM_CLASS_LOADER;
            Kind kind3 = Kind.FALLBACK;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(C7441m mVar, Kind kind) {
        super(mVar);
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(kind, "kind");
        this.customizer$delegate = mVar.mo25018a(new JvmBuiltIns$customizer$2(this, mVar));
        int ordinal = kind.ordinal();
        if (ordinal == 1) {
            createBuiltInsModule(false);
        } else if (ordinal == 2) {
            createBuiltInsModule(true);
        }
    }

    public C6074a getAdditionalClassPartsProvider() {
        return getCustomizer();
    }

    public List<C6076b> getClassDescriptorFactories() {
        Iterable<C6076b> classDescriptorFactories = super.getClassDescriptorFactories();
        C6888i.m12437d(classDescriptorFactories, "super.getClassDescriptorFactories()");
        C7441m storageManager = getStorageManager();
        C6888i.m12437d(storageManager, "storageManager");
        C6086a0 builtInsModule = getBuiltInsModule();
        C6888i.m12437d(builtInsModule, "builtInsModule");
        return C6790h.m12321H(classDescriptorFactories, new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, (C6862l) null, 4, (DefaultConstructorMarker) null));
    }

    public final JvmBuiltInsCustomizer getCustomizer() {
        return (JvmBuiltInsCustomizer) C5266a.m9884T1(this.customizer$delegate, $$delegatedProperties[0]);
    }

    public C6077c getPlatformDependentDeclarationFilter() {
        return getCustomizer();
    }

    public final void initialize(C6021a0 a0Var, boolean z) {
        C6888i.m12438e(a0Var, "moduleDescriptor");
        setPostponedSettingsComputation(new JvmBuiltIns$initialize$1(a0Var, z));
    }

    public final void setPostponedSettingsComputation(C6851a<Settings> aVar) {
        C6888i.m12438e(aVar, "computation");
        C6851a<Settings> aVar2 = this.settingsComputation;
        this.settingsComputation = aVar;
    }
}
