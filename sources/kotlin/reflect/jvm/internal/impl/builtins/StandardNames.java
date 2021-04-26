package kotlin.reflect.jvm.internal.impl.builtins;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

public final class StandardNames {
    public static final C6714b ANNOTATION_PACKAGE_FQ_NAME;
    public static final C6714b BUILT_INS_PACKAGE_FQ_NAME;
    public static final Set<C6714b> BUILT_INS_PACKAGE_FQ_NAMES;
    public static final C6717d BUILT_INS_PACKAGE_NAME;
    public static final C6714b COLLECTIONS_PACKAGE_FQ_NAME;
    public static final C6714b CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL;
    public static final C6714b CONTINUATION_INTERFACE_FQ_NAME_RELEASE;
    public static final C6714b COROUTINES_INTRINSICS_PACKAGE_FQ_NAME_EXPERIMENTAL;
    public static final C6714b COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL;
    public static final C6714b COROUTINES_PACKAGE_FQ_NAME_RELEASE;
    public static final C6717d ENUM_VALUES;
    public static final C6717d ENUM_VALUE_OF;
    public static final StandardNames INSTANCE = new StandardNames();
    public static final C6714b KOTLIN_REFLECT_FQ_NAME;
    public static final List<String> PREFIXES = C6790h.m12314A("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
    public static final C6714b RANGES_PACKAGE_FQ_NAME;
    public static final C6714b RESULT_FQ_NAME = new C6714b("kotlin.Result");
    public static final C6714b TEXT_PACKAGE_FQ_NAME;

    public static final class FqNames {
        public static final FqNames INSTANCE;
        public static final C6715c _boolean;
        public static final C6715c _byte;
        public static final C6715c _char;
        public static final C6715c _double;
        public static final C6715c _enum;
        public static final C6715c _float;
        public static final C6715c _int;
        public static final C6715c _long;
        public static final C6715c _short;
        public static final C6714b annotation;
        public static final C6714b annotationRetention;
        public static final C6714b annotationTarget;
        public static final C6715c any;
        public static final C6715c array;
        public static final Map<C6715c, PrimitiveType> arrayClassFqNameToPrimitiveType;
        public static final C6715c charSequence;
        public static final C6715c cloneable;
        public static final C6714b collection;
        public static final C6714b comparable;
        public static final C6714b deprecated;
        public static final C6714b deprecatedSinceKotlin;
        public static final C6714b deprecationLevel;
        public static final C6714b extensionFunctionType;
        public static final Map<C6715c, PrimitiveType> fqNameToPrimitiveType;
        public static final C6715c functionSupertype;
        public static final C6715c intRange;
        public static final C6714b iterable;
        public static final C6714b iterator;
        public static final C6715c kCallable = reflect("KCallable");
        public static final C6715c kClass = reflect("KClass");
        public static final C6715c kDeclarationContainer = reflect("KDeclarationContainer");
        public static final C6715c kMutableProperty0 = reflect("KMutableProperty0");
        public static final C6715c kMutableProperty1 = reflect("KMutableProperty1");
        public static final C6715c kMutableProperty2 = reflect("KMutableProperty2");
        public static final C6715c kMutablePropertyFqName = reflect("KMutableProperty");
        public static final C6713a kProperty;
        public static final C6715c kProperty0 = reflect("KProperty0");
        public static final C6715c kProperty1 = reflect("KProperty1");
        public static final C6715c kProperty2 = reflect("KProperty2");
        public static final C6715c kPropertyFqName;
        public static final C6714b list;
        public static final C6714b listIterator;
        public static final C6715c longRange;
        public static final C6714b map;
        public static final C6714b mapEntry;
        public static final C6714b mustBeDocumented;
        public static final C6714b mutableCollection;
        public static final C6714b mutableIterable;
        public static final C6714b mutableIterator;
        public static final C6714b mutableList;
        public static final C6714b mutableListIterator;
        public static final C6714b mutableMap;
        public static final C6714b mutableMapEntry;
        public static final C6714b mutableSet;
        public static final C6715c nothing;
        public static final C6715c number;
        public static final C6714b parameterName;
        public static final Set<C6717d> primitiveArrayTypeShortNames;
        public static final Set<C6717d> primitiveTypeShortNames;
        public static final C6714b publishedApi;
        public static final C6714b repeatable;
        public static final C6714b replaceWith;
        public static final C6714b retention;
        public static final C6714b set;
        public static final C6715c string;
        public static final C6714b suppress;
        public static final C6714b target;
        public static final C6714b throwable;
        public static final C6713a uByte;
        public static final C6714b uByteArrayFqName;
        public static final C6714b uByteFqName;
        public static final C6713a uInt;
        public static final C6714b uIntArrayFqName;
        public static final C6714b uIntFqName;
        public static final C6713a uLong;
        public static final C6714b uLongArrayFqName;
        public static final C6714b uLongFqName;
        public static final C6713a uShort;
        public static final C6714b uShortArrayFqName;
        public static final C6714b uShortFqName;
        public static final C6715c unit;
        public static final C6714b unsafeVariance;

        static {
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            any = fqNames.fqNameUnsafe("Any");
            nothing = fqNames.fqNameUnsafe("Nothing");
            cloneable = fqNames.fqNameUnsafe("Cloneable");
            suppress = fqNames.fqName("Suppress");
            unit = fqNames.fqNameUnsafe("Unit");
            charSequence = fqNames.fqNameUnsafe("CharSequence");
            string = fqNames.fqNameUnsafe("String");
            array = fqNames.fqNameUnsafe("Array");
            _boolean = fqNames.fqNameUnsafe("Boolean");
            _char = fqNames.fqNameUnsafe("Char");
            _byte = fqNames.fqNameUnsafe("Byte");
            _short = fqNames.fqNameUnsafe("Short");
            _int = fqNames.fqNameUnsafe("Int");
            _long = fqNames.fqNameUnsafe("Long");
            _float = fqNames.fqNameUnsafe("Float");
            _double = fqNames.fqNameUnsafe("Double");
            number = fqNames.fqNameUnsafe("Number");
            _enum = fqNames.fqNameUnsafe("Enum");
            functionSupertype = fqNames.fqNameUnsafe("Function");
            throwable = fqNames.fqName("Throwable");
            comparable = fqNames.fqName("Comparable");
            intRange = fqNames.rangesFqName("IntRange");
            longRange = fqNames.rangesFqName("LongRange");
            deprecated = fqNames.fqName("Deprecated");
            deprecatedSinceKotlin = fqNames.fqName("DeprecatedSinceKotlin");
            deprecationLevel = fqNames.fqName("DeprecationLevel");
            replaceWith = fqNames.fqName("ReplaceWith");
            extensionFunctionType = fqNames.fqName("ExtensionFunctionType");
            parameterName = fqNames.fqName("ParameterName");
            annotation = fqNames.fqName("Annotation");
            target = fqNames.annotationName("Target");
            annotationTarget = fqNames.annotationName("AnnotationTarget");
            annotationRetention = fqNames.annotationName("AnnotationRetention");
            retention = fqNames.annotationName("Retention");
            repeatable = fqNames.annotationName("Repeatable");
            mustBeDocumented = fqNames.annotationName("MustBeDocumented");
            unsafeVariance = fqNames.fqName("UnsafeVariance");
            publishedApi = fqNames.fqName("PublishedApi");
            iterator = fqNames.collectionsFqName("Iterator");
            iterable = fqNames.collectionsFqName("Iterable");
            collection = fqNames.collectionsFqName("Collection");
            list = fqNames.collectionsFqName("List");
            listIterator = fqNames.collectionsFqName("ListIterator");
            set = fqNames.collectionsFqName("Set");
            C6714b collectionsFqName = fqNames.collectionsFqName("Map");
            map = collectionsFqName;
            C6714b c = collectionsFqName.mo23863c(C6717d.m12270l("Entry"));
            C6888i.m12437d(c, "map.child(Name.identifier(\"Entry\"))");
            mapEntry = c;
            mutableIterator = fqNames.collectionsFqName("MutableIterator");
            mutableIterable = fqNames.collectionsFqName("MutableIterable");
            mutableCollection = fqNames.collectionsFqName("MutableCollection");
            mutableList = fqNames.collectionsFqName("MutableList");
            FqNames fqNames2 = INSTANCE;
            mutableListIterator = fqNames2.collectionsFqName("MutableListIterator");
            mutableSet = fqNames2.collectionsFqName("MutableSet");
            C6714b collectionsFqName2 = fqNames2.collectionsFqName("MutableMap");
            mutableMap = collectionsFqName2;
            C6714b c2 = collectionsFqName2.mo23863c(C6717d.m12270l("MutableEntry"));
            C6888i.m12437d(c2, "mutableMap.child(Name.identifier(\"MutableEntry\"))");
            mutableMapEntry = c2;
            C6715c reflect = reflect("KProperty");
            kPropertyFqName = reflect;
            C6713a l = C6713a.m12239l(reflect.mo23883i());
            C6888i.m12437d(l, "topLevel(kPropertyFqName.toSafe())");
            kProperty = l;
            C6714b fqName = fqNames2.fqName("UByte");
            uByteFqName = fqName;
            C6714b fqName2 = fqNames2.fqName("UShort");
            uShortFqName = fqName2;
            C6714b fqName3 = fqNames2.fqName("UInt");
            uIntFqName = fqName3;
            C6714b fqName4 = fqNames2.fqName("ULong");
            uLongFqName = fqName4;
            C6713a l2 = C6713a.m12239l(fqName);
            C6888i.m12437d(l2, "topLevel(uByteFqName)");
            uByte = l2;
            C6713a l3 = C6713a.m12239l(fqName2);
            C6888i.m12437d(l3, "topLevel(uShortFqName)");
            uShort = l3;
            C6713a l4 = C6713a.m12239l(fqName3);
            C6888i.m12437d(l4, "topLevel(uIntFqName)");
            uInt = l4;
            C6713a l5 = C6713a.m12239l(fqName4);
            C6888i.m12437d(l5, "topLevel(uLongFqName)");
            uLong = l5;
            uByteArrayFqName = fqNames2.fqName("UByteArray");
            uShortArrayFqName = fqNames2.fqName("UShortArray");
            uIntArrayFqName = fqNames2.fqName("UIntArray");
            uLongArrayFqName = fqNames2.fqName("ULongArray");
            PrimitiveType.values();
            HashSet hashSet = new HashSet(C5266a.m9824J(8));
            PrimitiveType[] values = PrimitiveType.values();
            int i = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                hashSet.add(values[i2].getTypeName());
            }
            primitiveTypeShortNames = hashSet;
            PrimitiveType.values();
            HashSet hashSet2 = new HashSet(C5266a.m9824J(8));
            PrimitiveType[] values2 = PrimitiveType.values();
            for (int i3 = 0; i3 < 8; i3++) {
                hashSet2.add(values2[i3].getArrayTypeName());
            }
            primitiveArrayTypeShortNames = hashSet2;
            PrimitiveType.values();
            HashMap m3 = C5266a.m9993m3(8);
            PrimitiveType[] values3 = PrimitiveType.values();
            int i4 = 0;
            while (i4 < 8) {
                PrimitiveType primitiveType = values3[i4];
                i4++;
                FqNames fqNames3 = INSTANCE;
                String e = primitiveType.getTypeName().mo23886e();
                C6888i.m12437d(e, "primitiveType.typeName.asString()");
                m3.put(fqNames3.fqNameUnsafe(e), primitiveType);
            }
            fqNameToPrimitiveType = m3;
            PrimitiveType.values();
            HashMap m32 = C5266a.m9993m3(8);
            PrimitiveType[] values4 = PrimitiveType.values();
            while (i < 8) {
                PrimitiveType primitiveType2 = values4[i];
                i++;
                FqNames fqNames4 = INSTANCE;
                String e2 = primitiveType2.getArrayTypeName().mo23886e();
                C6888i.m12437d(e2, "primitiveType.arrayTypeName.asString()");
                m32.put(fqNames4.fqNameUnsafe(e2), primitiveType2);
            }
            arrayClassFqNameToPrimitiveType = m32;
        }

        private FqNames() {
        }

        private final C6714b annotationName(String str) {
            C6714b c = StandardNames.ANNOTATION_PACKAGE_FQ_NAME.mo23863c(C6717d.m12270l(str));
            C6888i.m12437d(c, "ANNOTATION_PACKAGE_FQ_NAME.child(Name.identifier(simpleName))");
            return c;
        }

        private final C6714b collectionsFqName(String str) {
            C6714b c = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.mo23863c(C6717d.m12270l(str));
            C6888i.m12437d(c, "COLLECTIONS_PACKAGE_FQ_NAME.child(Name.identifier(simpleName))");
            return c;
        }

        private final C6714b fqName(String str) {
            C6714b c = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.mo23863c(C6717d.m12270l(str));
            C6888i.m12437d(c, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(simpleName))");
            return c;
        }

        private final C6715c fqNameUnsafe(String str) {
            C6715c j = fqName(str).mo23872j();
            C6888i.m12437d(j, "fqName(simpleName).toUnsafe()");
            return j;
        }

        private final C6715c rangesFqName(String str) {
            C6715c j = StandardNames.RANGES_PACKAGE_FQ_NAME.mo23863c(C6717d.m12270l(str)).mo23872j();
            C6888i.m12437d(j, "RANGES_PACKAGE_FQ_NAME.child(Name.identifier(simpleName)).toUnsafe()");
            return j;
        }

        public static final C6715c reflect(String str) {
            C6888i.m12438e(str, "simpleName");
            C6715c j = StandardNames.KOTLIN_REFLECT_FQ_NAME.mo23863c(C6717d.m12270l(str)).mo23872j();
            C6888i.m12437d(j, "KOTLIN_REFLECT_FQ_NAME.child(Name.identifier(simpleName)).toUnsafe()");
            return j;
        }
    }

    static {
        C6717d l = C6717d.m12270l("values");
        C6888i.m12437d(l, "identifier(\"values\")");
        ENUM_VALUES = l;
        C6717d l2 = C6717d.m12270l("valueOf");
        C6888i.m12437d(l2, "identifier(\"valueOf\")");
        ENUM_VALUE_OF = l2;
        C6714b bVar = new C6714b("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME_RELEASE = bVar;
        C6714b c = bVar.mo23863c(C6717d.m12270l("experimental"));
        C6888i.m12437d(c, "COROUTINES_PACKAGE_FQ_NAME_RELEASE.child(Name.identifier(\"experimental\"))");
        COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL = c;
        C6714b c2 = c.mo23863c(C6717d.m12270l("intrinsics"));
        C6888i.m12437d(c2, "COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL.child(Name.identifier(\"intrinsics\"))");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME_EXPERIMENTAL = c2;
        C6714b c3 = c.mo23863c(C6717d.m12270l("Continuation"));
        C6888i.m12437d(c3, "COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL.child(Name.identifier(\"Continuation\"))");
        CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL = c3;
        C6714b c4 = bVar.mo23863c(C6717d.m12270l("Continuation"));
        C6888i.m12437d(c4, "COROUTINES_PACKAGE_FQ_NAME_RELEASE.child(Name.identifier(\"Continuation\"))");
        CONTINUATION_INTERFACE_FQ_NAME_RELEASE = c4;
        C6714b bVar2 = new C6714b("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = bVar2;
        C6717d l3 = C6717d.m12270l("kotlin");
        C6888i.m12437d(l3, "identifier(\"kotlin\")");
        BUILT_INS_PACKAGE_NAME = l3;
        C6714b k = C6714b.m12249k(l3);
        C6888i.m12437d(k, "topLevel(BUILT_INS_PACKAGE_NAME)");
        BUILT_INS_PACKAGE_FQ_NAME = k;
        C6714b c5 = k.mo23863c(C6717d.m12270l("annotation"));
        C6888i.m12437d(c5, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"annotation\"))");
        ANNOTATION_PACKAGE_FQ_NAME = c5;
        C6714b c6 = k.mo23863c(C6717d.m12270l("collections"));
        C6888i.m12437d(c6, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"collections\"))");
        COLLECTIONS_PACKAGE_FQ_NAME = c6;
        C6714b c7 = k.mo23863c(C6717d.m12270l("ranges"));
        C6888i.m12437d(c7, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"ranges\"))");
        RANGES_PACKAGE_FQ_NAME = c7;
        C6714b c8 = k.mo23863c(C6717d.m12270l(NotificationCompat.MessagingStyle.Message.KEY_TEXT));
        C6888i.m12437d(c8, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"text\"))");
        TEXT_PACKAGE_FQ_NAME = c8;
        C6714b c9 = k.mo23863c(C6717d.m12270l("internal"));
        C6888i.m12437d(c9, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"internal\"))");
        BUILT_INS_PACKAGE_FQ_NAMES = C6790h.m12327N(k, c6, c7, c5, bVar2, c9, bVar);
    }

    private StandardNames() {
    }

    public static final C6713a getFunctionClassId(int i) {
        return new C6713a(BUILT_INS_PACKAGE_FQ_NAME, C6717d.m12270l(getFunctionName(i)));
    }

    public static final String getFunctionName(int i) {
        return C6888i.m12444k("Function", Integer.valueOf(i));
    }

    public static final C6714b getPrimitiveFqName(PrimitiveType primitiveType) {
        C6888i.m12438e(primitiveType, "primitiveType");
        C6714b c = BUILT_INS_PACKAGE_FQ_NAME.mo23863c(primitiveType.getTypeName());
        C6888i.m12437d(c, "BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.typeName)");
        return c;
    }

    public static final String getSuspendFunctionName(int i) {
        return C6888i.m12444k(FunctionClassKind.SuspendFunction.getClassNamePrefix(), Integer.valueOf(i));
    }

    public static final boolean isPrimitiveArray(C6715c cVar) {
        C6888i.m12438e(cVar, "arrayFqName");
        return FqNames.arrayClassFqNameToPrimitiveType.get(cVar) != null;
    }
}
