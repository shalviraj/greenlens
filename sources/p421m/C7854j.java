package p421m;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p298d.p344x.p346c.C6888i;

/* renamed from: m.j */
public final class C7854j {

    /* renamed from: a */
    public final Map<String, String> f15581a;

    /* renamed from: b */
    public final String f15582b;

    public C7854j(String str, Map<String, String> map) {
        String str2;
        C6888i.m12438e(str, "scheme");
        C6888i.m12438e(map, "authParams");
        this.f15582b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                C6888i.m12437d(locale, "US");
                str2 = str3.toLowerCase(locale);
                C6888i.m12437d(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C6888i.m12437d(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f15581a = unmodifiableMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7854j) {
            C7854j jVar = (C7854j) obj;
            return C6888i.m12434a(jVar.f15582b, this.f15582b) && C6888i.m12434a(jVar.f15581a, this.f15581a);
        }
    }

    public int hashCode() {
        return this.f15581a.hashCode() + ((this.f15582b.hashCode() + 899) * 31);
    }

    public String toString() {
        return this.f15582b + " authParams=" + this.f15581a;
    }
}
