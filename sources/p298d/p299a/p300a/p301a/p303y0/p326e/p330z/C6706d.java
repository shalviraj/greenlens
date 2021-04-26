package p298d.p299a.p300a.p301a.p303y0.p326e.p330z;

import java.util.LinkedList;
import java.util.List;
import p298d.C6773n;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6657o;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6664p;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.e.z.d */
public final class C6706d implements C6705c {

    /* renamed from: a */
    public final C6664p f13594a;

    /* renamed from: b */
    public final C6657o f13595b;

    public C6706d(C6664p pVar, C6657o oVar) {
        C6888i.m12438e(pVar, "strings");
        C6888i.m12438e(oVar, "qualifiedNames");
        this.f13594a = pVar;
        this.f13595b = oVar;
    }

    /* renamed from: a */
    public String mo23725a(int i) {
        String str = (String) this.f13594a.f13349h.get(i);
        C6888i.m12437d(str, "strings.getString(index)");
        return str;
    }

    /* renamed from: b */
    public boolean mo23726b(int i) {
        return ((Boolean) mo23844d(i).f13692i).booleanValue();
    }

    /* renamed from: c */
    public String mo23727c(int i) {
        C6773n<List<String>, List<String>, Boolean> d = mo23844d(i);
        List list = (List) d.f13690g;
        String w = C6790h.m12369w((List) d.f13691h, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6862l) null, 62);
        if (list.isEmpty()) {
            return w;
        }
        return C6790h.m12369w(list, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6862l) null, 62) + '/' + w;
    }

    /* renamed from: d */
    public final C6773n<List<String>, List<String>, Boolean> mo23844d(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C6657o.C6660c cVar = this.f13595b.f13323h.get(i);
            String str = (String) this.f13594a.f13349h.get(cVar.f13333j);
            C6657o.C6660c.C6663c cVar2 = cVar.f13334k;
            C6888i.m12436c(cVar2);
            int ordinal = cVar2.ordinal();
            if (ordinal == 0) {
                linkedList2.addFirst(str);
            } else if (ordinal == 1) {
                linkedList.addFirst(str);
            } else if (ordinal == 2) {
                linkedList2.addFirst(str);
                z = true;
            }
            i = cVar.f13332i;
        }
        return new C6773n<>(linkedList, linkedList2, Boolean.valueOf(z));
    }
}
