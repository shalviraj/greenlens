package p298d.p299a.p300a.p301a.p303y0.p391i;

import java.util.Comparator;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6157j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6246v0;

/* renamed from: d.a.a.a.y0.i.j */
public class C7198j implements Comparator<C6206k> {

    /* renamed from: g */
    public static final C7198j f14429g = new C7198j();

    /* renamed from: a */
    public static int m13054a(C6206k kVar) {
        if (C7193g.m13038r(kVar)) {
            return 8;
        }
        if (kVar instanceof C6157j) {
            return 7;
        }
        if (kVar instanceof C6207k0) {
            return ((C6207k0) kVar).getExtensionReceiverParameter() == null ? 6 : 5;
        }
        if (kVar instanceof C6244v) {
            return ((C6244v) kVar).getExtensionReceiverParameter() == null ? 4 : 3;
        }
        if (kVar instanceof C6046e) {
            return 2;
        }
        return kVar instanceof C6246v0 ? 1 : 0;
    }

    public int compare(Object obj, Object obj2) {
        Integer num;
        C6206k kVar = (C6206k) obj;
        C6206k kVar2 = (C6206k) obj2;
        int a = m13054a(kVar2) - m13054a(kVar);
        if (a != 0) {
            num = Integer.valueOf(a);
        } else if (!C7193g.m13038r(kVar) || !C7193g.m13038r(kVar2)) {
            int compareTo = kVar.getName().f13623g.compareTo(kVar2.getName().f13623g);
            num = compareTo != 0 ? Integer.valueOf(compareTo) : null;
        } else {
            num = 0;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
