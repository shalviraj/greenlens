package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6034d;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6051f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6157j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6074a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6077c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6080d;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6114k;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6260d;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6345e;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6351g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6565s;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7201m;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7324d;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7413a;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7471f0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6901v;
import p298d.p344x.p346c.C6902w;

public final class JvmBuiltInsCustomizer implements C6074a, C6077c {
    public static final /* synthetic */ C6736l<Object>[] $$delegatedProperties;
    private final C7437i cloneableType$delegate;
    /* access modifiers changed from: private */
    public final JavaToKotlinClassMapper j2kClassMapper = JavaToKotlinClassMapper.INSTANCE;
    private final C7413a<C6714b, C6046e> javaAnalogueClassesWithCustomSupertypeCache;
    private final C7452c0 mockSerializableType;
    /* access modifiers changed from: private */
    public final C6021a0 moduleDescriptor;
    private final C7437i notConsideredDeprecation$delegate;
    private final C7437i settings$delegate;

    public enum JDKMemberStatus {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = {1, 4, 2, 3};

        static {
            JDKMemberStatus.values();
            JDKMemberStatus jDKMemberStatus = JDKMemberStatus.HIDDEN;
            JDKMemberStatus jDKMemberStatus2 = JDKMemberStatus.NOT_CONSIDERED;
            JDKMemberStatus jDKMemberStatus3 = JDKMemberStatus.DROP;
            JDKMemberStatus jDKMemberStatus4 = JDKMemberStatus.VISIBLE;
        }
    }

    static {
        Class<JvmBuiltInsCustomizer> cls = JvmBuiltInsCustomizer.class;
        $$delegatedProperties = new C6736l[]{C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public JvmBuiltInsCustomizer(C6021a0 a0Var, C7441m mVar, C6851a<JvmBuiltIns.Settings> aVar) {
        C6888i.m12438e(a0Var, "moduleDescriptor");
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(aVar, "settingsComputation");
        this.moduleDescriptor = a0Var;
        this.settings$delegate = mVar.mo25018a(aVar);
        this.mockSerializableType = createMockJavaIoSerializableType(mVar);
        this.cloneableType$delegate = mVar.mo25018a(new JvmBuiltInsCustomizer$cloneableType$2(this, mVar));
        this.javaAnalogueClassesWithCustomSupertypeCache = mVar.mo25023f();
        this.notConsideredDeprecation$delegate = mVar.mo25018a(new JvmBuiltInsCustomizer$notConsideredDeprecation$2(this));
    }

    private final C6232q0 createCloneForArray(C7324d dVar, C6232q0 q0Var) {
        C6244v.C6245a<? extends C6232q0> newCopyBuilder = q0Var.newCopyBuilder();
        newCopyBuilder.mo23298k(dVar);
        newCopyBuilder.mo23297j(C6219q.f12245e);
        newCopyBuilder.mo23305r(dVar.getDefaultType());
        newCopyBuilder.mo23302o(dVar.getThisAsReceiverParameter());
        C6232q0 q0Var2 = (C6232q0) newCopyBuilder.mo23292e();
        C6888i.m12436c(q0Var2);
        return q0Var2;
    }

    private final C7452c0 createMockJavaIoSerializableType(C7441m mVar) {
        C6114k kVar = new C6114k(new C7072x4cb45058(this.moduleDescriptor, new C6714b("java.io")), C6717d.m12270l("Serializable"), C6251y.ABSTRACT, C6051f.INTERFACE, C5266a.m9910Y2(new C7471f0(mVar, new C7073xd3162e24(this))), C6234r0.f12257a, false, mVar);
        kVar.mo23258x(C7277h.C7280b.f14521b, C6800r.f13715g, (C6034d) null);
        C7489j0 defaultType = kVar.getDefaultType();
        C6888i.m12437d(defaultType, "mockSerializableClass.defaultType");
        return defaultType;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0121, code lost:
        if (isMutabilityViolation(r3, r10) != false) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Collection<p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0> getAdditionalFunctions(p298d.p299a.p300a.p301a.p303y0.p304b.C6046e r10, p298d.p344x.p345b.C6862l<? super p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h, ? extends java.util.Collection<? extends p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0>> r11) {
        /*
            r9 = this;
            d.a.a.a.y0.d.a.h0.l.e r0 = r9.getJavaAnalogue(r10)
            if (r0 != 0) goto L_0x0009
            d.t.p r10 = p298d.p334t.C6798p.f13713g
            return r10
        L_0x0009:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper r1 = r9.j2kClassMapper
            d.a.a.a.y0.f.b r2 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13135h(r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns$Companion r3 = kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.Companion
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r3 = r3.getInstance()
            java.util.Collection r1 = r1.mapPlatformClass(r2, r3)
            java.lang.String r2 = "$this$lastOrNull"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            boolean r2 = r1 instanceof java.util.List
            r3 = 0
            if (r2 == 0) goto L_0x0038
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x002d
            goto L_0x0042
        L_0x002d:
            int r4 = r2.size()
            int r4 = r4 + -1
            java.lang.Object r2 = r2.get(r4)
            goto L_0x0050
        L_0x0038:
            java.util.Iterator r2 = r1.iterator()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0044
        L_0x0042:
            r2 = r3
            goto L_0x0050
        L_0x0044:
            java.lang.Object r4 = r2.next()
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x004f
            goto L_0x0044
        L_0x004f:
            r2 = r4
        L_0x0050:
            d.a.a.a.y0.b.e r2 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r2
            if (r2 != 0) goto L_0x0057
            d.t.p r10 = p298d.p334t.C6798p.f13713g
            return r10
        L_0x0057:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p005b.p291q.p292a.C5266a.m9892V(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0066:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x007a
            java.lang.Object r5 = r1.next()
            d.a.a.a.y0.b.e r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r5
            d.a.a.a.y0.f.b r5 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13135h(r5)
            r4.add(r5)
            goto L_0x0066
        L_0x007a:
            java.lang.String r1 = "set"
            p298d.p344x.p346c.C6888i.m12438e(r4, r1)
            d.a.a.a.y0.n.m r1 = new d.a.a.a.y0.n.m
            r1.<init>(r3)
            r1.addAll(r4)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper r3 = r9.j2kClassMapper
            boolean r10 = r3.isMutable((p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r10)
            d.a.a.a.y0.k.a<d.a.a.a.y0.f.b, d.a.a.a.y0.b.e> r3 = r9.javaAnalogueClassesWithCustomSupertypeCache
            d.a.a.a.y0.f.b r4 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13135h(r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1 r5 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1
            r5.<init>(r0, r2)
            d.a.a.a.y0.k.e$d r3 = (p298d.p299a.p300a.p301a.p303y0.p404k.C7417e.C7421d) r3
            java.lang.Object r0 = r3.mo25030e(r4, r5)
            d.a.a.a.y0.b.e r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r0
            d.a.a.a.y0.i.z.h r0 = r0.getUnsubstitutedMemberScope()
            java.lang.String r2 = "fakeJavaClassDescriptor.unsubstitutedMemberScope"
            p298d.p344x.p346c.C6888i.m12437d(r0, r2)
            java.lang.Object r11 = r11.invoke(r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x00b8:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x012b
            java.lang.Object r2 = r11.next()
            r3 = r2
            d.a.a.a.y0.b.q0 r3 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0) r3
            d.a.a.a.y0.b.b$a r4 = r3.getKind()
            d.a.a.a.y0.b.b$a r5 = p298d.p299a.p300a.p301a.p303y0.p304b.C6023b.C6024a.DECLARATION
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L_0x00d0
            goto L_0x0124
        L_0x00d0:
            d.a.a.a.y0.b.r r4 = r3.getVisibility()
            d.a.a.a.y0.b.e1 r4 = r4.mo23426a()
            boolean r4 = r4.f11892b
            if (r4 != 0) goto L_0x00dd
            goto L_0x0124
        L_0x00dd:
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDeprecated(r3)
            if (r4 == 0) goto L_0x00e4
            goto L_0x0124
        L_0x00e4:
            java.util.Collection r4 = r3.getOverriddenDescriptors()
            java.lang.String r5 = "analogueMember.overriddenDescriptors"
            p298d.p344x.p346c.C6888i.m12437d(r4, r5)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00f4
            goto L_0x0119
        L_0x00f4:
            java.util.Iterator r4 = r4.iterator()
        L_0x00f8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0119
            java.lang.Object r5 = r4.next()
            d.a.a.a.y0.b.v r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6244v) r5
            d.a.a.a.y0.b.k r5 = r5.getContainingDeclaration()
            java.lang.String r8 = "it.containingDeclaration"
            p298d.p344x.p346c.C6888i.m12437d(r5, r8)
            d.a.a.a.y0.f.b r5 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13135h(r5)
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x00f8
            r4 = r6
            goto L_0x011a
        L_0x0119:
            r4 = r7
        L_0x011a:
            if (r4 == 0) goto L_0x011d
            goto L_0x0124
        L_0x011d:
            boolean r3 = r9.isMutabilityViolation(r3, r10)
            if (r3 != 0) goto L_0x0124
            goto L_0x0125
        L_0x0124:
            r6 = r7
        L_0x0125:
            if (r6 == 0) goto L_0x00b8
            r0.add(r2)
            goto L_0x00b8
        L_0x012b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.getAdditionalFunctions(d.a.a.a.y0.b.e, d.x.b.l):java.util.Collection");
    }

    private final C7489j0 getCloneableType() {
        return (C7489j0) C5266a.m9884T1(this.cloneableType$delegate, $$delegatedProperties[1]);
    }

    private static final boolean getConstructors$isEffectivelyTheSameAs(C6157j jVar, C7448b1 b1Var, C6157j jVar2) {
        return C7201m.m13068j(jVar, jVar2.substitute(b1Var)) == C7201m.C7204c.C7205a.OVERRIDABLE;
    }

    /* access modifiers changed from: private */
    public final C6345e getJavaAnalogue(C6046e eVar) {
        if (KotlinBuiltIns.isAny(eVar) || !KotlinBuiltIns.isUnderKotlinPackage(eVar)) {
            return null;
        }
        C6715c i = C7255a.m13136i(eVar);
        if (!i.mo23879f()) {
            return null;
        }
        C6713a mapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(i);
        C6714b b = mapKotlinToJava == null ? null : mapKotlinToJava.mo23851b();
        if (b == null) {
            return null;
        }
        C6046e H3 = C5266a.m9816H3(getSettings().getOwnerModuleDescriptor(), b, C6260d.FROM_BUILTINS);
        if (H3 instanceof C6345e) {
            return (C6345e) H3;
        }
        return null;
    }

    private final JDKMemberStatus getJdkMethodStatus(C6244v vVar) {
        Object G0 = C5266a.m9807G0(C5266a.m9910Y2((C6046e) vVar.getContainingDeclaration()), new JvmBuiltInsCustomizer$getJdkMethodStatus$1(this), new JvmBuiltInsCustomizer$getJdkMethodStatus$2(C6561p.m11653b(vVar, false, false, 3), new C6901v()));
        C6888i.m12437d(G0, "private fun FunctionDescriptor.getJdkMethodStatus(): JDKMemberStatus {\n        val owner = containingDeclaration as ClassDescriptor\n        val jvmDescriptor = computeJvmDescriptor()\n        var result: JDKMemberStatus? = null\n        return DFS.dfs<ClassDescriptor, JDKMemberStatus>(\n            listOf(owner),\n            {\n                // Search through mapped supertypes to determine that Set.toArray should be invisible, while we have only\n                // Collection.toArray there explicitly\n                // Note, that we can't find j.u.Collection.toArray within overriddenDescriptors of j.u.Set.toArray\n                it.typeConstructor.supertypes.mapNotNull {\n                    (it.constructor.declarationDescriptor?.original as? ClassDescriptor)?.getJavaAnalogue()\n                }\n            },\n            object : DFS.AbstractNodeHandler<ClassDescriptor, JDKMemberStatus>() {\n                override fun beforeChildren(javaClassDescriptor: ClassDescriptor): Boolean {\n                    val signature = SignatureBuildingComponents.signature(javaClassDescriptor, jvmDescriptor)\n                    when (signature) {\n                        in HIDDEN_METHOD_SIGNATURES -> result = JDKMemberStatus.HIDDEN\n                        in VISIBLE_METHOD_SIGNATURES -> result = JDKMemberStatus.VISIBLE\n                        in DROP_LIST_METHOD_SIGNATURES -> result = JDKMemberStatus.DROP\n                    }\n\n                    return result == null\n                }\n\n                override fun result() = result ?: JDKMemberStatus.NOT_CONSIDERED\n            })\n    }");
        return (JDKMemberStatus) G0;
    }

    private final C6060h getNotConsideredDeprecation() {
        return (C6060h) C5266a.m9884T1(this.notConsideredDeprecation$delegate, $$delegatedProperties[2]);
    }

    /* access modifiers changed from: private */
    public final JvmBuiltIns.Settings getSettings() {
        return (JvmBuiltIns.Settings) C5266a.m9884T1(this.settings$delegate, $$delegatedProperties[0]);
    }

    private final boolean isMutabilityViolation(C6232q0 q0Var, boolean z) {
        String b = C6561p.m11653b(q0Var, false, false, 3);
        if (z ^ JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(C5266a.m9901W3(C6565s.f12856a, (C6046e) q0Var.getContainingDeclaration(), b))) {
            return true;
        }
        Boolean e2 = C5266a.m9944e2(C5266a.m9910Y2(q0Var), JvmBuiltInsCustomizer$isMutabilityViolation$1.INSTANCE, new JvmBuiltInsCustomizer$isMutabilityViolation$2(this));
        C6888i.m12437d(e2, "private fun SimpleFunctionDescriptor.isMutabilityViolation(isMutable: Boolean): Boolean {\n        val owner = containingDeclaration as ClassDescriptor\n        val jvmDescriptor = computeJvmDescriptor()\n\n        if ((SignatureBuildingComponents.signature(owner, jvmDescriptor) in MUTABLE_METHOD_SIGNATURES) xor isMutable) return true\n\n        return DFS.ifAny<CallableMemberDescriptor>(\n            listOf(this),\n            { it.original.overriddenDescriptors }\n        ) { overridden ->\n            overridden.kind == CallableMemberDescriptor.Kind.DECLARATION &&\n                    j2kClassMapper.isMutable(overridden.containingDeclaration as ClassDescriptor)\n        }\n    }");
        return e2.booleanValue();
    }

    private final boolean isTrivialCopyConstructorFor(C6157j jVar, C6046e eVar) {
        if (jVar.getValueParameters().size() == 1) {
            List<C6030b1> valueParameters = jVar.getValueParameters();
            C6888i.m12437d(valueParameters, "valueParameters");
            C6083h declarationDescriptor = ((C6030b1) C6790h.m12329P(valueParameters)).mo23093a().mo24887V().getDeclarationDescriptor();
            if (C6888i.m12434a(declarationDescriptor == null ? null : C7255a.m13136i(declarationDescriptor), C7255a.m13136i(eVar))) {
                return true;
            }
        }
        return false;
    }

    public Collection<C6034d> getConstructors(C6046e eVar) {
        boolean z;
        C6888i.m12438e(eVar, "classDescriptor");
        if (eVar.getKind() != C6051f.CLASS || !getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return C6798p.f13713g;
        }
        C6345e javaAnalogue = getJavaAnalogue(eVar);
        if (javaAnalogue == null) {
            return C6798p.f13713g;
        }
        C6046e mapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(this.j2kClassMapper, C7255a.m13135h(javaAnalogue), FallbackBuiltIns.Companion.getInstance(), (Integer) null, 4, (Object) null);
        if (mapJavaToKotlin$default == null) {
            return C6798p.f13713g;
        }
        C7448b1 c = MappingUtilKt.createMappedTypeParametersSubstitution(mapJavaToKotlin$default, javaAnalogue).mo25194c();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) javaAnalogue.f12508s.f12523q.invoke()).iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C6034d dVar = (C6034d) next;
            if (dVar.getVisibility().mo23426a().f11892b) {
                Collection<C6034d> constructors = mapJavaToKotlin$default.getConstructors();
                C6888i.m12437d(constructors, "defaultKotlinVersion.constructors");
                if (!constructors.isEmpty()) {
                    Iterator<T> it2 = constructors.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C6034d dVar2 = (C6034d) it2.next();
                        C6888i.m12437d(dVar2, "it");
                        if (getConstructors$isEffectivelyTheSameAs(dVar2, c, dVar)) {
                            z = false;
                            break;
                        }
                    }
                    if (z && !isTrivialCopyConstructorFor(dVar, eVar) && !KotlinBuiltIns.isDeprecated(dVar) && !JvmBuiltInsSignatures.INSTANCE.getHIDDEN_CONSTRUCTOR_SIGNATURES().contains(C5266a.m9901W3(C6565s.f12856a, javaAnalogue, C6561p.m11653b(dVar, false, false, 3)))) {
                        z2 = true;
                    }
                }
                z = true;
                z2 = true;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C5266a.m9892V(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C6034d dVar3 = (C6034d) it3.next();
            C6244v.C6245a<? extends C6244v> newCopyBuilder = dVar3.newCopyBuilder();
            newCopyBuilder.mo23298k(eVar);
            newCopyBuilder.mo23305r(eVar.getDefaultType());
            newCopyBuilder.mo23303p();
            newCopyBuilder.mo23295h(c.mo25050g());
            if (!JvmBuiltInsSignatures.INSTANCE.getVISIBLE_CONSTRUCTOR_SIGNATURES().contains(C5266a.m9901W3(C6565s.f12856a, javaAnalogue, C6561p.m11653b(dVar3, false, false, 3)))) {
                newCopyBuilder.mo23304q(getNotConsideredDeprecation());
            }
            Object e = newCopyBuilder.mo23292e();
            Objects.requireNonNull(e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((C6034d) e);
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e0, code lost:
        if (r1 != 3) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0> getFunctions(p298d.p299a.p300a.p301a.p303y0.p331f.C6717d r6, p298d.p299a.p300a.p301a.p303y0.p304b.C6046e r7) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            java.lang.String r0 = "classDescriptor"
            p298d.p344x.p346c.C6888i.m12438e(r7, r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope$Companion r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion
            d.a.a.a.y0.f.d r0 = r0.getCLONE_NAME()
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r6, r0)
            if (r0 == 0) goto L_0x007c
            boolean r0 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7324d
            if (r0 == 0) goto L_0x007c
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArrayOrPrimitiveArray(r7)
            if (r0 == 0) goto L_0x007c
            d.a.a.a.y0.j.b.f0.d r7 = (p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7324d) r7
            d.a.a.a.y0.e.c r0 = r7.f14594g
            java.util.List<d.a.a.a.y0.e.i> r0 = r0.f13100t
            java.lang.String r1 = "classDescriptor.classProto.functionList"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x0033
            goto L_0x005a
        L_0x0033:
            java.util.Iterator r0 = r0.iterator()
        L_0x0037:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            d.a.a.a.y0.e.i r1 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6643i) r1
            d.a.a.a.y0.j.b.l r3 = r7.f14601n
            d.a.a.a.y0.e.z.c r3 = r3.f14761b
            int r1 = r1.f13220l
            d.a.a.a.y0.f.d r1 = p005b.p291q.p292a.C5266a.m9802F1(r3, r1)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope$Companion r3 = kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion
            d.a.a.a.y0.f.d r3 = r3.getCLONE_NAME()
            boolean r1 = p298d.p344x.p346c.C6888i.m12434a(r1, r3)
            if (r1 == 0) goto L_0x0037
            r2 = 1
        L_0x005a:
            if (r2 == 0) goto L_0x005f
            d.t.p r6 = p298d.p334t.C6798p.f13713g
            return r6
        L_0x005f:
            d.a.a.a.y0.l.j0 r0 = r5.getCloneableType()
            d.a.a.a.y0.i.z.h r0 = r0.getMemberScope()
            d.a.a.a.y0.c.a.d r1 = p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6260d.FROM_BUILTINS
            java.util.Collection r6 = r0.getContributedFunctions(r6, r1)
            java.lang.Object r6 = p298d.p334t.C6790h.m12328O(r6)
            d.a.a.a.y0.b.q0 r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0) r6
            d.a.a.a.y0.b.q0 r6 = r5.createCloneForArray(r7, r6)
            java.util.List r6 = p005b.p291q.p292a.C5266a.m9910Y2(r6)
            return r6
        L_0x007c:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Settings r0 = r5.getSettings()
            boolean r0 = r0.isAdditionalBuiltInsFeatureSupported()
            if (r0 != 0) goto L_0x0089
            d.t.p r6 = p298d.p334t.C6798p.f13713g
            return r6
        L_0x0089:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2 r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2
            r0.<init>(r6)
            java.util.Collection r6 = r5.getAdditionalFunctions(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x009b:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0105
            java.lang.Object r1 = r6.next()
            d.a.a.a.y0.b.q0 r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0) r1
            d.a.a.a.y0.b.k r2 = r1.getContainingDeclaration()
            d.a.a.a.y0.b.e r2 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r2
            d.a.a.a.y0.l.v0 r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt.createMappedTypeParametersSubstitution(r2, r7)
            d.a.a.a.y0.l.b1 r2 = r2.mo25194c()
            d.a.a.a.y0.b.v r2 = r1.substitute(r2)
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"
            java.util.Objects.requireNonNull(r2, r3)
            d.a.a.a.y0.b.q0 r2 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0) r2
            d.a.a.a.y0.b.v$a r2 = r2.newCopyBuilder()
            r2.mo23298k(r7)
            d.a.a.a.y0.b.n0 r3 = r7.getThisAsReceiverParameter()
            r2.mo23302o(r3)
            r2.mo23303p()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus r1 = r5.getJdkMethodStatus(r1)
            int r1 = r1.ordinal()
            r3 = 0
            if (r1 == 0) goto L_0x00eb
            r4 = 2
            if (r1 == r4) goto L_0x00e3
            r4 = 3
            if (r1 == r4) goto L_0x00ff
            goto L_0x00f5
        L_0x00e3:
            d.a.a.a.y0.b.f1.h r1 = r5.getNotConsideredDeprecation()
            r2.mo23304q(r1)
            goto L_0x00f5
        L_0x00eb:
            boolean r1 = p005b.p291q.p292a.C5266a.m10052w2(r7)
            if (r1 == 0) goto L_0x00f2
            goto L_0x00ff
        L_0x00f2:
            r2.mo23308u()
        L_0x00f5:
            d.a.a.a.y0.b.v r1 = r2.mo23292e()
            r3 = r1
            d.a.a.a.y0.b.q0 r3 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0) r3
            p298d.p344x.p346c.C6888i.m12436c(r3)
        L_0x00ff:
            if (r3 == 0) goto L_0x009b
            r0.add(r3)
            goto L_0x009b
        L_0x0105:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.getFunctions(d.a.a.a.y0.f.d, d.a.a.a.y0.b.e):java.util.Collection");
    }

    public Set<C6717d> getFunctionsNames(C6046e eVar) {
        C6351g x;
        C6888i.m12438e(eVar, "classDescriptor");
        if (!getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return C6800r.f13715g;
        }
        C6345e javaAnalogue = getJavaAnalogue(eVar);
        Set<C6717d> set = null;
        if (!(javaAnalogue == null || (x = javaAnalogue.getUnsubstitutedMemberScope()) == null)) {
            set = x.getFunctionNames();
        }
        return set == null ? C6800r.f13715g : set;
    }

    public Collection<C7452c0> getSupertypes(C6046e eVar) {
        C6888i.m12438e(eVar, "classDescriptor");
        C6715c i = C7255a.m13136i(eVar);
        JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
        if (!jvmBuiltInsSignatures.isArrayOrPrimitiveArray(i)) {
            return jvmBuiltInsSignatures.isSerializableInJava(i) ? C5266a.m9910Y2(this.mockSerializableType) : C6798p.f13713g;
        }
        C7489j0 cloneableType = getCloneableType();
        C6888i.m12437d(cloneableType, "cloneableType");
        return C6790h.m12314A(cloneableType, this.mockSerializableType);
    }

    public boolean isFunctionAvailable(C6046e eVar, C6232q0 q0Var) {
        C6888i.m12438e(eVar, "classDescriptor");
        C6888i.m12438e(q0Var, "functionDescriptor");
        C6345e javaAnalogue = getJavaAnalogue(eVar);
        if (javaAnalogue == null || !q0Var.getAnnotations().mo23169v(C6080d.f11986a)) {
            return true;
        }
        if (!getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String b = C6561p.m11653b(q0Var, false, false, 3);
        C6351g x = javaAnalogue.getUnsubstitutedMemberScope();
        C6717d name = q0Var.getName();
        C6888i.m12437d(name, "functionDescriptor.name");
        Collection<C6232q0> contributedFunctions = x.getContributedFunctions(name, C6260d.FROM_BUILTINS);
        if (!(contributedFunctions instanceof Collection) || !contributedFunctions.isEmpty()) {
            for (C6232q0 b2 : contributedFunctions) {
                if (C6888i.m12434a(C6561p.m11653b(b2, false, false, 3), b)) {
                    return true;
                }
            }
        }
        return false;
    }
}
