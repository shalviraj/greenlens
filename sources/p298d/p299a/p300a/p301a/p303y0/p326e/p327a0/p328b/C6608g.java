package p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.C6582a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7085c;
import p298d.p334t.C6790h;
import p298d.p334t.C6800r;
import p298d.p334t.C6801s;
import p298d.p334t.C6802t;
import p298d.p334t.C6803u;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: d.a.a.a.y0.e.a0.b.g */
public final class C6608g implements C6705c {

    /* renamed from: e */
    public static final C6609a f13007e;

    /* renamed from: f */
    public static final String f13008f;

    /* renamed from: g */
    public static final List<String> f13009g;

    /* renamed from: a */
    public final C6582a.C6593e f13010a;

    /* renamed from: b */
    public final String[] f13011b;

    /* renamed from: c */
    public final Set<Integer> f13012c;

    /* renamed from: d */
    public final List<C6582a.C6593e.C6596c> f13013d;

    /* renamed from: d.a.a.a.y0.e.a0.b.g$a */
    public static final class C6609a {
        public C6609a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final List<String> mo23728a() {
            return C6608g.f13009g;
        }
    }

    static {
        C6609a aVar = new C6609a((DefaultConstructorMarker) null);
        f13007e = aVar;
        String w = C6790h.m12369w(C6790h.m12314A('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6862l) null, 62);
        f13008f = w;
        int i = 16;
        f13009g = C6790h.m12314A(C6888i.m12444k(w, "/Any"), C6888i.m12444k(w, "/Nothing"), C6888i.m12444k(w, "/Unit"), C6888i.m12444k(w, "/Throwable"), C6888i.m12444k(w, "/Number"), C6888i.m12444k(w, "/Byte"), C6888i.m12444k(w, "/Double"), C6888i.m12444k(w, "/Float"), C6888i.m12444k(w, "/Int"), C6888i.m12444k(w, "/Long"), C6888i.m12444k(w, "/Short"), C6888i.m12444k(w, "/Boolean"), C6888i.m12444k(w, "/Char"), C6888i.m12444k(w, "/CharSequence"), C6888i.m12444k(w, "/String"), C6888i.m12444k(w, "/Comparable"), C6888i.m12444k(w, "/Enum"), C6888i.m12444k(w, "/Array"), C6888i.m12444k(w, "/ByteArray"), C6888i.m12444k(w, "/DoubleArray"), C6888i.m12444k(w, "/FloatArray"), C6888i.m12444k(w, "/IntArray"), C6888i.m12444k(w, "/LongArray"), C6888i.m12444k(w, "/ShortArray"), C6888i.m12444k(w, "/BooleanArray"), C6888i.m12444k(w, "/CharArray"), C6888i.m12444k(w, "/Cloneable"), C6888i.m12444k(w, "/Annotation"), C6888i.m12444k(w, "/collections/Iterable"), C6888i.m12444k(w, "/collections/MutableIterable"), C6888i.m12444k(w, "/collections/Collection"), C6888i.m12444k(w, "/collections/MutableCollection"), C6888i.m12444k(w, "/collections/List"), C6888i.m12444k(w, "/collections/MutableList"), C6888i.m12444k(w, "/collections/Set"), C6888i.m12444k(w, "/collections/MutableSet"), C6888i.m12444k(w, "/collections/Map"), C6888i.m12444k(w, "/collections/MutableMap"), C6888i.m12444k(w, "/collections/Map.Entry"), C6888i.m12444k(w, "/collections/MutableMap.MutableEntry"), C6888i.m12444k(w, "/collections/Iterator"), C6888i.m12444k(w, "/collections/MutableIterator"), C6888i.m12444k(w, "/collections/ListIterator"), C6888i.m12444k(w, "/collections/MutableListIterator"));
        Iterable<C6801s<T>> f0 = C6790h.m12351f0(aVar.mo23728a());
        int g3 = C5266a.m9957g3(C5266a.m9892V(f0, 10));
        if (g3 >= 16) {
            i = g3;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        Iterator it = ((C6802t) f0).iterator();
        while (true) {
            C6803u uVar = (C6803u) it;
            if (uVar.hasNext()) {
                C6801s sVar = (C6801s) uVar.next();
                linkedHashMap.put((String) sVar.f13717b, Integer.valueOf(sVar.f13716a));
            } else {
                return;
            }
        }
    }

    public C6608g(C6582a.C6593e eVar, String[] strArr) {
        Set<Integer> set;
        C6888i.m12438e(eVar, "types");
        C6888i.m12438e(strArr, "strings");
        this.f13010a = eVar;
        this.f13011b = strArr;
        List<Integer> list = eVar.f12961i;
        if (list.isEmpty()) {
            set = C6800r.f13715g;
        } else {
            C6888i.m12437d(list, "");
            set = C6790h.m12349e0(list);
        }
        this.f13012c = set;
        ArrayList arrayList = new ArrayList();
        List<C6582a.C6593e.C6596c> list2 = eVar.f12960h;
        arrayList.ensureCapacity(list2.size());
        for (C6582a.C6593e.C6596c next : list2) {
            int i = next.f12972i;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(next);
            }
        }
        arrayList.trimToSize();
        this.f13013d = arrayList;
    }

    /* renamed from: a */
    public String mo23725a(int i) {
        String str;
        C6582a.C6593e.C6596c cVar = this.f13013d.get(i);
        int i2 = cVar.f12971h;
        if ((i2 & 4) == 4) {
            Object obj = cVar.f12974k;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                C7085c cVar2 = (C7085c) obj;
                String J = cVar2.mo24605J();
                if (cVar2.mo24615w()) {
                    cVar.f12974k = J;
                }
                str = J;
            }
        } else {
            if ((i2 & 2) == 2) {
                List<String> list = f13009g;
                int size = list.size() - 1;
                int i3 = cVar.f12973j;
                if (i3 >= 0 && i3 <= size) {
                    str = list.get(i3);
                }
            }
            str = this.f13011b[i];
        }
        if (cVar.f12976m.size() >= 2) {
            List<Integer> list2 = cVar.f12976m;
            C6888i.m12437d(list2, "substringIndexList");
            Integer num = list2.get(0);
            Integer num2 = list2.get(1);
            C6888i.m12437d(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                C6888i.m12437d(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    C6888i.m12437d(str, "string");
                    str = str.substring(num.intValue(), num2.intValue());
                    C6888i.m12437d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
        }
        if (cVar.f12978o.size() >= 2) {
            List<Integer> list3 = cVar.f12978o;
            C6888i.m12437d(list3, "replaceCharList");
            C6888i.m12437d(str, "string");
            str = C7694h.m13943u(str, (char) list3.get(0).intValue(), (char) list3.get(1).intValue(), false, 4);
        }
        C6582a.C6593e.C6596c.C6599c cVar3 = cVar.f12975l;
        if (cVar3 == null) {
            cVar3 = C6582a.C6593e.C6596c.C6599c.NONE;
        }
        int ordinal = cVar3.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (str.length() >= 2) {
                    C6888i.m12437d(str, "string");
                    str = str.substring(1, str.length() - 1);
                    C6888i.m12437d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
            C6888i.m12437d(str, "string");
            return str;
        }
        C6888i.m12437d(str, "string");
        str = C7694h.m13943u(str, '$', '.', false, 4);
        C6888i.m12437d(str, "string");
        return str;
    }

    /* renamed from: b */
    public boolean mo23726b(int i) {
        return this.f13012c.contains(Integer.valueOf(i));
    }

    /* renamed from: c */
    public String mo23727c(int i) {
        return mo23725a(i);
    }
}
