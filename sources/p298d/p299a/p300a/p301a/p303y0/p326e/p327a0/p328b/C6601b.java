package p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: d.a.a.a.y0.e.a0.b.b */
public final class C6601b {

    /* renamed from: a */
    public static final C6601b f12994a = new C6601b();

    /* renamed from: b */
    public static final String f12995b = C6790h.m12369w(C6790h.m12314A('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6862l) null, 62);

    /* renamed from: c */
    public static final Map<String, String> f12996c;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List A = C6790h.m12314A("Boolean", "Z", "Char", "C", "Byte", "B", "Short", ExifInterface.LATITUDE_SOUTH, "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int M1 = C5266a.m9844M1(0, A.size() - 1, 2);
        if (M1 >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 2;
                StringBuilder sb = new StringBuilder();
                String str = f12995b;
                sb.append(str);
                sb.append('/');
                sb.append((String) A.get(i2));
                int i4 = i2 + 1;
                linkedHashMap.put(sb.toString(), A.get(i4));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(C0843a.m455p(sb2, (String) A.get(i2), "Array"), C6888i.m12444k("[", A.get(i4)));
                if (i2 == M1) {
                    break;
                }
                i2 = i3;
            }
        }
        linkedHashMap.put(C6888i.m12444k(f12995b, "/Unit"), ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        m11789a(linkedHashMap, "Any", "java/lang/Object");
        m11789a(linkedHashMap, "Nothing", "java/lang/Void");
        m11789a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : C6790h.m12314A("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m11789a(linkedHashMap, str2, C6888i.m12444k("java/lang/", str2));
        }
        for (String str3 : C6790h.m12314A("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m11789a(linkedHashMap, C6888i.m12444k("collections/", str3), C6888i.m12444k("java/util/", str3));
            m11789a(linkedHashMap, C6888i.m12444k("collections/Mutable", str3), C6888i.m12444k("java/util/", str3));
        }
        m11789a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m11789a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m11789a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m11789a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        while (true) {
            int i5 = i + 1;
            String k = C6888i.m12444k("Function", Integer.valueOf(i));
            StringBuilder sb3 = new StringBuilder();
            String str4 = f12995b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i);
            m11789a(linkedHashMap, k, sb3.toString());
            m11789a(linkedHashMap, C6888i.m12444k("reflect/KFunction", Integer.valueOf(i)), C6888i.m12444k(str4, "/reflect/KFunction"));
            if (i5 > 22) {
                break;
            }
            i = i5;
        }
        for (String str5 : C6790h.m12314A("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m11789a(linkedHashMap, C6888i.m12444k(str5, ".Companion"), f12995b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f12996c = linkedHashMap;
    }

    /* renamed from: a */
    public static final void m11789a(Map<String, String> map, String str, String str2) {
        map.put(f12995b + '/' + str, 'L' + str2 + ';');
    }

    /* renamed from: b */
    public static final String m11790b(String str) {
        C6888i.m12438e(str, "classId");
        String str2 = f12996c.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder t = C0843a.m459t('L');
        t.append(C7694h.m13943u(str, '.', '$', false, 4));
        t.append(';');
        return t.toString();
    }
}
