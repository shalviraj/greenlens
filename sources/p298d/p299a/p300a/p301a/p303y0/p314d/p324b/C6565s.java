package p298d.p299a.p300a.p301a.p303y0.p314d.p324b;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.b.s */
public final class C6565s {

    /* renamed from: a */
    public static final C6565s f12856a = new C6565s();

    /* renamed from: a */
    public final String[] mo23663a(String... strArr) {
        C6888i.m12438e(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    /* renamed from: b */
    public final String mo23664b(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* renamed from: c */
    public final Set<String> mo23665c(String str, String... strArr) {
        C6888i.m12438e(str, "internalName");
        C6888i.m12438e(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    public final Set<String> mo23666d(String str, String... strArr) {
        C6888i.m12438e(str, "name");
        C6888i.m12438e(strArr, "signatures");
        String g = mo23669g(str);
        String[] strArr2 = new String[strArr.length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return mo23665c(g, strArr2);
    }

    /* renamed from: e */
    public final Set<String> mo23667e(String str, String... strArr) {
        C6888i.m12438e(str, "name");
        C6888i.m12438e(strArr, "signatures");
        String h = mo23670h(str);
        String[] strArr2 = new String[strArr.length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return mo23665c(h, strArr2);
    }

    /* renamed from: f */
    public final String mo23668f(String str) {
        C6888i.m12438e(str, "name");
        return C6888i.m12444k("java/util/function/", str);
    }

    /* renamed from: g */
    public final String mo23669g(String str) {
        C6888i.m12438e(str, "name");
        return C6888i.m12444k("java/lang/", str);
    }

    /* renamed from: h */
    public final String mo23670h(String str) {
        C6888i.m12438e(str, "name");
        return C6888i.m12444k("java/util/", str);
    }

    /* renamed from: i */
    public final String mo23671i(String str, String str2) {
        C6888i.m12438e(str, "internalName");
        C6888i.m12438e(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
