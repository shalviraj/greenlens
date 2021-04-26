package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6034d;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6051f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6114k;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6890k;

public final class JvmBuiltInClassDescriptorFactory$cloneable$2 extends C6890k implements C6851a<C6114k> {
    public final /* synthetic */ C7441m $storageManager;
    public final /* synthetic */ JvmBuiltInClassDescriptorFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInClassDescriptorFactory$cloneable$2(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, C7441m mVar) {
        super(0);
        this.this$0 = jvmBuiltInClassDescriptorFactory;
        this.$storageManager = mVar;
    }

    public final C6114k invoke() {
        C6114k kVar = new C6114k((C6206k) this.this$0.computeContainingDeclaration.invoke(this.this$0.moduleDescriptor), JvmBuiltInClassDescriptorFactory.CLONEABLE_NAME, C6251y.ABSTRACT, C6051f.INTERFACE, C5266a.m9910Y2(this.this$0.moduleDescriptor.getBuiltIns().getAnyType()), C6234r0.f12257a, false, this.$storageManager);
        kVar.mo23258x(new CloneableClassScope(this.$storageManager, kVar), C6800r.f13715g, (C6034d) null);
        return kVar;
    }
}
