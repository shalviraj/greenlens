package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6719f;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

public final class JavaToKotlinClassMap {
    private static final C6713a CLASS_CLASS_ID;
    private static final C6713a FUNCTION_N_CLASS_ID;
    private static final C6714b FUNCTION_N_FQ_NAME;
    public static final JavaToKotlinClassMap INSTANCE;
    private static final C6713a K_CLASS_CLASS_ID;
    private static final C6713a K_FUNCTION_CLASS_ID;
    private static final String NUMBERED_FUNCTION_PREFIX;
    private static final String NUMBERED_K_FUNCTION_PREFIX;
    private static final String NUMBERED_K_SUSPEND_FUNCTION_PREFIX;
    private static final String NUMBERED_SUSPEND_FUNCTION_PREFIX;
    private static final HashMap<C6715c, C6713a> javaToKotlin = new HashMap<>();
    private static final HashMap<C6715c, C6713a> kotlinToJava = new HashMap<>();
    private static final List<PlatformMutabilityMapping> mutabilityMappings;
    private static final HashMap<C6715c, C6714b> mutableToReadOnly = new HashMap<>();
    private static final HashMap<C6715c, C6714b> readOnlyToMutable = new HashMap<>();

    public static final class PlatformMutabilityMapping {
        private final C6713a javaClass;
        private final C6713a kotlinMutable;
        private final C6713a kotlinReadOnly;

        public PlatformMutabilityMapping(C6713a aVar, C6713a aVar2, C6713a aVar3) {
            C6888i.m12438e(aVar, "javaClass");
            C6888i.m12438e(aVar2, "kotlinReadOnly");
            C6888i.m12438e(aVar3, "kotlinMutable");
            this.javaClass = aVar;
            this.kotlinReadOnly = aVar2;
            this.kotlinMutable = aVar3;
        }

        public final C6713a component1() {
            return this.javaClass;
        }

        public final C6713a component2() {
            return this.kotlinReadOnly;
        }

        public final C6713a component3() {
            return this.kotlinMutable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return C6888i.m12434a(this.javaClass, platformMutabilityMapping.javaClass) && C6888i.m12434a(this.kotlinReadOnly, platformMutabilityMapping.kotlinReadOnly) && C6888i.m12434a(this.kotlinMutable, platformMutabilityMapping.kotlinMutable);
        }

        public final C6713a getJavaClass() {
            return this.javaClass;
        }

        public int hashCode() {
            int hashCode = this.kotlinReadOnly.hashCode();
            return this.kotlinMutable.hashCode() + ((hashCode + (this.javaClass.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("PlatformMutabilityMapping(javaClass=");
            u.append(this.javaClass);
            u.append(", kotlinReadOnly=");
            u.append(this.kotlinReadOnly);
            u.append(", kotlinMutable=");
            u.append(this.kotlinMutable);
            u.append(')');
            return u.toString();
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        StringBuilder sb = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.Function;
        sb.append(functionClassKind.getPackageFqName().toString());
        sb.append('.');
        sb.append(functionClassKind.getClassNamePrefix());
        NUMBERED_FUNCTION_PREFIX = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.KFunction;
        sb2.append(functionClassKind2.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(functionClassKind2.getClassNamePrefix());
        NUMBERED_K_FUNCTION_PREFIX = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.SuspendFunction;
        sb3.append(functionClassKind3.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(functionClassKind3.getClassNamePrefix());
        NUMBERED_SUSPEND_FUNCTION_PREFIX = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.KSuspendFunction;
        sb4.append(functionClassKind4.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(functionClassKind4.getClassNamePrefix());
        NUMBERED_K_SUSPEND_FUNCTION_PREFIX = sb4.toString();
        C6713a l = C6713a.m12239l(new C6714b("kotlin.jvm.functions.FunctionN"));
        C6888i.m12437d(l, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        FUNCTION_N_CLASS_ID = l;
        C6714b b = l.mo23851b();
        C6888i.m12437d(b, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        FUNCTION_N_FQ_NAME = b;
        C6713a l2 = C6713a.m12239l(new C6714b("kotlin.reflect.KFunction"));
        C6888i.m12437d(l2, "topLevel(FqName(\"kotlin.reflect.KFunction\"))");
        K_FUNCTION_CLASS_ID = l2;
        C6713a l3 = C6713a.m12239l(new C6714b("kotlin.reflect.KClass"));
        C6888i.m12437d(l3, "topLevel(FqName(\"kotlin.reflect.KClass\"))");
        K_CLASS_CLASS_ID = l3;
        CLASS_CLASS_ID = javaToKotlinClassMap.classId(Class.class);
        C6713a l4 = C6713a.m12239l(StandardNames.FqNames.iterable);
        C6888i.m12437d(l4, "topLevel(FqNames.iterable)");
        C6714b bVar = StandardNames.FqNames.mutableIterable;
        C6714b h = l4.mo23856h();
        C6714b h2 = l4.mo23856h();
        C6888i.m12437d(h2, "kotlinReadOnly.packageFqName");
        C6714b p4 = C5266a.m10012p4(bVar, h2);
        int i = 0;
        C6713a aVar = new C6713a(h, p4, false);
        C6713a l5 = C6713a.m12239l(StandardNames.FqNames.iterator);
        C6888i.m12437d(l5, "topLevel(FqNames.iterator)");
        C6714b bVar2 = StandardNames.FqNames.mutableIterator;
        C6714b h3 = l5.mo23856h();
        C6714b h4 = l5.mo23856h();
        C6888i.m12437d(h4, "kotlinReadOnly.packageFqName");
        C6713a aVar2 = new C6713a(h3, C5266a.m10012p4(bVar2, h4), false);
        C6713a l6 = C6713a.m12239l(StandardNames.FqNames.collection);
        C6888i.m12437d(l6, "topLevel(FqNames.collection)");
        C6714b bVar3 = StandardNames.FqNames.mutableCollection;
        C6714b h5 = l6.mo23856h();
        C6714b h6 = l6.mo23856h();
        C6888i.m12437d(h6, "kotlinReadOnly.packageFqName");
        C6713a aVar3 = new C6713a(h5, C5266a.m10012p4(bVar3, h6), false);
        C6713a l7 = C6713a.m12239l(StandardNames.FqNames.list);
        C6888i.m12437d(l7, "topLevel(FqNames.list)");
        C6714b bVar4 = StandardNames.FqNames.mutableList;
        C6714b h7 = l7.mo23856h();
        C6714b h8 = l7.mo23856h();
        C6888i.m12437d(h8, "kotlinReadOnly.packageFqName");
        C6713a aVar4 = new C6713a(h7, C5266a.m10012p4(bVar4, h8), false);
        C6713a l8 = C6713a.m12239l(StandardNames.FqNames.set);
        C6888i.m12437d(l8, "topLevel(FqNames.set)");
        C6714b bVar5 = StandardNames.FqNames.mutableSet;
        C6714b h9 = l8.mo23856h();
        C6714b h10 = l8.mo23856h();
        C6888i.m12437d(h10, "kotlinReadOnly.packageFqName");
        C6713a aVar5 = new C6713a(h9, C5266a.m10012p4(bVar5, h10), false);
        C6713a l9 = C6713a.m12239l(StandardNames.FqNames.listIterator);
        C6888i.m12437d(l9, "topLevel(FqNames.listIterator)");
        C6714b bVar6 = StandardNames.FqNames.mutableListIterator;
        C6714b h11 = l9.mo23856h();
        C6714b h12 = l9.mo23856h();
        C6888i.m12437d(h12, "kotlinReadOnly.packageFqName");
        C6713a aVar6 = new C6713a(h11, C5266a.m10012p4(bVar6, h12), false);
        C6714b bVar7 = StandardNames.FqNames.map;
        C6713a l10 = C6713a.m12239l(bVar7);
        C6888i.m12437d(l10, "topLevel(FqNames.map)");
        C6714b bVar8 = StandardNames.FqNames.mutableMap;
        C6714b h13 = l10.mo23856h();
        C6714b h14 = l10.mo23856h();
        C6888i.m12437d(h14, "kotlinReadOnly.packageFqName");
        C6713a aVar7 = new C6713a(h13, C5266a.m10012p4(bVar8, h14), false);
        C6713a d = C6713a.m12239l(bVar7).mo23853d(StandardNames.FqNames.mapEntry.mo23868g());
        C6888i.m12437d(d, "topLevel(FqNames.map).createNestedClassId(FqNames.mapEntry.shortName())");
        C6714b bVar9 = StandardNames.FqNames.mutableMapEntry;
        C6714b h15 = d.mo23856h();
        C6714b h16 = d.mo23856h();
        C6888i.m12437d(h16, "kotlinReadOnly.packageFqName");
        List<PlatformMutabilityMapping> A = C6790h.m12314A(new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterable.class), l4, aVar), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterator.class), l5, aVar2), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Collection.class), l6, aVar3), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(List.class), l7, aVar4), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Set.class), l8, aVar5), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(ListIterator.class), l9, aVar6), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Map.class), l10, aVar7), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Map.Entry.class), d, new C6713a(h15, C5266a.m10012p4(bVar9, h16), false)));
        mutabilityMappings = A;
        javaToKotlinClassMap.addTopLevel((Class<?>) Object.class, StandardNames.FqNames.any);
        javaToKotlinClassMap.addTopLevel((Class<?>) String.class, StandardNames.FqNames.string);
        javaToKotlinClassMap.addTopLevel((Class<?>) CharSequence.class, StandardNames.FqNames.charSequence);
        javaToKotlinClassMap.addTopLevel((Class<?>) Throwable.class, StandardNames.FqNames.throwable);
        javaToKotlinClassMap.addTopLevel((Class<?>) Cloneable.class, StandardNames.FqNames.cloneable);
        javaToKotlinClassMap.addTopLevel((Class<?>) Number.class, StandardNames.FqNames.number);
        javaToKotlinClassMap.addTopLevel((Class<?>) Comparable.class, StandardNames.FqNames.comparable);
        javaToKotlinClassMap.addTopLevel((Class<?>) Enum.class, StandardNames.FqNames._enum);
        javaToKotlinClassMap.addTopLevel((Class<?>) Annotation.class, StandardNames.FqNames.annotation);
        for (PlatformMutabilityMapping addMapping : A) {
            INSTANCE.addMapping(addMapping);
        }
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int i2 = 0;
        while (i2 < 8) {
            JvmPrimitiveType jvmPrimitiveType = values[i2];
            i2++;
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            C6713a l11 = C6713a.m12239l(jvmPrimitiveType.getWrapperFqName());
            C6888i.m12437d(l11, "topLevel(jvmType.wrapperFqName)");
            StandardNames standardNames = StandardNames.INSTANCE;
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            C6888i.m12437d(primitiveType, "jvmType.primitiveType");
            C6713a l12 = C6713a.m12239l(StandardNames.getPrimitiveFqName(primitiveType));
            C6888i.m12437d(l12, "topLevel(StandardNames.getPrimitiveFqName(jvmType.primitiveType))");
            javaToKotlinClassMap2.add(l11, l12);
        }
        for (C6713a next : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            StringBuilder u = C0843a.m460u("kotlin.jvm.internal.");
            u.append(next.mo23859j().mo23886e());
            u.append("CompanionObject");
            C6713a l13 = C6713a.m12239l(new C6714b(u.toString()));
            C6888i.m12437d(l13, "topLevel(FqName(\"kotlin.jvm.internal.\" + classId.shortClassName.asString() + \"CompanionObject\"))");
            C6713a d2 = next.mo23853d(C6719f.f13627b);
            C6888i.m12437d(d2, "classId.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)");
            javaToKotlinClassMap3.add(l13, d2);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
            C6713a l14 = C6713a.m12239l(new C6714b(C6888i.m12444k("kotlin.jvm.functions.Function", Integer.valueOf(i3))));
            C6888i.m12437d(l14, "topLevel(FqName(\"kotlin.jvm.functions.Function$i\"))");
            StandardNames standardNames2 = StandardNames.INSTANCE;
            javaToKotlinClassMap4.add(l14, StandardNames.getFunctionClassId(i3));
            javaToKotlinClassMap4.addKotlinToJava(new C6714b(C6888i.m12444k(NUMBERED_K_FUNCTION_PREFIX, Integer.valueOf(i3))), K_FUNCTION_CLASS_ID);
            if (i4 >= 23) {
                break;
            }
            i3 = i4;
        }
        while (true) {
            int i5 = i + 1;
            FunctionClassKind functionClassKind5 = FunctionClassKind.KSuspendFunction;
            JavaToKotlinClassMap javaToKotlinClassMap5 = INSTANCE;
            javaToKotlinClassMap5.addKotlinToJava(new C6714b(C6888i.m12444k(functionClassKind5.getPackageFqName().toString() + '.' + functionClassKind5.getClassNamePrefix(), Integer.valueOf(i))), K_FUNCTION_CLASS_ID);
            if (i5 >= 22) {
                C6714b i6 = StandardNames.FqNames.nothing.mo23883i();
                C6888i.m12437d(i6, "nothing.toSafe()");
                javaToKotlinClassMap5.addKotlinToJava(i6, javaToKotlinClassMap5.classId(Void.class));
                return;
            }
            i = i5;
        }
    }

    private JavaToKotlinClassMap() {
    }

    private final void add(C6713a aVar, C6713a aVar2) {
        addJavaToKotlin(aVar, aVar2);
        C6714b b = aVar2.mo23851b();
        C6888i.m12437d(b, "kotlinClassId.asSingleFqName()");
        addKotlinToJava(b, aVar);
    }

    private final void addJavaToKotlin(C6713a aVar, C6713a aVar2) {
        HashMap<C6715c, C6713a> hashMap = javaToKotlin;
        C6715c j = aVar.mo23851b().mo23872j();
        C6888i.m12437d(j, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j, aVar2);
    }

    private final void addKotlinToJava(C6714b bVar, C6713a aVar) {
        HashMap<C6715c, C6713a> hashMap = kotlinToJava;
        C6715c j = bVar.mo23872j();
        C6888i.m12437d(j, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(j, aVar);
    }

    private final void addMapping(PlatformMutabilityMapping platformMutabilityMapping) {
        C6713a component1 = platformMutabilityMapping.component1();
        C6713a component2 = platformMutabilityMapping.component2();
        C6713a component3 = platformMutabilityMapping.component3();
        add(component1, component2);
        C6714b b = component3.mo23851b();
        C6888i.m12437d(b, "mutableClassId.asSingleFqName()");
        addKotlinToJava(b, component1);
        C6714b b2 = component2.mo23851b();
        C6888i.m12437d(b2, "readOnlyClassId.asSingleFqName()");
        C6714b b3 = component3.mo23851b();
        C6888i.m12437d(b3, "mutableClassId.asSingleFqName()");
        HashMap<C6715c, C6714b> hashMap = mutableToReadOnly;
        C6715c j = component3.mo23851b().mo23872j();
        C6888i.m12437d(j, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j, b2);
        HashMap<C6715c, C6714b> hashMap2 = readOnlyToMutable;
        C6715c j2 = b2.mo23872j();
        C6888i.m12437d(j2, "readOnlyFqName.toUnsafe()");
        hashMap2.put(j2, b3);
    }

    private final void addTopLevel(Class<?> cls, C6714b bVar) {
        C6713a classId = classId(cls);
        C6713a l = C6713a.m12239l(bVar);
        C6888i.m12437d(l, "topLevel(kotlinFqName)");
        add(classId, l);
    }

    private final void addTopLevel(Class<?> cls, C6715c cVar) {
        C6714b i = cVar.mo23883i();
        C6888i.m12437d(i, "kotlinFqName.toSafe()");
        addTopLevel(cls, i);
    }

    /* access modifiers changed from: private */
    public final C6713a classId(Class<?> cls) {
        C6713a aVar;
        String str;
        if (!cls.isPrimitive()) {
            boolean isArray = cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            aVar = C6713a.m12239l(new C6714b(cls.getCanonicalName()));
            str = "topLevel(FqName(clazz.canonicalName))";
        } else {
            aVar = classId(declaringClass).mo23853d(C6717d.m12270l(cls.getSimpleName()));
            str = "classId(outer).createNestedClassId(Name.identifier(clazz.simpleName))";
        }
        C6888i.m12437d(aVar, str);
        return aVar;
    }

    private final boolean isKotlinFunctionWithBigArity(C6715c cVar, String str) {
        String b = cVar.mo23874b();
        C6888i.m12437d(b, "kotlinFqName.asString()");
        String C = C7694h.m13912C(b, str, "");
        if (C.length() > 0) {
            C6888i.m12438e(C, "$this$startsWith");
            if (!(C.length() > 0 && C5266a.m9825J0(C.charAt(0), '0', false))) {
                Integer I = C7694h.m13918I(C);
                if (I == null || I.intValue() < 23) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final C6714b getFUNCTION_N_FQ_NAME() {
        return FUNCTION_N_FQ_NAME;
    }

    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return mutabilityMappings;
    }

    public final boolean isMutable(C6715c cVar) {
        HashMap<C6715c, C6714b> hashMap = mutableToReadOnly;
        Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return hashMap.containsKey(cVar);
    }

    public final boolean isReadOnly(C6715c cVar) {
        HashMap<C6715c, C6714b> hashMap = readOnlyToMutable;
        Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return hashMap.containsKey(cVar);
    }

    public final C6713a mapJavaToKotlin(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        return javaToKotlin.get(bVar.mo23872j());
    }

    public final C6713a mapKotlinToJava(C6715c cVar) {
        C6888i.m12438e(cVar, "kotlinFqName");
        return (!isKotlinFunctionWithBigArity(cVar, NUMBERED_FUNCTION_PREFIX) && !isKotlinFunctionWithBigArity(cVar, NUMBERED_SUSPEND_FUNCTION_PREFIX)) ? (!isKotlinFunctionWithBigArity(cVar, NUMBERED_K_FUNCTION_PREFIX) && !isKotlinFunctionWithBigArity(cVar, NUMBERED_K_SUSPEND_FUNCTION_PREFIX)) ? kotlinToJava.get(cVar) : K_FUNCTION_CLASS_ID : FUNCTION_N_CLASS_ID;
    }

    public final C6714b mutableToReadOnly(C6715c cVar) {
        return mutableToReadOnly.get(cVar);
    }

    public final C6714b readOnlyToMutable(C6715c cVar) {
        return readOnlyToMutable.get(cVar);
    }
}
