package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6076b;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6114k;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

public final class JvmBuiltInClassDescriptorFactory implements C6076b {
    public static final /* synthetic */ C6736l<Object>[] $$delegatedProperties = {C6902w.m12462c(new C6896q(C6902w.m12460a(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    /* access modifiers changed from: private */
    public static final C6713a CLONEABLE_CLASS_ID;
    /* access modifiers changed from: private */
    public static final C6717d CLONEABLE_NAME;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final C6714b KOTLIN_FQ_NAME = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
    private final C7437i cloneable$delegate;
    /* access modifiers changed from: private */
    public final C6862l<C6021a0, C6206k> computeContainingDeclaration;
    /* access modifiers changed from: private */
    public final C6021a0 moduleDescriptor;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6713a getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.CLONEABLE_CLASS_ID;
        }
    }

    static {
        C6715c cVar = StandardNames.FqNames.cloneable;
        C6717d h = cVar.mo23881h();
        C6888i.m12437d(h, "cloneable.shortName()");
        CLONEABLE_NAME = h;
        C6713a l = C6713a.m12239l(cVar.mo23883i());
        C6888i.m12437d(l, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        CLONEABLE_CLASS_ID = l;
    }

    public JvmBuiltInClassDescriptorFactory(C7441m mVar, C6021a0 a0Var, C6862l<? super C6021a0, ? extends C6206k> lVar) {
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(a0Var, "moduleDescriptor");
        C6888i.m12438e(lVar, "computeContainingDeclaration");
        this.moduleDescriptor = a0Var;
        this.computeContainingDeclaration = lVar;
        this.cloneable$delegate = mVar.mo25018a(new JvmBuiltInClassDescriptorFactory$cloneable$2(this, mVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JvmBuiltInClassDescriptorFactory(C7441m mVar, C6021a0 a0Var, C6862l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, a0Var, (i & 4) != 0 ? C70701.INSTANCE : lVar);
    }

    private final C6114k getCloneable() {
        return (C6114k) C5266a.m9884T1(this.cloneable$delegate, $$delegatedProperties[0]);
    }

    public C6046e createClass(C6713a aVar) {
        C6888i.m12438e(aVar, "classId");
        if (C6888i.m12434a(aVar, Companion.getCLONEABLE_CLASS_ID())) {
            return getCloneable();
        }
        return null;
    }

    public Collection<C6046e> getAllContributedClassesIfPossible(C6714b bVar) {
        C6888i.m12438e(bVar, "packageFqName");
        return C6888i.m12434a(bVar, KOTLIN_FQ_NAME) ? C5266a.m9891U3(getCloneable()) : C6800r.f13715g;
    }

    public boolean shouldCreateClass(C6714b bVar, C6717d dVar) {
        C6888i.m12438e(bVar, "packageFqName");
        C6888i.m12438e(dVar, "name");
        return C6888i.m12434a(dVar, CLONEABLE_NAME) && C6888i.m12434a(bVar, KOTLIN_FQ_NAME);
    }
}
