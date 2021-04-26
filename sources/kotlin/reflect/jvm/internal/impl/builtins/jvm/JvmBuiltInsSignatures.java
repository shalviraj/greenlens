package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6565s;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

public final class JvmBuiltInsSignatures {
    private static final Set<String> DROP_LIST_METHOD_SIGNATURES;
    private static final Set<String> HIDDEN_CONSTRUCTOR_SIGNATURES;
    private static final Set<String> HIDDEN_METHOD_SIGNATURES;
    public static final JvmBuiltInsSignatures INSTANCE;
    private static final Set<String> MUTABLE_METHOD_SIGNATURES;
    private static final Set<String> VISIBLE_CONSTRUCTOR_SIGNATURES;
    private static final Set<String> VISIBLE_METHOD_SIGNATURES;

    static {
        JvmBuiltInsSignatures jvmBuiltInsSignatures = new JvmBuiltInsSignatures();
        INSTANCE = jvmBuiltInsSignatures;
        C6565s sVar = C6565s.f12856a;
        DROP_LIST_METHOD_SIGNATURES = C6790h.m12325L(sVar.mo23667e("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        HIDDEN_METHOD_SIGNATURES = C6790h.m12324K(C6790h.m12324K(C6790h.m12324K(C6790h.m12324K(C6790h.m12324K(C6790h.m12324K(jvmBuiltInsSignatures.buildPrimitiveValueMethodsSet(), sVar.mo23667e("List", "sort(Ljava/util/Comparator;)V")), sVar.mo23666d("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), sVar.mo23666d("Double", "isInfinite()Z", "isNaN()Z")), sVar.mo23666d("Float", "isInfinite()Z", "isNaN()Z")), sVar.mo23666d("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), sVar.mo23666d("CharSequence", "isEmpty()Z"));
        VISIBLE_METHOD_SIGNATURES = C6790h.m12324K(C6790h.m12324K(C6790h.m12324K(C6790h.m12324K(C6790h.m12324K(C6790h.m12324K(sVar.mo23666d("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), sVar.mo23667e("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), sVar.mo23666d("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), sVar.mo23666d("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), sVar.mo23667e("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), sVar.mo23667e("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), sVar.mo23667e("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        MUTABLE_METHOD_SIGNATURES = C6790h.m12324K(C6790h.m12324K(sVar.mo23667e("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), sVar.mo23667e("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), sVar.mo23667e("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> buildPrimitiveStringConstructorsSet = jvmBuiltInsSignatures.buildPrimitiveStringConstructorsSet();
        String[] a = sVar.mo23663a("D");
        String[] strArr = new String[a.length];
        System.arraycopy(a, 0, strArr, 0, a.length);
        Set<T> K = C6790h.m12324K(buildPrimitiveStringConstructorsSet, sVar.mo23666d("Float", strArr));
        String[] a2 = sVar.mo23663a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        String[] strArr2 = new String[a2.length];
        System.arraycopy(a2, 0, strArr2, 0, a2.length);
        HIDDEN_CONSTRUCTOR_SIGNATURES = C6790h.m12324K(K, sVar.mo23666d("String", strArr2));
        String[] a3 = sVar.mo23663a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        String[] strArr3 = new String[a3.length];
        System.arraycopy(a3, 0, strArr3, 0, a3.length);
        VISIBLE_CONSTRUCTOR_SIGNATURES = sVar.mo23666d("Throwable", strArr3);
    }

    private JvmBuiltInsSignatures() {
    }

    private final Set<String> buildPrimitiveStringConstructorsSet() {
        C6565s sVar = C6565s.f12856a;
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BYTE;
        List<JvmPrimitiveType> A = C6790h.m12314A(JvmPrimitiveType.BOOLEAN, jvmPrimitiveType, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType wrapperFqName : A) {
            String e = wrapperFqName.getWrapperFqName().mo23868g().mo23886e();
            C6888i.m12437d(e, "it.wrapperFqName.shortName().asString()");
            String[] a = sVar.mo23663a("Ljava/lang/String;");
            String[] strArr = new String[a.length];
            System.arraycopy(a, 0, strArr, 0, a.length);
            C6790h.m12342b(linkedHashSet, sVar.mo23666d(e, strArr));
        }
        return linkedHashSet;
    }

    private final Set<String> buildPrimitiveValueMethodsSet() {
        C6565s sVar = C6565s.f12856a;
        List<JvmPrimitiveType> A = C6790h.m12314A(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : A) {
            String e = jvmPrimitiveType.getWrapperFqName().mo23868g().mo23886e();
            C6888i.m12437d(e, "it.wrapperFqName.shortName().asString()");
            C6790h.m12342b(linkedHashSet, sVar.mo23666d(e, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()));
        }
        return linkedHashSet;
    }

    public final Set<String> getDROP_LIST_METHOD_SIGNATURES() {
        return DROP_LIST_METHOD_SIGNATURES;
    }

    public final Set<String> getHIDDEN_CONSTRUCTOR_SIGNATURES() {
        return HIDDEN_CONSTRUCTOR_SIGNATURES;
    }

    public final Set<String> getHIDDEN_METHOD_SIGNATURES() {
        return HIDDEN_METHOD_SIGNATURES;
    }

    public final Set<String> getMUTABLE_METHOD_SIGNATURES() {
        return MUTABLE_METHOD_SIGNATURES;
    }

    public final Set<String> getVISIBLE_CONSTRUCTOR_SIGNATURES() {
        return VISIBLE_CONSTRUCTOR_SIGNATURES;
    }

    public final Set<String> getVISIBLE_METHOD_SIGNATURES() {
        return VISIBLE_METHOD_SIGNATURES;
    }

    public final boolean isArrayOrPrimitiveArray(C6715c cVar) {
        C6888i.m12438e(cVar, "fqName");
        if (!C6888i.m12434a(cVar, StandardNames.FqNames.array)) {
            StandardNames standardNames = StandardNames.INSTANCE;
            return StandardNames.isPrimitiveArray(cVar);
        }
    }

    public final boolean isSerializableInJava(C6715c cVar) {
        C6888i.m12438e(cVar, "fqName");
        if (isArrayOrPrimitiveArray(cVar)) {
            return true;
        }
        C6713a mapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(cVar);
        if (mapKotlinToJava == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(mapKotlinToJava.mo23851b().mo23862b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
